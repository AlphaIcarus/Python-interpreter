// Generated from /home/alpha/Desktop/FIB/LP/LP-Practica/pràctica/JSBach.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSBachLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SUM", "SUB", "MUL", "DIV", "EXP", "MOD", "EQ", "NEQ", "GT", "LT", "GEQ", 
			"LEQ", "LPAREN", "RPAREN", "LCLAUDATOR", "RCLAUDATOR", "LCORCHET", "RCORCHET", 
			"L_BLOCK", "R_BLOCK", "WHILE", "IF", "THEN", "ELSE", "WRITE", "READ", 
			"ASSIG", "LIST_LENGTH", "LIST_ADD", "LIST_CUT", "PLAY", "COMMAS", "NUM", 
			"NOTE", "FNC_NAME", "ID", "PHRASE", "WS", "NL", "COMMENT"
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


	public JSBachLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSBach.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00f0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\6\"\u00ae\n\"\r\"\16"+
		"\"\u00af\3#\3#\3#\3#\5#\u00b6\n#\3#\3#\5#\u00ba\n#\3$\3$\6$\u00be\n$\r"+
		"$\16$\u00bf\3%\3%\7%\u00c4\n%\f%\16%\u00c7\13%\3&\3&\7&\u00cb\n&\f&\16"+
		"&\u00ce\13&\3&\3&\3\'\6\'\u00d3\n\'\r\'\16\'\u00d4\3\'\3\'\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u00e6\n)\f)\16)\u00e9\13)\3)\3)\3)\3)"+
		"\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\t\4\2C\\\u0082\u0101\6\2C\\aa"+
		"c|\u0082\u0101\4\2c|\u0082\u0101\5\2\13\f\17\17$$\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\5\2\f\f\17\17,,\2\u00fb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13"+
		"[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27"+
		"h\3\2\2\2\31k\3\2\2\2\33n\3\2\2\2\35p\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#v"+
		"\3\2\2\2%x\3\2\2\2\'z\3\2\2\2)}\3\2\2\2+\u0080\3\2\2\2-\u0086\3\2\2\2"+
		"/\u0089\3\2\2\2\61\u008e\3\2\2\2\63\u0093\3\2\2\2\65\u0097\3\2\2\2\67"+
		"\u009b\3\2\2\29\u009e\3\2\2\2;\u00a0\3\2\2\2=\u00a3\3\2\2\2?\u00a6\3\2"+
		"\2\2A\u00aa\3\2\2\2C\u00ad\3\2\2\2E\u00b9\3\2\2\2G\u00bb\3\2\2\2I\u00c1"+
		"\3\2\2\2K\u00c8\3\2\2\2M\u00d2\3\2\2\2O\u00d8\3\2\2\2Q\u00db\3\2\2\2S"+
		"T\7-\2\2T\4\3\2\2\2UV\7/\2\2V\6\3\2\2\2WX\7,\2\2X\b\3\2\2\2YZ\7\61\2\2"+
		"Z\n\3\2\2\2[\\\7`\2\2\\\f\3\2\2\2]^\7\'\2\2^\16\3\2\2\2_`\7?\2\2`\20\3"+
		"\2\2\2ab\7\61\2\2bc\7?\2\2c\22\3\2\2\2de\7@\2\2e\24\3\2\2\2fg\7>\2\2g"+
		"\26\3\2\2\2hi\7@\2\2ij\7?\2\2j\30\3\2\2\2kl\7>\2\2lm\7?\2\2m\32\3\2\2"+
		"\2no\7*\2\2o\34\3\2\2\2pq\7+\2\2q\36\3\2\2\2rs\7]\2\2s \3\2\2\2tu\7_\2"+
		"\2u\"\3\2\2\2vw\7}\2\2w$\3\2\2\2xy\7\177\2\2y&\3\2\2\2z{\7~\2\2{|\7<\2"+
		"\2|(\3\2\2\2}~\7<\2\2~\177\7~\2\2\177*\3\2\2\2\u0080\u0081\7y\2\2\u0081"+
		"\u0082\7j\2\2\u0082\u0083\7k\2\2\u0083\u0084\7n\2\2\u0084\u0085\7g\2\2"+
		"\u0085,\3\2\2\2\u0086\u0087\7k\2\2\u0087\u0088\7h\2\2\u0088.\3\2\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7j\2\2\u008b\u008c\7g\2\2\u008c\u008d\7p\2\2"+
		"\u008d\60\3\2\2\2\u008e\u008f\7g\2\2\u008f\u0090\7n\2\2\u0090\u0091\7"+
		"u\2\2\u0091\u0092\7g\2\2\u0092\62\3\2\2\2\u0093\u0094\7>\2\2\u0094\u0095"+
		"\7#\2\2\u0095\u0096\7@\2\2\u0096\64\3\2\2\2\u0097\u0098\7>\2\2\u0098\u0099"+
		"\7A\2\2\u0099\u009a\7@\2\2\u009a\66\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d"+
		"\7/\2\2\u009d8\3\2\2\2\u009e\u009f\7%\2\2\u009f:\3\2\2\2\u00a0\u00a1\7"+
		">\2\2\u00a1\u00a2\7>\2\2\u00a2<\3\2\2\2\u00a3\u00a4\7:\2\2\u00a4\u00a5"+
		"\7>\2\2\u00a5>\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8\7<\2\2\u00a8\u00a9"+
		"\7@\2\2\u00a9@\3\2\2\2\u00aa\u00ab\7$\2\2\u00abB\3\2\2\2\u00ac\u00ae\4"+
		"\62;\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0D\3\2\2\2\u00b1\u00b2\4CD\2\u00b2\u00ba\7\62\2\2\u00b3"+
		"\u00b5\4CI\2\u00b4\u00b6\4\639\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2"+
		"\2\u00b6\u00ba\3\2\2\2\u00b7\u00b8\7E\2\2\u00b8\u00ba\7:\2\2\u00b9\u00b1"+
		"\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b7\3\2\2\2\u00baF\3\2\2\2\u00bb"+
		"\u00bd\t\2\2\2\u00bc\u00be\t\3\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0H\3\2\2\2\u00c1\u00c5"+
		"\t\4\2\2\u00c2\u00c4\t\3\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6J\3\2\2\2\u00c7\u00c5\3\2\2\2"+
		"\u00c8\u00cc\7$\2\2\u00c9\u00cb\n\5\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d0\7$\2\2\u00d0L\3\2\2\2\u00d1\u00d3\t\6\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\'\2\2\u00d7N\3\2\2\2\u00d8\u00d9"+
		"\7\17\2\2\u00d9\u00da\7\f\2\2\u00daP\3\2\2\2\u00db\u00dc\7\u0080\2\2\u00dc"+
		"\u00dd\7\u0080\2\2\u00dd\u00de\7\u0080\2\2\u00de\u00e7\3\2\2\2\u00df\u00e0"+
		"\7,\2\2\u00e0\u00e6\5O(\2\u00e1\u00e2\7,\2\2\u00e2\u00e6\n\7\2\2\u00e3"+
		"\u00e6\5O(\2\u00e4\u00e6\n\b\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e1\3\2\2"+
		"\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00eb\7\u0080\2\2\u00eb\u00ec\7\u0080\2\2\u00ec\u00ed\7\u0080\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\b)\2\2\u00efR\3\2\2\2\16\2\u00af\u00b5\u00b9"+
		"\u00bd\u00bf\u00c3\u00c5\u00cc\u00d4\u00e5\u00e7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}