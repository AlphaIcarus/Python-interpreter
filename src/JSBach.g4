grammar JSBach;

///// ROOT STATEMENT /////

//Hay que cambiar esto por que pille definiciones de funciones, y que empiece por ahí
root : func_decl+ EOF ;

// Function declaration

func_decl : FNC_NAME (ID)* L_BLOCK blck_stmt R_BLOCK ;    //Puede ser que haya que poner un salto de línea después de cada statement para que no haya problemas

///// STATEMENT VARIANTS /////

blck_stmt : statement* ;

statement : (if_stat (else_stat)?
    | while_stat
    | func_stat
    | assig_stat
    | list_stat
    | play_stat
    | read_stat
    | write_stat)
    ;

/*
statement : if_stat ( else_stat )?
    | while_stat
    | func_decl
    | read_stat
    | write_stat
    | play_stat           
    | func_stat             // no estoy seguro de esto
    | list_stat
    | assig_stat   
    | expr                  // Esto lo permite python, poner operaciones en una línea y que no pete (DIRÍA DE QUITARLO)
    ;
*/


///// WHILE/IF/ELSE CLAUSES /////


while_stat : WHILE pre_cond_stat L_BLOCK blck_stmt R_BLOCK ;

if_stat : IF pre_cond_stat L_BLOCK blck_stmt R_BLOCK ;

else_stat : ELSE L_BLOCK blck_stmt R_BLOCK ;

pre_cond_stat : cond_stat ;

cond_stat : LPAREN cond_stat RPAREN # ParentCond
    | expr (GEQ|LEQ|NEQ|GT|LT|EQ) expr # BinaryCond
    | expr # ExprCond
    ;


///// FUNCTION OPERATIONS /////

// Function invocation


func_stat : FNC_NAME expr* ; //params* ;


///// ASSIGNATIONS /////


assig_stat : ID ASSIG expr ;    //Puede que necesite asociación por la derecha


///// IN/OUT //////


//Cuando hacemos read, leemos algo de terminal Y lo metemos en la variable que indica el programa, por lo que son dos cosas
//FALTA POR IMPLEMENTAR LA ASIGNACIÓN A VARIABLE 

read_stat : READ ID ;                                // Internamente hay que hacer la asignación a variable con lo que entra por pantalla

write_stat : WRITE ( PHRASE | expr )+ ;               // No me permite imprimir más de una palabra

//WORD : [a-zA-Z\u0080-\u00FF]+ ;  // No estoy seguro de que esto funcione

///// PLAY STATEMENT /////


play_stat : PLAY list_decl # PlayList
    | PLAY ( NOTE | ID ) # PlayNoteId
    ;


///// LISTS /////


// List statements


list_stat : list_assig
    | list_cut
    | list_add
    ;

list_assig : ID ASSIG list_decl ;

list_cut : LIST_CUT ID LCLAUDATOR expr RCLAUDATOR ;

list_add : ID LIST_ADD expr ;

// List expressions


list_expr : list_decl
    | list_length
    | list_value_get
    ;

list_decl : LCORCHET expr* RCORCHET ;

list_length : LIST_LENGTH ID ;

list_value_get : ID LCLAUDATOR expr RCLAUDATOR ;


///// EXPRESSIONS /////

// Hay un problema con los paréntesis, hay que mirar cómo lo puedo hacer para que siempre admita un paréntesis en todo

expr : LPAREN expr RPAREN   # ParentExpr
    | expr (MUL|DIV|MOD) expr   # MulDivModExpr
    | expr (SUM|SUB) expr   # SumSubExpr
    | (list_length|list_value_get) # ExprSons
    | (NOTE | NUM | ID) # NoteNumId
    ;


///// DATA TYPES AND IDENTIFYERS /////


// Number Operators

SUM : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
EXP : '^' ;
MOD : '%' ;

// Boolean conditions

EQ : '=' ;
NEQ : '/=' ;
GT : '>' ; 
LT : '<' ;
GEQ : '>=' ;
LEQ : '<=' ;

///// KEYWORDS AND SPECIAL CHARACTERS /////


LPAREN : '(' ;
RPAREN : ')' ;

LCLAUDATOR : '[' ;
RCLAUDATOR : ']' ;

LCORCHET : '{' ;
RCORCHET : '}' ;

L_BLOCK : '|:' ;
R_BLOCK : ':|' ;

WHILE : 'while' ;
IF : 'if' ;
THEN : 'then' ;
ELSE : 'else' ;

WRITE : '<!>' ;
READ : '<?>' ;

ASSIG : '<-' ;

// Special keywords for list operations

LIST_LENGTH : '#' ;
LIST_ADD : '<<' ;
LIST_CUT : '8<' ;

// Special keywords for musical composition

PLAY : '<:>' ;

// Special keywords for write statement

COMMAS : '"' ;

// Data types

NUM : ('0'..'9')+ ;
NOTE : ('A'..'B')('0')|('A'..'G')('1'..'7')?|('C')('8') ;
FNC_NAME : [A-Z\u0080-\u00FF]([a-zA-Z\u0080-\u00FF]|'_')+;
ID  : [a-z\u0080-\u00FF]([a-zA-Z\u0080-\u00FF] | '_')* ;

PHRASE : '"' (~('"' | '\n' | '\r' | '\t'))* '"';

///// SKIPPING /////

WS     : [ \t\r\n]+ -> skip ;
NL : (('\r\n')) ;

// Estas dos líneas las he obtenido de internet, con lo cuál unos cuantos alumnos tenemos estas mismas dos líneas para evitar los comentarios
COMMENT : '~~~' (('*' NL) | ('*' ~('\n' | '\r')) | NL | ~( '\n' | '\r' | '*'))* '~~~' -> skip ;


////////////////////////////// COSAS QUE FALTAN POR HACER ///////////////////////////////////

/*
    - Tengo que conseguir que todos los caracteres se puedan imprimir
 */