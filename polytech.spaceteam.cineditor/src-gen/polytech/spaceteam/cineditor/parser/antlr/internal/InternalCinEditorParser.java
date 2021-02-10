package polytech.spaceteam.cineditor.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import polytech.spaceteam.cineditor.services.CinEditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCinEditorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Movie'", "'Layer'", "'position'", "'('", "','", "')'", "'dimension'", "'x'", "'color'", "'-'", "'Text'", "'->'", "'fontSize'", "'at'", "'during'", "'Picture'", "'\"'", "'Video'", "'from'", "'Rectangle'", "'Effect'", "'FadeIn'", "'on'", "'FadeOut'", "'Translate'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCinEditorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCinEditorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCinEditorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCinEditor.g"; }



     	private CinEditorGrammarAccess grammarAccess;

        public InternalCinEditorParser(TokenStream input, CinEditorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Movie";
       	}

       	@Override
       	protected CinEditorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMovie"
    // InternalCinEditor.g:64:1: entryRuleMovie returns [EObject current=null] : iv_ruleMovie= ruleMovie EOF ;
    public final EObject entryRuleMovie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovie = null;


        try {
            // InternalCinEditor.g:64:46: (iv_ruleMovie= ruleMovie EOF )
            // InternalCinEditor.g:65:2: iv_ruleMovie= ruleMovie EOF
            {
             newCompositeNode(grammarAccess.getMovieRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovie=ruleMovie();

            state._fsp--;

             current =iv_ruleMovie; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMovie"


    // $ANTLR start "ruleMovie"
    // InternalCinEditor.g:71:1: ruleMovie returns [EObject current=null] : (otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) ( (lv_layers_3_0= ruleLayer ) )+ ) ;
    public final EObject ruleMovie() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dimension_2_0 = null;

        EObject lv_layers_3_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:77:2: ( (otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) ( (lv_layers_3_0= ruleLayer ) )+ ) )
            // InternalCinEditor.g:78:2: (otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) ( (lv_layers_3_0= ruleLayer ) )+ )
            {
            // InternalCinEditor.g:78:2: (otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) ( (lv_layers_3_0= ruleLayer ) )+ )
            // InternalCinEditor.g:79:3: otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) ( (lv_layers_3_0= ruleLayer ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMovieAccess().getMovieKeyword_0());
            		
            // InternalCinEditor.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:84:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMovieAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMovieRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCinEditor.g:102:3: ( (lv_dimension_2_0= ruleDimension ) )
            // InternalCinEditor.g:103:4: (lv_dimension_2_0= ruleDimension )
            {
            // InternalCinEditor.g:103:4: (lv_dimension_2_0= ruleDimension )
            // InternalCinEditor.g:104:5: lv_dimension_2_0= ruleDimension
            {

            					newCompositeNode(grammarAccess.getMovieAccess().getDimensionDimensionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_dimension_2_0=ruleDimension();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMovieRule());
            					}
            					set(
            						current,
            						"dimension",
            						lv_dimension_2_0,
            						"polytech.spaceteam.cineditor.CinEditor.Dimension");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCinEditor.g:121:3: ( (lv_layers_3_0= ruleLayer ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCinEditor.g:122:4: (lv_layers_3_0= ruleLayer )
            	    {
            	    // InternalCinEditor.g:122:4: (lv_layers_3_0= ruleLayer )
            	    // InternalCinEditor.g:123:5: lv_layers_3_0= ruleLayer
            	    {

            	    					newCompositeNode(grammarAccess.getMovieAccess().getLayersLayerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_layers_3_0=ruleLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMovieRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layers",
            	    						lv_layers_3_0,
            	    						"polytech.spaceteam.cineditor.CinEditor.Layer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMovie"


    // $ANTLR start "entryRuleElement"
    // InternalCinEditor.g:144:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalCinEditor.g:144:48: (iv_ruleElement= ruleElement EOF )
            // InternalCinEditor.g:145:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalCinEditor.g:151:1: ruleElement returns [EObject current=null] : (this_Text_0= ruleText | this_Picture_1= rulePicture | this_Video_2= ruleVideo | this_FadeIn_3= ruleFadeIn | this_FadeOut_4= ruleFadeOut | this_Translate_5= ruleTranslate | this_Rectangle_6= ruleRectangle ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_Picture_1 = null;

        EObject this_Video_2 = null;

        EObject this_FadeIn_3 = null;

        EObject this_FadeOut_4 = null;

        EObject this_Translate_5 = null;

        EObject this_Rectangle_6 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:157:2: ( (this_Text_0= ruleText | this_Picture_1= rulePicture | this_Video_2= ruleVideo | this_FadeIn_3= ruleFadeIn | this_FadeOut_4= ruleFadeOut | this_Translate_5= ruleTranslate | this_Rectangle_6= ruleRectangle ) )
            // InternalCinEditor.g:158:2: (this_Text_0= ruleText | this_Picture_1= rulePicture | this_Video_2= ruleVideo | this_FadeIn_3= ruleFadeIn | this_FadeOut_4= ruleFadeOut | this_Translate_5= ruleTranslate | this_Rectangle_6= ruleRectangle )
            {
            // InternalCinEditor.g:158:2: (this_Text_0= ruleText | this_Picture_1= rulePicture | this_Video_2= ruleVideo | this_FadeIn_3= ruleFadeIn | this_FadeOut_4= ruleFadeOut | this_Translate_5= ruleTranslate | this_Rectangle_6= ruleRectangle )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalCinEditor.g:159:3: this_Text_0= ruleText
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTextParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_0=ruleText();

                    state._fsp--;


                    			current = this_Text_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:168:3: this_Picture_1= rulePicture
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getPictureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Picture_1=rulePicture();

                    state._fsp--;


                    			current = this_Picture_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCinEditor.g:177:3: this_Video_2= ruleVideo
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getVideoParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Video_2=ruleVideo();

                    state._fsp--;


                    			current = this_Video_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCinEditor.g:186:3: this_FadeIn_3= ruleFadeIn
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFadeInParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FadeIn_3=ruleFadeIn();

                    state._fsp--;


                    			current = this_FadeIn_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCinEditor.g:195:3: this_FadeOut_4= ruleFadeOut
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFadeOutParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FadeOut_4=ruleFadeOut();

                    state._fsp--;


                    			current = this_FadeOut_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCinEditor.g:204:3: this_Translate_5= ruleTranslate
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTranslateParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Translate_5=ruleTranslate();

                    state._fsp--;


                    			current = this_Translate_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalCinEditor.g:213:3: this_Rectangle_6= ruleRectangle
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getRectangleParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rectangle_6=ruleRectangle();

                    state._fsp--;


                    			current = this_Rectangle_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleLayer"
    // InternalCinEditor.g:225:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalCinEditor.g:225:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalCinEditor.g:226:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalCinEditor.g:232:1: ruleLayer returns [EObject current=null] : ( () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+ ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:238:2: ( ( () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+ ) )
            // InternalCinEditor.g:239:2: ( () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+ )
            {
            // InternalCinEditor.g:239:2: ( () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+ )
            // InternalCinEditor.g:240:3: () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+
            {
            // InternalCinEditor.g:240:3: ()
            // InternalCinEditor.g:241:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLayerAccess().getLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLayerAccess().getLayerKeyword_1());
            		
            // InternalCinEditor.g:251:3: ( (lv_elements_2_0= ruleElement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21||LA3_0==26||LA3_0==28||(LA3_0>=30 && LA3_0<=31)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCinEditor.g:252:4: (lv_elements_2_0= ruleElement )
            	    {
            	    // InternalCinEditor.g:252:4: (lv_elements_2_0= ruleElement )
            	    // InternalCinEditor.g:253:5: lv_elements_2_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getLayerAccess().getElementsElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_elements_2_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"polytech.spaceteam.cineditor.CinEditor.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleEString"
    // InternalCinEditor.g:274:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCinEditor.g:274:47: (iv_ruleEString= ruleEString EOF )
            // InternalCinEditor.g:275:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCinEditor.g:281:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCinEditor.g:287:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCinEditor.g:288:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCinEditor.g:288:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCinEditor.g:289:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:297:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePosition"
    // InternalCinEditor.g:308:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalCinEditor.g:308:49: (iv_rulePosition= rulePosition EOF )
            // InternalCinEditor.g:309:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalCinEditor.g:315:1: rulePosition returns [EObject current=null] : (otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_y_4_0= ruleEInt ) ) otherlv_5= ')' ) ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_x_2_0 = null;

        AntlrDatatypeRuleToken lv_y_4_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:321:2: ( (otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_y_4_0= ruleEInt ) ) otherlv_5= ')' ) ) )
            // InternalCinEditor.g:322:2: (otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_y_4_0= ruleEInt ) ) otherlv_5= ')' ) )
            {
            // InternalCinEditor.g:322:2: (otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_y_4_0= ruleEInt ) ) otherlv_5= ')' ) )
            // InternalCinEditor.g:323:3: otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_y_4_0= ruleEInt ) ) otherlv_5= ')' )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getPositionKeyword_0());
            		
            // InternalCinEditor.g:327:3: (otherlv_1= '(' ( (lv_x_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_y_4_0= ruleEInt ) ) otherlv_5= ')' )
            // InternalCinEditor.g:328:4: otherlv_1= '(' ( (lv_x_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_y_4_0= ruleEInt ) ) otherlv_5= ')'
            {
            otherlv_1=(Token)match(input,14,FOLLOW_10); 

            				newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getLeftParenthesisKeyword_1_0());
            			
            // InternalCinEditor.g:332:4: ( (lv_x_2_0= ruleEInt ) )
            // InternalCinEditor.g:333:5: (lv_x_2_0= ruleEInt )
            {
            // InternalCinEditor.g:333:5: (lv_x_2_0= ruleEInt )
            // InternalCinEditor.g:334:6: lv_x_2_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getPositionAccess().getXEIntParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_11);
            lv_x_2_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPositionRule());
            						}
            						set(
            							current,
            							"x",
            							lv_x_2_0,
            							"polytech.spaceteam.cineditor.CinEditor.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_10); 

            				newLeafNode(otherlv_3, grammarAccess.getPositionAccess().getCommaKeyword_1_2());
            			
            // InternalCinEditor.g:355:4: ( (lv_y_4_0= ruleEInt ) )
            // InternalCinEditor.g:356:5: (lv_y_4_0= ruleEInt )
            {
            // InternalCinEditor.g:356:5: (lv_y_4_0= ruleEInt )
            // InternalCinEditor.g:357:6: lv_y_4_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getPositionAccess().getYEIntParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_12);
            lv_y_4_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPositionRule());
            						}
            						set(
            							current,
            							"y",
            							lv_y_4_0,
            							"polytech.spaceteam.cineditor.CinEditor.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            				newLeafNode(otherlv_5, grammarAccess.getPositionAccess().getRightParenthesisKeyword_1_4());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleDimension"
    // InternalCinEditor.g:383:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // InternalCinEditor.g:383:50: (iv_ruleDimension= ruleDimension EOF )
            // InternalCinEditor.g:384:2: iv_ruleDimension= ruleDimension EOF
            {
             newCompositeNode(grammarAccess.getDimensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimension=ruleDimension();

            state._fsp--;

             current =iv_ruleDimension; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // InternalCinEditor.g:390:1: ruleDimension returns [EObject current=null] : (otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) ) ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_width_1_0 = null;

        AntlrDatatypeRuleToken lv_height_3_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:396:2: ( (otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) ) ) )
            // InternalCinEditor.g:397:2: (otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) ) )
            {
            // InternalCinEditor.g:397:2: (otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) ) )
            // InternalCinEditor.g:398:3: otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionAccess().getDimensionKeyword_0());
            		
            // InternalCinEditor.g:402:3: ( (lv_width_1_0= ruleEInt ) )
            // InternalCinEditor.g:403:4: (lv_width_1_0= ruleEInt )
            {
            // InternalCinEditor.g:403:4: (lv_width_1_0= ruleEInt )
            // InternalCinEditor.g:404:5: lv_width_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDimensionAccess().getWidthEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_width_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimensionRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_1_0,
            						"polytech.spaceteam.cineditor.CinEditor.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDimensionAccess().getXKeyword_2());
            		
            // InternalCinEditor.g:425:3: ( (lv_height_3_0= ruleEInt ) )
            // InternalCinEditor.g:426:4: (lv_height_3_0= ruleEInt )
            {
            // InternalCinEditor.g:426:4: (lv_height_3_0= ruleEInt )
            // InternalCinEditor.g:427:5: lv_height_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDimensionAccess().getHeightEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_height_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDimensionRule());
            					}
            					set(
            						current,
            						"height",
            						lv_height_3_0,
            						"polytech.spaceteam.cineditor.CinEditor.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleHexadecimalColor"
    // InternalCinEditor.g:448:1: entryRuleHexadecimalColor returns [EObject current=null] : iv_ruleHexadecimalColor= ruleHexadecimalColor EOF ;
    public final EObject entryRuleHexadecimalColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexadecimalColor = null;


        try {
            // InternalCinEditor.g:448:57: (iv_ruleHexadecimalColor= ruleHexadecimalColor EOF )
            // InternalCinEditor.g:449:2: iv_ruleHexadecimalColor= ruleHexadecimalColor EOF
            {
             newCompositeNode(grammarAccess.getHexadecimalColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHexadecimalColor=ruleHexadecimalColor();

            state._fsp--;

             current =iv_ruleHexadecimalColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHexadecimalColor"


    // $ANTLR start "ruleHexadecimalColor"
    // InternalCinEditor.g:455:1: ruleHexadecimalColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) ) ) ;
    public final EObject ruleHexadecimalColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_hexadecimalValue_1_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:461:2: ( (otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) ) ) )
            // InternalCinEditor.g:462:2: (otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) ) )
            {
            // InternalCinEditor.g:462:2: (otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) ) )
            // InternalCinEditor.g:463:3: otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHexadecimalColorAccess().getColorKeyword_0());
            		
            // InternalCinEditor.g:467:3: ( (lv_hexadecimalValue_1_0= ruleEString ) )
            // InternalCinEditor.g:468:4: (lv_hexadecimalValue_1_0= ruleEString )
            {
            // InternalCinEditor.g:468:4: (lv_hexadecimalValue_1_0= ruleEString )
            // InternalCinEditor.g:469:5: lv_hexadecimalValue_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHexadecimalColorAccess().getHexadecimalValueEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_hexadecimalValue_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHexadecimalColorRule());
            					}
            					set(
            						current,
            						"hexadecimalValue",
            						lv_hexadecimalValue_1_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHexadecimalColor"


    // $ANTLR start "entryRuleEInt"
    // InternalCinEditor.g:490:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalCinEditor.g:490:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalCinEditor.g:491:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalCinEditor.g:497:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCinEditor.g:503:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalCinEditor.g:504:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalCinEditor.g:504:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalCinEditor.g:505:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalCinEditor.g:505:3: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCinEditor.g:506:4: kw= '-'
                    {
                    kw=(Token)match(input,20,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleText"
    // InternalCinEditor.g:523:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalCinEditor.g:523:45: (iv_ruleText= ruleText EOF )
            // InternalCinEditor.g:524:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalCinEditor.g:530:1: ruleText returns [EObject current=null] : (otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? otherlv_7= 'at' ( (lv_beginTime_8_0= ruleEInt ) ) (otherlv_9= 'during' ( (lv_duration_10_0= ruleEInt ) ) )? ( (lv_color_11_0= ruleHexadecimalColor ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_text_3_0 = null;

        AntlrDatatypeRuleToken lv_fontSize_5_0 = null;

        EObject lv_position_6_0 = null;

        AntlrDatatypeRuleToken lv_beginTime_8_0 = null;

        AntlrDatatypeRuleToken lv_duration_10_0 = null;

        EObject lv_color_11_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:536:2: ( (otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? otherlv_7= 'at' ( (lv_beginTime_8_0= ruleEInt ) ) (otherlv_9= 'during' ( (lv_duration_10_0= ruleEInt ) ) )? ( (lv_color_11_0= ruleHexadecimalColor ) ) ) )
            // InternalCinEditor.g:537:2: (otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? otherlv_7= 'at' ( (lv_beginTime_8_0= ruleEInt ) ) (otherlv_9= 'during' ( (lv_duration_10_0= ruleEInt ) ) )? ( (lv_color_11_0= ruleHexadecimalColor ) ) )
            {
            // InternalCinEditor.g:537:2: (otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? otherlv_7= 'at' ( (lv_beginTime_8_0= ruleEInt ) ) (otherlv_9= 'during' ( (lv_duration_10_0= ruleEInt ) ) )? ( (lv_color_11_0= ruleHexadecimalColor ) ) )
            // InternalCinEditor.g:538:3: otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? otherlv_7= 'at' ( (lv_beginTime_8_0= ruleEInt ) ) (otherlv_9= 'during' ( (lv_duration_10_0= ruleEInt ) ) )? ( (lv_color_11_0= ruleHexadecimalColor ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
            		
            // InternalCinEditor.g:542:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:543:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:543:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:544:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTextAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalCinEditor.g:565:3: ( (lv_text_3_0= ruleEString ) )
            // InternalCinEditor.g:566:4: (lv_text_3_0= ruleEString )
            {
            // InternalCinEditor.g:566:4: (lv_text_3_0= ruleEString )
            // InternalCinEditor.g:567:5: lv_text_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTextAccess().getTextEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_text_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_3_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCinEditor.g:584:3: (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCinEditor.g:585:4: otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextAccess().getFontSizeKeyword_4_0());
                    			
                    // InternalCinEditor.g:589:4: ( (lv_fontSize_5_0= ruleEInt ) )
                    // InternalCinEditor.g:590:5: (lv_fontSize_5_0= ruleEInt )
                    {
                    // InternalCinEditor.g:590:5: (lv_fontSize_5_0= ruleEInt )
                    // InternalCinEditor.g:591:6: lv_fontSize_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAccess().getFontSizeEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_fontSize_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextRule());
                    						}
                    						set(
                    							current,
                    							"fontSize",
                    							lv_fontSize_5_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:609:3: ( (lv_position_6_0= rulePosition ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCinEditor.g:610:4: (lv_position_6_0= rulePosition )
                    {
                    // InternalCinEditor.g:610:4: (lv_position_6_0= rulePosition )
                    // InternalCinEditor.g:611:5: lv_position_6_0= rulePosition
                    {

                    					newCompositeNode(grammarAccess.getTextAccess().getPositionPositionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_position_6_0=rulePosition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTextRule());
                    					}
                    					set(
                    						current,
                    						"position",
                    						lv_position_6_0,
                    						"polytech.spaceteam.cineditor.CinEditor.Position");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getTextAccess().getAtKeyword_6());
            		
            // InternalCinEditor.g:632:3: ( (lv_beginTime_8_0= ruleEInt ) )
            // InternalCinEditor.g:633:4: (lv_beginTime_8_0= ruleEInt )
            {
            // InternalCinEditor.g:633:4: (lv_beginTime_8_0= ruleEInt )
            // InternalCinEditor.g:634:5: lv_beginTime_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTextAccess().getBeginTimeEIntParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_19);
            lv_beginTime_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextRule());
            					}
            					set(
            						current,
            						"beginTime",
            						lv_beginTime_8_0,
            						"polytech.spaceteam.cineditor.CinEditor.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCinEditor.g:651:3: (otherlv_9= 'during' ( (lv_duration_10_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCinEditor.g:652:4: otherlv_9= 'during' ( (lv_duration_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getTextAccess().getDuringKeyword_8_0());
                    			
                    // InternalCinEditor.g:656:4: ( (lv_duration_10_0= ruleEInt ) )
                    // InternalCinEditor.g:657:5: (lv_duration_10_0= ruleEInt )
                    {
                    // InternalCinEditor.g:657:5: (lv_duration_10_0= ruleEInt )
                    // InternalCinEditor.g:658:6: lv_duration_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAccess().getDurationEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_duration_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_10_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:676:3: ( (lv_color_11_0= ruleHexadecimalColor ) )
            // InternalCinEditor.g:677:4: (lv_color_11_0= ruleHexadecimalColor )
            {
            // InternalCinEditor.g:677:4: (lv_color_11_0= ruleHexadecimalColor )
            // InternalCinEditor.g:678:5: lv_color_11_0= ruleHexadecimalColor
            {

            					newCompositeNode(grammarAccess.getTextAccess().getColorHexadecimalColorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_color_11_0=ruleHexadecimalColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_11_0,
            						"polytech.spaceteam.cineditor.CinEditor.HexadecimalColor");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRulePicture"
    // InternalCinEditor.g:699:1: entryRulePicture returns [EObject current=null] : iv_rulePicture= rulePicture EOF ;
    public final EObject entryRulePicture() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePicture = null;


        try {
            // InternalCinEditor.g:699:48: (iv_rulePicture= rulePicture EOF )
            // InternalCinEditor.g:700:2: iv_rulePicture= rulePicture EOF
            {
             newCompositeNode(grammarAccess.getPictureRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePicture=rulePicture();

            state._fsp--;

             current =iv_rulePicture; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePicture"


    // $ANTLR start "rulePicture"
    // InternalCinEditor.g:706:1: rulePicture returns [EObject current=null] : (otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= '\"' ( (lv_url_4_0= ruleEString ) ) otherlv_5= '\"' ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? otherlv_8= 'at' ( (lv_beginTime_9_0= ruleEInt ) ) (otherlv_10= 'during' ( (lv_duration_11_0= ruleEInt ) ) )? ) ;
    public final EObject rulePicture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_url_4_0 = null;

        EObject lv_position_6_0 = null;

        EObject lv_dimension_7_0 = null;

        AntlrDatatypeRuleToken lv_beginTime_9_0 = null;

        AntlrDatatypeRuleToken lv_duration_11_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:712:2: ( (otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= '\"' ( (lv_url_4_0= ruleEString ) ) otherlv_5= '\"' ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? otherlv_8= 'at' ( (lv_beginTime_9_0= ruleEInt ) ) (otherlv_10= 'during' ( (lv_duration_11_0= ruleEInt ) ) )? ) )
            // InternalCinEditor.g:713:2: (otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= '\"' ( (lv_url_4_0= ruleEString ) ) otherlv_5= '\"' ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? otherlv_8= 'at' ( (lv_beginTime_9_0= ruleEInt ) ) (otherlv_10= 'during' ( (lv_duration_11_0= ruleEInt ) ) )? )
            {
            // InternalCinEditor.g:713:2: (otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= '\"' ( (lv_url_4_0= ruleEString ) ) otherlv_5= '\"' ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? otherlv_8= 'at' ( (lv_beginTime_9_0= ruleEInt ) ) (otherlv_10= 'during' ( (lv_duration_11_0= ruleEInt ) ) )? )
            // InternalCinEditor.g:714:3: otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= '\"' ( (lv_url_4_0= ruleEString ) ) otherlv_5= '\"' ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? otherlv_8= 'at' ( (lv_beginTime_9_0= ruleEInt ) ) (otherlv_10= 'during' ( (lv_duration_11_0= ruleEInt ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPictureAccess().getPictureKeyword_0());
            		
            // InternalCinEditor.g:718:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:719:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:719:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:720:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPictureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPictureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getPictureAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPictureAccess().getQuotationMarkKeyword_3());
            		
            // InternalCinEditor.g:745:3: ( (lv_url_4_0= ruleEString ) )
            // InternalCinEditor.g:746:4: (lv_url_4_0= ruleEString )
            {
            // InternalCinEditor.g:746:4: (lv_url_4_0= ruleEString )
            // InternalCinEditor.g:747:5: lv_url_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPictureAccess().getUrlEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_url_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPictureRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_4_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getPictureAccess().getQuotationMarkKeyword_5());
            		
            // InternalCinEditor.g:768:3: ( (lv_position_6_0= rulePosition ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCinEditor.g:769:4: (lv_position_6_0= rulePosition )
                    {
                    // InternalCinEditor.g:769:4: (lv_position_6_0= rulePosition )
                    // InternalCinEditor.g:770:5: lv_position_6_0= rulePosition
                    {

                    					newCompositeNode(grammarAccess.getPictureAccess().getPositionPositionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_position_6_0=rulePosition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPictureRule());
                    					}
                    					set(
                    						current,
                    						"position",
                    						lv_position_6_0,
                    						"polytech.spaceteam.cineditor.CinEditor.Position");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCinEditor.g:787:3: ( (lv_dimension_7_0= ruleDimension ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCinEditor.g:788:4: (lv_dimension_7_0= ruleDimension )
                    {
                    // InternalCinEditor.g:788:4: (lv_dimension_7_0= ruleDimension )
                    // InternalCinEditor.g:789:5: lv_dimension_7_0= ruleDimension
                    {

                    					newCompositeNode(grammarAccess.getPictureAccess().getDimensionDimensionParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_dimension_7_0=ruleDimension();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPictureRule());
                    					}
                    					set(
                    						current,
                    						"dimension",
                    						lv_dimension_7_0,
                    						"polytech.spaceteam.cineditor.CinEditor.Dimension");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getPictureAccess().getAtKeyword_8());
            		
            // InternalCinEditor.g:810:3: ( (lv_beginTime_9_0= ruleEInt ) )
            // InternalCinEditor.g:811:4: (lv_beginTime_9_0= ruleEInt )
            {
            // InternalCinEditor.g:811:4: (lv_beginTime_9_0= ruleEInt )
            // InternalCinEditor.g:812:5: lv_beginTime_9_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPictureAccess().getBeginTimeEIntParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_23);
            lv_beginTime_9_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPictureRule());
            					}
            					set(
            						current,
            						"beginTime",
            						lv_beginTime_9_0,
            						"polytech.spaceteam.cineditor.CinEditor.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCinEditor.g:829:3: (otherlv_10= 'during' ( (lv_duration_11_0= ruleEInt ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCinEditor.g:830:4: otherlv_10= 'during' ( (lv_duration_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getPictureAccess().getDuringKeyword_10_0());
                    			
                    // InternalCinEditor.g:834:4: ( (lv_duration_11_0= ruleEInt ) )
                    // InternalCinEditor.g:835:5: (lv_duration_11_0= ruleEInt )
                    {
                    // InternalCinEditor.g:835:5: (lv_duration_11_0= ruleEInt )
                    // InternalCinEditor.g:836:6: lv_duration_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPictureAccess().getDurationEIntParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_duration_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPictureRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_11_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePicture"


    // $ANTLR start "entryRuleVideo"
    // InternalCinEditor.g:858:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalCinEditor.g:858:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalCinEditor.g:859:2: iv_ruleVideo= ruleVideo EOF
            {
             newCompositeNode(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideo=ruleVideo();

            state._fsp--;

             current =iv_ruleVideo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalCinEditor.g:865:1: ruleVideo returns [EObject current=null] : (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= '\"' ( (lv_url_4_0= ruleEString ) ) otherlv_5= '\"' otherlv_6= 'from' ( (lv_beginCropTime_7_0= ruleEInt ) ) ( (lv_position_8_0= rulePosition ) )? ( (lv_dimension_9_0= ruleDimension ) )? otherlv_10= 'at' ( (lv_beginTime_11_0= ruleEInt ) ) (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )? ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_url_4_0 = null;

        AntlrDatatypeRuleToken lv_beginCropTime_7_0 = null;

        EObject lv_position_8_0 = null;

        EObject lv_dimension_9_0 = null;

        AntlrDatatypeRuleToken lv_beginTime_11_0 = null;

        AntlrDatatypeRuleToken lv_duration_13_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:871:2: ( (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= '\"' ( (lv_url_4_0= ruleEString ) ) otherlv_5= '\"' otherlv_6= 'from' ( (lv_beginCropTime_7_0= ruleEInt ) ) ( (lv_position_8_0= rulePosition ) )? ( (lv_dimension_9_0= ruleDimension ) )? otherlv_10= 'at' ( (lv_beginTime_11_0= ruleEInt ) ) (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )? ) )
            // InternalCinEditor.g:872:2: (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= '\"' ( (lv_url_4_0= ruleEString ) ) otherlv_5= '\"' otherlv_6= 'from' ( (lv_beginCropTime_7_0= ruleEInt ) ) ( (lv_position_8_0= rulePosition ) )? ( (lv_dimension_9_0= ruleDimension ) )? otherlv_10= 'at' ( (lv_beginTime_11_0= ruleEInt ) ) (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )? )
            {
            // InternalCinEditor.g:872:2: (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= '\"' ( (lv_url_4_0= ruleEString ) ) otherlv_5= '\"' otherlv_6= 'from' ( (lv_beginCropTime_7_0= ruleEInt ) ) ( (lv_position_8_0= rulePosition ) )? ( (lv_dimension_9_0= ruleDimension ) )? otherlv_10= 'at' ( (lv_beginTime_11_0= ruleEInt ) ) (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )? )
            // InternalCinEditor.g:873:3: otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= '\"' ( (lv_url_4_0= ruleEString ) ) otherlv_5= '\"' otherlv_6= 'from' ( (lv_beginCropTime_7_0= ruleEInt ) ) ( (lv_position_8_0= rulePosition ) )? ( (lv_dimension_9_0= ruleDimension ) )? otherlv_10= 'at' ( (lv_beginTime_11_0= ruleEInt ) ) (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoAccess().getVideoKeyword_0());
            		
            // InternalCinEditor.g:877:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:878:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:878:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:879:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getVideoAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getVideoAccess().getQuotationMarkKeyword_3());
            		
            // InternalCinEditor.g:904:3: ( (lv_url_4_0= ruleEString ) )
            // InternalCinEditor.g:905:4: (lv_url_4_0= ruleEString )
            {
            // InternalCinEditor.g:905:4: (lv_url_4_0= ruleEString )
            // InternalCinEditor.g:906:5: lv_url_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getUrlEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_url_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_4_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getVideoAccess().getQuotationMarkKeyword_5());
            		
            otherlv_6=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getVideoAccess().getFromKeyword_6());
            		
            // InternalCinEditor.g:931:3: ( (lv_beginCropTime_7_0= ruleEInt ) )
            // InternalCinEditor.g:932:4: (lv_beginCropTime_7_0= ruleEInt )
            {
            // InternalCinEditor.g:932:4: (lv_beginCropTime_7_0= ruleEInt )
            // InternalCinEditor.g:933:5: lv_beginCropTime_7_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getBeginCropTimeEIntParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_21);
            lv_beginCropTime_7_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					set(
            						current,
            						"beginCropTime",
            						lv_beginCropTime_7_0,
            						"polytech.spaceteam.cineditor.CinEditor.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCinEditor.g:950:3: ( (lv_position_8_0= rulePosition ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCinEditor.g:951:4: (lv_position_8_0= rulePosition )
                    {
                    // InternalCinEditor.g:951:4: (lv_position_8_0= rulePosition )
                    // InternalCinEditor.g:952:5: lv_position_8_0= rulePosition
                    {

                    					newCompositeNode(grammarAccess.getVideoAccess().getPositionPositionParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_position_8_0=rulePosition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVideoRule());
                    					}
                    					set(
                    						current,
                    						"position",
                    						lv_position_8_0,
                    						"polytech.spaceteam.cineditor.CinEditor.Position");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCinEditor.g:969:3: ( (lv_dimension_9_0= ruleDimension ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCinEditor.g:970:4: (lv_dimension_9_0= ruleDimension )
                    {
                    // InternalCinEditor.g:970:4: (lv_dimension_9_0= ruleDimension )
                    // InternalCinEditor.g:971:5: lv_dimension_9_0= ruleDimension
                    {

                    					newCompositeNode(grammarAccess.getVideoAccess().getDimensionDimensionParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_dimension_9_0=ruleDimension();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVideoRule());
                    					}
                    					set(
                    						current,
                    						"dimension",
                    						lv_dimension_9_0,
                    						"polytech.spaceteam.cineditor.CinEditor.Dimension");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getVideoAccess().getAtKeyword_10());
            		
            // InternalCinEditor.g:992:3: ( (lv_beginTime_11_0= ruleEInt ) )
            // InternalCinEditor.g:993:4: (lv_beginTime_11_0= ruleEInt )
            {
            // InternalCinEditor.g:993:4: (lv_beginTime_11_0= ruleEInt )
            // InternalCinEditor.g:994:5: lv_beginTime_11_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getBeginTimeEIntParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_23);
            lv_beginTime_11_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					set(
            						current,
            						"beginTime",
            						lv_beginTime_11_0,
            						"polytech.spaceteam.cineditor.CinEditor.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCinEditor.g:1011:3: (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCinEditor.g:1012:4: otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getVideoAccess().getDuringKeyword_12_0());
                    			
                    // InternalCinEditor.g:1016:4: ( (lv_duration_13_0= ruleEInt ) )
                    // InternalCinEditor.g:1017:5: (lv_duration_13_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1017:5: (lv_duration_13_0= ruleEInt )
                    // InternalCinEditor.g:1018:6: lv_duration_13_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getDurationEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_duration_13_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_13_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleRectangle"
    // InternalCinEditor.g:1040:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // InternalCinEditor.g:1040:50: (iv_ruleRectangle= ruleRectangle EOF )
            // InternalCinEditor.g:1041:2: iv_ruleRectangle= ruleRectangle EOF
            {
             newCompositeNode(grammarAccess.getRectangleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRectangle=ruleRectangle();

            state._fsp--;

             current =iv_ruleRectangle; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRectangle"


    // $ANTLR start "ruleRectangle"
    // InternalCinEditor.g:1047:1: ruleRectangle returns [EObject current=null] : (otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )? ) ;
    public final EObject ruleRectangle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_color_3_0 = null;

        EObject lv_position_4_0 = null;

        EObject lv_dimension_5_0 = null;

        AntlrDatatypeRuleToken lv_beginTime_7_0 = null;

        AntlrDatatypeRuleToken lv_duration_9_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:1053:2: ( (otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )? ) )
            // InternalCinEditor.g:1054:2: (otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )? )
            {
            // InternalCinEditor.g:1054:2: (otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )? )
            // InternalCinEditor.g:1055:3: otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRectangleAccess().getRectangleKeyword_0());
            		
            // InternalCinEditor.g:1059:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1060:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1060:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1061:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRectangleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRectangleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getRectangleAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalCinEditor.g:1082:3: ( (lv_color_3_0= ruleHexadecimalColor ) )
            // InternalCinEditor.g:1083:4: (lv_color_3_0= ruleHexadecimalColor )
            {
            // InternalCinEditor.g:1083:4: (lv_color_3_0= ruleHexadecimalColor )
            // InternalCinEditor.g:1084:5: lv_color_3_0= ruleHexadecimalColor
            {

            					newCompositeNode(grammarAccess.getRectangleAccess().getColorHexadecimalColorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_color_3_0=ruleHexadecimalColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRectangleRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_3_0,
            						"polytech.spaceteam.cineditor.CinEditor.HexadecimalColor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCinEditor.g:1101:3: ( (lv_position_4_0= rulePosition ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCinEditor.g:1102:4: (lv_position_4_0= rulePosition )
                    {
                    // InternalCinEditor.g:1102:4: (lv_position_4_0= rulePosition )
                    // InternalCinEditor.g:1103:5: lv_position_4_0= rulePosition
                    {

                    					newCompositeNode(grammarAccess.getRectangleAccess().getPositionPositionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_position_4_0=rulePosition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRectangleRule());
                    					}
                    					set(
                    						current,
                    						"position",
                    						lv_position_4_0,
                    						"polytech.spaceteam.cineditor.CinEditor.Position");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCinEditor.g:1120:3: ( (lv_dimension_5_0= ruleDimension ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCinEditor.g:1121:4: (lv_dimension_5_0= ruleDimension )
                    {
                    // InternalCinEditor.g:1121:4: (lv_dimension_5_0= ruleDimension )
                    // InternalCinEditor.g:1122:5: lv_dimension_5_0= ruleDimension
                    {

                    					newCompositeNode(grammarAccess.getRectangleAccess().getDimensionDimensionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_dimension_5_0=ruleDimension();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRectangleRule());
                    					}
                    					set(
                    						current,
                    						"dimension",
                    						lv_dimension_5_0,
                    						"polytech.spaceteam.cineditor.CinEditor.Dimension");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getRectangleAccess().getAtKeyword_6());
            		
            // InternalCinEditor.g:1143:3: ( (lv_beginTime_7_0= ruleEInt ) )
            // InternalCinEditor.g:1144:4: (lv_beginTime_7_0= ruleEInt )
            {
            // InternalCinEditor.g:1144:4: (lv_beginTime_7_0= ruleEInt )
            // InternalCinEditor.g:1145:5: lv_beginTime_7_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRectangleAccess().getBeginTimeEIntParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_23);
            lv_beginTime_7_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRectangleRule());
            					}
            					set(
            						current,
            						"beginTime",
            						lv_beginTime_7_0,
            						"polytech.spaceteam.cineditor.CinEditor.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCinEditor.g:1162:3: (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCinEditor.g:1163:4: otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getRectangleAccess().getDuringKeyword_8_0());
                    			
                    // InternalCinEditor.g:1167:4: ( (lv_duration_9_0= ruleEInt ) )
                    // InternalCinEditor.g:1168:5: (lv_duration_9_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1168:5: (lv_duration_9_0= ruleEInt )
                    // InternalCinEditor.g:1169:6: lv_duration_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRectangleAccess().getDurationEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_duration_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRectangleRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_9_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRectangle"


    // $ANTLR start "entryRuleFadeIn"
    // InternalCinEditor.g:1191:1: entryRuleFadeIn returns [EObject current=null] : iv_ruleFadeIn= ruleFadeIn EOF ;
    public final EObject entryRuleFadeIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFadeIn = null;


        try {
            // InternalCinEditor.g:1191:47: (iv_ruleFadeIn= ruleFadeIn EOF )
            // InternalCinEditor.g:1192:2: iv_ruleFadeIn= ruleFadeIn EOF
            {
             newCompositeNode(grammarAccess.getFadeInRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFadeIn=ruleFadeIn();

            state._fsp--;

             current =iv_ruleFadeIn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFadeIn"


    // $ANTLR start "ruleFadeIn"
    // InternalCinEditor.g:1198:1: ruleFadeIn returns [EObject current=null] : (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleFadeIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_5_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:1204:2: ( (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalCinEditor.g:1205:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalCinEditor.g:1205:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) )
            // InternalCinEditor.g:1206:3: otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFadeInAccess().getEffectKeyword_0());
            		
            // InternalCinEditor.g:1210:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1211:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1211:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1212:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFadeInAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFadeInRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getFadeInAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getFadeInAccess().getFadeInKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getFadeInAccess().getDuringKeyword_4());
            		
            // InternalCinEditor.g:1241:3: ( (lv_duration_5_0= ruleEInt ) )
            // InternalCinEditor.g:1242:4: (lv_duration_5_0= ruleEInt )
            {
            // InternalCinEditor.g:1242:4: (lv_duration_5_0= ruleEInt )
            // InternalCinEditor.g:1243:5: lv_duration_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getFadeInAccess().getDurationEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_duration_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFadeInRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_5_0,
            						"polytech.spaceteam.cineditor.CinEditor.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getFadeInAccess().getOnKeyword_6());
            		
            // InternalCinEditor.g:1264:3: ( (otherlv_7= RULE_ID ) )
            // InternalCinEditor.g:1265:4: (otherlv_7= RULE_ID )
            {
            // InternalCinEditor.g:1265:4: (otherlv_7= RULE_ID )
            // InternalCinEditor.g:1266:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFadeInRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getFadeInAccess().getElementGraphicalElementCrossReference_7_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFadeIn"


    // $ANTLR start "entryRuleFadeOut"
    // InternalCinEditor.g:1281:1: entryRuleFadeOut returns [EObject current=null] : iv_ruleFadeOut= ruleFadeOut EOF ;
    public final EObject entryRuleFadeOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFadeOut = null;


        try {
            // InternalCinEditor.g:1281:48: (iv_ruleFadeOut= ruleFadeOut EOF )
            // InternalCinEditor.g:1282:2: iv_ruleFadeOut= ruleFadeOut EOF
            {
             newCompositeNode(grammarAccess.getFadeOutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFadeOut=ruleFadeOut();

            state._fsp--;

             current =iv_ruleFadeOut; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFadeOut"


    // $ANTLR start "ruleFadeOut"
    // InternalCinEditor.g:1288:1: ruleFadeOut returns [EObject current=null] : (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleFadeOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_5_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:1294:2: ( (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalCinEditor.g:1295:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalCinEditor.g:1295:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) )
            // InternalCinEditor.g:1296:3: otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFadeOutAccess().getEffectKeyword_0());
            		
            // InternalCinEditor.g:1300:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1301:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1301:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1302:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFadeOutAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFadeOutRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getFadeOutAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getFadeOutAccess().getFadeOutKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getFadeOutAccess().getDuringKeyword_4());
            		
            // InternalCinEditor.g:1331:3: ( (lv_duration_5_0= ruleEInt ) )
            // InternalCinEditor.g:1332:4: (lv_duration_5_0= ruleEInt )
            {
            // InternalCinEditor.g:1332:4: (lv_duration_5_0= ruleEInt )
            // InternalCinEditor.g:1333:5: lv_duration_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getFadeOutAccess().getDurationEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_duration_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFadeOutRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_5_0,
            						"polytech.spaceteam.cineditor.CinEditor.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getFadeOutAccess().getOnKeyword_6());
            		
            // InternalCinEditor.g:1354:3: ( (otherlv_7= RULE_ID ) )
            // InternalCinEditor.g:1355:4: (otherlv_7= RULE_ID )
            {
            // InternalCinEditor.g:1355:4: (otherlv_7= RULE_ID )
            // InternalCinEditor.g:1356:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFadeOutRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getFadeOutAccess().getElementGraphicalElementCrossReference_7_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFadeOut"


    // $ANTLR start "entryRuleTranslate"
    // InternalCinEditor.g:1371:1: entryRuleTranslate returns [EObject current=null] : iv_ruleTranslate= ruleTranslate EOF ;
    public final EObject entryRuleTranslate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTranslate = null;


        try {
            // InternalCinEditor.g:1371:50: (iv_ruleTranslate= ruleTranslate EOF )
            // InternalCinEditor.g:1372:2: iv_ruleTranslate= ruleTranslate EOF
            {
             newCompositeNode(grammarAccess.getTranslateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTranslate=ruleTranslate();

            state._fsp--;

             current =iv_ruleTranslate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTranslate"


    // $ANTLR start "ruleTranslate"
    // InternalCinEditor.g:1378:1: ruleTranslate returns [EObject current=null] : (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) otherlv_5= 'at' ( (lv_beginTime_6_0= ruleEInt ) ) otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) otherlv_9= 'on' ( (otherlv_10= RULE_ID ) ) ) ;
    public final EObject ruleTranslate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_positionToTranslate_4_0 = null;

        AntlrDatatypeRuleToken lv_beginTime_6_0 = null;

        AntlrDatatypeRuleToken lv_duration_8_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:1384:2: ( (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) otherlv_5= 'at' ( (lv_beginTime_6_0= ruleEInt ) ) otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) otherlv_9= 'on' ( (otherlv_10= RULE_ID ) ) ) )
            // InternalCinEditor.g:1385:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) otherlv_5= 'at' ( (lv_beginTime_6_0= ruleEInt ) ) otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) otherlv_9= 'on' ( (otherlv_10= RULE_ID ) ) )
            {
            // InternalCinEditor.g:1385:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) otherlv_5= 'at' ( (lv_beginTime_6_0= ruleEInt ) ) otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) otherlv_9= 'on' ( (otherlv_10= RULE_ID ) ) )
            // InternalCinEditor.g:1386:3: otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) otherlv_5= 'at' ( (lv_beginTime_6_0= ruleEInt ) ) otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) otherlv_9= 'on' ( (otherlv_10= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTranslateAccess().getEffectKeyword_0());
            		
            // InternalCinEditor.g:1390:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1391:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1391:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1392:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTranslateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTranslateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getTranslateAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getTranslateAccess().getTranslateKeyword_3());
            		
            // InternalCinEditor.g:1417:3: ( (lv_positionToTranslate_4_0= rulePosition ) )
            // InternalCinEditor.g:1418:4: (lv_positionToTranslate_4_0= rulePosition )
            {
            // InternalCinEditor.g:1418:4: (lv_positionToTranslate_4_0= rulePosition )
            // InternalCinEditor.g:1419:5: lv_positionToTranslate_4_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getTranslateAccess().getPositionToTranslatePositionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_positionToTranslate_4_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTranslateRule());
            					}
            					set(
            						current,
            						"positionToTranslate",
            						lv_positionToTranslate_4_0,
            						"polytech.spaceteam.cineditor.CinEditor.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getTranslateAccess().getAtKeyword_5());
            		
            // InternalCinEditor.g:1440:3: ( (lv_beginTime_6_0= ruleEInt ) )
            // InternalCinEditor.g:1441:4: (lv_beginTime_6_0= ruleEInt )
            {
            // InternalCinEditor.g:1441:4: (lv_beginTime_6_0= ruleEInt )
            // InternalCinEditor.g:1442:5: lv_beginTime_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTranslateAccess().getBeginTimeEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_26);
            lv_beginTime_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTranslateRule());
            					}
            					set(
            						current,
            						"beginTime",
            						lv_beginTime_6_0,
            						"polytech.spaceteam.cineditor.CinEditor.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getTranslateAccess().getDuringKeyword_7());
            		
            // InternalCinEditor.g:1463:3: ( (lv_duration_8_0= ruleEInt ) )
            // InternalCinEditor.g:1464:4: (lv_duration_8_0= ruleEInt )
            {
            // InternalCinEditor.g:1464:4: (lv_duration_8_0= ruleEInt )
            // InternalCinEditor.g:1465:5: lv_duration_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTranslateAccess().getDurationEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_27);
            lv_duration_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTranslateRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_8_0,
            						"polytech.spaceteam.cineditor.CinEditor.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,33,FOLLOW_28); 

            			newLeafNode(otherlv_9, grammarAccess.getTranslateAccess().getOnKeyword_9());
            		
            // InternalCinEditor.g:1486:3: ( (otherlv_10= RULE_ID ) )
            // InternalCinEditor.g:1487:4: (otherlv_10= RULE_ID )
            {
            // InternalCinEditor.g:1487:4: (otherlv_10= RULE_ID )
            // InternalCinEditor.g:1488:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTranslateRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_10, grammarAccess.getTranslateAccess().getElementGraphicalElementCrossReference_10_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTranslate"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\25\3\uffff\1\4\1\uffff\2\26\1\40\3\uffff";
    static final String dfa_3s = "\1\37\3\uffff\1\5\1\uffff\2\26\1\43\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\7\3\uffff\1\4\1\5\1\6";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\4\uffff\1\2\1\uffff\1\3\1\uffff\1\5\1\4",
            "",
            "",
            "",
            "\1\6\1\7",
            "",
            "\1\10",
            "\1\10",
            "\1\11\1\uffff\1\12\1\13",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "158:2: (this_Text_0= ruleText | this_Picture_1= rulePicture | this_Video_2= ruleVideo | this_FadeIn_3= ruleFadeIn | this_FadeOut_4= ruleFadeOut | this_Translate_5= ruleTranslate | this_Rectangle_6= ruleRectangle )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000D4200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000D4200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001802000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001022000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000002000L});

}