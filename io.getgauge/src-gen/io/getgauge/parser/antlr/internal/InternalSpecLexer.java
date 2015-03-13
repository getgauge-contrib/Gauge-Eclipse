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
    public static final int T__8=8;
    public static final int RULE_SINGLE_NL=6;
    public static final int RULE_STATIC_PARAM=7;
    public static final int RULE_WORD=4;
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

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
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
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:12:6: ( '## ' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:12:8: '## '
            {
            match("## "); 


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
    // $ANTLR end "T__10"

    // $ANTLR start "RULE_SINGLE_NL"
    public final void mRULE_SINGLE_NL() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:472:16: ( ( '\\r' )? '\\n' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:472:18: ( '\\r' )? '\\n'
            {
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:472:18: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:472:18: '\\r'
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:474:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:474:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:474:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:476:17: (~ ( ( '\\r' | '\\n' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' ) ) )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:476:19: ~ ( ( '\\r' | '\\n' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' ) )
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
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:478:19: ( '\"' ( options {greedy=false; } : . )* '\"' )
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:478:21: '\"' ( options {greedy=false; } : . )* '\"'
            {
            match('\"'); 
            // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:478:25: ( options {greedy=false; } : . )*
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
            	    // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:478:53: .
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

    public void mTokens() throws RecognitionException {
        // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:8: ( T__8 | T__9 | T__10 | RULE_SINGLE_NL | RULE_WORD | RULE_SEPARATORS | RULE_STATIC_PARAM )
        int alt4=7;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:26: RULE_SINGLE_NL
                {
                mRULE_SINGLE_NL(); 

                }
                break;
            case 5 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:41: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 6 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:51: RULE_SEPARATORS
                {
                mRULE_SEPARATORS(); 

                }
                break;
            case 7 :
                // ../io.getgauge/src-gen/io/getgauge/parser/antlr/internal/InternalSpec.g:1:67: RULE_STATIC_PARAM
                {
                mRULE_STATIC_PARAM(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\2\6\2\uffff\1\6\5\uffff";
    static final String DFA4_eofS =
        "\13\uffff";
    static final String DFA4_minS =
        "\1\0\2\40\2\uffff\1\0\5\uffff";
    static final String DFA4_maxS =
        "\1\uffff\1\43\1\40\2\uffff\1\uffff\5\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\4\1\5\1\uffff\1\6\1\1\1\2\1\3\1\7";
    static final String DFA4_specialS =
        "\1\0\4\uffff\1\1\5\uffff}>";
    static final String[] DFA4_transitionS = {
            "\12\6\1\3\2\6\1\3\24\6\1\5\1\1\6\6\1\2\5\6\12\uffff\7\6\32\4\4\6\1\4\1\6\32\4\uff85\6",
            "\1\7\2\uffff\1\10",
            "\1\11",
            "",
            "",
            "\0\12",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | RULE_SINGLE_NL | RULE_WORD | RULE_SEPARATORS | RULE_STATIC_PARAM );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_0 = input.LA(1);

                        s = -1;
                        if ( (LA4_0=='#') ) {s = 1;}

                        else if ( (LA4_0=='*') ) {s = 2;}

                        else if ( (LA4_0=='\n'||LA4_0=='\r') ) {s = 3;}

                        else if ( ((LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {s = 4;}

                        else if ( (LA4_0=='\"') ) {s = 5;}

                        else if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='!')||(LA4_0>='$' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='/')||(LA4_0>=':' && LA4_0<='@')||(LA4_0>='[' && LA4_0<='^')||LA4_0=='`'||(LA4_0>='{' && LA4_0<='\uFFFF')) ) {s = 6;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_5 = input.LA(1);

                        s = -1;
                        if ( ((LA4_5>='\u0000' && LA4_5<='\uFFFF')) ) {s = 10;}

                        else s = 6;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}