// Generated from LabeledExpr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LabeledExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, ID=8, INT=9, FLOAT=10, 
		NEWLINE=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "MUL", "DIV", "ADD", "SUB", "ID", "INT", "FLOAT", 
			"NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MUL", "DIV", "ADD", "SUB", "ID", "INT", "FLOAT", 
			"NEWLINE", "WS"
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


	public LabeledExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

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
		"\u0004\u0000\f]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007)\b\u0007"+
		"\u000b\u0007\f\u0007*\u0001\b\u0003\b.\b\b\u0001\b\u0004\b1\b\b\u000b"+
		"\b\f\b2\u0001\t\u0003\t6\b\t\u0001\t\u0004\t9\b\t\u000b\t\f\t:\u0001\t"+
		"\u0001\t\u0005\t?\b\t\n\t\f\tB\t\t\u0001\t\u0005\tE\b\t\n\t\f\tH\t\t\u0001"+
		"\t\u0001\t\u0004\tL\b\t\u000b\t\f\tM\u0003\tP\b\t\u0001\n\u0003\nS\b\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0004\u000bX\b\u000b\u000b\u000b\f\u000b"+
		"Y\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0001\u0000\u0004\u0002\u0000AZaz\u0001\u000009\u0001"+
		"\u0000..\u0002\u0000\t\t  g\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003\u001b\u0001"+
		"\u0000\u0000\u0000\u0005\u001d\u0001\u0000\u0000\u0000\u0007\u001f\u0001"+
		"\u0000\u0000\u0000\t!\u0001\u0000\u0000\u0000\u000b#\u0001\u0000\u0000"+
		"\u0000\r%\u0001\u0000\u0000\u0000\u000f(\u0001\u0000\u0000\u0000\u0011"+
		"-\u0001\u0000\u0000\u0000\u00135\u0001\u0000\u0000\u0000\u0015R\u0001"+
		"\u0000\u0000\u0000\u0017W\u0001\u0000\u0000\u0000\u0019\u001a\u0005=\u0000"+
		"\u0000\u001a\u0002\u0001\u0000\u0000\u0000\u001b\u001c\u0005(\u0000\u0000"+
		"\u001c\u0004\u0001\u0000\u0000\u0000\u001d\u001e\u0005)\u0000\u0000\u001e"+
		"\u0006\u0001\u0000\u0000\u0000\u001f \u0005*\u0000\u0000 \b\u0001\u0000"+
		"\u0000\u0000!\"\u0005/\u0000\u0000\"\n\u0001\u0000\u0000\u0000#$\u0005"+
		"+\u0000\u0000$\f\u0001\u0000\u0000\u0000%&\u0005-\u0000\u0000&\u000e\u0001"+
		"\u0000\u0000\u0000\')\u0007\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+\u0010\u0001\u0000\u0000\u0000,.\u0005-\u0000\u0000-,\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000/1\u0007"+
		"\u0001\u0000\u00000/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u0012\u0001\u0000"+
		"\u0000\u000046\u0005-\u0000\u000054\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006O\u0001\u0000\u0000\u000079\u0007\u0001\u0000\u000087\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<@\u0007\u0002\u0000"+
		"\u0000=?\u0007\u0001\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AP\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CE\u0007\u0001\u0000\u0000"+
		"DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000IK\u0007\u0002\u0000\u0000JL\u0007\u0001\u0000\u0000KJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000O8\u0001\u0000\u0000"+
		"\u0000OF\u0001\u0000\u0000\u0000P\u0014\u0001\u0000\u0000\u0000QS\u0005"+
		"\r\u0000\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TU\u0005\n\u0000\u0000U\u0016\u0001\u0000\u0000\u0000"+
		"VX\u0007\u0003\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\\\u0006\u000b\u0000\u0000\\\u0018\u0001\u0000\u0000\u0000"+
		"\f\u0000*-25:@FMORY\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}