package polytech.spaceteam.cineditor.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Movie'", "'fps'", "'Layer'", "'position'", "'('", "','", "')'", "'center'", "'left'", "'right'", "'bottom'", "'top'", "'dimension'", "'x'", "'color'", "'opacity'", "'-'", "'.'", "'true'", "'false'", "'Audio'", "'='", "'volume'", "'fadeIn'", "'fadeOut'", "'startAt'", "'cropAt'", "'during'", "'on'", "'Text'", "'fontSize'", "'margins('", "'Picture'", "'Video'", "'audio'", "'Rectangle'", "'Effect'", "'FadeIn'", "'['", "']'", "'FadeOut'", "'Translate'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // InternalCinEditor.g:65:1: entryRuleMovie returns [EObject current=null] : iv_ruleMovie= ruleMovie EOF ;
    public final EObject entryRuleMovie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovie = null;


        try {
            // InternalCinEditor.g:65:46: (iv_ruleMovie= ruleMovie EOF )
            // InternalCinEditor.g:66:2: iv_ruleMovie= ruleMovie EOF
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
    // InternalCinEditor.g:72:1: ruleMovie returns [EObject current=null] : (otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) (otherlv_3= 'fps' ( (lv_fps_4_0= ruleEInt ) ) )? ( (lv_layers_5_0= ruleLayer ) )+ ) ;
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
            // InternalCinEditor.g:78:2: ( (otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) (otherlv_3= 'fps' ( (lv_fps_4_0= ruleEInt ) ) )? ( (lv_layers_5_0= ruleLayer ) )+ ) )
            // InternalCinEditor.g:79:2: (otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) (otherlv_3= 'fps' ( (lv_fps_4_0= ruleEInt ) ) )? ( (lv_layers_5_0= ruleLayer ) )+ )
            {
            // InternalCinEditor.g:79:2: (otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) (otherlv_3= 'fps' ( (lv_fps_4_0= ruleEInt ) ) )? ( (lv_layers_5_0= ruleLayer ) )+ )
            // InternalCinEditor.g:80:3: otherlv_0= 'Movie' ( (lv_name_1_0= ruleEString ) ) ( (lv_dimension_2_0= ruleDimension ) ) (otherlv_3= 'fps' ( (lv_fps_4_0= ruleEInt ) ) )? ( (lv_layers_5_0= ruleLayer ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMovieAccess().getMovieKeyword_0());
            		
            // InternalCinEditor.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:85:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:86:5: lv_name_1_0= ruleEString
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

            // InternalCinEditor.g:103:3: ( (lv_dimension_2_0= ruleDimension ) )
            // InternalCinEditor.g:104:4: (lv_dimension_2_0= ruleDimension )
            {
            // InternalCinEditor.g:104:4: (lv_dimension_2_0= ruleDimension )
            // InternalCinEditor.g:105:5: lv_dimension_2_0= ruleDimension
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

            // InternalCinEditor.g:122:3: (otherlv_3= 'fps' ( (lv_fps_4_0= ruleEInt ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCinEditor.g:123:4: otherlv_3= 'fps' ( (lv_fps_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getMovieAccess().getFpsKeyword_3_0());
                    			
                    // InternalCinEditor.g:127:4: ( (lv_fps_4_0= ruleEInt ) )
                    // InternalCinEditor.g:128:5: (lv_fps_4_0= ruleEInt )
                    {
                    // InternalCinEditor.g:128:5: (lv_fps_4_0= ruleEInt )
                    // InternalCinEditor.g:129:6: lv_fps_4_0= ruleEInt
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

            // InternalCinEditor.g:147:3: ( (lv_layers_5_0= ruleLayer ) )+
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
            	    // InternalCinEditor.g:148:4: (lv_layers_5_0= ruleLayer )
            	    {
            	    // InternalCinEditor.g:148:4: (lv_layers_5_0= ruleLayer )
            	    // InternalCinEditor.g:149:5: lv_layers_5_0= ruleLayer
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
    // InternalCinEditor.g:170:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalCinEditor.g:170:48: (iv_ruleElement= ruleElement EOF )
            // InternalCinEditor.g:171:2: iv_ruleElement= ruleElement EOF
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
    // InternalCinEditor.g:177:1: ruleElement returns [EObject current=null] : (this_GraphicalElement_0= ruleGraphicalElement | this_FadeIn_1= ruleFadeIn | this_FadeOut_2= ruleFadeOut | this_Translate_3= ruleTranslate | this_AudioElement_4= ruleAudioElement ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_GraphicalElement_0 = null;

        EObject this_FadeIn_1 = null;

        EObject this_FadeOut_2 = null;

        EObject this_Translate_3 = null;

        EObject this_AudioElement_4 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:183:2: ( (this_GraphicalElement_0= ruleGraphicalElement | this_FadeIn_1= ruleFadeIn | this_FadeOut_2= ruleFadeOut | this_Translate_3= ruleTranslate | this_AudioElement_4= ruleAudioElement ) )
            // InternalCinEditor.g:184:2: (this_GraphicalElement_0= ruleGraphicalElement | this_FadeIn_1= ruleFadeIn | this_FadeOut_2= ruleFadeOut | this_Translate_3= ruleTranslate | this_AudioElement_4= ruleAudioElement )
            {
            // InternalCinEditor.g:184:2: (this_GraphicalElement_0= ruleGraphicalElement | this_FadeIn_1= ruleFadeIn | this_FadeOut_2= ruleFadeOut | this_Translate_3= ruleTranslate | this_AudioElement_4= ruleAudioElement )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalCinEditor.g:185:3: this_GraphicalElement_0= ruleGraphicalElement
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
                    // InternalCinEditor.g:194:3: this_FadeIn_1= ruleFadeIn
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
                    // InternalCinEditor.g:203:3: this_FadeOut_2= ruleFadeOut
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
                    // InternalCinEditor.g:212:3: this_Translate_3= ruleTranslate
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
                    // InternalCinEditor.g:221:3: this_AudioElement_4= ruleAudioElement
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
    // InternalCinEditor.g:233:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalCinEditor.g:233:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalCinEditor.g:234:2: iv_ruleLayer= ruleLayer EOF
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
    // InternalCinEditor.g:240:1: ruleLayer returns [EObject current=null] : ( () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+ ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:246:2: ( ( () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+ ) )
            // InternalCinEditor.g:247:2: ( () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+ )
            {
            // InternalCinEditor.g:247:2: ( () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+ )
            // InternalCinEditor.g:248:3: () otherlv_1= 'Layer' ( (lv_elements_2_0= ruleElement ) )+
            {
            // InternalCinEditor.g:248:3: ()
            // InternalCinEditor.g:249:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLayerAccess().getLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLayerAccess().getLayerKeyword_1());
            		
            // InternalCinEditor.g:259:3: ( (lv_elements_2_0= ruleElement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==31||LA4_0==40||(LA4_0>=43 && LA4_0<=44)||(LA4_0>=46 && LA4_0<=47)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCinEditor.g:260:4: (lv_elements_2_0= ruleElement )
            	    {
            	    // InternalCinEditor.g:260:4: (lv_elements_2_0= ruleElement )
            	    // InternalCinEditor.g:261:5: lv_elements_2_0= ruleElement
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
    // InternalCinEditor.g:282:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCinEditor.g:282:47: (iv_ruleEString= ruleEString EOF )
            // InternalCinEditor.g:283:2: iv_ruleEString= ruleEString EOF
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
    // InternalCinEditor.g:289:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCinEditor.g:295:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCinEditor.g:296:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCinEditor.g:296:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalCinEditor.g:297:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:305:3: this_ID_1= RULE_ID
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
    // InternalCinEditor.g:316:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalCinEditor.g:316:49: (iv_rulePosition= rulePosition EOF )
            // InternalCinEditor.g:317:2: iv_rulePosition= rulePosition EOF
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
    // InternalCinEditor.g:323:1: rulePosition returns [EObject current=null] : (otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleItemPosition ) ) otherlv_3= ',' ( (lv_y_4_0= ruleItemPosition ) ) otherlv_5= ')' ) ) ;
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
            // InternalCinEditor.g:329:2: ( (otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleItemPosition ) ) otherlv_3= ',' ( (lv_y_4_0= ruleItemPosition ) ) otherlv_5= ')' ) ) )
            // InternalCinEditor.g:330:2: (otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleItemPosition ) ) otherlv_3= ',' ( (lv_y_4_0= ruleItemPosition ) ) otherlv_5= ')' ) )
            {
            // InternalCinEditor.g:330:2: (otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleItemPosition ) ) otherlv_3= ',' ( (lv_y_4_0= ruleItemPosition ) ) otherlv_5= ')' ) )
            // InternalCinEditor.g:331:3: otherlv_0= 'position' (otherlv_1= '(' ( (lv_x_2_0= ruleItemPosition ) ) otherlv_3= ',' ( (lv_y_4_0= ruleItemPosition ) ) otherlv_5= ')' )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getPositionKeyword_0());
            		
            // InternalCinEditor.g:335:3: (otherlv_1= '(' ( (lv_x_2_0= ruleItemPosition ) ) otherlv_3= ',' ( (lv_y_4_0= ruleItemPosition ) ) otherlv_5= ')' )
            // InternalCinEditor.g:336:4: otherlv_1= '(' ( (lv_x_2_0= ruleItemPosition ) ) otherlv_3= ',' ( (lv_y_4_0= ruleItemPosition ) ) otherlv_5= ')'
            {
            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            				newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getLeftParenthesisKeyword_1_0());
            			
            // InternalCinEditor.g:340:4: ( (lv_x_2_0= ruleItemPosition ) )
            // InternalCinEditor.g:341:5: (lv_x_2_0= ruleItemPosition )
            {
            // InternalCinEditor.g:341:5: (lv_x_2_0= ruleItemPosition )
            // InternalCinEditor.g:342:6: lv_x_2_0= ruleItemPosition
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
            			
            // InternalCinEditor.g:363:4: ( (lv_y_4_0= ruleItemPosition ) )
            // InternalCinEditor.g:364:5: (lv_y_4_0= ruleItemPosition )
            {
            // InternalCinEditor.g:364:5: (lv_y_4_0= ruleItemPosition )
            // InternalCinEditor.g:365:6: lv_y_4_0= ruleItemPosition
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
    // InternalCinEditor.g:391:1: entryRuleItemPosition returns [EObject current=null] : iv_ruleItemPosition= ruleItemPosition EOF ;
    public final EObject entryRuleItemPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemPosition = null;


        try {
            // InternalCinEditor.g:391:53: (iv_ruleItemPosition= ruleItemPosition EOF )
            // InternalCinEditor.g:392:2: iv_ruleItemPosition= ruleItemPosition EOF
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
    // InternalCinEditor.g:398:1: ruleItemPosition returns [EObject current=null] : (this_ItemPositionInt_0= ruleItemPositionInt | this_ItemPositionString_1= ruleItemPositionString ) ;
    public final EObject ruleItemPosition() throws RecognitionException {
        EObject current = null;

        EObject this_ItemPositionInt_0 = null;

        EObject this_ItemPositionString_1 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:404:2: ( (this_ItemPositionInt_0= ruleItemPositionInt | this_ItemPositionString_1= ruleItemPositionString ) )
            // InternalCinEditor.g:405:2: (this_ItemPositionInt_0= ruleItemPositionInt | this_ItemPositionString_1= ruleItemPositionString )
            {
            // InternalCinEditor.g:405:2: (this_ItemPositionInt_0= ruleItemPositionInt | this_ItemPositionString_1= ruleItemPositionString )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||LA6_0==27) ) {
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
                    // InternalCinEditor.g:406:3: this_ItemPositionInt_0= ruleItemPositionInt
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
                    // InternalCinEditor.g:415:3: this_ItemPositionString_1= ruleItemPositionString
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
    // InternalCinEditor.g:427:1: entryRuleItemPositionInt returns [EObject current=null] : iv_ruleItemPositionInt= ruleItemPositionInt EOF ;
    public final EObject entryRuleItemPositionInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemPositionInt = null;


        try {
            // InternalCinEditor.g:427:56: (iv_ruleItemPositionInt= ruleItemPositionInt EOF )
            // InternalCinEditor.g:428:2: iv_ruleItemPositionInt= ruleItemPositionInt EOF
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
    // InternalCinEditor.g:434:1: ruleItemPositionInt returns [EObject current=null] : ( (lv_position_0_0= ruleEInt ) ) ;
    public final EObject ruleItemPositionInt() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_position_0_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:440:2: ( ( (lv_position_0_0= ruleEInt ) ) )
            // InternalCinEditor.g:441:2: ( (lv_position_0_0= ruleEInt ) )
            {
            // InternalCinEditor.g:441:2: ( (lv_position_0_0= ruleEInt ) )
            // InternalCinEditor.g:442:3: (lv_position_0_0= ruleEInt )
            {
            // InternalCinEditor.g:442:3: (lv_position_0_0= ruleEInt )
            // InternalCinEditor.g:443:4: lv_position_0_0= ruleEInt
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
    // InternalCinEditor.g:463:1: entryRuleItemPositionString returns [EObject current=null] : iv_ruleItemPositionString= ruleItemPositionString EOF ;
    public final EObject entryRuleItemPositionString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemPositionString = null;


        try {
            // InternalCinEditor.g:463:59: (iv_ruleItemPositionString= ruleItemPositionString EOF )
            // InternalCinEditor.g:464:2: iv_ruleItemPositionString= ruleItemPositionString EOF
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
    // InternalCinEditor.g:470:1: ruleItemPositionString returns [EObject current=null] : ( ( (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' ) ) ) ;
    public final EObject ruleItemPositionString() throws RecognitionException {
        EObject current = null;

        Token lv_position_0_1=null;
        Token lv_position_0_2=null;
        Token lv_position_0_3=null;
        Token lv_position_0_4=null;
        Token lv_position_0_5=null;


        	enterRule();

        try {
            // InternalCinEditor.g:476:2: ( ( ( (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' ) ) ) )
            // InternalCinEditor.g:477:2: ( ( (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' ) ) )
            {
            // InternalCinEditor.g:477:2: ( ( (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' ) ) )
            // InternalCinEditor.g:478:3: ( (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' ) )
            {
            // InternalCinEditor.g:478:3: ( (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' ) )
            // InternalCinEditor.g:479:4: (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' )
            {
            // InternalCinEditor.g:479:4: (lv_position_0_1= 'center' | lv_position_0_2= 'left' | lv_position_0_3= 'right' | lv_position_0_4= 'bottom' | lv_position_0_5= 'top' )
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
                    // InternalCinEditor.g:480:5: lv_position_0_1= 'center'
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
                    // InternalCinEditor.g:491:5: lv_position_0_2= 'left'
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
                    // InternalCinEditor.g:502:5: lv_position_0_3= 'right'
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
                    // InternalCinEditor.g:513:5: lv_position_0_4= 'bottom'
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
                    // InternalCinEditor.g:524:5: lv_position_0_5= 'top'
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
    // InternalCinEditor.g:540:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // InternalCinEditor.g:540:50: (iv_ruleDimension= ruleDimension EOF )
            // InternalCinEditor.g:541:2: iv_ruleDimension= ruleDimension EOF
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
    // InternalCinEditor.g:547:1: ruleDimension returns [EObject current=null] : (otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) ) ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_width_1_0 = null;

        AntlrDatatypeRuleToken lv_height_3_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:553:2: ( (otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) ) ) )
            // InternalCinEditor.g:554:2: (otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) ) )
            {
            // InternalCinEditor.g:554:2: (otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) ) )
            // InternalCinEditor.g:555:3: otherlv_0= 'dimension' ( (lv_width_1_0= ruleEInt ) ) otherlv_2= 'x' ( (lv_height_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionAccess().getDimensionKeyword_0());
            		
            // InternalCinEditor.g:559:3: ( (lv_width_1_0= ruleEInt ) )
            // InternalCinEditor.g:560:4: (lv_width_1_0= ruleEInt )
            {
            // InternalCinEditor.g:560:4: (lv_width_1_0= ruleEInt )
            // InternalCinEditor.g:561:5: lv_width_1_0= ruleEInt
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
            		
            // InternalCinEditor.g:582:3: ( (lv_height_3_0= ruleEInt ) )
            // InternalCinEditor.g:583:4: (lv_height_3_0= ruleEInt )
            {
            // InternalCinEditor.g:583:4: (lv_height_3_0= ruleEInt )
            // InternalCinEditor.g:584:5: lv_height_3_0= ruleEInt
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
    // InternalCinEditor.g:605:1: entryRuleHexadecimalColor returns [EObject current=null] : iv_ruleHexadecimalColor= ruleHexadecimalColor EOF ;
    public final EObject entryRuleHexadecimalColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHexadecimalColor = null;


        try {
            // InternalCinEditor.g:605:57: (iv_ruleHexadecimalColor= ruleHexadecimalColor EOF )
            // InternalCinEditor.g:606:2: iv_ruleHexadecimalColor= ruleHexadecimalColor EOF
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
    // InternalCinEditor.g:612:1: ruleHexadecimalColor returns [EObject current=null] : (otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) ) ) ;
    public final EObject ruleHexadecimalColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_hexadecimalValue_1_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:618:2: ( (otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) ) ) )
            // InternalCinEditor.g:619:2: (otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) ) )
            {
            // InternalCinEditor.g:619:2: (otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) ) )
            // InternalCinEditor.g:620:3: otherlv_0= 'color' ( (lv_hexadecimalValue_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHexadecimalColorAccess().getColorKeyword_0());
            		
            // InternalCinEditor.g:624:3: ( (lv_hexadecimalValue_1_0= ruleEString ) )
            // InternalCinEditor.g:625:4: (lv_hexadecimalValue_1_0= ruleEString )
            {
            // InternalCinEditor.g:625:4: (lv_hexadecimalValue_1_0= ruleEString )
            // InternalCinEditor.g:626:5: lv_hexadecimalValue_1_0= ruleEString
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
    // InternalCinEditor.g:647:1: entryRuleGraphicalElement returns [EObject current=null] : iv_ruleGraphicalElement= ruleGraphicalElement EOF ;
    public final EObject entryRuleGraphicalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphicalElement = null;


        try {
            // InternalCinEditor.g:647:57: (iv_ruleGraphicalElement= ruleGraphicalElement EOF )
            // InternalCinEditor.g:648:2: iv_ruleGraphicalElement= ruleGraphicalElement EOF
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
    // InternalCinEditor.g:654:1: ruleGraphicalElement returns [EObject current=null] : (this_Text_0= ruleText | this_Video_1= ruleVideo | this_Picture_2= rulePicture | this_Rectangle_3= ruleRectangle ) ;
    public final EObject ruleGraphicalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_Video_1 = null;

        EObject this_Picture_2 = null;

        EObject this_Rectangle_3 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:660:2: ( (this_Text_0= ruleText | this_Video_1= ruleVideo | this_Picture_2= rulePicture | this_Rectangle_3= ruleRectangle ) )
            // InternalCinEditor.g:661:2: (this_Text_0= ruleText | this_Video_1= ruleVideo | this_Picture_2= rulePicture | this_Rectangle_3= ruleRectangle )
            {
            // InternalCinEditor.g:661:2: (this_Text_0= ruleText | this_Video_1= ruleVideo | this_Picture_2= rulePicture | this_Rectangle_3= ruleRectangle )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt8=1;
                }
                break;
            case 44:
                {
                alt8=2;
                }
                break;
            case 43:
                {
                alt8=3;
                }
                break;
            case 46:
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
                    // InternalCinEditor.g:662:3: this_Text_0= ruleText
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
                    // InternalCinEditor.g:671:3: this_Video_1= ruleVideo
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
                    // InternalCinEditor.g:680:3: this_Picture_2= rulePicture
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
                    // InternalCinEditor.g:689:3: this_Rectangle_3= ruleRectangle
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


    // $ANTLR start "entryRuleMargin"
    // InternalCinEditor.g:701:1: entryRuleMargin returns [EObject current=null] : iv_ruleMargin= ruleMargin EOF ;
    public final EObject entryRuleMargin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMargin = null;


        try {
            // InternalCinEditor.g:701:47: (iv_ruleMargin= ruleMargin EOF )
            // InternalCinEditor.g:702:2: iv_ruleMargin= ruleMargin EOF
            {
             newCompositeNode(grammarAccess.getMarginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMargin=ruleMargin();

            state._fsp--;

             current =iv_ruleMargin; 
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
    // $ANTLR end "entryRuleMargin"


    // $ANTLR start "ruleMargin"
    // InternalCinEditor.g:708:1: ruleMargin returns [EObject current=null] : ( ( (lv_type_0_0= ruleMARGIN_NAME ) ) otherlv_1= '(' ( (lv_size_2_0= ruleEInt ) ) ( (lv_marginColor_3_0= ruleHexadecimalColor ) )? (otherlv_4= 'opacity' ( (lv_marginColorOpacity_5_0= ruleEFloat ) ) )? otherlv_6= ')' ) ;
    public final EObject ruleMargin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_size_2_0 = null;

        EObject lv_marginColor_3_0 = null;

        AntlrDatatypeRuleToken lv_marginColorOpacity_5_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:714:2: ( ( ( (lv_type_0_0= ruleMARGIN_NAME ) ) otherlv_1= '(' ( (lv_size_2_0= ruleEInt ) ) ( (lv_marginColor_3_0= ruleHexadecimalColor ) )? (otherlv_4= 'opacity' ( (lv_marginColorOpacity_5_0= ruleEFloat ) ) )? otherlv_6= ')' ) )
            // InternalCinEditor.g:715:2: ( ( (lv_type_0_0= ruleMARGIN_NAME ) ) otherlv_1= '(' ( (lv_size_2_0= ruleEInt ) ) ( (lv_marginColor_3_0= ruleHexadecimalColor ) )? (otherlv_4= 'opacity' ( (lv_marginColorOpacity_5_0= ruleEFloat ) ) )? otherlv_6= ')' )
            {
            // InternalCinEditor.g:715:2: ( ( (lv_type_0_0= ruleMARGIN_NAME ) ) otherlv_1= '(' ( (lv_size_2_0= ruleEInt ) ) ( (lv_marginColor_3_0= ruleHexadecimalColor ) )? (otherlv_4= 'opacity' ( (lv_marginColorOpacity_5_0= ruleEFloat ) ) )? otherlv_6= ')' )
            // InternalCinEditor.g:716:3: ( (lv_type_0_0= ruleMARGIN_NAME ) ) otherlv_1= '(' ( (lv_size_2_0= ruleEInt ) ) ( (lv_marginColor_3_0= ruleHexadecimalColor ) )? (otherlv_4= 'opacity' ( (lv_marginColorOpacity_5_0= ruleEFloat ) ) )? otherlv_6= ')'
            {
            // InternalCinEditor.g:716:3: ( (lv_type_0_0= ruleMARGIN_NAME ) )
            // InternalCinEditor.g:717:4: (lv_type_0_0= ruleMARGIN_NAME )
            {
            // InternalCinEditor.g:717:4: (lv_type_0_0= ruleMARGIN_NAME )
            // InternalCinEditor.g:718:5: lv_type_0_0= ruleMARGIN_NAME
            {

            					newCompositeNode(grammarAccess.getMarginAccess().getTypeMARGIN_NAMEEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_type_0_0=ruleMARGIN_NAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarginRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"polytech.spaceteam.cineditor.CinEditor.MARGIN_NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMarginAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCinEditor.g:739:3: ( (lv_size_2_0= ruleEInt ) )
            // InternalCinEditor.g:740:4: (lv_size_2_0= ruleEInt )
            {
            // InternalCinEditor.g:740:4: (lv_size_2_0= ruleEInt )
            // InternalCinEditor.g:741:5: lv_size_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMarginAccess().getSizeEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_size_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarginRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_2_0,
            						"polytech.spaceteam.cineditor.CinEditor.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCinEditor.g:758:3: ( (lv_marginColor_3_0= ruleHexadecimalColor ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCinEditor.g:759:4: (lv_marginColor_3_0= ruleHexadecimalColor )
                    {
                    // InternalCinEditor.g:759:4: (lv_marginColor_3_0= ruleHexadecimalColor )
                    // InternalCinEditor.g:760:5: lv_marginColor_3_0= ruleHexadecimalColor
                    {

                    					newCompositeNode(grammarAccess.getMarginAccess().getMarginColorHexadecimalColorParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_marginColor_3_0=ruleHexadecimalColor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMarginRule());
                    					}
                    					set(
                    						current,
                    						"marginColor",
                    						lv_marginColor_3_0,
                    						"polytech.spaceteam.cineditor.CinEditor.HexadecimalColor");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCinEditor.g:777:3: (otherlv_4= 'opacity' ( (lv_marginColorOpacity_5_0= ruleEFloat ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCinEditor.g:778:4: otherlv_4= 'opacity' ( (lv_marginColorOpacity_5_0= ruleEFloat ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getMarginAccess().getOpacityKeyword_4_0());
                    			
                    // InternalCinEditor.g:782:4: ( (lv_marginColorOpacity_5_0= ruleEFloat ) )
                    // InternalCinEditor.g:783:5: (lv_marginColorOpacity_5_0= ruleEFloat )
                    {
                    // InternalCinEditor.g:783:5: (lv_marginColorOpacity_5_0= ruleEFloat )
                    // InternalCinEditor.g:784:6: lv_marginColorOpacity_5_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getMarginAccess().getMarginColorOpacityEFloatParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_marginColorOpacity_5_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarginRule());
                    						}
                    						set(
                    							current,
                    							"marginColorOpacity",
                    							lv_marginColorOpacity_5_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMarginAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleMargin"


    // $ANTLR start "entryRuleEInt"
    // InternalCinEditor.g:810:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalCinEditor.g:810:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalCinEditor.g:811:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalCinEditor.g:817:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCinEditor.g:823:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalCinEditor.g:824:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalCinEditor.g:824:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalCinEditor.g:825:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalCinEditor.g:825:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCinEditor.g:826:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_17); 

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
    // InternalCinEditor.g:843:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalCinEditor.g:843:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalCinEditor.g:844:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalCinEditor.g:850:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_4= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalCinEditor.g:856:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_4= RULE_INT )? ) )
            // InternalCinEditor.g:857:2: ( (kw= '-' )? this_INT_1= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_4= RULE_INT )? )
            {
            // InternalCinEditor.g:857:2: ( (kw= '-' )? this_INT_1= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_4= RULE_INT )? )
            // InternalCinEditor.g:858:3: (kw= '-' )? this_INT_1= RULE_INT ( (kw= '.' | kw= ',' ) this_INT_4= RULE_INT )?
            {
            // InternalCinEditor.g:858:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCinEditor.g:859:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_18); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
            		
            // InternalCinEditor.g:872:3: ( (kw= '.' | kw= ',' ) this_INT_4= RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16||LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCinEditor.g:873:4: (kw= '.' | kw= ',' ) this_INT_4= RULE_INT
                    {
                    // InternalCinEditor.g:873:4: (kw= '.' | kw= ',' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==28) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==16) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalCinEditor.g:874:5: kw= '.'
                            {
                            kw=(Token)match(input,28,FOLLOW_17); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalCinEditor.g:880:5: kw= ','
                            {
                            kw=(Token)match(input,16,FOLLOW_17); 

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


    // $ANTLR start "entryRuleEBoolean"
    // InternalCinEditor.g:898:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalCinEditor.g:898:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalCinEditor.g:899:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalCinEditor.g:905:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCinEditor.g:911:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalCinEditor.g:912:2: (kw= 'true' | kw= 'false' )
            {
            // InternalCinEditor.g:912:2: (kw= 'true' | kw= 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            else if ( (LA15_0==30) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCinEditor.g:913:3: kw= 'true'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:919:3: kw= 'false'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleAudioElement"
    // InternalCinEditor.g:928:1: entryRuleAudioElement returns [EObject current=null] : iv_ruleAudioElement= ruleAudioElement EOF ;
    public final EObject entryRuleAudioElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioElement = null;


        try {
            // InternalCinEditor.g:928:53: (iv_ruleAudioElement= ruleAudioElement EOF )
            // InternalCinEditor.g:929:2: iv_ruleAudioElement= ruleAudioElement EOF
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
    // InternalCinEditor.g:935:1: ruleAudioElement returns [EObject current=null] : (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'volume' ( (lv_volume_5_0= ruleEFloat ) ) )? (otherlv_6= 'fadeIn' ( (lv_fadeIn_7_0= ruleEInt ) ) )? (otherlv_8= 'fadeOut' ( (lv_fadeOut_9_0= ruleEInt ) ) )? (otherlv_10= 'startAt' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'cropAt' ( (lv_beginCropTime_13_0= ruleEInt ) ) )? (otherlv_14= 'during' ( (lv_duration_15_0= ruleEInt ) ) )? otherlv_16= 'on' ( (otherlv_17= RULE_ID ) ) ) ;
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
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_url_3_0 = null;

        AntlrDatatypeRuleToken lv_volume_5_0 = null;

        AntlrDatatypeRuleToken lv_fadeIn_7_0 = null;

        AntlrDatatypeRuleToken lv_fadeOut_9_0 = null;

        AntlrDatatypeRuleToken lv_beginTime_11_0 = null;

        AntlrDatatypeRuleToken lv_beginCropTime_13_0 = null;

        AntlrDatatypeRuleToken lv_duration_15_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:941:2: ( (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'volume' ( (lv_volume_5_0= ruleEFloat ) ) )? (otherlv_6= 'fadeIn' ( (lv_fadeIn_7_0= ruleEInt ) ) )? (otherlv_8= 'fadeOut' ( (lv_fadeOut_9_0= ruleEInt ) ) )? (otherlv_10= 'startAt' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'cropAt' ( (lv_beginCropTime_13_0= ruleEInt ) ) )? (otherlv_14= 'during' ( (lv_duration_15_0= ruleEInt ) ) )? otherlv_16= 'on' ( (otherlv_17= RULE_ID ) ) ) )
            // InternalCinEditor.g:942:2: (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'volume' ( (lv_volume_5_0= ruleEFloat ) ) )? (otherlv_6= 'fadeIn' ( (lv_fadeIn_7_0= ruleEInt ) ) )? (otherlv_8= 'fadeOut' ( (lv_fadeOut_9_0= ruleEInt ) ) )? (otherlv_10= 'startAt' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'cropAt' ( (lv_beginCropTime_13_0= ruleEInt ) ) )? (otherlv_14= 'during' ( (lv_duration_15_0= ruleEInt ) ) )? otherlv_16= 'on' ( (otherlv_17= RULE_ID ) ) )
            {
            // InternalCinEditor.g:942:2: (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'volume' ( (lv_volume_5_0= ruleEFloat ) ) )? (otherlv_6= 'fadeIn' ( (lv_fadeIn_7_0= ruleEInt ) ) )? (otherlv_8= 'fadeOut' ( (lv_fadeOut_9_0= ruleEInt ) ) )? (otherlv_10= 'startAt' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'cropAt' ( (lv_beginCropTime_13_0= ruleEInt ) ) )? (otherlv_14= 'during' ( (lv_duration_15_0= ruleEInt ) ) )? otherlv_16= 'on' ( (otherlv_17= RULE_ID ) ) )
            // InternalCinEditor.g:943:3: otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'volume' ( (lv_volume_5_0= ruleEFloat ) ) )? (otherlv_6= 'fadeIn' ( (lv_fadeIn_7_0= ruleEInt ) ) )? (otherlv_8= 'fadeOut' ( (lv_fadeOut_9_0= ruleEInt ) ) )? (otherlv_10= 'startAt' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'cropAt' ( (lv_beginCropTime_13_0= ruleEInt ) ) )? (otherlv_14= 'during' ( (lv_duration_15_0= ruleEInt ) ) )? otherlv_16= 'on' ( (otherlv_17= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAudioElementAccess().getAudioKeyword_0());
            		
            // InternalCinEditor.g:947:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:948:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:948:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:949:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAudioElementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAudioElementAccess().getEqualsSignKeyword_2());
            		
            // InternalCinEditor.g:970:3: ( (lv_url_3_0= ruleEString ) )
            // InternalCinEditor.g:971:4: (lv_url_3_0= ruleEString )
            {
            // InternalCinEditor.g:971:4: (lv_url_3_0= ruleEString )
            // InternalCinEditor.g:972:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAudioElementAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalCinEditor.g:989:3: (otherlv_4= 'volume' ( (lv_volume_5_0= ruleEFloat ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCinEditor.g:990:4: otherlv_4= 'volume' ( (lv_volume_5_0= ruleEFloat ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAudioElementAccess().getVolumeKeyword_4_0());
                    			
                    // InternalCinEditor.g:994:4: ( (lv_volume_5_0= ruleEFloat ) )
                    // InternalCinEditor.g:995:5: (lv_volume_5_0= ruleEFloat )
                    {
                    // InternalCinEditor.g:995:5: (lv_volume_5_0= ruleEFloat )
                    // InternalCinEditor.g:996:6: lv_volume_5_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getAudioElementAccess().getVolumeEFloatParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
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

            // InternalCinEditor.g:1014:3: (otherlv_6= 'fadeIn' ( (lv_fadeIn_7_0= ruleEInt ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCinEditor.g:1015:4: otherlv_6= 'fadeIn' ( (lv_fadeIn_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getAudioElementAccess().getFadeInKeyword_5_0());
                    			
                    // InternalCinEditor.g:1019:4: ( (lv_fadeIn_7_0= ruleEInt ) )
                    // InternalCinEditor.g:1020:5: (lv_fadeIn_7_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1020:5: (lv_fadeIn_7_0= ruleEInt )
                    // InternalCinEditor.g:1021:6: lv_fadeIn_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAudioElementAccess().getFadeInEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_22);
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

            // InternalCinEditor.g:1039:3: (otherlv_8= 'fadeOut' ( (lv_fadeOut_9_0= ruleEInt ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCinEditor.g:1040:4: otherlv_8= 'fadeOut' ( (lv_fadeOut_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,35,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getAudioElementAccess().getFadeOutKeyword_6_0());
                    			
                    // InternalCinEditor.g:1044:4: ( (lv_fadeOut_9_0= ruleEInt ) )
                    // InternalCinEditor.g:1045:5: (lv_fadeOut_9_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1045:5: (lv_fadeOut_9_0= ruleEInt )
                    // InternalCinEditor.g:1046:6: lv_fadeOut_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAudioElementAccess().getFadeOutEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

            // InternalCinEditor.g:1064:3: (otherlv_10= 'startAt' ( (lv_beginTime_11_0= ruleEInt ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCinEditor.g:1065:4: otherlv_10= 'startAt' ( (lv_beginTime_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getAudioElementAccess().getStartAtKeyword_7_0());
                    			
                    // InternalCinEditor.g:1069:4: ( (lv_beginTime_11_0= ruleEInt ) )
                    // InternalCinEditor.g:1070:5: (lv_beginTime_11_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1070:5: (lv_beginTime_11_0= ruleEInt )
                    // InternalCinEditor.g:1071:6: lv_beginTime_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAudioElementAccess().getBeginTimeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

            // InternalCinEditor.g:1089:3: (otherlv_12= 'cropAt' ( (lv_beginCropTime_13_0= ruleEInt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCinEditor.g:1090:4: otherlv_12= 'cropAt' ( (lv_beginCropTime_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,37,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getAudioElementAccess().getCropAtKeyword_8_0());
                    			
                    // InternalCinEditor.g:1094:4: ( (lv_beginCropTime_13_0= ruleEInt ) )
                    // InternalCinEditor.g:1095:5: (lv_beginCropTime_13_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1095:5: (lv_beginCropTime_13_0= ruleEInt )
                    // InternalCinEditor.g:1096:6: lv_beginCropTime_13_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAudioElementAccess().getBeginCropTimeEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_beginCropTime_13_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioElementRule());
                    						}
                    						set(
                    							current,
                    							"beginCropTime",
                    							lv_beginCropTime_13_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:1114:3: (otherlv_14= 'during' ( (lv_duration_15_0= ruleEInt ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCinEditor.g:1115:4: otherlv_14= 'during' ( (lv_duration_15_0= ruleEInt ) )
                    {
                    otherlv_14=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getAudioElementAccess().getDuringKeyword_9_0());
                    			
                    // InternalCinEditor.g:1119:4: ( (lv_duration_15_0= ruleEInt ) )
                    // InternalCinEditor.g:1120:5: (lv_duration_15_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1120:5: (lv_duration_15_0= ruleEInt )
                    // InternalCinEditor.g:1121:6: lv_duration_15_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAudioElementAccess().getDurationEIntParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_duration_15_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioElementRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_15_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_16, grammarAccess.getAudioElementAccess().getOnKeyword_10());
            		
            // InternalCinEditor.g:1143:3: ( (otherlv_17= RULE_ID ) )
            // InternalCinEditor.g:1144:4: (otherlv_17= RULE_ID )
            {
            // InternalCinEditor.g:1144:4: (otherlv_17= RULE_ID )
            // InternalCinEditor.g:1145:5: otherlv_17= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAudioElementRule());
            					}
            				
            otherlv_17=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_17, grammarAccess.getAudioElementAccess().getElementGraphicalElementCrossReference_11_0());
            				

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
    // InternalCinEditor.g:1160:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalCinEditor.g:1160:45: (iv_ruleText= ruleText EOF )
            // InternalCinEditor.g:1161:2: iv_ruleText= ruleText EOF
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
    // InternalCinEditor.g:1167:1: ruleText returns [EObject current=null] : (otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? (otherlv_7= 'margins(' ( (lv_margins_8_0= ruleMargin ) )+ otherlv_9= ')' )? (otherlv_10= 'startAt' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )? ( (lv_color_14_0= ruleHexadecimalColor ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_text_3_0 = null;

        AntlrDatatypeRuleToken lv_fontSize_5_0 = null;

        EObject lv_position_6_0 = null;

        EObject lv_margins_8_0 = null;

        AntlrDatatypeRuleToken lv_beginTime_11_0 = null;

        AntlrDatatypeRuleToken lv_duration_13_0 = null;

        EObject lv_color_14_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:1173:2: ( (otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? (otherlv_7= 'margins(' ( (lv_margins_8_0= ruleMargin ) )+ otherlv_9= ')' )? (otherlv_10= 'startAt' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )? ( (lv_color_14_0= ruleHexadecimalColor ) ) ) )
            // InternalCinEditor.g:1174:2: (otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? (otherlv_7= 'margins(' ( (lv_margins_8_0= ruleMargin ) )+ otherlv_9= ')' )? (otherlv_10= 'startAt' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )? ( (lv_color_14_0= ruleHexadecimalColor ) ) )
            {
            // InternalCinEditor.g:1174:2: (otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? (otherlv_7= 'margins(' ( (lv_margins_8_0= ruleMargin ) )+ otherlv_9= ')' )? (otherlv_10= 'startAt' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )? ( (lv_color_14_0= ruleHexadecimalColor ) ) )
            // InternalCinEditor.g:1175:3: otherlv_0= 'Text' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_text_3_0= ruleEString ) ) (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )? ( (lv_position_6_0= rulePosition ) )? (otherlv_7= 'margins(' ( (lv_margins_8_0= ruleMargin ) )+ otherlv_9= ')' )? (otherlv_10= 'startAt' ( (lv_beginTime_11_0= ruleEInt ) ) )? (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )? ( (lv_color_14_0= ruleHexadecimalColor ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
            		
            // InternalCinEditor.g:1179:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1180:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1180:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1181:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTextAccess().getEqualsSignKeyword_2());
            		
            // InternalCinEditor.g:1202:3: ( (lv_text_3_0= ruleEString ) )
            // InternalCinEditor.g:1203:4: (lv_text_3_0= ruleEString )
            {
            // InternalCinEditor.g:1203:4: (lv_text_3_0= ruleEString )
            // InternalCinEditor.g:1204:5: lv_text_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTextAccess().getTextEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalCinEditor.g:1221:3: (otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCinEditor.g:1222:4: otherlv_4= 'fontSize' ( (lv_fontSize_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextAccess().getFontSizeKeyword_4_0());
                    			
                    // InternalCinEditor.g:1226:4: ( (lv_fontSize_5_0= ruleEInt ) )
                    // InternalCinEditor.g:1227:5: (lv_fontSize_5_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1227:5: (lv_fontSize_5_0= ruleEInt )
                    // InternalCinEditor.g:1228:6: lv_fontSize_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAccess().getFontSizeEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
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

            // InternalCinEditor.g:1246:3: ( (lv_position_6_0= rulePosition ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCinEditor.g:1247:4: (lv_position_6_0= rulePosition )
                    {
                    // InternalCinEditor.g:1247:4: (lv_position_6_0= rulePosition )
                    // InternalCinEditor.g:1248:5: lv_position_6_0= rulePosition
                    {

                    					newCompositeNode(grammarAccess.getTextAccess().getPositionPositionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_30);
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

            // InternalCinEditor.g:1265:3: (otherlv_7= 'margins(' ( (lv_margins_8_0= ruleMargin ) )+ otherlv_9= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCinEditor.g:1266:4: otherlv_7= 'margins(' ( (lv_margins_8_0= ruleMargin ) )+ otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_7, grammarAccess.getTextAccess().getMarginsKeyword_6_0());
                    			
                    // InternalCinEditor.g:1270:4: ( (lv_margins_8_0= ruleMargin ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=19 && LA24_0<=22)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalCinEditor.g:1271:5: (lv_margins_8_0= ruleMargin )
                    	    {
                    	    // InternalCinEditor.g:1271:5: (lv_margins_8_0= ruleMargin )
                    	    // InternalCinEditor.g:1272:6: lv_margins_8_0= ruleMargin
                    	    {

                    	    						newCompositeNode(grammarAccess.getTextAccess().getMarginsMarginParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_32);
                    	    lv_margins_8_0=ruleMargin();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTextRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"margins",
                    	    							lv_margins_8_0,
                    	    							"polytech.spaceteam.cineditor.CinEditor.Margin");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_33); 

                    				newLeafNode(otherlv_9, grammarAccess.getTextAccess().getRightParenthesisKeyword_6_2());
                    			

                    }
                    break;

            }

            // InternalCinEditor.g:1294:3: (otherlv_10= 'startAt' ( (lv_beginTime_11_0= ruleEInt ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCinEditor.g:1295:4: otherlv_10= 'startAt' ( (lv_beginTime_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getTextAccess().getStartAtKeyword_7_0());
                    			
                    // InternalCinEditor.g:1299:4: ( (lv_beginTime_11_0= ruleEInt ) )
                    // InternalCinEditor.g:1300:5: (lv_beginTime_11_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1300:5: (lv_beginTime_11_0= ruleEInt )
                    // InternalCinEditor.g:1301:6: lv_beginTime_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAccess().getBeginTimeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_beginTime_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextRule());
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

            // InternalCinEditor.g:1319:3: (otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCinEditor.g:1320:4: otherlv_12= 'during' ( (lv_duration_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getTextAccess().getDuringKeyword_8_0());
                    			
                    // InternalCinEditor.g:1324:4: ( (lv_duration_13_0= ruleEInt ) )
                    // InternalCinEditor.g:1325:5: (lv_duration_13_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1325:5: (lv_duration_13_0= ruleEInt )
                    // InternalCinEditor.g:1326:6: lv_duration_13_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAccess().getDurationEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_duration_13_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextRule());
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

            // InternalCinEditor.g:1344:3: ( (lv_color_14_0= ruleHexadecimalColor ) )
            // InternalCinEditor.g:1345:4: (lv_color_14_0= ruleHexadecimalColor )
            {
            // InternalCinEditor.g:1345:4: (lv_color_14_0= ruleHexadecimalColor )
            // InternalCinEditor.g:1346:5: lv_color_14_0= ruleHexadecimalColor
            {

            					newCompositeNode(grammarAccess.getTextAccess().getColorHexadecimalColorParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_color_14_0=ruleHexadecimalColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_14_0,
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
    // InternalCinEditor.g:1367:1: entryRulePicture returns [EObject current=null] : iv_rulePicture= rulePicture EOF ;
    public final EObject entryRulePicture() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePicture = null;


        try {
            // InternalCinEditor.g:1367:48: (iv_rulePicture= rulePicture EOF )
            // InternalCinEditor.g:1368:2: iv_rulePicture= rulePicture EOF
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
    // InternalCinEditor.g:1374:1: rulePicture returns [EObject current=null] : (otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'margins(' ( (lv_margins_7_0= ruleMargin ) )+ otherlv_8= ')' )? (otherlv_9= 'startAt' ( (lv_beginTime_10_0= ruleEInt ) ) )? (otherlv_11= 'during' ( (lv_duration_12_0= ruleEInt ) ) )? ) ;
    public final EObject rulePicture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_url_3_0 = null;

        EObject lv_position_4_0 = null;

        EObject lv_dimension_5_0 = null;

        EObject lv_margins_7_0 = null;

        AntlrDatatypeRuleToken lv_beginTime_10_0 = null;

        AntlrDatatypeRuleToken lv_duration_12_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:1380:2: ( (otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'margins(' ( (lv_margins_7_0= ruleMargin ) )+ otherlv_8= ')' )? (otherlv_9= 'startAt' ( (lv_beginTime_10_0= ruleEInt ) ) )? (otherlv_11= 'during' ( (lv_duration_12_0= ruleEInt ) ) )? ) )
            // InternalCinEditor.g:1381:2: (otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'margins(' ( (lv_margins_7_0= ruleMargin ) )+ otherlv_8= ')' )? (otherlv_9= 'startAt' ( (lv_beginTime_10_0= ruleEInt ) ) )? (otherlv_11= 'during' ( (lv_duration_12_0= ruleEInt ) ) )? )
            {
            // InternalCinEditor.g:1381:2: (otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'margins(' ( (lv_margins_7_0= ruleMargin ) )+ otherlv_8= ')' )? (otherlv_9= 'startAt' ( (lv_beginTime_10_0= ruleEInt ) ) )? (otherlv_11= 'during' ( (lv_duration_12_0= ruleEInt ) ) )? )
            // InternalCinEditor.g:1382:3: otherlv_0= 'Picture' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'margins(' ( (lv_margins_7_0= ruleMargin ) )+ otherlv_8= ')' )? (otherlv_9= 'startAt' ( (lv_beginTime_10_0= ruleEInt ) ) )? (otherlv_11= 'during' ( (lv_duration_12_0= ruleEInt ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPictureAccess().getPictureKeyword_0());
            		
            // InternalCinEditor.g:1386:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1387:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1387:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1388:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPictureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPictureAccess().getEqualsSignKeyword_2());
            		
            // InternalCinEditor.g:1409:3: ( (lv_url_3_0= ruleEString ) )
            // InternalCinEditor.g:1410:4: (lv_url_3_0= ruleEString )
            {
            // InternalCinEditor.g:1410:4: (lv_url_3_0= ruleEString )
            // InternalCinEditor.g:1411:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPictureAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalCinEditor.g:1428:3: ( (lv_position_4_0= rulePosition ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==14) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCinEditor.g:1429:4: (lv_position_4_0= rulePosition )
                    {
                    // InternalCinEditor.g:1429:4: (lv_position_4_0= rulePosition )
                    // InternalCinEditor.g:1430:5: lv_position_4_0= rulePosition
                    {

                    					newCompositeNode(grammarAccess.getPictureAccess().getPositionPositionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_37);
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

            // InternalCinEditor.g:1447:3: ( (lv_dimension_5_0= ruleDimension ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCinEditor.g:1448:4: (lv_dimension_5_0= ruleDimension )
                    {
                    // InternalCinEditor.g:1448:4: (lv_dimension_5_0= ruleDimension )
                    // InternalCinEditor.g:1449:5: lv_dimension_5_0= ruleDimension
                    {

                    					newCompositeNode(grammarAccess.getPictureAccess().getDimensionDimensionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_38);
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

            // InternalCinEditor.g:1466:3: (otherlv_6= 'margins(' ( (lv_margins_7_0= ruleMargin ) )+ otherlv_8= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCinEditor.g:1467:4: otherlv_6= 'margins(' ( (lv_margins_7_0= ruleMargin ) )+ otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getPictureAccess().getMarginsKeyword_6_0());
                    			
                    // InternalCinEditor.g:1471:4: ( (lv_margins_7_0= ruleMargin ) )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=19 && LA30_0<=22)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalCinEditor.g:1472:5: (lv_margins_7_0= ruleMargin )
                    	    {
                    	    // InternalCinEditor.g:1472:5: (lv_margins_7_0= ruleMargin )
                    	    // InternalCinEditor.g:1473:6: lv_margins_7_0= ruleMargin
                    	    {

                    	    						newCompositeNode(grammarAccess.getPictureAccess().getMarginsMarginParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_32);
                    	    lv_margins_7_0=ruleMargin();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPictureRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"margins",
                    	    							lv_margins_7_0,
                    	    							"polytech.spaceteam.cineditor.CinEditor.Margin");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_39); 

                    				newLeafNode(otherlv_8, grammarAccess.getPictureAccess().getRightParenthesisKeyword_6_2());
                    			

                    }
                    break;

            }

            // InternalCinEditor.g:1495:3: (otherlv_9= 'startAt' ( (lv_beginTime_10_0= ruleEInt ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCinEditor.g:1496:4: otherlv_9= 'startAt' ( (lv_beginTime_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getPictureAccess().getStartAtKeyword_7_0());
                    			
                    // InternalCinEditor.g:1500:4: ( (lv_beginTime_10_0= ruleEInt ) )
                    // InternalCinEditor.g:1501:5: (lv_beginTime_10_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1501:5: (lv_beginTime_10_0= ruleEInt )
                    // InternalCinEditor.g:1502:6: lv_beginTime_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPictureAccess().getBeginTimeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_beginTime_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPictureRule());
                    						}
                    						set(
                    							current,
                    							"beginTime",
                    							lv_beginTime_10_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:1520:3: (otherlv_11= 'during' ( (lv_duration_12_0= ruleEInt ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCinEditor.g:1521:4: otherlv_11= 'during' ( (lv_duration_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getPictureAccess().getDuringKeyword_8_0());
                    			
                    // InternalCinEditor.g:1525:4: ( (lv_duration_12_0= ruleEInt ) )
                    // InternalCinEditor.g:1526:5: (lv_duration_12_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1526:5: (lv_duration_12_0= ruleEInt )
                    // InternalCinEditor.g:1527:6: lv_duration_12_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPictureAccess().getDurationEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_duration_12_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPictureRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_12_0,
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
    // InternalCinEditor.g:1549:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalCinEditor.g:1549:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalCinEditor.g:1550:2: iv_ruleVideo= ruleVideo EOF
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
    // InternalCinEditor.g:1556:1: ruleVideo returns [EObject current=null] : (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'audio' ( (lv_enableAudio_5_0= ruleEBoolean ) ) )? ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? (otherlv_8= 'margins(' ( (lv_margins_9_0= ruleMargin ) )+ otherlv_10= ')' )? (otherlv_11= 'startAt' ( (lv_beginTime_12_0= ruleEInt ) ) )? (otherlv_13= 'cropAt' ( (lv_beginCropTime_14_0= ruleEInt ) ) )? (otherlv_15= 'during' ( (lv_duration_16_0= ruleEInt ) ) )? ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_url_3_0 = null;

        AntlrDatatypeRuleToken lv_enableAudio_5_0 = null;

        EObject lv_position_6_0 = null;

        EObject lv_dimension_7_0 = null;

        EObject lv_margins_9_0 = null;

        AntlrDatatypeRuleToken lv_beginTime_12_0 = null;

        AntlrDatatypeRuleToken lv_beginCropTime_14_0 = null;

        AntlrDatatypeRuleToken lv_duration_16_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:1562:2: ( (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'audio' ( (lv_enableAudio_5_0= ruleEBoolean ) ) )? ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? (otherlv_8= 'margins(' ( (lv_margins_9_0= ruleMargin ) )+ otherlv_10= ')' )? (otherlv_11= 'startAt' ( (lv_beginTime_12_0= ruleEInt ) ) )? (otherlv_13= 'cropAt' ( (lv_beginCropTime_14_0= ruleEInt ) ) )? (otherlv_15= 'during' ( (lv_duration_16_0= ruleEInt ) ) )? ) )
            // InternalCinEditor.g:1563:2: (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'audio' ( (lv_enableAudio_5_0= ruleEBoolean ) ) )? ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? (otherlv_8= 'margins(' ( (lv_margins_9_0= ruleMargin ) )+ otherlv_10= ')' )? (otherlv_11= 'startAt' ( (lv_beginTime_12_0= ruleEInt ) ) )? (otherlv_13= 'cropAt' ( (lv_beginCropTime_14_0= ruleEInt ) ) )? (otherlv_15= 'during' ( (lv_duration_16_0= ruleEInt ) ) )? )
            {
            // InternalCinEditor.g:1563:2: (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'audio' ( (lv_enableAudio_5_0= ruleEBoolean ) ) )? ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? (otherlv_8= 'margins(' ( (lv_margins_9_0= ruleMargin ) )+ otherlv_10= ')' )? (otherlv_11= 'startAt' ( (lv_beginTime_12_0= ruleEInt ) ) )? (otherlv_13= 'cropAt' ( (lv_beginCropTime_14_0= ruleEInt ) ) )? (otherlv_15= 'during' ( (lv_duration_16_0= ruleEInt ) ) )? )
            // InternalCinEditor.g:1564:3: otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_url_3_0= ruleEString ) ) (otherlv_4= 'audio' ( (lv_enableAudio_5_0= ruleEBoolean ) ) )? ( (lv_position_6_0= rulePosition ) )? ( (lv_dimension_7_0= ruleDimension ) )? (otherlv_8= 'margins(' ( (lv_margins_9_0= ruleMargin ) )+ otherlv_10= ')' )? (otherlv_11= 'startAt' ( (lv_beginTime_12_0= ruleEInt ) ) )? (otherlv_13= 'cropAt' ( (lv_beginCropTime_14_0= ruleEInt ) ) )? (otherlv_15= 'during' ( (lv_duration_16_0= ruleEInt ) ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoAccess().getVideoKeyword_0());
            		
            // InternalCinEditor.g:1568:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1569:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1569:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1570:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getVideoAccess().getEqualsSignKeyword_2());
            		
            // InternalCinEditor.g:1591:3: ( (lv_url_3_0= ruleEString ) )
            // InternalCinEditor.g:1592:4: (lv_url_3_0= ruleEString )
            {
            // InternalCinEditor.g:1592:4: (lv_url_3_0= ruleEString )
            // InternalCinEditor.g:1593:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalCinEditor.g:1610:3: (otherlv_4= 'audio' ( (lv_enableAudio_5_0= ruleEBoolean ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCinEditor.g:1611:4: otherlv_4= 'audio' ( (lv_enableAudio_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_42); 

                    				newLeafNode(otherlv_4, grammarAccess.getVideoAccess().getAudioKeyword_4_0());
                    			
                    // InternalCinEditor.g:1615:4: ( (lv_enableAudio_5_0= ruleEBoolean ) )
                    // InternalCinEditor.g:1616:5: (lv_enableAudio_5_0= ruleEBoolean )
                    {
                    // InternalCinEditor.g:1616:5: (lv_enableAudio_5_0= ruleEBoolean )
                    // InternalCinEditor.g:1617:6: lv_enableAudio_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getEnableAudioEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_enableAudio_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"enableAudio",
                    							lv_enableAudio_5_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:1635:3: ( (lv_position_6_0= rulePosition ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==14) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCinEditor.g:1636:4: (lv_position_6_0= rulePosition )
                    {
                    // InternalCinEditor.g:1636:4: (lv_position_6_0= rulePosition )
                    // InternalCinEditor.g:1637:5: lv_position_6_0= rulePosition
                    {

                    					newCompositeNode(grammarAccess.getVideoAccess().getPositionPositionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_44);
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

            // InternalCinEditor.g:1654:3: ( (lv_dimension_7_0= ruleDimension ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCinEditor.g:1655:4: (lv_dimension_7_0= ruleDimension )
                    {
                    // InternalCinEditor.g:1655:4: (lv_dimension_7_0= ruleDimension )
                    // InternalCinEditor.g:1656:5: lv_dimension_7_0= ruleDimension
                    {

                    					newCompositeNode(grammarAccess.getVideoAccess().getDimensionDimensionParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_45);
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

            // InternalCinEditor.g:1673:3: (otherlv_8= 'margins(' ( (lv_margins_9_0= ruleMargin ) )+ otherlv_10= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCinEditor.g:1674:4: otherlv_8= 'margins(' ( (lv_margins_9_0= ruleMargin ) )+ otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_8, grammarAccess.getVideoAccess().getMarginsKeyword_7_0());
                    			
                    // InternalCinEditor.g:1678:4: ( (lv_margins_9_0= ruleMargin ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0>=19 && LA37_0<=22)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalCinEditor.g:1679:5: (lv_margins_9_0= ruleMargin )
                    	    {
                    	    // InternalCinEditor.g:1679:5: (lv_margins_9_0= ruleMargin )
                    	    // InternalCinEditor.g:1680:6: lv_margins_9_0= ruleMargin
                    	    {

                    	    						newCompositeNode(grammarAccess.getVideoAccess().getMarginsMarginParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_32);
                    	    lv_margins_9_0=ruleMargin();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"margins",
                    	    							lv_margins_9_0,
                    	    							"polytech.spaceteam.cineditor.CinEditor.Margin");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_46); 

                    				newLeafNode(otherlv_10, grammarAccess.getVideoAccess().getRightParenthesisKeyword_7_2());
                    			

                    }
                    break;

            }

            // InternalCinEditor.g:1702:3: (otherlv_11= 'startAt' ( (lv_beginTime_12_0= ruleEInt ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCinEditor.g:1703:4: otherlv_11= 'startAt' ( (lv_beginTime_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getVideoAccess().getStartAtKeyword_8_0());
                    			
                    // InternalCinEditor.g:1707:4: ( (lv_beginTime_12_0= ruleEInt ) )
                    // InternalCinEditor.g:1708:5: (lv_beginTime_12_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1708:5: (lv_beginTime_12_0= ruleEInt )
                    // InternalCinEditor.g:1709:6: lv_beginTime_12_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getBeginTimeEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_beginTime_12_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"beginTime",
                    							lv_beginTime_12_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:1727:3: (otherlv_13= 'cropAt' ( (lv_beginCropTime_14_0= ruleEInt ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==37) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCinEditor.g:1728:4: otherlv_13= 'cropAt' ( (lv_beginCropTime_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,37,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getVideoAccess().getCropAtKeyword_9_0());
                    			
                    // InternalCinEditor.g:1732:4: ( (lv_beginCropTime_14_0= ruleEInt ) )
                    // InternalCinEditor.g:1733:5: (lv_beginCropTime_14_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1733:5: (lv_beginCropTime_14_0= ruleEInt )
                    // InternalCinEditor.g:1734:6: lv_beginCropTime_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getBeginCropTimeEIntParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_beginCropTime_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"beginCropTime",
                    							lv_beginCropTime_14_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:1752:3: (otherlv_15= 'during' ( (lv_duration_16_0= ruleEInt ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==38) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCinEditor.g:1753:4: otherlv_15= 'during' ( (lv_duration_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getVideoAccess().getDuringKeyword_10_0());
                    			
                    // InternalCinEditor.g:1757:4: ( (lv_duration_16_0= ruleEInt ) )
                    // InternalCinEditor.g:1758:5: (lv_duration_16_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1758:5: (lv_duration_16_0= ruleEInt )
                    // InternalCinEditor.g:1759:6: lv_duration_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getDurationEIntParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_duration_16_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_16_0,
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
    // InternalCinEditor.g:1781:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // InternalCinEditor.g:1781:50: (iv_ruleRectangle= ruleRectangle EOF )
            // InternalCinEditor.g:1782:2: iv_ruleRectangle= ruleRectangle EOF
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
    // InternalCinEditor.g:1788:1: ruleRectangle returns [EObject current=null] : (otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'margins(' ( (lv_margins_7_0= ruleMargin ) )+ otherlv_8= ')' )? (otherlv_9= 'startAt' ( (lv_beginTime_10_0= ruleEInt ) ) )? (otherlv_11= 'during' ( (lv_duration_12_0= ruleEInt ) ) )? ) ;
    public final EObject ruleRectangle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_color_3_0 = null;

        EObject lv_position_4_0 = null;

        EObject lv_dimension_5_0 = null;

        EObject lv_margins_7_0 = null;

        AntlrDatatypeRuleToken lv_beginTime_10_0 = null;

        AntlrDatatypeRuleToken lv_duration_12_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:1794:2: ( (otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'margins(' ( (lv_margins_7_0= ruleMargin ) )+ otherlv_8= ')' )? (otherlv_9= 'startAt' ( (lv_beginTime_10_0= ruleEInt ) ) )? (otherlv_11= 'during' ( (lv_duration_12_0= ruleEInt ) ) )? ) )
            // InternalCinEditor.g:1795:2: (otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'margins(' ( (lv_margins_7_0= ruleMargin ) )+ otherlv_8= ')' )? (otherlv_9= 'startAt' ( (lv_beginTime_10_0= ruleEInt ) ) )? (otherlv_11= 'during' ( (lv_duration_12_0= ruleEInt ) ) )? )
            {
            // InternalCinEditor.g:1795:2: (otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'margins(' ( (lv_margins_7_0= ruleMargin ) )+ otherlv_8= ')' )? (otherlv_9= 'startAt' ( (lv_beginTime_10_0= ruleEInt ) ) )? (otherlv_11= 'during' ( (lv_duration_12_0= ruleEInt ) ) )? )
            // InternalCinEditor.g:1796:3: otherlv_0= 'Rectangle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_color_3_0= ruleHexadecimalColor ) ) ( (lv_position_4_0= rulePosition ) )? ( (lv_dimension_5_0= ruleDimension ) )? (otherlv_6= 'margins(' ( (lv_margins_7_0= ruleMargin ) )+ otherlv_8= ')' )? (otherlv_9= 'startAt' ( (lv_beginTime_10_0= ruleEInt ) ) )? (otherlv_11= 'during' ( (lv_duration_12_0= ruleEInt ) ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRectangleAccess().getRectangleKeyword_0());
            		
            // InternalCinEditor.g:1800:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1801:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1801:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1802:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRectangleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,32,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getRectangleAccess().getEqualsSignKeyword_2());
            		
            // InternalCinEditor.g:1823:3: ( (lv_color_3_0= ruleHexadecimalColor ) )
            // InternalCinEditor.g:1824:4: (lv_color_3_0= ruleHexadecimalColor )
            {
            // InternalCinEditor.g:1824:4: (lv_color_3_0= ruleHexadecimalColor )
            // InternalCinEditor.g:1825:5: lv_color_3_0= ruleHexadecimalColor
            {

            					newCompositeNode(grammarAccess.getRectangleAccess().getColorHexadecimalColorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalCinEditor.g:1842:3: ( (lv_position_4_0= rulePosition ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==14) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCinEditor.g:1843:4: (lv_position_4_0= rulePosition )
                    {
                    // InternalCinEditor.g:1843:4: (lv_position_4_0= rulePosition )
                    // InternalCinEditor.g:1844:5: lv_position_4_0= rulePosition
                    {

                    					newCompositeNode(grammarAccess.getRectangleAccess().getPositionPositionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_37);
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

            // InternalCinEditor.g:1861:3: ( (lv_dimension_5_0= ruleDimension ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==23) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCinEditor.g:1862:4: (lv_dimension_5_0= ruleDimension )
                    {
                    // InternalCinEditor.g:1862:4: (lv_dimension_5_0= ruleDimension )
                    // InternalCinEditor.g:1863:5: lv_dimension_5_0= ruleDimension
                    {

                    					newCompositeNode(grammarAccess.getRectangleAccess().getDimensionDimensionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_38);
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

            // InternalCinEditor.g:1880:3: (otherlv_6= 'margins(' ( (lv_margins_7_0= ruleMargin ) )+ otherlv_8= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==42) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCinEditor.g:1881:4: otherlv_6= 'margins(' ( (lv_margins_7_0= ruleMargin ) )+ otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getRectangleAccess().getMarginsKeyword_6_0());
                    			
                    // InternalCinEditor.g:1885:4: ( (lv_margins_7_0= ruleMargin ) )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=19 && LA44_0<=22)) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalCinEditor.g:1886:5: (lv_margins_7_0= ruleMargin )
                    	    {
                    	    // InternalCinEditor.g:1886:5: (lv_margins_7_0= ruleMargin )
                    	    // InternalCinEditor.g:1887:6: lv_margins_7_0= ruleMargin
                    	    {

                    	    						newCompositeNode(grammarAccess.getRectangleAccess().getMarginsMarginParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_32);
                    	    lv_margins_7_0=ruleMargin();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRectangleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"margins",
                    	    							lv_margins_7_0,
                    	    							"polytech.spaceteam.cineditor.CinEditor.Margin");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt44 >= 1 ) break loop44;
                                EarlyExitException eee =
                                    new EarlyExitException(44, input);
                                throw eee;
                        }
                        cnt44++;
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_39); 

                    				newLeafNode(otherlv_8, grammarAccess.getRectangleAccess().getRightParenthesisKeyword_6_2());
                    			

                    }
                    break;

            }

            // InternalCinEditor.g:1909:3: (otherlv_9= 'startAt' ( (lv_beginTime_10_0= ruleEInt ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==36) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCinEditor.g:1910:4: otherlv_9= 'startAt' ( (lv_beginTime_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,36,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getRectangleAccess().getStartAtKeyword_7_0());
                    			
                    // InternalCinEditor.g:1914:4: ( (lv_beginTime_10_0= ruleEInt ) )
                    // InternalCinEditor.g:1915:5: (lv_beginTime_10_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1915:5: (lv_beginTime_10_0= ruleEInt )
                    // InternalCinEditor.g:1916:6: lv_beginTime_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRectangleAccess().getBeginTimeEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_beginTime_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRectangleRule());
                    						}
                    						set(
                    							current,
                    							"beginTime",
                    							lv_beginTime_10_0,
                    							"polytech.spaceteam.cineditor.CinEditor.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCinEditor.g:1934:3: (otherlv_11= 'during' ( (lv_duration_12_0= ruleEInt ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==38) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCinEditor.g:1935:4: otherlv_11= 'during' ( (lv_duration_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getRectangleAccess().getDuringKeyword_8_0());
                    			
                    // InternalCinEditor.g:1939:4: ( (lv_duration_12_0= ruleEInt ) )
                    // InternalCinEditor.g:1940:5: (lv_duration_12_0= ruleEInt )
                    {
                    // InternalCinEditor.g:1940:5: (lv_duration_12_0= ruleEInt )
                    // InternalCinEditor.g:1941:6: lv_duration_12_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRectangleAccess().getDurationEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_duration_12_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRectangleRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_12_0,
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
    // InternalCinEditor.g:1963:1: entryRuleFadeIn returns [EObject current=null] : iv_ruleFadeIn= ruleFadeIn EOF ;
    public final EObject entryRuleFadeIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFadeIn = null;


        try {
            // InternalCinEditor.g:1963:47: (iv_ruleFadeIn= ruleFadeIn EOF )
            // InternalCinEditor.g:1964:2: iv_ruleFadeIn= ruleFadeIn EOF
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
    // InternalCinEditor.g:1970:1: ruleFadeIn returns [EObject current=null] : (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ;
    public final EObject ruleFadeIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_5_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:1976:2: ( (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) )
            // InternalCinEditor.g:1977:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' )
            {
            // InternalCinEditor.g:1977:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' )
            // InternalCinEditor.g:1978:3: otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeIn' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFadeInAccess().getEffectKeyword_0());
            		
            // InternalCinEditor.g:1982:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:1983:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:1983:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:1984:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFadeInAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,32,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getFadeInAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,48,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getFadeInAccess().getFadeInKeyword_3());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getFadeInAccess().getDuringKeyword_4());
            		
            // InternalCinEditor.g:2013:3: ( (lv_duration_5_0= ruleEInt ) )
            // InternalCinEditor.g:2014:4: (lv_duration_5_0= ruleEInt )
            {
            // InternalCinEditor.g:2014:4: (lv_duration_5_0= ruleEInt )
            // InternalCinEditor.g:2015:5: lv_duration_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getFadeInAccess().getDurationEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_6=(Token)match(input,39,FOLLOW_50); 

            			newLeafNode(otherlv_6, grammarAccess.getFadeInAccess().getOnKeyword_6());
            		
            otherlv_7=(Token)match(input,49,FOLLOW_27); 

            			newLeafNode(otherlv_7, grammarAccess.getFadeInAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalCinEditor.g:2040:3: ( (otherlv_8= RULE_ID ) )
            // InternalCinEditor.g:2041:4: (otherlv_8= RULE_ID )
            {
            // InternalCinEditor.g:2041:4: (otherlv_8= RULE_ID )
            // InternalCinEditor.g:2042:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFadeInRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_51); 

            					newLeafNode(otherlv_8, grammarAccess.getFadeInAccess().getElementsGraphicalElementCrossReference_8_0());
            				

            }


            }

            // InternalCinEditor.g:2053:3: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==16) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalCinEditor.g:2054:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_27); 

            	    				newLeafNode(otherlv_9, grammarAccess.getFadeInAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalCinEditor.g:2058:4: ( (otherlv_10= RULE_ID ) )
            	    // InternalCinEditor.g:2059:5: (otherlv_10= RULE_ID )
            	    {
            	    // InternalCinEditor.g:2059:5: (otherlv_10= RULE_ID )
            	    // InternalCinEditor.g:2060:6: otherlv_10= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFadeInRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_51); 

            	    						newLeafNode(otherlv_10, grammarAccess.getFadeInAccess().getElementsGraphicalElementCrossReference_9_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_11=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFadeInAccess().getRightSquareBracketKeyword_10());
            		

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
    // InternalCinEditor.g:2080:1: entryRuleFadeOut returns [EObject current=null] : iv_ruleFadeOut= ruleFadeOut EOF ;
    public final EObject entryRuleFadeOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFadeOut = null;


        try {
            // InternalCinEditor.g:2080:48: (iv_ruleFadeOut= ruleFadeOut EOF )
            // InternalCinEditor.g:2081:2: iv_ruleFadeOut= ruleFadeOut EOF
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
    // InternalCinEditor.g:2087:1: ruleFadeOut returns [EObject current=null] : (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) ;
    public final EObject ruleFadeOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_5_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:2093:2: ( (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' ) )
            // InternalCinEditor.g:2094:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' )
            {
            // InternalCinEditor.g:2094:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']' )
            // InternalCinEditor.g:2095:3: otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'FadeOut' otherlv_4= 'during' ( (lv_duration_5_0= ruleEInt ) ) otherlv_6= 'on' otherlv_7= '[' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ']'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFadeOutAccess().getEffectKeyword_0());
            		
            // InternalCinEditor.g:2099:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:2100:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:2100:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:2101:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFadeOutAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,32,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getFadeOutAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,51,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getFadeOutAccess().getFadeOutKeyword_3());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getFadeOutAccess().getDuringKeyword_4());
            		
            // InternalCinEditor.g:2130:3: ( (lv_duration_5_0= ruleEInt ) )
            // InternalCinEditor.g:2131:4: (lv_duration_5_0= ruleEInt )
            {
            // InternalCinEditor.g:2131:4: (lv_duration_5_0= ruleEInt )
            // InternalCinEditor.g:2132:5: lv_duration_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getFadeOutAccess().getDurationEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_6=(Token)match(input,39,FOLLOW_50); 

            			newLeafNode(otherlv_6, grammarAccess.getFadeOutAccess().getOnKeyword_6());
            		
            otherlv_7=(Token)match(input,49,FOLLOW_27); 

            			newLeafNode(otherlv_7, grammarAccess.getFadeOutAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalCinEditor.g:2157:3: ( (otherlv_8= RULE_ID ) )
            // InternalCinEditor.g:2158:4: (otherlv_8= RULE_ID )
            {
            // InternalCinEditor.g:2158:4: (otherlv_8= RULE_ID )
            // InternalCinEditor.g:2159:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFadeOutRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_51); 

            					newLeafNode(otherlv_8, grammarAccess.getFadeOutAccess().getElementsGraphicalElementCrossReference_8_0());
            				

            }


            }

            // InternalCinEditor.g:2170:3: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==16) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalCinEditor.g:2171:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_27); 

            	    				newLeafNode(otherlv_9, grammarAccess.getFadeOutAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalCinEditor.g:2175:4: ( (otherlv_10= RULE_ID ) )
            	    // InternalCinEditor.g:2176:5: (otherlv_10= RULE_ID )
            	    {
            	    // InternalCinEditor.g:2176:5: (otherlv_10= RULE_ID )
            	    // InternalCinEditor.g:2177:6: otherlv_10= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFadeOutRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_51); 

            	    						newLeafNode(otherlv_10, grammarAccess.getFadeOutAccess().getElementsGraphicalElementCrossReference_9_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_11=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFadeOutAccess().getRightSquareBracketKeyword_10());
            		

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
    // InternalCinEditor.g:2197:1: entryRuleTranslate returns [EObject current=null] : iv_ruleTranslate= ruleTranslate EOF ;
    public final EObject entryRuleTranslate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTranslate = null;


        try {
            // InternalCinEditor.g:2197:50: (iv_ruleTranslate= ruleTranslate EOF )
            // InternalCinEditor.g:2198:2: iv_ruleTranslate= ruleTranslate EOF
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
    // InternalCinEditor.g:2204:1: ruleTranslate returns [EObject current=null] : (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) (otherlv_5= 'startAt' ( (lv_beginTime_6_0= ruleEInt ) ) )? (otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) )? otherlv_9= 'on' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' ) ;
    public final EObject ruleTranslate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_positionToTranslate_4_0 = null;

        AntlrDatatypeRuleToken lv_beginTime_6_0 = null;

        AntlrDatatypeRuleToken lv_duration_8_0 = null;



        	enterRule();

        try {
            // InternalCinEditor.g:2210:2: ( (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) (otherlv_5= 'startAt' ( (lv_beginTime_6_0= ruleEInt ) ) )? (otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) )? otherlv_9= 'on' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' ) )
            // InternalCinEditor.g:2211:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) (otherlv_5= 'startAt' ( (lv_beginTime_6_0= ruleEInt ) ) )? (otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) )? otherlv_9= 'on' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' )
            {
            // InternalCinEditor.g:2211:2: (otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) (otherlv_5= 'startAt' ( (lv_beginTime_6_0= ruleEInt ) ) )? (otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) )? otherlv_9= 'on' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' )
            // InternalCinEditor.g:2212:3: otherlv_0= 'Effect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '=' otherlv_3= 'Translate' ( (lv_positionToTranslate_4_0= rulePosition ) ) (otherlv_5= 'startAt' ( (lv_beginTime_6_0= ruleEInt ) ) )? (otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) )? otherlv_9= 'on' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTranslateAccess().getEffectKeyword_0());
            		
            // InternalCinEditor.g:2216:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCinEditor.g:2217:4: (lv_name_1_0= ruleEString )
            {
            // InternalCinEditor.g:2217:4: (lv_name_1_0= ruleEString )
            // InternalCinEditor.g:2218:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTranslateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,32,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getTranslateAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,52,FOLLOW_54); 

            			newLeafNode(otherlv_3, grammarAccess.getTranslateAccess().getTranslateKeyword_3());
            		
            // InternalCinEditor.g:2243:3: ( (lv_positionToTranslate_4_0= rulePosition ) )
            // InternalCinEditor.g:2244:4: (lv_positionToTranslate_4_0= rulePosition )
            {
            // InternalCinEditor.g:2244:4: (lv_positionToTranslate_4_0= rulePosition )
            // InternalCinEditor.g:2245:5: lv_positionToTranslate_4_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getTranslateAccess().getPositionToTranslatePositionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_55);
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

            // InternalCinEditor.g:2262:3: (otherlv_5= 'startAt' ( (lv_beginTime_6_0= ruleEInt ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==36) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCinEditor.g:2263:4: otherlv_5= 'startAt' ( (lv_beginTime_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getTranslateAccess().getStartAtKeyword_5_0());
                    			
                    // InternalCinEditor.g:2267:4: ( (lv_beginTime_6_0= ruleEInt ) )
                    // InternalCinEditor.g:2268:5: (lv_beginTime_6_0= ruleEInt )
                    {
                    // InternalCinEditor.g:2268:5: (lv_beginTime_6_0= ruleEInt )
                    // InternalCinEditor.g:2269:6: lv_beginTime_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTranslateAccess().getBeginTimeEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_25);
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

            // InternalCinEditor.g:2287:3: (otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==38) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCinEditor.g:2288:4: otherlv_7= 'during' ( (lv_duration_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getTranslateAccess().getDuringKeyword_6_0());
                    			
                    // InternalCinEditor.g:2292:4: ( (lv_duration_8_0= ruleEInt ) )
                    // InternalCinEditor.g:2293:5: (lv_duration_8_0= ruleEInt )
                    {
                    // InternalCinEditor.g:2293:5: (lv_duration_8_0= ruleEInt )
                    // InternalCinEditor.g:2294:6: lv_duration_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTranslateAccess().getDurationEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_26);
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

            otherlv_9=(Token)match(input,39,FOLLOW_50); 

            			newLeafNode(otherlv_9, grammarAccess.getTranslateAccess().getOnKeyword_7());
            		
            otherlv_10=(Token)match(input,49,FOLLOW_27); 

            			newLeafNode(otherlv_10, grammarAccess.getTranslateAccess().getLeftSquareBracketKeyword_8());
            		
            // InternalCinEditor.g:2320:3: ( (otherlv_11= RULE_ID ) )
            // InternalCinEditor.g:2321:4: (otherlv_11= RULE_ID )
            {
            // InternalCinEditor.g:2321:4: (otherlv_11= RULE_ID )
            // InternalCinEditor.g:2322:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTranslateRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_51); 

            					newLeafNode(otherlv_11, grammarAccess.getTranslateAccess().getElementsGraphicalElementCrossReference_9_0());
            				

            }


            }

            // InternalCinEditor.g:2333:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==16) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalCinEditor.g:2334:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,16,FOLLOW_27); 

            	    				newLeafNode(otherlv_12, grammarAccess.getTranslateAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalCinEditor.g:2338:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalCinEditor.g:2339:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalCinEditor.g:2339:5: (otherlv_13= RULE_ID )
            	    // InternalCinEditor.g:2340:6: otherlv_13= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTranslateRule());
            	    						}
            	    					
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_51); 

            	    						newLeafNode(otherlv_13, grammarAccess.getTranslateAccess().getElementsGraphicalElementCrossReference_10_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_14=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTranslateAccess().getRightSquareBracketKeyword_11());
            		

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


    // $ANTLR start "ruleMARGIN_NAME"
    // InternalCinEditor.g:2360:1: ruleMARGIN_NAME returns [Enumerator current=null] : ( (enumLiteral_0= 'bottom' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) | (enumLiteral_3= 'top' ) ) ;
    public final Enumerator ruleMARGIN_NAME() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCinEditor.g:2366:2: ( ( (enumLiteral_0= 'bottom' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) | (enumLiteral_3= 'top' ) ) )
            // InternalCinEditor.g:2367:2: ( (enumLiteral_0= 'bottom' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) | (enumLiteral_3= 'top' ) )
            {
            // InternalCinEditor.g:2367:2: ( (enumLiteral_0= 'bottom' ) | (enumLiteral_1= 'left' ) | (enumLiteral_2= 'right' ) | (enumLiteral_3= 'top' ) )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt53=1;
                }
                break;
            case 19:
                {
                alt53=2;
                }
                break;
            case 20:
                {
                alt53=3;
                }
                break;
            case 22:
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalCinEditor.g:2368:3: (enumLiteral_0= 'bottom' )
                    {
                    // InternalCinEditor.g:2368:3: (enumLiteral_0= 'bottom' )
                    // InternalCinEditor.g:2369:4: enumLiteral_0= 'bottom'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getMARGIN_NAMEAccess().getBOTTOMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMARGIN_NAMEAccess().getBOTTOMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:2376:3: (enumLiteral_1= 'left' )
                    {
                    // InternalCinEditor.g:2376:3: (enumLiteral_1= 'left' )
                    // InternalCinEditor.g:2377:4: enumLiteral_1= 'left'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getMARGIN_NAMEAccess().getLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMARGIN_NAMEAccess().getLEFTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCinEditor.g:2384:3: (enumLiteral_2= 'right' )
                    {
                    // InternalCinEditor.g:2384:3: (enumLiteral_2= 'right' )
                    // InternalCinEditor.g:2385:4: enumLiteral_2= 'right'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getMARGIN_NAMEAccess().getRIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMARGIN_NAMEAccess().getRIGHTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCinEditor.g:2392:3: (enumLiteral_3= 'top' )
                    {
                    // InternalCinEditor.g:2392:3: (enumLiteral_3= 'top' )
                    // InternalCinEditor.g:2393:4: enumLiteral_3= 'top'
                    {
                    enumLiteral_3=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getMARGIN_NAMEAccess().getTOPEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMARGIN_NAMEAccess().getTOPEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleMARGIN_NAME"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\37\1\uffff\1\4\1\uffff\2\40\1\60\3\uffff";
    static final String dfa_3s = "\1\57\1\uffff\1\5\1\uffff\2\40\1\64\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\5\3\uffff\1\4\1\3\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\10\uffff\1\1\2\uffff\2\1\1\uffff\1\1\1\2",
            "",
            "\1\4\1\5",
            "",
            "\1\6",
            "\1\6",
            "\1\11\2\uffff\1\10\1\7",
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
            return "184:2: (this_GraphicalElement_0= ruleGraphicalElement | this_FadeIn_1= ruleFadeIn | this_FadeOut_2= ruleFadeOut | this_Translate_3= ruleTranslate | this_AudioElement_4= ruleAudioElement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000D90080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000D90080000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000087C0040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000006020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010010002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000FC00000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000F800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000065002004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000045002004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000045002000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000007A0000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000005002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000045000804002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000045000800002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000045000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000005000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000247000804002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000047000804002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000047000800002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000047000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000000D000000000L});

}