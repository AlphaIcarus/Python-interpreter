# Intèrpret per JSBach

Aquest projecte consta de dues parts: La gramàtica del llenguatge i el visitador de l'AST resultant d'analitzar un programa amb extensió jsb.

## Gramàtica

La gramàtica té com a arrel un conjunt de definició de funcions, amb els seus noms, paràmetres i statements associats, de tal manera que podrem previsitar tot el programa abans de l'execució. Els conjunt de statements són, com el propi nom indica, un conjunt de statements.

Diem que un conjunt de statements poden ser qualsevol tipus d'instrucció que es pot declarar en una sola línia, o que sigui un conjunt de línies que no es poden separar. Aquests statements poden ser el condicional (if/else), el bucle (while), crida a funcions...

La semàntica de les instruccions condicionals i de bucle són les habituals i especificades en la pràctica, així com les assignacions, les reproduccions, les escriptures i les lectures. Tots els statements sobre llistes també s'especifiquen de la mateixa manera.

Les expressions poden ser sobre llistes o excloent les llistes. Aquelles operacions que són sobre llistes són la llargada de la llista (#) i l'obtenció d'un valor de la llista ([]). Aquelles expressions que no són sobre llistes són les operacions clàssiques sobre enters (suma, resta, divisió, multiplicació i mòdul), així com una nota, una variable o un número. Aquests tres últims sempre retorna el seu valor enter (en cas del número es retorna el propi número).

Per acabar, tot allò que es troba entre ~~~ es considera comentari i s'evita el seu processament. També evitem els salts de línea i els tabs.

## Intèrpret

El TreeVisitator té les classes i els seus mètodes documentats, per tant només explicaré allò que sigui essencial per entendre el programa.

L'intèrpret consisteix en un programa que analitza l'AST resultant d'executar ANTLR4 sobre el fitxer JSBach i interpreta les seves instruccions. Per fer-ho, fem servir les classes següents:

**Notes**: Classe que s'utilitza per identificar notes i obtenir el valor de les notes a partir del seu nom (string). També l'emprem per emmagatzemar les notes que es reprodueixen (<:>) i imprimir aquesta llista en un format que accepti lilypond. Emprem un diccionari que capta totes les possibles notes i tenen associada cadascuna el seu valor. Les comprobacions per saber si un enter pot ser una nota és veure si el valor de l'enter té associat una nota.

**Heap**: Classe que representa la memòria associada a l'execució d'un programa JSBach. Consta d'una pila on cada nivell de la pila representa una crida a una funció, de tal menera que Heap[0] representa la crida a la funció donada per començar, Heap[1] té les dades d'una crida a una funció cridada a l'anterior, i així consecutivament. En cada nivell emmagatzemem la taula de símbols, on es troben les variables donades i els seus respectius valors.

També tenim els atributs start_func i start_argv, que defineixen el nom de la funció a executar la primera i els seus arguments, respectivament; i un diccionari per guardar les dades de les funcions declarades, anomenat func_set.

El TreeVisitor comença per visitar l'arrel de l'AST. A partir d'aquesta, visitem cadascuna de les declaracions de les funcions i emmagatzemem totes les dades relacionades amb elles (nom de la funció, paràmetres formals, codi i taula de símbols). A continuació visitem la funció inicial ('Main' si no és definida). Una vegada executada la funció inicial, l'execució de la resta del programa ja és com l'esperada en qualsevol llenguatge de programació amb paradigma imperatiu.

## Instruccions per l'execució

El directori src ja consta de la gramàtica del llenguatge i el visitador de l'AST, per la qual cosa només s'ha d'executar l'script jsbach.py, donant com a paràmetre:

1. El programa .jsb que es vol executar.
2. (Opcional) La funció per on es vol començar l'execució. Si no es dóna aquesta, comença per la funció 'Main'.

## Execució de l'script

Una vegada executat el TreeVisitor, obtenim a partir de la seva instància de Notes la llista que correspon a les notes que s'han de reproduir. Obtenim aquesta llista en forma de string. Creem i escribim el fitxer lilypond amb aquesta llista. A partir d'aquest, creem i escribim els fitxers .wab i .midi, i finalment generem el .mp3 a partir del .wav. Emprem el mòdul subprocess per executar les comandes UNIX addients per generar els fitxers.

## Observacions

- Els noms de les funcions han de començar per majúscula, mentre que el de les variables ha de començar per minúscula. Això és degut a que hi ha ambigüetats, per exemple, a l'hora d'imprimir frases amb valors de variables i cridar a una funció tot seguit. 
