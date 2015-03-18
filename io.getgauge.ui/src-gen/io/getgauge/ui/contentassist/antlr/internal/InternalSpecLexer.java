package io.getgauge.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecLexer extends Lexer {
    public static final int RULE_TABLE_ROW_END=10;
    public static final int RULE_SINGLE_NL=9;
    public static final int RULE_WS=5;
    public static final int RULE_STATIC_PARAM=7;
    public static final int RULE_WORD=4;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_SEPARATORS=6;
    public static final int RULE_DYNAMIC_PARAM=8;

    // delegates
    // delegators

    public InternalSpecLexer() {;} 
    public InternalSpecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSpecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:11:7: ( '-' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:11:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:12:7: ( '=' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:13:7: ( '|' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:13:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:14:7: ( '# ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:14:9: '# '
            {
            match("# "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:15:7: ( '## ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:15:9: '## '
            {
            match("## "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:16:7: ( '* ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:16:9: '* '
            {
            match("* "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "RULE_SINGLE_NL"
    public final void mRULE_SINGLE_NL() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2236:16: ( ( '\\r' )? '\\n' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2236:18: ( '\\r' )? '\\n'
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2236:18: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2236:18: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGLE_NL"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2238:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2238:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2238:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_STATIC_PARAM"
    public final void mRULE_STATIC_PARAM() throws RecognitionException {
        try {
            int _type = RULE_STATIC_PARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2240:19: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2240:21: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2240:25: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\"') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2240:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATIC_PARAM"

    // $ANTLR start "RULE_DYNAMIC_PARAM"
    public final void mRULE_DYNAMIC_PARAM() throws RecognitionException {
        try {
            int _type = RULE_DYNAMIC_PARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2242:20: ( '<' ( options {greedy=false; } : . )* '>' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2242:22: '<' ( options {greedy=false; } : . )* '>'
            {
            match('<'); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2242:26: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='>') ) {
                    alt4=2;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='=')||(LA4_0>='?' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2242:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DYNAMIC_PARAM"

    // $ANTLR start "RULE_TABLE_ROW_END"
    public final void mRULE_TABLE_ROW_END() throws RecognitionException {
        try {
            int _type = RULE_TABLE_ROW_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2244:20: ( '|' ( RULE_WS )* RULE_SINGLE_NL )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2244:22: '|' ( RULE_WS )* RULE_SINGLE_NL
            {
            match('|'); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2244:26: ( RULE_WS )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2244:26: RULE_WS
            	    {
            	    mRULE_WS(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            mRULE_SINGLE_NL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TABLE_ROW_END"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2246:9: ( ( ' ' | '\\t' ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2246:11: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_SEPARATORS"
    public final void mRULE_SEPARATORS() throws RecognitionException {
        try {
            int _type = RULE_SEPARATORS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2248:17: (~ ( ( '\\r' | '\\n' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ' ' | '\\t' ) ) )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:2248:19: ~ ( ( '\\r' | '\\n' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | ' ' | '\\t' ) )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='@')||(input.LA(1)>='[' && input.LA(1)<='^')||input.LA(1)=='`'||(input.LA(1)>='{' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEPARATORS"

    public void mTokens() throws RecognitionException {
        // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | RULE_SINGLE_NL | RULE_WORD | RULE_STATIC_PARAM | RULE_DYNAMIC_PARAM | RULE_TABLE_ROW_END | RULE_WS | RULE_SEPARATORS )
        int alt6=13;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:46: RULE_SINGLE_NL
                {
                mRULE_SINGLE_NL(); 

                }
                break;
            case 8 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:61: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 9 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:71: RULE_STATIC_PARAM
                {
                mRULE_STATIC_PARAM(); 

                }
                break;
            case 10 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:89: RULE_DYNAMIC_PARAM
                {
                mRULE_DYNAMIC_PARAM(); 

                }
                break;
            case 11 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:108: RULE_TABLE_ROW_END
                {
                mRULE_TABLE_ROW_END(); 

                }
                break;
            case 12 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:127: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:135: RULE_SEPARATORS
                {
                mRULE_SEPARATORS(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\3\uffff\1\17\2\13\2\uffff\2\13\13\uffff";
    static final String DFA6_eofS =
        "\25\uffff";
    static final String DFA6_minS =
        "\1\0\2\uffff\1\11\2\40\2\uffff\2\0\13\uffff";
    static final String DFA6_maxS =
        "\1\uffff\2\uffff\1\40\1\43\1\40\2\uffff\2\uffff\13\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\7\1\10\2\uffff\1\14\1\15\1\1\1\2\1\13\1\3\1\4\1\5\1\6\1\11\1\12";
    static final String DFA6_specialS =
        "\1\0\7\uffff\1\1\1\2\13\uffff}>";
    static final String[] DFA6_transitionS = {
            "\11\13\1\12\1\6\2\13\1\6\22\13\1\12\1\13\1\10\1\4\6\13\1\5\2\13\1\1\2\13\12\uffff\2\13\1\11\1\2\3\13\32\7\4\13\1\7\1\13\32\7\1\13\1\3\uff83\13",
            "",
            "",
            "\2\16\2\uffff\1\16\22\uffff\1\16",
            "\1\20\2\uffff\1\21",
            "\1\22",
            "",
            "",
            "\0\23",
            "\0\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | RULE_SINGLE_NL | RULE_WORD | RULE_STATIC_PARAM | RULE_DYNAMIC_PARAM | RULE_TABLE_ROW_END | RULE_WS | RULE_SEPARATORS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( (LA6_0=='-') ) {s = 1;}

                        else if ( (LA6_0=='=') ) {s = 2;}

                        else if ( (LA6_0=='|') ) {s = 3;}

                        else if ( (LA6_0=='#') ) {s = 4;}

                        else if ( (LA6_0=='*') ) {s = 5;}

                        else if ( (LA6_0=='\n'||LA6_0=='\r') ) {s = 6;}

                        else if ( ((LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {s = 7;}

                        else if ( (LA6_0=='\"') ) {s = 8;}

                        else if ( (LA6_0=='<') ) {s = 9;}

                        else if ( (LA6_0=='\t'||LA6_0==' ') ) {s = 10;}

                        else if ( ((LA6_0>='\u0000' && LA6_0<='\b')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\u001F')||LA6_0=='!'||(LA6_0>='$' && LA6_0<=')')||(LA6_0>='+' && LA6_0<=',')||(LA6_0>='.' && LA6_0<='/')||(LA6_0>=':' && LA6_0<=';')||(LA6_0>='>' && LA6_0<='@')||(LA6_0>='[' && LA6_0<='^')||LA6_0=='`'||LA6_0=='{'||(LA6_0>='}' && LA6_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_8 = input.LA(1);

                        s = -1;
                        if ( ((LA6_8>='\u0000' && LA6_8<='\uFFFF')) ) {s = 19;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_9 = input.LA(1);

                        s = -1;
                        if ( ((LA6_9>='\u0000' && LA6_9<='\uFFFF')) ) {s = 20;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}