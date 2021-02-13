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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'center'", "'left'", "'right'", "'bottom'", "'top'", "'.'", "','", "'true'", "'false'", "'Movie'", "'fps'", "'Layer'", "'position'", "'('", "')'", "'dimension'", "'x'", "'color'", "'-'", "'Audio'", "'='", "'on'", "'volume'", "'fadeIn'", "'fadeOut'", "'startAt'", "'cropAt'", "'during'", "'Text'", "'fontSize'", "'Picture'", "'Video'", "'audio'", "'Rectangle'", "'Effect'", "'FadeIn'", "'['", "']'", "'FadeOut'", "'Translate'"
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


    // $ANTLR start "entryRuleEInt"
    // InternalCinEditor.g:328:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalCinEditor.g:329:1: ( ruleEInt EOF )
            // InternalCinEditor.g:330:1: ruleEInt EOF
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
    // InternalCinEditor.g:337:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:341:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalCinEditor.g:342:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalCinEditor.g:342:2: ( ( rule__EInt__Group__0 ) )
            // InternalCinEditor.g:343:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalCinEditor.g:344:3: ( rule__EInt__Group__0 )
            // InternalCinEditor.g:344:4: rule__EInt__Group__0
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
    // InternalCinEditor.g:353:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalCinEditor.g:354:1: ( ruleEFloat EOF )
            // InternalCinEditor.g:355:1: ruleEFloat EOF
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
    // InternalCinEditor.g:362:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:366:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalCinEditor.g:367:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalCinEditor.g:367:2: ( ( rule__EFloat__Group__0 ) )
            // InternalCinEditor.g:368:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalCinEditor.g:369:3: ( rule__EFloat__Group__0 )
            // InternalCinEditor.g:369:4: rule__EFloat__Group__0
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
    // InternalCinEditor.g:378:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalCinEditor.g:379:1: ( ruleEBoolean EOF )
            // InternalCinEditor.g:380:1: ruleEBoolean EOF
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
    // InternalCinEditor.g:387:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:391:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalCinEditor.g:392:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalCinEditor.g:392:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalCinEditor.g:393:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalCinEditor.g:394:3: ( rule__EBoolean__Alternatives )
            // InternalCinEditor.g:394:4: rule__EBoolean__Alternatives
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
    // InternalCinEditor.g:403:1: entryRuleAudioElement : ruleAudioElement EOF ;
    public final void entryRuleAudioElement() throws RecognitionException {
        try {
            // InternalCinEditor.g:404:1: ( ruleAudioElement EOF )
            // InternalCinEditor.g:405:1: ruleAudioElement EOF
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
    // InternalCinEditor.g:412:1: ruleAudioElement : ( ( rule__AudioElement__Group__0 ) ) ;
    public final void ruleAudioElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:416:2: ( ( ( rule__AudioElement__Group__0 ) ) )
            // InternalCinEditor.g:417:2: ( ( rule__AudioElement__Group__0 ) )
            {
            // InternalCinEditor.g:417:2: ( ( rule__AudioElement__Group__0 ) )
            // InternalCinEditor.g:418:3: ( rule__AudioElement__Group__0 )
            {
             before(grammarAccess.getAudioElementAccess().getGroup()); 
            // InternalCinEditor.g:419:3: ( rule__AudioElement__Group__0 )
            // InternalCinEditor.g:419:4: rule__AudioElement__Group__0
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
    // InternalCinEditor.g:428:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalCinEditor.g:429:1: ( ruleText EOF )
            // InternalCinEditor.g:430:1: ruleText EOF
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
    // InternalCinEditor.g:437:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:441:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalCinEditor.g:442:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalCinEditor.g:442:2: ( ( rule__Text__Group__0 ) )
            // InternalCinEditor.g:443:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalCinEditor.g:444:3: ( rule__Text__Group__0 )
            // InternalCinEditor.g:444:4: rule__Text__Group__0
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
    // InternalCinEditor.g:453:1: entryRulePicture : rulePicture EOF ;
    public final void entryRulePicture() throws RecognitionException {
        try {
            // InternalCinEditor.g:454:1: ( rulePicture EOF )
            // InternalCinEditor.g:455:1: rulePicture EOF
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
    // InternalCinEditor.g:462:1: rulePicture : ( ( rule__Picture__Group__0 ) ) ;
    public final void rulePicture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:466:2: ( ( ( rule__Picture__Group__0 ) ) )
            // InternalCinEditor.g:467:2: ( ( rule__Picture__Group__0 ) )
            {
            // InternalCinEditor.g:467:2: ( ( rule__Picture__Group__0 ) )
            // InternalCinEditor.g:468:3: ( rule__Picture__Group__0 )
            {
             before(grammarAccess.getPictureAccess().getGroup()); 
            // InternalCinEditor.g:469:3: ( rule__Picture__Group__0 )
            // InternalCinEditor.g:469:4: rule__Picture__Group__0
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
    // InternalCinEditor.g:478:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalCinEditor.g:479:1: ( ruleVideo EOF )
            // InternalCinEditor.g:480:1: ruleVideo EOF
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
    // InternalCinEditor.g:487:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:491:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalCinEditor.g:492:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalCinEditor.g:492:2: ( ( rule__Video__Group__0 ) )
            // InternalCinEditor.g:493:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalCinEditor.g:494:3: ( rule__Video__Group__0 )
            // InternalCinEditor.g:494:4: rule__Video__Group__0
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
    // InternalCinEditor.g:503:1: entryRuleRectangle : ruleRectangle EOF ;
    public final void entryRuleRectangle() throws RecognitionException {
        try {
            // InternalCinEditor.g:504:1: ( ruleRectangle EOF )
            // InternalCinEditor.g:505:1: ruleRectangle EOF
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
    // InternalCinEditor.g:512:1: ruleRectangle : ( ( rule__Rectangle__Group__0 ) ) ;
    public final void ruleRectangle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:516:2: ( ( ( rule__Rectangle__Group__0 ) ) )
            // InternalCinEditor.g:517:2: ( ( rule__Rectangle__Group__0 ) )
            {
            // InternalCinEditor.g:517:2: ( ( rule__Rectangle__Group__0 ) )
            // InternalCinEditor.g:518:3: ( rule__Rectangle__Group__0 )
            {
             before(grammarAccess.getRectangleAccess().getGroup()); 
            // InternalCinEditor.g:519:3: ( rule__Rectangle__Group__0 )
            // InternalCinEditor.g:519:4: rule__Rectangle__Group__0
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
    // InternalCinEditor.g:528:1: entryRuleFadeIn : ruleFadeIn EOF ;
    public final void entryRuleFadeIn() throws RecognitionException {
        try {
            // InternalCinEditor.g:529:1: ( ruleFadeIn EOF )
            // InternalCinEditor.g:530:1: ruleFadeIn EOF
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
    // InternalCinEditor.g:537:1: ruleFadeIn : ( ( rule__FadeIn__Group__0 ) ) ;
    public final void ruleFadeIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:541:2: ( ( ( rule__FadeIn__Group__0 ) ) )
            // InternalCinEditor.g:542:2: ( ( rule__FadeIn__Group__0 ) )
            {
            // InternalCinEditor.g:542:2: ( ( rule__FadeIn__Group__0 ) )
            // InternalCinEditor.g:543:3: ( rule__FadeIn__Group__0 )
            {
             before(grammarAccess.getFadeInAccess().getGroup()); 
            // InternalCinEditor.g:544:3: ( rule__FadeIn__Group__0 )
            // InternalCinEditor.g:544:4: rule__FadeIn__Group__0
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
    // InternalCinEditor.g:553:1: entryRuleFadeOut : ruleFadeOut EOF ;
    public final void entryRuleFadeOut() throws RecognitionException {
        try {
            // InternalCinEditor.g:554:1: ( ruleFadeOut EOF )
            // InternalCinEditor.g:555:1: ruleFadeOut EOF
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
    // InternalCinEditor.g:562:1: ruleFadeOut : ( ( rule__FadeOut__Group__0 ) ) ;
    public final void ruleFadeOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:566:2: ( ( ( rule__FadeOut__Group__0 ) ) )
            // InternalCinEditor.g:567:2: ( ( rule__FadeOut__Group__0 ) )
            {
            // InternalCinEditor.g:567:2: ( ( rule__FadeOut__Group__0 ) )
            // InternalCinEditor.g:568:3: ( rule__FadeOut__Group__0 )
            {
             before(grammarAccess.getFadeOutAccess().getGroup()); 
            // InternalCinEditor.g:569:3: ( rule__FadeOut__Group__0 )
            // InternalCinEditor.g:569:4: rule__FadeOut__Group__0
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
    // InternalCinEditor.g:578:1: entryRuleTranslate : ruleTranslate EOF ;
    public final void entryRuleTranslate() throws RecognitionException {
        try {
            // InternalCinEditor.g:579:1: ( ruleTranslate EOF )
            // InternalCinEditor.g:580:1: ruleTranslate EOF
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
    // InternalCinEditor.g:587:1: ruleTranslate : ( ( rule__Translate__Group__0 ) ) ;
    public final void ruleTranslate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:591:2: ( ( ( rule__Translate__Group__0 ) ) )
            // InternalCinEditor.g:592:2: ( ( rule__Translate__Group__0 ) )
            {
            // InternalCinEditor.g:592:2: ( ( rule__Translate__Group__0 ) )
            // InternalCinEditor.g:593:3: ( rule__Translate__Group__0 )
            {
             before(grammarAccess.getTranslateAccess().getGroup()); 
            // InternalCinEditor.g:594:3: ( rule__Translate__Group__0 )
            // InternalCinEditor.g:594:4: rule__Translate__Group__0
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


    // $ANTLR start "rule__Element__Alternatives"
    // InternalCinEditor.g:602:1: rule__Element__Alternatives : ( ( ruleGraphicalElement ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleAudioElement ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:606:1: ( ( ruleGraphicalElement ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleAudioElement ) )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCinEditor.g:607:2: ( ruleGraphicalElement )
                    {
                    // InternalCinEditor.g:607:2: ( ruleGraphicalElement )
                    // InternalCinEditor.g:608:3: ruleGraphicalElement
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
                    // InternalCinEditor.g:613:2: ( ruleFadeIn )
                    {
                    // InternalCinEditor.g:613:2: ( ruleFadeIn )
                    // InternalCinEditor.g:614:3: ruleFadeIn
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
                    // InternalCinEditor.g:619:2: ( ruleFadeOut )
                    {
                    // InternalCinEditor.g:619:2: ( ruleFadeOut )
                    // InternalCinEditor.g:620:3: ruleFadeOut
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
                    // InternalCinEditor.g:625:2: ( ruleTranslate )
                    {
                    // InternalCinEditor.g:625:2: ( ruleTranslate )
                    // InternalCinEditor.g:626:3: ruleTranslate
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
                    // InternalCinEditor.g:631:2: ( ruleAudioElement )
                    {
                    // InternalCinEditor.g:631:2: ( ruleAudioElement )
                    // InternalCinEditor.g:632:3: ruleAudioElement
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
    // InternalCinEditor.g:641:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:645:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCinEditor.g:646:2: ( RULE_STRING )
                    {
                    // InternalCinEditor.g:646:2: ( RULE_STRING )
                    // InternalCinEditor.g:647:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:652:2: ( RULE_ID )
                    {
                    // InternalCinEditor.g:652:2: ( RULE_ID )
                    // InternalCinEditor.g:653:3: RULE_ID
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
    // InternalCinEditor.g:662:1: rule__ItemPosition__Alternatives : ( ( ruleItemPositionInt ) | ( ruleItemPositionString ) );
    public final void rule__ItemPosition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:666:1: ( ( ruleItemPositionInt ) | ( ruleItemPositionString ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==29) ) {
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
                    // InternalCinEditor.g:667:2: ( ruleItemPositionInt )
                    {
                    // InternalCinEditor.g:667:2: ( ruleItemPositionInt )
                    // InternalCinEditor.g:668:3: ruleItemPositionInt
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
                    // InternalCinEditor.g:673:2: ( ruleItemPositionString )
                    {
                    // InternalCinEditor.g:673:2: ( ruleItemPositionString )
                    // InternalCinEditor.g:674:3: ruleItemPositionString
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
    // InternalCinEditor.g:683:1: rule__ItemPositionString__PositionAlternatives_0 : ( ( 'center' ) | ( 'left' ) | ( 'right' ) | ( 'bottom' ) | ( 'top' ) );
    public final void rule__ItemPositionString__PositionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:687:1: ( ( 'center' ) | ( 'left' ) | ( 'right' ) | ( 'bottom' ) | ( 'top' ) )
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
                    // InternalCinEditor.g:688:2: ( 'center' )
                    {
                    // InternalCinEditor.g:688:2: ( 'center' )
                    // InternalCinEditor.g:689:3: 'center'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionCenterKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionCenterKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:694:2: ( 'left' )
                    {
                    // InternalCinEditor.g:694:2: ( 'left' )
                    // InternalCinEditor.g:695:3: 'left'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionLeftKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionLeftKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCinEditor.g:700:2: ( 'right' )
                    {
                    // InternalCinEditor.g:700:2: ( 'right' )
                    // InternalCinEditor.g:701:3: 'right'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionRightKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionRightKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCinEditor.g:706:2: ( 'bottom' )
                    {
                    // InternalCinEditor.g:706:2: ( 'bottom' )
                    // InternalCinEditor.g:707:3: 'bottom'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionBottomKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionBottomKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCinEditor.g:712:2: ( 'top' )
                    {
                    // InternalCinEditor.g:712:2: ( 'top' )
                    // InternalCinEditor.g:713:3: 'top'
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
    // InternalCinEditor.g:722:1: rule__GraphicalElement__Alternatives : ( ( ruleText ) | ( ruleVideo ) | ( rulePicture ) | ( ruleRectangle ) );
    public final void rule__GraphicalElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:726:1: ( ( ruleText ) | ( ruleVideo ) | ( rulePicture ) | ( ruleRectangle ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt5=1;
                }
                break;
            case 42:
                {
                alt5=2;
                }
                break;
            case 41:
                {
                alt5=3;
                }
                break;
            case 44:
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
                    // InternalCinEditor.g:727:2: ( ruleText )
                    {
                    // InternalCinEditor.g:727:2: ( ruleText )
                    // InternalCinEditor.g:728:3: ruleText
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
                    // InternalCinEditor.g:733:2: ( ruleVideo )
                    {
                    // InternalCinEditor.g:733:2: ( ruleVideo )
                    // InternalCinEditor.g:734:3: ruleVideo
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
                    // InternalCinEditor.g:739:2: ( rulePicture )
                    {
                    // InternalCinEditor.g:739:2: ( rulePicture )
                    // InternalCinEditor.g:740:3: rulePicture
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
                    // InternalCinEditor.g:745:2: ( ruleRectangle )
                    {
                    // InternalCinEditor.g:745:2: ( ruleRectangle )
                    // InternalCinEditor.g:746:3: ruleRectangle
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
    // InternalCinEditor.g:755:1: rule__EFloat__Alternatives_2_0 : ( ( '.' ) | ( ',' ) );
    public final void rule__EFloat__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:759:1: ( ( '.' ) | ( ',' ) )
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
                    // InternalCinEditor.g:760:2: ( '.' )
                    {
                    // InternalCinEditor.g:760:2: ( '.' )
                    // InternalCinEditor.g:761:3: '.'
                    {
                     before(grammarAccess.getEFloatAccess().getFullStopKeyword_2_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getFullStopKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:766:2: ( ',' )
                    {
                    // InternalCinEditor.g:766:2: ( ',' )
                    // InternalCinEditor.g:767:3: ','
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
    // InternalCinEditor.g:776:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:780:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalCinEditor.g:781:2: ( 'true' )
                    {
                    // InternalCinEditor.g:781:2: ( 'true' )
                    // InternalCinEditor.g:782:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:787:2: ( 'false' )
                    {
                    // InternalCinEditor.g:787:2: ( 'false' )
                    // InternalCinEditor.g:788:3: 'false'
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


    // $ANTLR start "rule__Movie__Group__0"
    // InternalCinEditor.g:797:1: rule__Movie__Group__0 : rule__Movie__Group__0__Impl rule__Movie__Group__1 ;
    public final void rule__Movie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:801:1: ( rule__Movie__Group__0__Impl rule__Movie__Group__1 )
            // InternalCinEditor.g:802:2: rule__Movie__Group__0__Impl rule__Movie__Group__1
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
    // InternalCinEditor.g:809:1: rule__Movie__Group__0__Impl : ( 'Movie' ) ;
    public final void rule__Movie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:813:1: ( ( 'Movie' ) )
            // InternalCinEditor.g:814:1: ( 'Movie' )
            {
            // InternalCinEditor.g:814:1: ( 'Movie' )
            // InternalCinEditor.g:815:2: 'Movie'
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
    // InternalCinEditor.g:824:1: rule__Movie__Group__1 : rule__Movie__Group__1__Impl rule__Movie__Group__2 ;
    public final void rule__Movie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:828:1: ( rule__Movie__Group__1__Impl rule__Movie__Group__2 )
            // InternalCinEditor.g:829:2: rule__Movie__Group__1__Impl rule__Movie__Group__2
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
    // InternalCinEditor.g:836:1: rule__Movie__Group__1__Impl : ( ( rule__Movie__NameAssignment_1 ) ) ;
    public final void rule__Movie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:840:1: ( ( ( rule__Movie__NameAssignment_1 ) ) )
            // InternalCinEditor.g:841:1: ( ( rule__Movie__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:841:1: ( ( rule__Movie__NameAssignment_1 ) )
            // InternalCinEditor.g:842:2: ( rule__Movie__NameAssignment_1 )
            {
             before(grammarAccess.getMovieAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:843:2: ( rule__Movie__NameAssignment_1 )
            // InternalCinEditor.g:843:3: rule__Movie__NameAssignment_1
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
    // InternalCinEditor.g:851:1: rule__Movie__Group__2 : rule__Movie__Group__2__Impl rule__Movie__Group__3 ;
    public final void rule__Movie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:855:1: ( rule__Movie__Group__2__Impl rule__Movie__Group__3 )
            // InternalCinEditor.g:856:2: rule__Movie__Group__2__Impl rule__Movie__Group__3
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
    // InternalCinEditor.g:863:1: rule__Movie__Group__2__Impl : ( ( rule__Movie__DimensionAssignment_2 ) ) ;
    public final void rule__Movie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:867:1: ( ( ( rule__Movie__DimensionAssignment_2 ) ) )
            // InternalCinEditor.g:868:1: ( ( rule__Movie__DimensionAssignment_2 ) )
            {
            // InternalCinEditor.g:868:1: ( ( rule__Movie__DimensionAssignment_2 ) )
            // InternalCinEditor.g:869:2: ( rule__Movie__DimensionAssignment_2 )
            {
             before(grammarAccess.getMovieAccess().getDimensionAssignment_2()); 
            // InternalCinEditor.g:870:2: ( rule__Movie__DimensionAssignment_2 )
            // InternalCinEditor.g:870:3: rule__Movie__DimensionAssignment_2
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
    // InternalCinEditor.g:878:1: rule__Movie__Group__3 : rule__Movie__Group__3__Impl rule__Movie__Group__4 ;
    public final void rule__Movie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:882:1: ( rule__Movie__Group__3__Impl rule__Movie__Group__4 )
            // InternalCinEditor.g:883:2: rule__Movie__Group__3__Impl rule__Movie__Group__4
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
    // InternalCinEditor.g:890:1: rule__Movie__Group__3__Impl : ( ( rule__Movie__Group_3__0 )? ) ;
    public final void rule__Movie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:894:1: ( ( ( rule__Movie__Group_3__0 )? ) )
            // InternalCinEditor.g:895:1: ( ( rule__Movie__Group_3__0 )? )
            {
            // InternalCinEditor.g:895:1: ( ( rule__Movie__Group_3__0 )? )
            // InternalCinEditor.g:896:2: ( rule__Movie__Group_3__0 )?
            {
             before(grammarAccess.getMovieAccess().getGroup_3()); 
            // InternalCinEditor.g:897:2: ( rule__Movie__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCinEditor.g:897:3: rule__Movie__Group_3__0
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
    // InternalCinEditor.g:905:1: rule__Movie__Group__4 : rule__Movie__Group__4__Impl ;
    public final void rule__Movie__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:909:1: ( rule__Movie__Group__4__Impl )
            // InternalCinEditor.g:910:2: rule__Movie__Group__4__Impl
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
    // InternalCinEditor.g:916:1: rule__Movie__Group__4__Impl : ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) ) ;
    public final void rule__Movie__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:920:1: ( ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) ) )
            // InternalCinEditor.g:921:1: ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) )
            {
            // InternalCinEditor.g:921:1: ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) )
            // InternalCinEditor.g:922:2: ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* )
            {
            // InternalCinEditor.g:922:2: ( ( rule__Movie__LayersAssignment_4 ) )
            // InternalCinEditor.g:923:3: ( rule__Movie__LayersAssignment_4 )
            {
             before(grammarAccess.getMovieAccess().getLayersAssignment_4()); 
            // InternalCinEditor.g:924:3: ( rule__Movie__LayersAssignment_4 )
            // InternalCinEditor.g:924:4: rule__Movie__LayersAssignment_4
            {
            pushFollow(FOLLOW_6);
            rule__Movie__LayersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getLayersAssignment_4()); 

            }

            // InternalCinEditor.g:927:2: ( ( rule__Movie__LayersAssignment_4 )* )
            // InternalCinEditor.g:928:3: ( rule__Movie__LayersAssignment_4 )*
            {
             before(grammarAccess.getMovieAccess().getLayersAssignment_4()); 
            // InternalCinEditor.g:929:3: ( rule__Movie__LayersAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCinEditor.g:929:4: rule__Movie__LayersAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Movie__LayersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalCinEditor.g:939:1: rule__Movie__Group_3__0 : rule__Movie__Group_3__0__Impl rule__Movie__Group_3__1 ;
    public final void rule__Movie__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:943:1: ( rule__Movie__Group_3__0__Impl rule__Movie__Group_3__1 )
            // InternalCinEditor.g:944:2: rule__Movie__Group_3__0__Impl rule__Movie__Group_3__1
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
    // InternalCinEditor.g:951:1: rule__Movie__Group_3__0__Impl : ( 'fps' ) ;
    public final void rule__Movie__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:955:1: ( ( 'fps' ) )
            // InternalCinEditor.g:956:1: ( 'fps' )
            {
            // InternalCinEditor.g:956:1: ( 'fps' )
            // InternalCinEditor.g:957:2: 'fps'
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
    // InternalCinEditor.g:966:1: rule__Movie__Group_3__1 : rule__Movie__Group_3__1__Impl ;
    public final void rule__Movie__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:970:1: ( rule__Movie__Group_3__1__Impl )
            // InternalCinEditor.g:971:2: rule__Movie__Group_3__1__Impl
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
    // InternalCinEditor.g:977:1: rule__Movie__Group_3__1__Impl : ( ( rule__Movie__FpsAssignment_3_1 ) ) ;
    public final void rule__Movie__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:981:1: ( ( ( rule__Movie__FpsAssignment_3_1 ) ) )
            // InternalCinEditor.g:982:1: ( ( rule__Movie__FpsAssignment_3_1 ) )
            {
            // InternalCinEditor.g:982:1: ( ( rule__Movie__FpsAssignment_3_1 ) )
            // InternalCinEditor.g:983:2: ( rule__Movie__FpsAssignment_3_1 )
            {
             before(grammarAccess.getMovieAccess().getFpsAssignment_3_1()); 
            // InternalCinEditor.g:984:2: ( rule__Movie__FpsAssignment_3_1 )
            // InternalCinEditor.g:984:3: rule__Movie__FpsAssignment_3_1
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
    // InternalCinEditor.g:993:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:997:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalCinEditor.g:998:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
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
    // InternalCinEditor.g:1005:1: rule__Layer__Group__0__Impl : ( () ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1009:1: ( ( () ) )
            // InternalCinEditor.g:1010:1: ( () )
            {
            // InternalCinEditor.g:1010:1: ( () )
            // InternalCinEditor.g:1011:2: ()
            {
             before(grammarAccess.getLayerAccess().getLayerAction_0()); 
            // InternalCinEditor.g:1012:2: ()
            // InternalCinEditor.g:1012:3: 
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
    // InternalCinEditor.g:1020:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1024:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalCinEditor.g:1025:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
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
    // InternalCinEditor.g:1032:1: rule__Layer__Group__1__Impl : ( 'Layer' ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1036:1: ( ( 'Layer' ) )
            // InternalCinEditor.g:1037:1: ( 'Layer' )
            {
            // InternalCinEditor.g:1037:1: ( 'Layer' )
            // InternalCinEditor.g:1038:2: 'Layer'
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
    // InternalCinEditor.g:1047:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1051:1: ( rule__Layer__Group__2__Impl )
            // InternalCinEditor.g:1052:2: rule__Layer__Group__2__Impl
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
    // InternalCinEditor.g:1058:1: rule__Layer__Group__2__Impl : ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1062:1: ( ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) ) )
            // InternalCinEditor.g:1063:1: ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) )
            {
            // InternalCinEditor.g:1063:1: ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) )
            // InternalCinEditor.g:1064:2: ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* )
            {
            // InternalCinEditor.g:1064:2: ( ( rule__Layer__ElementsAssignment_2 ) )
            // InternalCinEditor.g:1065:3: ( rule__Layer__ElementsAssignment_2 )
            {
             before(grammarAccess.getLayerAccess().getElementsAssignment_2()); 
            // InternalCinEditor.g:1066:3: ( rule__Layer__ElementsAssignment_2 )
            // InternalCinEditor.g:1066:4: rule__Layer__ElementsAssignment_2
            {
            pushFollow(FOLLOW_9);
            rule__Layer__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getElementsAssignment_2()); 

            }

            // InternalCinEditor.g:1069:2: ( ( rule__Layer__ElementsAssignment_2 )* )
            // InternalCinEditor.g:1070:3: ( rule__Layer__ElementsAssignment_2 )*
            {
             before(grammarAccess.getLayerAccess().getElementsAssignment_2()); 
            // InternalCinEditor.g:1071:3: ( rule__Layer__ElementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30||LA10_0==39||(LA10_0>=41 && LA10_0<=42)||(LA10_0>=44 && LA10_0<=45)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCinEditor.g:1071:4: rule__Layer__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Layer__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalCinEditor.g:1081:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1085:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalCinEditor.g:1086:2: rule__Position__Group__0__Impl rule__Position__Group__1
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
    // InternalCinEditor.g:1093:1: rule__Position__Group__0__Impl : ( 'position' ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1097:1: ( ( 'position' ) )
            // InternalCinEditor.g:1098:1: ( 'position' )
            {
            // InternalCinEditor.g:1098:1: ( 'position' )
            // InternalCinEditor.g:1099:2: 'position'
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
    // InternalCinEditor.g:1108:1: rule__Position__Group__1 : rule__Position__Group__1__Impl ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1112:1: ( rule__Position__Group__1__Impl )
            // InternalCinEditor.g:1113:2: rule__Position__Group__1__Impl
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
    // InternalCinEditor.g:1119:1: rule__Position__Group__1__Impl : ( ( rule__Position__Group_1__0 ) ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1123:1: ( ( ( rule__Position__Group_1__0 ) ) )
            // InternalCinEditor.g:1124:1: ( ( rule__Position__Group_1__0 ) )
            {
            // InternalCinEditor.g:1124:1: ( ( rule__Position__Group_1__0 ) )
            // InternalCinEditor.g:1125:2: ( rule__Position__Group_1__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup_1()); 
            // InternalCinEditor.g:1126:2: ( rule__Position__Group_1__0 )
            // InternalCinEditor.g:1126:3: rule__Position__Group_1__0
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
    // InternalCinEditor.g:1135:1: rule__Position__Group_1__0 : rule__Position__Group_1__0__Impl rule__Position__Group_1__1 ;
    public final void rule__Position__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1139:1: ( rule__Position__Group_1__0__Impl rule__Position__Group_1__1 )
            // InternalCinEditor.g:1140:2: rule__Position__Group_1__0__Impl rule__Position__Group_1__1
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
    // InternalCinEditor.g:1147:1: rule__Position__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Position__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1151:1: ( ( '(' ) )
            // InternalCinEditor.g:1152:1: ( '(' )
            {
            // InternalCinEditor.g:1152:1: ( '(' )
            // InternalCinEditor.g:1153:2: '('
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
    // InternalCinEditor.g:1162:1: rule__Position__Group_1__1 : rule__Position__Group_1__1__Impl rule__Position__Group_1__2 ;
    public final void rule__Position__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1166:1: ( rule__Position__Group_1__1__Impl rule__Position__Group_1__2 )
            // InternalCinEditor.g:1167:2: rule__Position__Group_1__1__Impl rule__Position__Group_1__2
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
    // InternalCinEditor.g:1174:1: rule__Position__Group_1__1__Impl : ( ( rule__Position__XAssignment_1_1 ) ) ;
    public final void rule__Position__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1178:1: ( ( ( rule__Position__XAssignment_1_1 ) ) )
            // InternalCinEditor.g:1179:1: ( ( rule__Position__XAssignment_1_1 ) )
            {
            // InternalCinEditor.g:1179:1: ( ( rule__Position__XAssignment_1_1 ) )
            // InternalCinEditor.g:1180:2: ( rule__Position__XAssignment_1_1 )
            {
             before(grammarAccess.getPositionAccess().getXAssignment_1_1()); 
            // InternalCinEditor.g:1181:2: ( rule__Position__XAssignment_1_1 )
            // InternalCinEditor.g:1181:3: rule__Position__XAssignment_1_1
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
    // InternalCinEditor.g:1189:1: rule__Position__Group_1__2 : rule__Position__Group_1__2__Impl rule__Position__Group_1__3 ;
    public final void rule__Position__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1193:1: ( rule__Position__Group_1__2__Impl rule__Position__Group_1__3 )
            // InternalCinEditor.g:1194:2: rule__Position__Group_1__2__Impl rule__Position__Group_1__3
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
    // InternalCinEditor.g:1201:1: rule__Position__Group_1__2__Impl : ( ',' ) ;
    public final void rule__Position__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1205:1: ( ( ',' ) )
            // InternalCinEditor.g:1206:1: ( ',' )
            {
            // InternalCinEditor.g:1206:1: ( ',' )
            // InternalCinEditor.g:1207:2: ','
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
    // InternalCinEditor.g:1216:1: rule__Position__Group_1__3 : rule__Position__Group_1__3__Impl rule__Position__Group_1__4 ;
    public final void rule__Position__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1220:1: ( rule__Position__Group_1__3__Impl rule__Position__Group_1__4 )
            // InternalCinEditor.g:1221:2: rule__Position__Group_1__3__Impl rule__Position__Group_1__4
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
    // InternalCinEditor.g:1228:1: rule__Position__Group_1__3__Impl : ( ( rule__Position__YAssignment_1_3 ) ) ;
    public final void rule__Position__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1232:1: ( ( ( rule__Position__YAssignment_1_3 ) ) )
            // InternalCinEditor.g:1233:1: ( ( rule__Position__YAssignment_1_3 ) )
            {
            // InternalCinEditor.g:1233:1: ( ( rule__Position__YAssignment_1_3 ) )
            // InternalCinEditor.g:1234:2: ( rule__Position__YAssignment_1_3 )
            {
             before(grammarAccess.getPositionAccess().getYAssignment_1_3()); 
            // InternalCinEditor.g:1235:2: ( rule__Position__YAssignment_1_3 )
            // InternalCinEditor.g:1235:3: rule__Position__YAssignment_1_3
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
    // InternalCinEditor.g:1243:1: rule__Position__Group_1__4 : rule__Position__Group_1__4__Impl ;
    public final void rule__Position__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1247:1: ( rule__Position__Group_1__4__Impl )
            // InternalCinEditor.g:1248:2: rule__Position__Group_1__4__Impl
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
    // InternalCinEditor.g:1254:1: rule__Position__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Position__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1258:1: ( ( ')' ) )
            // InternalCinEditor.g:1259:1: ( ')' )
            {
            // InternalCinEditor.g:1259:1: ( ')' )
            // InternalCinEditor.g:1260:2: ')'
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
    // InternalCinEditor.g:1270:1: rule__Dimension__Group__0 : rule__Dimension__Group__0__Impl rule__Dimension__Group__1 ;
    public final void rule__Dimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1274:1: ( rule__Dimension__Group__0__Impl rule__Dimension__Group__1 )
            // InternalCinEditor.g:1275:2: rule__Dimension__Group__0__Impl rule__Dimension__Group__1
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
    // InternalCinEditor.g:1282:1: rule__Dimension__Group__0__Impl : ( 'dimension' ) ;
    public final void rule__Dimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1286:1: ( ( 'dimension' ) )
            // InternalCinEditor.g:1287:1: ( 'dimension' )
            {
            // InternalCinEditor.g:1287:1: ( 'dimension' )
            // InternalCinEditor.g:1288:2: 'dimension'
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
    // InternalCinEditor.g:1297:1: rule__Dimension__Group__1 : rule__Dimension__Group__1__Impl rule__Dimension__Group__2 ;
    public final void rule__Dimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1301:1: ( rule__Dimension__Group__1__Impl rule__Dimension__Group__2 )
            // InternalCinEditor.g:1302:2: rule__Dimension__Group__1__Impl rule__Dimension__Group__2
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
    // InternalCinEditor.g:1309:1: rule__Dimension__Group__1__Impl : ( ( rule__Dimension__WidthAssignment_1 ) ) ;
    public final void rule__Dimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1313:1: ( ( ( rule__Dimension__WidthAssignment_1 ) ) )
            // InternalCinEditor.g:1314:1: ( ( rule__Dimension__WidthAssignment_1 ) )
            {
            // InternalCinEditor.g:1314:1: ( ( rule__Dimension__WidthAssignment_1 ) )
            // InternalCinEditor.g:1315:2: ( rule__Dimension__WidthAssignment_1 )
            {
             before(grammarAccess.getDimensionAccess().getWidthAssignment_1()); 
            // InternalCinEditor.g:1316:2: ( rule__Dimension__WidthAssignment_1 )
            // InternalCinEditor.g:1316:3: rule__Dimension__WidthAssignment_1
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
    // InternalCinEditor.g:1324:1: rule__Dimension__Group__2 : rule__Dimension__Group__2__Impl rule__Dimension__Group__3 ;
    public final void rule__Dimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1328:1: ( rule__Dimension__Group__2__Impl rule__Dimension__Group__3 )
            // InternalCinEditor.g:1329:2: rule__Dimension__Group__2__Impl rule__Dimension__Group__3
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
    // InternalCinEditor.g:1336:1: rule__Dimension__Group__2__Impl : ( 'x' ) ;
    public final void rule__Dimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1340:1: ( ( 'x' ) )
            // InternalCinEditor.g:1341:1: ( 'x' )
            {
            // InternalCinEditor.g:1341:1: ( 'x' )
            // InternalCinEditor.g:1342:2: 'x'
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
    // InternalCinEditor.g:1351:1: rule__Dimension__Group__3 : rule__Dimension__Group__3__Impl ;
    public final void rule__Dimension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1355:1: ( rule__Dimension__Group__3__Impl )
            // InternalCinEditor.g:1356:2: rule__Dimension__Group__3__Impl
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
    // InternalCinEditor.g:1362:1: rule__Dimension__Group__3__Impl : ( ( rule__Dimension__HeightAssignment_3 ) ) ;
    public final void rule__Dimension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1366:1: ( ( ( rule__Dimension__HeightAssignment_3 ) ) )
            // InternalCinEditor.g:1367:1: ( ( rule__Dimension__HeightAssignment_3 ) )
            {
            // InternalCinEditor.g:1367:1: ( ( rule__Dimension__HeightAssignment_3 ) )
            // InternalCinEditor.g:1368:2: ( rule__Dimension__HeightAssignment_3 )
            {
             before(grammarAccess.getDimensionAccess().getHeightAssignment_3()); 
            // InternalCinEditor.g:1369:2: ( rule__Dimension__HeightAssignment_3 )
            // InternalCinEditor.g:1369:3: rule__Dimension__HeightAssignment_3
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
    // InternalCinEditor.g:1378:1: rule__HexadecimalColor__Group__0 : rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1 ;
    public final void rule__HexadecimalColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1382:1: ( rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1 )
            // InternalCinEditor.g:1383:2: rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1
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
    // InternalCinEditor.g:1390:1: rule__HexadecimalColor__Group__0__Impl : ( 'color' ) ;
    public final void rule__HexadecimalColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1394:1: ( ( 'color' ) )
            // InternalCinEditor.g:1395:1: ( 'color' )
            {
            // InternalCinEditor.g:1395:1: ( 'color' )
            // InternalCinEditor.g:1396:2: 'color'
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
    // InternalCinEditor.g:1405:1: rule__HexadecimalColor__Group__1 : rule__HexadecimalColor__Group__1__Impl ;
    public final void rule__HexadecimalColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1409:1: ( rule__HexadecimalColor__Group__1__Impl )
            // InternalCinEditor.g:1410:2: rule__HexadecimalColor__Group__1__Impl
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
    // InternalCinEditor.g:1416:1: rule__HexadecimalColor__Group__1__Impl : ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) ) ;
    public final void rule__HexadecimalColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1420:1: ( ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) ) )
            // InternalCinEditor.g:1421:1: ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) )
            {
            // InternalCinEditor.g:1421:1: ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) )
            // InternalCinEditor.g:1422:2: ( rule__HexadecimalColor__HexadecimalValueAssignment_1 )
            {
             before(grammarAccess.getHexadecimalColorAccess().getHexadecimalValueAssignment_1()); 
            // InternalCinEditor.g:1423:2: ( rule__HexadecimalColor__HexadecimalValueAssignment_1 )
            // InternalCinEditor.g:1423:3: rule__HexadecimalColor__HexadecimalValueAssignment_1
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
    // InternalCinEditor.g:1432:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1436:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalCinEditor.g:1437:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalCinEditor.g:1444:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1448:1: ( ( ( '-' )? ) )
            // InternalCinEditor.g:1449:1: ( ( '-' )? )
            {
            // InternalCinEditor.g:1449:1: ( ( '-' )? )
            // InternalCinEditor.g:1450:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalCinEditor.g:1451:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCinEditor.g:1451:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalCinEditor.g:1459:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1463:1: ( rule__EInt__Group__1__Impl )
            // InternalCinEditor.g:1464:2: rule__EInt__Group__1__Impl
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
    // InternalCinEditor.g:1470:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1474:1: ( ( RULE_INT ) )
            // InternalCinEditor.g:1475:1: ( RULE_INT )
            {
            // InternalCinEditor.g:1475:1: ( RULE_INT )
            // InternalCinEditor.g:1476:2: RULE_INT
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
    // InternalCinEditor.g:1486:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1490:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalCinEditor.g:1491:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCinEditor.g:1498:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1502:1: ( ( ( '-' )? ) )
            // InternalCinEditor.g:1503:1: ( ( '-' )? )
            {
            // InternalCinEditor.g:1503:1: ( ( '-' )? )
            // InternalCinEditor.g:1504:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalCinEditor.g:1505:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCinEditor.g:1505:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalCinEditor.g:1513:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1517:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalCinEditor.g:1518:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
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
    // InternalCinEditor.g:1525:1: rule__EFloat__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1529:1: ( ( RULE_INT ) )
            // InternalCinEditor.g:1530:1: ( RULE_INT )
            {
            // InternalCinEditor.g:1530:1: ( RULE_INT )
            // InternalCinEditor.g:1531:2: RULE_INT
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
    // InternalCinEditor.g:1540:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1544:1: ( rule__EFloat__Group__2__Impl )
            // InternalCinEditor.g:1545:2: rule__EFloat__Group__2__Impl
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
    // InternalCinEditor.g:1551:1: rule__EFloat__Group__2__Impl : ( ( rule__EFloat__Group_2__0 )? ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1555:1: ( ( ( rule__EFloat__Group_2__0 )? ) )
            // InternalCinEditor.g:1556:1: ( ( rule__EFloat__Group_2__0 )? )
            {
            // InternalCinEditor.g:1556:1: ( ( rule__EFloat__Group_2__0 )? )
            // InternalCinEditor.g:1557:2: ( rule__EFloat__Group_2__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_2()); 
            // InternalCinEditor.g:1558:2: ( rule__EFloat__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=16 && LA13_0<=17)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCinEditor.g:1558:3: rule__EFloat__Group_2__0
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
    // InternalCinEditor.g:1567:1: rule__EFloat__Group_2__0 : rule__EFloat__Group_2__0__Impl rule__EFloat__Group_2__1 ;
    public final void rule__EFloat__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1571:1: ( rule__EFloat__Group_2__0__Impl rule__EFloat__Group_2__1 )
            // InternalCinEditor.g:1572:2: rule__EFloat__Group_2__0__Impl rule__EFloat__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCinEditor.g:1579:1: rule__EFloat__Group_2__0__Impl : ( ( rule__EFloat__Alternatives_2_0 ) ) ;
    public final void rule__EFloat__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1583:1: ( ( ( rule__EFloat__Alternatives_2_0 ) ) )
            // InternalCinEditor.g:1584:1: ( ( rule__EFloat__Alternatives_2_0 ) )
            {
            // InternalCinEditor.g:1584:1: ( ( rule__EFloat__Alternatives_2_0 ) )
            // InternalCinEditor.g:1585:2: ( rule__EFloat__Alternatives_2_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_2_0()); 
            // InternalCinEditor.g:1586:2: ( rule__EFloat__Alternatives_2_0 )
            // InternalCinEditor.g:1586:3: rule__EFloat__Alternatives_2_0
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
    // InternalCinEditor.g:1594:1: rule__EFloat__Group_2__1 : rule__EFloat__Group_2__1__Impl ;
    public final void rule__EFloat__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1598:1: ( rule__EFloat__Group_2__1__Impl )
            // InternalCinEditor.g:1599:2: rule__EFloat__Group_2__1__Impl
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
    // InternalCinEditor.g:1605:1: rule__EFloat__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1609:1: ( ( RULE_INT ) )
            // InternalCinEditor.g:1610:1: ( RULE_INT )
            {
            // InternalCinEditor.g:1610:1: ( RULE_INT )
            // InternalCinEditor.g:1611:2: RULE_INT
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
    // InternalCinEditor.g:1621:1: rule__AudioElement__Group__0 : rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1 ;
    public final void rule__AudioElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1625:1: ( rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1 )
            // InternalCinEditor.g:1626:2: rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1
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
    // InternalCinEditor.g:1633:1: rule__AudioElement__Group__0__Impl : ( 'Audio' ) ;
    public final void rule__AudioElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1637:1: ( ( 'Audio' ) )
            // InternalCinEditor.g:1638:1: ( 'Audio' )
            {
            // InternalCinEditor.g:1638:1: ( 'Audio' )
            // InternalCinEditor.g:1639:2: 'Audio'
            {
             before(grammarAccess.getAudioElementAccess().getAudioKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCinEditor.g:1648:1: rule__AudioElement__Group__1 : rule__AudioElement__Group__1__Impl rule__AudioElement__Group__2 ;
    public final void rule__AudioElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1652:1: ( rule__AudioElement__Group__1__Impl rule__AudioElement__Group__2 )
            // InternalCinEditor.g:1653:2: rule__AudioElement__Group__1__Impl rule__AudioElement__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCinEditor.g:1660:1: rule__AudioElement__Group__1__Impl : ( ( rule__AudioElement__NameAssignment_1 ) ) ;
    public final void rule__AudioElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1664:1: ( ( ( rule__AudioElement__NameAssignment_1 ) ) )
            // InternalCinEditor.g:1665:1: ( ( rule__AudioElement__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:1665:1: ( ( rule__AudioElement__NameAssignment_1 ) )
            // InternalCinEditor.g:1666:2: ( rule__AudioElement__NameAssignment_1 )
            {
             before(grammarAccess.getAudioElementAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:1667:2: ( rule__AudioElement__NameAssignment_1 )
            // InternalCinEditor.g:1667:3: rule__AudioElement__NameAssignment_1
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
    // InternalCinEditor.g:1675:1: rule__AudioElement__Group__2 : rule__AudioElement__Group__2__Impl rule__AudioElement__Group__3 ;
    public final void rule__AudioElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1679:1: ( rule__AudioElement__Group__2__Impl rule__AudioElement__Group__3 )
            // InternalCinEditor.g:1680:2: rule__AudioElement__Group__2__Impl rule__AudioElement__Group__3
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
    // InternalCinEditor.g:1687:1: rule__AudioElement__Group__2__Impl : ( '=' ) ;
    public final void rule__AudioElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1691:1: ( ( '=' ) )
            // InternalCinEditor.g:1692:1: ( '=' )
            {
            // InternalCinEditor.g:1692:1: ( '=' )
            // InternalCinEditor.g:1693:2: '='
            {
             before(grammarAccess.getAudioElementAccess().getEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCinEditor.g:1702:1: rule__AudioElement__Group__3 : rule__AudioElement__Group__3__Impl rule__AudioElement__Group__4 ;
    public final void rule__AudioElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1706:1: ( rule__AudioElement__Group__3__Impl rule__AudioElement__Group__4 )
            // InternalCinEditor.g:1707:2: rule__AudioElement__Group__3__Impl rule__AudioElement__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:1714:1: rule__AudioElement__Group__3__Impl : ( ( rule__AudioElement__UrlAssignment_3 ) ) ;
    public final void rule__AudioElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1718:1: ( ( ( rule__AudioElement__UrlAssignment_3 ) ) )
            // InternalCinEditor.g:1719:1: ( ( rule__AudioElement__UrlAssignment_3 ) )
            {
            // InternalCinEditor.g:1719:1: ( ( rule__AudioElement__UrlAssignment_3 ) )
            // InternalCinEditor.g:1720:2: ( rule__AudioElement__UrlAssignment_3 )
            {
             before(grammarAccess.getAudioElementAccess().getUrlAssignment_3()); 
            // InternalCinEditor.g:1721:2: ( rule__AudioElement__UrlAssignment_3 )
            // InternalCinEditor.g:1721:3: rule__AudioElement__UrlAssignment_3
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
    // InternalCinEditor.g:1729:1: rule__AudioElement__Group__4 : rule__AudioElement__Group__4__Impl rule__AudioElement__Group__5 ;
    public final void rule__AudioElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1733:1: ( rule__AudioElement__Group__4__Impl rule__AudioElement__Group__5 )
            // InternalCinEditor.g:1734:2: rule__AudioElement__Group__4__Impl rule__AudioElement__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:1741:1: rule__AudioElement__Group__4__Impl : ( ( rule__AudioElement__Group_4__0 )? ) ;
    public final void rule__AudioElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1745:1: ( ( ( rule__AudioElement__Group_4__0 )? ) )
            // InternalCinEditor.g:1746:1: ( ( rule__AudioElement__Group_4__0 )? )
            {
            // InternalCinEditor.g:1746:1: ( ( rule__AudioElement__Group_4__0 )? )
            // InternalCinEditor.g:1747:2: ( rule__AudioElement__Group_4__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_4()); 
            // InternalCinEditor.g:1748:2: ( rule__AudioElement__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCinEditor.g:1748:3: rule__AudioElement__Group_4__0
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
    // InternalCinEditor.g:1756:1: rule__AudioElement__Group__5 : rule__AudioElement__Group__5__Impl rule__AudioElement__Group__6 ;
    public final void rule__AudioElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1760:1: ( rule__AudioElement__Group__5__Impl rule__AudioElement__Group__6 )
            // InternalCinEditor.g:1761:2: rule__AudioElement__Group__5__Impl rule__AudioElement__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:1768:1: rule__AudioElement__Group__5__Impl : ( ( rule__AudioElement__Group_5__0 )? ) ;
    public final void rule__AudioElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1772:1: ( ( ( rule__AudioElement__Group_5__0 )? ) )
            // InternalCinEditor.g:1773:1: ( ( rule__AudioElement__Group_5__0 )? )
            {
            // InternalCinEditor.g:1773:1: ( ( rule__AudioElement__Group_5__0 )? )
            // InternalCinEditor.g:1774:2: ( rule__AudioElement__Group_5__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_5()); 
            // InternalCinEditor.g:1775:2: ( rule__AudioElement__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCinEditor.g:1775:3: rule__AudioElement__Group_5__0
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
    // InternalCinEditor.g:1783:1: rule__AudioElement__Group__6 : rule__AudioElement__Group__6__Impl rule__AudioElement__Group__7 ;
    public final void rule__AudioElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1787:1: ( rule__AudioElement__Group__6__Impl rule__AudioElement__Group__7 )
            // InternalCinEditor.g:1788:2: rule__AudioElement__Group__6__Impl rule__AudioElement__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:1795:1: rule__AudioElement__Group__6__Impl : ( ( rule__AudioElement__Group_6__0 )? ) ;
    public final void rule__AudioElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1799:1: ( ( ( rule__AudioElement__Group_6__0 )? ) )
            // InternalCinEditor.g:1800:1: ( ( rule__AudioElement__Group_6__0 )? )
            {
            // InternalCinEditor.g:1800:1: ( ( rule__AudioElement__Group_6__0 )? )
            // InternalCinEditor.g:1801:2: ( rule__AudioElement__Group_6__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_6()); 
            // InternalCinEditor.g:1802:2: ( rule__AudioElement__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCinEditor.g:1802:3: rule__AudioElement__Group_6__0
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
    // InternalCinEditor.g:1810:1: rule__AudioElement__Group__7 : rule__AudioElement__Group__7__Impl rule__AudioElement__Group__8 ;
    public final void rule__AudioElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1814:1: ( rule__AudioElement__Group__7__Impl rule__AudioElement__Group__8 )
            // InternalCinEditor.g:1815:2: rule__AudioElement__Group__7__Impl rule__AudioElement__Group__8
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:1822:1: rule__AudioElement__Group__7__Impl : ( ( rule__AudioElement__Group_7__0 )? ) ;
    public final void rule__AudioElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1826:1: ( ( ( rule__AudioElement__Group_7__0 )? ) )
            // InternalCinEditor.g:1827:1: ( ( rule__AudioElement__Group_7__0 )? )
            {
            // InternalCinEditor.g:1827:1: ( ( rule__AudioElement__Group_7__0 )? )
            // InternalCinEditor.g:1828:2: ( rule__AudioElement__Group_7__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_7()); 
            // InternalCinEditor.g:1829:2: ( rule__AudioElement__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCinEditor.g:1829:3: rule__AudioElement__Group_7__0
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
    // InternalCinEditor.g:1837:1: rule__AudioElement__Group__8 : rule__AudioElement__Group__8__Impl rule__AudioElement__Group__9 ;
    public final void rule__AudioElement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1841:1: ( rule__AudioElement__Group__8__Impl rule__AudioElement__Group__9 )
            // InternalCinEditor.g:1842:2: rule__AudioElement__Group__8__Impl rule__AudioElement__Group__9
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:1849:1: rule__AudioElement__Group__8__Impl : ( ( rule__AudioElement__Group_8__0 )? ) ;
    public final void rule__AudioElement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1853:1: ( ( ( rule__AudioElement__Group_8__0 )? ) )
            // InternalCinEditor.g:1854:1: ( ( rule__AudioElement__Group_8__0 )? )
            {
            // InternalCinEditor.g:1854:1: ( ( rule__AudioElement__Group_8__0 )? )
            // InternalCinEditor.g:1855:2: ( rule__AudioElement__Group_8__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_8()); 
            // InternalCinEditor.g:1856:2: ( rule__AudioElement__Group_8__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCinEditor.g:1856:3: rule__AudioElement__Group_8__0
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
    // InternalCinEditor.g:1864:1: rule__AudioElement__Group__9 : rule__AudioElement__Group__9__Impl rule__AudioElement__Group__10 ;
    public final void rule__AudioElement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1868:1: ( rule__AudioElement__Group__9__Impl rule__AudioElement__Group__10 )
            // InternalCinEditor.g:1869:2: rule__AudioElement__Group__9__Impl rule__AudioElement__Group__10
            {
            pushFollow(FOLLOW_18);
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
    // InternalCinEditor.g:1876:1: rule__AudioElement__Group__9__Impl : ( ( rule__AudioElement__Group_9__0 )? ) ;
    public final void rule__AudioElement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1880:1: ( ( ( rule__AudioElement__Group_9__0 )? ) )
            // InternalCinEditor.g:1881:1: ( ( rule__AudioElement__Group_9__0 )? )
            {
            // InternalCinEditor.g:1881:1: ( ( rule__AudioElement__Group_9__0 )? )
            // InternalCinEditor.g:1882:2: ( rule__AudioElement__Group_9__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_9()); 
            // InternalCinEditor.g:1883:2: ( rule__AudioElement__Group_9__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCinEditor.g:1883:3: rule__AudioElement__Group_9__0
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
    // InternalCinEditor.g:1891:1: rule__AudioElement__Group__10 : rule__AudioElement__Group__10__Impl rule__AudioElement__Group__11 ;
    public final void rule__AudioElement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1895:1: ( rule__AudioElement__Group__10__Impl rule__AudioElement__Group__11 )
            // InternalCinEditor.g:1896:2: rule__AudioElement__Group__10__Impl rule__AudioElement__Group__11
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:1903:1: rule__AudioElement__Group__10__Impl : ( 'on' ) ;
    public final void rule__AudioElement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1907:1: ( ( 'on' ) )
            // InternalCinEditor.g:1908:1: ( 'on' )
            {
            // InternalCinEditor.g:1908:1: ( 'on' )
            // InternalCinEditor.g:1909:2: 'on'
            {
             before(grammarAccess.getAudioElementAccess().getOnKeyword_10()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCinEditor.g:1918:1: rule__AudioElement__Group__11 : rule__AudioElement__Group__11__Impl ;
    public final void rule__AudioElement__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1922:1: ( rule__AudioElement__Group__11__Impl )
            // InternalCinEditor.g:1923:2: rule__AudioElement__Group__11__Impl
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
    // InternalCinEditor.g:1929:1: rule__AudioElement__Group__11__Impl : ( ( rule__AudioElement__ElementAssignment_11 ) ) ;
    public final void rule__AudioElement__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1933:1: ( ( ( rule__AudioElement__ElementAssignment_11 ) ) )
            // InternalCinEditor.g:1934:1: ( ( rule__AudioElement__ElementAssignment_11 ) )
            {
            // InternalCinEditor.g:1934:1: ( ( rule__AudioElement__ElementAssignment_11 ) )
            // InternalCinEditor.g:1935:2: ( rule__AudioElement__ElementAssignment_11 )
            {
             before(grammarAccess.getAudioElementAccess().getElementAssignment_11()); 
            // InternalCinEditor.g:1936:2: ( rule__AudioElement__ElementAssignment_11 )
            // InternalCinEditor.g:1936:3: rule__AudioElement__ElementAssignment_11
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
    // InternalCinEditor.g:1945:1: rule__AudioElement__Group_4__0 : rule__AudioElement__Group_4__0__Impl rule__AudioElement__Group_4__1 ;
    public final void rule__AudioElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1949:1: ( rule__AudioElement__Group_4__0__Impl rule__AudioElement__Group_4__1 )
            // InternalCinEditor.g:1950:2: rule__AudioElement__Group_4__0__Impl rule__AudioElement__Group_4__1
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
    // InternalCinEditor.g:1957:1: rule__AudioElement__Group_4__0__Impl : ( 'volume' ) ;
    public final void rule__AudioElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1961:1: ( ( 'volume' ) )
            // InternalCinEditor.g:1962:1: ( 'volume' )
            {
            // InternalCinEditor.g:1962:1: ( 'volume' )
            // InternalCinEditor.g:1963:2: 'volume'
            {
             before(grammarAccess.getAudioElementAccess().getVolumeKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCinEditor.g:1972:1: rule__AudioElement__Group_4__1 : rule__AudioElement__Group_4__1__Impl ;
    public final void rule__AudioElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1976:1: ( rule__AudioElement__Group_4__1__Impl )
            // InternalCinEditor.g:1977:2: rule__AudioElement__Group_4__1__Impl
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
    // InternalCinEditor.g:1983:1: rule__AudioElement__Group_4__1__Impl : ( ( rule__AudioElement__VolumeAssignment_4_1 ) ) ;
    public final void rule__AudioElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1987:1: ( ( ( rule__AudioElement__VolumeAssignment_4_1 ) ) )
            // InternalCinEditor.g:1988:1: ( ( rule__AudioElement__VolumeAssignment_4_1 ) )
            {
            // InternalCinEditor.g:1988:1: ( ( rule__AudioElement__VolumeAssignment_4_1 ) )
            // InternalCinEditor.g:1989:2: ( rule__AudioElement__VolumeAssignment_4_1 )
            {
             before(grammarAccess.getAudioElementAccess().getVolumeAssignment_4_1()); 
            // InternalCinEditor.g:1990:2: ( rule__AudioElement__VolumeAssignment_4_1 )
            // InternalCinEditor.g:1990:3: rule__AudioElement__VolumeAssignment_4_1
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
    // InternalCinEditor.g:1999:1: rule__AudioElement__Group_5__0 : rule__AudioElement__Group_5__0__Impl rule__AudioElement__Group_5__1 ;
    public final void rule__AudioElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2003:1: ( rule__AudioElement__Group_5__0__Impl rule__AudioElement__Group_5__1 )
            // InternalCinEditor.g:2004:2: rule__AudioElement__Group_5__0__Impl rule__AudioElement__Group_5__1
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
    // InternalCinEditor.g:2011:1: rule__AudioElement__Group_5__0__Impl : ( 'fadeIn' ) ;
    public final void rule__AudioElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2015:1: ( ( 'fadeIn' ) )
            // InternalCinEditor.g:2016:1: ( 'fadeIn' )
            {
            // InternalCinEditor.g:2016:1: ( 'fadeIn' )
            // InternalCinEditor.g:2017:2: 'fadeIn'
            {
             before(grammarAccess.getAudioElementAccess().getFadeInKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCinEditor.g:2026:1: rule__AudioElement__Group_5__1 : rule__AudioElement__Group_5__1__Impl ;
    public final void rule__AudioElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2030:1: ( rule__AudioElement__Group_5__1__Impl )
            // InternalCinEditor.g:2031:2: rule__AudioElement__Group_5__1__Impl
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
    // InternalCinEditor.g:2037:1: rule__AudioElement__Group_5__1__Impl : ( ( rule__AudioElement__FadeInAssignment_5_1 ) ) ;
    public final void rule__AudioElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2041:1: ( ( ( rule__AudioElement__FadeInAssignment_5_1 ) ) )
            // InternalCinEditor.g:2042:1: ( ( rule__AudioElement__FadeInAssignment_5_1 ) )
            {
            // InternalCinEditor.g:2042:1: ( ( rule__AudioElement__FadeInAssignment_5_1 ) )
            // InternalCinEditor.g:2043:2: ( rule__AudioElement__FadeInAssignment_5_1 )
            {
             before(grammarAccess.getAudioElementAccess().getFadeInAssignment_5_1()); 
            // InternalCinEditor.g:2044:2: ( rule__AudioElement__FadeInAssignment_5_1 )
            // InternalCinEditor.g:2044:3: rule__AudioElement__FadeInAssignment_5_1
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
    // InternalCinEditor.g:2053:1: rule__AudioElement__Group_6__0 : rule__AudioElement__Group_6__0__Impl rule__AudioElement__Group_6__1 ;
    public final void rule__AudioElement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2057:1: ( rule__AudioElement__Group_6__0__Impl rule__AudioElement__Group_6__1 )
            // InternalCinEditor.g:2058:2: rule__AudioElement__Group_6__0__Impl rule__AudioElement__Group_6__1
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
    // InternalCinEditor.g:2065:1: rule__AudioElement__Group_6__0__Impl : ( 'fadeOut' ) ;
    public final void rule__AudioElement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2069:1: ( ( 'fadeOut' ) )
            // InternalCinEditor.g:2070:1: ( 'fadeOut' )
            {
            // InternalCinEditor.g:2070:1: ( 'fadeOut' )
            // InternalCinEditor.g:2071:2: 'fadeOut'
            {
             before(grammarAccess.getAudioElementAccess().getFadeOutKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCinEditor.g:2080:1: rule__AudioElement__Group_6__1 : rule__AudioElement__Group_6__1__Impl ;
    public final void rule__AudioElement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2084:1: ( rule__AudioElement__Group_6__1__Impl )
            // InternalCinEditor.g:2085:2: rule__AudioElement__Group_6__1__Impl
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
    // InternalCinEditor.g:2091:1: rule__AudioElement__Group_6__1__Impl : ( ( rule__AudioElement__FadeOutAssignment_6_1 ) ) ;
    public final void rule__AudioElement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2095:1: ( ( ( rule__AudioElement__FadeOutAssignment_6_1 ) ) )
            // InternalCinEditor.g:2096:1: ( ( rule__AudioElement__FadeOutAssignment_6_1 ) )
            {
            // InternalCinEditor.g:2096:1: ( ( rule__AudioElement__FadeOutAssignment_6_1 ) )
            // InternalCinEditor.g:2097:2: ( rule__AudioElement__FadeOutAssignment_6_1 )
            {
             before(grammarAccess.getAudioElementAccess().getFadeOutAssignment_6_1()); 
            // InternalCinEditor.g:2098:2: ( rule__AudioElement__FadeOutAssignment_6_1 )
            // InternalCinEditor.g:2098:3: rule__AudioElement__FadeOutAssignment_6_1
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
    // InternalCinEditor.g:2107:1: rule__AudioElement__Group_7__0 : rule__AudioElement__Group_7__0__Impl rule__AudioElement__Group_7__1 ;
    public final void rule__AudioElement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2111:1: ( rule__AudioElement__Group_7__0__Impl rule__AudioElement__Group_7__1 )
            // InternalCinEditor.g:2112:2: rule__AudioElement__Group_7__0__Impl rule__AudioElement__Group_7__1
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
    // InternalCinEditor.g:2119:1: rule__AudioElement__Group_7__0__Impl : ( 'startAt' ) ;
    public final void rule__AudioElement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2123:1: ( ( 'startAt' ) )
            // InternalCinEditor.g:2124:1: ( 'startAt' )
            {
            // InternalCinEditor.g:2124:1: ( 'startAt' )
            // InternalCinEditor.g:2125:2: 'startAt'
            {
             before(grammarAccess.getAudioElementAccess().getStartAtKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCinEditor.g:2134:1: rule__AudioElement__Group_7__1 : rule__AudioElement__Group_7__1__Impl ;
    public final void rule__AudioElement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2138:1: ( rule__AudioElement__Group_7__1__Impl )
            // InternalCinEditor.g:2139:2: rule__AudioElement__Group_7__1__Impl
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
    // InternalCinEditor.g:2145:1: rule__AudioElement__Group_7__1__Impl : ( ( rule__AudioElement__BeginTimeAssignment_7_1 ) ) ;
    public final void rule__AudioElement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2149:1: ( ( ( rule__AudioElement__BeginTimeAssignment_7_1 ) ) )
            // InternalCinEditor.g:2150:1: ( ( rule__AudioElement__BeginTimeAssignment_7_1 ) )
            {
            // InternalCinEditor.g:2150:1: ( ( rule__AudioElement__BeginTimeAssignment_7_1 ) )
            // InternalCinEditor.g:2151:2: ( rule__AudioElement__BeginTimeAssignment_7_1 )
            {
             before(grammarAccess.getAudioElementAccess().getBeginTimeAssignment_7_1()); 
            // InternalCinEditor.g:2152:2: ( rule__AudioElement__BeginTimeAssignment_7_1 )
            // InternalCinEditor.g:2152:3: rule__AudioElement__BeginTimeAssignment_7_1
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
    // InternalCinEditor.g:2161:1: rule__AudioElement__Group_8__0 : rule__AudioElement__Group_8__0__Impl rule__AudioElement__Group_8__1 ;
    public final void rule__AudioElement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2165:1: ( rule__AudioElement__Group_8__0__Impl rule__AudioElement__Group_8__1 )
            // InternalCinEditor.g:2166:2: rule__AudioElement__Group_8__0__Impl rule__AudioElement__Group_8__1
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
    // InternalCinEditor.g:2173:1: rule__AudioElement__Group_8__0__Impl : ( 'cropAt' ) ;
    public final void rule__AudioElement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2177:1: ( ( 'cropAt' ) )
            // InternalCinEditor.g:2178:1: ( 'cropAt' )
            {
            // InternalCinEditor.g:2178:1: ( 'cropAt' )
            // InternalCinEditor.g:2179:2: 'cropAt'
            {
             before(grammarAccess.getAudioElementAccess().getCropAtKeyword_8_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCinEditor.g:2188:1: rule__AudioElement__Group_8__1 : rule__AudioElement__Group_8__1__Impl ;
    public final void rule__AudioElement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2192:1: ( rule__AudioElement__Group_8__1__Impl )
            // InternalCinEditor.g:2193:2: rule__AudioElement__Group_8__1__Impl
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
    // InternalCinEditor.g:2199:1: rule__AudioElement__Group_8__1__Impl : ( ( rule__AudioElement__BeginCropTimeAssignment_8_1 ) ) ;
    public final void rule__AudioElement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2203:1: ( ( ( rule__AudioElement__BeginCropTimeAssignment_8_1 ) ) )
            // InternalCinEditor.g:2204:1: ( ( rule__AudioElement__BeginCropTimeAssignment_8_1 ) )
            {
            // InternalCinEditor.g:2204:1: ( ( rule__AudioElement__BeginCropTimeAssignment_8_1 ) )
            // InternalCinEditor.g:2205:2: ( rule__AudioElement__BeginCropTimeAssignment_8_1 )
            {
             before(grammarAccess.getAudioElementAccess().getBeginCropTimeAssignment_8_1()); 
            // InternalCinEditor.g:2206:2: ( rule__AudioElement__BeginCropTimeAssignment_8_1 )
            // InternalCinEditor.g:2206:3: rule__AudioElement__BeginCropTimeAssignment_8_1
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
    // InternalCinEditor.g:2215:1: rule__AudioElement__Group_9__0 : rule__AudioElement__Group_9__0__Impl rule__AudioElement__Group_9__1 ;
    public final void rule__AudioElement__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2219:1: ( rule__AudioElement__Group_9__0__Impl rule__AudioElement__Group_9__1 )
            // InternalCinEditor.g:2220:2: rule__AudioElement__Group_9__0__Impl rule__AudioElement__Group_9__1
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
    // InternalCinEditor.g:2227:1: rule__AudioElement__Group_9__0__Impl : ( 'during' ) ;
    public final void rule__AudioElement__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2231:1: ( ( 'during' ) )
            // InternalCinEditor.g:2232:1: ( 'during' )
            {
            // InternalCinEditor.g:2232:1: ( 'during' )
            // InternalCinEditor.g:2233:2: 'during'
            {
             before(grammarAccess.getAudioElementAccess().getDuringKeyword_9_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCinEditor.g:2242:1: rule__AudioElement__Group_9__1 : rule__AudioElement__Group_9__1__Impl ;
    public final void rule__AudioElement__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2246:1: ( rule__AudioElement__Group_9__1__Impl )
            // InternalCinEditor.g:2247:2: rule__AudioElement__Group_9__1__Impl
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
    // InternalCinEditor.g:2253:1: rule__AudioElement__Group_9__1__Impl : ( ( rule__AudioElement__DurationAssignment_9_1 ) ) ;
    public final void rule__AudioElement__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2257:1: ( ( ( rule__AudioElement__DurationAssignment_9_1 ) ) )
            // InternalCinEditor.g:2258:1: ( ( rule__AudioElement__DurationAssignment_9_1 ) )
            {
            // InternalCinEditor.g:2258:1: ( ( rule__AudioElement__DurationAssignment_9_1 ) )
            // InternalCinEditor.g:2259:2: ( rule__AudioElement__DurationAssignment_9_1 )
            {
             before(grammarAccess.getAudioElementAccess().getDurationAssignment_9_1()); 
            // InternalCinEditor.g:2260:2: ( rule__AudioElement__DurationAssignment_9_1 )
            // InternalCinEditor.g:2260:3: rule__AudioElement__DurationAssignment_9_1
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
    // InternalCinEditor.g:2269:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2273:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalCinEditor.g:2274:2: rule__Text__Group__0__Impl rule__Text__Group__1
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
    // InternalCinEditor.g:2281:1: rule__Text__Group__0__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2285:1: ( ( 'Text' ) )
            // InternalCinEditor.g:2286:1: ( 'Text' )
            {
            // InternalCinEditor.g:2286:1: ( 'Text' )
            // InternalCinEditor.g:2287:2: 'Text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCinEditor.g:2296:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2300:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalCinEditor.g:2301:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCinEditor.g:2308:1: rule__Text__Group__1__Impl : ( ( rule__Text__NameAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2312:1: ( ( ( rule__Text__NameAssignment_1 ) ) )
            // InternalCinEditor.g:2313:1: ( ( rule__Text__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:2313:1: ( ( rule__Text__NameAssignment_1 ) )
            // InternalCinEditor.g:2314:2: ( rule__Text__NameAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:2315:2: ( rule__Text__NameAssignment_1 )
            // InternalCinEditor.g:2315:3: rule__Text__NameAssignment_1
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
    // InternalCinEditor.g:2323:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2327:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalCinEditor.g:2328:2: rule__Text__Group__2__Impl rule__Text__Group__3
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
    // InternalCinEditor.g:2335:1: rule__Text__Group__2__Impl : ( '=' ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2339:1: ( ( '=' ) )
            // InternalCinEditor.g:2340:1: ( '=' )
            {
            // InternalCinEditor.g:2340:1: ( '=' )
            // InternalCinEditor.g:2341:2: '='
            {
             before(grammarAccess.getTextAccess().getEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCinEditor.g:2350:1: rule__Text__Group__3 : rule__Text__Group__3__Impl rule__Text__Group__4 ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2354:1: ( rule__Text__Group__3__Impl rule__Text__Group__4 )
            // InternalCinEditor.g:2355:2: rule__Text__Group__3__Impl rule__Text__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:2362:1: rule__Text__Group__3__Impl : ( ( rule__Text__TextAssignment_3 ) ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2366:1: ( ( ( rule__Text__TextAssignment_3 ) ) )
            // InternalCinEditor.g:2367:1: ( ( rule__Text__TextAssignment_3 ) )
            {
            // InternalCinEditor.g:2367:1: ( ( rule__Text__TextAssignment_3 ) )
            // InternalCinEditor.g:2368:2: ( rule__Text__TextAssignment_3 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_3()); 
            // InternalCinEditor.g:2369:2: ( rule__Text__TextAssignment_3 )
            // InternalCinEditor.g:2369:3: rule__Text__TextAssignment_3
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
    // InternalCinEditor.g:2377:1: rule__Text__Group__4 : rule__Text__Group__4__Impl rule__Text__Group__5 ;
    public final void rule__Text__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2381:1: ( rule__Text__Group__4__Impl rule__Text__Group__5 )
            // InternalCinEditor.g:2382:2: rule__Text__Group__4__Impl rule__Text__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:2389:1: rule__Text__Group__4__Impl : ( ( rule__Text__Group_4__0 )? ) ;
    public final void rule__Text__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2393:1: ( ( ( rule__Text__Group_4__0 )? ) )
            // InternalCinEditor.g:2394:1: ( ( rule__Text__Group_4__0 )? )
            {
            // InternalCinEditor.g:2394:1: ( ( rule__Text__Group_4__0 )? )
            // InternalCinEditor.g:2395:2: ( rule__Text__Group_4__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_4()); 
            // InternalCinEditor.g:2396:2: ( rule__Text__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCinEditor.g:2396:3: rule__Text__Group_4__0
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
    // InternalCinEditor.g:2404:1: rule__Text__Group__5 : rule__Text__Group__5__Impl rule__Text__Group__6 ;
    public final void rule__Text__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2408:1: ( rule__Text__Group__5__Impl rule__Text__Group__6 )
            // InternalCinEditor.g:2409:2: rule__Text__Group__5__Impl rule__Text__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:2416:1: rule__Text__Group__5__Impl : ( ( rule__Text__PositionAssignment_5 )? ) ;
    public final void rule__Text__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2420:1: ( ( ( rule__Text__PositionAssignment_5 )? ) )
            // InternalCinEditor.g:2421:1: ( ( rule__Text__PositionAssignment_5 )? )
            {
            // InternalCinEditor.g:2421:1: ( ( rule__Text__PositionAssignment_5 )? )
            // InternalCinEditor.g:2422:2: ( rule__Text__PositionAssignment_5 )?
            {
             before(grammarAccess.getTextAccess().getPositionAssignment_5()); 
            // InternalCinEditor.g:2423:2: ( rule__Text__PositionAssignment_5 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCinEditor.g:2423:3: rule__Text__PositionAssignment_5
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
    // InternalCinEditor.g:2431:1: rule__Text__Group__6 : rule__Text__Group__6__Impl rule__Text__Group__7 ;
    public final void rule__Text__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2435:1: ( rule__Text__Group__6__Impl rule__Text__Group__7 )
            // InternalCinEditor.g:2436:2: rule__Text__Group__6__Impl rule__Text__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:2443:1: rule__Text__Group__6__Impl : ( ( rule__Text__Group_6__0 )? ) ;
    public final void rule__Text__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2447:1: ( ( ( rule__Text__Group_6__0 )? ) )
            // InternalCinEditor.g:2448:1: ( ( rule__Text__Group_6__0 )? )
            {
            // InternalCinEditor.g:2448:1: ( ( rule__Text__Group_6__0 )? )
            // InternalCinEditor.g:2449:2: ( rule__Text__Group_6__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_6()); 
            // InternalCinEditor.g:2450:2: ( rule__Text__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCinEditor.g:2450:3: rule__Text__Group_6__0
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
    // InternalCinEditor.g:2458:1: rule__Text__Group__7 : rule__Text__Group__7__Impl rule__Text__Group__8 ;
    public final void rule__Text__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2462:1: ( rule__Text__Group__7__Impl rule__Text__Group__8 )
            // InternalCinEditor.g:2463:2: rule__Text__Group__7__Impl rule__Text__Group__8
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:2470:1: rule__Text__Group__7__Impl : ( ( rule__Text__Group_7__0 )? ) ;
    public final void rule__Text__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2474:1: ( ( ( rule__Text__Group_7__0 )? ) )
            // InternalCinEditor.g:2475:1: ( ( rule__Text__Group_7__0 )? )
            {
            // InternalCinEditor.g:2475:1: ( ( rule__Text__Group_7__0 )? )
            // InternalCinEditor.g:2476:2: ( rule__Text__Group_7__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_7()); 
            // InternalCinEditor.g:2477:2: ( rule__Text__Group_7__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCinEditor.g:2477:3: rule__Text__Group_7__0
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
    // InternalCinEditor.g:2485:1: rule__Text__Group__8 : rule__Text__Group__8__Impl ;
    public final void rule__Text__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2489:1: ( rule__Text__Group__8__Impl )
            // InternalCinEditor.g:2490:2: rule__Text__Group__8__Impl
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
    // InternalCinEditor.g:2496:1: rule__Text__Group__8__Impl : ( ( rule__Text__ColorAssignment_8 ) ) ;
    public final void rule__Text__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2500:1: ( ( ( rule__Text__ColorAssignment_8 ) ) )
            // InternalCinEditor.g:2501:1: ( ( rule__Text__ColorAssignment_8 ) )
            {
            // InternalCinEditor.g:2501:1: ( ( rule__Text__ColorAssignment_8 ) )
            // InternalCinEditor.g:2502:2: ( rule__Text__ColorAssignment_8 )
            {
             before(grammarAccess.getTextAccess().getColorAssignment_8()); 
            // InternalCinEditor.g:2503:2: ( rule__Text__ColorAssignment_8 )
            // InternalCinEditor.g:2503:3: rule__Text__ColorAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Text__ColorAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getColorAssignment_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Text__Group_4__0"
    // InternalCinEditor.g:2512:1: rule__Text__Group_4__0 : rule__Text__Group_4__0__Impl rule__Text__Group_4__1 ;
    public final void rule__Text__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2516:1: ( rule__Text__Group_4__0__Impl rule__Text__Group_4__1 )
            // InternalCinEditor.g:2517:2: rule__Text__Group_4__0__Impl rule__Text__Group_4__1
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
    // InternalCinEditor.g:2524:1: rule__Text__Group_4__0__Impl : ( 'fontSize' ) ;
    public final void rule__Text__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2528:1: ( ( 'fontSize' ) )
            // InternalCinEditor.g:2529:1: ( 'fontSize' )
            {
            // InternalCinEditor.g:2529:1: ( 'fontSize' )
            // InternalCinEditor.g:2530:2: 'fontSize'
            {
             before(grammarAccess.getTextAccess().getFontSizeKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCinEditor.g:2539:1: rule__Text__Group_4__1 : rule__Text__Group_4__1__Impl ;
    public final void rule__Text__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2543:1: ( rule__Text__Group_4__1__Impl )
            // InternalCinEditor.g:2544:2: rule__Text__Group_4__1__Impl
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
    // InternalCinEditor.g:2550:1: rule__Text__Group_4__1__Impl : ( ( rule__Text__FontSizeAssignment_4_1 ) ) ;
    public final void rule__Text__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2554:1: ( ( ( rule__Text__FontSizeAssignment_4_1 ) ) )
            // InternalCinEditor.g:2555:1: ( ( rule__Text__FontSizeAssignment_4_1 ) )
            {
            // InternalCinEditor.g:2555:1: ( ( rule__Text__FontSizeAssignment_4_1 ) )
            // InternalCinEditor.g:2556:2: ( rule__Text__FontSizeAssignment_4_1 )
            {
             before(grammarAccess.getTextAccess().getFontSizeAssignment_4_1()); 
            // InternalCinEditor.g:2557:2: ( rule__Text__FontSizeAssignment_4_1 )
            // InternalCinEditor.g:2557:3: rule__Text__FontSizeAssignment_4_1
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
    // InternalCinEditor.g:2566:1: rule__Text__Group_6__0 : rule__Text__Group_6__0__Impl rule__Text__Group_6__1 ;
    public final void rule__Text__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2570:1: ( rule__Text__Group_6__0__Impl rule__Text__Group_6__1 )
            // InternalCinEditor.g:2571:2: rule__Text__Group_6__0__Impl rule__Text__Group_6__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCinEditor.g:2578:1: rule__Text__Group_6__0__Impl : ( 'startAt' ) ;
    public final void rule__Text__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2582:1: ( ( 'startAt' ) )
            // InternalCinEditor.g:2583:1: ( 'startAt' )
            {
            // InternalCinEditor.g:2583:1: ( 'startAt' )
            // InternalCinEditor.g:2584:2: 'startAt'
            {
             before(grammarAccess.getTextAccess().getStartAtKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getStartAtKeyword_6_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:2593:1: rule__Text__Group_6__1 : rule__Text__Group_6__1__Impl ;
    public final void rule__Text__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2597:1: ( rule__Text__Group_6__1__Impl )
            // InternalCinEditor.g:2598:2: rule__Text__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCinEditor.g:2604:1: rule__Text__Group_6__1__Impl : ( ( rule__Text__BeginTimeAssignment_6_1 ) ) ;
    public final void rule__Text__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2608:1: ( ( ( rule__Text__BeginTimeAssignment_6_1 ) ) )
            // InternalCinEditor.g:2609:1: ( ( rule__Text__BeginTimeAssignment_6_1 ) )
            {
            // InternalCinEditor.g:2609:1: ( ( rule__Text__BeginTimeAssignment_6_1 ) )
            // InternalCinEditor.g:2610:2: ( rule__Text__BeginTimeAssignment_6_1 )
            {
             before(grammarAccess.getTextAccess().getBeginTimeAssignment_6_1()); 
            // InternalCinEditor.g:2611:2: ( rule__Text__BeginTimeAssignment_6_1 )
            // InternalCinEditor.g:2611:3: rule__Text__BeginTimeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__BeginTimeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getBeginTimeAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Text__Group_7__0"
    // InternalCinEditor.g:2620:1: rule__Text__Group_7__0 : rule__Text__Group_7__0__Impl rule__Text__Group_7__1 ;
    public final void rule__Text__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2624:1: ( rule__Text__Group_7__0__Impl rule__Text__Group_7__1 )
            // InternalCinEditor.g:2625:2: rule__Text__Group_7__0__Impl rule__Text__Group_7__1
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
    // InternalCinEditor.g:2632:1: rule__Text__Group_7__0__Impl : ( 'during' ) ;
    public final void rule__Text__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2636:1: ( ( 'during' ) )
            // InternalCinEditor.g:2637:1: ( 'during' )
            {
            // InternalCinEditor.g:2637:1: ( 'during' )
            // InternalCinEditor.g:2638:2: 'during'
            {
             before(grammarAccess.getTextAccess().getDuringKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getDuringKeyword_7_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:2647:1: rule__Text__Group_7__1 : rule__Text__Group_7__1__Impl ;
    public final void rule__Text__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2651:1: ( rule__Text__Group_7__1__Impl )
            // InternalCinEditor.g:2652:2: rule__Text__Group_7__1__Impl
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
    // InternalCinEditor.g:2658:1: rule__Text__Group_7__1__Impl : ( ( rule__Text__DurationAssignment_7_1 ) ) ;
    public final void rule__Text__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2662:1: ( ( ( rule__Text__DurationAssignment_7_1 ) ) )
            // InternalCinEditor.g:2663:1: ( ( rule__Text__DurationAssignment_7_1 ) )
            {
            // InternalCinEditor.g:2663:1: ( ( rule__Text__DurationAssignment_7_1 ) )
            // InternalCinEditor.g:2664:2: ( rule__Text__DurationAssignment_7_1 )
            {
             before(grammarAccess.getTextAccess().getDurationAssignment_7_1()); 
            // InternalCinEditor.g:2665:2: ( rule__Text__DurationAssignment_7_1 )
            // InternalCinEditor.g:2665:3: rule__Text__DurationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__DurationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getDurationAssignment_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Picture__Group__0"
    // InternalCinEditor.g:2674:1: rule__Picture__Group__0 : rule__Picture__Group__0__Impl rule__Picture__Group__1 ;
    public final void rule__Picture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2678:1: ( rule__Picture__Group__0__Impl rule__Picture__Group__1 )
            // InternalCinEditor.g:2679:2: rule__Picture__Group__0__Impl rule__Picture__Group__1
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
    // InternalCinEditor.g:2686:1: rule__Picture__Group__0__Impl : ( 'Picture' ) ;
    public final void rule__Picture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2690:1: ( ( 'Picture' ) )
            // InternalCinEditor.g:2691:1: ( 'Picture' )
            {
            // InternalCinEditor.g:2691:1: ( 'Picture' )
            // InternalCinEditor.g:2692:2: 'Picture'
            {
             before(grammarAccess.getPictureAccess().getPictureKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCinEditor.g:2701:1: rule__Picture__Group__1 : rule__Picture__Group__1__Impl rule__Picture__Group__2 ;
    public final void rule__Picture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2705:1: ( rule__Picture__Group__1__Impl rule__Picture__Group__2 )
            // InternalCinEditor.g:2706:2: rule__Picture__Group__1__Impl rule__Picture__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCinEditor.g:2713:1: rule__Picture__Group__1__Impl : ( ( rule__Picture__NameAssignment_1 ) ) ;
    public final void rule__Picture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2717:1: ( ( ( rule__Picture__NameAssignment_1 ) ) )
            // InternalCinEditor.g:2718:1: ( ( rule__Picture__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:2718:1: ( ( rule__Picture__NameAssignment_1 ) )
            // InternalCinEditor.g:2719:2: ( rule__Picture__NameAssignment_1 )
            {
             before(grammarAccess.getPictureAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:2720:2: ( rule__Picture__NameAssignment_1 )
            // InternalCinEditor.g:2720:3: rule__Picture__NameAssignment_1
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
    // InternalCinEditor.g:2728:1: rule__Picture__Group__2 : rule__Picture__Group__2__Impl rule__Picture__Group__3 ;
    public final void rule__Picture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2732:1: ( rule__Picture__Group__2__Impl rule__Picture__Group__3 )
            // InternalCinEditor.g:2733:2: rule__Picture__Group__2__Impl rule__Picture__Group__3
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
    // InternalCinEditor.g:2740:1: rule__Picture__Group__2__Impl : ( '=' ) ;
    public final void rule__Picture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2744:1: ( ( '=' ) )
            // InternalCinEditor.g:2745:1: ( '=' )
            {
            // InternalCinEditor.g:2745:1: ( '=' )
            // InternalCinEditor.g:2746:2: '='
            {
             before(grammarAccess.getPictureAccess().getEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCinEditor.g:2755:1: rule__Picture__Group__3 : rule__Picture__Group__3__Impl rule__Picture__Group__4 ;
    public final void rule__Picture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2759:1: ( rule__Picture__Group__3__Impl rule__Picture__Group__4 )
            // InternalCinEditor.g:2760:2: rule__Picture__Group__3__Impl rule__Picture__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:2767:1: rule__Picture__Group__3__Impl : ( ( rule__Picture__UrlAssignment_3 ) ) ;
    public final void rule__Picture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2771:1: ( ( ( rule__Picture__UrlAssignment_3 ) ) )
            // InternalCinEditor.g:2772:1: ( ( rule__Picture__UrlAssignment_3 ) )
            {
            // InternalCinEditor.g:2772:1: ( ( rule__Picture__UrlAssignment_3 ) )
            // InternalCinEditor.g:2773:2: ( rule__Picture__UrlAssignment_3 )
            {
             before(grammarAccess.getPictureAccess().getUrlAssignment_3()); 
            // InternalCinEditor.g:2774:2: ( rule__Picture__UrlAssignment_3 )
            // InternalCinEditor.g:2774:3: rule__Picture__UrlAssignment_3
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
    // InternalCinEditor.g:2782:1: rule__Picture__Group__4 : rule__Picture__Group__4__Impl rule__Picture__Group__5 ;
    public final void rule__Picture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2786:1: ( rule__Picture__Group__4__Impl rule__Picture__Group__5 )
            // InternalCinEditor.g:2787:2: rule__Picture__Group__4__Impl rule__Picture__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:2794:1: rule__Picture__Group__4__Impl : ( ( rule__Picture__PositionAssignment_4 )? ) ;
    public final void rule__Picture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2798:1: ( ( ( rule__Picture__PositionAssignment_4 )? ) )
            // InternalCinEditor.g:2799:1: ( ( rule__Picture__PositionAssignment_4 )? )
            {
            // InternalCinEditor.g:2799:1: ( ( rule__Picture__PositionAssignment_4 )? )
            // InternalCinEditor.g:2800:2: ( rule__Picture__PositionAssignment_4 )?
            {
             before(grammarAccess.getPictureAccess().getPositionAssignment_4()); 
            // InternalCinEditor.g:2801:2: ( rule__Picture__PositionAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCinEditor.g:2801:3: rule__Picture__PositionAssignment_4
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
    // InternalCinEditor.g:2809:1: rule__Picture__Group__5 : rule__Picture__Group__5__Impl rule__Picture__Group__6 ;
    public final void rule__Picture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2813:1: ( rule__Picture__Group__5__Impl rule__Picture__Group__6 )
            // InternalCinEditor.g:2814:2: rule__Picture__Group__5__Impl rule__Picture__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:2821:1: rule__Picture__Group__5__Impl : ( ( rule__Picture__DimensionAssignment_5 )? ) ;
    public final void rule__Picture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2825:1: ( ( ( rule__Picture__DimensionAssignment_5 )? ) )
            // InternalCinEditor.g:2826:1: ( ( rule__Picture__DimensionAssignment_5 )? )
            {
            // InternalCinEditor.g:2826:1: ( ( rule__Picture__DimensionAssignment_5 )? )
            // InternalCinEditor.g:2827:2: ( rule__Picture__DimensionAssignment_5 )?
            {
             before(grammarAccess.getPictureAccess().getDimensionAssignment_5()); 
            // InternalCinEditor.g:2828:2: ( rule__Picture__DimensionAssignment_5 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCinEditor.g:2828:3: rule__Picture__DimensionAssignment_5
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
    // InternalCinEditor.g:2836:1: rule__Picture__Group__6 : rule__Picture__Group__6__Impl rule__Picture__Group__7 ;
    public final void rule__Picture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2840:1: ( rule__Picture__Group__6__Impl rule__Picture__Group__7 )
            // InternalCinEditor.g:2841:2: rule__Picture__Group__6__Impl rule__Picture__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:2848:1: rule__Picture__Group__6__Impl : ( ( rule__Picture__Group_6__0 )? ) ;
    public final void rule__Picture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2852:1: ( ( ( rule__Picture__Group_6__0 )? ) )
            // InternalCinEditor.g:2853:1: ( ( rule__Picture__Group_6__0 )? )
            {
            // InternalCinEditor.g:2853:1: ( ( rule__Picture__Group_6__0 )? )
            // InternalCinEditor.g:2854:2: ( rule__Picture__Group_6__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_6()); 
            // InternalCinEditor.g:2855:2: ( rule__Picture__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCinEditor.g:2855:3: rule__Picture__Group_6__0
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
    // InternalCinEditor.g:2863:1: rule__Picture__Group__7 : rule__Picture__Group__7__Impl ;
    public final void rule__Picture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2867:1: ( rule__Picture__Group__7__Impl )
            // InternalCinEditor.g:2868:2: rule__Picture__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalCinEditor.g:2874:1: rule__Picture__Group__7__Impl : ( ( rule__Picture__Group_7__0 )? ) ;
    public final void rule__Picture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2878:1: ( ( ( rule__Picture__Group_7__0 )? ) )
            // InternalCinEditor.g:2879:1: ( ( rule__Picture__Group_7__0 )? )
            {
            // InternalCinEditor.g:2879:1: ( ( rule__Picture__Group_7__0 )? )
            // InternalCinEditor.g:2880:2: ( rule__Picture__Group_7__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_7()); 
            // InternalCinEditor.g:2881:2: ( rule__Picture__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCinEditor.g:2881:3: rule__Picture__Group_7__0
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


    // $ANTLR start "rule__Picture__Group_6__0"
    // InternalCinEditor.g:2890:1: rule__Picture__Group_6__0 : rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1 ;
    public final void rule__Picture__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2894:1: ( rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1 )
            // InternalCinEditor.g:2895:2: rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCinEditor.g:2902:1: rule__Picture__Group_6__0__Impl : ( 'startAt' ) ;
    public final void rule__Picture__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2906:1: ( ( 'startAt' ) )
            // InternalCinEditor.g:2907:1: ( 'startAt' )
            {
            // InternalCinEditor.g:2907:1: ( 'startAt' )
            // InternalCinEditor.g:2908:2: 'startAt'
            {
             before(grammarAccess.getPictureAccess().getStartAtKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getStartAtKeyword_6_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:2917:1: rule__Picture__Group_6__1 : rule__Picture__Group_6__1__Impl ;
    public final void rule__Picture__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2921:1: ( rule__Picture__Group_6__1__Impl )
            // InternalCinEditor.g:2922:2: rule__Picture__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Picture__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCinEditor.g:2928:1: rule__Picture__Group_6__1__Impl : ( ( rule__Picture__BeginTimeAssignment_6_1 ) ) ;
    public final void rule__Picture__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2932:1: ( ( ( rule__Picture__BeginTimeAssignment_6_1 ) ) )
            // InternalCinEditor.g:2933:1: ( ( rule__Picture__BeginTimeAssignment_6_1 ) )
            {
            // InternalCinEditor.g:2933:1: ( ( rule__Picture__BeginTimeAssignment_6_1 ) )
            // InternalCinEditor.g:2934:2: ( rule__Picture__BeginTimeAssignment_6_1 )
            {
             before(grammarAccess.getPictureAccess().getBeginTimeAssignment_6_1()); 
            // InternalCinEditor.g:2935:2: ( rule__Picture__BeginTimeAssignment_6_1 )
            // InternalCinEditor.g:2935:3: rule__Picture__BeginTimeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Picture__BeginTimeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getBeginTimeAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Picture__Group_7__0"
    // InternalCinEditor.g:2944:1: rule__Picture__Group_7__0 : rule__Picture__Group_7__0__Impl rule__Picture__Group_7__1 ;
    public final void rule__Picture__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2948:1: ( rule__Picture__Group_7__0__Impl rule__Picture__Group_7__1 )
            // InternalCinEditor.g:2949:2: rule__Picture__Group_7__0__Impl rule__Picture__Group_7__1
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
    // InternalCinEditor.g:2956:1: rule__Picture__Group_7__0__Impl : ( 'during' ) ;
    public final void rule__Picture__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2960:1: ( ( 'during' ) )
            // InternalCinEditor.g:2961:1: ( 'during' )
            {
            // InternalCinEditor.g:2961:1: ( 'during' )
            // InternalCinEditor.g:2962:2: 'during'
            {
             before(grammarAccess.getPictureAccess().getDuringKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getDuringKeyword_7_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:2971:1: rule__Picture__Group_7__1 : rule__Picture__Group_7__1__Impl ;
    public final void rule__Picture__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2975:1: ( rule__Picture__Group_7__1__Impl )
            // InternalCinEditor.g:2976:2: rule__Picture__Group_7__1__Impl
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
    // InternalCinEditor.g:2982:1: rule__Picture__Group_7__1__Impl : ( ( rule__Picture__DurationAssignment_7_1 ) ) ;
    public final void rule__Picture__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2986:1: ( ( ( rule__Picture__DurationAssignment_7_1 ) ) )
            // InternalCinEditor.g:2987:1: ( ( rule__Picture__DurationAssignment_7_1 ) )
            {
            // InternalCinEditor.g:2987:1: ( ( rule__Picture__DurationAssignment_7_1 ) )
            // InternalCinEditor.g:2988:2: ( rule__Picture__DurationAssignment_7_1 )
            {
             before(grammarAccess.getPictureAccess().getDurationAssignment_7_1()); 
            // InternalCinEditor.g:2989:2: ( rule__Picture__DurationAssignment_7_1 )
            // InternalCinEditor.g:2989:3: rule__Picture__DurationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Picture__DurationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPictureAccess().getDurationAssignment_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Video__Group__0"
    // InternalCinEditor.g:2998:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3002:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalCinEditor.g:3003:2: rule__Video__Group__0__Impl rule__Video__Group__1
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
    // InternalCinEditor.g:3010:1: rule__Video__Group__0__Impl : ( 'Video' ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3014:1: ( ( 'Video' ) )
            // InternalCinEditor.g:3015:1: ( 'Video' )
            {
            // InternalCinEditor.g:3015:1: ( 'Video' )
            // InternalCinEditor.g:3016:2: 'Video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCinEditor.g:3025:1: rule__Video__Group__1 : rule__Video__Group__1__Impl rule__Video__Group__2 ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3029:1: ( rule__Video__Group__1__Impl rule__Video__Group__2 )
            // InternalCinEditor.g:3030:2: rule__Video__Group__1__Impl rule__Video__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCinEditor.g:3037:1: rule__Video__Group__1__Impl : ( ( rule__Video__NameAssignment_1 ) ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3041:1: ( ( ( rule__Video__NameAssignment_1 ) ) )
            // InternalCinEditor.g:3042:1: ( ( rule__Video__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:3042:1: ( ( rule__Video__NameAssignment_1 ) )
            // InternalCinEditor.g:3043:2: ( rule__Video__NameAssignment_1 )
            {
             before(grammarAccess.getVideoAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:3044:2: ( rule__Video__NameAssignment_1 )
            // InternalCinEditor.g:3044:3: rule__Video__NameAssignment_1
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
    // InternalCinEditor.g:3052:1: rule__Video__Group__2 : rule__Video__Group__2__Impl rule__Video__Group__3 ;
    public final void rule__Video__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3056:1: ( rule__Video__Group__2__Impl rule__Video__Group__3 )
            // InternalCinEditor.g:3057:2: rule__Video__Group__2__Impl rule__Video__Group__3
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
    // InternalCinEditor.g:3064:1: rule__Video__Group__2__Impl : ( '=' ) ;
    public final void rule__Video__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3068:1: ( ( '=' ) )
            // InternalCinEditor.g:3069:1: ( '=' )
            {
            // InternalCinEditor.g:3069:1: ( '=' )
            // InternalCinEditor.g:3070:2: '='
            {
             before(grammarAccess.getVideoAccess().getEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCinEditor.g:3079:1: rule__Video__Group__3 : rule__Video__Group__3__Impl rule__Video__Group__4 ;
    public final void rule__Video__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3083:1: ( rule__Video__Group__3__Impl rule__Video__Group__4 )
            // InternalCinEditor.g:3084:2: rule__Video__Group__3__Impl rule__Video__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:3091:1: rule__Video__Group__3__Impl : ( ( rule__Video__UrlAssignment_3 ) ) ;
    public final void rule__Video__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3095:1: ( ( ( rule__Video__UrlAssignment_3 ) ) )
            // InternalCinEditor.g:3096:1: ( ( rule__Video__UrlAssignment_3 ) )
            {
            // InternalCinEditor.g:3096:1: ( ( rule__Video__UrlAssignment_3 ) )
            // InternalCinEditor.g:3097:2: ( rule__Video__UrlAssignment_3 )
            {
             before(grammarAccess.getVideoAccess().getUrlAssignment_3()); 
            // InternalCinEditor.g:3098:2: ( rule__Video__UrlAssignment_3 )
            // InternalCinEditor.g:3098:3: rule__Video__UrlAssignment_3
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
    // InternalCinEditor.g:3106:1: rule__Video__Group__4 : rule__Video__Group__4__Impl rule__Video__Group__5 ;
    public final void rule__Video__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3110:1: ( rule__Video__Group__4__Impl rule__Video__Group__5 )
            // InternalCinEditor.g:3111:2: rule__Video__Group__4__Impl rule__Video__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:3118:1: rule__Video__Group__4__Impl : ( ( rule__Video__Group_4__0 )? ) ;
    public final void rule__Video__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3122:1: ( ( ( rule__Video__Group_4__0 )? ) )
            // InternalCinEditor.g:3123:1: ( ( rule__Video__Group_4__0 )? )
            {
            // InternalCinEditor.g:3123:1: ( ( rule__Video__Group_4__0 )? )
            // InternalCinEditor.g:3124:2: ( rule__Video__Group_4__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_4()); 
            // InternalCinEditor.g:3125:2: ( rule__Video__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCinEditor.g:3125:3: rule__Video__Group_4__0
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
    // InternalCinEditor.g:3133:1: rule__Video__Group__5 : rule__Video__Group__5__Impl rule__Video__Group__6 ;
    public final void rule__Video__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3137:1: ( rule__Video__Group__5__Impl rule__Video__Group__6 )
            // InternalCinEditor.g:3138:2: rule__Video__Group__5__Impl rule__Video__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalCinEditor.g:3145:1: rule__Video__Group__5__Impl : ( ( rule__Video__PositionAssignment_5 )? ) ;
    public final void rule__Video__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3149:1: ( ( ( rule__Video__PositionAssignment_5 )? ) )
            // InternalCinEditor.g:3150:1: ( ( rule__Video__PositionAssignment_5 )? )
            {
            // InternalCinEditor.g:3150:1: ( ( rule__Video__PositionAssignment_5 )? )
            // InternalCinEditor.g:3151:2: ( rule__Video__PositionAssignment_5 )?
            {
             before(grammarAccess.getVideoAccess().getPositionAssignment_5()); 
            // InternalCinEditor.g:3152:2: ( rule__Video__PositionAssignment_5 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCinEditor.g:3152:3: rule__Video__PositionAssignment_5
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
    // InternalCinEditor.g:3160:1: rule__Video__Group__6 : rule__Video__Group__6__Impl rule__Video__Group__7 ;
    public final void rule__Video__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3164:1: ( rule__Video__Group__6__Impl rule__Video__Group__7 )
            // InternalCinEditor.g:3165:2: rule__Video__Group__6__Impl rule__Video__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalCinEditor.g:3172:1: rule__Video__Group__6__Impl : ( ( rule__Video__DimensionAssignment_6 ) ) ;
    public final void rule__Video__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3176:1: ( ( ( rule__Video__DimensionAssignment_6 ) ) )
            // InternalCinEditor.g:3177:1: ( ( rule__Video__DimensionAssignment_6 ) )
            {
            // InternalCinEditor.g:3177:1: ( ( rule__Video__DimensionAssignment_6 ) )
            // InternalCinEditor.g:3178:2: ( rule__Video__DimensionAssignment_6 )
            {
             before(grammarAccess.getVideoAccess().getDimensionAssignment_6()); 
            // InternalCinEditor.g:3179:2: ( rule__Video__DimensionAssignment_6 )
            // InternalCinEditor.g:3179:3: rule__Video__DimensionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Video__DimensionAssignment_6();

            state._fsp--;


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
    // InternalCinEditor.g:3187:1: rule__Video__Group__7 : rule__Video__Group__7__Impl rule__Video__Group__8 ;
    public final void rule__Video__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3191:1: ( rule__Video__Group__7__Impl rule__Video__Group__8 )
            // InternalCinEditor.g:3192:2: rule__Video__Group__7__Impl rule__Video__Group__8
            {
            pushFollow(FOLLOW_23);
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
    // InternalCinEditor.g:3199:1: rule__Video__Group__7__Impl : ( ( rule__Video__Group_7__0 )? ) ;
    public final void rule__Video__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3203:1: ( ( ( rule__Video__Group_7__0 )? ) )
            // InternalCinEditor.g:3204:1: ( ( rule__Video__Group_7__0 )? )
            {
            // InternalCinEditor.g:3204:1: ( ( rule__Video__Group_7__0 )? )
            // InternalCinEditor.g:3205:2: ( rule__Video__Group_7__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_7()); 
            // InternalCinEditor.g:3206:2: ( rule__Video__Group_7__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCinEditor.g:3206:3: rule__Video__Group_7__0
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
    // InternalCinEditor.g:3214:1: rule__Video__Group__8 : rule__Video__Group__8__Impl rule__Video__Group__9 ;
    public final void rule__Video__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3218:1: ( rule__Video__Group__8__Impl rule__Video__Group__9 )
            // InternalCinEditor.g:3219:2: rule__Video__Group__8__Impl rule__Video__Group__9
            {
            pushFollow(FOLLOW_23);
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
    // InternalCinEditor.g:3226:1: rule__Video__Group__8__Impl : ( ( rule__Video__Group_8__0 )? ) ;
    public final void rule__Video__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3230:1: ( ( ( rule__Video__Group_8__0 )? ) )
            // InternalCinEditor.g:3231:1: ( ( rule__Video__Group_8__0 )? )
            {
            // InternalCinEditor.g:3231:1: ( ( rule__Video__Group_8__0 )? )
            // InternalCinEditor.g:3232:2: ( rule__Video__Group_8__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_8()); 
            // InternalCinEditor.g:3233:2: ( rule__Video__Group_8__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCinEditor.g:3233:3: rule__Video__Group_8__0
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
    // InternalCinEditor.g:3241:1: rule__Video__Group__9 : rule__Video__Group__9__Impl ;
    public final void rule__Video__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3245:1: ( rule__Video__Group__9__Impl )
            // InternalCinEditor.g:3246:2: rule__Video__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalCinEditor.g:3252:1: rule__Video__Group__9__Impl : ( ( rule__Video__Group_9__0 )? ) ;
    public final void rule__Video__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3256:1: ( ( ( rule__Video__Group_9__0 )? ) )
            // InternalCinEditor.g:3257:1: ( ( rule__Video__Group_9__0 )? )
            {
            // InternalCinEditor.g:3257:1: ( ( rule__Video__Group_9__0 )? )
            // InternalCinEditor.g:3258:2: ( rule__Video__Group_9__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_9()); 
            // InternalCinEditor.g:3259:2: ( rule__Video__Group_9__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCinEditor.g:3259:3: rule__Video__Group_9__0
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


    // $ANTLR start "rule__Video__Group_4__0"
    // InternalCinEditor.g:3268:1: rule__Video__Group_4__0 : rule__Video__Group_4__0__Impl rule__Video__Group_4__1 ;
    public final void rule__Video__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3272:1: ( rule__Video__Group_4__0__Impl rule__Video__Group_4__1 )
            // InternalCinEditor.g:3273:2: rule__Video__Group_4__0__Impl rule__Video__Group_4__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalCinEditor.g:3280:1: rule__Video__Group_4__0__Impl : ( 'audio' ) ;
    public final void rule__Video__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3284:1: ( ( 'audio' ) )
            // InternalCinEditor.g:3285:1: ( 'audio' )
            {
            // InternalCinEditor.g:3285:1: ( 'audio' )
            // InternalCinEditor.g:3286:2: 'audio'
            {
             before(grammarAccess.getVideoAccess().getAudioKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCinEditor.g:3295:1: rule__Video__Group_4__1 : rule__Video__Group_4__1__Impl ;
    public final void rule__Video__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3299:1: ( rule__Video__Group_4__1__Impl )
            // InternalCinEditor.g:3300:2: rule__Video__Group_4__1__Impl
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
    // InternalCinEditor.g:3306:1: rule__Video__Group_4__1__Impl : ( ( rule__Video__EnableAudioAssignment_4_1 ) ) ;
    public final void rule__Video__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3310:1: ( ( ( rule__Video__EnableAudioAssignment_4_1 ) ) )
            // InternalCinEditor.g:3311:1: ( ( rule__Video__EnableAudioAssignment_4_1 ) )
            {
            // InternalCinEditor.g:3311:1: ( ( rule__Video__EnableAudioAssignment_4_1 ) )
            // InternalCinEditor.g:3312:2: ( rule__Video__EnableAudioAssignment_4_1 )
            {
             before(grammarAccess.getVideoAccess().getEnableAudioAssignment_4_1()); 
            // InternalCinEditor.g:3313:2: ( rule__Video__EnableAudioAssignment_4_1 )
            // InternalCinEditor.g:3313:3: rule__Video__EnableAudioAssignment_4_1
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
    // InternalCinEditor.g:3322:1: rule__Video__Group_7__0 : rule__Video__Group_7__0__Impl rule__Video__Group_7__1 ;
    public final void rule__Video__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3326:1: ( rule__Video__Group_7__0__Impl rule__Video__Group_7__1 )
            // InternalCinEditor.g:3327:2: rule__Video__Group_7__0__Impl rule__Video__Group_7__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCinEditor.g:3334:1: rule__Video__Group_7__0__Impl : ( 'startAt' ) ;
    public final void rule__Video__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3338:1: ( ( 'startAt' ) )
            // InternalCinEditor.g:3339:1: ( 'startAt' )
            {
            // InternalCinEditor.g:3339:1: ( 'startAt' )
            // InternalCinEditor.g:3340:2: 'startAt'
            {
             before(grammarAccess.getVideoAccess().getStartAtKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getStartAtKeyword_7_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:3349:1: rule__Video__Group_7__1 : rule__Video__Group_7__1__Impl ;
    public final void rule__Video__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3353:1: ( rule__Video__Group_7__1__Impl )
            // InternalCinEditor.g:3354:2: rule__Video__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_7__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCinEditor.g:3360:1: rule__Video__Group_7__1__Impl : ( ( rule__Video__BeginTimeAssignment_7_1 ) ) ;
    public final void rule__Video__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3364:1: ( ( ( rule__Video__BeginTimeAssignment_7_1 ) ) )
            // InternalCinEditor.g:3365:1: ( ( rule__Video__BeginTimeAssignment_7_1 ) )
            {
            // InternalCinEditor.g:3365:1: ( ( rule__Video__BeginTimeAssignment_7_1 ) )
            // InternalCinEditor.g:3366:2: ( rule__Video__BeginTimeAssignment_7_1 )
            {
             before(grammarAccess.getVideoAccess().getBeginTimeAssignment_7_1()); 
            // InternalCinEditor.g:3367:2: ( rule__Video__BeginTimeAssignment_7_1 )
            // InternalCinEditor.g:3367:3: rule__Video__BeginTimeAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__BeginTimeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getBeginTimeAssignment_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Video__Group_8__0"
    // InternalCinEditor.g:3376:1: rule__Video__Group_8__0 : rule__Video__Group_8__0__Impl rule__Video__Group_8__1 ;
    public final void rule__Video__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3380:1: ( rule__Video__Group_8__0__Impl rule__Video__Group_8__1 )
            // InternalCinEditor.g:3381:2: rule__Video__Group_8__0__Impl rule__Video__Group_8__1
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
    // InternalCinEditor.g:3388:1: rule__Video__Group_8__0__Impl : ( 'cropAt' ) ;
    public final void rule__Video__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3392:1: ( ( 'cropAt' ) )
            // InternalCinEditor.g:3393:1: ( 'cropAt' )
            {
            // InternalCinEditor.g:3393:1: ( 'cropAt' )
            // InternalCinEditor.g:3394:2: 'cropAt'
            {
             before(grammarAccess.getVideoAccess().getCropAtKeyword_8_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getCropAtKeyword_8_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:3403:1: rule__Video__Group_8__1 : rule__Video__Group_8__1__Impl ;
    public final void rule__Video__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3407:1: ( rule__Video__Group_8__1__Impl )
            // InternalCinEditor.g:3408:2: rule__Video__Group_8__1__Impl
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
    // InternalCinEditor.g:3414:1: rule__Video__Group_8__1__Impl : ( ( rule__Video__BeginCropTimeAssignment_8_1 ) ) ;
    public final void rule__Video__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3418:1: ( ( ( rule__Video__BeginCropTimeAssignment_8_1 ) ) )
            // InternalCinEditor.g:3419:1: ( ( rule__Video__BeginCropTimeAssignment_8_1 ) )
            {
            // InternalCinEditor.g:3419:1: ( ( rule__Video__BeginCropTimeAssignment_8_1 ) )
            // InternalCinEditor.g:3420:2: ( rule__Video__BeginCropTimeAssignment_8_1 )
            {
             before(grammarAccess.getVideoAccess().getBeginCropTimeAssignment_8_1()); 
            // InternalCinEditor.g:3421:2: ( rule__Video__BeginCropTimeAssignment_8_1 )
            // InternalCinEditor.g:3421:3: rule__Video__BeginCropTimeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__BeginCropTimeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getBeginCropTimeAssignment_8_1()); 

            }


            }

        }
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
    // InternalCinEditor.g:3430:1: rule__Video__Group_9__0 : rule__Video__Group_9__0__Impl rule__Video__Group_9__1 ;
    public final void rule__Video__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3434:1: ( rule__Video__Group_9__0__Impl rule__Video__Group_9__1 )
            // InternalCinEditor.g:3435:2: rule__Video__Group_9__0__Impl rule__Video__Group_9__1
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
    // InternalCinEditor.g:3442:1: rule__Video__Group_9__0__Impl : ( 'during' ) ;
    public final void rule__Video__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3446:1: ( ( 'during' ) )
            // InternalCinEditor.g:3447:1: ( 'during' )
            {
            // InternalCinEditor.g:3447:1: ( 'during' )
            // InternalCinEditor.g:3448:2: 'during'
            {
             before(grammarAccess.getVideoAccess().getDuringKeyword_9_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getDuringKeyword_9_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:3457:1: rule__Video__Group_9__1 : rule__Video__Group_9__1__Impl ;
    public final void rule__Video__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3461:1: ( rule__Video__Group_9__1__Impl )
            // InternalCinEditor.g:3462:2: rule__Video__Group_9__1__Impl
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
    // InternalCinEditor.g:3468:1: rule__Video__Group_9__1__Impl : ( ( rule__Video__DurationAssignment_9_1 ) ) ;
    public final void rule__Video__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3472:1: ( ( ( rule__Video__DurationAssignment_9_1 ) ) )
            // InternalCinEditor.g:3473:1: ( ( rule__Video__DurationAssignment_9_1 ) )
            {
            // InternalCinEditor.g:3473:1: ( ( rule__Video__DurationAssignment_9_1 ) )
            // InternalCinEditor.g:3474:2: ( rule__Video__DurationAssignment_9_1 )
            {
             before(grammarAccess.getVideoAccess().getDurationAssignment_9_1()); 
            // InternalCinEditor.g:3475:2: ( rule__Video__DurationAssignment_9_1 )
            // InternalCinEditor.g:3475:3: rule__Video__DurationAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__DurationAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getDurationAssignment_9_1()); 

            }


            }

        }
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
    // InternalCinEditor.g:3484:1: rule__Rectangle__Group__0 : rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 ;
    public final void rule__Rectangle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3488:1: ( rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 )
            // InternalCinEditor.g:3489:2: rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1
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
    // InternalCinEditor.g:3496:1: rule__Rectangle__Group__0__Impl : ( 'Rectangle' ) ;
    public final void rule__Rectangle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3500:1: ( ( 'Rectangle' ) )
            // InternalCinEditor.g:3501:1: ( 'Rectangle' )
            {
            // InternalCinEditor.g:3501:1: ( 'Rectangle' )
            // InternalCinEditor.g:3502:2: 'Rectangle'
            {
             before(grammarAccess.getRectangleAccess().getRectangleKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCinEditor.g:3511:1: rule__Rectangle__Group__1 : rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 ;
    public final void rule__Rectangle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3515:1: ( rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 )
            // InternalCinEditor.g:3516:2: rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCinEditor.g:3523:1: rule__Rectangle__Group__1__Impl : ( ( rule__Rectangle__NameAssignment_1 ) ) ;
    public final void rule__Rectangle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3527:1: ( ( ( rule__Rectangle__NameAssignment_1 ) ) )
            // InternalCinEditor.g:3528:1: ( ( rule__Rectangle__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:3528:1: ( ( rule__Rectangle__NameAssignment_1 ) )
            // InternalCinEditor.g:3529:2: ( rule__Rectangle__NameAssignment_1 )
            {
             before(grammarAccess.getRectangleAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:3530:2: ( rule__Rectangle__NameAssignment_1 )
            // InternalCinEditor.g:3530:3: rule__Rectangle__NameAssignment_1
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
    // InternalCinEditor.g:3538:1: rule__Rectangle__Group__2 : rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 ;
    public final void rule__Rectangle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3542:1: ( rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 )
            // InternalCinEditor.g:3543:2: rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalCinEditor.g:3550:1: rule__Rectangle__Group__2__Impl : ( '=' ) ;
    public final void rule__Rectangle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3554:1: ( ( '=' ) )
            // InternalCinEditor.g:3555:1: ( '=' )
            {
            // InternalCinEditor.g:3555:1: ( '=' )
            // InternalCinEditor.g:3556:2: '='
            {
             before(grammarAccess.getRectangleAccess().getEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCinEditor.g:3565:1: rule__Rectangle__Group__3 : rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 ;
    public final void rule__Rectangle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3569:1: ( rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 )
            // InternalCinEditor.g:3570:2: rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:3577:1: rule__Rectangle__Group__3__Impl : ( ( rule__Rectangle__ColorAssignment_3 ) ) ;
    public final void rule__Rectangle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3581:1: ( ( ( rule__Rectangle__ColorAssignment_3 ) ) )
            // InternalCinEditor.g:3582:1: ( ( rule__Rectangle__ColorAssignment_3 ) )
            {
            // InternalCinEditor.g:3582:1: ( ( rule__Rectangle__ColorAssignment_3 ) )
            // InternalCinEditor.g:3583:2: ( rule__Rectangle__ColorAssignment_3 )
            {
             before(grammarAccess.getRectangleAccess().getColorAssignment_3()); 
            // InternalCinEditor.g:3584:2: ( rule__Rectangle__ColorAssignment_3 )
            // InternalCinEditor.g:3584:3: rule__Rectangle__ColorAssignment_3
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
    // InternalCinEditor.g:3592:1: rule__Rectangle__Group__4 : rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 ;
    public final void rule__Rectangle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3596:1: ( rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 )
            // InternalCinEditor.g:3597:2: rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:3604:1: rule__Rectangle__Group__4__Impl : ( ( rule__Rectangle__PositionAssignment_4 )? ) ;
    public final void rule__Rectangle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3608:1: ( ( ( rule__Rectangle__PositionAssignment_4 )? ) )
            // InternalCinEditor.g:3609:1: ( ( rule__Rectangle__PositionAssignment_4 )? )
            {
            // InternalCinEditor.g:3609:1: ( ( rule__Rectangle__PositionAssignment_4 )? )
            // InternalCinEditor.g:3610:2: ( rule__Rectangle__PositionAssignment_4 )?
            {
             before(grammarAccess.getRectangleAccess().getPositionAssignment_4()); 
            // InternalCinEditor.g:3611:2: ( rule__Rectangle__PositionAssignment_4 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCinEditor.g:3611:3: rule__Rectangle__PositionAssignment_4
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
    // InternalCinEditor.g:3619:1: rule__Rectangle__Group__5 : rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 ;
    public final void rule__Rectangle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3623:1: ( rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 )
            // InternalCinEditor.g:3624:2: rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:3631:1: rule__Rectangle__Group__5__Impl : ( ( rule__Rectangle__DimensionAssignment_5 )? ) ;
    public final void rule__Rectangle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3635:1: ( ( ( rule__Rectangle__DimensionAssignment_5 )? ) )
            // InternalCinEditor.g:3636:1: ( ( rule__Rectangle__DimensionAssignment_5 )? )
            {
            // InternalCinEditor.g:3636:1: ( ( rule__Rectangle__DimensionAssignment_5 )? )
            // InternalCinEditor.g:3637:2: ( rule__Rectangle__DimensionAssignment_5 )?
            {
             before(grammarAccess.getRectangleAccess().getDimensionAssignment_5()); 
            // InternalCinEditor.g:3638:2: ( rule__Rectangle__DimensionAssignment_5 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCinEditor.g:3638:3: rule__Rectangle__DimensionAssignment_5
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
    // InternalCinEditor.g:3646:1: rule__Rectangle__Group__6 : rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 ;
    public final void rule__Rectangle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3650:1: ( rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 )
            // InternalCinEditor.g:3651:2: rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:3658:1: rule__Rectangle__Group__6__Impl : ( ( rule__Rectangle__Group_6__0 )? ) ;
    public final void rule__Rectangle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3662:1: ( ( ( rule__Rectangle__Group_6__0 )? ) )
            // InternalCinEditor.g:3663:1: ( ( rule__Rectangle__Group_6__0 )? )
            {
            // InternalCinEditor.g:3663:1: ( ( rule__Rectangle__Group_6__0 )? )
            // InternalCinEditor.g:3664:2: ( rule__Rectangle__Group_6__0 )?
            {
             before(grammarAccess.getRectangleAccess().getGroup_6()); 
            // InternalCinEditor.g:3665:2: ( rule__Rectangle__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCinEditor.g:3665:3: rule__Rectangle__Group_6__0
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
    // InternalCinEditor.g:3673:1: rule__Rectangle__Group__7 : rule__Rectangle__Group__7__Impl ;
    public final void rule__Rectangle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3677:1: ( rule__Rectangle__Group__7__Impl )
            // InternalCinEditor.g:3678:2: rule__Rectangle__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalCinEditor.g:3684:1: rule__Rectangle__Group__7__Impl : ( ( rule__Rectangle__Group_7__0 )? ) ;
    public final void rule__Rectangle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3688:1: ( ( ( rule__Rectangle__Group_7__0 )? ) )
            // InternalCinEditor.g:3689:1: ( ( rule__Rectangle__Group_7__0 )? )
            {
            // InternalCinEditor.g:3689:1: ( ( rule__Rectangle__Group_7__0 )? )
            // InternalCinEditor.g:3690:2: ( rule__Rectangle__Group_7__0 )?
            {
             before(grammarAccess.getRectangleAccess().getGroup_7()); 
            // InternalCinEditor.g:3691:2: ( rule__Rectangle__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCinEditor.g:3691:3: rule__Rectangle__Group_7__0
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


    // $ANTLR start "rule__Rectangle__Group_6__0"
    // InternalCinEditor.g:3700:1: rule__Rectangle__Group_6__0 : rule__Rectangle__Group_6__0__Impl rule__Rectangle__Group_6__1 ;
    public final void rule__Rectangle__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3704:1: ( rule__Rectangle__Group_6__0__Impl rule__Rectangle__Group_6__1 )
            // InternalCinEditor.g:3705:2: rule__Rectangle__Group_6__0__Impl rule__Rectangle__Group_6__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCinEditor.g:3712:1: rule__Rectangle__Group_6__0__Impl : ( 'startAt' ) ;
    public final void rule__Rectangle__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3716:1: ( ( 'startAt' ) )
            // InternalCinEditor.g:3717:1: ( 'startAt' )
            {
            // InternalCinEditor.g:3717:1: ( 'startAt' )
            // InternalCinEditor.g:3718:2: 'startAt'
            {
             before(grammarAccess.getRectangleAccess().getStartAtKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getStartAtKeyword_6_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:3727:1: rule__Rectangle__Group_6__1 : rule__Rectangle__Group_6__1__Impl ;
    public final void rule__Rectangle__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3731:1: ( rule__Rectangle__Group_6__1__Impl )
            // InternalCinEditor.g:3732:2: rule__Rectangle__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalCinEditor.g:3738:1: rule__Rectangle__Group_6__1__Impl : ( ( rule__Rectangle__BeginTimeAssignment_6_1 ) ) ;
    public final void rule__Rectangle__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3742:1: ( ( ( rule__Rectangle__BeginTimeAssignment_6_1 ) ) )
            // InternalCinEditor.g:3743:1: ( ( rule__Rectangle__BeginTimeAssignment_6_1 ) )
            {
            // InternalCinEditor.g:3743:1: ( ( rule__Rectangle__BeginTimeAssignment_6_1 ) )
            // InternalCinEditor.g:3744:2: ( rule__Rectangle__BeginTimeAssignment_6_1 )
            {
             before(grammarAccess.getRectangleAccess().getBeginTimeAssignment_6_1()); 
            // InternalCinEditor.g:3745:2: ( rule__Rectangle__BeginTimeAssignment_6_1 )
            // InternalCinEditor.g:3745:3: rule__Rectangle__BeginTimeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__BeginTimeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getBeginTimeAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Rectangle__Group_7__0"
    // InternalCinEditor.g:3754:1: rule__Rectangle__Group_7__0 : rule__Rectangle__Group_7__0__Impl rule__Rectangle__Group_7__1 ;
    public final void rule__Rectangle__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3758:1: ( rule__Rectangle__Group_7__0__Impl rule__Rectangle__Group_7__1 )
            // InternalCinEditor.g:3759:2: rule__Rectangle__Group_7__0__Impl rule__Rectangle__Group_7__1
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
    // InternalCinEditor.g:3766:1: rule__Rectangle__Group_7__0__Impl : ( 'during' ) ;
    public final void rule__Rectangle__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3770:1: ( ( 'during' ) )
            // InternalCinEditor.g:3771:1: ( 'during' )
            {
            // InternalCinEditor.g:3771:1: ( 'during' )
            // InternalCinEditor.g:3772:2: 'during'
            {
             before(grammarAccess.getRectangleAccess().getDuringKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getDuringKeyword_7_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:3781:1: rule__Rectangle__Group_7__1 : rule__Rectangle__Group_7__1__Impl ;
    public final void rule__Rectangle__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3785:1: ( rule__Rectangle__Group_7__1__Impl )
            // InternalCinEditor.g:3786:2: rule__Rectangle__Group_7__1__Impl
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
    // InternalCinEditor.g:3792:1: rule__Rectangle__Group_7__1__Impl : ( ( rule__Rectangle__DurationAssignment_7_1 ) ) ;
    public final void rule__Rectangle__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3796:1: ( ( ( rule__Rectangle__DurationAssignment_7_1 ) ) )
            // InternalCinEditor.g:3797:1: ( ( rule__Rectangle__DurationAssignment_7_1 ) )
            {
            // InternalCinEditor.g:3797:1: ( ( rule__Rectangle__DurationAssignment_7_1 ) )
            // InternalCinEditor.g:3798:2: ( rule__Rectangle__DurationAssignment_7_1 )
            {
             before(grammarAccess.getRectangleAccess().getDurationAssignment_7_1()); 
            // InternalCinEditor.g:3799:2: ( rule__Rectangle__DurationAssignment_7_1 )
            // InternalCinEditor.g:3799:3: rule__Rectangle__DurationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Rectangle__DurationAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getDurationAssignment_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__FadeIn__Group__0"
    // InternalCinEditor.g:3808:1: rule__FadeIn__Group__0 : rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 ;
    public final void rule__FadeIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3812:1: ( rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 )
            // InternalCinEditor.g:3813:2: rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1
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
    // InternalCinEditor.g:3820:1: rule__FadeIn__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__FadeIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3824:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:3825:1: ( 'Effect' )
            {
            // InternalCinEditor.g:3825:1: ( 'Effect' )
            // InternalCinEditor.g:3826:2: 'Effect'
            {
             before(grammarAccess.getFadeInAccess().getEffectKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCinEditor.g:3835:1: rule__FadeIn__Group__1 : rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 ;
    public final void rule__FadeIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3839:1: ( rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 )
            // InternalCinEditor.g:3840:2: rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCinEditor.g:3847:1: rule__FadeIn__Group__1__Impl : ( ( rule__FadeIn__NameAssignment_1 ) ) ;
    public final void rule__FadeIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3851:1: ( ( ( rule__FadeIn__NameAssignment_1 ) ) )
            // InternalCinEditor.g:3852:1: ( ( rule__FadeIn__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:3852:1: ( ( rule__FadeIn__NameAssignment_1 ) )
            // InternalCinEditor.g:3853:2: ( rule__FadeIn__NameAssignment_1 )
            {
             before(grammarAccess.getFadeInAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:3854:2: ( rule__FadeIn__NameAssignment_1 )
            // InternalCinEditor.g:3854:3: rule__FadeIn__NameAssignment_1
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
    // InternalCinEditor.g:3862:1: rule__FadeIn__Group__2 : rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 ;
    public final void rule__FadeIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3866:1: ( rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 )
            // InternalCinEditor.g:3867:2: rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3874:1: rule__FadeIn__Group__2__Impl : ( '=' ) ;
    public final void rule__FadeIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3878:1: ( ( '=' ) )
            // InternalCinEditor.g:3879:1: ( '=' )
            {
            // InternalCinEditor.g:3879:1: ( '=' )
            // InternalCinEditor.g:3880:2: '='
            {
             before(grammarAccess.getFadeInAccess().getEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCinEditor.g:3889:1: rule__FadeIn__Group__3 : rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 ;
    public final void rule__FadeIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3893:1: ( rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 )
            // InternalCinEditor.g:3894:2: rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalCinEditor.g:3901:1: rule__FadeIn__Group__3__Impl : ( 'FadeIn' ) ;
    public final void rule__FadeIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3905:1: ( ( 'FadeIn' ) )
            // InternalCinEditor.g:3906:1: ( 'FadeIn' )
            {
            // InternalCinEditor.g:3906:1: ( 'FadeIn' )
            // InternalCinEditor.g:3907:2: 'FadeIn'
            {
             before(grammarAccess.getFadeInAccess().getFadeInKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCinEditor.g:3916:1: rule__FadeIn__Group__4 : rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5 ;
    public final void rule__FadeIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3920:1: ( rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5 )
            // InternalCinEditor.g:3921:2: rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5
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
    // InternalCinEditor.g:3928:1: rule__FadeIn__Group__4__Impl : ( 'during' ) ;
    public final void rule__FadeIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3932:1: ( ( 'during' ) )
            // InternalCinEditor.g:3933:1: ( 'during' )
            {
            // InternalCinEditor.g:3933:1: ( 'during' )
            // InternalCinEditor.g:3934:2: 'during'
            {
             before(grammarAccess.getFadeInAccess().getDuringKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCinEditor.g:3943:1: rule__FadeIn__Group__5 : rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6 ;
    public final void rule__FadeIn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3947:1: ( rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6 )
            // InternalCinEditor.g:3948:2: rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalCinEditor.g:3955:1: rule__FadeIn__Group__5__Impl : ( ( rule__FadeIn__DurationAssignment_5 ) ) ;
    public final void rule__FadeIn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3959:1: ( ( ( rule__FadeIn__DurationAssignment_5 ) ) )
            // InternalCinEditor.g:3960:1: ( ( rule__FadeIn__DurationAssignment_5 ) )
            {
            // InternalCinEditor.g:3960:1: ( ( rule__FadeIn__DurationAssignment_5 ) )
            // InternalCinEditor.g:3961:2: ( rule__FadeIn__DurationAssignment_5 )
            {
             before(grammarAccess.getFadeInAccess().getDurationAssignment_5()); 
            // InternalCinEditor.g:3962:2: ( rule__FadeIn__DurationAssignment_5 )
            // InternalCinEditor.g:3962:3: rule__FadeIn__DurationAssignment_5
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
    // InternalCinEditor.g:3970:1: rule__FadeIn__Group__6 : rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7 ;
    public final void rule__FadeIn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3974:1: ( rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7 )
            // InternalCinEditor.g:3975:2: rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalCinEditor.g:3982:1: rule__FadeIn__Group__6__Impl : ( 'on' ) ;
    public final void rule__FadeIn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3986:1: ( ( 'on' ) )
            // InternalCinEditor.g:3987:1: ( 'on' )
            {
            // InternalCinEditor.g:3987:1: ( 'on' )
            // InternalCinEditor.g:3988:2: 'on'
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
    // InternalCinEditor.g:3997:1: rule__FadeIn__Group__7 : rule__FadeIn__Group__7__Impl rule__FadeIn__Group__8 ;
    public final void rule__FadeIn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4001:1: ( rule__FadeIn__Group__7__Impl rule__FadeIn__Group__8 )
            // InternalCinEditor.g:4002:2: rule__FadeIn__Group__7__Impl rule__FadeIn__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:4009:1: rule__FadeIn__Group__7__Impl : ( '[' ) ;
    public final void rule__FadeIn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4013:1: ( ( '[' ) )
            // InternalCinEditor.g:4014:1: ( '[' )
            {
            // InternalCinEditor.g:4014:1: ( '[' )
            // InternalCinEditor.g:4015:2: '['
            {
             before(grammarAccess.getFadeInAccess().getLeftSquareBracketKeyword_7()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCinEditor.g:4024:1: rule__FadeIn__Group__8 : rule__FadeIn__Group__8__Impl rule__FadeIn__Group__9 ;
    public final void rule__FadeIn__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4028:1: ( rule__FadeIn__Group__8__Impl rule__FadeIn__Group__9 )
            // InternalCinEditor.g:4029:2: rule__FadeIn__Group__8__Impl rule__FadeIn__Group__9
            {
            pushFollow(FOLLOW_29);
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
    // InternalCinEditor.g:4036:1: rule__FadeIn__Group__8__Impl : ( ( rule__FadeIn__ElementsAssignment_8 ) ) ;
    public final void rule__FadeIn__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4040:1: ( ( ( rule__FadeIn__ElementsAssignment_8 ) ) )
            // InternalCinEditor.g:4041:1: ( ( rule__FadeIn__ElementsAssignment_8 ) )
            {
            // InternalCinEditor.g:4041:1: ( ( rule__FadeIn__ElementsAssignment_8 ) )
            // InternalCinEditor.g:4042:2: ( rule__FadeIn__ElementsAssignment_8 )
            {
             before(grammarAccess.getFadeInAccess().getElementsAssignment_8()); 
            // InternalCinEditor.g:4043:2: ( rule__FadeIn__ElementsAssignment_8 )
            // InternalCinEditor.g:4043:3: rule__FadeIn__ElementsAssignment_8
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
    // InternalCinEditor.g:4051:1: rule__FadeIn__Group__9 : rule__FadeIn__Group__9__Impl rule__FadeIn__Group__10 ;
    public final void rule__FadeIn__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4055:1: ( rule__FadeIn__Group__9__Impl rule__FadeIn__Group__10 )
            // InternalCinEditor.g:4056:2: rule__FadeIn__Group__9__Impl rule__FadeIn__Group__10
            {
            pushFollow(FOLLOW_29);
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
    // InternalCinEditor.g:4063:1: rule__FadeIn__Group__9__Impl : ( ( rule__FadeIn__Group_9__0 )* ) ;
    public final void rule__FadeIn__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4067:1: ( ( ( rule__FadeIn__Group_9__0 )* ) )
            // InternalCinEditor.g:4068:1: ( ( rule__FadeIn__Group_9__0 )* )
            {
            // InternalCinEditor.g:4068:1: ( ( rule__FadeIn__Group_9__0 )* )
            // InternalCinEditor.g:4069:2: ( rule__FadeIn__Group_9__0 )*
            {
             before(grammarAccess.getFadeInAccess().getGroup_9()); 
            // InternalCinEditor.g:4070:2: ( rule__FadeIn__Group_9__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==17) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalCinEditor.g:4070:3: rule__FadeIn__Group_9__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__FadeIn__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalCinEditor.g:4078:1: rule__FadeIn__Group__10 : rule__FadeIn__Group__10__Impl ;
    public final void rule__FadeIn__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4082:1: ( rule__FadeIn__Group__10__Impl )
            // InternalCinEditor.g:4083:2: rule__FadeIn__Group__10__Impl
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
    // InternalCinEditor.g:4089:1: rule__FadeIn__Group__10__Impl : ( ']' ) ;
    public final void rule__FadeIn__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4093:1: ( ( ']' ) )
            // InternalCinEditor.g:4094:1: ( ']' )
            {
            // InternalCinEditor.g:4094:1: ( ']' )
            // InternalCinEditor.g:4095:2: ']'
            {
             before(grammarAccess.getFadeInAccess().getRightSquareBracketKeyword_10()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCinEditor.g:4105:1: rule__FadeIn__Group_9__0 : rule__FadeIn__Group_9__0__Impl rule__FadeIn__Group_9__1 ;
    public final void rule__FadeIn__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4109:1: ( rule__FadeIn__Group_9__0__Impl rule__FadeIn__Group_9__1 )
            // InternalCinEditor.g:4110:2: rule__FadeIn__Group_9__0__Impl rule__FadeIn__Group_9__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:4117:1: rule__FadeIn__Group_9__0__Impl : ( ',' ) ;
    public final void rule__FadeIn__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4121:1: ( ( ',' ) )
            // InternalCinEditor.g:4122:1: ( ',' )
            {
            // InternalCinEditor.g:4122:1: ( ',' )
            // InternalCinEditor.g:4123:2: ','
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
    // InternalCinEditor.g:4132:1: rule__FadeIn__Group_9__1 : rule__FadeIn__Group_9__1__Impl ;
    public final void rule__FadeIn__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4136:1: ( rule__FadeIn__Group_9__1__Impl )
            // InternalCinEditor.g:4137:2: rule__FadeIn__Group_9__1__Impl
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
    // InternalCinEditor.g:4143:1: rule__FadeIn__Group_9__1__Impl : ( ( rule__FadeIn__ElementsAssignment_9_1 ) ) ;
    public final void rule__FadeIn__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4147:1: ( ( ( rule__FadeIn__ElementsAssignment_9_1 ) ) )
            // InternalCinEditor.g:4148:1: ( ( rule__FadeIn__ElementsAssignment_9_1 ) )
            {
            // InternalCinEditor.g:4148:1: ( ( rule__FadeIn__ElementsAssignment_9_1 ) )
            // InternalCinEditor.g:4149:2: ( rule__FadeIn__ElementsAssignment_9_1 )
            {
             before(grammarAccess.getFadeInAccess().getElementsAssignment_9_1()); 
            // InternalCinEditor.g:4150:2: ( rule__FadeIn__ElementsAssignment_9_1 )
            // InternalCinEditor.g:4150:3: rule__FadeIn__ElementsAssignment_9_1
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
    // InternalCinEditor.g:4159:1: rule__FadeOut__Group__0 : rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 ;
    public final void rule__FadeOut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4163:1: ( rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 )
            // InternalCinEditor.g:4164:2: rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1
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
    // InternalCinEditor.g:4171:1: rule__FadeOut__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__FadeOut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4175:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:4176:1: ( 'Effect' )
            {
            // InternalCinEditor.g:4176:1: ( 'Effect' )
            // InternalCinEditor.g:4177:2: 'Effect'
            {
             before(grammarAccess.getFadeOutAccess().getEffectKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCinEditor.g:4186:1: rule__FadeOut__Group__1 : rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 ;
    public final void rule__FadeOut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4190:1: ( rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 )
            // InternalCinEditor.g:4191:2: rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCinEditor.g:4198:1: rule__FadeOut__Group__1__Impl : ( ( rule__FadeOut__NameAssignment_1 ) ) ;
    public final void rule__FadeOut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4202:1: ( ( ( rule__FadeOut__NameAssignment_1 ) ) )
            // InternalCinEditor.g:4203:1: ( ( rule__FadeOut__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:4203:1: ( ( rule__FadeOut__NameAssignment_1 ) )
            // InternalCinEditor.g:4204:2: ( rule__FadeOut__NameAssignment_1 )
            {
             before(grammarAccess.getFadeOutAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:4205:2: ( rule__FadeOut__NameAssignment_1 )
            // InternalCinEditor.g:4205:3: rule__FadeOut__NameAssignment_1
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
    // InternalCinEditor.g:4213:1: rule__FadeOut__Group__2 : rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 ;
    public final void rule__FadeOut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4217:1: ( rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 )
            // InternalCinEditor.g:4218:2: rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalCinEditor.g:4225:1: rule__FadeOut__Group__2__Impl : ( '=' ) ;
    public final void rule__FadeOut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4229:1: ( ( '=' ) )
            // InternalCinEditor.g:4230:1: ( '=' )
            {
            // InternalCinEditor.g:4230:1: ( '=' )
            // InternalCinEditor.g:4231:2: '='
            {
             before(grammarAccess.getFadeOutAccess().getEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCinEditor.g:4240:1: rule__FadeOut__Group__3 : rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 ;
    public final void rule__FadeOut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4244:1: ( rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 )
            // InternalCinEditor.g:4245:2: rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalCinEditor.g:4252:1: rule__FadeOut__Group__3__Impl : ( 'FadeOut' ) ;
    public final void rule__FadeOut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4256:1: ( ( 'FadeOut' ) )
            // InternalCinEditor.g:4257:1: ( 'FadeOut' )
            {
            // InternalCinEditor.g:4257:1: ( 'FadeOut' )
            // InternalCinEditor.g:4258:2: 'FadeOut'
            {
             before(grammarAccess.getFadeOutAccess().getFadeOutKeyword_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalCinEditor.g:4267:1: rule__FadeOut__Group__4 : rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5 ;
    public final void rule__FadeOut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4271:1: ( rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5 )
            // InternalCinEditor.g:4272:2: rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5
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
    // InternalCinEditor.g:4279:1: rule__FadeOut__Group__4__Impl : ( 'during' ) ;
    public final void rule__FadeOut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4283:1: ( ( 'during' ) )
            // InternalCinEditor.g:4284:1: ( 'during' )
            {
            // InternalCinEditor.g:4284:1: ( 'during' )
            // InternalCinEditor.g:4285:2: 'during'
            {
             before(grammarAccess.getFadeOutAccess().getDuringKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCinEditor.g:4294:1: rule__FadeOut__Group__5 : rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6 ;
    public final void rule__FadeOut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4298:1: ( rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6 )
            // InternalCinEditor.g:4299:2: rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalCinEditor.g:4306:1: rule__FadeOut__Group__5__Impl : ( ( rule__FadeOut__DurationAssignment_5 ) ) ;
    public final void rule__FadeOut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4310:1: ( ( ( rule__FadeOut__DurationAssignment_5 ) ) )
            // InternalCinEditor.g:4311:1: ( ( rule__FadeOut__DurationAssignment_5 ) )
            {
            // InternalCinEditor.g:4311:1: ( ( rule__FadeOut__DurationAssignment_5 ) )
            // InternalCinEditor.g:4312:2: ( rule__FadeOut__DurationAssignment_5 )
            {
             before(grammarAccess.getFadeOutAccess().getDurationAssignment_5()); 
            // InternalCinEditor.g:4313:2: ( rule__FadeOut__DurationAssignment_5 )
            // InternalCinEditor.g:4313:3: rule__FadeOut__DurationAssignment_5
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
    // InternalCinEditor.g:4321:1: rule__FadeOut__Group__6 : rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7 ;
    public final void rule__FadeOut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4325:1: ( rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7 )
            // InternalCinEditor.g:4326:2: rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalCinEditor.g:4333:1: rule__FadeOut__Group__6__Impl : ( 'on' ) ;
    public final void rule__FadeOut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4337:1: ( ( 'on' ) )
            // InternalCinEditor.g:4338:1: ( 'on' )
            {
            // InternalCinEditor.g:4338:1: ( 'on' )
            // InternalCinEditor.g:4339:2: 'on'
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
    // InternalCinEditor.g:4348:1: rule__FadeOut__Group__7 : rule__FadeOut__Group__7__Impl rule__FadeOut__Group__8 ;
    public final void rule__FadeOut__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4352:1: ( rule__FadeOut__Group__7__Impl rule__FadeOut__Group__8 )
            // InternalCinEditor.g:4353:2: rule__FadeOut__Group__7__Impl rule__FadeOut__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:4360:1: rule__FadeOut__Group__7__Impl : ( '[' ) ;
    public final void rule__FadeOut__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4364:1: ( ( '[' ) )
            // InternalCinEditor.g:4365:1: ( '[' )
            {
            // InternalCinEditor.g:4365:1: ( '[' )
            // InternalCinEditor.g:4366:2: '['
            {
             before(grammarAccess.getFadeOutAccess().getLeftSquareBracketKeyword_7()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCinEditor.g:4375:1: rule__FadeOut__Group__8 : rule__FadeOut__Group__8__Impl rule__FadeOut__Group__9 ;
    public final void rule__FadeOut__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4379:1: ( rule__FadeOut__Group__8__Impl rule__FadeOut__Group__9 )
            // InternalCinEditor.g:4380:2: rule__FadeOut__Group__8__Impl rule__FadeOut__Group__9
            {
            pushFollow(FOLLOW_29);
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
    // InternalCinEditor.g:4387:1: rule__FadeOut__Group__8__Impl : ( ( rule__FadeOut__ElementsAssignment_8 ) ) ;
    public final void rule__FadeOut__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4391:1: ( ( ( rule__FadeOut__ElementsAssignment_8 ) ) )
            // InternalCinEditor.g:4392:1: ( ( rule__FadeOut__ElementsAssignment_8 ) )
            {
            // InternalCinEditor.g:4392:1: ( ( rule__FadeOut__ElementsAssignment_8 ) )
            // InternalCinEditor.g:4393:2: ( rule__FadeOut__ElementsAssignment_8 )
            {
             before(grammarAccess.getFadeOutAccess().getElementsAssignment_8()); 
            // InternalCinEditor.g:4394:2: ( rule__FadeOut__ElementsAssignment_8 )
            // InternalCinEditor.g:4394:3: rule__FadeOut__ElementsAssignment_8
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
    // InternalCinEditor.g:4402:1: rule__FadeOut__Group__9 : rule__FadeOut__Group__9__Impl rule__FadeOut__Group__10 ;
    public final void rule__FadeOut__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4406:1: ( rule__FadeOut__Group__9__Impl rule__FadeOut__Group__10 )
            // InternalCinEditor.g:4407:2: rule__FadeOut__Group__9__Impl rule__FadeOut__Group__10
            {
            pushFollow(FOLLOW_29);
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
    // InternalCinEditor.g:4414:1: rule__FadeOut__Group__9__Impl : ( ( rule__FadeOut__Group_9__0 )* ) ;
    public final void rule__FadeOut__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4418:1: ( ( ( rule__FadeOut__Group_9__0 )* ) )
            // InternalCinEditor.g:4419:1: ( ( rule__FadeOut__Group_9__0 )* )
            {
            // InternalCinEditor.g:4419:1: ( ( rule__FadeOut__Group_9__0 )* )
            // InternalCinEditor.g:4420:2: ( rule__FadeOut__Group_9__0 )*
            {
             before(grammarAccess.getFadeOutAccess().getGroup_9()); 
            // InternalCinEditor.g:4421:2: ( rule__FadeOut__Group_9__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==17) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalCinEditor.g:4421:3: rule__FadeOut__Group_9__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__FadeOut__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalCinEditor.g:4429:1: rule__FadeOut__Group__10 : rule__FadeOut__Group__10__Impl ;
    public final void rule__FadeOut__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4433:1: ( rule__FadeOut__Group__10__Impl )
            // InternalCinEditor.g:4434:2: rule__FadeOut__Group__10__Impl
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
    // InternalCinEditor.g:4440:1: rule__FadeOut__Group__10__Impl : ( ']' ) ;
    public final void rule__FadeOut__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4444:1: ( ( ']' ) )
            // InternalCinEditor.g:4445:1: ( ']' )
            {
            // InternalCinEditor.g:4445:1: ( ']' )
            // InternalCinEditor.g:4446:2: ']'
            {
             before(grammarAccess.getFadeOutAccess().getRightSquareBracketKeyword_10()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCinEditor.g:4456:1: rule__FadeOut__Group_9__0 : rule__FadeOut__Group_9__0__Impl rule__FadeOut__Group_9__1 ;
    public final void rule__FadeOut__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4460:1: ( rule__FadeOut__Group_9__0__Impl rule__FadeOut__Group_9__1 )
            // InternalCinEditor.g:4461:2: rule__FadeOut__Group_9__0__Impl rule__FadeOut__Group_9__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:4468:1: rule__FadeOut__Group_9__0__Impl : ( ',' ) ;
    public final void rule__FadeOut__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4472:1: ( ( ',' ) )
            // InternalCinEditor.g:4473:1: ( ',' )
            {
            // InternalCinEditor.g:4473:1: ( ',' )
            // InternalCinEditor.g:4474:2: ','
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
    // InternalCinEditor.g:4483:1: rule__FadeOut__Group_9__1 : rule__FadeOut__Group_9__1__Impl ;
    public final void rule__FadeOut__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4487:1: ( rule__FadeOut__Group_9__1__Impl )
            // InternalCinEditor.g:4488:2: rule__FadeOut__Group_9__1__Impl
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
    // InternalCinEditor.g:4494:1: rule__FadeOut__Group_9__1__Impl : ( ( rule__FadeOut__ElementsAssignment_9_1 ) ) ;
    public final void rule__FadeOut__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4498:1: ( ( ( rule__FadeOut__ElementsAssignment_9_1 ) ) )
            // InternalCinEditor.g:4499:1: ( ( rule__FadeOut__ElementsAssignment_9_1 ) )
            {
            // InternalCinEditor.g:4499:1: ( ( rule__FadeOut__ElementsAssignment_9_1 ) )
            // InternalCinEditor.g:4500:2: ( rule__FadeOut__ElementsAssignment_9_1 )
            {
             before(grammarAccess.getFadeOutAccess().getElementsAssignment_9_1()); 
            // InternalCinEditor.g:4501:2: ( rule__FadeOut__ElementsAssignment_9_1 )
            // InternalCinEditor.g:4501:3: rule__FadeOut__ElementsAssignment_9_1
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
    // InternalCinEditor.g:4510:1: rule__Translate__Group__0 : rule__Translate__Group__0__Impl rule__Translate__Group__1 ;
    public final void rule__Translate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4514:1: ( rule__Translate__Group__0__Impl rule__Translate__Group__1 )
            // InternalCinEditor.g:4515:2: rule__Translate__Group__0__Impl rule__Translate__Group__1
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
    // InternalCinEditor.g:4522:1: rule__Translate__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__Translate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4526:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:4527:1: ( 'Effect' )
            {
            // InternalCinEditor.g:4527:1: ( 'Effect' )
            // InternalCinEditor.g:4528:2: 'Effect'
            {
             before(grammarAccess.getTranslateAccess().getEffectKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCinEditor.g:4537:1: rule__Translate__Group__1 : rule__Translate__Group__1__Impl rule__Translate__Group__2 ;
    public final void rule__Translate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4541:1: ( rule__Translate__Group__1__Impl rule__Translate__Group__2 )
            // InternalCinEditor.g:4542:2: rule__Translate__Group__1__Impl rule__Translate__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalCinEditor.g:4549:1: rule__Translate__Group__1__Impl : ( ( rule__Translate__NameAssignment_1 ) ) ;
    public final void rule__Translate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4553:1: ( ( ( rule__Translate__NameAssignment_1 ) ) )
            // InternalCinEditor.g:4554:1: ( ( rule__Translate__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:4554:1: ( ( rule__Translate__NameAssignment_1 ) )
            // InternalCinEditor.g:4555:2: ( rule__Translate__NameAssignment_1 )
            {
             before(grammarAccess.getTranslateAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:4556:2: ( rule__Translate__NameAssignment_1 )
            // InternalCinEditor.g:4556:3: rule__Translate__NameAssignment_1
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
    // InternalCinEditor.g:4564:1: rule__Translate__Group__2 : rule__Translate__Group__2__Impl rule__Translate__Group__3 ;
    public final void rule__Translate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4568:1: ( rule__Translate__Group__2__Impl rule__Translate__Group__3 )
            // InternalCinEditor.g:4569:2: rule__Translate__Group__2__Impl rule__Translate__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalCinEditor.g:4576:1: rule__Translate__Group__2__Impl : ( '=' ) ;
    public final void rule__Translate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4580:1: ( ( '=' ) )
            // InternalCinEditor.g:4581:1: ( '=' )
            {
            // InternalCinEditor.g:4581:1: ( '=' )
            // InternalCinEditor.g:4582:2: '='
            {
             before(grammarAccess.getTranslateAccess().getEqualsSignKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCinEditor.g:4591:1: rule__Translate__Group__3 : rule__Translate__Group__3__Impl rule__Translate__Group__4 ;
    public final void rule__Translate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4595:1: ( rule__Translate__Group__3__Impl rule__Translate__Group__4 )
            // InternalCinEditor.g:4596:2: rule__Translate__Group__3__Impl rule__Translate__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalCinEditor.g:4603:1: rule__Translate__Group__3__Impl : ( 'Translate' ) ;
    public final void rule__Translate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4607:1: ( ( 'Translate' ) )
            // InternalCinEditor.g:4608:1: ( 'Translate' )
            {
            // InternalCinEditor.g:4608:1: ( 'Translate' )
            // InternalCinEditor.g:4609:2: 'Translate'
            {
             before(grammarAccess.getTranslateAccess().getTranslateKeyword_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalCinEditor.g:4618:1: rule__Translate__Group__4 : rule__Translate__Group__4__Impl rule__Translate__Group__5 ;
    public final void rule__Translate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4622:1: ( rule__Translate__Group__4__Impl rule__Translate__Group__5 )
            // InternalCinEditor.g:4623:2: rule__Translate__Group__4__Impl rule__Translate__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalCinEditor.g:4630:1: rule__Translate__Group__4__Impl : ( ( rule__Translate__PositionToTranslateAssignment_4 ) ) ;
    public final void rule__Translate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4634:1: ( ( ( rule__Translate__PositionToTranslateAssignment_4 ) ) )
            // InternalCinEditor.g:4635:1: ( ( rule__Translate__PositionToTranslateAssignment_4 ) )
            {
            // InternalCinEditor.g:4635:1: ( ( rule__Translate__PositionToTranslateAssignment_4 ) )
            // InternalCinEditor.g:4636:2: ( rule__Translate__PositionToTranslateAssignment_4 )
            {
             before(grammarAccess.getTranslateAccess().getPositionToTranslateAssignment_4()); 
            // InternalCinEditor.g:4637:2: ( rule__Translate__PositionToTranslateAssignment_4 )
            // InternalCinEditor.g:4637:3: rule__Translate__PositionToTranslateAssignment_4
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
    // InternalCinEditor.g:4645:1: rule__Translate__Group__5 : rule__Translate__Group__5__Impl rule__Translate__Group__6 ;
    public final void rule__Translate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4649:1: ( rule__Translate__Group__5__Impl rule__Translate__Group__6 )
            // InternalCinEditor.g:4650:2: rule__Translate__Group__5__Impl rule__Translate__Group__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalCinEditor.g:4657:1: rule__Translate__Group__5__Impl : ( ( rule__Translate__Group_5__0 )? ) ;
    public final void rule__Translate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4661:1: ( ( ( rule__Translate__Group_5__0 )? ) )
            // InternalCinEditor.g:4662:1: ( ( rule__Translate__Group_5__0 )? )
            {
            // InternalCinEditor.g:4662:1: ( ( rule__Translate__Group_5__0 )? )
            // InternalCinEditor.g:4663:2: ( rule__Translate__Group_5__0 )?
            {
             before(grammarAccess.getTranslateAccess().getGroup_5()); 
            // InternalCinEditor.g:4664:2: ( rule__Translate__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCinEditor.g:4664:3: rule__Translate__Group_5__0
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
    // InternalCinEditor.g:4672:1: rule__Translate__Group__6 : rule__Translate__Group__6__Impl rule__Translate__Group__7 ;
    public final void rule__Translate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4676:1: ( rule__Translate__Group__6__Impl rule__Translate__Group__7 )
            // InternalCinEditor.g:4677:2: rule__Translate__Group__6__Impl rule__Translate__Group__7
            {
            pushFollow(FOLLOW_34);
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
    // InternalCinEditor.g:4684:1: rule__Translate__Group__6__Impl : ( ( rule__Translate__Group_6__0 )? ) ;
    public final void rule__Translate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4688:1: ( ( ( rule__Translate__Group_6__0 )? ) )
            // InternalCinEditor.g:4689:1: ( ( rule__Translate__Group_6__0 )? )
            {
            // InternalCinEditor.g:4689:1: ( ( rule__Translate__Group_6__0 )? )
            // InternalCinEditor.g:4690:2: ( rule__Translate__Group_6__0 )?
            {
             before(grammarAccess.getTranslateAccess().getGroup_6()); 
            // InternalCinEditor.g:4691:2: ( rule__Translate__Group_6__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCinEditor.g:4691:3: rule__Translate__Group_6__0
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
    // InternalCinEditor.g:4699:1: rule__Translate__Group__7 : rule__Translate__Group__7__Impl rule__Translate__Group__8 ;
    public final void rule__Translate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4703:1: ( rule__Translate__Group__7__Impl rule__Translate__Group__8 )
            // InternalCinEditor.g:4704:2: rule__Translate__Group__7__Impl rule__Translate__Group__8
            {
            pushFollow(FOLLOW_28);
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
    // InternalCinEditor.g:4711:1: rule__Translate__Group__7__Impl : ( 'on' ) ;
    public final void rule__Translate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4715:1: ( ( 'on' ) )
            // InternalCinEditor.g:4716:1: ( 'on' )
            {
            // InternalCinEditor.g:4716:1: ( 'on' )
            // InternalCinEditor.g:4717:2: 'on'
            {
             before(grammarAccess.getTranslateAccess().getOnKeyword_7()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCinEditor.g:4726:1: rule__Translate__Group__8 : rule__Translate__Group__8__Impl rule__Translate__Group__9 ;
    public final void rule__Translate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4730:1: ( rule__Translate__Group__8__Impl rule__Translate__Group__9 )
            // InternalCinEditor.g:4731:2: rule__Translate__Group__8__Impl rule__Translate__Group__9
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:4738:1: rule__Translate__Group__8__Impl : ( '[' ) ;
    public final void rule__Translate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4742:1: ( ( '[' ) )
            // InternalCinEditor.g:4743:1: ( '[' )
            {
            // InternalCinEditor.g:4743:1: ( '[' )
            // InternalCinEditor.g:4744:2: '['
            {
             before(grammarAccess.getTranslateAccess().getLeftSquareBracketKeyword_8()); 
            match(input,47,FOLLOW_2); 
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
    // InternalCinEditor.g:4753:1: rule__Translate__Group__9 : rule__Translate__Group__9__Impl rule__Translate__Group__10 ;
    public final void rule__Translate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4757:1: ( rule__Translate__Group__9__Impl rule__Translate__Group__10 )
            // InternalCinEditor.g:4758:2: rule__Translate__Group__9__Impl rule__Translate__Group__10
            {
            pushFollow(FOLLOW_29);
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
    // InternalCinEditor.g:4765:1: rule__Translate__Group__9__Impl : ( ( rule__Translate__ElementsAssignment_9 ) ) ;
    public final void rule__Translate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4769:1: ( ( ( rule__Translate__ElementsAssignment_9 ) ) )
            // InternalCinEditor.g:4770:1: ( ( rule__Translate__ElementsAssignment_9 ) )
            {
            // InternalCinEditor.g:4770:1: ( ( rule__Translate__ElementsAssignment_9 ) )
            // InternalCinEditor.g:4771:2: ( rule__Translate__ElementsAssignment_9 )
            {
             before(grammarAccess.getTranslateAccess().getElementsAssignment_9()); 
            // InternalCinEditor.g:4772:2: ( rule__Translate__ElementsAssignment_9 )
            // InternalCinEditor.g:4772:3: rule__Translate__ElementsAssignment_9
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
    // InternalCinEditor.g:4780:1: rule__Translate__Group__10 : rule__Translate__Group__10__Impl rule__Translate__Group__11 ;
    public final void rule__Translate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4784:1: ( rule__Translate__Group__10__Impl rule__Translate__Group__11 )
            // InternalCinEditor.g:4785:2: rule__Translate__Group__10__Impl rule__Translate__Group__11
            {
            pushFollow(FOLLOW_29);
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
    // InternalCinEditor.g:4792:1: rule__Translate__Group__10__Impl : ( ( rule__Translate__Group_10__0 )* ) ;
    public final void rule__Translate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4796:1: ( ( ( rule__Translate__Group_10__0 )* ) )
            // InternalCinEditor.g:4797:1: ( ( rule__Translate__Group_10__0 )* )
            {
            // InternalCinEditor.g:4797:1: ( ( rule__Translate__Group_10__0 )* )
            // InternalCinEditor.g:4798:2: ( rule__Translate__Group_10__0 )*
            {
             before(grammarAccess.getTranslateAccess().getGroup_10()); 
            // InternalCinEditor.g:4799:2: ( rule__Translate__Group_10__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==17) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalCinEditor.g:4799:3: rule__Translate__Group_10__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Translate__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalCinEditor.g:4807:1: rule__Translate__Group__11 : rule__Translate__Group__11__Impl ;
    public final void rule__Translate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4811:1: ( rule__Translate__Group__11__Impl )
            // InternalCinEditor.g:4812:2: rule__Translate__Group__11__Impl
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
    // InternalCinEditor.g:4818:1: rule__Translate__Group__11__Impl : ( ']' ) ;
    public final void rule__Translate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4822:1: ( ( ']' ) )
            // InternalCinEditor.g:4823:1: ( ']' )
            {
            // InternalCinEditor.g:4823:1: ( ']' )
            // InternalCinEditor.g:4824:2: ']'
            {
             before(grammarAccess.getTranslateAccess().getRightSquareBracketKeyword_11()); 
            match(input,48,FOLLOW_2); 
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
    // InternalCinEditor.g:4834:1: rule__Translate__Group_5__0 : rule__Translate__Group_5__0__Impl rule__Translate__Group_5__1 ;
    public final void rule__Translate__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4838:1: ( rule__Translate__Group_5__0__Impl rule__Translate__Group_5__1 )
            // InternalCinEditor.g:4839:2: rule__Translate__Group_5__0__Impl rule__Translate__Group_5__1
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
    // InternalCinEditor.g:4846:1: rule__Translate__Group_5__0__Impl : ( 'startAt' ) ;
    public final void rule__Translate__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4850:1: ( ( 'startAt' ) )
            // InternalCinEditor.g:4851:1: ( 'startAt' )
            {
            // InternalCinEditor.g:4851:1: ( 'startAt' )
            // InternalCinEditor.g:4852:2: 'startAt'
            {
             before(grammarAccess.getTranslateAccess().getStartAtKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCinEditor.g:4861:1: rule__Translate__Group_5__1 : rule__Translate__Group_5__1__Impl ;
    public final void rule__Translate__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4865:1: ( rule__Translate__Group_5__1__Impl )
            // InternalCinEditor.g:4866:2: rule__Translate__Group_5__1__Impl
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
    // InternalCinEditor.g:4872:1: rule__Translate__Group_5__1__Impl : ( ( rule__Translate__BeginTimeAssignment_5_1 ) ) ;
    public final void rule__Translate__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4876:1: ( ( ( rule__Translate__BeginTimeAssignment_5_1 ) ) )
            // InternalCinEditor.g:4877:1: ( ( rule__Translate__BeginTimeAssignment_5_1 ) )
            {
            // InternalCinEditor.g:4877:1: ( ( rule__Translate__BeginTimeAssignment_5_1 ) )
            // InternalCinEditor.g:4878:2: ( rule__Translate__BeginTimeAssignment_5_1 )
            {
             before(grammarAccess.getTranslateAccess().getBeginTimeAssignment_5_1()); 
            // InternalCinEditor.g:4879:2: ( rule__Translate__BeginTimeAssignment_5_1 )
            // InternalCinEditor.g:4879:3: rule__Translate__BeginTimeAssignment_5_1
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
    // InternalCinEditor.g:4888:1: rule__Translate__Group_6__0 : rule__Translate__Group_6__0__Impl rule__Translate__Group_6__1 ;
    public final void rule__Translate__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4892:1: ( rule__Translate__Group_6__0__Impl rule__Translate__Group_6__1 )
            // InternalCinEditor.g:4893:2: rule__Translate__Group_6__0__Impl rule__Translate__Group_6__1
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
    // InternalCinEditor.g:4900:1: rule__Translate__Group_6__0__Impl : ( 'during' ) ;
    public final void rule__Translate__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4904:1: ( ( 'during' ) )
            // InternalCinEditor.g:4905:1: ( 'during' )
            {
            // InternalCinEditor.g:4905:1: ( 'during' )
            // InternalCinEditor.g:4906:2: 'during'
            {
             before(grammarAccess.getTranslateAccess().getDuringKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCinEditor.g:4915:1: rule__Translate__Group_6__1 : rule__Translate__Group_6__1__Impl ;
    public final void rule__Translate__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4919:1: ( rule__Translate__Group_6__1__Impl )
            // InternalCinEditor.g:4920:2: rule__Translate__Group_6__1__Impl
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
    // InternalCinEditor.g:4926:1: rule__Translate__Group_6__1__Impl : ( ( rule__Translate__DurationAssignment_6_1 ) ) ;
    public final void rule__Translate__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4930:1: ( ( ( rule__Translate__DurationAssignment_6_1 ) ) )
            // InternalCinEditor.g:4931:1: ( ( rule__Translate__DurationAssignment_6_1 ) )
            {
            // InternalCinEditor.g:4931:1: ( ( rule__Translate__DurationAssignment_6_1 ) )
            // InternalCinEditor.g:4932:2: ( rule__Translate__DurationAssignment_6_1 )
            {
             before(grammarAccess.getTranslateAccess().getDurationAssignment_6_1()); 
            // InternalCinEditor.g:4933:2: ( rule__Translate__DurationAssignment_6_1 )
            // InternalCinEditor.g:4933:3: rule__Translate__DurationAssignment_6_1
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
    // InternalCinEditor.g:4942:1: rule__Translate__Group_10__0 : rule__Translate__Group_10__0__Impl rule__Translate__Group_10__1 ;
    public final void rule__Translate__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4946:1: ( rule__Translate__Group_10__0__Impl rule__Translate__Group_10__1 )
            // InternalCinEditor.g:4947:2: rule__Translate__Group_10__0__Impl rule__Translate__Group_10__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:4954:1: rule__Translate__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Translate__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4958:1: ( ( ',' ) )
            // InternalCinEditor.g:4959:1: ( ',' )
            {
            // InternalCinEditor.g:4959:1: ( ',' )
            // InternalCinEditor.g:4960:2: ','
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
    // InternalCinEditor.g:4969:1: rule__Translate__Group_10__1 : rule__Translate__Group_10__1__Impl ;
    public final void rule__Translate__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4973:1: ( rule__Translate__Group_10__1__Impl )
            // InternalCinEditor.g:4974:2: rule__Translate__Group_10__1__Impl
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
    // InternalCinEditor.g:4980:1: rule__Translate__Group_10__1__Impl : ( ( rule__Translate__ElementsAssignment_10_1 ) ) ;
    public final void rule__Translate__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4984:1: ( ( ( rule__Translate__ElementsAssignment_10_1 ) ) )
            // InternalCinEditor.g:4985:1: ( ( rule__Translate__ElementsAssignment_10_1 ) )
            {
            // InternalCinEditor.g:4985:1: ( ( rule__Translate__ElementsAssignment_10_1 ) )
            // InternalCinEditor.g:4986:2: ( rule__Translate__ElementsAssignment_10_1 )
            {
             before(grammarAccess.getTranslateAccess().getElementsAssignment_10_1()); 
            // InternalCinEditor.g:4987:2: ( rule__Translate__ElementsAssignment_10_1 )
            // InternalCinEditor.g:4987:3: rule__Translate__ElementsAssignment_10_1
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
    // InternalCinEditor.g:4996:1: rule__Movie__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Movie__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5000:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5001:2: ( ruleEString )
            {
            // InternalCinEditor.g:5001:2: ( ruleEString )
            // InternalCinEditor.g:5002:3: ruleEString
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
    // InternalCinEditor.g:5011:1: rule__Movie__DimensionAssignment_2 : ( ruleDimension ) ;
    public final void rule__Movie__DimensionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5015:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:5016:2: ( ruleDimension )
            {
            // InternalCinEditor.g:5016:2: ( ruleDimension )
            // InternalCinEditor.g:5017:3: ruleDimension
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
    // InternalCinEditor.g:5026:1: rule__Movie__FpsAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Movie__FpsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5030:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5031:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5031:2: ( ruleEInt )
            // InternalCinEditor.g:5032:3: ruleEInt
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
    // InternalCinEditor.g:5041:1: rule__Movie__LayersAssignment_4 : ( ruleLayer ) ;
    public final void rule__Movie__LayersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5045:1: ( ( ruleLayer ) )
            // InternalCinEditor.g:5046:2: ( ruleLayer )
            {
            // InternalCinEditor.g:5046:2: ( ruleLayer )
            // InternalCinEditor.g:5047:3: ruleLayer
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
    // InternalCinEditor.g:5056:1: rule__Layer__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Layer__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5060:1: ( ( ruleElement ) )
            // InternalCinEditor.g:5061:2: ( ruleElement )
            {
            // InternalCinEditor.g:5061:2: ( ruleElement )
            // InternalCinEditor.g:5062:3: ruleElement
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
    // InternalCinEditor.g:5071:1: rule__Position__XAssignment_1_1 : ( ruleItemPosition ) ;
    public final void rule__Position__XAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5075:1: ( ( ruleItemPosition ) )
            // InternalCinEditor.g:5076:2: ( ruleItemPosition )
            {
            // InternalCinEditor.g:5076:2: ( ruleItemPosition )
            // InternalCinEditor.g:5077:3: ruleItemPosition
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
    // InternalCinEditor.g:5086:1: rule__Position__YAssignment_1_3 : ( ruleItemPosition ) ;
    public final void rule__Position__YAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5090:1: ( ( ruleItemPosition ) )
            // InternalCinEditor.g:5091:2: ( ruleItemPosition )
            {
            // InternalCinEditor.g:5091:2: ( ruleItemPosition )
            // InternalCinEditor.g:5092:3: ruleItemPosition
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
    // InternalCinEditor.g:5101:1: rule__ItemPositionInt__PositionAssignment : ( ruleEInt ) ;
    public final void rule__ItemPositionInt__PositionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5105:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5106:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5106:2: ( ruleEInt )
            // InternalCinEditor.g:5107:3: ruleEInt
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
    // InternalCinEditor.g:5116:1: rule__ItemPositionString__PositionAssignment : ( ( rule__ItemPositionString__PositionAlternatives_0 ) ) ;
    public final void rule__ItemPositionString__PositionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5120:1: ( ( ( rule__ItemPositionString__PositionAlternatives_0 ) ) )
            // InternalCinEditor.g:5121:2: ( ( rule__ItemPositionString__PositionAlternatives_0 ) )
            {
            // InternalCinEditor.g:5121:2: ( ( rule__ItemPositionString__PositionAlternatives_0 ) )
            // InternalCinEditor.g:5122:3: ( rule__ItemPositionString__PositionAlternatives_0 )
            {
             before(grammarAccess.getItemPositionStringAccess().getPositionAlternatives_0()); 
            // InternalCinEditor.g:5123:3: ( rule__ItemPositionString__PositionAlternatives_0 )
            // InternalCinEditor.g:5123:4: rule__ItemPositionString__PositionAlternatives_0
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
    // InternalCinEditor.g:5131:1: rule__Dimension__WidthAssignment_1 : ( ruleEInt ) ;
    public final void rule__Dimension__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5135:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5136:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5136:2: ( ruleEInt )
            // InternalCinEditor.g:5137:3: ruleEInt
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
    // InternalCinEditor.g:5146:1: rule__Dimension__HeightAssignment_3 : ( ruleEInt ) ;
    public final void rule__Dimension__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5150:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5151:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5151:2: ( ruleEInt )
            // InternalCinEditor.g:5152:3: ruleEInt
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
    // InternalCinEditor.g:5161:1: rule__HexadecimalColor__HexadecimalValueAssignment_1 : ( ruleEString ) ;
    public final void rule__HexadecimalColor__HexadecimalValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5165:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5166:2: ( ruleEString )
            {
            // InternalCinEditor.g:5166:2: ( ruleEString )
            // InternalCinEditor.g:5167:3: ruleEString
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


    // $ANTLR start "rule__AudioElement__NameAssignment_1"
    // InternalCinEditor.g:5176:1: rule__AudioElement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AudioElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5180:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5181:2: ( ruleEString )
            {
            // InternalCinEditor.g:5181:2: ( ruleEString )
            // InternalCinEditor.g:5182:3: ruleEString
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
    // InternalCinEditor.g:5191:1: rule__AudioElement__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__AudioElement__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5195:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5196:2: ( ruleEString )
            {
            // InternalCinEditor.g:5196:2: ( ruleEString )
            // InternalCinEditor.g:5197:3: ruleEString
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
    // InternalCinEditor.g:5206:1: rule__AudioElement__VolumeAssignment_4_1 : ( ruleEFloat ) ;
    public final void rule__AudioElement__VolumeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5210:1: ( ( ruleEFloat ) )
            // InternalCinEditor.g:5211:2: ( ruleEFloat )
            {
            // InternalCinEditor.g:5211:2: ( ruleEFloat )
            // InternalCinEditor.g:5212:3: ruleEFloat
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
    // InternalCinEditor.g:5221:1: rule__AudioElement__FadeInAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__FadeInAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5225:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5226:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5226:2: ( ruleEInt )
            // InternalCinEditor.g:5227:3: ruleEInt
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
    // InternalCinEditor.g:5236:1: rule__AudioElement__FadeOutAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__FadeOutAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5240:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5241:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5241:2: ( ruleEInt )
            // InternalCinEditor.g:5242:3: ruleEInt
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
    // InternalCinEditor.g:5251:1: rule__AudioElement__BeginTimeAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__BeginTimeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5255:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5256:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5256:2: ( ruleEInt )
            // InternalCinEditor.g:5257:3: ruleEInt
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
    // InternalCinEditor.g:5266:1: rule__AudioElement__BeginCropTimeAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__BeginCropTimeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5270:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5271:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5271:2: ( ruleEInt )
            // InternalCinEditor.g:5272:3: ruleEInt
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
    // InternalCinEditor.g:5281:1: rule__AudioElement__DurationAssignment_9_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__DurationAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5285:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5286:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5286:2: ( ruleEInt )
            // InternalCinEditor.g:5287:3: ruleEInt
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
    // InternalCinEditor.g:5296:1: rule__AudioElement__ElementAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__AudioElement__ElementAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5300:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:5301:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:5301:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:5302:3: ( RULE_ID )
            {
             before(grammarAccess.getAudioElementAccess().getElementGraphicalElementCrossReference_11_0()); 
            // InternalCinEditor.g:5303:3: ( RULE_ID )
            // InternalCinEditor.g:5304:4: RULE_ID
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
    // InternalCinEditor.g:5315:1: rule__Text__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Text__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5319:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5320:2: ( ruleEString )
            {
            // InternalCinEditor.g:5320:2: ( ruleEString )
            // InternalCinEditor.g:5321:3: ruleEString
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
    // InternalCinEditor.g:5330:1: rule__Text__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__Text__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5334:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5335:2: ( ruleEString )
            {
            // InternalCinEditor.g:5335:2: ( ruleEString )
            // InternalCinEditor.g:5336:3: ruleEString
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
    // InternalCinEditor.g:5345:1: rule__Text__FontSizeAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Text__FontSizeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5349:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5350:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5350:2: ( ruleEInt )
            // InternalCinEditor.g:5351:3: ruleEInt
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
    // InternalCinEditor.g:5360:1: rule__Text__PositionAssignment_5 : ( rulePosition ) ;
    public final void rule__Text__PositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5364:1: ( ( rulePosition ) )
            // InternalCinEditor.g:5365:2: ( rulePosition )
            {
            // InternalCinEditor.g:5365:2: ( rulePosition )
            // InternalCinEditor.g:5366:3: rulePosition
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


    // $ANTLR start "rule__Text__BeginTimeAssignment_6_1"
    // InternalCinEditor.g:5375:1: rule__Text__BeginTimeAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Text__BeginTimeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5379:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5380:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5380:2: ( ruleEInt )
            // InternalCinEditor.g:5381:3: ruleEInt
            {
             before(grammarAccess.getTextAccess().getBeginTimeEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextAccess().getBeginTimeEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__BeginTimeAssignment_6_1"


    // $ANTLR start "rule__Text__DurationAssignment_7_1"
    // InternalCinEditor.g:5390:1: rule__Text__DurationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Text__DurationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5394:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5395:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5395:2: ( ruleEInt )
            // InternalCinEditor.g:5396:3: ruleEInt
            {
             before(grammarAccess.getTextAccess().getDurationEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextAccess().getDurationEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__DurationAssignment_7_1"


    // $ANTLR start "rule__Text__ColorAssignment_8"
    // InternalCinEditor.g:5405:1: rule__Text__ColorAssignment_8 : ( ruleHexadecimalColor ) ;
    public final void rule__Text__ColorAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5409:1: ( ( ruleHexadecimalColor ) )
            // InternalCinEditor.g:5410:2: ( ruleHexadecimalColor )
            {
            // InternalCinEditor.g:5410:2: ( ruleHexadecimalColor )
            // InternalCinEditor.g:5411:3: ruleHexadecimalColor
            {
             before(grammarAccess.getTextAccess().getColorHexadecimalColorParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleHexadecimalColor();

            state._fsp--;

             after(grammarAccess.getTextAccess().getColorHexadecimalColorParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__ColorAssignment_8"


    // $ANTLR start "rule__Picture__NameAssignment_1"
    // InternalCinEditor.g:5420:1: rule__Picture__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Picture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5424:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5425:2: ( ruleEString )
            {
            // InternalCinEditor.g:5425:2: ( ruleEString )
            // InternalCinEditor.g:5426:3: ruleEString
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
    // InternalCinEditor.g:5435:1: rule__Picture__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Picture__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5439:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5440:2: ( ruleEString )
            {
            // InternalCinEditor.g:5440:2: ( ruleEString )
            // InternalCinEditor.g:5441:3: ruleEString
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
    // InternalCinEditor.g:5450:1: rule__Picture__PositionAssignment_4 : ( rulePosition ) ;
    public final void rule__Picture__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5454:1: ( ( rulePosition ) )
            // InternalCinEditor.g:5455:2: ( rulePosition )
            {
            // InternalCinEditor.g:5455:2: ( rulePosition )
            // InternalCinEditor.g:5456:3: rulePosition
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
    // InternalCinEditor.g:5465:1: rule__Picture__DimensionAssignment_5 : ( ruleDimension ) ;
    public final void rule__Picture__DimensionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5469:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:5470:2: ( ruleDimension )
            {
            // InternalCinEditor.g:5470:2: ( ruleDimension )
            // InternalCinEditor.g:5471:3: ruleDimension
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


    // $ANTLR start "rule__Picture__BeginTimeAssignment_6_1"
    // InternalCinEditor.g:5480:1: rule__Picture__BeginTimeAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Picture__BeginTimeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5484:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5485:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5485:2: ( ruleEInt )
            // InternalCinEditor.g:5486:3: ruleEInt
            {
             before(grammarAccess.getPictureAccess().getBeginTimeEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getBeginTimeEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__BeginTimeAssignment_6_1"


    // $ANTLR start "rule__Picture__DurationAssignment_7_1"
    // InternalCinEditor.g:5495:1: rule__Picture__DurationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Picture__DurationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5499:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5500:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5500:2: ( ruleEInt )
            // InternalCinEditor.g:5501:3: ruleEInt
            {
             before(grammarAccess.getPictureAccess().getDurationEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPictureAccess().getDurationEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Picture__DurationAssignment_7_1"


    // $ANTLR start "rule__Video__NameAssignment_1"
    // InternalCinEditor.g:5510:1: rule__Video__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Video__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5514:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5515:2: ( ruleEString )
            {
            // InternalCinEditor.g:5515:2: ( ruleEString )
            // InternalCinEditor.g:5516:3: ruleEString
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
    // InternalCinEditor.g:5525:1: rule__Video__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Video__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5529:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5530:2: ( ruleEString )
            {
            // InternalCinEditor.g:5530:2: ( ruleEString )
            // InternalCinEditor.g:5531:3: ruleEString
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
    // InternalCinEditor.g:5540:1: rule__Video__EnableAudioAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__Video__EnableAudioAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5544:1: ( ( ruleEBoolean ) )
            // InternalCinEditor.g:5545:2: ( ruleEBoolean )
            {
            // InternalCinEditor.g:5545:2: ( ruleEBoolean )
            // InternalCinEditor.g:5546:3: ruleEBoolean
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
    // InternalCinEditor.g:5555:1: rule__Video__PositionAssignment_5 : ( rulePosition ) ;
    public final void rule__Video__PositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5559:1: ( ( rulePosition ) )
            // InternalCinEditor.g:5560:2: ( rulePosition )
            {
            // InternalCinEditor.g:5560:2: ( rulePosition )
            // InternalCinEditor.g:5561:3: rulePosition
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
    // InternalCinEditor.g:5570:1: rule__Video__DimensionAssignment_6 : ( ruleDimension ) ;
    public final void rule__Video__DimensionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5574:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:5575:2: ( ruleDimension )
            {
            // InternalCinEditor.g:5575:2: ( ruleDimension )
            // InternalCinEditor.g:5576:3: ruleDimension
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


    // $ANTLR start "rule__Video__BeginTimeAssignment_7_1"
    // InternalCinEditor.g:5585:1: rule__Video__BeginTimeAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Video__BeginTimeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5589:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5590:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5590:2: ( ruleEInt )
            // InternalCinEditor.g:5591:3: ruleEInt
            {
             before(grammarAccess.getVideoAccess().getBeginTimeEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getBeginTimeEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__BeginTimeAssignment_7_1"


    // $ANTLR start "rule__Video__BeginCropTimeAssignment_8_1"
    // InternalCinEditor.g:5600:1: rule__Video__BeginCropTimeAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Video__BeginCropTimeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5604:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5605:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5605:2: ( ruleEInt )
            // InternalCinEditor.g:5606:3: ruleEInt
            {
             before(grammarAccess.getVideoAccess().getBeginCropTimeEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getBeginCropTimeEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__BeginCropTimeAssignment_8_1"


    // $ANTLR start "rule__Video__DurationAssignment_9_1"
    // InternalCinEditor.g:5615:1: rule__Video__DurationAssignment_9_1 : ( ruleEInt ) ;
    public final void rule__Video__DurationAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5619:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5620:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5620:2: ( ruleEInt )
            // InternalCinEditor.g:5621:3: ruleEInt
            {
             before(grammarAccess.getVideoAccess().getDurationEIntParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getDurationEIntParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__DurationAssignment_9_1"


    // $ANTLR start "rule__Rectangle__NameAssignment_1"
    // InternalCinEditor.g:5630:1: rule__Rectangle__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Rectangle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5634:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5635:2: ( ruleEString )
            {
            // InternalCinEditor.g:5635:2: ( ruleEString )
            // InternalCinEditor.g:5636:3: ruleEString
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
    // InternalCinEditor.g:5645:1: rule__Rectangle__ColorAssignment_3 : ( ruleHexadecimalColor ) ;
    public final void rule__Rectangle__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5649:1: ( ( ruleHexadecimalColor ) )
            // InternalCinEditor.g:5650:2: ( ruleHexadecimalColor )
            {
            // InternalCinEditor.g:5650:2: ( ruleHexadecimalColor )
            // InternalCinEditor.g:5651:3: ruleHexadecimalColor
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
    // InternalCinEditor.g:5660:1: rule__Rectangle__PositionAssignment_4 : ( rulePosition ) ;
    public final void rule__Rectangle__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5664:1: ( ( rulePosition ) )
            // InternalCinEditor.g:5665:2: ( rulePosition )
            {
            // InternalCinEditor.g:5665:2: ( rulePosition )
            // InternalCinEditor.g:5666:3: rulePosition
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
    // InternalCinEditor.g:5675:1: rule__Rectangle__DimensionAssignment_5 : ( ruleDimension ) ;
    public final void rule__Rectangle__DimensionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5679:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:5680:2: ( ruleDimension )
            {
            // InternalCinEditor.g:5680:2: ( ruleDimension )
            // InternalCinEditor.g:5681:3: ruleDimension
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


    // $ANTLR start "rule__Rectangle__BeginTimeAssignment_6_1"
    // InternalCinEditor.g:5690:1: rule__Rectangle__BeginTimeAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Rectangle__BeginTimeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5694:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5695:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5695:2: ( ruleEInt )
            // InternalCinEditor.g:5696:3: ruleEInt
            {
             before(grammarAccess.getRectangleAccess().getBeginTimeEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getBeginTimeEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__BeginTimeAssignment_6_1"


    // $ANTLR start "rule__Rectangle__DurationAssignment_7_1"
    // InternalCinEditor.g:5705:1: rule__Rectangle__DurationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Rectangle__DurationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5709:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5710:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5710:2: ( ruleEInt )
            // InternalCinEditor.g:5711:3: ruleEInt
            {
             before(grammarAccess.getRectangleAccess().getDurationEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getDurationEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__DurationAssignment_7_1"


    // $ANTLR start "rule__FadeIn__NameAssignment_1"
    // InternalCinEditor.g:5720:1: rule__FadeIn__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FadeIn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5724:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5725:2: ( ruleEString )
            {
            // InternalCinEditor.g:5725:2: ( ruleEString )
            // InternalCinEditor.g:5726:3: ruleEString
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
    // InternalCinEditor.g:5735:1: rule__FadeIn__DurationAssignment_5 : ( ruleEInt ) ;
    public final void rule__FadeIn__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5739:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5740:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5740:2: ( ruleEInt )
            // InternalCinEditor.g:5741:3: ruleEInt
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
    // InternalCinEditor.g:5750:1: rule__FadeIn__ElementsAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__FadeIn__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5754:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:5755:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:5755:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:5756:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeInAccess().getElementsGraphicalElementCrossReference_8_0()); 
            // InternalCinEditor.g:5757:3: ( RULE_ID )
            // InternalCinEditor.g:5758:4: RULE_ID
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
    // InternalCinEditor.g:5769:1: rule__FadeIn__ElementsAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__FadeIn__ElementsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5773:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:5774:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:5774:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:5775:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeInAccess().getElementsGraphicalElementCrossReference_9_1_0()); 
            // InternalCinEditor.g:5776:3: ( RULE_ID )
            // InternalCinEditor.g:5777:4: RULE_ID
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
    // InternalCinEditor.g:5788:1: rule__FadeOut__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FadeOut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5792:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5793:2: ( ruleEString )
            {
            // InternalCinEditor.g:5793:2: ( ruleEString )
            // InternalCinEditor.g:5794:3: ruleEString
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
    // InternalCinEditor.g:5803:1: rule__FadeOut__DurationAssignment_5 : ( ruleEInt ) ;
    public final void rule__FadeOut__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5807:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5808:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5808:2: ( ruleEInt )
            // InternalCinEditor.g:5809:3: ruleEInt
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
    // InternalCinEditor.g:5818:1: rule__FadeOut__ElementsAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__FadeOut__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5822:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:5823:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:5823:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:5824:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeOutAccess().getElementsGraphicalElementCrossReference_8_0()); 
            // InternalCinEditor.g:5825:3: ( RULE_ID )
            // InternalCinEditor.g:5826:4: RULE_ID
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
    // InternalCinEditor.g:5837:1: rule__FadeOut__ElementsAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__FadeOut__ElementsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5841:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:5842:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:5842:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:5843:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeOutAccess().getElementsGraphicalElementCrossReference_9_1_0()); 
            // InternalCinEditor.g:5844:3: ( RULE_ID )
            // InternalCinEditor.g:5845:4: RULE_ID
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
    // InternalCinEditor.g:5856:1: rule__Translate__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Translate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5860:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5861:2: ( ruleEString )
            {
            // InternalCinEditor.g:5861:2: ( ruleEString )
            // InternalCinEditor.g:5862:3: ruleEString
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
    // InternalCinEditor.g:5871:1: rule__Translate__PositionToTranslateAssignment_4 : ( rulePosition ) ;
    public final void rule__Translate__PositionToTranslateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5875:1: ( ( rulePosition ) )
            // InternalCinEditor.g:5876:2: ( rulePosition )
            {
            // InternalCinEditor.g:5876:2: ( rulePosition )
            // InternalCinEditor.g:5877:3: rulePosition
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
    // InternalCinEditor.g:5886:1: rule__Translate__BeginTimeAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Translate__BeginTimeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5890:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5891:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5891:2: ( ruleEInt )
            // InternalCinEditor.g:5892:3: ruleEInt
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
    // InternalCinEditor.g:5901:1: rule__Translate__DurationAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Translate__DurationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5905:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5906:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5906:2: ( ruleEInt )
            // InternalCinEditor.g:5907:3: ruleEInt
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
    // InternalCinEditor.g:5916:1: rule__Translate__ElementsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Translate__ElementsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5920:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:5921:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:5921:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:5922:3: ( RULE_ID )
            {
             before(grammarAccess.getTranslateAccess().getElementsGraphicalElementCrossReference_9_0()); 
            // InternalCinEditor.g:5923:3: ( RULE_ID )
            // InternalCinEditor.g:5924:4: RULE_ID
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
    // InternalCinEditor.g:5935:1: rule__Translate__ElementsAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Translate__ElementsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5939:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:5940:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:5940:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:5941:3: ( RULE_ID )
            {
             before(grammarAccess.getTranslateAccess().getElementsGraphicalElementCrossReference_10_1_0()); 
            // InternalCinEditor.g:5942:3: ( RULE_ID )
            // InternalCinEditor.g:5943:4: RULE_ID
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
    static final String dfa_2s = "\1\36\1\uffff\1\4\1\uffff\2\37\1\56\3\uffff";
    static final String dfa_3s = "\1\55\1\uffff\1\5\1\uffff\2\37\1\62\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\5\3\uffff\1\4\1\3\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\10\uffff\1\1\1\uffff\2\1\1\uffff\1\1\1\2",
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
            return "602:1: rule__Element__Alternatives : ( ( ruleGraphicalElement ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleAudioElement ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000368040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000368040000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000002000F840L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000015010800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000005004800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080004800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000005100000000L});

}