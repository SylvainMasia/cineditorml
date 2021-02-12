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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Movie'", "'fps'", "'Layer'", "'position'", "'('", "','", "')'", "'center'", "'left'", "'right'", "'bottom'", "'top'", "'dimension'", "'x'", "'color'", "'-'", "'.'", "'Audio'", "'='", "'volume'", "'fadeIn'", "'fadeOut'", "'at'", "'during'", "'on'", "'Text'", "'fontSize'", "'Picture'", "'Video'", "'from'", "'Rectangle'", "'Effect'", "'FadeIn'", "'FadeOut'", "'Translate'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalCinEditor.g:71:1: ruleMovie returns [EObject current=null] : (otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) (otherlv_3= 'fps' ( (lv_fps_4_0= ruleEInt ) ) )? ( (lv_layers_5_0= ruleLayer ) )+ ) ;
    public final EObject ruleMovie() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dimension_2_0 = null;

        AntlrDatatypeRuleToken lv_fps_4_0 = null;

        EObject lv_layers_5_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:77:2: ( (otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) (otherlv_3= 'fps' ( (lv_fps_4_0= ruleEInt ) ) )? ( (lv_layers_5_0= ruleLayer ) )+ ) )
            // InternalCinEditor.g:78:2: (otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) (otherlv_3= 'fps' ( (lv_fps_4_0= ruleEInt ) ) )? ( (lv_layers_5_0= ruleLayer ) )+ )
            {
            // InternalCinEditor.g:78:2: (otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) (otherlv_3= 'fps' ( (lv_fps_4_0= ruleEInt ) ) )? ( (lv_layers_5_0= ruleLayer ) )+ )
            // InternalCinEditor.g:79:3: otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) (otherlv_3= 'fps' ( (lv_fps_4_0= ruleEInt ) ) )? ( (lv_layers_5_0= ruleLayer ) )+
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

            // InternalCinEditor.g:121:3: (otherlv_3= 'fps' ( (lv_fps_4_0= ruleEInt ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCinEditor.g:122:4: otherlv_3= 'fps' ( (lv_fps_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getMovieAccess().getFpsKeyword_3_0());
                    			
                    // InternalCinEditor.g:126:4: ( (lv_fps_4_0= ruleEInt ) )
                    // InternalCinEditor.g:127:5: (lv_fps_4_0= ruleEInt )
                    {
                    // InternalCinEditor.g:127:5: (lv_fps_4_0= ruleEInt )
                    // InternalCinEditor.g:128:6: lv_fps_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMovieAccess().getFpsEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_fps_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMovieRule());
                    						}
                    						set(
                    							current,
                    							"fps",
                    							lv_fps_4_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:146:3: ( (lv_layers_5_0= ruleLayer ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCinEditor.g:147:4: (lv_layers_5_0= ruleLayer )
            	    {
            	    // InternalCinEditor.g:147:4: (lv_layers_5_0= ruleLayer )
            	    // InternalCinEditor.g:148:5: lv_layers_5_0= ruleLayer
            	    {

            	    					newCompositeNode(grammarAccess.getMovieAccess().getLayersLayerParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_layers_5_0=ruleLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMovieRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layers",
            	    						lv_layers_5_0,
            	    						"polytech.spaceteam.cineditor.CinEditor.Layer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // InternalCinEditor.g:169:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalCinEditor.g:169:48: (iv_ruleElement= ruleElement EOF )
            // InternalCinEditor.g:170:2: iv_ruleElement= ruleElement EOF
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
    // InternalCinEditor.g:176:1: ruleElement returns [EObject current=null] : (this_GraphicalElement_0= ruleGraphicalElement | this_FadeIn_1= ruleFadeIn | this_FadeOut_2= ruleFadeOut | this_Translate_3= ruleTranslate | this_AudioElement_4= ruleAudioElement ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_GraphicalElement_0 = null;

        EObject this_FadeIn_1 = null;

        EObject this_FadeOut_2 = null;

        EObject this_Translate_3 = null;

        EObject this_AudioElement_4 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:182:2: ( (this_GraphicalElement_0= ruleGraphicalElement | this_FadeIn_1= ruleFadeIn | this_FadeOut_2= ruleFadeOut | this_Translate_3= ruleTranslate | this_AudioElement_4= ruleAudioElement ) )
            // InternalCinEditor.g:183:2: (this_GraphicalElement_0= ruleGraphicalElement | this_FadeIn_1= ruleFadeIn | this_FadeOut_2= ruleFadeOut | this_Translate_3= ruleTranslate | this_AudioElement_4= ruleAudioElement )
            {
            // InternalCinEditor.g:183:2: (this_GraphicalElement_0= ruleGraphicalElement | this_FadeIn_1= ruleFadeIn | this_FadeOut_2= ruleFadeOut | this_Translate_3= ruleTranslate | this_AudioElement_4= ruleAudioElement )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalCinEditor.g:184:3: this_GraphicalElement_0= ruleGraphicalElement
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getGraphicalElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GraphicalElement_0=ruleGraphicalElement();

                    state._fsp--;


                    			current = this_GraphicalElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:193:3: this_FadeIn_1= ruleFadeIn
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFadeInParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FadeIn_1=ruleFadeIn();

                    state._fsp--;


                    			current = this_FadeIn_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCinEditor.g:202:3: this_FadeOut_2= ruleFadeOut
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFadeOutParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FadeOut_2=ruleFadeOut();

                    state._fsp--;


                    			current = this_FadeOut_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCinEditor.g:211:3: this_Translate_3= ruleTranslate
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTranslateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Translate_3=ruleTranslate();

                    state._fsp--;


                    			current = this_Translate_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCinEditor.g:220:3: this_AudioElement_4= ruleAudioElement
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAudioElementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AudioElement_4=ruleAudioElement();

                    state._fsp--;


                    			current = this_AudioElement_4;
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
    // InternalCinEditor.g:232:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalCinEditor.g:232:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalCinEditor.g:233:2: iv_ruleLayer= ruleLayer EOF
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
    // InternalCinEditor.g:239:1: ruleLayer returns [EObject current=null] : ( () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+ ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:245:2: ( ( () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+ ) )
            // InternalCinEditor.g:246:2: ( () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+ )
            {
            // InternalCinEditor.g:246:2: ( () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+ )
            // InternalCinEditor.g:247:3: () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+
            {
            // InternalCinEditor.g:247:3: ()
            // InternalCinEditor.g:248:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLayerAccess().getLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLayerAccess().getLayerKeyword_1());
            		
            // InternalCinEditor.g:258:3: ( (lv_elements_2_0= ruleElement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==28||LA4_0==36||(LA4_0>=38 && LA4_0<=39)||(LA4_0>=41 && LA4_0<=42)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCinEditor.g:259:4: (lv_elements_2_0= ruleElement )
            	    {
            	    // InternalCinEditor.g:259:4: (lv_elements_2_0= ruleElement )
            	    // InternalCinEditor.g:260:5: lv_elements_2_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getLayerAccess().getElementsElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // InternalCinEditor.g:281:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCinEditor.g:281:47: (iv_ruleEString= ruleEString EOF )
            // InternalCinEditor.g:282:2: iv_ruleEString= ruleEString EOF
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
    // InternalCinEditor.g:288:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCinEditor.g:294:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCinEditor.g:295:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCinEditor.g:295:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCinEditor.g:296:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:304:3: this_ID_1= RULE_ID
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
    // InternalCinEditor.g:315:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalCinEditor.g:315:49: (iv_rulePosition= rulePosition EOF )
            // InternalCinEditor.g:316:2: iv_rulePosition= rulePosition EOF
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
    // InternalCinEditor.g:322:1: rulePosition returns [EObject current=null] : (otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleItemPosition ) ) otherlv_3= ',' ( (lv_y_4_0= ruleItemPosition ) ) otherlv_5= ')' ) ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_x_2_0 = null;

        EObject lv_y_4_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:328:2: ( (otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleItemPosition ) ) otherlv_3= ',' ( (lv_y_4_0= ruleItemPosition ) ) otherlv_5= ')' ) ) )
            // InternalCinEditor.g:329:2: (otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleItemPosition ) ) otherlv_3= ',' ( (lv_y_4_0= ruleItemPosition ) ) otherlv_5= ')' ) )
            {
            // InternalCinEditor.g:329:2: (otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleItemPosition ) ) otherlv_3= ',' ( (lv_y_4_0= ruleItemPosition ) ) otherlv_5= ')' ) )
            // InternalCinEditor.g:330:3: otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleItemPosition ) ) otherlv_3= ',' ( (lv_y_4_0= ruleItemPosition ) ) otherlv_5= ')' )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getPositionKeyword_0());
            		
            // InternalCinEditor.g:334:3: (otherlv_1= '(' ( (lv_x_2_0= ruleItemPosition ) ) otherlv_3= ',' ( (lv_y_4_0= ruleItemPosition ) ) otherlv_5= ')' )
            // InternalCinEditor.g:335:4: otherlv_1= '(' ( (lv_x_2_0= ruleItemPosition ) ) otherlv_3= ',' ( (lv_y_4_0= ruleItemPosition ) ) otherlv_5= ')'
            {
            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            				newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getLeftParenthesisKeyword_1_0());
            			
            // InternalCinEditor.g:339:4: ( (lv_x_2_0= ruleItemPosition ) )
            // InternalCinEditor.g:340:5: (lv_x_2_0= ruleItemPosition )
            {
            // InternalCinEditor.g:340:5: (lv_x_2_0= ruleItemPosition )
            // InternalCinEditor.g:341:6: lv_x_2_0= ruleItemPosition
            {

            						newCompositeNode(grammarAccess.getPositionAccess().getXItemPositionParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_12);
            lv_x_2_0=ruleItemPosition();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPositionRule());
            						}
            						set(
            							current,
            							"x",
            							lv_x_2_0,
            							"polytech.spaceteam.cineditor.CinEditor.ItemPosition");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            				newLeafNode(otherlv_3, grammarAccess.getPositionAccess().getCommaKeyword_1_2());
            			
            // InternalCinEditor.g:362:4: ( (lv_y_4_0= ruleItemPosition ) )
            // InternalCinEditor.g:363:5: (lv_y_4_0= ruleItemPosition )
            {
            // InternalCinEditor.g:363:5: (lv_y_4_0= ruleItemPosition )
            // InternalCinEditor.g:364:6: lv_y_4_0= ruleItemPosition
            {

            						newCompositeNode(grammarAccess.getPositionAccess().getYItemPositionParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_13);
            lv_y_4_0=ruleItemPosition();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPositionRule());
            						}
            						set(
            							current,
            							"y",
            							lv_y_4_0,
            							"polytech.spaceteam.cineditor.CinEditor.ItemPosition");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "entryRuleItemPosition"
    // InternalCinEditor.g:390:1: entryRuleItemPosition returns [EObject current=null] : iv_ruleItemPosition= ruleItemPosition EOF ;
    public final EObject entryRuleItemPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemPosition = null;


        try {
            // InternalCinEditor.g:390:53: (iv_ruleItemPosition= ruleItemPosition EOF )
            // InternalCinEditor.g:391:2: iv_ruleItemPosition= ruleItemPosition EOF
            {
             newCompositeNode(grammarAccess.getItemPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemPosition=ruleItemPosition();

            state._fsp--;

             current =iv_ruleItemPosition; 
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
    // $ANTLR end "entryRuleItemPosition"


    // $ANTLR start "ruleItemPosition"
    // InternalCinEditor.g:397:1: ruleItemPosition returns [EObject current=null] : (this_ItemPositionInt_0= ruleItemPositionInt | this_ItemPositionString_1= ruleItemPositionString ) ;
    public final EObject ruleItemPosition() throws RecognitionException {
        EObject current = null;

        EObject this_ItemPositionInt_0 = null;

        EObject this_ItemPositionString_1 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:403:2: ( (this_ItemPositionInt_0= ruleItemPositionInt | this_ItemPositionString_1= ruleItemPositionString ) )
            // InternalCinEditor.g:404:2: (this_ItemPositionInt_0= ruleItemPositionInt | this_ItemPositionString_1= ruleItemPositionString )
            {
            // InternalCinEditor.g:404:2: (this_ItemPositionInt_0= ruleItemPositionInt | this_ItemPositionString_1= ruleItemPositionString )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||LA6_0==26) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=18 && LA6_0<=22)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCinEditor.g:405:3: this_ItemPositionInt_0= ruleItemPositionInt
                    {

                    			newCompositeNode(grammarAccess.getItemPositionAccess().getItemPositionIntParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemPositionInt_0=ruleItemPositionInt();

                    state._fsp--;


                    			current = this_ItemPositionInt_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:414:3: this_ItemPositionString_1= ruleItemPositionString
                    {

                    			newCompositeNode(grammarAccess.getItemPositionAccess().getItemPositionStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ItemPositionString_1=ruleItemPositionString();

                    state._fsp--;


                    			current = this_ItemPositionString_1;
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
    // $ANTLR end "ruleItemPosition"


    // $ANTLR start "entryRuleItemPositionInt"
    // InternalCinEditor.g:426:1: entryRuleItemPositionInt returns [EObject current=null] : iv_ruleItemPositionInt= ruleItemPositionInt EOF ;
    public final EObject entryRuleItemPositionInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemPositionInt = null;


        try {
            // InternalCinEditor.g:426:56: (iv_ruleItemPositionInt= ruleItemPositionInt EOF )
            // InternalCinEditor.g:427:2: iv_ruleItemPositionInt= ruleItemPositionInt EOF
            {
             newCompositeNode(grammarAccess.getItemPositionIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemPositionInt=ruleItemPositionInt();

            state._fsp--;

             current =iv_ruleItemPositionInt; 
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
    // $ANTLR end "entryRuleItemPositionInt"


    // $ANTLR start "ruleItemPositionInt"
    // InternalCinEditor.g:433:1: ruleItemPositionInt returns [EObject current=null] : ( (lv_position_0_0= ruleEInt ) ) ;
    public final EObject ruleItemPositionInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_position_0_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:439:2: ( ( (lv_position_0_0= ruleEInt ) ) )
            // InternalCinEditor.g:440:2: ( (lv_position_0_0= ruleEInt ) )
            {
            // InternalCinEditor.g:440:2: ( (lv_position_0_0= ruleEInt ) )
            // InternalCinEditor.g:441:3: (lv_position_0_0= ruleEInt )
            {
            // InternalCinEditor.g:441:3: (lv_position_0_0= ruleEInt )
            // InternalCinEditor.g:442:4: lv_position_0_0= ruleEInt
            {

            				newCompositeNode(grammarAccess.getItemPositionIntAccess().getPositionEIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_position_0_0=ruleEInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getItemPositionIntRule());
            				}
            				set(
            					current,
            					"position",
            					lv_position_0_0,
            					"polytech.spaceteam.cineditor.CinEditor.EInt");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleItemPositionInt"


    // $ANTLR start "entryRuleItemPositionString"
    // InternalCinEditor.g:462:1: entryRuleItemPositionString returns [EObject current=null] : iv_ruleItemPositionString= ruleItemPositionString EOF ;
    public final EObject entryRuleItemPositionString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemPositionString = null;


        try {
            // InternalCinEditor.g:462:59: (iv_ruleItemPositionString= ruleItemPositionString EOF )
            // InternalCinEditor.g:463:2: iv_ruleItemPositionString= ruleItemPositionString EOF
            {
             newCompositeNode(grammarAccess.getItemPositionStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItemPositionString=ruleItemPositionString();

            state._fsp--;

             current =iv_ruleItemPositionString; 
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
    // $ANTLR end "entryRuleItemPositionString"


    // $ANTLR start "ruleItemPositionString"
    // InternalCinEditor.g:469:1: ruleItemPositionString returns [EObject current=null] : ( ( (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' ) ) ) ;
    public final EObject ruleItemPositionString() throws RecognitionException {
        EObject current = null;

        Token lv_position_0_1=null;
        Token lv_position_0_2=null;
        Token lv_position_0_3=null;
        Token lv_position_0_4=null;
        Token lv_position_0_5=null;


        	enterRule();

        try {
            // InternalCinEditor.g:475:2: ( ( ( (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' ) ) ) )
            // InternalCinEditor.g:476:2: ( ( (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' ) ) )
            {
            // InternalCinEditor.g:476:2: ( ( (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' ) ) )
            // InternalCinEditor.g:477:3: ( (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' ) )
            {
            // InternalCinEditor.g:477:3: ( (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' ) )
            // InternalCinEditor.g:478:4: (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' )
            {
            // InternalCinEditor.g:478:4: (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 21:
                {
                alt7=4;
                }
                break;
            case 22:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCinEditor.g:479:5: lv_position_0_1= 'center'
                    {
                    lv_position_0_1=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_position_0_1, grammarAccess.getItemPositionStringAccess().getPositionCenterKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getItemPositionStringRule());
                    					}
                    					setWithLastConsumed(current, "position", lv_position_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:490:5: lv_position_0_2= 'left'
                    {
                    lv_position_0_2=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_position_0_2, grammarAccess.getItemPositionStringAccess().getPositionLeftKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getItemPositionStringRule());
                    					}
                    					setWithLastConsumed(current, "position", lv_position_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalCinEditor.g:501:5: lv_position_0_3= 'right'
                    {
                    lv_position_0_3=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_position_0_3, grammarAccess.getItemPositionStringAccess().getPositionRightKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getItemPositionStringRule());
                    					}
                    					setWithLastConsumed(current, "position", lv_position_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalCinEditor.g:512:5: lv_position_0_4= 'bottom'
                    {
                    lv_position_0_4=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_position_0_4, grammarAccess.getItemPositionStringAccess().getPositionBottomKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getItemPositionStringRule());
                    					}
                    					setWithLastConsumed(current, "position", lv_position_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalCinEditor.g:523:5: lv_position_0_5= 'top'
                    {
                    lv_position_0_5=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_position_0_5, grammarAccess.getItemPositionStringAccess().getPositionTopKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getItemPositionStringRule());
                    					}
                    					setWithLastConsumed(current, "position", lv_position_0_5, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleItemPositionString"


    // $ANTLR start "entryRuleDimension"
    // InternalCinEditor.g:539:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // InternalCinEditor.g:539:50: (iv_ruleDimension= ruleDimension EOF )
            // InternalCinEditor.g:540:2: iv_ruleDimension= ruleDimension EOF
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
    // InternalCinEditor.g:546:1: ruleDimension returns [EObject current=null] : (otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) ) ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_width_1_0 = null;

        AntlrDatatypeRuleToken lv_height_3_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:552:2: ( (otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) ) ) )
            // InternalCinEditor.g:553:2: (otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) ) )
            {
            // InternalCinEditor.g:553:2: (otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) ) )
            // InternalCinEditor.g:554:3: otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionAccess().getDimensionKeyword_0());
            		
            // InternalCinEditor.g:558:3: ( (lv_width_1_0= ruleEInt ) )
            // InternalCinEditor.g:559:4: (lv_width_1_0= ruleEInt )
            {
            // InternalCinEditor.g:559:4: (lv_width_1_0= ruleEInt )
            // InternalCinEditor.g:560:5: lv_width_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDimensionAccess().getWidthEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDimensionAccess().getXKeyword_2());
            		
            // InternalCinEditor.g:581:3: ( (lv_height_3_0= ruleEInt ) )
            // InternalCinEditor.g:582:4: (lv_height_3_0= ruleEInt )
            {
            // InternalCinEditor.g:582:4: (lv_height_3_0= ruleEInt )
            // InternalCinEditor.g:583:5: lv_height_3_0= ruleEInt
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
    // InternalCinEditor.g:604:1: entryRuleHexadecimalColor returns [EObject current=null] : iv_ruleHexadecimalColor= ruleHexadecimalColor EOF ;
    public final EObject entryRuleHexadecimalColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexadecimalColor = null;


        try {
            // InternalCinEditor.g:604:57: (iv_ruleHexadecimalColor= ruleHexadecimalColor EOF )
            // InternalCinEditor.g:605:2: iv_ruleHexadecimalColor= ruleHexadecimalColor EOF
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
    // InternalCinEditor.g:611:1: ruleHexadecimalColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) ) ) ;
    public final EObject ruleHexadecimalColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_hexadecimalValue_1_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:617:2: ( (otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) ) ) )
            // InternalCinEditor.g:618:2: (otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) ) )
            {
            // InternalCinEditor.g:618:2: (otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) ) )
            // InternalCinEditor.g:619:3: otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHexadecimalColorAccess().getColorKeyword_0());
            		
            // InternalCinEditor.g:623:3: ( (lv_hexadecimalValue_1_0= ruleEString ) )
            // InternalCinEditor.g:624:4: (lv_hexadecimalValue_1_0= ruleEString )
            {
            // InternalCinEditor.g:624:4: (lv_hexadecimalValue_1_0= ruleEString )
            // InternalCinEditor.g:625:5: lv_hexadecimalValue_1_0= ruleEString
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


    // $ANTLR start "entryRuleGraphicalElement"
    // InternalCinEditor.g:646:1: entryRuleGraphicalElement returns [EObject current=null] : iv_ruleGraphicalElement= ruleGraphicalElement EOF ;
    public final EObject entryRuleGraphicalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicalElement = null;


        try {
            // InternalCinEditor.g:646:57: (iv_ruleGraphicalElement= ruleGraphicalElement EOF )
            // InternalCinEditor.g:647:2: iv_ruleGraphicalElement= ruleGraphicalElement EOF
            {
             newCompositeNode(grammarAccess.getGraphicalElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphicalElement=ruleGraphicalElement();

            state._fsp--;

             current =iv_ruleGraphicalElement; 
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
    // $ANTLR end "entryRuleGraphicalElement"


    // $ANTLR start "ruleGraphicalElement"
    // InternalCinEditor.g:653:1: ruleGraphicalElement returns [EObject current=null] : (this_Text_0= ruleText | this_Video_1= ruleVideo | this_Picture_2= rulePicture | this_Rectangle_3= ruleRectangle ) ;
    public final EObject ruleGraphicalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_Video_1 = null;

        EObject this_Picture_2 = null;

        EObject this_Rectangle_3 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:659:2: ( (this_Text_0= ruleText | this_Video_1= ruleVideo | this_Picture_2= rulePicture | this_Rectangle_3= ruleRectangle ) )
            // InternalCinEditor.g:660:2: (this_Text_0= ruleText | this_Video_1= ruleVideo | this_Picture_2= rulePicture | this_Rectangle_3= ruleRectangle )
            {
            // InternalCinEditor.g:660:2: (this_Text_0= ruleText | this_Video_1= ruleVideo | this_Picture_2= rulePicture | this_Rectangle_3= ruleRectangle )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt8=1;
                }
                break;
            case 39:
                {
                alt8=2;
                }
                break;
            case 38:
                {
                alt8=3;
                }
                break;
            case 41:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCinEditor.g:661:3: this_Text_0= ruleText
                    {

                    			newCompositeNode(grammarAccess.getGraphicalElementAccess().getTextParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_0=ruleText();

                    state._fsp--;


                    			current = this_Text_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:670:3: this_Video_1= ruleVideo
                    {

                    			newCompositeNode(grammarAccess.getGraphicalElementAccess().getVideoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Video_1=ruleVideo();

                    state._fsp--;


                    			current = this_Video_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCinEditor.g:679:3: this_Picture_2= rulePicture
                    {

                    			newCompositeNode(grammarAccess.getGraphicalElementAccess().getPictureParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Picture_2=rulePicture();

                    state._fsp--;


                    			current = this_Picture_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCinEditor.g:688:3: this_Rectangle_3= ruleRectangle
                    {

                    			newCompositeNode(grammarAccess.getGraphicalElementAccess().getRectangleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rectangle_3=ruleRectangle();

                    state._fsp--;


                    			current = this_Rectangle_3;
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
    // $ANTLR end "ruleGraphicalElement"


    // $ANTLR start "entryRuleEInt"
    // InternalCinEditor.g:700:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalCinEditor.g:700:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalCinEditor.g:701:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalCinEditor.g:707:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCinEditor.g:713:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalCinEditor.g:714:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalCinEditor.g:714:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalCinEditor.g:715:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalCinEditor.g:715:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCinEditor.g:716:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_15); 

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


    // $ANTLR start "entryRuleEFloat"
    // InternalCinEditor.g:733:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalCinEditor.g:733:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalCinEditor.g:734:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalCinEditor.g:740:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalCinEditor.g:746:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_4= RULE_INT )? ) )
            // InternalCinEditor.g:747:2: ( (kw= '-' )? this_INT_1= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_4= RULE_INT )? )
            {
            // InternalCinEditor.g:747:2: ( (kw= '-' )? this_INT_1= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_4= RULE_INT )? )
            // InternalCinEditor.g:748:3: (kw= '-' )? this_INT_1= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_4= RULE_INT )?
            {
            // InternalCinEditor.g:748:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCinEditor.g:749:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_16); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
            		
            // InternalCinEditor.g:762:3: ( (kw= '.' | kw= ',' ) this_INT_4= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16||LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCinEditor.g:763:4: (kw= '.' | kw= ',' ) this_INT_4= RULE_INT
                    {
                    // InternalCinEditor.g:763:4: (kw= '.' | kw= ',' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==27) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==16) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalCinEditor.g:764:5: kw= '.'
                            {
                            kw=(Token)match(input,27,FOLLOW_15); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalCinEditor.g:770:5: kw= ','
                            {
                            kw=(Token)match(input,16,FOLLOW_15); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getCommaKeyword_2_0_1());
                            				

                            }
                            break;

                    }

                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_4);
                    			

                    				newLeafNode(this_INT_4, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2_1());
                    			

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleAudioElement"
    // InternalCinEditor.g:788:1: entryRuleAudioElement returns [EObject current=null] : iv_ruleAudioElement= ruleAudioElement EOF ;
    public final EObject entryRuleAudioElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioElement = null;


        try {
            // InternalCinEditor.g:788:53: (iv_ruleAudioElement= ruleAudioElement EOF )
            // InternalCinEditor.g:789:2: iv_ruleAudioElement= ruleAudioElement EOF
            {
             newCompositeNode(grammarAccess.getAudioElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAudioElement=ruleAudioElement();

            state._fsp--;

             current =iv_ruleAudioElement; 
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
    // $ANTLR end "entryRuleAudioElement"


    // $ANTLR start "ruleAudioElement"
    // InternalCinEditor.g:795:1: ruleAudioElement returns [EObject current=null] : (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'volume' ( (lv_volume_5_0= ruleEFloat ) ) )? (otherlv_6= 'fadeIn' ( (lv_fadeIn_7_0= ruleEInt ) ) )? (otherlv_8= 'fadeOut' ( (lv_fadeOut_9_0= ruleEInt ) ) )? (otherlv_10= 'at' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )? otherlv_14= 'on' ( (otherlv_15= RULE_ID ) ) ) ;
    public final EObject ruleAudioElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_url_3_0 = null;

        AntlrDatatypeRuleToken lv_volume_5_0 = null;

        AntlrDatatypeRuleToken lv_fadeIn_7_0 = null;

        AntlrDatatypeRuleToken lv_fadeOut_9_0 = null;

        AntlrDatatypeRuleToken lv_beginTime_11_0 = null;

        AntlrDatatypeRuleToken lv_duration_13_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:801:2: ( (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'volume' ( (lv_volume_5_0= ruleEFloat ) ) )? (otherlv_6= 'fadeIn' ( (lv_fadeIn_7_0= ruleEInt ) ) )? (otherlv_8= 'fadeOut' ( (lv_fadeOut_9_0= ruleEInt ) ) )? (otherlv_10= 'at' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )? otherlv_14= 'on' ( (otherlv_15= RULE_ID ) ) ) )
            // InternalCinEditor.g:802:2: (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'volume' ( (lv_volume_5_0= ruleEFloat ) ) )? (otherlv_6= 'fadeIn' ( (lv_fadeIn_7_0= ruleEInt ) ) )? (otherlv_8= 'fadeOut' ( (lv_fadeOut_9_0= ruleEInt ) ) )? (otherlv_10= 'at' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )? otherlv_14= 'on' ( (otherlv_15= RULE_ID ) ) )
            {
            // InternalCinEditor.g:802:2: (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'volume' ( (lv_volume_5_0= ruleEFloat ) ) )? (otherlv_6= 'fadeIn' ( (lv_fadeIn_7_0= ruleEInt ) ) )? (otherlv_8= 'fadeOut' ( (lv_fadeOut_9_0= ruleEInt ) ) )? (otherlv_10= 'at' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )? otherlv_14= 'on' ( (otherlv_15= RULE_ID ) ) )
            // InternalCinEditor.g:803:3: otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'volume' ( (lv_volume_5_0= ruleEFloat ) ) )? (otherlv_6= 'fadeIn' ( (lv_fadeIn_7_0= ruleEInt ) ) )? (otherlv_8= 'fadeOut' ( (lv_fadeOut_9_0= ruleEInt ) ) )? (otherlv_10= 'at' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )? otherlv_14= 'on' ( (otherlv_15= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAudioElementAccess().getAudioKeyword_0());
            		
            // InternalCinEditor.g:807:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:808:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:808:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:809:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAudioElementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAudioElementAccess().getEqualsSignKeyword_2());
            		
            // InternalCinEditor.g:830:3: ( (lv_url_3_0= ruleEString ) )
            // InternalCinEditor.g:831:4: (lv_url_3_0= ruleEString )
            {
            // InternalCinEditor.g:831:4: (lv_url_3_0= ruleEString )
            // InternalCinEditor.g:832:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAudioElementAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_url_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioElementRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCinEditor.g:849:3: (otherlv_4= 'volume' ( (lv_volume_5_0= ruleEFloat ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCinEditor.g:850:4: otherlv_4= 'volume' ( (lv_volume_5_0= ruleEFloat ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAudioElementAccess().getVolumeKeyword_4_0());
                    			
                    // InternalCinEditor.g:854:4: ( (lv_volume_5_0= ruleEFloat ) )
                    // InternalCinEditor.g:855:5: (lv_volume_5_0= ruleEFloat )
                    {
                    // InternalCinEditor.g:855:5: (lv_volume_5_0= ruleEFloat )
                    // InternalCinEditor.g:856:6: lv_volume_5_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getAudioElementAccess().getVolumeEFloatParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_volume_5_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioElementRule());
                    						}
                    						set(
                    							current,
                    							"volume",
                    							lv_volume_5_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:874:3: (otherlv_6= 'fadeIn' ( (lv_fadeIn_7_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCinEditor.g:875:4: otherlv_6= 'fadeIn' ( (lv_fadeIn_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getAudioElementAccess().getFadeInKeyword_5_0());
                    			
                    // InternalCinEditor.g:879:4: ( (lv_fadeIn_7_0= ruleEInt ) )
                    // InternalCinEditor.g:880:5: (lv_fadeIn_7_0= ruleEInt )
                    {
                    // InternalCinEditor.g:880:5: (lv_fadeIn_7_0= ruleEInt )
                    // InternalCinEditor.g:881:6: lv_fadeIn_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAudioElementAccess().getFadeInEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_fadeIn_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioElementRule());
                    						}
                    						set(
                    							current,
                    							"fadeIn",
                    							lv_fadeIn_7_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:899:3: (otherlv_8= 'fadeOut' ( (lv_fadeOut_9_0= ruleEInt ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCinEditor.g:900:4: otherlv_8= 'fadeOut' ( (lv_fadeOut_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getAudioElementAccess().getFadeOutKeyword_6_0());
                    			
                    // InternalCinEditor.g:904:4: ( (lv_fadeOut_9_0= ruleEInt ) )
                    // InternalCinEditor.g:905:5: (lv_fadeOut_9_0= ruleEInt )
                    {
                    // InternalCinEditor.g:905:5: (lv_fadeOut_9_0= ruleEInt )
                    // InternalCinEditor.g:906:6: lv_fadeOut_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAudioElementAccess().getFadeOutEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_fadeOut_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioElementRule());
                    						}
                    						set(
                    							current,
                    							"fadeOut",
                    							lv_fadeOut_9_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:924:3: (otherlv_10= 'at' ( (lv_beginTime_11_0= ruleEInt ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCinEditor.g:925:4: otherlv_10= 'at' ( (lv_beginTime_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getAudioElementAccess().getAtKeyword_7_0());
                    			
                    // InternalCinEditor.g:929:4: ( (lv_beginTime_11_0= ruleEInt ) )
                    // InternalCinEditor.g:930:5: (lv_beginTime_11_0= ruleEInt )
                    {
                    // InternalCinEditor.g:930:5: (lv_beginTime_11_0= ruleEInt )
                    // InternalCinEditor.g:931:6: lv_beginTime_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAudioElementAccess().getBeginTimeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_beginTime_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioElementRule());
                    						}
                    						set(
                    							current,
                    							"beginTime",
                    							lv_beginTime_11_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:949:3: (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCinEditor.g:950:4: otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getAudioElementAccess().getDuringKeyword_8_0());
                    			
                    // InternalCinEditor.g:954:4: ( (lv_duration_13_0= ruleEInt ) )
                    // InternalCinEditor.g:955:5: (lv_duration_13_0= ruleEInt )
                    {
                    // InternalCinEditor.g:955:5: (lv_duration_13_0= ruleEInt )
                    // InternalCinEditor.g:956:6: lv_duration_13_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAudioElementAccess().getDurationEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_duration_13_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioElementRule());
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

            otherlv_14=(Token)match(input,35,FOLLOW_24); 

            			newLeafNode(otherlv_14, grammarAccess.getAudioElementAccess().getOnKeyword_9());
            		
            // InternalCinEditor.g:978:3: ( (otherlv_15= RULE_ID ) )
            // InternalCinEditor.g:979:4: (otherlv_15= RULE_ID )
            {
            // InternalCinEditor.g:979:4: (otherlv_15= RULE_ID )
            // InternalCinEditor.g:980:5: otherlv_15= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAudioElementRule());
            					}
            				
            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_15, grammarAccess.getAudioElementAccess().getElementGraphicalElementCrossReference_10_0());
            				

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
    // $ANTLR end "ruleAudioElement"


    // $ANTLR start "entryRuleText"
    // InternalCinEditor.g:995:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalCinEditor.g:995:45: (iv_ruleText= ruleText EOF )
            // InternalCinEditor.g:996:2: iv_ruleText= ruleText EOF
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
    // InternalCinEditor.g:1002:1: ruleText returns [EObject current=null] : (otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? (otherlv_7= 'at' ( (lv_beginTime_8_0= ruleEInt ) ) )? (otherlv_9= 'during' ( (lv_duration_10_0= ruleEInt ) ) )? ( (lv_color_11_0= ruleHexadecimalColor ) ) ) ;
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
            // InternalCinEditor.g:1008:2: ( (otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? (otherlv_7= 'at' ( (lv_beginTime_8_0= ruleEInt ) ) )? (otherlv_9= 'during' ( (lv_duration_10_0= ruleEInt ) ) )? ( (lv_color_11_0= ruleHexadecimalColor ) ) ) )
            // InternalCinEditor.g:1009:2: (otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? (otherlv_7= 'at' ( (lv_beginTime_8_0= ruleEInt ) ) )? (otherlv_9= 'during' ( (lv_duration_10_0= ruleEInt ) ) )? ( (lv_color_11_0= ruleHexadecimalColor ) ) )
            {
            // InternalCinEditor.g:1009:2: (otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? (otherlv_7= 'at' ( (lv_beginTime_8_0= ruleEInt ) ) )? (otherlv_9= 'during' ( (lv_duration_10_0= ruleEInt ) ) )? ( (lv_color_11_0= ruleHexadecimalColor ) ) )
            // InternalCinEditor.g:1010:3: otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? (otherlv_7= 'at' ( (lv_beginTime_8_0= ruleEInt ) ) )? (otherlv_9= 'during' ( (lv_duration_10_0= ruleEInt ) ) )? ( (lv_color_11_0= ruleHexadecimalColor ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
            		
            // InternalCinEditor.g:1014:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1015:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1015:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1016:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTextAccess().getEqualsSignKeyword_2());
            		
            // InternalCinEditor.g:1037:3: ( (lv_text_3_0= ruleEString ) )
            // InternalCinEditor.g:1038:4: (lv_text_3_0= ruleEString )
            {
            // InternalCinEditor.g:1038:4: (lv_text_3_0= ruleEString )
            // InternalCinEditor.g:1039:5: lv_text_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTextAccess().getTextEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalCinEditor.g:1056:3: (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCinEditor.g:1057:4: otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextAccess().getFontSizeKeyword_4_0());
                    			
                    // InternalCinEditor.g:1061:4: ( (lv_fontSize_5_0= ruleEInt ) )
                    // InternalCinEditor.g:1062:5: (lv_fontSize_5_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1062:5: (lv_fontSize_5_0= ruleEInt )
                    // InternalCinEditor.g:1063:6: lv_fontSize_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAccess().getFontSizeEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
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

            // InternalCinEditor.g:1081:3: ( (lv_position_6_0= rulePosition ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCinEditor.g:1082:4: (lv_position_6_0= rulePosition )
                    {
                    // InternalCinEditor.g:1082:4: (lv_position_6_0= rulePosition )
                    // InternalCinEditor.g:1083:5: lv_position_6_0= rulePosition
                    {

                    					newCompositeNode(grammarAccess.getTextAccess().getPositionPositionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_25);
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

            // InternalCinEditor.g:1100:3: (otherlv_7= 'at' ( (lv_beginTime_8_0= ruleEInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCinEditor.g:1101:4: otherlv_7= 'at' ( (lv_beginTime_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getTextAccess().getAtKeyword_6_0());
                    			
                    // InternalCinEditor.g:1105:4: ( (lv_beginTime_8_0= ruleEInt ) )
                    // InternalCinEditor.g:1106:5: (lv_beginTime_8_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1106:5: (lv_beginTime_8_0= ruleEInt )
                    // InternalCinEditor.g:1107:6: lv_beginTime_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAccess().getBeginTimeEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_25);
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


                    }
                    break;

            }

            // InternalCinEditor.g:1125:3: (otherlv_9= 'during' ( (lv_duration_10_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCinEditor.g:1126:4: otherlv_9= 'during' ( (lv_duration_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getTextAccess().getDuringKeyword_7_0());
                    			
                    // InternalCinEditor.g:1130:4: ( (lv_duration_10_0= ruleEInt ) )
                    // InternalCinEditor.g:1131:5: (lv_duration_10_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1131:5: (lv_duration_10_0= ruleEInt )
                    // InternalCinEditor.g:1132:6: lv_duration_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAccess().getDurationEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_25);
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

            // InternalCinEditor.g:1150:3: ( (lv_color_11_0= ruleHexadecimalColor ) )
            // InternalCinEditor.g:1151:4: (lv_color_11_0= ruleHexadecimalColor )
            {
            // InternalCinEditor.g:1151:4: (lv_color_11_0= ruleHexadecimalColor )
            // InternalCinEditor.g:1152:5: lv_color_11_0= ruleHexadecimalColor
            {

            					newCompositeNode(grammarAccess.getTextAccess().getColorHexadecimalColorParserRuleCall_8_0());
            				
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
    // InternalCinEditor.g:1173:1: entryRulePicture returns [EObject current=null] : iv_rulePicture= rulePicture EOF ;
    public final EObject entryRulePicture() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePicture = null;


        try {
            // InternalCinEditor.g:1173:48: (iv_rulePicture= rulePicture EOF )
            // InternalCinEditor.g:1174:2: iv_rulePicture= rulePicture EOF
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
    // InternalCinEditor.g:1180:1: rulePicture returns [EObject current=null] : (otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) )? (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )? ) ;
    public final EObject rulePicture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_url_3_0 = null;

        EObject lv_position_4_0 = null;

        EObject lv_dimension_5_0 = null;

        AntlrDatatypeRuleToken lv_beginTime_7_0 = null;

        AntlrDatatypeRuleToken lv_duration_9_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:1186:2: ( (otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) )? (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )? ) )
            // InternalCinEditor.g:1187:2: (otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) )? (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )? )
            {
            // InternalCinEditor.g:1187:2: (otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) )? (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )? )
            // InternalCinEditor.g:1188:3: otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) )? (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPictureAccess().getPictureKeyword_0());
            		
            // InternalCinEditor.g:1192:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1193:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1193:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1194:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPictureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPictureAccess().getEqualsSignKeyword_2());
            		
            // InternalCinEditor.g:1215:3: ( (lv_url_3_0= ruleEString ) )
            // InternalCinEditor.g:1216:4: (lv_url_3_0= ruleEString )
            {
            // InternalCinEditor.g:1216:4: (lv_url_3_0= ruleEString )
            // InternalCinEditor.g:1217:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPictureAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_url_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPictureRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCinEditor.g:1234:3: ( (lv_position_4_0= rulePosition ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCinEditor.g:1235:4: (lv_position_4_0= rulePosition )
                    {
                    // InternalCinEditor.g:1235:4: (lv_position_4_0= rulePosition )
                    // InternalCinEditor.g:1236:5: lv_position_4_0= rulePosition
                    {

                    					newCompositeNode(grammarAccess.getPictureAccess().getPositionPositionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_position_4_0=rulePosition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPictureRule());
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

            // InternalCinEditor.g:1253:3: ( (lv_dimension_5_0= ruleDimension ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCinEditor.g:1254:4: (lv_dimension_5_0= ruleDimension )
                    {
                    // InternalCinEditor.g:1254:4: (lv_dimension_5_0= ruleDimension )
                    // InternalCinEditor.g:1255:5: lv_dimension_5_0= ruleDimension
                    {

                    					newCompositeNode(grammarAccess.getPictureAccess().getDimensionDimensionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_dimension_5_0=ruleDimension();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPictureRule());
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

            // InternalCinEditor.g:1272:3: (otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCinEditor.g:1273:4: otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getPictureAccess().getAtKeyword_6_0());
                    			
                    // InternalCinEditor.g:1277:4: ( (lv_beginTime_7_0= ruleEInt ) )
                    // InternalCinEditor.g:1278:5: (lv_beginTime_7_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1278:5: (lv_beginTime_7_0= ruleEInt )
                    // InternalCinEditor.g:1279:6: lv_beginTime_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPictureAccess().getBeginTimeEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_beginTime_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPictureRule());
                    						}
                    						set(
                    							current,
                    							"beginTime",
                    							lv_beginTime_7_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:1297:3: (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCinEditor.g:1298:4: otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getPictureAccess().getDuringKeyword_7_0());
                    			
                    // InternalCinEditor.g:1302:4: ( (lv_duration_9_0= ruleEInt ) )
                    // InternalCinEditor.g:1303:5: (lv_duration_9_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1303:5: (lv_duration_9_0= ruleEInt )
                    // InternalCinEditor.g:1304:6: lv_duration_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPictureAccess().getDurationEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_duration_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPictureRule());
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
    // $ANTLR end "rulePicture"


    // $ANTLR start "entryRuleVideo"
    // InternalCinEditor.g:1326:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalCinEditor.g:1326:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalCinEditor.g:1327:2: iv_ruleVideo= ruleVideo EOF
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
    // InternalCinEditor.g:1333:1: ruleVideo returns [EObject current=null] : (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'from' ( (lv_beginCropTime_5_0= ruleEInt ) ) ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? (otherlv_8= 'at' ( (lv_beginTime_9_0= ruleEInt ) ) )? (otherlv_10= 'during' ( (lv_duration_11_0= ruleEInt ) ) )? ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_url_3_0 = null;

        AntlrDatatypeRuleToken lv_beginCropTime_5_0 = null;

        EObject lv_position_6_0 = null;

        EObject lv_dimension_7_0 = null;

        AntlrDatatypeRuleToken lv_beginTime_9_0 = null;

        AntlrDatatypeRuleToken lv_duration_11_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:1339:2: ( (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'from' ( (lv_beginCropTime_5_0= ruleEInt ) ) ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? (otherlv_8= 'at' ( (lv_beginTime_9_0= ruleEInt ) ) )? (otherlv_10= 'during' ( (lv_duration_11_0= ruleEInt ) ) )? ) )
            // InternalCinEditor.g:1340:2: (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'from' ( (lv_beginCropTime_5_0= ruleEInt ) ) ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? (otherlv_8= 'at' ( (lv_beginTime_9_0= ruleEInt ) ) )? (otherlv_10= 'during' ( (lv_duration_11_0= ruleEInt ) ) )? )
            {
            // InternalCinEditor.g:1340:2: (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'from' ( (lv_beginCropTime_5_0= ruleEInt ) ) ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? (otherlv_8= 'at' ( (lv_beginTime_9_0= ruleEInt ) ) )? (otherlv_10= 'during' ( (lv_duration_11_0= ruleEInt ) ) )? )
            // InternalCinEditor.g:1341:3: otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) otherlv_4= 'from' ( (lv_beginCropTime_5_0= ruleEInt ) ) ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? (otherlv_8= 'at' ( (lv_beginTime_9_0= ruleEInt ) ) )? (otherlv_10= 'during' ( (lv_duration_11_0= ruleEInt ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoAccess().getVideoKeyword_0());
            		
            // InternalCinEditor.g:1345:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1346:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1346:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1347:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getVideoAccess().getEqualsSignKeyword_2());
            		
            // InternalCinEditor.g:1368:3: ( (lv_url_3_0= ruleEString ) )
            // InternalCinEditor.g:1369:4: (lv_url_3_0= ruleEString )
            {
            // InternalCinEditor.g:1369:4: (lv_url_3_0= ruleEString )
            // InternalCinEditor.g:1370:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_url_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"polytech.spaceteam.cineditor.CinEditor.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getVideoAccess().getFromKeyword_4());
            		
            // InternalCinEditor.g:1391:3: ( (lv_beginCropTime_5_0= ruleEInt ) )
            // InternalCinEditor.g:1392:4: (lv_beginCropTime_5_0= ruleEInt )
            {
            // InternalCinEditor.g:1392:4: (lv_beginCropTime_5_0= ruleEInt )
            // InternalCinEditor.g:1393:5: lv_beginCropTime_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getBeginCropTimeEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
            lv_beginCropTime_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					set(
            						current,
            						"beginCropTime",
            						lv_beginCropTime_5_0,
            						"polytech.spaceteam.cineditor.CinEditor.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCinEditor.g:1410:3: ( (lv_position_6_0= rulePosition ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==14) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCinEditor.g:1411:4: (lv_position_6_0= rulePosition )
                    {
                    // InternalCinEditor.g:1411:4: (lv_position_6_0= rulePosition )
                    // InternalCinEditor.g:1412:5: lv_position_6_0= rulePosition
                    {

                    					newCompositeNode(grammarAccess.getVideoAccess().getPositionPositionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_position_6_0=rulePosition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVideoRule());
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

            // InternalCinEditor.g:1429:3: ( (lv_dimension_7_0= ruleDimension ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCinEditor.g:1430:4: (lv_dimension_7_0= ruleDimension )
                    {
                    // InternalCinEditor.g:1430:4: (lv_dimension_7_0= ruleDimension )
                    // InternalCinEditor.g:1431:5: lv_dimension_7_0= ruleDimension
                    {

                    					newCompositeNode(grammarAccess.getVideoAccess().getDimensionDimensionParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_dimension_7_0=ruleDimension();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVideoRule());
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

            // InternalCinEditor.g:1448:3: (otherlv_8= 'at' ( (lv_beginTime_9_0= ruleEInt ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCinEditor.g:1449:4: otherlv_8= 'at' ( (lv_beginTime_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getVideoAccess().getAtKeyword_8_0());
                    			
                    // InternalCinEditor.g:1453:4: ( (lv_beginTime_9_0= ruleEInt ) )
                    // InternalCinEditor.g:1454:5: (lv_beginTime_9_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1454:5: (lv_beginTime_9_0= ruleEInt )
                    // InternalCinEditor.g:1455:6: lv_beginTime_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getBeginTimeEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_beginTime_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"beginTime",
                    							lv_beginTime_9_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:1473:3: (otherlv_10= 'during' ( (lv_duration_11_0= ruleEInt ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCinEditor.g:1474:4: otherlv_10= 'during' ( (lv_duration_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getVideoAccess().getDuringKeyword_9_0());
                    			
                    // InternalCinEditor.g:1478:4: ( (lv_duration_11_0= ruleEInt ) )
                    // InternalCinEditor.g:1479:5: (lv_duration_11_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1479:5: (lv_duration_11_0= ruleEInt )
                    // InternalCinEditor.g:1480:6: lv_duration_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getDurationEIntParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_duration_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
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
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleRectangle"
    // InternalCinEditor.g:1502:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // InternalCinEditor.g:1502:50: (iv_ruleRectangle= ruleRectangle EOF )
            // InternalCinEditor.g:1503:2: iv_ruleRectangle= ruleRectangle EOF
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
    // InternalCinEditor.g:1509:1: ruleRectangle returns [EObject current=null] : (otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) )? (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )? ) ;
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
            // InternalCinEditor.g:1515:2: ( (otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) )? (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )? ) )
            // InternalCinEditor.g:1516:2: (otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) )? (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )? )
            {
            // InternalCinEditor.g:1516:2: (otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) )? (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )? )
            // InternalCinEditor.g:1517:3: otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) )? (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRectangleAccess().getRectangleKeyword_0());
            		
            // InternalCinEditor.g:1521:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1522:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1522:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1523:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRectangleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,29,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getRectangleAccess().getEqualsSignKeyword_2());
            		
            // InternalCinEditor.g:1544:3: ( (lv_color_3_0= ruleHexadecimalColor ) )
            // InternalCinEditor.g:1545:4: (lv_color_3_0= ruleHexadecimalColor )
            {
            // InternalCinEditor.g:1545:4: (lv_color_3_0= ruleHexadecimalColor )
            // InternalCinEditor.g:1546:5: lv_color_3_0= ruleHexadecimalColor
            {

            					newCompositeNode(grammarAccess.getRectangleAccess().getColorHexadecimalColorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalCinEditor.g:1563:3: ( (lv_position_4_0= rulePosition ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCinEditor.g:1564:4: (lv_position_4_0= rulePosition )
                    {
                    // InternalCinEditor.g:1564:4: (lv_position_4_0= rulePosition )
                    // InternalCinEditor.g:1565:5: lv_position_4_0= rulePosition
                    {

                    					newCompositeNode(grammarAccess.getRectangleAccess().getPositionPositionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_27);
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

            // InternalCinEditor.g:1582:3: ( (lv_dimension_5_0= ruleDimension ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCinEditor.g:1583:4: (lv_dimension_5_0= ruleDimension )
                    {
                    // InternalCinEditor.g:1583:4: (lv_dimension_5_0= ruleDimension )
                    // InternalCinEditor.g:1584:5: lv_dimension_5_0= ruleDimension
                    {

                    					newCompositeNode(grammarAccess.getRectangleAccess().getDimensionDimensionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_28);
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

            // InternalCinEditor.g:1601:3: (otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCinEditor.g:1602:4: otherlv_6= 'at' ( (lv_beginTime_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getRectangleAccess().getAtKeyword_6_0());
                    			
                    // InternalCinEditor.g:1606:4: ( (lv_beginTime_7_0= ruleEInt ) )
                    // InternalCinEditor.g:1607:5: (lv_beginTime_7_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1607:5: (lv_beginTime_7_0= ruleEInt )
                    // InternalCinEditor.g:1608:6: lv_beginTime_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRectangleAccess().getBeginTimeEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
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


                    }
                    break;

            }

            // InternalCinEditor.g:1626:3: (otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCinEditor.g:1627:4: otherlv_8= 'during' ( (lv_duration_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getRectangleAccess().getDuringKeyword_7_0());
                    			
                    // InternalCinEditor.g:1631:4: ( (lv_duration_9_0= ruleEInt ) )
                    // InternalCinEditor.g:1632:5: (lv_duration_9_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1632:5: (lv_duration_9_0= ruleEInt )
                    // InternalCinEditor.g:1633:6: lv_duration_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRectangleAccess().getDurationEIntParserRuleCall_7_1_0());
                    					
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
    // InternalCinEditor.g:1655:1: entryRuleFadeIn returns [EObject current=null] : iv_ruleFadeIn= ruleFadeIn EOF ;
    public final EObject entryRuleFadeIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFadeIn = null;


        try {
            // InternalCinEditor.g:1655:47: (iv_ruleFadeIn= ruleFadeIn EOF )
            // InternalCinEditor.g:1656:2: iv_ruleFadeIn= ruleFadeIn EOF
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
    // InternalCinEditor.g:1662:1: ruleFadeIn returns [EObject current=null] : (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) ) ;
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
            // InternalCinEditor.g:1668:2: ( (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalCinEditor.g:1669:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalCinEditor.g:1669:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) )
            // InternalCinEditor.g:1670:3: otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFadeInAccess().getEffectKeyword_0());
            		
            // InternalCinEditor.g:1674:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1675:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1675:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1676:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFadeInAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,29,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getFadeInAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getFadeInAccess().getFadeInKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getFadeInAccess().getDuringKeyword_4());
            		
            // InternalCinEditor.g:1705:3: ( (lv_duration_5_0= ruleEInt ) )
            // InternalCinEditor.g:1706:4: (lv_duration_5_0= ruleEInt )
            {
            // InternalCinEditor.g:1706:4: (lv_duration_5_0= ruleEInt )
            // InternalCinEditor.g:1707:5: lv_duration_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getFadeInAccess().getDurationEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_6=(Token)match(input,35,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getFadeInAccess().getOnKeyword_6());
            		
            // InternalCinEditor.g:1728:3: ( (otherlv_7= RULE_ID ) )
            // InternalCinEditor.g:1729:4: (otherlv_7= RULE_ID )
            {
            // InternalCinEditor.g:1729:4: (otherlv_7= RULE_ID )
            // InternalCinEditor.g:1730:5: otherlv_7= RULE_ID
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
    // InternalCinEditor.g:1745:1: entryRuleFadeOut returns [EObject current=null] : iv_ruleFadeOut= ruleFadeOut EOF ;
    public final EObject entryRuleFadeOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFadeOut = null;


        try {
            // InternalCinEditor.g:1745:48: (iv_ruleFadeOut= ruleFadeOut EOF )
            // InternalCinEditor.g:1746:2: iv_ruleFadeOut= ruleFadeOut EOF
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
    // InternalCinEditor.g:1752:1: ruleFadeOut returns [EObject current=null] : (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) ) ;
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
            // InternalCinEditor.g:1758:2: ( (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalCinEditor.g:1759:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalCinEditor.g:1759:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) ) )
            // InternalCinEditor.g:1760:3: otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFadeOutAccess().getEffectKeyword_0());
            		
            // InternalCinEditor.g:1764:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1765:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1765:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1766:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFadeOutAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,29,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getFadeOutAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,44,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getFadeOutAccess().getFadeOutKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getFadeOutAccess().getDuringKeyword_4());
            		
            // InternalCinEditor.g:1795:3: ( (lv_duration_5_0= ruleEInt ) )
            // InternalCinEditor.g:1796:4: (lv_duration_5_0= ruleEInt )
            {
            // InternalCinEditor.g:1796:4: (lv_duration_5_0= ruleEInt )
            // InternalCinEditor.g:1797:5: lv_duration_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getFadeOutAccess().getDurationEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_6=(Token)match(input,35,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getFadeOutAccess().getOnKeyword_6());
            		
            // InternalCinEditor.g:1818:3: ( (otherlv_7= RULE_ID ) )
            // InternalCinEditor.g:1819:4: (otherlv_7= RULE_ID )
            {
            // InternalCinEditor.g:1819:4: (otherlv_7= RULE_ID )
            // InternalCinEditor.g:1820:5: otherlv_7= RULE_ID
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
    // InternalCinEditor.g:1835:1: entryRuleTranslate returns [EObject current=null] : iv_ruleTranslate= ruleTranslate EOF ;
    public final EObject entryRuleTranslate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTranslate = null;


        try {
            // InternalCinEditor.g:1835:50: (iv_ruleTranslate= ruleTranslate EOF )
            // InternalCinEditor.g:1836:2: iv_ruleTranslate= ruleTranslate EOF
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
    // InternalCinEditor.g:1842:1: ruleTranslate returns [EObject current=null] : (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) (otherlv_5= 'at' ( (lv_beginTime_6_0= ruleEInt ) ) )? (otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) )? otherlv_9= 'on' ( (otherlv_10= RULE_ID ) ) ) ;
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
            // InternalCinEditor.g:1848:2: ( (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) (otherlv_5= 'at' ( (lv_beginTime_6_0= ruleEInt ) ) )? (otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) )? otherlv_9= 'on' ( (otherlv_10= RULE_ID ) ) ) )
            // InternalCinEditor.g:1849:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) (otherlv_5= 'at' ( (lv_beginTime_6_0= ruleEInt ) ) )? (otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) )? otherlv_9= 'on' ( (otherlv_10= RULE_ID ) ) )
            {
            // InternalCinEditor.g:1849:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) (otherlv_5= 'at' ( (lv_beginTime_6_0= ruleEInt ) ) )? (otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) )? otherlv_9= 'on' ( (otherlv_10= RULE_ID ) ) )
            // InternalCinEditor.g:1850:3: otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) (otherlv_5= 'at' ( (lv_beginTime_6_0= ruleEInt ) ) )? (otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) )? otherlv_9= 'on' ( (otherlv_10= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTranslateAccess().getEffectKeyword_0());
            		
            // InternalCinEditor.g:1854:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1855:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1855:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1856:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTranslateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,29,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getTranslateAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getTranslateAccess().getTranslateKeyword_3());
            		
            // InternalCinEditor.g:1881:3: ( (lv_positionToTranslate_4_0= rulePosition ) )
            // InternalCinEditor.g:1882:4: (lv_positionToTranslate_4_0= rulePosition )
            {
            // InternalCinEditor.g:1882:4: (lv_positionToTranslate_4_0= rulePosition )
            // InternalCinEditor.g:1883:5: lv_positionToTranslate_4_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getTranslateAccess().getPositionToTranslatePositionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalCinEditor.g:1900:3: (otherlv_5= 'at' ( (lv_beginTime_6_0= ruleEInt ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCinEditor.g:1901:4: otherlv_5= 'at' ( (lv_beginTime_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getTranslateAccess().getAtKeyword_5_0());
                    			
                    // InternalCinEditor.g:1905:4: ( (lv_beginTime_6_0= ruleEInt ) )
                    // InternalCinEditor.g:1906:5: (lv_beginTime_6_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1906:5: (lv_beginTime_6_0= ruleEInt )
                    // InternalCinEditor.g:1907:6: lv_beginTime_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTranslateAccess().getBeginTimeEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
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


                    }
                    break;

            }

            // InternalCinEditor.g:1925:3: (otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCinEditor.g:1926:4: otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getTranslateAccess().getDuringKeyword_6_0());
                    			
                    // InternalCinEditor.g:1930:4: ( (lv_duration_8_0= ruleEInt ) )
                    // InternalCinEditor.g:1931:5: (lv_duration_8_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1931:5: (lv_duration_8_0= ruleEInt )
                    // InternalCinEditor.g:1932:6: lv_duration_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTranslateAccess().getDurationEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
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


                    }
                    break;

            }

            otherlv_9=(Token)match(input,35,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getTranslateAccess().getOnKeyword_7());
            		
            // InternalCinEditor.g:1954:3: ( (otherlv_10= RULE_ID ) )
            // InternalCinEditor.g:1955:4: (otherlv_10= RULE_ID )
            {
            // InternalCinEditor.g:1955:4: (otherlv_10= RULE_ID )
            // InternalCinEditor.g:1956:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTranslateRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_10, grammarAccess.getTranslateAccess().getElementGraphicalElementCrossReference_8_0());
            				

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


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\34\1\uffff\1\4\1\uffff\2\35\1\53\3\uffff";
    static final String dfa_3s = "\1\52\1\uffff\1\5\1\uffff\2\35\1\55\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\5\3\uffff\1\2\1\3\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\7\uffff\1\1\1\uffff\2\1\1\uffff\1\1\1\2",
            "",
            "\1\4\1\5",
            "",
            "\1\6",
            "\1\6",
            "\1\7\1\10\1\11",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "183:2: (this_GraphicalElement_0= ruleGraphicalElement | this_FadeIn_1= ruleFadeIn | this_FadeOut_2= ruleFadeOut | this_Translate_3= ruleTranslate | this_AudioElement_4= ruleAudioElement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000006D010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000006D010000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000047C0040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008010002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000FC0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000F80000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002602004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600804002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000600800002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000004000L});

}