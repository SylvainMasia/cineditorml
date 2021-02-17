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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'center'", "'left'", "'right'", "'bottom'", "'top'", "'.'", "','", "'true'", "'false'", "'Movie'", "'fps'", "'Layer'", "'position'", "'('", "')'", "'dimension'", "'x'", "'color'", "'startAt'", "'startAfter'", "'opacity'", "'-'", "'Audio'", "'='", "'during'", "'volume'", "'fadeIn'", "'fadeOut'", "'cropAt'", "'Text'", "'fontSize'", "'margins('", "'Picture'", "'Video'", "'audio'", "'Rectangle'", "'Effect'", "'FadeIn'", "'on'", "'['", "']'", "'FadeOut'", "'Translate'"
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
    public static final int T__53=53;
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


    // $ANTLR start "entryRuleItemPosition"
    // InternalCinEditor.g:178:1: entryRuleItemPosition : ruleItemPosition EOF ;
    public final void entryRuleItemPosition() throws RecognitionException {
        try {
            // InternalCinEditor.g:179:1: ( ruleItemPosition EOF )
            // InternalCinEditor.g:180:1: ruleItemPosition EOF
            {
             before(grammarAccess.getItemPositionRule()); 
            pushFollow(FOLLOW_1);
            ruleItemPosition();

            state._fsp--;

             after(grammarAccess.getItemPositionRule()); 
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
    // $ANTLR end "entryRuleItemPosition"


    // $ANTLR start "ruleItemPosition"
    // InternalCinEditor.g:187:1: ruleItemPosition : ( ( rule__ItemPosition__Alternatives ) ) ;
    public final void ruleItemPosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:191:2: ( ( ( rule__ItemPosition__Alternatives ) ) )
            // InternalCinEditor.g:192:2: ( ( rule__ItemPosition__Alternatives ) )
            {
            // InternalCinEditor.g:192:2: ( ( rule__ItemPosition__Alternatives ) )
            // InternalCinEditor.g:193:3: ( rule__ItemPosition__Alternatives )
            {
             before(grammarAccess.getItemPositionAccess().getAlternatives()); 
            // InternalCinEditor.g:194:3: ( rule__ItemPosition__Alternatives )
            // InternalCinEditor.g:194:4: rule__ItemPosition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ItemPosition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getItemPositionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemPosition"


    // $ANTLR start "entryRuleItemPositionInt"
    // InternalCinEditor.g:203:1: entryRuleItemPositionInt : ruleItemPositionInt EOF ;
    public final void entryRuleItemPositionInt() throws RecognitionException {
        try {
            // InternalCinEditor.g:204:1: ( ruleItemPositionInt EOF )
            // InternalCinEditor.g:205:1: ruleItemPositionInt EOF
            {
             before(grammarAccess.getItemPositionIntRule()); 
            pushFollow(FOLLOW_1);
            ruleItemPositionInt();

            state._fsp--;

             after(grammarAccess.getItemPositionIntRule()); 
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
    // $ANTLR end "entryRuleItemPositionInt"


    // $ANTLR start "ruleItemPositionInt"
    // InternalCinEditor.g:212:1: ruleItemPositionInt : ( ( rule__ItemPositionInt__PositionAssignment ) ) ;
    public final void ruleItemPositionInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:216:2: ( ( ( rule__ItemPositionInt__PositionAssignment ) ) )
            // InternalCinEditor.g:217:2: ( ( rule__ItemPositionInt__PositionAssignment ) )
            {
            // InternalCinEditor.g:217:2: ( ( rule__ItemPositionInt__PositionAssignment ) )
            // InternalCinEditor.g:218:3: ( rule__ItemPositionInt__PositionAssignment )
            {
             before(grammarAccess.getItemPositionIntAccess().getPositionAssignment()); 
            // InternalCinEditor.g:219:3: ( rule__ItemPositionInt__PositionAssignment )
            // InternalCinEditor.g:219:4: rule__ItemPositionInt__PositionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ItemPositionInt__PositionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getItemPositionIntAccess().getPositionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemPositionInt"


    // $ANTLR start "entryRuleItemPositionString"
    // InternalCinEditor.g:228:1: entryRuleItemPositionString : ruleItemPositionString EOF ;
    public final void entryRuleItemPositionString() throws RecognitionException {
        try {
            // InternalCinEditor.g:229:1: ( ruleItemPositionString EOF )
            // InternalCinEditor.g:230:1: ruleItemPositionString EOF
            {
             before(grammarAccess.getItemPositionStringRule()); 
            pushFollow(FOLLOW_1);
            ruleItemPositionString();

            state._fsp--;

             after(grammarAccess.getItemPositionStringRule()); 
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
    // $ANTLR end "entryRuleItemPositionString"


    // $ANTLR start "ruleItemPositionString"
    // InternalCinEditor.g:237:1: ruleItemPositionString : ( ( rule__ItemPositionString__PositionAssignment ) ) ;
    public final void ruleItemPositionString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:241:2: ( ( ( rule__ItemPositionString__PositionAssignment ) ) )
            // InternalCinEditor.g:242:2: ( ( rule__ItemPositionString__PositionAssignment ) )
            {
            // InternalCinEditor.g:242:2: ( ( rule__ItemPositionString__PositionAssignment ) )
            // InternalCinEditor.g:243:3: ( rule__ItemPositionString__PositionAssignment )
            {
             before(grammarAccess.getItemPositionStringAccess().getPositionAssignment()); 
            // InternalCinEditor.g:244:3: ( rule__ItemPositionString__PositionAssignment )
            // InternalCinEditor.g:244:4: rule__ItemPositionString__PositionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ItemPositionString__PositionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getItemPositionStringAccess().getPositionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemPositionString"


    // $ANTLR start "entryRuleDimension"
    // InternalCinEditor.g:253:1: entryRuleDimension : ruleDimension EOF ;
    public final void entryRuleDimension() throws RecognitionException {
        try {
            // InternalCinEditor.g:254:1: ( ruleDimension EOF )
            // InternalCinEditor.g:255:1: ruleDimension EOF
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
    // InternalCinEditor.g:262:1: ruleDimension : ( ( rule__Dimension__Group__0 ) ) ;
    public final void ruleDimension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:266:2: ( ( ( rule__Dimension__Group__0 ) ) )
            // InternalCinEditor.g:267:2: ( ( rule__Dimension__Group__0 ) )
            {
            // InternalCinEditor.g:267:2: ( ( rule__Dimension__Group__0 ) )
            // InternalCinEditor.g:268:3: ( rule__Dimension__Group__0 )
            {
             before(grammarAccess.getDimensionAccess().getGroup()); 
            // InternalCinEditor.g:269:3: ( rule__Dimension__Group__0 )
            // InternalCinEditor.g:269:4: rule__Dimension__Group__0
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
    // InternalCinEditor.g:278:1: entryRuleHexadecimalColor : ruleHexadecimalColor EOF ;
    public final void entryRuleHexadecimalColor() throws RecognitionException {
        try {
            // InternalCinEditor.g:279:1: ( ruleHexadecimalColor EOF )
            // InternalCinEditor.g:280:1: ruleHexadecimalColor EOF
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
    // InternalCinEditor.g:287:1: ruleHexadecimalColor : ( ( rule__HexadecimalColor__Group__0 ) ) ;
    public final void ruleHexadecimalColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:291:2: ( ( ( rule__HexadecimalColor__Group__0 ) ) )
            // InternalCinEditor.g:292:2: ( ( rule__HexadecimalColor__Group__0 ) )
            {
            // InternalCinEditor.g:292:2: ( ( rule__HexadecimalColor__Group__0 ) )
            // InternalCinEditor.g:293:3: ( rule__HexadecimalColor__Group__0 )
            {
             before(grammarAccess.getHexadecimalColorAccess().getGroup()); 
            // InternalCinEditor.g:294:3: ( rule__HexadecimalColor__Group__0 )
            // InternalCinEditor.g:294:4: rule__HexadecimalColor__Group__0
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


    // $ANTLR start "entryRuleTemporalPosition"
    // InternalCinEditor.g:303:1: entryRuleTemporalPosition : ruleTemporalPosition EOF ;
    public final void entryRuleTemporalPosition() throws RecognitionException {
        try {
            // InternalCinEditor.g:304:1: ( ruleTemporalPosition EOF )
            // InternalCinEditor.g:305:1: ruleTemporalPosition EOF
            {
             before(grammarAccess.getTemporalPositionRule()); 
            pushFollow(FOLLOW_1);
            ruleTemporalPosition();

            state._fsp--;

             after(grammarAccess.getTemporalPositionRule()); 
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
    // $ANTLR end "entryRuleTemporalPosition"


    // $ANTLR start "ruleTemporalPosition"
    // InternalCinEditor.g:312:1: ruleTemporalPosition : ( ( rule__TemporalPosition__Alternatives ) ) ;
    public final void ruleTemporalPosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:316:2: ( ( ( rule__TemporalPosition__Alternatives ) ) )
            // InternalCinEditor.g:317:2: ( ( rule__TemporalPosition__Alternatives ) )
            {
            // InternalCinEditor.g:317:2: ( ( rule__TemporalPosition__Alternatives ) )
            // InternalCinEditor.g:318:3: ( rule__TemporalPosition__Alternatives )
            {
             before(grammarAccess.getTemporalPositionAccess().getAlternatives()); 
            // InternalCinEditor.g:319:3: ( rule__TemporalPosition__Alternatives )
            // InternalCinEditor.g:319:4: rule__TemporalPosition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPosition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTemporalPositionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemporalPosition"


    // $ANTLR start "entryRuleGraphicalElement"
    // InternalCinEditor.g:328:1: entryRuleGraphicalElement : ruleGraphicalElement EOF ;
    public final void entryRuleGraphicalElement() throws RecognitionException {
        try {
            // InternalCinEditor.g:329:1: ( ruleGraphicalElement EOF )
            // InternalCinEditor.g:330:1: ruleGraphicalElement EOF
            {
             before(grammarAccess.getGraphicalElementRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphicalElement();

            state._fsp--;

             after(grammarAccess.getGraphicalElementRule()); 
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
    // $ANTLR end "entryRuleGraphicalElement"


    // $ANTLR start "ruleGraphicalElement"
    // InternalCinEditor.g:337:1: ruleGraphicalElement : ( ( rule__GraphicalElement__Alternatives ) ) ;
    public final void ruleGraphicalElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:341:2: ( ( ( rule__GraphicalElement__Alternatives ) ) )
            // InternalCinEditor.g:342:2: ( ( rule__GraphicalElement__Alternatives ) )
            {
            // InternalCinEditor.g:342:2: ( ( rule__GraphicalElement__Alternatives ) )
            // InternalCinEditor.g:343:3: ( rule__GraphicalElement__Alternatives )
            {
             before(grammarAccess.getGraphicalElementAccess().getAlternatives()); 
            // InternalCinEditor.g:344:3: ( rule__GraphicalElement__Alternatives )
            // InternalCinEditor.g:344:4: rule__GraphicalElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GraphicalElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGraphicalElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphicalElement"


    // $ANTLR start "entryRuleMargin"
    // InternalCinEditor.g:353:1: entryRuleMargin : ruleMargin EOF ;
    public final void entryRuleMargin() throws RecognitionException {
        try {
            // InternalCinEditor.g:354:1: ( ruleMargin EOF )
            // InternalCinEditor.g:355:1: ruleMargin EOF
            {
             before(grammarAccess.getMarginRule()); 
            pushFollow(FOLLOW_1);
            ruleMargin();

            state._fsp--;

             after(grammarAccess.getMarginRule()); 
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
    // $ANTLR end "entryRuleMargin"


    // $ANTLR start "ruleMargin"
    // InternalCinEditor.g:362:1: ruleMargin : ( ( rule__Margin__Group__0 ) ) ;
    public final void ruleMargin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:366:2: ( ( ( rule__Margin__Group__0 ) ) )
            // InternalCinEditor.g:367:2: ( ( rule__Margin__Group__0 ) )
            {
            // InternalCinEditor.g:367:2: ( ( rule__Margin__Group__0 ) )
            // InternalCinEditor.g:368:3: ( rule__Margin__Group__0 )
            {
             before(grammarAccess.getMarginAccess().getGroup()); 
            // InternalCinEditor.g:369:3: ( rule__Margin__Group__0 )
            // InternalCinEditor.g:369:4: rule__Margin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Margin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMarginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMargin"


    // $ANTLR start "entryRuleEInt"
    // InternalCinEditor.g:378:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalCinEditor.g:379:1: ( ruleEInt EOF )
            // InternalCinEditor.g:380:1: ruleEInt EOF
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
    // InternalCinEditor.g:387:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:391:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalCinEditor.g:392:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalCinEditor.g:392:2: ( ( rule__EInt__Group__0 ) )
            // InternalCinEditor.g:393:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalCinEditor.g:394:3: ( rule__EInt__Group__0 )
            // InternalCinEditor.g:394:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleEFloat"
    // InternalCinEditor.g:403:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalCinEditor.g:404:1: ( ruleEFloat EOF )
            // InternalCinEditor.g:405:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalCinEditor.g:412:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:416:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalCinEditor.g:417:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalCinEditor.g:417:2: ( ( rule__EFloat__Group__0 ) )
            // InternalCinEditor.g:418:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalCinEditor.g:419:3: ( rule__EFloat__Group__0 )
            // InternalCinEditor.g:419:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEBoolean"
    // InternalCinEditor.g:428:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalCinEditor.g:429:1: ( ruleEBoolean EOF )
            // InternalCinEditor.g:430:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalCinEditor.g:437:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:441:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalCinEditor.g:442:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalCinEditor.g:442:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalCinEditor.g:443:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalCinEditor.g:444:3: ( rule__EBoolean__Alternatives )
            // InternalCinEditor.g:444:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleAudioElement"
    // InternalCinEditor.g:453:1: entryRuleAudioElement : ruleAudioElement EOF ;
    public final void entryRuleAudioElement() throws RecognitionException {
        try {
            // InternalCinEditor.g:454:1: ( ruleAudioElement EOF )
            // InternalCinEditor.g:455:1: ruleAudioElement EOF
            {
             before(grammarAccess.getAudioElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAudioElement();

            state._fsp--;

             after(grammarAccess.getAudioElementRule()); 
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
    // $ANTLR end "entryRuleAudioElement"


    // $ANTLR start "ruleAudioElement"
    // InternalCinEditor.g:462:1: ruleAudioElement : ( ( rule__AudioElement__Group__0 ) ) ;
    public final void ruleAudioElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:466:2: ( ( ( rule__AudioElement__Group__0 ) ) )
            // InternalCinEditor.g:467:2: ( ( rule__AudioElement__Group__0 ) )
            {
            // InternalCinEditor.g:467:2: ( ( rule__AudioElement__Group__0 ) )
            // InternalCinEditor.g:468:3: ( rule__AudioElement__Group__0 )
            {
             before(grammarAccess.getAudioElementAccess().getGroup()); 
            // InternalCinEditor.g:469:3: ( rule__AudioElement__Group__0 )
            // InternalCinEditor.g:469:4: rule__AudioElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAudioElement"


    // $ANTLR start "entryRuleText"
    // InternalCinEditor.g:478:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalCinEditor.g:479:1: ( ruleText EOF )
            // InternalCinEditor.g:480:1: ruleText EOF
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
    // InternalCinEditor.g:487:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:491:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalCinEditor.g:492:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalCinEditor.g:492:2: ( ( rule__Text__Group__0 ) )
            // InternalCinEditor.g:493:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalCinEditor.g:494:3: ( rule__Text__Group__0 )
            // InternalCinEditor.g:494:4: rule__Text__Group__0
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
    // InternalCinEditor.g:503:1: entryRulePicture : rulePicture EOF ;
    public final void entryRulePicture() throws RecognitionException {
        try {
            // InternalCinEditor.g:504:1: ( rulePicture EOF )
            // InternalCinEditor.g:505:1: rulePicture EOF
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
    // InternalCinEditor.g:512:1: rulePicture : ( ( rule__Picture__Group__0 ) ) ;
    public final void rulePicture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:516:2: ( ( ( rule__Picture__Group__0 ) ) )
            // InternalCinEditor.g:517:2: ( ( rule__Picture__Group__0 ) )
            {
            // InternalCinEditor.g:517:2: ( ( rule__Picture__Group__0 ) )
            // InternalCinEditor.g:518:3: ( rule__Picture__Group__0 )
            {
             before(grammarAccess.getPictureAccess().getGroup()); 
            // InternalCinEditor.g:519:3: ( rule__Picture__Group__0 )
            // InternalCinEditor.g:519:4: rule__Picture__Group__0
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
    // InternalCinEditor.g:528:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalCinEditor.g:529:1: ( ruleVideo EOF )
            // InternalCinEditor.g:530:1: ruleVideo EOF
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
    // InternalCinEditor.g:537:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:541:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalCinEditor.g:542:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalCinEditor.g:542:2: ( ( rule__Video__Group__0 ) )
            // InternalCinEditor.g:543:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalCinEditor.g:544:3: ( rule__Video__Group__0 )
            // InternalCinEditor.g:544:4: rule__Video__Group__0
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


    // $ANTLR start "entryRuleRectangle"
    // InternalCinEditor.g:553:1: entryRuleRectangle : ruleRectangle EOF ;
    public final void entryRuleRectangle() throws RecognitionException {
        try {
            // InternalCinEditor.g:554:1: ( ruleRectangle EOF )
            // InternalCinEditor.g:555:1: ruleRectangle EOF
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
    // InternalCinEditor.g:562:1: ruleRectangle : ( ( rule__Rectangle__Group__0 ) ) ;
    public final void ruleRectangle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:566:2: ( ( ( rule__Rectangle__Group__0 ) ) )
            // InternalCinEditor.g:567:2: ( ( rule__Rectangle__Group__0 ) )
            {
            // InternalCinEditor.g:567:2: ( ( rule__Rectangle__Group__0 ) )
            // InternalCinEditor.g:568:3: ( rule__Rectangle__Group__0 )
            {
             before(grammarAccess.getRectangleAccess().getGroup()); 
            // InternalCinEditor.g:569:3: ( rule__Rectangle__Group__0 )
            // InternalCinEditor.g:569:4: rule__Rectangle__Group__0
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


    // $ANTLR start "entryRuleFadeIn"
    // InternalCinEditor.g:578:1: entryRuleFadeIn : ruleFadeIn EOF ;
    public final void entryRuleFadeIn() throws RecognitionException {
        try {
            // InternalCinEditor.g:579:1: ( ruleFadeIn EOF )
            // InternalCinEditor.g:580:1: ruleFadeIn EOF
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
    // InternalCinEditor.g:587:1: ruleFadeIn : ( ( rule__FadeIn__Group__0 ) ) ;
    public final void ruleFadeIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:591:2: ( ( ( rule__FadeIn__Group__0 ) ) )
            // InternalCinEditor.g:592:2: ( ( rule__FadeIn__Group__0 ) )
            {
            // InternalCinEditor.g:592:2: ( ( rule__FadeIn__Group__0 ) )
            // InternalCinEditor.g:593:3: ( rule__FadeIn__Group__0 )
            {
             before(grammarAccess.getFadeInAccess().getGroup()); 
            // InternalCinEditor.g:594:3: ( rule__FadeIn__Group__0 )
            // InternalCinEditor.g:594:4: rule__FadeIn__Group__0
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
    // InternalCinEditor.g:603:1: entryRuleFadeOut : ruleFadeOut EOF ;
    public final void entryRuleFadeOut() throws RecognitionException {
        try {
            // InternalCinEditor.g:604:1: ( ruleFadeOut EOF )
            // InternalCinEditor.g:605:1: ruleFadeOut EOF
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
    // InternalCinEditor.g:612:1: ruleFadeOut : ( ( rule__FadeOut__Group__0 ) ) ;
    public final void ruleFadeOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:616:2: ( ( ( rule__FadeOut__Group__0 ) ) )
            // InternalCinEditor.g:617:2: ( ( rule__FadeOut__Group__0 ) )
            {
            // InternalCinEditor.g:617:2: ( ( rule__FadeOut__Group__0 ) )
            // InternalCinEditor.g:618:3: ( rule__FadeOut__Group__0 )
            {
             before(grammarAccess.getFadeOutAccess().getGroup()); 
            // InternalCinEditor.g:619:3: ( rule__FadeOut__Group__0 )
            // InternalCinEditor.g:619:4: rule__FadeOut__Group__0
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
    // InternalCinEditor.g:628:1: entryRuleTranslate : ruleTranslate EOF ;
    public final void entryRuleTranslate() throws RecognitionException {
        try {
            // InternalCinEditor.g:629:1: ( ruleTranslate EOF )
            // InternalCinEditor.g:630:1: ruleTranslate EOF
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
    // InternalCinEditor.g:637:1: ruleTranslate : ( ( rule__Translate__Group__0 ) ) ;
    public final void ruleTranslate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:641:2: ( ( ( rule__Translate__Group__0 ) ) )
            // InternalCinEditor.g:642:2: ( ( rule__Translate__Group__0 ) )
            {
            // InternalCinEditor.g:642:2: ( ( rule__Translate__Group__0 ) )
            // InternalCinEditor.g:643:3: ( rule__Translate__Group__0 )
            {
             before(grammarAccess.getTranslateAccess().getGroup()); 
            // InternalCinEditor.g:644:3: ( rule__Translate__Group__0 )
            // InternalCinEditor.g:644:4: rule__Translate__Group__0
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


    // $ANTLR start "ruleMARGIN_NAME"
    // InternalCinEditor.g:653:1: ruleMARGIN_NAME : ( ( rule__MARGIN_NAME__Alternatives ) ) ;
    public final void ruleMARGIN_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:657:1: ( ( ( rule__MARGIN_NAME__Alternatives ) ) )
            // InternalCinEditor.g:658:2: ( ( rule__MARGIN_NAME__Alternatives ) )
            {
            // InternalCinEditor.g:658:2: ( ( rule__MARGIN_NAME__Alternatives ) )
            // InternalCinEditor.g:659:3: ( rule__MARGIN_NAME__Alternatives )
            {
             before(grammarAccess.getMARGIN_NAMEAccess().getAlternatives()); 
            // InternalCinEditor.g:660:3: ( rule__MARGIN_NAME__Alternatives )
            // InternalCinEditor.g:660:4: rule__MARGIN_NAME__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MARGIN_NAME__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMARGIN_NAMEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMARGIN_NAME"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalCinEditor.g:668:1: rule__Element__Alternatives : ( ( ruleGraphicalElement ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleAudioElement ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:672:1: ( ( ruleGraphicalElement ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleAudioElement ) )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCinEditor.g:673:2: ( ruleGraphicalElement )
                    {
                    // InternalCinEditor.g:673:2: ( ruleGraphicalElement )
                    // InternalCinEditor.g:674:3: ruleGraphicalElement
                    {
                     before(grammarAccess.getElementAccess().getGraphicalElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGraphicalElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getGraphicalElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:679:2: ( ruleFadeIn )
                    {
                    // InternalCinEditor.g:679:2: ( ruleFadeIn )
                    // InternalCinEditor.g:680:3: ruleFadeIn
                    {
                     before(grammarAccess.getElementAccess().getFadeInParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFadeIn();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFadeInParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCinEditor.g:685:2: ( ruleFadeOut )
                    {
                    // InternalCinEditor.g:685:2: ( ruleFadeOut )
                    // InternalCinEditor.g:686:3: ruleFadeOut
                    {
                     before(grammarAccess.getElementAccess().getFadeOutParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFadeOut();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFadeOutParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCinEditor.g:691:2: ( ruleTranslate )
                    {
                    // InternalCinEditor.g:691:2: ( ruleTranslate )
                    // InternalCinEditor.g:692:3: ruleTranslate
                    {
                     before(grammarAccess.getElementAccess().getTranslateParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTranslate();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTranslateParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCinEditor.g:697:2: ( ruleAudioElement )
                    {
                    // InternalCinEditor.g:697:2: ( ruleAudioElement )
                    // InternalCinEditor.g:698:3: ruleAudioElement
                    {
                     before(grammarAccess.getElementAccess().getAudioElementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAudioElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getAudioElementParserRuleCall_4()); 

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
    // InternalCinEditor.g:707:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:711:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCinEditor.g:712:2: ( RULE_STRING )
                    {
                    // InternalCinEditor.g:712:2: ( RULE_STRING )
                    // InternalCinEditor.g:713:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:718:2: ( RULE_ID )
                    {
                    // InternalCinEditor.g:718:2: ( RULE_ID )
                    // InternalCinEditor.g:719:3: RULE_ID
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


    // $ANTLR start "rule__ItemPosition__Alternatives"
    // InternalCinEditor.g:728:1: rule__ItemPosition__Alternatives : ( ( ruleItemPositionInt ) | ( ruleItemPositionString ) );
    public final void rule__ItemPosition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:732:1: ( ( ruleItemPositionInt ) | ( ruleItemPositionString ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==32) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=11 && LA3_0<=15)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCinEditor.g:733:2: ( ruleItemPositionInt )
                    {
                    // InternalCinEditor.g:733:2: ( ruleItemPositionInt )
                    // InternalCinEditor.g:734:3: ruleItemPositionInt
                    {
                     before(grammarAccess.getItemPositionAccess().getItemPositionIntParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleItemPositionInt();

                    state._fsp--;

                     after(grammarAccess.getItemPositionAccess().getItemPositionIntParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:739:2: ( ruleItemPositionString )
                    {
                    // InternalCinEditor.g:739:2: ( ruleItemPositionString )
                    // InternalCinEditor.g:740:3: ruleItemPositionString
                    {
                     before(grammarAccess.getItemPositionAccess().getItemPositionStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleItemPositionString();

                    state._fsp--;

                     after(grammarAccess.getItemPositionAccess().getItemPositionStringParserRuleCall_1()); 

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
    // $ANTLR end "rule__ItemPosition__Alternatives"


    // $ANTLR start "rule__ItemPositionString__PositionAlternatives_0"
    // InternalCinEditor.g:749:1: rule__ItemPositionString__PositionAlternatives_0 : ( ( 'center' ) | ( 'left' ) | ( 'right' ) | ( 'bottom' ) | ( 'top' ) );
    public final void rule__ItemPositionString__PositionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:753:1: ( ( 'center' ) | ( 'left' ) | ( 'right' ) | ( 'bottom' ) | ( 'top' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCinEditor.g:754:2: ( 'center' )
                    {
                    // InternalCinEditor.g:754:2: ( 'center' )
                    // InternalCinEditor.g:755:3: 'center'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionCenterKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionCenterKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:760:2: ( 'left' )
                    {
                    // InternalCinEditor.g:760:2: ( 'left' )
                    // InternalCinEditor.g:761:3: 'left'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionLeftKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionLeftKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCinEditor.g:766:2: ( 'right' )
                    {
                    // InternalCinEditor.g:766:2: ( 'right' )
                    // InternalCinEditor.g:767:3: 'right'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionRightKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionRightKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCinEditor.g:772:2: ( 'bottom' )
                    {
                    // InternalCinEditor.g:772:2: ( 'bottom' )
                    // InternalCinEditor.g:773:3: 'bottom'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionBottomKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionBottomKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCinEditor.g:778:2: ( 'top' )
                    {
                    // InternalCinEditor.g:778:2: ( 'top' )
                    // InternalCinEditor.g:779:3: 'top'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionTopKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionTopKeyword_0_4()); 

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
    // $ANTLR end "rule__ItemPositionString__PositionAlternatives_0"


    // $ANTLR start "rule__TemporalPosition__Alternatives"
    // InternalCinEditor.g:788:1: rule__TemporalPosition__Alternatives : ( ( ( rule__TemporalPosition__Group_0__0 ) ) | ( ( rule__TemporalPosition__Alternatives_1 ) ) );
    public final void rule__TemporalPosition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:792:1: ( ( ( rule__TemporalPosition__Group_0__0 ) ) | ( ( rule__TemporalPosition__Alternatives_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==32) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==RULE_INT) ) {
                        int LA5_4 = input.LA(4);

                        if ( (LA5_4==30) ) {
                            alt5=1;
                        }
                        else if ( (LA5_4==EOF||LA5_4==22||LA5_4==28||LA5_4==33||LA5_4==35||(LA5_4>=39 && LA5_4<=40)||(LA5_4>=43 && LA5_4<=44)||(LA5_4>=46 && LA5_4<=47)||LA5_4==49) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==RULE_INT) ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==30) ) {
                        alt5=1;
                    }
                    else if ( (LA5_4==EOF||LA5_4==22||LA5_4==28||LA5_4==33||LA5_4==35||(LA5_4>=39 && LA5_4<=40)||(LA5_4>=43 && LA5_4<=44)||(LA5_4>=46 && LA5_4<=47)||LA5_4==49) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==30) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCinEditor.g:793:2: ( ( rule__TemporalPosition__Group_0__0 ) )
                    {
                    // InternalCinEditor.g:793:2: ( ( rule__TemporalPosition__Group_0__0 ) )
                    // InternalCinEditor.g:794:3: ( rule__TemporalPosition__Group_0__0 )
                    {
                     before(grammarAccess.getTemporalPositionAccess().getGroup_0()); 
                    // InternalCinEditor.g:795:3: ( rule__TemporalPosition__Group_0__0 )
                    // InternalCinEditor.g:795:4: rule__TemporalPosition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemporalPosition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTemporalPositionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:799:2: ( ( rule__TemporalPosition__Alternatives_1 ) )
                    {
                    // InternalCinEditor.g:799:2: ( ( rule__TemporalPosition__Alternatives_1 ) )
                    // InternalCinEditor.g:800:3: ( rule__TemporalPosition__Alternatives_1 )
                    {
                     before(grammarAccess.getTemporalPositionAccess().getAlternatives_1()); 
                    // InternalCinEditor.g:801:3: ( rule__TemporalPosition__Alternatives_1 )
                    // InternalCinEditor.g:801:4: rule__TemporalPosition__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemporalPosition__Alternatives_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTemporalPositionAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__TemporalPosition__Alternatives"


    // $ANTLR start "rule__TemporalPosition__Alternatives_1"
    // InternalCinEditor.g:809:1: rule__TemporalPosition__Alternatives_1 : ( ( ( rule__TemporalPosition__Group_1_0__0 ) ) | ( ( rule__TemporalPosition__Group_1_1__0 ) ) );
    public final void rule__TemporalPosition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:813:1: ( ( ( rule__TemporalPosition__Group_1_0__0 ) ) | ( ( rule__TemporalPosition__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCinEditor.g:814:2: ( ( rule__TemporalPosition__Group_1_0__0 ) )
                    {
                    // InternalCinEditor.g:814:2: ( ( rule__TemporalPosition__Group_1_0__0 ) )
                    // InternalCinEditor.g:815:3: ( rule__TemporalPosition__Group_1_0__0 )
                    {
                     before(grammarAccess.getTemporalPositionAccess().getGroup_1_0()); 
                    // InternalCinEditor.g:816:3: ( rule__TemporalPosition__Group_1_0__0 )
                    // InternalCinEditor.g:816:4: rule__TemporalPosition__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemporalPosition__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTemporalPositionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:820:2: ( ( rule__TemporalPosition__Group_1_1__0 ) )
                    {
                    // InternalCinEditor.g:820:2: ( ( rule__TemporalPosition__Group_1_1__0 ) )
                    // InternalCinEditor.g:821:3: ( rule__TemporalPosition__Group_1_1__0 )
                    {
                     before(grammarAccess.getTemporalPositionAccess().getGroup_1_1()); 
                    // InternalCinEditor.g:822:3: ( rule__TemporalPosition__Group_1_1__0 )
                    // InternalCinEditor.g:822:4: rule__TemporalPosition__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemporalPosition__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTemporalPositionAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__TemporalPosition__Alternatives_1"


    // $ANTLR start "rule__GraphicalElement__Alternatives"
    // InternalCinEditor.g:830:1: rule__GraphicalElement__Alternatives : ( ( ruleText ) | ( ruleVideo ) | ( rulePicture ) | ( ruleRectangle ) );
    public final void rule__GraphicalElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:834:1: ( ( ruleText ) | ( ruleVideo ) | ( rulePicture ) | ( ruleRectangle ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt7=1;
                }
                break;
            case 44:
                {
                alt7=2;
                }
                break;
            case 43:
                {
                alt7=3;
                }
                break;
            case 46:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCinEditor.g:835:2: ( ruleText )
                    {
                    // InternalCinEditor.g:835:2: ( ruleText )
                    // InternalCinEditor.g:836:3: ruleText
                    {
                     before(grammarAccess.getGraphicalElementAccess().getTextParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getGraphicalElementAccess().getTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:841:2: ( ruleVideo )
                    {
                    // InternalCinEditor.g:841:2: ( ruleVideo )
                    // InternalCinEditor.g:842:3: ruleVideo
                    {
                     before(grammarAccess.getGraphicalElementAccess().getVideoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVideo();

                    state._fsp--;

                     after(grammarAccess.getGraphicalElementAccess().getVideoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCinEditor.g:847:2: ( rulePicture )
                    {
                    // InternalCinEditor.g:847:2: ( rulePicture )
                    // InternalCinEditor.g:848:3: rulePicture
                    {
                     before(grammarAccess.getGraphicalElementAccess().getPictureParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePicture();

                    state._fsp--;

                     after(grammarAccess.getGraphicalElementAccess().getPictureParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCinEditor.g:853:2: ( ruleRectangle )
                    {
                    // InternalCinEditor.g:853:2: ( ruleRectangle )
                    // InternalCinEditor.g:854:3: ruleRectangle
                    {
                     before(grammarAccess.getGraphicalElementAccess().getRectangleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRectangle();

                    state._fsp--;

                     after(grammarAccess.getGraphicalElementAccess().getRectangleParserRuleCall_3()); 

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
    // $ANTLR end "rule__GraphicalElement__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_2_0"
    // InternalCinEditor.g:863:1: rule__EFloat__Alternatives_2_0 : ( ( '.' ) | ( ',' ) );
    public final void rule__EFloat__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:867:1: ( ( '.' ) | ( ',' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCinEditor.g:868:2: ( '.' )
                    {
                    // InternalCinEditor.g:868:2: ( '.' )
                    // InternalCinEditor.g:869:3: '.'
                    {
                     before(grammarAccess.getEFloatAccess().getFullStopKeyword_2_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getFullStopKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:874:2: ( ',' )
                    {
                    // InternalCinEditor.g:874:2: ( ',' )
                    // InternalCinEditor.g:875:3: ','
                    {
                     before(grammarAccess.getEFloatAccess().getCommaKeyword_2_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getCommaKeyword_2_0_1()); 

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
    // $ANTLR end "rule__EFloat__Alternatives_2_0"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalCinEditor.g:884:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:888:1: ( ( 'true' ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCinEditor.g:889:2: ( 'true' )
                    {
                    // InternalCinEditor.g:889:2: ( 'true' )
                    // InternalCinEditor.g:890:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:895:2: ( 'false' )
                    {
                    // InternalCinEditor.g:895:2: ( 'false' )
                    // InternalCinEditor.g:896:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__MARGIN_NAME__Alternatives"
    // InternalCinEditor.g:905:1: rule__MARGIN_NAME__Alternatives : ( ( ( 'bottom' ) ) | ( ( 'left' ) ) | ( ( 'right' ) ) | ( ( 'top' ) ) );
    public final void rule__MARGIN_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:909:1: ( ( ( 'bottom' ) ) | ( ( 'left' ) ) | ( ( 'right' ) ) | ( ( 'top' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt10=1;
                }
                break;
            case 12:
                {
                alt10=2;
                }
                break;
            case 13:
                {
                alt10=3;
                }
                break;
            case 15:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalCinEditor.g:910:2: ( ( 'bottom' ) )
                    {
                    // InternalCinEditor.g:910:2: ( ( 'bottom' ) )
                    // InternalCinEditor.g:911:3: ( 'bottom' )
                    {
                     before(grammarAccess.getMARGIN_NAMEAccess().getBOTTOMEnumLiteralDeclaration_0()); 
                    // InternalCinEditor.g:912:3: ( 'bottom' )
                    // InternalCinEditor.g:912:4: 'bottom'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMARGIN_NAMEAccess().getBOTTOMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:916:2: ( ( 'left' ) )
                    {
                    // InternalCinEditor.g:916:2: ( ( 'left' ) )
                    // InternalCinEditor.g:917:3: ( 'left' )
                    {
                     before(grammarAccess.getMARGIN_NAMEAccess().getLEFTEnumLiteralDeclaration_1()); 
                    // InternalCinEditor.g:918:3: ( 'left' )
                    // InternalCinEditor.g:918:4: 'left'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMARGIN_NAMEAccess().getLEFTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCinEditor.g:922:2: ( ( 'right' ) )
                    {
                    // InternalCinEditor.g:922:2: ( ( 'right' ) )
                    // InternalCinEditor.g:923:3: ( 'right' )
                    {
                     before(grammarAccess.getMARGIN_NAMEAccess().getRIGHTEnumLiteralDeclaration_2()); 
                    // InternalCinEditor.g:924:3: ( 'right' )
                    // InternalCinEditor.g:924:4: 'right'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMARGIN_NAMEAccess().getRIGHTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCinEditor.g:928:2: ( ( 'top' ) )
                    {
                    // InternalCinEditor.g:928:2: ( ( 'top' ) )
                    // InternalCinEditor.g:929:3: ( 'top' )
                    {
                     before(grammarAccess.getMARGIN_NAMEAccess().getTOPEnumLiteralDeclaration_3()); 
                    // InternalCinEditor.g:930:3: ( 'top' )
                    // InternalCinEditor.g:930:4: 'top'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMARGIN_NAMEAccess().getTOPEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__MARGIN_NAME__Alternatives"


    // $ANTLR start "rule__Movie__Group__0"
    // InternalCinEditor.g:938:1: rule__Movie__Group__0 : rule__Movie__Group__0__Impl rule__Movie__Group__1 ;
    public final void rule__Movie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:942:1: ( rule__Movie__Group__0__Impl rule__Movie__Group__1 )
            // InternalCinEditor.g:943:2: rule__Movie__Group__0__Impl rule__Movie__Group__1
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
    // InternalCinEditor.g:950:1: rule__Movie__Group__0__Impl : ( 'Movie' ) ;
    public final void rule__Movie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:954:1: ( ( 'Movie' ) )
            // InternalCinEditor.g:955:1: ( 'Movie' )
            {
            // InternalCinEditor.g:955:1: ( 'Movie' )
            // InternalCinEditor.g:956:2: 'Movie'
            {
             before(grammarAccess.getMovieAccess().getMovieKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCinEditor.g:965:1: rule__Movie__Group__1 : rule__Movie__Group__1__Impl rule__Movie__Group__2 ;
    public final void rule__Movie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:969:1: ( rule__Movie__Group__1__Impl rule__Movie__Group__2 )
            // InternalCinEditor.g:970:2: rule__Movie__Group__1__Impl rule__Movie__Group__2
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
    // InternalCinEditor.g:977:1: rule__Movie__Group__1__Impl : ( ( rule__Movie__NameAssignment_1 ) ) ;
    public final void rule__Movie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:981:1: ( ( ( rule__Movie__NameAssignment_1 ) ) )
            // InternalCinEditor.g:982:1: ( ( rule__Movie__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:982:1: ( ( rule__Movie__NameAssignment_1 ) )
            // InternalCinEditor.g:983:2: ( rule__Movie__NameAssignment_1 )
            {
             before(grammarAccess.getMovieAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:984:2: ( rule__Movie__NameAssignment_1 )
            // InternalCinEditor.g:984:3: rule__Movie__NameAssignment_1
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
    // InternalCinEditor.g:992:1: rule__Movie__Group__2 : rule__Movie__Group__2__Impl rule__Movie__Group__3 ;
    public final void rule__Movie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:996:1: ( rule__Movie__Group__2__Impl rule__Movie__Group__3 )
            // InternalCinEditor.g:997:2: rule__Movie__Group__2__Impl rule__Movie__Group__3
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
    // InternalCinEditor.g:1004:1: rule__Movie__Group__2__Impl : ( ( rule__Movie__DimensionAssignment_2 ) ) ;
    public final void rule__Movie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1008:1: ( ( ( rule__Movie__DimensionAssignment_2 ) ) )
            // InternalCinEditor.g:1009:1: ( ( rule__Movie__DimensionAssignment_2 ) )
            {
            // InternalCinEditor.g:1009:1: ( ( rule__Movie__DimensionAssignment_2 ) )
            // InternalCinEditor.g:1010:2: ( rule__Movie__DimensionAssignment_2 )
            {
             before(grammarAccess.getMovieAccess().getDimensionAssignment_2()); 
            // InternalCinEditor.g:1011:2: ( rule__Movie__DimensionAssignment_2 )
            // InternalCinEditor.g:1011:3: rule__Movie__DimensionAssignment_2
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
    // InternalCinEditor.g:1019:1: rule__Movie__Group__3 : rule__Movie__Group__3__Impl rule__Movie__Group__4 ;
    public final void rule__Movie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1023:1: ( rule__Movie__Group__3__Impl rule__Movie__Group__4 )
            // InternalCinEditor.g:1024:2: rule__Movie__Group__3__Impl rule__Movie__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Movie__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__4();

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
    // InternalCinEditor.g:1031:1: rule__Movie__Group__3__Impl : ( ( rule__Movie__Group_3__0 )? ) ;
    public final void rule__Movie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1035:1: ( ( ( rule__Movie__Group_3__0 )? ) )
            // InternalCinEditor.g:1036:1: ( ( rule__Movie__Group_3__0 )? )
            {
            // InternalCinEditor.g:1036:1: ( ( rule__Movie__Group_3__0 )? )
            // InternalCinEditor.g:1037:2: ( rule__Movie__Group_3__0 )?
            {
             before(grammarAccess.getMovieAccess().getGroup_3()); 
            // InternalCinEditor.g:1038:2: ( rule__Movie__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCinEditor.g:1038:3: rule__Movie__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Movie__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMovieAccess().getGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Movie__Group__4"
    // InternalCinEditor.g:1046:1: rule__Movie__Group__4 : rule__Movie__Group__4__Impl ;
    public final void rule__Movie__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1050:1: ( rule__Movie__Group__4__Impl )
            // InternalCinEditor.g:1051:2: rule__Movie__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Movie__Group__4__Impl();

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
    // $ANTLR end "rule__Movie__Group__4"


    // $ANTLR start "rule__Movie__Group__4__Impl"
    // InternalCinEditor.g:1057:1: rule__Movie__Group__4__Impl : ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) ) ;
    public final void rule__Movie__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1061:1: ( ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) ) )
            // InternalCinEditor.g:1062:1: ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) )
            {
            // InternalCinEditor.g:1062:1: ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) )
            // InternalCinEditor.g:1063:2: ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* )
            {
            // InternalCinEditor.g:1063:2: ( ( rule__Movie__LayersAssignment_4 ) )
            // InternalCinEditor.g:1064:3: ( rule__Movie__LayersAssignment_4 )
            {
             before(grammarAccess.getMovieAccess().getLayersAssignment_4()); 
            // InternalCinEditor.g:1065:3: ( rule__Movie__LayersAssignment_4 )
            // InternalCinEditor.g:1065:4: rule__Movie__LayersAssignment_4
            {
            pushFollow(FOLLOW_6);
            rule__Movie__LayersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getLayersAssignment_4()); 

            }

            // InternalCinEditor.g:1068:2: ( ( rule__Movie__LayersAssignment_4 )* )
            // InternalCinEditor.g:1069:3: ( rule__Movie__LayersAssignment_4 )*
            {
             before(grammarAccess.getMovieAccess().getLayersAssignment_4()); 
            // InternalCinEditor.g:1070:3: ( rule__Movie__LayersAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCinEditor.g:1070:4: rule__Movie__LayersAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Movie__LayersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMovieAccess().getLayersAssignment_4()); 

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
    // $ANTLR end "rule__Movie__Group__4__Impl"


    // $ANTLR start "rule__Movie__Group_3__0"
    // InternalCinEditor.g:1080:1: rule__Movie__Group_3__0 : rule__Movie__Group_3__0__Impl rule__Movie__Group_3__1 ;
    public final void rule__Movie__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1084:1: ( rule__Movie__Group_3__0__Impl rule__Movie__Group_3__1 )
            // InternalCinEditor.g:1085:2: rule__Movie__Group_3__0__Impl rule__Movie__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Movie__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group_3__1();

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
    // $ANTLR end "rule__Movie__Group_3__0"


    // $ANTLR start "rule__Movie__Group_3__0__Impl"
    // InternalCinEditor.g:1092:1: rule__Movie__Group_3__0__Impl : ( 'fps' ) ;
    public final void rule__Movie__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1096:1: ( ( 'fps' ) )
            // InternalCinEditor.g:1097:1: ( 'fps' )
            {
            // InternalCinEditor.g:1097:1: ( 'fps' )
            // InternalCinEditor.g:1098:2: 'fps'
            {
             before(grammarAccess.getMovieAccess().getFpsKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getFpsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_3__0__Impl"


    // $ANTLR start "rule__Movie__Group_3__1"
    // InternalCinEditor.g:1107:1: rule__Movie__Group_3__1 : rule__Movie__Group_3__1__Impl ;
    public final void rule__Movie__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1111:1: ( rule__Movie__Group_3__1__Impl )
            // InternalCinEditor.g:1112:2: rule__Movie__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Movie__Group_3__1__Impl();

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
    // $ANTLR end "rule__Movie__Group_3__1"


    // $ANTLR start "rule__Movie__Group_3__1__Impl"
    // InternalCinEditor.g:1118:1: rule__Movie__Group_3__1__Impl : ( ( rule__Movie__FpsAssignment_3_1 ) ) ;
    public final void rule__Movie__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1122:1: ( ( ( rule__Movie__FpsAssignment_3_1 ) ) )
            // InternalCinEditor.g:1123:1: ( ( rule__Movie__FpsAssignment_3_1 ) )
            {
            // InternalCinEditor.g:1123:1: ( ( rule__Movie__FpsAssignment_3_1 ) )
            // InternalCinEditor.g:1124:2: ( rule__Movie__FpsAssignment_3_1 )
            {
             before(grammarAccess.getMovieAccess().getFpsAssignment_3_1()); 
            // InternalCinEditor.g:1125:2: ( rule__Movie__FpsAssignment_3_1 )
            // InternalCinEditor.g:1125:3: rule__Movie__FpsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Movie__FpsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getFpsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_3__1__Impl"


    // $ANTLR start "rule__Layer__Group__0"
    // InternalCinEditor.g:1134:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1138:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalCinEditor.g:1139:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
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
    // InternalCinEditor.g:1146:1: rule__Layer__Group__0__Impl : ( () ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1150:1: ( ( () ) )
            // InternalCinEditor.g:1151:1: ( () )
            {
            // InternalCinEditor.g:1151:1: ( () )
            // InternalCinEditor.g:1152:2: ()
            {
             before(grammarAccess.getLayerAccess().getLayerAction_0()); 
            // InternalCinEditor.g:1153:2: ()
            // InternalCinEditor.g:1153:3: 
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
    // InternalCinEditor.g:1161:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1165:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalCinEditor.g:1166:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalCinEditor.g:1173:1: rule__Layer__Group__1__Impl : ( 'Layer' ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1177:1: ( ( 'Layer' ) )
            // InternalCinEditor.g:1178:1: ( 'Layer' )
            {
            // InternalCinEditor.g:1178:1: ( 'Layer' )
            // InternalCinEditor.g:1179:2: 'Layer'
            {
             before(grammarAccess.getLayerAccess().getLayerKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCinEditor.g:1188:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1192:1: ( rule__Layer__Group__2__Impl )
            // InternalCinEditor.g:1193:2: rule__Layer__Group__2__Impl
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
    // InternalCinEditor.g:1199:1: rule__Layer__Group__2__Impl : ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1203:1: ( ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) ) )
            // InternalCinEditor.g:1204:1: ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) )
            {
            // InternalCinEditor.g:1204:1: ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) )
            // InternalCinEditor.g:1205:2: ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* )
            {
            // InternalCinEditor.g:1205:2: ( ( rule__Layer__ElementsAssignment_2 ) )
            // InternalCinEditor.g:1206:3: ( rule__Layer__ElementsAssignment_2 )
            {
             before(grammarAccess.getLayerAccess().getElementsAssignment_2()); 
            // InternalCinEditor.g:1207:3: ( rule__Layer__ElementsAssignment_2 )
            // InternalCinEditor.g:1207:4: rule__Layer__ElementsAssignment_2
            {
            pushFollow(FOLLOW_9);
            rule__Layer__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getElementsAssignment_2()); 

            }

            // InternalCinEditor.g:1210:2: ( ( rule__Layer__ElementsAssignment_2 )* )
            // InternalCinEditor.g:1211:3: ( rule__Layer__ElementsAssignment_2 )*
            {
             before(grammarAccess.getLayerAccess().getElementsAssignment_2()); 
            // InternalCinEditor.g:1212:3: ( rule__Layer__ElementsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33||LA13_0==40||(LA13_0>=43 && LA13_0<=44)||(LA13_0>=46 && LA13_0<=47)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCinEditor.g:1212:4: rule__Layer__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Layer__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalCinEditor.g:1222:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1226:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalCinEditor.g:1227:2: rule__Position__Group__0__Impl rule__Position__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCinEditor.g:1234:1: rule__Position__Group__0__Impl : ( 'position' ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1238:1: ( ( 'position' ) )
            // InternalCinEditor.g:1239:1: ( 'position' )
            {
            // InternalCinEditor.g:1239:1: ( 'position' )
            // InternalCinEditor.g:1240:2: 'position'
            {
             before(grammarAccess.getPositionAccess().getPositionKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCinEditor.g:1249:1: rule__Position__Group__1 : rule__Position__Group__1__Impl ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1253:1: ( rule__Position__Group__1__Impl )
            // InternalCinEditor.g:1254:2: rule__Position__Group__1__Impl
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
    // InternalCinEditor.g:1260:1: rule__Position__Group__1__Impl : ( ( rule__Position__Group_1__0 ) ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1264:1: ( ( ( rule__Position__Group_1__0 ) ) )
            // InternalCinEditor.g:1265:1: ( ( rule__Position__Group_1__0 ) )
            {
            // InternalCinEditor.g:1265:1: ( ( rule__Position__Group_1__0 ) )
            // InternalCinEditor.g:1266:2: ( rule__Position__Group_1__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup_1()); 
            // InternalCinEditor.g:1267:2: ( rule__Position__Group_1__0 )
            // InternalCinEditor.g:1267:3: rule__Position__Group_1__0
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
    // InternalCinEditor.g:1276:1: rule__Position__Group_1__0 : rule__Position__Group_1__0__Impl rule__Position__Group_1__1 ;
    public final void rule__Position__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1280:1: ( rule__Position__Group_1__0__Impl rule__Position__Group_1__1 )
            // InternalCinEditor.g:1281:2: rule__Position__Group_1__0__Impl rule__Position__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalCinEditor.g:1288:1: rule__Position__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Position__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1292:1: ( ( '(' ) )
            // InternalCinEditor.g:1293:1: ( '(' )
            {
            // InternalCinEditor.g:1293:1: ( '(' )
            // InternalCinEditor.g:1294:2: '('
            {
             before(grammarAccess.getPositionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCinEditor.g:1303:1: rule__Position__Group_1__1 : rule__Position__Group_1__1__Impl rule__Position__Group_1__2 ;
    public final void rule__Position__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1307:1: ( rule__Position__Group_1__1__Impl rule__Position__Group_1__2 )
            // InternalCinEditor.g:1308:2: rule__Position__Group_1__1__Impl rule__Position__Group_1__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalCinEditor.g:1315:1: rule__Position__Group_1__1__Impl : ( ( rule__Position__XAssignment_1_1 ) ) ;
    public final void rule__Position__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1319:1: ( ( ( rule__Position__XAssignment_1_1 ) ) )
            // InternalCinEditor.g:1320:1: ( ( rule__Position__XAssignment_1_1 ) )
            {
            // InternalCinEditor.g:1320:1: ( ( rule__Position__XAssignment_1_1 ) )
            // InternalCinEditor.g:1321:2: ( rule__Position__XAssignment_1_1 )
            {
             before(grammarAccess.getPositionAccess().getXAssignment_1_1()); 
            // InternalCinEditor.g:1322:2: ( rule__Position__XAssignment_1_1 )
            // InternalCinEditor.g:1322:3: rule__Position__XAssignment_1_1
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
    // InternalCinEditor.g:1330:1: rule__Position__Group_1__2 : rule__Position__Group_1__2__Impl rule__Position__Group_1__3 ;
    public final void rule__Position__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1334:1: ( rule__Position__Group_1__2__Impl rule__Position__Group_1__3 )
            // InternalCinEditor.g:1335:2: rule__Position__Group_1__2__Impl rule__Position__Group_1__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalCinEditor.g:1342:1: rule__Position__Group_1__2__Impl : ( ',' ) ;
    public final void rule__Position__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1346:1: ( ( ',' ) )
            // InternalCinEditor.g:1347:1: ( ',' )
            {
            // InternalCinEditor.g:1347:1: ( ',' )
            // InternalCinEditor.g:1348:2: ','
            {
             before(grammarAccess.getPositionAccess().getCommaKeyword_1_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalCinEditor.g:1357:1: rule__Position__Group_1__3 : rule__Position__Group_1__3__Impl rule__Position__Group_1__4 ;
    public final void rule__Position__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1361:1: ( rule__Position__Group_1__3__Impl rule__Position__Group_1__4 )
            // InternalCinEditor.g:1362:2: rule__Position__Group_1__3__Impl rule__Position__Group_1__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalCinEditor.g:1369:1: rule__Position__Group_1__3__Impl : ( ( rule__Position__YAssignment_1_3 ) ) ;
    public final void rule__Position__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1373:1: ( ( ( rule__Position__YAssignment_1_3 ) ) )
            // InternalCinEditor.g:1374:1: ( ( rule__Position__YAssignment_1_3 ) )
            {
            // InternalCinEditor.g:1374:1: ( ( rule__Position__YAssignment_1_3 ) )
            // InternalCinEditor.g:1375:2: ( rule__Position__YAssignment_1_3 )
            {
             before(grammarAccess.getPositionAccess().getYAssignment_1_3()); 
            // InternalCinEditor.g:1376:2: ( rule__Position__YAssignment_1_3 )
            // InternalCinEditor.g:1376:3: rule__Position__YAssignment_1_3
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
    // InternalCinEditor.g:1384:1: rule__Position__Group_1__4 : rule__Position__Group_1__4__Impl ;
    public final void rule__Position__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1388:1: ( rule__Position__Group_1__4__Impl )
            // InternalCinEditor.g:1389:2: rule__Position__Group_1__4__Impl
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
    // InternalCinEditor.g:1395:1: rule__Position__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Position__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1399:1: ( ( ')' ) )
            // InternalCinEditor.g:1400:1: ( ')' )
            {
            // InternalCinEditor.g:1400:1: ( ')' )
            // InternalCinEditor.g:1401:2: ')'
            {
             before(grammarAccess.getPositionAccess().getRightParenthesisKeyword_1_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCinEditor.g:1411:1: rule__Dimension__Group__0 : rule__Dimension__Group__0__Impl rule__Dimension__Group__1 ;
    public final void rule__Dimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1415:1: ( rule__Dimension__Group__0__Impl rule__Dimension__Group__1 )
            // InternalCinEditor.g:1416:2: rule__Dimension__Group__0__Impl rule__Dimension__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCinEditor.g:1423:1: rule__Dimension__Group__0__Impl : ( 'dimension' ) ;
    public final void rule__Dimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1427:1: ( ( 'dimension' ) )
            // InternalCinEditor.g:1428:1: ( 'dimension' )
            {
            // InternalCinEditor.g:1428:1: ( 'dimension' )
            // InternalCinEditor.g:1429:2: 'dimension'
            {
             before(grammarAccess.getDimensionAccess().getDimensionKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCinEditor.g:1438:1: rule__Dimension__Group__1 : rule__Dimension__Group__1__Impl rule__Dimension__Group__2 ;
    public final void rule__Dimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1442:1: ( rule__Dimension__Group__1__Impl rule__Dimension__Group__2 )
            // InternalCinEditor.g:1443:2: rule__Dimension__Group__1__Impl rule__Dimension__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalCinEditor.g:1450:1: rule__Dimension__Group__1__Impl : ( ( rule__Dimension__WidthAssignment_1 ) ) ;
    public final void rule__Dimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1454:1: ( ( ( rule__Dimension__WidthAssignment_1 ) ) )
            // InternalCinEditor.g:1455:1: ( ( rule__Dimension__WidthAssignment_1 ) )
            {
            // InternalCinEditor.g:1455:1: ( ( rule__Dimension__WidthAssignment_1 ) )
            // InternalCinEditor.g:1456:2: ( rule__Dimension__WidthAssignment_1 )
            {
             before(grammarAccess.getDimensionAccess().getWidthAssignment_1()); 
            // InternalCinEditor.g:1457:2: ( rule__Dimension__WidthAssignment_1 )
            // InternalCinEditor.g:1457:3: rule__Dimension__WidthAssignment_1
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
    // InternalCinEditor.g:1465:1: rule__Dimension__Group__2 : rule__Dimension__Group__2__Impl rule__Dimension__Group__3 ;
    public final void rule__Dimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1469:1: ( rule__Dimension__Group__2__Impl rule__Dimension__Group__3 )
            // InternalCinEditor.g:1470:2: rule__Dimension__Group__2__Impl rule__Dimension__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalCinEditor.g:1477:1: rule__Dimension__Group__2__Impl : ( 'x' ) ;
    public final void rule__Dimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1481:1: ( ( 'x' ) )
            // InternalCinEditor.g:1482:1: ( 'x' )
            {
            // InternalCinEditor.g:1482:1: ( 'x' )
            // InternalCinEditor.g:1483:2: 'x'
            {
             before(grammarAccess.getDimensionAccess().getXKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCinEditor.g:1492:1: rule__Dimension__Group__3 : rule__Dimension__Group__3__Impl ;
    public final void rule__Dimension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1496:1: ( rule__Dimension__Group__3__Impl )
            // InternalCinEditor.g:1497:2: rule__Dimension__Group__3__Impl
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
    // InternalCinEditor.g:1503:1: rule__Dimension__Group__3__Impl : ( ( rule__Dimension__HeightAssignment_3 ) ) ;
    public final void rule__Dimension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1507:1: ( ( ( rule__Dimension__HeightAssignment_3 ) ) )
            // InternalCinEditor.g:1508:1: ( ( rule__Dimension__HeightAssignment_3 ) )
            {
            // InternalCinEditor.g:1508:1: ( ( rule__Dimension__HeightAssignment_3 ) )
            // InternalCinEditor.g:1509:2: ( rule__Dimension__HeightAssignment_3 )
            {
             before(grammarAccess.getDimensionAccess().getHeightAssignment_3()); 
            // InternalCinEditor.g:1510:2: ( rule__Dimension__HeightAssignment_3 )
            // InternalCinEditor.g:1510:3: rule__Dimension__HeightAssignment_3
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
    // InternalCinEditor.g:1519:1: rule__HexadecimalColor__Group__0 : rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1 ;
    public final void rule__HexadecimalColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1523:1: ( rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1 )
            // InternalCinEditor.g:1524:2: rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1
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
    // InternalCinEditor.g:1531:1: rule__HexadecimalColor__Group__0__Impl : ( 'color' ) ;
    public final void rule__HexadecimalColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1535:1: ( ( 'color' ) )
            // InternalCinEditor.g:1536:1: ( 'color' )
            {
            // InternalCinEditor.g:1536:1: ( 'color' )
            // InternalCinEditor.g:1537:2: 'color'
            {
             before(grammarAccess.getHexadecimalColorAccess().getColorKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCinEditor.g:1546:1: rule__HexadecimalColor__Group__1 : rule__HexadecimalColor__Group__1__Impl ;
    public final void rule__HexadecimalColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1550:1: ( rule__HexadecimalColor__Group__1__Impl )
            // InternalCinEditor.g:1551:2: rule__HexadecimalColor__Group__1__Impl
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
    // InternalCinEditor.g:1557:1: rule__HexadecimalColor__Group__1__Impl : ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) ) ;
    public final void rule__HexadecimalColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1561:1: ( ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) ) )
            // InternalCinEditor.g:1562:1: ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) )
            {
            // InternalCinEditor.g:1562:1: ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) )
            // InternalCinEditor.g:1563:2: ( rule__HexadecimalColor__HexadecimalValueAssignment_1 )
            {
             before(grammarAccess.getHexadecimalColorAccess().getHexadecimalValueAssignment_1()); 
            // InternalCinEditor.g:1564:2: ( rule__HexadecimalColor__HexadecimalValueAssignment_1 )
            // InternalCinEditor.g:1564:3: rule__HexadecimalColor__HexadecimalValueAssignment_1
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


    // $ANTLR start "rule__TemporalPosition__Group_0__0"
    // InternalCinEditor.g:1573:1: rule__TemporalPosition__Group_0__0 : rule__TemporalPosition__Group_0__0__Impl rule__TemporalPosition__Group_0__1 ;
    public final void rule__TemporalPosition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1577:1: ( rule__TemporalPosition__Group_0__0__Impl rule__TemporalPosition__Group_0__1 )
            // InternalCinEditor.g:1578:2: rule__TemporalPosition__Group_0__0__Impl rule__TemporalPosition__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__TemporalPosition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemporalPosition__Group_0__1();

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
    // $ANTLR end "rule__TemporalPosition__Group_0__0"


    // $ANTLR start "rule__TemporalPosition__Group_0__0__Impl"
    // InternalCinEditor.g:1585:1: rule__TemporalPosition__Group_0__0__Impl : ( 'startAt' ) ;
    public final void rule__TemporalPosition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1589:1: ( ( 'startAt' ) )
            // InternalCinEditor.g:1590:1: ( 'startAt' )
            {
            // InternalCinEditor.g:1590:1: ( 'startAt' )
            // InternalCinEditor.g:1591:2: 'startAt'
            {
             before(grammarAccess.getTemporalPositionAccess().getStartAtKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTemporalPositionAccess().getStartAtKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPosition__Group_0__0__Impl"


    // $ANTLR start "rule__TemporalPosition__Group_0__1"
    // InternalCinEditor.g:1600:1: rule__TemporalPosition__Group_0__1 : rule__TemporalPosition__Group_0__1__Impl rule__TemporalPosition__Group_0__2 ;
    public final void rule__TemporalPosition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1604:1: ( rule__TemporalPosition__Group_0__1__Impl rule__TemporalPosition__Group_0__2 )
            // InternalCinEditor.g:1605:2: rule__TemporalPosition__Group_0__1__Impl rule__TemporalPosition__Group_0__2
            {
            pushFollow(FOLLOW_15);
            rule__TemporalPosition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemporalPosition__Group_0__2();

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
    // $ANTLR end "rule__TemporalPosition__Group_0__1"


    // $ANTLR start "rule__TemporalPosition__Group_0__1__Impl"
    // InternalCinEditor.g:1612:1: rule__TemporalPosition__Group_0__1__Impl : ( ( rule__TemporalPosition__BeginTimeAssignment_0_1 ) ) ;
    public final void rule__TemporalPosition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1616:1: ( ( ( rule__TemporalPosition__BeginTimeAssignment_0_1 ) ) )
            // InternalCinEditor.g:1617:1: ( ( rule__TemporalPosition__BeginTimeAssignment_0_1 ) )
            {
            // InternalCinEditor.g:1617:1: ( ( rule__TemporalPosition__BeginTimeAssignment_0_1 ) )
            // InternalCinEditor.g:1618:2: ( rule__TemporalPosition__BeginTimeAssignment_0_1 )
            {
             before(grammarAccess.getTemporalPositionAccess().getBeginTimeAssignment_0_1()); 
            // InternalCinEditor.g:1619:2: ( rule__TemporalPosition__BeginTimeAssignment_0_1 )
            // InternalCinEditor.g:1619:3: rule__TemporalPosition__BeginTimeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPosition__BeginTimeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTemporalPositionAccess().getBeginTimeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPosition__Group_0__1__Impl"


    // $ANTLR start "rule__TemporalPosition__Group_0__2"
    // InternalCinEditor.g:1627:1: rule__TemporalPosition__Group_0__2 : rule__TemporalPosition__Group_0__2__Impl rule__TemporalPosition__Group_0__3 ;
    public final void rule__TemporalPosition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1631:1: ( rule__TemporalPosition__Group_0__2__Impl rule__TemporalPosition__Group_0__3 )
            // InternalCinEditor.g:1632:2: rule__TemporalPosition__Group_0__2__Impl rule__TemporalPosition__Group_0__3
            {
            pushFollow(FOLLOW_16);
            rule__TemporalPosition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemporalPosition__Group_0__3();

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
    // $ANTLR end "rule__TemporalPosition__Group_0__2"


    // $ANTLR start "rule__TemporalPosition__Group_0__2__Impl"
    // InternalCinEditor.g:1639:1: rule__TemporalPosition__Group_0__2__Impl : ( 'startAfter' ) ;
    public final void rule__TemporalPosition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1643:1: ( ( 'startAfter' ) )
            // InternalCinEditor.g:1644:1: ( 'startAfter' )
            {
            // InternalCinEditor.g:1644:1: ( 'startAfter' )
            // InternalCinEditor.g:1645:2: 'startAfter'
            {
             before(grammarAccess.getTemporalPositionAccess().getStartAfterKeyword_0_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTemporalPositionAccess().getStartAfterKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPosition__Group_0__2__Impl"


    // $ANTLR start "rule__TemporalPosition__Group_0__3"
    // InternalCinEditor.g:1654:1: rule__TemporalPosition__Group_0__3 : rule__TemporalPosition__Group_0__3__Impl ;
    public final void rule__TemporalPosition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1658:1: ( rule__TemporalPosition__Group_0__3__Impl )
            // InternalCinEditor.g:1659:2: rule__TemporalPosition__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPosition__Group_0__3__Impl();

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
    // $ANTLR end "rule__TemporalPosition__Group_0__3"


    // $ANTLR start "rule__TemporalPosition__Group_0__3__Impl"
    // InternalCinEditor.g:1665:1: rule__TemporalPosition__Group_0__3__Impl : ( ( rule__TemporalPosition__ElementToStartAfterAssignment_0_3 ) ) ;
    public final void rule__TemporalPosition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1669:1: ( ( ( rule__TemporalPosition__ElementToStartAfterAssignment_0_3 ) ) )
            // InternalCinEditor.g:1670:1: ( ( rule__TemporalPosition__ElementToStartAfterAssignment_0_3 ) )
            {
            // InternalCinEditor.g:1670:1: ( ( rule__TemporalPosition__ElementToStartAfterAssignment_0_3 ) )
            // InternalCinEditor.g:1671:2: ( rule__TemporalPosition__ElementToStartAfterAssignment_0_3 )
            {
             before(grammarAccess.getTemporalPositionAccess().getElementToStartAfterAssignment_0_3()); 
            // InternalCinEditor.g:1672:2: ( rule__TemporalPosition__ElementToStartAfterAssignment_0_3 )
            // InternalCinEditor.g:1672:3: rule__TemporalPosition__ElementToStartAfterAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPosition__ElementToStartAfterAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getTemporalPositionAccess().getElementToStartAfterAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPosition__Group_0__3__Impl"


    // $ANTLR start "rule__TemporalPosition__Group_1_0__0"
    // InternalCinEditor.g:1681:1: rule__TemporalPosition__Group_1_0__0 : rule__TemporalPosition__Group_1_0__0__Impl rule__TemporalPosition__Group_1_0__1 ;
    public final void rule__TemporalPosition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1685:1: ( rule__TemporalPosition__Group_1_0__0__Impl rule__TemporalPosition__Group_1_0__1 )
            // InternalCinEditor.g:1686:2: rule__TemporalPosition__Group_1_0__0__Impl rule__TemporalPosition__Group_1_0__1
            {
            pushFollow(FOLLOW_7);
            rule__TemporalPosition__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemporalPosition__Group_1_0__1();

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
    // $ANTLR end "rule__TemporalPosition__Group_1_0__0"


    // $ANTLR start "rule__TemporalPosition__Group_1_0__0__Impl"
    // InternalCinEditor.g:1693:1: rule__TemporalPosition__Group_1_0__0__Impl : ( 'startAt' ) ;
    public final void rule__TemporalPosition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1697:1: ( ( 'startAt' ) )
            // InternalCinEditor.g:1698:1: ( 'startAt' )
            {
            // InternalCinEditor.g:1698:1: ( 'startAt' )
            // InternalCinEditor.g:1699:2: 'startAt'
            {
             before(grammarAccess.getTemporalPositionAccess().getStartAtKeyword_1_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTemporalPositionAccess().getStartAtKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPosition__Group_1_0__0__Impl"


    // $ANTLR start "rule__TemporalPosition__Group_1_0__1"
    // InternalCinEditor.g:1708:1: rule__TemporalPosition__Group_1_0__1 : rule__TemporalPosition__Group_1_0__1__Impl ;
    public final void rule__TemporalPosition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1712:1: ( rule__TemporalPosition__Group_1_0__1__Impl )
            // InternalCinEditor.g:1713:2: rule__TemporalPosition__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPosition__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__TemporalPosition__Group_1_0__1"


    // $ANTLR start "rule__TemporalPosition__Group_1_0__1__Impl"
    // InternalCinEditor.g:1719:1: rule__TemporalPosition__Group_1_0__1__Impl : ( ( rule__TemporalPosition__BeginTimeAssignment_1_0_1 ) ) ;
    public final void rule__TemporalPosition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1723:1: ( ( ( rule__TemporalPosition__BeginTimeAssignment_1_0_1 ) ) )
            // InternalCinEditor.g:1724:1: ( ( rule__TemporalPosition__BeginTimeAssignment_1_0_1 ) )
            {
            // InternalCinEditor.g:1724:1: ( ( rule__TemporalPosition__BeginTimeAssignment_1_0_1 ) )
            // InternalCinEditor.g:1725:2: ( rule__TemporalPosition__BeginTimeAssignment_1_0_1 )
            {
             before(grammarAccess.getTemporalPositionAccess().getBeginTimeAssignment_1_0_1()); 
            // InternalCinEditor.g:1726:2: ( rule__TemporalPosition__BeginTimeAssignment_1_0_1 )
            // InternalCinEditor.g:1726:3: rule__TemporalPosition__BeginTimeAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPosition__BeginTimeAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTemporalPositionAccess().getBeginTimeAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPosition__Group_1_0__1__Impl"


    // $ANTLR start "rule__TemporalPosition__Group_1_1__0"
    // InternalCinEditor.g:1735:1: rule__TemporalPosition__Group_1_1__0 : rule__TemporalPosition__Group_1_1__0__Impl rule__TemporalPosition__Group_1_1__1 ;
    public final void rule__TemporalPosition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1739:1: ( rule__TemporalPosition__Group_1_1__0__Impl rule__TemporalPosition__Group_1_1__1 )
            // InternalCinEditor.g:1740:2: rule__TemporalPosition__Group_1_1__0__Impl rule__TemporalPosition__Group_1_1__1
            {
            pushFollow(FOLLOW_16);
            rule__TemporalPosition__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemporalPosition__Group_1_1__1();

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
    // $ANTLR end "rule__TemporalPosition__Group_1_1__0"


    // $ANTLR start "rule__TemporalPosition__Group_1_1__0__Impl"
    // InternalCinEditor.g:1747:1: rule__TemporalPosition__Group_1_1__0__Impl : ( 'startAfter' ) ;
    public final void rule__TemporalPosition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1751:1: ( ( 'startAfter' ) )
            // InternalCinEditor.g:1752:1: ( 'startAfter' )
            {
            // InternalCinEditor.g:1752:1: ( 'startAfter' )
            // InternalCinEditor.g:1753:2: 'startAfter'
            {
             before(grammarAccess.getTemporalPositionAccess().getStartAfterKeyword_1_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTemporalPositionAccess().getStartAfterKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPosition__Group_1_1__0__Impl"


    // $ANTLR start "rule__TemporalPosition__Group_1_1__1"
    // InternalCinEditor.g:1762:1: rule__TemporalPosition__Group_1_1__1 : rule__TemporalPosition__Group_1_1__1__Impl ;
    public final void rule__TemporalPosition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1766:1: ( rule__TemporalPosition__Group_1_1__1__Impl )
            // InternalCinEditor.g:1767:2: rule__TemporalPosition__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPosition__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__TemporalPosition__Group_1_1__1"


    // $ANTLR start "rule__TemporalPosition__Group_1_1__1__Impl"
    // InternalCinEditor.g:1773:1: rule__TemporalPosition__Group_1_1__1__Impl : ( ( rule__TemporalPosition__ElementToStartAfterAssignment_1_1_1 ) ) ;
    public final void rule__TemporalPosition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1777:1: ( ( ( rule__TemporalPosition__ElementToStartAfterAssignment_1_1_1 ) ) )
            // InternalCinEditor.g:1778:1: ( ( rule__TemporalPosition__ElementToStartAfterAssignment_1_1_1 ) )
            {
            // InternalCinEditor.g:1778:1: ( ( rule__TemporalPosition__ElementToStartAfterAssignment_1_1_1 ) )
            // InternalCinEditor.g:1779:2: ( rule__TemporalPosition__ElementToStartAfterAssignment_1_1_1 )
            {
             before(grammarAccess.getTemporalPositionAccess().getElementToStartAfterAssignment_1_1_1()); 
            // InternalCinEditor.g:1780:2: ( rule__TemporalPosition__ElementToStartAfterAssignment_1_1_1 )
            // InternalCinEditor.g:1780:3: rule__TemporalPosition__ElementToStartAfterAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPosition__ElementToStartAfterAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTemporalPositionAccess().getElementToStartAfterAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPosition__Group_1_1__1__Impl"


    // $ANTLR start "rule__Margin__Group__0"
    // InternalCinEditor.g:1789:1: rule__Margin__Group__0 : rule__Margin__Group__0__Impl rule__Margin__Group__1 ;
    public final void rule__Margin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1793:1: ( rule__Margin__Group__0__Impl rule__Margin__Group__1 )
            // InternalCinEditor.g:1794:2: rule__Margin__Group__0__Impl rule__Margin__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Margin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Margin__Group__1();

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
    // $ANTLR end "rule__Margin__Group__0"


    // $ANTLR start "rule__Margin__Group__0__Impl"
    // InternalCinEditor.g:1801:1: rule__Margin__Group__0__Impl : ( ( rule__Margin__TypeAssignment_0 ) ) ;
    public final void rule__Margin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1805:1: ( ( ( rule__Margin__TypeAssignment_0 ) ) )
            // InternalCinEditor.g:1806:1: ( ( rule__Margin__TypeAssignment_0 ) )
            {
            // InternalCinEditor.g:1806:1: ( ( rule__Margin__TypeAssignment_0 ) )
            // InternalCinEditor.g:1807:2: ( rule__Margin__TypeAssignment_0 )
            {
             before(grammarAccess.getMarginAccess().getTypeAssignment_0()); 
            // InternalCinEditor.g:1808:2: ( rule__Margin__TypeAssignment_0 )
            // InternalCinEditor.g:1808:3: rule__Margin__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Margin__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMarginAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Margin__Group__0__Impl"


    // $ANTLR start "rule__Margin__Group__1"
    // InternalCinEditor.g:1816:1: rule__Margin__Group__1 : rule__Margin__Group__1__Impl rule__Margin__Group__2 ;
    public final void rule__Margin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1820:1: ( rule__Margin__Group__1__Impl rule__Margin__Group__2 )
            // InternalCinEditor.g:1821:2: rule__Margin__Group__1__Impl rule__Margin__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Margin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Margin__Group__2();

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
    // $ANTLR end "rule__Margin__Group__1"


    // $ANTLR start "rule__Margin__Group__1__Impl"
    // InternalCinEditor.g:1828:1: rule__Margin__Group__1__Impl : ( '(' ) ;
    public final void rule__Margin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1832:1: ( ( '(' ) )
            // InternalCinEditor.g:1833:1: ( '(' )
            {
            // InternalCinEditor.g:1833:1: ( '(' )
            // InternalCinEditor.g:1834:2: '('
            {
             before(grammarAccess.getMarginAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMarginAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Margin__Group__1__Impl"


    // $ANTLR start "rule__Margin__Group__2"
    // InternalCinEditor.g:1843:1: rule__Margin__Group__2 : rule__Margin__Group__2__Impl rule__Margin__Group__3 ;
    public final void rule__Margin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1847:1: ( rule__Margin__Group__2__Impl rule__Margin__Group__3 )
            // InternalCinEditor.g:1848:2: rule__Margin__Group__2__Impl rule__Margin__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Margin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Margin__Group__3();

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
    // $ANTLR end "rule__Margin__Group__2"


    // $ANTLR start "rule__Margin__Group__2__Impl"
    // InternalCinEditor.g:1855:1: rule__Margin__Group__2__Impl : ( ( rule__Margin__SizeAssignment_2 ) ) ;
    public final void rule__Margin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1859:1: ( ( ( rule__Margin__SizeAssignment_2 ) ) )
            // InternalCinEditor.g:1860:1: ( ( rule__Margin__SizeAssignment_2 ) )
            {
            // InternalCinEditor.g:1860:1: ( ( rule__Margin__SizeAssignment_2 ) )
            // InternalCinEditor.g:1861:2: ( rule__Margin__SizeAssignment_2 )
            {
             before(grammarAccess.getMarginAccess().getSizeAssignment_2()); 
            // InternalCinEditor.g:1862:2: ( rule__Margin__SizeAssignment_2 )
            // InternalCinEditor.g:1862:3: rule__Margin__SizeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Margin__SizeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMarginAccess().getSizeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Margin__Group__2__Impl"


    // $ANTLR start "rule__Margin__Group__3"
    // InternalCinEditor.g:1870:1: rule__Margin__Group__3 : rule__Margin__Group__3__Impl rule__Margin__Group__4 ;
    public final void rule__Margin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1874:1: ( rule__Margin__Group__3__Impl rule__Margin__Group__4 )
            // InternalCinEditor.g:1875:2: rule__Margin__Group__3__Impl rule__Margin__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Margin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Margin__Group__4();

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
    // $ANTLR end "rule__Margin__Group__3"


    // $ANTLR start "rule__Margin__Group__3__Impl"
    // InternalCinEditor.g:1882:1: rule__Margin__Group__3__Impl : ( ( rule__Margin__MarginColorAssignment_3 )? ) ;
    public final void rule__Margin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1886:1: ( ( ( rule__Margin__MarginColorAssignment_3 )? ) )
            // InternalCinEditor.g:1887:1: ( ( rule__Margin__MarginColorAssignment_3 )? )
            {
            // InternalCinEditor.g:1887:1: ( ( rule__Margin__MarginColorAssignment_3 )? )
            // InternalCinEditor.g:1888:2: ( rule__Margin__MarginColorAssignment_3 )?
            {
             before(grammarAccess.getMarginAccess().getMarginColorAssignment_3()); 
            // InternalCinEditor.g:1889:2: ( rule__Margin__MarginColorAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCinEditor.g:1889:3: rule__Margin__MarginColorAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Margin__MarginColorAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMarginAccess().getMarginColorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Margin__Group__3__Impl"


    // $ANTLR start "rule__Margin__Group__4"
    // InternalCinEditor.g:1897:1: rule__Margin__Group__4 : rule__Margin__Group__4__Impl rule__Margin__Group__5 ;
    public final void rule__Margin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1901:1: ( rule__Margin__Group__4__Impl rule__Margin__Group__5 )
            // InternalCinEditor.g:1902:2: rule__Margin__Group__4__Impl rule__Margin__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Margin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Margin__Group__5();

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
    // $ANTLR end "rule__Margin__Group__4"


    // $ANTLR start "rule__Margin__Group__4__Impl"
    // InternalCinEditor.g:1909:1: rule__Margin__Group__4__Impl : ( ( rule__Margin__Group_4__0 )? ) ;
    public final void rule__Margin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1913:1: ( ( ( rule__Margin__Group_4__0 )? ) )
            // InternalCinEditor.g:1914:1: ( ( rule__Margin__Group_4__0 )? )
            {
            // InternalCinEditor.g:1914:1: ( ( rule__Margin__Group_4__0 )? )
            // InternalCinEditor.g:1915:2: ( rule__Margin__Group_4__0 )?
            {
             before(grammarAccess.getMarginAccess().getGroup_4()); 
            // InternalCinEditor.g:1916:2: ( rule__Margin__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCinEditor.g:1916:3: rule__Margin__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Margin__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMarginAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Margin__Group__4__Impl"


    // $ANTLR start "rule__Margin__Group__5"
    // InternalCinEditor.g:1924:1: rule__Margin__Group__5 : rule__Margin__Group__5__Impl ;
    public final void rule__Margin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1928:1: ( rule__Margin__Group__5__Impl )
            // InternalCinEditor.g:1929:2: rule__Margin__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Margin__Group__5__Impl();

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
    // $ANTLR end "rule__Margin__Group__5"


    // $ANTLR start "rule__Margin__Group__5__Impl"
    // InternalCinEditor.g:1935:1: rule__Margin__Group__5__Impl : ( ')' ) ;
    public final void rule__Margin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1939:1: ( ( ')' ) )
            // InternalCinEditor.g:1940:1: ( ')' )
            {
            // InternalCinEditor.g:1940:1: ( ')' )
            // InternalCinEditor.g:1941:2: ')'
            {
             before(grammarAccess.getMarginAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMarginAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Margin__Group__5__Impl"


    // $ANTLR start "rule__Margin__Group_4__0"
    // InternalCinEditor.g:1951:1: rule__Margin__Group_4__0 : rule__Margin__Group_4__0__Impl rule__Margin__Group_4__1 ;
    public final void rule__Margin__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1955:1: ( rule__Margin__Group_4__0__Impl rule__Margin__Group_4__1 )
            // InternalCinEditor.g:1956:2: rule__Margin__Group_4__0__Impl rule__Margin__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Margin__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Margin__Group_4__1();

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
    // $ANTLR end "rule__Margin__Group_4__0"


    // $ANTLR start "rule__Margin__Group_4__0__Impl"
    // InternalCinEditor.g:1963:1: rule__Margin__Group_4__0__Impl : ( 'opacity' ) ;
    public final void rule__Margin__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1967:1: ( ( 'opacity' ) )
            // InternalCinEditor.g:1968:1: ( 'opacity' )
            {
            // InternalCinEditor.g:1968:1: ( 'opacity' )
            // InternalCinEditor.g:1969:2: 'opacity'
            {
             before(grammarAccess.getMarginAccess().getOpacityKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMarginAccess().getOpacityKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Margin__Group_4__0__Impl"


    // $ANTLR start "rule__Margin__Group_4__1"
    // InternalCinEditor.g:1978:1: rule__Margin__Group_4__1 : rule__Margin__Group_4__1__Impl ;
    public final void rule__Margin__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1982:1: ( rule__Margin__Group_4__1__Impl )
            // InternalCinEditor.g:1983:2: rule__Margin__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Margin__Group_4__1__Impl();

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
    // $ANTLR end "rule__Margin__Group_4__1"


    // $ANTLR start "rule__Margin__Group_4__1__Impl"
    // InternalCinEditor.g:1989:1: rule__Margin__Group_4__1__Impl : ( ( rule__Margin__MarginColorOpacityAssignment_4_1 ) ) ;
    public final void rule__Margin__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1993:1: ( ( ( rule__Margin__MarginColorOpacityAssignment_4_1 ) ) )
            // InternalCinEditor.g:1994:1: ( ( rule__Margin__MarginColorOpacityAssignment_4_1 ) )
            {
            // InternalCinEditor.g:1994:1: ( ( rule__Margin__MarginColorOpacityAssignment_4_1 ) )
            // InternalCinEditor.g:1995:2: ( rule__Margin__MarginColorOpacityAssignment_4_1 )
            {
             before(grammarAccess.getMarginAccess().getMarginColorOpacityAssignment_4_1()); 
            // InternalCinEditor.g:1996:2: ( rule__Margin__MarginColorOpacityAssignment_4_1 )
            // InternalCinEditor.g:1996:3: rule__Margin__MarginColorOpacityAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Margin__MarginColorOpacityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMarginAccess().getMarginColorOpacityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Margin__Group_4__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalCinEditor.g:2005:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2009:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalCinEditor.g:2010:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCinEditor.g:2017:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2021:1: ( ( ( '-' )? ) )
            // InternalCinEditor.g:2022:1: ( ( '-' )? )
            {
            // InternalCinEditor.g:2022:1: ( ( '-' )? )
            // InternalCinEditor.g:2023:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalCinEditor.g:2024:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCinEditor.g:2024:3: '-'
                    {
                    match(input,32,FOLLOW_2); 

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
    // InternalCinEditor.g:2032:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2036:1: ( rule__EInt__Group__1__Impl )
            // InternalCinEditor.g:2037:2: rule__EInt__Group__1__Impl
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
    // InternalCinEditor.g:2043:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2047:1: ( ( RULE_INT ) )
            // InternalCinEditor.g:2048:1: ( RULE_INT )
            {
            // InternalCinEditor.g:2048:1: ( RULE_INT )
            // InternalCinEditor.g:2049:2: RULE_INT
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


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalCinEditor.g:2059:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2063:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalCinEditor.g:2064:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

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
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalCinEditor.g:2071:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2075:1: ( ( ( '-' )? ) )
            // InternalCinEditor.g:2076:1: ( ( '-' )? )
            {
            // InternalCinEditor.g:2076:1: ( ( '-' )? )
            // InternalCinEditor.g:2077:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalCinEditor.g:2078:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCinEditor.g:2078:3: '-'
                    {
                    match(input,32,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalCinEditor.g:2086:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2090:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalCinEditor.g:2091:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

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
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalCinEditor.g:2098:1: rule__EFloat__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2102:1: ( ( RULE_INT ) )
            // InternalCinEditor.g:2103:1: ( RULE_INT )
            {
            // InternalCinEditor.g:2103:1: ( RULE_INT )
            // InternalCinEditor.g:2104:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalCinEditor.g:2113:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2117:1: ( rule__EFloat__Group__2__Impl )
            // InternalCinEditor.g:2118:2: rule__EFloat__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2__Impl();

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
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalCinEditor.g:2124:1: rule__EFloat__Group__2__Impl : ( ( rule__EFloat__Group_2__0 )? ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2128:1: ( ( ( rule__EFloat__Group_2__0 )? ) )
            // InternalCinEditor.g:2129:1: ( ( rule__EFloat__Group_2__0 )? )
            {
            // InternalCinEditor.g:2129:1: ( ( rule__EFloat__Group_2__0 )? )
            // InternalCinEditor.g:2130:2: ( rule__EFloat__Group_2__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_2()); 
            // InternalCinEditor.g:2131:2: ( rule__EFloat__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=16 && LA18_0<=17)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCinEditor.g:2131:3: rule__EFloat__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group_2__0"
    // InternalCinEditor.g:2140:1: rule__EFloat__Group_2__0 : rule__EFloat__Group_2__0__Impl rule__EFloat__Group_2__1 ;
    public final void rule__EFloat__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2144:1: ( rule__EFloat__Group_2__0__Impl rule__EFloat__Group_2__1 )
            // InternalCinEditor.g:2145:2: rule__EFloat__Group_2__0__Impl rule__EFloat__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__EFloat__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_2__1();

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
    // $ANTLR end "rule__EFloat__Group_2__0"


    // $ANTLR start "rule__EFloat__Group_2__0__Impl"
    // InternalCinEditor.g:2152:1: rule__EFloat__Group_2__0__Impl : ( ( rule__EFloat__Alternatives_2_0 ) ) ;
    public final void rule__EFloat__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2156:1: ( ( ( rule__EFloat__Alternatives_2_0 ) ) )
            // InternalCinEditor.g:2157:1: ( ( rule__EFloat__Alternatives_2_0 ) )
            {
            // InternalCinEditor.g:2157:1: ( ( rule__EFloat__Alternatives_2_0 ) )
            // InternalCinEditor.g:2158:2: ( rule__EFloat__Alternatives_2_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_2_0()); 
            // InternalCinEditor.g:2159:2: ( rule__EFloat__Alternatives_2_0 )
            // InternalCinEditor.g:2159:3: rule__EFloat__Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_2__0__Impl"


    // $ANTLR start "rule__EFloat__Group_2__1"
    // InternalCinEditor.g:2167:1: rule__EFloat__Group_2__1 : rule__EFloat__Group_2__1__Impl ;
    public final void rule__EFloat__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2171:1: ( rule__EFloat__Group_2__1__Impl )
            // InternalCinEditor.g:2172:2: rule__EFloat__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_2__1__Impl();

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
    // $ANTLR end "rule__EFloat__Group_2__1"


    // $ANTLR start "rule__EFloat__Group_2__1__Impl"
    // InternalCinEditor.g:2178:1: rule__EFloat__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2182:1: ( ( RULE_INT ) )
            // InternalCinEditor.g:2183:1: ( RULE_INT )
            {
            // InternalCinEditor.g:2183:1: ( RULE_INT )
            // InternalCinEditor.g:2184:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_2__1__Impl"


    // $ANTLR start "rule__AudioElement__Group__0"
    // InternalCinEditor.g:2194:1: rule__AudioElement__Group__0 : rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1 ;
    public final void rule__AudioElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2198:1: ( rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1 )
            // InternalCinEditor.g:2199:2: rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AudioElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__1();

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
    // $ANTLR end "rule__AudioElement__Group__0"


    // $ANTLR start "rule__AudioElement__Group__0__Impl"
    // InternalCinEditor.g:2206:1: rule__AudioElement__Group__0__Impl : ( 'Audio' ) ;
    public final void rule__AudioElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2210:1: ( ( 'Audio' ) )
            // InternalCinEditor.g:2211:1: ( 'Audio' )
            {
            // InternalCinEditor.g:2211:1: ( 'Audio' )
            // InternalCinEditor.g:2212:2: 'Audio'
            {
             before(grammarAccess.getAudioElementAccess().getAudioKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getAudioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__0__Impl"


    // $ANTLR start "rule__AudioElement__Group__1"
    // InternalCinEditor.g:2221:1: rule__AudioElement__Group__1 : rule__AudioElement__Group__1__Impl rule__AudioElement__Group__2 ;
    public final void rule__AudioElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2225:1: ( rule__AudioElement__Group__1__Impl rule__AudioElement__Group__2 )
            // InternalCinEditor.g:2226:2: rule__AudioElement__Group__1__Impl rule__AudioElement__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__AudioElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__2();

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
    // $ANTLR end "rule__AudioElement__Group__1"


    // $ANTLR start "rule__AudioElement__Group__1__Impl"
    // InternalCinEditor.g:2233:1: rule__AudioElement__Group__1__Impl : ( ( rule__AudioElement__NameAssignment_1 ) ) ;
    public final void rule__AudioElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2237:1: ( ( ( rule__AudioElement__NameAssignment_1 ) ) )
            // InternalCinEditor.g:2238:1: ( ( rule__AudioElement__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:2238:1: ( ( rule__AudioElement__NameAssignment_1 ) )
            // InternalCinEditor.g:2239:2: ( rule__AudioElement__NameAssignment_1 )
            {
             before(grammarAccess.getAudioElementAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:2240:2: ( rule__AudioElement__NameAssignment_1 )
            // InternalCinEditor.g:2240:3: rule__AudioElement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__1__Impl"


    // $ANTLR start "rule__AudioElement__Group__2"
    // InternalCinEditor.g:2248:1: rule__AudioElement__Group__2 : rule__AudioElement__Group__2__Impl rule__AudioElement__Group__3 ;
    public final void rule__AudioElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2252:1: ( rule__AudioElement__Group__2__Impl rule__AudioElement__Group__3 )
            // InternalCinEditor.g:2253:2: rule__AudioElement__Group__2__Impl rule__AudioElement__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__AudioElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__3();

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
    // $ANTLR end "rule__AudioElement__Group__2"


    // $ANTLR start "rule__AudioElement__Group__2__Impl"
    // InternalCinEditor.g:2260:1: rule__AudioElement__Group__2__Impl : ( '=' ) ;
    public final void rule__AudioElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2264:1: ( ( '=' ) )
            // InternalCinEditor.g:2265:1: ( '=' )
            {
            // InternalCinEditor.g:2265:1: ( '=' )
            // InternalCinEditor.g:2266:2: '='
            {
             before(grammarAccess.getAudioElementAccess().getEqualsSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__2__Impl"


    // $ANTLR start "rule__AudioElement__Group__3"
    // InternalCinEditor.g:2275:1: rule__AudioElement__Group__3 : rule__AudioElement__Group__3__Impl rule__AudioElement__Group__4 ;
    public final void rule__AudioElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2279:1: ( rule__AudioElement__Group__3__Impl rule__AudioElement__Group__4 )
            // InternalCinEditor.g:2280:2: rule__AudioElement__Group__3__Impl rule__AudioElement__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__AudioElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__4();

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
    // $ANTLR end "rule__AudioElement__Group__3"


    // $ANTLR start "rule__AudioElement__Group__3__Impl"
    // InternalCinEditor.g:2287:1: rule__AudioElement__Group__3__Impl : ( ( rule__AudioElement__UrlAssignment_3 ) ) ;
    public final void rule__AudioElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2291:1: ( ( ( rule__AudioElement__UrlAssignment_3 ) ) )
            // InternalCinEditor.g:2292:1: ( ( rule__AudioElement__UrlAssignment_3 ) )
            {
            // InternalCinEditor.g:2292:1: ( ( rule__AudioElement__UrlAssignment_3 ) )
            // InternalCinEditor.g:2293:2: ( rule__AudioElement__UrlAssignment_3 )
            {
             before(grammarAccess.getAudioElementAccess().getUrlAssignment_3()); 
            // InternalCinEditor.g:2294:2: ( rule__AudioElement__UrlAssignment_3 )
            // InternalCinEditor.g:2294:3: rule__AudioElement__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__3__Impl"


    // $ANTLR start "rule__AudioElement__Group__4"
    // InternalCinEditor.g:2302:1: rule__AudioElement__Group__4 : rule__AudioElement__Group__4__Impl rule__AudioElement__Group__5 ;
    public final void rule__AudioElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2306:1: ( rule__AudioElement__Group__4__Impl rule__AudioElement__Group__5 )
            // InternalCinEditor.g:2307:2: rule__AudioElement__Group__4__Impl rule__AudioElement__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__AudioElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__5();

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
    // $ANTLR end "rule__AudioElement__Group__4"


    // $ANTLR start "rule__AudioElement__Group__4__Impl"
    // InternalCinEditor.g:2314:1: rule__AudioElement__Group__4__Impl : ( ( rule__AudioElement__Group_4__0 )? ) ;
    public final void rule__AudioElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2318:1: ( ( ( rule__AudioElement__Group_4__0 )? ) )
            // InternalCinEditor.g:2319:1: ( ( rule__AudioElement__Group_4__0 )? )
            {
            // InternalCinEditor.g:2319:1: ( ( rule__AudioElement__Group_4__0 )? )
            // InternalCinEditor.g:2320:2: ( rule__AudioElement__Group_4__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_4()); 
            // InternalCinEditor.g:2321:2: ( rule__AudioElement__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCinEditor.g:2321:3: rule__AudioElement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AudioElement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioElementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__4__Impl"


    // $ANTLR start "rule__AudioElement__Group__5"
    // InternalCinEditor.g:2329:1: rule__AudioElement__Group__5 : rule__AudioElement__Group__5__Impl rule__AudioElement__Group__6 ;
    public final void rule__AudioElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2333:1: ( rule__AudioElement__Group__5__Impl rule__AudioElement__Group__6 )
            // InternalCinEditor.g:2334:2: rule__AudioElement__Group__5__Impl rule__AudioElement__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__AudioElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__6();

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
    // $ANTLR end "rule__AudioElement__Group__5"


    // $ANTLR start "rule__AudioElement__Group__5__Impl"
    // InternalCinEditor.g:2341:1: rule__AudioElement__Group__5__Impl : ( ( rule__AudioElement__Group_5__0 )? ) ;
    public final void rule__AudioElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2345:1: ( ( ( rule__AudioElement__Group_5__0 )? ) )
            // InternalCinEditor.g:2346:1: ( ( rule__AudioElement__Group_5__0 )? )
            {
            // InternalCinEditor.g:2346:1: ( ( rule__AudioElement__Group_5__0 )? )
            // InternalCinEditor.g:2347:2: ( rule__AudioElement__Group_5__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_5()); 
            // InternalCinEditor.g:2348:2: ( rule__AudioElement__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCinEditor.g:2348:3: rule__AudioElement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AudioElement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioElementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__5__Impl"


    // $ANTLR start "rule__AudioElement__Group__6"
    // InternalCinEditor.g:2356:1: rule__AudioElement__Group__6 : rule__AudioElement__Group__6__Impl rule__AudioElement__Group__7 ;
    public final void rule__AudioElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2360:1: ( rule__AudioElement__Group__6__Impl rule__AudioElement__Group__7 )
            // InternalCinEditor.g:2361:2: rule__AudioElement__Group__6__Impl rule__AudioElement__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__AudioElement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__7();

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
    // $ANTLR end "rule__AudioElement__Group__6"


    // $ANTLR start "rule__AudioElement__Group__6__Impl"
    // InternalCinEditor.g:2368:1: rule__AudioElement__Group__6__Impl : ( ( rule__AudioElement__Group_6__0 )? ) ;
    public final void rule__AudioElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2372:1: ( ( ( rule__AudioElement__Group_6__0 )? ) )
            // InternalCinEditor.g:2373:1: ( ( rule__AudioElement__Group_6__0 )? )
            {
            // InternalCinEditor.g:2373:1: ( ( rule__AudioElement__Group_6__0 )? )
            // InternalCinEditor.g:2374:2: ( rule__AudioElement__Group_6__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_6()); 
            // InternalCinEditor.g:2375:2: ( rule__AudioElement__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCinEditor.g:2375:3: rule__AudioElement__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AudioElement__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioElementAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__6__Impl"


    // $ANTLR start "rule__AudioElement__Group__7"
    // InternalCinEditor.g:2383:1: rule__AudioElement__Group__7 : rule__AudioElement__Group__7__Impl rule__AudioElement__Group__8 ;
    public final void rule__AudioElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2387:1: ( rule__AudioElement__Group__7__Impl rule__AudioElement__Group__8 )
            // InternalCinEditor.g:2388:2: rule__AudioElement__Group__7__Impl rule__AudioElement__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__AudioElement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__8();

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
    // $ANTLR end "rule__AudioElement__Group__7"


    // $ANTLR start "rule__AudioElement__Group__7__Impl"
    // InternalCinEditor.g:2395:1: rule__AudioElement__Group__7__Impl : ( ( rule__AudioElement__TemporalPositionAssignment_7 )? ) ;
    public final void rule__AudioElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2399:1: ( ( ( rule__AudioElement__TemporalPositionAssignment_7 )? ) )
            // InternalCinEditor.g:2400:1: ( ( rule__AudioElement__TemporalPositionAssignment_7 )? )
            {
            // InternalCinEditor.g:2400:1: ( ( rule__AudioElement__TemporalPositionAssignment_7 )? )
            // InternalCinEditor.g:2401:2: ( rule__AudioElement__TemporalPositionAssignment_7 )?
            {
             before(grammarAccess.getAudioElementAccess().getTemporalPositionAssignment_7()); 
            // InternalCinEditor.g:2402:2: ( rule__AudioElement__TemporalPositionAssignment_7 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=29 && LA22_0<=30)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCinEditor.g:2402:3: rule__AudioElement__TemporalPositionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__AudioElement__TemporalPositionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioElementAccess().getTemporalPositionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__7__Impl"


    // $ANTLR start "rule__AudioElement__Group__8"
    // InternalCinEditor.g:2410:1: rule__AudioElement__Group__8 : rule__AudioElement__Group__8__Impl rule__AudioElement__Group__9 ;
    public final void rule__AudioElement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2414:1: ( rule__AudioElement__Group__8__Impl rule__AudioElement__Group__9 )
            // InternalCinEditor.g:2415:2: rule__AudioElement__Group__8__Impl rule__AudioElement__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__AudioElement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__9();

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
    // $ANTLR end "rule__AudioElement__Group__8"


    // $ANTLR start "rule__AudioElement__Group__8__Impl"
    // InternalCinEditor.g:2422:1: rule__AudioElement__Group__8__Impl : ( ( rule__AudioElement__Group_8__0 )? ) ;
    public final void rule__AudioElement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2426:1: ( ( ( rule__AudioElement__Group_8__0 )? ) )
            // InternalCinEditor.g:2427:1: ( ( rule__AudioElement__Group_8__0 )? )
            {
            // InternalCinEditor.g:2427:1: ( ( rule__AudioElement__Group_8__0 )? )
            // InternalCinEditor.g:2428:2: ( rule__AudioElement__Group_8__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_8()); 
            // InternalCinEditor.g:2429:2: ( rule__AudioElement__Group_8__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCinEditor.g:2429:3: rule__AudioElement__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AudioElement__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioElementAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__8__Impl"


    // $ANTLR start "rule__AudioElement__Group__9"
    // InternalCinEditor.g:2437:1: rule__AudioElement__Group__9 : rule__AudioElement__Group__9__Impl rule__AudioElement__Group__10 ;
    public final void rule__AudioElement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2441:1: ( rule__AudioElement__Group__9__Impl rule__AudioElement__Group__10 )
            // InternalCinEditor.g:2442:2: rule__AudioElement__Group__9__Impl rule__AudioElement__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__AudioElement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__10();

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
    // $ANTLR end "rule__AudioElement__Group__9"


    // $ANTLR start "rule__AudioElement__Group__9__Impl"
    // InternalCinEditor.g:2449:1: rule__AudioElement__Group__9__Impl : ( 'during' ) ;
    public final void rule__AudioElement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2453:1: ( ( 'during' ) )
            // InternalCinEditor.g:2454:1: ( 'during' )
            {
            // InternalCinEditor.g:2454:1: ( 'during' )
            // InternalCinEditor.g:2455:2: 'during'
            {
             before(grammarAccess.getAudioElementAccess().getDuringKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getDuringKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__9__Impl"


    // $ANTLR start "rule__AudioElement__Group__10"
    // InternalCinEditor.g:2464:1: rule__AudioElement__Group__10 : rule__AudioElement__Group__10__Impl ;
    public final void rule__AudioElement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2468:1: ( rule__AudioElement__Group__10__Impl )
            // InternalCinEditor.g:2469:2: rule__AudioElement__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__10__Impl();

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
    // $ANTLR end "rule__AudioElement__Group__10"


    // $ANTLR start "rule__AudioElement__Group__10__Impl"
    // InternalCinEditor.g:2475:1: rule__AudioElement__Group__10__Impl : ( ( rule__AudioElement__DurationAssignment_10 ) ) ;
    public final void rule__AudioElement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2479:1: ( ( ( rule__AudioElement__DurationAssignment_10 ) ) )
            // InternalCinEditor.g:2480:1: ( ( rule__AudioElement__DurationAssignment_10 ) )
            {
            // InternalCinEditor.g:2480:1: ( ( rule__AudioElement__DurationAssignment_10 ) )
            // InternalCinEditor.g:2481:2: ( rule__AudioElement__DurationAssignment_10 )
            {
             before(grammarAccess.getAudioElementAccess().getDurationAssignment_10()); 
            // InternalCinEditor.g:2482:2: ( rule__AudioElement__DurationAssignment_10 )
            // InternalCinEditor.g:2482:3: rule__AudioElement__DurationAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__DurationAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getDurationAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__10__Impl"


    // $ANTLR start "rule__AudioElement__Group_4__0"
    // InternalCinEditor.g:2491:1: rule__AudioElement__Group_4__0 : rule__AudioElement__Group_4__0__Impl rule__AudioElement__Group_4__1 ;
    public final void rule__AudioElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2495:1: ( rule__AudioElement__Group_4__0__Impl rule__AudioElement__Group_4__1 )
            // InternalCinEditor.g:2496:2: rule__AudioElement__Group_4__0__Impl rule__AudioElement__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__AudioElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group_4__1();

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
    // $ANTLR end "rule__AudioElement__Group_4__0"


    // $ANTLR start "rule__AudioElement__Group_4__0__Impl"
    // InternalCinEditor.g:2503:1: rule__AudioElement__Group_4__0__Impl : ( 'volume' ) ;
    public final void rule__AudioElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2507:1: ( ( 'volume' ) )
            // InternalCinEditor.g:2508:1: ( 'volume' )
            {
            // InternalCinEditor.g:2508:1: ( 'volume' )
            // InternalCinEditor.g:2509:2: 'volume'
            {
             before(grammarAccess.getAudioElementAccess().getVolumeKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getVolumeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_4__0__Impl"


    // $ANTLR start "rule__AudioElement__Group_4__1"
    // InternalCinEditor.g:2518:1: rule__AudioElement__Group_4__1 : rule__AudioElement__Group_4__1__Impl ;
    public final void rule__AudioElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2522:1: ( rule__AudioElement__Group_4__1__Impl )
            // InternalCinEditor.g:2523:2: rule__AudioElement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__Group_4__1__Impl();

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
    // $ANTLR end "rule__AudioElement__Group_4__1"


    // $ANTLR start "rule__AudioElement__Group_4__1__Impl"
    // InternalCinEditor.g:2529:1: rule__AudioElement__Group_4__1__Impl : ( ( rule__AudioElement__VolumeAssignment_4_1 ) ) ;
    public final void rule__AudioElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2533:1: ( ( ( rule__AudioElement__VolumeAssignment_4_1 ) ) )
            // InternalCinEditor.g:2534:1: ( ( rule__AudioElement__VolumeAssignment_4_1 ) )
            {
            // InternalCinEditor.g:2534:1: ( ( rule__AudioElement__VolumeAssignment_4_1 ) )
            // InternalCinEditor.g:2535:2: ( rule__AudioElement__VolumeAssignment_4_1 )
            {
             before(grammarAccess.getAudioElementAccess().getVolumeAssignment_4_1()); 
            // InternalCinEditor.g:2536:2: ( rule__AudioElement__VolumeAssignment_4_1 )
            // InternalCinEditor.g:2536:3: rule__AudioElement__VolumeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__VolumeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getVolumeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_4__1__Impl"


    // $ANTLR start "rule__AudioElement__Group_5__0"
    // InternalCinEditor.g:2545:1: rule__AudioElement__Group_5__0 : rule__AudioElement__Group_5__0__Impl rule__AudioElement__Group_5__1 ;
    public final void rule__AudioElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2549:1: ( rule__AudioElement__Group_5__0__Impl rule__AudioElement__Group_5__1 )
            // InternalCinEditor.g:2550:2: rule__AudioElement__Group_5__0__Impl rule__AudioElement__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__AudioElement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group_5__1();

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
    // $ANTLR end "rule__AudioElement__Group_5__0"


    // $ANTLR start "rule__AudioElement__Group_5__0__Impl"
    // InternalCinEditor.g:2557:1: rule__AudioElement__Group_5__0__Impl : ( 'fadeIn' ) ;
    public final void rule__AudioElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2561:1: ( ( 'fadeIn' ) )
            // InternalCinEditor.g:2562:1: ( 'fadeIn' )
            {
            // InternalCinEditor.g:2562:1: ( 'fadeIn' )
            // InternalCinEditor.g:2563:2: 'fadeIn'
            {
             before(grammarAccess.getAudioElementAccess().getFadeInKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getFadeInKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_5__0__Impl"


    // $ANTLR start "rule__AudioElement__Group_5__1"
    // InternalCinEditor.g:2572:1: rule__AudioElement__Group_5__1 : rule__AudioElement__Group_5__1__Impl ;
    public final void rule__AudioElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2576:1: ( rule__AudioElement__Group_5__1__Impl )
            // InternalCinEditor.g:2577:2: rule__AudioElement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__Group_5__1__Impl();

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
    // $ANTLR end "rule__AudioElement__Group_5__1"


    // $ANTLR start "rule__AudioElement__Group_5__1__Impl"
    // InternalCinEditor.g:2583:1: rule__AudioElement__Group_5__1__Impl : ( ( rule__AudioElement__FadeInAssignment_5_1 ) ) ;
    public final void rule__AudioElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2587:1: ( ( ( rule__AudioElement__FadeInAssignment_5_1 ) ) )
            // InternalCinEditor.g:2588:1: ( ( rule__AudioElement__FadeInAssignment_5_1 ) )
            {
            // InternalCinEditor.g:2588:1: ( ( rule__AudioElement__FadeInAssignment_5_1 ) )
            // InternalCinEditor.g:2589:2: ( rule__AudioElement__FadeInAssignment_5_1 )
            {
             before(grammarAccess.getAudioElementAccess().getFadeInAssignment_5_1()); 
            // InternalCinEditor.g:2590:2: ( rule__AudioElement__FadeInAssignment_5_1 )
            // InternalCinEditor.g:2590:3: rule__AudioElement__FadeInAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__FadeInAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getFadeInAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_5__1__Impl"


    // $ANTLR start "rule__AudioElement__Group_6__0"
    // InternalCinEditor.g:2599:1: rule__AudioElement__Group_6__0 : rule__AudioElement__Group_6__0__Impl rule__AudioElement__Group_6__1 ;
    public final void rule__AudioElement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2603:1: ( rule__AudioElement__Group_6__0__Impl rule__AudioElement__Group_6__1 )
            // InternalCinEditor.g:2604:2: rule__AudioElement__Group_6__0__Impl rule__AudioElement__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__AudioElement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group_6__1();

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
    // $ANTLR end "rule__AudioElement__Group_6__0"


    // $ANTLR start "rule__AudioElement__Group_6__0__Impl"
    // InternalCinEditor.g:2611:1: rule__AudioElement__Group_6__0__Impl : ( 'fadeOut' ) ;
    public final void rule__AudioElement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2615:1: ( ( 'fadeOut' ) )
            // InternalCinEditor.g:2616:1: ( 'fadeOut' )
            {
            // InternalCinEditor.g:2616:1: ( 'fadeOut' )
            // InternalCinEditor.g:2617:2: 'fadeOut'
            {
             before(grammarAccess.getAudioElementAccess().getFadeOutKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getFadeOutKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_6__0__Impl"


    // $ANTLR start "rule__AudioElement__Group_6__1"
    // InternalCinEditor.g:2626:1: rule__AudioElement__Group_6__1 : rule__AudioElement__Group_6__1__Impl ;
    public final void rule__AudioElement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2630:1: ( rule__AudioElement__Group_6__1__Impl )
            // InternalCinEditor.g:2631:2: rule__AudioElement__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__Group_6__1__Impl();

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
    // $ANTLR end "rule__AudioElement__Group_6__1"


    // $ANTLR start "rule__AudioElement__Group_6__1__Impl"
    // InternalCinEditor.g:2637:1: rule__AudioElement__Group_6__1__Impl : ( ( rule__AudioElement__FadeOutAssignment_6_1 ) ) ;
    public final void rule__AudioElement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2641:1: ( ( ( rule__AudioElement__FadeOutAssignment_6_1 ) ) )
            // InternalCinEditor.g:2642:1: ( ( rule__AudioElement__FadeOutAssignment_6_1 ) )
            {
            // InternalCinEditor.g:2642:1: ( ( rule__AudioElement__FadeOutAssignment_6_1 ) )
            // InternalCinEditor.g:2643:2: ( rule__AudioElement__FadeOutAssignment_6_1 )
            {
             before(grammarAccess.getAudioElementAccess().getFadeOutAssignment_6_1()); 
            // InternalCinEditor.g:2644:2: ( rule__AudioElement__FadeOutAssignment_6_1 )
            // InternalCinEditor.g:2644:3: rule__AudioElement__FadeOutAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__FadeOutAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getFadeOutAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_6__1__Impl"


    // $ANTLR start "rule__AudioElement__Group_8__0"
    // InternalCinEditor.g:2653:1: rule__AudioElement__Group_8__0 : rule__AudioElement__Group_8__0__Impl rule__AudioElement__Group_8__1 ;
    public final void rule__AudioElement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2657:1: ( rule__AudioElement__Group_8__0__Impl rule__AudioElement__Group_8__1 )
            // InternalCinEditor.g:2658:2: rule__AudioElement__Group_8__0__Impl rule__AudioElement__Group_8__1
            {
            pushFollow(FOLLOW_7);
            rule__AudioElement__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group_8__1();

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
    // $ANTLR end "rule__AudioElement__Group_8__0"


    // $ANTLR start "rule__AudioElement__Group_8__0__Impl"
    // InternalCinEditor.g:2665:1: rule__AudioElement__Group_8__0__Impl : ( 'cropAt' ) ;
    public final void rule__AudioElement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2669:1: ( ( 'cropAt' ) )
            // InternalCinEditor.g:2670:1: ( 'cropAt' )
            {
            // InternalCinEditor.g:2670:1: ( 'cropAt' )
            // InternalCinEditor.g:2671:2: 'cropAt'
            {
             before(grammarAccess.getAudioElementAccess().getCropAtKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getCropAtKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_8__0__Impl"


    // $ANTLR start "rule__AudioElement__Group_8__1"
    // InternalCinEditor.g:2680:1: rule__AudioElement__Group_8__1 : rule__AudioElement__Group_8__1__Impl ;
    public final void rule__AudioElement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2684:1: ( rule__AudioElement__Group_8__1__Impl )
            // InternalCinEditor.g:2685:2: rule__AudioElement__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__Group_8__1__Impl();

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
    // $ANTLR end "rule__AudioElement__Group_8__1"


    // $ANTLR start "rule__AudioElement__Group_8__1__Impl"
    // InternalCinEditor.g:2691:1: rule__AudioElement__Group_8__1__Impl : ( ( rule__AudioElement__BeginCropTimeAssignment_8_1 ) ) ;
    public final void rule__AudioElement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2695:1: ( ( ( rule__AudioElement__BeginCropTimeAssignment_8_1 ) ) )
            // InternalCinEditor.g:2696:1: ( ( rule__AudioElement__BeginCropTimeAssignment_8_1 ) )
            {
            // InternalCinEditor.g:2696:1: ( ( rule__AudioElement__BeginCropTimeAssignment_8_1 ) )
            // InternalCinEditor.g:2697:2: ( rule__AudioElement__BeginCropTimeAssignment_8_1 )
            {
             before(grammarAccess.getAudioElementAccess().getBeginCropTimeAssignment_8_1()); 
            // InternalCinEditor.g:2698:2: ( rule__AudioElement__BeginCropTimeAssignment_8_1 )
            // InternalCinEditor.g:2698:3: rule__AudioElement__BeginCropTimeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__BeginCropTimeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getBeginCropTimeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_8__1__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalCinEditor.g:2707:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2711:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalCinEditor.g:2712:2: rule__Text__Group__0__Impl rule__Text__Group__1
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
    // InternalCinEditor.g:2719:1: rule__Text__Group__0__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2723:1: ( ( 'Text' ) )
            // InternalCinEditor.g:2724:1: ( 'Text' )
            {
            // InternalCinEditor.g:2724:1: ( 'Text' )
            // InternalCinEditor.g:2725:2: 'Text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCinEditor.g:2734:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2738:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalCinEditor.g:2739:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:2746:1: rule__Text__Group__1__Impl : ( ( rule__Text__NameAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2750:1: ( ( ( rule__Text__NameAssignment_1 ) ) )
            // InternalCinEditor.g:2751:1: ( ( rule__Text__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:2751:1: ( ( rule__Text__NameAssignment_1 ) )
            // InternalCinEditor.g:2752:2: ( rule__Text__NameAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:2753:2: ( rule__Text__NameAssignment_1 )
            // InternalCinEditor.g:2753:3: rule__Text__NameAssignment_1
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
    // InternalCinEditor.g:2761:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2765:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalCinEditor.g:2766:2: rule__Text__Group__2__Impl rule__Text__Group__3
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
    // InternalCinEditor.g:2773:1: rule__Text__Group__2__Impl : ( '=' ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2777:1: ( ( '=' ) )
            // InternalCinEditor.g:2778:1: ( '=' )
            {
            // InternalCinEditor.g:2778:1: ( '=' )
            // InternalCinEditor.g:2779:2: '='
            {
             before(grammarAccess.getTextAccess().getEqualsSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalCinEditor.g:2788:1: rule__Text__Group__3 : rule__Text__Group__3__Impl rule__Text__Group__4 ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2792:1: ( rule__Text__Group__3__Impl rule__Text__Group__4 )
            // InternalCinEditor.g:2793:2: rule__Text__Group__3__Impl rule__Text__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:2800:1: rule__Text__Group__3__Impl : ( ( rule__Text__TextAssignment_3 ) ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2804:1: ( ( ( rule__Text__TextAssignment_3 ) ) )
            // InternalCinEditor.g:2805:1: ( ( rule__Text__TextAssignment_3 ) )
            {
            // InternalCinEditor.g:2805:1: ( ( rule__Text__TextAssignment_3 ) )
            // InternalCinEditor.g:2806:2: ( rule__Text__TextAssignment_3 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_3()); 
            // InternalCinEditor.g:2807:2: ( rule__Text__TextAssignment_3 )
            // InternalCinEditor.g:2807:3: rule__Text__TextAssignment_3
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
    // InternalCinEditor.g:2815:1: rule__Text__Group__4 : rule__Text__Group__4__Impl rule__Text__Group__5 ;
    public final void rule__Text__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2819:1: ( rule__Text__Group__4__Impl rule__Text__Group__5 )
            // InternalCinEditor.g:2820:2: rule__Text__Group__4__Impl rule__Text__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:2827:1: rule__Text__Group__4__Impl : ( ( rule__Text__Group_4__0 )? ) ;
    public final void rule__Text__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2831:1: ( ( ( rule__Text__Group_4__0 )? ) )
            // InternalCinEditor.g:2832:1: ( ( rule__Text__Group_4__0 )? )
            {
            // InternalCinEditor.g:2832:1: ( ( rule__Text__Group_4__0 )? )
            // InternalCinEditor.g:2833:2: ( rule__Text__Group_4__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_4()); 
            // InternalCinEditor.g:2834:2: ( rule__Text__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCinEditor.g:2834:3: rule__Text__Group_4__0
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
    // InternalCinEditor.g:2842:1: rule__Text__Group__5 : rule__Text__Group__5__Impl rule__Text__Group__6 ;
    public final void rule__Text__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2846:1: ( rule__Text__Group__5__Impl rule__Text__Group__6 )
            // InternalCinEditor.g:2847:2: rule__Text__Group__5__Impl rule__Text__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:2854:1: rule__Text__Group__5__Impl : ( ( rule__Text__PositionAssignment_5 )? ) ;
    public final void rule__Text__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2858:1: ( ( ( rule__Text__PositionAssignment_5 )? ) )
            // InternalCinEditor.g:2859:1: ( ( rule__Text__PositionAssignment_5 )? )
            {
            // InternalCinEditor.g:2859:1: ( ( rule__Text__PositionAssignment_5 )? )
            // InternalCinEditor.g:2860:2: ( rule__Text__PositionAssignment_5 )?
            {
             before(grammarAccess.getTextAccess().getPositionAssignment_5()); 
            // InternalCinEditor.g:2861:2: ( rule__Text__PositionAssignment_5 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCinEditor.g:2861:3: rule__Text__PositionAssignment_5
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
    // InternalCinEditor.g:2869:1: rule__Text__Group__6 : rule__Text__Group__6__Impl rule__Text__Group__7 ;
    public final void rule__Text__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2873:1: ( rule__Text__Group__6__Impl rule__Text__Group__7 )
            // InternalCinEditor.g:2874:2: rule__Text__Group__6__Impl rule__Text__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:2881:1: rule__Text__Group__6__Impl : ( ( rule__Text__Group_6__0 )? ) ;
    public final void rule__Text__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2885:1: ( ( ( rule__Text__Group_6__0 )? ) )
            // InternalCinEditor.g:2886:1: ( ( rule__Text__Group_6__0 )? )
            {
            // InternalCinEditor.g:2886:1: ( ( rule__Text__Group_6__0 )? )
            // InternalCinEditor.g:2887:2: ( rule__Text__Group_6__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_6()); 
            // InternalCinEditor.g:2888:2: ( rule__Text__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCinEditor.g:2888:3: rule__Text__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalCinEditor.g:2896:1: rule__Text__Group__7 : rule__Text__Group__7__Impl rule__Text__Group__8 ;
    public final void rule__Text__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2900:1: ( rule__Text__Group__7__Impl rule__Text__Group__8 )
            // InternalCinEditor.g:2901:2: rule__Text__Group__7__Impl rule__Text__Group__8
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:2908:1: rule__Text__Group__7__Impl : ( ( rule__Text__TemporalPositionAssignment_7 )? ) ;
    public final void rule__Text__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2912:1: ( ( ( rule__Text__TemporalPositionAssignment_7 )? ) )
            // InternalCinEditor.g:2913:1: ( ( rule__Text__TemporalPositionAssignment_7 )? )
            {
            // InternalCinEditor.g:2913:1: ( ( rule__Text__TemporalPositionAssignment_7 )? )
            // InternalCinEditor.g:2914:2: ( rule__Text__TemporalPositionAssignment_7 )?
            {
             before(grammarAccess.getTextAccess().getTemporalPositionAssignment_7()); 
            // InternalCinEditor.g:2915:2: ( rule__Text__TemporalPositionAssignment_7 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=29 && LA27_0<=30)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCinEditor.g:2915:3: rule__Text__TemporalPositionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__TemporalPositionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getTemporalPositionAssignment_7()); 

            }


            }

        }
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
    // InternalCinEditor.g:2923:1: rule__Text__Group__8 : rule__Text__Group__8__Impl rule__Text__Group__9 ;
    public final void rule__Text__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2927:1: ( rule__Text__Group__8__Impl rule__Text__Group__9 )
            // InternalCinEditor.g:2928:2: rule__Text__Group__8__Impl rule__Text__Group__9
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:2935:1: rule__Text__Group__8__Impl : ( ( rule__Text__Group_8__0 )? ) ;
    public final void rule__Text__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2939:1: ( ( ( rule__Text__Group_8__0 )? ) )
            // InternalCinEditor.g:2940:1: ( ( rule__Text__Group_8__0 )? )
            {
            // InternalCinEditor.g:2940:1: ( ( rule__Text__Group_8__0 )? )
            // InternalCinEditor.g:2941:2: ( rule__Text__Group_8__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_8()); 
            // InternalCinEditor.g:2942:2: ( rule__Text__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCinEditor.g:2942:3: rule__Text__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getGroup_8()); 

            }


            }

        }
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
    // InternalCinEditor.g:2950:1: rule__Text__Group__9 : rule__Text__Group__9__Impl ;
    public final void rule__Text__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2954:1: ( rule__Text__Group__9__Impl )
            // InternalCinEditor.g:2955:2: rule__Text__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__9__Impl();

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
    // InternalCinEditor.g:2961:1: rule__Text__Group__9__Impl : ( ( rule__Text__ColorAssignment_9 ) ) ;
    public final void rule__Text__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2965:1: ( ( ( rule__Text__ColorAssignment_9 ) ) )
            // InternalCinEditor.g:2966:1: ( ( rule__Text__ColorAssignment_9 ) )
            {
            // InternalCinEditor.g:2966:1: ( ( rule__Text__ColorAssignment_9 ) )
            // InternalCinEditor.g:2967:2: ( rule__Text__ColorAssignment_9 )
            {
             before(grammarAccess.getTextAccess().getColorAssignment_9()); 
            // InternalCinEditor.g:2968:2: ( rule__Text__ColorAssignment_9 )
            // InternalCinEditor.g:2968:3: rule__Text__ColorAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Text__ColorAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getColorAssignment_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Text__Group_4__0"
    // InternalCinEditor.g:2977:1: rule__Text__Group_4__0 : rule__Text__Group_4__0__Impl rule__Text__Group_4__1 ;
    public final void rule__Text__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2981:1: ( rule__Text__Group_4__0__Impl rule__Text__Group_4__1 )
            // InternalCinEditor.g:2982:2: rule__Text__Group_4__0__Impl rule__Text__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCinEditor.g:2989:1: rule__Text__Group_4__0__Impl : ( 'fontSize' ) ;
    public final void rule__Text__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2993:1: ( ( 'fontSize' ) )
            // InternalCinEditor.g:2994:1: ( 'fontSize' )
            {
            // InternalCinEditor.g:2994:1: ( 'fontSize' )
            // InternalCinEditor.g:2995:2: 'fontSize'
            {
             before(grammarAccess.getTextAccess().getFontSizeKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCinEditor.g:3004:1: rule__Text__Group_4__1 : rule__Text__Group_4__1__Impl ;
    public final void rule__Text__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3008:1: ( rule__Text__Group_4__1__Impl )
            // InternalCinEditor.g:3009:2: rule__Text__Group_4__1__Impl
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
    // InternalCinEditor.g:3015:1: rule__Text__Group_4__1__Impl : ( ( rule__Text__FontSizeAssignment_4_1 ) ) ;
    public final void rule__Text__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3019:1: ( ( ( rule__Text__FontSizeAssignment_4_1 ) ) )
            // InternalCinEditor.g:3020:1: ( ( rule__Text__FontSizeAssignment_4_1 ) )
            {
            // InternalCinEditor.g:3020:1: ( ( rule__Text__FontSizeAssignment_4_1 ) )
            // InternalCinEditor.g:3021:2: ( rule__Text__FontSizeAssignment_4_1 )
            {
             before(grammarAccess.getTextAccess().getFontSizeAssignment_4_1()); 
            // InternalCinEditor.g:3022:2: ( rule__Text__FontSizeAssignment_4_1 )
            // InternalCinEditor.g:3022:3: rule__Text__FontSizeAssignment_4_1
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


    // $ANTLR start "rule__Text__Group_6__0"
    // InternalCinEditor.g:3031:1: rule__Text__Group_6__0 : rule__Text__Group_6__0__Impl rule__Text__Group_6__1 ;
    public final void rule__Text__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3035:1: ( rule__Text__Group_6__0__Impl rule__Text__Group_6__1 )
            // InternalCinEditor.g:3036:2: rule__Text__Group_6__0__Impl rule__Text__Group_6__1
            {
            pushFollow(FOLLOW_23);
            rule__Text__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_6__1();

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
    // $ANTLR end "rule__Text__Group_6__0"


    // $ANTLR start "rule__Text__Group_6__0__Impl"
    // InternalCinEditor.g:3043:1: rule__Text__Group_6__0__Impl : ( 'margins(' ) ;
    public final void rule__Text__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3047:1: ( ( 'margins(' ) )
            // InternalCinEditor.g:3048:1: ( 'margins(' )
            {
            // InternalCinEditor.g:3048:1: ( 'margins(' )
            // InternalCinEditor.g:3049:2: 'margins('
            {
             before(grammarAccess.getTextAccess().getMarginsKeyword_6_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getMarginsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_6__0__Impl"


    // $ANTLR start "rule__Text__Group_6__1"
    // InternalCinEditor.g:3058:1: rule__Text__Group_6__1 : rule__Text__Group_6__1__Impl rule__Text__Group_6__2 ;
    public final void rule__Text__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3062:1: ( rule__Text__Group_6__1__Impl rule__Text__Group_6__2 )
            // InternalCinEditor.g:3063:2: rule__Text__Group_6__1__Impl rule__Text__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__Text__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_6__2();

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
    // $ANTLR end "rule__Text__Group_6__1"


    // $ANTLR start "rule__Text__Group_6__1__Impl"
    // InternalCinEditor.g:3070:1: rule__Text__Group_6__1__Impl : ( ( ( rule__Text__MarginsAssignment_6_1 ) ) ( ( rule__Text__MarginsAssignment_6_1 )* ) ) ;
    public final void rule__Text__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3074:1: ( ( ( ( rule__Text__MarginsAssignment_6_1 ) ) ( ( rule__Text__MarginsAssignment_6_1 )* ) ) )
            // InternalCinEditor.g:3075:1: ( ( ( rule__Text__MarginsAssignment_6_1 ) ) ( ( rule__Text__MarginsAssignment_6_1 )* ) )
            {
            // InternalCinEditor.g:3075:1: ( ( ( rule__Text__MarginsAssignment_6_1 ) ) ( ( rule__Text__MarginsAssignment_6_1 )* ) )
            // InternalCinEditor.g:3076:2: ( ( rule__Text__MarginsAssignment_6_1 ) ) ( ( rule__Text__MarginsAssignment_6_1 )* )
            {
            // InternalCinEditor.g:3076:2: ( ( rule__Text__MarginsAssignment_6_1 ) )
            // InternalCinEditor.g:3077:3: ( rule__Text__MarginsAssignment_6_1 )
            {
             before(grammarAccess.getTextAccess().getMarginsAssignment_6_1()); 
            // InternalCinEditor.g:3078:3: ( rule__Text__MarginsAssignment_6_1 )
            // InternalCinEditor.g:3078:4: rule__Text__MarginsAssignment_6_1
            {
            pushFollow(FOLLOW_24);
            rule__Text__MarginsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getMarginsAssignment_6_1()); 

            }

            // InternalCinEditor.g:3081:2: ( ( rule__Text__MarginsAssignment_6_1 )* )
            // InternalCinEditor.g:3082:3: ( rule__Text__MarginsAssignment_6_1 )*
            {
             before(grammarAccess.getTextAccess().getMarginsAssignment_6_1()); 
            // InternalCinEditor.g:3083:3: ( rule__Text__MarginsAssignment_6_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=12 && LA29_0<=15)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCinEditor.g:3083:4: rule__Text__MarginsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Text__MarginsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getTextAccess().getMarginsAssignment_6_1()); 

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
    // $ANTLR end "rule__Text__Group_6__1__Impl"


    // $ANTLR start "rule__Text__Group_6__2"
    // InternalCinEditor.g:3092:1: rule__Text__Group_6__2 : rule__Text__Group_6__2__Impl ;
    public final void rule__Text__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3096:1: ( rule__Text__Group_6__2__Impl )
            // InternalCinEditor.g:3097:2: rule__Text__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_6__2__Impl();

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
    // $ANTLR end "rule__Text__Group_6__2"


    // $ANTLR start "rule__Text__Group_6__2__Impl"
    // InternalCinEditor.g:3103:1: rule__Text__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Text__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3107:1: ( ( ')' ) )
            // InternalCinEditor.g:3108:1: ( ')' )
            {
            // InternalCinEditor.g:3108:1: ( ')' )
            // InternalCinEditor.g:3109:2: ')'
            {
             before(grammarAccess.getTextAccess().getRightParenthesisKeyword_6_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getRightParenthesisKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_6__2__Impl"


    // $ANTLR start "rule__Text__Group_8__0"
    // InternalCinEditor.g:3119:1: rule__Text__Group_8__0 : rule__Text__Group_8__0__Impl rule__Text__Group_8__1 ;
    public final void rule__Text__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3123:1: ( rule__Text__Group_8__0__Impl rule__Text__Group_8__1 )
            // InternalCinEditor.g:3124:2: rule__Text__Group_8__0__Impl rule__Text__Group_8__1
            {
            pushFollow(FOLLOW_7);
            rule__Text__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_8__1();

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
    // $ANTLR end "rule__Text__Group_8__0"


    // $ANTLR start "rule__Text__Group_8__0__Impl"
    // InternalCinEditor.g:3131:1: rule__Text__Group_8__0__Impl : ( 'during' ) ;
    public final void rule__Text__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3135:1: ( ( 'during' ) )
            // InternalCinEditor.g:3136:1: ( 'during' )
            {
            // InternalCinEditor.g:3136:1: ( 'during' )
            // InternalCinEditor.g:3137:2: 'during'
            {
             before(grammarAccess.getTextAccess().getDuringKeyword_8_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getDuringKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_8__0__Impl"


    // $ANTLR start "rule__Text__Group_8__1"
    // InternalCinEditor.g:3146:1: rule__Text__Group_8__1 : rule__Text__Group_8__1__Impl ;
    public final void rule__Text__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3150:1: ( rule__Text__Group_8__1__Impl )
            // InternalCinEditor.g:3151:2: rule__Text__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_8__1__Impl();

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
    // $ANTLR end "rule__Text__Group_8__1"


    // $ANTLR start "rule__Text__Group_8__1__Impl"
    // InternalCinEditor.g:3157:1: rule__Text__Group_8__1__Impl : ( ( rule__Text__DurationAssignment_8_1 ) ) ;
    public final void rule__Text__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3161:1: ( ( ( rule__Text__DurationAssignment_8_1 ) ) )
            // InternalCinEditor.g:3162:1: ( ( rule__Text__DurationAssignment_8_1 ) )
            {
            // InternalCinEditor.g:3162:1: ( ( rule__Text__DurationAssignment_8_1 ) )
            // InternalCinEditor.g:3163:2: ( rule__Text__DurationAssignment_8_1 )
            {
             before(grammarAccess.getTextAccess().getDurationAssignment_8_1()); 
            // InternalCinEditor.g:3164:2: ( rule__Text__DurationAssignment_8_1 )
            // InternalCinEditor.g:3164:3: rule__Text__DurationAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__DurationAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getDurationAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_8__1__Impl"


    // $ANTLR start "rule__Picture__Group__0"
    // InternalCinEditor.g:3173:1: rule__Picture__Group__0 : rule__Picture__Group__0__Impl rule__Picture__Group__1 ;
    public final void rule__Picture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3177:1: ( rule__Picture__Group__0__Impl rule__Picture__Group__1 )
            // InternalCinEditor.g:3178:2: rule__Picture__Group__0__Impl rule__Picture__Group__1
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
    // InternalCinEditor.g:3185:1: rule__Picture__Group__0__Impl : ( 'Picture' ) ;
    public final void rule__Picture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3189:1: ( ( 'Picture' ) )
            // InternalCinEditor.g:3190:1: ( 'Picture' )
            {
            // InternalCinEditor.g:3190:1: ( 'Picture' )
            // InternalCinEditor.g:3191:2: 'Picture'
            {
             before(grammarAccess.getPictureAccess().getPictureKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCinEditor.g:3200:1: rule__Picture__Group__1 : rule__Picture__Group__1__Impl rule__Picture__Group__2 ;
    public final void rule__Picture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3204:1: ( rule__Picture__Group__1__Impl rule__Picture__Group__2 )
            // InternalCinEditor.g:3205:2: rule__Picture__Group__1__Impl rule__Picture__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:3212:1: rule__Picture__Group__1__Impl : ( ( rule__Picture__NameAssignment_1 ) ) ;
    public final void rule__Picture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3216:1: ( ( ( rule__Picture__NameAssignment_1 ) ) )
            // InternalCinEditor.g:3217:1: ( ( rule__Picture__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:3217:1: ( ( rule__Picture__NameAssignment_1 ) )
            // InternalCinEditor.g:3218:2: ( rule__Picture__NameAssignment_1 )
            {
             before(grammarAccess.getPictureAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:3219:2: ( rule__Picture__NameAssignment_1 )
            // InternalCinEditor.g:3219:3: rule__Picture__NameAssignment_1
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
    // InternalCinEditor.g:3227:1: rule__Picture__Group__2 : rule__Picture__Group__2__Impl rule__Picture__Group__3 ;
    public final void rule__Picture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3231:1: ( rule__Picture__Group__2__Impl rule__Picture__Group__3 )
            // InternalCinEditor.g:3232:2: rule__Picture__Group__2__Impl rule__Picture__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalCinEditor.g:3239:1: rule__Picture__Group__2__Impl : ( '=' ) ;
    public final void rule__Picture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3243:1: ( ( '=' ) )
            // InternalCinEditor.g:3244:1: ( '=' )
            {
            // InternalCinEditor.g:3244:1: ( '=' )
            // InternalCinEditor.g:3245:2: '='
            {
             before(grammarAccess.getPictureAccess().getEqualsSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalCinEditor.g:3254:1: rule__Picture__Group__3 : rule__Picture__Group__3__Impl rule__Picture__Group__4 ;
    public final void rule__Picture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3258:1: ( rule__Picture__Group__3__Impl rule__Picture__Group__4 )
            // InternalCinEditor.g:3259:2: rule__Picture__Group__3__Impl rule__Picture__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3266:1: rule__Picture__Group__3__Impl : ( ( rule__Picture__UrlAssignment_3 ) ) ;
    public final void rule__Picture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3270:1: ( ( ( rule__Picture__UrlAssignment_3 ) ) )
            // InternalCinEditor.g:3271:1: ( ( rule__Picture__UrlAssignment_3 ) )
            {
            // InternalCinEditor.g:3271:1: ( ( rule__Picture__UrlAssignment_3 ) )
            // InternalCinEditor.g:3272:2: ( rule__Picture__UrlAssignment_3 )
            {
             before(grammarAccess.getPictureAccess().getUrlAssignment_3()); 
            // InternalCinEditor.g:3273:2: ( rule__Picture__UrlAssignment_3 )
            // InternalCinEditor.g:3273:3: rule__Picture__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Picture__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getUrlAssignment_3()); 

            }


            }

        }
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
    // InternalCinEditor.g:3281:1: rule__Picture__Group__4 : rule__Picture__Group__4__Impl rule__Picture__Group__5 ;
    public final void rule__Picture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3285:1: ( rule__Picture__Group__4__Impl rule__Picture__Group__5 )
            // InternalCinEditor.g:3286:2: rule__Picture__Group__4__Impl rule__Picture__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3293:1: rule__Picture__Group__4__Impl : ( ( rule__Picture__PositionAssignment_4 )? ) ;
    public final void rule__Picture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3297:1: ( ( ( rule__Picture__PositionAssignment_4 )? ) )
            // InternalCinEditor.g:3298:1: ( ( rule__Picture__PositionAssignment_4 )? )
            {
            // InternalCinEditor.g:3298:1: ( ( rule__Picture__PositionAssignment_4 )? )
            // InternalCinEditor.g:3299:2: ( rule__Picture__PositionAssignment_4 )?
            {
             before(grammarAccess.getPictureAccess().getPositionAssignment_4()); 
            // InternalCinEditor.g:3300:2: ( rule__Picture__PositionAssignment_4 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCinEditor.g:3300:3: rule__Picture__PositionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__PositionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getPositionAssignment_4()); 

            }


            }

        }
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
    // InternalCinEditor.g:3308:1: rule__Picture__Group__5 : rule__Picture__Group__5__Impl rule__Picture__Group__6 ;
    public final void rule__Picture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3312:1: ( rule__Picture__Group__5__Impl rule__Picture__Group__6 )
            // InternalCinEditor.g:3313:2: rule__Picture__Group__5__Impl rule__Picture__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3320:1: rule__Picture__Group__5__Impl : ( ( rule__Picture__DimensionAssignment_5 )? ) ;
    public final void rule__Picture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3324:1: ( ( ( rule__Picture__DimensionAssignment_5 )? ) )
            // InternalCinEditor.g:3325:1: ( ( rule__Picture__DimensionAssignment_5 )? )
            {
            // InternalCinEditor.g:3325:1: ( ( rule__Picture__DimensionAssignment_5 )? )
            // InternalCinEditor.g:3326:2: ( rule__Picture__DimensionAssignment_5 )?
            {
             before(grammarAccess.getPictureAccess().getDimensionAssignment_5()); 
            // InternalCinEditor.g:3327:2: ( rule__Picture__DimensionAssignment_5 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCinEditor.g:3327:3: rule__Picture__DimensionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__DimensionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getDimensionAssignment_5()); 

            }


            }

        }
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
    // InternalCinEditor.g:3335:1: rule__Picture__Group__6 : rule__Picture__Group__6__Impl rule__Picture__Group__7 ;
    public final void rule__Picture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3339:1: ( rule__Picture__Group__6__Impl rule__Picture__Group__7 )
            // InternalCinEditor.g:3340:2: rule__Picture__Group__6__Impl rule__Picture__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3347:1: rule__Picture__Group__6__Impl : ( ( rule__Picture__Group_6__0 )? ) ;
    public final void rule__Picture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3351:1: ( ( ( rule__Picture__Group_6__0 )? ) )
            // InternalCinEditor.g:3352:1: ( ( rule__Picture__Group_6__0 )? )
            {
            // InternalCinEditor.g:3352:1: ( ( rule__Picture__Group_6__0 )? )
            // InternalCinEditor.g:3353:2: ( rule__Picture__Group_6__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_6()); 
            // InternalCinEditor.g:3354:2: ( rule__Picture__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCinEditor.g:3354:3: rule__Picture__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalCinEditor.g:3362:1: rule__Picture__Group__7 : rule__Picture__Group__7__Impl rule__Picture__Group__8 ;
    public final void rule__Picture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3366:1: ( rule__Picture__Group__7__Impl rule__Picture__Group__8 )
            // InternalCinEditor.g:3367:2: rule__Picture__Group__7__Impl rule__Picture__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3374:1: rule__Picture__Group__7__Impl : ( ( rule__Picture__TemporalPositionAssignment_7 )? ) ;
    public final void rule__Picture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3378:1: ( ( ( rule__Picture__TemporalPositionAssignment_7 )? ) )
            // InternalCinEditor.g:3379:1: ( ( rule__Picture__TemporalPositionAssignment_7 )? )
            {
            // InternalCinEditor.g:3379:1: ( ( rule__Picture__TemporalPositionAssignment_7 )? )
            // InternalCinEditor.g:3380:2: ( rule__Picture__TemporalPositionAssignment_7 )?
            {
             before(grammarAccess.getPictureAccess().getTemporalPositionAssignment_7()); 
            // InternalCinEditor.g:3381:2: ( rule__Picture__TemporalPositionAssignment_7 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=29 && LA33_0<=30)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCinEditor.g:3381:3: rule__Picture__TemporalPositionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__TemporalPositionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getTemporalPositionAssignment_7()); 

            }


            }

        }
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
    // InternalCinEditor.g:3389:1: rule__Picture__Group__8 : rule__Picture__Group__8__Impl ;
    public final void rule__Picture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3393:1: ( rule__Picture__Group__8__Impl )
            // InternalCinEditor.g:3394:2: rule__Picture__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group__8__Impl();

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
    // InternalCinEditor.g:3400:1: rule__Picture__Group__8__Impl : ( ( rule__Picture__Group_8__0 )? ) ;
    public final void rule__Picture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3404:1: ( ( ( rule__Picture__Group_8__0 )? ) )
            // InternalCinEditor.g:3405:1: ( ( rule__Picture__Group_8__0 )? )
            {
            // InternalCinEditor.g:3405:1: ( ( rule__Picture__Group_8__0 )? )
            // InternalCinEditor.g:3406:2: ( rule__Picture__Group_8__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_8()); 
            // InternalCinEditor.g:3407:2: ( rule__Picture__Group_8__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCinEditor.g:3407:3: rule__Picture__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Picture__Group_6__0"
    // InternalCinEditor.g:3416:1: rule__Picture__Group_6__0 : rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1 ;
    public final void rule__Picture__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3420:1: ( rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1 )
            // InternalCinEditor.g:3421:2: rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1
            {
            pushFollow(FOLLOW_23);
            rule__Picture__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_6__1();

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
    // $ANTLR end "rule__Picture__Group_6__0"


    // $ANTLR start "rule__Picture__Group_6__0__Impl"
    // InternalCinEditor.g:3428:1: rule__Picture__Group_6__0__Impl : ( 'margins(' ) ;
    public final void rule__Picture__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3432:1: ( ( 'margins(' ) )
            // InternalCinEditor.g:3433:1: ( 'margins(' )
            {
            // InternalCinEditor.g:3433:1: ( 'margins(' )
            // InternalCinEditor.g:3434:2: 'margins('
            {
             before(grammarAccess.getPictureAccess().getMarginsKeyword_6_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getMarginsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group_6__0__Impl"


    // $ANTLR start "rule__Picture__Group_6__1"
    // InternalCinEditor.g:3443:1: rule__Picture__Group_6__1 : rule__Picture__Group_6__1__Impl rule__Picture__Group_6__2 ;
    public final void rule__Picture__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3447:1: ( rule__Picture__Group_6__1__Impl rule__Picture__Group_6__2 )
            // InternalCinEditor.g:3448:2: rule__Picture__Group_6__1__Impl rule__Picture__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__Picture__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_6__2();

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
    // $ANTLR end "rule__Picture__Group_6__1"


    // $ANTLR start "rule__Picture__Group_6__1__Impl"
    // InternalCinEditor.g:3455:1: rule__Picture__Group_6__1__Impl : ( ( ( rule__Picture__MarginsAssignment_6_1 ) ) ( ( rule__Picture__MarginsAssignment_6_1 )* ) ) ;
    public final void rule__Picture__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3459:1: ( ( ( ( rule__Picture__MarginsAssignment_6_1 ) ) ( ( rule__Picture__MarginsAssignment_6_1 )* ) ) )
            // InternalCinEditor.g:3460:1: ( ( ( rule__Picture__MarginsAssignment_6_1 ) ) ( ( rule__Picture__MarginsAssignment_6_1 )* ) )
            {
            // InternalCinEditor.g:3460:1: ( ( ( rule__Picture__MarginsAssignment_6_1 ) ) ( ( rule__Picture__MarginsAssignment_6_1 )* ) )
            // InternalCinEditor.g:3461:2: ( ( rule__Picture__MarginsAssignment_6_1 ) ) ( ( rule__Picture__MarginsAssignment_6_1 )* )
            {
            // InternalCinEditor.g:3461:2: ( ( rule__Picture__MarginsAssignment_6_1 ) )
            // InternalCinEditor.g:3462:3: ( rule__Picture__MarginsAssignment_6_1 )
            {
             before(grammarAccess.getPictureAccess().getMarginsAssignment_6_1()); 
            // InternalCinEditor.g:3463:3: ( rule__Picture__MarginsAssignment_6_1 )
            // InternalCinEditor.g:3463:4: rule__Picture__MarginsAssignment_6_1
            {
            pushFollow(FOLLOW_24);
            rule__Picture__MarginsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getMarginsAssignment_6_1()); 

            }

            // InternalCinEditor.g:3466:2: ( ( rule__Picture__MarginsAssignment_6_1 )* )
            // InternalCinEditor.g:3467:3: ( rule__Picture__MarginsAssignment_6_1 )*
            {
             before(grammarAccess.getPictureAccess().getMarginsAssignment_6_1()); 
            // InternalCinEditor.g:3468:3: ( rule__Picture__MarginsAssignment_6_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=12 && LA35_0<=15)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalCinEditor.g:3468:4: rule__Picture__MarginsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Picture__MarginsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getPictureAccess().getMarginsAssignment_6_1()); 

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
    // $ANTLR end "rule__Picture__Group_6__1__Impl"


    // $ANTLR start "rule__Picture__Group_6__2"
    // InternalCinEditor.g:3477:1: rule__Picture__Group_6__2 : rule__Picture__Group_6__2__Impl ;
    public final void rule__Picture__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3481:1: ( rule__Picture__Group_6__2__Impl )
            // InternalCinEditor.g:3482:2: rule__Picture__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group_6__2__Impl();

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
    // $ANTLR end "rule__Picture__Group_6__2"


    // $ANTLR start "rule__Picture__Group_6__2__Impl"
    // InternalCinEditor.g:3488:1: rule__Picture__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Picture__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3492:1: ( ( ')' ) )
            // InternalCinEditor.g:3493:1: ( ')' )
            {
            // InternalCinEditor.g:3493:1: ( ')' )
            // InternalCinEditor.g:3494:2: ')'
            {
             before(grammarAccess.getPictureAccess().getRightParenthesisKeyword_6_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getRightParenthesisKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group_6__2__Impl"


    // $ANTLR start "rule__Picture__Group_8__0"
    // InternalCinEditor.g:3504:1: rule__Picture__Group_8__0 : rule__Picture__Group_8__0__Impl rule__Picture__Group_8__1 ;
    public final void rule__Picture__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3508:1: ( rule__Picture__Group_8__0__Impl rule__Picture__Group_8__1 )
            // InternalCinEditor.g:3509:2: rule__Picture__Group_8__0__Impl rule__Picture__Group_8__1
            {
            pushFollow(FOLLOW_7);
            rule__Picture__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_8__1();

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
    // $ANTLR end "rule__Picture__Group_8__0"


    // $ANTLR start "rule__Picture__Group_8__0__Impl"
    // InternalCinEditor.g:3516:1: rule__Picture__Group_8__0__Impl : ( 'during' ) ;
    public final void rule__Picture__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3520:1: ( ( 'during' ) )
            // InternalCinEditor.g:3521:1: ( 'during' )
            {
            // InternalCinEditor.g:3521:1: ( 'during' )
            // InternalCinEditor.g:3522:2: 'during'
            {
             before(grammarAccess.getPictureAccess().getDuringKeyword_8_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getDuringKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group_8__0__Impl"


    // $ANTLR start "rule__Picture__Group_8__1"
    // InternalCinEditor.g:3531:1: rule__Picture__Group_8__1 : rule__Picture__Group_8__1__Impl ;
    public final void rule__Picture__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3535:1: ( rule__Picture__Group_8__1__Impl )
            // InternalCinEditor.g:3536:2: rule__Picture__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group_8__1__Impl();

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
    // $ANTLR end "rule__Picture__Group_8__1"


    // $ANTLR start "rule__Picture__Group_8__1__Impl"
    // InternalCinEditor.g:3542:1: rule__Picture__Group_8__1__Impl : ( ( rule__Picture__DurationAssignment_8_1 ) ) ;
    public final void rule__Picture__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3546:1: ( ( ( rule__Picture__DurationAssignment_8_1 ) ) )
            // InternalCinEditor.g:3547:1: ( ( rule__Picture__DurationAssignment_8_1 ) )
            {
            // InternalCinEditor.g:3547:1: ( ( rule__Picture__DurationAssignment_8_1 ) )
            // InternalCinEditor.g:3548:2: ( rule__Picture__DurationAssignment_8_1 )
            {
             before(grammarAccess.getPictureAccess().getDurationAssignment_8_1()); 
            // InternalCinEditor.g:3549:2: ( rule__Picture__DurationAssignment_8_1 )
            // InternalCinEditor.g:3549:3: rule__Picture__DurationAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Picture__DurationAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getDurationAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group_8__1__Impl"


    // $ANTLR start "rule__Video__Group__0"
    // InternalCinEditor.g:3558:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3562:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalCinEditor.g:3563:2: rule__Video__Group__0__Impl rule__Video__Group__1
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
    // InternalCinEditor.g:3570:1: rule__Video__Group__0__Impl : ( 'Video' ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3574:1: ( ( 'Video' ) )
            // InternalCinEditor.g:3575:1: ( 'Video' )
            {
            // InternalCinEditor.g:3575:1: ( 'Video' )
            // InternalCinEditor.g:3576:2: 'Video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCinEditor.g:3585:1: rule__Video__Group__1 : rule__Video__Group__1__Impl rule__Video__Group__2 ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3589:1: ( rule__Video__Group__1__Impl rule__Video__Group__2 )
            // InternalCinEditor.g:3590:2: rule__Video__Group__1__Impl rule__Video__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:3597:1: rule__Video__Group__1__Impl : ( ( rule__Video__NameAssignment_1 ) ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3601:1: ( ( ( rule__Video__NameAssignment_1 ) ) )
            // InternalCinEditor.g:3602:1: ( ( rule__Video__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:3602:1: ( ( rule__Video__NameAssignment_1 ) )
            // InternalCinEditor.g:3603:2: ( rule__Video__NameAssignment_1 )
            {
             before(grammarAccess.getVideoAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:3604:2: ( rule__Video__NameAssignment_1 )
            // InternalCinEditor.g:3604:3: rule__Video__NameAssignment_1
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
    // InternalCinEditor.g:3612:1: rule__Video__Group__2 : rule__Video__Group__2__Impl rule__Video__Group__3 ;
    public final void rule__Video__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3616:1: ( rule__Video__Group__2__Impl rule__Video__Group__3 )
            // InternalCinEditor.g:3617:2: rule__Video__Group__2__Impl rule__Video__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalCinEditor.g:3624:1: rule__Video__Group__2__Impl : ( '=' ) ;
    public final void rule__Video__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3628:1: ( ( '=' ) )
            // InternalCinEditor.g:3629:1: ( '=' )
            {
            // InternalCinEditor.g:3629:1: ( '=' )
            // InternalCinEditor.g:3630:2: '='
            {
             before(grammarAccess.getVideoAccess().getEqualsSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalCinEditor.g:3639:1: rule__Video__Group__3 : rule__Video__Group__3__Impl rule__Video__Group__4 ;
    public final void rule__Video__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3643:1: ( rule__Video__Group__3__Impl rule__Video__Group__4 )
            // InternalCinEditor.g:3644:2: rule__Video__Group__3__Impl rule__Video__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalCinEditor.g:3651:1: rule__Video__Group__3__Impl : ( ( rule__Video__UrlAssignment_3 ) ) ;
    public final void rule__Video__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3655:1: ( ( ( rule__Video__UrlAssignment_3 ) ) )
            // InternalCinEditor.g:3656:1: ( ( rule__Video__UrlAssignment_3 ) )
            {
            // InternalCinEditor.g:3656:1: ( ( rule__Video__UrlAssignment_3 ) )
            // InternalCinEditor.g:3657:2: ( rule__Video__UrlAssignment_3 )
            {
             before(grammarAccess.getVideoAccess().getUrlAssignment_3()); 
            // InternalCinEditor.g:3658:2: ( rule__Video__UrlAssignment_3 )
            // InternalCinEditor.g:3658:3: rule__Video__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Video__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getUrlAssignment_3()); 

            }


            }

        }
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
    // InternalCinEditor.g:3666:1: rule__Video__Group__4 : rule__Video__Group__4__Impl rule__Video__Group__5 ;
    public final void rule__Video__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3670:1: ( rule__Video__Group__4__Impl rule__Video__Group__5 )
            // InternalCinEditor.g:3671:2: rule__Video__Group__4__Impl rule__Video__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalCinEditor.g:3678:1: rule__Video__Group__4__Impl : ( ( rule__Video__Group_4__0 )? ) ;
    public final void rule__Video__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3682:1: ( ( ( rule__Video__Group_4__0 )? ) )
            // InternalCinEditor.g:3683:1: ( ( rule__Video__Group_4__0 )? )
            {
            // InternalCinEditor.g:3683:1: ( ( rule__Video__Group_4__0 )? )
            // InternalCinEditor.g:3684:2: ( rule__Video__Group_4__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_4()); 
            // InternalCinEditor.g:3685:2: ( rule__Video__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==45) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCinEditor.g:3685:3: rule__Video__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalCinEditor.g:3693:1: rule__Video__Group__5 : rule__Video__Group__5__Impl rule__Video__Group__6 ;
    public final void rule__Video__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3697:1: ( rule__Video__Group__5__Impl rule__Video__Group__6 )
            // InternalCinEditor.g:3698:2: rule__Video__Group__5__Impl rule__Video__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalCinEditor.g:3705:1: rule__Video__Group__5__Impl : ( ( rule__Video__PositionAssignment_5 )? ) ;
    public final void rule__Video__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3709:1: ( ( ( rule__Video__PositionAssignment_5 )? ) )
            // InternalCinEditor.g:3710:1: ( ( rule__Video__PositionAssignment_5 )? )
            {
            // InternalCinEditor.g:3710:1: ( ( rule__Video__PositionAssignment_5 )? )
            // InternalCinEditor.g:3711:2: ( rule__Video__PositionAssignment_5 )?
            {
             before(grammarAccess.getVideoAccess().getPositionAssignment_5()); 
            // InternalCinEditor.g:3712:2: ( rule__Video__PositionAssignment_5 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCinEditor.g:3712:3: rule__Video__PositionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__PositionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getPositionAssignment_5()); 

            }


            }

        }
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
    // InternalCinEditor.g:3720:1: rule__Video__Group__6 : rule__Video__Group__6__Impl rule__Video__Group__7 ;
    public final void rule__Video__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3724:1: ( rule__Video__Group__6__Impl rule__Video__Group__7 )
            // InternalCinEditor.g:3725:2: rule__Video__Group__6__Impl rule__Video__Group__7
            {
            pushFollow(FOLLOW_26);
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
    // InternalCinEditor.g:3732:1: rule__Video__Group__6__Impl : ( ( rule__Video__DimensionAssignment_6 )? ) ;
    public final void rule__Video__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3736:1: ( ( ( rule__Video__DimensionAssignment_6 )? ) )
            // InternalCinEditor.g:3737:1: ( ( rule__Video__DimensionAssignment_6 )? )
            {
            // InternalCinEditor.g:3737:1: ( ( rule__Video__DimensionAssignment_6 )? )
            // InternalCinEditor.g:3738:2: ( rule__Video__DimensionAssignment_6 )?
            {
             before(grammarAccess.getVideoAccess().getDimensionAssignment_6()); 
            // InternalCinEditor.g:3739:2: ( rule__Video__DimensionAssignment_6 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCinEditor.g:3739:3: rule__Video__DimensionAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__DimensionAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getDimensionAssignment_6()); 

            }


            }

        }
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
    // InternalCinEditor.g:3747:1: rule__Video__Group__7 : rule__Video__Group__7__Impl rule__Video__Group__8 ;
    public final void rule__Video__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3751:1: ( rule__Video__Group__7__Impl rule__Video__Group__8 )
            // InternalCinEditor.g:3752:2: rule__Video__Group__7__Impl rule__Video__Group__8
            {
            pushFollow(FOLLOW_26);
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
    // InternalCinEditor.g:3759:1: rule__Video__Group__7__Impl : ( ( rule__Video__Group_7__0 )? ) ;
    public final void rule__Video__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3763:1: ( ( ( rule__Video__Group_7__0 )? ) )
            // InternalCinEditor.g:3764:1: ( ( rule__Video__Group_7__0 )? )
            {
            // InternalCinEditor.g:3764:1: ( ( rule__Video__Group_7__0 )? )
            // InternalCinEditor.g:3765:2: ( rule__Video__Group_7__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_7()); 
            // InternalCinEditor.g:3766:2: ( rule__Video__Group_7__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCinEditor.g:3766:3: rule__Video__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalCinEditor.g:3774:1: rule__Video__Group__8 : rule__Video__Group__8__Impl rule__Video__Group__9 ;
    public final void rule__Video__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3778:1: ( rule__Video__Group__8__Impl rule__Video__Group__9 )
            // InternalCinEditor.g:3779:2: rule__Video__Group__8__Impl rule__Video__Group__9
            {
            pushFollow(FOLLOW_26);
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
    // InternalCinEditor.g:3786:1: rule__Video__Group__8__Impl : ( ( rule__Video__TemporalPositionAssignment_8 )? ) ;
    public final void rule__Video__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3790:1: ( ( ( rule__Video__TemporalPositionAssignment_8 )? ) )
            // InternalCinEditor.g:3791:1: ( ( rule__Video__TemporalPositionAssignment_8 )? )
            {
            // InternalCinEditor.g:3791:1: ( ( rule__Video__TemporalPositionAssignment_8 )? )
            // InternalCinEditor.g:3792:2: ( rule__Video__TemporalPositionAssignment_8 )?
            {
             before(grammarAccess.getVideoAccess().getTemporalPositionAssignment_8()); 
            // InternalCinEditor.g:3793:2: ( rule__Video__TemporalPositionAssignment_8 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=29 && LA40_0<=30)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCinEditor.g:3793:3: rule__Video__TemporalPositionAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__TemporalPositionAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getTemporalPositionAssignment_8()); 

            }


            }

        }
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
    // InternalCinEditor.g:3801:1: rule__Video__Group__9 : rule__Video__Group__9__Impl rule__Video__Group__10 ;
    public final void rule__Video__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3805:1: ( rule__Video__Group__9__Impl rule__Video__Group__10 )
            // InternalCinEditor.g:3806:2: rule__Video__Group__9__Impl rule__Video__Group__10
            {
            pushFollow(FOLLOW_26);
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
    // InternalCinEditor.g:3813:1: rule__Video__Group__9__Impl : ( ( rule__Video__Group_9__0 )? ) ;
    public final void rule__Video__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3817:1: ( ( ( rule__Video__Group_9__0 )? ) )
            // InternalCinEditor.g:3818:1: ( ( rule__Video__Group_9__0 )? )
            {
            // InternalCinEditor.g:3818:1: ( ( rule__Video__Group_9__0 )? )
            // InternalCinEditor.g:3819:2: ( rule__Video__Group_9__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_9()); 
            // InternalCinEditor.g:3820:2: ( rule__Video__Group_9__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCinEditor.g:3820:3: rule__Video__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getGroup_9()); 

            }


            }

        }
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
    // InternalCinEditor.g:3828:1: rule__Video__Group__10 : rule__Video__Group__10__Impl rule__Video__Group__11 ;
    public final void rule__Video__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3832:1: ( rule__Video__Group__10__Impl rule__Video__Group__11 )
            // InternalCinEditor.g:3833:2: rule__Video__Group__10__Impl rule__Video__Group__11
            {
            pushFollow(FOLLOW_7);
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
    // InternalCinEditor.g:3840:1: rule__Video__Group__10__Impl : ( 'during' ) ;
    public final void rule__Video__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3844:1: ( ( 'during' ) )
            // InternalCinEditor.g:3845:1: ( 'during' )
            {
            // InternalCinEditor.g:3845:1: ( 'during' )
            // InternalCinEditor.g:3846:2: 'during'
            {
             before(grammarAccess.getVideoAccess().getDuringKeyword_10()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getDuringKeyword_10()); 

            }


            }

        }
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
    // InternalCinEditor.g:3855:1: rule__Video__Group__11 : rule__Video__Group__11__Impl ;
    public final void rule__Video__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3859:1: ( rule__Video__Group__11__Impl )
            // InternalCinEditor.g:3860:2: rule__Video__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__11__Impl();

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
    // InternalCinEditor.g:3866:1: rule__Video__Group__11__Impl : ( ( rule__Video__DurationAssignment_11 ) ) ;
    public final void rule__Video__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3870:1: ( ( ( rule__Video__DurationAssignment_11 ) ) )
            // InternalCinEditor.g:3871:1: ( ( rule__Video__DurationAssignment_11 ) )
            {
            // InternalCinEditor.g:3871:1: ( ( rule__Video__DurationAssignment_11 ) )
            // InternalCinEditor.g:3872:2: ( rule__Video__DurationAssignment_11 )
            {
             before(grammarAccess.getVideoAccess().getDurationAssignment_11()); 
            // InternalCinEditor.g:3873:2: ( rule__Video__DurationAssignment_11 )
            // InternalCinEditor.g:3873:3: rule__Video__DurationAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Video__DurationAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getDurationAssignment_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__Video__Group_4__0"
    // InternalCinEditor.g:3882:1: rule__Video__Group_4__0 : rule__Video__Group_4__0__Impl rule__Video__Group_4__1 ;
    public final void rule__Video__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3886:1: ( rule__Video__Group_4__0__Impl rule__Video__Group_4__1 )
            // InternalCinEditor.g:3887:2: rule__Video__Group_4__0__Impl rule__Video__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__Video__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_4__1();

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
    // $ANTLR end "rule__Video__Group_4__0"


    // $ANTLR start "rule__Video__Group_4__0__Impl"
    // InternalCinEditor.g:3894:1: rule__Video__Group_4__0__Impl : ( 'audio' ) ;
    public final void rule__Video__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3898:1: ( ( 'audio' ) )
            // InternalCinEditor.g:3899:1: ( 'audio' )
            {
            // InternalCinEditor.g:3899:1: ( 'audio' )
            // InternalCinEditor.g:3900:2: 'audio'
            {
             before(grammarAccess.getVideoAccess().getAudioKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getAudioKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_4__0__Impl"


    // $ANTLR start "rule__Video__Group_4__1"
    // InternalCinEditor.g:3909:1: rule__Video__Group_4__1 : rule__Video__Group_4__1__Impl ;
    public final void rule__Video__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3913:1: ( rule__Video__Group_4__1__Impl )
            // InternalCinEditor.g:3914:2: rule__Video__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_4__1__Impl();

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
    // $ANTLR end "rule__Video__Group_4__1"


    // $ANTLR start "rule__Video__Group_4__1__Impl"
    // InternalCinEditor.g:3920:1: rule__Video__Group_4__1__Impl : ( ( rule__Video__EnableAudioAssignment_4_1 ) ) ;
    public final void rule__Video__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3924:1: ( ( ( rule__Video__EnableAudioAssignment_4_1 ) ) )
            // InternalCinEditor.g:3925:1: ( ( rule__Video__EnableAudioAssignment_4_1 ) )
            {
            // InternalCinEditor.g:3925:1: ( ( rule__Video__EnableAudioAssignment_4_1 ) )
            // InternalCinEditor.g:3926:2: ( rule__Video__EnableAudioAssignment_4_1 )
            {
             before(grammarAccess.getVideoAccess().getEnableAudioAssignment_4_1()); 
            // InternalCinEditor.g:3927:2: ( rule__Video__EnableAudioAssignment_4_1 )
            // InternalCinEditor.g:3927:3: rule__Video__EnableAudioAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__EnableAudioAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getEnableAudioAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_4__1__Impl"


    // $ANTLR start "rule__Video__Group_7__0"
    // InternalCinEditor.g:3936:1: rule__Video__Group_7__0 : rule__Video__Group_7__0__Impl rule__Video__Group_7__1 ;
    public final void rule__Video__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3940:1: ( rule__Video__Group_7__0__Impl rule__Video__Group_7__1 )
            // InternalCinEditor.g:3941:2: rule__Video__Group_7__0__Impl rule__Video__Group_7__1
            {
            pushFollow(FOLLOW_23);
            rule__Video__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_7__1();

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
    // $ANTLR end "rule__Video__Group_7__0"


    // $ANTLR start "rule__Video__Group_7__0__Impl"
    // InternalCinEditor.g:3948:1: rule__Video__Group_7__0__Impl : ( 'margins(' ) ;
    public final void rule__Video__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3952:1: ( ( 'margins(' ) )
            // InternalCinEditor.g:3953:1: ( 'margins(' )
            {
            // InternalCinEditor.g:3953:1: ( 'margins(' )
            // InternalCinEditor.g:3954:2: 'margins('
            {
             before(grammarAccess.getVideoAccess().getMarginsKeyword_7_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getMarginsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_7__0__Impl"


    // $ANTLR start "rule__Video__Group_7__1"
    // InternalCinEditor.g:3963:1: rule__Video__Group_7__1 : rule__Video__Group_7__1__Impl rule__Video__Group_7__2 ;
    public final void rule__Video__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3967:1: ( rule__Video__Group_7__1__Impl rule__Video__Group_7__2 )
            // InternalCinEditor.g:3968:2: rule__Video__Group_7__1__Impl rule__Video__Group_7__2
            {
            pushFollow(FOLLOW_13);
            rule__Video__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_7__2();

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
    // $ANTLR end "rule__Video__Group_7__1"


    // $ANTLR start "rule__Video__Group_7__1__Impl"
    // InternalCinEditor.g:3975:1: rule__Video__Group_7__1__Impl : ( ( ( rule__Video__MarginsAssignment_7_1 ) ) ( ( rule__Video__MarginsAssignment_7_1 )* ) ) ;
    public final void rule__Video__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3979:1: ( ( ( ( rule__Video__MarginsAssignment_7_1 ) ) ( ( rule__Video__MarginsAssignment_7_1 )* ) ) )
            // InternalCinEditor.g:3980:1: ( ( ( rule__Video__MarginsAssignment_7_1 ) ) ( ( rule__Video__MarginsAssignment_7_1 )* ) )
            {
            // InternalCinEditor.g:3980:1: ( ( ( rule__Video__MarginsAssignment_7_1 ) ) ( ( rule__Video__MarginsAssignment_7_1 )* ) )
            // InternalCinEditor.g:3981:2: ( ( rule__Video__MarginsAssignment_7_1 ) ) ( ( rule__Video__MarginsAssignment_7_1 )* )
            {
            // InternalCinEditor.g:3981:2: ( ( rule__Video__MarginsAssignment_7_1 ) )
            // InternalCinEditor.g:3982:3: ( rule__Video__MarginsAssignment_7_1 )
            {
             before(grammarAccess.getVideoAccess().getMarginsAssignment_7_1()); 
            // InternalCinEditor.g:3983:3: ( rule__Video__MarginsAssignment_7_1 )
            // InternalCinEditor.g:3983:4: rule__Video__MarginsAssignment_7_1
            {
            pushFollow(FOLLOW_24);
            rule__Video__MarginsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getMarginsAssignment_7_1()); 

            }

            // InternalCinEditor.g:3986:2: ( ( rule__Video__MarginsAssignment_7_1 )* )
            // InternalCinEditor.g:3987:3: ( rule__Video__MarginsAssignment_7_1 )*
            {
             before(grammarAccess.getVideoAccess().getMarginsAssignment_7_1()); 
            // InternalCinEditor.g:3988:3: ( rule__Video__MarginsAssignment_7_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=12 && LA42_0<=15)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalCinEditor.g:3988:4: rule__Video__MarginsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Video__MarginsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getVideoAccess().getMarginsAssignment_7_1()); 

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
    // $ANTLR end "rule__Video__Group_7__1__Impl"


    // $ANTLR start "rule__Video__Group_7__2"
    // InternalCinEditor.g:3997:1: rule__Video__Group_7__2 : rule__Video__Group_7__2__Impl ;
    public final void rule__Video__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4001:1: ( rule__Video__Group_7__2__Impl )
            // InternalCinEditor.g:4002:2: rule__Video__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_7__2__Impl();

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
    // $ANTLR end "rule__Video__Group_7__2"


    // $ANTLR start "rule__Video__Group_7__2__Impl"
    // InternalCinEditor.g:4008:1: rule__Video__Group_7__2__Impl : ( ')' ) ;
    public final void rule__Video__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4012:1: ( ( ')' ) )
            // InternalCinEditor.g:4013:1: ( ')' )
            {
            // InternalCinEditor.g:4013:1: ( ')' )
            // InternalCinEditor.g:4014:2: ')'
            {
             before(grammarAccess.getVideoAccess().getRightParenthesisKeyword_7_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getRightParenthesisKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_7__2__Impl"


    // $ANTLR start "rule__Video__Group_9__0"
    // InternalCinEditor.g:4024:1: rule__Video__Group_9__0 : rule__Video__Group_9__0__Impl rule__Video__Group_9__1 ;
    public final void rule__Video__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4028:1: ( rule__Video__Group_9__0__Impl rule__Video__Group_9__1 )
            // InternalCinEditor.g:4029:2: rule__Video__Group_9__0__Impl rule__Video__Group_9__1
            {
            pushFollow(FOLLOW_7);
            rule__Video__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_9__1();

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
    // $ANTLR end "rule__Video__Group_9__0"


    // $ANTLR start "rule__Video__Group_9__0__Impl"
    // InternalCinEditor.g:4036:1: rule__Video__Group_9__0__Impl : ( 'cropAt' ) ;
    public final void rule__Video__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4040:1: ( ( 'cropAt' ) )
            // InternalCinEditor.g:4041:1: ( 'cropAt' )
            {
            // InternalCinEditor.g:4041:1: ( 'cropAt' )
            // InternalCinEditor.g:4042:2: 'cropAt'
            {
             before(grammarAccess.getVideoAccess().getCropAtKeyword_9_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getCropAtKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_9__0__Impl"


    // $ANTLR start "rule__Video__Group_9__1"
    // InternalCinEditor.g:4051:1: rule__Video__Group_9__1 : rule__Video__Group_9__1__Impl ;
    public final void rule__Video__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4055:1: ( rule__Video__Group_9__1__Impl )
            // InternalCinEditor.g:4056:2: rule__Video__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_9__1__Impl();

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
    // $ANTLR end "rule__Video__Group_9__1"


    // $ANTLR start "rule__Video__Group_9__1__Impl"
    // InternalCinEditor.g:4062:1: rule__Video__Group_9__1__Impl : ( ( rule__Video__BeginCropTimeAssignment_9_1 ) ) ;
    public final void rule__Video__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4066:1: ( ( ( rule__Video__BeginCropTimeAssignment_9_1 ) ) )
            // InternalCinEditor.g:4067:1: ( ( rule__Video__BeginCropTimeAssignment_9_1 ) )
            {
            // InternalCinEditor.g:4067:1: ( ( rule__Video__BeginCropTimeAssignment_9_1 ) )
            // InternalCinEditor.g:4068:2: ( rule__Video__BeginCropTimeAssignment_9_1 )
            {
             before(grammarAccess.getVideoAccess().getBeginCropTimeAssignment_9_1()); 
            // InternalCinEditor.g:4069:2: ( rule__Video__BeginCropTimeAssignment_9_1 )
            // InternalCinEditor.g:4069:3: rule__Video__BeginCropTimeAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__BeginCropTimeAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getBeginCropTimeAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_9__1__Impl"


    // $ANTLR start "rule__Rectangle__Group__0"
    // InternalCinEditor.g:4078:1: rule__Rectangle__Group__0 : rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 ;
    public final void rule__Rectangle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4082:1: ( rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 )
            // InternalCinEditor.g:4083:2: rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1
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
    // InternalCinEditor.g:4090:1: rule__Rectangle__Group__0__Impl : ( 'Rectangle' ) ;
    public final void rule__Rectangle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4094:1: ( ( 'Rectangle' ) )
            // InternalCinEditor.g:4095:1: ( 'Rectangle' )
            {
            // InternalCinEditor.g:4095:1: ( 'Rectangle' )
            // InternalCinEditor.g:4096:2: 'Rectangle'
            {
             before(grammarAccess.getRectangleAccess().getRectangleKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCinEditor.g:4105:1: rule__Rectangle__Group__1 : rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 ;
    public final void rule__Rectangle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4109:1: ( rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 )
            // InternalCinEditor.g:4110:2: rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:4117:1: rule__Rectangle__Group__1__Impl : ( ( rule__Rectangle__NameAssignment_1 ) ) ;
    public final void rule__Rectangle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4121:1: ( ( ( rule__Rectangle__NameAssignment_1 ) ) )
            // InternalCinEditor.g:4122:1: ( ( rule__Rectangle__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:4122:1: ( ( rule__Rectangle__NameAssignment_1 ) )
            // InternalCinEditor.g:4123:2: ( rule__Rectangle__NameAssignment_1 )
            {
             before(grammarAccess.getRectangleAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:4124:2: ( rule__Rectangle__NameAssignment_1 )
            // InternalCinEditor.g:4124:3: rule__Rectangle__NameAssignment_1
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
    // InternalCinEditor.g:4132:1: rule__Rectangle__Group__2 : rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 ;
    public final void rule__Rectangle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4136:1: ( rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 )
            // InternalCinEditor.g:4137:2: rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalCinEditor.g:4144:1: rule__Rectangle__Group__2__Impl : ( '=' ) ;
    public final void rule__Rectangle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4148:1: ( ( '=' ) )
            // InternalCinEditor.g:4149:1: ( '=' )
            {
            // InternalCinEditor.g:4149:1: ( '=' )
            // InternalCinEditor.g:4150:2: '='
            {
             before(grammarAccess.getRectangleAccess().getEqualsSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalCinEditor.g:4159:1: rule__Rectangle__Group__3 : rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 ;
    public final void rule__Rectangle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4163:1: ( rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 )
            // InternalCinEditor.g:4164:2: rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:4171:1: rule__Rectangle__Group__3__Impl : ( ( rule__Rectangle__ColorAssignment_3 ) ) ;
    public final void rule__Rectangle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4175:1: ( ( ( rule__Rectangle__ColorAssignment_3 ) ) )
            // InternalCinEditor.g:4176:1: ( ( rule__Rectangle__ColorAssignment_3 ) )
            {
            // InternalCinEditor.g:4176:1: ( ( rule__Rectangle__ColorAssignment_3 ) )
            // InternalCinEditor.g:4177:2: ( rule__Rectangle__ColorAssignment_3 )
            {
             before(grammarAccess.getRectangleAccess().getColorAssignment_3()); 
            // InternalCinEditor.g:4178:2: ( rule__Rectangle__ColorAssignment_3 )
            // InternalCinEditor.g:4178:3: rule__Rectangle__ColorAssignment_3
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
    // InternalCinEditor.g:4186:1: rule__Rectangle__Group__4 : rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 ;
    public final void rule__Rectangle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4190:1: ( rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 )
            // InternalCinEditor.g:4191:2: rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:4198:1: rule__Rectangle__Group__4__Impl : ( ( rule__Rectangle__PositionAssignment_4 )? ) ;
    public final void rule__Rectangle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4202:1: ( ( ( rule__Rectangle__PositionAssignment_4 )? ) )
            // InternalCinEditor.g:4203:1: ( ( rule__Rectangle__PositionAssignment_4 )? )
            {
            // InternalCinEditor.g:4203:1: ( ( rule__Rectangle__PositionAssignment_4 )? )
            // InternalCinEditor.g:4204:2: ( rule__Rectangle__PositionAssignment_4 )?
            {
             before(grammarAccess.getRectangleAccess().getPositionAssignment_4()); 
            // InternalCinEditor.g:4205:2: ( rule__Rectangle__PositionAssignment_4 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==23) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCinEditor.g:4205:3: rule__Rectangle__PositionAssignment_4
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
    // InternalCinEditor.g:4213:1: rule__Rectangle__Group__5 : rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 ;
    public final void rule__Rectangle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4217:1: ( rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 )
            // InternalCinEditor.g:4218:2: rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:4225:1: rule__Rectangle__Group__5__Impl : ( ( rule__Rectangle__DimensionAssignment_5 )? ) ;
    public final void rule__Rectangle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4229:1: ( ( ( rule__Rectangle__DimensionAssignment_5 )? ) )
            // InternalCinEditor.g:4230:1: ( ( rule__Rectangle__DimensionAssignment_5 )? )
            {
            // InternalCinEditor.g:4230:1: ( ( rule__Rectangle__DimensionAssignment_5 )? )
            // InternalCinEditor.g:4231:2: ( rule__Rectangle__DimensionAssignment_5 )?
            {
             before(grammarAccess.getRectangleAccess().getDimensionAssignment_5()); 
            // InternalCinEditor.g:4232:2: ( rule__Rectangle__DimensionAssignment_5 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==26) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCinEditor.g:4232:3: rule__Rectangle__DimensionAssignment_5
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
    // InternalCinEditor.g:4240:1: rule__Rectangle__Group__6 : rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 ;
    public final void rule__Rectangle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4244:1: ( rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 )
            // InternalCinEditor.g:4245:2: rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:4252:1: rule__Rectangle__Group__6__Impl : ( ( rule__Rectangle__Group_6__0 )? ) ;
    public final void rule__Rectangle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4256:1: ( ( ( rule__Rectangle__Group_6__0 )? ) )
            // InternalCinEditor.g:4257:1: ( ( rule__Rectangle__Group_6__0 )? )
            {
            // InternalCinEditor.g:4257:1: ( ( rule__Rectangle__Group_6__0 )? )
            // InternalCinEditor.g:4258:2: ( rule__Rectangle__Group_6__0 )?
            {
             before(grammarAccess.getRectangleAccess().getGroup_6()); 
            // InternalCinEditor.g:4259:2: ( rule__Rectangle__Group_6__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==42) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCinEditor.g:4259:3: rule__Rectangle__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rectangle__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRectangleAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalCinEditor.g:4267:1: rule__Rectangle__Group__7 : rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8 ;
    public final void rule__Rectangle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4271:1: ( rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8 )
            // InternalCinEditor.g:4272:2: rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:4279:1: rule__Rectangle__Group__7__Impl : ( ( rule__Rectangle__TemporalPositionAssignment_7 )? ) ;
    public final void rule__Rectangle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4283:1: ( ( ( rule__Rectangle__TemporalPositionAssignment_7 )? ) )
            // InternalCinEditor.g:4284:1: ( ( rule__Rectangle__TemporalPositionAssignment_7 )? )
            {
            // InternalCinEditor.g:4284:1: ( ( rule__Rectangle__TemporalPositionAssignment_7 )? )
            // InternalCinEditor.g:4285:2: ( rule__Rectangle__TemporalPositionAssignment_7 )?
            {
             before(grammarAccess.getRectangleAccess().getTemporalPositionAssignment_7()); 
            // InternalCinEditor.g:4286:2: ( rule__Rectangle__TemporalPositionAssignment_7 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=29 && LA46_0<=30)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCinEditor.g:4286:3: rule__Rectangle__TemporalPositionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rectangle__TemporalPositionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRectangleAccess().getTemporalPositionAssignment_7()); 

            }


            }

        }
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
    // InternalCinEditor.g:4294:1: rule__Rectangle__Group__8 : rule__Rectangle__Group__8__Impl ;
    public final void rule__Rectangle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4298:1: ( rule__Rectangle__Group__8__Impl )
            // InternalCinEditor.g:4299:2: rule__Rectangle__Group__8__Impl
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
    // InternalCinEditor.g:4305:1: rule__Rectangle__Group__8__Impl : ( ( rule__Rectangle__Group_8__0 )? ) ;
    public final void rule__Rectangle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4309:1: ( ( ( rule__Rectangle__Group_8__0 )? ) )
            // InternalCinEditor.g:4310:1: ( ( rule__Rectangle__Group_8__0 )? )
            {
            // InternalCinEditor.g:4310:1: ( ( rule__Rectangle__Group_8__0 )? )
            // InternalCinEditor.g:4311:2: ( rule__Rectangle__Group_8__0 )?
            {
             before(grammarAccess.getRectangleAccess().getGroup_8()); 
            // InternalCinEditor.g:4312:2: ( rule__Rectangle__Group_8__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==35) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCinEditor.g:4312:3: rule__Rectangle__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rectangle__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRectangleAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Rectangle__Group_6__0"
    // InternalCinEditor.g:4321:1: rule__Rectangle__Group_6__0 : rule__Rectangle__Group_6__0__Impl rule__Rectangle__Group_6__1 ;
    public final void rule__Rectangle__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4325:1: ( rule__Rectangle__Group_6__0__Impl rule__Rectangle__Group_6__1 )
            // InternalCinEditor.g:4326:2: rule__Rectangle__Group_6__0__Impl rule__Rectangle__Group_6__1
            {
            pushFollow(FOLLOW_23);
            rule__Rectangle__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group_6__1();

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
    // $ANTLR end "rule__Rectangle__Group_6__0"


    // $ANTLR start "rule__Rectangle__Group_6__0__Impl"
    // InternalCinEditor.g:4333:1: rule__Rectangle__Group_6__0__Impl : ( 'margins(' ) ;
    public final void rule__Rectangle__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4337:1: ( ( 'margins(' ) )
            // InternalCinEditor.g:4338:1: ( 'margins(' )
            {
            // InternalCinEditor.g:4338:1: ( 'margins(' )
            // InternalCinEditor.g:4339:2: 'margins('
            {
             before(grammarAccess.getRectangleAccess().getMarginsKeyword_6_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getMarginsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_6__0__Impl"


    // $ANTLR start "rule__Rectangle__Group_6__1"
    // InternalCinEditor.g:4348:1: rule__Rectangle__Group_6__1 : rule__Rectangle__Group_6__1__Impl rule__Rectangle__Group_6__2 ;
    public final void rule__Rectangle__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4352:1: ( rule__Rectangle__Group_6__1__Impl rule__Rectangle__Group_6__2 )
            // InternalCinEditor.g:4353:2: rule__Rectangle__Group_6__1__Impl rule__Rectangle__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__Rectangle__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group_6__2();

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
    // $ANTLR end "rule__Rectangle__Group_6__1"


    // $ANTLR start "rule__Rectangle__Group_6__1__Impl"
    // InternalCinEditor.g:4360:1: rule__Rectangle__Group_6__1__Impl : ( ( ( rule__Rectangle__MarginsAssignment_6_1 ) ) ( ( rule__Rectangle__MarginsAssignment_6_1 )* ) ) ;
    public final void rule__Rectangle__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4364:1: ( ( ( ( rule__Rectangle__MarginsAssignment_6_1 ) ) ( ( rule__Rectangle__MarginsAssignment_6_1 )* ) ) )
            // InternalCinEditor.g:4365:1: ( ( ( rule__Rectangle__MarginsAssignment_6_1 ) ) ( ( rule__Rectangle__MarginsAssignment_6_1 )* ) )
            {
            // InternalCinEditor.g:4365:1: ( ( ( rule__Rectangle__MarginsAssignment_6_1 ) ) ( ( rule__Rectangle__MarginsAssignment_6_1 )* ) )
            // InternalCinEditor.g:4366:2: ( ( rule__Rectangle__MarginsAssignment_6_1 ) ) ( ( rule__Rectangle__MarginsAssignment_6_1 )* )
            {
            // InternalCinEditor.g:4366:2: ( ( rule__Rectangle__MarginsAssignment_6_1 ) )
            // InternalCinEditor.g:4367:3: ( rule__Rectangle__MarginsAssignment_6_1 )
            {
             before(grammarAccess.getRectangleAccess().getMarginsAssignment_6_1()); 
            // InternalCinEditor.g:4368:3: ( rule__Rectangle__MarginsAssignment_6_1 )
            // InternalCinEditor.g:4368:4: rule__Rectangle__MarginsAssignment_6_1
            {
            pushFollow(FOLLOW_24);
            rule__Rectangle__MarginsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getMarginsAssignment_6_1()); 

            }

            // InternalCinEditor.g:4371:2: ( ( rule__Rectangle__MarginsAssignment_6_1 )* )
            // InternalCinEditor.g:4372:3: ( rule__Rectangle__MarginsAssignment_6_1 )*
            {
             before(grammarAccess.getRectangleAccess().getMarginsAssignment_6_1()); 
            // InternalCinEditor.g:4373:3: ( rule__Rectangle__MarginsAssignment_6_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=12 && LA48_0<=15)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalCinEditor.g:4373:4: rule__Rectangle__MarginsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Rectangle__MarginsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getRectangleAccess().getMarginsAssignment_6_1()); 

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
    // $ANTLR end "rule__Rectangle__Group_6__1__Impl"


    // $ANTLR start "rule__Rectangle__Group_6__2"
    // InternalCinEditor.g:4382:1: rule__Rectangle__Group_6__2 : rule__Rectangle__Group_6__2__Impl ;
    public final void rule__Rectangle__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4386:1: ( rule__Rectangle__Group_6__2__Impl )
            // InternalCinEditor.g:4387:2: rule__Rectangle__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group_6__2__Impl();

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
    // $ANTLR end "rule__Rectangle__Group_6__2"


    // $ANTLR start "rule__Rectangle__Group_6__2__Impl"
    // InternalCinEditor.g:4393:1: rule__Rectangle__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Rectangle__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4397:1: ( ( ')' ) )
            // InternalCinEditor.g:4398:1: ( ')' )
            {
            // InternalCinEditor.g:4398:1: ( ')' )
            // InternalCinEditor.g:4399:2: ')'
            {
             before(grammarAccess.getRectangleAccess().getRightParenthesisKeyword_6_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getRightParenthesisKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_6__2__Impl"


    // $ANTLR start "rule__Rectangle__Group_8__0"
    // InternalCinEditor.g:4409:1: rule__Rectangle__Group_8__0 : rule__Rectangle__Group_8__0__Impl rule__Rectangle__Group_8__1 ;
    public final void rule__Rectangle__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4413:1: ( rule__Rectangle__Group_8__0__Impl rule__Rectangle__Group_8__1 )
            // InternalCinEditor.g:4414:2: rule__Rectangle__Group_8__0__Impl rule__Rectangle__Group_8__1
            {
            pushFollow(FOLLOW_7);
            rule__Rectangle__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group_8__1();

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
    // $ANTLR end "rule__Rectangle__Group_8__0"


    // $ANTLR start "rule__Rectangle__Group_8__0__Impl"
    // InternalCinEditor.g:4421:1: rule__Rectangle__Group_8__0__Impl : ( 'during' ) ;
    public final void rule__Rectangle__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4425:1: ( ( 'during' ) )
            // InternalCinEditor.g:4426:1: ( 'during' )
            {
            // InternalCinEditor.g:4426:1: ( 'during' )
            // InternalCinEditor.g:4427:2: 'during'
            {
             before(grammarAccess.getRectangleAccess().getDuringKeyword_8_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getDuringKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_8__0__Impl"


    // $ANTLR start "rule__Rectangle__Group_8__1"
    // InternalCinEditor.g:4436:1: rule__Rectangle__Group_8__1 : rule__Rectangle__Group_8__1__Impl ;
    public final void rule__Rectangle__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4440:1: ( rule__Rectangle__Group_8__1__Impl )
            // InternalCinEditor.g:4441:2: rule__Rectangle__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group_8__1__Impl();

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
    // $ANTLR end "rule__Rectangle__Group_8__1"


    // $ANTLR start "rule__Rectangle__Group_8__1__Impl"
    // InternalCinEditor.g:4447:1: rule__Rectangle__Group_8__1__Impl : ( ( rule__Rectangle__DurationAssignment_8_1 ) ) ;
    public final void rule__Rectangle__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4451:1: ( ( ( rule__Rectangle__DurationAssignment_8_1 ) ) )
            // InternalCinEditor.g:4452:1: ( ( rule__Rectangle__DurationAssignment_8_1 ) )
            {
            // InternalCinEditor.g:4452:1: ( ( rule__Rectangle__DurationAssignment_8_1 ) )
            // InternalCinEditor.g:4453:2: ( rule__Rectangle__DurationAssignment_8_1 )
            {
             before(grammarAccess.getRectangleAccess().getDurationAssignment_8_1()); 
            // InternalCinEditor.g:4454:2: ( rule__Rectangle__DurationAssignment_8_1 )
            // InternalCinEditor.g:4454:3: rule__Rectangle__DurationAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__DurationAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getDurationAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_8__1__Impl"


    // $ANTLR start "rule__FadeIn__Group__0"
    // InternalCinEditor.g:4463:1: rule__FadeIn__Group__0 : rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 ;
    public final void rule__FadeIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4467:1: ( rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 )
            // InternalCinEditor.g:4468:2: rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1
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
    // InternalCinEditor.g:4475:1: rule__FadeIn__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__FadeIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4479:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:4480:1: ( 'Effect' )
            {
            // InternalCinEditor.g:4480:1: ( 'Effect' )
            // InternalCinEditor.g:4481:2: 'Effect'
            {
             before(grammarAccess.getFadeInAccess().getEffectKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCinEditor.g:4490:1: rule__FadeIn__Group__1 : rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 ;
    public final void rule__FadeIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4494:1: ( rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 )
            // InternalCinEditor.g:4495:2: rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:4502:1: rule__FadeIn__Group__1__Impl : ( ( rule__FadeIn__NameAssignment_1 ) ) ;
    public final void rule__FadeIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4506:1: ( ( ( rule__FadeIn__NameAssignment_1 ) ) )
            // InternalCinEditor.g:4507:1: ( ( rule__FadeIn__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:4507:1: ( ( rule__FadeIn__NameAssignment_1 ) )
            // InternalCinEditor.g:4508:2: ( rule__FadeIn__NameAssignment_1 )
            {
             before(grammarAccess.getFadeInAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:4509:2: ( rule__FadeIn__NameAssignment_1 )
            // InternalCinEditor.g:4509:3: rule__FadeIn__NameAssignment_1
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
    // InternalCinEditor.g:4517:1: rule__FadeIn__Group__2 : rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 ;
    public final void rule__FadeIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4521:1: ( rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 )
            // InternalCinEditor.g:4522:2: rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalCinEditor.g:4529:1: rule__FadeIn__Group__2__Impl : ( '=' ) ;
    public final void rule__FadeIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4533:1: ( ( '=' ) )
            // InternalCinEditor.g:4534:1: ( '=' )
            {
            // InternalCinEditor.g:4534:1: ( '=' )
            // InternalCinEditor.g:4535:2: '='
            {
             before(grammarAccess.getFadeInAccess().getEqualsSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalCinEditor.g:4544:1: rule__FadeIn__Group__3 : rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 ;
    public final void rule__FadeIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4548:1: ( rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 )
            // InternalCinEditor.g:4549:2: rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalCinEditor.g:4556:1: rule__FadeIn__Group__3__Impl : ( 'FadeIn' ) ;
    public final void rule__FadeIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4560:1: ( ( 'FadeIn' ) )
            // InternalCinEditor.g:4561:1: ( 'FadeIn' )
            {
            // InternalCinEditor.g:4561:1: ( 'FadeIn' )
            // InternalCinEditor.g:4562:2: 'FadeIn'
            {
             before(grammarAccess.getFadeInAccess().getFadeInKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCinEditor.g:4571:1: rule__FadeIn__Group__4 : rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5 ;
    public final void rule__FadeIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4575:1: ( rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5 )
            // InternalCinEditor.g:4576:2: rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalCinEditor.g:4583:1: rule__FadeIn__Group__4__Impl : ( 'during' ) ;
    public final void rule__FadeIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4587:1: ( ( 'during' ) )
            // InternalCinEditor.g:4588:1: ( 'during' )
            {
            // InternalCinEditor.g:4588:1: ( 'during' )
            // InternalCinEditor.g:4589:2: 'during'
            {
             before(grammarAccess.getFadeInAccess().getDuringKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCinEditor.g:4598:1: rule__FadeIn__Group__5 : rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6 ;
    public final void rule__FadeIn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4602:1: ( rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6 )
            // InternalCinEditor.g:4603:2: rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalCinEditor.g:4610:1: rule__FadeIn__Group__5__Impl : ( ( rule__FadeIn__DurationAssignment_5 ) ) ;
    public final void rule__FadeIn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4614:1: ( ( ( rule__FadeIn__DurationAssignment_5 ) ) )
            // InternalCinEditor.g:4615:1: ( ( rule__FadeIn__DurationAssignment_5 ) )
            {
            // InternalCinEditor.g:4615:1: ( ( rule__FadeIn__DurationAssignment_5 ) )
            // InternalCinEditor.g:4616:2: ( rule__FadeIn__DurationAssignment_5 )
            {
             before(grammarAccess.getFadeInAccess().getDurationAssignment_5()); 
            // InternalCinEditor.g:4617:2: ( rule__FadeIn__DurationAssignment_5 )
            // InternalCinEditor.g:4617:3: rule__FadeIn__DurationAssignment_5
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
    // InternalCinEditor.g:4625:1: rule__FadeIn__Group__6 : rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7 ;
    public final void rule__FadeIn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4629:1: ( rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7 )
            // InternalCinEditor.g:4630:2: rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7
            {
            pushFollow(FOLLOW_32);
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
    // InternalCinEditor.g:4637:1: rule__FadeIn__Group__6__Impl : ( 'on' ) ;
    public final void rule__FadeIn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4641:1: ( ( 'on' ) )
            // InternalCinEditor.g:4642:1: ( 'on' )
            {
            // InternalCinEditor.g:4642:1: ( 'on' )
            // InternalCinEditor.g:4643:2: 'on'
            {
             before(grammarAccess.getFadeInAccess().getOnKeyword_6()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCinEditor.g:4652:1: rule__FadeIn__Group__7 : rule__FadeIn__Group__7__Impl rule__FadeIn__Group__8 ;
    public final void rule__FadeIn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4656:1: ( rule__FadeIn__Group__7__Impl rule__FadeIn__Group__8 )
            // InternalCinEditor.g:4657:2: rule__FadeIn__Group__7__Impl rule__FadeIn__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalCinEditor.g:4664:1: rule__FadeIn__Group__7__Impl : ( '[' ) ;
    public final void rule__FadeIn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4668:1: ( ( '[' ) )
            // InternalCinEditor.g:4669:1: ( '[' )
            {
            // InternalCinEditor.g:4669:1: ( '[' )
            // InternalCinEditor.g:4670:2: '['
            {
             before(grammarAccess.getFadeInAccess().getLeftSquareBracketKeyword_7()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getLeftSquareBracketKeyword_7()); 

            }


            }

        }
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
    // InternalCinEditor.g:4679:1: rule__FadeIn__Group__8 : rule__FadeIn__Group__8__Impl rule__FadeIn__Group__9 ;
    public final void rule__FadeIn__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4683:1: ( rule__FadeIn__Group__8__Impl rule__FadeIn__Group__9 )
            // InternalCinEditor.g:4684:2: rule__FadeIn__Group__8__Impl rule__FadeIn__Group__9
            {
            pushFollow(FOLLOW_33);
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
    // InternalCinEditor.g:4691:1: rule__FadeIn__Group__8__Impl : ( ( rule__FadeIn__ElementsAssignment_8 ) ) ;
    public final void rule__FadeIn__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4695:1: ( ( ( rule__FadeIn__ElementsAssignment_8 ) ) )
            // InternalCinEditor.g:4696:1: ( ( rule__FadeIn__ElementsAssignment_8 ) )
            {
            // InternalCinEditor.g:4696:1: ( ( rule__FadeIn__ElementsAssignment_8 ) )
            // InternalCinEditor.g:4697:2: ( rule__FadeIn__ElementsAssignment_8 )
            {
             before(grammarAccess.getFadeInAccess().getElementsAssignment_8()); 
            // InternalCinEditor.g:4698:2: ( rule__FadeIn__ElementsAssignment_8 )
            // InternalCinEditor.g:4698:3: rule__FadeIn__ElementsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__ElementsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFadeInAccess().getElementsAssignment_8()); 

            }


            }

        }
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
    // InternalCinEditor.g:4706:1: rule__FadeIn__Group__9 : rule__FadeIn__Group__9__Impl rule__FadeIn__Group__10 ;
    public final void rule__FadeIn__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4710:1: ( rule__FadeIn__Group__9__Impl rule__FadeIn__Group__10 )
            // InternalCinEditor.g:4711:2: rule__FadeIn__Group__9__Impl rule__FadeIn__Group__10
            {
            pushFollow(FOLLOW_33);
            rule__FadeIn__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__10();

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
    // InternalCinEditor.g:4718:1: rule__FadeIn__Group__9__Impl : ( ( rule__FadeIn__Group_9__0 )* ) ;
    public final void rule__FadeIn__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4722:1: ( ( ( rule__FadeIn__Group_9__0 )* ) )
            // InternalCinEditor.g:4723:1: ( ( rule__FadeIn__Group_9__0 )* )
            {
            // InternalCinEditor.g:4723:1: ( ( rule__FadeIn__Group_9__0 )* )
            // InternalCinEditor.g:4724:2: ( rule__FadeIn__Group_9__0 )*
            {
             before(grammarAccess.getFadeInAccess().getGroup_9()); 
            // InternalCinEditor.g:4725:2: ( rule__FadeIn__Group_9__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==17) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalCinEditor.g:4725:3: rule__FadeIn__Group_9__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__FadeIn__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getFadeInAccess().getGroup_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__FadeIn__Group__10"
    // InternalCinEditor.g:4733:1: rule__FadeIn__Group__10 : rule__FadeIn__Group__10__Impl ;
    public final void rule__FadeIn__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4737:1: ( rule__FadeIn__Group__10__Impl )
            // InternalCinEditor.g:4738:2: rule__FadeIn__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__10__Impl();

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
    // $ANTLR end "rule__FadeIn__Group__10"


    // $ANTLR start "rule__FadeIn__Group__10__Impl"
    // InternalCinEditor.g:4744:1: rule__FadeIn__Group__10__Impl : ( ']' ) ;
    public final void rule__FadeIn__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4748:1: ( ( ']' ) )
            // InternalCinEditor.g:4749:1: ( ']' )
            {
            // InternalCinEditor.g:4749:1: ( ']' )
            // InternalCinEditor.g:4750:2: ']'
            {
             before(grammarAccess.getFadeInAccess().getRightSquareBracketKeyword_10()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__10__Impl"


    // $ANTLR start "rule__FadeIn__Group_9__0"
    // InternalCinEditor.g:4760:1: rule__FadeIn__Group_9__0 : rule__FadeIn__Group_9__0__Impl rule__FadeIn__Group_9__1 ;
    public final void rule__FadeIn__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4764:1: ( rule__FadeIn__Group_9__0__Impl rule__FadeIn__Group_9__1 )
            // InternalCinEditor.g:4765:2: rule__FadeIn__Group_9__0__Impl rule__FadeIn__Group_9__1
            {
            pushFollow(FOLLOW_16);
            rule__FadeIn__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group_9__1();

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
    // $ANTLR end "rule__FadeIn__Group_9__0"


    // $ANTLR start "rule__FadeIn__Group_9__0__Impl"
    // InternalCinEditor.g:4772:1: rule__FadeIn__Group_9__0__Impl : ( ',' ) ;
    public final void rule__FadeIn__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4776:1: ( ( ',' ) )
            // InternalCinEditor.g:4777:1: ( ',' )
            {
            // InternalCinEditor.g:4777:1: ( ',' )
            // InternalCinEditor.g:4778:2: ','
            {
             before(grammarAccess.getFadeInAccess().getCommaKeyword_9_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group_9__0__Impl"


    // $ANTLR start "rule__FadeIn__Group_9__1"
    // InternalCinEditor.g:4787:1: rule__FadeIn__Group_9__1 : rule__FadeIn__Group_9__1__Impl ;
    public final void rule__FadeIn__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4791:1: ( rule__FadeIn__Group_9__1__Impl )
            // InternalCinEditor.g:4792:2: rule__FadeIn__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__Group_9__1__Impl();

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
    // $ANTLR end "rule__FadeIn__Group_9__1"


    // $ANTLR start "rule__FadeIn__Group_9__1__Impl"
    // InternalCinEditor.g:4798:1: rule__FadeIn__Group_9__1__Impl : ( ( rule__FadeIn__ElementsAssignment_9_1 ) ) ;
    public final void rule__FadeIn__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4802:1: ( ( ( rule__FadeIn__ElementsAssignment_9_1 ) ) )
            // InternalCinEditor.g:4803:1: ( ( rule__FadeIn__ElementsAssignment_9_1 ) )
            {
            // InternalCinEditor.g:4803:1: ( ( rule__FadeIn__ElementsAssignment_9_1 ) )
            // InternalCinEditor.g:4804:2: ( rule__FadeIn__ElementsAssignment_9_1 )
            {
             before(grammarAccess.getFadeInAccess().getElementsAssignment_9_1()); 
            // InternalCinEditor.g:4805:2: ( rule__FadeIn__ElementsAssignment_9_1 )
            // InternalCinEditor.g:4805:3: rule__FadeIn__ElementsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__ElementsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getFadeInAccess().getElementsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group_9__1__Impl"


    // $ANTLR start "rule__FadeOut__Group__0"
    // InternalCinEditor.g:4814:1: rule__FadeOut__Group__0 : rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 ;
    public final void rule__FadeOut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4818:1: ( rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 )
            // InternalCinEditor.g:4819:2: rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1
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
    // InternalCinEditor.g:4826:1: rule__FadeOut__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__FadeOut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4830:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:4831:1: ( 'Effect' )
            {
            // InternalCinEditor.g:4831:1: ( 'Effect' )
            // InternalCinEditor.g:4832:2: 'Effect'
            {
             before(grammarAccess.getFadeOutAccess().getEffectKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCinEditor.g:4841:1: rule__FadeOut__Group__1 : rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 ;
    public final void rule__FadeOut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4845:1: ( rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 )
            // InternalCinEditor.g:4846:2: rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:4853:1: rule__FadeOut__Group__1__Impl : ( ( rule__FadeOut__NameAssignment_1 ) ) ;
    public final void rule__FadeOut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4857:1: ( ( ( rule__FadeOut__NameAssignment_1 ) ) )
            // InternalCinEditor.g:4858:1: ( ( rule__FadeOut__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:4858:1: ( ( rule__FadeOut__NameAssignment_1 ) )
            // InternalCinEditor.g:4859:2: ( rule__FadeOut__NameAssignment_1 )
            {
             before(grammarAccess.getFadeOutAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:4860:2: ( rule__FadeOut__NameAssignment_1 )
            // InternalCinEditor.g:4860:3: rule__FadeOut__NameAssignment_1
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
    // InternalCinEditor.g:4868:1: rule__FadeOut__Group__2 : rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 ;
    public final void rule__FadeOut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4872:1: ( rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 )
            // InternalCinEditor.g:4873:2: rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalCinEditor.g:4880:1: rule__FadeOut__Group__2__Impl : ( '=' ) ;
    public final void rule__FadeOut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4884:1: ( ( '=' ) )
            // InternalCinEditor.g:4885:1: ( '=' )
            {
            // InternalCinEditor.g:4885:1: ( '=' )
            // InternalCinEditor.g:4886:2: '='
            {
             before(grammarAccess.getFadeOutAccess().getEqualsSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalCinEditor.g:4895:1: rule__FadeOut__Group__3 : rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 ;
    public final void rule__FadeOut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4899:1: ( rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 )
            // InternalCinEditor.g:4900:2: rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalCinEditor.g:4907:1: rule__FadeOut__Group__3__Impl : ( 'FadeOut' ) ;
    public final void rule__FadeOut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4911:1: ( ( 'FadeOut' ) )
            // InternalCinEditor.g:4912:1: ( 'FadeOut' )
            {
            // InternalCinEditor.g:4912:1: ( 'FadeOut' )
            // InternalCinEditor.g:4913:2: 'FadeOut'
            {
             before(grammarAccess.getFadeOutAccess().getFadeOutKeyword_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalCinEditor.g:4922:1: rule__FadeOut__Group__4 : rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5 ;
    public final void rule__FadeOut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4926:1: ( rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5 )
            // InternalCinEditor.g:4927:2: rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalCinEditor.g:4934:1: rule__FadeOut__Group__4__Impl : ( 'during' ) ;
    public final void rule__FadeOut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4938:1: ( ( 'during' ) )
            // InternalCinEditor.g:4939:1: ( 'during' )
            {
            // InternalCinEditor.g:4939:1: ( 'during' )
            // InternalCinEditor.g:4940:2: 'during'
            {
             before(grammarAccess.getFadeOutAccess().getDuringKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCinEditor.g:4949:1: rule__FadeOut__Group__5 : rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6 ;
    public final void rule__FadeOut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4953:1: ( rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6 )
            // InternalCinEditor.g:4954:2: rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalCinEditor.g:4961:1: rule__FadeOut__Group__5__Impl : ( ( rule__FadeOut__DurationAssignment_5 ) ) ;
    public final void rule__FadeOut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4965:1: ( ( ( rule__FadeOut__DurationAssignment_5 ) ) )
            // InternalCinEditor.g:4966:1: ( ( rule__FadeOut__DurationAssignment_5 ) )
            {
            // InternalCinEditor.g:4966:1: ( ( rule__FadeOut__DurationAssignment_5 ) )
            // InternalCinEditor.g:4967:2: ( rule__FadeOut__DurationAssignment_5 )
            {
             before(grammarAccess.getFadeOutAccess().getDurationAssignment_5()); 
            // InternalCinEditor.g:4968:2: ( rule__FadeOut__DurationAssignment_5 )
            // InternalCinEditor.g:4968:3: rule__FadeOut__DurationAssignment_5
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
    // InternalCinEditor.g:4976:1: rule__FadeOut__Group__6 : rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7 ;
    public final void rule__FadeOut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4980:1: ( rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7 )
            // InternalCinEditor.g:4981:2: rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7
            {
            pushFollow(FOLLOW_32);
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
    // InternalCinEditor.g:4988:1: rule__FadeOut__Group__6__Impl : ( 'on' ) ;
    public final void rule__FadeOut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4992:1: ( ( 'on' ) )
            // InternalCinEditor.g:4993:1: ( 'on' )
            {
            // InternalCinEditor.g:4993:1: ( 'on' )
            // InternalCinEditor.g:4994:2: 'on'
            {
             before(grammarAccess.getFadeOutAccess().getOnKeyword_6()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCinEditor.g:5003:1: rule__FadeOut__Group__7 : rule__FadeOut__Group__7__Impl rule__FadeOut__Group__8 ;
    public final void rule__FadeOut__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5007:1: ( rule__FadeOut__Group__7__Impl rule__FadeOut__Group__8 )
            // InternalCinEditor.g:5008:2: rule__FadeOut__Group__7__Impl rule__FadeOut__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalCinEditor.g:5015:1: rule__FadeOut__Group__7__Impl : ( '[' ) ;
    public final void rule__FadeOut__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5019:1: ( ( '[' ) )
            // InternalCinEditor.g:5020:1: ( '[' )
            {
            // InternalCinEditor.g:5020:1: ( '[' )
            // InternalCinEditor.g:5021:2: '['
            {
             before(grammarAccess.getFadeOutAccess().getLeftSquareBracketKeyword_7()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getLeftSquareBracketKeyword_7()); 

            }


            }

        }
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
    // InternalCinEditor.g:5030:1: rule__FadeOut__Group__8 : rule__FadeOut__Group__8__Impl rule__FadeOut__Group__9 ;
    public final void rule__FadeOut__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5034:1: ( rule__FadeOut__Group__8__Impl rule__FadeOut__Group__9 )
            // InternalCinEditor.g:5035:2: rule__FadeOut__Group__8__Impl rule__FadeOut__Group__9
            {
            pushFollow(FOLLOW_33);
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
    // InternalCinEditor.g:5042:1: rule__FadeOut__Group__8__Impl : ( ( rule__FadeOut__ElementsAssignment_8 ) ) ;
    public final void rule__FadeOut__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5046:1: ( ( ( rule__FadeOut__ElementsAssignment_8 ) ) )
            // InternalCinEditor.g:5047:1: ( ( rule__FadeOut__ElementsAssignment_8 ) )
            {
            // InternalCinEditor.g:5047:1: ( ( rule__FadeOut__ElementsAssignment_8 ) )
            // InternalCinEditor.g:5048:2: ( rule__FadeOut__ElementsAssignment_8 )
            {
             before(grammarAccess.getFadeOutAccess().getElementsAssignment_8()); 
            // InternalCinEditor.g:5049:2: ( rule__FadeOut__ElementsAssignment_8 )
            // InternalCinEditor.g:5049:3: rule__FadeOut__ElementsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__ElementsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getFadeOutAccess().getElementsAssignment_8()); 

            }


            }

        }
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
    // InternalCinEditor.g:5057:1: rule__FadeOut__Group__9 : rule__FadeOut__Group__9__Impl rule__FadeOut__Group__10 ;
    public final void rule__FadeOut__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5061:1: ( rule__FadeOut__Group__9__Impl rule__FadeOut__Group__10 )
            // InternalCinEditor.g:5062:2: rule__FadeOut__Group__9__Impl rule__FadeOut__Group__10
            {
            pushFollow(FOLLOW_33);
            rule__FadeOut__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__10();

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
    // InternalCinEditor.g:5069:1: rule__FadeOut__Group__9__Impl : ( ( rule__FadeOut__Group_9__0 )* ) ;
    public final void rule__FadeOut__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5073:1: ( ( ( rule__FadeOut__Group_9__0 )* ) )
            // InternalCinEditor.g:5074:1: ( ( rule__FadeOut__Group_9__0 )* )
            {
            // InternalCinEditor.g:5074:1: ( ( rule__FadeOut__Group_9__0 )* )
            // InternalCinEditor.g:5075:2: ( rule__FadeOut__Group_9__0 )*
            {
             before(grammarAccess.getFadeOutAccess().getGroup_9()); 
            // InternalCinEditor.g:5076:2: ( rule__FadeOut__Group_9__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==17) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalCinEditor.g:5076:3: rule__FadeOut__Group_9__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__FadeOut__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getFadeOutAccess().getGroup_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__FadeOut__Group__10"
    // InternalCinEditor.g:5084:1: rule__FadeOut__Group__10 : rule__FadeOut__Group__10__Impl ;
    public final void rule__FadeOut__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5088:1: ( rule__FadeOut__Group__10__Impl )
            // InternalCinEditor.g:5089:2: rule__FadeOut__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__10__Impl();

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
    // $ANTLR end "rule__FadeOut__Group__10"


    // $ANTLR start "rule__FadeOut__Group__10__Impl"
    // InternalCinEditor.g:5095:1: rule__FadeOut__Group__10__Impl : ( ']' ) ;
    public final void rule__FadeOut__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5099:1: ( ( ']' ) )
            // InternalCinEditor.g:5100:1: ( ']' )
            {
            // InternalCinEditor.g:5100:1: ( ']' )
            // InternalCinEditor.g:5101:2: ']'
            {
             before(grammarAccess.getFadeOutAccess().getRightSquareBracketKeyword_10()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getRightSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__10__Impl"


    // $ANTLR start "rule__FadeOut__Group_9__0"
    // InternalCinEditor.g:5111:1: rule__FadeOut__Group_9__0 : rule__FadeOut__Group_9__0__Impl rule__FadeOut__Group_9__1 ;
    public final void rule__FadeOut__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5115:1: ( rule__FadeOut__Group_9__0__Impl rule__FadeOut__Group_9__1 )
            // InternalCinEditor.g:5116:2: rule__FadeOut__Group_9__0__Impl rule__FadeOut__Group_9__1
            {
            pushFollow(FOLLOW_16);
            rule__FadeOut__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group_9__1();

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
    // $ANTLR end "rule__FadeOut__Group_9__0"


    // $ANTLR start "rule__FadeOut__Group_9__0__Impl"
    // InternalCinEditor.g:5123:1: rule__FadeOut__Group_9__0__Impl : ( ',' ) ;
    public final void rule__FadeOut__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5127:1: ( ( ',' ) )
            // InternalCinEditor.g:5128:1: ( ',' )
            {
            // InternalCinEditor.g:5128:1: ( ',' )
            // InternalCinEditor.g:5129:2: ','
            {
             before(grammarAccess.getFadeOutAccess().getCommaKeyword_9_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group_9__0__Impl"


    // $ANTLR start "rule__FadeOut__Group_9__1"
    // InternalCinEditor.g:5138:1: rule__FadeOut__Group_9__1 : rule__FadeOut__Group_9__1__Impl ;
    public final void rule__FadeOut__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5142:1: ( rule__FadeOut__Group_9__1__Impl )
            // InternalCinEditor.g:5143:2: rule__FadeOut__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__Group_9__1__Impl();

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
    // $ANTLR end "rule__FadeOut__Group_9__1"


    // $ANTLR start "rule__FadeOut__Group_9__1__Impl"
    // InternalCinEditor.g:5149:1: rule__FadeOut__Group_9__1__Impl : ( ( rule__FadeOut__ElementsAssignment_9_1 ) ) ;
    public final void rule__FadeOut__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5153:1: ( ( ( rule__FadeOut__ElementsAssignment_9_1 ) ) )
            // InternalCinEditor.g:5154:1: ( ( rule__FadeOut__ElementsAssignment_9_1 ) )
            {
            // InternalCinEditor.g:5154:1: ( ( rule__FadeOut__ElementsAssignment_9_1 ) )
            // InternalCinEditor.g:5155:2: ( rule__FadeOut__ElementsAssignment_9_1 )
            {
             before(grammarAccess.getFadeOutAccess().getElementsAssignment_9_1()); 
            // InternalCinEditor.g:5156:2: ( rule__FadeOut__ElementsAssignment_9_1 )
            // InternalCinEditor.g:5156:3: rule__FadeOut__ElementsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__ElementsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getFadeOutAccess().getElementsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group_9__1__Impl"


    // $ANTLR start "rule__Translate__Group__0"
    // InternalCinEditor.g:5165:1: rule__Translate__Group__0 : rule__Translate__Group__0__Impl rule__Translate__Group__1 ;
    public final void rule__Translate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5169:1: ( rule__Translate__Group__0__Impl rule__Translate__Group__1 )
            // InternalCinEditor.g:5170:2: rule__Translate__Group__0__Impl rule__Translate__Group__1
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
    // InternalCinEditor.g:5177:1: rule__Translate__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__Translate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5181:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:5182:1: ( 'Effect' )
            {
            // InternalCinEditor.g:5182:1: ( 'Effect' )
            // InternalCinEditor.g:5183:2: 'Effect'
            {
             before(grammarAccess.getTranslateAccess().getEffectKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCinEditor.g:5192:1: rule__Translate__Group__1 : rule__Translate__Group__1__Impl rule__Translate__Group__2 ;
    public final void rule__Translate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5196:1: ( rule__Translate__Group__1__Impl rule__Translate__Group__2 )
            // InternalCinEditor.g:5197:2: rule__Translate__Group__1__Impl rule__Translate__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:5204:1: rule__Translate__Group__1__Impl : ( ( rule__Translate__NameAssignment_1 ) ) ;
    public final void rule__Translate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5208:1: ( ( ( rule__Translate__NameAssignment_1 ) ) )
            // InternalCinEditor.g:5209:1: ( ( rule__Translate__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:5209:1: ( ( rule__Translate__NameAssignment_1 ) )
            // InternalCinEditor.g:5210:2: ( rule__Translate__NameAssignment_1 )
            {
             before(grammarAccess.getTranslateAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:5211:2: ( rule__Translate__NameAssignment_1 )
            // InternalCinEditor.g:5211:3: rule__Translate__NameAssignment_1
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
    // InternalCinEditor.g:5219:1: rule__Translate__Group__2 : rule__Translate__Group__2__Impl rule__Translate__Group__3 ;
    public final void rule__Translate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5223:1: ( rule__Translate__Group__2__Impl rule__Translate__Group__3 )
            // InternalCinEditor.g:5224:2: rule__Translate__Group__2__Impl rule__Translate__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalCinEditor.g:5231:1: rule__Translate__Group__2__Impl : ( '=' ) ;
    public final void rule__Translate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5235:1: ( ( '=' ) )
            // InternalCinEditor.g:5236:1: ( '=' )
            {
            // InternalCinEditor.g:5236:1: ( '=' )
            // InternalCinEditor.g:5237:2: '='
            {
             before(grammarAccess.getTranslateAccess().getEqualsSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalCinEditor.g:5246:1: rule__Translate__Group__3 : rule__Translate__Group__3__Impl rule__Translate__Group__4 ;
    public final void rule__Translate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5250:1: ( rule__Translate__Group__3__Impl rule__Translate__Group__4 )
            // InternalCinEditor.g:5251:2: rule__Translate__Group__3__Impl rule__Translate__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalCinEditor.g:5258:1: rule__Translate__Group__3__Impl : ( 'Translate' ) ;
    public final void rule__Translate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5262:1: ( ( 'Translate' ) )
            // InternalCinEditor.g:5263:1: ( 'Translate' )
            {
            // InternalCinEditor.g:5263:1: ( 'Translate' )
            // InternalCinEditor.g:5264:2: 'Translate'
            {
             before(grammarAccess.getTranslateAccess().getTranslateKeyword_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalCinEditor.g:5273:1: rule__Translate__Group__4 : rule__Translate__Group__4__Impl rule__Translate__Group__5 ;
    public final void rule__Translate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5277:1: ( rule__Translate__Group__4__Impl rule__Translate__Group__5 )
            // InternalCinEditor.g:5278:2: rule__Translate__Group__4__Impl rule__Translate__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalCinEditor.g:5285:1: rule__Translate__Group__4__Impl : ( ( rule__Translate__PositionToTranslateAssignment_4 ) ) ;
    public final void rule__Translate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5289:1: ( ( ( rule__Translate__PositionToTranslateAssignment_4 ) ) )
            // InternalCinEditor.g:5290:1: ( ( rule__Translate__PositionToTranslateAssignment_4 ) )
            {
            // InternalCinEditor.g:5290:1: ( ( rule__Translate__PositionToTranslateAssignment_4 ) )
            // InternalCinEditor.g:5291:2: ( rule__Translate__PositionToTranslateAssignment_4 )
            {
             before(grammarAccess.getTranslateAccess().getPositionToTranslateAssignment_4()); 
            // InternalCinEditor.g:5292:2: ( rule__Translate__PositionToTranslateAssignment_4 )
            // InternalCinEditor.g:5292:3: rule__Translate__PositionToTranslateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Translate__PositionToTranslateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTranslateAccess().getPositionToTranslateAssignment_4()); 

            }


            }

        }
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
    // InternalCinEditor.g:5300:1: rule__Translate__Group__5 : rule__Translate__Group__5__Impl rule__Translate__Group__6 ;
    public final void rule__Translate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5304:1: ( rule__Translate__Group__5__Impl rule__Translate__Group__6 )
            // InternalCinEditor.g:5305:2: rule__Translate__Group__5__Impl rule__Translate__Group__6
            {
            pushFollow(FOLLOW_38);
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
    // InternalCinEditor.g:5312:1: rule__Translate__Group__5__Impl : ( ( rule__Translate__TemporalPositionAssignment_5 )? ) ;
    public final void rule__Translate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5316:1: ( ( ( rule__Translate__TemporalPositionAssignment_5 )? ) )
            // InternalCinEditor.g:5317:1: ( ( rule__Translate__TemporalPositionAssignment_5 )? )
            {
            // InternalCinEditor.g:5317:1: ( ( rule__Translate__TemporalPositionAssignment_5 )? )
            // InternalCinEditor.g:5318:2: ( rule__Translate__TemporalPositionAssignment_5 )?
            {
             before(grammarAccess.getTranslateAccess().getTemporalPositionAssignment_5()); 
            // InternalCinEditor.g:5319:2: ( rule__Translate__TemporalPositionAssignment_5 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=29 && LA51_0<=30)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCinEditor.g:5319:3: rule__Translate__TemporalPositionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Translate__TemporalPositionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTranslateAccess().getTemporalPositionAssignment_5()); 

            }


            }

        }
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
    // InternalCinEditor.g:5327:1: rule__Translate__Group__6 : rule__Translate__Group__6__Impl rule__Translate__Group__7 ;
    public final void rule__Translate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5331:1: ( rule__Translate__Group__6__Impl rule__Translate__Group__7 )
            // InternalCinEditor.g:5332:2: rule__Translate__Group__6__Impl rule__Translate__Group__7
            {
            pushFollow(FOLLOW_38);
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
    // InternalCinEditor.g:5339:1: rule__Translate__Group__6__Impl : ( ( rule__Translate__Group_6__0 )? ) ;
    public final void rule__Translate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5343:1: ( ( ( rule__Translate__Group_6__0 )? ) )
            // InternalCinEditor.g:5344:1: ( ( rule__Translate__Group_6__0 )? )
            {
            // InternalCinEditor.g:5344:1: ( ( rule__Translate__Group_6__0 )? )
            // InternalCinEditor.g:5345:2: ( rule__Translate__Group_6__0 )?
            {
             before(grammarAccess.getTranslateAccess().getGroup_6()); 
            // InternalCinEditor.g:5346:2: ( rule__Translate__Group_6__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==35) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCinEditor.g:5346:3: rule__Translate__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Translate__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTranslateAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalCinEditor.g:5354:1: rule__Translate__Group__7 : rule__Translate__Group__7__Impl rule__Translate__Group__8 ;
    public final void rule__Translate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5358:1: ( rule__Translate__Group__7__Impl rule__Translate__Group__8 )
            // InternalCinEditor.g:5359:2: rule__Translate__Group__7__Impl rule__Translate__Group__8
            {
            pushFollow(FOLLOW_32);
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
    // InternalCinEditor.g:5366:1: rule__Translate__Group__7__Impl : ( 'on' ) ;
    public final void rule__Translate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5370:1: ( ( 'on' ) )
            // InternalCinEditor.g:5371:1: ( 'on' )
            {
            // InternalCinEditor.g:5371:1: ( 'on' )
            // InternalCinEditor.g:5372:2: 'on'
            {
             before(grammarAccess.getTranslateAccess().getOnKeyword_7()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getOnKeyword_7()); 

            }


            }

        }
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
    // InternalCinEditor.g:5381:1: rule__Translate__Group__8 : rule__Translate__Group__8__Impl rule__Translate__Group__9 ;
    public final void rule__Translate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5385:1: ( rule__Translate__Group__8__Impl rule__Translate__Group__9 )
            // InternalCinEditor.g:5386:2: rule__Translate__Group__8__Impl rule__Translate__Group__9
            {
            pushFollow(FOLLOW_16);
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
    // InternalCinEditor.g:5393:1: rule__Translate__Group__8__Impl : ( '[' ) ;
    public final void rule__Translate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5397:1: ( ( '[' ) )
            // InternalCinEditor.g:5398:1: ( '[' )
            {
            // InternalCinEditor.g:5398:1: ( '[' )
            // InternalCinEditor.g:5399:2: '['
            {
             before(grammarAccess.getTranslateAccess().getLeftSquareBracketKeyword_8()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getLeftSquareBracketKeyword_8()); 

            }


            }

        }
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
    // InternalCinEditor.g:5408:1: rule__Translate__Group__9 : rule__Translate__Group__9__Impl rule__Translate__Group__10 ;
    public final void rule__Translate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5412:1: ( rule__Translate__Group__9__Impl rule__Translate__Group__10 )
            // InternalCinEditor.g:5413:2: rule__Translate__Group__9__Impl rule__Translate__Group__10
            {
            pushFollow(FOLLOW_33);
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
    // InternalCinEditor.g:5420:1: rule__Translate__Group__9__Impl : ( ( rule__Translate__ElementsAssignment_9 ) ) ;
    public final void rule__Translate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5424:1: ( ( ( rule__Translate__ElementsAssignment_9 ) ) )
            // InternalCinEditor.g:5425:1: ( ( rule__Translate__ElementsAssignment_9 ) )
            {
            // InternalCinEditor.g:5425:1: ( ( rule__Translate__ElementsAssignment_9 ) )
            // InternalCinEditor.g:5426:2: ( rule__Translate__ElementsAssignment_9 )
            {
             before(grammarAccess.getTranslateAccess().getElementsAssignment_9()); 
            // InternalCinEditor.g:5427:2: ( rule__Translate__ElementsAssignment_9 )
            // InternalCinEditor.g:5427:3: rule__Translate__ElementsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Translate__ElementsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTranslateAccess().getElementsAssignment_9()); 

            }


            }

        }
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
    // InternalCinEditor.g:5435:1: rule__Translate__Group__10 : rule__Translate__Group__10__Impl rule__Translate__Group__11 ;
    public final void rule__Translate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5439:1: ( rule__Translate__Group__10__Impl rule__Translate__Group__11 )
            // InternalCinEditor.g:5440:2: rule__Translate__Group__10__Impl rule__Translate__Group__11
            {
            pushFollow(FOLLOW_33);
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
    // InternalCinEditor.g:5447:1: rule__Translate__Group__10__Impl : ( ( rule__Translate__Group_10__0 )* ) ;
    public final void rule__Translate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5451:1: ( ( ( rule__Translate__Group_10__0 )* ) )
            // InternalCinEditor.g:5452:1: ( ( rule__Translate__Group_10__0 )* )
            {
            // InternalCinEditor.g:5452:1: ( ( rule__Translate__Group_10__0 )* )
            // InternalCinEditor.g:5453:2: ( rule__Translate__Group_10__0 )*
            {
             before(grammarAccess.getTranslateAccess().getGroup_10()); 
            // InternalCinEditor.g:5454:2: ( rule__Translate__Group_10__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==17) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalCinEditor.g:5454:3: rule__Translate__Group_10__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Translate__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getTranslateAccess().getGroup_10()); 

            }


            }

        }
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
    // InternalCinEditor.g:5462:1: rule__Translate__Group__11 : rule__Translate__Group__11__Impl ;
    public final void rule__Translate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5466:1: ( rule__Translate__Group__11__Impl )
            // InternalCinEditor.g:5467:2: rule__Translate__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Translate__Group__11__Impl();

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
    // InternalCinEditor.g:5473:1: rule__Translate__Group__11__Impl : ( ']' ) ;
    public final void rule__Translate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5477:1: ( ( ']' ) )
            // InternalCinEditor.g:5478:1: ( ']' )
            {
            // InternalCinEditor.g:5478:1: ( ']' )
            // InternalCinEditor.g:5479:2: ']'
            {
             before(grammarAccess.getTranslateAccess().getRightSquareBracketKeyword_11()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getRightSquareBracketKeyword_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__Translate__Group_6__0"
    // InternalCinEditor.g:5489:1: rule__Translate__Group_6__0 : rule__Translate__Group_6__0__Impl rule__Translate__Group_6__1 ;
    public final void rule__Translate__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5493:1: ( rule__Translate__Group_6__0__Impl rule__Translate__Group_6__1 )
            // InternalCinEditor.g:5494:2: rule__Translate__Group_6__0__Impl rule__Translate__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Translate__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group_6__1();

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
    // $ANTLR end "rule__Translate__Group_6__0"


    // $ANTLR start "rule__Translate__Group_6__0__Impl"
    // InternalCinEditor.g:5501:1: rule__Translate__Group_6__0__Impl : ( 'during' ) ;
    public final void rule__Translate__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5505:1: ( ( 'during' ) )
            // InternalCinEditor.g:5506:1: ( 'during' )
            {
            // InternalCinEditor.g:5506:1: ( 'during' )
            // InternalCinEditor.g:5507:2: 'during'
            {
             before(grammarAccess.getTranslateAccess().getDuringKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getDuringKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group_6__0__Impl"


    // $ANTLR start "rule__Translate__Group_6__1"
    // InternalCinEditor.g:5516:1: rule__Translate__Group_6__1 : rule__Translate__Group_6__1__Impl ;
    public final void rule__Translate__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5520:1: ( rule__Translate__Group_6__1__Impl )
            // InternalCinEditor.g:5521:2: rule__Translate__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Translate__Group_6__1__Impl();

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
    // $ANTLR end "rule__Translate__Group_6__1"


    // $ANTLR start "rule__Translate__Group_6__1__Impl"
    // InternalCinEditor.g:5527:1: rule__Translate__Group_6__1__Impl : ( ( rule__Translate__DurationAssignment_6_1 ) ) ;
    public final void rule__Translate__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5531:1: ( ( ( rule__Translate__DurationAssignment_6_1 ) ) )
            // InternalCinEditor.g:5532:1: ( ( rule__Translate__DurationAssignment_6_1 ) )
            {
            // InternalCinEditor.g:5532:1: ( ( rule__Translate__DurationAssignment_6_1 ) )
            // InternalCinEditor.g:5533:2: ( rule__Translate__DurationAssignment_6_1 )
            {
             before(grammarAccess.getTranslateAccess().getDurationAssignment_6_1()); 
            // InternalCinEditor.g:5534:2: ( rule__Translate__DurationAssignment_6_1 )
            // InternalCinEditor.g:5534:3: rule__Translate__DurationAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Translate__DurationAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTranslateAccess().getDurationAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group_6__1__Impl"


    // $ANTLR start "rule__Translate__Group_10__0"
    // InternalCinEditor.g:5543:1: rule__Translate__Group_10__0 : rule__Translate__Group_10__0__Impl rule__Translate__Group_10__1 ;
    public final void rule__Translate__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5547:1: ( rule__Translate__Group_10__0__Impl rule__Translate__Group_10__1 )
            // InternalCinEditor.g:5548:2: rule__Translate__Group_10__0__Impl rule__Translate__Group_10__1
            {
            pushFollow(FOLLOW_16);
            rule__Translate__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group_10__1();

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
    // $ANTLR end "rule__Translate__Group_10__0"


    // $ANTLR start "rule__Translate__Group_10__0__Impl"
    // InternalCinEditor.g:5555:1: rule__Translate__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Translate__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5559:1: ( ( ',' ) )
            // InternalCinEditor.g:5560:1: ( ',' )
            {
            // InternalCinEditor.g:5560:1: ( ',' )
            // InternalCinEditor.g:5561:2: ','
            {
             before(grammarAccess.getTranslateAccess().getCommaKeyword_10_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group_10__0__Impl"


    // $ANTLR start "rule__Translate__Group_10__1"
    // InternalCinEditor.g:5570:1: rule__Translate__Group_10__1 : rule__Translate__Group_10__1__Impl ;
    public final void rule__Translate__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5574:1: ( rule__Translate__Group_10__1__Impl )
            // InternalCinEditor.g:5575:2: rule__Translate__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Translate__Group_10__1__Impl();

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
    // $ANTLR end "rule__Translate__Group_10__1"


    // $ANTLR start "rule__Translate__Group_10__1__Impl"
    // InternalCinEditor.g:5581:1: rule__Translate__Group_10__1__Impl : ( ( rule__Translate__ElementsAssignment_10_1 ) ) ;
    public final void rule__Translate__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5585:1: ( ( ( rule__Translate__ElementsAssignment_10_1 ) ) )
            // InternalCinEditor.g:5586:1: ( ( rule__Translate__ElementsAssignment_10_1 ) )
            {
            // InternalCinEditor.g:5586:1: ( ( rule__Translate__ElementsAssignment_10_1 ) )
            // InternalCinEditor.g:5587:2: ( rule__Translate__ElementsAssignment_10_1 )
            {
             before(grammarAccess.getTranslateAccess().getElementsAssignment_10_1()); 
            // InternalCinEditor.g:5588:2: ( rule__Translate__ElementsAssignment_10_1 )
            // InternalCinEditor.g:5588:3: rule__Translate__ElementsAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Translate__ElementsAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getTranslateAccess().getElementsAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group_10__1__Impl"


    // $ANTLR start "rule__Movie__NameAssignment_1"
    // InternalCinEditor.g:5597:1: rule__Movie__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Movie__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5601:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5602:2: ( ruleEString )
            {
            // InternalCinEditor.g:5602:2: ( ruleEString )
            // InternalCinEditor.g:5603:3: ruleEString
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
    // InternalCinEditor.g:5612:1: rule__Movie__DimensionAssignment_2 : ( ruleDimension ) ;
    public final void rule__Movie__DimensionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5616:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:5617:2: ( ruleDimension )
            {
            // InternalCinEditor.g:5617:2: ( ruleDimension )
            // InternalCinEditor.g:5618:3: ruleDimension
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


    // $ANTLR start "rule__Movie__FpsAssignment_3_1"
    // InternalCinEditor.g:5627:1: rule__Movie__FpsAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Movie__FpsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5631:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5632:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5632:2: ( ruleEInt )
            // InternalCinEditor.g:5633:3: ruleEInt
            {
             before(grammarAccess.getMovieAccess().getFpsEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getFpsEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__FpsAssignment_3_1"


    // $ANTLR start "rule__Movie__LayersAssignment_4"
    // InternalCinEditor.g:5642:1: rule__Movie__LayersAssignment_4 : ( ruleLayer ) ;
    public final void rule__Movie__LayersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5646:1: ( ( ruleLayer ) )
            // InternalCinEditor.g:5647:2: ( ruleLayer )
            {
            // InternalCinEditor.g:5647:2: ( ruleLayer )
            // InternalCinEditor.g:5648:3: ruleLayer
            {
             before(grammarAccess.getMovieAccess().getLayersLayerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getLayersLayerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__LayersAssignment_4"


    // $ANTLR start "rule__Layer__ElementsAssignment_2"
    // InternalCinEditor.g:5657:1: rule__Layer__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Layer__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5661:1: ( ( ruleElement ) )
            // InternalCinEditor.g:5662:2: ( ruleElement )
            {
            // InternalCinEditor.g:5662:2: ( ruleElement )
            // InternalCinEditor.g:5663:3: ruleElement
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
    // InternalCinEditor.g:5672:1: rule__Position__XAssignment_1_1 : ( ruleItemPosition ) ;
    public final void rule__Position__XAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5676:1: ( ( ruleItemPosition ) )
            // InternalCinEditor.g:5677:2: ( ruleItemPosition )
            {
            // InternalCinEditor.g:5677:2: ( ruleItemPosition )
            // InternalCinEditor.g:5678:3: ruleItemPosition
            {
             before(grammarAccess.getPositionAccess().getXItemPositionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleItemPosition();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getXItemPositionParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:5687:1: rule__Position__YAssignment_1_3 : ( ruleItemPosition ) ;
    public final void rule__Position__YAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5691:1: ( ( ruleItemPosition ) )
            // InternalCinEditor.g:5692:2: ( ruleItemPosition )
            {
            // InternalCinEditor.g:5692:2: ( ruleItemPosition )
            // InternalCinEditor.g:5693:3: ruleItemPosition
            {
             before(grammarAccess.getPositionAccess().getYItemPositionParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleItemPosition();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getYItemPositionParserRuleCall_1_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ItemPositionInt__PositionAssignment"
    // InternalCinEditor.g:5702:1: rule__ItemPositionInt__PositionAssignment : ( ruleEInt ) ;
    public final void rule__ItemPositionInt__PositionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5706:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5707:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5707:2: ( ruleEInt )
            // InternalCinEditor.g:5708:3: ruleEInt
            {
             before(grammarAccess.getItemPositionIntAccess().getPositionEIntParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getItemPositionIntAccess().getPositionEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionInt__PositionAssignment"


    // $ANTLR start "rule__ItemPositionString__PositionAssignment"
    // InternalCinEditor.g:5717:1: rule__ItemPositionString__PositionAssignment : ( ( rule__ItemPositionString__PositionAlternatives_0 ) ) ;
    public final void rule__ItemPositionString__PositionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5721:1: ( ( ( rule__ItemPositionString__PositionAlternatives_0 ) ) )
            // InternalCinEditor.g:5722:2: ( ( rule__ItemPositionString__PositionAlternatives_0 ) )
            {
            // InternalCinEditor.g:5722:2: ( ( rule__ItemPositionString__PositionAlternatives_0 ) )
            // InternalCinEditor.g:5723:3: ( rule__ItemPositionString__PositionAlternatives_0 )
            {
             before(grammarAccess.getItemPositionStringAccess().getPositionAlternatives_0()); 
            // InternalCinEditor.g:5724:3: ( rule__ItemPositionString__PositionAlternatives_0 )
            // InternalCinEditor.g:5724:4: rule__ItemPositionString__PositionAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ItemPositionString__PositionAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getItemPositionStringAccess().getPositionAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemPositionString__PositionAssignment"


    // $ANTLR start "rule__Dimension__WidthAssignment_1"
    // InternalCinEditor.g:5732:1: rule__Dimension__WidthAssignment_1 : ( ruleEInt ) ;
    public final void rule__Dimension__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5736:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5737:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5737:2: ( ruleEInt )
            // InternalCinEditor.g:5738:3: ruleEInt
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
    // InternalCinEditor.g:5747:1: rule__Dimension__HeightAssignment_3 : ( ruleEInt ) ;
    public final void rule__Dimension__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5751:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5752:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5752:2: ( ruleEInt )
            // InternalCinEditor.g:5753:3: ruleEInt
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
    // InternalCinEditor.g:5762:1: rule__HexadecimalColor__HexadecimalValueAssignment_1 : ( ruleEString ) ;
    public final void rule__HexadecimalColor__HexadecimalValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5766:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5767:2: ( ruleEString )
            {
            // InternalCinEditor.g:5767:2: ( ruleEString )
            // InternalCinEditor.g:5768:3: ruleEString
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


    // $ANTLR start "rule__TemporalPosition__BeginTimeAssignment_0_1"
    // InternalCinEditor.g:5777:1: rule__TemporalPosition__BeginTimeAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__TemporalPosition__BeginTimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5781:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5782:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5782:2: ( ruleEInt )
            // InternalCinEditor.g:5783:3: ruleEInt
            {
             before(grammarAccess.getTemporalPositionAccess().getBeginTimeEIntParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTemporalPositionAccess().getBeginTimeEIntParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPosition__BeginTimeAssignment_0_1"


    // $ANTLR start "rule__TemporalPosition__ElementToStartAfterAssignment_0_3"
    // InternalCinEditor.g:5792:1: rule__TemporalPosition__ElementToStartAfterAssignment_0_3 : ( ( RULE_ID ) ) ;
    public final void rule__TemporalPosition__ElementToStartAfterAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5796:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:5797:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:5797:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:5798:3: ( RULE_ID )
            {
             before(grammarAccess.getTemporalPositionAccess().getElementToStartAfterElementCrossReference_0_3_0()); 
            // InternalCinEditor.g:5799:3: ( RULE_ID )
            // InternalCinEditor.g:5800:4: RULE_ID
            {
             before(grammarAccess.getTemporalPositionAccess().getElementToStartAfterElementIDTerminalRuleCall_0_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemporalPositionAccess().getElementToStartAfterElementIDTerminalRuleCall_0_3_0_1()); 

            }

             after(grammarAccess.getTemporalPositionAccess().getElementToStartAfterElementCrossReference_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPosition__ElementToStartAfterAssignment_0_3"


    // $ANTLR start "rule__TemporalPosition__BeginTimeAssignment_1_0_1"
    // InternalCinEditor.g:5811:1: rule__TemporalPosition__BeginTimeAssignment_1_0_1 : ( ruleEInt ) ;
    public final void rule__TemporalPosition__BeginTimeAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5815:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5816:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5816:2: ( ruleEInt )
            // InternalCinEditor.g:5817:3: ruleEInt
            {
             before(grammarAccess.getTemporalPositionAccess().getBeginTimeEIntParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTemporalPositionAccess().getBeginTimeEIntParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPosition__BeginTimeAssignment_1_0_1"


    // $ANTLR start "rule__TemporalPosition__ElementToStartAfterAssignment_1_1_1"
    // InternalCinEditor.g:5826:1: rule__TemporalPosition__ElementToStartAfterAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TemporalPosition__ElementToStartAfterAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5830:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:5831:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:5831:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:5832:3: ( RULE_ID )
            {
             before(grammarAccess.getTemporalPositionAccess().getElementToStartAfterElementCrossReference_1_1_1_0()); 
            // InternalCinEditor.g:5833:3: ( RULE_ID )
            // InternalCinEditor.g:5834:4: RULE_ID
            {
             before(grammarAccess.getTemporalPositionAccess().getElementToStartAfterElementIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTemporalPositionAccess().getElementToStartAfterElementIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getTemporalPositionAccess().getElementToStartAfterElementCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPosition__ElementToStartAfterAssignment_1_1_1"


    // $ANTLR start "rule__Margin__TypeAssignment_0"
    // InternalCinEditor.g:5845:1: rule__Margin__TypeAssignment_0 : ( ruleMARGIN_NAME ) ;
    public final void rule__Margin__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5849:1: ( ( ruleMARGIN_NAME ) )
            // InternalCinEditor.g:5850:2: ( ruleMARGIN_NAME )
            {
            // InternalCinEditor.g:5850:2: ( ruleMARGIN_NAME )
            // InternalCinEditor.g:5851:3: ruleMARGIN_NAME
            {
             before(grammarAccess.getMarginAccess().getTypeMARGIN_NAMEEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMARGIN_NAME();

            state._fsp--;

             after(grammarAccess.getMarginAccess().getTypeMARGIN_NAMEEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Margin__TypeAssignment_0"


    // $ANTLR start "rule__Margin__SizeAssignment_2"
    // InternalCinEditor.g:5860:1: rule__Margin__SizeAssignment_2 : ( ruleEInt ) ;
    public final void rule__Margin__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5864:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5865:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5865:2: ( ruleEInt )
            // InternalCinEditor.g:5866:3: ruleEInt
            {
             before(grammarAccess.getMarginAccess().getSizeEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMarginAccess().getSizeEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Margin__SizeAssignment_2"


    // $ANTLR start "rule__Margin__MarginColorAssignment_3"
    // InternalCinEditor.g:5875:1: rule__Margin__MarginColorAssignment_3 : ( ruleHexadecimalColor ) ;
    public final void rule__Margin__MarginColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5879:1: ( ( ruleHexadecimalColor ) )
            // InternalCinEditor.g:5880:2: ( ruleHexadecimalColor )
            {
            // InternalCinEditor.g:5880:2: ( ruleHexadecimalColor )
            // InternalCinEditor.g:5881:3: ruleHexadecimalColor
            {
             before(grammarAccess.getMarginAccess().getMarginColorHexadecimalColorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHexadecimalColor();

            state._fsp--;

             after(grammarAccess.getMarginAccess().getMarginColorHexadecimalColorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Margin__MarginColorAssignment_3"


    // $ANTLR start "rule__Margin__MarginColorOpacityAssignment_4_1"
    // InternalCinEditor.g:5890:1: rule__Margin__MarginColorOpacityAssignment_4_1 : ( ruleEFloat ) ;
    public final void rule__Margin__MarginColorOpacityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5894:1: ( ( ruleEFloat ) )
            // InternalCinEditor.g:5895:2: ( ruleEFloat )
            {
            // InternalCinEditor.g:5895:2: ( ruleEFloat )
            // InternalCinEditor.g:5896:3: ruleEFloat
            {
             before(grammarAccess.getMarginAccess().getMarginColorOpacityEFloatParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getMarginAccess().getMarginColorOpacityEFloatParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Margin__MarginColorOpacityAssignment_4_1"


    // $ANTLR start "rule__AudioElement__NameAssignment_1"
    // InternalCinEditor.g:5905:1: rule__AudioElement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AudioElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5909:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5910:2: ( ruleEString )
            {
            // InternalCinEditor.g:5910:2: ( ruleEString )
            // InternalCinEditor.g:5911:3: ruleEString
            {
             before(grammarAccess.getAudioElementAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAudioElementAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__NameAssignment_1"


    // $ANTLR start "rule__AudioElement__UrlAssignment_3"
    // InternalCinEditor.g:5920:1: rule__AudioElement__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__AudioElement__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5924:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5925:2: ( ruleEString )
            {
            // InternalCinEditor.g:5925:2: ( ruleEString )
            // InternalCinEditor.g:5926:3: ruleEString
            {
             before(grammarAccess.getAudioElementAccess().getUrlEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAudioElementAccess().getUrlEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__UrlAssignment_3"


    // $ANTLR start "rule__AudioElement__VolumeAssignment_4_1"
    // InternalCinEditor.g:5935:1: rule__AudioElement__VolumeAssignment_4_1 : ( ruleEFloat ) ;
    public final void rule__AudioElement__VolumeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5939:1: ( ( ruleEFloat ) )
            // InternalCinEditor.g:5940:2: ( ruleEFloat )
            {
            // InternalCinEditor.g:5940:2: ( ruleEFloat )
            // InternalCinEditor.g:5941:3: ruleEFloat
            {
             before(grammarAccess.getAudioElementAccess().getVolumeEFloatParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getAudioElementAccess().getVolumeEFloatParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__VolumeAssignment_4_1"


    // $ANTLR start "rule__AudioElement__FadeInAssignment_5_1"
    // InternalCinEditor.g:5950:1: rule__AudioElement__FadeInAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__FadeInAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5954:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5955:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5955:2: ( ruleEInt )
            // InternalCinEditor.g:5956:3: ruleEInt
            {
             before(grammarAccess.getAudioElementAccess().getFadeInEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAudioElementAccess().getFadeInEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__FadeInAssignment_5_1"


    // $ANTLR start "rule__AudioElement__FadeOutAssignment_6_1"
    // InternalCinEditor.g:5965:1: rule__AudioElement__FadeOutAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__FadeOutAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5969:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5970:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5970:2: ( ruleEInt )
            // InternalCinEditor.g:5971:3: ruleEInt
            {
             before(grammarAccess.getAudioElementAccess().getFadeOutEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAudioElementAccess().getFadeOutEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__FadeOutAssignment_6_1"


    // $ANTLR start "rule__AudioElement__TemporalPositionAssignment_7"
    // InternalCinEditor.g:5980:1: rule__AudioElement__TemporalPositionAssignment_7 : ( ruleTemporalPosition ) ;
    public final void rule__AudioElement__TemporalPositionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5984:1: ( ( ruleTemporalPosition ) )
            // InternalCinEditor.g:5985:2: ( ruleTemporalPosition )
            {
            // InternalCinEditor.g:5985:2: ( ruleTemporalPosition )
            // InternalCinEditor.g:5986:3: ruleTemporalPosition
            {
             before(grammarAccess.getAudioElementAccess().getTemporalPositionTemporalPositionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTemporalPosition();

            state._fsp--;

             after(grammarAccess.getAudioElementAccess().getTemporalPositionTemporalPositionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__TemporalPositionAssignment_7"


    // $ANTLR start "rule__AudioElement__BeginCropTimeAssignment_8_1"
    // InternalCinEditor.g:5995:1: rule__AudioElement__BeginCropTimeAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__BeginCropTimeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5999:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6000:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6000:2: ( ruleEInt )
            // InternalCinEditor.g:6001:3: ruleEInt
            {
             before(grammarAccess.getAudioElementAccess().getBeginCropTimeEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAudioElementAccess().getBeginCropTimeEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__BeginCropTimeAssignment_8_1"


    // $ANTLR start "rule__AudioElement__DurationAssignment_10"
    // InternalCinEditor.g:6010:1: rule__AudioElement__DurationAssignment_10 : ( ruleEInt ) ;
    public final void rule__AudioElement__DurationAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6014:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6015:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6015:2: ( ruleEInt )
            // InternalCinEditor.g:6016:3: ruleEInt
            {
             before(grammarAccess.getAudioElementAccess().getDurationEIntParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAudioElementAccess().getDurationEIntParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__DurationAssignment_10"


    // $ANTLR start "rule__Text__NameAssignment_1"
    // InternalCinEditor.g:6025:1: rule__Text__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Text__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6029:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6030:2: ( ruleEString )
            {
            // InternalCinEditor.g:6030:2: ( ruleEString )
            // InternalCinEditor.g:6031:3: ruleEString
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
    // InternalCinEditor.g:6040:1: rule__Text__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__Text__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6044:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6045:2: ( ruleEString )
            {
            // InternalCinEditor.g:6045:2: ( ruleEString )
            // InternalCinEditor.g:6046:3: ruleEString
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
    // InternalCinEditor.g:6055:1: rule__Text__FontSizeAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Text__FontSizeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6059:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6060:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6060:2: ( ruleEInt )
            // InternalCinEditor.g:6061:3: ruleEInt
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
    // InternalCinEditor.g:6070:1: rule__Text__PositionAssignment_5 : ( rulePosition ) ;
    public final void rule__Text__PositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6074:1: ( ( rulePosition ) )
            // InternalCinEditor.g:6075:2: ( rulePosition )
            {
            // InternalCinEditor.g:6075:2: ( rulePosition )
            // InternalCinEditor.g:6076:3: rulePosition
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


    // $ANTLR start "rule__Text__MarginsAssignment_6_1"
    // InternalCinEditor.g:6085:1: rule__Text__MarginsAssignment_6_1 : ( ruleMargin ) ;
    public final void rule__Text__MarginsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6089:1: ( ( ruleMargin ) )
            // InternalCinEditor.g:6090:2: ( ruleMargin )
            {
            // InternalCinEditor.g:6090:2: ( ruleMargin )
            // InternalCinEditor.g:6091:3: ruleMargin
            {
             before(grammarAccess.getTextAccess().getMarginsMarginParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMargin();

            state._fsp--;

             after(grammarAccess.getTextAccess().getMarginsMarginParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__MarginsAssignment_6_1"


    // $ANTLR start "rule__Text__TemporalPositionAssignment_7"
    // InternalCinEditor.g:6100:1: rule__Text__TemporalPositionAssignment_7 : ( ruleTemporalPosition ) ;
    public final void rule__Text__TemporalPositionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6104:1: ( ( ruleTemporalPosition ) )
            // InternalCinEditor.g:6105:2: ( ruleTemporalPosition )
            {
            // InternalCinEditor.g:6105:2: ( ruleTemporalPosition )
            // InternalCinEditor.g:6106:3: ruleTemporalPosition
            {
             before(grammarAccess.getTextAccess().getTemporalPositionTemporalPositionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTemporalPosition();

            state._fsp--;

             after(grammarAccess.getTextAccess().getTemporalPositionTemporalPositionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__TemporalPositionAssignment_7"


    // $ANTLR start "rule__Text__DurationAssignment_8_1"
    // InternalCinEditor.g:6115:1: rule__Text__DurationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Text__DurationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6119:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6120:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6120:2: ( ruleEInt )
            // InternalCinEditor.g:6121:3: ruleEInt
            {
             before(grammarAccess.getTextAccess().getDurationEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextAccess().getDurationEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__DurationAssignment_8_1"


    // $ANTLR start "rule__Text__ColorAssignment_9"
    // InternalCinEditor.g:6130:1: rule__Text__ColorAssignment_9 : ( ruleHexadecimalColor ) ;
    public final void rule__Text__ColorAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6134:1: ( ( ruleHexadecimalColor ) )
            // InternalCinEditor.g:6135:2: ( ruleHexadecimalColor )
            {
            // InternalCinEditor.g:6135:2: ( ruleHexadecimalColor )
            // InternalCinEditor.g:6136:3: ruleHexadecimalColor
            {
             before(grammarAccess.getTextAccess().getColorHexadecimalColorParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleHexadecimalColor();

            state._fsp--;

             after(grammarAccess.getTextAccess().getColorHexadecimalColorParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__ColorAssignment_9"


    // $ANTLR start "rule__Picture__NameAssignment_1"
    // InternalCinEditor.g:6145:1: rule__Picture__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Picture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6149:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6150:2: ( ruleEString )
            {
            // InternalCinEditor.g:6150:2: ( ruleEString )
            // InternalCinEditor.g:6151:3: ruleEString
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


    // $ANTLR start "rule__Picture__UrlAssignment_3"
    // InternalCinEditor.g:6160:1: rule__Picture__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Picture__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6164:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6165:2: ( ruleEString )
            {
            // InternalCinEditor.g:6165:2: ( ruleEString )
            // InternalCinEditor.g:6166:3: ruleEString
            {
             before(grammarAccess.getPictureAccess().getUrlEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getUrlEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__UrlAssignment_3"


    // $ANTLR start "rule__Picture__PositionAssignment_4"
    // InternalCinEditor.g:6175:1: rule__Picture__PositionAssignment_4 : ( rulePosition ) ;
    public final void rule__Picture__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6179:1: ( ( rulePosition ) )
            // InternalCinEditor.g:6180:2: ( rulePosition )
            {
            // InternalCinEditor.g:6180:2: ( rulePosition )
            // InternalCinEditor.g:6181:3: rulePosition
            {
             before(grammarAccess.getPictureAccess().getPositionPositionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getPositionPositionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__PositionAssignment_4"


    // $ANTLR start "rule__Picture__DimensionAssignment_5"
    // InternalCinEditor.g:6190:1: rule__Picture__DimensionAssignment_5 : ( ruleDimension ) ;
    public final void rule__Picture__DimensionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6194:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:6195:2: ( ruleDimension )
            {
            // InternalCinEditor.g:6195:2: ( ruleDimension )
            // InternalCinEditor.g:6196:3: ruleDimension
            {
             before(grammarAccess.getPictureAccess().getDimensionDimensionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getDimensionDimensionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__DimensionAssignment_5"


    // $ANTLR start "rule__Picture__MarginsAssignment_6_1"
    // InternalCinEditor.g:6205:1: rule__Picture__MarginsAssignment_6_1 : ( ruleMargin ) ;
    public final void rule__Picture__MarginsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6209:1: ( ( ruleMargin ) )
            // InternalCinEditor.g:6210:2: ( ruleMargin )
            {
            // InternalCinEditor.g:6210:2: ( ruleMargin )
            // InternalCinEditor.g:6211:3: ruleMargin
            {
             before(grammarAccess.getPictureAccess().getMarginsMarginParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMargin();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getMarginsMarginParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__MarginsAssignment_6_1"


    // $ANTLR start "rule__Picture__TemporalPositionAssignment_7"
    // InternalCinEditor.g:6220:1: rule__Picture__TemporalPositionAssignment_7 : ( ruleTemporalPosition ) ;
    public final void rule__Picture__TemporalPositionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6224:1: ( ( ruleTemporalPosition ) )
            // InternalCinEditor.g:6225:2: ( ruleTemporalPosition )
            {
            // InternalCinEditor.g:6225:2: ( ruleTemporalPosition )
            // InternalCinEditor.g:6226:3: ruleTemporalPosition
            {
             before(grammarAccess.getPictureAccess().getTemporalPositionTemporalPositionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTemporalPosition();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getTemporalPositionTemporalPositionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__TemporalPositionAssignment_7"


    // $ANTLR start "rule__Picture__DurationAssignment_8_1"
    // InternalCinEditor.g:6235:1: rule__Picture__DurationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Picture__DurationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6239:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6240:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6240:2: ( ruleEInt )
            // InternalCinEditor.g:6241:3: ruleEInt
            {
             before(grammarAccess.getPictureAccess().getDurationEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getDurationEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__DurationAssignment_8_1"


    // $ANTLR start "rule__Video__NameAssignment_1"
    // InternalCinEditor.g:6250:1: rule__Video__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Video__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6254:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6255:2: ( ruleEString )
            {
            // InternalCinEditor.g:6255:2: ( ruleEString )
            // InternalCinEditor.g:6256:3: ruleEString
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


    // $ANTLR start "rule__Video__UrlAssignment_3"
    // InternalCinEditor.g:6265:1: rule__Video__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Video__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6269:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6270:2: ( ruleEString )
            {
            // InternalCinEditor.g:6270:2: ( ruleEString )
            // InternalCinEditor.g:6271:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getUrlEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getUrlEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__UrlAssignment_3"


    // $ANTLR start "rule__Video__EnableAudioAssignment_4_1"
    // InternalCinEditor.g:6280:1: rule__Video__EnableAudioAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__Video__EnableAudioAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6284:1: ( ( ruleEBoolean ) )
            // InternalCinEditor.g:6285:2: ( ruleEBoolean )
            {
            // InternalCinEditor.g:6285:2: ( ruleEBoolean )
            // InternalCinEditor.g:6286:3: ruleEBoolean
            {
             before(grammarAccess.getVideoAccess().getEnableAudioEBooleanParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getEnableAudioEBooleanParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__EnableAudioAssignment_4_1"


    // $ANTLR start "rule__Video__PositionAssignment_5"
    // InternalCinEditor.g:6295:1: rule__Video__PositionAssignment_5 : ( rulePosition ) ;
    public final void rule__Video__PositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6299:1: ( ( rulePosition ) )
            // InternalCinEditor.g:6300:2: ( rulePosition )
            {
            // InternalCinEditor.g:6300:2: ( rulePosition )
            // InternalCinEditor.g:6301:3: rulePosition
            {
             before(grammarAccess.getVideoAccess().getPositionPositionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getPositionPositionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__PositionAssignment_5"


    // $ANTLR start "rule__Video__DimensionAssignment_6"
    // InternalCinEditor.g:6310:1: rule__Video__DimensionAssignment_6 : ( ruleDimension ) ;
    public final void rule__Video__DimensionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6314:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:6315:2: ( ruleDimension )
            {
            // InternalCinEditor.g:6315:2: ( ruleDimension )
            // InternalCinEditor.g:6316:3: ruleDimension
            {
             before(grammarAccess.getVideoAccess().getDimensionDimensionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getDimensionDimensionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__DimensionAssignment_6"


    // $ANTLR start "rule__Video__MarginsAssignment_7_1"
    // InternalCinEditor.g:6325:1: rule__Video__MarginsAssignment_7_1 : ( ruleMargin ) ;
    public final void rule__Video__MarginsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6329:1: ( ( ruleMargin ) )
            // InternalCinEditor.g:6330:2: ( ruleMargin )
            {
            // InternalCinEditor.g:6330:2: ( ruleMargin )
            // InternalCinEditor.g:6331:3: ruleMargin
            {
             before(grammarAccess.getVideoAccess().getMarginsMarginParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMargin();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getMarginsMarginParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__MarginsAssignment_7_1"


    // $ANTLR start "rule__Video__TemporalPositionAssignment_8"
    // InternalCinEditor.g:6340:1: rule__Video__TemporalPositionAssignment_8 : ( ruleTemporalPosition ) ;
    public final void rule__Video__TemporalPositionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6344:1: ( ( ruleTemporalPosition ) )
            // InternalCinEditor.g:6345:2: ( ruleTemporalPosition )
            {
            // InternalCinEditor.g:6345:2: ( ruleTemporalPosition )
            // InternalCinEditor.g:6346:3: ruleTemporalPosition
            {
             before(grammarAccess.getVideoAccess().getTemporalPositionTemporalPositionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTemporalPosition();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getTemporalPositionTemporalPositionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__TemporalPositionAssignment_8"


    // $ANTLR start "rule__Video__BeginCropTimeAssignment_9_1"
    // InternalCinEditor.g:6355:1: rule__Video__BeginCropTimeAssignment_9_1 : ( ruleEInt ) ;
    public final void rule__Video__BeginCropTimeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6359:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6360:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6360:2: ( ruleEInt )
            // InternalCinEditor.g:6361:3: ruleEInt
            {
             before(grammarAccess.getVideoAccess().getBeginCropTimeEIntParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getBeginCropTimeEIntParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__BeginCropTimeAssignment_9_1"


    // $ANTLR start "rule__Video__DurationAssignment_11"
    // InternalCinEditor.g:6370:1: rule__Video__DurationAssignment_11 : ( ruleEInt ) ;
    public final void rule__Video__DurationAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6374:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6375:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6375:2: ( ruleEInt )
            // InternalCinEditor.g:6376:3: ruleEInt
            {
             before(grammarAccess.getVideoAccess().getDurationEIntParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getDurationEIntParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__DurationAssignment_11"


    // $ANTLR start "rule__Rectangle__NameAssignment_1"
    // InternalCinEditor.g:6385:1: rule__Rectangle__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Rectangle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6389:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6390:2: ( ruleEString )
            {
            // InternalCinEditor.g:6390:2: ( ruleEString )
            // InternalCinEditor.g:6391:3: ruleEString
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
    // InternalCinEditor.g:6400:1: rule__Rectangle__ColorAssignment_3 : ( ruleHexadecimalColor ) ;
    public final void rule__Rectangle__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6404:1: ( ( ruleHexadecimalColor ) )
            // InternalCinEditor.g:6405:2: ( ruleHexadecimalColor )
            {
            // InternalCinEditor.g:6405:2: ( ruleHexadecimalColor )
            // InternalCinEditor.g:6406:3: ruleHexadecimalColor
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
    // InternalCinEditor.g:6415:1: rule__Rectangle__PositionAssignment_4 : ( rulePosition ) ;
    public final void rule__Rectangle__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6419:1: ( ( rulePosition ) )
            // InternalCinEditor.g:6420:2: ( rulePosition )
            {
            // InternalCinEditor.g:6420:2: ( rulePosition )
            // InternalCinEditor.g:6421:3: rulePosition
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
    // InternalCinEditor.g:6430:1: rule__Rectangle__DimensionAssignment_5 : ( ruleDimension ) ;
    public final void rule__Rectangle__DimensionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6434:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:6435:2: ( ruleDimension )
            {
            // InternalCinEditor.g:6435:2: ( ruleDimension )
            // InternalCinEditor.g:6436:3: ruleDimension
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


    // $ANTLR start "rule__Rectangle__MarginsAssignment_6_1"
    // InternalCinEditor.g:6445:1: rule__Rectangle__MarginsAssignment_6_1 : ( ruleMargin ) ;
    public final void rule__Rectangle__MarginsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6449:1: ( ( ruleMargin ) )
            // InternalCinEditor.g:6450:2: ( ruleMargin )
            {
            // InternalCinEditor.g:6450:2: ( ruleMargin )
            // InternalCinEditor.g:6451:3: ruleMargin
            {
             before(grammarAccess.getRectangleAccess().getMarginsMarginParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMargin();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getMarginsMarginParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__MarginsAssignment_6_1"


    // $ANTLR start "rule__Rectangle__TemporalPositionAssignment_7"
    // InternalCinEditor.g:6460:1: rule__Rectangle__TemporalPositionAssignment_7 : ( ruleTemporalPosition ) ;
    public final void rule__Rectangle__TemporalPositionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6464:1: ( ( ruleTemporalPosition ) )
            // InternalCinEditor.g:6465:2: ( ruleTemporalPosition )
            {
            // InternalCinEditor.g:6465:2: ( ruleTemporalPosition )
            // InternalCinEditor.g:6466:3: ruleTemporalPosition
            {
             before(grammarAccess.getRectangleAccess().getTemporalPositionTemporalPositionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTemporalPosition();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getTemporalPositionTemporalPositionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__TemporalPositionAssignment_7"


    // $ANTLR start "rule__Rectangle__DurationAssignment_8_1"
    // InternalCinEditor.g:6475:1: rule__Rectangle__DurationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Rectangle__DurationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6479:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6480:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6480:2: ( ruleEInt )
            // InternalCinEditor.g:6481:3: ruleEInt
            {
             before(grammarAccess.getRectangleAccess().getDurationEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getDurationEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__DurationAssignment_8_1"


    // $ANTLR start "rule__FadeIn__NameAssignment_1"
    // InternalCinEditor.g:6490:1: rule__FadeIn__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FadeIn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6494:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6495:2: ( ruleEString )
            {
            // InternalCinEditor.g:6495:2: ( ruleEString )
            // InternalCinEditor.g:6496:3: ruleEString
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
    // InternalCinEditor.g:6505:1: rule__FadeIn__DurationAssignment_5 : ( ruleEInt ) ;
    public final void rule__FadeIn__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6509:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6510:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6510:2: ( ruleEInt )
            // InternalCinEditor.g:6511:3: ruleEInt
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


    // $ANTLR start "rule__FadeIn__ElementsAssignment_8"
    // InternalCinEditor.g:6520:1: rule__FadeIn__ElementsAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__FadeIn__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6524:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:6525:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:6525:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:6526:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeInAccess().getElementsGraphicalElementCrossReference_8_0()); 
            // InternalCinEditor.g:6527:3: ( RULE_ID )
            // InternalCinEditor.g:6528:4: RULE_ID
            {
             before(grammarAccess.getFadeInAccess().getElementsGraphicalElementIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getElementsGraphicalElementIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getFadeInAccess().getElementsGraphicalElementCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__ElementsAssignment_8"


    // $ANTLR start "rule__FadeIn__ElementsAssignment_9_1"
    // InternalCinEditor.g:6539:1: rule__FadeIn__ElementsAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__FadeIn__ElementsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6543:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:6544:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:6544:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:6545:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeInAccess().getElementsGraphicalElementCrossReference_9_1_0()); 
            // InternalCinEditor.g:6546:3: ( RULE_ID )
            // InternalCinEditor.g:6547:4: RULE_ID
            {
             before(grammarAccess.getFadeInAccess().getElementsGraphicalElementIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getElementsGraphicalElementIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getFadeInAccess().getElementsGraphicalElementCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__ElementsAssignment_9_1"


    // $ANTLR start "rule__FadeOut__NameAssignment_1"
    // InternalCinEditor.g:6558:1: rule__FadeOut__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FadeOut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6562:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6563:2: ( ruleEString )
            {
            // InternalCinEditor.g:6563:2: ( ruleEString )
            // InternalCinEditor.g:6564:3: ruleEString
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
    // InternalCinEditor.g:6573:1: rule__FadeOut__DurationAssignment_5 : ( ruleEInt ) ;
    public final void rule__FadeOut__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6577:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6578:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6578:2: ( ruleEInt )
            // InternalCinEditor.g:6579:3: ruleEInt
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


    // $ANTLR start "rule__FadeOut__ElementsAssignment_8"
    // InternalCinEditor.g:6588:1: rule__FadeOut__ElementsAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__FadeOut__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6592:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:6593:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:6593:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:6594:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeOutAccess().getElementsGraphicalElementCrossReference_8_0()); 
            // InternalCinEditor.g:6595:3: ( RULE_ID )
            // InternalCinEditor.g:6596:4: RULE_ID
            {
             before(grammarAccess.getFadeOutAccess().getElementsGraphicalElementIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getElementsGraphicalElementIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getFadeOutAccess().getElementsGraphicalElementCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__ElementsAssignment_8"


    // $ANTLR start "rule__FadeOut__ElementsAssignment_9_1"
    // InternalCinEditor.g:6607:1: rule__FadeOut__ElementsAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__FadeOut__ElementsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6611:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:6612:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:6612:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:6613:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeOutAccess().getElementsGraphicalElementCrossReference_9_1_0()); 
            // InternalCinEditor.g:6614:3: ( RULE_ID )
            // InternalCinEditor.g:6615:4: RULE_ID
            {
             before(grammarAccess.getFadeOutAccess().getElementsGraphicalElementIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getElementsGraphicalElementIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getFadeOutAccess().getElementsGraphicalElementCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__ElementsAssignment_9_1"


    // $ANTLR start "rule__Translate__NameAssignment_1"
    // InternalCinEditor.g:6626:1: rule__Translate__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Translate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6630:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6631:2: ( ruleEString )
            {
            // InternalCinEditor.g:6631:2: ( ruleEString )
            // InternalCinEditor.g:6632:3: ruleEString
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


    // $ANTLR start "rule__Translate__PositionToTranslateAssignment_4"
    // InternalCinEditor.g:6641:1: rule__Translate__PositionToTranslateAssignment_4 : ( rulePosition ) ;
    public final void rule__Translate__PositionToTranslateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6645:1: ( ( rulePosition ) )
            // InternalCinEditor.g:6646:2: ( rulePosition )
            {
            // InternalCinEditor.g:6646:2: ( rulePosition )
            // InternalCinEditor.g:6647:3: rulePosition
            {
             before(grammarAccess.getTranslateAccess().getPositionToTranslatePositionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getTranslateAccess().getPositionToTranslatePositionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__PositionToTranslateAssignment_4"


    // $ANTLR start "rule__Translate__TemporalPositionAssignment_5"
    // InternalCinEditor.g:6656:1: rule__Translate__TemporalPositionAssignment_5 : ( ruleTemporalPosition ) ;
    public final void rule__Translate__TemporalPositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6660:1: ( ( ruleTemporalPosition ) )
            // InternalCinEditor.g:6661:2: ( ruleTemporalPosition )
            {
            // InternalCinEditor.g:6661:2: ( ruleTemporalPosition )
            // InternalCinEditor.g:6662:3: ruleTemporalPosition
            {
             before(grammarAccess.getTranslateAccess().getTemporalPositionTemporalPositionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTemporalPosition();

            state._fsp--;

             after(grammarAccess.getTranslateAccess().getTemporalPositionTemporalPositionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__TemporalPositionAssignment_5"


    // $ANTLR start "rule__Translate__DurationAssignment_6_1"
    // InternalCinEditor.g:6671:1: rule__Translate__DurationAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Translate__DurationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6675:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6676:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6676:2: ( ruleEInt )
            // InternalCinEditor.g:6677:3: ruleEInt
            {
             before(grammarAccess.getTranslateAccess().getDurationEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTranslateAccess().getDurationEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__DurationAssignment_6_1"


    // $ANTLR start "rule__Translate__ElementsAssignment_9"
    // InternalCinEditor.g:6686:1: rule__Translate__ElementsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Translate__ElementsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6690:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:6691:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:6691:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:6692:3: ( RULE_ID )
            {
             before(grammarAccess.getTranslateAccess().getElementsGraphicalElementCrossReference_9_0()); 
            // InternalCinEditor.g:6693:3: ( RULE_ID )
            // InternalCinEditor.g:6694:4: RULE_ID
            {
             before(grammarAccess.getTranslateAccess().getElementsGraphicalElementIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getElementsGraphicalElementIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getTranslateAccess().getElementsGraphicalElementCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__ElementsAssignment_9"


    // $ANTLR start "rule__Translate__ElementsAssignment_10_1"
    // InternalCinEditor.g:6705:1: rule__Translate__ElementsAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Translate__ElementsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6709:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:6710:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:6710:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:6711:3: ( RULE_ID )
            {
             before(grammarAccess.getTranslateAccess().getElementsGraphicalElementCrossReference_10_1_0()); 
            // InternalCinEditor.g:6712:3: ( RULE_ID )
            // InternalCinEditor.g:6713:4: RULE_ID
            {
             before(grammarAccess.getTranslateAccess().getElementsGraphicalElementIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getElementsGraphicalElementIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getTranslateAccess().getElementsGraphicalElementCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__ElementsAssignment_10_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\41\1\uffff\1\4\1\uffff\2\42\1\60\3\uffff";
    static final String dfa_3s = "\1\57\1\uffff\1\5\1\uffff\2\42\1\65\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\5\3\uffff\1\4\1\3\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\6\uffff\1\1\2\uffff\2\1\1\uffff\1\1\1\2",
            "",
            "\1\4\1\5",
            "",
            "\1\6",
            "\1\6",
            "\1\11\3\uffff\1\10\1\7",
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
            return "668:1: rule__Element__Alternatives : ( ( ruleGraphicalElement ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleAudioElement ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000D90200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000D90200000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000010000F840L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000092000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000F860000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000060870800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040864800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000248864800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000860000000L});

}