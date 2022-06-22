# Generated from JSBach.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .JSBachParser import JSBachParser
else:
    from JSBachParser import JSBachParser

# This class defines a complete generic visitor for a parse tree produced by JSBachParser.

class JSBachVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by JSBachParser#root.
    def visitRoot(self, ctx:JSBachParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#func_decl.
    def visitFunc_decl(self, ctx:JSBachParser.Func_declContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#blck_stmt.
    def visitBlck_stmt(self, ctx:JSBachParser.Blck_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#statement.
    def visitStatement(self, ctx:JSBachParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#while_stat.
    def visitWhile_stat(self, ctx:JSBachParser.While_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#if_stat.
    def visitIf_stat(self, ctx:JSBachParser.If_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#else_stat.
    def visitElse_stat(self, ctx:JSBachParser.Else_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#pre_cond_stat.
    def visitPre_cond_stat(self, ctx:JSBachParser.Pre_cond_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#ParentCond.
    def visitParentCond(self, ctx:JSBachParser.ParentCondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#BinaryCond.
    def visitBinaryCond(self, ctx:JSBachParser.BinaryCondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#ExprCond.
    def visitExprCond(self, ctx:JSBachParser.ExprCondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#func_stat.
    def visitFunc_stat(self, ctx:JSBachParser.Func_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#ParenExprParam.
    def visitParenExprParam(self, ctx:JSBachParser.ParenExprParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#ParenIdParam.
    def visitParenIdParam(self, ctx:JSBachParser.ParenIdParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#ExprParam.
    def visitExprParam(self, ctx:JSBachParser.ExprParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#IdParam.
    def visitIdParam(self, ctx:JSBachParser.IdParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#assig_stat.
    def visitAssig_stat(self, ctx:JSBachParser.Assig_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#read_stat.
    def visitRead_stat(self, ctx:JSBachParser.Read_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#write_stat.
    def visitWrite_stat(self, ctx:JSBachParser.Write_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#PlayList.
    def visitPlayList(self, ctx:JSBachParser.PlayListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#PlayNoteId.
    def visitPlayNoteId(self, ctx:JSBachParser.PlayNoteIdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#list_stat.
    def visitList_stat(self, ctx:JSBachParser.List_statContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#list_assig.
    def visitList_assig(self, ctx:JSBachParser.List_assigContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#list_cut.
    def visitList_cut(self, ctx:JSBachParser.List_cutContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#list_add.
    def visitList_add(self, ctx:JSBachParser.List_addContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#list_expr.
    def visitList_expr(self, ctx:JSBachParser.List_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#list_decl.
    def visitList_decl(self, ctx:JSBachParser.List_declContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#list_length.
    def visitList_length(self, ctx:JSBachParser.List_lengthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#list_value_get.
    def visitList_value_get(self, ctx:JSBachParser.List_value_getContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#SumSubExpr.
    def visitSumSubExpr(self, ctx:JSBachParser.SumSubExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#NoteNumId.
    def visitNoteNumId(self, ctx:JSBachParser.NoteNumIdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#MulDivModExpr.
    def visitMulDivModExpr(self, ctx:JSBachParser.MulDivModExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#ParentExpr.
    def visitParentExpr(self, ctx:JSBachParser.ParentExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by JSBachParser#ExprSons.
    def visitExprSons(self, ctx:JSBachParser.ExprSonsContext):
        return self.visitChildren(ctx)



del JSBachParser