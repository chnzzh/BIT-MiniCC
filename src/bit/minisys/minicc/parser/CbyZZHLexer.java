// Generated from CbyZZH.g4 by ANTLR 4.9.2
package bit.minisys.minicc.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CbyZZHLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, AUTO=3, BREAK=4, CASE=5, CHAR=6, CONST=7, CONTINUE=8, 
		DEFAULT=9, DO=10, DOUBLE=11, ELSE=12, ENUM=13, EXTERN=14, FLOAT=15, FOR=16, 
		GOTO=17, IF=18, INLINE=19, INT=20, LONG=21, REGISTER=22, RESTRICT=23, 
		RETURN=24, SHORT=25, SIGNED=26, SIZEOF=27, STATIC=28, STRUCT=29, SWITCH=30, 
		TYPEDEF=31, UNION=32, UNSIGNED=33, VOID=34, VOLATILE=35, WHILE=36, ADD=37, 
		SUB=38, MUL=39, QUO=40, INC=41, DEC=42, ASSIGN=43, ADD_ASSIGN=44, SUB_ASSIGN=45, 
		MUL_ASSIGN=46, QUO_ASSIGN=47, REM_ASSIGN=48, LAND=49, LOR=50, NOT=51, 
		EQL=52, NEQ=53, LSS=54, GTR=55, LEQ=56, GEQ=57, LPAREN=58, LBRACK=59, 
		LBRACE=60, COMMA=61, PERIOD=62, RPAREN=63, RBRACK=64, RBRACE=65, SEMICOLON=66, 
		COLON=67, Identifier=68, IntegerConstant=69, FloatConstant=70, Character=71, 
		String=72, BlockComment=73, LineComment=74, Whitespace=75;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "AUTO", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", 
			"DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTERN", "FLOAT", "FOR", 
			"GOTO", "IF", "INLINE", "INT", "LONG", "REGISTER", "RESTRICT", "RETURN", 
			"SHORT", "SIGNED", "SIZEOF", "STATIC", "STRUCT", "SWITCH", "TYPEDEF", 
			"UNION", "UNSIGNED", "VOID", "VOLATILE", "WHILE", "ADD", "SUB", "MUL", 
			"QUO", "INC", "DEC", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"QUO_ASSIGN", "REM_ASSIGN", "LAND", "LOR", "NOT", "EQL", "NEQ", "LSS", 
			"GTR", "LEQ", "GEQ", "LPAREN", "LBRACK", "LBRACE", "COMMA", "PERIOD", 
			"RPAREN", "RBRACK", "RBRACE", "SEMICOLON", "COLON", "Identifier", "IntegerConstant", 
			"FloatConstant", "Character", "String", "BlockComment", "LineComment", 
			"Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'%'", "'bool'", "'auto'", "'break'", "'case'", "'char'", "'const'", 
			"'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", "'extern'", 
			"'float'", "'for'", "'goto'", "'if'", "'inline'", "'int'", "'long'", 
			"'register'", "'restrict'", "'return'", "'short'", "'signed'", "'sizeof'", 
			"'static'", "'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", 
			"'void'", "'volatile'", "'while'", "'+'", "'-'", "'*'", "'/'", "'++'", 
			"'--'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'&&'", "'||'", 
			"'!'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'('", "'['", "'{'", 
			"','", "'.'", "')'", "']'", "'}'", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "AUTO", "BREAK", "CASE", "CHAR", "CONST", "CONTINUE", 
			"DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTERN", "FLOAT", "FOR", 
			"GOTO", "IF", "INLINE", "INT", "LONG", "REGISTER", "RESTRICT", "RETURN", 
			"SHORT", "SIGNED", "SIZEOF", "STATIC", "STRUCT", "SWITCH", "TYPEDEF", 
			"UNION", "UNSIGNED", "VOID", "VOLATILE", "WHILE", "ADD", "SUB", "MUL", 
			"QUO", "INC", "DEC", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"QUO_ASSIGN", "REM_ASSIGN", "LAND", "LOR", "NOT", "EQL", "NEQ", "LSS", 
			"GTR", "LEQ", "GEQ", "LPAREN", "LBRACK", "LBRACE", "COMMA", "PERIOD", 
			"RPAREN", "RBRACK", "RBRACE", "SEMICOLON", "COLON", "Identifier", "IntegerConstant", 
			"FloatConstant", "Character", "String", "BlockComment", "LineComment", 
			"Whitespace"
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


	public CbyZZHLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CbyZZH.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2M\u0206\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3-\3"+
		".\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		"9\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3"+
		"D\3E\3E\7E\u01c4\nE\fE\16E\u01c7\13E\3F\3F\3F\7F\u01cc\nF\fF\16F\u01cf"+
		"\13F\5F\u01d1\nF\3G\5G\u01d4\nG\3G\3G\3G\3H\3H\5H\u01db\nH\3H\3H\3I\3"+
		"I\6I\u01e1\nI\rI\16I\u01e2\3I\3I\3J\3J\3J\3J\7J\u01eb\nJ\fJ\16J\u01ee"+
		"\13J\3J\3J\3J\3J\3J\3K\3K\3K\3K\7K\u01f9\nK\fK\16K\u01fc\13K\3K\3K\3L"+
		"\6L\u0201\nL\rL\16L\u0202\3L\3L\3\u01ec\2M\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\3\2\n\5\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\3\2))\3\2$$\4"+
		"\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u020e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\3\u0099\3\2\2"+
		"\2\5\u009b\3\2\2\2\7\u00a0\3\2\2\2\t\u00a5\3\2\2\2\13\u00ab\3\2\2\2\r"+
		"\u00b0\3\2\2\2\17\u00b5\3\2\2\2\21\u00bb\3\2\2\2\23\u00c4\3\2\2\2\25\u00cc"+
		"\3\2\2\2\27\u00cf\3\2\2\2\31\u00d6\3\2\2\2\33\u00db\3\2\2\2\35\u00e0\3"+
		"\2\2\2\37\u00e7\3\2\2\2!\u00ed\3\2\2\2#\u00f1\3\2\2\2%\u00f6\3\2\2\2\'"+
		"\u00f9\3\2\2\2)\u0100\3\2\2\2+\u0104\3\2\2\2-\u0109\3\2\2\2/\u0112\3\2"+
		"\2\2\61\u011b\3\2\2\2\63\u0122\3\2\2\2\65\u0128\3\2\2\2\67\u012f\3\2\2"+
		"\29\u0136\3\2\2\2;\u013d\3\2\2\2=\u0144\3\2\2\2?\u014b\3\2\2\2A\u0153"+
		"\3\2\2\2C\u0159\3\2\2\2E\u0162\3\2\2\2G\u0167\3\2\2\2I\u0170\3\2\2\2K"+
		"\u0176\3\2\2\2M\u0178\3\2\2\2O\u017a\3\2\2\2Q\u017c\3\2\2\2S\u017e\3\2"+
		"\2\2U\u0181\3\2\2\2W\u0184\3\2\2\2Y\u0186\3\2\2\2[\u0189\3\2\2\2]\u018c"+
		"\3\2\2\2_\u018f\3\2\2\2a\u0192\3\2\2\2c\u0195\3\2\2\2e\u0198\3\2\2\2g"+
		"\u019b\3\2\2\2i\u019d\3\2\2\2k\u01a0\3\2\2\2m\u01a3\3\2\2\2o\u01a5\3\2"+
		"\2\2q\u01a7\3\2\2\2s\u01aa\3\2\2\2u\u01ad\3\2\2\2w\u01af\3\2\2\2y\u01b1"+
		"\3\2\2\2{\u01b3\3\2\2\2}\u01b5\3\2\2\2\177\u01b7\3\2\2\2\u0081\u01b9\3"+
		"\2\2\2\u0083\u01bb\3\2\2\2\u0085\u01bd\3\2\2\2\u0087\u01bf\3\2\2\2\u0089"+
		"\u01c1\3\2\2\2\u008b\u01d0\3\2\2\2\u008d\u01d3\3\2\2\2\u008f\u01d8\3\2"+
		"\2\2\u0091\u01de\3\2\2\2\u0093\u01e6\3\2\2\2\u0095\u01f4\3\2\2\2\u0097"+
		"\u0200\3\2\2\2\u0099\u009a\7\'\2\2\u009a\4\3\2\2\2\u009b\u009c\7d\2\2"+
		"\u009c\u009d\7q\2\2\u009d\u009e\7q\2\2\u009e\u009f\7n\2\2\u009f\6\3\2"+
		"\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4"+
		"\7q\2\2\u00a4\b\3\2\2\2\u00a5\u00a6\7d\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8"+
		"\7g\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7m\2\2\u00aa\n\3\2\2\2\u00ab\u00ac"+
		"\7e\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2\u00af"+
		"\f\3\2\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7c\2\2\u00b3"+
		"\u00b4\7t\2\2\u00b4\16\3\2\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7v\2\2\u00ba\20\3\2\2\2\u00bb"+
		"\u00bc\7e\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2"+
		"\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3"+
		"\7g\2\2\u00c3\22\3\2\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7"+
		"\7h\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7n\2\2\u00ca"+
		"\u00cb\7v\2\2\u00cb\24\3\2\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce\7q\2\2\u00ce"+
		"\26\3\2\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7w\2\2\u00d2"+
		"\u00d3\7d\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7g\2\2\u00d5\30\3\2\2\2\u00d6"+
		"\u00d7\7g\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7g\2\2"+
		"\u00da\32\3\2\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7"+
		"w\2\2\u00de\u00df\7o\2\2\u00df\34\3\2\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2"+
		"\7z\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7t\2\2\u00e5"+
		"\u00e6\7p\2\2\u00e6\36\3\2\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7n\2\2\u00e9"+
		"\u00ea\7q\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7v\2\2\u00ec \3\2\2\2\u00ed"+
		"\u00ee\7h\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7t\2\2\u00f0\"\3\2\2\2\u00f1"+
		"\u00f2\7i\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7q\2\2"+
		"\u00f5$\3\2\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7h\2\2\u00f8&\3\2\2\2\u00f9"+
		"\u00fa\7k\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7k\2\2"+
		"\u00fd\u00fe\7p\2\2\u00fe\u00ff\7g\2\2\u00ff(\3\2\2\2\u0100\u0101\7k\2"+
		"\2\u0101\u0102\7p\2\2\u0102\u0103\7v\2\2\u0103*\3\2\2\2\u0104\u0105\7"+
		"n\2\2\u0105\u0106\7q\2\2\u0106\u0107\7p\2\2\u0107\u0108\7i\2\2\u0108,"+
		"\3\2\2\2\u0109\u010a\7t\2\2\u010a\u010b\7g\2\2\u010b\u010c\7i\2\2\u010c"+
		"\u010d\7k\2\2\u010d\u010e\7u\2\2\u010e\u010f\7v\2\2\u010f\u0110\7g\2\2"+
		"\u0110\u0111\7t\2\2\u0111.\3\2\2\2\u0112\u0113\7t\2\2\u0113\u0114\7g\2"+
		"\2\u0114\u0115\7u\2\2\u0115\u0116\7v\2\2\u0116\u0117\7t\2\2\u0117\u0118"+
		"\7k\2\2\u0118\u0119\7e\2\2\u0119\u011a\7v\2\2\u011a\60\3\2\2\2\u011b\u011c"+
		"\7t\2\2\u011c\u011d\7g\2\2\u011d\u011e\7v\2\2\u011e\u011f\7w\2\2\u011f"+
		"\u0120\7t\2\2\u0120\u0121\7p\2\2\u0121\62\3\2\2\2\u0122\u0123\7u\2\2\u0123"+
		"\u0124\7j\2\2\u0124\u0125\7q\2\2\u0125\u0126\7t\2\2\u0126\u0127\7v\2\2"+
		"\u0127\64\3\2\2\2\u0128\u0129\7u\2\2\u0129\u012a\7k\2\2\u012a\u012b\7"+
		"i\2\2\u012b\u012c\7p\2\2\u012c\u012d\7g\2\2\u012d\u012e\7f\2\2\u012e\66"+
		"\3\2\2\2\u012f\u0130\7u\2\2\u0130\u0131\7k\2\2\u0131\u0132\7|\2\2\u0132"+
		"\u0133\7g\2\2\u0133\u0134\7q\2\2\u0134\u0135\7h\2\2\u01358\3\2\2\2\u0136"+
		"\u0137\7u\2\2\u0137\u0138\7v\2\2\u0138\u0139\7c\2\2\u0139\u013a\7v\2\2"+
		"\u013a\u013b\7k\2\2\u013b\u013c\7e\2\2\u013c:\3\2\2\2\u013d\u013e\7u\2"+
		"\2\u013e\u013f\7v\2\2\u013f\u0140\7t\2\2\u0140\u0141\7w\2\2\u0141\u0142"+
		"\7e\2\2\u0142\u0143\7v\2\2\u0143<\3\2\2\2\u0144\u0145\7u\2\2\u0145\u0146"+
		"\7y\2\2\u0146\u0147\7k\2\2\u0147\u0148\7v\2\2\u0148\u0149\7e\2\2\u0149"+
		"\u014a\7j\2\2\u014a>\3\2\2\2\u014b\u014c\7v\2\2\u014c\u014d\7{\2\2\u014d"+
		"\u014e\7r\2\2\u014e\u014f\7g\2\2\u014f\u0150\7f\2\2\u0150\u0151\7g\2\2"+
		"\u0151\u0152\7h\2\2\u0152@\3\2\2\2\u0153\u0154\7w\2\2\u0154\u0155\7p\2"+
		"\2\u0155\u0156\7k\2\2\u0156\u0157\7q\2\2\u0157\u0158\7p\2\2\u0158B\3\2"+
		"\2\2\u0159\u015a\7w\2\2\u015a\u015b\7p\2\2\u015b\u015c\7u\2\2\u015c\u015d"+
		"\7k\2\2\u015d\u015e\7i\2\2\u015e\u015f\7p\2\2\u015f\u0160\7g\2\2\u0160"+
		"\u0161\7f\2\2\u0161D\3\2\2\2\u0162\u0163\7x\2\2\u0163\u0164\7q\2\2\u0164"+
		"\u0165\7k\2\2\u0165\u0166\7f\2\2\u0166F\3\2\2\2\u0167\u0168\7x\2\2\u0168"+
		"\u0169\7q\2\2\u0169\u016a\7n\2\2\u016a\u016b\7c\2\2\u016b\u016c\7v\2\2"+
		"\u016c\u016d\7k\2\2\u016d\u016e\7n\2\2\u016e\u016f\7g\2\2\u016fH\3\2\2"+
		"\2\u0170\u0171\7y\2\2\u0171\u0172\7j\2\2\u0172\u0173\7k\2\2\u0173\u0174"+
		"\7n\2\2\u0174\u0175\7g\2\2\u0175J\3\2\2\2\u0176\u0177\7-\2\2\u0177L\3"+
		"\2\2\2\u0178\u0179\7/\2\2\u0179N\3\2\2\2\u017a\u017b\7,\2\2\u017bP\3\2"+
		"\2\2\u017c\u017d\7\61\2\2\u017dR\3\2\2\2\u017e\u017f\7-\2\2\u017f\u0180"+
		"\7-\2\2\u0180T\3\2\2\2\u0181\u0182\7/\2\2\u0182\u0183\7/\2\2\u0183V\3"+
		"\2\2\2\u0184\u0185\7?\2\2\u0185X\3\2\2\2\u0186\u0187\7-\2\2\u0187\u0188"+
		"\7?\2\2\u0188Z\3\2\2\2\u0189\u018a\7/\2\2\u018a\u018b\7?\2\2\u018b\\\3"+
		"\2\2\2\u018c\u018d\7,\2\2\u018d\u018e\7?\2\2\u018e^\3\2\2\2\u018f\u0190"+
		"\7\61\2\2\u0190\u0191\7?\2\2\u0191`\3\2\2\2\u0192\u0193\7\'\2\2\u0193"+
		"\u0194\7?\2\2\u0194b\3\2\2\2\u0195\u0196\7(\2\2\u0196\u0197\7(\2\2\u0197"+
		"d\3\2\2\2\u0198\u0199\7~\2\2\u0199\u019a\7~\2\2\u019af\3\2\2\2\u019b\u019c"+
		"\7#\2\2\u019ch\3\2\2\2\u019d\u019e\7?\2\2\u019e\u019f\7?\2\2\u019fj\3"+
		"\2\2\2\u01a0\u01a1\7#\2\2\u01a1\u01a2\7?\2\2\u01a2l\3\2\2\2\u01a3\u01a4"+
		"\7>\2\2\u01a4n\3\2\2\2\u01a5\u01a6\7@\2\2\u01a6p\3\2\2\2\u01a7\u01a8\7"+
		">\2\2\u01a8\u01a9\7?\2\2\u01a9r\3\2\2\2\u01aa\u01ab\7@\2\2\u01ab\u01ac"+
		"\7?\2\2\u01act\3\2\2\2\u01ad\u01ae\7*\2\2\u01aev\3\2\2\2\u01af\u01b0\7"+
		"]\2\2\u01b0x\3\2\2\2\u01b1\u01b2\7}\2\2\u01b2z\3\2\2\2\u01b3\u01b4\7."+
		"\2\2\u01b4|\3\2\2\2\u01b5\u01b6\7\60\2\2\u01b6~\3\2\2\2\u01b7\u01b8\7"+
		"+\2\2\u01b8\u0080\3\2\2\2\u01b9\u01ba\7_\2\2\u01ba\u0082\3\2\2\2\u01bb"+
		"\u01bc\7\177\2\2\u01bc\u0084\3\2\2\2\u01bd\u01be\7=\2\2\u01be\u0086\3"+
		"\2\2\2\u01bf\u01c0\7<\2\2\u01c0\u0088\3\2\2\2\u01c1\u01c5\t\2\2\2\u01c2"+
		"\u01c4\t\3\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c5\u01c6\3\2\2\2\u01c6\u008a\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8"+
		"\u01d1\7\62\2\2\u01c9\u01cd\t\4\2\2\u01ca\u01cc\t\5\2\2\u01cb\u01ca\3"+
		"\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01c8\3\2\2\2\u01d0\u01c9\3\2"+
		"\2\2\u01d1\u008c\3\2\2\2\u01d2\u01d4\5\u008bF\2\u01d3\u01d2\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\7\60\2\2\u01d6\u01d7\5"+
		"\u008bF\2\u01d7\u008e\3\2\2\2\u01d8\u01da\7)\2\2\u01d9\u01db\n\6\2\2\u01da"+
		"\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\7)"+
		"\2\2\u01dd\u0090\3\2\2\2\u01de\u01e0\7$\2\2\u01df\u01e1\n\7\2\2\u01e0"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2"+
		"\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\7$\2\2\u01e5\u0092\3\2\2\2\u01e6"+
		"\u01e7\7\61\2\2\u01e7\u01e8\7,\2\2\u01e8\u01ec\3\2\2\2\u01e9\u01eb\13"+
		"\2\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\7,"+
		"\2\2\u01f0\u01f1\7\61\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\bJ\2\2\u01f3"+
		"\u0094\3\2\2\2\u01f4\u01f5\7\61\2\2\u01f5\u01f6\7\61\2\2\u01f6\u01fa\3"+
		"\2\2\2\u01f7\u01f9\n\b\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa\3\2"+
		"\2\2\u01fd\u01fe\bK\2\2\u01fe\u0096\3\2\2\2\u01ff\u0201\t\t\2\2\u0200"+
		"\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u0204\3\2\2\2\u0204\u0205\bL\2\2\u0205\u0098\3\2\2\2\f\2\u01c5"+
		"\u01cd\u01d0\u01d3\u01da\u01e2\u01ec\u01fa\u0202\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}