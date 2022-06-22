import subprocess
import sys
from typing import Any
from subprocess import *
from antlr4 import *

from JSBachLexer import JSBachLexer

if __name__ is not None and "." in __name__:
    from .JSBachParser import JSBachParser
    from .JSBachVisitor import JSBachVisitor
else:
    from JSBachParser import JSBachParser
    from JSBachVisitor import JSBachVisitor


class Notes:
    """Classe que emmagatzema totes les notes possibles, així com mètodes per verificar que els strings donats com a notes
    siguin veritablement notes, i atributs on emmagatzemem les notes reproduides"""

    _notes = ({"C": 24,
               "D": 25,
               "E": 26,
               "F": 27,
               "G": 28,
               "A": 29,
               "B": 30,
               "A0": 1,
               "B0": 2,
               "C1": 3,
               "D1": 4,
               "E1": 5,
               "F1": 6,
               "G1": 7,
               "A1": 8,
               "B1": 9,
               "C2": 10,
               "D2": 11,
               "E2": 12,
               "F2": 13,
               "G2": 14,
               "A2": 15,
               "B2": 16,
               "C3": 17,
               "D3": 18,
               "E3": 19,
               "F3": 20,
               "G3": 21,
               "A3": 22,
               "B3": 23,
               "C4": 24,
               "D4": 25,
               "E4": 26,
               "F4": 27,
               "G4": 28,
               "A4": 29,
               "B4": 30,
               "C5": 31,
               "D5": 32,
               "E5": 33,
               "F5": 34,
               "G5": 35,
               "A5": 36,
               "B5": 37,
               "C6": 38,
               "D6": 39,
               "E6": 40,
               "F6": 41,
               "G6": 42,
               "A6": 43,
               "B6": 44,
               "C7": 45,
               "D7": 46,
               "E7": 47,
               "F7": 48,
               "G7": 49,
               "A7": 50,
               "B7": 51,
               "C8": 52})
    """Diccionari amb totes les notes musicals possibles i el seu valor numèric (key, value)"""

    def __init__(self):
        """
        Inicialització de la classe Notes
        """
        self._sheet_music: list[str] = []
        """Llista amb totes les notes musicals que s'han anat afegint al llarg del programa"""

    def is_note(self, note: int):
        """
        Mètode que rep un string i comprova si és una nota.
        En cas que no sigui una nota, retorna false.
        """
        if note not in Notes._notes.values():
            return False
        else:
            return True

    def key(self, value: int):
        """
        Mètode que dona el nom de la nota segons el valor de l'enter donat per paràmetre
        """
        if value in list(Notes._notes.values()):
            for key in Notes._notes.keys():
                if Notes._notes[key] == value:
                    return key
        else:
            return None

    def value(self, note: str):
        """
        Mètode que dona el valor d'una nota vàlida passada per paràmetre
        """
        if note in Notes._notes.keys():
            return Notes._notes[note]
        else:
            return None

    def add_note(self, note: int):
        """
        Comprova que sigui una nota i, si ho és, la afegeix a la llista de notes
        """
        if self.is_note(note):
            self._sheet_music.append(self.key(note))
        else:
            raise Exception(
                "The given note cannot be added because is not a valid note")

    def get_partiture(self):
        """
        Retorna la partitura en forma de string per posar al fitxer
        """
        part = ""
        for note in self._sheet_music:
            if len(note) == 1:
                part += note.lower() + "'" + " "
            else:
                if note[1] == "0":
                    part += note[0].lower() + ",,," + " "
                elif note[1] == "1":
                    part += note[0].lower() + ",," + " "
                elif note[1] == "2":
                    part += note[0].lower() + "," + " "
                elif note[1] == "3":
                    part += note[0].lower() + "" + " "
                elif note[1] == "4":
                    part += note[0].lower() + "'" + " "
                elif note[1] == "5":
                    part += note[0].lower() + "''" + " "
                elif note[1] == "6":
                    part += note[0].lower() + "'''" + " "
                elif note[1] == "7":
                    part += note[0].lower() + "''''" + " "
                else:
                    part += note[0].lower() + "'''''" + " "
        return part.removesuffix(" ")

    """
    Classe que representa un punter al heap per tipus estructurats List. S'utilitza per passar per referència les llistes a les funcions
    que es criden. Podem construir punters i obtenir els seus valors.
    """


