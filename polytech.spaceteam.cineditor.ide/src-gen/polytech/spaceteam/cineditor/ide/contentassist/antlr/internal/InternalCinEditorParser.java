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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'center'", "'left'", "'right'", "'bottom'", "'top'", "'.'", "','", "'true'", "'false'", "'Movie'", "'fps'", "'Layer'", "'position'", "'('", "')'", "'dimension'", "'x'", "'color'", "'opacity'", "'-'", "'Audio'", "'='", "'on'", "'volume'", "'fadeIn'", "'fadeOut'", "'startAt'", "'cropAt'", "'during'", "'Text'", "'fontSize'", "'margins('", "'Picture'", "'Video'", "'audio'", "'Rectangle'", "'Effect'", "'FadeIn'", "'['", "']'", "'FadeOut'", "'Translate'"
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


    // $ANTLR start "entryRuleGraphicalElement"
    // InternalCinEditor.g:303:1: entryRuleGraphicalElement : ruleGraphicalElement EOF ;
    public final void entryRuleGraphicalElement() throws RecognitionException {
        try {
            // InternalCinEditor.g:304:1: ( ruleGraphicalElement EOF )
            // InternalCinEditor.g:305:1: ruleGraphicalElement EOF
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
    // InternalCinEditor.g:312:1: ruleGraphicalElement : ( ( rule__GraphicalElement__Alternatives ) ) ;
    public final void ruleGraphicalElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:316:2: ( ( ( rule__GraphicalElement__Alternatives ) ) )
            // InternalCinEditor.g:317:2: ( ( rule__GraphicalElement__Alternatives ) )
            {
            // InternalCinEditor.g:317:2: ( ( rule__GraphicalElement__Alternatives ) )
            // InternalCinEditor.g:318:3: ( rule__GraphicalElement__Alternatives )
            {
             before(grammarAccess.getGraphicalElementAccess().getAlternatives()); 
            // InternalCinEditor.g:319:3: ( rule__GraphicalElement__Alternatives )
            // InternalCinEditor.g:319:4: rule__GraphicalElement__Alternatives
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
    // InternalCinEditor.g:328:1: entryRuleMargin : ruleMargin EOF ;
    public final void entryRuleMargin() throws RecognitionException {
        try {
            // InternalCinEditor.g:329:1: ( ruleMargin EOF )
            // InternalCinEditor.g:330:1: ruleMargin EOF
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
    // InternalCinEditor.g:337:1: ruleMargin : ( ( rule__Margin__Group__0 ) ) ;
    public final void ruleMargin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:341:2: ( ( ( rule__Margin__Group__0 ) ) )
            // InternalCinEditor.g:342:2: ( ( rule__Margin__Group__0 ) )
            {
            // InternalCinEditor.g:342:2: ( ( rule__Margin__Group__0 ) )
            // InternalCinEditor.g:343:3: ( rule__Margin__Group__0 )
            {
             before(grammarAccess.getMarginAccess().getGroup()); 
            // InternalCinEditor.g:344:3: ( rule__Margin__Group__0 )
            // InternalCinEditor.g:344:4: rule__Margin__Group__0
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
    // InternalCinEditor.g:353:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalCinEditor.g:354:1: ( ruleEInt EOF )
            // InternalCinEditor.g:355:1: ruleEInt EOF
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
    // InternalCinEditor.g:362:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:366:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalCinEditor.g:367:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalCinEditor.g:367:2: ( ( rule__EInt__Group__0 ) )
            // InternalCinEditor.g:368:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalCinEditor.g:369:3: ( rule__EInt__Group__0 )
            // InternalCinEditor.g:369:4: rule__EInt__Group__0
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
    // InternalCinEditor.g:378:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalCinEditor.g:379:1: ( ruleEFloat EOF )
            // InternalCinEditor.g:380:1: ruleEFloat EOF
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
    // InternalCinEditor.g:387:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:391:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalCinEditor.g:392:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalCinEditor.g:392:2: ( ( rule__EFloat__Group__0 ) )
            // InternalCinEditor.g:393:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalCinEditor.g:394:3: ( rule__EFloat__Group__0 )
            // InternalCinEditor.g:394:4: rule__EFloat__Group__0
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
    // InternalCinEditor.g:403:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalCinEditor.g:404:1: ( ruleEBoolean EOF )
            // InternalCinEditor.g:405:1: ruleEBoolean EOF
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
    // InternalCinEditor.g:412:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:416:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalCinEditor.g:417:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalCinEditor.g:417:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalCinEditor.g:418:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalCinEditor.g:419:3: ( rule__EBoolean__Alternatives )
            // InternalCinEditor.g:419:4: rule__EBoolean__Alternatives
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
    // InternalCinEditor.g:428:1: entryRuleAudioElement : ruleAudioElement EOF ;
    public final void entryRuleAudioElement() throws RecognitionException {
        try {
            // InternalCinEditor.g:429:1: ( ruleAudioElement EOF )
            // InternalCinEditor.g:430:1: ruleAudioElement EOF
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
    // InternalCinEditor.g:437:1: ruleAudioElement : ( ( rule__AudioElement__Group__0 ) ) ;
    public final void ruleAudioElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:441:2: ( ( ( rule__AudioElement__Group__0 ) ) )
            // InternalCinEditor.g:442:2: ( ( rule__AudioElement__Group__0 ) )
            {
            // InternalCinEditor.g:442:2: ( ( rule__AudioElement__Group__0 ) )
            // InternalCinEditor.g:443:3: ( rule__AudioElement__Group__0 )
            {
             before(grammarAccess.getAudioElementAccess().getGroup()); 
            // InternalCinEditor.g:444:3: ( rule__AudioElement__Group__0 )
            // InternalCinEditor.g:444:4: rule__AudioElement__Group__0
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
    // InternalCinEditor.g:453:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalCinEditor.g:454:1: ( ruleText EOF )
            // InternalCinEditor.g:455:1: ruleText EOF
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
    // InternalCinEditor.g:462:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:466:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalCinEditor.g:467:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalCinEditor.g:467:2: ( ( rule__Text__Group__0 ) )
            // InternalCinEditor.g:468:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalCinEditor.g:469:3: ( rule__Text__Group__0 )
            // InternalCinEditor.g:469:4: rule__Text__Group__0
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
    // InternalCinEditor.g:478:1: entryRulePicture : rulePicture EOF ;
    public final void entryRulePicture() throws RecognitionException {
        try {
            // InternalCinEditor.g:479:1: ( rulePicture EOF )
            // InternalCinEditor.g:480:1: rulePicture EOF
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
    // InternalCinEditor.g:487:1: rulePicture : ( ( rule__Picture__Group__0 ) ) ;
    public final void rulePicture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:491:2: ( ( ( rule__Picture__Group__0 ) ) )
            // InternalCinEditor.g:492:2: ( ( rule__Picture__Group__0 ) )
            {
            // InternalCinEditor.g:492:2: ( ( rule__Picture__Group__0 ) )
            // InternalCinEditor.g:493:3: ( rule__Picture__Group__0 )
            {
             before(grammarAccess.getPictureAccess().getGroup()); 
            // InternalCinEditor.g:494:3: ( rule__Picture__Group__0 )
            // InternalCinEditor.g:494:4: rule__Picture__Group__0
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
    // InternalCinEditor.g:503:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalCinEditor.g:504:1: ( ruleVideo EOF )
            // InternalCinEditor.g:505:1: ruleVideo EOF
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
    // InternalCinEditor.g:512:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:516:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalCinEditor.g:517:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalCinEditor.g:517:2: ( ( rule__Video__Group__0 ) )
            // InternalCinEditor.g:518:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalCinEditor.g:519:3: ( rule__Video__Group__0 )
            // InternalCinEditor.g:519:4: rule__Video__Group__0
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
    // InternalCinEditor.g:528:1: entryRuleRectangle : ruleRectangle EOF ;
    public final void entryRuleRectangle() throws RecognitionException {
        try {
            // InternalCinEditor.g:529:1: ( ruleRectangle EOF )
            // InternalCinEditor.g:530:1: ruleRectangle EOF
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
    // InternalCinEditor.g:537:1: ruleRectangle : ( ( rule__Rectangle__Group__0 ) ) ;
    public final void ruleRectangle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:541:2: ( ( ( rule__Rectangle__Group__0 ) ) )
            // InternalCinEditor.g:542:2: ( ( rule__Rectangle__Group__0 ) )
            {
            // InternalCinEditor.g:542:2: ( ( rule__Rectangle__Group__0 ) )
            // InternalCinEditor.g:543:3: ( rule__Rectangle__Group__0 )
            {
             before(grammarAccess.getRectangleAccess().getGroup()); 
            // InternalCinEditor.g:544:3: ( rule__Rectangle__Group__0 )
            // InternalCinEditor.g:544:4: rule__Rectangle__Group__0
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
    // InternalCinEditor.g:553:1: entryRuleFadeIn : ruleFadeIn EOF ;
    public final void entryRuleFadeIn() throws RecognitionException {
        try {
            // InternalCinEditor.g:554:1: ( ruleFadeIn EOF )
            // InternalCinEditor.g:555:1: ruleFadeIn EOF
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
    // InternalCinEditor.g:562:1: ruleFadeIn : ( ( rule__FadeIn__Group__0 ) ) ;
    public final void ruleFadeIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:566:2: ( ( ( rule__FadeIn__Group__0 ) ) )
            // InternalCinEditor.g:567:2: ( ( rule__FadeIn__Group__0 ) )
            {
            // InternalCinEditor.g:567:2: ( ( rule__FadeIn__Group__0 ) )
            // InternalCinEditor.g:568:3: ( rule__FadeIn__Group__0 )
            {
             before(grammarAccess.getFadeInAccess().getGroup()); 
            // InternalCinEditor.g:569:3: ( rule__FadeIn__Group__0 )
            // InternalCinEditor.g:569:4: rule__FadeIn__Group__0
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
    // InternalCinEditor.g:578:1: entryRuleFadeOut : ruleFadeOut EOF ;
    public final void entryRuleFadeOut() throws RecognitionException {
        try {
            // InternalCinEditor.g:579:1: ( ruleFadeOut EOF )
            // InternalCinEditor.g:580:1: ruleFadeOut EOF
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
    // InternalCinEditor.g:587:1: ruleFadeOut : ( ( rule__FadeOut__Group__0 ) ) ;
    public final void ruleFadeOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:591:2: ( ( ( rule__FadeOut__Group__0 ) ) )
            // InternalCinEditor.g:592:2: ( ( rule__FadeOut__Group__0 ) )
            {
            // InternalCinEditor.g:592:2: ( ( rule__FadeOut__Group__0 ) )
            // InternalCinEditor.g:593:3: ( rule__FadeOut__Group__0 )
            {
             before(grammarAccess.getFadeOutAccess().getGroup()); 
            // InternalCinEditor.g:594:3: ( rule__FadeOut__Group__0 )
            // InternalCinEditor.g:594:4: rule__FadeOut__Group__0
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
    // InternalCinEditor.g:603:1: entryRuleTranslate : ruleTranslate EOF ;
    public final void entryRuleTranslate() throws RecognitionException {
        try {
            // InternalCinEditor.g:604:1: ( ruleTranslate EOF )
            // InternalCinEditor.g:605:1: ruleTranslate EOF
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
    // InternalCinEditor.g:612:1: ruleTranslate : ( ( rule__Translate__Group__0 ) ) ;
    public final void ruleTranslate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:616:2: ( ( ( rule__Translate__Group__0 ) ) )
            // InternalCinEditor.g:617:2: ( ( rule__Translate__Group__0 ) )
            {
            // InternalCinEditor.g:617:2: ( ( rule__Translate__Group__0 ) )
            // InternalCinEditor.g:618:3: ( rule__Translate__Group__0 )
            {
             before(grammarAccess.getTranslateAccess().getGroup()); 
            // InternalCinEditor.g:619:3: ( rule__Translate__Group__0 )
            // InternalCinEditor.g:619:4: rule__Translate__Group__0
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
    // InternalCinEditor.g:628:1: ruleMARGIN_NAME : ( ( rule__MARGIN_NAME__Alternatives ) ) ;
    public final void ruleMARGIN_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:632:1: ( ( ( rule__MARGIN_NAME__Alternatives ) ) )
            // InternalCinEditor.g:633:2: ( ( rule__MARGIN_NAME__Alternatives ) )
            {
            // InternalCinEditor.g:633:2: ( ( rule__MARGIN_NAME__Alternatives ) )
            // InternalCinEditor.g:634:3: ( rule__MARGIN_NAME__Alternatives )
            {
             before(grammarAccess.getMARGIN_NAMEAccess().getAlternatives()); 
            // InternalCinEditor.g:635:3: ( rule__MARGIN_NAME__Alternatives )
            // InternalCinEditor.g:635:4: rule__MARGIN_NAME__Alternatives
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
    // InternalCinEditor.g:643:1: rule__Element__Alternatives : ( ( ruleGraphicalElement ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleAudioElement ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:647:1: ( ( ruleGraphicalElement ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleAudioElement ) )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCinEditor.g:648:2: ( ruleGraphicalElement )
                    {
                    // InternalCinEditor.g:648:2: ( ruleGraphicalElement )
                    // InternalCinEditor.g:649:3: ruleGraphicalElement
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
                    // InternalCinEditor.g:654:2: ( ruleFadeIn )
                    {
                    // InternalCinEditor.g:654:2: ( ruleFadeIn )
                    // InternalCinEditor.g:655:3: ruleFadeIn
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
                    // InternalCinEditor.g:660:2: ( ruleFadeOut )
                    {
                    // InternalCinEditor.g:660:2: ( ruleFadeOut )
                    // InternalCinEditor.g:661:3: ruleFadeOut
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
                    // InternalCinEditor.g:666:2: ( ruleTranslate )
                    {
                    // InternalCinEditor.g:666:2: ( ruleTranslate )
                    // InternalCinEditor.g:667:3: ruleTranslate
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
                    // InternalCinEditor.g:672:2: ( ruleAudioElement )
                    {
                    // InternalCinEditor.g:672:2: ( ruleAudioElement )
                    // InternalCinEditor.g:673:3: ruleAudioElement
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
    // InternalCinEditor.g:682:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:686:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCinEditor.g:687:2: ( RULE_STRING )
                    {
                    // InternalCinEditor.g:687:2: ( RULE_STRING )
                    // InternalCinEditor.g:688:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:693:2: ( RULE_ID )
                    {
                    // InternalCinEditor.g:693:2: ( RULE_ID )
                    // InternalCinEditor.g:694:3: RULE_ID
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
    // InternalCinEditor.g:703:1: rule__ItemPosition__Alternatives : ( ( ruleItemPositionInt ) | ( ruleItemPositionString ) );
    public final void rule__ItemPosition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:707:1: ( ( ruleItemPositionInt ) | ( ruleItemPositionString ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==30) ) {
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
                    // InternalCinEditor.g:708:2: ( ruleItemPositionInt )
                    {
                    // InternalCinEditor.g:708:2: ( ruleItemPositionInt )
                    // InternalCinEditor.g:709:3: ruleItemPositionInt
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
                    // InternalCinEditor.g:714:2: ( ruleItemPositionString )
                    {
                    // InternalCinEditor.g:714:2: ( ruleItemPositionString )
                    // InternalCinEditor.g:715:3: ruleItemPositionString
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
    // InternalCinEditor.g:724:1: rule__ItemPositionString__PositionAlternatives_0 : ( ( 'center' ) | ( 'left' ) | ( 'right' ) | ( 'bottom' ) | ( 'top' ) );
    public final void rule__ItemPositionString__PositionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:728:1: ( ( 'center' ) | ( 'left' ) | ( 'right' ) | ( 'bottom' ) | ( 'top' ) )
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
                    // InternalCinEditor.g:729:2: ( 'center' )
                    {
                    // InternalCinEditor.g:729:2: ( 'center' )
                    // InternalCinEditor.g:730:3: 'center'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionCenterKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionCenterKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:735:2: ( 'left' )
                    {
                    // InternalCinEditor.g:735:2: ( 'left' )
                    // InternalCinEditor.g:736:3: 'left'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionLeftKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionLeftKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCinEditor.g:741:2: ( 'right' )
                    {
                    // InternalCinEditor.g:741:2: ( 'right' )
                    // InternalCinEditor.g:742:3: 'right'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionRightKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionRightKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCinEditor.g:747:2: ( 'bottom' )
                    {
                    // InternalCinEditor.g:747:2: ( 'bottom' )
                    // InternalCinEditor.g:748:3: 'bottom'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionBottomKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionBottomKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCinEditor.g:753:2: ( 'top' )
                    {
                    // InternalCinEditor.g:753:2: ( 'top' )
                    // InternalCinEditor.g:754:3: 'top'
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


    // $ANTLR start "rule__GraphicalElement__Alternatives"
    // InternalCinEditor.g:763:1: rule__GraphicalElement__Alternatives : ( ( ruleText ) | ( ruleVideo ) | ( rulePicture ) | ( ruleRectangle ) );
    public final void rule__GraphicalElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:767:1: ( ( ruleText ) | ( ruleVideo ) | ( rulePicture ) | ( ruleRectangle ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt5=1;
                }
                break;
            case 44:
                {
                alt5=2;
                }
                break;
            case 43:
                {
                alt5=3;
                }
                break;
            case 46:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCinEditor.g:768:2: ( ruleText )
                    {
                    // InternalCinEditor.g:768:2: ( ruleText )
                    // InternalCinEditor.g:769:3: ruleText
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
                    // InternalCinEditor.g:774:2: ( ruleVideo )
                    {
                    // InternalCinEditor.g:774:2: ( ruleVideo )
                    // InternalCinEditor.g:775:3: ruleVideo
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
                    // InternalCinEditor.g:780:2: ( rulePicture )
                    {
                    // InternalCinEditor.g:780:2: ( rulePicture )
                    // InternalCinEditor.g:781:3: rulePicture
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
                    // InternalCinEditor.g:786:2: ( ruleRectangle )
                    {
                    // InternalCinEditor.g:786:2: ( ruleRectangle )
                    // InternalCinEditor.g:787:3: ruleRectangle
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
    // InternalCinEditor.g:796:1: rule__EFloat__Alternatives_2_0 : ( ( '.' ) | ( ',' ) );
    public final void rule__EFloat__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:800:1: ( ( '.' ) | ( ',' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCinEditor.g:801:2: ( '.' )
                    {
                    // InternalCinEditor.g:801:2: ( '.' )
                    // InternalCinEditor.g:802:3: '.'
                    {
                     before(grammarAccess.getEFloatAccess().getFullStopKeyword_2_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getFullStopKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:807:2: ( ',' )
                    {
                    // InternalCinEditor.g:807:2: ( ',' )
                    // InternalCinEditor.g:808:3: ','
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
    // InternalCinEditor.g:817:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:821:1: ( ( 'true' ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCinEditor.g:822:2: ( 'true' )
                    {
                    // InternalCinEditor.g:822:2: ( 'true' )
                    // InternalCinEditor.g:823:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:828:2: ( 'false' )
                    {
                    // InternalCinEditor.g:828:2: ( 'false' )
                    // InternalCinEditor.g:829:3: 'false'
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
    // InternalCinEditor.g:838:1: rule__MARGIN_NAME__Alternatives : ( ( ( 'bottom' ) ) | ( ( 'left' ) ) | ( ( 'right' ) ) | ( ( 'top' ) ) );
    public final void rule__MARGIN_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:842:1: ( ( ( 'bottom' ) ) | ( ( 'left' ) ) | ( ( 'right' ) ) | ( ( 'top' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 15:
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
                    // InternalCinEditor.g:843:2: ( ( 'bottom' ) )
                    {
                    // InternalCinEditor.g:843:2: ( ( 'bottom' ) )
                    // InternalCinEditor.g:844:3: ( 'bottom' )
                    {
                     before(grammarAccess.getMARGIN_NAMEAccess().getBOTTOMEnumLiteralDeclaration_0()); 
                    // InternalCinEditor.g:845:3: ( 'bottom' )
                    // InternalCinEditor.g:845:4: 'bottom'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMARGIN_NAMEAccess().getBOTTOMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:849:2: ( ( 'left' ) )
                    {
                    // InternalCinEditor.g:849:2: ( ( 'left' ) )
                    // InternalCinEditor.g:850:3: ( 'left' )
                    {
                     before(grammarAccess.getMARGIN_NAMEAccess().getLEFTEnumLiteralDeclaration_1()); 
                    // InternalCinEditor.g:851:3: ( 'left' )
                    // InternalCinEditor.g:851:4: 'left'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMARGIN_NAMEAccess().getLEFTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCinEditor.g:855:2: ( ( 'right' ) )
                    {
                    // InternalCinEditor.g:855:2: ( ( 'right' ) )
                    // InternalCinEditor.g:856:3: ( 'right' )
                    {
                     before(grammarAccess.getMARGIN_NAMEAccess().getRIGHTEnumLiteralDeclaration_2()); 
                    // InternalCinEditor.g:857:3: ( 'right' )
                    // InternalCinEditor.g:857:4: 'right'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMARGIN_NAMEAccess().getRIGHTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCinEditor.g:861:2: ( ( 'top' ) )
                    {
                    // InternalCinEditor.g:861:2: ( ( 'top' ) )
                    // InternalCinEditor.g:862:3: ( 'top' )
                    {
                     before(grammarAccess.getMARGIN_NAMEAccess().getTOPEnumLiteralDeclaration_3()); 
                    // InternalCinEditor.g:863:3: ( 'top' )
                    // InternalCinEditor.g:863:4: 'top'
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
    // InternalCinEditor.g:871:1: rule__Movie__Group__0 : rule__Movie__Group__0__Impl rule__Movie__Group__1 ;
    public final void rule__Movie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:875:1: ( rule__Movie__Group__0__Impl rule__Movie__Group__1 )
            // InternalCinEditor.g:876:2: rule__Movie__Group__0__Impl rule__Movie__Group__1
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
    // InternalCinEditor.g:883:1: rule__Movie__Group__0__Impl : ( 'Movie' ) ;
    public final void rule__Movie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:887:1: ( ( 'Movie' ) )
            // InternalCinEditor.g:888:1: ( 'Movie' )
            {
            // InternalCinEditor.g:888:1: ( 'Movie' )
            // InternalCinEditor.g:889:2: 'Movie'
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
    // InternalCinEditor.g:898:1: rule__Movie__Group__1 : rule__Movie__Group__1__Impl rule__Movie__Group__2 ;
    public final void rule__Movie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:902:1: ( rule__Movie__Group__1__Impl rule__Movie__Group__2 )
            // InternalCinEditor.g:903:2: rule__Movie__Group__1__Impl rule__Movie__Group__2
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
    // InternalCinEditor.g:910:1: rule__Movie__Group__1__Impl : ( ( rule__Movie__NameAssignment_1 ) ) ;
    public final void rule__Movie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:914:1: ( ( ( rule__Movie__NameAssignment_1 ) ) )
            // InternalCinEditor.g:915:1: ( ( rule__Movie__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:915:1: ( ( rule__Movie__NameAssignment_1 ) )
            // InternalCinEditor.g:916:2: ( rule__Movie__NameAssignment_1 )
            {
             before(grammarAccess.getMovieAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:917:2: ( rule__Movie__NameAssignment_1 )
            // InternalCinEditor.g:917:3: rule__Movie__NameAssignment_1
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
    // InternalCinEditor.g:925:1: rule__Movie__Group__2 : rule__Movie__Group__2__Impl rule__Movie__Group__3 ;
    public final void rule__Movie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:929:1: ( rule__Movie__Group__2__Impl rule__Movie__Group__3 )
            // InternalCinEditor.g:930:2: rule__Movie__Group__2__Impl rule__Movie__Group__3
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
    // InternalCinEditor.g:937:1: rule__Movie__Group__2__Impl : ( ( rule__Movie__DimensionAssignment_2 ) ) ;
    public final void rule__Movie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:941:1: ( ( ( rule__Movie__DimensionAssignment_2 ) ) )
            // InternalCinEditor.g:942:1: ( ( rule__Movie__DimensionAssignment_2 ) )
            {
            // InternalCinEditor.g:942:1: ( ( rule__Movie__DimensionAssignment_2 ) )
            // InternalCinEditor.g:943:2: ( rule__Movie__DimensionAssignment_2 )
            {
             before(grammarAccess.getMovieAccess().getDimensionAssignment_2()); 
            // InternalCinEditor.g:944:2: ( rule__Movie__DimensionAssignment_2 )
            // InternalCinEditor.g:944:3: rule__Movie__DimensionAssignment_2
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
    // InternalCinEditor.g:952:1: rule__Movie__Group__3 : rule__Movie__Group__3__Impl rule__Movie__Group__4 ;
    public final void rule__Movie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:956:1: ( rule__Movie__Group__3__Impl rule__Movie__Group__4 )
            // InternalCinEditor.g:957:2: rule__Movie__Group__3__Impl rule__Movie__Group__4
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
    // InternalCinEditor.g:964:1: rule__Movie__Group__3__Impl : ( ( rule__Movie__Group_3__0 )? ) ;
    public final void rule__Movie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:968:1: ( ( ( rule__Movie__Group_3__0 )? ) )
            // InternalCinEditor.g:969:1: ( ( rule__Movie__Group_3__0 )? )
            {
            // InternalCinEditor.g:969:1: ( ( rule__Movie__Group_3__0 )? )
            // InternalCinEditor.g:970:2: ( rule__Movie__Group_3__0 )?
            {
             before(grammarAccess.getMovieAccess().getGroup_3()); 
            // InternalCinEditor.g:971:2: ( rule__Movie__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCinEditor.g:971:3: rule__Movie__Group_3__0
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
    // InternalCinEditor.g:979:1: rule__Movie__Group__4 : rule__Movie__Group__4__Impl ;
    public final void rule__Movie__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:983:1: ( rule__Movie__Group__4__Impl )
            // InternalCinEditor.g:984:2: rule__Movie__Group__4__Impl
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
    // InternalCinEditor.g:990:1: rule__Movie__Group__4__Impl : ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) ) ;
    public final void rule__Movie__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:994:1: ( ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) ) )
            // InternalCinEditor.g:995:1: ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) )
            {
            // InternalCinEditor.g:995:1: ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) )
            // InternalCinEditor.g:996:2: ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* )
            {
            // InternalCinEditor.g:996:2: ( ( rule__Movie__LayersAssignment_4 ) )
            // InternalCinEditor.g:997:3: ( rule__Movie__LayersAssignment_4 )
            {
             before(grammarAccess.getMovieAccess().getLayersAssignment_4()); 
            // InternalCinEditor.g:998:3: ( rule__Movie__LayersAssignment_4 )
            // InternalCinEditor.g:998:4: rule__Movie__LayersAssignment_4
            {
            pushFollow(FOLLOW_6);
            rule__Movie__LayersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getLayersAssignment_4()); 

            }

            // InternalCinEditor.g:1001:2: ( ( rule__Movie__LayersAssignment_4 )* )
            // InternalCinEditor.g:1002:3: ( rule__Movie__LayersAssignment_4 )*
            {
             before(grammarAccess.getMovieAccess().getLayersAssignment_4()); 
            // InternalCinEditor.g:1003:3: ( rule__Movie__LayersAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCinEditor.g:1003:4: rule__Movie__LayersAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Movie__LayersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalCinEditor.g:1013:1: rule__Movie__Group_3__0 : rule__Movie__Group_3__0__Impl rule__Movie__Group_3__1 ;
    public final void rule__Movie__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1017:1: ( rule__Movie__Group_3__0__Impl rule__Movie__Group_3__1 )
            // InternalCinEditor.g:1018:2: rule__Movie__Group_3__0__Impl rule__Movie__Group_3__1
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
    // InternalCinEditor.g:1025:1: rule__Movie__Group_3__0__Impl : ( 'fps' ) ;
    public final void rule__Movie__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1029:1: ( ( 'fps' ) )
            // InternalCinEditor.g:1030:1: ( 'fps' )
            {
            // InternalCinEditor.g:1030:1: ( 'fps' )
            // InternalCinEditor.g:1031:2: 'fps'
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
    // InternalCinEditor.g:1040:1: rule__Movie__Group_3__1 : rule__Movie__Group_3__1__Impl ;
    public final void rule__Movie__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1044:1: ( rule__Movie__Group_3__1__Impl )
            // InternalCinEditor.g:1045:2: rule__Movie__Group_3__1__Impl
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
    // InternalCinEditor.g:1051:1: rule__Movie__Group_3__1__Impl : ( ( rule__Movie__FpsAssignment_3_1 ) ) ;
    public final void rule__Movie__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1055:1: ( ( ( rule__Movie__FpsAssignment_3_1 ) ) )
            // InternalCinEditor.g:1056:1: ( ( rule__Movie__FpsAssignment_3_1 ) )
            {
            // InternalCinEditor.g:1056:1: ( ( rule__Movie__FpsAssignment_3_1 ) )
            // InternalCinEditor.g:1057:2: ( rule__Movie__FpsAssignment_3_1 )
            {
             before(grammarAccess.getMovieAccess().getFpsAssignment_3_1()); 
            // InternalCinEditor.g:1058:2: ( rule__Movie__FpsAssignment_3_1 )
            // InternalCinEditor.g:1058:3: rule__Movie__FpsAssignment_3_1
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
    // InternalCinEditor.g:1067:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1071:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalCinEditor.g:1072:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
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
    // InternalCinEditor.g:1079:1: rule__Layer__Group__0__Impl : ( () ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1083:1: ( ( () ) )
            // InternalCinEditor.g:1084:1: ( () )
            {
            // InternalCinEditor.g:1084:1: ( () )
            // InternalCinEditor.g:1085:2: ()
            {
             before(grammarAccess.getLayerAccess().getLayerAction_0()); 
            // InternalCinEditor.g:1086:2: ()
            // InternalCinEditor.g:1086:3: 
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
    // InternalCinEditor.g:1094:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1098:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalCinEditor.g:1099:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
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
    // InternalCinEditor.g:1106:1: rule__Layer__Group__1__Impl : ( 'Layer' ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1110:1: ( ( 'Layer' ) )
            // InternalCinEditor.g:1111:1: ( 'Layer' )
            {
            // InternalCinEditor.g:1111:1: ( 'Layer' )
            // InternalCinEditor.g:1112:2: 'Layer'
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
    // InternalCinEditor.g:1121:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1125:1: ( rule__Layer__Group__2__Impl )
            // InternalCinEditor.g:1126:2: rule__Layer__Group__2__Impl
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
    // InternalCinEditor.g:1132:1: rule__Layer__Group__2__Impl : ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1136:1: ( ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) ) )
            // InternalCinEditor.g:1137:1: ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) )
            {
            // InternalCinEditor.g:1137:1: ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) )
            // InternalCinEditor.g:1138:2: ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* )
            {
            // InternalCinEditor.g:1138:2: ( ( rule__Layer__ElementsAssignment_2 ) )
            // InternalCinEditor.g:1139:3: ( rule__Layer__ElementsAssignment_2 )
            {
             before(grammarAccess.getLayerAccess().getElementsAssignment_2()); 
            // InternalCinEditor.g:1140:3: ( rule__Layer__ElementsAssignment_2 )
            // InternalCinEditor.g:1140:4: rule__Layer__ElementsAssignment_2
            {
            pushFollow(FOLLOW_9);
            rule__Layer__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getElementsAssignment_2()); 

            }

            // InternalCinEditor.g:1143:2: ( ( rule__Layer__ElementsAssignment_2 )* )
            // InternalCinEditor.g:1144:3: ( rule__Layer__ElementsAssignment_2 )*
            {
             before(grammarAccess.getLayerAccess().getElementsAssignment_2()); 
            // InternalCinEditor.g:1145:3: ( rule__Layer__ElementsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31||LA11_0==40||(LA11_0>=43 && LA11_0<=44)||(LA11_0>=46 && LA11_0<=47)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCinEditor.g:1145:4: rule__Layer__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Layer__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalCinEditor.g:1155:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1159:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalCinEditor.g:1160:2: rule__Position__Group__0__Impl rule__Position__Group__1
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
    // InternalCinEditor.g:1167:1: rule__Position__Group__0__Impl : ( 'position' ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1171:1: ( ( 'position' ) )
            // InternalCinEditor.g:1172:1: ( 'position' )
            {
            // InternalCinEditor.g:1172:1: ( 'position' )
            // InternalCinEditor.g:1173:2: 'position'
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
    // InternalCinEditor.g:1182:1: rule__Position__Group__1 : rule__Position__Group__1__Impl ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1186:1: ( rule__Position__Group__1__Impl )
            // InternalCinEditor.g:1187:2: rule__Position__Group__1__Impl
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
    // InternalCinEditor.g:1193:1: rule__Position__Group__1__Impl : ( ( rule__Position__Group_1__0 ) ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1197:1: ( ( ( rule__Position__Group_1__0 ) ) )
            // InternalCinEditor.g:1198:1: ( ( rule__Position__Group_1__0 ) )
            {
            // InternalCinEditor.g:1198:1: ( ( rule__Position__Group_1__0 ) )
            // InternalCinEditor.g:1199:2: ( rule__Position__Group_1__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup_1()); 
            // InternalCinEditor.g:1200:2: ( rule__Position__Group_1__0 )
            // InternalCinEditor.g:1200:3: rule__Position__Group_1__0
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
    // InternalCinEditor.g:1209:1: rule__Position__Group_1__0 : rule__Position__Group_1__0__Impl rule__Position__Group_1__1 ;
    public final void rule__Position__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1213:1: ( rule__Position__Group_1__0__Impl rule__Position__Group_1__1 )
            // InternalCinEditor.g:1214:2: rule__Position__Group_1__0__Impl rule__Position__Group_1__1
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
    // InternalCinEditor.g:1221:1: rule__Position__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Position__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1225:1: ( ( '(' ) )
            // InternalCinEditor.g:1226:1: ( '(' )
            {
            // InternalCinEditor.g:1226:1: ( '(' )
            // InternalCinEditor.g:1227:2: '('
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
    // InternalCinEditor.g:1236:1: rule__Position__Group_1__1 : rule__Position__Group_1__1__Impl rule__Position__Group_1__2 ;
    public final void rule__Position__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1240:1: ( rule__Position__Group_1__1__Impl rule__Position__Group_1__2 )
            // InternalCinEditor.g:1241:2: rule__Position__Group_1__1__Impl rule__Position__Group_1__2
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
    // InternalCinEditor.g:1248:1: rule__Position__Group_1__1__Impl : ( ( rule__Position__XAssignment_1_1 ) ) ;
    public final void rule__Position__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1252:1: ( ( ( rule__Position__XAssignment_1_1 ) ) )
            // InternalCinEditor.g:1253:1: ( ( rule__Position__XAssignment_1_1 ) )
            {
            // InternalCinEditor.g:1253:1: ( ( rule__Position__XAssignment_1_1 ) )
            // InternalCinEditor.g:1254:2: ( rule__Position__XAssignment_1_1 )
            {
             before(grammarAccess.getPositionAccess().getXAssignment_1_1()); 
            // InternalCinEditor.g:1255:2: ( rule__Position__XAssignment_1_1 )
            // InternalCinEditor.g:1255:3: rule__Position__XAssignment_1_1
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
    // InternalCinEditor.g:1263:1: rule__Position__Group_1__2 : rule__Position__Group_1__2__Impl rule__Position__Group_1__3 ;
    public final void rule__Position__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1267:1: ( rule__Position__Group_1__2__Impl rule__Position__Group_1__3 )
            // InternalCinEditor.g:1268:2: rule__Position__Group_1__2__Impl rule__Position__Group_1__3
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
    // InternalCinEditor.g:1275:1: rule__Position__Group_1__2__Impl : ( ',' ) ;
    public final void rule__Position__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1279:1: ( ( ',' ) )
            // InternalCinEditor.g:1280:1: ( ',' )
            {
            // InternalCinEditor.g:1280:1: ( ',' )
            // InternalCinEditor.g:1281:2: ','
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
    // InternalCinEditor.g:1290:1: rule__Position__Group_1__3 : rule__Position__Group_1__3__Impl rule__Position__Group_1__4 ;
    public final void rule__Position__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1294:1: ( rule__Position__Group_1__3__Impl rule__Position__Group_1__4 )
            // InternalCinEditor.g:1295:2: rule__Position__Group_1__3__Impl rule__Position__Group_1__4
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
    // InternalCinEditor.g:1302:1: rule__Position__Group_1__3__Impl : ( ( rule__Position__YAssignment_1_3 ) ) ;
    public final void rule__Position__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1306:1: ( ( ( rule__Position__YAssignment_1_3 ) ) )
            // InternalCinEditor.g:1307:1: ( ( rule__Position__YAssignment_1_3 ) )
            {
            // InternalCinEditor.g:1307:1: ( ( rule__Position__YAssignment_1_3 ) )
            // InternalCinEditor.g:1308:2: ( rule__Position__YAssignment_1_3 )
            {
             before(grammarAccess.getPositionAccess().getYAssignment_1_3()); 
            // InternalCinEditor.g:1309:2: ( rule__Position__YAssignment_1_3 )
            // InternalCinEditor.g:1309:3: rule__Position__YAssignment_1_3
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
    // InternalCinEditor.g:1317:1: rule__Position__Group_1__4 : rule__Position__Group_1__4__Impl ;
    public final void rule__Position__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1321:1: ( rule__Position__Group_1__4__Impl )
            // InternalCinEditor.g:1322:2: rule__Position__Group_1__4__Impl
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
    // InternalCinEditor.g:1328:1: rule__Position__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Position__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1332:1: ( ( ')' ) )
            // InternalCinEditor.g:1333:1: ( ')' )
            {
            // InternalCinEditor.g:1333:1: ( ')' )
            // InternalCinEditor.g:1334:2: ')'
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
    // InternalCinEditor.g:1344:1: rule__Dimension__Group__0 : rule__Dimension__Group__0__Impl rule__Dimension__Group__1 ;
    public final void rule__Dimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1348:1: ( rule__Dimension__Group__0__Impl rule__Dimension__Group__1 )
            // InternalCinEditor.g:1349:2: rule__Dimension__Group__0__Impl rule__Dimension__Group__1
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
    // InternalCinEditor.g:1356:1: rule__Dimension__Group__0__Impl : ( 'dimension' ) ;
    public final void rule__Dimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1360:1: ( ( 'dimension' ) )
            // InternalCinEditor.g:1361:1: ( 'dimension' )
            {
            // InternalCinEditor.g:1361:1: ( 'dimension' )
            // InternalCinEditor.g:1362:2: 'dimension'
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
    // InternalCinEditor.g:1371:1: rule__Dimension__Group__1 : rule__Dimension__Group__1__Impl rule__Dimension__Group__2 ;
    public final void rule__Dimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1375:1: ( rule__Dimension__Group__1__Impl rule__Dimension__Group__2 )
            // InternalCinEditor.g:1376:2: rule__Dimension__Group__1__Impl rule__Dimension__Group__2
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
    // InternalCinEditor.g:1383:1: rule__Dimension__Group__1__Impl : ( ( rule__Dimension__WidthAssignment_1 ) ) ;
    public final void rule__Dimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1387:1: ( ( ( rule__Dimension__WidthAssignment_1 ) ) )
            // InternalCinEditor.g:1388:1: ( ( rule__Dimension__WidthAssignment_1 ) )
            {
            // InternalCinEditor.g:1388:1: ( ( rule__Dimension__WidthAssignment_1 ) )
            // InternalCinEditor.g:1389:2: ( rule__Dimension__WidthAssignment_1 )
            {
             before(grammarAccess.getDimensionAccess().getWidthAssignment_1()); 
            // InternalCinEditor.g:1390:2: ( rule__Dimension__WidthAssignment_1 )
            // InternalCinEditor.g:1390:3: rule__Dimension__WidthAssignment_1
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
    // InternalCinEditor.g:1398:1: rule__Dimension__Group__2 : rule__Dimension__Group__2__Impl rule__Dimension__Group__3 ;
    public final void rule__Dimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1402:1: ( rule__Dimension__Group__2__Impl rule__Dimension__Group__3 )
            // InternalCinEditor.g:1403:2: rule__Dimension__Group__2__Impl rule__Dimension__Group__3
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
    // InternalCinEditor.g:1410:1: rule__Dimension__Group__2__Impl : ( 'x' ) ;
    public final void rule__Dimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1414:1: ( ( 'x' ) )
            // InternalCinEditor.g:1415:1: ( 'x' )
            {
            // InternalCinEditor.g:1415:1: ( 'x' )
            // InternalCinEditor.g:1416:2: 'x'
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
    // InternalCinEditor.g:1425:1: rule__Dimension__Group__3 : rule__Dimension__Group__3__Impl ;
    public final void rule__Dimension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1429:1: ( rule__Dimension__Group__3__Impl )
            // InternalCinEditor.g:1430:2: rule__Dimension__Group__3__Impl
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
    // InternalCinEditor.g:1436:1: rule__Dimension__Group__3__Impl : ( ( rule__Dimension__HeightAssignment_3 ) ) ;
    public final void rule__Dimension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1440:1: ( ( ( rule__Dimension__HeightAssignment_3 ) ) )
            // InternalCinEditor.g:1441:1: ( ( rule__Dimension__HeightAssignment_3 ) )
            {
            // InternalCinEditor.g:1441:1: ( ( rule__Dimension__HeightAssignment_3 ) )
            // InternalCinEditor.g:1442:2: ( rule__Dimension__HeightAssignment_3 )
            {
             before(grammarAccess.getDimensionAccess().getHeightAssignment_3()); 
            // InternalCinEditor.g:1443:2: ( rule__Dimension__HeightAssignment_3 )
            // InternalCinEditor.g:1443:3: rule__Dimension__HeightAssignment_3
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
    // InternalCinEditor.g:1452:1: rule__HexadecimalColor__Group__0 : rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1 ;
    public final void rule__HexadecimalColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1456:1: ( rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1 )
            // InternalCinEditor.g:1457:2: rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1
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
    // InternalCinEditor.g:1464:1: rule__HexadecimalColor__Group__0__Impl : ( 'color' ) ;
    public final void rule__HexadecimalColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1468:1: ( ( 'color' ) )
            // InternalCinEditor.g:1469:1: ( 'color' )
            {
            // InternalCinEditor.g:1469:1: ( 'color' )
            // InternalCinEditor.g:1470:2: 'color'
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
    // InternalCinEditor.g:1479:1: rule__HexadecimalColor__Group__1 : rule__HexadecimalColor__Group__1__Impl ;
    public final void rule__HexadecimalColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1483:1: ( rule__HexadecimalColor__Group__1__Impl )
            // InternalCinEditor.g:1484:2: rule__HexadecimalColor__Group__1__Impl
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
    // InternalCinEditor.g:1490:1: rule__HexadecimalColor__Group__1__Impl : ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) ) ;
    public final void rule__HexadecimalColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1494:1: ( ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) ) )
            // InternalCinEditor.g:1495:1: ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) )
            {
            // InternalCinEditor.g:1495:1: ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) )
            // InternalCinEditor.g:1496:2: ( rule__HexadecimalColor__HexadecimalValueAssignment_1 )
            {
             before(grammarAccess.getHexadecimalColorAccess().getHexadecimalValueAssignment_1()); 
            // InternalCinEditor.g:1497:2: ( rule__HexadecimalColor__HexadecimalValueAssignment_1 )
            // InternalCinEditor.g:1497:3: rule__HexadecimalColor__HexadecimalValueAssignment_1
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


    // $ANTLR start "rule__Margin__Group__0"
    // InternalCinEditor.g:1506:1: rule__Margin__Group__0 : rule__Margin__Group__0__Impl rule__Margin__Group__1 ;
    public final void rule__Margin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1510:1: ( rule__Margin__Group__0__Impl rule__Margin__Group__1 )
            // InternalCinEditor.g:1511:2: rule__Margin__Group__0__Impl rule__Margin__Group__1
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
    // InternalCinEditor.g:1518:1: rule__Margin__Group__0__Impl : ( ( rule__Margin__TypeAssignment_0 ) ) ;
    public final void rule__Margin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1522:1: ( ( ( rule__Margin__TypeAssignment_0 ) ) )
            // InternalCinEditor.g:1523:1: ( ( rule__Margin__TypeAssignment_0 ) )
            {
            // InternalCinEditor.g:1523:1: ( ( rule__Margin__TypeAssignment_0 ) )
            // InternalCinEditor.g:1524:2: ( rule__Margin__TypeAssignment_0 )
            {
             before(grammarAccess.getMarginAccess().getTypeAssignment_0()); 
            // InternalCinEditor.g:1525:2: ( rule__Margin__TypeAssignment_0 )
            // InternalCinEditor.g:1525:3: rule__Margin__TypeAssignment_0
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
    // InternalCinEditor.g:1533:1: rule__Margin__Group__1 : rule__Margin__Group__1__Impl rule__Margin__Group__2 ;
    public final void rule__Margin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1537:1: ( rule__Margin__Group__1__Impl rule__Margin__Group__2 )
            // InternalCinEditor.g:1538:2: rule__Margin__Group__1__Impl rule__Margin__Group__2
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
    // InternalCinEditor.g:1545:1: rule__Margin__Group__1__Impl : ( '(' ) ;
    public final void rule__Margin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1549:1: ( ( '(' ) )
            // InternalCinEditor.g:1550:1: ( '(' )
            {
            // InternalCinEditor.g:1550:1: ( '(' )
            // InternalCinEditor.g:1551:2: '('
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
    // InternalCinEditor.g:1560:1: rule__Margin__Group__2 : rule__Margin__Group__2__Impl rule__Margin__Group__3 ;
    public final void rule__Margin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1564:1: ( rule__Margin__Group__2__Impl rule__Margin__Group__3 )
            // InternalCinEditor.g:1565:2: rule__Margin__Group__2__Impl rule__Margin__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalCinEditor.g:1572:1: rule__Margin__Group__2__Impl : ( ( rule__Margin__SizeAssignment_2 ) ) ;
    public final void rule__Margin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1576:1: ( ( ( rule__Margin__SizeAssignment_2 ) ) )
            // InternalCinEditor.g:1577:1: ( ( rule__Margin__SizeAssignment_2 ) )
            {
            // InternalCinEditor.g:1577:1: ( ( rule__Margin__SizeAssignment_2 ) )
            // InternalCinEditor.g:1578:2: ( rule__Margin__SizeAssignment_2 )
            {
             before(grammarAccess.getMarginAccess().getSizeAssignment_2()); 
            // InternalCinEditor.g:1579:2: ( rule__Margin__SizeAssignment_2 )
            // InternalCinEditor.g:1579:3: rule__Margin__SizeAssignment_2
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
    // InternalCinEditor.g:1587:1: rule__Margin__Group__3 : rule__Margin__Group__3__Impl rule__Margin__Group__4 ;
    public final void rule__Margin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1591:1: ( rule__Margin__Group__3__Impl rule__Margin__Group__4 )
            // InternalCinEditor.g:1592:2: rule__Margin__Group__3__Impl rule__Margin__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalCinEditor.g:1599:1: rule__Margin__Group__3__Impl : ( ( rule__Margin__MarginColorAssignment_3 )? ) ;
    public final void rule__Margin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1603:1: ( ( ( rule__Margin__MarginColorAssignment_3 )? ) )
            // InternalCinEditor.g:1604:1: ( ( rule__Margin__MarginColorAssignment_3 )? )
            {
            // InternalCinEditor.g:1604:1: ( ( rule__Margin__MarginColorAssignment_3 )? )
            // InternalCinEditor.g:1605:2: ( rule__Margin__MarginColorAssignment_3 )?
            {
             before(grammarAccess.getMarginAccess().getMarginColorAssignment_3()); 
            // InternalCinEditor.g:1606:2: ( rule__Margin__MarginColorAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCinEditor.g:1606:3: rule__Margin__MarginColorAssignment_3
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
    // InternalCinEditor.g:1614:1: rule__Margin__Group__4 : rule__Margin__Group__4__Impl rule__Margin__Group__5 ;
    public final void rule__Margin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1618:1: ( rule__Margin__Group__4__Impl rule__Margin__Group__5 )
            // InternalCinEditor.g:1619:2: rule__Margin__Group__4__Impl rule__Margin__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalCinEditor.g:1626:1: rule__Margin__Group__4__Impl : ( ( rule__Margin__Group_4__0 )? ) ;
    public final void rule__Margin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1630:1: ( ( ( rule__Margin__Group_4__0 )? ) )
            // InternalCinEditor.g:1631:1: ( ( rule__Margin__Group_4__0 )? )
            {
            // InternalCinEditor.g:1631:1: ( ( rule__Margin__Group_4__0 )? )
            // InternalCinEditor.g:1632:2: ( rule__Margin__Group_4__0 )?
            {
             before(grammarAccess.getMarginAccess().getGroup_4()); 
            // InternalCinEditor.g:1633:2: ( rule__Margin__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCinEditor.g:1633:3: rule__Margin__Group_4__0
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
    // InternalCinEditor.g:1641:1: rule__Margin__Group__5 : rule__Margin__Group__5__Impl ;
    public final void rule__Margin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1645:1: ( rule__Margin__Group__5__Impl )
            // InternalCinEditor.g:1646:2: rule__Margin__Group__5__Impl
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
    // InternalCinEditor.g:1652:1: rule__Margin__Group__5__Impl : ( ')' ) ;
    public final void rule__Margin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1656:1: ( ( ')' ) )
            // InternalCinEditor.g:1657:1: ( ')' )
            {
            // InternalCinEditor.g:1657:1: ( ')' )
            // InternalCinEditor.g:1658:2: ')'
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
    // InternalCinEditor.g:1668:1: rule__Margin__Group_4__0 : rule__Margin__Group_4__0__Impl rule__Margin__Group_4__1 ;
    public final void rule__Margin__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1672:1: ( rule__Margin__Group_4__0__Impl rule__Margin__Group_4__1 )
            // InternalCinEditor.g:1673:2: rule__Margin__Group_4__0__Impl rule__Margin__Group_4__1
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
    // InternalCinEditor.g:1680:1: rule__Margin__Group_4__0__Impl : ( 'opacity' ) ;
    public final void rule__Margin__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1684:1: ( ( 'opacity' ) )
            // InternalCinEditor.g:1685:1: ( 'opacity' )
            {
            // InternalCinEditor.g:1685:1: ( 'opacity' )
            // InternalCinEditor.g:1686:2: 'opacity'
            {
             before(grammarAccess.getMarginAccess().getOpacityKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCinEditor.g:1695:1: rule__Margin__Group_4__1 : rule__Margin__Group_4__1__Impl ;
    public final void rule__Margin__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1699:1: ( rule__Margin__Group_4__1__Impl )
            // InternalCinEditor.g:1700:2: rule__Margin__Group_4__1__Impl
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
    // InternalCinEditor.g:1706:1: rule__Margin__Group_4__1__Impl : ( ( rule__Margin__MarginColorOpacityAssignment_4_1 ) ) ;
    public final void rule__Margin__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1710:1: ( ( ( rule__Margin__MarginColorOpacityAssignment_4_1 ) ) )
            // InternalCinEditor.g:1711:1: ( ( rule__Margin__MarginColorOpacityAssignment_4_1 ) )
            {
            // InternalCinEditor.g:1711:1: ( ( rule__Margin__MarginColorOpacityAssignment_4_1 ) )
            // InternalCinEditor.g:1712:2: ( rule__Margin__MarginColorOpacityAssignment_4_1 )
            {
             before(grammarAccess.getMarginAccess().getMarginColorOpacityAssignment_4_1()); 
            // InternalCinEditor.g:1713:2: ( rule__Margin__MarginColorOpacityAssignment_4_1 )
            // InternalCinEditor.g:1713:3: rule__Margin__MarginColorOpacityAssignment_4_1
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
    // InternalCinEditor.g:1722:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1726:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalCinEditor.g:1727:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalCinEditor.g:1734:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1738:1: ( ( ( '-' )? ) )
            // InternalCinEditor.g:1739:1: ( ( '-' )? )
            {
            // InternalCinEditor.g:1739:1: ( ( '-' )? )
            // InternalCinEditor.g:1740:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalCinEditor.g:1741:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCinEditor.g:1741:3: '-'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalCinEditor.g:1749:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1753:1: ( rule__EInt__Group__1__Impl )
            // InternalCinEditor.g:1754:2: rule__EInt__Group__1__Impl
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
    // InternalCinEditor.g:1760:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1764:1: ( ( RULE_INT ) )
            // InternalCinEditor.g:1765:1: ( RULE_INT )
            {
            // InternalCinEditor.g:1765:1: ( RULE_INT )
            // InternalCinEditor.g:1766:2: RULE_INT
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
    // InternalCinEditor.g:1776:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1780:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalCinEditor.g:1781:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
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
    // InternalCinEditor.g:1788:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1792:1: ( ( ( '-' )? ) )
            // InternalCinEditor.g:1793:1: ( ( '-' )? )
            {
            // InternalCinEditor.g:1793:1: ( ( '-' )? )
            // InternalCinEditor.g:1794:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalCinEditor.g:1795:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCinEditor.g:1795:3: '-'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalCinEditor.g:1803:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1807:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalCinEditor.g:1808:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalCinEditor.g:1815:1: rule__EFloat__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1819:1: ( ( RULE_INT ) )
            // InternalCinEditor.g:1820:1: ( RULE_INT )
            {
            // InternalCinEditor.g:1820:1: ( RULE_INT )
            // InternalCinEditor.g:1821:2: RULE_INT
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
    // InternalCinEditor.g:1830:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1834:1: ( rule__EFloat__Group__2__Impl )
            // InternalCinEditor.g:1835:2: rule__EFloat__Group__2__Impl
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
    // InternalCinEditor.g:1841:1: rule__EFloat__Group__2__Impl : ( ( rule__EFloat__Group_2__0 )? ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1845:1: ( ( ( rule__EFloat__Group_2__0 )? ) )
            // InternalCinEditor.g:1846:1: ( ( rule__EFloat__Group_2__0 )? )
            {
            // InternalCinEditor.g:1846:1: ( ( rule__EFloat__Group_2__0 )? )
            // InternalCinEditor.g:1847:2: ( rule__EFloat__Group_2__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_2()); 
            // InternalCinEditor.g:1848:2: ( rule__EFloat__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=16 && LA16_0<=17)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCinEditor.g:1848:3: rule__EFloat__Group_2__0
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
    // InternalCinEditor.g:1857:1: rule__EFloat__Group_2__0 : rule__EFloat__Group_2__0__Impl rule__EFloat__Group_2__1 ;
    public final void rule__EFloat__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1861:1: ( rule__EFloat__Group_2__0__Impl rule__EFloat__Group_2__1 )
            // InternalCinEditor.g:1862:2: rule__EFloat__Group_2__0__Impl rule__EFloat__Group_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalCinEditor.g:1869:1: rule__EFloat__Group_2__0__Impl : ( ( rule__EFloat__Alternatives_2_0 ) ) ;
    public final void rule__EFloat__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1873:1: ( ( ( rule__EFloat__Alternatives_2_0 ) ) )
            // InternalCinEditor.g:1874:1: ( ( rule__EFloat__Alternatives_2_0 ) )
            {
            // InternalCinEditor.g:1874:1: ( ( rule__EFloat__Alternatives_2_0 ) )
            // InternalCinEditor.g:1875:2: ( rule__EFloat__Alternatives_2_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_2_0()); 
            // InternalCinEditor.g:1876:2: ( rule__EFloat__Alternatives_2_0 )
            // InternalCinEditor.g:1876:3: rule__EFloat__Alternatives_2_0
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
    // InternalCinEditor.g:1884:1: rule__EFloat__Group_2__1 : rule__EFloat__Group_2__1__Impl ;
    public final void rule__EFloat__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1888:1: ( rule__EFloat__Group_2__1__Impl )
            // InternalCinEditor.g:1889:2: rule__EFloat__Group_2__1__Impl
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
    // InternalCinEditor.g:1895:1: rule__EFloat__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1899:1: ( ( RULE_INT ) )
            // InternalCinEditor.g:1900:1: ( RULE_INT )
            {
            // InternalCinEditor.g:1900:1: ( RULE_INT )
            // InternalCinEditor.g:1901:2: RULE_INT
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
    // InternalCinEditor.g:1911:1: rule__AudioElement__Group__0 : rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1 ;
    public final void rule__AudioElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1915:1: ( rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1 )
            // InternalCinEditor.g:1916:2: rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1
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
    // InternalCinEditor.g:1923:1: rule__AudioElement__Group__0__Impl : ( 'Audio' ) ;
    public final void rule__AudioElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1927:1: ( ( 'Audio' ) )
            // InternalCinEditor.g:1928:1: ( 'Audio' )
            {
            // InternalCinEditor.g:1928:1: ( 'Audio' )
            // InternalCinEditor.g:1929:2: 'Audio'
            {
             before(grammarAccess.getAudioElementAccess().getAudioKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCinEditor.g:1938:1: rule__AudioElement__Group__1 : rule__AudioElement__Group__1__Impl rule__AudioElement__Group__2 ;
    public final void rule__AudioElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1942:1: ( rule__AudioElement__Group__1__Impl rule__AudioElement__Group__2 )
            // InternalCinEditor.g:1943:2: rule__AudioElement__Group__1__Impl rule__AudioElement__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:1950:1: rule__AudioElement__Group__1__Impl : ( ( rule__AudioElement__NameAssignment_1 ) ) ;
    public final void rule__AudioElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1954:1: ( ( ( rule__AudioElement__NameAssignment_1 ) ) )
            // InternalCinEditor.g:1955:1: ( ( rule__AudioElement__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:1955:1: ( ( rule__AudioElement__NameAssignment_1 ) )
            // InternalCinEditor.g:1956:2: ( rule__AudioElement__NameAssignment_1 )
            {
             before(grammarAccess.getAudioElementAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:1957:2: ( rule__AudioElement__NameAssignment_1 )
            // InternalCinEditor.g:1957:3: rule__AudioElement__NameAssignment_1
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
    // InternalCinEditor.g:1965:1: rule__AudioElement__Group__2 : rule__AudioElement__Group__2__Impl rule__AudioElement__Group__3 ;
    public final void rule__AudioElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1969:1: ( rule__AudioElement__Group__2__Impl rule__AudioElement__Group__3 )
            // InternalCinEditor.g:1970:2: rule__AudioElement__Group__2__Impl rule__AudioElement__Group__3
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
    // InternalCinEditor.g:1977:1: rule__AudioElement__Group__2__Impl : ( '=' ) ;
    public final void rule__AudioElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1981:1: ( ( '=' ) )
            // InternalCinEditor.g:1982:1: ( '=' )
            {
            // InternalCinEditor.g:1982:1: ( '=' )
            // InternalCinEditor.g:1983:2: '='
            {
             before(grammarAccess.getAudioElementAccess().getEqualsSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCinEditor.g:1992:1: rule__AudioElement__Group__3 : rule__AudioElement__Group__3__Impl rule__AudioElement__Group__4 ;
    public final void rule__AudioElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1996:1: ( rule__AudioElement__Group__3__Impl rule__AudioElement__Group__4 )
            // InternalCinEditor.g:1997:2: rule__AudioElement__Group__3__Impl rule__AudioElement__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:2004:1: rule__AudioElement__Group__3__Impl : ( ( rule__AudioElement__UrlAssignment_3 ) ) ;
    public final void rule__AudioElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2008:1: ( ( ( rule__AudioElement__UrlAssignment_3 ) ) )
            // InternalCinEditor.g:2009:1: ( ( rule__AudioElement__UrlAssignment_3 ) )
            {
            // InternalCinEditor.g:2009:1: ( ( rule__AudioElement__UrlAssignment_3 ) )
            // InternalCinEditor.g:2010:2: ( rule__AudioElement__UrlAssignment_3 )
            {
             before(grammarAccess.getAudioElementAccess().getUrlAssignment_3()); 
            // InternalCinEditor.g:2011:2: ( rule__AudioElement__UrlAssignment_3 )
            // InternalCinEditor.g:2011:3: rule__AudioElement__UrlAssignment_3
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
    // InternalCinEditor.g:2019:1: rule__AudioElement__Group__4 : rule__AudioElement__Group__4__Impl rule__AudioElement__Group__5 ;
    public final void rule__AudioElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2023:1: ( rule__AudioElement__Group__4__Impl rule__AudioElement__Group__5 )
            // InternalCinEditor.g:2024:2: rule__AudioElement__Group__4__Impl rule__AudioElement__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:2031:1: rule__AudioElement__Group__4__Impl : ( ( rule__AudioElement__Group_4__0 )? ) ;
    public final void rule__AudioElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2035:1: ( ( ( rule__AudioElement__Group_4__0 )? ) )
            // InternalCinEditor.g:2036:1: ( ( rule__AudioElement__Group_4__0 )? )
            {
            // InternalCinEditor.g:2036:1: ( ( rule__AudioElement__Group_4__0 )? )
            // InternalCinEditor.g:2037:2: ( rule__AudioElement__Group_4__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_4()); 
            // InternalCinEditor.g:2038:2: ( rule__AudioElement__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCinEditor.g:2038:3: rule__AudioElement__Group_4__0
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
    // InternalCinEditor.g:2046:1: rule__AudioElement__Group__5 : rule__AudioElement__Group__5__Impl rule__AudioElement__Group__6 ;
    public final void rule__AudioElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2050:1: ( rule__AudioElement__Group__5__Impl rule__AudioElement__Group__6 )
            // InternalCinEditor.g:2051:2: rule__AudioElement__Group__5__Impl rule__AudioElement__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:2058:1: rule__AudioElement__Group__5__Impl : ( ( rule__AudioElement__Group_5__0 )? ) ;
    public final void rule__AudioElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2062:1: ( ( ( rule__AudioElement__Group_5__0 )? ) )
            // InternalCinEditor.g:2063:1: ( ( rule__AudioElement__Group_5__0 )? )
            {
            // InternalCinEditor.g:2063:1: ( ( rule__AudioElement__Group_5__0 )? )
            // InternalCinEditor.g:2064:2: ( rule__AudioElement__Group_5__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_5()); 
            // InternalCinEditor.g:2065:2: ( rule__AudioElement__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCinEditor.g:2065:3: rule__AudioElement__Group_5__0
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
    // InternalCinEditor.g:2073:1: rule__AudioElement__Group__6 : rule__AudioElement__Group__6__Impl rule__AudioElement__Group__7 ;
    public final void rule__AudioElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2077:1: ( rule__AudioElement__Group__6__Impl rule__AudioElement__Group__7 )
            // InternalCinEditor.g:2078:2: rule__AudioElement__Group__6__Impl rule__AudioElement__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:2085:1: rule__AudioElement__Group__6__Impl : ( ( rule__AudioElement__Group_6__0 )? ) ;
    public final void rule__AudioElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2089:1: ( ( ( rule__AudioElement__Group_6__0 )? ) )
            // InternalCinEditor.g:2090:1: ( ( rule__AudioElement__Group_6__0 )? )
            {
            // InternalCinEditor.g:2090:1: ( ( rule__AudioElement__Group_6__0 )? )
            // InternalCinEditor.g:2091:2: ( rule__AudioElement__Group_6__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_6()); 
            // InternalCinEditor.g:2092:2: ( rule__AudioElement__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCinEditor.g:2092:3: rule__AudioElement__Group_6__0
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
    // InternalCinEditor.g:2100:1: rule__AudioElement__Group__7 : rule__AudioElement__Group__7__Impl rule__AudioElement__Group__8 ;
    public final void rule__AudioElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2104:1: ( rule__AudioElement__Group__7__Impl rule__AudioElement__Group__8 )
            // InternalCinEditor.g:2105:2: rule__AudioElement__Group__7__Impl rule__AudioElement__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:2112:1: rule__AudioElement__Group__7__Impl : ( ( rule__AudioElement__Group_7__0 )? ) ;
    public final void rule__AudioElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2116:1: ( ( ( rule__AudioElement__Group_7__0 )? ) )
            // InternalCinEditor.g:2117:1: ( ( rule__AudioElement__Group_7__0 )? )
            {
            // InternalCinEditor.g:2117:1: ( ( rule__AudioElement__Group_7__0 )? )
            // InternalCinEditor.g:2118:2: ( rule__AudioElement__Group_7__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_7()); 
            // InternalCinEditor.g:2119:2: ( rule__AudioElement__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCinEditor.g:2119:3: rule__AudioElement__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AudioElement__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioElementAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalCinEditor.g:2127:1: rule__AudioElement__Group__8 : rule__AudioElement__Group__8__Impl rule__AudioElement__Group__9 ;
    public final void rule__AudioElement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2131:1: ( rule__AudioElement__Group__8__Impl rule__AudioElement__Group__9 )
            // InternalCinEditor.g:2132:2: rule__AudioElement__Group__8__Impl rule__AudioElement__Group__9
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:2139:1: rule__AudioElement__Group__8__Impl : ( ( rule__AudioElement__Group_8__0 )? ) ;
    public final void rule__AudioElement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2143:1: ( ( ( rule__AudioElement__Group_8__0 )? ) )
            // InternalCinEditor.g:2144:1: ( ( rule__AudioElement__Group_8__0 )? )
            {
            // InternalCinEditor.g:2144:1: ( ( rule__AudioElement__Group_8__0 )? )
            // InternalCinEditor.g:2145:2: ( rule__AudioElement__Group_8__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_8()); 
            // InternalCinEditor.g:2146:2: ( rule__AudioElement__Group_8__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCinEditor.g:2146:3: rule__AudioElement__Group_8__0
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
    // InternalCinEditor.g:2154:1: rule__AudioElement__Group__9 : rule__AudioElement__Group__9__Impl rule__AudioElement__Group__10 ;
    public final void rule__AudioElement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2158:1: ( rule__AudioElement__Group__9__Impl rule__AudioElement__Group__10 )
            // InternalCinEditor.g:2159:2: rule__AudioElement__Group__9__Impl rule__AudioElement__Group__10
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:2166:1: rule__AudioElement__Group__9__Impl : ( ( rule__AudioElement__Group_9__0 )? ) ;
    public final void rule__AudioElement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2170:1: ( ( ( rule__AudioElement__Group_9__0 )? ) )
            // InternalCinEditor.g:2171:1: ( ( rule__AudioElement__Group_9__0 )? )
            {
            // InternalCinEditor.g:2171:1: ( ( rule__AudioElement__Group_9__0 )? )
            // InternalCinEditor.g:2172:2: ( rule__AudioElement__Group_9__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_9()); 
            // InternalCinEditor.g:2173:2: ( rule__AudioElement__Group_9__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCinEditor.g:2173:3: rule__AudioElement__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AudioElement__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioElementAccess().getGroup_9()); 

            }


            }

        }
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
    // InternalCinEditor.g:2181:1: rule__AudioElement__Group__10 : rule__AudioElement__Group__10__Impl rule__AudioElement__Group__11 ;
    public final void rule__AudioElement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2185:1: ( rule__AudioElement__Group__10__Impl rule__AudioElement__Group__11 )
            // InternalCinEditor.g:2186:2: rule__AudioElement__Group__10__Impl rule__AudioElement__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__AudioElement__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__11();

            state._fsp--;


            }

        }
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
    // InternalCinEditor.g:2193:1: rule__AudioElement__Group__10__Impl : ( 'on' ) ;
    public final void rule__AudioElement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2197:1: ( ( 'on' ) )
            // InternalCinEditor.g:2198:1: ( 'on' )
            {
            // InternalCinEditor.g:2198:1: ( 'on' )
            // InternalCinEditor.g:2199:2: 'on'
            {
             before(grammarAccess.getAudioElementAccess().getOnKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getOnKeyword_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__AudioElement__Group__11"
    // InternalCinEditor.g:2208:1: rule__AudioElement__Group__11 : rule__AudioElement__Group__11__Impl ;
    public final void rule__AudioElement__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2212:1: ( rule__AudioElement__Group__11__Impl )
            // InternalCinEditor.g:2213:2: rule__AudioElement__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__11"


    // $ANTLR start "rule__AudioElement__Group__11__Impl"
    // InternalCinEditor.g:2219:1: rule__AudioElement__Group__11__Impl : ( ( rule__AudioElement__ElementAssignment_11 ) ) ;
    public final void rule__AudioElement__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2223:1: ( ( ( rule__AudioElement__ElementAssignment_11 ) ) )
            // InternalCinEditor.g:2224:1: ( ( rule__AudioElement__ElementAssignment_11 ) )
            {
            // InternalCinEditor.g:2224:1: ( ( rule__AudioElement__ElementAssignment_11 ) )
            // InternalCinEditor.g:2225:2: ( rule__AudioElement__ElementAssignment_11 )
            {
             before(grammarAccess.getAudioElementAccess().getElementAssignment_11()); 
            // InternalCinEditor.g:2226:2: ( rule__AudioElement__ElementAssignment_11 )
            // InternalCinEditor.g:2226:3: rule__AudioElement__ElementAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__ElementAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getElementAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__11__Impl"


    // $ANTLR start "rule__AudioElement__Group_4__0"
    // InternalCinEditor.g:2235:1: rule__AudioElement__Group_4__0 : rule__AudioElement__Group_4__0__Impl rule__AudioElement__Group_4__1 ;
    public final void rule__AudioElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2239:1: ( rule__AudioElement__Group_4__0__Impl rule__AudioElement__Group_4__1 )
            // InternalCinEditor.g:2240:2: rule__AudioElement__Group_4__0__Impl rule__AudioElement__Group_4__1
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
    // InternalCinEditor.g:2247:1: rule__AudioElement__Group_4__0__Impl : ( 'volume' ) ;
    public final void rule__AudioElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2251:1: ( ( 'volume' ) )
            // InternalCinEditor.g:2252:1: ( 'volume' )
            {
            // InternalCinEditor.g:2252:1: ( 'volume' )
            // InternalCinEditor.g:2253:2: 'volume'
            {
             before(grammarAccess.getAudioElementAccess().getVolumeKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCinEditor.g:2262:1: rule__AudioElement__Group_4__1 : rule__AudioElement__Group_4__1__Impl ;
    public final void rule__AudioElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2266:1: ( rule__AudioElement__Group_4__1__Impl )
            // InternalCinEditor.g:2267:2: rule__AudioElement__Group_4__1__Impl
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
    // InternalCinEditor.g:2273:1: rule__AudioElement__Group_4__1__Impl : ( ( rule__AudioElement__VolumeAssignment_4_1 ) ) ;
    public final void rule__AudioElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2277:1: ( ( ( rule__AudioElement__VolumeAssignment_4_1 ) ) )
            // InternalCinEditor.g:2278:1: ( ( rule__AudioElement__VolumeAssignment_4_1 ) )
            {
            // InternalCinEditor.g:2278:1: ( ( rule__AudioElement__VolumeAssignment_4_1 ) )
            // InternalCinEditor.g:2279:2: ( rule__AudioElement__VolumeAssignment_4_1 )
            {
             before(grammarAccess.getAudioElementAccess().getVolumeAssignment_4_1()); 
            // InternalCinEditor.g:2280:2: ( rule__AudioElement__VolumeAssignment_4_1 )
            // InternalCinEditor.g:2280:3: rule__AudioElement__VolumeAssignment_4_1
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
    // InternalCinEditor.g:2289:1: rule__AudioElement__Group_5__0 : rule__AudioElement__Group_5__0__Impl rule__AudioElement__Group_5__1 ;
    public final void rule__AudioElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2293:1: ( rule__AudioElement__Group_5__0__Impl rule__AudioElement__Group_5__1 )
            // InternalCinEditor.g:2294:2: rule__AudioElement__Group_5__0__Impl rule__AudioElement__Group_5__1
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
    // InternalCinEditor.g:2301:1: rule__AudioElement__Group_5__0__Impl : ( 'fadeIn' ) ;
    public final void rule__AudioElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2305:1: ( ( 'fadeIn' ) )
            // InternalCinEditor.g:2306:1: ( 'fadeIn' )
            {
            // InternalCinEditor.g:2306:1: ( 'fadeIn' )
            // InternalCinEditor.g:2307:2: 'fadeIn'
            {
             before(grammarAccess.getAudioElementAccess().getFadeInKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCinEditor.g:2316:1: rule__AudioElement__Group_5__1 : rule__AudioElement__Group_5__1__Impl ;
    public final void rule__AudioElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2320:1: ( rule__AudioElement__Group_5__1__Impl )
            // InternalCinEditor.g:2321:2: rule__AudioElement__Group_5__1__Impl
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
    // InternalCinEditor.g:2327:1: rule__AudioElement__Group_5__1__Impl : ( ( rule__AudioElement__FadeInAssignment_5_1 ) ) ;
    public final void rule__AudioElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2331:1: ( ( ( rule__AudioElement__FadeInAssignment_5_1 ) ) )
            // InternalCinEditor.g:2332:1: ( ( rule__AudioElement__FadeInAssignment_5_1 ) )
            {
            // InternalCinEditor.g:2332:1: ( ( rule__AudioElement__FadeInAssignment_5_1 ) )
            // InternalCinEditor.g:2333:2: ( rule__AudioElement__FadeInAssignment_5_1 )
            {
             before(grammarAccess.getAudioElementAccess().getFadeInAssignment_5_1()); 
            // InternalCinEditor.g:2334:2: ( rule__AudioElement__FadeInAssignment_5_1 )
            // InternalCinEditor.g:2334:3: rule__AudioElement__FadeInAssignment_5_1
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
    // InternalCinEditor.g:2343:1: rule__AudioElement__Group_6__0 : rule__AudioElement__Group_6__0__Impl rule__AudioElement__Group_6__1 ;
    public final void rule__AudioElement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2347:1: ( rule__AudioElement__Group_6__0__Impl rule__AudioElement__Group_6__1 )
            // InternalCinEditor.g:2348:2: rule__AudioElement__Group_6__0__Impl rule__AudioElement__Group_6__1
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
    // InternalCinEditor.g:2355:1: rule__AudioElement__Group_6__0__Impl : ( 'fadeOut' ) ;
    public final void rule__AudioElement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2359:1: ( ( 'fadeOut' ) )
            // InternalCinEditor.g:2360:1: ( 'fadeOut' )
            {
            // InternalCinEditor.g:2360:1: ( 'fadeOut' )
            // InternalCinEditor.g:2361:2: 'fadeOut'
            {
             before(grammarAccess.getAudioElementAccess().getFadeOutKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCinEditor.g:2370:1: rule__AudioElement__Group_6__1 : rule__AudioElement__Group_6__1__Impl ;
    public final void rule__AudioElement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2374:1: ( rule__AudioElement__Group_6__1__Impl )
            // InternalCinEditor.g:2375:2: rule__AudioElement__Group_6__1__Impl
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
    // InternalCinEditor.g:2381:1: rule__AudioElement__Group_6__1__Impl : ( ( rule__AudioElement__FadeOutAssignment_6_1 ) ) ;
    public final void rule__AudioElement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2385:1: ( ( ( rule__AudioElement__FadeOutAssignment_6_1 ) ) )
            // InternalCinEditor.g:2386:1: ( ( rule__AudioElement__FadeOutAssignment_6_1 ) )
            {
            // InternalCinEditor.g:2386:1: ( ( rule__AudioElement__FadeOutAssignment_6_1 ) )
            // InternalCinEditor.g:2387:2: ( rule__AudioElement__FadeOutAssignment_6_1 )
            {
             before(grammarAccess.getAudioElementAccess().getFadeOutAssignment_6_1()); 
            // InternalCinEditor.g:2388:2: ( rule__AudioElement__FadeOutAssignment_6_1 )
            // InternalCinEditor.g:2388:3: rule__AudioElement__FadeOutAssignment_6_1
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


    // $ANTLR start "rule__AudioElement__Group_7__0"
    // InternalCinEditor.g:2397:1: rule__AudioElement__Group_7__0 : rule__AudioElement__Group_7__0__Impl rule__AudioElement__Group_7__1 ;
    public final void rule__AudioElement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2401:1: ( rule__AudioElement__Group_7__0__Impl rule__AudioElement__Group_7__1 )
            // InternalCinEditor.g:2402:2: rule__AudioElement__Group_7__0__Impl rule__AudioElement__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__AudioElement__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_7__0"


    // $ANTLR start "rule__AudioElement__Group_7__0__Impl"
    // InternalCinEditor.g:2409:1: rule__AudioElement__Group_7__0__Impl : ( 'startAt' ) ;
    public final void rule__AudioElement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2413:1: ( ( 'startAt' ) )
            // InternalCinEditor.g:2414:1: ( 'startAt' )
            {
            // InternalCinEditor.g:2414:1: ( 'startAt' )
            // InternalCinEditor.g:2415:2: 'startAt'
            {
             before(grammarAccess.getAudioElementAccess().getStartAtKeyword_7_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getStartAtKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_7__0__Impl"


    // $ANTLR start "rule__AudioElement__Group_7__1"
    // InternalCinEditor.g:2424:1: rule__AudioElement__Group_7__1 : rule__AudioElement__Group_7__1__Impl ;
    public final void rule__AudioElement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2428:1: ( rule__AudioElement__Group_7__1__Impl )
            // InternalCinEditor.g:2429:2: rule__AudioElement__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_7__1"


    // $ANTLR start "rule__AudioElement__Group_7__1__Impl"
    // InternalCinEditor.g:2435:1: rule__AudioElement__Group_7__1__Impl : ( ( rule__AudioElement__BeginTimeAssignment_7_1 ) ) ;
    public final void rule__AudioElement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2439:1: ( ( ( rule__AudioElement__BeginTimeAssignment_7_1 ) ) )
            // InternalCinEditor.g:2440:1: ( ( rule__AudioElement__BeginTimeAssignment_7_1 ) )
            {
            // InternalCinEditor.g:2440:1: ( ( rule__AudioElement__BeginTimeAssignment_7_1 ) )
            // InternalCinEditor.g:2441:2: ( rule__AudioElement__BeginTimeAssignment_7_1 )
            {
             before(grammarAccess.getAudioElementAccess().getBeginTimeAssignment_7_1()); 
            // InternalCinEditor.g:2442:2: ( rule__AudioElement__BeginTimeAssignment_7_1 )
            // InternalCinEditor.g:2442:3: rule__AudioElement__BeginTimeAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__BeginTimeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getBeginTimeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_7__1__Impl"


    // $ANTLR start "rule__AudioElement__Group_8__0"
    // InternalCinEditor.g:2451:1: rule__AudioElement__Group_8__0 : rule__AudioElement__Group_8__0__Impl rule__AudioElement__Group_8__1 ;
    public final void rule__AudioElement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2455:1: ( rule__AudioElement__Group_8__0__Impl rule__AudioElement__Group_8__1 )
            // InternalCinEditor.g:2456:2: rule__AudioElement__Group_8__0__Impl rule__AudioElement__Group_8__1
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
    // InternalCinEditor.g:2463:1: rule__AudioElement__Group_8__0__Impl : ( 'cropAt' ) ;
    public final void rule__AudioElement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2467:1: ( ( 'cropAt' ) )
            // InternalCinEditor.g:2468:1: ( 'cropAt' )
            {
            // InternalCinEditor.g:2468:1: ( 'cropAt' )
            // InternalCinEditor.g:2469:2: 'cropAt'
            {
             before(grammarAccess.getAudioElementAccess().getCropAtKeyword_8_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCinEditor.g:2478:1: rule__AudioElement__Group_8__1 : rule__AudioElement__Group_8__1__Impl ;
    public final void rule__AudioElement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2482:1: ( rule__AudioElement__Group_8__1__Impl )
            // InternalCinEditor.g:2483:2: rule__AudioElement__Group_8__1__Impl
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
    // InternalCinEditor.g:2489:1: rule__AudioElement__Group_8__1__Impl : ( ( rule__AudioElement__BeginCropTimeAssignment_8_1 ) ) ;
    public final void rule__AudioElement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2493:1: ( ( ( rule__AudioElement__BeginCropTimeAssignment_8_1 ) ) )
            // InternalCinEditor.g:2494:1: ( ( rule__AudioElement__BeginCropTimeAssignment_8_1 ) )
            {
            // InternalCinEditor.g:2494:1: ( ( rule__AudioElement__BeginCropTimeAssignment_8_1 ) )
            // InternalCinEditor.g:2495:2: ( rule__AudioElement__BeginCropTimeAssignment_8_1 )
            {
             before(grammarAccess.getAudioElementAccess().getBeginCropTimeAssignment_8_1()); 
            // InternalCinEditor.g:2496:2: ( rule__AudioElement__BeginCropTimeAssignment_8_1 )
            // InternalCinEditor.g:2496:3: rule__AudioElement__BeginCropTimeAssignment_8_1
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


    // $ANTLR start "rule__AudioElement__Group_9__0"
    // InternalCinEditor.g:2505:1: rule__AudioElement__Group_9__0 : rule__AudioElement__Group_9__0__Impl rule__AudioElement__Group_9__1 ;
    public final void rule__AudioElement__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2509:1: ( rule__AudioElement__Group_9__0__Impl rule__AudioElement__Group_9__1 )
            // InternalCinEditor.g:2510:2: rule__AudioElement__Group_9__0__Impl rule__AudioElement__Group_9__1
            {
            pushFollow(FOLLOW_7);
            rule__AudioElement__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_9__0"


    // $ANTLR start "rule__AudioElement__Group_9__0__Impl"
    // InternalCinEditor.g:2517:1: rule__AudioElement__Group_9__0__Impl : ( 'during' ) ;
    public final void rule__AudioElement__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2521:1: ( ( 'during' ) )
            // InternalCinEditor.g:2522:1: ( 'during' )
            {
            // InternalCinEditor.g:2522:1: ( 'during' )
            // InternalCinEditor.g:2523:2: 'during'
            {
             before(grammarAccess.getAudioElementAccess().getDuringKeyword_9_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getDuringKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_9__0__Impl"


    // $ANTLR start "rule__AudioElement__Group_9__1"
    // InternalCinEditor.g:2532:1: rule__AudioElement__Group_9__1 : rule__AudioElement__Group_9__1__Impl ;
    public final void rule__AudioElement__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2536:1: ( rule__AudioElement__Group_9__1__Impl )
            // InternalCinEditor.g:2537:2: rule__AudioElement__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_9__1"


    // $ANTLR start "rule__AudioElement__Group_9__1__Impl"
    // InternalCinEditor.g:2543:1: rule__AudioElement__Group_9__1__Impl : ( ( rule__AudioElement__DurationAssignment_9_1 ) ) ;
    public final void rule__AudioElement__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2547:1: ( ( ( rule__AudioElement__DurationAssignment_9_1 ) ) )
            // InternalCinEditor.g:2548:1: ( ( rule__AudioElement__DurationAssignment_9_1 ) )
            {
            // InternalCinEditor.g:2548:1: ( ( rule__AudioElement__DurationAssignment_9_1 ) )
            // InternalCinEditor.g:2549:2: ( rule__AudioElement__DurationAssignment_9_1 )
            {
             before(grammarAccess.getAudioElementAccess().getDurationAssignment_9_1()); 
            // InternalCinEditor.g:2550:2: ( rule__AudioElement__DurationAssignment_9_1 )
            // InternalCinEditor.g:2550:3: rule__AudioElement__DurationAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__DurationAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getDurationAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group_9__1__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalCinEditor.g:2559:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2563:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalCinEditor.g:2564:2: rule__Text__Group__0__Impl rule__Text__Group__1
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
    // InternalCinEditor.g:2571:1: rule__Text__Group__0__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2575:1: ( ( 'Text' ) )
            // InternalCinEditor.g:2576:1: ( 'Text' )
            {
            // InternalCinEditor.g:2576:1: ( 'Text' )
            // InternalCinEditor.g:2577:2: 'Text'
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
    // InternalCinEditor.g:2586:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2590:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalCinEditor.g:2591:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:2598:1: rule__Text__Group__1__Impl : ( ( rule__Text__NameAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2602:1: ( ( ( rule__Text__NameAssignment_1 ) ) )
            // InternalCinEditor.g:2603:1: ( ( rule__Text__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:2603:1: ( ( rule__Text__NameAssignment_1 ) )
            // InternalCinEditor.g:2604:2: ( rule__Text__NameAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:2605:2: ( rule__Text__NameAssignment_1 )
            // InternalCinEditor.g:2605:3: rule__Text__NameAssignment_1
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
    // InternalCinEditor.g:2613:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2617:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalCinEditor.g:2618:2: rule__Text__Group__2__Impl rule__Text__Group__3
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
    // InternalCinEditor.g:2625:1: rule__Text__Group__2__Impl : ( '=' ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2629:1: ( ( '=' ) )
            // InternalCinEditor.g:2630:1: ( '=' )
            {
            // InternalCinEditor.g:2630:1: ( '=' )
            // InternalCinEditor.g:2631:2: '='
            {
             before(grammarAccess.getTextAccess().getEqualsSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCinEditor.g:2640:1: rule__Text__Group__3 : rule__Text__Group__3__Impl rule__Text__Group__4 ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2644:1: ( rule__Text__Group__3__Impl rule__Text__Group__4 )
            // InternalCinEditor.g:2645:2: rule__Text__Group__3__Impl rule__Text__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:2652:1: rule__Text__Group__3__Impl : ( ( rule__Text__TextAssignment_3 ) ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2656:1: ( ( ( rule__Text__TextAssignment_3 ) ) )
            // InternalCinEditor.g:2657:1: ( ( rule__Text__TextAssignment_3 ) )
            {
            // InternalCinEditor.g:2657:1: ( ( rule__Text__TextAssignment_3 ) )
            // InternalCinEditor.g:2658:2: ( rule__Text__TextAssignment_3 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_3()); 
            // InternalCinEditor.g:2659:2: ( rule__Text__TextAssignment_3 )
            // InternalCinEditor.g:2659:3: rule__Text__TextAssignment_3
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
    // InternalCinEditor.g:2667:1: rule__Text__Group__4 : rule__Text__Group__4__Impl rule__Text__Group__5 ;
    public final void rule__Text__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2671:1: ( rule__Text__Group__4__Impl rule__Text__Group__5 )
            // InternalCinEditor.g:2672:2: rule__Text__Group__4__Impl rule__Text__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:2679:1: rule__Text__Group__4__Impl : ( ( rule__Text__Group_4__0 )? ) ;
    public final void rule__Text__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2683:1: ( ( ( rule__Text__Group_4__0 )? ) )
            // InternalCinEditor.g:2684:1: ( ( rule__Text__Group_4__0 )? )
            {
            // InternalCinEditor.g:2684:1: ( ( rule__Text__Group_4__0 )? )
            // InternalCinEditor.g:2685:2: ( rule__Text__Group_4__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_4()); 
            // InternalCinEditor.g:2686:2: ( rule__Text__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCinEditor.g:2686:3: rule__Text__Group_4__0
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
    // InternalCinEditor.g:2694:1: rule__Text__Group__5 : rule__Text__Group__5__Impl rule__Text__Group__6 ;
    public final void rule__Text__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2698:1: ( rule__Text__Group__5__Impl rule__Text__Group__6 )
            // InternalCinEditor.g:2699:2: rule__Text__Group__5__Impl rule__Text__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:2706:1: rule__Text__Group__5__Impl : ( ( rule__Text__PositionAssignment_5 )? ) ;
    public final void rule__Text__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2710:1: ( ( ( rule__Text__PositionAssignment_5 )? ) )
            // InternalCinEditor.g:2711:1: ( ( rule__Text__PositionAssignment_5 )? )
            {
            // InternalCinEditor.g:2711:1: ( ( rule__Text__PositionAssignment_5 )? )
            // InternalCinEditor.g:2712:2: ( rule__Text__PositionAssignment_5 )?
            {
             before(grammarAccess.getTextAccess().getPositionAssignment_5()); 
            // InternalCinEditor.g:2713:2: ( rule__Text__PositionAssignment_5 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCinEditor.g:2713:3: rule__Text__PositionAssignment_5
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
    // InternalCinEditor.g:2721:1: rule__Text__Group__6 : rule__Text__Group__6__Impl rule__Text__Group__7 ;
    public final void rule__Text__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2725:1: ( rule__Text__Group__6__Impl rule__Text__Group__7 )
            // InternalCinEditor.g:2726:2: rule__Text__Group__6__Impl rule__Text__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:2733:1: rule__Text__Group__6__Impl : ( ( rule__Text__Group_6__0 )? ) ;
    public final void rule__Text__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2737:1: ( ( ( rule__Text__Group_6__0 )? ) )
            // InternalCinEditor.g:2738:1: ( ( rule__Text__Group_6__0 )? )
            {
            // InternalCinEditor.g:2738:1: ( ( rule__Text__Group_6__0 )? )
            // InternalCinEditor.g:2739:2: ( rule__Text__Group_6__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_6()); 
            // InternalCinEditor.g:2740:2: ( rule__Text__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCinEditor.g:2740:3: rule__Text__Group_6__0
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
    // InternalCinEditor.g:2748:1: rule__Text__Group__7 : rule__Text__Group__7__Impl rule__Text__Group__8 ;
    public final void rule__Text__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2752:1: ( rule__Text__Group__7__Impl rule__Text__Group__8 )
            // InternalCinEditor.g:2753:2: rule__Text__Group__7__Impl rule__Text__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:2760:1: rule__Text__Group__7__Impl : ( ( rule__Text__Group_7__0 )? ) ;
    public final void rule__Text__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2764:1: ( ( ( rule__Text__Group_7__0 )? ) )
            // InternalCinEditor.g:2765:1: ( ( rule__Text__Group_7__0 )? )
            {
            // InternalCinEditor.g:2765:1: ( ( rule__Text__Group_7__0 )? )
            // InternalCinEditor.g:2766:2: ( rule__Text__Group_7__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_7()); 
            // InternalCinEditor.g:2767:2: ( rule__Text__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCinEditor.g:2767:3: rule__Text__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalCinEditor.g:2775:1: rule__Text__Group__8 : rule__Text__Group__8__Impl rule__Text__Group__9 ;
    public final void rule__Text__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2779:1: ( rule__Text__Group__8__Impl rule__Text__Group__9 )
            // InternalCinEditor.g:2780:2: rule__Text__Group__8__Impl rule__Text__Group__9
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:2787:1: rule__Text__Group__8__Impl : ( ( rule__Text__Group_8__0 )? ) ;
    public final void rule__Text__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2791:1: ( ( ( rule__Text__Group_8__0 )? ) )
            // InternalCinEditor.g:2792:1: ( ( rule__Text__Group_8__0 )? )
            {
            // InternalCinEditor.g:2792:1: ( ( rule__Text__Group_8__0 )? )
            // InternalCinEditor.g:2793:2: ( rule__Text__Group_8__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_8()); 
            // InternalCinEditor.g:2794:2: ( rule__Text__Group_8__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCinEditor.g:2794:3: rule__Text__Group_8__0
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
    // InternalCinEditor.g:2802:1: rule__Text__Group__9 : rule__Text__Group__9__Impl ;
    public final void rule__Text__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2806:1: ( rule__Text__Group__9__Impl )
            // InternalCinEditor.g:2807:2: rule__Text__Group__9__Impl
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
    // InternalCinEditor.g:2813:1: rule__Text__Group__9__Impl : ( ( rule__Text__ColorAssignment_9 ) ) ;
    public final void rule__Text__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2817:1: ( ( ( rule__Text__ColorAssignment_9 ) ) )
            // InternalCinEditor.g:2818:1: ( ( rule__Text__ColorAssignment_9 ) )
            {
            // InternalCinEditor.g:2818:1: ( ( rule__Text__ColorAssignment_9 ) )
            // InternalCinEditor.g:2819:2: ( rule__Text__ColorAssignment_9 )
            {
             before(grammarAccess.getTextAccess().getColorAssignment_9()); 
            // InternalCinEditor.g:2820:2: ( rule__Text__ColorAssignment_9 )
            // InternalCinEditor.g:2820:3: rule__Text__ColorAssignment_9
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
    // InternalCinEditor.g:2829:1: rule__Text__Group_4__0 : rule__Text__Group_4__0__Impl rule__Text__Group_4__1 ;
    public final void rule__Text__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2833:1: ( rule__Text__Group_4__0__Impl rule__Text__Group_4__1 )
            // InternalCinEditor.g:2834:2: rule__Text__Group_4__0__Impl rule__Text__Group_4__1
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
    // InternalCinEditor.g:2841:1: rule__Text__Group_4__0__Impl : ( 'fontSize' ) ;
    public final void rule__Text__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2845:1: ( ( 'fontSize' ) )
            // InternalCinEditor.g:2846:1: ( 'fontSize' )
            {
            // InternalCinEditor.g:2846:1: ( 'fontSize' )
            // InternalCinEditor.g:2847:2: 'fontSize'
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
    // InternalCinEditor.g:2856:1: rule__Text__Group_4__1 : rule__Text__Group_4__1__Impl ;
    public final void rule__Text__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2860:1: ( rule__Text__Group_4__1__Impl )
            // InternalCinEditor.g:2861:2: rule__Text__Group_4__1__Impl
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
    // InternalCinEditor.g:2867:1: rule__Text__Group_4__1__Impl : ( ( rule__Text__FontSizeAssignment_4_1 ) ) ;
    public final void rule__Text__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2871:1: ( ( ( rule__Text__FontSizeAssignment_4_1 ) ) )
            // InternalCinEditor.g:2872:1: ( ( rule__Text__FontSizeAssignment_4_1 ) )
            {
            // InternalCinEditor.g:2872:1: ( ( rule__Text__FontSizeAssignment_4_1 ) )
            // InternalCinEditor.g:2873:2: ( rule__Text__FontSizeAssignment_4_1 )
            {
             before(grammarAccess.getTextAccess().getFontSizeAssignment_4_1()); 
            // InternalCinEditor.g:2874:2: ( rule__Text__FontSizeAssignment_4_1 )
            // InternalCinEditor.g:2874:3: rule__Text__FontSizeAssignment_4_1
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
    // InternalCinEditor.g:2883:1: rule__Text__Group_6__0 : rule__Text__Group_6__0__Impl rule__Text__Group_6__1 ;
    public final void rule__Text__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2887:1: ( rule__Text__Group_6__0__Impl rule__Text__Group_6__1 )
            // InternalCinEditor.g:2888:2: rule__Text__Group_6__0__Impl rule__Text__Group_6__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:2895:1: rule__Text__Group_6__0__Impl : ( 'margins(' ) ;
    public final void rule__Text__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2899:1: ( ( 'margins(' ) )
            // InternalCinEditor.g:2900:1: ( 'margins(' )
            {
            // InternalCinEditor.g:2900:1: ( 'margins(' )
            // InternalCinEditor.g:2901:2: 'margins('
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
    // InternalCinEditor.g:2910:1: rule__Text__Group_6__1 : rule__Text__Group_6__1__Impl rule__Text__Group_6__2 ;
    public final void rule__Text__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2914:1: ( rule__Text__Group_6__1__Impl rule__Text__Group_6__2 )
            // InternalCinEditor.g:2915:2: rule__Text__Group_6__1__Impl rule__Text__Group_6__2
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
    // InternalCinEditor.g:2922:1: rule__Text__Group_6__1__Impl : ( ( ( rule__Text__MarginsAssignment_6_1 ) ) ( ( rule__Text__MarginsAssignment_6_1 )* ) ) ;
    public final void rule__Text__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2926:1: ( ( ( ( rule__Text__MarginsAssignment_6_1 ) ) ( ( rule__Text__MarginsAssignment_6_1 )* ) ) )
            // InternalCinEditor.g:2927:1: ( ( ( rule__Text__MarginsAssignment_6_1 ) ) ( ( rule__Text__MarginsAssignment_6_1 )* ) )
            {
            // InternalCinEditor.g:2927:1: ( ( ( rule__Text__MarginsAssignment_6_1 ) ) ( ( rule__Text__MarginsAssignment_6_1 )* ) )
            // InternalCinEditor.g:2928:2: ( ( rule__Text__MarginsAssignment_6_1 ) ) ( ( rule__Text__MarginsAssignment_6_1 )* )
            {
            // InternalCinEditor.g:2928:2: ( ( rule__Text__MarginsAssignment_6_1 ) )
            // InternalCinEditor.g:2929:3: ( rule__Text__MarginsAssignment_6_1 )
            {
             before(grammarAccess.getTextAccess().getMarginsAssignment_6_1()); 
            // InternalCinEditor.g:2930:3: ( rule__Text__MarginsAssignment_6_1 )
            // InternalCinEditor.g:2930:4: rule__Text__MarginsAssignment_6_1
            {
            pushFollow(FOLLOW_23);
            rule__Text__MarginsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getMarginsAssignment_6_1()); 

            }

            // InternalCinEditor.g:2933:2: ( ( rule__Text__MarginsAssignment_6_1 )* )
            // InternalCinEditor.g:2934:3: ( rule__Text__MarginsAssignment_6_1 )*
            {
             before(grammarAccess.getTextAccess().getMarginsAssignment_6_1()); 
            // InternalCinEditor.g:2935:3: ( rule__Text__MarginsAssignment_6_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=12 && LA28_0<=15)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCinEditor.g:2935:4: rule__Text__MarginsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Text__MarginsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalCinEditor.g:2944:1: rule__Text__Group_6__2 : rule__Text__Group_6__2__Impl ;
    public final void rule__Text__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2948:1: ( rule__Text__Group_6__2__Impl )
            // InternalCinEditor.g:2949:2: rule__Text__Group_6__2__Impl
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
    // InternalCinEditor.g:2955:1: rule__Text__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Text__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2959:1: ( ( ')' ) )
            // InternalCinEditor.g:2960:1: ( ')' )
            {
            // InternalCinEditor.g:2960:1: ( ')' )
            // InternalCinEditor.g:2961:2: ')'
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


    // $ANTLR start "rule__Text__Group_7__0"
    // InternalCinEditor.g:2971:1: rule__Text__Group_7__0 : rule__Text__Group_7__0__Impl rule__Text__Group_7__1 ;
    public final void rule__Text__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2975:1: ( rule__Text__Group_7__0__Impl rule__Text__Group_7__1 )
            // InternalCinEditor.g:2976:2: rule__Text__Group_7__0__Impl rule__Text__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Text__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_7__0"


    // $ANTLR start "rule__Text__Group_7__0__Impl"
    // InternalCinEditor.g:2983:1: rule__Text__Group_7__0__Impl : ( 'startAt' ) ;
    public final void rule__Text__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2987:1: ( ( 'startAt' ) )
            // InternalCinEditor.g:2988:1: ( 'startAt' )
            {
            // InternalCinEditor.g:2988:1: ( 'startAt' )
            // InternalCinEditor.g:2989:2: 'startAt'
            {
             before(grammarAccess.getTextAccess().getStartAtKeyword_7_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getStartAtKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_7__0__Impl"


    // $ANTLR start "rule__Text__Group_7__1"
    // InternalCinEditor.g:2998:1: rule__Text__Group_7__1 : rule__Text__Group_7__1__Impl ;
    public final void rule__Text__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3002:1: ( rule__Text__Group_7__1__Impl )
            // InternalCinEditor.g:3003:2: rule__Text__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_7__1"


    // $ANTLR start "rule__Text__Group_7__1__Impl"
    // InternalCinEditor.g:3009:1: rule__Text__Group_7__1__Impl : ( ( rule__Text__BeginTimeAssignment_7_1 ) ) ;
    public final void rule__Text__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3013:1: ( ( ( rule__Text__BeginTimeAssignment_7_1 ) ) )
            // InternalCinEditor.g:3014:1: ( ( rule__Text__BeginTimeAssignment_7_1 ) )
            {
            // InternalCinEditor.g:3014:1: ( ( rule__Text__BeginTimeAssignment_7_1 ) )
            // InternalCinEditor.g:3015:2: ( rule__Text__BeginTimeAssignment_7_1 )
            {
             before(grammarAccess.getTextAccess().getBeginTimeAssignment_7_1()); 
            // InternalCinEditor.g:3016:2: ( rule__Text__BeginTimeAssignment_7_1 )
            // InternalCinEditor.g:3016:3: rule__Text__BeginTimeAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__BeginTimeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getBeginTimeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_7__1__Impl"


    // $ANTLR start "rule__Text__Group_8__0"
    // InternalCinEditor.g:3025:1: rule__Text__Group_8__0 : rule__Text__Group_8__0__Impl rule__Text__Group_8__1 ;
    public final void rule__Text__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3029:1: ( rule__Text__Group_8__0__Impl rule__Text__Group_8__1 )
            // InternalCinEditor.g:3030:2: rule__Text__Group_8__0__Impl rule__Text__Group_8__1
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
    // InternalCinEditor.g:3037:1: rule__Text__Group_8__0__Impl : ( 'during' ) ;
    public final void rule__Text__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3041:1: ( ( 'during' ) )
            // InternalCinEditor.g:3042:1: ( 'during' )
            {
            // InternalCinEditor.g:3042:1: ( 'during' )
            // InternalCinEditor.g:3043:2: 'during'
            {
             before(grammarAccess.getTextAccess().getDuringKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCinEditor.g:3052:1: rule__Text__Group_8__1 : rule__Text__Group_8__1__Impl ;
    public final void rule__Text__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3056:1: ( rule__Text__Group_8__1__Impl )
            // InternalCinEditor.g:3057:2: rule__Text__Group_8__1__Impl
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
    // InternalCinEditor.g:3063:1: rule__Text__Group_8__1__Impl : ( ( rule__Text__DurationAssignment_8_1 ) ) ;
    public final void rule__Text__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3067:1: ( ( ( rule__Text__DurationAssignment_8_1 ) ) )
            // InternalCinEditor.g:3068:1: ( ( rule__Text__DurationAssignment_8_1 ) )
            {
            // InternalCinEditor.g:3068:1: ( ( rule__Text__DurationAssignment_8_1 ) )
            // InternalCinEditor.g:3069:2: ( rule__Text__DurationAssignment_8_1 )
            {
             before(grammarAccess.getTextAccess().getDurationAssignment_8_1()); 
            // InternalCinEditor.g:3070:2: ( rule__Text__DurationAssignment_8_1 )
            // InternalCinEditor.g:3070:3: rule__Text__DurationAssignment_8_1
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
    // InternalCinEditor.g:3079:1: rule__Picture__Group__0 : rule__Picture__Group__0__Impl rule__Picture__Group__1 ;
    public final void rule__Picture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3083:1: ( rule__Picture__Group__0__Impl rule__Picture__Group__1 )
            // InternalCinEditor.g:3084:2: rule__Picture__Group__0__Impl rule__Picture__Group__1
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
    // InternalCinEditor.g:3091:1: rule__Picture__Group__0__Impl : ( 'Picture' ) ;
    public final void rule__Picture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3095:1: ( ( 'Picture' ) )
            // InternalCinEditor.g:3096:1: ( 'Picture' )
            {
            // InternalCinEditor.g:3096:1: ( 'Picture' )
            // InternalCinEditor.g:3097:2: 'Picture'
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
    // InternalCinEditor.g:3106:1: rule__Picture__Group__1 : rule__Picture__Group__1__Impl rule__Picture__Group__2 ;
    public final void rule__Picture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3110:1: ( rule__Picture__Group__1__Impl rule__Picture__Group__2 )
            // InternalCinEditor.g:3111:2: rule__Picture__Group__1__Impl rule__Picture__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:3118:1: rule__Picture__Group__1__Impl : ( ( rule__Picture__NameAssignment_1 ) ) ;
    public final void rule__Picture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3122:1: ( ( ( rule__Picture__NameAssignment_1 ) ) )
            // InternalCinEditor.g:3123:1: ( ( rule__Picture__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:3123:1: ( ( rule__Picture__NameAssignment_1 ) )
            // InternalCinEditor.g:3124:2: ( rule__Picture__NameAssignment_1 )
            {
             before(grammarAccess.getPictureAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:3125:2: ( rule__Picture__NameAssignment_1 )
            // InternalCinEditor.g:3125:3: rule__Picture__NameAssignment_1
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
    // InternalCinEditor.g:3133:1: rule__Picture__Group__2 : rule__Picture__Group__2__Impl rule__Picture__Group__3 ;
    public final void rule__Picture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3137:1: ( rule__Picture__Group__2__Impl rule__Picture__Group__3 )
            // InternalCinEditor.g:3138:2: rule__Picture__Group__2__Impl rule__Picture__Group__3
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
    // InternalCinEditor.g:3145:1: rule__Picture__Group__2__Impl : ( '=' ) ;
    public final void rule__Picture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3149:1: ( ( '=' ) )
            // InternalCinEditor.g:3150:1: ( '=' )
            {
            // InternalCinEditor.g:3150:1: ( '=' )
            // InternalCinEditor.g:3151:2: '='
            {
             before(grammarAccess.getPictureAccess().getEqualsSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCinEditor.g:3160:1: rule__Picture__Group__3 : rule__Picture__Group__3__Impl rule__Picture__Group__4 ;
    public final void rule__Picture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3164:1: ( rule__Picture__Group__3__Impl rule__Picture__Group__4 )
            // InternalCinEditor.g:3165:2: rule__Picture__Group__3__Impl rule__Picture__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalCinEditor.g:3172:1: rule__Picture__Group__3__Impl : ( ( rule__Picture__UrlAssignment_3 ) ) ;
    public final void rule__Picture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3176:1: ( ( ( rule__Picture__UrlAssignment_3 ) ) )
            // InternalCinEditor.g:3177:1: ( ( rule__Picture__UrlAssignment_3 ) )
            {
            // InternalCinEditor.g:3177:1: ( ( rule__Picture__UrlAssignment_3 ) )
            // InternalCinEditor.g:3178:2: ( rule__Picture__UrlAssignment_3 )
            {
             before(grammarAccess.getPictureAccess().getUrlAssignment_3()); 
            // InternalCinEditor.g:3179:2: ( rule__Picture__UrlAssignment_3 )
            // InternalCinEditor.g:3179:3: rule__Picture__UrlAssignment_3
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
    // InternalCinEditor.g:3187:1: rule__Picture__Group__4 : rule__Picture__Group__4__Impl rule__Picture__Group__5 ;
    public final void rule__Picture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3191:1: ( rule__Picture__Group__4__Impl rule__Picture__Group__5 )
            // InternalCinEditor.g:3192:2: rule__Picture__Group__4__Impl rule__Picture__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalCinEditor.g:3199:1: rule__Picture__Group__4__Impl : ( ( rule__Picture__PositionAssignment_4 )? ) ;
    public final void rule__Picture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3203:1: ( ( ( rule__Picture__PositionAssignment_4 )? ) )
            // InternalCinEditor.g:3204:1: ( ( rule__Picture__PositionAssignment_4 )? )
            {
            // InternalCinEditor.g:3204:1: ( ( rule__Picture__PositionAssignment_4 )? )
            // InternalCinEditor.g:3205:2: ( rule__Picture__PositionAssignment_4 )?
            {
             before(grammarAccess.getPictureAccess().getPositionAssignment_4()); 
            // InternalCinEditor.g:3206:2: ( rule__Picture__PositionAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCinEditor.g:3206:3: rule__Picture__PositionAssignment_4
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
    // InternalCinEditor.g:3214:1: rule__Picture__Group__5 : rule__Picture__Group__5__Impl rule__Picture__Group__6 ;
    public final void rule__Picture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3218:1: ( rule__Picture__Group__5__Impl rule__Picture__Group__6 )
            // InternalCinEditor.g:3219:2: rule__Picture__Group__5__Impl rule__Picture__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalCinEditor.g:3226:1: rule__Picture__Group__5__Impl : ( ( rule__Picture__DimensionAssignment_5 )? ) ;
    public final void rule__Picture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3230:1: ( ( ( rule__Picture__DimensionAssignment_5 )? ) )
            // InternalCinEditor.g:3231:1: ( ( rule__Picture__DimensionAssignment_5 )? )
            {
            // InternalCinEditor.g:3231:1: ( ( rule__Picture__DimensionAssignment_5 )? )
            // InternalCinEditor.g:3232:2: ( rule__Picture__DimensionAssignment_5 )?
            {
             before(grammarAccess.getPictureAccess().getDimensionAssignment_5()); 
            // InternalCinEditor.g:3233:2: ( rule__Picture__DimensionAssignment_5 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCinEditor.g:3233:3: rule__Picture__DimensionAssignment_5
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
    // InternalCinEditor.g:3241:1: rule__Picture__Group__6 : rule__Picture__Group__6__Impl rule__Picture__Group__7 ;
    public final void rule__Picture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3245:1: ( rule__Picture__Group__6__Impl rule__Picture__Group__7 )
            // InternalCinEditor.g:3246:2: rule__Picture__Group__6__Impl rule__Picture__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalCinEditor.g:3253:1: rule__Picture__Group__6__Impl : ( ( rule__Picture__Group_6__0 )? ) ;
    public final void rule__Picture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3257:1: ( ( ( rule__Picture__Group_6__0 )? ) )
            // InternalCinEditor.g:3258:1: ( ( rule__Picture__Group_6__0 )? )
            {
            // InternalCinEditor.g:3258:1: ( ( rule__Picture__Group_6__0 )? )
            // InternalCinEditor.g:3259:2: ( rule__Picture__Group_6__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_6()); 
            // InternalCinEditor.g:3260:2: ( rule__Picture__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCinEditor.g:3260:3: rule__Picture__Group_6__0
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
    // InternalCinEditor.g:3268:1: rule__Picture__Group__7 : rule__Picture__Group__7__Impl rule__Picture__Group__8 ;
    public final void rule__Picture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3272:1: ( rule__Picture__Group__7__Impl rule__Picture__Group__8 )
            // InternalCinEditor.g:3273:2: rule__Picture__Group__7__Impl rule__Picture__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalCinEditor.g:3280:1: rule__Picture__Group__7__Impl : ( ( rule__Picture__Group_7__0 )? ) ;
    public final void rule__Picture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3284:1: ( ( ( rule__Picture__Group_7__0 )? ) )
            // InternalCinEditor.g:3285:1: ( ( rule__Picture__Group_7__0 )? )
            {
            // InternalCinEditor.g:3285:1: ( ( rule__Picture__Group_7__0 )? )
            // InternalCinEditor.g:3286:2: ( rule__Picture__Group_7__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_7()); 
            // InternalCinEditor.g:3287:2: ( rule__Picture__Group_7__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCinEditor.g:3287:3: rule__Picture__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Picture__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPictureAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalCinEditor.g:3295:1: rule__Picture__Group__8 : rule__Picture__Group__8__Impl ;
    public final void rule__Picture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3299:1: ( rule__Picture__Group__8__Impl )
            // InternalCinEditor.g:3300:2: rule__Picture__Group__8__Impl
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
    // InternalCinEditor.g:3306:1: rule__Picture__Group__8__Impl : ( ( rule__Picture__Group_8__0 )? ) ;
    public final void rule__Picture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3310:1: ( ( ( rule__Picture__Group_8__0 )? ) )
            // InternalCinEditor.g:3311:1: ( ( rule__Picture__Group_8__0 )? )
            {
            // InternalCinEditor.g:3311:1: ( ( rule__Picture__Group_8__0 )? )
            // InternalCinEditor.g:3312:2: ( rule__Picture__Group_8__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_8()); 
            // InternalCinEditor.g:3313:2: ( rule__Picture__Group_8__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCinEditor.g:3313:3: rule__Picture__Group_8__0
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
    // InternalCinEditor.g:3322:1: rule__Picture__Group_6__0 : rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1 ;
    public final void rule__Picture__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3326:1: ( rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1 )
            // InternalCinEditor.g:3327:2: rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:3334:1: rule__Picture__Group_6__0__Impl : ( 'margins(' ) ;
    public final void rule__Picture__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3338:1: ( ( 'margins(' ) )
            // InternalCinEditor.g:3339:1: ( 'margins(' )
            {
            // InternalCinEditor.g:3339:1: ( 'margins(' )
            // InternalCinEditor.g:3340:2: 'margins('
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
    // InternalCinEditor.g:3349:1: rule__Picture__Group_6__1 : rule__Picture__Group_6__1__Impl rule__Picture__Group_6__2 ;
    public final void rule__Picture__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3353:1: ( rule__Picture__Group_6__1__Impl rule__Picture__Group_6__2 )
            // InternalCinEditor.g:3354:2: rule__Picture__Group_6__1__Impl rule__Picture__Group_6__2
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
    // InternalCinEditor.g:3361:1: rule__Picture__Group_6__1__Impl : ( ( ( rule__Picture__MarginsAssignment_6_1 ) ) ( ( rule__Picture__MarginsAssignment_6_1 )* ) ) ;
    public final void rule__Picture__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3365:1: ( ( ( ( rule__Picture__MarginsAssignment_6_1 ) ) ( ( rule__Picture__MarginsAssignment_6_1 )* ) ) )
            // InternalCinEditor.g:3366:1: ( ( ( rule__Picture__MarginsAssignment_6_1 ) ) ( ( rule__Picture__MarginsAssignment_6_1 )* ) )
            {
            // InternalCinEditor.g:3366:1: ( ( ( rule__Picture__MarginsAssignment_6_1 ) ) ( ( rule__Picture__MarginsAssignment_6_1 )* ) )
            // InternalCinEditor.g:3367:2: ( ( rule__Picture__MarginsAssignment_6_1 ) ) ( ( rule__Picture__MarginsAssignment_6_1 )* )
            {
            // InternalCinEditor.g:3367:2: ( ( rule__Picture__MarginsAssignment_6_1 ) )
            // InternalCinEditor.g:3368:3: ( rule__Picture__MarginsAssignment_6_1 )
            {
             before(grammarAccess.getPictureAccess().getMarginsAssignment_6_1()); 
            // InternalCinEditor.g:3369:3: ( rule__Picture__MarginsAssignment_6_1 )
            // InternalCinEditor.g:3369:4: rule__Picture__MarginsAssignment_6_1
            {
            pushFollow(FOLLOW_23);
            rule__Picture__MarginsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getMarginsAssignment_6_1()); 

            }

            // InternalCinEditor.g:3372:2: ( ( rule__Picture__MarginsAssignment_6_1 )* )
            // InternalCinEditor.g:3373:3: ( rule__Picture__MarginsAssignment_6_1 )*
            {
             before(grammarAccess.getPictureAccess().getMarginsAssignment_6_1()); 
            // InternalCinEditor.g:3374:3: ( rule__Picture__MarginsAssignment_6_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=12 && LA34_0<=15)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCinEditor.g:3374:4: rule__Picture__MarginsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Picture__MarginsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalCinEditor.g:3383:1: rule__Picture__Group_6__2 : rule__Picture__Group_6__2__Impl ;
    public final void rule__Picture__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3387:1: ( rule__Picture__Group_6__2__Impl )
            // InternalCinEditor.g:3388:2: rule__Picture__Group_6__2__Impl
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
    // InternalCinEditor.g:3394:1: rule__Picture__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Picture__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3398:1: ( ( ')' ) )
            // InternalCinEditor.g:3399:1: ( ')' )
            {
            // InternalCinEditor.g:3399:1: ( ')' )
            // InternalCinEditor.g:3400:2: ')'
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


    // $ANTLR start "rule__Picture__Group_7__0"
    // InternalCinEditor.g:3410:1: rule__Picture__Group_7__0 : rule__Picture__Group_7__0__Impl rule__Picture__Group_7__1 ;
    public final void rule__Picture__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3414:1: ( rule__Picture__Group_7__0__Impl rule__Picture__Group_7__1 )
            // InternalCinEditor.g:3415:2: rule__Picture__Group_7__0__Impl rule__Picture__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Picture__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Picture__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group_7__0"


    // $ANTLR start "rule__Picture__Group_7__0__Impl"
    // InternalCinEditor.g:3422:1: rule__Picture__Group_7__0__Impl : ( 'startAt' ) ;
    public final void rule__Picture__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3426:1: ( ( 'startAt' ) )
            // InternalCinEditor.g:3427:1: ( 'startAt' )
            {
            // InternalCinEditor.g:3427:1: ( 'startAt' )
            // InternalCinEditor.g:3428:2: 'startAt'
            {
             before(grammarAccess.getPictureAccess().getStartAtKeyword_7_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getStartAtKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group_7__0__Impl"


    // $ANTLR start "rule__Picture__Group_7__1"
    // InternalCinEditor.g:3437:1: rule__Picture__Group_7__1 : rule__Picture__Group_7__1__Impl ;
    public final void rule__Picture__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3441:1: ( rule__Picture__Group_7__1__Impl )
            // InternalCinEditor.g:3442:2: rule__Picture__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group_7__1"


    // $ANTLR start "rule__Picture__Group_7__1__Impl"
    // InternalCinEditor.g:3448:1: rule__Picture__Group_7__1__Impl : ( ( rule__Picture__BeginTimeAssignment_7_1 ) ) ;
    public final void rule__Picture__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3452:1: ( ( ( rule__Picture__BeginTimeAssignment_7_1 ) ) )
            // InternalCinEditor.g:3453:1: ( ( rule__Picture__BeginTimeAssignment_7_1 ) )
            {
            // InternalCinEditor.g:3453:1: ( ( rule__Picture__BeginTimeAssignment_7_1 ) )
            // InternalCinEditor.g:3454:2: ( rule__Picture__BeginTimeAssignment_7_1 )
            {
             before(grammarAccess.getPictureAccess().getBeginTimeAssignment_7_1()); 
            // InternalCinEditor.g:3455:2: ( rule__Picture__BeginTimeAssignment_7_1 )
            // InternalCinEditor.g:3455:3: rule__Picture__BeginTimeAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Picture__BeginTimeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getBeginTimeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__Group_7__1__Impl"


    // $ANTLR start "rule__Picture__Group_8__0"
    // InternalCinEditor.g:3464:1: rule__Picture__Group_8__0 : rule__Picture__Group_8__0__Impl rule__Picture__Group_8__1 ;
    public final void rule__Picture__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3468:1: ( rule__Picture__Group_8__0__Impl rule__Picture__Group_8__1 )
            // InternalCinEditor.g:3469:2: rule__Picture__Group_8__0__Impl rule__Picture__Group_8__1
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
    // InternalCinEditor.g:3476:1: rule__Picture__Group_8__0__Impl : ( 'during' ) ;
    public final void rule__Picture__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3480:1: ( ( 'during' ) )
            // InternalCinEditor.g:3481:1: ( 'during' )
            {
            // InternalCinEditor.g:3481:1: ( 'during' )
            // InternalCinEditor.g:3482:2: 'during'
            {
             before(grammarAccess.getPictureAccess().getDuringKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCinEditor.g:3491:1: rule__Picture__Group_8__1 : rule__Picture__Group_8__1__Impl ;
    public final void rule__Picture__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3495:1: ( rule__Picture__Group_8__1__Impl )
            // InternalCinEditor.g:3496:2: rule__Picture__Group_8__1__Impl
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
    // InternalCinEditor.g:3502:1: rule__Picture__Group_8__1__Impl : ( ( rule__Picture__DurationAssignment_8_1 ) ) ;
    public final void rule__Picture__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3506:1: ( ( ( rule__Picture__DurationAssignment_8_1 ) ) )
            // InternalCinEditor.g:3507:1: ( ( rule__Picture__DurationAssignment_8_1 ) )
            {
            // InternalCinEditor.g:3507:1: ( ( rule__Picture__DurationAssignment_8_1 ) )
            // InternalCinEditor.g:3508:2: ( rule__Picture__DurationAssignment_8_1 )
            {
             before(grammarAccess.getPictureAccess().getDurationAssignment_8_1()); 
            // InternalCinEditor.g:3509:2: ( rule__Picture__DurationAssignment_8_1 )
            // InternalCinEditor.g:3509:3: rule__Picture__DurationAssignment_8_1
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
    // InternalCinEditor.g:3518:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3522:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalCinEditor.g:3523:2: rule__Video__Group__0__Impl rule__Video__Group__1
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
    // InternalCinEditor.g:3530:1: rule__Video__Group__0__Impl : ( 'Video' ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3534:1: ( ( 'Video' ) )
            // InternalCinEditor.g:3535:1: ( 'Video' )
            {
            // InternalCinEditor.g:3535:1: ( 'Video' )
            // InternalCinEditor.g:3536:2: 'Video'
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
    // InternalCinEditor.g:3545:1: rule__Video__Group__1 : rule__Video__Group__1__Impl rule__Video__Group__2 ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3549:1: ( rule__Video__Group__1__Impl rule__Video__Group__2 )
            // InternalCinEditor.g:3550:2: rule__Video__Group__1__Impl rule__Video__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:3557:1: rule__Video__Group__1__Impl : ( ( rule__Video__NameAssignment_1 ) ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3561:1: ( ( ( rule__Video__NameAssignment_1 ) ) )
            // InternalCinEditor.g:3562:1: ( ( rule__Video__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:3562:1: ( ( rule__Video__NameAssignment_1 ) )
            // InternalCinEditor.g:3563:2: ( rule__Video__NameAssignment_1 )
            {
             before(grammarAccess.getVideoAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:3564:2: ( rule__Video__NameAssignment_1 )
            // InternalCinEditor.g:3564:3: rule__Video__NameAssignment_1
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
    // InternalCinEditor.g:3572:1: rule__Video__Group__2 : rule__Video__Group__2__Impl rule__Video__Group__3 ;
    public final void rule__Video__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3576:1: ( rule__Video__Group__2__Impl rule__Video__Group__3 )
            // InternalCinEditor.g:3577:2: rule__Video__Group__2__Impl rule__Video__Group__3
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
    // InternalCinEditor.g:3584:1: rule__Video__Group__2__Impl : ( '=' ) ;
    public final void rule__Video__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3588:1: ( ( '=' ) )
            // InternalCinEditor.g:3589:1: ( '=' )
            {
            // InternalCinEditor.g:3589:1: ( '=' )
            // InternalCinEditor.g:3590:2: '='
            {
             before(grammarAccess.getVideoAccess().getEqualsSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCinEditor.g:3599:1: rule__Video__Group__3 : rule__Video__Group__3__Impl rule__Video__Group__4 ;
    public final void rule__Video__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3603:1: ( rule__Video__Group__3__Impl rule__Video__Group__4 )
            // InternalCinEditor.g:3604:2: rule__Video__Group__3__Impl rule__Video__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3611:1: rule__Video__Group__3__Impl : ( ( rule__Video__UrlAssignment_3 ) ) ;
    public final void rule__Video__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3615:1: ( ( ( rule__Video__UrlAssignment_3 ) ) )
            // InternalCinEditor.g:3616:1: ( ( rule__Video__UrlAssignment_3 ) )
            {
            // InternalCinEditor.g:3616:1: ( ( rule__Video__UrlAssignment_3 ) )
            // InternalCinEditor.g:3617:2: ( rule__Video__UrlAssignment_3 )
            {
             before(grammarAccess.getVideoAccess().getUrlAssignment_3()); 
            // InternalCinEditor.g:3618:2: ( rule__Video__UrlAssignment_3 )
            // InternalCinEditor.g:3618:3: rule__Video__UrlAssignment_3
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
    // InternalCinEditor.g:3626:1: rule__Video__Group__4 : rule__Video__Group__4__Impl rule__Video__Group__5 ;
    public final void rule__Video__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3630:1: ( rule__Video__Group__4__Impl rule__Video__Group__5 )
            // InternalCinEditor.g:3631:2: rule__Video__Group__4__Impl rule__Video__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3638:1: rule__Video__Group__4__Impl : ( ( rule__Video__Group_4__0 )? ) ;
    public final void rule__Video__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3642:1: ( ( ( rule__Video__Group_4__0 )? ) )
            // InternalCinEditor.g:3643:1: ( ( rule__Video__Group_4__0 )? )
            {
            // InternalCinEditor.g:3643:1: ( ( rule__Video__Group_4__0 )? )
            // InternalCinEditor.g:3644:2: ( rule__Video__Group_4__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_4()); 
            // InternalCinEditor.g:3645:2: ( rule__Video__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCinEditor.g:3645:3: rule__Video__Group_4__0
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
    // InternalCinEditor.g:3653:1: rule__Video__Group__5 : rule__Video__Group__5__Impl rule__Video__Group__6 ;
    public final void rule__Video__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3657:1: ( rule__Video__Group__5__Impl rule__Video__Group__6 )
            // InternalCinEditor.g:3658:2: rule__Video__Group__5__Impl rule__Video__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3665:1: rule__Video__Group__5__Impl : ( ( rule__Video__PositionAssignment_5 )? ) ;
    public final void rule__Video__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3669:1: ( ( ( rule__Video__PositionAssignment_5 )? ) )
            // InternalCinEditor.g:3670:1: ( ( rule__Video__PositionAssignment_5 )? )
            {
            // InternalCinEditor.g:3670:1: ( ( rule__Video__PositionAssignment_5 )? )
            // InternalCinEditor.g:3671:2: ( rule__Video__PositionAssignment_5 )?
            {
             before(grammarAccess.getVideoAccess().getPositionAssignment_5()); 
            // InternalCinEditor.g:3672:2: ( rule__Video__PositionAssignment_5 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCinEditor.g:3672:3: rule__Video__PositionAssignment_5
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
    // InternalCinEditor.g:3680:1: rule__Video__Group__6 : rule__Video__Group__6__Impl rule__Video__Group__7 ;
    public final void rule__Video__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3684:1: ( rule__Video__Group__6__Impl rule__Video__Group__7 )
            // InternalCinEditor.g:3685:2: rule__Video__Group__6__Impl rule__Video__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3692:1: rule__Video__Group__6__Impl : ( ( rule__Video__DimensionAssignment_6 )? ) ;
    public final void rule__Video__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3696:1: ( ( ( rule__Video__DimensionAssignment_6 )? ) )
            // InternalCinEditor.g:3697:1: ( ( rule__Video__DimensionAssignment_6 )? )
            {
            // InternalCinEditor.g:3697:1: ( ( rule__Video__DimensionAssignment_6 )? )
            // InternalCinEditor.g:3698:2: ( rule__Video__DimensionAssignment_6 )?
            {
             before(grammarAccess.getVideoAccess().getDimensionAssignment_6()); 
            // InternalCinEditor.g:3699:2: ( rule__Video__DimensionAssignment_6 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCinEditor.g:3699:3: rule__Video__DimensionAssignment_6
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
    // InternalCinEditor.g:3707:1: rule__Video__Group__7 : rule__Video__Group__7__Impl rule__Video__Group__8 ;
    public final void rule__Video__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3711:1: ( rule__Video__Group__7__Impl rule__Video__Group__8 )
            // InternalCinEditor.g:3712:2: rule__Video__Group__7__Impl rule__Video__Group__8
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3719:1: rule__Video__Group__7__Impl : ( ( rule__Video__Group_7__0 )? ) ;
    public final void rule__Video__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3723:1: ( ( ( rule__Video__Group_7__0 )? ) )
            // InternalCinEditor.g:3724:1: ( ( rule__Video__Group_7__0 )? )
            {
            // InternalCinEditor.g:3724:1: ( ( rule__Video__Group_7__0 )? )
            // InternalCinEditor.g:3725:2: ( rule__Video__Group_7__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_7()); 
            // InternalCinEditor.g:3726:2: ( rule__Video__Group_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCinEditor.g:3726:3: rule__Video__Group_7__0
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
    // InternalCinEditor.g:3734:1: rule__Video__Group__8 : rule__Video__Group__8__Impl rule__Video__Group__9 ;
    public final void rule__Video__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3738:1: ( rule__Video__Group__8__Impl rule__Video__Group__9 )
            // InternalCinEditor.g:3739:2: rule__Video__Group__8__Impl rule__Video__Group__9
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3746:1: rule__Video__Group__8__Impl : ( ( rule__Video__Group_8__0 )? ) ;
    public final void rule__Video__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3750:1: ( ( ( rule__Video__Group_8__0 )? ) )
            // InternalCinEditor.g:3751:1: ( ( rule__Video__Group_8__0 )? )
            {
            // InternalCinEditor.g:3751:1: ( ( rule__Video__Group_8__0 )? )
            // InternalCinEditor.g:3752:2: ( rule__Video__Group_8__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_8()); 
            // InternalCinEditor.g:3753:2: ( rule__Video__Group_8__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==37) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCinEditor.g:3753:3: rule__Video__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getGroup_8()); 

            }


            }

        }
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
    // InternalCinEditor.g:3761:1: rule__Video__Group__9 : rule__Video__Group__9__Impl rule__Video__Group__10 ;
    public final void rule__Video__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3765:1: ( rule__Video__Group__9__Impl rule__Video__Group__10 )
            // InternalCinEditor.g:3766:2: rule__Video__Group__9__Impl rule__Video__Group__10
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3773:1: rule__Video__Group__9__Impl : ( ( rule__Video__Group_9__0 )? ) ;
    public final void rule__Video__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3777:1: ( ( ( rule__Video__Group_9__0 )? ) )
            // InternalCinEditor.g:3778:1: ( ( rule__Video__Group_9__0 )? )
            {
            // InternalCinEditor.g:3778:1: ( ( rule__Video__Group_9__0 )? )
            // InternalCinEditor.g:3779:2: ( rule__Video__Group_9__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_9()); 
            // InternalCinEditor.g:3780:2: ( rule__Video__Group_9__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCinEditor.g:3780:3: rule__Video__Group_9__0
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
    // InternalCinEditor.g:3788:1: rule__Video__Group__10 : rule__Video__Group__10__Impl rule__Video__Group__11 ;
    public final void rule__Video__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3792:1: ( rule__Video__Group__10__Impl rule__Video__Group__11 )
            // InternalCinEditor.g:3793:2: rule__Video__Group__10__Impl rule__Video__Group__11
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
    // InternalCinEditor.g:3800:1: rule__Video__Group__10__Impl : ( 'during' ) ;
    public final void rule__Video__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3804:1: ( ( 'during' ) )
            // InternalCinEditor.g:3805:1: ( 'during' )
            {
            // InternalCinEditor.g:3805:1: ( 'during' )
            // InternalCinEditor.g:3806:2: 'during'
            {
             before(grammarAccess.getVideoAccess().getDuringKeyword_10()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCinEditor.g:3815:1: rule__Video__Group__11 : rule__Video__Group__11__Impl ;
    public final void rule__Video__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3819:1: ( rule__Video__Group__11__Impl )
            // InternalCinEditor.g:3820:2: rule__Video__Group__11__Impl
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
    // InternalCinEditor.g:3826:1: rule__Video__Group__11__Impl : ( ( rule__Video__DurationAssignment_11 ) ) ;
    public final void rule__Video__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3830:1: ( ( ( rule__Video__DurationAssignment_11 ) ) )
            // InternalCinEditor.g:3831:1: ( ( rule__Video__DurationAssignment_11 ) )
            {
            // InternalCinEditor.g:3831:1: ( ( rule__Video__DurationAssignment_11 ) )
            // InternalCinEditor.g:3832:2: ( rule__Video__DurationAssignment_11 )
            {
             before(grammarAccess.getVideoAccess().getDurationAssignment_11()); 
            // InternalCinEditor.g:3833:2: ( rule__Video__DurationAssignment_11 )
            // InternalCinEditor.g:3833:3: rule__Video__DurationAssignment_11
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
    // InternalCinEditor.g:3842:1: rule__Video__Group_4__0 : rule__Video__Group_4__0__Impl rule__Video__Group_4__1 ;
    public final void rule__Video__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3846:1: ( rule__Video__Group_4__0__Impl rule__Video__Group_4__1 )
            // InternalCinEditor.g:3847:2: rule__Video__Group_4__0__Impl rule__Video__Group_4__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalCinEditor.g:3854:1: rule__Video__Group_4__0__Impl : ( 'audio' ) ;
    public final void rule__Video__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3858:1: ( ( 'audio' ) )
            // InternalCinEditor.g:3859:1: ( 'audio' )
            {
            // InternalCinEditor.g:3859:1: ( 'audio' )
            // InternalCinEditor.g:3860:2: 'audio'
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
    // InternalCinEditor.g:3869:1: rule__Video__Group_4__1 : rule__Video__Group_4__1__Impl ;
    public final void rule__Video__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3873:1: ( rule__Video__Group_4__1__Impl )
            // InternalCinEditor.g:3874:2: rule__Video__Group_4__1__Impl
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
    // InternalCinEditor.g:3880:1: rule__Video__Group_4__1__Impl : ( ( rule__Video__EnableAudioAssignment_4_1 ) ) ;
    public final void rule__Video__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3884:1: ( ( ( rule__Video__EnableAudioAssignment_4_1 ) ) )
            // InternalCinEditor.g:3885:1: ( ( rule__Video__EnableAudioAssignment_4_1 ) )
            {
            // InternalCinEditor.g:3885:1: ( ( rule__Video__EnableAudioAssignment_4_1 ) )
            // InternalCinEditor.g:3886:2: ( rule__Video__EnableAudioAssignment_4_1 )
            {
             before(grammarAccess.getVideoAccess().getEnableAudioAssignment_4_1()); 
            // InternalCinEditor.g:3887:2: ( rule__Video__EnableAudioAssignment_4_1 )
            // InternalCinEditor.g:3887:3: rule__Video__EnableAudioAssignment_4_1
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
    // InternalCinEditor.g:3896:1: rule__Video__Group_7__0 : rule__Video__Group_7__0__Impl rule__Video__Group_7__1 ;
    public final void rule__Video__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3900:1: ( rule__Video__Group_7__0__Impl rule__Video__Group_7__1 )
            // InternalCinEditor.g:3901:2: rule__Video__Group_7__0__Impl rule__Video__Group_7__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:3908:1: rule__Video__Group_7__0__Impl : ( 'margins(' ) ;
    public final void rule__Video__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3912:1: ( ( 'margins(' ) )
            // InternalCinEditor.g:3913:1: ( 'margins(' )
            {
            // InternalCinEditor.g:3913:1: ( 'margins(' )
            // InternalCinEditor.g:3914:2: 'margins('
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
    // InternalCinEditor.g:3923:1: rule__Video__Group_7__1 : rule__Video__Group_7__1__Impl rule__Video__Group_7__2 ;
    public final void rule__Video__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3927:1: ( rule__Video__Group_7__1__Impl rule__Video__Group_7__2 )
            // InternalCinEditor.g:3928:2: rule__Video__Group_7__1__Impl rule__Video__Group_7__2
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
    // InternalCinEditor.g:3935:1: rule__Video__Group_7__1__Impl : ( ( ( rule__Video__MarginsAssignment_7_1 ) ) ( ( rule__Video__MarginsAssignment_7_1 )* ) ) ;
    public final void rule__Video__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3939:1: ( ( ( ( rule__Video__MarginsAssignment_7_1 ) ) ( ( rule__Video__MarginsAssignment_7_1 )* ) ) )
            // InternalCinEditor.g:3940:1: ( ( ( rule__Video__MarginsAssignment_7_1 ) ) ( ( rule__Video__MarginsAssignment_7_1 )* ) )
            {
            // InternalCinEditor.g:3940:1: ( ( ( rule__Video__MarginsAssignment_7_1 ) ) ( ( rule__Video__MarginsAssignment_7_1 )* ) )
            // InternalCinEditor.g:3941:2: ( ( rule__Video__MarginsAssignment_7_1 ) ) ( ( rule__Video__MarginsAssignment_7_1 )* )
            {
            // InternalCinEditor.g:3941:2: ( ( rule__Video__MarginsAssignment_7_1 ) )
            // InternalCinEditor.g:3942:3: ( rule__Video__MarginsAssignment_7_1 )
            {
             before(grammarAccess.getVideoAccess().getMarginsAssignment_7_1()); 
            // InternalCinEditor.g:3943:3: ( rule__Video__MarginsAssignment_7_1 )
            // InternalCinEditor.g:3943:4: rule__Video__MarginsAssignment_7_1
            {
            pushFollow(FOLLOW_23);
            rule__Video__MarginsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getMarginsAssignment_7_1()); 

            }

            // InternalCinEditor.g:3946:2: ( ( rule__Video__MarginsAssignment_7_1 )* )
            // InternalCinEditor.g:3947:3: ( rule__Video__MarginsAssignment_7_1 )*
            {
             before(grammarAccess.getVideoAccess().getMarginsAssignment_7_1()); 
            // InternalCinEditor.g:3948:3: ( rule__Video__MarginsAssignment_7_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=12 && LA41_0<=15)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalCinEditor.g:3948:4: rule__Video__MarginsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Video__MarginsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalCinEditor.g:3957:1: rule__Video__Group_7__2 : rule__Video__Group_7__2__Impl ;
    public final void rule__Video__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3961:1: ( rule__Video__Group_7__2__Impl )
            // InternalCinEditor.g:3962:2: rule__Video__Group_7__2__Impl
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
    // InternalCinEditor.g:3968:1: rule__Video__Group_7__2__Impl : ( ')' ) ;
    public final void rule__Video__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3972:1: ( ( ')' ) )
            // InternalCinEditor.g:3973:1: ( ')' )
            {
            // InternalCinEditor.g:3973:1: ( ')' )
            // InternalCinEditor.g:3974:2: ')'
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


    // $ANTLR start "rule__Video__Group_8__0"
    // InternalCinEditor.g:3984:1: rule__Video__Group_8__0 : rule__Video__Group_8__0__Impl rule__Video__Group_8__1 ;
    public final void rule__Video__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3988:1: ( rule__Video__Group_8__0__Impl rule__Video__Group_8__1 )
            // InternalCinEditor.g:3989:2: rule__Video__Group_8__0__Impl rule__Video__Group_8__1
            {
            pushFollow(FOLLOW_7);
            rule__Video__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_8__0"


    // $ANTLR start "rule__Video__Group_8__0__Impl"
    // InternalCinEditor.g:3996:1: rule__Video__Group_8__0__Impl : ( 'startAt' ) ;
    public final void rule__Video__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4000:1: ( ( 'startAt' ) )
            // InternalCinEditor.g:4001:1: ( 'startAt' )
            {
            // InternalCinEditor.g:4001:1: ( 'startAt' )
            // InternalCinEditor.g:4002:2: 'startAt'
            {
             before(grammarAccess.getVideoAccess().getStartAtKeyword_8_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getStartAtKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_8__0__Impl"


    // $ANTLR start "rule__Video__Group_8__1"
    // InternalCinEditor.g:4011:1: rule__Video__Group_8__1 : rule__Video__Group_8__1__Impl ;
    public final void rule__Video__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4015:1: ( rule__Video__Group_8__1__Impl )
            // InternalCinEditor.g:4016:2: rule__Video__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_8__1"


    // $ANTLR start "rule__Video__Group_8__1__Impl"
    // InternalCinEditor.g:4022:1: rule__Video__Group_8__1__Impl : ( ( rule__Video__BeginTimeAssignment_8_1 ) ) ;
    public final void rule__Video__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4026:1: ( ( ( rule__Video__BeginTimeAssignment_8_1 ) ) )
            // InternalCinEditor.g:4027:1: ( ( rule__Video__BeginTimeAssignment_8_1 ) )
            {
            // InternalCinEditor.g:4027:1: ( ( rule__Video__BeginTimeAssignment_8_1 ) )
            // InternalCinEditor.g:4028:2: ( rule__Video__BeginTimeAssignment_8_1 )
            {
             before(grammarAccess.getVideoAccess().getBeginTimeAssignment_8_1()); 
            // InternalCinEditor.g:4029:2: ( rule__Video__BeginTimeAssignment_8_1 )
            // InternalCinEditor.g:4029:3: rule__Video__BeginTimeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__BeginTimeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getBeginTimeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_8__1__Impl"


    // $ANTLR start "rule__Video__Group_9__0"
    // InternalCinEditor.g:4038:1: rule__Video__Group_9__0 : rule__Video__Group_9__0__Impl rule__Video__Group_9__1 ;
    public final void rule__Video__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4042:1: ( rule__Video__Group_9__0__Impl rule__Video__Group_9__1 )
            // InternalCinEditor.g:4043:2: rule__Video__Group_9__0__Impl rule__Video__Group_9__1
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
    // InternalCinEditor.g:4050:1: rule__Video__Group_9__0__Impl : ( 'cropAt' ) ;
    public final void rule__Video__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4054:1: ( ( 'cropAt' ) )
            // InternalCinEditor.g:4055:1: ( 'cropAt' )
            {
            // InternalCinEditor.g:4055:1: ( 'cropAt' )
            // InternalCinEditor.g:4056:2: 'cropAt'
            {
             before(grammarAccess.getVideoAccess().getCropAtKeyword_9_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCinEditor.g:4065:1: rule__Video__Group_9__1 : rule__Video__Group_9__1__Impl ;
    public final void rule__Video__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4069:1: ( rule__Video__Group_9__1__Impl )
            // InternalCinEditor.g:4070:2: rule__Video__Group_9__1__Impl
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
    // InternalCinEditor.g:4076:1: rule__Video__Group_9__1__Impl : ( ( rule__Video__BeginCropTimeAssignment_9_1 ) ) ;
    public final void rule__Video__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4080:1: ( ( ( rule__Video__BeginCropTimeAssignment_9_1 ) ) )
            // InternalCinEditor.g:4081:1: ( ( rule__Video__BeginCropTimeAssignment_9_1 ) )
            {
            // InternalCinEditor.g:4081:1: ( ( rule__Video__BeginCropTimeAssignment_9_1 ) )
            // InternalCinEditor.g:4082:2: ( rule__Video__BeginCropTimeAssignment_9_1 )
            {
             before(grammarAccess.getVideoAccess().getBeginCropTimeAssignment_9_1()); 
            // InternalCinEditor.g:4083:2: ( rule__Video__BeginCropTimeAssignment_9_1 )
            // InternalCinEditor.g:4083:3: rule__Video__BeginCropTimeAssignment_9_1
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
    // InternalCinEditor.g:4092:1: rule__Rectangle__Group__0 : rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 ;
    public final void rule__Rectangle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4096:1: ( rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 )
            // InternalCinEditor.g:4097:2: rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1
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
    // InternalCinEditor.g:4104:1: rule__Rectangle__Group__0__Impl : ( 'Rectangle' ) ;
    public final void rule__Rectangle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4108:1: ( ( 'Rectangle' ) )
            // InternalCinEditor.g:4109:1: ( 'Rectangle' )
            {
            // InternalCinEditor.g:4109:1: ( 'Rectangle' )
            // InternalCinEditor.g:4110:2: 'Rectangle'
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
    // InternalCinEditor.g:4119:1: rule__Rectangle__Group__1 : rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 ;
    public final void rule__Rectangle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4123:1: ( rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 )
            // InternalCinEditor.g:4124:2: rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:4131:1: rule__Rectangle__Group__1__Impl : ( ( rule__Rectangle__NameAssignment_1 ) ) ;
    public final void rule__Rectangle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4135:1: ( ( ( rule__Rectangle__NameAssignment_1 ) ) )
            // InternalCinEditor.g:4136:1: ( ( rule__Rectangle__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:4136:1: ( ( rule__Rectangle__NameAssignment_1 ) )
            // InternalCinEditor.g:4137:2: ( rule__Rectangle__NameAssignment_1 )
            {
             before(grammarAccess.getRectangleAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:4138:2: ( rule__Rectangle__NameAssignment_1 )
            // InternalCinEditor.g:4138:3: rule__Rectangle__NameAssignment_1
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
    // InternalCinEditor.g:4146:1: rule__Rectangle__Group__2 : rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 ;
    public final void rule__Rectangle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4150:1: ( rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 )
            // InternalCinEditor.g:4151:2: rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalCinEditor.g:4158:1: rule__Rectangle__Group__2__Impl : ( '=' ) ;
    public final void rule__Rectangle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4162:1: ( ( '=' ) )
            // InternalCinEditor.g:4163:1: ( '=' )
            {
            // InternalCinEditor.g:4163:1: ( '=' )
            // InternalCinEditor.g:4164:2: '='
            {
             before(grammarAccess.getRectangleAccess().getEqualsSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCinEditor.g:4173:1: rule__Rectangle__Group__3 : rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 ;
    public final void rule__Rectangle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4177:1: ( rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 )
            // InternalCinEditor.g:4178:2: rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalCinEditor.g:4185:1: rule__Rectangle__Group__3__Impl : ( ( rule__Rectangle__ColorAssignment_3 ) ) ;
    public final void rule__Rectangle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4189:1: ( ( ( rule__Rectangle__ColorAssignment_3 ) ) )
            // InternalCinEditor.g:4190:1: ( ( rule__Rectangle__ColorAssignment_3 ) )
            {
            // InternalCinEditor.g:4190:1: ( ( rule__Rectangle__ColorAssignment_3 ) )
            // InternalCinEditor.g:4191:2: ( rule__Rectangle__ColorAssignment_3 )
            {
             before(grammarAccess.getRectangleAccess().getColorAssignment_3()); 
            // InternalCinEditor.g:4192:2: ( rule__Rectangle__ColorAssignment_3 )
            // InternalCinEditor.g:4192:3: rule__Rectangle__ColorAssignment_3
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
    // InternalCinEditor.g:4200:1: rule__Rectangle__Group__4 : rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 ;
    public final void rule__Rectangle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4204:1: ( rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 )
            // InternalCinEditor.g:4205:2: rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalCinEditor.g:4212:1: rule__Rectangle__Group__4__Impl : ( ( rule__Rectangle__PositionAssignment_4 )? ) ;
    public final void rule__Rectangle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4216:1: ( ( ( rule__Rectangle__PositionAssignment_4 )? ) )
            // InternalCinEditor.g:4217:1: ( ( rule__Rectangle__PositionAssignment_4 )? )
            {
            // InternalCinEditor.g:4217:1: ( ( rule__Rectangle__PositionAssignment_4 )? )
            // InternalCinEditor.g:4218:2: ( rule__Rectangle__PositionAssignment_4 )?
            {
             before(grammarAccess.getRectangleAccess().getPositionAssignment_4()); 
            // InternalCinEditor.g:4219:2: ( rule__Rectangle__PositionAssignment_4 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==23) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCinEditor.g:4219:3: rule__Rectangle__PositionAssignment_4
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
    // InternalCinEditor.g:4227:1: rule__Rectangle__Group__5 : rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 ;
    public final void rule__Rectangle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4231:1: ( rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 )
            // InternalCinEditor.g:4232:2: rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalCinEditor.g:4239:1: rule__Rectangle__Group__5__Impl : ( ( rule__Rectangle__DimensionAssignment_5 )? ) ;
    public final void rule__Rectangle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4243:1: ( ( ( rule__Rectangle__DimensionAssignment_5 )? ) )
            // InternalCinEditor.g:4244:1: ( ( rule__Rectangle__DimensionAssignment_5 )? )
            {
            // InternalCinEditor.g:4244:1: ( ( rule__Rectangle__DimensionAssignment_5 )? )
            // InternalCinEditor.g:4245:2: ( rule__Rectangle__DimensionAssignment_5 )?
            {
             before(grammarAccess.getRectangleAccess().getDimensionAssignment_5()); 
            // InternalCinEditor.g:4246:2: ( rule__Rectangle__DimensionAssignment_5 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==26) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCinEditor.g:4246:3: rule__Rectangle__DimensionAssignment_5
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
    // InternalCinEditor.g:4254:1: rule__Rectangle__Group__6 : rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 ;
    public final void rule__Rectangle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4258:1: ( rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 )
            // InternalCinEditor.g:4259:2: rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalCinEditor.g:4266:1: rule__Rectangle__Group__6__Impl : ( ( rule__Rectangle__Group_6__0 )? ) ;
    public final void rule__Rectangle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4270:1: ( ( ( rule__Rectangle__Group_6__0 )? ) )
            // InternalCinEditor.g:4271:1: ( ( rule__Rectangle__Group_6__0 )? )
            {
            // InternalCinEditor.g:4271:1: ( ( rule__Rectangle__Group_6__0 )? )
            // InternalCinEditor.g:4272:2: ( rule__Rectangle__Group_6__0 )?
            {
             before(grammarAccess.getRectangleAccess().getGroup_6()); 
            // InternalCinEditor.g:4273:2: ( rule__Rectangle__Group_6__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==42) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCinEditor.g:4273:3: rule__Rectangle__Group_6__0
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
    // InternalCinEditor.g:4281:1: rule__Rectangle__Group__7 : rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8 ;
    public final void rule__Rectangle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4285:1: ( rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8 )
            // InternalCinEditor.g:4286:2: rule__Rectangle__Group__7__Impl rule__Rectangle__Group__8
            {
            pushFollow(FOLLOW_24);
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
    // InternalCinEditor.g:4293:1: rule__Rectangle__Group__7__Impl : ( ( rule__Rectangle__Group_7__0 )? ) ;
    public final void rule__Rectangle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4297:1: ( ( ( rule__Rectangle__Group_7__0 )? ) )
            // InternalCinEditor.g:4298:1: ( ( rule__Rectangle__Group_7__0 )? )
            {
            // InternalCinEditor.g:4298:1: ( ( rule__Rectangle__Group_7__0 )? )
            // InternalCinEditor.g:4299:2: ( rule__Rectangle__Group_7__0 )?
            {
             before(grammarAccess.getRectangleAccess().getGroup_7()); 
            // InternalCinEditor.g:4300:2: ( rule__Rectangle__Group_7__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==37) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCinEditor.g:4300:3: rule__Rectangle__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rectangle__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRectangleAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalCinEditor.g:4308:1: rule__Rectangle__Group__8 : rule__Rectangle__Group__8__Impl ;
    public final void rule__Rectangle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4312:1: ( rule__Rectangle__Group__8__Impl )
            // InternalCinEditor.g:4313:2: rule__Rectangle__Group__8__Impl
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
    // InternalCinEditor.g:4319:1: rule__Rectangle__Group__8__Impl : ( ( rule__Rectangle__Group_8__0 )? ) ;
    public final void rule__Rectangle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4323:1: ( ( ( rule__Rectangle__Group_8__0 )? ) )
            // InternalCinEditor.g:4324:1: ( ( rule__Rectangle__Group_8__0 )? )
            {
            // InternalCinEditor.g:4324:1: ( ( rule__Rectangle__Group_8__0 )? )
            // InternalCinEditor.g:4325:2: ( rule__Rectangle__Group_8__0 )?
            {
             before(grammarAccess.getRectangleAccess().getGroup_8()); 
            // InternalCinEditor.g:4326:2: ( rule__Rectangle__Group_8__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==39) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCinEditor.g:4326:3: rule__Rectangle__Group_8__0
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
    // InternalCinEditor.g:4335:1: rule__Rectangle__Group_6__0 : rule__Rectangle__Group_6__0__Impl rule__Rectangle__Group_6__1 ;
    public final void rule__Rectangle__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4339:1: ( rule__Rectangle__Group_6__0__Impl rule__Rectangle__Group_6__1 )
            // InternalCinEditor.g:4340:2: rule__Rectangle__Group_6__0__Impl rule__Rectangle__Group_6__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:4347:1: rule__Rectangle__Group_6__0__Impl : ( 'margins(' ) ;
    public final void rule__Rectangle__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4351:1: ( ( 'margins(' ) )
            // InternalCinEditor.g:4352:1: ( 'margins(' )
            {
            // InternalCinEditor.g:4352:1: ( 'margins(' )
            // InternalCinEditor.g:4353:2: 'margins('
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
    // InternalCinEditor.g:4362:1: rule__Rectangle__Group_6__1 : rule__Rectangle__Group_6__1__Impl rule__Rectangle__Group_6__2 ;
    public final void rule__Rectangle__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4366:1: ( rule__Rectangle__Group_6__1__Impl rule__Rectangle__Group_6__2 )
            // InternalCinEditor.g:4367:2: rule__Rectangle__Group_6__1__Impl rule__Rectangle__Group_6__2
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
    // InternalCinEditor.g:4374:1: rule__Rectangle__Group_6__1__Impl : ( ( ( rule__Rectangle__MarginsAssignment_6_1 ) ) ( ( rule__Rectangle__MarginsAssignment_6_1 )* ) ) ;
    public final void rule__Rectangle__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4378:1: ( ( ( ( rule__Rectangle__MarginsAssignment_6_1 ) ) ( ( rule__Rectangle__MarginsAssignment_6_1 )* ) ) )
            // InternalCinEditor.g:4379:1: ( ( ( rule__Rectangle__MarginsAssignment_6_1 ) ) ( ( rule__Rectangle__MarginsAssignment_6_1 )* ) )
            {
            // InternalCinEditor.g:4379:1: ( ( ( rule__Rectangle__MarginsAssignment_6_1 ) ) ( ( rule__Rectangle__MarginsAssignment_6_1 )* ) )
            // InternalCinEditor.g:4380:2: ( ( rule__Rectangle__MarginsAssignment_6_1 ) ) ( ( rule__Rectangle__MarginsAssignment_6_1 )* )
            {
            // InternalCinEditor.g:4380:2: ( ( rule__Rectangle__MarginsAssignment_6_1 ) )
            // InternalCinEditor.g:4381:3: ( rule__Rectangle__MarginsAssignment_6_1 )
            {
             before(grammarAccess.getRectangleAccess().getMarginsAssignment_6_1()); 
            // InternalCinEditor.g:4382:3: ( rule__Rectangle__MarginsAssignment_6_1 )
            // InternalCinEditor.g:4382:4: rule__Rectangle__MarginsAssignment_6_1
            {
            pushFollow(FOLLOW_23);
            rule__Rectangle__MarginsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getMarginsAssignment_6_1()); 

            }

            // InternalCinEditor.g:4385:2: ( ( rule__Rectangle__MarginsAssignment_6_1 )* )
            // InternalCinEditor.g:4386:3: ( rule__Rectangle__MarginsAssignment_6_1 )*
            {
             before(grammarAccess.getRectangleAccess().getMarginsAssignment_6_1()); 
            // InternalCinEditor.g:4387:3: ( rule__Rectangle__MarginsAssignment_6_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=12 && LA47_0<=15)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalCinEditor.g:4387:4: rule__Rectangle__MarginsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Rectangle__MarginsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalCinEditor.g:4396:1: rule__Rectangle__Group_6__2 : rule__Rectangle__Group_6__2__Impl ;
    public final void rule__Rectangle__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4400:1: ( rule__Rectangle__Group_6__2__Impl )
            // InternalCinEditor.g:4401:2: rule__Rectangle__Group_6__2__Impl
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
    // InternalCinEditor.g:4407:1: rule__Rectangle__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Rectangle__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4411:1: ( ( ')' ) )
            // InternalCinEditor.g:4412:1: ( ')' )
            {
            // InternalCinEditor.g:4412:1: ( ')' )
            // InternalCinEditor.g:4413:2: ')'
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


    // $ANTLR start "rule__Rectangle__Group_7__0"
    // InternalCinEditor.g:4423:1: rule__Rectangle__Group_7__0 : rule__Rectangle__Group_7__0__Impl rule__Rectangle__Group_7__1 ;
    public final void rule__Rectangle__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4427:1: ( rule__Rectangle__Group_7__0__Impl rule__Rectangle__Group_7__1 )
            // InternalCinEditor.g:4428:2: rule__Rectangle__Group_7__0__Impl rule__Rectangle__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Rectangle__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rectangle__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_7__0"


    // $ANTLR start "rule__Rectangle__Group_7__0__Impl"
    // InternalCinEditor.g:4435:1: rule__Rectangle__Group_7__0__Impl : ( 'startAt' ) ;
    public final void rule__Rectangle__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4439:1: ( ( 'startAt' ) )
            // InternalCinEditor.g:4440:1: ( 'startAt' )
            {
            // InternalCinEditor.g:4440:1: ( 'startAt' )
            // InternalCinEditor.g:4441:2: 'startAt'
            {
             before(grammarAccess.getRectangleAccess().getStartAtKeyword_7_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getStartAtKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_7__0__Impl"


    // $ANTLR start "rule__Rectangle__Group_7__1"
    // InternalCinEditor.g:4450:1: rule__Rectangle__Group_7__1 : rule__Rectangle__Group_7__1__Impl ;
    public final void rule__Rectangle__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4454:1: ( rule__Rectangle__Group_7__1__Impl )
            // InternalCinEditor.g:4455:2: rule__Rectangle__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_7__1"


    // $ANTLR start "rule__Rectangle__Group_7__1__Impl"
    // InternalCinEditor.g:4461:1: rule__Rectangle__Group_7__1__Impl : ( ( rule__Rectangle__BeginTimeAssignment_7_1 ) ) ;
    public final void rule__Rectangle__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4465:1: ( ( ( rule__Rectangle__BeginTimeAssignment_7_1 ) ) )
            // InternalCinEditor.g:4466:1: ( ( rule__Rectangle__BeginTimeAssignment_7_1 ) )
            {
            // InternalCinEditor.g:4466:1: ( ( rule__Rectangle__BeginTimeAssignment_7_1 ) )
            // InternalCinEditor.g:4467:2: ( rule__Rectangle__BeginTimeAssignment_7_1 )
            {
             before(grammarAccess.getRectangleAccess().getBeginTimeAssignment_7_1()); 
            // InternalCinEditor.g:4468:2: ( rule__Rectangle__BeginTimeAssignment_7_1 )
            // InternalCinEditor.g:4468:3: rule__Rectangle__BeginTimeAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__BeginTimeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getBeginTimeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group_7__1__Impl"


    // $ANTLR start "rule__Rectangle__Group_8__0"
    // InternalCinEditor.g:4477:1: rule__Rectangle__Group_8__0 : rule__Rectangle__Group_8__0__Impl rule__Rectangle__Group_8__1 ;
    public final void rule__Rectangle__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4481:1: ( rule__Rectangle__Group_8__0__Impl rule__Rectangle__Group_8__1 )
            // InternalCinEditor.g:4482:2: rule__Rectangle__Group_8__0__Impl rule__Rectangle__Group_8__1
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
    // InternalCinEditor.g:4489:1: rule__Rectangle__Group_8__0__Impl : ( 'during' ) ;
    public final void rule__Rectangle__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4493:1: ( ( 'during' ) )
            // InternalCinEditor.g:4494:1: ( 'during' )
            {
            // InternalCinEditor.g:4494:1: ( 'during' )
            // InternalCinEditor.g:4495:2: 'during'
            {
             before(grammarAccess.getRectangleAccess().getDuringKeyword_8_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCinEditor.g:4504:1: rule__Rectangle__Group_8__1 : rule__Rectangle__Group_8__1__Impl ;
    public final void rule__Rectangle__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4508:1: ( rule__Rectangle__Group_8__1__Impl )
            // InternalCinEditor.g:4509:2: rule__Rectangle__Group_8__1__Impl
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
    // InternalCinEditor.g:4515:1: rule__Rectangle__Group_8__1__Impl : ( ( rule__Rectangle__DurationAssignment_8_1 ) ) ;
    public final void rule__Rectangle__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4519:1: ( ( ( rule__Rectangle__DurationAssignment_8_1 ) ) )
            // InternalCinEditor.g:4520:1: ( ( rule__Rectangle__DurationAssignment_8_1 ) )
            {
            // InternalCinEditor.g:4520:1: ( ( rule__Rectangle__DurationAssignment_8_1 ) )
            // InternalCinEditor.g:4521:2: ( rule__Rectangle__DurationAssignment_8_1 )
            {
             before(grammarAccess.getRectangleAccess().getDurationAssignment_8_1()); 
            // InternalCinEditor.g:4522:2: ( rule__Rectangle__DurationAssignment_8_1 )
            // InternalCinEditor.g:4522:3: rule__Rectangle__DurationAssignment_8_1
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
    // InternalCinEditor.g:4531:1: rule__FadeIn__Group__0 : rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 ;
    public final void rule__FadeIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4535:1: ( rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 )
            // InternalCinEditor.g:4536:2: rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1
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
    // InternalCinEditor.g:4543:1: rule__FadeIn__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__FadeIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4547:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:4548:1: ( 'Effect' )
            {
            // InternalCinEditor.g:4548:1: ( 'Effect' )
            // InternalCinEditor.g:4549:2: 'Effect'
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
    // InternalCinEditor.g:4558:1: rule__FadeIn__Group__1 : rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 ;
    public final void rule__FadeIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4562:1: ( rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 )
            // InternalCinEditor.g:4563:2: rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:4570:1: rule__FadeIn__Group__1__Impl : ( ( rule__FadeIn__NameAssignment_1 ) ) ;
    public final void rule__FadeIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4574:1: ( ( ( rule__FadeIn__NameAssignment_1 ) ) )
            // InternalCinEditor.g:4575:1: ( ( rule__FadeIn__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:4575:1: ( ( rule__FadeIn__NameAssignment_1 ) )
            // InternalCinEditor.g:4576:2: ( rule__FadeIn__NameAssignment_1 )
            {
             before(grammarAccess.getFadeInAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:4577:2: ( rule__FadeIn__NameAssignment_1 )
            // InternalCinEditor.g:4577:3: rule__FadeIn__NameAssignment_1
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
    // InternalCinEditor.g:4585:1: rule__FadeIn__Group__2 : rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 ;
    public final void rule__FadeIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4589:1: ( rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 )
            // InternalCinEditor.g:4590:2: rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalCinEditor.g:4597:1: rule__FadeIn__Group__2__Impl : ( '=' ) ;
    public final void rule__FadeIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4601:1: ( ( '=' ) )
            // InternalCinEditor.g:4602:1: ( '=' )
            {
            // InternalCinEditor.g:4602:1: ( '=' )
            // InternalCinEditor.g:4603:2: '='
            {
             before(grammarAccess.getFadeInAccess().getEqualsSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCinEditor.g:4612:1: rule__FadeIn__Group__3 : rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 ;
    public final void rule__FadeIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4616:1: ( rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 )
            // InternalCinEditor.g:4617:2: rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalCinEditor.g:4624:1: rule__FadeIn__Group__3__Impl : ( 'FadeIn' ) ;
    public final void rule__FadeIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4628:1: ( ( 'FadeIn' ) )
            // InternalCinEditor.g:4629:1: ( 'FadeIn' )
            {
            // InternalCinEditor.g:4629:1: ( 'FadeIn' )
            // InternalCinEditor.g:4630:2: 'FadeIn'
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
    // InternalCinEditor.g:4639:1: rule__FadeIn__Group__4 : rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5 ;
    public final void rule__FadeIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4643:1: ( rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5 )
            // InternalCinEditor.g:4644:2: rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5
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
    // InternalCinEditor.g:4651:1: rule__FadeIn__Group__4__Impl : ( 'during' ) ;
    public final void rule__FadeIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4655:1: ( ( 'during' ) )
            // InternalCinEditor.g:4656:1: ( 'during' )
            {
            // InternalCinEditor.g:4656:1: ( 'during' )
            // InternalCinEditor.g:4657:2: 'during'
            {
             before(grammarAccess.getFadeInAccess().getDuringKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCinEditor.g:4666:1: rule__FadeIn__Group__5 : rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6 ;
    public final void rule__FadeIn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4670:1: ( rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6 )
            // InternalCinEditor.g:4671:2: rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalCinEditor.g:4678:1: rule__FadeIn__Group__5__Impl : ( ( rule__FadeIn__DurationAssignment_5 ) ) ;
    public final void rule__FadeIn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4682:1: ( ( ( rule__FadeIn__DurationAssignment_5 ) ) )
            // InternalCinEditor.g:4683:1: ( ( rule__FadeIn__DurationAssignment_5 ) )
            {
            // InternalCinEditor.g:4683:1: ( ( rule__FadeIn__DurationAssignment_5 ) )
            // InternalCinEditor.g:4684:2: ( rule__FadeIn__DurationAssignment_5 )
            {
             before(grammarAccess.getFadeInAccess().getDurationAssignment_5()); 
            // InternalCinEditor.g:4685:2: ( rule__FadeIn__DurationAssignment_5 )
            // InternalCinEditor.g:4685:3: rule__FadeIn__DurationAssignment_5
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
    // InternalCinEditor.g:4693:1: rule__FadeIn__Group__6 : rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7 ;
    public final void rule__FadeIn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4697:1: ( rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7 )
            // InternalCinEditor.g:4698:2: rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalCinEditor.g:4705:1: rule__FadeIn__Group__6__Impl : ( 'on' ) ;
    public final void rule__FadeIn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4709:1: ( ( 'on' ) )
            // InternalCinEditor.g:4710:1: ( 'on' )
            {
            // InternalCinEditor.g:4710:1: ( 'on' )
            // InternalCinEditor.g:4711:2: 'on'
            {
             before(grammarAccess.getFadeInAccess().getOnKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCinEditor.g:4720:1: rule__FadeIn__Group__7 : rule__FadeIn__Group__7__Impl rule__FadeIn__Group__8 ;
    public final void rule__FadeIn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4724:1: ( rule__FadeIn__Group__7__Impl rule__FadeIn__Group__8 )
            // InternalCinEditor.g:4725:2: rule__FadeIn__Group__7__Impl rule__FadeIn__Group__8
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
    // InternalCinEditor.g:4732:1: rule__FadeIn__Group__7__Impl : ( '[' ) ;
    public final void rule__FadeIn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4736:1: ( ( '[' ) )
            // InternalCinEditor.g:4737:1: ( '[' )
            {
            // InternalCinEditor.g:4737:1: ( '[' )
            // InternalCinEditor.g:4738:2: '['
            {
             before(grammarAccess.getFadeInAccess().getLeftSquareBracketKeyword_7()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCinEditor.g:4747:1: rule__FadeIn__Group__8 : rule__FadeIn__Group__8__Impl rule__FadeIn__Group__9 ;
    public final void rule__FadeIn__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4751:1: ( rule__FadeIn__Group__8__Impl rule__FadeIn__Group__9 )
            // InternalCinEditor.g:4752:2: rule__FadeIn__Group__8__Impl rule__FadeIn__Group__9
            {
            pushFollow(FOLLOW_32);
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
    // InternalCinEditor.g:4759:1: rule__FadeIn__Group__8__Impl : ( ( rule__FadeIn__ElementsAssignment_8 ) ) ;
    public final void rule__FadeIn__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4763:1: ( ( ( rule__FadeIn__ElementsAssignment_8 ) ) )
            // InternalCinEditor.g:4764:1: ( ( rule__FadeIn__ElementsAssignment_8 ) )
            {
            // InternalCinEditor.g:4764:1: ( ( rule__FadeIn__ElementsAssignment_8 ) )
            // InternalCinEditor.g:4765:2: ( rule__FadeIn__ElementsAssignment_8 )
            {
             before(grammarAccess.getFadeInAccess().getElementsAssignment_8()); 
            // InternalCinEditor.g:4766:2: ( rule__FadeIn__ElementsAssignment_8 )
            // InternalCinEditor.g:4766:3: rule__FadeIn__ElementsAssignment_8
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
    // InternalCinEditor.g:4774:1: rule__FadeIn__Group__9 : rule__FadeIn__Group__9__Impl rule__FadeIn__Group__10 ;
    public final void rule__FadeIn__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4778:1: ( rule__FadeIn__Group__9__Impl rule__FadeIn__Group__10 )
            // InternalCinEditor.g:4779:2: rule__FadeIn__Group__9__Impl rule__FadeIn__Group__10
            {
            pushFollow(FOLLOW_32);
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
    // InternalCinEditor.g:4786:1: rule__FadeIn__Group__9__Impl : ( ( rule__FadeIn__Group_9__0 )* ) ;
    public final void rule__FadeIn__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4790:1: ( ( ( rule__FadeIn__Group_9__0 )* ) )
            // InternalCinEditor.g:4791:1: ( ( rule__FadeIn__Group_9__0 )* )
            {
            // InternalCinEditor.g:4791:1: ( ( rule__FadeIn__Group_9__0 )* )
            // InternalCinEditor.g:4792:2: ( rule__FadeIn__Group_9__0 )*
            {
             before(grammarAccess.getFadeInAccess().getGroup_9()); 
            // InternalCinEditor.g:4793:2: ( rule__FadeIn__Group_9__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==17) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalCinEditor.g:4793:3: rule__FadeIn__Group_9__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__FadeIn__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalCinEditor.g:4801:1: rule__FadeIn__Group__10 : rule__FadeIn__Group__10__Impl ;
    public final void rule__FadeIn__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4805:1: ( rule__FadeIn__Group__10__Impl )
            // InternalCinEditor.g:4806:2: rule__FadeIn__Group__10__Impl
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
    // InternalCinEditor.g:4812:1: rule__FadeIn__Group__10__Impl : ( ']' ) ;
    public final void rule__FadeIn__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4816:1: ( ( ']' ) )
            // InternalCinEditor.g:4817:1: ( ']' )
            {
            // InternalCinEditor.g:4817:1: ( ']' )
            // InternalCinEditor.g:4818:2: ']'
            {
             before(grammarAccess.getFadeInAccess().getRightSquareBracketKeyword_10()); 
            match(input,50,FOLLOW_2); 
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
    // InternalCinEditor.g:4828:1: rule__FadeIn__Group_9__0 : rule__FadeIn__Group_9__0__Impl rule__FadeIn__Group_9__1 ;
    public final void rule__FadeIn__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4832:1: ( rule__FadeIn__Group_9__0__Impl rule__FadeIn__Group_9__1 )
            // InternalCinEditor.g:4833:2: rule__FadeIn__Group_9__0__Impl rule__FadeIn__Group_9__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:4840:1: rule__FadeIn__Group_9__0__Impl : ( ',' ) ;
    public final void rule__FadeIn__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4844:1: ( ( ',' ) )
            // InternalCinEditor.g:4845:1: ( ',' )
            {
            // InternalCinEditor.g:4845:1: ( ',' )
            // InternalCinEditor.g:4846:2: ','
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
    // InternalCinEditor.g:4855:1: rule__FadeIn__Group_9__1 : rule__FadeIn__Group_9__1__Impl ;
    public final void rule__FadeIn__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4859:1: ( rule__FadeIn__Group_9__1__Impl )
            // InternalCinEditor.g:4860:2: rule__FadeIn__Group_9__1__Impl
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
    // InternalCinEditor.g:4866:1: rule__FadeIn__Group_9__1__Impl : ( ( rule__FadeIn__ElementsAssignment_9_1 ) ) ;
    public final void rule__FadeIn__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4870:1: ( ( ( rule__FadeIn__ElementsAssignment_9_1 ) ) )
            // InternalCinEditor.g:4871:1: ( ( rule__FadeIn__ElementsAssignment_9_1 ) )
            {
            // InternalCinEditor.g:4871:1: ( ( rule__FadeIn__ElementsAssignment_9_1 ) )
            // InternalCinEditor.g:4872:2: ( rule__FadeIn__ElementsAssignment_9_1 )
            {
             before(grammarAccess.getFadeInAccess().getElementsAssignment_9_1()); 
            // InternalCinEditor.g:4873:2: ( rule__FadeIn__ElementsAssignment_9_1 )
            // InternalCinEditor.g:4873:3: rule__FadeIn__ElementsAssignment_9_1
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
    // InternalCinEditor.g:4882:1: rule__FadeOut__Group__0 : rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 ;
    public final void rule__FadeOut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4886:1: ( rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 )
            // InternalCinEditor.g:4887:2: rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1
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
    // InternalCinEditor.g:4894:1: rule__FadeOut__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__FadeOut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4898:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:4899:1: ( 'Effect' )
            {
            // InternalCinEditor.g:4899:1: ( 'Effect' )
            // InternalCinEditor.g:4900:2: 'Effect'
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
    // InternalCinEditor.g:4909:1: rule__FadeOut__Group__1 : rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 ;
    public final void rule__FadeOut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4913:1: ( rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 )
            // InternalCinEditor.g:4914:2: rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:4921:1: rule__FadeOut__Group__1__Impl : ( ( rule__FadeOut__NameAssignment_1 ) ) ;
    public final void rule__FadeOut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4925:1: ( ( ( rule__FadeOut__NameAssignment_1 ) ) )
            // InternalCinEditor.g:4926:1: ( ( rule__FadeOut__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:4926:1: ( ( rule__FadeOut__NameAssignment_1 ) )
            // InternalCinEditor.g:4927:2: ( rule__FadeOut__NameAssignment_1 )
            {
             before(grammarAccess.getFadeOutAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:4928:2: ( rule__FadeOut__NameAssignment_1 )
            // InternalCinEditor.g:4928:3: rule__FadeOut__NameAssignment_1
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
    // InternalCinEditor.g:4936:1: rule__FadeOut__Group__2 : rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 ;
    public final void rule__FadeOut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4940:1: ( rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 )
            // InternalCinEditor.g:4941:2: rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalCinEditor.g:4948:1: rule__FadeOut__Group__2__Impl : ( '=' ) ;
    public final void rule__FadeOut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4952:1: ( ( '=' ) )
            // InternalCinEditor.g:4953:1: ( '=' )
            {
            // InternalCinEditor.g:4953:1: ( '=' )
            // InternalCinEditor.g:4954:2: '='
            {
             before(grammarAccess.getFadeOutAccess().getEqualsSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCinEditor.g:4963:1: rule__FadeOut__Group__3 : rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 ;
    public final void rule__FadeOut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4967:1: ( rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 )
            // InternalCinEditor.g:4968:2: rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalCinEditor.g:4975:1: rule__FadeOut__Group__3__Impl : ( 'FadeOut' ) ;
    public final void rule__FadeOut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4979:1: ( ( 'FadeOut' ) )
            // InternalCinEditor.g:4980:1: ( 'FadeOut' )
            {
            // InternalCinEditor.g:4980:1: ( 'FadeOut' )
            // InternalCinEditor.g:4981:2: 'FadeOut'
            {
             before(grammarAccess.getFadeOutAccess().getFadeOutKeyword_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalCinEditor.g:4990:1: rule__FadeOut__Group__4 : rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5 ;
    public final void rule__FadeOut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4994:1: ( rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5 )
            // InternalCinEditor.g:4995:2: rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5
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
    // InternalCinEditor.g:5002:1: rule__FadeOut__Group__4__Impl : ( 'during' ) ;
    public final void rule__FadeOut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5006:1: ( ( 'during' ) )
            // InternalCinEditor.g:5007:1: ( 'during' )
            {
            // InternalCinEditor.g:5007:1: ( 'during' )
            // InternalCinEditor.g:5008:2: 'during'
            {
             before(grammarAccess.getFadeOutAccess().getDuringKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCinEditor.g:5017:1: rule__FadeOut__Group__5 : rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6 ;
    public final void rule__FadeOut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5021:1: ( rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6 )
            // InternalCinEditor.g:5022:2: rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalCinEditor.g:5029:1: rule__FadeOut__Group__5__Impl : ( ( rule__FadeOut__DurationAssignment_5 ) ) ;
    public final void rule__FadeOut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5033:1: ( ( ( rule__FadeOut__DurationAssignment_5 ) ) )
            // InternalCinEditor.g:5034:1: ( ( rule__FadeOut__DurationAssignment_5 ) )
            {
            // InternalCinEditor.g:5034:1: ( ( rule__FadeOut__DurationAssignment_5 ) )
            // InternalCinEditor.g:5035:2: ( rule__FadeOut__DurationAssignment_5 )
            {
             before(grammarAccess.getFadeOutAccess().getDurationAssignment_5()); 
            // InternalCinEditor.g:5036:2: ( rule__FadeOut__DurationAssignment_5 )
            // InternalCinEditor.g:5036:3: rule__FadeOut__DurationAssignment_5
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
    // InternalCinEditor.g:5044:1: rule__FadeOut__Group__6 : rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7 ;
    public final void rule__FadeOut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5048:1: ( rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7 )
            // InternalCinEditor.g:5049:2: rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalCinEditor.g:5056:1: rule__FadeOut__Group__6__Impl : ( 'on' ) ;
    public final void rule__FadeOut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5060:1: ( ( 'on' ) )
            // InternalCinEditor.g:5061:1: ( 'on' )
            {
            // InternalCinEditor.g:5061:1: ( 'on' )
            // InternalCinEditor.g:5062:2: 'on'
            {
             before(grammarAccess.getFadeOutAccess().getOnKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCinEditor.g:5071:1: rule__FadeOut__Group__7 : rule__FadeOut__Group__7__Impl rule__FadeOut__Group__8 ;
    public final void rule__FadeOut__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5075:1: ( rule__FadeOut__Group__7__Impl rule__FadeOut__Group__8 )
            // InternalCinEditor.g:5076:2: rule__FadeOut__Group__7__Impl rule__FadeOut__Group__8
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
    // InternalCinEditor.g:5083:1: rule__FadeOut__Group__7__Impl : ( '[' ) ;
    public final void rule__FadeOut__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5087:1: ( ( '[' ) )
            // InternalCinEditor.g:5088:1: ( '[' )
            {
            // InternalCinEditor.g:5088:1: ( '[' )
            // InternalCinEditor.g:5089:2: '['
            {
             before(grammarAccess.getFadeOutAccess().getLeftSquareBracketKeyword_7()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCinEditor.g:5098:1: rule__FadeOut__Group__8 : rule__FadeOut__Group__8__Impl rule__FadeOut__Group__9 ;
    public final void rule__FadeOut__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5102:1: ( rule__FadeOut__Group__8__Impl rule__FadeOut__Group__9 )
            // InternalCinEditor.g:5103:2: rule__FadeOut__Group__8__Impl rule__FadeOut__Group__9
            {
            pushFollow(FOLLOW_32);
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
    // InternalCinEditor.g:5110:1: rule__FadeOut__Group__8__Impl : ( ( rule__FadeOut__ElementsAssignment_8 ) ) ;
    public final void rule__FadeOut__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5114:1: ( ( ( rule__FadeOut__ElementsAssignment_8 ) ) )
            // InternalCinEditor.g:5115:1: ( ( rule__FadeOut__ElementsAssignment_8 ) )
            {
            // InternalCinEditor.g:5115:1: ( ( rule__FadeOut__ElementsAssignment_8 ) )
            // InternalCinEditor.g:5116:2: ( rule__FadeOut__ElementsAssignment_8 )
            {
             before(grammarAccess.getFadeOutAccess().getElementsAssignment_8()); 
            // InternalCinEditor.g:5117:2: ( rule__FadeOut__ElementsAssignment_8 )
            // InternalCinEditor.g:5117:3: rule__FadeOut__ElementsAssignment_8
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
    // InternalCinEditor.g:5125:1: rule__FadeOut__Group__9 : rule__FadeOut__Group__9__Impl rule__FadeOut__Group__10 ;
    public final void rule__FadeOut__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5129:1: ( rule__FadeOut__Group__9__Impl rule__FadeOut__Group__10 )
            // InternalCinEditor.g:5130:2: rule__FadeOut__Group__9__Impl rule__FadeOut__Group__10
            {
            pushFollow(FOLLOW_32);
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
    // InternalCinEditor.g:5137:1: rule__FadeOut__Group__9__Impl : ( ( rule__FadeOut__Group_9__0 )* ) ;
    public final void rule__FadeOut__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5141:1: ( ( ( rule__FadeOut__Group_9__0 )* ) )
            // InternalCinEditor.g:5142:1: ( ( rule__FadeOut__Group_9__0 )* )
            {
            // InternalCinEditor.g:5142:1: ( ( rule__FadeOut__Group_9__0 )* )
            // InternalCinEditor.g:5143:2: ( rule__FadeOut__Group_9__0 )*
            {
             before(grammarAccess.getFadeOutAccess().getGroup_9()); 
            // InternalCinEditor.g:5144:2: ( rule__FadeOut__Group_9__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==17) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalCinEditor.g:5144:3: rule__FadeOut__Group_9__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__FadeOut__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalCinEditor.g:5152:1: rule__FadeOut__Group__10 : rule__FadeOut__Group__10__Impl ;
    public final void rule__FadeOut__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5156:1: ( rule__FadeOut__Group__10__Impl )
            // InternalCinEditor.g:5157:2: rule__FadeOut__Group__10__Impl
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
    // InternalCinEditor.g:5163:1: rule__FadeOut__Group__10__Impl : ( ']' ) ;
    public final void rule__FadeOut__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5167:1: ( ( ']' ) )
            // InternalCinEditor.g:5168:1: ( ']' )
            {
            // InternalCinEditor.g:5168:1: ( ']' )
            // InternalCinEditor.g:5169:2: ']'
            {
             before(grammarAccess.getFadeOutAccess().getRightSquareBracketKeyword_10()); 
            match(input,50,FOLLOW_2); 
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
    // InternalCinEditor.g:5179:1: rule__FadeOut__Group_9__0 : rule__FadeOut__Group_9__0__Impl rule__FadeOut__Group_9__1 ;
    public final void rule__FadeOut__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5183:1: ( rule__FadeOut__Group_9__0__Impl rule__FadeOut__Group_9__1 )
            // InternalCinEditor.g:5184:2: rule__FadeOut__Group_9__0__Impl rule__FadeOut__Group_9__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:5191:1: rule__FadeOut__Group_9__0__Impl : ( ',' ) ;
    public final void rule__FadeOut__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5195:1: ( ( ',' ) )
            // InternalCinEditor.g:5196:1: ( ',' )
            {
            // InternalCinEditor.g:5196:1: ( ',' )
            // InternalCinEditor.g:5197:2: ','
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
    // InternalCinEditor.g:5206:1: rule__FadeOut__Group_9__1 : rule__FadeOut__Group_9__1__Impl ;
    public final void rule__FadeOut__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5210:1: ( rule__FadeOut__Group_9__1__Impl )
            // InternalCinEditor.g:5211:2: rule__FadeOut__Group_9__1__Impl
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
    // InternalCinEditor.g:5217:1: rule__FadeOut__Group_9__1__Impl : ( ( rule__FadeOut__ElementsAssignment_9_1 ) ) ;
    public final void rule__FadeOut__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5221:1: ( ( ( rule__FadeOut__ElementsAssignment_9_1 ) ) )
            // InternalCinEditor.g:5222:1: ( ( rule__FadeOut__ElementsAssignment_9_1 ) )
            {
            // InternalCinEditor.g:5222:1: ( ( rule__FadeOut__ElementsAssignment_9_1 ) )
            // InternalCinEditor.g:5223:2: ( rule__FadeOut__ElementsAssignment_9_1 )
            {
             before(grammarAccess.getFadeOutAccess().getElementsAssignment_9_1()); 
            // InternalCinEditor.g:5224:2: ( rule__FadeOut__ElementsAssignment_9_1 )
            // InternalCinEditor.g:5224:3: rule__FadeOut__ElementsAssignment_9_1
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
    // InternalCinEditor.g:5233:1: rule__Translate__Group__0 : rule__Translate__Group__0__Impl rule__Translate__Group__1 ;
    public final void rule__Translate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5237:1: ( rule__Translate__Group__0__Impl rule__Translate__Group__1 )
            // InternalCinEditor.g:5238:2: rule__Translate__Group__0__Impl rule__Translate__Group__1
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
    // InternalCinEditor.g:5245:1: rule__Translate__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__Translate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5249:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:5250:1: ( 'Effect' )
            {
            // InternalCinEditor.g:5250:1: ( 'Effect' )
            // InternalCinEditor.g:5251:2: 'Effect'
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
    // InternalCinEditor.g:5260:1: rule__Translate__Group__1 : rule__Translate__Group__1__Impl rule__Translate__Group__2 ;
    public final void rule__Translate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5264:1: ( rule__Translate__Group__1__Impl rule__Translate__Group__2 )
            // InternalCinEditor.g:5265:2: rule__Translate__Group__1__Impl rule__Translate__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:5272:1: rule__Translate__Group__1__Impl : ( ( rule__Translate__NameAssignment_1 ) ) ;
    public final void rule__Translate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5276:1: ( ( ( rule__Translate__NameAssignment_1 ) ) )
            // InternalCinEditor.g:5277:1: ( ( rule__Translate__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:5277:1: ( ( rule__Translate__NameAssignment_1 ) )
            // InternalCinEditor.g:5278:2: ( rule__Translate__NameAssignment_1 )
            {
             before(grammarAccess.getTranslateAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:5279:2: ( rule__Translate__NameAssignment_1 )
            // InternalCinEditor.g:5279:3: rule__Translate__NameAssignment_1
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
    // InternalCinEditor.g:5287:1: rule__Translate__Group__2 : rule__Translate__Group__2__Impl rule__Translate__Group__3 ;
    public final void rule__Translate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5291:1: ( rule__Translate__Group__2__Impl rule__Translate__Group__3 )
            // InternalCinEditor.g:5292:2: rule__Translate__Group__2__Impl rule__Translate__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalCinEditor.g:5299:1: rule__Translate__Group__2__Impl : ( '=' ) ;
    public final void rule__Translate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5303:1: ( ( '=' ) )
            // InternalCinEditor.g:5304:1: ( '=' )
            {
            // InternalCinEditor.g:5304:1: ( '=' )
            // InternalCinEditor.g:5305:2: '='
            {
             before(grammarAccess.getTranslateAccess().getEqualsSignKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCinEditor.g:5314:1: rule__Translate__Group__3 : rule__Translate__Group__3__Impl rule__Translate__Group__4 ;
    public final void rule__Translate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5318:1: ( rule__Translate__Group__3__Impl rule__Translate__Group__4 )
            // InternalCinEditor.g:5319:2: rule__Translate__Group__3__Impl rule__Translate__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalCinEditor.g:5326:1: rule__Translate__Group__3__Impl : ( 'Translate' ) ;
    public final void rule__Translate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5330:1: ( ( 'Translate' ) )
            // InternalCinEditor.g:5331:1: ( 'Translate' )
            {
            // InternalCinEditor.g:5331:1: ( 'Translate' )
            // InternalCinEditor.g:5332:2: 'Translate'
            {
             before(grammarAccess.getTranslateAccess().getTranslateKeyword_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalCinEditor.g:5341:1: rule__Translate__Group__4 : rule__Translate__Group__4__Impl rule__Translate__Group__5 ;
    public final void rule__Translate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5345:1: ( rule__Translate__Group__4__Impl rule__Translate__Group__5 )
            // InternalCinEditor.g:5346:2: rule__Translate__Group__4__Impl rule__Translate__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalCinEditor.g:5353:1: rule__Translate__Group__4__Impl : ( ( rule__Translate__PositionToTranslateAssignment_4 ) ) ;
    public final void rule__Translate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5357:1: ( ( ( rule__Translate__PositionToTranslateAssignment_4 ) ) )
            // InternalCinEditor.g:5358:1: ( ( rule__Translate__PositionToTranslateAssignment_4 ) )
            {
            // InternalCinEditor.g:5358:1: ( ( rule__Translate__PositionToTranslateAssignment_4 ) )
            // InternalCinEditor.g:5359:2: ( rule__Translate__PositionToTranslateAssignment_4 )
            {
             before(grammarAccess.getTranslateAccess().getPositionToTranslateAssignment_4()); 
            // InternalCinEditor.g:5360:2: ( rule__Translate__PositionToTranslateAssignment_4 )
            // InternalCinEditor.g:5360:3: rule__Translate__PositionToTranslateAssignment_4
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
    // InternalCinEditor.g:5368:1: rule__Translate__Group__5 : rule__Translate__Group__5__Impl rule__Translate__Group__6 ;
    public final void rule__Translate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5372:1: ( rule__Translate__Group__5__Impl rule__Translate__Group__6 )
            // InternalCinEditor.g:5373:2: rule__Translate__Group__5__Impl rule__Translate__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalCinEditor.g:5380:1: rule__Translate__Group__5__Impl : ( ( rule__Translate__Group_5__0 )? ) ;
    public final void rule__Translate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5384:1: ( ( ( rule__Translate__Group_5__0 )? ) )
            // InternalCinEditor.g:5385:1: ( ( rule__Translate__Group_5__0 )? )
            {
            // InternalCinEditor.g:5385:1: ( ( rule__Translate__Group_5__0 )? )
            // InternalCinEditor.g:5386:2: ( rule__Translate__Group_5__0 )?
            {
             before(grammarAccess.getTranslateAccess().getGroup_5()); 
            // InternalCinEditor.g:5387:2: ( rule__Translate__Group_5__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==37) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCinEditor.g:5387:3: rule__Translate__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Translate__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTranslateAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalCinEditor.g:5395:1: rule__Translate__Group__6 : rule__Translate__Group__6__Impl rule__Translate__Group__7 ;
    public final void rule__Translate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5399:1: ( rule__Translate__Group__6__Impl rule__Translate__Group__7 )
            // InternalCinEditor.g:5400:2: rule__Translate__Group__6__Impl rule__Translate__Group__7
            {
            pushFollow(FOLLOW_37);
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
    // InternalCinEditor.g:5407:1: rule__Translate__Group__6__Impl : ( ( rule__Translate__Group_6__0 )? ) ;
    public final void rule__Translate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5411:1: ( ( ( rule__Translate__Group_6__0 )? ) )
            // InternalCinEditor.g:5412:1: ( ( rule__Translate__Group_6__0 )? )
            {
            // InternalCinEditor.g:5412:1: ( ( rule__Translate__Group_6__0 )? )
            // InternalCinEditor.g:5413:2: ( rule__Translate__Group_6__0 )?
            {
             before(grammarAccess.getTranslateAccess().getGroup_6()); 
            // InternalCinEditor.g:5414:2: ( rule__Translate__Group_6__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==39) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCinEditor.g:5414:3: rule__Translate__Group_6__0
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
    // InternalCinEditor.g:5422:1: rule__Translate__Group__7 : rule__Translate__Group__7__Impl rule__Translate__Group__8 ;
    public final void rule__Translate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5426:1: ( rule__Translate__Group__7__Impl rule__Translate__Group__8 )
            // InternalCinEditor.g:5427:2: rule__Translate__Group__7__Impl rule__Translate__Group__8
            {
            pushFollow(FOLLOW_31);
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
    // InternalCinEditor.g:5434:1: rule__Translate__Group__7__Impl : ( 'on' ) ;
    public final void rule__Translate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5438:1: ( ( 'on' ) )
            // InternalCinEditor.g:5439:1: ( 'on' )
            {
            // InternalCinEditor.g:5439:1: ( 'on' )
            // InternalCinEditor.g:5440:2: 'on'
            {
             before(grammarAccess.getTranslateAccess().getOnKeyword_7()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCinEditor.g:5449:1: rule__Translate__Group__8 : rule__Translate__Group__8__Impl rule__Translate__Group__9 ;
    public final void rule__Translate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5453:1: ( rule__Translate__Group__8__Impl rule__Translate__Group__9 )
            // InternalCinEditor.g:5454:2: rule__Translate__Group__8__Impl rule__Translate__Group__9
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:5461:1: rule__Translate__Group__8__Impl : ( '[' ) ;
    public final void rule__Translate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5465:1: ( ( '[' ) )
            // InternalCinEditor.g:5466:1: ( '[' )
            {
            // InternalCinEditor.g:5466:1: ( '[' )
            // InternalCinEditor.g:5467:2: '['
            {
             before(grammarAccess.getTranslateAccess().getLeftSquareBracketKeyword_8()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCinEditor.g:5476:1: rule__Translate__Group__9 : rule__Translate__Group__9__Impl rule__Translate__Group__10 ;
    public final void rule__Translate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5480:1: ( rule__Translate__Group__9__Impl rule__Translate__Group__10 )
            // InternalCinEditor.g:5481:2: rule__Translate__Group__9__Impl rule__Translate__Group__10
            {
            pushFollow(FOLLOW_32);
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
    // InternalCinEditor.g:5488:1: rule__Translate__Group__9__Impl : ( ( rule__Translate__ElementsAssignment_9 ) ) ;
    public final void rule__Translate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5492:1: ( ( ( rule__Translate__ElementsAssignment_9 ) ) )
            // InternalCinEditor.g:5493:1: ( ( rule__Translate__ElementsAssignment_9 ) )
            {
            // InternalCinEditor.g:5493:1: ( ( rule__Translate__ElementsAssignment_9 ) )
            // InternalCinEditor.g:5494:2: ( rule__Translate__ElementsAssignment_9 )
            {
             before(grammarAccess.getTranslateAccess().getElementsAssignment_9()); 
            // InternalCinEditor.g:5495:2: ( rule__Translate__ElementsAssignment_9 )
            // InternalCinEditor.g:5495:3: rule__Translate__ElementsAssignment_9
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
    // InternalCinEditor.g:5503:1: rule__Translate__Group__10 : rule__Translate__Group__10__Impl rule__Translate__Group__11 ;
    public final void rule__Translate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5507:1: ( rule__Translate__Group__10__Impl rule__Translate__Group__11 )
            // InternalCinEditor.g:5508:2: rule__Translate__Group__10__Impl rule__Translate__Group__11
            {
            pushFollow(FOLLOW_32);
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
    // InternalCinEditor.g:5515:1: rule__Translate__Group__10__Impl : ( ( rule__Translate__Group_10__0 )* ) ;
    public final void rule__Translate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5519:1: ( ( ( rule__Translate__Group_10__0 )* ) )
            // InternalCinEditor.g:5520:1: ( ( rule__Translate__Group_10__0 )* )
            {
            // InternalCinEditor.g:5520:1: ( ( rule__Translate__Group_10__0 )* )
            // InternalCinEditor.g:5521:2: ( rule__Translate__Group_10__0 )*
            {
             before(grammarAccess.getTranslateAccess().getGroup_10()); 
            // InternalCinEditor.g:5522:2: ( rule__Translate__Group_10__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==17) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalCinEditor.g:5522:3: rule__Translate__Group_10__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Translate__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalCinEditor.g:5530:1: rule__Translate__Group__11 : rule__Translate__Group__11__Impl ;
    public final void rule__Translate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5534:1: ( rule__Translate__Group__11__Impl )
            // InternalCinEditor.g:5535:2: rule__Translate__Group__11__Impl
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
    // InternalCinEditor.g:5541:1: rule__Translate__Group__11__Impl : ( ']' ) ;
    public final void rule__Translate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5545:1: ( ( ']' ) )
            // InternalCinEditor.g:5546:1: ( ']' )
            {
            // InternalCinEditor.g:5546:1: ( ']' )
            // InternalCinEditor.g:5547:2: ']'
            {
             before(grammarAccess.getTranslateAccess().getRightSquareBracketKeyword_11()); 
            match(input,50,FOLLOW_2); 
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


    // $ANTLR start "rule__Translate__Group_5__0"
    // InternalCinEditor.g:5557:1: rule__Translate__Group_5__0 : rule__Translate__Group_5__0__Impl rule__Translate__Group_5__1 ;
    public final void rule__Translate__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5561:1: ( rule__Translate__Group_5__0__Impl rule__Translate__Group_5__1 )
            // InternalCinEditor.g:5562:2: rule__Translate__Group_5__0__Impl rule__Translate__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Translate__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Translate__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group_5__0"


    // $ANTLR start "rule__Translate__Group_5__0__Impl"
    // InternalCinEditor.g:5569:1: rule__Translate__Group_5__0__Impl : ( 'startAt' ) ;
    public final void rule__Translate__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5573:1: ( ( 'startAt' ) )
            // InternalCinEditor.g:5574:1: ( 'startAt' )
            {
            // InternalCinEditor.g:5574:1: ( 'startAt' )
            // InternalCinEditor.g:5575:2: 'startAt'
            {
             before(grammarAccess.getTranslateAccess().getStartAtKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getStartAtKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group_5__0__Impl"


    // $ANTLR start "rule__Translate__Group_5__1"
    // InternalCinEditor.g:5584:1: rule__Translate__Group_5__1 : rule__Translate__Group_5__1__Impl ;
    public final void rule__Translate__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5588:1: ( rule__Translate__Group_5__1__Impl )
            // InternalCinEditor.g:5589:2: rule__Translate__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Translate__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group_5__1"


    // $ANTLR start "rule__Translate__Group_5__1__Impl"
    // InternalCinEditor.g:5595:1: rule__Translate__Group_5__1__Impl : ( ( rule__Translate__BeginTimeAssignment_5_1 ) ) ;
    public final void rule__Translate__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5599:1: ( ( ( rule__Translate__BeginTimeAssignment_5_1 ) ) )
            // InternalCinEditor.g:5600:1: ( ( rule__Translate__BeginTimeAssignment_5_1 ) )
            {
            // InternalCinEditor.g:5600:1: ( ( rule__Translate__BeginTimeAssignment_5_1 ) )
            // InternalCinEditor.g:5601:2: ( rule__Translate__BeginTimeAssignment_5_1 )
            {
             before(grammarAccess.getTranslateAccess().getBeginTimeAssignment_5_1()); 
            // InternalCinEditor.g:5602:2: ( rule__Translate__BeginTimeAssignment_5_1 )
            // InternalCinEditor.g:5602:3: rule__Translate__BeginTimeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Translate__BeginTimeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTranslateAccess().getBeginTimeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__Group_5__1__Impl"


    // $ANTLR start "rule__Translate__Group_6__0"
    // InternalCinEditor.g:5611:1: rule__Translate__Group_6__0 : rule__Translate__Group_6__0__Impl rule__Translate__Group_6__1 ;
    public final void rule__Translate__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5615:1: ( rule__Translate__Group_6__0__Impl rule__Translate__Group_6__1 )
            // InternalCinEditor.g:5616:2: rule__Translate__Group_6__0__Impl rule__Translate__Group_6__1
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
    // InternalCinEditor.g:5623:1: rule__Translate__Group_6__0__Impl : ( 'during' ) ;
    public final void rule__Translate__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5627:1: ( ( 'during' ) )
            // InternalCinEditor.g:5628:1: ( 'during' )
            {
            // InternalCinEditor.g:5628:1: ( 'during' )
            // InternalCinEditor.g:5629:2: 'during'
            {
             before(grammarAccess.getTranslateAccess().getDuringKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCinEditor.g:5638:1: rule__Translate__Group_6__1 : rule__Translate__Group_6__1__Impl ;
    public final void rule__Translate__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5642:1: ( rule__Translate__Group_6__1__Impl )
            // InternalCinEditor.g:5643:2: rule__Translate__Group_6__1__Impl
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
    // InternalCinEditor.g:5649:1: rule__Translate__Group_6__1__Impl : ( ( rule__Translate__DurationAssignment_6_1 ) ) ;
    public final void rule__Translate__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5653:1: ( ( ( rule__Translate__DurationAssignment_6_1 ) ) )
            // InternalCinEditor.g:5654:1: ( ( rule__Translate__DurationAssignment_6_1 ) )
            {
            // InternalCinEditor.g:5654:1: ( ( rule__Translate__DurationAssignment_6_1 ) )
            // InternalCinEditor.g:5655:2: ( rule__Translate__DurationAssignment_6_1 )
            {
             before(grammarAccess.getTranslateAccess().getDurationAssignment_6_1()); 
            // InternalCinEditor.g:5656:2: ( rule__Translate__DurationAssignment_6_1 )
            // InternalCinEditor.g:5656:3: rule__Translate__DurationAssignment_6_1
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
    // InternalCinEditor.g:5665:1: rule__Translate__Group_10__0 : rule__Translate__Group_10__0__Impl rule__Translate__Group_10__1 ;
    public final void rule__Translate__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5669:1: ( rule__Translate__Group_10__0__Impl rule__Translate__Group_10__1 )
            // InternalCinEditor.g:5670:2: rule__Translate__Group_10__0__Impl rule__Translate__Group_10__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:5677:1: rule__Translate__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Translate__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5681:1: ( ( ',' ) )
            // InternalCinEditor.g:5682:1: ( ',' )
            {
            // InternalCinEditor.g:5682:1: ( ',' )
            // InternalCinEditor.g:5683:2: ','
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
    // InternalCinEditor.g:5692:1: rule__Translate__Group_10__1 : rule__Translate__Group_10__1__Impl ;
    public final void rule__Translate__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5696:1: ( rule__Translate__Group_10__1__Impl )
            // InternalCinEditor.g:5697:2: rule__Translate__Group_10__1__Impl
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
    // InternalCinEditor.g:5703:1: rule__Translate__Group_10__1__Impl : ( ( rule__Translate__ElementsAssignment_10_1 ) ) ;
    public final void rule__Translate__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5707:1: ( ( ( rule__Translate__ElementsAssignment_10_1 ) ) )
            // InternalCinEditor.g:5708:1: ( ( rule__Translate__ElementsAssignment_10_1 ) )
            {
            // InternalCinEditor.g:5708:1: ( ( rule__Translate__ElementsAssignment_10_1 ) )
            // InternalCinEditor.g:5709:2: ( rule__Translate__ElementsAssignment_10_1 )
            {
             before(grammarAccess.getTranslateAccess().getElementsAssignment_10_1()); 
            // InternalCinEditor.g:5710:2: ( rule__Translate__ElementsAssignment_10_1 )
            // InternalCinEditor.g:5710:3: rule__Translate__ElementsAssignment_10_1
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
    // InternalCinEditor.g:5719:1: rule__Movie__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Movie__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5723:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5724:2: ( ruleEString )
            {
            // InternalCinEditor.g:5724:2: ( ruleEString )
            // InternalCinEditor.g:5725:3: ruleEString
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
    // InternalCinEditor.g:5734:1: rule__Movie__DimensionAssignment_2 : ( ruleDimension ) ;
    public final void rule__Movie__DimensionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5738:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:5739:2: ( ruleDimension )
            {
            // InternalCinEditor.g:5739:2: ( ruleDimension )
            // InternalCinEditor.g:5740:3: ruleDimension
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
    // InternalCinEditor.g:5749:1: rule__Movie__FpsAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Movie__FpsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5753:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5754:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5754:2: ( ruleEInt )
            // InternalCinEditor.g:5755:3: ruleEInt
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
    // InternalCinEditor.g:5764:1: rule__Movie__LayersAssignment_4 : ( ruleLayer ) ;
    public final void rule__Movie__LayersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5768:1: ( ( ruleLayer ) )
            // InternalCinEditor.g:5769:2: ( ruleLayer )
            {
            // InternalCinEditor.g:5769:2: ( ruleLayer )
            // InternalCinEditor.g:5770:3: ruleLayer
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
    // InternalCinEditor.g:5779:1: rule__Layer__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Layer__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5783:1: ( ( ruleElement ) )
            // InternalCinEditor.g:5784:2: ( ruleElement )
            {
            // InternalCinEditor.g:5784:2: ( ruleElement )
            // InternalCinEditor.g:5785:3: ruleElement
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
    // InternalCinEditor.g:5794:1: rule__Position__XAssignment_1_1 : ( ruleItemPosition ) ;
    public final void rule__Position__XAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5798:1: ( ( ruleItemPosition ) )
            // InternalCinEditor.g:5799:2: ( ruleItemPosition )
            {
            // InternalCinEditor.g:5799:2: ( ruleItemPosition )
            // InternalCinEditor.g:5800:3: ruleItemPosition
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
    // InternalCinEditor.g:5809:1: rule__Position__YAssignment_1_3 : ( ruleItemPosition ) ;
    public final void rule__Position__YAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5813:1: ( ( ruleItemPosition ) )
            // InternalCinEditor.g:5814:2: ( ruleItemPosition )
            {
            // InternalCinEditor.g:5814:2: ( ruleItemPosition )
            // InternalCinEditor.g:5815:3: ruleItemPosition
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
    // InternalCinEditor.g:5824:1: rule__ItemPositionInt__PositionAssignment : ( ruleEInt ) ;
    public final void rule__ItemPositionInt__PositionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5828:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5829:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5829:2: ( ruleEInt )
            // InternalCinEditor.g:5830:3: ruleEInt
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
    // InternalCinEditor.g:5839:1: rule__ItemPositionString__PositionAssignment : ( ( rule__ItemPositionString__PositionAlternatives_0 ) ) ;
    public final void rule__ItemPositionString__PositionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5843:1: ( ( ( rule__ItemPositionString__PositionAlternatives_0 ) ) )
            // InternalCinEditor.g:5844:2: ( ( rule__ItemPositionString__PositionAlternatives_0 ) )
            {
            // InternalCinEditor.g:5844:2: ( ( rule__ItemPositionString__PositionAlternatives_0 ) )
            // InternalCinEditor.g:5845:3: ( rule__ItemPositionString__PositionAlternatives_0 )
            {
             before(grammarAccess.getItemPositionStringAccess().getPositionAlternatives_0()); 
            // InternalCinEditor.g:5846:3: ( rule__ItemPositionString__PositionAlternatives_0 )
            // InternalCinEditor.g:5846:4: rule__ItemPositionString__PositionAlternatives_0
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
    // InternalCinEditor.g:5854:1: rule__Dimension__WidthAssignment_1 : ( ruleEInt ) ;
    public final void rule__Dimension__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5858:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5859:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5859:2: ( ruleEInt )
            // InternalCinEditor.g:5860:3: ruleEInt
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
    // InternalCinEditor.g:5869:1: rule__Dimension__HeightAssignment_3 : ( ruleEInt ) ;
    public final void rule__Dimension__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5873:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5874:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5874:2: ( ruleEInt )
            // InternalCinEditor.g:5875:3: ruleEInt
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
    // InternalCinEditor.g:5884:1: rule__HexadecimalColor__HexadecimalValueAssignment_1 : ( ruleEString ) ;
    public final void rule__HexadecimalColor__HexadecimalValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5888:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5889:2: ( ruleEString )
            {
            // InternalCinEditor.g:5889:2: ( ruleEString )
            // InternalCinEditor.g:5890:3: ruleEString
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


    // $ANTLR start "rule__Margin__TypeAssignment_0"
    // InternalCinEditor.g:5899:1: rule__Margin__TypeAssignment_0 : ( ruleMARGIN_NAME ) ;
    public final void rule__Margin__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5903:1: ( ( ruleMARGIN_NAME ) )
            // InternalCinEditor.g:5904:2: ( ruleMARGIN_NAME )
            {
            // InternalCinEditor.g:5904:2: ( ruleMARGIN_NAME )
            // InternalCinEditor.g:5905:3: ruleMARGIN_NAME
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
    // InternalCinEditor.g:5914:1: rule__Margin__SizeAssignment_2 : ( ruleEInt ) ;
    public final void rule__Margin__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5918:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5919:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5919:2: ( ruleEInt )
            // InternalCinEditor.g:5920:3: ruleEInt
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
    // InternalCinEditor.g:5929:1: rule__Margin__MarginColorAssignment_3 : ( ruleHexadecimalColor ) ;
    public final void rule__Margin__MarginColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5933:1: ( ( ruleHexadecimalColor ) )
            // InternalCinEditor.g:5934:2: ( ruleHexadecimalColor )
            {
            // InternalCinEditor.g:5934:2: ( ruleHexadecimalColor )
            // InternalCinEditor.g:5935:3: ruleHexadecimalColor
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
    // InternalCinEditor.g:5944:1: rule__Margin__MarginColorOpacityAssignment_4_1 : ( ruleEFloat ) ;
    public final void rule__Margin__MarginColorOpacityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5948:1: ( ( ruleEFloat ) )
            // InternalCinEditor.g:5949:2: ( ruleEFloat )
            {
            // InternalCinEditor.g:5949:2: ( ruleEFloat )
            // InternalCinEditor.g:5950:3: ruleEFloat
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
    // InternalCinEditor.g:5959:1: rule__AudioElement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AudioElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5963:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5964:2: ( ruleEString )
            {
            // InternalCinEditor.g:5964:2: ( ruleEString )
            // InternalCinEditor.g:5965:3: ruleEString
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
    // InternalCinEditor.g:5974:1: rule__AudioElement__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__AudioElement__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5978:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5979:2: ( ruleEString )
            {
            // InternalCinEditor.g:5979:2: ( ruleEString )
            // InternalCinEditor.g:5980:3: ruleEString
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
    // InternalCinEditor.g:5989:1: rule__AudioElement__VolumeAssignment_4_1 : ( ruleEFloat ) ;
    public final void rule__AudioElement__VolumeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5993:1: ( ( ruleEFloat ) )
            // InternalCinEditor.g:5994:2: ( ruleEFloat )
            {
            // InternalCinEditor.g:5994:2: ( ruleEFloat )
            // InternalCinEditor.g:5995:3: ruleEFloat
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
    // InternalCinEditor.g:6004:1: rule__AudioElement__FadeInAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__FadeInAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6008:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6009:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6009:2: ( ruleEInt )
            // InternalCinEditor.g:6010:3: ruleEInt
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
    // InternalCinEditor.g:6019:1: rule__AudioElement__FadeOutAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__FadeOutAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6023:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6024:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6024:2: ( ruleEInt )
            // InternalCinEditor.g:6025:3: ruleEInt
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


    // $ANTLR start "rule__AudioElement__BeginTimeAssignment_7_1"
    // InternalCinEditor.g:6034:1: rule__AudioElement__BeginTimeAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__BeginTimeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6038:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6039:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6039:2: ( ruleEInt )
            // InternalCinEditor.g:6040:3: ruleEInt
            {
             before(grammarAccess.getAudioElementAccess().getBeginTimeEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAudioElementAccess().getBeginTimeEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__BeginTimeAssignment_7_1"


    // $ANTLR start "rule__AudioElement__BeginCropTimeAssignment_8_1"
    // InternalCinEditor.g:6049:1: rule__AudioElement__BeginCropTimeAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__BeginCropTimeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6053:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6054:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6054:2: ( ruleEInt )
            // InternalCinEditor.g:6055:3: ruleEInt
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


    // $ANTLR start "rule__AudioElement__DurationAssignment_9_1"
    // InternalCinEditor.g:6064:1: rule__AudioElement__DurationAssignment_9_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__DurationAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6068:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6069:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6069:2: ( ruleEInt )
            // InternalCinEditor.g:6070:3: ruleEInt
            {
             before(grammarAccess.getAudioElementAccess().getDurationEIntParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAudioElementAccess().getDurationEIntParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__DurationAssignment_9_1"


    // $ANTLR start "rule__AudioElement__ElementAssignment_11"
    // InternalCinEditor.g:6079:1: rule__AudioElement__ElementAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__AudioElement__ElementAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6083:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:6084:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:6084:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:6085:3: ( RULE_ID )
            {
             before(grammarAccess.getAudioElementAccess().getElementGraphicalElementCrossReference_11_0()); 
            // InternalCinEditor.g:6086:3: ( RULE_ID )
            // InternalCinEditor.g:6087:4: RULE_ID
            {
             before(grammarAccess.getAudioElementAccess().getElementGraphicalElementIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getElementGraphicalElementIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getAudioElementAccess().getElementGraphicalElementCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__ElementAssignment_11"


    // $ANTLR start "rule__Text__NameAssignment_1"
    // InternalCinEditor.g:6098:1: rule__Text__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Text__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6102:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6103:2: ( ruleEString )
            {
            // InternalCinEditor.g:6103:2: ( ruleEString )
            // InternalCinEditor.g:6104:3: ruleEString
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
    // InternalCinEditor.g:6113:1: rule__Text__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__Text__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6117:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6118:2: ( ruleEString )
            {
            // InternalCinEditor.g:6118:2: ( ruleEString )
            // InternalCinEditor.g:6119:3: ruleEString
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
    // InternalCinEditor.g:6128:1: rule__Text__FontSizeAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Text__FontSizeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6132:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6133:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6133:2: ( ruleEInt )
            // InternalCinEditor.g:6134:3: ruleEInt
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
    // InternalCinEditor.g:6143:1: rule__Text__PositionAssignment_5 : ( rulePosition ) ;
    public final void rule__Text__PositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6147:1: ( ( rulePosition ) )
            // InternalCinEditor.g:6148:2: ( rulePosition )
            {
            // InternalCinEditor.g:6148:2: ( rulePosition )
            // InternalCinEditor.g:6149:3: rulePosition
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
    // InternalCinEditor.g:6158:1: rule__Text__MarginsAssignment_6_1 : ( ruleMargin ) ;
    public final void rule__Text__MarginsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6162:1: ( ( ruleMargin ) )
            // InternalCinEditor.g:6163:2: ( ruleMargin )
            {
            // InternalCinEditor.g:6163:2: ( ruleMargin )
            // InternalCinEditor.g:6164:3: ruleMargin
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


    // $ANTLR start "rule__Text__BeginTimeAssignment_7_1"
    // InternalCinEditor.g:6173:1: rule__Text__BeginTimeAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Text__BeginTimeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6177:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6178:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6178:2: ( ruleEInt )
            // InternalCinEditor.g:6179:3: ruleEInt
            {
             before(grammarAccess.getTextAccess().getBeginTimeEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextAccess().getBeginTimeEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__BeginTimeAssignment_7_1"


    // $ANTLR start "rule__Text__DurationAssignment_8_1"
    // InternalCinEditor.g:6188:1: rule__Text__DurationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Text__DurationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6192:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6193:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6193:2: ( ruleEInt )
            // InternalCinEditor.g:6194:3: ruleEInt
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
    // InternalCinEditor.g:6203:1: rule__Text__ColorAssignment_9 : ( ruleHexadecimalColor ) ;
    public final void rule__Text__ColorAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6207:1: ( ( ruleHexadecimalColor ) )
            // InternalCinEditor.g:6208:2: ( ruleHexadecimalColor )
            {
            // InternalCinEditor.g:6208:2: ( ruleHexadecimalColor )
            // InternalCinEditor.g:6209:3: ruleHexadecimalColor
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
    // InternalCinEditor.g:6218:1: rule__Picture__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Picture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6222:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6223:2: ( ruleEString )
            {
            // InternalCinEditor.g:6223:2: ( ruleEString )
            // InternalCinEditor.g:6224:3: ruleEString
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
    // InternalCinEditor.g:6233:1: rule__Picture__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Picture__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6237:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6238:2: ( ruleEString )
            {
            // InternalCinEditor.g:6238:2: ( ruleEString )
            // InternalCinEditor.g:6239:3: ruleEString
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
    // InternalCinEditor.g:6248:1: rule__Picture__PositionAssignment_4 : ( rulePosition ) ;
    public final void rule__Picture__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6252:1: ( ( rulePosition ) )
            // InternalCinEditor.g:6253:2: ( rulePosition )
            {
            // InternalCinEditor.g:6253:2: ( rulePosition )
            // InternalCinEditor.g:6254:3: rulePosition
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
    // InternalCinEditor.g:6263:1: rule__Picture__DimensionAssignment_5 : ( ruleDimension ) ;
    public final void rule__Picture__DimensionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6267:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:6268:2: ( ruleDimension )
            {
            // InternalCinEditor.g:6268:2: ( ruleDimension )
            // InternalCinEditor.g:6269:3: ruleDimension
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
    // InternalCinEditor.g:6278:1: rule__Picture__MarginsAssignment_6_1 : ( ruleMargin ) ;
    public final void rule__Picture__MarginsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6282:1: ( ( ruleMargin ) )
            // InternalCinEditor.g:6283:2: ( ruleMargin )
            {
            // InternalCinEditor.g:6283:2: ( ruleMargin )
            // InternalCinEditor.g:6284:3: ruleMargin
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


    // $ANTLR start "rule__Picture__BeginTimeAssignment_7_1"
    // InternalCinEditor.g:6293:1: rule__Picture__BeginTimeAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Picture__BeginTimeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6297:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6298:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6298:2: ( ruleEInt )
            // InternalCinEditor.g:6299:3: ruleEInt
            {
             before(grammarAccess.getPictureAccess().getBeginTimeEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getBeginTimeEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__BeginTimeAssignment_7_1"


    // $ANTLR start "rule__Picture__DurationAssignment_8_1"
    // InternalCinEditor.g:6308:1: rule__Picture__DurationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Picture__DurationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6312:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6313:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6313:2: ( ruleEInt )
            // InternalCinEditor.g:6314:3: ruleEInt
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
    // InternalCinEditor.g:6323:1: rule__Video__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Video__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6327:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6328:2: ( ruleEString )
            {
            // InternalCinEditor.g:6328:2: ( ruleEString )
            // InternalCinEditor.g:6329:3: ruleEString
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
    // InternalCinEditor.g:6338:1: rule__Video__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Video__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6342:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6343:2: ( ruleEString )
            {
            // InternalCinEditor.g:6343:2: ( ruleEString )
            // InternalCinEditor.g:6344:3: ruleEString
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
    // InternalCinEditor.g:6353:1: rule__Video__EnableAudioAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__Video__EnableAudioAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6357:1: ( ( ruleEBoolean ) )
            // InternalCinEditor.g:6358:2: ( ruleEBoolean )
            {
            // InternalCinEditor.g:6358:2: ( ruleEBoolean )
            // InternalCinEditor.g:6359:3: ruleEBoolean
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
    // InternalCinEditor.g:6368:1: rule__Video__PositionAssignment_5 : ( rulePosition ) ;
    public final void rule__Video__PositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6372:1: ( ( rulePosition ) )
            // InternalCinEditor.g:6373:2: ( rulePosition )
            {
            // InternalCinEditor.g:6373:2: ( rulePosition )
            // InternalCinEditor.g:6374:3: rulePosition
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
    // InternalCinEditor.g:6383:1: rule__Video__DimensionAssignment_6 : ( ruleDimension ) ;
    public final void rule__Video__DimensionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6387:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:6388:2: ( ruleDimension )
            {
            // InternalCinEditor.g:6388:2: ( ruleDimension )
            // InternalCinEditor.g:6389:3: ruleDimension
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
    // InternalCinEditor.g:6398:1: rule__Video__MarginsAssignment_7_1 : ( ruleMargin ) ;
    public final void rule__Video__MarginsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6402:1: ( ( ruleMargin ) )
            // InternalCinEditor.g:6403:2: ( ruleMargin )
            {
            // InternalCinEditor.g:6403:2: ( ruleMargin )
            // InternalCinEditor.g:6404:3: ruleMargin
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


    // $ANTLR start "rule__Video__BeginTimeAssignment_8_1"
    // InternalCinEditor.g:6413:1: rule__Video__BeginTimeAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Video__BeginTimeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6417:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6418:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6418:2: ( ruleEInt )
            // InternalCinEditor.g:6419:3: ruleEInt
            {
             before(grammarAccess.getVideoAccess().getBeginTimeEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getBeginTimeEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__BeginTimeAssignment_8_1"


    // $ANTLR start "rule__Video__BeginCropTimeAssignment_9_1"
    // InternalCinEditor.g:6428:1: rule__Video__BeginCropTimeAssignment_9_1 : ( ruleEInt ) ;
    public final void rule__Video__BeginCropTimeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6432:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6433:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6433:2: ( ruleEInt )
            // InternalCinEditor.g:6434:3: ruleEInt
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
    // InternalCinEditor.g:6443:1: rule__Video__DurationAssignment_11 : ( ruleEInt ) ;
    public final void rule__Video__DurationAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6447:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6448:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6448:2: ( ruleEInt )
            // InternalCinEditor.g:6449:3: ruleEInt
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
    // InternalCinEditor.g:6458:1: rule__Rectangle__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Rectangle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6462:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6463:2: ( ruleEString )
            {
            // InternalCinEditor.g:6463:2: ( ruleEString )
            // InternalCinEditor.g:6464:3: ruleEString
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
    // InternalCinEditor.g:6473:1: rule__Rectangle__ColorAssignment_3 : ( ruleHexadecimalColor ) ;
    public final void rule__Rectangle__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6477:1: ( ( ruleHexadecimalColor ) )
            // InternalCinEditor.g:6478:2: ( ruleHexadecimalColor )
            {
            // InternalCinEditor.g:6478:2: ( ruleHexadecimalColor )
            // InternalCinEditor.g:6479:3: ruleHexadecimalColor
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
    // InternalCinEditor.g:6488:1: rule__Rectangle__PositionAssignment_4 : ( rulePosition ) ;
    public final void rule__Rectangle__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6492:1: ( ( rulePosition ) )
            // InternalCinEditor.g:6493:2: ( rulePosition )
            {
            // InternalCinEditor.g:6493:2: ( rulePosition )
            // InternalCinEditor.g:6494:3: rulePosition
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
    // InternalCinEditor.g:6503:1: rule__Rectangle__DimensionAssignment_5 : ( ruleDimension ) ;
    public final void rule__Rectangle__DimensionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6507:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:6508:2: ( ruleDimension )
            {
            // InternalCinEditor.g:6508:2: ( ruleDimension )
            // InternalCinEditor.g:6509:3: ruleDimension
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
    // InternalCinEditor.g:6518:1: rule__Rectangle__MarginsAssignment_6_1 : ( ruleMargin ) ;
    public final void rule__Rectangle__MarginsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6522:1: ( ( ruleMargin ) )
            // InternalCinEditor.g:6523:2: ( ruleMargin )
            {
            // InternalCinEditor.g:6523:2: ( ruleMargin )
            // InternalCinEditor.g:6524:3: ruleMargin
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


    // $ANTLR start "rule__Rectangle__BeginTimeAssignment_7_1"
    // InternalCinEditor.g:6533:1: rule__Rectangle__BeginTimeAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Rectangle__BeginTimeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6537:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6538:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6538:2: ( ruleEInt )
            // InternalCinEditor.g:6539:3: ruleEInt
            {
             before(grammarAccess.getRectangleAccess().getBeginTimeEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getBeginTimeEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__BeginTimeAssignment_7_1"


    // $ANTLR start "rule__Rectangle__DurationAssignment_8_1"
    // InternalCinEditor.g:6548:1: rule__Rectangle__DurationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Rectangle__DurationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6552:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6553:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6553:2: ( ruleEInt )
            // InternalCinEditor.g:6554:3: ruleEInt
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
    // InternalCinEditor.g:6563:1: rule__FadeIn__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FadeIn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6567:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6568:2: ( ruleEString )
            {
            // InternalCinEditor.g:6568:2: ( ruleEString )
            // InternalCinEditor.g:6569:3: ruleEString
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
    // InternalCinEditor.g:6578:1: rule__FadeIn__DurationAssignment_5 : ( ruleEInt ) ;
    public final void rule__FadeIn__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6582:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6583:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6583:2: ( ruleEInt )
            // InternalCinEditor.g:6584:3: ruleEInt
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
    // InternalCinEditor.g:6593:1: rule__FadeIn__ElementsAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__FadeIn__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6597:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:6598:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:6598:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:6599:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeInAccess().getElementsGraphicalElementCrossReference_8_0()); 
            // InternalCinEditor.g:6600:3: ( RULE_ID )
            // InternalCinEditor.g:6601:4: RULE_ID
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
    // InternalCinEditor.g:6612:1: rule__FadeIn__ElementsAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__FadeIn__ElementsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6616:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:6617:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:6617:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:6618:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeInAccess().getElementsGraphicalElementCrossReference_9_1_0()); 
            // InternalCinEditor.g:6619:3: ( RULE_ID )
            // InternalCinEditor.g:6620:4: RULE_ID
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
    // InternalCinEditor.g:6631:1: rule__FadeOut__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FadeOut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6635:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6636:2: ( ruleEString )
            {
            // InternalCinEditor.g:6636:2: ( ruleEString )
            // InternalCinEditor.g:6637:3: ruleEString
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
    // InternalCinEditor.g:6646:1: rule__FadeOut__DurationAssignment_5 : ( ruleEInt ) ;
    public final void rule__FadeOut__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6650:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6651:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6651:2: ( ruleEInt )
            // InternalCinEditor.g:6652:3: ruleEInt
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
    // InternalCinEditor.g:6661:1: rule__FadeOut__ElementsAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__FadeOut__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6665:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:6666:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:6666:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:6667:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeOutAccess().getElementsGraphicalElementCrossReference_8_0()); 
            // InternalCinEditor.g:6668:3: ( RULE_ID )
            // InternalCinEditor.g:6669:4: RULE_ID
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
    // InternalCinEditor.g:6680:1: rule__FadeOut__ElementsAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__FadeOut__ElementsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6684:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:6685:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:6685:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:6686:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeOutAccess().getElementsGraphicalElementCrossReference_9_1_0()); 
            // InternalCinEditor.g:6687:3: ( RULE_ID )
            // InternalCinEditor.g:6688:4: RULE_ID
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
    // InternalCinEditor.g:6699:1: rule__Translate__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Translate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6703:1: ( ( ruleEString ) )
            // InternalCinEditor.g:6704:2: ( ruleEString )
            {
            // InternalCinEditor.g:6704:2: ( ruleEString )
            // InternalCinEditor.g:6705:3: ruleEString
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
    // InternalCinEditor.g:6714:1: rule__Translate__PositionToTranslateAssignment_4 : ( rulePosition ) ;
    public final void rule__Translate__PositionToTranslateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6718:1: ( ( rulePosition ) )
            // InternalCinEditor.g:6719:2: ( rulePosition )
            {
            // InternalCinEditor.g:6719:2: ( rulePosition )
            // InternalCinEditor.g:6720:3: rulePosition
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


    // $ANTLR start "rule__Translate__BeginTimeAssignment_5_1"
    // InternalCinEditor.g:6729:1: rule__Translate__BeginTimeAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Translate__BeginTimeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6733:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6734:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6734:2: ( ruleEInt )
            // InternalCinEditor.g:6735:3: ruleEInt
            {
             before(grammarAccess.getTranslateAccess().getBeginTimeEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTranslateAccess().getBeginTimeEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__BeginTimeAssignment_5_1"


    // $ANTLR start "rule__Translate__DurationAssignment_6_1"
    // InternalCinEditor.g:6744:1: rule__Translate__DurationAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Translate__DurationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6748:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:6749:2: ( ruleEInt )
            {
            // InternalCinEditor.g:6749:2: ( ruleEInt )
            // InternalCinEditor.g:6750:3: ruleEInt
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
    // InternalCinEditor.g:6759:1: rule__Translate__ElementsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Translate__ElementsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6763:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:6764:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:6764:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:6765:3: ( RULE_ID )
            {
             before(grammarAccess.getTranslateAccess().getElementsGraphicalElementCrossReference_9_0()); 
            // InternalCinEditor.g:6766:3: ( RULE_ID )
            // InternalCinEditor.g:6767:4: RULE_ID
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
    // InternalCinEditor.g:6778:1: rule__Translate__ElementsAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Translate__ElementsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:6782:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:6783:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:6783:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:6784:3: ( RULE_ID )
            {
             before(grammarAccess.getTranslateAccess().getElementsGraphicalElementCrossReference_10_1_0()); 
            // InternalCinEditor.g:6785:3: ( RULE_ID )
            // InternalCinEditor.g:6786:4: RULE_ID
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
            return "643:1: rule__Element__Alternatives : ( ( ruleGraphicalElement ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleAudioElement ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000D90080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000D90080000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000004000F840L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000032000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000006A010800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000004A004800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000024E004800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000A200000000L});

}