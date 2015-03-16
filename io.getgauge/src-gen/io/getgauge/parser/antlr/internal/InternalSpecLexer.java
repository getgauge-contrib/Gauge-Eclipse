package io.getgauge.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecLexer extends Lexer {
    public static final int T__9=9;
    public static final int RULE_SINGLE_NL=6;
    public static final int RULE_STATIC_PARAM=7;
    public static final int RULE_WORD=4;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;
    public static final int RULE_SEPARATORS=5;
    public static final int RULE_DYNAMIC_PARAM=8;
    public static final int T__10=10;

    // delegates
    // delegators

    public InternalSpecLexer() {;} 
    public InternalSpecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSpecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:11:6: ( '# ' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:11:8: '# '
            {
            match("# "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:12:7: ( '=' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:13:7: ( '## ' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:13:9: '## '
            {
            match("## "); 


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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:14:7: ( '-' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:14:9: '-'
            {
            match('-'); 

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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:15:7: ( '* ' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:15:9: '* '
            {
            match("* "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "RULE_SINGLE_NL"
    public final void mRULE_SINGLE_NL() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:728:16: ( ( '\\r' )? '\\n' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:728:18: ( '\\r' )? '\\n'
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:728:18: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:728:18: '\\r'
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:730:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:730:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:730:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:
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

    // $ANTLR start "RULE_SEPARATORS"
    public final void mRULE_SEPARATORS() throws RecognitionException {
        try {
            int _type = RULE_SEPARATORS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:732:17: (~ ( ( '\\r' | '\\n' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:732:19: ~ ( ( '\\r' | '\\n' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' ) )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='@')||(input.LA(1)>='[' && input.LA(1)<='^')||input.LA(1)=='`'||(input.LA(1)>='{' && input.LA(1)<='\uFFFF') ) {
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

    // $ANTLR start "RULE_STATIC_PARAM"
    public final void mRULE_STATIC_PARAM() throws RecognitionException {
        try {
            int _type = RULE_STATIC_PARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:734:19: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:734:21: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:734:25: ( options {greedy=false; } : . )*
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
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:734:53: .
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:736:20: ( '<' ( options {greedy=false; } : . )* '>' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:736:22: '<' ( options {greedy=false; } : . )* '>'
            {
            match('<'); 
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:736:26: ( options {greedy=false; } : . )*
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
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:736:54: .
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

    public void mTokens() throws RecognitionException {
        // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | RULE_SINGLE_NL | RULE_WORD | RULE_SEPARATORS | RULE_STATIC_PARAM | RULE_DYNAMIC_PARAM )
        int alt5=10;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:39: RULE_SINGLE_NL
                {
                mRULE_SINGLE_NL(); 

                }
                break;
            case 7 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:54: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 8 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:64: RULE_SEPARATORS
                {
                mRULE_SEPARATORS(); 

                }
                break;
            case 9 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:80: RULE_STATIC_PARAM
                {
                mRULE_STATIC_PARAM(); 

                }
                break;
            case 10 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:98: RULE_DYNAMIC_PARAM
                {
                mRULE_DYNAMIC_PARAM(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\1\11\2\uffff\1\11\2\uffff\2\11\10\uffff";
    static final String DFA5_eofS =
        "\21\uffff";
    static final String DFA5_minS =
        "\1\0\1\40\2\uffff\1\40\2\uffff\2\0\10\uffff";
    static final String DFA5_maxS =
        "\1\uffff\1\43\2\uffff\1\40\2\uffff\2\uffff\10\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\4\1\uffff\1\6\1\7\2\uffff\1\10\1\1\1\3\1\2\1\4\1\5\1\11\1\12";
    static final String DFA5_specialS =
        "\1\0\6\uffff\1\1\1\2\10\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\11\1\5\2\11\1\5\24\11\1\7\1\1\6\11\1\4\2\11\1\3\2\11\12\uffff\2\11\1\10\1\2\3\11\32\6\4\11\1\6\1\11\32\6\uff85\11",
            "\1\12\2\uffff\1\13",
            "",
            "",
            "\1\16",
            "",
            "",
            "\0\17",
            "\0\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | RULE_SINGLE_NL | RULE_WORD | RULE_SEPARATORS | RULE_STATIC_PARAM | RULE_DYNAMIC_PARAM );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='#') ) {s = 1;}

                        else if ( (LA5_0=='=') ) {s = 2;}

                        else if ( (LA5_0=='-') ) {s = 3;}

                        else if ( (LA5_0=='*') ) {s = 4;}

                        else if ( (LA5_0=='\n'||LA5_0=='\r') ) {s = 5;}

                        else if ( ((LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {s = 6;}

                        else if ( (LA5_0=='\"') ) {s = 7;}

                        else if ( (LA5_0=='<') ) {s = 8;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='!')||(LA5_0>='$' && LA5_0<=')')||(LA5_0>='+' && LA5_0<=',')||(LA5_0>='.' && LA5_0<='/')||(LA5_0>=':' && LA5_0<=';')||(LA5_0>='>' && LA5_0<='@')||(LA5_0>='[' && LA5_0<='^')||LA5_0=='`'||(LA5_0>='{' && LA5_0<='\uFFFF')) ) {s = 9;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_7 = input.LA(1);

                        s = -1;
                        if ( ((LA5_7>='\u0000' && LA5_7<='\uFFFF')) ) {s = 15;}

                        else s = 9;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_8 = input.LA(1);

                        s = -1;
                        if ( ((LA5_8>='\u0000' && LA5_8<='\uFFFF')) ) {s = 16;}

                        else s = 9;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}