class Level:
    """
    Classe que representa un nivell en el Heap de memòria. Consta del nom de la funció invocada, els paràmetres, la taula de símbols i el codi
    """

    def __init__(self):
        """ Inicialitzadora de la classe Level """
        self.symbols: dict[str, Any] = {}
        """Taula de símbols que té el nivell, la crida d'aquesta funció"""


class Heap:
    """
    Classe que representa el heap dinàmic de memòria en qualsevol llenguatge de programació imperatiu.
    S'utilitza per emmagatzemar les variables. Cada nivell suposa una crida a una funció. Les llistes es pasen per paràmetre
    """

    def __init__(self):
        """
        Inicialització de la classe Heap
        """
        self._heap: list[Level] = []
        """Estructura de dades en forma de pila que emmagatzema les variables de cada procediment. heap s del tipus list(dict())"""
        self._top: int = -1
        """Valor enter que determina quin és el diccionari que hem d'escollir per buscar una variable"""

    def _exists_in_top(self, key: str):
        """
        Comprova que la clau per paràmetre tingui una variable associada al diccionari actual (top)
        """
        return key in self._heap[self._top].symbols.keys()

    def _exists_in_heap(self, key: str, level: str):
        """
        Comprova que la clau per paràmetre existeixi a tot el heap a partir del nivell donat cap abaix.
        """
        if level >= 0:
            if key in self._heap[self._top].symbols.keys():
                return level
            else:
                return self._exists_in_heap(key, level - 1)
        return -1

    def push(self, d: dict):
        """
        Afegeix un nou diccionari per la crida d'un procediment, i emagatzema els paràmetres (en forma de llista de parells) donats al diccionari
        """
        self._heap.append(Level())
        self._top += 1
        self._heap[self._top].symbols = d
        return

    def pop(self):
        """
        Elimina el diccionari actual i disminueix en una unitat l'índex de la pila, perquè ha tornat d'un procediment
        """
        self._heap.pop()
        self._top -= 1
        return

    def add(self, key: str, value: Any):
        """
        Afegeix o modifica una variable al diccionari actual, del tipus (key, value)
        """
        self._heap[self._top].symbols[key] = value    

    def get(self, key: str):
        """
        Retorna el valor associat al nom d'una variable determinada per key.
        Si no existeix una variable amb aquest nom en el mateix nivell però sí en un altre (crida anterior), retorna una excepció
        """
        if self._exists_in_top(key) and self._exists_in_heap(
                key, self._top - 1):
            return self._heap[self._top].symbols[key]

        elif self._exists_in_top(key) and not self._exists_in_heap(key, self._top - 1):
            return self._heap[self._top].symbols[key]

        elif not self._exists_in_top(key) and self._exists_in_heap(key, self._top - 1):
            raise Exception(
                "The given variable: " +
                str(key) +
                " is not in scope")
        else:   
            self.add(key, 0)
            return 0


"""
APUNTES IMPORTANTES A TENER EN CUENTA:

    - A partir de ahora, las notas son STRINGS únicamente. Solo las notas pueden ser strings (valores en variables) de tal manera que
    basta con comprobar que sean notas con la función Notes.is_note(note). Así comprobamos que sea una nota en los nodos más bajos del AST
    - Los putos índices de las listas van de 1 a n, así que me como una mierda y reviso que esté bien eso

"""


