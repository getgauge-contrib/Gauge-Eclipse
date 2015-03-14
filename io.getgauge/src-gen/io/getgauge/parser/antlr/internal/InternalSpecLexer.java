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
    public static final int RULE_DYNAMIC_PARAM_VALUE=8;
    public static final int RULE_STATIC_PARAM=7;
    public static final int RULE_WORD=4;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_SEPARATORS=5;
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:12:7: ( '## ' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:12:9: '## '
            {
            match("## "); 


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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:13:7: ( '* ' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:13:9: '* '
            {
            match("* "); 


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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:14:7: ( '<' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:14:9: '<'
            {
            match('<'); 

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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:15:7: ( 'table' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:15:9: 'table'
            {
            match("table"); 


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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:16:7: ( 'file' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:16:9: 'file'
            {
            match("file"); 


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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:17:7: ( ':' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:17:9: ':'
            {
            match(':'); 

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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:18:7: ( '>' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:18:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:19:7: ( '.' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:19:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "RULE_SINGLE_NL"
    public final void mRULE_SINGLE_NL() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:584:16: ( ( '\\r' )? '\\n' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:584:18: ( '\\r' )? '\\n'
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:584:18: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:584:18: '\\r'
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:586:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:586:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:586:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:588:17: (~ ( ( '\\r' | '\\n' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:588:19: ~ ( ( '\\r' | '\\n' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' ) )
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

    // $ANTLR start "RULE_DYNAMIC_PARAM_VALUE"
    public final void mRULE_DYNAMIC_PARAM_VALUE() throws RecognitionException {
        try {
            int _type = RULE_DYNAMIC_PARAM_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:590:26: ( RULE_WORD ( '.' ( 'txt' | 'csv' ) )? )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:590:28: RULE_WORD ( '.' ( 'txt' | 'csv' ) )?
            {
            mRULE_WORD(); 
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:590:38: ( '.' ( 'txt' | 'csv' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:590:39: '.' ( 'txt' | 'csv' )
                    {
                    match('.'); 
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:590:43: ( 'txt' | 'csv' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='t') ) {
                        alt3=1;
                    }
                    else if ( (LA3_0=='c') ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:590:44: 'txt'
                            {
                            match("txt"); 


                            }
                            break;
                        case 2 :
                            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:590:50: 'csv'
                            {
                            match("csv"); 


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DYNAMIC_PARAM_VALUE"

    // $ANTLR start "RULE_STATIC_PARAM"
    public final void mRULE_STATIC_PARAM() throws RecognitionException {
        try {
            int _type = RULE_STATIC_PARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:592:19: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:592:21: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:592:25: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\"') ) {
                    alt5=2;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:592:53: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
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

    public void mTokens() throws RecognitionException {
        // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_SINGLE_NL | RULE_WORD | RULE_SEPARATORS | RULE_DYNAMIC_PARAM_VALUE | RULE_STATIC_PARAM )
        int alt6=14;
        alt6 = dfa6.predict(input);
        switch (alt6) {
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
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:63: RULE_SINGLE_NL
                {
                mRULE_SINGLE_NL(); 

                }
                break;
            case 11 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:78: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 12 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:88: RULE_SEPARATORS
                {
                mRULE_SEPARATORS(); 

                }
                break;
            case 13 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:104: RULE_DYNAMIC_PARAM_VALUE
                {
                mRULE_DYNAMIC_PARAM_VALUE(); 

                }
                break;
            case 14 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:129: RULE_STATIC_PARAM
                {
                mRULE_STATIC_PARAM(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\2\14\1\uffff\2\23\4\uffff\1\23\1\14\5\uffff\2\23\2\uffff\1\23\4\uffff\3\23\1\37\1\40\2\uffff";
    static final String DFA6_eofS =
        "\41\uffff";
    static final String DFA6_minS =
        "\1\0\2\40\1\uffff\2\56\4\uffff\1\56\1\0\5\uffff\2\56\2\uffff\1\56\4\uffff\5\56\2\uffff";
    static final String DFA6_maxS =
        "\1\uffff\1\43\1\40\1\uffff\2\172\4\uffff\1\172\1\uffff\5\uffff\2\172\2\uffff\1\172\4\uffff\5\172\2\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\4\2\uffff\1\7\1\10\1\11\1\12\2\uffff\1\14\1\1\1\2\1\3\1\4\2\uffff\1\13\1\15\1\uffff\1\7\1\10\1\11\1\16\5\uffff\1\6\1\5";
    static final String DFA6_specialS =
        "\1\0\12\uffff\1\1\25\uffff}>";
    static final String[] DFA6_transitionS = {
            "\12\14\1\11\2\14\1\11\24\14\1\13\1\1\6\14\1\2\3\14\1\10\1\14\12\uffff\1\6\1\14\1\3\1\14\1\7\2\14\32\12\4\14\1\12\1\14\5\12\1\5\15\12\1\4\6\12\uff85\14",
            "\1\15\2\uffff\1\16",
            "\1\17",
            "",
            "\1\24\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\1\21\31\22",
            "\1\24\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\10\22\1\25\21\22",
            "",
            "",
            "",
            "",
            "\1\24\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\0\31",
            "",
            "",
            "",
            "",
            "",
            "\1\24\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\1\22\1\32\30\22",
            "\1\24\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "",
            "",
            "\1\24\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\13\22\1\33\16\22",
            "",
            "",
            "",
            "",
            "\1\24\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\13\22\1\34\16\22",
            "\1\24\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\4\22\1\35\25\22",
            "\1\24\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\4\22\1\36\25\22",
            "\1\24\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
            "\1\24\1\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
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
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_SINGLE_NL | RULE_WORD | RULE_SEPARATORS | RULE_DYNAMIC_PARAM_VALUE | RULE_STATIC_PARAM );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( (LA6_0=='#') ) {s = 1;}

                        else if ( (LA6_0=='*') ) {s = 2;}

                        else if ( (LA6_0=='<') ) {s = 3;}

                        else if ( (LA6_0=='t') ) {s = 4;}

                        else if ( (LA6_0=='f') ) {s = 5;}

                        else if ( (LA6_0==':') ) {s = 6;}

                        else if ( (LA6_0=='>') ) {s = 7;}

                        else if ( (LA6_0=='.') ) {s = 8;}

                        else if ( (LA6_0=='\n'||LA6_0=='\r') ) {s = 9;}

                        else if ( ((LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='e')||(LA6_0>='g' && LA6_0<='s')||(LA6_0>='u' && LA6_0<='z')) ) {s = 10;}

                        else if ( (LA6_0=='\"') ) {s = 11;}

                        else if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='!')||(LA6_0>='$' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='-')||LA6_0=='/'||LA6_0==';'||LA6_0=='='||(LA6_0>='?' && LA6_0<='@')||(LA6_0>='[' && LA6_0<='^')||LA6_0=='`'||(LA6_0>='{' && LA6_0<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_11 = input.LA(1);

                        s = -1;
                        if ( ((LA6_11>='\u0000' && LA6_11<='\uFFFF')) ) {s = 25;}

                        else s = 12;

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