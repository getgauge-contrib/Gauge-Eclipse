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
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_SINGLE_NL=4;
    public static final int T__7=7;
    public static final int RULE_LINE_TEXT=6;
    public static final int RULE_MULTI_NL=5;
    public static final int EOF=-1;

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

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:11:6: ( '# ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:11:8: '# '
            {
            match("# "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:12:6: ( '## ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:12:8: '## '
            {
            match("## "); 


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
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:13:6: ( '* ' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:13:8: '* '
            {
            match("* "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "RULE_MULTI_NL"
    public final void mRULE_MULTI_NL() throws RecognitionException {
        try {
            int _type = RULE_MULTI_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:586:15: ( RULE_SINGLE_NL ( RULE_SINGLE_NL )+ )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:586:17: RULE_SINGLE_NL ( RULE_SINGLE_NL )+
            {
            mRULE_SINGLE_NL(); 
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:586:32: ( RULE_SINGLE_NL )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\n'||LA1_0=='\r') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:586:32: RULE_SINGLE_NL
            	    {
            	    mRULE_SINGLE_NL(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTI_NL"

    // $ANTLR start "RULE_SINGLE_NL"
    public final void mRULE_SINGLE_NL() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:588:16: ( ( '\\r' )? '\\n' )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:588:18: ( '\\r' )? '\\n'
            {
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:588:18: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:588:18: '\\r'
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

    // $ANTLR start "RULE_LINE_TEXT"
    public final void mRULE_LINE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_LINE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:590:16: (~ ( ( '#' | '*' | '\\r' | '\\n' ) ) ( options {greedy=false; } : . )* RULE_SINGLE_NL )
            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:590:18: ~ ( ( '#' | '*' | '\\r' | '\\n' ) ) ( options {greedy=false; } : . )* RULE_SINGLE_NL
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:590:41: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\r') ) {
                    alt3=2;
                }
                else if ( (LA3_0=='\n') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:590:69: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "RULE_LINE_TEXT"

    public void mTokens() throws RecognitionException {
        // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:8: ( T__7 | T__8 | T__9 | RULE_MULTI_NL | RULE_SINGLE_NL | RULE_LINE_TEXT )
        int alt4=6;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:25: RULE_MULTI_NL
                {
                mRULE_MULTI_NL(); 

                }
                break;
            case 5 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:39: RULE_SINGLE_NL
                {
                mRULE_SINGLE_NL(); 

                }
                break;
            case 6 :
                // ../io.getgauge.ui/src-gen/io/getgauge/ui/contentassist/antlr/internal/InternalSpec.g:1:54: RULE_LINE_TEXT
                {
                mRULE_LINE_TEXT(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\4\uffff\1\10\5\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\0\1\40\1\uffff\2\12\5\uffff";
    static final String DFA4_maxS =
        "\1\uffff\1\43\1\uffff\1\12\1\15\5\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\3\2\uffff\1\6\1\1\1\2\1\5\1\4";
    static final String DFA4_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA4_transitionS = {
            "\12\5\1\4\2\5\1\3\25\5\1\1\6\5\1\2\uffd5\5",
            "\1\6\2\uffff\1\7",
            "",
            "\1\4",
            "\1\11\2\uffff\1\11",
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
            return "1:1: Tokens : ( T__7 | T__8 | T__9 | RULE_MULTI_NL | RULE_SINGLE_NL | RULE_LINE_TEXT );";
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

                        else if ( (LA4_0=='\r') ) {s = 3;}

                        else if ( (LA4_0=='\n') ) {s = 4;}

                        else if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\"')||(LA4_0>='$' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {s = 5;}

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