class TreeVisitor(JSBachVisitor):

    def __init__(self, func: str, argv: list):
        """
        Constructora de la classe TreeVisitor
        """
        self.heap: Heap = Heap()
        """Heap (Pila de diccionaris) de les variables de cadascun dels seus procediments"""
        self.notes: Notes = Notes()
        """Estructura per operar amb notes i fer comprovacions"""
        self.func_set: dict = {}
        """Funcions disponibles per fer les crides"""
        self.start_func: str = func
        """Nom de la funció per on començar la execució"""
        self.start_argv: list = argv
        """Arguments que rep la primera funció que hem de cridar"""

    def visitRoot(self, ctx: JSBachParser.RootContext):
        """
        Visitador per l'arrel del programa. Aquesta arrel visita cadascuna de les funcions declarades i emmagatzema la informació següent:
            - Nom de la funció
            - Paràmetres de la funció
            - Codi de la funció
            - Taula de símbols de la funció
        Després visita la funció donada per començar l'execució (Main o donada per entrada estàndard) i executa el programa emmagatzemant
        el context al heap
        """
        sons = l = list(ctx.getChildren())
        for son in sons:
            self.visit(son)

        if self.start_func not in self.func_set.keys():
            raise Exception(
                "The given function does not exist in the set of possible functions of the program")
        info = self.func_set[self.start_func].copy()
        if len(info["params"]) != len(self.start_argv):
            raise Exception(
                "The number of given parameters do not match the number of parameters necessary to call the function")
        for i in range(0, len(self.start_argv)):
            info["symbols"][info["params"][i]] = self.start_argv[i]

        self.heap.push(info)
        self.visit(info["code"])
        self.heap.pop()

    def visitFunc_decl(self, ctx: JSBachParser.Func_declContext):
        """
        Visitador que visita tot el context de la funció necessari per cridar-la (nom, paràmetres, codi i taula de símbols) i l'emmagatzema
        """
        l = list(ctx.getChildren())
        num_params = len(l) - 4
        func_name = str(l[0].getText())
        if func_name in self.func_set.keys():
            raise Exception(
                "The functionw with name: " +
                func_name +
                " is already defined")
        params = [str(l[i].getText()) for i in range(1, num_params + 1)]
        if num_params > 0 and any(
            params[i] == params[j] for i in range(
                0, num_params) for j in range(
                i, num_params) if i != j):
            raise Exception(
                "Two or more given parameters for the function " +
                func_name +
                " are named equal")
        symbols = {}
        for p in params:
            symbols[p] = 0
        code = l[len(l) - 2]

        self.func_set[func_name] = {
            "name": func_name,
            "params": params,
            "code": code,
            "symbols": symbols}

    def visitFunc_stat(self, ctx: JSBachParser.Func_statContext):
        """
        Visitador que recupera el context de la declaració de la funció a cridar, assigna valors als paràmetres i executa el codi d'aquesta
        """
        l = list(ctx.getChildren())
        num_params = len(l) - 1
        func_name = str(l[0].getText())
        if func_name not in self.func_set.keys():
            raise Exception("The called function does not exist")
        func_info = self.func_set[func_name] 
        if num_params != len(func_info["params"]):
            raise Exception(
                "The number of parameters given is not coherent with the definition")
        info = (
            {
                "name": func_name,
                "params": self.func_set[func_name]["params"].copy(),
                "code": self.func_set[func_name]["code"],
                "symbols": self.func_set[func_name]["symbols"].copy()
            }
        )
        for i in range(0, num_params):
            key = info["params"][i]
            value = self.visit(l[i + 1])
            info["symbols"][key] = value
        self.heap.push(info["symbols"])
        self.visit(info["code"])
        self.heap.pop()

    def exprPreEvaluation(self, a, b):
        """
        Visitador que es crida per evaluar els paràmetres que donen les expressions binàries
        """
        try:
            a = int(a)
            b = int(b)
        except BaseException:
            if self.notes.value(str(a)) is not None:
                a = self.notes.value(str(a))
            if self.notes.value(str(b)) is not None:
                b = self.notes.value(str(b))
        return a, b

    def visitExprSons(self, ctx: JSBachParser.ExprSonsContext):
        """
        Visitador que visita i retorna les expressions pròpies de les llistes (list_value_get() / list_length())
        """
        l = list(ctx.getChildren())
        return self.visit(l[0])

    def visitSumSubExpr(self, ctx: JSBachParser.SumSubExprContext):
        """
        Visitador qie retorna el valor d'evaluar una expressió del tipus 'expression OP expression' on OP és l'operació a aplicar
        """
        l = list(ctx.getChildren())
        a, b = self.exprPreEvaluation(
            self.visit(l[0]), self.visit(l[2]))
        if JSBachParser.symbolicNames[l[1].getSymbol().type] == 'SUM':
            res = a + b
            return int(res)
        elif JSBachParser.symbolicNames[l[1].getSymbol().type] == 'SUB':
            res = a - b
            return int(res)
        else:
            raise Exception(
                "Something went wrong when evaluating an expression")

    # Visit a parse tree produced by JSBachParser#NoteNumId.
    def visitNoteNumId(self, ctx: JSBachParser.NoteNumIdContext):
        """
        Visitador que obté una nota, un número o un identificador, i retorna el seu valor enter
        """
        l = list(ctx.getChildren())
        if JSBachParser.symbolicNames[l[0].getSymbol().type] == 'NOTE':
            return self.notes.value(str(l[0].getText()))
        elif JSBachParser.symbolicNames[l[0].getSymbol().type] == 'NUM':
            return int(l[0].getText())
        elif JSBachParser.symbolicNames[l[0].getSymbol().type] == 'ID':
            return self.heap.get(l[0].getText())

    # Visit a parse tree produced by JSBachParser#MulDivModExpr.
    def visitMulDivModExpr(self, ctx: JSBachParser.MulDivModExprContext):
        """
        Visitador que obté dos expressions simples (nota, número o identificador) o complexes (resultats d'altres operacions) i
        aplica l'operador donat per obtenir el resultat enter de fer aquesta operació matemàtica
        """
        l = list(ctx.getChildren())
        a, b, isNote = self.exprPreEvaluation(
            self.visit(l[0]), self.visit(l[2]))
        if JSBachParser.symbolicNames[l[1].getSymbol().type] == 'MUL':
            res = a * b
            return int(res)
        elif JSBachParser.symbolicNames[l[1].getSymbol().type] == 'DIV':
            if b == 0:
                raise Exception("Found division by 0. Result not reachable")
            else:
                res = a / b
            return int(res)
        elif JSBachParser.symbolicNames[l[1].getSymbol().type] == 'MOD':
            res = a % b
            return int(res)
        else:
            raise Exception(
                "Something went wrong when evaluating an expression")

    # Visit a parse tree produced by JSBachParser#ParentExpr.
    def visitParentExpr(self, ctx: JSBachParser.ParentExprContext):
        """
        Visitador que obté una expressió entre parèntesis i retorna el seu valor enter
        """
        l = list(ctx.getChildren())
        res = self.visit(l[1])
        try:
            return int(res)
        except BaseException:
            if self.notes.value(str(res)) is not None:
                return self.notes.value(str(res))
            elif self.heap._exists_in_top(str(res)):
                return self.heap.get(str(res))
            else:
                raise Exception("Invalid expression")

    # Visit a parse tree produced by JSBachParser#blck_stmt.
    def visitBlck_stmt(self, ctx: JSBachParser.Blck_stmtContext):
        """
        Visitador que obté una seqüència de statements i visita cadascun d'ells
        """
        self.visitChildren(ctx)

    # Visit a parse tree produced by JSBachParser#statement.
    def visitStatement(self, ctx: JSBachParser.StatementContext):
        """
        Visitador que obté un statement, que pot ser d'un de diversos tipus (if/else, while, statements sobre llistes...) i el visita
        """
        l = list(ctx.getChildren())
        if (len(l) == 2):
            cond = int(self.visit(l[0]))  # IF
            if cond == 0:
                self.visit(l[1])         # ELSE
        else:
            self.visit(l[0])

    # Visit a parse tree produced by JSBachParser#while_stat.
    def visitWhile_stat(self, ctx: JSBachParser.While_statContext):
        """
        Visitador que executa un bloc del tipus 'while condició |: bloc_statements :|', on s'evalua la condició cada cop que arriba al començament
        del bucle i, si retorna 1, executa el bloc; no executa el bloc altrament
        """
        l = list(ctx.getChildren())
        cond = int(self.visit(l[1]))
        while cond == 1:
            self.visit(l[3])
            cond = int(self.visit(l[1]))

    def visitIf_stat(self, ctx: JSBachParser.If_statContext):
        """
        Visitador que executa un bloc del tipus 'if condició |: bloc_statements :|', on s'evalua la condició quan arriba al començament
        del condicional i, si retorna 1, executa el bloc; no executa el bloc si retorna 0 altrament
        """
        l = list(ctx.getChildren())
        cond = int(self.visit(l[1])) 
        if cond == 1:
            self.visit(l[3])
            return 1
        return 0

    # Visit a parse tree produced by JSBachParser#else_stat.
    def visitElse_stat(self, ctx: JSBachParser.Else_statContext):
        """
        Visitador que executa un bloc del tipus 'else |: bloc_statements :|', on s'executa el bloc d'statements si el bloc 'if' anterior
        a aquest else ha retornat 0 en la seva condició
        """
        l = list(ctx.getChildren())
        self.visit(l[2])

    # Visit a parse tree produced by JSBachParser#pre_cond_stat.
    def visitPre_cond_stat(self, ctx: JSBachParser.Pre_cond_statContext):
        """
        Visitador que rep la condició 'booleana' resultant d'avaluar una condició i retorna 0 si obtenim 0, 1 altrament
        """
        l = list(ctx.getChildren())
        value = self.visit(l[0])
        try:
            return 1 if int(value) != 0 else 0
        except BaseException:
            if self.notes.value(str(value)) is not None:
                return 1
            else:
                raise Exception("The given value for condition is not valid")

    # Visit a parse tree produced by JSBachParser#ParentCond.

    def visitParentCond(self, ctx: JSBachParser.ParentCondContext):
        """
        Visitador que visita una condició del tipus "(condició)", on l'expressió es troba acotada entre parèntesis.
        """
        l = list(ctx.getChildren())
        val = self.visit(l[1])
        try:
            return int(val)
        except BaseException:
            if not self.notes.value(str(val)) is not None:
                raise Exception(
                    "The given expression is neither an integer nor a note")
            else:
                return self.notes.value(str(val))

    # Visit a parse tree produced by JSBachParser#BinaryCond.

    def visitBinaryCond(self, ctx: JSBachParser.BinaryCondContext):
        """
        Visitador que visita una condició del tipus condició "condició binary_operator condició", on la condició és composada per dos condicions i un operador binari.
        """
        l = list(ctx.getChildren())
        condA, condB = self.exprPreEvaluation(
            self.visit(l[0]), self.visit(l[2]))
        op = l[1].getText()

        if op == "=":
            return 1 if condA == condB else 0
        elif op == "/=":
            return 1 if condA != condB else 0
        elif op == "<":
            return 1 if condA < condB else 0
        elif op == ">":
            return 1 if condA > condB else 0
        elif op == "<=":
            return 1 if condA <= condB else 0
        elif op == ">=":
            return 1 if condA >= condB else 0
        else:
            raise Exception("Binary operator not found")

    # Visit a parse tree produced by JSBachParser#ExprCond.

    def visitExprCond(self, ctx: JSBachParser.ExprCondContext):
        """
        Visitador que visita una condició del tipus condició "expression", on la condició és composada per una expressió només.
        """
        l = list(ctx.getChildren())
        expr = self.visit(l[0])
        try:
            return int(expr)
        except BaseException:
            if self.notes.value(str(self.visit(l[0]))) is not None:
                return self.notes.value(str(expr))
            else:
                raise Exception(
                    "The expression given for the condition is neither an integer nor a note")

    # Visit a parse tree produced by JSBachParser#assig_stat.
    def visitAssig_stat(self, ctx: JSBachParser.Assig_statContext):
        """
        Visitador que rep un identificador i una expressió i assigna el valor resultant d'evaluar l'expressió en la variable donada
        """
        l = list(ctx.getChildren())
        id = str(l[0].getText())
        value = self.visit(l[2])
        self.heap.add(id, value)

    def visitRead_stat(self, ctx: JSBachParser.Read_statContext):
        """
        Visitador que rep una variable i, per entrada estàndard per terminal, l'usuari dóna el valor enter a assignar a la variable donada
        """
        l = list(ctx.getChildren())
        var = l[1].getText()
        try:
            var_value = int(input())
            self.heap.add(var, var_value)
        except BaseException:
            raise Exception("The given value is not a valid integer")

    def printList(self, mes: list):
        """
        Mètode auxiliar que agafa una lista per paràmetre i construeix un string que representa la llista amb els seus valors, amb la morfologia de JSBach
        """
        message = "{"
        for i in mes:
            message += str(i) + " "
        message = message.removesuffix(" ")
        message += "}"
        return message

    def visitWrite_stat(self, ctx: JSBachParser.Write_statContext):
        """
        Visitador que escriu per pantalla textos combinats amb expressions avaluades prèviament
        """
        l = list(ctx.getChildren())
        message = ""
        for i in range(1, len(l)):
            text = self.visit(l[i])
            if isinstance(text, int):
                message += " " + str(text)
            elif isinstance(text, list):
                message += " " + self.printList(text)
            elif isinstance(text, str):
                message += " " + str(text)
            else:
                message += " " + l[i].getText()
        print(message.removeprefix(" "))

    # Visit a parse tree produced by JSBachParser#PlayList.
    def visitPlayList(self, ctx: JSBachParser.PlayListContext):
        """
        Visitador que rep una sèrie de notes i les afegeix a la partitura del programa, que en acabar l'execució del visitador es retorna per
        generar la partitura i l'arxiu musical
        """
        l = list(ctx.getChildren())
        notes = list(self.visit(l[1]))
        for note in notes:
            self.notes.add_note(note)

    # Visit a parse tree produced by JSBachParser#PlayNoteId.
    def visitPlayNoteId(self, ctx: JSBachParser.PlayNoteIdContext):
        """
        Visitador que obté una nota o un identificador i afegeix el valor al final de la partitura
        """
        l = list(ctx.getChildren())
        id = str(l[1].getText())
        if self.notes.value(id) is not None:
            self.notes.add_note(id)
        else:
            value = self.heap.get(id)
            if isinstance(value, list):
                for val in value:
                    self.notes.add_note(val)
            else:
                self.notes.add_note(self.heap.get(id))

    def visitList_stat(self, ctx: JSBachParser.List_statContext):
        """
        Visitador que visita el node intermig de la visita a statements sobre llistes
        """
        self.visitChildren(ctx)

    def visitList_assig(self, ctx: JSBachParser.List_assigContext):
        """
        Visitador que assigna una llista d'enters o de notes a una variable
        """
        l = list(ctx.getChildren())
        id = str(l[0].getText())
        value = list(self.visit(l[2]))
        self.heap.add(id, value)

    def visitList_cut(self, ctx: JSBachParser.List_cutContext):
        """
        Visitador que rep un identificador i una expressió, que indiquen una posició en una llista, i elimina la posició de la llista donada, si i
        només si l'identificador és de tipus llista i vàlid, i l'índex es troba entre 1 i #llista
        """
        l = list(ctx.getChildren())
        try:
            id = str(l[1].getText())
            pos = int(self.visit(l[3]))
            var: list = self.heap.get(id)
            if isinstance(var, list):
                var.pop(pos - 1)
                self.heap.add(id, var)
            else:
                raise Exception("Variable is not of type list")
        except BaseException:
            raise Exception(
                "Something went wrong when removing a position from the list")

    def visitList_add(self, ctx: JSBachParser.List_addContext):
        """
        Visitador que afegeix un valor al final d'una llista, que ve donada per un identificador
        """
        l = list(ctx.getChildren())
        key = str(l[0].getText())
        value = self.heap.get(key)
        expr = self.visit(l[2])
        if (isinstance(value, list)):
            value.append(expr)
        else:
            raise Exception("The types are incompatible.")
        self.heap.add(key, value)

    def visitList_expr(self, ctx: JSBachParser.List_exprContext):
        l = list(ctx.getChildren())
        return self.visit(l[0])

    def visitList_decl(self, ctx: JSBachParser.List_declContext):
        """
        Visitador que obté una sequüència de valors i crea una llista a partir d'aquests
        """
        l = list(ctx.getChildren())
        decl = []
        ini_type = None
        for i in range(1, len(l) - 1):
            decl.append(self.visit(l[i]))
            if i > 1:
                ini_type = type(decl[i - 1])
                if not isinstance(decl[i - 2], ini_type):
                    raise Exception("Types of values do not match")
        return decl

    def visitList_length(self, ctx: JSBachParser.List_lengthContext):
        """
        Visitador que rep un identificador d'una llista i retorna el tamany d'aquesta (nombre d'elements)
        """
        l = list(ctx.getChildren())
        key = str(l[1].getText())
        value = self.heap.get(key)
        if isinstance(value, list):
            return len(value)
        else:
            raise Exception("The given variable is not a list")

    def visitList_value_get(self, ctx: JSBachParser.List_value_getContext):
        """
        Visitador que rep un identificador d'una llista i una expressió, i retorna el valor de la llista que es troba en la posició que indica
        el resultat d'avaluar l'expressió
        """
        l = list(ctx.getChildren())
        key = str(l[0].getText())
        i = 0
        try:
            i = int(self.visit(l[2]))
        except BaseException:
            raise Exception(
                "The given expression for the list value getter is not a valid integer")
        value = self.heap.get(key)
        if isinstance(value, list):
            if 1 <= i <= len(value):
                return value[i - 1]
            else:
                raise Exception(
                    "The given expression fo the list value getter is out of bounds")
        else:
            raise Exception("The given identifier is not of list type")


