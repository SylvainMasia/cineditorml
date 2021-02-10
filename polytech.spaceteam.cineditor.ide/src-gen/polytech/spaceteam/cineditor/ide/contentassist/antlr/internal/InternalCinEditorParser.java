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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Movie'", "'Layer'", "'position'", "'('", "','", "')'", "'dimension'", "'x'", "'color'", "'-'", "'Text'", "'->'", "'at'", "'during'", "'fontSize'", "'Picture'", "'\"'", "'Video'", "'from'", "'Effect'", "'FadeIn'", "'on'", "'FadeOut'", "'Translate'", "'Rectangle'"
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


    // $ANTLR start "entryRuleDimension"
    // InternalCinEditor.g:178:1: entryRuleDimension : ruleDimension EOF ;
    public final void entryRuleDimension() throws RecognitionException {
        try {
            // InternalCinEditor.g:179:1: ( ruleDimension EOF )
            // InternalCinEditor.g:180:1: ruleDimension EOF
            {
             before(grammarAccess.getDimensionRule()); 
            pushFollow(FOLLOW_1);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getDimensionRule()); 
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
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // InternalCinEditor.g:187:1: ruleDimension : ( ( rule__Dimension__Group__0 ) ) ;
    public final void ruleDimension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:191:2: ( ( ( rule__Dimension__Group__0 ) ) )
            // InternalCinEditor.g:192:2: ( ( rule__Dimension__Group__0 ) )
            {
            // InternalCinEditor.g:192:2: ( ( rule__Dimension__Group__0 ) )
            // InternalCinEditor.g:193:3: ( rule__Dimension__Group__0 )
            {
             before(grammarAccess.getDimensionAccess().getGroup()); 
            // InternalCinEditor.g:194:3: ( rule__Dimension__Group__0 )
            // InternalCinEditor.g:194:4: rule__Dimension__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getGroup()); 

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
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleHexadecimalColor"
    // InternalCinEditor.g:203:1: entryRuleHexadecimalColor : ruleHexadecimalColor EOF ;
    public final void entryRuleHexadecimalColor() throws RecognitionException {
        try {
            // InternalCinEditor.g:204:1: ( ruleHexadecimalColor EOF )
            // InternalCinEditor.g:205:1: ruleHexadecimalColor EOF
            {
             before(grammarAccess.getHexadecimalColorRule()); 
            pushFollow(FOLLOW_1);
            ruleHexadecimalColor();

            state._fsp--;

             after(grammarAccess.getHexadecimalColorRule()); 
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
    // $ANTLR end "entryRuleHexadecimalColor"


    // $ANTLR start "ruleHexadecimalColor"
    // InternalCinEditor.g:212:1: ruleHexadecimalColor : ( ( rule__HexadecimalColor__Group__0 ) ) ;
    public final void ruleHexadecimalColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:216:2: ( ( ( rule__HexadecimalColor__Group__0 ) ) )
            // InternalCinEditor.g:217:2: ( ( rule__HexadecimalColor__Group__0 ) )
            {
            // InternalCinEditor.g:217:2: ( ( rule__HexadecimalColor__Group__0 ) )
            // InternalCinEditor.g:218:3: ( rule__HexadecimalColor__Group__0 )
            {
             before(grammarAccess.getHexadecimalColorAccess().getGroup()); 
            // InternalCinEditor.g:219:3: ( rule__HexadecimalColor__Group__0 )
            // InternalCinEditor.g:219:4: rule__HexadecimalColor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HexadecimalColor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHexadecimalColorAccess().getGroup()); 

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
    // $ANTLR end "ruleHexadecimalColor"


    // $ANTLR start "entryRuleEInt"
    // InternalCinEditor.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalCinEditor.g:229:1: ( ruleEInt EOF )
            // InternalCinEditor.g:230:1: ruleEInt EOF
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
    // InternalCinEditor.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalCinEditor.g:242:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalCinEditor.g:242:2: ( ( rule__EInt__Group__0 ) )
            // InternalCinEditor.g:243:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalCinEditor.g:244:3: ( rule__EInt__Group__0 )
            // InternalCinEditor.g:244:4: rule__EInt__Group__0
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
    // InternalCinEditor.g:253:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalCinEditor.g:254:1: ( ruleText EOF )
            // InternalCinEditor.g:255:1: ruleText EOF
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
    // InternalCinEditor.g:262:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:266:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalCinEditor.g:267:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalCinEditor.g:267:2: ( ( rule__Text__Group__0 ) )
            // InternalCinEditor.g:268:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalCinEditor.g:269:3: ( rule__Text__Group__0 )
            // InternalCinEditor.g:269:4: rule__Text__Group__0
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
    // InternalCinEditor.g:278:1: entryRulePicture : rulePicture EOF ;
    public final void entryRulePicture() throws RecognitionException {
        try {
            // InternalCinEditor.g:279:1: ( rulePicture EOF )
            // InternalCinEditor.g:280:1: rulePicture EOF
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
    // InternalCinEditor.g:287:1: rulePicture : ( ( rule__Picture__Group__0 ) ) ;
    public final void rulePicture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:291:2: ( ( ( rule__Picture__Group__0 ) ) )
            // InternalCinEditor.g:292:2: ( ( rule__Picture__Group__0 ) )
            {
            // InternalCinEditor.g:292:2: ( ( rule__Picture__Group__0 ) )
            // InternalCinEditor.g:293:3: ( rule__Picture__Group__0 )
            {
             before(grammarAccess.getPictureAccess().getGroup()); 
            // InternalCinEditor.g:294:3: ( rule__Picture__Group__0 )
            // InternalCinEditor.g:294:4: rule__Picture__Group__0
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
    // InternalCinEditor.g:303:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalCinEditor.g:304:1: ( ruleVideo EOF )
            // InternalCinEditor.g:305:1: ruleVideo EOF
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
    // InternalCinEditor.g:312:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:316:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalCinEditor.g:317:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalCinEditor.g:317:2: ( ( rule__Video__Group__0 ) )
            // InternalCinEditor.g:318:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalCinEditor.g:319:3: ( rule__Video__Group__0 )
            // InternalCinEditor.g:319:4: rule__Video__Group__0
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
    // InternalCinEditor.g:328:1: entryRuleFadeIn : ruleFadeIn EOF ;
    public final void entryRuleFadeIn() throws RecognitionException {
        try {
            // InternalCinEditor.g:329:1: ( ruleFadeIn EOF )
            // InternalCinEditor.g:330:1: ruleFadeIn EOF
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
    // InternalCinEditor.g:337:1: ruleFadeIn : ( ( rule__FadeIn__Group__0 ) ) ;
    public final void ruleFadeIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:341:2: ( ( ( rule__FadeIn__Group__0 ) ) )
            // InternalCinEditor.g:342:2: ( ( rule__FadeIn__Group__0 ) )
            {
            // InternalCinEditor.g:342:2: ( ( rule__FadeIn__Group__0 ) )
            // InternalCinEditor.g:343:3: ( rule__FadeIn__Group__0 )
            {
             before(grammarAccess.getFadeInAccess().getGroup()); 
            // InternalCinEditor.g:344:3: ( rule__FadeIn__Group__0 )
            // InternalCinEditor.g:344:4: rule__FadeIn__Group__0
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
    // InternalCinEditor.g:353:1: entryRuleFadeOut : ruleFadeOut EOF ;
    public final void entryRuleFadeOut() throws RecognitionException {
        try {
            // InternalCinEditor.g:354:1: ( ruleFadeOut EOF )
            // InternalCinEditor.g:355:1: ruleFadeOut EOF
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
    // InternalCinEditor.g:362:1: ruleFadeOut : ( ( rule__FadeOut__Group__0 ) ) ;
    public final void ruleFadeOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:366:2: ( ( ( rule__FadeOut__Group__0 ) ) )
            // InternalCinEditor.g:367:2: ( ( rule__FadeOut__Group__0 ) )
            {
            // InternalCinEditor.g:367:2: ( ( rule__FadeOut__Group__0 ) )
            // InternalCinEditor.g:368:3: ( rule__FadeOut__Group__0 )
            {
             before(grammarAccess.getFadeOutAccess().getGroup()); 
            // InternalCinEditor.g:369:3: ( rule__FadeOut__Group__0 )
            // InternalCinEditor.g:369:4: rule__FadeOut__Group__0
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
    // InternalCinEditor.g:378:1: entryRuleTranslate : ruleTranslate EOF ;
    public final void entryRuleTranslate() throws RecognitionException {
        try {
            // InternalCinEditor.g:379:1: ( ruleTranslate EOF )
            // InternalCinEditor.g:380:1: ruleTranslate EOF
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
    // InternalCinEditor.g:387:1: ruleTranslate : ( ( rule__Translate__Group__0 ) ) ;
    public final void ruleTranslate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:391:2: ( ( ( rule__Translate__Group__0 ) ) )
            // InternalCinEditor.g:392:2: ( ( rule__Translate__Group__0 ) )
            {
            // InternalCinEditor.g:392:2: ( ( rule__Translate__Group__0 ) )
            // InternalCinEditor.g:393:3: ( rule__Translate__Group__0 )
            {
             before(grammarAccess.getTranslateAccess().getGroup()); 
            // InternalCinEditor.g:394:3: ( rule__Translate__Group__0 )
            // InternalCinEditor.g:394:4: rule__Translate__Group__0
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
    // InternalCinEditor.g:403:1: entryRuleRectangle : ruleRectangle EOF ;
    public final void entryRuleRectangle() throws RecognitionException {
        try {
            // InternalCinEditor.g:404:1: ( ruleRectangle EOF )
            // InternalCinEditor.g:405:1: ruleRectangle EOF
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
    // InternalCinEditor.g:412:1: ruleRectangle : ( ( rule__Rectangle__Group__0 ) ) ;
    public final void ruleRectangle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:416:2: ( ( ( rule__Rectangle__Group__0 ) ) )
            // InternalCinEditor.g:417:2: ( ( rule__Rectangle__Group__0 ) )
            {
            // InternalCinEditor.g:417:2: ( ( rule__Rectangle__Group__0 ) )
            // InternalCinEditor.g:418:3: ( rule__Rectangle__Group__0 )
            {
             before(grammarAccess.getRectangleAccess().getGroup()); 
            // InternalCinEditor.g:419:3: ( rule__Rectangle__Group__0 )
            // InternalCinEditor.g:419:4: rule__Rectangle__Group__0
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
    // InternalCinEditor.g:427:1: rule__Element__Alternatives : ( ( ruleText ) | ( rulePicture ) | ( ruleVideo ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleRectangle ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:431:1: ( ( ruleText ) | ( rulePicture ) | ( ruleVideo ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleRectangle ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCinEditor.g:432:2: ( ruleText )
                    {
                    // InternalCinEditor.g:432:2: ( ruleText )
                    // InternalCinEditor.g:433:3: ruleText
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
                    // InternalCinEditor.g:438:2: ( rulePicture )
                    {
                    // InternalCinEditor.g:438:2: ( rulePicture )
                    // InternalCinEditor.g:439:3: rulePicture
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
                    // InternalCinEditor.g:444:2: ( ruleVideo )
                    {
                    // InternalCinEditor.g:444:2: ( ruleVideo )
                    // InternalCinEditor.g:445:3: ruleVideo
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
                    // InternalCinEditor.g:450:2: ( ruleFadeIn )
                    {
                    // InternalCinEditor.g:450:2: ( ruleFadeIn )
                    // InternalCinEditor.g:451:3: ruleFadeIn
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
                    // InternalCinEditor.g:456:2: ( ruleFadeOut )
                    {
                    // InternalCinEditor.g:456:2: ( ruleFadeOut )
                    // InternalCinEditor.g:457:3: ruleFadeOut
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
                    // InternalCinEditor.g:462:2: ( ruleTranslate )
                    {
                    // InternalCinEditor.g:462:2: ( ruleTranslate )
                    // InternalCinEditor.g:463:3: ruleTranslate
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
                    // InternalCinEditor.g:468:2: ( ruleRectangle )
                    {
                    // InternalCinEditor.g:468:2: ( ruleRectangle )
                    // InternalCinEditor.g:469:3: ruleRectangle
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
    // InternalCinEditor.g:478:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:482:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCinEditor.g:483:2: ( RULE_STRING )
                    {
                    // InternalCinEditor.g:483:2: ( RULE_STRING )
                    // InternalCinEditor.g:484:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:489:2: ( RULE_ID )
                    {
                    // InternalCinEditor.g:489:2: ( RULE_ID )
                    // InternalCinEditor.g:490:3: RULE_ID
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
    // InternalCinEditor.g:499:1: rule__Movie__Group__0 : rule__Movie__Group__0__Impl rule__Movie__Group__1 ;
    public final void rule__Movie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:503:1: ( rule__Movie__Group__0__Impl rule__Movie__Group__1 )
            // InternalCinEditor.g:504:2: rule__Movie__Group__0__Impl rule__Movie__Group__1
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
    // InternalCinEditor.g:511:1: rule__Movie__Group__0__Impl : ( 'Movie' ) ;
    public final void rule__Movie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:515:1: ( ( 'Movie' ) )
            // InternalCinEditor.g:516:1: ( 'Movie' )
            {
            // InternalCinEditor.g:516:1: ( 'Movie' )
            // InternalCinEditor.g:517:2: 'Movie'
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
    // InternalCinEditor.g:526:1: rule__Movie__Group__1 : rule__Movie__Group__1__Impl rule__Movie__Group__2 ;
    public final void rule__Movie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:530:1: ( rule__Movie__Group__1__Impl rule__Movie__Group__2 )
            // InternalCinEditor.g:531:2: rule__Movie__Group__1__Impl rule__Movie__Group__2
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
    // InternalCinEditor.g:538:1: rule__Movie__Group__1__Impl : ( ( rule__Movie__NameAssignment_1 ) ) ;
    public final void rule__Movie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:542:1: ( ( ( rule__Movie__NameAssignment_1 ) ) )
            // InternalCinEditor.g:543:1: ( ( rule__Movie__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:543:1: ( ( rule__Movie__NameAssignment_1 ) )
            // InternalCinEditor.g:544:2: ( rule__Movie__NameAssignment_1 )
            {
             before(grammarAccess.getMovieAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:545:2: ( rule__Movie__NameAssignment_1 )
            // InternalCinEditor.g:545:3: rule__Movie__NameAssignment_1
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
    // InternalCinEditor.g:553:1: rule__Movie__Group__2 : rule__Movie__Group__2__Impl rule__Movie__Group__3 ;
    public final void rule__Movie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:557:1: ( rule__Movie__Group__2__Impl rule__Movie__Group__3 )
            // InternalCinEditor.g:558:2: rule__Movie__Group__2__Impl rule__Movie__Group__3
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
    // InternalCinEditor.g:565:1: rule__Movie__Group__2__Impl : ( ( rule__Movie__DimensionAssignment_2 ) ) ;
    public final void rule__Movie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:569:1: ( ( ( rule__Movie__DimensionAssignment_2 ) ) )
            // InternalCinEditor.g:570:1: ( ( rule__Movie__DimensionAssignment_2 ) )
            {
            // InternalCinEditor.g:570:1: ( ( rule__Movie__DimensionAssignment_2 ) )
            // InternalCinEditor.g:571:2: ( rule__Movie__DimensionAssignment_2 )
            {
             before(grammarAccess.getMovieAccess().getDimensionAssignment_2()); 
            // InternalCinEditor.g:572:2: ( rule__Movie__DimensionAssignment_2 )
            // InternalCinEditor.g:572:3: rule__Movie__DimensionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Movie__DimensionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getDimensionAssignment_2()); 

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
    // InternalCinEditor.g:580:1: rule__Movie__Group__3 : rule__Movie__Group__3__Impl ;
    public final void rule__Movie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:584:1: ( rule__Movie__Group__3__Impl )
            // InternalCinEditor.g:585:2: rule__Movie__Group__3__Impl
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
    // InternalCinEditor.g:591:1: rule__Movie__Group__3__Impl : ( ( ( rule__Movie__LayersAssignment_3 ) ) ( ( rule__Movie__LayersAssignment_3 )* ) ) ;
    public final void rule__Movie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:595:1: ( ( ( ( rule__Movie__LayersAssignment_3 ) ) ( ( rule__Movie__LayersAssignment_3 )* ) ) )
            // InternalCinEditor.g:596:1: ( ( ( rule__Movie__LayersAssignment_3 ) ) ( ( rule__Movie__LayersAssignment_3 )* ) )
            {
            // InternalCinEditor.g:596:1: ( ( ( rule__Movie__LayersAssignment_3 ) ) ( ( rule__Movie__LayersAssignment_3 )* ) )
            // InternalCinEditor.g:597:2: ( ( rule__Movie__LayersAssignment_3 ) ) ( ( rule__Movie__LayersAssignment_3 )* )
            {
            // InternalCinEditor.g:597:2: ( ( rule__Movie__LayersAssignment_3 ) )
            // InternalCinEditor.g:598:3: ( rule__Movie__LayersAssignment_3 )
            {
             before(grammarAccess.getMovieAccess().getLayersAssignment_3()); 
            // InternalCinEditor.g:599:3: ( rule__Movie__LayersAssignment_3 )
            // InternalCinEditor.g:599:4: rule__Movie__LayersAssignment_3
            {
            pushFollow(FOLLOW_6);
            rule__Movie__LayersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getLayersAssignment_3()); 

            }

            // InternalCinEditor.g:602:2: ( ( rule__Movie__LayersAssignment_3 )* )
            // InternalCinEditor.g:603:3: ( rule__Movie__LayersAssignment_3 )*
            {
             before(grammarAccess.getMovieAccess().getLayersAssignment_3()); 
            // InternalCinEditor.g:604:3: ( rule__Movie__LayersAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCinEditor.g:604:4: rule__Movie__LayersAssignment_3
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
    // InternalCinEditor.g:614:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:618:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalCinEditor.g:619:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
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
    // InternalCinEditor.g:626:1: rule__Layer__Group__0__Impl : ( () ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:630:1: ( ( () ) )
            // InternalCinEditor.g:631:1: ( () )
            {
            // InternalCinEditor.g:631:1: ( () )
            // InternalCinEditor.g:632:2: ()
            {
             before(grammarAccess.getLayerAccess().getLayerAction_0()); 
            // InternalCinEditor.g:633:2: ()
            // InternalCinEditor.g:633:3: 
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
    // InternalCinEditor.g:641:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:645:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalCinEditor.g:646:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
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
    // InternalCinEditor.g:653:1: rule__Layer__Group__1__Impl : ( 'Layer' ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:657:1: ( ( 'Layer' ) )
            // InternalCinEditor.g:658:1: ( 'Layer' )
            {
            // InternalCinEditor.g:658:1: ( 'Layer' )
            // InternalCinEditor.g:659:2: 'Layer'
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
    // InternalCinEditor.g:668:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:672:1: ( rule__Layer__Group__2__Impl )
            // InternalCinEditor.g:673:2: rule__Layer__Group__2__Impl
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
    // InternalCinEditor.g:679:1: rule__Layer__Group__2__Impl : ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:683:1: ( ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) ) )
            // InternalCinEditor.g:684:1: ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) )
            {
            // InternalCinEditor.g:684:1: ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) )
            // InternalCinEditor.g:685:2: ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* )
            {
            // InternalCinEditor.g:685:2: ( ( rule__Layer__ElementsAssignment_2 ) )
            // InternalCinEditor.g:686:3: ( rule__Layer__ElementsAssignment_2 )
            {
             before(grammarAccess.getLayerAccess().getElementsAssignment_2()); 
            // InternalCinEditor.g:687:3: ( rule__Layer__ElementsAssignment_2 )
            // InternalCinEditor.g:687:4: rule__Layer__ElementsAssignment_2
            {
            pushFollow(FOLLOW_8);
            rule__Layer__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getElementsAssignment_2()); 

            }

            // InternalCinEditor.g:690:2: ( ( rule__Layer__ElementsAssignment_2 )* )
            // InternalCinEditor.g:691:3: ( rule__Layer__ElementsAssignment_2 )*
            {
             before(grammarAccess.getLayerAccess().getElementsAssignment_2()); 
            // InternalCinEditor.g:692:3: ( rule__Layer__ElementsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21||LA4_0==26||LA4_0==28||LA4_0==30||LA4_0==35) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCinEditor.g:692:4: rule__Layer__ElementsAssignment_2
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
    // InternalCinEditor.g:702:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:706:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalCinEditor.g:707:2: rule__Position__Group__0__Impl rule__Position__Group__1
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
    // InternalCinEditor.g:714:1: rule__Position__Group__0__Impl : ( 'position' ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:718:1: ( ( 'position' ) )
            // InternalCinEditor.g:719:1: ( 'position' )
            {
            // InternalCinEditor.g:719:1: ( 'position' )
            // InternalCinEditor.g:720:2: 'position'
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
    // InternalCinEditor.g:729:1: rule__Position__Group__1 : rule__Position__Group__1__Impl ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:733:1: ( rule__Position__Group__1__Impl )
            // InternalCinEditor.g:734:2: rule__Position__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__1__Impl();

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
    // InternalCinEditor.g:740:1: rule__Position__Group__1__Impl : ( ( rule__Position__Group_1__0 ) ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:744:1: ( ( ( rule__Position__Group_1__0 ) ) )
            // InternalCinEditor.g:745:1: ( ( rule__Position__Group_1__0 ) )
            {
            // InternalCinEditor.g:745:1: ( ( rule__Position__Group_1__0 ) )
            // InternalCinEditor.g:746:2: ( rule__Position__Group_1__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup_1()); 
            // InternalCinEditor.g:747:2: ( rule__Position__Group_1__0 )
            // InternalCinEditor.g:747:3: rule__Position__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Position__Group_1__0"
    // InternalCinEditor.g:756:1: rule__Position__Group_1__0 : rule__Position__Group_1__0__Impl rule__Position__Group_1__1 ;
    public final void rule__Position__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:760:1: ( rule__Position__Group_1__0__Impl rule__Position__Group_1__1 )
            // InternalCinEditor.g:761:2: rule__Position__Group_1__0__Impl rule__Position__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Position__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group_1__1();

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
    // $ANTLR end "rule__Position__Group_1__0"


    // $ANTLR start "rule__Position__Group_1__0__Impl"
    // InternalCinEditor.g:768:1: rule__Position__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Position__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:772:1: ( ( '(' ) )
            // InternalCinEditor.g:773:1: ( '(' )
            {
            // InternalCinEditor.g:773:1: ( '(' )
            // InternalCinEditor.g:774:2: '('
            {
             before(grammarAccess.getPositionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Position__Group_1__0__Impl"


    // $ANTLR start "rule__Position__Group_1__1"
    // InternalCinEditor.g:783:1: rule__Position__Group_1__1 : rule__Position__Group_1__1__Impl rule__Position__Group_1__2 ;
    public final void rule__Position__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:787:1: ( rule__Position__Group_1__1__Impl rule__Position__Group_1__2 )
            // InternalCinEditor.g:788:2: rule__Position__Group_1__1__Impl rule__Position__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Position__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group_1__2();

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
    // $ANTLR end "rule__Position__Group_1__1"


    // $ANTLR start "rule__Position__Group_1__1__Impl"
    // InternalCinEditor.g:795:1: rule__Position__Group_1__1__Impl : ( ( rule__Position__XAssignment_1_1 ) ) ;
    public final void rule__Position__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:799:1: ( ( ( rule__Position__XAssignment_1_1 ) ) )
            // InternalCinEditor.g:800:1: ( ( rule__Position__XAssignment_1_1 ) )
            {
            // InternalCinEditor.g:800:1: ( ( rule__Position__XAssignment_1_1 ) )
            // InternalCinEditor.g:801:2: ( rule__Position__XAssignment_1_1 )
            {
             before(grammarAccess.getPositionAccess().getXAssignment_1_1()); 
            // InternalCinEditor.g:802:2: ( rule__Position__XAssignment_1_1 )
            // InternalCinEditor.g:802:3: rule__Position__XAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Position__XAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getXAssignment_1_1()); 

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
    // $ANTLR end "rule__Position__Group_1__1__Impl"


    // $ANTLR start "rule__Position__Group_1__2"
    // InternalCinEditor.g:810:1: rule__Position__Group_1__2 : rule__Position__Group_1__2__Impl rule__Position__Group_1__3 ;
    public final void rule__Position__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:814:1: ( rule__Position__Group_1__2__Impl rule__Position__Group_1__3 )
            // InternalCinEditor.g:815:2: rule__Position__Group_1__2__Impl rule__Position__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__Position__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group_1__3();

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
    // $ANTLR end "rule__Position__Group_1__2"


    // $ANTLR start "rule__Position__Group_1__2__Impl"
    // InternalCinEditor.g:822:1: rule__Position__Group_1__2__Impl : ( ',' ) ;
    public final void rule__Position__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:826:1: ( ( ',' ) )
            // InternalCinEditor.g:827:1: ( ',' )
            {
            // InternalCinEditor.g:827:1: ( ',' )
            // InternalCinEditor.g:828:2: ','
            {
             before(grammarAccess.getPositionAccess().getCommaKeyword_1_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCommaKeyword_1_2()); 

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
    // $ANTLR end "rule__Position__Group_1__2__Impl"


    // $ANTLR start "rule__Position__Group_1__3"
    // InternalCinEditor.g:837:1: rule__Position__Group_1__3 : rule__Position__Group_1__3__Impl rule__Position__Group_1__4 ;
    public final void rule__Position__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:841:1: ( rule__Position__Group_1__3__Impl rule__Position__Group_1__4 )
            // InternalCinEditor.g:842:2: rule__Position__Group_1__3__Impl rule__Position__Group_1__4
            {
            pushFollow(FOLLOW_12);
            rule__Position__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group_1__4();

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
    // $ANTLR end "rule__Position__Group_1__3"


    // $ANTLR start "rule__Position__Group_1__3__Impl"
    // InternalCinEditor.g:849:1: rule__Position__Group_1__3__Impl : ( ( rule__Position__YAssignment_1_3 ) ) ;
    public final void rule__Position__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:853:1: ( ( ( rule__Position__YAssignment_1_3 ) ) )
            // InternalCinEditor.g:854:1: ( ( rule__Position__YAssignment_1_3 ) )
            {
            // InternalCinEditor.g:854:1: ( ( rule__Position__YAssignment_1_3 ) )
            // InternalCinEditor.g:855:2: ( rule__Position__YAssignment_1_3 )
            {
             before(grammarAccess.getPositionAccess().getYAssignment_1_3()); 
            // InternalCinEditor.g:856:2: ( rule__Position__YAssignment_1_3 )
            // InternalCinEditor.g:856:3: rule__Position__YAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Position__YAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getYAssignment_1_3()); 

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
    // $ANTLR end "rule__Position__Group_1__3__Impl"


    // $ANTLR start "rule__Position__Group_1__4"
    // InternalCinEditor.g:864:1: rule__Position__Group_1__4 : rule__Position__Group_1__4__Impl ;
    public final void rule__Position__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:868:1: ( rule__Position__Group_1__4__Impl )
            // InternalCinEditor.g:869:2: rule__Position__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group_1__4__Impl();

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
    // $ANTLR end "rule__Position__Group_1__4"


    // $ANTLR start "rule__Position__Group_1__4__Impl"
    // InternalCinEditor.g:875:1: rule__Position__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Position__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:879:1: ( ( ')' ) )
            // InternalCinEditor.g:880:1: ( ')' )
            {
            // InternalCinEditor.g:880:1: ( ')' )
            // InternalCinEditor.g:881:2: ')'
            {
             before(grammarAccess.getPositionAccess().getRightParenthesisKeyword_1_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getRightParenthesisKeyword_1_4()); 

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
    // $ANTLR end "rule__Position__Group_1__4__Impl"


    // $ANTLR start "rule__Dimension__Group__0"
    // InternalCinEditor.g:891:1: rule__Dimension__Group__0 : rule__Dimension__Group__0__Impl rule__Dimension__Group__1 ;
    public final void rule__Dimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:895:1: ( rule__Dimension__Group__0__Impl rule__Dimension__Group__1 )
            // InternalCinEditor.g:896:2: rule__Dimension__Group__0__Impl rule__Dimension__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Dimension__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dimension__Group__1();

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
    // $ANTLR end "rule__Dimension__Group__0"


    // $ANTLR start "rule__Dimension__Group__0__Impl"
    // InternalCinEditor.g:903:1: rule__Dimension__Group__0__Impl : ( 'dimension' ) ;
    public final void rule__Dimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:907:1: ( ( 'dimension' ) )
            // InternalCinEditor.g:908:1: ( 'dimension' )
            {
            // InternalCinEditor.g:908:1: ( 'dimension' )
            // InternalCinEditor.g:909:2: 'dimension'
            {
             before(grammarAccess.getDimensionAccess().getDimensionKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getDimensionKeyword_0()); 

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
    // $ANTLR end "rule__Dimension__Group__0__Impl"


    // $ANTLR start "rule__Dimension__Group__1"
    // InternalCinEditor.g:918:1: rule__Dimension__Group__1 : rule__Dimension__Group__1__Impl rule__Dimension__Group__2 ;
    public final void rule__Dimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:922:1: ( rule__Dimension__Group__1__Impl rule__Dimension__Group__2 )
            // InternalCinEditor.g:923:2: rule__Dimension__Group__1__Impl rule__Dimension__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Dimension__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dimension__Group__2();

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
    // $ANTLR end "rule__Dimension__Group__1"


    // $ANTLR start "rule__Dimension__Group__1__Impl"
    // InternalCinEditor.g:930:1: rule__Dimension__Group__1__Impl : ( ( rule__Dimension__WidthAssignment_1 ) ) ;
    public final void rule__Dimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:934:1: ( ( ( rule__Dimension__WidthAssignment_1 ) ) )
            // InternalCinEditor.g:935:1: ( ( rule__Dimension__WidthAssignment_1 ) )
            {
            // InternalCinEditor.g:935:1: ( ( rule__Dimension__WidthAssignment_1 ) )
            // InternalCinEditor.g:936:2: ( rule__Dimension__WidthAssignment_1 )
            {
             before(grammarAccess.getDimensionAccess().getWidthAssignment_1()); 
            // InternalCinEditor.g:937:2: ( rule__Dimension__WidthAssignment_1 )
            // InternalCinEditor.g:937:3: rule__Dimension__WidthAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__WidthAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getWidthAssignment_1()); 

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
    // $ANTLR end "rule__Dimension__Group__1__Impl"


    // $ANTLR start "rule__Dimension__Group__2"
    // InternalCinEditor.g:945:1: rule__Dimension__Group__2 : rule__Dimension__Group__2__Impl rule__Dimension__Group__3 ;
    public final void rule__Dimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:949:1: ( rule__Dimension__Group__2__Impl rule__Dimension__Group__3 )
            // InternalCinEditor.g:950:2: rule__Dimension__Group__2__Impl rule__Dimension__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Dimension__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dimension__Group__3();

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
    // $ANTLR end "rule__Dimension__Group__2"


    // $ANTLR start "rule__Dimension__Group__2__Impl"
    // InternalCinEditor.g:957:1: rule__Dimension__Group__2__Impl : ( 'x' ) ;
    public final void rule__Dimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:961:1: ( ( 'x' ) )
            // InternalCinEditor.g:962:1: ( 'x' )
            {
            // InternalCinEditor.g:962:1: ( 'x' )
            // InternalCinEditor.g:963:2: 'x'
            {
             before(grammarAccess.getDimensionAccess().getXKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getXKeyword_2()); 

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
    // $ANTLR end "rule__Dimension__Group__2__Impl"


    // $ANTLR start "rule__Dimension__Group__3"
    // InternalCinEditor.g:972:1: rule__Dimension__Group__3 : rule__Dimension__Group__3__Impl ;
    public final void rule__Dimension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:976:1: ( rule__Dimension__Group__3__Impl )
            // InternalCinEditor.g:977:2: rule__Dimension__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__Group__3__Impl();

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
    // $ANTLR end "rule__Dimension__Group__3"


    // $ANTLR start "rule__Dimension__Group__3__Impl"
    // InternalCinEditor.g:983:1: rule__Dimension__Group__3__Impl : ( ( rule__Dimension__HeightAssignment_3 ) ) ;
    public final void rule__Dimension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:987:1: ( ( ( rule__Dimension__HeightAssignment_3 ) ) )
            // InternalCinEditor.g:988:1: ( ( rule__Dimension__HeightAssignment_3 ) )
            {
            // InternalCinEditor.g:988:1: ( ( rule__Dimension__HeightAssignment_3 ) )
            // InternalCinEditor.g:989:2: ( rule__Dimension__HeightAssignment_3 )
            {
             before(grammarAccess.getDimensionAccess().getHeightAssignment_3()); 
            // InternalCinEditor.g:990:2: ( rule__Dimension__HeightAssignment_3 )
            // InternalCinEditor.g:990:3: rule__Dimension__HeightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__HeightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getHeightAssignment_3()); 

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
    // $ANTLR end "rule__Dimension__Group__3__Impl"


    // $ANTLR start "rule__HexadecimalColor__Group__0"
    // InternalCinEditor.g:999:1: rule__HexadecimalColor__Group__0 : rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1 ;
    public final void rule__HexadecimalColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1003:1: ( rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1 )
            // InternalCinEditor.g:1004:2: rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__HexadecimalColor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HexadecimalColor__Group__1();

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
    // $ANTLR end "rule__HexadecimalColor__Group__0"


    // $ANTLR start "rule__HexadecimalColor__Group__0__Impl"
    // InternalCinEditor.g:1011:1: rule__HexadecimalColor__Group__0__Impl : ( 'color' ) ;
    public final void rule__HexadecimalColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1015:1: ( ( 'color' ) )
            // InternalCinEditor.g:1016:1: ( 'color' )
            {
            // InternalCinEditor.g:1016:1: ( 'color' )
            // InternalCinEditor.g:1017:2: 'color'
            {
             before(grammarAccess.getHexadecimalColorAccess().getColorKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getHexadecimalColorAccess().getColorKeyword_0()); 

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
    // $ANTLR end "rule__HexadecimalColor__Group__0__Impl"


    // $ANTLR start "rule__HexadecimalColor__Group__1"
    // InternalCinEditor.g:1026:1: rule__HexadecimalColor__Group__1 : rule__HexadecimalColor__Group__1__Impl ;
    public final void rule__HexadecimalColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1030:1: ( rule__HexadecimalColor__Group__1__Impl )
            // InternalCinEditor.g:1031:2: rule__HexadecimalColor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HexadecimalColor__Group__1__Impl();

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
    // $ANTLR end "rule__HexadecimalColor__Group__1"


    // $ANTLR start "rule__HexadecimalColor__Group__1__Impl"
    // InternalCinEditor.g:1037:1: rule__HexadecimalColor__Group__1__Impl : ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) ) ;
    public final void rule__HexadecimalColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1041:1: ( ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) ) )
            // InternalCinEditor.g:1042:1: ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) )
            {
            // InternalCinEditor.g:1042:1: ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) )
            // InternalCinEditor.g:1043:2: ( rule__HexadecimalColor__HexadecimalValueAssignment_1 )
            {
             before(grammarAccess.getHexadecimalColorAccess().getHexadecimalValueAssignment_1()); 
            // InternalCinEditor.g:1044:2: ( rule__HexadecimalColor__HexadecimalValueAssignment_1 )
            // InternalCinEditor.g:1044:3: rule__HexadecimalColor__HexadecimalValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HexadecimalColor__HexadecimalValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHexadecimalColorAccess().getHexadecimalValueAssignment_1()); 

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
    // $ANTLR end "rule__HexadecimalColor__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalCinEditor.g:1053:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1057:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalCinEditor.g:1058:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCinEditor.g:1065:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1069:1: ( ( ( '-' )? ) )
            // InternalCinEditor.g:1070:1: ( ( '-' )? )
            {
            // InternalCinEditor.g:1070:1: ( ( '-' )? )
            // InternalCinEditor.g:1071:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalCinEditor.g:1072:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCinEditor.g:1072:3: '-'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalCinEditor.g:1080:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1084:1: ( rule__EInt__Group__1__Impl )
            // InternalCinEditor.g:1085:2: rule__EInt__Group__1__Impl
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
    // InternalCinEditor.g:1091:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1095:1: ( ( RULE_INT ) )
            // InternalCinEditor.g:1096:1: ( RULE_INT )
            {
            // InternalCinEditor.g:1096:1: ( RULE_INT )
            // InternalCinEditor.g:1097:2: RULE_INT
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
    // InternalCinEditor.g:1107:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1111:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalCinEditor.g:1112:2: rule__Text__Group__0__Impl rule__Text__Group__1
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
    // InternalCinEditor.g:1119:1: rule__Text__Group__0__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1123:1: ( ( 'Text' ) )
            // InternalCinEditor.g:1124:1: ( 'Text' )
            {
            // InternalCinEditor.g:1124:1: ( 'Text' )
            // InternalCinEditor.g:1125:2: 'Text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalCinEditor.g:1134:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1138:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalCinEditor.g:1139:2: rule__Text__Group__1__Impl rule__Text__Group__2
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
    // InternalCinEditor.g:1146:1: rule__Text__Group__1__Impl : ( ( rule__Text__NameAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1150:1: ( ( ( rule__Text__NameAssignment_1 ) ) )
            // InternalCinEditor.g:1151:1: ( ( rule__Text__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:1151:1: ( ( rule__Text__NameAssignment_1 ) )
            // InternalCinEditor.g:1152:2: ( rule__Text__NameAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:1153:2: ( rule__Text__NameAssignment_1 )
            // InternalCinEditor.g:1153:3: rule__Text__NameAssignment_1
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
    // InternalCinEditor.g:1161:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1165:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalCinEditor.g:1166:2: rule__Text__Group__2__Impl rule__Text__Group__3
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
    // InternalCinEditor.g:1173:1: rule__Text__Group__2__Impl : ( '->' ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1177:1: ( ( '->' ) )
            // InternalCinEditor.g:1178:1: ( '->' )
            {
            // InternalCinEditor.g:1178:1: ( '->' )
            // InternalCinEditor.g:1179:2: '->'
            {
             before(grammarAccess.getTextAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCinEditor.g:1188:1: rule__Text__Group__3 : rule__Text__Group__3__Impl rule__Text__Group__4 ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1192:1: ( rule__Text__Group__3__Impl rule__Text__Group__4 )
            // InternalCinEditor.g:1193:2: rule__Text__Group__3__Impl rule__Text__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalCinEditor.g:1200:1: rule__Text__Group__3__Impl : ( ( rule__Text__TextAssignment_3 ) ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1204:1: ( ( ( rule__Text__TextAssignment_3 ) ) )
            // InternalCinEditor.g:1205:1: ( ( rule__Text__TextAssignment_3 ) )
            {
            // InternalCinEditor.g:1205:1: ( ( rule__Text__TextAssignment_3 ) )
            // InternalCinEditor.g:1206:2: ( rule__Text__TextAssignment_3 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_3()); 
            // InternalCinEditor.g:1207:2: ( rule__Text__TextAssignment_3 )
            // InternalCinEditor.g:1207:3: rule__Text__TextAssignment_3
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
    // InternalCinEditor.g:1215:1: rule__Text__Group__4 : rule__Text__Group__4__Impl rule__Text__Group__5 ;
    public final void rule__Text__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1219:1: ( rule__Text__Group__4__Impl rule__Text__Group__5 )
            // InternalCinEditor.g:1220:2: rule__Text__Group__4__Impl rule__Text__Group__5
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
    // InternalCinEditor.g:1227:1: rule__Text__Group__4__Impl : ( ( rule__Text__Group_4__0 )? ) ;
    public final void rule__Text__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1231:1: ( ( ( rule__Text__Group_4__0 )? ) )
            // InternalCinEditor.g:1232:1: ( ( rule__Text__Group_4__0 )? )
            {
            // InternalCinEditor.g:1232:1: ( ( rule__Text__Group_4__0 )? )
            // InternalCinEditor.g:1233:2: ( rule__Text__Group_4__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_4()); 
            // InternalCinEditor.g:1234:2: ( rule__Text__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCinEditor.g:1234:3: rule__Text__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getGroup_4()); 

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
    // InternalCinEditor.g:1242:1: rule__Text__Group__5 : rule__Text__Group__5__Impl rule__Text__Group__6 ;
    public final void rule__Text__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1246:1: ( rule__Text__Group__5__Impl rule__Text__Group__6 )
            // InternalCinEditor.g:1247:2: rule__Text__Group__5__Impl rule__Text__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalCinEditor.g:1254:1: rule__Text__Group__5__Impl : ( ( rule__Text__PositionAssignment_5 )? ) ;
    public final void rule__Text__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1258:1: ( ( ( rule__Text__PositionAssignment_5 )? ) )
            // InternalCinEditor.g:1259:1: ( ( rule__Text__PositionAssignment_5 )? )
            {
            // InternalCinEditor.g:1259:1: ( ( rule__Text__PositionAssignment_5 )? )
            // InternalCinEditor.g:1260:2: ( rule__Text__PositionAssignment_5 )?
            {
             before(grammarAccess.getTextAccess().getPositionAssignment_5()); 
            // InternalCinEditor.g:1261:2: ( rule__Text__PositionAssignment_5 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCinEditor.g:1261:3: rule__Text__PositionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__PositionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getPositionAssignment_5()); 

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
    // InternalCinEditor.g:1269:1: rule__Text__Group__6 : rule__Text__Group__6__Impl rule__Text__Group__7 ;
    public final void rule__Text__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1273:1: ( rule__Text__Group__6__Impl rule__Text__Group__7 )
            // InternalCinEditor.g:1274:2: rule__Text__Group__6__Impl rule__Text__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalCinEditor.g:1281:1: rule__Text__Group__6__Impl : ( 'at' ) ;
    public final void rule__Text__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1285:1: ( ( 'at' ) )
            // InternalCinEditor.g:1286:1: ( 'at' )
            {
            // InternalCinEditor.g:1286:1: ( 'at' )
            // InternalCinEditor.g:1287:2: 'at'
            {
             before(grammarAccess.getTextAccess().getAtKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getAtKeyword_6()); 

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
    // InternalCinEditor.g:1296:1: rule__Text__Group__7 : rule__Text__Group__7__Impl rule__Text__Group__8 ;
    public final void rule__Text__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1300:1: ( rule__Text__Group__7__Impl rule__Text__Group__8 )
            // InternalCinEditor.g:1301:2: rule__Text__Group__7__Impl rule__Text__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalCinEditor.g:1308:1: rule__Text__Group__7__Impl : ( ( rule__Text__BeginTimeAssignment_7 ) ) ;
    public final void rule__Text__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1312:1: ( ( ( rule__Text__BeginTimeAssignment_7 ) ) )
            // InternalCinEditor.g:1313:1: ( ( rule__Text__BeginTimeAssignment_7 ) )
            {
            // InternalCinEditor.g:1313:1: ( ( rule__Text__BeginTimeAssignment_7 ) )
            // InternalCinEditor.g:1314:2: ( rule__Text__BeginTimeAssignment_7 )
            {
             before(grammarAccess.getTextAccess().getBeginTimeAssignment_7()); 
            // InternalCinEditor.g:1315:2: ( rule__Text__BeginTimeAssignment_7 )
            // InternalCinEditor.g:1315:3: rule__Text__BeginTimeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Text__BeginTimeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getBeginTimeAssignment_7()); 

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
    // InternalCinEditor.g:1323:1: rule__Text__Group__8 : rule__Text__Group__8__Impl rule__Text__Group__9 ;
    public final void rule__Text__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1327:1: ( rule__Text__Group__8__Impl rule__Text__Group__9 )
            // InternalCinEditor.g:1328:2: rule__Text__Group__8__Impl rule__Text__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Text__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__9();

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
    // InternalCinEditor.g:1335:1: rule__Text__Group__8__Impl : ( 'during' ) ;
    public final void rule__Text__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1339:1: ( ( 'during' ) )
            // InternalCinEditor.g:1340:1: ( 'during' )
            {
            // InternalCinEditor.g:1340:1: ( 'during' )
            // InternalCinEditor.g:1341:2: 'during'
            {
             before(grammarAccess.getTextAccess().getDuringKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getDuringKeyword_8()); 

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


    // $ANTLR start "rule__Text__Group__9"
    // InternalCinEditor.g:1350:1: rule__Text__Group__9 : rule__Text__Group__9__Impl rule__Text__Group__10 ;
    public final void rule__Text__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1354:1: ( rule__Text__Group__9__Impl rule__Text__Group__10 )
            // InternalCinEditor.g:1355:2: rule__Text__Group__9__Impl rule__Text__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__Text__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__10();

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
    // $ANTLR end "rule__Text__Group__9"


    // $ANTLR start "rule__Text__Group__9__Impl"
    // InternalCinEditor.g:1362:1: rule__Text__Group__9__Impl : ( ( rule__Text__DurationAssignment_9 ) ) ;
    public final void rule__Text__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1366:1: ( ( ( rule__Text__DurationAssignment_9 ) ) )
            // InternalCinEditor.g:1367:1: ( ( rule__Text__DurationAssignment_9 ) )
            {
            // InternalCinEditor.g:1367:1: ( ( rule__Text__DurationAssignment_9 ) )
            // InternalCinEditor.g:1368:2: ( rule__Text__DurationAssignment_9 )
            {
             before(grammarAccess.getTextAccess().getDurationAssignment_9()); 
            // InternalCinEditor.g:1369:2: ( rule__Text__DurationAssignment_9 )
            // InternalCinEditor.g:1369:3: rule__Text__DurationAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Text__DurationAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getDurationAssignment_9()); 

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
    // $ANTLR end "rule__Text__Group__9__Impl"


    // $ANTLR start "rule__Text__Group__10"
    // InternalCinEditor.g:1377:1: rule__Text__Group__10 : rule__Text__Group__10__Impl ;
    public final void rule__Text__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1381:1: ( rule__Text__Group__10__Impl )
            // InternalCinEditor.g:1382:2: rule__Text__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__10__Impl();

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
    // $ANTLR end "rule__Text__Group__10"


    // $ANTLR start "rule__Text__Group__10__Impl"
    // InternalCinEditor.g:1388:1: rule__Text__Group__10__Impl : ( ( rule__Text__ColorAssignment_10 ) ) ;
    public final void rule__Text__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1392:1: ( ( ( rule__Text__ColorAssignment_10 ) ) )
            // InternalCinEditor.g:1393:1: ( ( rule__Text__ColorAssignment_10 ) )
            {
            // InternalCinEditor.g:1393:1: ( ( rule__Text__ColorAssignment_10 ) )
            // InternalCinEditor.g:1394:2: ( rule__Text__ColorAssignment_10 )
            {
             before(grammarAccess.getTextAccess().getColorAssignment_10()); 
            // InternalCinEditor.g:1395:2: ( rule__Text__ColorAssignment_10 )
            // InternalCinEditor.g:1395:3: rule__Text__ColorAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Text__ColorAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getColorAssignment_10()); 

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
    // $ANTLR end "rule__Text__Group__10__Impl"


    // $ANTLR start "rule__Text__Group_4__0"
    // InternalCinEditor.g:1404:1: rule__Text__Group_4__0 : rule__Text__Group_4__0__Impl rule__Text__Group_4__1 ;
    public final void rule__Text__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1408:1: ( rule__Text__Group_4__0__Impl rule__Text__Group_4__1 )
            // InternalCinEditor.g:1409:2: rule__Text__Group_4__0__Impl rule__Text__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Text__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_4__1();

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
    // $ANTLR end "rule__Text__Group_4__0"


    // $ANTLR start "rule__Text__Group_4__0__Impl"
    // InternalCinEditor.g:1416:1: rule__Text__Group_4__0__Impl : ( 'fontSize' ) ;
    public final void rule__Text__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1420:1: ( ( 'fontSize' ) )
            // InternalCinEditor.g:1421:1: ( 'fontSize' )
            {
            // InternalCinEditor.g:1421:1: ( 'fontSize' )
            // InternalCinEditor.g:1422:2: 'fontSize'
            {
             before(grammarAccess.getTextAccess().getFontSizeKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getFontSizeKeyword_4_0()); 

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
    // $ANTLR end "rule__Text__Group_4__0__Impl"


    // $ANTLR start "rule__Text__Group_4__1"
    // InternalCinEditor.g:1431:1: rule__Text__Group_4__1 : rule__Text__Group_4__1__Impl ;
    public final void rule__Text__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1435:1: ( rule__Text__Group_4__1__Impl )
            // InternalCinEditor.g:1436:2: rule__Text__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_4__1__Impl();

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
    // $ANTLR end "rule__Text__Group_4__1"


    // $ANTLR start "rule__Text__Group_4__1__Impl"
    // InternalCinEditor.g:1442:1: rule__Text__Group_4__1__Impl : ( ( rule__Text__FontSizeAssignment_4_1 ) ) ;
    public final void rule__Text__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1446:1: ( ( ( rule__Text__FontSizeAssignment_4_1 ) ) )
            // InternalCinEditor.g:1447:1: ( ( rule__Text__FontSizeAssignment_4_1 ) )
            {
            // InternalCinEditor.g:1447:1: ( ( rule__Text__FontSizeAssignment_4_1 ) )
            // InternalCinEditor.g:1448:2: ( rule__Text__FontSizeAssignment_4_1 )
            {
             before(grammarAccess.getTextAccess().getFontSizeAssignment_4_1()); 
            // InternalCinEditor.g:1449:2: ( rule__Text__FontSizeAssignment_4_1 )
            // InternalCinEditor.g:1449:3: rule__Text__FontSizeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__FontSizeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getFontSizeAssignment_4_1()); 

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
    // $ANTLR end "rule__Text__Group_4__1__Impl"


    // $ANTLR start "rule__Picture__Group__0"
    // InternalCinEditor.g:1458:1: rule__Picture__Group__0 : rule__Picture__Group__0__Impl rule__Picture__Group__1 ;
    public final void rule__Picture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1462:1: ( rule__Picture__Group__0__Impl rule__Picture__Group__1 )
            // InternalCinEditor.g:1463:2: rule__Picture__Group__0__Impl rule__Picture__Group__1
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
    // InternalCinEditor.g:1470:1: rule__Picture__Group__0__Impl : ( 'Picture' ) ;
    public final void rule__Picture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1474:1: ( ( 'Picture' ) )
            // InternalCinEditor.g:1475:1: ( 'Picture' )
            {
            // InternalCinEditor.g:1475:1: ( 'Picture' )
            // InternalCinEditor.g:1476:2: 'Picture'
            {
             before(grammarAccess.getPictureAccess().getPictureKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCinEditor.g:1485:1: rule__Picture__Group__1 : rule__Picture__Group__1__Impl rule__Picture__Group__2 ;
    public final void rule__Picture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1489:1: ( rule__Picture__Group__1__Impl rule__Picture__Group__2 )
            // InternalCinEditor.g:1490:2: rule__Picture__Group__1__Impl rule__Picture__Group__2
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
    // InternalCinEditor.g:1497:1: rule__Picture__Group__1__Impl : ( ( rule__Picture__NameAssignment_1 ) ) ;
    public final void rule__Picture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1501:1: ( ( ( rule__Picture__NameAssignment_1 ) ) )
            // InternalCinEditor.g:1502:1: ( ( rule__Picture__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:1502:1: ( ( rule__Picture__NameAssignment_1 ) )
            // InternalCinEditor.g:1503:2: ( rule__Picture__NameAssignment_1 )
            {
             before(grammarAccess.getPictureAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:1504:2: ( rule__Picture__NameAssignment_1 )
            // InternalCinEditor.g:1504:3: rule__Picture__NameAssignment_1
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
    // InternalCinEditor.g:1512:1: rule__Picture__Group__2 : rule__Picture__Group__2__Impl rule__Picture__Group__3 ;
    public final void rule__Picture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1516:1: ( rule__Picture__Group__2__Impl rule__Picture__Group__3 )
            // InternalCinEditor.g:1517:2: rule__Picture__Group__2__Impl rule__Picture__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:1524:1: rule__Picture__Group__2__Impl : ( '->' ) ;
    public final void rule__Picture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1528:1: ( ( '->' ) )
            // InternalCinEditor.g:1529:1: ( '->' )
            {
            // InternalCinEditor.g:1529:1: ( '->' )
            // InternalCinEditor.g:1530:2: '->'
            {
             before(grammarAccess.getPictureAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCinEditor.g:1539:1: rule__Picture__Group__3 : rule__Picture__Group__3__Impl rule__Picture__Group__4 ;
    public final void rule__Picture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1543:1: ( rule__Picture__Group__3__Impl rule__Picture__Group__4 )
            // InternalCinEditor.g:1544:2: rule__Picture__Group__3__Impl rule__Picture__Group__4
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
    // InternalCinEditor.g:1551:1: rule__Picture__Group__3__Impl : ( '\"' ) ;
    public final void rule__Picture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1555:1: ( ( '\"' ) )
            // InternalCinEditor.g:1556:1: ( '\"' )
            {
            // InternalCinEditor.g:1556:1: ( '\"' )
            // InternalCinEditor.g:1557:2: '\"'
            {
             before(grammarAccess.getPictureAccess().getQuotationMarkKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCinEditor.g:1566:1: rule__Picture__Group__4 : rule__Picture__Group__4__Impl rule__Picture__Group__5 ;
    public final void rule__Picture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1570:1: ( rule__Picture__Group__4__Impl rule__Picture__Group__5 )
            // InternalCinEditor.g:1571:2: rule__Picture__Group__4__Impl rule__Picture__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:1578:1: rule__Picture__Group__4__Impl : ( ( rule__Picture__UrlAssignment_4 ) ) ;
    public final void rule__Picture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1582:1: ( ( ( rule__Picture__UrlAssignment_4 ) ) )
            // InternalCinEditor.g:1583:1: ( ( rule__Picture__UrlAssignment_4 ) )
            {
            // InternalCinEditor.g:1583:1: ( ( rule__Picture__UrlAssignment_4 ) )
            // InternalCinEditor.g:1584:2: ( rule__Picture__UrlAssignment_4 )
            {
             before(grammarAccess.getPictureAccess().getUrlAssignment_4()); 
            // InternalCinEditor.g:1585:2: ( rule__Picture__UrlAssignment_4 )
            // InternalCinEditor.g:1585:3: rule__Picture__UrlAssignment_4
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
    // InternalCinEditor.g:1593:1: rule__Picture__Group__5 : rule__Picture__Group__5__Impl rule__Picture__Group__6 ;
    public final void rule__Picture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1597:1: ( rule__Picture__Group__5__Impl rule__Picture__Group__6 )
            // InternalCinEditor.g:1598:2: rule__Picture__Group__5__Impl rule__Picture__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:1605:1: rule__Picture__Group__5__Impl : ( '\"' ) ;
    public final void rule__Picture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1609:1: ( ( '\"' ) )
            // InternalCinEditor.g:1610:1: ( '\"' )
            {
            // InternalCinEditor.g:1610:1: ( '\"' )
            // InternalCinEditor.g:1611:2: '\"'
            {
             before(grammarAccess.getPictureAccess().getQuotationMarkKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCinEditor.g:1620:1: rule__Picture__Group__6 : rule__Picture__Group__6__Impl rule__Picture__Group__7 ;
    public final void rule__Picture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1624:1: ( rule__Picture__Group__6__Impl rule__Picture__Group__7 )
            // InternalCinEditor.g:1625:2: rule__Picture__Group__6__Impl rule__Picture__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:1632:1: rule__Picture__Group__6__Impl : ( ( rule__Picture__PositionAssignment_6 )? ) ;
    public final void rule__Picture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1636:1: ( ( ( rule__Picture__PositionAssignment_6 )? ) )
            // InternalCinEditor.g:1637:1: ( ( rule__Picture__PositionAssignment_6 )? )
            {
            // InternalCinEditor.g:1637:1: ( ( rule__Picture__PositionAssignment_6 )? )
            // InternalCinEditor.g:1638:2: ( rule__Picture__PositionAssignment_6 )?
            {
             before(grammarAccess.getPictureAccess().getPositionAssignment_6()); 
            // InternalCinEditor.g:1639:2: ( rule__Picture__PositionAssignment_6 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCinEditor.g:1639:3: rule__Picture__PositionAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__PositionAssignment_6();

                    state._fsp--;


                    }
                    break;

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
    // InternalCinEditor.g:1647:1: rule__Picture__Group__7 : rule__Picture__Group__7__Impl rule__Picture__Group__8 ;
    public final void rule__Picture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1651:1: ( rule__Picture__Group__7__Impl rule__Picture__Group__8 )
            // InternalCinEditor.g:1652:2: rule__Picture__Group__7__Impl rule__Picture__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:1659:1: rule__Picture__Group__7__Impl : ( ( rule__Picture__DimensionAssignment_7 )? ) ;
    public final void rule__Picture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1663:1: ( ( ( rule__Picture__DimensionAssignment_7 )? ) )
            // InternalCinEditor.g:1664:1: ( ( rule__Picture__DimensionAssignment_7 )? )
            {
            // InternalCinEditor.g:1664:1: ( ( rule__Picture__DimensionAssignment_7 )? )
            // InternalCinEditor.g:1665:2: ( rule__Picture__DimensionAssignment_7 )?
            {
             before(grammarAccess.getPictureAccess().getDimensionAssignment_7()); 
            // InternalCinEditor.g:1666:2: ( rule__Picture__DimensionAssignment_7 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCinEditor.g:1666:3: rule__Picture__DimensionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__DimensionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getDimensionAssignment_7()); 

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
    // InternalCinEditor.g:1674:1: rule__Picture__Group__8 : rule__Picture__Group__8__Impl rule__Picture__Group__9 ;
    public final void rule__Picture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1678:1: ( rule__Picture__Group__8__Impl rule__Picture__Group__9 )
            // InternalCinEditor.g:1679:2: rule__Picture__Group__8__Impl rule__Picture__Group__9
            {
            pushFollow(FOLLOW_10);
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
    // InternalCinEditor.g:1686:1: rule__Picture__Group__8__Impl : ( 'at' ) ;
    public final void rule__Picture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1690:1: ( ( 'at' ) )
            // InternalCinEditor.g:1691:1: ( 'at' )
            {
            // InternalCinEditor.g:1691:1: ( 'at' )
            // InternalCinEditor.g:1692:2: 'at'
            {
             before(grammarAccess.getPictureAccess().getAtKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getAtKeyword_8()); 

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
    // InternalCinEditor.g:1701:1: rule__Picture__Group__9 : rule__Picture__Group__9__Impl rule__Picture__Group__10 ;
    public final void rule__Picture__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1705:1: ( rule__Picture__Group__9__Impl rule__Picture__Group__10 )
            // InternalCinEditor.g:1706:2: rule__Picture__Group__9__Impl rule__Picture__Group__10
            {
            pushFollow(FOLLOW_16);
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
    // InternalCinEditor.g:1713:1: rule__Picture__Group__9__Impl : ( ( rule__Picture__BeginTimeAssignment_9 ) ) ;
    public final void rule__Picture__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1717:1: ( ( ( rule__Picture__BeginTimeAssignment_9 ) ) )
            // InternalCinEditor.g:1718:1: ( ( rule__Picture__BeginTimeAssignment_9 ) )
            {
            // InternalCinEditor.g:1718:1: ( ( rule__Picture__BeginTimeAssignment_9 ) )
            // InternalCinEditor.g:1719:2: ( rule__Picture__BeginTimeAssignment_9 )
            {
             before(grammarAccess.getPictureAccess().getBeginTimeAssignment_9()); 
            // InternalCinEditor.g:1720:2: ( rule__Picture__BeginTimeAssignment_9 )
            // InternalCinEditor.g:1720:3: rule__Picture__BeginTimeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Picture__BeginTimeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getBeginTimeAssignment_9()); 

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
    // InternalCinEditor.g:1728:1: rule__Picture__Group__10 : rule__Picture__Group__10__Impl rule__Picture__Group__11 ;
    public final void rule__Picture__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1732:1: ( rule__Picture__Group__10__Impl rule__Picture__Group__11 )
            // InternalCinEditor.g:1733:2: rule__Picture__Group__10__Impl rule__Picture__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Picture__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group__11();

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
    // InternalCinEditor.g:1740:1: rule__Picture__Group__10__Impl : ( 'during' ) ;
    public final void rule__Picture__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1744:1: ( ( 'during' ) )
            // InternalCinEditor.g:1745:1: ( 'during' )
            {
            // InternalCinEditor.g:1745:1: ( 'during' )
            // InternalCinEditor.g:1746:2: 'during'
            {
             before(grammarAccess.getPictureAccess().getDuringKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getDuringKeyword_10()); 

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


    // $ANTLR start "rule__Picture__Group__11"
    // InternalCinEditor.g:1755:1: rule__Picture__Group__11 : rule__Picture__Group__11__Impl ;
    public final void rule__Picture__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1759:1: ( rule__Picture__Group__11__Impl )
            // InternalCinEditor.g:1760:2: rule__Picture__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group__11__Impl();

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
    // $ANTLR end "rule__Picture__Group__11"


    // $ANTLR start "rule__Picture__Group__11__Impl"
    // InternalCinEditor.g:1766:1: rule__Picture__Group__11__Impl : ( ( rule__Picture__DurationAssignment_11 ) ) ;
    public final void rule__Picture__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1770:1: ( ( ( rule__Picture__DurationAssignment_11 ) ) )
            // InternalCinEditor.g:1771:1: ( ( rule__Picture__DurationAssignment_11 ) )
            {
            // InternalCinEditor.g:1771:1: ( ( rule__Picture__DurationAssignment_11 ) )
            // InternalCinEditor.g:1772:2: ( rule__Picture__DurationAssignment_11 )
            {
             before(grammarAccess.getPictureAccess().getDurationAssignment_11()); 
            // InternalCinEditor.g:1773:2: ( rule__Picture__DurationAssignment_11 )
            // InternalCinEditor.g:1773:3: rule__Picture__DurationAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Picture__DurationAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getDurationAssignment_11()); 

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
    // $ANTLR end "rule__Picture__Group__11__Impl"


    // $ANTLR start "rule__Video__Group__0"
    // InternalCinEditor.g:1782:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1786:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalCinEditor.g:1787:2: rule__Video__Group__0__Impl rule__Video__Group__1
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
    // InternalCinEditor.g:1794:1: rule__Video__Group__0__Impl : ( 'Video' ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1798:1: ( ( 'Video' ) )
            // InternalCinEditor.g:1799:1: ( 'Video' )
            {
            // InternalCinEditor.g:1799:1: ( 'Video' )
            // InternalCinEditor.g:1800:2: 'Video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCinEditor.g:1809:1: rule__Video__Group__1 : rule__Video__Group__1__Impl rule__Video__Group__2 ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1813:1: ( rule__Video__Group__1__Impl rule__Video__Group__2 )
            // InternalCinEditor.g:1814:2: rule__Video__Group__1__Impl rule__Video__Group__2
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
    // InternalCinEditor.g:1821:1: rule__Video__Group__1__Impl : ( ( rule__Video__NameAssignment_1 ) ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1825:1: ( ( ( rule__Video__NameAssignment_1 ) ) )
            // InternalCinEditor.g:1826:1: ( ( rule__Video__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:1826:1: ( ( rule__Video__NameAssignment_1 ) )
            // InternalCinEditor.g:1827:2: ( rule__Video__NameAssignment_1 )
            {
             before(grammarAccess.getVideoAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:1828:2: ( rule__Video__NameAssignment_1 )
            // InternalCinEditor.g:1828:3: rule__Video__NameAssignment_1
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
    // InternalCinEditor.g:1836:1: rule__Video__Group__2 : rule__Video__Group__2__Impl rule__Video__Group__3 ;
    public final void rule__Video__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1840:1: ( rule__Video__Group__2__Impl rule__Video__Group__3 )
            // InternalCinEditor.g:1841:2: rule__Video__Group__2__Impl rule__Video__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:1848:1: rule__Video__Group__2__Impl : ( '->' ) ;
    public final void rule__Video__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1852:1: ( ( '->' ) )
            // InternalCinEditor.g:1853:1: ( '->' )
            {
            // InternalCinEditor.g:1853:1: ( '->' )
            // InternalCinEditor.g:1854:2: '->'
            {
             before(grammarAccess.getVideoAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCinEditor.g:1863:1: rule__Video__Group__3 : rule__Video__Group__3__Impl rule__Video__Group__4 ;
    public final void rule__Video__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1867:1: ( rule__Video__Group__3__Impl rule__Video__Group__4 )
            // InternalCinEditor.g:1868:2: rule__Video__Group__3__Impl rule__Video__Group__4
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
    // InternalCinEditor.g:1875:1: rule__Video__Group__3__Impl : ( '\"' ) ;
    public final void rule__Video__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1879:1: ( ( '\"' ) )
            // InternalCinEditor.g:1880:1: ( '\"' )
            {
            // InternalCinEditor.g:1880:1: ( '\"' )
            // InternalCinEditor.g:1881:2: '\"'
            {
             before(grammarAccess.getVideoAccess().getQuotationMarkKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCinEditor.g:1890:1: rule__Video__Group__4 : rule__Video__Group__4__Impl rule__Video__Group__5 ;
    public final void rule__Video__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1894:1: ( rule__Video__Group__4__Impl rule__Video__Group__5 )
            // InternalCinEditor.g:1895:2: rule__Video__Group__4__Impl rule__Video__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:1902:1: rule__Video__Group__4__Impl : ( ( rule__Video__UrlAssignment_4 ) ) ;
    public final void rule__Video__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1906:1: ( ( ( rule__Video__UrlAssignment_4 ) ) )
            // InternalCinEditor.g:1907:1: ( ( rule__Video__UrlAssignment_4 ) )
            {
            // InternalCinEditor.g:1907:1: ( ( rule__Video__UrlAssignment_4 ) )
            // InternalCinEditor.g:1908:2: ( rule__Video__UrlAssignment_4 )
            {
             before(grammarAccess.getVideoAccess().getUrlAssignment_4()); 
            // InternalCinEditor.g:1909:2: ( rule__Video__UrlAssignment_4 )
            // InternalCinEditor.g:1909:3: rule__Video__UrlAssignment_4
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
    // InternalCinEditor.g:1917:1: rule__Video__Group__5 : rule__Video__Group__5__Impl rule__Video__Group__6 ;
    public final void rule__Video__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1921:1: ( rule__Video__Group__5__Impl rule__Video__Group__6 )
            // InternalCinEditor.g:1922:2: rule__Video__Group__5__Impl rule__Video__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:1929:1: rule__Video__Group__5__Impl : ( '\"' ) ;
    public final void rule__Video__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1933:1: ( ( '\"' ) )
            // InternalCinEditor.g:1934:1: ( '\"' )
            {
            // InternalCinEditor.g:1934:1: ( '\"' )
            // InternalCinEditor.g:1935:2: '\"'
            {
             before(grammarAccess.getVideoAccess().getQuotationMarkKeyword_5()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCinEditor.g:1944:1: rule__Video__Group__6 : rule__Video__Group__6__Impl rule__Video__Group__7 ;
    public final void rule__Video__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1948:1: ( rule__Video__Group__6__Impl rule__Video__Group__7 )
            // InternalCinEditor.g:1949:2: rule__Video__Group__6__Impl rule__Video__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalCinEditor.g:1956:1: rule__Video__Group__6__Impl : ( 'from' ) ;
    public final void rule__Video__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1960:1: ( ( 'from' ) )
            // InternalCinEditor.g:1961:1: ( 'from' )
            {
            // InternalCinEditor.g:1961:1: ( 'from' )
            // InternalCinEditor.g:1962:2: 'from'
            {
             before(grammarAccess.getVideoAccess().getFromKeyword_6()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCinEditor.g:1971:1: rule__Video__Group__7 : rule__Video__Group__7__Impl rule__Video__Group__8 ;
    public final void rule__Video__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1975:1: ( rule__Video__Group__7__Impl rule__Video__Group__8 )
            // InternalCinEditor.g:1976:2: rule__Video__Group__7__Impl rule__Video__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:1983:1: rule__Video__Group__7__Impl : ( ( rule__Video__BeginCropTimeAssignment_7 ) ) ;
    public final void rule__Video__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1987:1: ( ( ( rule__Video__BeginCropTimeAssignment_7 ) ) )
            // InternalCinEditor.g:1988:1: ( ( rule__Video__BeginCropTimeAssignment_7 ) )
            {
            // InternalCinEditor.g:1988:1: ( ( rule__Video__BeginCropTimeAssignment_7 ) )
            // InternalCinEditor.g:1989:2: ( rule__Video__BeginCropTimeAssignment_7 )
            {
             before(grammarAccess.getVideoAccess().getBeginCropTimeAssignment_7()); 
            // InternalCinEditor.g:1990:2: ( rule__Video__BeginCropTimeAssignment_7 )
            // InternalCinEditor.g:1990:3: rule__Video__BeginCropTimeAssignment_7
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
    // InternalCinEditor.g:1998:1: rule__Video__Group__8 : rule__Video__Group__8__Impl rule__Video__Group__9 ;
    public final void rule__Video__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2002:1: ( rule__Video__Group__8__Impl rule__Video__Group__9 )
            // InternalCinEditor.g:2003:2: rule__Video__Group__8__Impl rule__Video__Group__9
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:2010:1: rule__Video__Group__8__Impl : ( ( rule__Video__PositionAssignment_8 )? ) ;
    public final void rule__Video__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2014:1: ( ( ( rule__Video__PositionAssignment_8 )? ) )
            // InternalCinEditor.g:2015:1: ( ( rule__Video__PositionAssignment_8 )? )
            {
            // InternalCinEditor.g:2015:1: ( ( rule__Video__PositionAssignment_8 )? )
            // InternalCinEditor.g:2016:2: ( rule__Video__PositionAssignment_8 )?
            {
             before(grammarAccess.getVideoAccess().getPositionAssignment_8()); 
            // InternalCinEditor.g:2017:2: ( rule__Video__PositionAssignment_8 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCinEditor.g:2017:3: rule__Video__PositionAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__PositionAssignment_8();

                    state._fsp--;


                    }
                    break;

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
    // InternalCinEditor.g:2025:1: rule__Video__Group__9 : rule__Video__Group__9__Impl rule__Video__Group__10 ;
    public final void rule__Video__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2029:1: ( rule__Video__Group__9__Impl rule__Video__Group__10 )
            // InternalCinEditor.g:2030:2: rule__Video__Group__9__Impl rule__Video__Group__10
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:2037:1: rule__Video__Group__9__Impl : ( ( rule__Video__DimensionAssignment_9 )? ) ;
    public final void rule__Video__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2041:1: ( ( ( rule__Video__DimensionAssignment_9 )? ) )
            // InternalCinEditor.g:2042:1: ( ( rule__Video__DimensionAssignment_9 )? )
            {
            // InternalCinEditor.g:2042:1: ( ( rule__Video__DimensionAssignment_9 )? )
            // InternalCinEditor.g:2043:2: ( rule__Video__DimensionAssignment_9 )?
            {
             before(grammarAccess.getVideoAccess().getDimensionAssignment_9()); 
            // InternalCinEditor.g:2044:2: ( rule__Video__DimensionAssignment_9 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCinEditor.g:2044:3: rule__Video__DimensionAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__DimensionAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getDimensionAssignment_9()); 

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
    // InternalCinEditor.g:2052:1: rule__Video__Group__10 : rule__Video__Group__10__Impl rule__Video__Group__11 ;
    public final void rule__Video__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2056:1: ( rule__Video__Group__10__Impl rule__Video__Group__11 )
            // InternalCinEditor.g:2057:2: rule__Video__Group__10__Impl rule__Video__Group__11
            {
            pushFollow(FOLLOW_10);
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
    // InternalCinEditor.g:2064:1: rule__Video__Group__10__Impl : ( 'at' ) ;
    public final void rule__Video__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2068:1: ( ( 'at' ) )
            // InternalCinEditor.g:2069:1: ( 'at' )
            {
            // InternalCinEditor.g:2069:1: ( 'at' )
            // InternalCinEditor.g:2070:2: 'at'
            {
             before(grammarAccess.getVideoAccess().getAtKeyword_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getAtKeyword_10()); 

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
    // InternalCinEditor.g:2079:1: rule__Video__Group__11 : rule__Video__Group__11__Impl rule__Video__Group__12 ;
    public final void rule__Video__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2083:1: ( rule__Video__Group__11__Impl rule__Video__Group__12 )
            // InternalCinEditor.g:2084:2: rule__Video__Group__11__Impl rule__Video__Group__12
            {
            pushFollow(FOLLOW_16);
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
    // InternalCinEditor.g:2091:1: rule__Video__Group__11__Impl : ( ( rule__Video__BeginTimeAssignment_11 ) ) ;
    public final void rule__Video__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2095:1: ( ( ( rule__Video__BeginTimeAssignment_11 ) ) )
            // InternalCinEditor.g:2096:1: ( ( rule__Video__BeginTimeAssignment_11 ) )
            {
            // InternalCinEditor.g:2096:1: ( ( rule__Video__BeginTimeAssignment_11 ) )
            // InternalCinEditor.g:2097:2: ( rule__Video__BeginTimeAssignment_11 )
            {
             before(grammarAccess.getVideoAccess().getBeginTimeAssignment_11()); 
            // InternalCinEditor.g:2098:2: ( rule__Video__BeginTimeAssignment_11 )
            // InternalCinEditor.g:2098:3: rule__Video__BeginTimeAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Video__BeginTimeAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getBeginTimeAssignment_11()); 

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
    // InternalCinEditor.g:2106:1: rule__Video__Group__12 : rule__Video__Group__12__Impl rule__Video__Group__13 ;
    public final void rule__Video__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2110:1: ( rule__Video__Group__12__Impl rule__Video__Group__13 )
            // InternalCinEditor.g:2111:2: rule__Video__Group__12__Impl rule__Video__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__Video__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__13();

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
    // InternalCinEditor.g:2118:1: rule__Video__Group__12__Impl : ( 'during' ) ;
    public final void rule__Video__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2122:1: ( ( 'during' ) )
            // InternalCinEditor.g:2123:1: ( 'during' )
            {
            // InternalCinEditor.g:2123:1: ( 'during' )
            // InternalCinEditor.g:2124:2: 'during'
            {
             before(grammarAccess.getVideoAccess().getDuringKeyword_12()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getDuringKeyword_12()); 

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


    // $ANTLR start "rule__Video__Group__13"
    // InternalCinEditor.g:2133:1: rule__Video__Group__13 : rule__Video__Group__13__Impl ;
    public final void rule__Video__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2137:1: ( rule__Video__Group__13__Impl )
            // InternalCinEditor.g:2138:2: rule__Video__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__13__Impl();

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
    // $ANTLR end "rule__Video__Group__13"


    // $ANTLR start "rule__Video__Group__13__Impl"
    // InternalCinEditor.g:2144:1: rule__Video__Group__13__Impl : ( ( rule__Video__DurationAssignment_13 ) ) ;
    public final void rule__Video__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2148:1: ( ( ( rule__Video__DurationAssignment_13 ) ) )
            // InternalCinEditor.g:2149:1: ( ( rule__Video__DurationAssignment_13 ) )
            {
            // InternalCinEditor.g:2149:1: ( ( rule__Video__DurationAssignment_13 ) )
            // InternalCinEditor.g:2150:2: ( rule__Video__DurationAssignment_13 )
            {
             before(grammarAccess.getVideoAccess().getDurationAssignment_13()); 
            // InternalCinEditor.g:2151:2: ( rule__Video__DurationAssignment_13 )
            // InternalCinEditor.g:2151:3: rule__Video__DurationAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Video__DurationAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getDurationAssignment_13()); 

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
    // $ANTLR end "rule__Video__Group__13__Impl"


    // $ANTLR start "rule__FadeIn__Group__0"
    // InternalCinEditor.g:2160:1: rule__FadeIn__Group__0 : rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 ;
    public final void rule__FadeIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2164:1: ( rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 )
            // InternalCinEditor.g:2165:2: rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1
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
    // InternalCinEditor.g:2172:1: rule__FadeIn__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__FadeIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2176:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:2177:1: ( 'Effect' )
            {
            // InternalCinEditor.g:2177:1: ( 'Effect' )
            // InternalCinEditor.g:2178:2: 'Effect'
            {
             before(grammarAccess.getFadeInAccess().getEffectKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCinEditor.g:2187:1: rule__FadeIn__Group__1 : rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 ;
    public final void rule__FadeIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2191:1: ( rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 )
            // InternalCinEditor.g:2192:2: rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2
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
    // InternalCinEditor.g:2199:1: rule__FadeIn__Group__1__Impl : ( ( rule__FadeIn__NameAssignment_1 ) ) ;
    public final void rule__FadeIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2203:1: ( ( ( rule__FadeIn__NameAssignment_1 ) ) )
            // InternalCinEditor.g:2204:1: ( ( rule__FadeIn__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:2204:1: ( ( rule__FadeIn__NameAssignment_1 ) )
            // InternalCinEditor.g:2205:2: ( rule__FadeIn__NameAssignment_1 )
            {
             before(grammarAccess.getFadeInAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:2206:2: ( rule__FadeIn__NameAssignment_1 )
            // InternalCinEditor.g:2206:3: rule__FadeIn__NameAssignment_1
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
    // InternalCinEditor.g:2214:1: rule__FadeIn__Group__2 : rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 ;
    public final void rule__FadeIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2218:1: ( rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 )
            // InternalCinEditor.g:2219:2: rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:2226:1: rule__FadeIn__Group__2__Impl : ( '->' ) ;
    public final void rule__FadeIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2230:1: ( ( '->' ) )
            // InternalCinEditor.g:2231:1: ( '->' )
            {
            // InternalCinEditor.g:2231:1: ( '->' )
            // InternalCinEditor.g:2232:2: '->'
            {
             before(grammarAccess.getFadeInAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCinEditor.g:2241:1: rule__FadeIn__Group__3 : rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 ;
    public final void rule__FadeIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2245:1: ( rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 )
            // InternalCinEditor.g:2246:2: rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalCinEditor.g:2253:1: rule__FadeIn__Group__3__Impl : ( 'FadeIn' ) ;
    public final void rule__FadeIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2257:1: ( ( 'FadeIn' ) )
            // InternalCinEditor.g:2258:1: ( 'FadeIn' )
            {
            // InternalCinEditor.g:2258:1: ( 'FadeIn' )
            // InternalCinEditor.g:2259:2: 'FadeIn'
            {
             before(grammarAccess.getFadeInAccess().getFadeInKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCinEditor.g:2268:1: rule__FadeIn__Group__4 : rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5 ;
    public final void rule__FadeIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2272:1: ( rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5 )
            // InternalCinEditor.g:2273:2: rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalCinEditor.g:2280:1: rule__FadeIn__Group__4__Impl : ( 'during' ) ;
    public final void rule__FadeIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2284:1: ( ( 'during' ) )
            // InternalCinEditor.g:2285:1: ( 'during' )
            {
            // InternalCinEditor.g:2285:1: ( 'during' )
            // InternalCinEditor.g:2286:2: 'during'
            {
             before(grammarAccess.getFadeInAccess().getDuringKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getDuringKeyword_4()); 

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
    // InternalCinEditor.g:2295:1: rule__FadeIn__Group__5 : rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6 ;
    public final void rule__FadeIn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2299:1: ( rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6 )
            // InternalCinEditor.g:2300:2: rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:2307:1: rule__FadeIn__Group__5__Impl : ( ( rule__FadeIn__DurationAssignment_5 ) ) ;
    public final void rule__FadeIn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2311:1: ( ( ( rule__FadeIn__DurationAssignment_5 ) ) )
            // InternalCinEditor.g:2312:1: ( ( rule__FadeIn__DurationAssignment_5 ) )
            {
            // InternalCinEditor.g:2312:1: ( ( rule__FadeIn__DurationAssignment_5 ) )
            // InternalCinEditor.g:2313:2: ( rule__FadeIn__DurationAssignment_5 )
            {
             before(grammarAccess.getFadeInAccess().getDurationAssignment_5()); 
            // InternalCinEditor.g:2314:2: ( rule__FadeIn__DurationAssignment_5 )
            // InternalCinEditor.g:2314:3: rule__FadeIn__DurationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__DurationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFadeInAccess().getDurationAssignment_5()); 

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
    // InternalCinEditor.g:2322:1: rule__FadeIn__Group__6 : rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7 ;
    public final void rule__FadeIn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2326:1: ( rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7 )
            // InternalCinEditor.g:2327:2: rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalCinEditor.g:2334:1: rule__FadeIn__Group__6__Impl : ( 'on' ) ;
    public final void rule__FadeIn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2338:1: ( ( 'on' ) )
            // InternalCinEditor.g:2339:1: ( 'on' )
            {
            // InternalCinEditor.g:2339:1: ( 'on' )
            // InternalCinEditor.g:2340:2: 'on'
            {
             before(grammarAccess.getFadeInAccess().getOnKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getOnKeyword_6()); 

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
    // InternalCinEditor.g:2349:1: rule__FadeIn__Group__7 : rule__FadeIn__Group__7__Impl ;
    public final void rule__FadeIn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2353:1: ( rule__FadeIn__Group__7__Impl )
            // InternalCinEditor.g:2354:2: rule__FadeIn__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__7__Impl();

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
    // InternalCinEditor.g:2360:1: rule__FadeIn__Group__7__Impl : ( ( rule__FadeIn__ElementAssignment_7 ) ) ;
    public final void rule__FadeIn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2364:1: ( ( ( rule__FadeIn__ElementAssignment_7 ) ) )
            // InternalCinEditor.g:2365:1: ( ( rule__FadeIn__ElementAssignment_7 ) )
            {
            // InternalCinEditor.g:2365:1: ( ( rule__FadeIn__ElementAssignment_7 ) )
            // InternalCinEditor.g:2366:2: ( rule__FadeIn__ElementAssignment_7 )
            {
             before(grammarAccess.getFadeInAccess().getElementAssignment_7()); 
            // InternalCinEditor.g:2367:2: ( rule__FadeIn__ElementAssignment_7 )
            // InternalCinEditor.g:2367:3: rule__FadeIn__ElementAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__ElementAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFadeInAccess().getElementAssignment_7()); 

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


    // $ANTLR start "rule__FadeOut__Group__0"
    // InternalCinEditor.g:2376:1: rule__FadeOut__Group__0 : rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 ;
    public final void rule__FadeOut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2380:1: ( rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 )
            // InternalCinEditor.g:2381:2: rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1
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
    // InternalCinEditor.g:2388:1: rule__FadeOut__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__FadeOut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2392:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:2393:1: ( 'Effect' )
            {
            // InternalCinEditor.g:2393:1: ( 'Effect' )
            // InternalCinEditor.g:2394:2: 'Effect'
            {
             before(grammarAccess.getFadeOutAccess().getEffectKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCinEditor.g:2403:1: rule__FadeOut__Group__1 : rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 ;
    public final void rule__FadeOut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2407:1: ( rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 )
            // InternalCinEditor.g:2408:2: rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2
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
    // InternalCinEditor.g:2415:1: rule__FadeOut__Group__1__Impl : ( ( rule__FadeOut__NameAssignment_1 ) ) ;
    public final void rule__FadeOut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2419:1: ( ( ( rule__FadeOut__NameAssignment_1 ) ) )
            // InternalCinEditor.g:2420:1: ( ( rule__FadeOut__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:2420:1: ( ( rule__FadeOut__NameAssignment_1 ) )
            // InternalCinEditor.g:2421:2: ( rule__FadeOut__NameAssignment_1 )
            {
             before(grammarAccess.getFadeOutAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:2422:2: ( rule__FadeOut__NameAssignment_1 )
            // InternalCinEditor.g:2422:3: rule__FadeOut__NameAssignment_1
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
    // InternalCinEditor.g:2430:1: rule__FadeOut__Group__2 : rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 ;
    public final void rule__FadeOut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2434:1: ( rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 )
            // InternalCinEditor.g:2435:2: rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalCinEditor.g:2442:1: rule__FadeOut__Group__2__Impl : ( '->' ) ;
    public final void rule__FadeOut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2446:1: ( ( '->' ) )
            // InternalCinEditor.g:2447:1: ( '->' )
            {
            // InternalCinEditor.g:2447:1: ( '->' )
            // InternalCinEditor.g:2448:2: '->'
            {
             before(grammarAccess.getFadeOutAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCinEditor.g:2457:1: rule__FadeOut__Group__3 : rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 ;
    public final void rule__FadeOut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2461:1: ( rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 )
            // InternalCinEditor.g:2462:2: rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalCinEditor.g:2469:1: rule__FadeOut__Group__3__Impl : ( 'FadeOut' ) ;
    public final void rule__FadeOut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2473:1: ( ( 'FadeOut' ) )
            // InternalCinEditor.g:2474:1: ( 'FadeOut' )
            {
            // InternalCinEditor.g:2474:1: ( 'FadeOut' )
            // InternalCinEditor.g:2475:2: 'FadeOut'
            {
             before(grammarAccess.getFadeOutAccess().getFadeOutKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCinEditor.g:2484:1: rule__FadeOut__Group__4 : rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5 ;
    public final void rule__FadeOut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2488:1: ( rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5 )
            // InternalCinEditor.g:2489:2: rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalCinEditor.g:2496:1: rule__FadeOut__Group__4__Impl : ( 'during' ) ;
    public final void rule__FadeOut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2500:1: ( ( 'during' ) )
            // InternalCinEditor.g:2501:1: ( 'during' )
            {
            // InternalCinEditor.g:2501:1: ( 'during' )
            // InternalCinEditor.g:2502:2: 'during'
            {
             before(grammarAccess.getFadeOutAccess().getDuringKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getDuringKeyword_4()); 

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
    // InternalCinEditor.g:2511:1: rule__FadeOut__Group__5 : rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6 ;
    public final void rule__FadeOut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2515:1: ( rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6 )
            // InternalCinEditor.g:2516:2: rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:2523:1: rule__FadeOut__Group__5__Impl : ( ( rule__FadeOut__DurationAssignment_5 ) ) ;
    public final void rule__FadeOut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2527:1: ( ( ( rule__FadeOut__DurationAssignment_5 ) ) )
            // InternalCinEditor.g:2528:1: ( ( rule__FadeOut__DurationAssignment_5 ) )
            {
            // InternalCinEditor.g:2528:1: ( ( rule__FadeOut__DurationAssignment_5 ) )
            // InternalCinEditor.g:2529:2: ( rule__FadeOut__DurationAssignment_5 )
            {
             before(grammarAccess.getFadeOutAccess().getDurationAssignment_5()); 
            // InternalCinEditor.g:2530:2: ( rule__FadeOut__DurationAssignment_5 )
            // InternalCinEditor.g:2530:3: rule__FadeOut__DurationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__DurationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFadeOutAccess().getDurationAssignment_5()); 

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
    // InternalCinEditor.g:2538:1: rule__FadeOut__Group__6 : rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7 ;
    public final void rule__FadeOut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2542:1: ( rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7 )
            // InternalCinEditor.g:2543:2: rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalCinEditor.g:2550:1: rule__FadeOut__Group__6__Impl : ( 'on' ) ;
    public final void rule__FadeOut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2554:1: ( ( 'on' ) )
            // InternalCinEditor.g:2555:1: ( 'on' )
            {
            // InternalCinEditor.g:2555:1: ( 'on' )
            // InternalCinEditor.g:2556:2: 'on'
            {
             before(grammarAccess.getFadeOutAccess().getOnKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getOnKeyword_6()); 

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
    // InternalCinEditor.g:2565:1: rule__FadeOut__Group__7 : rule__FadeOut__Group__7__Impl ;
    public final void rule__FadeOut__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2569:1: ( rule__FadeOut__Group__7__Impl )
            // InternalCinEditor.g:2570:2: rule__FadeOut__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__7__Impl();

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
    // InternalCinEditor.g:2576:1: rule__FadeOut__Group__7__Impl : ( ( rule__FadeOut__ElementAssignment_7 ) ) ;
    public final void rule__FadeOut__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2580:1: ( ( ( rule__FadeOut__ElementAssignment_7 ) ) )
            // InternalCinEditor.g:2581:1: ( ( rule__FadeOut__ElementAssignment_7 ) )
            {
            // InternalCinEditor.g:2581:1: ( ( rule__FadeOut__ElementAssignment_7 ) )
            // InternalCinEditor.g:2582:2: ( rule__FadeOut__ElementAssignment_7 )
            {
             before(grammarAccess.getFadeOutAccess().getElementAssignment_7()); 
            // InternalCinEditor.g:2583:2: ( rule__FadeOut__ElementAssignment_7 )
            // InternalCinEditor.g:2583:3: rule__FadeOut__ElementAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__ElementAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFadeOutAccess().getElementAssignment_7()); 

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


    // $ANTLR start "rule__Translate__Group__0"
    // InternalCinEditor.g:2592:1: rule__Translate__Group__0 : rule__Translate__Group__0__Impl rule__Translate__Group__1 ;
    public final void rule__Translate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2596:1: ( rule__Translate__Group__0__Impl rule__Translate__Group__1 )
            // InternalCinEditor.g:2597:2: rule__Translate__Group__0__Impl rule__Translate__Group__1
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
    // InternalCinEditor.g:2604:1: rule__Translate__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__Translate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2608:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:2609:1: ( 'Effect' )
            {
            // InternalCinEditor.g:2609:1: ( 'Effect' )
            // InternalCinEditor.g:2610:2: 'Effect'
            {
             before(grammarAccess.getTranslateAccess().getEffectKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCinEditor.g:2619:1: rule__Translate__Group__1 : rule__Translate__Group__1__Impl rule__Translate__Group__2 ;
    public final void rule__Translate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2623:1: ( rule__Translate__Group__1__Impl rule__Translate__Group__2 )
            // InternalCinEditor.g:2624:2: rule__Translate__Group__1__Impl rule__Translate__Group__2
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
    // InternalCinEditor.g:2631:1: rule__Translate__Group__1__Impl : ( ( rule__Translate__NameAssignment_1 ) ) ;
    public final void rule__Translate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2635:1: ( ( ( rule__Translate__NameAssignment_1 ) ) )
            // InternalCinEditor.g:2636:1: ( ( rule__Translate__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:2636:1: ( ( rule__Translate__NameAssignment_1 ) )
            // InternalCinEditor.g:2637:2: ( rule__Translate__NameAssignment_1 )
            {
             before(grammarAccess.getTranslateAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:2638:2: ( rule__Translate__NameAssignment_1 )
            // InternalCinEditor.g:2638:3: rule__Translate__NameAssignment_1
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
    // InternalCinEditor.g:2646:1: rule__Translate__Group__2 : rule__Translate__Group__2__Impl rule__Translate__Group__3 ;
    public final void rule__Translate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2650:1: ( rule__Translate__Group__2__Impl rule__Translate__Group__3 )
            // InternalCinEditor.g:2651:2: rule__Translate__Group__2__Impl rule__Translate__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:2658:1: rule__Translate__Group__2__Impl : ( '->' ) ;
    public final void rule__Translate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2662:1: ( ( '->' ) )
            // InternalCinEditor.g:2663:1: ( '->' )
            {
            // InternalCinEditor.g:2663:1: ( '->' )
            // InternalCinEditor.g:2664:2: '->'
            {
             before(grammarAccess.getTranslateAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCinEditor.g:2673:1: rule__Translate__Group__3 : rule__Translate__Group__3__Impl rule__Translate__Group__4 ;
    public final void rule__Translate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2677:1: ( rule__Translate__Group__3__Impl rule__Translate__Group__4 )
            // InternalCinEditor.g:2678:2: rule__Translate__Group__3__Impl rule__Translate__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalCinEditor.g:2685:1: rule__Translate__Group__3__Impl : ( 'Translate' ) ;
    public final void rule__Translate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2689:1: ( ( 'Translate' ) )
            // InternalCinEditor.g:2690:1: ( 'Translate' )
            {
            // InternalCinEditor.g:2690:1: ( 'Translate' )
            // InternalCinEditor.g:2691:2: 'Translate'
            {
             before(grammarAccess.getTranslateAccess().getTranslateKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCinEditor.g:2700:1: rule__Translate__Group__4 : rule__Translate__Group__4__Impl rule__Translate__Group__5 ;
    public final void rule__Translate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2704:1: ( rule__Translate__Group__4__Impl rule__Translate__Group__5 )
            // InternalCinEditor.g:2705:2: rule__Translate__Group__4__Impl rule__Translate__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalCinEditor.g:2712:1: rule__Translate__Group__4__Impl : ( '(' ) ;
    public final void rule__Translate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2716:1: ( ( '(' ) )
            // InternalCinEditor.g:2717:1: ( '(' )
            {
            // InternalCinEditor.g:2717:1: ( '(' )
            // InternalCinEditor.g:2718:2: '('
            {
             before(grammarAccess.getTranslateAccess().getLeftParenthesisKeyword_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalCinEditor.g:2727:1: rule__Translate__Group__5 : rule__Translate__Group__5__Impl rule__Translate__Group__6 ;
    public final void rule__Translate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2731:1: ( rule__Translate__Group__5__Impl rule__Translate__Group__6 )
            // InternalCinEditor.g:2732:2: rule__Translate__Group__5__Impl rule__Translate__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalCinEditor.g:2739:1: rule__Translate__Group__5__Impl : ( ( rule__Translate__PixelsToTranslateHorizontallyAssignment_5 ) ) ;
    public final void rule__Translate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2743:1: ( ( ( rule__Translate__PixelsToTranslateHorizontallyAssignment_5 ) ) )
            // InternalCinEditor.g:2744:1: ( ( rule__Translate__PixelsToTranslateHorizontallyAssignment_5 ) )
            {
            // InternalCinEditor.g:2744:1: ( ( rule__Translate__PixelsToTranslateHorizontallyAssignment_5 ) )
            // InternalCinEditor.g:2745:2: ( rule__Translate__PixelsToTranslateHorizontallyAssignment_5 )
            {
             before(grammarAccess.getTranslateAccess().getPixelsToTranslateHorizontallyAssignment_5()); 
            // InternalCinEditor.g:2746:2: ( rule__Translate__PixelsToTranslateHorizontallyAssignment_5 )
            // InternalCinEditor.g:2746:3: rule__Translate__PixelsToTranslateHorizontallyAssignment_5
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
    // InternalCinEditor.g:2754:1: rule__Translate__Group__6 : rule__Translate__Group__6__Impl rule__Translate__Group__7 ;
    public final void rule__Translate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2758:1: ( rule__Translate__Group__6__Impl rule__Translate__Group__7 )
            // InternalCinEditor.g:2759:2: rule__Translate__Group__6__Impl rule__Translate__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalCinEditor.g:2766:1: rule__Translate__Group__6__Impl : ( ',' ) ;
    public final void rule__Translate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2770:1: ( ( ',' ) )
            // InternalCinEditor.g:2771:1: ( ',' )
            {
            // InternalCinEditor.g:2771:1: ( ',' )
            // InternalCinEditor.g:2772:2: ','
            {
             before(grammarAccess.getTranslateAccess().getCommaKeyword_6()); 
            match(input,15,FOLLOW_2); 
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
    // InternalCinEditor.g:2781:1: rule__Translate__Group__7 : rule__Translate__Group__7__Impl rule__Translate__Group__8 ;
    public final void rule__Translate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2785:1: ( rule__Translate__Group__7__Impl rule__Translate__Group__8 )
            // InternalCinEditor.g:2786:2: rule__Translate__Group__7__Impl rule__Translate__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalCinEditor.g:2793:1: rule__Translate__Group__7__Impl : ( ( rule__Translate__PixelsToTranslateVerticallyAssignment_7 ) ) ;
    public final void rule__Translate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2797:1: ( ( ( rule__Translate__PixelsToTranslateVerticallyAssignment_7 ) ) )
            // InternalCinEditor.g:2798:1: ( ( rule__Translate__PixelsToTranslateVerticallyAssignment_7 ) )
            {
            // InternalCinEditor.g:2798:1: ( ( rule__Translate__PixelsToTranslateVerticallyAssignment_7 ) )
            // InternalCinEditor.g:2799:2: ( rule__Translate__PixelsToTranslateVerticallyAssignment_7 )
            {
             before(grammarAccess.getTranslateAccess().getPixelsToTranslateVerticallyAssignment_7()); 
            // InternalCinEditor.g:2800:2: ( rule__Translate__PixelsToTranslateVerticallyAssignment_7 )
            // InternalCinEditor.g:2800:3: rule__Translate__PixelsToTranslateVerticallyAssignment_7
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
    // InternalCinEditor.g:2808:1: rule__Translate__Group__8 : rule__Translate__Group__8__Impl rule__Translate__Group__9 ;
    public final void rule__Translate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2812:1: ( rule__Translate__Group__8__Impl rule__Translate__Group__9 )
            // InternalCinEditor.g:2813:2: rule__Translate__Group__8__Impl rule__Translate__Group__9
            {
            pushFollow(FOLLOW_26);
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
    // InternalCinEditor.g:2820:1: rule__Translate__Group__8__Impl : ( ')' ) ;
    public final void rule__Translate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2824:1: ( ( ')' ) )
            // InternalCinEditor.g:2825:1: ( ')' )
            {
            // InternalCinEditor.g:2825:1: ( ')' )
            // InternalCinEditor.g:2826:2: ')'
            {
             before(grammarAccess.getTranslateAccess().getRightParenthesisKeyword_8()); 
            match(input,16,FOLLOW_2); 
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
    // InternalCinEditor.g:2835:1: rule__Translate__Group__9 : rule__Translate__Group__9__Impl rule__Translate__Group__10 ;
    public final void rule__Translate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2839:1: ( rule__Translate__Group__9__Impl rule__Translate__Group__10 )
            // InternalCinEditor.g:2840:2: rule__Translate__Group__9__Impl rule__Translate__Group__10
            {
            pushFollow(FOLLOW_10);
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
    // InternalCinEditor.g:2847:1: rule__Translate__Group__9__Impl : ( 'at' ) ;
    public final void rule__Translate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2851:1: ( ( 'at' ) )
            // InternalCinEditor.g:2852:1: ( 'at' )
            {
            // InternalCinEditor.g:2852:1: ( 'at' )
            // InternalCinEditor.g:2853:2: 'at'
            {
             before(grammarAccess.getTranslateAccess().getAtKeyword_9()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCinEditor.g:2862:1: rule__Translate__Group__10 : rule__Translate__Group__10__Impl rule__Translate__Group__11 ;
    public final void rule__Translate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2866:1: ( rule__Translate__Group__10__Impl rule__Translate__Group__11 )
            // InternalCinEditor.g:2867:2: rule__Translate__Group__10__Impl rule__Translate__Group__11
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
    // InternalCinEditor.g:2874:1: rule__Translate__Group__10__Impl : ( ( rule__Translate__BeginTimeAssignment_10 ) ) ;
    public final void rule__Translate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2878:1: ( ( ( rule__Translate__BeginTimeAssignment_10 ) ) )
            // InternalCinEditor.g:2879:1: ( ( rule__Translate__BeginTimeAssignment_10 ) )
            {
            // InternalCinEditor.g:2879:1: ( ( rule__Translate__BeginTimeAssignment_10 ) )
            // InternalCinEditor.g:2880:2: ( rule__Translate__BeginTimeAssignment_10 )
            {
             before(grammarAccess.getTranslateAccess().getBeginTimeAssignment_10()); 
            // InternalCinEditor.g:2881:2: ( rule__Translate__BeginTimeAssignment_10 )
            // InternalCinEditor.g:2881:3: rule__Translate__BeginTimeAssignment_10
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
    // InternalCinEditor.g:2889:1: rule__Translate__Group__11 : rule__Translate__Group__11__Impl rule__Translate__Group__12 ;
    public final void rule__Translate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2893:1: ( rule__Translate__Group__11__Impl rule__Translate__Group__12 )
            // InternalCinEditor.g:2894:2: rule__Translate__Group__11__Impl rule__Translate__Group__12
            {
            pushFollow(FOLLOW_10);
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
    // InternalCinEditor.g:2901:1: rule__Translate__Group__11__Impl : ( 'during' ) ;
    public final void rule__Translate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2905:1: ( ( 'during' ) )
            // InternalCinEditor.g:2906:1: ( 'during' )
            {
            // InternalCinEditor.g:2906:1: ( 'during' )
            // InternalCinEditor.g:2907:2: 'during'
            {
             before(grammarAccess.getTranslateAccess().getDuringKeyword_11()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCinEditor.g:2916:1: rule__Translate__Group__12 : rule__Translate__Group__12__Impl rule__Translate__Group__13 ;
    public final void rule__Translate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2920:1: ( rule__Translate__Group__12__Impl rule__Translate__Group__13 )
            // InternalCinEditor.g:2921:2: rule__Translate__Group__12__Impl rule__Translate__Group__13
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:2928:1: rule__Translate__Group__12__Impl : ( ( rule__Translate__DurationAssignment_12 ) ) ;
    public final void rule__Translate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2932:1: ( ( ( rule__Translate__DurationAssignment_12 ) ) )
            // InternalCinEditor.g:2933:1: ( ( rule__Translate__DurationAssignment_12 ) )
            {
            // InternalCinEditor.g:2933:1: ( ( rule__Translate__DurationAssignment_12 ) )
            // InternalCinEditor.g:2934:2: ( rule__Translate__DurationAssignment_12 )
            {
             before(grammarAccess.getTranslateAccess().getDurationAssignment_12()); 
            // InternalCinEditor.g:2935:2: ( rule__Translate__DurationAssignment_12 )
            // InternalCinEditor.g:2935:3: rule__Translate__DurationAssignment_12
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
    // InternalCinEditor.g:2943:1: rule__Translate__Group__13 : rule__Translate__Group__13__Impl rule__Translate__Group__14 ;
    public final void rule__Translate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2947:1: ( rule__Translate__Group__13__Impl rule__Translate__Group__14 )
            // InternalCinEditor.g:2948:2: rule__Translate__Group__13__Impl rule__Translate__Group__14
            {
            pushFollow(FOLLOW_23);
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
    // InternalCinEditor.g:2955:1: rule__Translate__Group__13__Impl : ( 'on' ) ;
    public final void rule__Translate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2959:1: ( ( 'on' ) )
            // InternalCinEditor.g:2960:1: ( 'on' )
            {
            // InternalCinEditor.g:2960:1: ( 'on' )
            // InternalCinEditor.g:2961:2: 'on'
            {
             before(grammarAccess.getTranslateAccess().getOnKeyword_13()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCinEditor.g:2970:1: rule__Translate__Group__14 : rule__Translate__Group__14__Impl ;
    public final void rule__Translate__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2974:1: ( rule__Translate__Group__14__Impl )
            // InternalCinEditor.g:2975:2: rule__Translate__Group__14__Impl
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
    // InternalCinEditor.g:2981:1: rule__Translate__Group__14__Impl : ( ( rule__Translate__ElementAssignment_14 ) ) ;
    public final void rule__Translate__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2985:1: ( ( ( rule__Translate__ElementAssignment_14 ) ) )
            // InternalCinEditor.g:2986:1: ( ( rule__Translate__ElementAssignment_14 ) )
            {
            // InternalCinEditor.g:2986:1: ( ( rule__Translate__ElementAssignment_14 ) )
            // InternalCinEditor.g:2987:2: ( rule__Translate__ElementAssignment_14 )
            {
             before(grammarAccess.getTranslateAccess().getElementAssignment_14()); 
            // InternalCinEditor.g:2988:2: ( rule__Translate__ElementAssignment_14 )
            // InternalCinEditor.g:2988:3: rule__Translate__ElementAssignment_14
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
    // InternalCinEditor.g:2997:1: rule__Rectangle__Group__0 : rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 ;
    public final void rule__Rectangle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3001:1: ( rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 )
            // InternalCinEditor.g:3002:2: rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1
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
    // InternalCinEditor.g:3009:1: rule__Rectangle__Group__0__Impl : ( 'Rectangle' ) ;
    public final void rule__Rectangle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3013:1: ( ( 'Rectangle' ) )
            // InternalCinEditor.g:3014:1: ( 'Rectangle' )
            {
            // InternalCinEditor.g:3014:1: ( 'Rectangle' )
            // InternalCinEditor.g:3015:2: 'Rectangle'
            {
             before(grammarAccess.getRectangleAccess().getRectangleKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCinEditor.g:3024:1: rule__Rectangle__Group__1 : rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 ;
    public final void rule__Rectangle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3028:1: ( rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 )
            // InternalCinEditor.g:3029:2: rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2
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
    // InternalCinEditor.g:3036:1: rule__Rectangle__Group__1__Impl : ( ( rule__Rectangle__NameAssignment_1 ) ) ;
    public final void rule__Rectangle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3040:1: ( ( ( rule__Rectangle__NameAssignment_1 ) ) )
            // InternalCinEditor.g:3041:1: ( ( rule__Rectangle__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:3041:1: ( ( rule__Rectangle__NameAssignment_1 ) )
            // InternalCinEditor.g:3042:2: ( rule__Rectangle__NameAssignment_1 )
            {
             before(grammarAccess.getRectangleAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:3043:2: ( rule__Rectangle__NameAssignment_1 )
            // InternalCinEditor.g:3043:3: rule__Rectangle__NameAssignment_1
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
    // InternalCinEditor.g:3051:1: rule__Rectangle__Group__2 : rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 ;
    public final void rule__Rectangle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3055:1: ( rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 )
            // InternalCinEditor.g:3056:2: rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalCinEditor.g:3063:1: rule__Rectangle__Group__2__Impl : ( '->' ) ;
    public final void rule__Rectangle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3067:1: ( ( '->' ) )
            // InternalCinEditor.g:3068:1: ( '->' )
            {
            // InternalCinEditor.g:3068:1: ( '->' )
            // InternalCinEditor.g:3069:2: '->'
            {
             before(grammarAccess.getRectangleAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCinEditor.g:3078:1: rule__Rectangle__Group__3 : rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 ;
    public final void rule__Rectangle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3082:1: ( rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 )
            // InternalCinEditor.g:3083:2: rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:3090:1: rule__Rectangle__Group__3__Impl : ( ( rule__Rectangle__ColorAssignment_3 ) ) ;
    public final void rule__Rectangle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3094:1: ( ( ( rule__Rectangle__ColorAssignment_3 ) ) )
            // InternalCinEditor.g:3095:1: ( ( rule__Rectangle__ColorAssignment_3 ) )
            {
            // InternalCinEditor.g:3095:1: ( ( rule__Rectangle__ColorAssignment_3 ) )
            // InternalCinEditor.g:3096:2: ( rule__Rectangle__ColorAssignment_3 )
            {
             before(grammarAccess.getRectangleAccess().getColorAssignment_3()); 
            // InternalCinEditor.g:3097:2: ( rule__Rectangle__ColorAssignment_3 )
            // InternalCinEditor.g:3097:3: rule__Rectangle__ColorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__ColorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getColorAssignment_3()); 

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
    // InternalCinEditor.g:3105:1: rule__Rectangle__Group__4 : rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 ;
    public final void rule__Rectangle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3109:1: ( rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 )
            // InternalCinEditor.g:3110:2: rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:3117:1: rule__Rectangle__Group__4__Impl : ( ( rule__Rectangle__PositionAssignment_4 )? ) ;
    public final void rule__Rectangle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3121:1: ( ( ( rule__Rectangle__PositionAssignment_4 )? ) )
            // InternalCinEditor.g:3122:1: ( ( rule__Rectangle__PositionAssignment_4 )? )
            {
            // InternalCinEditor.g:3122:1: ( ( rule__Rectangle__PositionAssignment_4 )? )
            // InternalCinEditor.g:3123:2: ( rule__Rectangle__PositionAssignment_4 )?
            {
             before(grammarAccess.getRectangleAccess().getPositionAssignment_4()); 
            // InternalCinEditor.g:3124:2: ( rule__Rectangle__PositionAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCinEditor.g:3124:3: rule__Rectangle__PositionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rectangle__PositionAssignment_4();

                    state._fsp--;


                    }
                    break;

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
    // InternalCinEditor.g:3132:1: rule__Rectangle__Group__5 : rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 ;
    public final void rule__Rectangle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3136:1: ( rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 )
            // InternalCinEditor.g:3137:2: rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:3144:1: rule__Rectangle__Group__5__Impl : ( ( rule__Rectangle__DimensionAssignment_5 )? ) ;
    public final void rule__Rectangle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3148:1: ( ( ( rule__Rectangle__DimensionAssignment_5 )? ) )
            // InternalCinEditor.g:3149:1: ( ( rule__Rectangle__DimensionAssignment_5 )? )
            {
            // InternalCinEditor.g:3149:1: ( ( rule__Rectangle__DimensionAssignment_5 )? )
            // InternalCinEditor.g:3150:2: ( rule__Rectangle__DimensionAssignment_5 )?
            {
             before(grammarAccess.getRectangleAccess().getDimensionAssignment_5()); 
            // InternalCinEditor.g:3151:2: ( rule__Rectangle__DimensionAssignment_5 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCinEditor.g:3151:3: rule__Rectangle__DimensionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rectangle__DimensionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRectangleAccess().getDimensionAssignment_5()); 

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
    // InternalCinEditor.g:3159:1: rule__Rectangle__Group__6 : rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 ;
    public final void rule__Rectangle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3163:1: ( rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 )
            // InternalCinEditor.g:3164:2: rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalCinEditor.g:3171:1: rule__Rectangle__Group__6__Impl : ( 'at' ) ;
    public final void rule__Rectangle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3175:1: ( ( 'at' ) )
            // InternalCinEditor.g:3176:1: ( 'at' )
            {
            // InternalCinEditor.g:3176:1: ( 'at' )
            // InternalCinEditor.g:3177:2: 'at'
            {
             before(grammarAccess.getRectangleAccess().getAtKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getAtKeyword_6()); 

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
    // InternalCinEditor.g:3186:1: rule__Rectangle__Group__7 : rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8 ;
    public final void rule__Rectangle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3190:1: ( rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8 )
            // InternalCinEditor.g:3191:2: rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalCinEditor.g:3198:1: rule__Rectangle__Group__7__Impl : ( ( rule__Rectangle__BeginTimeAssignment_7 ) ) ;
    public final void rule__Rectangle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3202:1: ( ( ( rule__Rectangle__BeginTimeAssignment_7 ) ) )
            // InternalCinEditor.g:3203:1: ( ( rule__Rectangle__BeginTimeAssignment_7 ) )
            {
            // InternalCinEditor.g:3203:1: ( ( rule__Rectangle__BeginTimeAssignment_7 ) )
            // InternalCinEditor.g:3204:2: ( rule__Rectangle__BeginTimeAssignment_7 )
            {
             before(grammarAccess.getRectangleAccess().getBeginTimeAssignment_7()); 
            // InternalCinEditor.g:3205:2: ( rule__Rectangle__BeginTimeAssignment_7 )
            // InternalCinEditor.g:3205:3: rule__Rectangle__BeginTimeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__BeginTimeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getBeginTimeAssignment_7()); 

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
    // InternalCinEditor.g:3213:1: rule__Rectangle__Group__8 : rule__Rectangle__Group__8__Impl rule__Rectangle__Group__9 ;
    public final void rule__Rectangle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3217:1: ( rule__Rectangle__Group__8__Impl rule__Rectangle__Group__9 )
            // InternalCinEditor.g:3218:2: rule__Rectangle__Group__8__Impl rule__Rectangle__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Rectangle__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__9();

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
    // InternalCinEditor.g:3225:1: rule__Rectangle__Group__8__Impl : ( 'during' ) ;
    public final void rule__Rectangle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3229:1: ( ( 'during' ) )
            // InternalCinEditor.g:3230:1: ( 'during' )
            {
            // InternalCinEditor.g:3230:1: ( 'during' )
            // InternalCinEditor.g:3231:2: 'during'
            {
             before(grammarAccess.getRectangleAccess().getDuringKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getDuringKeyword_8()); 

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


    // $ANTLR start "rule__Rectangle__Group__9"
    // InternalCinEditor.g:3240:1: rule__Rectangle__Group__9 : rule__Rectangle__Group__9__Impl ;
    public final void rule__Rectangle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3244:1: ( rule__Rectangle__Group__9__Impl )
            // InternalCinEditor.g:3245:2: rule__Rectangle__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__9__Impl();

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
    // $ANTLR end "rule__Rectangle__Group__9"


    // $ANTLR start "rule__Rectangle__Group__9__Impl"
    // InternalCinEditor.g:3251:1: rule__Rectangle__Group__9__Impl : ( ( rule__Rectangle__DurationAssignment_9 ) ) ;
    public final void rule__Rectangle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3255:1: ( ( ( rule__Rectangle__DurationAssignment_9 ) ) )
            // InternalCinEditor.g:3256:1: ( ( rule__Rectangle__DurationAssignment_9 ) )
            {
            // InternalCinEditor.g:3256:1: ( ( rule__Rectangle__DurationAssignment_9 ) )
            // InternalCinEditor.g:3257:2: ( rule__Rectangle__DurationAssignment_9 )
            {
             before(grammarAccess.getRectangleAccess().getDurationAssignment_9()); 
            // InternalCinEditor.g:3258:2: ( rule__Rectangle__DurationAssignment_9 )
            // InternalCinEditor.g:3258:3: rule__Rectangle__DurationAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__DurationAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getDurationAssignment_9()); 

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
    // $ANTLR end "rule__Rectangle__Group__9__Impl"


    // $ANTLR start "rule__Movie__NameAssignment_1"
    // InternalCinEditor.g:3267:1: rule__Movie__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Movie__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3271:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3272:2: ( ruleEString )
            {
            // InternalCinEditor.g:3272:2: ( ruleEString )
            // InternalCinEditor.g:3273:3: ruleEString
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


    // $ANTLR start "rule__Movie__DimensionAssignment_2"
    // InternalCinEditor.g:3282:1: rule__Movie__DimensionAssignment_2 : ( ruleDimension ) ;
    public final void rule__Movie__DimensionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3286:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:3287:2: ( ruleDimension )
            {
            // InternalCinEditor.g:3287:2: ( ruleDimension )
            // InternalCinEditor.g:3288:3: ruleDimension
            {
             before(grammarAccess.getMovieAccess().getDimensionDimensionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getDimensionDimensionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Movie__DimensionAssignment_2"


    // $ANTLR start "rule__Movie__LayersAssignment_3"
    // InternalCinEditor.g:3297:1: rule__Movie__LayersAssignment_3 : ( ruleLayer ) ;
    public final void rule__Movie__LayersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3301:1: ( ( ruleLayer ) )
            // InternalCinEditor.g:3302:2: ( ruleLayer )
            {
            // InternalCinEditor.g:3302:2: ( ruleLayer )
            // InternalCinEditor.g:3303:3: ruleLayer
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
    // InternalCinEditor.g:3312:1: rule__Layer__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Layer__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3316:1: ( ( ruleElement ) )
            // InternalCinEditor.g:3317:2: ( ruleElement )
            {
            // InternalCinEditor.g:3317:2: ( ruleElement )
            // InternalCinEditor.g:3318:3: ruleElement
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


    // $ANTLR start "rule__Position__XAssignment_1_1"
    // InternalCinEditor.g:3327:1: rule__Position__XAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__Position__XAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3331:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3332:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3332:2: ( ruleEInt )
            // InternalCinEditor.g:3333:3: ruleEInt
            {
             before(grammarAccess.getPositionAccess().getXEIntParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getXEIntParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Position__XAssignment_1_1"


    // $ANTLR start "rule__Position__YAssignment_1_3"
    // InternalCinEditor.g:3342:1: rule__Position__YAssignment_1_3 : ( ruleEInt ) ;
    public final void rule__Position__YAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3346:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3347:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3347:2: ( ruleEInt )
            // InternalCinEditor.g:3348:3: ruleEInt
            {
             before(grammarAccess.getPositionAccess().getYEIntParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getYEIntParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__Position__YAssignment_1_3"


    // $ANTLR start "rule__Dimension__WidthAssignment_1"
    // InternalCinEditor.g:3357:1: rule__Dimension__WidthAssignment_1 : ( ruleEInt ) ;
    public final void rule__Dimension__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3361:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3362:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3362:2: ( ruleEInt )
            // InternalCinEditor.g:3363:3: ruleEInt
            {
             before(grammarAccess.getDimensionAccess().getWidthEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDimensionAccess().getWidthEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Dimension__WidthAssignment_1"


    // $ANTLR start "rule__Dimension__HeightAssignment_3"
    // InternalCinEditor.g:3372:1: rule__Dimension__HeightAssignment_3 : ( ruleEInt ) ;
    public final void rule__Dimension__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3376:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3377:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3377:2: ( ruleEInt )
            // InternalCinEditor.g:3378:3: ruleEInt
            {
             before(grammarAccess.getDimensionAccess().getHeightEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDimensionAccess().getHeightEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Dimension__HeightAssignment_3"


    // $ANTLR start "rule__HexadecimalColor__HexadecimalValueAssignment_1"
    // InternalCinEditor.g:3387:1: rule__HexadecimalColor__HexadecimalValueAssignment_1 : ( ruleEString ) ;
    public final void rule__HexadecimalColor__HexadecimalValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3391:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3392:2: ( ruleEString )
            {
            // InternalCinEditor.g:3392:2: ( ruleEString )
            // InternalCinEditor.g:3393:3: ruleEString
            {
             before(grammarAccess.getHexadecimalColorAccess().getHexadecimalValueEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHexadecimalColorAccess().getHexadecimalValueEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__HexadecimalColor__HexadecimalValueAssignment_1"


    // $ANTLR start "rule__Text__NameAssignment_1"
    // InternalCinEditor.g:3402:1: rule__Text__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Text__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3406:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3407:2: ( ruleEString )
            {
            // InternalCinEditor.g:3407:2: ( ruleEString )
            // InternalCinEditor.g:3408:3: ruleEString
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
    // InternalCinEditor.g:3417:1: rule__Text__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__Text__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3421:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3422:2: ( ruleEString )
            {
            // InternalCinEditor.g:3422:2: ( ruleEString )
            // InternalCinEditor.g:3423:3: ruleEString
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


    // $ANTLR start "rule__Text__FontSizeAssignment_4_1"
    // InternalCinEditor.g:3432:1: rule__Text__FontSizeAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Text__FontSizeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3436:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3437:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3437:2: ( ruleEInt )
            // InternalCinEditor.g:3438:3: ruleEInt
            {
             before(grammarAccess.getTextAccess().getFontSizeEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextAccess().getFontSizeEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Text__FontSizeAssignment_4_1"


    // $ANTLR start "rule__Text__PositionAssignment_5"
    // InternalCinEditor.g:3447:1: rule__Text__PositionAssignment_5 : ( rulePosition ) ;
    public final void rule__Text__PositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3451:1: ( ( rulePosition ) )
            // InternalCinEditor.g:3452:2: ( rulePosition )
            {
            // InternalCinEditor.g:3452:2: ( rulePosition )
            // InternalCinEditor.g:3453:3: rulePosition
            {
             before(grammarAccess.getTextAccess().getPositionPositionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getTextAccess().getPositionPositionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Text__PositionAssignment_5"


    // $ANTLR start "rule__Text__BeginTimeAssignment_7"
    // InternalCinEditor.g:3462:1: rule__Text__BeginTimeAssignment_7 : ( ruleEInt ) ;
    public final void rule__Text__BeginTimeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3466:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3467:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3467:2: ( ruleEInt )
            // InternalCinEditor.g:3468:3: ruleEInt
            {
             before(grammarAccess.getTextAccess().getBeginTimeEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextAccess().getBeginTimeEIntParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Text__BeginTimeAssignment_7"


    // $ANTLR start "rule__Text__DurationAssignment_9"
    // InternalCinEditor.g:3477:1: rule__Text__DurationAssignment_9 : ( ruleEInt ) ;
    public final void rule__Text__DurationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3481:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3482:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3482:2: ( ruleEInt )
            // InternalCinEditor.g:3483:3: ruleEInt
            {
             before(grammarAccess.getTextAccess().getDurationEIntParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextAccess().getDurationEIntParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Text__DurationAssignment_9"


    // $ANTLR start "rule__Text__ColorAssignment_10"
    // InternalCinEditor.g:3492:1: rule__Text__ColorAssignment_10 : ( ruleHexadecimalColor ) ;
    public final void rule__Text__ColorAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3496:1: ( ( ruleHexadecimalColor ) )
            // InternalCinEditor.g:3497:2: ( ruleHexadecimalColor )
            {
            // InternalCinEditor.g:3497:2: ( ruleHexadecimalColor )
            // InternalCinEditor.g:3498:3: ruleHexadecimalColor
            {
             before(grammarAccess.getTextAccess().getColorHexadecimalColorParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleHexadecimalColor();

            state._fsp--;

             after(grammarAccess.getTextAccess().getColorHexadecimalColorParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Text__ColorAssignment_10"


    // $ANTLR start "rule__Picture__NameAssignment_1"
    // InternalCinEditor.g:3507:1: rule__Picture__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Picture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3511:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3512:2: ( ruleEString )
            {
            // InternalCinEditor.g:3512:2: ( ruleEString )
            // InternalCinEditor.g:3513:3: ruleEString
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
    // InternalCinEditor.g:3522:1: rule__Picture__UrlAssignment_4 : ( ruleEString ) ;
    public final void rule__Picture__UrlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3526:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3527:2: ( ruleEString )
            {
            // InternalCinEditor.g:3527:2: ( ruleEString )
            // InternalCinEditor.g:3528:3: ruleEString
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
    // InternalCinEditor.g:3537:1: rule__Picture__PositionAssignment_6 : ( rulePosition ) ;
    public final void rule__Picture__PositionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3541:1: ( ( rulePosition ) )
            // InternalCinEditor.g:3542:2: ( rulePosition )
            {
            // InternalCinEditor.g:3542:2: ( rulePosition )
            // InternalCinEditor.g:3543:3: rulePosition
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


    // $ANTLR start "rule__Picture__DimensionAssignment_7"
    // InternalCinEditor.g:3552:1: rule__Picture__DimensionAssignment_7 : ( ruleDimension ) ;
    public final void rule__Picture__DimensionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3556:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:3557:2: ( ruleDimension )
            {
            // InternalCinEditor.g:3557:2: ( ruleDimension )
            // InternalCinEditor.g:3558:3: ruleDimension
            {
             before(grammarAccess.getPictureAccess().getDimensionDimensionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getDimensionDimensionParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Picture__DimensionAssignment_7"


    // $ANTLR start "rule__Picture__BeginTimeAssignment_9"
    // InternalCinEditor.g:3567:1: rule__Picture__BeginTimeAssignment_9 : ( ruleEInt ) ;
    public final void rule__Picture__BeginTimeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3571:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3572:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3572:2: ( ruleEInt )
            // InternalCinEditor.g:3573:3: ruleEInt
            {
             before(grammarAccess.getPictureAccess().getBeginTimeEIntParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getBeginTimeEIntParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Picture__BeginTimeAssignment_9"


    // $ANTLR start "rule__Picture__DurationAssignment_11"
    // InternalCinEditor.g:3582:1: rule__Picture__DurationAssignment_11 : ( ruleEInt ) ;
    public final void rule__Picture__DurationAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3586:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3587:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3587:2: ( ruleEInt )
            // InternalCinEditor.g:3588:3: ruleEInt
            {
             before(grammarAccess.getPictureAccess().getDurationEIntParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getDurationEIntParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Picture__DurationAssignment_11"


    // $ANTLR start "rule__Video__NameAssignment_1"
    // InternalCinEditor.g:3597:1: rule__Video__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Video__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3601:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3602:2: ( ruleEString )
            {
            // InternalCinEditor.g:3602:2: ( ruleEString )
            // InternalCinEditor.g:3603:3: ruleEString
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
    // InternalCinEditor.g:3612:1: rule__Video__UrlAssignment_4 : ( ruleEString ) ;
    public final void rule__Video__UrlAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3616:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3617:2: ( ruleEString )
            {
            // InternalCinEditor.g:3617:2: ( ruleEString )
            // InternalCinEditor.g:3618:3: ruleEString
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
    // InternalCinEditor.g:3627:1: rule__Video__BeginCropTimeAssignment_7 : ( ruleEInt ) ;
    public final void rule__Video__BeginCropTimeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3631:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3632:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3632:2: ( ruleEInt )
            // InternalCinEditor.g:3633:3: ruleEInt
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
    // InternalCinEditor.g:3642:1: rule__Video__PositionAssignment_8 : ( rulePosition ) ;
    public final void rule__Video__PositionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3646:1: ( ( rulePosition ) )
            // InternalCinEditor.g:3647:2: ( rulePosition )
            {
            // InternalCinEditor.g:3647:2: ( rulePosition )
            // InternalCinEditor.g:3648:3: rulePosition
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


    // $ANTLR start "rule__Video__DimensionAssignment_9"
    // InternalCinEditor.g:3657:1: rule__Video__DimensionAssignment_9 : ( ruleDimension ) ;
    public final void rule__Video__DimensionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3661:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:3662:2: ( ruleDimension )
            {
            // InternalCinEditor.g:3662:2: ( ruleDimension )
            // InternalCinEditor.g:3663:3: ruleDimension
            {
             before(grammarAccess.getVideoAccess().getDimensionDimensionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getDimensionDimensionParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Video__DimensionAssignment_9"


    // $ANTLR start "rule__Video__BeginTimeAssignment_11"
    // InternalCinEditor.g:3672:1: rule__Video__BeginTimeAssignment_11 : ( ruleEInt ) ;
    public final void rule__Video__BeginTimeAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3676:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3677:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3677:2: ( ruleEInt )
            // InternalCinEditor.g:3678:3: ruleEInt
            {
             before(grammarAccess.getVideoAccess().getBeginTimeEIntParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getBeginTimeEIntParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Video__BeginTimeAssignment_11"


    // $ANTLR start "rule__Video__DurationAssignment_13"
    // InternalCinEditor.g:3687:1: rule__Video__DurationAssignment_13 : ( ruleEInt ) ;
    public final void rule__Video__DurationAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3691:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3692:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3692:2: ( ruleEInt )
            // InternalCinEditor.g:3693:3: ruleEInt
            {
             before(grammarAccess.getVideoAccess().getDurationEIntParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getDurationEIntParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__Video__DurationAssignment_13"


    // $ANTLR start "rule__FadeIn__NameAssignment_1"
    // InternalCinEditor.g:3702:1: rule__FadeIn__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FadeIn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3706:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3707:2: ( ruleEString )
            {
            // InternalCinEditor.g:3707:2: ( ruleEString )
            // InternalCinEditor.g:3708:3: ruleEString
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


    // $ANTLR start "rule__FadeIn__DurationAssignment_5"
    // InternalCinEditor.g:3717:1: rule__FadeIn__DurationAssignment_5 : ( ruleEInt ) ;
    public final void rule__FadeIn__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3721:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3722:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3722:2: ( ruleEInt )
            // InternalCinEditor.g:3723:3: ruleEInt
            {
             before(grammarAccess.getFadeInAccess().getDurationEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFadeInAccess().getDurationEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__FadeIn__DurationAssignment_5"


    // $ANTLR start "rule__FadeIn__ElementAssignment_7"
    // InternalCinEditor.g:3732:1: rule__FadeIn__ElementAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__FadeIn__ElementAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3736:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:3737:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:3737:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:3738:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeInAccess().getElementElementCrossReference_7_0()); 
            // InternalCinEditor.g:3739:3: ( RULE_ID )
            // InternalCinEditor.g:3740:4: RULE_ID
            {
             before(grammarAccess.getFadeInAccess().getElementElementIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getElementElementIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getFadeInAccess().getElementElementCrossReference_7_0()); 

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
    // $ANTLR end "rule__FadeIn__ElementAssignment_7"


    // $ANTLR start "rule__FadeOut__NameAssignment_1"
    // InternalCinEditor.g:3751:1: rule__FadeOut__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FadeOut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3755:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3756:2: ( ruleEString )
            {
            // InternalCinEditor.g:3756:2: ( ruleEString )
            // InternalCinEditor.g:3757:3: ruleEString
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


    // $ANTLR start "rule__FadeOut__DurationAssignment_5"
    // InternalCinEditor.g:3766:1: rule__FadeOut__DurationAssignment_5 : ( ruleEInt ) ;
    public final void rule__FadeOut__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3770:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3771:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3771:2: ( ruleEInt )
            // InternalCinEditor.g:3772:3: ruleEInt
            {
             before(grammarAccess.getFadeOutAccess().getDurationEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFadeOutAccess().getDurationEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__FadeOut__DurationAssignment_5"


    // $ANTLR start "rule__FadeOut__ElementAssignment_7"
    // InternalCinEditor.g:3781:1: rule__FadeOut__ElementAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__FadeOut__ElementAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3785:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:3786:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:3786:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:3787:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeOutAccess().getElementElementCrossReference_7_0()); 
            // InternalCinEditor.g:3788:3: ( RULE_ID )
            // InternalCinEditor.g:3789:4: RULE_ID
            {
             before(grammarAccess.getFadeOutAccess().getElementElementIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getElementElementIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getFadeOutAccess().getElementElementCrossReference_7_0()); 

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
    // $ANTLR end "rule__FadeOut__ElementAssignment_7"


    // $ANTLR start "rule__Translate__NameAssignment_1"
    // InternalCinEditor.g:3800:1: rule__Translate__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Translate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3804:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3805:2: ( ruleEString )
            {
            // InternalCinEditor.g:3805:2: ( ruleEString )
            // InternalCinEditor.g:3806:3: ruleEString
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
    // InternalCinEditor.g:3815:1: rule__Translate__PixelsToTranslateHorizontallyAssignment_5 : ( ruleEInt ) ;
    public final void rule__Translate__PixelsToTranslateHorizontallyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3819:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3820:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3820:2: ( ruleEInt )
            // InternalCinEditor.g:3821:3: ruleEInt
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
    // InternalCinEditor.g:3830:1: rule__Translate__PixelsToTranslateVerticallyAssignment_7 : ( ruleEInt ) ;
    public final void rule__Translate__PixelsToTranslateVerticallyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3834:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3835:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3835:2: ( ruleEInt )
            // InternalCinEditor.g:3836:3: ruleEInt
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
    // InternalCinEditor.g:3845:1: rule__Translate__BeginTimeAssignment_10 : ( ruleEInt ) ;
    public final void rule__Translate__BeginTimeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3849:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3850:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3850:2: ( ruleEInt )
            // InternalCinEditor.g:3851:3: ruleEInt
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
    // InternalCinEditor.g:3860:1: rule__Translate__DurationAssignment_12 : ( ruleEInt ) ;
    public final void rule__Translate__DurationAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3864:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3865:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3865:2: ( ruleEInt )
            // InternalCinEditor.g:3866:3: ruleEInt
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
    // InternalCinEditor.g:3875:1: rule__Translate__ElementAssignment_14 : ( ( RULE_ID ) ) ;
    public final void rule__Translate__ElementAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3879:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:3880:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:3880:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:3881:3: ( RULE_ID )
            {
             before(grammarAccess.getTranslateAccess().getElementElementCrossReference_14_0()); 
            // InternalCinEditor.g:3882:3: ( RULE_ID )
            // InternalCinEditor.g:3883:4: RULE_ID
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
    // InternalCinEditor.g:3894:1: rule__Rectangle__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Rectangle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3898:1: ( ( ruleEString ) )
            // InternalCinEditor.g:3899:2: ( ruleEString )
            {
            // InternalCinEditor.g:3899:2: ( ruleEString )
            // InternalCinEditor.g:3900:3: ruleEString
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


    // $ANTLR start "rule__Rectangle__ColorAssignment_3"
    // InternalCinEditor.g:3909:1: rule__Rectangle__ColorAssignment_3 : ( ruleHexadecimalColor ) ;
    public final void rule__Rectangle__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3913:1: ( ( ruleHexadecimalColor ) )
            // InternalCinEditor.g:3914:2: ( ruleHexadecimalColor )
            {
            // InternalCinEditor.g:3914:2: ( ruleHexadecimalColor )
            // InternalCinEditor.g:3915:3: ruleHexadecimalColor
            {
             before(grammarAccess.getRectangleAccess().getColorHexadecimalColorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHexadecimalColor();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getColorHexadecimalColorParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rectangle__ColorAssignment_3"


    // $ANTLR start "rule__Rectangle__PositionAssignment_4"
    // InternalCinEditor.g:3924:1: rule__Rectangle__PositionAssignment_4 : ( rulePosition ) ;
    public final void rule__Rectangle__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3928:1: ( ( rulePosition ) )
            // InternalCinEditor.g:3929:2: ( rulePosition )
            {
            // InternalCinEditor.g:3929:2: ( rulePosition )
            // InternalCinEditor.g:3930:3: rulePosition
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


    // $ANTLR start "rule__Rectangle__DimensionAssignment_5"
    // InternalCinEditor.g:3939:1: rule__Rectangle__DimensionAssignment_5 : ( ruleDimension ) ;
    public final void rule__Rectangle__DimensionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3943:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:3944:2: ( ruleDimension )
            {
            // InternalCinEditor.g:3944:2: ( ruleDimension )
            // InternalCinEditor.g:3945:3: ruleDimension
            {
             before(grammarAccess.getRectangleAccess().getDimensionDimensionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getDimensionDimensionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Rectangle__DimensionAssignment_5"


    // $ANTLR start "rule__Rectangle__BeginTimeAssignment_7"
    // InternalCinEditor.g:3954:1: rule__Rectangle__BeginTimeAssignment_7 : ( ruleEInt ) ;
    public final void rule__Rectangle__BeginTimeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3958:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3959:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3959:2: ( ruleEInt )
            // InternalCinEditor.g:3960:3: ruleEInt
            {
             before(grammarAccess.getRectangleAccess().getBeginTimeEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getBeginTimeEIntParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Rectangle__BeginTimeAssignment_7"


    // $ANTLR start "rule__Rectangle__DurationAssignment_9"
    // InternalCinEditor.g:3969:1: rule__Rectangle__DurationAssignment_9 : ( ruleEInt ) ;
    public final void rule__Rectangle__DurationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3973:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:3974:2: ( ruleEInt )
            {
            // InternalCinEditor.g:3974:2: ( ruleEInt )
            // InternalCinEditor.g:3975:3: ruleEInt
            {
             before(grammarAccess.getRectangleAccess().getDurationEIntParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getDurationEIntParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Rectangle__DurationAssignment_9"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\25\3\uffff\1\4\1\uffff\2\26\1\37\3\uffff";
    static final String dfa_3s = "\1\43\3\uffff\1\5\1\uffff\2\26\1\42\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\7\3\uffff\1\6\1\5\1\4";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\4\uffff\1\2\1\uffff\1\3\1\uffff\1\4\4\uffff\1\5",
            "",
            "",
            "",
            "\1\6\1\7",
            "",
            "\1\10",
            "\1\10",
            "\1\13\1\uffff\1\12\1\11",
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
            return "427:1: rule__Element__Alternatives : ( ( ruleText ) | ( rulePicture ) | ( ruleVideo ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleRectangle ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000854200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000854200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002802000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000822000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});

}