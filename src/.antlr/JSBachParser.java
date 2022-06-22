// Generated from /home/alpha/Desktop/FIB/LP/LP-Practica/pràctica/JSBach.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSBachParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SUM=1, SUB=2, MUL=3, DIV=4, EXP=5, MOD=6, EQ=7, NEQ=8, GT=9, LT=10, GEQ=11, 
		LEQ=12, LPAREN=13, RPAREN=14, LCLAUDATOR=15, RCLAUDATOR=16, LCORCHET=17, 
		RCORCHET=18, L_BLOCK=19, R_BLOCK=20, WHILE=21, IF=22, THEN=23, ELSE=24, 
		WRITE=25, READ=26, ASSIG=27, LIST_LENGTH=28, LIST_ADD=29, LIST_CUT=30, 
		PLAY=31, COMMAS=32, NUM=33, NOTE=34, FNC_NAME=35, ID=36, PHRASE=37, WS=38, 
		NL=39, COMMENT=40;
	public static final int
		RULE_root = 0, RULE_func_decl = 1, RULE_blck_stmt = 2, RULE_statement = 3, 
		RULE_while_stat = 4, RULE_if_stat = 5, RULE_else_stat = 6, RULE_pre_cond_stat = 7, 
		RULE_cond_stat = 8, RULE_func_stat = 9, RULE_assig_stat = 10, RULE_read_stat = 11, 
		RULE_write_stat = 12, RULE_play_stat = 13, RULE_list_stat = 14, RULE_list_assig = 15, 
		RULE_list_cut = 16, RULE_list_add = 17, RULE_list_expr = 18, RULE_list_decl = 19, 
		RULE_list_length = 20, RULE_list_value_get = 21, RULE_expr = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "func_decl", "blck_stmt", "statement", "while_stat", "if_stat", 
			"else_stat", "pre_cond_stat", "cond_stat", "func_stat", "assig_stat", 
			"read_stat", "write_stat", "play_stat", "list_stat", "list_assig", "list_cut", 
			"list_add", "list_expr", "list_decl", "list_length", "list_value_get", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'='", "'/='", "'>'", 
			"'<'", "'>='", "'<='", "'('", "')'", "'['", "']'", "'{'", "'}'", "'|:'", 
			"':|'", "'while'", "'if'", "'then'", "'else'", "'<!>'", "'<?>'", "'<-'", 
			"'#'", "'<<'", "'8<'", "'<:>'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SUM", "SUB", "MUL", "DIV", "EXP", "MOD", "EQ", "NEQ", "GT", "LT", 
			"GEQ", "LEQ", "LPAREN", "RPAREN", "LCLAUDATOR", "RCLAUDATOR", "LCORCHET", 
			"RCORCHET", "L_BLOCK", "R_BLOCK", "WHILE", "IF", "THEN", "ELSE", "WRITE", 
			"READ", "ASSIG", "LIST_LENGTH", "LIST_ADD", "LIST_CUT", "PLAY", "COMMAS", 
			"NUM", "NOTE", "FNC_NAME", "ID", "PHRASE", "WS", "NL", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JSBach.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSBachParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JSBachParser.EOF, 0); }
		public List<Func_declContext> func_decl() {
			return getRuleContexts(Func_declContext.class);
		}
		public Func_declContext func_decl(int i) {
			return getRuleContext(Func_declContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				func_decl();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FNC_NAME );
			setState(51);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_declContext extends ParserRuleContext {
		public TerminalNode FNC_NAME() { return getToken(JSBachParser.FNC_NAME, 0); }
		public TerminalNode L_BLOCK() { return getToken(JSBachParser.L_BLOCK, 0); }
		public Blck_stmtContext blck_stmt() {
			return getRuleContext(Blck_stmtContext.class,0);
		}
		public TerminalNode R_BLOCK() { return getToken(JSBachParser.R_BLOCK, 0); }
		public List<TerminalNode> ID() { return getTokens(JSBachParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JSBachParser.ID, i);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(FNC_NAME);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(54);
				match(ID);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(L_BLOCK);
			setState(61);
			blck_stmt();
			setState(62);
			match(R_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Blck_stmtContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Blck_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blck_stmt; }
	}

	public final Blck_stmtContext blck_stmt() throws RecognitionException {
		Blck_stmtContext _localctx = new Blck_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blck_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << WRITE) | (1L << READ) | (1L << LIST_CUT) | (1L << PLAY) | (1L << FNC_NAME) | (1L << ID))) != 0)) {
				{
				{
				setState(64);
				statement();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Func_statContext func_stat() {
			return getRuleContext(Func_statContext.class,0);
		}
		public Assig_statContext assig_stat() {
			return getRuleContext(Assig_statContext.class,0);
		}
		public List_statContext list_stat() {
			return getRuleContext(List_statContext.class,0);
		}
		public Play_statContext play_stat() {
			return getRuleContext(Play_statContext.class,0);
		}
		public Read_statContext read_stat() {
			return getRuleContext(Read_statContext.class,0);
		}
		public Write_statContext write_stat() {
			return getRuleContext(Write_statContext.class,0);
		}
		public Else_statContext else_stat() {
			return getRuleContext(Else_statContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(70);
				if_stat();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(71);
					else_stat();
					}
				}

				}
				break;
			case 2:
				{
				setState(74);
				while_stat();
				}
				break;
			case 3:
				{
				setState(75);
				func_stat();
				}
				break;
			case 4:
				{
				setState(76);
				assig_stat();
				}
				break;
			case 5:
				{
				setState(77);
				list_stat();
				}
				break;
			case 6:
				{
				setState(78);
				play_stat();
				}
				break;
			case 7:
				{
				setState(79);
				read_stat();
				}
				break;
			case 8:
				{
				setState(80);
				write_stat();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JSBachParser.WHILE, 0); }
		public Pre_cond_statContext pre_cond_stat() {
			return getRuleContext(Pre_cond_statContext.class,0);
		}
		public TerminalNode L_BLOCK() { return getToken(JSBachParser.L_BLOCK, 0); }
		public Blck_stmtContext blck_stmt() {
			return getRuleContext(Blck_stmtContext.class,0);
		}
		public TerminalNode R_BLOCK() { return getToken(JSBachParser.R_BLOCK, 0); }
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(WHILE);
			setState(84);
			pre_cond_stat();
			setState(85);
			match(L_BLOCK);
			setState(86);
			blck_stmt();
			setState(87);
			match(R_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JSBachParser.IF, 0); }
		public Pre_cond_statContext pre_cond_stat() {
			return getRuleContext(Pre_cond_statContext.class,0);
		}
		public TerminalNode L_BLOCK() { return getToken(JSBachParser.L_BLOCK, 0); }
		public Blck_stmtContext blck_stmt() {
			return getRuleContext(Blck_stmtContext.class,0);
		}
		public TerminalNode R_BLOCK() { return getToken(JSBachParser.R_BLOCK, 0); }
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(IF);
			setState(90);
			pre_cond_stat();
			setState(91);
			match(L_BLOCK);
			setState(92);
			blck_stmt();
			setState(93);
			match(R_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_statContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(JSBachParser.ELSE, 0); }
		public TerminalNode L_BLOCK() { return getToken(JSBachParser.L_BLOCK, 0); }
		public Blck_stmtContext blck_stmt() {
			return getRuleContext(Blck_stmtContext.class,0);
		}
		public TerminalNode R_BLOCK() { return getToken(JSBachParser.R_BLOCK, 0); }
		public Else_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stat; }
	}

	public final Else_statContext else_stat() throws RecognitionException {
		Else_statContext _localctx = new Else_statContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_else_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ELSE);
			setState(96);
			match(L_BLOCK);
			setState(97);
			blck_stmt();
			setState(98);
			match(R_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pre_cond_statContext extends ParserRuleContext {
		public Cond_statContext cond_stat() {
			return getRuleContext(Cond_statContext.class,0);
		}
		public Pre_cond_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_cond_stat; }
	}

	public final Pre_cond_statContext pre_cond_stat() throws RecognitionException {
		Pre_cond_statContext _localctx = new Pre_cond_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pre_cond_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			cond_stat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_statContext extends ParserRuleContext {
		public Cond_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_stat; }
	 
		public Cond_statContext() { }
		public void copyFrom(Cond_statContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryCondContext extends Cond_statContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GEQ() { return getToken(JSBachParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(JSBachParser.LEQ, 0); }
		public TerminalNode NEQ() { return getToken(JSBachParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(JSBachParser.GT, 0); }
		public TerminalNode LT() { return getToken(JSBachParser.LT, 0); }
		public TerminalNode EQ() { return getToken(JSBachParser.EQ, 0); }
		public BinaryCondContext(Cond_statContext ctx) { copyFrom(ctx); }
	}
	public static class ExprCondContext extends Cond_statContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprCondContext(Cond_statContext ctx) { copyFrom(ctx); }
	}
	public static class ParentCondContext extends Cond_statContext {
		public TerminalNode LPAREN() { return getToken(JSBachParser.LPAREN, 0); }
		public Cond_statContext cond_stat() {
			return getRuleContext(Cond_statContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JSBachParser.RPAREN, 0); }
		public ParentCondContext(Cond_statContext ctx) { copyFrom(ctx); }
	}

	public final Cond_statContext cond_stat() throws RecognitionException {
		Cond_statContext _localctx = new Cond_statContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cond_stat);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ParentCondContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(LPAREN);
				setState(103);
				cond_stat();
				setState(104);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new BinaryCondContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				expr(0);
				setState(107);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(108);
				expr(0);
				}
				break;
			case 3:
				_localctx = new ExprCondContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_statContext extends ParserRuleContext {
		public TerminalNode FNC_NAME() { return getToken(JSBachParser.FNC_NAME, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Func_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_stat; }
	}

	public final Func_statContext func_stat() throws RecognitionException {
		Func_statContext _localctx = new Func_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(FNC_NAME);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					expr(0);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assig_statContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JSBachParser.ID, 0); }
		public TerminalNode ASSIG() { return getToken(JSBachParser.ASSIG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assig_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assig_stat; }
	}

	public final Assig_statContext assig_stat() throws RecognitionException {
		Assig_statContext _localctx = new Assig_statContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assig_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(121);
			match(ASSIG);
			setState(122);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_statContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(JSBachParser.READ, 0); }
		public TerminalNode ID() { return getToken(JSBachParser.ID, 0); }
		public Read_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stat; }
	}

	public final Read_statContext read_stat() throws RecognitionException {
		Read_statContext _localctx = new Read_statContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_read_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(READ);
			setState(125);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_statContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(JSBachParser.WRITE, 0); }
		public List<TerminalNode> PHRASE() { return getTokens(JSBachParser.PHRASE); }
		public TerminalNode PHRASE(int i) {
			return getToken(JSBachParser.PHRASE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Write_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stat; }
	}

	public final Write_statContext write_stat() throws RecognitionException {
		Write_statContext _localctx = new Write_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_write_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(WRITE);
			setState(130); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(130);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PHRASE:
						{
						setState(128);
						match(PHRASE);
						}
						break;
					case LPAREN:
					case LIST_LENGTH:
					case NUM:
					case NOTE:
					case ID:
						{
						setState(129);
						expr(0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(132); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Play_statContext extends ParserRuleContext {
		public Play_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_play_stat; }
	 
		public Play_statContext() { }
		public void copyFrom(Play_statContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PlayListContext extends Play_statContext {
		public TerminalNode PLAY() { return getToken(JSBachParser.PLAY, 0); }
		public List_declContext list_decl() {
			return getRuleContext(List_declContext.class,0);
		}
		public PlayListContext(Play_statContext ctx) { copyFrom(ctx); }
	}
	public static class PlayNoteIdContext extends Play_statContext {
		public TerminalNode PLAY() { return getToken(JSBachParser.PLAY, 0); }
		public TerminalNode NOTE() { return getToken(JSBachParser.NOTE, 0); }
		public TerminalNode ID() { return getToken(JSBachParser.ID, 0); }
		public PlayNoteIdContext(Play_statContext ctx) { copyFrom(ctx); }
	}

	public final Play_statContext play_stat() throws RecognitionException {
		Play_statContext _localctx = new Play_statContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_play_stat);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PlayListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(PLAY);
				setState(135);
				list_decl();
				}
				break;
			case 2:
				_localctx = new PlayNoteIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(PLAY);
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==NOTE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_statContext extends ParserRuleContext {
		public List_assigContext list_assig() {
			return getRuleContext(List_assigContext.class,0);
		}
		public List_cutContext list_cut() {
			return getRuleContext(List_cutContext.class,0);
		}
		public List_addContext list_add() {
			return getRuleContext(List_addContext.class,0);
		}
		public List_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_stat; }
	}

	public final List_statContext list_stat() throws RecognitionException {
		List_statContext _localctx = new List_statContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list_stat);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				list_assig();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				list_cut();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				list_add();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_assigContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JSBachParser.ID, 0); }
		public TerminalNode ASSIG() { return getToken(JSBachParser.ASSIG, 0); }
		public List_declContext list_decl() {
			return getRuleContext(List_declContext.class,0);
		}
		public List_assigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_assig; }
	}

	public final List_assigContext list_assig() throws RecognitionException {
		List_assigContext _localctx = new List_assigContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_list_assig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ID);
			setState(146);
			match(ASSIG);
			setState(147);
			list_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_cutContext extends ParserRuleContext {
		public TerminalNode LIST_CUT() { return getToken(JSBachParser.LIST_CUT, 0); }
		public TerminalNode ID() { return getToken(JSBachParser.ID, 0); }
		public TerminalNode LCLAUDATOR() { return getToken(JSBachParser.LCLAUDATOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RCLAUDATOR() { return getToken(JSBachParser.RCLAUDATOR, 0); }
		public List_cutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_cut; }
	}

	public final List_cutContext list_cut() throws RecognitionException {
		List_cutContext _localctx = new List_cutContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_list_cut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(LIST_CUT);
			setState(150);
			match(ID);
			setState(151);
			match(LCLAUDATOR);
			setState(152);
			expr(0);
			setState(153);
			match(RCLAUDATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_addContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JSBachParser.ID, 0); }
		public TerminalNode LIST_ADD() { return getToken(JSBachParser.LIST_ADD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_add; }
	}

	public final List_addContext list_add() throws RecognitionException {
		List_addContext _localctx = new List_addContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_list_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(156);
			match(LIST_ADD);
			setState(157);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_exprContext extends ParserRuleContext {
		public List_declContext list_decl() {
			return getRuleContext(List_declContext.class,0);
		}
		public List_lengthContext list_length() {
			return getRuleContext(List_lengthContext.class,0);
		}
		public List_value_getContext list_value_get() {
			return getRuleContext(List_value_getContext.class,0);
		}
		public List_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_expr; }
	}

	public final List_exprContext list_expr() throws RecognitionException {
		List_exprContext _localctx = new List_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_list_expr);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCORCHET:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				list_decl();
				}
				break;
			case LIST_LENGTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				list_length();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				list_value_get();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_declContext extends ParserRuleContext {
		public TerminalNode LCORCHET() { return getToken(JSBachParser.LCORCHET, 0); }
		public TerminalNode RCORCHET() { return getToken(JSBachParser.RCORCHET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_decl; }
	}

	public final List_declContext list_decl() throws RecognitionException {
		List_declContext _localctx = new List_declContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_list_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(LCORCHET);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LIST_LENGTH) | (1L << NUM) | (1L << NOTE) | (1L << ID))) != 0)) {
				{
				{
				setState(165);
				expr(0);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(RCORCHET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_lengthContext extends ParserRuleContext {
		public TerminalNode LIST_LENGTH() { return getToken(JSBachParser.LIST_LENGTH, 0); }
		public TerminalNode ID() { return getToken(JSBachParser.ID, 0); }
		public List_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_length; }
	}

	public final List_lengthContext list_length() throws RecognitionException {
		List_lengthContext _localctx = new List_lengthContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(LIST_LENGTH);
			setState(174);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_value_getContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JSBachParser.ID, 0); }
		public TerminalNode LCLAUDATOR() { return getToken(JSBachParser.LCLAUDATOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RCLAUDATOR() { return getToken(JSBachParser.RCLAUDATOR, 0); }
		public List_value_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_value_get; }
	}

	public final List_value_getContext list_value_get() throws RecognitionException {
		List_value_getContext _localctx = new List_value_getContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_list_value_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ID);
			setState(177);
			match(LCLAUDATOR);
			setState(178);
			expr(0);
			setState(179);
			match(RCLAUDATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SumSubExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUM() { return getToken(JSBachParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(JSBachParser.SUB, 0); }
		public SumSubExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NoteNumIdContext extends ExprContext {
		public TerminalNode NOTE() { return getToken(JSBachParser.NOTE, 0); }
		public TerminalNode NUM() { return getToken(JSBachParser.NUM, 0); }
		public TerminalNode ID() { return getToken(JSBachParser.ID, 0); }
		public NoteNumIdContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MulDivModExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(JSBachParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JSBachParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(JSBachParser.MOD, 0); }
		public MulDivModExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParentExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(JSBachParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JSBachParser.RPAREN, 0); }
		public ParentExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprSonsContext extends ExprContext {
		public List_lengthContext list_length() {
			return getRuleContext(List_lengthContext.class,0);
		}
		public List_value_getContext list_value_get() {
			return getRuleContext(List_value_getContext.class,0);
		}
		public ExprSonsContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new ParentExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(182);
				match(LPAREN);
				setState(183);
				expr(0);
				setState(184);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ExprSonsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIST_LENGTH:
					{
					setState(186);
					list_length();
					}
					break;
				case ID:
					{
					setState(187);
					list_value_get();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				_localctx = new NoteNumIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << NOTE) | (1L << ID))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(194);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new SumSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(197);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(198);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\2\3\2\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\3\3"+
		"\3\3\4\7\4D\n\4\f\4\16\4G\13\4\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5T\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nr\n\n\3"+
		"\13\3\13\7\13v\n\13\f\13\16\13y\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\6\16\u0085\n\16\r\16\16\16\u0086\3\17\3\17\3\17\3\17\5\17\u008d"+
		"\n\17\3\20\3\20\3\20\5\20\u0092\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00a5\n\24\3\25"+
		"\3\25\7\25\u00a9\n\25\f\25\16\25\u00ac\13\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00bf"+
		"\n\30\3\30\5\30\u00c2\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00ca\n"+
		"\30\f\30\16\30\u00cd\13\30\3\30\2\3.\31\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\2\7\3\2\t\16\4\2$$&&\4\2#$&&\4\2\5\6\b\b\3\2\3\4\2"+
		"\u00d2\2\61\3\2\2\2\4\67\3\2\2\2\6E\3\2\2\2\bS\3\2\2\2\nU\3\2\2\2\f[\3"+
		"\2\2\2\16a\3\2\2\2\20f\3\2\2\2\22q\3\2\2\2\24s\3\2\2\2\26z\3\2\2\2\30"+
		"~\3\2\2\2\32\u0081\3\2\2\2\34\u008c\3\2\2\2\36\u0091\3\2\2\2 \u0093\3"+
		"\2\2\2\"\u0097\3\2\2\2$\u009d\3\2\2\2&\u00a4\3\2\2\2(\u00a6\3\2\2\2*\u00af"+
		"\3\2\2\2,\u00b2\3\2\2\2.\u00c1\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\2\2\3\66"+
		"\3\3\2\2\2\67;\7%\2\28:\7&\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2"+
		"<>\3\2\2\2=;\3\2\2\2>?\7\25\2\2?@\5\6\4\2@A\7\26\2\2A\5\3\2\2\2BD\5\b"+
		"\5\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\7\3\2\2\2GE\3\2\2\2HJ\5"+
		"\f\7\2IK\5\16\b\2JI\3\2\2\2JK\3\2\2\2KT\3\2\2\2LT\5\n\6\2MT\5\24\13\2"+
		"NT\5\26\f\2OT\5\36\20\2PT\5\34\17\2QT\5\30\r\2RT\5\32\16\2SH\3\2\2\2S"+
		"L\3\2\2\2SM\3\2\2\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2"+
		"T\t\3\2\2\2UV\7\27\2\2VW\5\20\t\2WX\7\25\2\2XY\5\6\4\2YZ\7\26\2\2Z\13"+
		"\3\2\2\2[\\\7\30\2\2\\]\5\20\t\2]^\7\25\2\2^_\5\6\4\2_`\7\26\2\2`\r\3"+
		"\2\2\2ab\7\32\2\2bc\7\25\2\2cd\5\6\4\2de\7\26\2\2e\17\3\2\2\2fg\5\22\n"+
		"\2g\21\3\2\2\2hi\7\17\2\2ij\5\22\n\2jk\7\20\2\2kr\3\2\2\2lm\5.\30\2mn"+
		"\t\2\2\2no\5.\30\2or\3\2\2\2pr\5.\30\2qh\3\2\2\2ql\3\2\2\2qp\3\2\2\2r"+
		"\23\3\2\2\2sw\7%\2\2tv\5.\30\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2"+
		"x\25\3\2\2\2yw\3\2\2\2z{\7&\2\2{|\7\35\2\2|}\5.\30\2}\27\3\2\2\2~\177"+
		"\7\34\2\2\177\u0080\7&\2\2\u0080\31\3\2\2\2\u0081\u0084\7\33\2\2\u0082"+
		"\u0085\7\'\2\2\u0083\u0085\5.\30\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\33\3\2\2\2\u0088\u0089\7!\2\2\u0089\u008d\5(\25\2\u008a\u008b\7!\2\2"+
		"\u008b\u008d\t\3\2\2\u008c\u0088\3\2\2\2\u008c\u008a\3\2\2\2\u008d\35"+
		"\3\2\2\2\u008e\u0092\5 \21\2\u008f\u0092\5\"\22\2\u0090\u0092\5$\23\2"+
		"\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\37"+
		"\3\2\2\2\u0093\u0094\7&\2\2\u0094\u0095\7\35\2\2\u0095\u0096\5(\25\2\u0096"+
		"!\3\2\2\2\u0097\u0098\7 \2\2\u0098\u0099\7&\2\2\u0099\u009a\7\21\2\2\u009a"+
		"\u009b\5.\30\2\u009b\u009c\7\22\2\2\u009c#\3\2\2\2\u009d\u009e\7&\2\2"+
		"\u009e\u009f\7\37\2\2\u009f\u00a0\5.\30\2\u00a0%\3\2\2\2\u00a1\u00a5\5"+
		"(\25\2\u00a2\u00a5\5*\26\2\u00a3\u00a5\5,\27\2\u00a4\u00a1\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\'\3\2\2\2\u00a6\u00aa\7\23\2"+
		"\2\u00a7\u00a9\5.\30\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\7\24\2\2\u00ae)\3\2\2\2\u00af\u00b0\7\36\2\2\u00b0\u00b1\7&\2\2"+
		"\u00b1+\3\2\2\2\u00b2\u00b3\7&\2\2\u00b3\u00b4\7\21\2\2\u00b4\u00b5\5"+
		".\30\2\u00b5\u00b6\7\22\2\2\u00b6-\3\2\2\2\u00b7\u00b8\b\30\1\2\u00b8"+
		"\u00b9\7\17\2\2\u00b9\u00ba\5.\30\2\u00ba\u00bb\7\20\2\2\u00bb\u00c2\3"+
		"\2\2\2\u00bc\u00bf\5*\26\2\u00bd\u00bf\5,\27\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00c2\t\4\2\2\u00c1\u00b7\3\2"+
		"\2\2\u00c1\u00be\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00cb\3\2\2\2\u00c3"+
		"\u00c4\f\6\2\2\u00c4\u00c5\t\5\2\2\u00c5\u00ca\5.\30\7\u00c6\u00c7\f\5"+
		"\2\2\u00c7\u00c8\t\6\2\2\u00c8\u00ca\5.\30\6\u00c9\u00c3\3\2\2\2\u00c9"+
		"\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc/\3\2\2\2\u00cd\u00cb\3\2\2\2\23\63;EJSqw\u0084\u0086\u008c"+
		"\u0091\u00a4\u00aa\u00be\u00c1\u00c9\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}