def main():
    input_stream = FileStream(sys.argv[1], encoding='utf-8')

    if not sys.argv[1].endswith(".jsb"):
        raise Exception("The given file is not a JSBach file")

    nargs = len(sys.argv)
    start_func = "Main"

    args = []
    if nargs >= 3:
        start_func = sys.argv[2]
        for i in range(3, len(sys.argv)):
            if Notes().value(sys.argv[i]) is not None:
                args.append(str(sys.argv[i]))
            else:
                args.append(int(sys.argv[i]))

    t = TreeVisitor(start_func, args)
    lexer = JSBachLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = JSBachParser(token_stream)
    tree = parser.root()
    
    # print(tree.toStringTree(recog=parser))

    t.visit(tree)

    """ LILYPOND """
    lily_program: str = '\\version "2.22.1" \n\\score {\n\\absolute {\n\\tempo 4 = 120\n'
    lily_program += t.notes.get_partiture()
    lily_program += "\n}\n\\layout { }\n\\midi { }\n}"

    file_name: str = "./" + sys.argv[1].partition(".")[0]
    lily_file = open(file_name + ".lily", 'w')

    lily_file.flush()
    lily_file.write('\u005Cversion "2.22.1"\n')
    lily_file.write('\u005Cscore {\n')
    lily_file.write('   \u005Cabsolute {\n')
    lily_file.write('       \u005Ctempo 4 = 120\n')
    lily_file.write('       ' + t.notes.get_partiture())
    lily_file.write('\n    }\n    \u005Clayout { }\n')
    lily_file.write('    \u005Cmidi { }\n}')
    lily_file.close()

    """ Generació dels fitxers """
    subprocess.run(['lilypond', file_name + ".lily"])
    subprocess.run(["timidity", "-Ow", "-o", file_name + ".wav",
                   file_name + ".midi"])
    subprocess.run(["ffmpeg", "-i", file_name +
                    ".wav", "-codec:a", "libmp3lame", "-qscale:a 2", file_name +
                    ".mp3"])
    return

# Main call
main()
