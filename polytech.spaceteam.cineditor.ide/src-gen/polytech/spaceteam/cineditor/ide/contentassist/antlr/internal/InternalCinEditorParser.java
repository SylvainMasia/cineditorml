package polytech.spaceteam.cineditor.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import polytech.spaceteam.cineditor.services.CinEditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCinEditorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Movie'", "'Layer'", "'position'", "'x'", "'('", "','", "')'", "'-'", "'Text'", "'->'", "'at'", "'during'", "'Picture'", "'\"'", "'Video'", "'from'", "'Effect'", "'FadeIn'", "'on'", "'FadeOut'", "'Translate'", "'Rectangle'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
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

    	public void setGrammarAccess(CinEditorGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMovie"
    // InternalCinEditor.g:53:1: entryRuleMovie : ruleMovie EOF ;
    public final void entryRuleMovie() throws RecognitionException {
        try {
            // InternalCinEditor.g:54:1: ( ruleMovie EOF )
            // InternalCinEditor.g:55:1: ruleMovie EOF
            {
             before(grammarAccess.getMovieRule()); 
            pushFollow(FOLLOW_1);
            ruleMovie();

            state._fsp--;

             after(grammarAccess.getMovieRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMovie"


    // $ANTLR start "ruleMovie"
    // InternalCinEditor.g:62:1: ruleMovie : ( ( rule__Movie__Group__0 ) ) ;
    public final void ruleMovie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:66:2: ( ( ( rule__Movie__Group__0 ) ) )
            // InternalCinEditor.g:67:2: ( ( rule__Movie__Group__0 ) )
            {
            // InternalCinEditor.g:67:2: ( ( rule__Movie__Group__0 ) )
            // InternalCinEditor.g:68:3: ( rule__Movie__Group__0 )
            {
             before(grammarAccess.getMovieAccess().getGroup()); 
            // InternalCinEditor.g:69:3: ( rule__Movie__Group__0 )
            // InternalCinEditor.g:69:4: rule__Movie__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Movie__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMovie"


    // $ANTLR start "entryRuleElement"
    // InternalCinEditor.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalCinEditor.g:79:1: ( ruleElement EOF )
            // InternalCinEditor.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalCinEditor.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalCinEditor.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalCinEditor.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalCinEditor.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalCinEditor.g:94:3: ( rule__Element__Alternatives )
            // InternalCinEditor.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleLayer"
    // InternalCinEditor.g:103:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // InternalCinEditor.g:104:1: ( ruleLayer EOF )
            // InternalCinEditor.g:105:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalCinEditor.g:112:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:116:2: ( ( ( rule__Layer__Group__0 ) ) )
            // InternalCinEditor.g:117:2: ( ( rule__Layer__Group__0 ) )
            {
            // InternalCinEditor.g:117:2: ( ( rule__Layer__Group__0 ) )
            // InternalCinEditor.g:118:3: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // InternalCinEditor.g:119:3: ( rule__Layer__Group__0 )
            // InternalCinEditor.g:119:4: rule__Layer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleEString"
    // InternalCinEditor.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCinEditor.g:129:1: ( ruleEString EOF )
            // InternalCinEditor.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCinEditor.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCinEditor.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCinEditor.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalCinEditor.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCinEditor.g:144:3: ( rule__EString__Alternatives )
            // InternalCinEditor.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePosition"
    // InternalCinEditor.g:153:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // InternalCinEditor.g:154:1: ( rulePosition EOF )
            // InternalCinEditor.g:155:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalCinEditor.g:162:1: rulePosition : ( ( rule__Position__Group__0 ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:166:2: ( ( ( rule__Position__Group__0 ) ) )
            // InternalCinEditor.g:167:2: ( ( rule__Position__Group__0 ) )
            {
            // InternalCinEditor.g:167:2: ( ( rule__Position__Group__0 ) )
            // InternalCinEditor.g:168:3: ( rule__Position__Group__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup()); 
            // InternalCinEditor.g:169:3: ( rule__Position__Group__0 )
            // InternalCinEditor.g:169:4: rule__Position__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleEInt"
    // InternalCinEditor.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalCinEditor.g:179:1: ( ruleEInt EOF )
            // InternalCinEditor.g:180:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalCinEditor.g:187:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:191:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalCinEditor.g:192:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalCinEditor.g:192:2: ( ( rule__EInt__Group__0 ) )
            // InternalCinEditor.g:193:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalCinEditor.g:194:3: ( rule__EInt__Group__0 )
            // InternalCinEditor.g:194:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleText"
    // InternalCinEditor.g:203:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalCinEditor.g:204:1: ( ruleText EOF )
            // InternalCinEditor.g:205:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalCinEditor.g:212:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:216:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalCinEditor.g:217:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalCinEditor.g:217:2: ( ( rule__Text__Group__0 ) )
            // InternalCinEditor.g:218:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalCinEditor.g:219:3: ( rule__Text__Group__0 )
            // InternalCinEditor.g:219:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRulePicture"
    // InternalCinEditor.g:228:1: entryRulePicture : rulePicture EOF ;
    public final void entryRulePicture() throws RecognitionException {
        try {
            // InternalCinEditor.g:229:1: ( rulePicture EOF )
            // InternalCinEditor.g:230:1: rulePicture EOF
            {
             before(grammarAccess.getPictureRule()); 
            pushFollow(FOLLOW_1);
            rulePicture();

            state._fsp--;

             after(grammarAccess.getPictureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePicture"


    // $ANTLR start "rulePicture"
    // InternalCinEditor.g:237:1: rulePicture : ( ( rule__Picture__Group__0 ) ) ;
    public final void rulePicture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:241:2: ( ( ( rule__Picture__Group__0 ) ) )
            // InternalCinEditor.g:242:2: ( ( rule__Picture__Group__0 ) )
            {
            // InternalCinEditor.g:242:2: ( ( rule__Picture__Group__0 ) )
            // InternalCinEditor.g:243:3: ( rule__Picture__Group__0 )
            {
             before(grammarAccess.getPictureAccess().getGroup()); 
            // InternalCinEditor.g:244:3: ( rule__Picture__Group__0 )
            // InternalCinEditor.g:244:4: rule__Picture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePicture"


    // $ANTLR start "entryRuleVideo"
    // InternalCinEditor.g:253:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalCinEditor.g:254:1: ( ruleVideo EOF )
            // InternalCinEditor.g:255:1: ruleVideo EOF
            {
             before(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getVideoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalCinEditor.g:262:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:266:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalCinEditor.g:267:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalCinEditor.g:267:2: ( ( rule__Video__Group__0 ) )
            // InternalCinEditor.g:268:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalCinEditor.g:269:3: ( rule__Video__Group__0 )
            // InternalCinEditor.g:269:4: rule__Video__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleFadeIn"
    // InternalCinEditor.g:278:1: entryRuleFadeIn : ruleFadeIn EOF ;
    public final void entryRuleFadeIn() throws RecognitionException {
        try {
            // InternalCinEditor.g:279:1: ( ruleFadeIn EOF )
            // InternalCinEditor.g:280:1: ruleFadeIn EOF
            {
             before(grammarAccess.getFadeInRule()); 
            pushFollow(FOLLOW_1);
            ruleFadeIn();

            state._fsp--;

             after(grammarAccess.getFadeInRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFadeIn"


    // $ANTLR start "ruleFadeIn"
    // InternalCinEditor.g:287:1: ruleFadeIn : ( ( rule__FadeIn__Group__0 ) ) ;
    public final void ruleFadeIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:291:2: ( ( ( rule__FadeIn__Group__0 ) ) )
            // InternalCinEditor.g:292:2: ( ( rule__FadeIn__Group__0 ) )
            {
            // InternalCinEditor.g:292:2: ( ( rule__FadeIn__Group__0 ) )
            // InternalCinEditor.g:293:3: ( rule__FadeIn__Group__0 )
            {
             before(grammarAccess.getFadeInAccess().getGroup()); 
            // InternalCinEditor.g:294:3: ( rule__FadeIn__Group__0 )
            // InternalCinEditor.g:294:4: rule__FadeIn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFadeInAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFadeIn"


    // $ANTLR start "entryRuleFadeOut"
    // InternalCinEditor.g:303:1: entryRuleFadeOut : ruleFadeOut EOF ;
    public final void entryRuleFadeOut() throws RecognitionException {
        try {
            // InternalCinEditor.g:304:1: ( ruleFadeOut EOF )
            // InternalCinEditor.g:305:1: ruleFadeOut EOF
            {
             before(grammarAccess.getFadeOutRule()); 
            pushFollow(FOLLOW_1);
            ruleFadeOut();

            state._fsp--;

             after(grammarAccess.getFadeOutRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFadeOut"


    // $ANTLR start "ruleFadeOut"
    // InternalCinEditor.g:312:1: ruleFadeOut : ( ( rule__FadeOut__Group__0 ) ) ;
    public final void ruleFadeOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:316:2: ( ( ( rule__FadeOut__Group__0 ) ) )
            // InternalCinEditor.g:317:2: ( ( rule__FadeOut__Group__0 ) )
            {
            // InternalCinEditor.g:317:2: ( ( rule__FadeOut__Group__0 ) )
            // InternalCinEditor.g:318:3: ( rule__FadeOut__Group__0 )
            {
             before(grammarAccess.getFadeOutAccess().getGroup()); 
            // InternalCinEditor.g:319:3: ( rule__FadeOut__Group__0 )
            // InternalCinEditor.g:319:4: rule__FadeOut__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFadeOutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFadeOut"


    // $ANTLR start "entryRuleTranslate"
    // InternalCinEditor.g:328:1: entryRuleTranslate : ruleTranslate EOF ;
    public final void entryRuleTranslate() throws RecognitionException {
        try {
            // InternalCinEditor.g:329:1: ( ruleTranslate EOF )
            // InternalCinEditor.g:330:1: ruleTranslate EOF
            {
             before(grammarAccess.getTranslateRule()); 
            pushFollow(FOLLOW_1);
            ruleTranslate();

            state._fsp--;

             after(grammarAccess.getTranslateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTranslate"


    // $ANTLR start "ruleTranslate"
    // InternalCinEditor.g:337:1: ruleTranslate : ( ( rule__Translate__Group__0 ) ) ;
    public final void ruleTranslate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:341:2: ( ( ( rule__Translate__Group__0 ) ) )
            // InternalCinEditor.g:342:2: ( ( rule__Translate__Group__0 ) )
            {
            // InternalCinEditor.g:342:2: ( ( rule__Translate__Group__0 ) )
            // InternalCinEditor.g:343:3: ( rule__Translate__Group__0 )
            {
             before(grammarAccess.getTranslateAccess().getGroup()); 
            // InternalCinEditor.g:344:3: ( rule__Translate__Group__0 )
            // InternalCinEditor.g:344:4: rule__Translate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Translate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTranslateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTranslate"


    // $ANTLR start "entryRuleRectangle"
    // InternalCinEditor.g:353:1: entryRuleRectangle : ruleRectangle EOF ;
    public final void entryRuleRectangle() throws RecognitionException {
        try {
            // InternalCinEditor.g:354:1: ( ruleRectangle EOF )
            // InternalCinEditor.g:355:1: ruleRectangle EOF
            {
             before(grammarAccess.getRectangleRule()); 
            pushFollow(FOLLOW_1);
            ruleRectangle();

            state._fsp--;

             after(grammarAccess.getRectangleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRectangle"


    // $ANTLR start "ruleRectangle"
    // InternalCinEditor.g:362:1: ruleRectangle : ( ( rule__Rectangle__Group__0 ) ) ;
    public final void ruleRectangle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:366:2: ( ( ( rule__Rectangle__Group__0 ) ) )
            // InternalCinEditor.g:367:2: ( ( rule__Rectangle__Group__0 ) )
            {
            // InternalCinEditor.g:367:2: ( ( rule__Rectangle__Group__0 ) )
            // InternalCinEditor.g:368:3: ( rule__Rectangle__Group__0 )
            {
             before(grammarAccess.getRectangleAccess().getGroup()); 
            // InternalCinEditor.g:369:3: ( rule__Rectangle__Group__0 )
            // InternalCinEditor.g:369:4: rule__Rectangle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRectangle"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalCinEditor.g:377:1: rule__Element__Alternatives : ( ( ruleText ) | ( rulePicture ) | ( ruleVideo ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleRectangle ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:381:1: ( ( ruleText ) | ( rulePicture ) | ( ruleVideo ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleRectangle ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCinEditor.g:382:2: ( ruleText )
                    {
                    // InternalCinEditor.g:382:2: ( ruleText )
                    // InternalCinEditor.g:383:3: ruleText
                    {
                     before(grammarAccess.getElementAccess().getTextParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:388:2: ( rulePicture )
                    {
                    // InternalCinEditor.g:388:2: ( rulePicture )
                    // InternalCinEditor.g:389:3: rulePicture
                    {
                     before(grammarAccess.getElementAccess().getPictureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePicture();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPictureParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCinEditor.g:394:2: ( ruleVideo )
                    {
                    // InternalCinEditor.g:394:2: ( ruleVideo )
                    // InternalCinEditor.g:395:3: ruleVideo
                    {
                     before(grammarAccess.getElementAccess().getVideoParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVideo();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getVideoParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCinEditor.g:400:2: ( ruleFadeIn )
                    {
                    // InternalCinEditor.g:400:2: ( ruleFadeIn )
                    // InternalCinEditor.g:401:3: ruleFadeIn
                    {
                     before(grammarAccess.getElementAccess().getFadeInParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFadeIn();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFadeInParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCinEditor.g:406:2: ( ruleFadeOut )
                    {
                    // InternalCinEditor.g:406:2: ( ruleFadeOut )
                    // InternalCinEditor.g:407:3: ruleFadeOut
                    {
                     before(grammarAccess.getElementAccess().getFadeOutParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFadeOut();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFadeOutParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCinEditor.g:412:2: ( ruleTranslate )
                    {
                    // InternalCinEditor.g:412:2: ( ruleTranslate )
                    // InternalCinEditor.g:413:3: ruleTranslate
                    {
                     before(grammarAccess.getElementAccess().getTranslateParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTranslate();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTranslateParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCinEditor.g:418:2: ( ruleRectangle )
                    {
                    // InternalCinEditor.g:418:2: ( ruleRectangle )
                    // InternalCinEditor.g:419:3: ruleRectangle
                    {
                     before(grammarAccess.getElementAccess().getRectangleParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleRectangle();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getRectangleParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCinEditor.g:428:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:432:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCinEditor.g:433:2: ( RULE_STRING )
                    {
                    // InternalCinEditor.g:433:2: ( RULE_STRING )
                    // InternalCinEditor.g:434:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:439:2: ( RULE_ID )
                    {
                    // InternalCinEditor.g:439:2: ( RULE_ID )
                    // InternalCinEditor.g:440:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Movie__Group__0"
    // InternalCinEditor.g:449:1: rule__Movie__Group__0 : rule__Movie__Group__0__Impl rule__Movie__Group__1 ;
    public final void rule__Movie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:453:1: ( rule__Movie__Group__0__Impl rule__Movie__Group__1 )
            // InternalCinEditor.g:454:2: rule__Movie__Group__0__Impl rule__Movie__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Movie__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__0"


    // $ANTLR start "rule__Movie__Group__0__Impl"
    // InternalCinEditor.g:461:1: rule__Movie__Group__0__Impl : ( 'Movie' ) ;
    public final void rule__Movie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:465:1: ( ( 'Movie' ) )
            // InternalCinEditor.g:466:1: ( 'Movie' )
            {
            // InternalCinEditor.g:466:1: ( 'Movie' )
            // InternalCinEditor.g:467:2: 'Movie'
            {
             before(grammarAccess.getMovieAccess().getMovieKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getMovieKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__0__Impl"


    // $ANTLR start "rule__Movie__Group__1"
    // InternalCinEditor.g:476:1: rule__Movie__Group__1 : rule__Movie__Group__1__Impl rule__Movie__Group__2 ;
    public final void rule__Movie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:480:1: ( rule__Movie__Group__1__Impl rule__Movie__Group__2 )
            // InternalCinEditor.g:481:2: rule__Movie__Group__1__Impl rule__Movie__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Movie__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__1"


    // $ANTLR start "rule__Movie__Group__1__Impl"
    // InternalCinEditor.g:488:1: rule__Movie__Group__1__Impl : ( ( rule__Movie__NameAssignment_1 ) ) ;
    public final void rule__Movie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:492:1: ( ( ( rule__Movie__NameAssignment_1 ) ) )
            // InternalCinEditor.g:493:1: ( ( rule__Movie__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:493:1: ( ( rule__Movie__NameAssignment_1 ) )
            // InternalCinEditor.g:494:2: ( rule__Movie__NameAssignment_1 )
            {
             before(grammarAccess.getMovieAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:495:2: ( rule__Movie__NameAssignment_1 )
            // InternalCinEditor.g:495:3: rule__Movie__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Movie__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__1__Impl"


    // $ANTLR start "rule__Movie__Group__2"
    // InternalCinEditor.g:503:1: rule__Movie__Group__2 : rule__Movie__Group__2__Impl rule__Movie__Group__3 ;
    public final void rule__Movie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:507:1: ( rule__Movie__Group__2__Impl rule__Movie__Group__3 )
            // InternalCinEditor.g:508:2: rule__Movie__Group__2__Impl rule__Movie__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Movie__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__2"


    // $ANTLR start "rule__Movie__Group__2__Impl"
    // InternalCinEditor.g:515:1: rule__Movie__Group__2__Impl : ( ( rule__Movie__PositionAssignment_2 ) ) ;
    public final void rule__Movie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:519:1: ( ( ( rule__Movie__PositionAssignment_2 ) ) )
            // InternalCinEditor.g:520:1: ( ( rule__Movie__PositionAssignment_2 ) )
            {
            // InternalCinEditor.g:520:1: ( ( rule__Movie__PositionAssignment_2 ) )
            // InternalCinEditor.g:521:2: ( rule__Movie__PositionAssignment_2 )
            {
             before(grammarAccess.getMovieAccess().getPositionAssignment_2()); 
            // InternalCinEditor.g:522:2: ( rule__Movie__PositionAssignment_2 )
            // InternalCinEditor.g:522:3: rule__Movie__PositionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Movie__PositionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getPositionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__2__Impl"


    // $ANTLR start "rule__Movie__Group__3"
    // InternalCinEditor.g:530:1: rule__Movie__Group__3 : rule__Movie__Group__3__Impl ;
    public final void rule__Movie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:534:1: ( rule__Movie__Group__3__Impl )
            // InternalCinEditor.g:535:2: rule__Movie__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Movie__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__3"


    // $ANTLR start "rule__Movie__Group__3__Impl"
    // InternalCinEditor.g:541:1: rule__Movie__Group__3__Impl : ( ( ( rule__Movie__LayersAssignment_3 ) ) ( ( rule__Movie__LayersAssignment_3 )* ) ) ;
    public final void rule__Movie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:545:1: ( ( ( ( rule__Movie__LayersAssignment_3 ) ) ( ( rule__Movie__LayersAssignment_3 )* ) ) )
            // InternalCinEditor.g:546:1: ( ( ( rule__Movie__LayersAssignment_3 ) ) ( ( rule__Movie__LayersAssignment_3 )* ) )
            {
            // InternalCinEditor.g:546:1: ( ( ( rule__Movie__LayersAssignment_3 ) ) ( ( rule__Movie__LayersAssignment_3 )* ) )
            // InternalCinEditor.g:547:2: ( ( rule__Movie__LayersAssignment_3 ) ) ( ( rule__Movie__LayersAssignment_3 )* )
            {
            // InternalCinEditor.g:547:2: ( ( rule__Movie__LayersAssignment_3 ) )
            // InternalCinEditor.g:548:3: ( rule__Movie__LayersAssignment_3 )
            {
             before(grammarAccess.getMovieAccess().getLayersAssignment_3()); 
            // InternalCinEditor.g:549:3: ( rule__Movie__LayersAssignment_3 )
            // InternalCinEditor.g:549:4: rule__Movie__LayersAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__Movie__LayersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getLayersAssignment_3()); 

            }

            // InternalCinEditor.g:552:2: ( ( rule__Movie__LayersAssignment_3 )* )
            // InternalCinEditor.g:553:3: ( rule__Movie__LayersAssignment_3 )*
            {
             before(grammarAccess.getMovieAccess().getLayersAssignment_3()); 
            // InternalCinEditor.g:554:3: ( rule__Movie__LayersAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCinEditor.g:554:4: rule__Movie__LayersAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Movie__LayersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMovieAccess().getLayersAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__3__Impl"


    // $ANTLR start "rule__Layer__Group__0"
    // InternalCinEditor.g:564:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:568:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalCinEditor.g:569:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0"


    // $ANTLR start "rule__Layer__Group__0__Impl"
    // InternalCinEditor.g:576:1: rule__Layer__Group__0__Impl : ( () ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:580:1: ( ( () ) )
            // InternalCinEditor.g:581:1: ( () )
            {
            // InternalCinEditor.g:581:1: ( () )
            // InternalCinEditor.g:582:2: ()
            {
             before(grammarAccess.getLayerAccess().getLayerAction_0()); 
            // InternalCinEditor.g:583:2: ()
            // InternalCinEditor.g:583:3: 
            {
            }

             after(grammarAccess.getLayerAccess().getLayerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0__Impl"


    // $ANTLR start "rule__Layer__Group__1"
    // InternalCinEditor.g:591:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:595:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalCinEditor.g:596:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Layer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1"


    // $ANTLR start "rule__Layer__Group__1__Impl"
    // InternalCinEditor.g:603:1: rule__Layer__Group__1__Impl : ( 'Layer' ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:607:1: ( ( 'Layer' ) )
            // InternalCinEditor.g:608:1: ( 'Layer' )
            {
            // InternalCinEditor.g:608:1: ( 'Layer' )
            // InternalCinEditor.g:609:2: 'Layer'
            {
             before(grammarAccess.getLayerAccess().getLayerKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLayerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__1__Impl"


    // $ANTLR start "rule__Layer__Group__2"
    // InternalCinEditor.g:618:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:622:1: ( rule__Layer__Group__2__Impl )
            // InternalCinEditor.g:623:2: rule__Layer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2"


    // $ANTLR start "rule__Layer__Group__2__Impl"
    // InternalCinEditor.g:629:1: rule__Layer__Group__2__Impl : ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:633:1: ( ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) ) )
            // InternalCinEditor.g:634:1: ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) )
            {
            // InternalCinEditor.g:634:1: ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) )
            // InternalCinEditor.g:635:2: ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* )
            {
            // InternalCinEditor.g:635:2: ( ( rule__Layer__ElementsAssignment_2 ) )
            // InternalCinEditor.g:636:3: ( rule__Layer__ElementsAssignment_2 )
            {
             before(grammarAccess.getLayerAccess().getElementsAssignment_2()); 
            // InternalCinEditor.g:637:3: ( rule__Layer__ElementsAssignment_2 )
            // InternalCinEditor.g:637:4: rule__Layer__ElementsAssignment_2
            {
            pushFollow(FOLLOW_8);
            rule__Layer__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getElementsAssignment_2()); 

            }

            // InternalCinEditor.g:640:2: ( ( rule__Layer__ElementsAssignment_2 )* )
            // InternalCinEditor.g:641:3: ( rule__Layer__ElementsAssignment_2 )*
            {
             before(grammarAccess.getLayerAccess().getElementsAssignment_2()); 
            // InternalCinEditor.g:642:3: ( rule__Layer__ElementsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19||LA4_0==23||LA4_0==25||LA4_0==27||LA4_0==32) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCinEditor.g:642:4: rule__Layer__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Layer__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getLayerAccess().getElementsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__2__Impl"


    // $ANTLR start "rule__Position__Group__0"
    // InternalCinEditor.g:652:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:656:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalCinEditor.g:657:2: rule__Position__Group__0__Impl rule__Position__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Position__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0"


    // $ANTLR start "rule__Position__Group__0__Impl"
    // InternalCinEditor.g:664:1: rule__Position__Group__0__Impl : ( 'position' ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:668:1: ( ( 'position' ) )
            // InternalCinEditor.g:669:1: ( 'position' )
            {
            // InternalCinEditor.g:669:1: ( 'position' )
            // InternalCinEditor.g:670:2: 'position'
            {
             before(grammarAccess.getPositionAccess().getPositionKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getPositionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0__Impl"


    // $ANTLR start "rule__Position__Group__1"
    // InternalCinEditor.g:679:1: rule__Position__Group__1 : rule__Position__Group__1__Impl rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:683:1: ( rule__Position__Group__1__Impl rule__Position__Group__2 )
            // InternalCinEditor.g:684:2: rule__Position__Group__1__Impl rule__Position__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Position__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1"


    // $ANTLR start "rule__Position__Group__1__Impl"
    // InternalCinEditor.g:691:1: rule__Position__Group__1__Impl : ( ( rule__Position__WidthAssignment_1 ) ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:695:1: ( ( ( rule__Position__WidthAssignment_1 ) ) )
            // InternalCinEditor.g:696:1: ( ( rule__Position__WidthAssignment_1 ) )
            {
            // InternalCinEditor.g:696:1: ( ( rule__Position__WidthAssignment_1 ) )
            // InternalCinEditor.g:697:2: ( rule__Position__WidthAssignment_1 )
            {
             before(grammarAccess.getPositionAccess().getWidthAssignment_1()); 
            // InternalCinEditor.g:698:2: ( rule__Position__WidthAssignment_1 )
            // InternalCinEditor.g:698:3: rule__Position__WidthAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Position__WidthAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getWidthAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1__Impl"


    // $ANTLR start "rule__Position__Group__2"
    // InternalCinEditor.g:706:1: rule__Position__Group__2 : rule__Position__Group__2__Impl rule__Position__Group__3 ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:710:1: ( rule__Position__Group__2__Impl rule__Position__Group__3 )
            // InternalCinEditor.g:711:2: rule__Position__Group__2__Impl rule__Position__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Position__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2"


    // $ANTLR start "rule__Position__Group__2__Impl"
    // InternalCinEditor.g:718:1: rule__Position__Group__2__Impl : ( 'x' ) ;
    public final void rule__Position__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:722:1: ( ( 'x' ) )
            // InternalCinEditor.g:723:1: ( 'x' )
            {
            // InternalCinEditor.g:723:1: ( 'x' )
            // InternalCinEditor.g:724:2: 'x'
            {
             before(grammarAccess.getPositionAccess().getXKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getXKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2__Impl"


    // $ANTLR start "rule__Position__Group__3"
    // InternalCinEditor.g:733:1: rule__Position__Group__3 : rule__Position__Group__3__Impl rule__Position__Group__4 ;
    public final void rule__Position__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:737:1: ( rule__Position__Group__3__Impl rule__Position__Group__4 )
            // InternalCinEditor.g:738:2: rule__Position__Group__3__Impl rule__Position__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Position__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__3"


    // $ANTLR start "rule__Position__Group__3__Impl"
    // InternalCinEditor.g:745:1: rule__Position__Group__3__Impl : ( ( rule__Position__HeightAssignment_3 ) ) ;
    public final void rule__Position__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:749:1: ( ( ( rule__Position__HeightAssignment_3 ) ) )
            // InternalCinEditor.g:750:1: ( ( rule__Position__HeightAssignment_3 ) )
            {
            // InternalCinEditor.g:750:1: ( ( rule__Position__HeightAssignment_3 ) )
            // InternalCinEditor.g:751:2: ( rule__Position__HeightAssignment_3 )
            {
             before(grammarAccess.getPositionAccess().getHeightAssignment_3()); 
            // InternalCinEditor.g:752:2: ( rule__Position__HeightAssignment_3 )
            // InternalCinEditor.g:752:3: rule__Position__HeightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Position__HeightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getHeightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__3__Impl"


    // $ANTLR start "rule__Position__Group__4"
    // InternalCinEditor.g:760:1: rule__Position__Group__4 : rule__Position__Group__4__Impl ;
    public final void rule__Position__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:764:1: ( rule__Position__Group__4__Impl )
            // InternalCinEditor.g:765:2: rule__Position__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__4"


    // $ANTLR start "rule__Position__Group__4__Impl"
    // InternalCinEditor.g:771:1: rule__Position__Group__4__Impl : ( ( rule__Position__Group_4__0 )? ) ;
    public final void rule__Position__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:775:1: ( ( ( rule__Position__Group_4__0 )? ) )
            // InternalCinEditor.g:776:1: ( ( rule__Position__Group_4__0 )? )
            {
            // InternalCinEditor.g:776:1: ( ( rule__Position__Group_4__0 )? )
            // InternalCinEditor.g:777:2: ( rule__Position__Group_4__0 )?
            {
             before(grammarAccess.getPositionAccess().getGroup_4()); 
            // InternalCinEditor.g:778:2: ( rule__Position__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCinEditor.g:778:3: rule__Position__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Position__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPositionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__4__Impl"


    // $ANTLR start "rule__Position__Group_4__0"
    // InternalCinEditor.g:787:1: rule__Position__Group_4__0 : rule__Position__Group_4__0__Impl rule__Position__Group_4__1 ;
    public final void rule__Position__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:791:1: ( rule__Position__Group_4__0__Impl rule__Position__Group_4__1 )
            // InternalCinEditor.g:792:2: rule__Position__Group_4__0__Impl rule__Position__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Position__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_4__0"


    // $ANTLR start "rule__Position__Group_4__0__Impl"
    // InternalCinEditor.g:799:1: rule__Position__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Position__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:803:1: ( ( '(' ) )
            // InternalCinEditor.g:804:1: ( '(' )
            {
            // InternalCinEditor.g:804:1: ( '(' )
            // InternalCinEditor.g:805:2: '('
            {
             before(grammarAccess.getPositionAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_4__0__Impl"


    // $ANTLR start "rule__Position__Group_4__1"
    // InternalCinEditor.g:814:1: rule__Position__Group_4__1 : rule__Position__Group_4__1__Impl rule__Position__Group_4__2 ;
    public final void rule__Position__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:818:1: ( rule__Position__Group_4__1__Impl rule__Position__Group_4__2 )
            // InternalCinEditor.g:819:2: rule__Position__Group_4__1__Impl rule__Position__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Position__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_4__1"


    // $ANTLR start "rule__Position__Group_4__1__Impl"
    // InternalCinEditor.g:826:1: rule__Position__Group_4__1__Impl : ( ( rule__Position__XAssignment_4_1 ) ) ;
    public final void rule__Position__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:830:1: ( ( ( rule__Position__XAssignment_4_1 ) ) )
            // InternalCinEditor.g:831:1: ( ( rule__Position__XAssignment_4_1 ) )
            {
            // InternalCinEditor.g:831:1: ( ( rule__Position__XAssignment_4_1 ) )
            // InternalCinEditor.g:832:2: ( rule__Position__XAssignment_4_1 )
            {
             before(grammarAccess.getPositionAccess().getXAssignment_4_1()); 
            // InternalCinEditor.g:833:2: ( rule__Position__XAssignment_4_1 )
            // InternalCinEditor.g:833:3: rule__Position__XAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Position__XAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getXAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_4__1__Impl"


    // $ANTLR start "rule__Position__Group_4__2"
    // InternalCinEditor.g:841:1: rule__Position__Group_4__2 : rule__Position__Group_4__2__Impl rule__Position__Group_4__3 ;
    public final void rule__Position__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:845:1: ( rule__Position__Group_4__2__Impl rule__Position__Group_4__3 )
            // InternalCinEditor.g:846:2: rule__Position__Group_4__2__Impl rule__Position__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__Position__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_4__2"


    // $ANTLR start "rule__Position__Group_4__2__Impl"
    // InternalCinEditor.g:853:1: rule__Position__Group_4__2__Impl : ( ',' ) ;
    public final void rule__Position__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:857:1: ( ( ',' ) )
            // InternalCinEditor.g:858:1: ( ',' )
            {
            // InternalCinEditor.g:858:1: ( ',' )
            // InternalCinEditor.g:859:2: ','
            {
             before(grammarAccess.getPositionAccess().getCommaKeyword_4_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCommaKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_4__2__Impl"


    // $ANTLR start "rule__Position__Group_4__3"
    // InternalCinEditor.g:868:1: rule__Position__Group_4__3 : rule__Position__Group_4__3__Impl rule__Position__Group_4__4 ;
    public final void rule__Position__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:872:1: ( rule__Position__Group_4__3__Impl rule__Position__Group_4__4 )
            // InternalCinEditor.g:873:2: rule__Position__Group_4__3__Impl rule__Position__Group_4__4
            {
            pushFollow(FOLLOW_13);
            rule__Position__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_4__3"


    // $ANTLR start "rule__Position__Group_4__3__Impl"
    // InternalCinEditor.g:880:1: rule__Position__Group_4__3__Impl : ( ( rule__Position__YAssignment_4_3 ) ) ;
    public final void rule__Position__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:884:1: ( ( ( rule__Position__YAssignment_4_3 ) ) )
            // InternalCinEditor.g:885:1: ( ( rule__Position__YAssignment_4_3 ) )
            {
            // InternalCinEditor.g:885:1: ( ( rule__Position__YAssignment_4_3 ) )
            // InternalCinEditor.g:886:2: ( rule__Position__YAssignment_4_3 )
            {
             before(grammarAccess.getPositionAccess().getYAssignment_4_3()); 
            // InternalCinEditor.g:887:2: ( rule__Position__YAssignment_4_3 )
            // InternalCinEditor.g:887:3: rule__Position__YAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Position__YAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getYAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_4__3__Impl"


    // $ANTLR start "rule__Position__Group_4__4"
    // InternalCinEditor.g:895:1: rule__Position__Group_4__4 : rule__Position__Group_4__4__Impl ;
    public final void rule__Position__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:899:1: ( rule__Position__Group_4__4__Impl )
            // InternalCinEditor.g:900:2: rule__Position__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_4__4"


    // $ANTLR start "rule__Position__Group_4__4__Impl"
    // InternalCinEditor.g:906:1: rule__Position__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Position__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:910:1: ( ( ')' ) )
            // InternalCinEditor.g:911:1: ( ')' )
            {
            // InternalCinEditor.g:911:1: ( ')' )
            // InternalCinEditor.g:912:2: ')'
            {
             before(grammarAccess.getPositionAccess().getRightParenthesisKeyword_4_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group_4__4__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalCinEditor.g:922:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:926:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalCinEditor.g:927:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalCinEditor.g:934:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:938:1: ( ( ( '-' )? ) )
            // InternalCinEditor.g:939:1: ( ( '-' )? )
            {
            // InternalCinEditor.g:939:1: ( ( '-' )? )
            // InternalCinEditor.g:940:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalCinEditor.g:941:2: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCinEditor.g:941:3: '-'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalCinEditor.g:949:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:953:1: ( rule__EInt__Group__1__Impl )
            // InternalCinEditor.g:954:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalCinEditor.g:960:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:964:1: ( ( RULE_INT ) )
            // InternalCinEditor.g:965:1: ( RULE_INT )
            {
            // InternalCinEditor.g:965:1: ( RULE_INT )
            // InternalCinEditor.g:966:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalCinEditor.g:976:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:980:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalCinEditor.g:981:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalCinEditor.g:988:1: rule__Text__Group__0__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:992:1: ( ( 'Text' ) )
            // InternalCinEditor.g:993:1: ( 'Text' )
            {
            // InternalCinEditor.g:993:1: ( 'Text' )
            // InternalCinEditor.g:994:2: 'Text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalCinEditor.g:1003:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1007:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalCinEditor.g:1008:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Text__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalCinEditor.g:1015:1: rule__Text__Group__1__Impl : ( ( rule__Text__NameAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1019:1: ( ( ( rule__Text__NameAssignment_1 ) ) )
            // InternalCinEditor.g:1020:1: ( ( rule__Text__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:1020:1: ( ( rule__Text__NameAssignment_1 ) )
            // InternalCinEditor.g:1021:2: ( rule__Text__NameAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:1022:2: ( rule__Text__NameAssignment_1 )
            // InternalCinEditor.g:1022:3: rule__Text__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__Text__Group__2"
    // InternalCinEditor.g:1030:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1034:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalCinEditor.g:1035:2: rule__Text__Group__2__Impl rule__Text__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Text__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__2"


    // $ANTLR start "rule__Text__Group__2__Impl"
    // InternalCinEditor.g:1042:1: rule__Text__Group__2__Impl : ( '->' ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1046:1: ( ( '->' ) )
            // InternalCinEditor.g:1047:1: ( '->' )
            {
            // InternalCinEditor.g:1047:1: ( '->' )
            // InternalCinEditor.g:1048:2: '->'
            {
             before(grammarAccess.getTextAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__2__Impl"


    // $ANTLR start "rule__Text__Group__3"
    // InternalCinEditor.g:1057:1: rule__Text__Group__3 : rule__Text__Group__3__Impl rule__Text__Group__4 ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1061:1: ( rule__Text__Group__3__Impl rule__Text__Group__4 )
            // InternalCinEditor.g:1062:2: rule__Text__Group__3__Impl rule__Text__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Text__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__3"


    // $ANTLR start "rule__Text__Group__3__Impl"
    // InternalCinEditor.g:1069:1: rule__Text__Group__3__Impl : ( ( rule__Text__TextAssignment_3 ) ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1073:1: ( ( ( rule__Text__TextAssignment_3 ) ) )
            // InternalCinEditor.g:1074:1: ( ( rule__Text__TextAssignment_3 ) )
            {
            // InternalCinEditor.g:1074:1: ( ( rule__Text__TextAssignment_3 ) )
            // InternalCinEditor.g:1075:2: ( rule__Text__TextAssignment_3 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_3()); 
            // InternalCinEditor.g:1076:2: ( rule__Text__TextAssignment_3 )
            // InternalCinEditor.g:1076:3: rule__Text__TextAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Text__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__3__Impl"


    // $ANTLR start "rule__Text__Group__4"
    // InternalCinEditor.g:1084:1: rule__Text__Group__4 : rule__Text__Group__4__Impl rule__Text__Group__5 ;
    public final void rule__Text__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1088:1: ( rule__Text__Group__4__Impl rule__Text__Group__5 )
            // InternalCinEditor.g:1089:2: rule__Text__Group__4__Impl rule__Text__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Text__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__4"


    // $ANTLR start "rule__Text__Group__4__Impl"
    // InternalCinEditor.g:1096:1: rule__Text__Group__4__Impl : ( ( rule__Text__PositionAssignment_4 ) ) ;
    public final void rule__Text__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1100:1: ( ( ( rule__Text__PositionAssignment_4 ) ) )
            // InternalCinEditor.g:1101:1: ( ( rule__Text__PositionAssignment_4 ) )
            {
            // InternalCinEditor.g:1101:1: ( ( rule__Text__PositionAssignment_4 ) )
            // InternalCinEditor.g:1102:2: ( rule__Text__PositionAssignment_4 )
            {
             before(grammarAccess.getTextAccess().getPositionAssignment_4()); 
            // InternalCinEditor.g:1103:2: ( rule__Text__PositionAssignment_4 )
            // InternalCinEditor.g:1103:3: rule__Text__PositionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Text__PositionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getPositionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__4__Impl"


    // $ANTLR start "rule__Text__Group__5"
    // InternalCinEditor.g:1111:1: rule__Text__Group__5 : rule__Text__Group__5__Impl rule__Text__Group__6 ;
    public final void rule__Text__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1115:1: ( rule__Text__Group__5__Impl rule__Text__Group__6 )
            // InternalCinEditor.g:1116:2: rule__Text__Group__5__Impl rule__Text__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Text__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__5"


    // $ANTLR start "rule__Text__Group__5__Impl"
    // InternalCinEditor.g:1123:1: rule__Text__Group__5__Impl : ( 'at' ) ;
    public final void rule__Text__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1127:1: ( ( 'at' ) )
            // InternalCinEditor.g:1128:1: ( 'at' )
            {
            // InternalCinEditor.g:1128:1: ( 'at' )
            // InternalCinEditor.g:1129:2: 'at'
            {
             before(grammarAccess.getTextAccess().getAtKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getAtKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__5__Impl"


    // $ANTLR start "rule__Text__Group__6"
    // InternalCinEditor.g:1138:1: rule__Text__Group__6 : rule__Text__Group__6__Impl rule__Text__Group__7 ;
    public final void rule__Text__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1142:1: ( rule__Text__Group__6__Impl rule__Text__Group__7 )
            // InternalCinEditor.g:1143:2: rule__Text__Group__6__Impl rule__Text__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Text__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__6"


    // $ANTLR start "rule__Text__Group__6__Impl"
    // InternalCinEditor.g:1150:1: rule__Text__Group__6__Impl : ( ( rule__Text__BeginTimeAssignment_6 ) ) ;
    public final void rule__Text__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1154:1: ( ( ( rule__Text__BeginTimeAssignment_6 ) ) )
            // InternalCinEditor.g:1155:1: ( ( rule__Text__BeginTimeAssignment_6 ) )
            {
            // InternalCinEditor.g:1155:1: ( ( rule__Text__BeginTimeAssignment_6 ) )
            // InternalCinEditor.g:1156:2: ( rule__Text__BeginTimeAssignment_6 )
            {
             before(grammarAccess.getTextAccess().getBeginTimeAssignment_6()); 
            // InternalCinEditor.g:1157:2: ( rule__Text__BeginTimeAssignment_6 )
            // InternalCinEditor.g:1157:3: rule__Text__BeginTimeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Text__BeginTimeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getBeginTimeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__6__Impl"


    // $ANTLR start "rule__Text__Group__7"
    // InternalCinEditor.g:1165:1: rule__Text__Group__7 : rule__Text__Group__7__Impl rule__Text__Group__8 ;
    public final void rule__Text__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1169:1: ( rule__Text__Group__7__Impl rule__Text__Group__8 )
            // InternalCinEditor.g:1170:2: rule__Text__Group__7__Impl rule__Text__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Text__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__7"


    // $ANTLR start "rule__Text__Group__7__Impl"
    // InternalCinEditor.g:1177:1: rule__Text__Group__7__Impl : ( 'during' ) ;
    public final void rule__Text__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1181:1: ( ( 'during' ) )
            // InternalCinEditor.g:1182:1: ( 'during' )
            {
            // InternalCinEditor.g:1182:1: ( 'during' )
            // InternalCinEditor.g:1183:2: 'during'
            {
             before(grammarAccess.getTextAccess().getDuringKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getDuringKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__7__Impl"


    // $ANTLR start "rule__Text__Group__8"
    // InternalCinEditor.g:1192:1: rule__Text__Group__8 : rule__Text__Group__8__Impl ;
    public final void rule__Text__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1196:1: ( rule__Text__Group__8__Impl )
            // InternalCinEditor.g:1197:2: rule__Text__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__8"


    // $ANTLR start "rule__Text__Group__8__Impl"
    // InternalCinEditor.g:1203:1: rule__Text__Group__8__Impl : ( ( rule__Text__DurationAssignment_8 ) ) ;
    public final void rule__Text__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1207:1: ( ( ( rule__Text__DurationAssignment_8 ) ) )
            // InternalCinEditor.g:1208:1: ( ( rule__Text__DurationAssignment_8 ) )
            {
            // InternalCinEditor.g:1208:1: ( ( rule__Text__DurationAssignment_8 ) )
            // InternalCinEditor.g:1209:2: ( rule__Text__DurationAssignment_8 )
            {
             before(grammarAccess.getTextAccess().getDurationAssignment_8()); 
            // InternalCinEditor.g:1210:2: ( rule__Text__DurationAssignment_8 )
            // InternalCinEditor.g:1210:3: rule__Text__DurationAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Text__DurationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getDurationAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__8__Impl"


    // $ANTLR start "rule__Picture__Group__0"
    // InternalCinEditor.g:1219:1: rule__Picture__Group__0 : rule__Picture__Group__0__Impl rule__Picture__Group__1 ;
    public final void rule__Picture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1223:1: ( rule__Picture__Group__0__Impl rule__Picture__Group__1 )
            // InternalCinEditor.g:1224:2: rule__Picture__Group__0__Impl rule__Picture__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Picture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__0"


    // $ANTLR start "rule__Picture__Group__0__Impl"
    // InternalCinEditor.g:1231:1: rule__Picture__Group__0__Impl : ( 'Picture' ) ;
    public final void rule__Picture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1235:1: ( ( 'Picture' ) )
            // InternalCinEditor.g:1236:1: ( 'Picture' )
            {
            // InternalCinEditor.g:1236:1: ( 'Picture' )
            // InternalCinEditor.g:1237:2: 'Picture'
            {
             before(grammarAccess.getPictureAccess().getPictureKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getPictureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__0__Impl"


    // $ANTLR start "rule__Picture__Group__1"
    // InternalCinEditor.g:1246:1: rule__Picture__Group__1 : rule__Picture__Group__1__Impl rule__Picture__Group__2 ;
    public final void rule__Picture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1250:1: ( rule__Picture__Group__1__Impl rule__Picture__Group__2 )
            // InternalCinEditor.g:1251:2: rule__Picture__Group__1__Impl rule__Picture__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Picture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__1"


    // $ANTLR start "rule__Picture__Group__1__Impl"
    // InternalCinEditor.g:1258:1: rule__Picture__Group__1__Impl : ( ( rule__Picture__NameAssignment_1 ) ) ;
    public final void rule__Picture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1262:1: ( ( ( rule__Picture__NameAssignment_1 ) ) )
            // InternalCinEditor.g:1263:1: ( ( rule__Picture__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:1263:1: ( ( rule__Picture__NameAssignment_1 ) )
            // InternalCinEditor.g:1264:2: ( rule__Picture__NameAssignment_1 )
            {
             before(grammarAccess.getPictureAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:1265:2: ( rule__Picture__NameAssignment_1 )
            // InternalCinEditor.g:1265:3: rule__Picture__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Picture__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__1__Impl"


    // $ANTLR start "rule__Picture__Group__2"
    // InternalCinEditor.g:1273:1: rule__Picture__Group__2 : rule__Picture__Group__2__Impl rule__Picture__Group__3 ;
    public final void rule__Picture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1277:1: ( rule__Picture__Group__2__Impl rule__Picture__Group__3 )
            // InternalCinEditor.g:1278:2: rule__Picture__Group__2__Impl rule__Picture__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Picture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__2"


    // $ANTLR start "rule__Picture__Group__2__Impl"
    // InternalCinEditor.g:1285:1: rule__Picture__Group__2__Impl : ( '->' ) ;
    public final void rule__Picture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1289:1: ( ( '->' ) )
            // InternalCinEditor.g:1290:1: ( '->' )
            {
            // InternalCinEditor.g:1290:1: ( '->' )
            // InternalCinEditor.g:1291:2: '->'
            {
             before(grammarAccess.getPictureAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__2__Impl"


    // $ANTLR start "rule__Picture__Group__3"
    // InternalCinEditor.g:1300:1: rule__Picture__Group__3 : rule__Picture__Group__3__Impl rule__Picture__Group__4 ;
    public final void rule__Picture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1304:1: ( rule__Picture__Group__3__Impl rule__Picture__Group__4 )
            // InternalCinEditor.g:1305:2: rule__Picture__Group__3__Impl rule__Picture__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Picture__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__3"


    // $ANTLR start "rule__Picture__Group__3__Impl"
    // InternalCinEditor.g:1312:1: rule__Picture__Group__3__Impl : ( '\"' ) ;
    public final void rule__Picture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1316:1: ( ( '\"' ) )
            // InternalCinEditor.g:1317:1: ( '\"' )
            {
            // InternalCinEditor.g:1317:1: ( '\"' )
            // InternalCinEditor.g:1318:2: '\"'
            {
             before(grammarAccess.getPictureAccess().getQuotationMarkKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__3__Impl"


    // $ANTLR start "rule__Picture__Group__4"
    // InternalCinEditor.g:1327:1: rule__Picture__Group__4 : rule__Picture__Group__4__Impl rule__Picture__Group__5 ;
    public final void rule__Picture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1331:1: ( rule__Picture__Group__4__Impl rule__Picture__Group__5 )
            // InternalCinEditor.g:1332:2: rule__Picture__Group__4__Impl rule__Picture__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Picture__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__4"


    // $ANTLR start "rule__Picture__Group__4__Impl"
    // InternalCinEditor.g:1339:1: rule__Picture__Group__4__Impl : ( ( rule__Picture__UrlAssignment_4 ) ) ;
    public final void rule__Picture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1343:1: ( ( ( rule__Picture__UrlAssignment_4 ) ) )
            // InternalCinEditor.g:1344:1: ( ( rule__Picture__UrlAssignment_4 ) )
            {
            // InternalCinEditor.g:1344:1: ( ( rule__Picture__UrlAssignment_4 ) )
            // InternalCinEditor.g:1345:2: ( rule__Picture__UrlAssignment_4 )
            {
             before(grammarAccess.getPictureAccess().getUrlAssignment_4()); 
            // InternalCinEditor.g:1346:2: ( rule__Picture__UrlAssignment_4 )
            // InternalCinEditor.g:1346:3: rule__Picture__UrlAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Picture__UrlAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getUrlAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__4__Impl"


    // $ANTLR start "rule__Picture__Group__5"
    // InternalCinEditor.g:1354:1: rule__Picture__Group__5 : rule__Picture__Group__5__Impl rule__Picture__Group__6 ;
    public final void rule__Picture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1358:1: ( rule__Picture__Group__5__Impl rule__Picture__Group__6 )
            // InternalCinEditor.g:1359:2: rule__Picture__Group__5__Impl rule__Picture__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Picture__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__5"


    // $ANTLR start "rule__Picture__Group__5__Impl"
    // InternalCinEditor.g:1366:1: rule__Picture__Group__5__Impl : ( '\"' ) ;
    public final void rule__Picture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1370:1: ( ( '\"' ) )
            // InternalCinEditor.g:1371:1: ( '\"' )
            {
            // InternalCinEditor.g:1371:1: ( '\"' )
            // InternalCinEditor.g:1372:2: '\"'
            {
             before(grammarAccess.getPictureAccess().getQuotationMarkKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getQuotationMarkKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__5__Impl"


    // $ANTLR start "rule__Picture__Group__6"
    // InternalCinEditor.g:1381:1: rule__Picture__Group__6 : rule__Picture__Group__6__Impl rule__Picture__Group__7 ;
    public final void rule__Picture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1385:1: ( rule__Picture__Group__6__Impl rule__Picture__Group__7 )
            // InternalCinEditor.g:1386:2: rule__Picture__Group__6__Impl rule__Picture__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Picture__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__6"


    // $ANTLR start "rule__Picture__Group__6__Impl"
    // InternalCinEditor.g:1393:1: rule__Picture__Group__6__Impl : ( ( rule__Picture__PositionAssignment_6 ) ) ;
    public final void rule__Picture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1397:1: ( ( ( rule__Picture__PositionAssignment_6 ) ) )
            // InternalCinEditor.g:1398:1: ( ( rule__Picture__PositionAssignment_6 ) )
            {
            // InternalCinEditor.g:1398:1: ( ( rule__Picture__PositionAssignment_6 ) )
            // InternalCinEditor.g:1399:2: ( rule__Picture__PositionAssignment_6 )
            {
             before(grammarAccess.getPictureAccess().getPositionAssignment_6()); 
            // InternalCinEditor.g:1400:2: ( rule__Picture__PositionAssignment_6 )
            // InternalCinEditor.g:1400:3: rule__Picture__PositionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Picture__PositionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getPositionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__6__Impl"


    // $ANTLR start "rule__Picture__Group__7"
    // InternalCinEditor.g:1408:1: rule__Picture__Group__7 : rule__Picture__Group__7__Impl rule__Picture__Group__8 ;
    public final void rule__Picture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1412:1: ( rule__Picture__Group__7__Impl rule__Picture__Group__8 )
            // InternalCinEditor.g:1413:2: rule__Picture__Group__7__Impl rule__Picture__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Picture__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__7"


    // $ANTLR start "rule__Picture__Group__7__Impl"
    // InternalCinEditor.g:1420:1: rule__Picture__Group__7__Impl : ( 'at' ) ;
    public final void rule__Picture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1424:1: ( ( 'at' ) )
            // InternalCinEditor.g:1425:1: ( 'at' )
            {
            // InternalCinEditor.g:1425:1: ( 'at' )
            // InternalCinEditor.g:1426:2: 'at'
            {
             before(grammarAccess.getPictureAccess().getAtKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getAtKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__7__Impl"


    // $ANTLR start "rule__Picture__Group__8"
    // InternalCinEditor.g:1435:1: rule__Picture__Group__8 : rule__Picture__Group__8__Impl rule__Picture__Group__9 ;
    public final void rule__Picture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1439:1: ( rule__Picture__Group__8__Impl rule__Picture__Group__9 )
            // InternalCinEditor.g:1440:2: rule__Picture__Group__8__Impl rule__Picture__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Picture__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__8"


    // $ANTLR start "rule__Picture__Group__8__Impl"
    // InternalCinEditor.g:1447:1: rule__Picture__Group__8__Impl : ( ( rule__Picture__BeginTimeAssignment_8 ) ) ;
    public final void rule__Picture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1451:1: ( ( ( rule__Picture__BeginTimeAssignment_8 ) ) )
            // InternalCinEditor.g:1452:1: ( ( rule__Picture__BeginTimeAssignment_8 ) )
            {
            // InternalCinEditor.g:1452:1: ( ( rule__Picture__BeginTimeAssignment_8 ) )
            // InternalCinEditor.g:1453:2: ( rule__Picture__BeginTimeAssignment_8 )
            {
             before(grammarAccess.getPictureAccess().getBeginTimeAssignment_8()); 
            // InternalCinEditor.g:1454:2: ( rule__Picture__BeginTimeAssignment_8 )
            // InternalCinEditor.g:1454:3: rule__Picture__BeginTimeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Picture__BeginTimeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getBeginTimeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__8__Impl"


    // $ANTLR start "rule__Picture__Group__9"
    // InternalCinEditor.g:1462:1: rule__Picture__Group__9 : rule__Picture__Group__9__Impl rule__Picture__Group__10 ;
    public final void rule__Picture__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1466:1: ( rule__Picture__Group__9__Impl rule__Picture__Group__10 )
            // InternalCinEditor.g:1467:2: rule__Picture__Group__9__Impl rule__Picture__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Picture__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__9"


    // $ANTLR start "rule__Picture__Group__9__Impl"
    // InternalCinEditor.g:1474:1: rule__Picture__Group__9__Impl : ( 'during' ) ;
    public final void rule__Picture__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1478:1: ( ( 'during' ) )
            // InternalCinEditor.g:1479:1: ( 'during' )
            {
            // InternalCinEditor.g:1479:1: ( 'during' )
            // InternalCinEditor.g:1480:2: 'during'
            {
             before(grammarAccess.getPictureAccess().getDuringKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getDuringKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__9__Impl"


    // $ANTLR start "rule__Picture__Group__10"
    // InternalCinEditor.g:1489:1: rule__Picture__Group__10 : rule__Picture__Group__10__Impl ;
    public final void rule__Picture__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1493:1: ( rule__Picture__Group__10__Impl )
            // InternalCinEditor.g:1494:2: rule__Picture__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__10"


    // $ANTLR start "rule__Picture__Group__10__Impl"
    // InternalCinEditor.g:1500:1: rule__Picture__Group__10__Impl : ( ( rule__Picture__DurationAssignment_10 ) ) ;
    public final void rule__Picture__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1504:1: ( ( ( rule__Picture__DurationAssignment_10 ) ) )
            // InternalCinEditor.g:1505:1: ( ( rule__Picture__DurationAssignment_10 ) )
            {
            // InternalCinEditor.g:1505:1: ( ( rule__Picture__DurationAssignment_10 ) )
            // InternalCinEditor.g:1506:2: ( rule__Picture__DurationAssignment_10 )
            {
             before(grammarAccess.getPictureAccess().getDurationAssignment_10()); 
            // InternalCinEditor.g:1507:2: ( rule__Picture__DurationAssignment_10 )
            // InternalCinEditor.g:1507:3: rule__Picture__DurationAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Picture__DurationAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getDurationAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group__10__Impl"


    // $ANTLR start "rule__Video__Group__0"
    // InternalCinEditor.g:1516:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1520:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalCinEditor.g:1521:2: rule__Video__Group__0__Impl rule__Video__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Video__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__0"


    // $ANTLR start "rule__Video__Group__0__Impl"
    // InternalCinEditor.g:1528:1: rule__Video__Group__0__Impl : ( 'Video' ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1532:1: ( ( 'Video' ) )
            // InternalCinEditor.g:1533:1: ( 'Video' )
            {
            // InternalCinEditor.g:1533:1: ( 'Video' )
            // InternalCinEditor.g:1534:2: 'Video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getVideoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__0__Impl"


    // $ANTLR start "rule__Video__Group__1"
    // InternalCinEditor.g:1543:1: rule__Video__Group__1 : rule__Video__Group__1__Impl rule__Video__Group__2 ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1547:1: ( rule__Video__Group__1__Impl rule__Video__Group__2 )
            // InternalCinEditor.g:1548:2: rule__Video__Group__1__Impl rule__Video__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Video__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__1"


    // $ANTLR start "rule__Video__Group__1__Impl"
    // InternalCinEditor.g:1555:1: rule__Video__Group__1__Impl : ( ( rule__Video__NameAssignment_1 ) ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1559:1: ( ( ( rule__Video__NameAssignment_1 ) ) )
            // InternalCinEditor.g:1560:1: ( ( rule__Video__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:1560:1: ( ( rule__Video__NameAssignment_1 ) )
            // InternalCinEditor.g:1561:2: ( rule__Video__NameAssignment_1 )
            {
             before(grammarAccess.getVideoAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:1562:2: ( rule__Video__NameAssignment_1 )
            // InternalCinEditor.g:1562:3: rule__Video__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__1__Impl"


    // $ANTLR start "rule__Video__Group__2"
    // InternalCinEditor.g:1570:1: rule__Video__Group__2 : rule__Video__Group__2__Impl rule__Video__Group__3 ;
    public final void rule__Video__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1574:1: ( rule__Video__Group__2__Impl rule__Video__Group__3 )
            // InternalCinEditor.g:1575:2: rule__Video__Group__2__Impl rule__Video__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Video__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__2"


    // $ANTLR start "rule__Video__Group__2__Impl"
    // InternalCinEditor.g:1582:1: rule__Video__Group__2__Impl : ( '->' ) ;
    public final void rule__Video__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1586:1: ( ( '->' ) )
            // InternalCinEditor.g:1587:1: ( '->' )
            {
            // InternalCinEditor.g:1587:1: ( '->' )
            // InternalCinEditor.g:1588:2: '->'
            {
             before(grammarAccess.getVideoAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__2__Impl"


    // $ANTLR start "rule__Video__Group__3"
    // InternalCinEditor.g:1597:1: rule__Video__Group__3 : rule__Video__Group__3__Impl rule__Video__Group__4 ;
    public final void rule__Video__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1601:1: ( rule__Video__Group__3__Impl rule__Video__Group__4 )
            // InternalCinEditor.g:1602:2: rule__Video__Group__3__Impl rule__Video__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Video__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__3"


    // $ANTLR start "rule__Video__Group__3__Impl"
    // InternalCinEditor.g:1609:1: rule__Video__Group__3__Impl : ( '\"' ) ;
    public final void rule__Video__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1613:1: ( ( '\"' ) )
            // InternalCinEditor.g:1614:1: ( '\"' )
            {
            // InternalCinEditor.g:1614:1: ( '\"' )
            // InternalCinEditor.g:1615:2: '\"'
            {
             before(grammarAccess.getVideoAccess().getQuotationMarkKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__3__Impl"


    // $ANTLR start "rule__Video__Group__4"
    // InternalCinEditor.g:1624:1: rule__Video__Group__4 : rule__Video__Group__4__Impl rule__Video__Group__5 ;
    public final void rule__Video__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1628:1: ( rule__Video__Group__4__Impl rule__Video__Group__5 )
            // InternalCinEditor.g:1629:2: rule__Video__Group__4__Impl rule__Video__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Video__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__4"


    // $ANTLR start "rule__Video__Group__4__Impl"
    // InternalCinEditor.g:1636:1: rule__Video__Group__4__Impl : ( ( rule__Video__UrlAssignment_4 ) ) ;
    public final void rule__Video__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1640:1: ( ( ( rule__Video__UrlAssignment_4 ) ) )
            // InternalCinEditor.g:1641:1: ( ( rule__Video__UrlAssignment_4 ) )
            {
            // InternalCinEditor.g:1641:1: ( ( rule__Video__UrlAssignment_4 ) )
            // InternalCinEditor.g:1642:2: ( rule__Video__UrlAssignment_4 )
            {
             before(grammarAccess.getVideoAccess().getUrlAssignment_4()); 
            // InternalCinEditor.g:1643:2: ( rule__Video__UrlAssignment_4 )
            // InternalCinEditor.g:1643:3: rule__Video__UrlAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Video__UrlAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getUrlAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__4__Impl"


    // $ANTLR start "rule__Video__Group__5"
    // InternalCinEditor.g:1651:1: rule__Video__Group__5 : rule__Video__Group__5__Impl rule__Video__Group__6 ;
    public final void rule__Video__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1655:1: ( rule__Video__Group__5__Impl rule__Video__Group__6 )
            // InternalCinEditor.g:1656:2: rule__Video__Group__5__Impl rule__Video__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Video__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__5"


    // $ANTLR start "rule__Video__Group__5__Impl"
    // InternalCinEditor.g:1663:1: rule__Video__Group__5__Impl : ( '\"' ) ;
    public final void rule__Video__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1667:1: ( ( '\"' ) )
            // InternalCinEditor.g:1668:1: ( '\"' )
            {
            // InternalCinEditor.g:1668:1: ( '\"' )
            // InternalCinEditor.g:1669:2: '\"'
            {
             before(grammarAccess.getVideoAccess().getQuotationMarkKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getQuotationMarkKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__5__Impl"


    // $ANTLR start "rule__Video__Group__6"
    // InternalCinEditor.g:1678:1: rule__Video__Group__6 : rule__Video__Group__6__Impl rule__Video__Group__7 ;
    public final void rule__Video__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1682:1: ( rule__Video__Group__6__Impl rule__Video__Group__7 )
            // InternalCinEditor.g:1683:2: rule__Video__Group__6__Impl rule__Video__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Video__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__6"


    // $ANTLR start "rule__Video__Group__6__Impl"
    // InternalCinEditor.g:1690:1: rule__Video__Group__6__Impl : ( 'from' ) ;
    public final void rule__Video__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1694:1: ( ( 'from' ) )
            // InternalCinEditor.g:1695:1: ( 'from' )
            {
            // InternalCinEditor.g:1695:1: ( 'from' )
            // InternalCinEditor.g:1696:2: 'from'
            {
             before(grammarAccess.getVideoAccess().getFromKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getFromKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__6__Impl"


    // $ANTLR start "rule__Video__Group__7"
    // InternalCinEditor.g:1705:1: rule__Video__Group__7 : rule__Video__Group__7__Impl rule__Video__Group__8 ;
    public final void rule__Video__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1709:1: ( rule__Video__Group__7__Impl rule__Video__Group__8 )
            // InternalCinEditor.g:1710:2: rule__Video__Group__7__Impl rule__Video__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Video__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__7"


    // $ANTLR start "rule__Video__Group__7__Impl"
    // InternalCinEditor.g:1717:1: rule__Video__Group__7__Impl : ( ( rule__Video__BeginCropTimeAssignment_7 ) ) ;
    public final void rule__Video__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1721:1: ( ( ( rule__Video__BeginCropTimeAssignment_7 ) ) )
            // InternalCinEditor.g:1722:1: ( ( rule__Video__BeginCropTimeAssignment_7 ) )
            {
            // InternalCinEditor.g:1722:1: ( ( rule__Video__BeginCropTimeAssignment_7 ) )
            // InternalCinEditor.g:1723:2: ( rule__Video__BeginCropTimeAssignment_7 )
            {
             before(grammarAccess.getVideoAccess().getBeginCropTimeAssignment_7()); 
            // InternalCinEditor.g:1724:2: ( rule__Video__BeginCropTimeAssignment_7 )
            // InternalCinEditor.g:1724:3: rule__Video__BeginCropTimeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Video__BeginCropTimeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getBeginCropTimeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__7__Impl"


    // $ANTLR start "rule__Video__Group__8"
    // InternalCinEditor.g:1732:1: rule__Video__Group__8 : rule__Video__Group__8__Impl rule__Video__Group__9 ;
    public final void rule__Video__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1736:1: ( rule__Video__Group__8__Impl rule__Video__Group__9 )
            // InternalCinEditor.g:1737:2: rule__Video__Group__8__Impl rule__Video__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Video__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__8"


    // $ANTLR start "rule__Video__Group__8__Impl"
    // InternalCinEditor.g:1744:1: rule__Video__Group__8__Impl : ( ( rule__Video__PositionAssignment_8 ) ) ;
    public final void rule__Video__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1748:1: ( ( ( rule__Video__PositionAssignment_8 ) ) )
            // InternalCinEditor.g:1749:1: ( ( rule__Video__PositionAssignment_8 ) )
            {
            // InternalCinEditor.g:1749:1: ( ( rule__Video__PositionAssignment_8 ) )
            // InternalCinEditor.g:1750:2: ( rule__Video__PositionAssignment_8 )
            {
             before(grammarAccess.getVideoAccess().getPositionAssignment_8()); 
            // InternalCinEditor.g:1751:2: ( rule__Video__PositionAssignment_8 )
            // InternalCinEditor.g:1751:3: rule__Video__PositionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Video__PositionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getPositionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__8__Impl"


    // $ANTLR start "rule__Video__Group__9"
    // InternalCinEditor.g:1759:1: rule__Video__Group__9 : rule__Video__Group__9__Impl rule__Video__Group__10 ;
    public final void rule__Video__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1763:1: ( rule__Video__Group__9__Impl rule__Video__Group__10 )
            // InternalCinEditor.g:1764:2: rule__Video__Group__9__Impl rule__Video__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Video__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__9"


    // $ANTLR start "rule__Video__Group__9__Impl"
    // InternalCinEditor.g:1771:1: rule__Video__Group__9__Impl : ( 'at' ) ;
    public final void rule__Video__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1775:1: ( ( 'at' ) )
            // InternalCinEditor.g:1776:1: ( 'at' )
            {
            // InternalCinEditor.g:1776:1: ( 'at' )
            // InternalCinEditor.g:1777:2: 'at'
            {
             before(grammarAccess.getVideoAccess().getAtKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getAtKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__9__Impl"


    // $ANTLR start "rule__Video__Group__10"
    // InternalCinEditor.g:1786:1: rule__Video__Group__10 : rule__Video__Group__10__Impl rule__Video__Group__11 ;
    public final void rule__Video__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1790:1: ( rule__Video__Group__10__Impl rule__Video__Group__11 )
            // InternalCinEditor.g:1791:2: rule__Video__Group__10__Impl rule__Video__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Video__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__10"


    // $ANTLR start "rule__Video__Group__10__Impl"
    // InternalCinEditor.g:1798:1: rule__Video__Group__10__Impl : ( ( rule__Video__BeginTimeAssignment_10 ) ) ;
    public final void rule__Video__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1802:1: ( ( ( rule__Video__BeginTimeAssignment_10 ) ) )
            // InternalCinEditor.g:1803:1: ( ( rule__Video__BeginTimeAssignment_10 ) )
            {
            // InternalCinEditor.g:1803:1: ( ( rule__Video__BeginTimeAssignment_10 ) )
            // InternalCinEditor.g:1804:2: ( rule__Video__BeginTimeAssignment_10 )
            {
             before(grammarAccess.getVideoAccess().getBeginTimeAssignment_10()); 
            // InternalCinEditor.g:1805:2: ( rule__Video__BeginTimeAssignment_10 )
            // InternalCinEditor.g:1805:3: rule__Video__BeginTimeAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Video__BeginTimeAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getBeginTimeAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__10__Impl"


    // $ANTLR start "rule__Video__Group__11"
    // InternalCinEditor.g:1813:1: rule__Video__Group__11 : rule__Video__Group__11__Impl rule__Video__Group__12 ;
    public final void rule__Video__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1817:1: ( rule__Video__Group__11__Impl rule__Video__Group__12 )
            // InternalCinEditor.g:1818:2: rule__Video__Group__11__Impl rule__Video__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Video__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__11"


    // $ANTLR start "rule__Video__Group__11__Impl"
    // InternalCinEditor.g:1825:1: rule__Video__Group__11__Impl : ( 'during' ) ;
    public final void rule__Video__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1829:1: ( ( 'during' ) )
            // InternalCinEditor.g:1830:1: ( 'during' )
            {
            // InternalCinEditor.g:1830:1: ( 'during' )
            // InternalCinEditor.g:1831:2: 'during'
            {
             before(grammarAccess.getVideoAccess().getDuringKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getDuringKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__11__Impl"


    // $ANTLR start "rule__Video__Group__12"
    // InternalCinEditor.g:1840:1: rule__Video__Group__12 : rule__Video__Group__12__Impl ;
    public final void rule__Video__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1844:1: ( rule__Video__Group__12__Impl )
            // InternalCinEditor.g:1845:2: rule__Video__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__12"


    // $ANTLR start "rule__Video__Group__12__Impl"
    // InternalCinEditor.g:1851:1: rule__Video__Group__12__Impl : ( ( rule__Video__DurationAssignment_12 ) ) ;
    public final void rule__Video__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1855:1: ( ( ( rule__Video__DurationAssignment_12 ) ) )
            // InternalCinEditor.g:1856:1: ( ( rule__Video__DurationAssignment_12 ) )
            {
            // InternalCinEditor.g:1856:1: ( ( rule__Video__DurationAssignment_12 ) )
            // InternalCinEditor.g:1857:2: ( rule__Video__DurationAssignment_12 )
            {
             before(grammarAccess.getVideoAccess().getDurationAssignment_12()); 
            // InternalCinEditor.g:1858:2: ( rule__Video__DurationAssignment_12 )
            // InternalCinEditor.g:1858:3: rule__Video__DurationAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Video__DurationAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getDurationAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__12__Impl"


    // $ANTLR start "rule__FadeIn__Group__0"
    // InternalCinEditor.g:1867:1: rule__FadeIn__Group__0 : rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 ;
    public final void rule__FadeIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1871:1: ( rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 )
            // InternalCinEditor.g:1872:2: rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FadeIn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__0"


    // $ANTLR start "rule__FadeIn__Group__0__Impl"
    // InternalCinEditor.g:1879:1: rule__FadeIn__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__FadeIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1883:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:1884:1: ( 'Effect' )
            {
            // InternalCinEditor.g:1884:1: ( 'Effect' )
            // InternalCinEditor.g:1885:2: 'Effect'
            {
             before(grammarAccess.getFadeInAccess().getEffectKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getEffectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__0__Impl"


    // $ANTLR start "rule__FadeIn__Group__1"
    // InternalCinEditor.g:1894:1: rule__FadeIn__Group__1 : rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 ;
    public final void rule__FadeIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1898:1: ( rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 )
            // InternalCinEditor.g:1899:2: rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__FadeIn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__1"


    // $ANTLR start "rule__FadeIn__Group__1__Impl"
    // InternalCinEditor.g:1906:1: rule__FadeIn__Group__1__Impl : ( ( rule__FadeIn__NameAssignment_1 ) ) ;
    public final void rule__FadeIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1910:1: ( ( ( rule__FadeIn__NameAssignment_1 ) ) )
            // InternalCinEditor.g:1911:1: ( ( rule__FadeIn__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:1911:1: ( ( rule__FadeIn__NameAssignment_1 ) )
            // InternalCinEditor.g:1912:2: ( rule__FadeIn__NameAssignment_1 )
            {
             before(grammarAccess.getFadeInAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:1913:2: ( rule__FadeIn__NameAssignment_1 )
            // InternalCinEditor.g:1913:3: rule__FadeIn__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFadeInAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__1__Impl"


    // $ANTLR start "rule__FadeIn__Group__2"
    // InternalCinEditor.g:1921:1: rule__FadeIn__Group__2 : rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 ;
    public final void rule__FadeIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1925:1: ( rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 )
            // InternalCinEditor.g:1926:2: rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__FadeIn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__2"


    // $ANTLR start "rule__FadeIn__Group__2__Impl"
    // InternalCinEditor.g:1933:1: rule__FadeIn__Group__2__Impl : ( '->' ) ;
    public final void rule__FadeIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1937:1: ( ( '->' ) )
            // InternalCinEditor.g:1938:1: ( '->' )
            {
            // InternalCinEditor.g:1938:1: ( '->' )
            // InternalCinEditor.g:1939:2: '->'
            {
             before(grammarAccess.getFadeInAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__2__Impl"


    // $ANTLR start "rule__FadeIn__Group__3"
    // InternalCinEditor.g:1948:1: rule__FadeIn__Group__3 : rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 ;
    public final void rule__FadeIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1952:1: ( rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 )
            // InternalCinEditor.g:1953:2: rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__FadeIn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__3"


    // $ANTLR start "rule__FadeIn__Group__3__Impl"
    // InternalCinEditor.g:1960:1: rule__FadeIn__Group__3__Impl : ( 'FadeIn' ) ;
    public final void rule__FadeIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1964:1: ( ( 'FadeIn' ) )
            // InternalCinEditor.g:1965:1: ( 'FadeIn' )
            {
            // InternalCinEditor.g:1965:1: ( 'FadeIn' )
            // InternalCinEditor.g:1966:2: 'FadeIn'
            {
             before(grammarAccess.getFadeInAccess().getFadeInKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getFadeInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__3__Impl"


    // $ANTLR start "rule__FadeIn__Group__4"
    // InternalCinEditor.g:1975:1: rule__FadeIn__Group__4 : rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5 ;
    public final void rule__FadeIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1979:1: ( rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5 )
            // InternalCinEditor.g:1980:2: rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__FadeIn__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__4"


    // $ANTLR start "rule__FadeIn__Group__4__Impl"
    // InternalCinEditor.g:1987:1: rule__FadeIn__Group__4__Impl : ( 'at' ) ;
    public final void rule__FadeIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1991:1: ( ( 'at' ) )
            // InternalCinEditor.g:1992:1: ( 'at' )
            {
            // InternalCinEditor.g:1992:1: ( 'at' )
            // InternalCinEditor.g:1993:2: 'at'
            {
             before(grammarAccess.getFadeInAccess().getAtKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getAtKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__4__Impl"


    // $ANTLR start "rule__FadeIn__Group__5"
    // InternalCinEditor.g:2002:1: rule__FadeIn__Group__5 : rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6 ;
    public final void rule__FadeIn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2006:1: ( rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6 )
            // InternalCinEditor.g:2007:2: rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__FadeIn__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__5"


    // $ANTLR start "rule__FadeIn__Group__5__Impl"
    // InternalCinEditor.g:2014:1: rule__FadeIn__Group__5__Impl : ( ( rule__FadeIn__BeginTimeAssignment_5 ) ) ;
    public final void rule__FadeIn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2018:1: ( ( ( rule__FadeIn__BeginTimeAssignment_5 ) ) )
            // InternalCinEditor.g:2019:1: ( ( rule__FadeIn__BeginTimeAssignment_5 ) )
            {
            // InternalCinEditor.g:2019:1: ( ( rule__FadeIn__BeginTimeAssignment_5 ) )
            // InternalCinEditor.g:2020:2: ( rule__FadeIn__BeginTimeAssignment_5 )
            {
             before(grammarAccess.getFadeInAccess().getBeginTimeAssignment_5()); 
            // InternalCinEditor.g:2021:2: ( rule__FadeIn__BeginTimeAssignment_5 )
            // InternalCinEditor.g:2021:3: rule__FadeIn__BeginTimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__BeginTimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFadeInAccess().getBeginTimeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__5__Impl"


    // $ANTLR start "rule__FadeIn__Group__6"
    // InternalCinEditor.g:2029:1: rule__FadeIn__Group__6 : rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7 ;
    public final void rule__FadeIn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2033:1: ( rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7 )
            // InternalCinEditor.g:2034:2: rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__FadeIn__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__6"


    // $ANTLR start "rule__FadeIn__Group__6__Impl"
    // InternalCinEditor.g:2041:1: rule__FadeIn__Group__6__Impl : ( 'during' ) ;
    public final void rule__FadeIn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2045:1: ( ( 'during' ) )
            // InternalCinEditor.g:2046:1: ( 'during' )
            {
            // InternalCinEditor.g:2046:1: ( 'during' )
            // InternalCinEditor.g:2047:2: 'during'
            {
             before(grammarAccess.getFadeInAccess().getDuringKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getDuringKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__6__Impl"


    // $ANTLR start "rule__FadeIn__Group__7"
    // InternalCinEditor.g:2056:1: rule__FadeIn__Group__7 : rule__FadeIn__Group__7__Impl rule__FadeIn__Group__8 ;
    public final void rule__FadeIn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2060:1: ( rule__FadeIn__Group__7__Impl rule__FadeIn__Group__8 )
            // InternalCinEditor.g:2061:2: rule__FadeIn__Group__7__Impl rule__FadeIn__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__FadeIn__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__7"


    // $ANTLR start "rule__FadeIn__Group__7__Impl"
    // InternalCinEditor.g:2068:1: rule__FadeIn__Group__7__Impl : ( ( rule__FadeIn__DurationAssignment_7 ) ) ;
    public final void rule__FadeIn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2072:1: ( ( ( rule__FadeIn__DurationAssignment_7 ) ) )
            // InternalCinEditor.g:2073:1: ( ( rule__FadeIn__DurationAssignment_7 ) )
            {
            // InternalCinEditor.g:2073:1: ( ( rule__FadeIn__DurationAssignment_7 ) )
            // InternalCinEditor.g:2074:2: ( rule__FadeIn__DurationAssignment_7 )
            {
             before(grammarAccess.getFadeInAccess().getDurationAssignment_7()); 
            // InternalCinEditor.g:2075:2: ( rule__FadeIn__DurationAssignment_7 )
            // InternalCinEditor.g:2075:3: rule__FadeIn__DurationAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__DurationAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFadeInAccess().getDurationAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__7__Impl"


    // $ANTLR start "rule__FadeIn__Group__8"
    // InternalCinEditor.g:2083:1: rule__FadeIn__Group__8 : rule__FadeIn__Group__8__Impl rule__FadeIn__Group__9 ;
    public final void rule__FadeIn__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2087:1: ( rule__FadeIn__Group__8__Impl rule__FadeIn__Group__9 )
            // InternalCinEditor.g:2088:2: rule__FadeIn__Group__8__Impl rule__FadeIn__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__FadeIn__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__8"


    // $ANTLR start "rule__FadeIn__Group__8__Impl"
    // InternalCinEditor.g:2095:1: rule__FadeIn__Group__8__Impl : ( 'on' ) ;
    public final void rule__FadeIn__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2099:1: ( ( 'on' ) )
            // InternalCinEditor.g:2100:1: ( 'on' )
            {
            // InternalCinEditor.g:2100:1: ( 'on' )
            // InternalCinEditor.g:2101:2: 'on'
            {
             before(grammarAccess.getFadeInAccess().getOnKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getOnKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__8__Impl"


    // $ANTLR start "rule__FadeIn__Group__9"
    // InternalCinEditor.g:2110:1: rule__FadeIn__Group__9 : rule__FadeIn__Group__9__Impl ;
    public final void rule__FadeIn__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2114:1: ( rule__FadeIn__Group__9__Impl )
            // InternalCinEditor.g:2115:2: rule__FadeIn__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__9"


    // $ANTLR start "rule__FadeIn__Group__9__Impl"
    // InternalCinEditor.g:2121:1: rule__FadeIn__Group__9__Impl : ( ( rule__FadeIn__ElementAssignment_9 ) ) ;
    public final void rule__FadeIn__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2125:1: ( ( ( rule__FadeIn__ElementAssignment_9 ) ) )
            // InternalCinEditor.g:2126:1: ( ( rule__FadeIn__ElementAssignment_9 ) )
            {
            // InternalCinEditor.g:2126:1: ( ( rule__FadeIn__ElementAssignment_9 ) )
            // InternalCinEditor.g:2127:2: ( rule__FadeIn__ElementAssignment_9 )
            {
             before(grammarAccess.getFadeInAccess().getElementAssignment_9()); 
            // InternalCinEditor.g:2128:2: ( rule__FadeIn__ElementAssignment_9 )
            // InternalCinEditor.g:2128:3: rule__FadeIn__ElementAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__ElementAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFadeInAccess().getElementAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__9__Impl"


    // $ANTLR start "rule__FadeOut__Group__0"
    // InternalCinEditor.g:2137:1: rule__FadeOut__Group__0 : rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 ;
    public final void rule__FadeOut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2141:1: ( rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 )
            // InternalCinEditor.g:2142:2: rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__FadeOut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__0"


    // $ANTLR start "rule__FadeOut__Group__0__Impl"
    // InternalCinEditor.g:2149:1: rule__FadeOut__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__FadeOut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2153:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:2154:1: ( 'Effect' )
            {
            // InternalCinEditor.g:2154:1: ( 'Effect' )
            // InternalCinEditor.g:2155:2: 'Effect'
            {
             before(grammarAccess.getFadeOutAccess().getEffectKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getEffectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__0__Impl"


    // $ANTLR start "rule__FadeOut__Group__1"
    // InternalCinEditor.g:2164:1: rule__FadeOut__Group__1 : rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 ;
    public final void rule__FadeOut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2168:1: ( rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 )
            // InternalCinEditor.g:2169:2: rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__FadeOut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__1"


    // $ANTLR start "rule__FadeOut__Group__1__Impl"
    // InternalCinEditor.g:2176:1: rule__FadeOut__Group__1__Impl : ( ( rule__FadeOut__NameAssignment_1 ) ) ;
    public final void rule__FadeOut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2180:1: ( ( ( rule__FadeOut__NameAssignment_1 ) ) )
            // InternalCinEditor.g:2181:1: ( ( rule__FadeOut__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:2181:1: ( ( rule__FadeOut__NameAssignment_1 ) )
            // InternalCinEditor.g:2182:2: ( rule__FadeOut__NameAssignment_1 )
            {
             before(grammarAccess.getFadeOutAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:2183:2: ( rule__FadeOut__NameAssignment_1 )
            // InternalCinEditor.g:2183:3: rule__FadeOut__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFadeOutAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__1__Impl"


    // $ANTLR start "rule__FadeOut__Group__2"
    // InternalCinEditor.g:2191:1: rule__FadeOut__Group__2 : rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 ;
    public final void rule__FadeOut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2195:1: ( rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 )
            // InternalCinEditor.g:2196:2: rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__FadeOut__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__2"


    // $ANTLR start "rule__FadeOut__Group__2__Impl"
    // InternalCinEditor.g:2203:1: rule__FadeOut__Group__2__Impl : ( '->' ) ;
    public final void rule__FadeOut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2207:1: ( ( '->' ) )
            // InternalCinEditor.g:2208:1: ( '->' )
            {
            // InternalCinEditor.g:2208:1: ( '->' )
            // InternalCinEditor.g:2209:2: '->'
            {
             before(grammarAccess.getFadeOutAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__2__Impl"


    // $ANTLR start "rule__FadeOut__Group__3"
    // InternalCinEditor.g:2218:1: rule__FadeOut__Group__3 : rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 ;
    public final void rule__FadeOut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2222:1: ( rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 )
            // InternalCinEditor.g:2223:2: rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__FadeOut__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__3"


    // $ANTLR start "rule__FadeOut__Group__3__Impl"
    // InternalCinEditor.g:2230:1: rule__FadeOut__Group__3__Impl : ( 'FadeOut' ) ;
    public final void rule__FadeOut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2234:1: ( ( 'FadeOut' ) )
            // InternalCinEditor.g:2235:1: ( 'FadeOut' )
            {
            // InternalCinEditor.g:2235:1: ( 'FadeOut' )
            // InternalCinEditor.g:2236:2: 'FadeOut'
            {
             before(grammarAccess.getFadeOutAccess().getFadeOutKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getFadeOutKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__3__Impl"


    // $ANTLR start "rule__FadeOut__Group__4"
    // InternalCinEditor.g:2245:1: rule__FadeOut__Group__4 : rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5 ;
    public final void rule__FadeOut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2249:1: ( rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5 )
            // InternalCinEditor.g:2250:2: rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__FadeOut__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__4"


    // $ANTLR start "rule__FadeOut__Group__4__Impl"
    // InternalCinEditor.g:2257:1: rule__FadeOut__Group__4__Impl : ( 'at' ) ;
    public final void rule__FadeOut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2261:1: ( ( 'at' ) )
            // InternalCinEditor.g:2262:1: ( 'at' )
            {
            // InternalCinEditor.g:2262:1: ( 'at' )
            // InternalCinEditor.g:2263:2: 'at'
            {
             before(grammarAccess.getFadeOutAccess().getAtKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getAtKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__4__Impl"


    // $ANTLR start "rule__FadeOut__Group__5"
    // InternalCinEditor.g:2272:1: rule__FadeOut__Group__5 : rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6 ;
    public final void rule__FadeOut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2276:1: ( rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6 )
            // InternalCinEditor.g:2277:2: rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__FadeOut__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__5"


    // $ANTLR start "rule__FadeOut__Group__5__Impl"
    // InternalCinEditor.g:2284:1: rule__FadeOut__Group__5__Impl : ( ( rule__FadeOut__BeginTimeAssignment_5 ) ) ;
    public final void rule__FadeOut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2288:1: ( ( ( rule__FadeOut__BeginTimeAssignment_5 ) ) )
            // InternalCinEditor.g:2289:1: ( ( rule__FadeOut__BeginTimeAssignment_5 ) )
            {
            // InternalCinEditor.g:2289:1: ( ( rule__FadeOut__BeginTimeAssignment_5 ) )
            // InternalCinEditor.g:2290:2: ( rule__FadeOut__BeginTimeAssignment_5 )
            {
             before(grammarAccess.getFadeOutAccess().getBeginTimeAssignment_5()); 
            // InternalCinEditor.g:2291:2: ( rule__FadeOut__BeginTimeAssignment_5 )
            // InternalCinEditor.g:2291:3: rule__FadeOut__BeginTimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__BeginTimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFadeOutAccess().getBeginTimeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__5__Impl"


    // $ANTLR start "rule__FadeOut__Group__6"
    // InternalCinEditor.g:2299:1: rule__FadeOut__Group__6 : rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7 ;
    public final void rule__FadeOut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2303:1: ( rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7 )
            // InternalCinEditor.g:2304:2: rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__FadeOut__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__6"


    // $ANTLR start "rule__FadeOut__Group__6__Impl"
    // InternalCinEditor.g:2311:1: rule__FadeOut__Group__6__Impl : ( 'during' ) ;
    public final void rule__FadeOut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2315:1: ( ( 'during' ) )
            // InternalCinEditor.g:2316:1: ( 'during' )
            {
            // InternalCinEditor.g:2316:1: ( 'during' )
            // InternalCinEditor.g:2317:2: 'during'
            {
             before(grammarAccess.getFadeOutAccess().getDuringKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getDuringKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__6__Impl"


    // $ANTLR start "rule__FadeOut__Group__7"
    // InternalCinEditor.g:2326:1: rule__FadeOut__Group__7 : rule__FadeOut__Group__7__Impl rule__FadeOut__Group__8 ;
    public final void rule__FadeOut__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2330:1: ( rule__FadeOut__Group__7__Impl rule__FadeOut__Group__8 )
            // InternalCinEditor.g:2331:2: rule__FadeOut__Group__7__Impl rule__FadeOut__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__FadeOut__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__7"


    // $ANTLR start "rule__FadeOut__Group__7__Impl"
    // InternalCinEditor.g:2338:1: rule__FadeOut__Group__7__Impl : ( ( rule__FadeOut__DurationAssignment_7 ) ) ;
    public final void rule__FadeOut__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2342:1: ( ( ( rule__FadeOut__DurationAssignment_7 ) ) )
            // InternalCinEditor.g:2343:1: ( ( rule__FadeOut__DurationAssignment_7 ) )
            {
            // InternalCinEditor.g:2343:1: ( ( rule__FadeOut__DurationAssignment_7 ) )
            // InternalCinEditor.g:2344:2: ( rule__FadeOut__DurationAssignment_7 )
            {
             before(grammarAccess.getFadeOutAccess().getDurationAssignment_7()); 
            // InternalCinEditor.g:2345:2: ( rule__FadeOut__DurationAssignment_7 )
            // InternalCinEditor.g:2345:3: rule__FadeOut__DurationAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__DurationAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFadeOutAccess().getDurationAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__7__Impl"


    // $ANTLR start "rule__FadeOut__Group__8"
    // InternalCinEditor.g:2353:1: rule__FadeOut__Group__8 : rule__FadeOut__Group__8__Impl rule__FadeOut__Group__9 ;
    public final void rule__FadeOut__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2357:1: ( rule__FadeOut__Group__8__Impl rule__FadeOut__Group__9 )
            // InternalCinEditor.g:2358:2: rule__FadeOut__Group__8__Impl rule__FadeOut__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__FadeOut__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__8"


    // $ANTLR start "rule__FadeOut__Group__8__Impl"
    // InternalCinEditor.g:2365:1: rule__FadeOut__Group__8__Impl : ( 'on' ) ;
    public final void rule__FadeOut__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2369:1: ( ( 'on' ) )
            // InternalCinEditor.g:2370:1: ( 'on' )
            {
            // InternalCinEditor.g:2370:1: ( 'on' )
            // InternalCinEditor.g:2371:2: 'on'
            {
             before(grammarAccess.getFadeOutAccess().getOnKeyword_8()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getOnKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__8__Impl"


    // $ANTLR start "rule__FadeOut__Group__9"
    // InternalCinEditor.g:2380:1: rule__FadeOut__Group__9 : rule__FadeOut__Group__9__Impl ;
    public final void rule__FadeOut__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2384:1: ( rule__FadeOut__Group__9__Impl )
            // InternalCinEditor.g:2385:2: rule__FadeOut__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__9"


    // $ANTLR start "rule__FadeOut__Group__9__Impl"
    // InternalCinEditor.g:2391:1: rule__FadeOut__Group__9__Impl : ( ( rule__FadeOut__ElementAssignment_9 ) ) ;
    public final void rule__FadeOut__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2395:1: ( ( ( rule__FadeOut__ElementAssignment_9 ) ) )
            // InternalCinEditor.g:2396:1: ( ( rule__FadeOut__ElementAssignment_9 ) )
            {
            // InternalCinEditor.g:2396:1: ( ( rule__FadeOut__ElementAssignment_9 ) )
            // InternalCinEditor.g:2397:2: ( rule__FadeOut__ElementAssignment_9 )
            {
             before(grammarAccess.getFadeOutAccess().getElementAssignment_9()); 
            // InternalCinEditor.g:2398:2: ( rule__FadeOut__ElementAssignment_9 )
            // InternalCinEditor.g:2398:3: rule__FadeOut__ElementAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__ElementAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFadeOutAccess().getElementAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__9__Impl"


    // $ANTLR start "rule__Translate__Group__0"
    // InternalCinEditor.g:2407:1: rule__Translate__Group__0 : rule__Translate__Group__0__Impl rule__Translate__Group__1 ;
    public final void rule__Translate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2411:1: ( rule__Translate__Group__0__Impl rule__Translate__Group__1 )
            // InternalCinEditor.g:2412:2: rule__Translate__Group__0__Impl rule__Translate__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Translate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__0"


    // $ANTLR start "rule__Translate__Group__0__Impl"
    // InternalCinEditor.g:2419:1: rule__Translate__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__Translate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2423:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:2424:1: ( 'Effect' )
            {
            // InternalCinEditor.g:2424:1: ( 'Effect' )
            // InternalCinEditor.g:2425:2: 'Effect'
            {
             before(grammarAccess.getTranslateAccess().getEffectKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getEffectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__0__Impl"


    // $ANTLR start "rule__Translate__Group__1"
    // InternalCinEditor.g:2434:1: rule__Translate__Group__1 : rule__Translate__Group__1__Impl rule__Translate__Group__2 ;
    public final void rule__Translate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2438:1: ( rule__Translate__Group__1__Impl rule__Translate__Group__2 )
            // InternalCinEditor.g:2439:2: rule__Translate__Group__1__Impl rule__Translate__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Translate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__1"


    // $ANTLR start "rule__Translate__Group__1__Impl"
    // InternalCinEditor.g:2446:1: rule__Translate__Group__1__Impl : ( ( rule__Translate__NameAssignment_1 ) ) ;
    public final void rule__Translate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2450:1: ( ( ( rule__Translate__NameAssignment_1 ) ) )
            // InternalCinEditor.g:2451:1: ( ( rule__Translate__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:2451:1: ( ( rule__Translate__NameAssignment_1 ) )
            // InternalCinEditor.g:2452:2: ( rule__Translate__NameAssignment_1 )
            {
             before(grammarAccess.getTranslateAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:2453:2: ( rule__Translate__NameAssignment_1 )
            // InternalCinEditor.g:2453:3: rule__Translate__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Translate__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTranslateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__1__Impl"


    // $ANTLR start "rule__Translate__Group__2"
    // InternalCinEditor.g:2461:1: rule__Translate__Group__2 : rule__Translate__Group__2__Impl rule__Translate__Group__3 ;
    public final void rule__Translate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2465:1: ( rule__Translate__Group__2__Impl rule__Translate__Group__3 )
            // InternalCinEditor.g:2466:2: rule__Translate__Group__2__Impl rule__Translate__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Translate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__2"


    // $ANTLR start "rule__Translate__Group__2__Impl"
    // InternalCinEditor.g:2473:1: rule__Translate__Group__2__Impl : ( '->' ) ;
    public final void rule__Translate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2477:1: ( ( '->' ) )
            // InternalCinEditor.g:2478:1: ( '->' )
            {
            // InternalCinEditor.g:2478:1: ( '->' )
            // InternalCinEditor.g:2479:2: '->'
            {
             before(grammarAccess.getTranslateAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__2__Impl"


    // $ANTLR start "rule__Translate__Group__3"
    // InternalCinEditor.g:2488:1: rule__Translate__Group__3 : rule__Translate__Group__3__Impl rule__Translate__Group__4 ;
    public final void rule__Translate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2492:1: ( rule__Translate__Group__3__Impl rule__Translate__Group__4 )
            // InternalCinEditor.g:2493:2: rule__Translate__Group__3__Impl rule__Translate__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Translate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__3"


    // $ANTLR start "rule__Translate__Group__3__Impl"
    // InternalCinEditor.g:2500:1: rule__Translate__Group__3__Impl : ( 'Translate' ) ;
    public final void rule__Translate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2504:1: ( ( 'Translate' ) )
            // InternalCinEditor.g:2505:1: ( 'Translate' )
            {
            // InternalCinEditor.g:2505:1: ( 'Translate' )
            // InternalCinEditor.g:2506:2: 'Translate'
            {
             before(grammarAccess.getTranslateAccess().getTranslateKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getTranslateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__3__Impl"


    // $ANTLR start "rule__Translate__Group__4"
    // InternalCinEditor.g:2515:1: rule__Translate__Group__4 : rule__Translate__Group__4__Impl rule__Translate__Group__5 ;
    public final void rule__Translate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2519:1: ( rule__Translate__Group__4__Impl rule__Translate__Group__5 )
            // InternalCinEditor.g:2520:2: rule__Translate__Group__4__Impl rule__Translate__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Translate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__4"


    // $ANTLR start "rule__Translate__Group__4__Impl"
    // InternalCinEditor.g:2527:1: rule__Translate__Group__4__Impl : ( '(' ) ;
    public final void rule__Translate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2531:1: ( ( '(' ) )
            // InternalCinEditor.g:2532:1: ( '(' )
            {
            // InternalCinEditor.g:2532:1: ( '(' )
            // InternalCinEditor.g:2533:2: '('
            {
             before(grammarAccess.getTranslateAccess().getLeftParenthesisKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__4__Impl"


    // $ANTLR start "rule__Translate__Group__5"
    // InternalCinEditor.g:2542:1: rule__Translate__Group__5 : rule__Translate__Group__5__Impl rule__Translate__Group__6 ;
    public final void rule__Translate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2546:1: ( rule__Translate__Group__5__Impl rule__Translate__Group__6 )
            // InternalCinEditor.g:2547:2: rule__Translate__Group__5__Impl rule__Translate__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Translate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__5"


    // $ANTLR start "rule__Translate__Group__5__Impl"
    // InternalCinEditor.g:2554:1: rule__Translate__Group__5__Impl : ( ( rule__Translate__PixelsToTranslateHorizontallyAssignment_5 ) ) ;
    public final void rule__Translate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2558:1: ( ( ( rule__Translate__PixelsToTranslateHorizontallyAssignment_5 ) ) )
            // InternalCinEditor.g:2559:1: ( ( rule__Translate__PixelsToTranslateHorizontallyAssignment_5 ) )
            {
            // InternalCinEditor.g:2559:1: ( ( rule__Translate__PixelsToTranslateHorizontallyAssignment_5 ) )
            // InternalCinEditor.g:2560:2: ( rule__Translate__PixelsToTranslateHorizontallyAssignment_5 )
            {
             before(grammarAccess.getTranslateAccess().getPixelsToTranslateHorizontallyAssignment_5()); 
            // InternalCinEditor.g:2561:2: ( rule__Translate__PixelsToTranslateHorizontallyAssignment_5 )
            // InternalCinEditor.g:2561:3: rule__Translate__PixelsToTranslateHorizontallyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Translate__PixelsToTranslateHorizontallyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTranslateAccess().getPixelsToTranslateHorizontallyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__5__Impl"


    // $ANTLR start "rule__Translate__Group__6"
    // InternalCinEditor.g:2569:1: rule__Translate__Group__6 : rule__Translate__Group__6__Impl rule__Translate__Group__7 ;
    public final void rule__Translate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2573:1: ( rule__Translate__Group__6__Impl rule__Translate__Group__7 )
            // InternalCinEditor.g:2574:2: rule__Translate__Group__6__Impl rule__Translate__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Translate__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__6"


    // $ANTLR start "rule__Translate__Group__6__Impl"
    // InternalCinEditor.g:2581:1: rule__Translate__Group__6__Impl : ( ',' ) ;
    public final void rule__Translate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2585:1: ( ( ',' ) )
            // InternalCinEditor.g:2586:1: ( ',' )
            {
            // InternalCinEditor.g:2586:1: ( ',' )
            // InternalCinEditor.g:2587:2: ','
            {
             before(grammarAccess.getTranslateAccess().getCommaKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__6__Impl"


    // $ANTLR start "rule__Translate__Group__7"
    // InternalCinEditor.g:2596:1: rule__Translate__Group__7 : rule__Translate__Group__7__Impl rule__Translate__Group__8 ;
    public final void rule__Translate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2600:1: ( rule__Translate__Group__7__Impl rule__Translate__Group__8 )
            // InternalCinEditor.g:2601:2: rule__Translate__Group__7__Impl rule__Translate__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Translate__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__7"


    // $ANTLR start "rule__Translate__Group__7__Impl"
    // InternalCinEditor.g:2608:1: rule__Translate__Group__7__Impl : ( ( rule__Translate__PixelsToTranslateVerticallyAssignment_7 ) ) ;
    public final void rule__Translate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2612:1: ( ( ( rule__Translate__PixelsToTranslateVerticallyAssignment_7 ) ) )
            // InternalCinEditor.g:2613:1: ( ( rule__Translate__PixelsToTranslateVerticallyAssignment_7 ) )
            {
            // InternalCinEditor.g:2613:1: ( ( rule__Translate__PixelsToTranslateVerticallyAssignment_7 ) )
            // InternalCinEditor.g:2614:2: ( rule__Translate__PixelsToTranslateVerticallyAssignment_7 )
            {
             before(grammarAccess.getTranslateAccess().getPixelsToTranslateVerticallyAssignment_7()); 
            // InternalCinEditor.g:2615:2: ( rule__Translate__PixelsToTranslateVerticallyAssignment_7 )
            // InternalCinEditor.g:2615:3: rule__Translate__PixelsToTranslateVerticallyAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Translate__PixelsToTranslateVerticallyAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTranslateAccess().getPixelsToTranslateVerticallyAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__7__Impl"


    // $ANTLR start "rule__Translate__Group__8"
    // InternalCinEditor.g:2623:1: rule__Translate__Group__8 : rule__Translate__Group__8__Impl rule__Translate__Group__9 ;
    public final void rule__Translate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2627:1: ( rule__Translate__Group__8__Impl rule__Translate__Group__9 )
            // InternalCinEditor.g:2628:2: rule__Translate__Group__8__Impl rule__Translate__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Translate__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__8"


    // $ANTLR start "rule__Translate__Group__8__Impl"
    // InternalCinEditor.g:2635:1: rule__Translate__Group__8__Impl : ( ')' ) ;
    public final void rule__Translate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2639:1: ( ( ')' ) )
            // InternalCinEditor.g:2640:1: ( ')' )
            {
            // InternalCinEditor.g:2640:1: ( ')' )
            // InternalCinEditor.g:2641:2: ')'
            {
             before(grammarAccess.getTranslateAccess().getRightParenthesisKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__8__Impl"


    // $ANTLR start "rule__Translate__Group__9"
    // InternalCinEditor.g:2650:1: rule__Translate__Group__9 : rule__Translate__Group__9__Impl rule__Translate__Group__10 ;
    public final void rule__Translate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2654:1: ( rule__Translate__Group__9__Impl rule__Translate__Group__10 )
            // InternalCinEditor.g:2655:2: rule__Translate__Group__9__Impl rule__Translate__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Translate__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__9"


    // $ANTLR start "rule__Translate__Group__9__Impl"
    // InternalCinEditor.g:2662:1: rule__Translate__Group__9__Impl : ( 'at' ) ;
    public final void rule__Translate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2666:1: ( ( 'at' ) )
            // InternalCinEditor.g:2667:1: ( 'at' )
            {
            // InternalCinEditor.g:2667:1: ( 'at' )
            // InternalCinEditor.g:2668:2: 'at'
            {
             before(grammarAccess.getTranslateAccess().getAtKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getAtKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__9__Impl"


    // $ANTLR start "rule__Translate__Group__10"
    // InternalCinEditor.g:2677:1: rule__Translate__Group__10 : rule__Translate__Group__10__Impl rule__Translate__Group__11 ;
    public final void rule__Translate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2681:1: ( rule__Translate__Group__10__Impl rule__Translate__Group__11 )
            // InternalCinEditor.g:2682:2: rule__Translate__Group__10__Impl rule__Translate__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Translate__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__10"


    // $ANTLR start "rule__Translate__Group__10__Impl"
    // InternalCinEditor.g:2689:1: rule__Translate__Group__10__Impl : ( ( rule__Translate__BeginTimeAssignment_10 ) ) ;
    public final void rule__Translate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2693:1: ( ( ( rule__Translate__BeginTimeAssignment_10 ) ) )
            // InternalCinEditor.g:2694:1: ( ( rule__Translate__BeginTimeAssignment_10 ) )
            {
            // InternalCinEditor.g:2694:1: ( ( rule__Translate__BeginTimeAssignment_10 ) )
            // InternalCinEditor.g:2695:2: ( rule__Translate__BeginTimeAssignment_10 )
            {
             before(grammarAccess.getTranslateAccess().getBeginTimeAssignment_10()); 
            // InternalCinEditor.g:2696:2: ( rule__Translate__BeginTimeAssignment_10 )
            // InternalCinEditor.g:2696:3: rule__Translate__BeginTimeAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Translate__BeginTimeAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTranslateAccess().getBeginTimeAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__10__Impl"


    // $ANTLR start "rule__Translate__Group__11"
    // InternalCinEditor.g:2704:1: rule__Translate__Group__11 : rule__Translate__Group__11__Impl rule__Translate__Group__12 ;
    public final void rule__Translate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2708:1: ( rule__Translate__Group__11__Impl rule__Translate__Group__12 )
            // InternalCinEditor.g:2709:2: rule__Translate__Group__11__Impl rule__Translate__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Translate__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__11"


    // $ANTLR start "rule__Translate__Group__11__Impl"
    // InternalCinEditor.g:2716:1: rule__Translate__Group__11__Impl : ( 'during' ) ;
    public final void rule__Translate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2720:1: ( ( 'during' ) )
            // InternalCinEditor.g:2721:1: ( 'during' )
            {
            // InternalCinEditor.g:2721:1: ( 'during' )
            // InternalCinEditor.g:2722:2: 'during'
            {
             before(grammarAccess.getTranslateAccess().getDuringKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getDuringKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__11__Impl"


    // $ANTLR start "rule__Translate__Group__12"
    // InternalCinEditor.g:2731:1: rule__Translate__Group__12 : rule__Translate__Group__12__Impl rule__Translate__Group__13 ;
    public final void rule__Translate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2735:1: ( rule__Translate__Group__12__Impl rule__Translate__Group__13 )
            // InternalCinEditor.g:2736:2: rule__Translate__Group__12__Impl rule__Translate__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__Translate__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__12"


    // $ANTLR start "rule__Translate__Group__12__Impl"
    // InternalCinEditor.g:2743:1: rule__Translate__Group__12__Impl : ( ( rule__Translate__DurationAssignment_12 ) ) ;
    public final void rule__Translate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2747:1: ( ( ( rule__Translate__DurationAssignment_12 ) ) )
            // InternalCinEditor.g:2748:1: ( ( rule__Translate__DurationAssignment_12 ) )
            {
            // InternalCinEditor.g:2748:1: ( ( rule__Translate__DurationAssignment_12 ) )
            // InternalCinEditor.g:2749:2: ( rule__Translate__DurationAssignment_12 )
            {
             before(grammarAccess.getTranslateAccess().getDurationAssignment_12()); 
            // InternalCinEditor.g:2750:2: ( rule__Translate__DurationAssignment_12 )
            // InternalCinEditor.g:2750:3: rule__Translate__DurationAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Translate__DurationAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getTranslateAccess().getDurationAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__12__Impl"


    // $ANTLR start "rule__Translate__Group__13"
    // InternalCinEditor.g:2758:1: rule__Translate__Group__13 : rule__Translate__Group__13__Impl rule__Translate__Group__14 ;
    public final void rule__Translate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2762:1: ( rule__Translate__Group__13__Impl rule__Translate__Group__14 )
            // InternalCinEditor.g:2763:2: rule__Translate__Group__13__Impl rule__Translate__Group__14
            {
            pushFollow(FOLLOW_21);
            rule__Translate__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__13"


    // $ANTLR start "rule__Translate__Group__13__Impl"
    // InternalCinEditor.g:2770:1: rule__Translate__Group__13__Impl : ( 'on' ) ;
    public final void rule__Translate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2774:1: ( ( 'on' ) )
            // InternalCinEditor.g:2775:1: ( 'on' )
            {
            // InternalCinEditor.g:2775:1: ( 'on' )
            // InternalCinEditor.g:2776:2: 'on'
            {
             before(grammarAccess.getTranslateAccess().getOnKeyword_13()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getOnKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__13__Impl"


    // $ANTLR start "rule__Translate__Group__14"
    // InternalCinEditor.g:2785:1: rule__Translate__Group__14 : rule__Translate__Group__14__Impl ;
    public final void rule__Translate__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2789:1: ( rule__Translate__Group__14__Impl )
            // InternalCinEditor.g:2790:2: rule__Translate__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Translate__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__14"


    // $ANTLR start "rule__Translate__Group__14__Impl"
    // InternalCinEditor.g:2796:1: rule__Translate__Group__14__Impl : ( ( rule__Translate__ElementAssignment_14 ) ) ;
    public final void rule__Translate__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2800:1: ( ( ( rule__Translate__ElementAssignment_14 ) ) )
            // InternalCinEditor.g:2801:1: ( ( rule__Translate__ElementAssignment_14 ) )
            {
            // InternalCinEditor.g:2801:1: ( ( rule__Translate__ElementAssignment_14 ) )
            // InternalCinEditor.g:2802:2: ( rule__Translate__ElementAssignment_14 )
            {
             before(grammarAccess.getTranslateAccess().getElementAssignment_14()); 
            // InternalCinEditor.g:2803:2: ( rule__Translate__ElementAssignment_14 )
            // InternalCinEditor.g:2803:3: rule__Translate__ElementAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Translate__ElementAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getTranslateAccess().getElementAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group__14__Impl"


    // $ANTLR start "rule__Rectangle__Group__0"
    // InternalCinEditor.g:2812:1: rule__Rectangle__Group__0 : rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 ;
    public final void rule__Rectangle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2816:1: ( rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 )
            // InternalCinEditor.g:2817:2: rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Rectangle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__0"


    // $ANTLR start "rule__Rectangle__Group__0__Impl"
    // InternalCinEditor.g:2824:1: rule__Rectangle__Group__0__Impl : ( 'Rectangle' ) ;
    public final void rule__Rectangle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2828:1: ( ( 'Rectangle' ) )
            // InternalCinEditor.g:2829:1: ( 'Rectangle' )
            {
            // InternalCinEditor.g:2829:1: ( 'Rectangle' )
            // InternalCinEditor.g:2830:2: 'Rectangle'
            {
             before(grammarAccess.getRectangleAccess().getRectangleKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getRectangleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__0__Impl"


    // $ANTLR start "rule__Rectangle__Group__1"
    // InternalCinEditor.g:2839:1: rule__Rectangle__Group__1 : rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 ;
    public final void rule__Rectangle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2843:1: ( rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 )
            // InternalCinEditor.g:2844:2: rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Rectangle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__1"


    // $ANTLR start "rule__Rectangle__Group__1__Impl"
    // InternalCinEditor.g:2851:1: rule__Rectangle__Group__1__Impl : ( ( rule__Rectangle__NameAssignment_1 ) ) ;
    public final void rule__Rectangle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2855:1: ( ( ( rule__Rectangle__NameAssignment_1 ) ) )
            // InternalCinEditor.g:2856:1: ( ( rule__Rectangle__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:2856:1: ( ( rule__Rectangle__NameAssignment_1 ) )
            // InternalCinEditor.g:2857:2: ( rule__Rectangle__NameAssignment_1 )
            {
             before(grammarAccess.getRectangleAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:2858:2: ( rule__Rectangle__NameAssignment_1 )
            // InternalCinEditor.g:2858:3: rule__Rectangle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__1__Impl"


    // $ANTLR start "rule__Rectangle__Group__2"
    // InternalCinEditor.g:2866:1: rule__Rectangle__Group__2 : rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 ;
    public final void rule__Rectangle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2870:1: ( rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 )
            // InternalCinEditor.g:2871:2: rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Rectangle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__2"


    // $ANTLR start "rule__Rectangle__Group__2__Impl"
    // InternalCinEditor.g:2878:1: rule__Rectangle__Group__2__Impl : ( '->' ) ;
    public final void rule__Rectangle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2882:1: ( ( '->' ) )
            // InternalCinEditor.g:2883:1: ( '->' )
            {
            // InternalCinEditor.g:2883:1: ( '->' )
            // InternalCinEditor.g:2884:2: '->'
            {
             before(grammarAccess.getRectangleAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__2__Impl"


    // $ANTLR start "rule__Rectangle__Group__3"
    // InternalCinEditor.g:2893:1: rule__Rectangle__Group__3 : rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 ;
    public final void rule__Rectangle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2897:1: ( rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 )
            // InternalCinEditor.g:2898:2: rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Rectangle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__3"


    // $ANTLR start "rule__Rectangle__Group__3__Impl"
    // InternalCinEditor.g:2905:1: rule__Rectangle__Group__3__Impl : ( ( rule__Rectangle__HexadecimalValueAssignment_3 ) ) ;
    public final void rule__Rectangle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2909:1: ( ( ( rule__Rectangle__HexadecimalValueAssignment_3 ) ) )
            // InternalCinEditor.g:2910:1: ( ( rule__Rectangle__HexadecimalValueAssignment_3 ) )
            {
            // InternalCinEditor.g:2910:1: ( ( rule__Rectangle__HexadecimalValueAssignment_3 ) )
            // InternalCinEditor.g:2911:2: ( rule__Rectangle__HexadecimalValueAssignment_3 )
            {
             before(grammarAccess.getRectangleAccess().getHexadecimalValueAssignment_3()); 
            // InternalCinEditor.g:2912:2: ( rule__Rectangle__HexadecimalValueAssignment_3 )
            // InternalCinEditor.g:2912:3: rule__Rectangle__HexadecimalValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__HexadecimalValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getHexadecimalValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__3__Impl"


    // $ANTLR start "rule__Rectangle__Group__4"
    // InternalCinEditor.g:2920:1: rule__Rectangle__Group__4 : rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 ;
    public final void rule__Rectangle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2924:1: ( rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 )
            // InternalCinEditor.g:2925:2: rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Rectangle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__4"


    // $ANTLR start "rule__Rectangle__Group__4__Impl"
    // InternalCinEditor.g:2932:1: rule__Rectangle__Group__4__Impl : ( ( rule__Rectangle__PositionAssignment_4 ) ) ;
    public final void rule__Rectangle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2936:1: ( ( ( rule__Rectangle__PositionAssignment_4 ) ) )
            // InternalCinEditor.g:2937:1: ( ( rule__Rectangle__PositionAssignment_4 ) )
            {
            // InternalCinEditor.g:2937:1: ( ( rule__Rectangle__PositionAssignment_4 ) )
            // InternalCinEditor.g:2938:2: ( rule__Rectangle__PositionAssignment_4 )
            {
             before(grammarAccess.getRectangleAccess().getPositionAssignment_4()); 
            // InternalCinEditor.g:2939:2: ( rule__Rectangle__PositionAssignment_4 )
            // InternalCinEditor.g:2939:3: rule__Rectangle__PositionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__PositionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getPositionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__4__Impl"


    // $ANTLR start "rule__Rectangle__Group__5"
    // InternalCinEditor.g:2947:1: rule__Rectangle__Group__5 : rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 ;
    public final void rule__Rectangle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2951:1: ( rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 )
            // InternalCinEditor.g:2952:2: rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Rectangle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__5"


    // $ANTLR start "rule__Rectangle__Group__5__Impl"
    // InternalCinEditor.g:2959:1: rule__Rectangle__Group__5__Impl : ( 'at' ) ;
    public final void rule__Rectangle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2963:1: ( ( 'at' ) )
            // InternalCinEditor.g:2964:1: ( 'at' )
            {
            // InternalCinEditor.g:2964:1: ( 'at' )
            // InternalCinEditor.g:2965:2: 'at'
            {
             before(grammarAccess.getRectangleAccess().getAtKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getAtKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__5__Impl"


    // $ANTLR start "rule__Rectangle__Group__6"
    // InternalCinEditor.g:2974:1: rule__Rectangle__Group__6 : rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 ;
    public final void rule__Rectangle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2978:1: ( rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 )
            // InternalCinEditor.g:2979:2: rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Rectangle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__6"


    // $ANTLR start "rule__Rectangle__Group__6__Impl"
    // InternalCinEditor.g:2986:1: rule__Rectangle__Group__6__Impl : ( ( rule__Rectangle__BeginTimeAssignment_6 ) ) ;
    public final void rule__Rectangle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2990:1: ( ( ( rule__Rectangle__BeginTimeAssignment_6 ) ) )
            // InternalCinEditor.g:2991:1: ( ( rule__Rectangle__BeginTimeAssignment_6 ) )
            {
            // InternalCinEditor.g:2991:1: ( ( rule__Rectangle__BeginTimeAssignment_6 ) )
            // InternalCinEditor.g:2992:2: ( rule__Rectangle__BeginTimeAssignment_6 )
            {
             before(grammarAccess.getRectangleAccess().getBeginTimeAssignment_6()); 
            // InternalCinEditor.g:2993:2: ( rule__Rectangle__BeginTimeAssignment_6 )
            // InternalCinEditor.g:2993:3: rule__Rectangle__BeginTimeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__BeginTimeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getBeginTimeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__6__Impl"


    // $ANTLR start "rule__Rectangle__Group__7"
    // InternalCinEditor.g:3001:1: rule__Rectangle__Group__7 : rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8 ;
    public final void rule__Rectangle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3005:1: ( rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8 )
            // InternalCinEditor.g:3006:2: rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Rectangle__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__7"


    // $ANTLR start "rule__Rectangle__Group__7__Impl"
    // InternalCinEditor.g:3013:1: rule__Rectangle__Group__7__Impl : ( 'during' ) ;
    public final void rule__Rectangle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3017:1: ( ( 'during' ) )
            // InternalCinEditor.g:3018:1: ( 'during' )
            {
            // InternalCinEditor.g:3018:1: ( 'during' )
            // InternalCinEditor.g:3019:2: 'during'
            {
             before(grammarAccess.getRectangleAccess().getDuringKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getDuringKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__7__Impl"


    // $ANTLR start "rule__Rectangle__Group__8"
    // InternalCinEditor.g:3028:1: rule__Rectangle__Group__8 : rule__Rectangle__Group__8__Impl ;
    public final void rule__Rectangle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3032:1: ( rule__Rectangle__Group__8__Impl )
            // InternalCinEditor.g:3033:2: rule__Rectangle__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__8"


    // $ANTLR start "rule__Rectangle__Group__8__Impl"
    // InternalCinEditor.g:3039:1: rule__Rectangle__Group__8__Impl : ( ( rule__Rectangle__DurationAssignment_8 ) ) ;
    public final void rule__Rectangle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3043:1: ( ( ( rule__Rectangle__DurationAssignment_8 ) ) )
            // InternalCinEditor.g:3044:1: ( ( rule__Rectangle__DurationAssignment_8 ) )
            {
            // InternalCinEditor.g:3044:1: ( ( rule__Rectangle__DurationAssignment_8 ) )
            // InternalCinEditor.g:3045:2: ( rule__Rectangle__DurationAssignment_8 )
            {
             before(grammarAccess.getRectangleAccess().getDurationAssignment_8()); 
            // InternalCinEditor.g:3046:2: ( rule__Rectangle__DurationAssignment_8 )
            // InternalCinEditor.g:3046:3: rule__Rectangle__DurationAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__DurationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getDurationAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__8__Impl"


    // $ANTLR start "rule__Movie__NameAssignment_1"
    // InternalCinEditor.g:3055:1: rule__Movie__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Movie__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3059:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3060:2: ( ruleEString )
            {
            // InternalCinEditor.g:3060:2: ( ruleEString )
            // InternalCinEditor.g:3061:3: ruleEString
            {
             before(grammarAccess.getMovieAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__NameAssignment_1"


    // $ANTLR start "rule__Movie__PositionAssignment_2"
    // InternalCinEditor.g:3070:1: rule__Movie__PositionAssignment_2 : ( rulePosition ) ;
    public final void rule__Movie__PositionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3074:1: ( ( rulePosition ) )
            // InternalCinEditor.g:3075:2: ( rulePosition )
            {
            // InternalCinEditor.g:3075:2: ( rulePosition )
            // InternalCinEditor.g:3076:3: rulePosition
            {
             before(grammarAccess.getMovieAccess().getPositionPositionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getPositionPositionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__PositionAssignment_2"


    // $ANTLR start "rule__Movie__LayersAssignment_3"
    // InternalCinEditor.g:3085:1: rule__Movie__LayersAssignment_3 : ( ruleLayer ) ;
    public final void rule__Movie__LayersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3089:1: ( ( ruleLayer ) )
            // InternalCinEditor.g:3090:2: ( ruleLayer )
            {
            // InternalCinEditor.g:3090:2: ( ruleLayer )
            // InternalCinEditor.g:3091:3: ruleLayer
            {
             before(grammarAccess.getMovieAccess().getLayersLayerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getLayersLayerParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__LayersAssignment_3"


    // $ANTLR start "rule__Layer__ElementsAssignment_2"
    // InternalCinEditor.g:3100:1: rule__Layer__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Layer__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3104:1: ( ( ruleElement ) )
            // InternalCinEditor.g:3105:2: ( ruleElement )
            {
            // InternalCinEditor.g:3105:2: ( ruleElement )
            // InternalCinEditor.g:3106:3: ruleElement
            {
             before(grammarAccess.getLayerAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getElementsElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__ElementsAssignment_2"


    // $ANTLR start "rule__Position__WidthAssignment_1"
    // InternalCinEditor.g:3115:1: rule__Position__WidthAssignment_1 : ( ruleEInt ) ;
    public final void rule__Position__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3119:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3120:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3120:2: ( ruleEInt )
            // InternalCinEditor.g:3121:3: ruleEInt
            {
             before(grammarAccess.getPositionAccess().getWidthEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getWidthEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__WidthAssignment_1"


    // $ANTLR start "rule__Position__HeightAssignment_3"
    // InternalCinEditor.g:3130:1: rule__Position__HeightAssignment_3 : ( ruleEInt ) ;
    public final void rule__Position__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3134:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3135:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3135:2: ( ruleEInt )
            // InternalCinEditor.g:3136:3: ruleEInt
            {
             before(grammarAccess.getPositionAccess().getHeightEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getHeightEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__HeightAssignment_3"


    // $ANTLR start "rule__Position__XAssignment_4_1"
    // InternalCinEditor.g:3145:1: rule__Position__XAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Position__XAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3149:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3150:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3150:2: ( ruleEInt )
            // InternalCinEditor.g:3151:3: ruleEInt
            {
             before(grammarAccess.getPositionAccess().getXEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getXEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__XAssignment_4_1"


    // $ANTLR start "rule__Position__YAssignment_4_3"
    // InternalCinEditor.g:3160:1: rule__Position__YAssignment_4_3 : ( ruleEInt ) ;
    public final void rule__Position__YAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3164:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3165:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3165:2: ( ruleEInt )
            // InternalCinEditor.g:3166:3: ruleEInt
            {
             before(grammarAccess.getPositionAccess().getYEIntParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getYEIntParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__YAssignment_4_3"


    // $ANTLR start "rule__Text__NameAssignment_1"
    // InternalCinEditor.g:3175:1: rule__Text__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Text__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3179:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3180:2: ( ruleEString )
            {
            // InternalCinEditor.g:3180:2: ( ruleEString )
            // InternalCinEditor.g:3181:3: ruleEString
            {
             before(grammarAccess.getTextAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__NameAssignment_1"


    // $ANTLR start "rule__Text__TextAssignment_3"
    // InternalCinEditor.g:3190:1: rule__Text__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__Text__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3194:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3195:2: ( ruleEString )
            {
            // InternalCinEditor.g:3195:2: ( ruleEString )
            // InternalCinEditor.g:3196:3: ruleEString
            {
             before(grammarAccess.getTextAccess().getTextEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextAccess().getTextEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__TextAssignment_3"


    // $ANTLR start "rule__Text__PositionAssignment_4"
    // InternalCinEditor.g:3205:1: rule__Text__PositionAssignment_4 : ( rulePosition ) ;
    public final void rule__Text__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3209:1: ( ( rulePosition ) )
            // InternalCinEditor.g:3210:2: ( rulePosition )
            {
            // InternalCinEditor.g:3210:2: ( rulePosition )
            // InternalCinEditor.g:3211:3: rulePosition
            {
             before(grammarAccess.getTextAccess().getPositionPositionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getTextAccess().getPositionPositionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__PositionAssignment_4"


    // $ANTLR start "rule__Text__BeginTimeAssignment_6"
    // InternalCinEditor.g:3220:1: rule__Text__BeginTimeAssignment_6 : ( ruleEInt ) ;
    public final void rule__Text__BeginTimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3224:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3225:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3225:2: ( ruleEInt )
            // InternalCinEditor.g:3226:3: ruleEInt
            {
             before(grammarAccess.getTextAccess().getBeginTimeEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextAccess().getBeginTimeEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__BeginTimeAssignment_6"


    // $ANTLR start "rule__Text__DurationAssignment_8"
    // InternalCinEditor.g:3235:1: rule__Text__DurationAssignment_8 : ( ruleEInt ) ;
    public final void rule__Text__DurationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3239:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3240:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3240:2: ( ruleEInt )
            // InternalCinEditor.g:3241:3: ruleEInt
            {
             before(grammarAccess.getTextAccess().getDurationEIntParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextAccess().getDurationEIntParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__DurationAssignment_8"


    // $ANTLR start "rule__Picture__NameAssignment_1"
    // InternalCinEditor.g:3250:1: rule__Picture__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Picture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3254:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3255:2: ( ruleEString )
            {
            // InternalCinEditor.g:3255:2: ( ruleEString )
            // InternalCinEditor.g:3256:3: ruleEString
            {
             before(grammarAccess.getPictureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__NameAssignment_1"


    // $ANTLR start "rule__Picture__UrlAssignment_4"
    // InternalCinEditor.g:3265:1: rule__Picture__UrlAssignment_4 : ( ruleEString ) ;
    public final void rule__Picture__UrlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3269:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3270:2: ( ruleEString )
            {
            // InternalCinEditor.g:3270:2: ( ruleEString )
            // InternalCinEditor.g:3271:3: ruleEString
            {
             before(grammarAccess.getPictureAccess().getUrlEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getUrlEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__UrlAssignment_4"


    // $ANTLR start "rule__Picture__PositionAssignment_6"
    // InternalCinEditor.g:3280:1: rule__Picture__PositionAssignment_6 : ( rulePosition ) ;
    public final void rule__Picture__PositionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3284:1: ( ( rulePosition ) )
            // InternalCinEditor.g:3285:2: ( rulePosition )
            {
            // InternalCinEditor.g:3285:2: ( rulePosition )
            // InternalCinEditor.g:3286:3: rulePosition
            {
             before(grammarAccess.getPictureAccess().getPositionPositionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getPositionPositionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__PositionAssignment_6"


    // $ANTLR start "rule__Picture__BeginTimeAssignment_8"
    // InternalCinEditor.g:3295:1: rule__Picture__BeginTimeAssignment_8 : ( ruleEInt ) ;
    public final void rule__Picture__BeginTimeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3299:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3300:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3300:2: ( ruleEInt )
            // InternalCinEditor.g:3301:3: ruleEInt
            {
             before(grammarAccess.getPictureAccess().getBeginTimeEIntParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getBeginTimeEIntParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__BeginTimeAssignment_8"


    // $ANTLR start "rule__Picture__DurationAssignment_10"
    // InternalCinEditor.g:3310:1: rule__Picture__DurationAssignment_10 : ( ruleEInt ) ;
    public final void rule__Picture__DurationAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3314:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3315:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3315:2: ( ruleEInt )
            // InternalCinEditor.g:3316:3: ruleEInt
            {
             before(grammarAccess.getPictureAccess().getDurationEIntParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getDurationEIntParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__DurationAssignment_10"


    // $ANTLR start "rule__Video__NameAssignment_1"
    // InternalCinEditor.g:3325:1: rule__Video__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Video__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3329:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3330:2: ( ruleEString )
            {
            // InternalCinEditor.g:3330:2: ( ruleEString )
            // InternalCinEditor.g:3331:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__NameAssignment_1"


    // $ANTLR start "rule__Video__UrlAssignment_4"
    // InternalCinEditor.g:3340:1: rule__Video__UrlAssignment_4 : ( ruleEString ) ;
    public final void rule__Video__UrlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3344:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3345:2: ( ruleEString )
            {
            // InternalCinEditor.g:3345:2: ( ruleEString )
            // InternalCinEditor.g:3346:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getUrlEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getUrlEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__UrlAssignment_4"


    // $ANTLR start "rule__Video__BeginCropTimeAssignment_7"
    // InternalCinEditor.g:3355:1: rule__Video__BeginCropTimeAssignment_7 : ( ruleEInt ) ;
    public final void rule__Video__BeginCropTimeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3359:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3360:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3360:2: ( ruleEInt )
            // InternalCinEditor.g:3361:3: ruleEInt
            {
             before(grammarAccess.getVideoAccess().getBeginCropTimeEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getBeginCropTimeEIntParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__BeginCropTimeAssignment_7"


    // $ANTLR start "rule__Video__PositionAssignment_8"
    // InternalCinEditor.g:3370:1: rule__Video__PositionAssignment_8 : ( rulePosition ) ;
    public final void rule__Video__PositionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3374:1: ( ( rulePosition ) )
            // InternalCinEditor.g:3375:2: ( rulePosition )
            {
            // InternalCinEditor.g:3375:2: ( rulePosition )
            // InternalCinEditor.g:3376:3: rulePosition
            {
             before(grammarAccess.getVideoAccess().getPositionPositionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getPositionPositionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__PositionAssignment_8"


    // $ANTLR start "rule__Video__BeginTimeAssignment_10"
    // InternalCinEditor.g:3385:1: rule__Video__BeginTimeAssignment_10 : ( ruleEInt ) ;
    public final void rule__Video__BeginTimeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3389:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3390:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3390:2: ( ruleEInt )
            // InternalCinEditor.g:3391:3: ruleEInt
            {
             before(grammarAccess.getVideoAccess().getBeginTimeEIntParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getBeginTimeEIntParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__BeginTimeAssignment_10"


    // $ANTLR start "rule__Video__DurationAssignment_12"
    // InternalCinEditor.g:3400:1: rule__Video__DurationAssignment_12 : ( ruleEInt ) ;
    public final void rule__Video__DurationAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3404:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3405:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3405:2: ( ruleEInt )
            // InternalCinEditor.g:3406:3: ruleEInt
            {
             before(grammarAccess.getVideoAccess().getDurationEIntParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getDurationEIntParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__DurationAssignment_12"


    // $ANTLR start "rule__FadeIn__NameAssignment_1"
    // InternalCinEditor.g:3415:1: rule__FadeIn__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FadeIn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3419:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3420:2: ( ruleEString )
            {
            // InternalCinEditor.g:3420:2: ( ruleEString )
            // InternalCinEditor.g:3421:3: ruleEString
            {
             before(grammarAccess.getFadeInAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFadeInAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__NameAssignment_1"


    // $ANTLR start "rule__FadeIn__BeginTimeAssignment_5"
    // InternalCinEditor.g:3430:1: rule__FadeIn__BeginTimeAssignment_5 : ( ruleEInt ) ;
    public final void rule__FadeIn__BeginTimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3434:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3435:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3435:2: ( ruleEInt )
            // InternalCinEditor.g:3436:3: ruleEInt
            {
             before(grammarAccess.getFadeInAccess().getBeginTimeEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFadeInAccess().getBeginTimeEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__BeginTimeAssignment_5"


    // $ANTLR start "rule__FadeIn__DurationAssignment_7"
    // InternalCinEditor.g:3445:1: rule__FadeIn__DurationAssignment_7 : ( ruleEInt ) ;
    public final void rule__FadeIn__DurationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3449:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3450:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3450:2: ( ruleEInt )
            // InternalCinEditor.g:3451:3: ruleEInt
            {
             before(grammarAccess.getFadeInAccess().getDurationEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFadeInAccess().getDurationEIntParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__DurationAssignment_7"


    // $ANTLR start "rule__FadeIn__ElementAssignment_9"
    // InternalCinEditor.g:3460:1: rule__FadeIn__ElementAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__FadeIn__ElementAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3464:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:3465:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:3465:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:3466:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeInAccess().getElementElementCrossReference_9_0()); 
            // InternalCinEditor.g:3467:3: ( RULE_ID )
            // InternalCinEditor.g:3468:4: RULE_ID
            {
             before(grammarAccess.getFadeInAccess().getElementElementIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getElementElementIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getFadeInAccess().getElementElementCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__ElementAssignment_9"


    // $ANTLR start "rule__FadeOut__NameAssignment_1"
    // InternalCinEditor.g:3479:1: rule__FadeOut__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FadeOut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3483:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3484:2: ( ruleEString )
            {
            // InternalCinEditor.g:3484:2: ( ruleEString )
            // InternalCinEditor.g:3485:3: ruleEString
            {
             before(grammarAccess.getFadeOutAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFadeOutAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__NameAssignment_1"


    // $ANTLR start "rule__FadeOut__BeginTimeAssignment_5"
    // InternalCinEditor.g:3494:1: rule__FadeOut__BeginTimeAssignment_5 : ( ruleEInt ) ;
    public final void rule__FadeOut__BeginTimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3498:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3499:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3499:2: ( ruleEInt )
            // InternalCinEditor.g:3500:3: ruleEInt
            {
             before(grammarAccess.getFadeOutAccess().getBeginTimeEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFadeOutAccess().getBeginTimeEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__BeginTimeAssignment_5"


    // $ANTLR start "rule__FadeOut__DurationAssignment_7"
    // InternalCinEditor.g:3509:1: rule__FadeOut__DurationAssignment_7 : ( ruleEInt ) ;
    public final void rule__FadeOut__DurationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3513:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3514:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3514:2: ( ruleEInt )
            // InternalCinEditor.g:3515:3: ruleEInt
            {
             before(grammarAccess.getFadeOutAccess().getDurationEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFadeOutAccess().getDurationEIntParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__DurationAssignment_7"


    // $ANTLR start "rule__FadeOut__ElementAssignment_9"
    // InternalCinEditor.g:3524:1: rule__FadeOut__ElementAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__FadeOut__ElementAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3528:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:3529:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:3529:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:3530:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeOutAccess().getElementElementCrossReference_9_0()); 
            // InternalCinEditor.g:3531:3: ( RULE_ID )
            // InternalCinEditor.g:3532:4: RULE_ID
            {
             before(grammarAccess.getFadeOutAccess().getElementElementIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getElementElementIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getFadeOutAccess().getElementElementCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__ElementAssignment_9"


    // $ANTLR start "rule__Translate__NameAssignment_1"
    // InternalCinEditor.g:3543:1: rule__Translate__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Translate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3547:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3548:2: ( ruleEString )
            {
            // InternalCinEditor.g:3548:2: ( ruleEString )
            // InternalCinEditor.g:3549:3: ruleEString
            {
             before(grammarAccess.getTranslateAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTranslateAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__NameAssignment_1"


    // $ANTLR start "rule__Translate__PixelsToTranslateHorizontallyAssignment_5"
    // InternalCinEditor.g:3558:1: rule__Translate__PixelsToTranslateHorizontallyAssignment_5 : ( ruleEInt ) ;
    public final void rule__Translate__PixelsToTranslateHorizontallyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3562:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3563:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3563:2: ( ruleEInt )
            // InternalCinEditor.g:3564:3: ruleEInt
            {
             before(grammarAccess.getTranslateAccess().getPixelsToTranslateHorizontallyEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTranslateAccess().getPixelsToTranslateHorizontallyEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__PixelsToTranslateHorizontallyAssignment_5"


    // $ANTLR start "rule__Translate__PixelsToTranslateVerticallyAssignment_7"
    // InternalCinEditor.g:3573:1: rule__Translate__PixelsToTranslateVerticallyAssignment_7 : ( ruleEInt ) ;
    public final void rule__Translate__PixelsToTranslateVerticallyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3577:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3578:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3578:2: ( ruleEInt )
            // InternalCinEditor.g:3579:3: ruleEInt
            {
             before(grammarAccess.getTranslateAccess().getPixelsToTranslateVerticallyEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTranslateAccess().getPixelsToTranslateVerticallyEIntParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__PixelsToTranslateVerticallyAssignment_7"


    // $ANTLR start "rule__Translate__BeginTimeAssignment_10"
    // InternalCinEditor.g:3588:1: rule__Translate__BeginTimeAssignment_10 : ( ruleEInt ) ;
    public final void rule__Translate__BeginTimeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3592:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3593:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3593:2: ( ruleEInt )
            // InternalCinEditor.g:3594:3: ruleEInt
            {
             before(grammarAccess.getTranslateAccess().getBeginTimeEIntParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTranslateAccess().getBeginTimeEIntParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__BeginTimeAssignment_10"


    // $ANTLR start "rule__Translate__DurationAssignment_12"
    // InternalCinEditor.g:3603:1: rule__Translate__DurationAssignment_12 : ( ruleEInt ) ;
    public final void rule__Translate__DurationAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3607:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3608:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3608:2: ( ruleEInt )
            // InternalCinEditor.g:3609:3: ruleEInt
            {
             before(grammarAccess.getTranslateAccess().getDurationEIntParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTranslateAccess().getDurationEIntParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__DurationAssignment_12"


    // $ANTLR start "rule__Translate__ElementAssignment_14"
    // InternalCinEditor.g:3618:1: rule__Translate__ElementAssignment_14 : ( ( RULE_ID ) ) ;
    public final void rule__Translate__ElementAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3622:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:3623:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:3623:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:3624:3: ( RULE_ID )
            {
             before(grammarAccess.getTranslateAccess().getElementElementCrossReference_14_0()); 
            // InternalCinEditor.g:3625:3: ( RULE_ID )
            // InternalCinEditor.g:3626:4: RULE_ID
            {
             before(grammarAccess.getTranslateAccess().getElementElementIDTerminalRuleCall_14_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getElementElementIDTerminalRuleCall_14_0_1()); 

            }

             after(grammarAccess.getTranslateAccess().getElementElementCrossReference_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__ElementAssignment_14"


    // $ANTLR start "rule__Rectangle__NameAssignment_1"
    // InternalCinEditor.g:3637:1: rule__Rectangle__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Rectangle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3641:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3642:2: ( ruleEString )
            {
            // InternalCinEditor.g:3642:2: ( ruleEString )
            // InternalCinEditor.g:3643:3: ruleEString
            {
             before(grammarAccess.getRectangleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__NameAssignment_1"


    // $ANTLR start "rule__Rectangle__HexadecimalValueAssignment_3"
    // InternalCinEditor.g:3652:1: rule__Rectangle__HexadecimalValueAssignment_3 : ( ruleEString ) ;
    public final void rule__Rectangle__HexadecimalValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3656:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3657:2: ( ruleEString )
            {
            // InternalCinEditor.g:3657:2: ( ruleEString )
            // InternalCinEditor.g:3658:3: ruleEString
            {
             before(grammarAccess.getRectangleAccess().getHexadecimalValueEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getHexadecimalValueEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__HexadecimalValueAssignment_3"


    // $ANTLR start "rule__Rectangle__PositionAssignment_4"
    // InternalCinEditor.g:3667:1: rule__Rectangle__PositionAssignment_4 : ( rulePosition ) ;
    public final void rule__Rectangle__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3671:1: ( ( rulePosition ) )
            // InternalCinEditor.g:3672:2: ( rulePosition )
            {
            // InternalCinEditor.g:3672:2: ( rulePosition )
            // InternalCinEditor.g:3673:3: rulePosition
            {
             before(grammarAccess.getRectangleAccess().getPositionPositionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getPositionPositionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__PositionAssignment_4"


    // $ANTLR start "rule__Rectangle__BeginTimeAssignment_6"
    // InternalCinEditor.g:3682:1: rule__Rectangle__BeginTimeAssignment_6 : ( ruleEInt ) ;
    public final void rule__Rectangle__BeginTimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3686:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3687:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3687:2: ( ruleEInt )
            // InternalCinEditor.g:3688:3: ruleEInt
            {
             before(grammarAccess.getRectangleAccess().getBeginTimeEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getBeginTimeEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__BeginTimeAssignment_6"


    // $ANTLR start "rule__Rectangle__DurationAssignment_8"
    // InternalCinEditor.g:3697:1: rule__Rectangle__DurationAssignment_8 : ( ruleEInt ) ;
    public final void rule__Rectangle__DurationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3701:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3702:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3702:2: ( ruleEInt )
            // InternalCinEditor.g:3703:3: ruleEInt
            {
             before(grammarAccess.getRectangleAccess().getDurationEIntParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getDurationEIntParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__DurationAssignment_8"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\23\3\uffff\1\4\1\uffff\2\24\1\34\3\uffff";
    static final String dfa_3s = "\1\40\3\uffff\1\5\1\uffff\2\24\1\37\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\7\3\uffff\1\4\1\6\1\5";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\3\uffff\1\2\1\uffff\1\3\1\uffff\1\4\4\uffff\1\5",
            "",
            "",
            "",
            "\1\6\1\7",
            "",
            "\1\10",
            "\1\10",
            "\1\11\1\uffff\1\13\1\12",
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

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "377:1: rule__Element__Alternatives : ( ( ruleText ) | ( rulePicture ) | ( ruleVideo ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleRectangle ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000010A880000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000010A880002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});

}