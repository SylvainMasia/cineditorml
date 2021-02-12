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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'center'", "'left'", "'right'", "'bottom'", "'top'", "'.'", "','", "'Movie'", "'fps'", "'Layer'", "'position'", "'('", "')'", "'dimension'", "'x'", "'color'", "'-'", "'Audio'", "'='", "'on'", "'volume'", "'fadeIn'", "'fadeOut'", "'at'", "'during'", "'Text'", "'fontSize'", "'Picture'", "'Video'", "'from'", "'Rectangle'", "'Effect'", "'FadeIn'", "'FadeOut'", "'Translate'"
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


    // $ANTLR start "entryRuleAudioElement"
    // InternalCinEditor.g:378:1: entryRuleAudioElement : ruleAudioElement EOF ;
    public final void entryRuleAudioElement() throws RecognitionException {
        try {
            // InternalCinEditor.g:379:1: ( ruleAudioElement EOF )
            // InternalCinEditor.g:380:1: ruleAudioElement EOF
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
    // InternalCinEditor.g:387:1: ruleAudioElement : ( ( rule__AudioElement__Group__0 ) ) ;
    public final void ruleAudioElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:391:2: ( ( ( rule__AudioElement__Group__0 ) ) )
            // InternalCinEditor.g:392:2: ( ( rule__AudioElement__Group__0 ) )
            {
            // InternalCinEditor.g:392:2: ( ( rule__AudioElement__Group__0 ) )
            // InternalCinEditor.g:393:3: ( rule__AudioElement__Group__0 )
            {
             before(grammarAccess.getAudioElementAccess().getGroup()); 
            // InternalCinEditor.g:394:3: ( rule__AudioElement__Group__0 )
            // InternalCinEditor.g:394:4: rule__AudioElement__Group__0
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
    // InternalCinEditor.g:403:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalCinEditor.g:404:1: ( ruleText EOF )
            // InternalCinEditor.g:405:1: ruleText EOF
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
    // InternalCinEditor.g:412:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:416:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalCinEditor.g:417:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalCinEditor.g:417:2: ( ( rule__Text__Group__0 ) )
            // InternalCinEditor.g:418:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalCinEditor.g:419:3: ( rule__Text__Group__0 )
            // InternalCinEditor.g:419:4: rule__Text__Group__0
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
    // InternalCinEditor.g:428:1: entryRulePicture : rulePicture EOF ;
    public final void entryRulePicture() throws RecognitionException {
        try {
            // InternalCinEditor.g:429:1: ( rulePicture EOF )
            // InternalCinEditor.g:430:1: rulePicture EOF
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
    // InternalCinEditor.g:437:1: rulePicture : ( ( rule__Picture__Group__0 ) ) ;
    public final void rulePicture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:441:2: ( ( ( rule__Picture__Group__0 ) ) )
            // InternalCinEditor.g:442:2: ( ( rule__Picture__Group__0 ) )
            {
            // InternalCinEditor.g:442:2: ( ( rule__Picture__Group__0 ) )
            // InternalCinEditor.g:443:3: ( rule__Picture__Group__0 )
            {
             before(grammarAccess.getPictureAccess().getGroup()); 
            // InternalCinEditor.g:444:3: ( rule__Picture__Group__0 )
            // InternalCinEditor.g:444:4: rule__Picture__Group__0
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
    // InternalCinEditor.g:453:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalCinEditor.g:454:1: ( ruleVideo EOF )
            // InternalCinEditor.g:455:1: ruleVideo EOF
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
    // InternalCinEditor.g:462:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:466:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalCinEditor.g:467:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalCinEditor.g:467:2: ( ( rule__Video__Group__0 ) )
            // InternalCinEditor.g:468:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalCinEditor.g:469:3: ( rule__Video__Group__0 )
            // InternalCinEditor.g:469:4: rule__Video__Group__0
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
    // InternalCinEditor.g:478:1: entryRuleRectangle : ruleRectangle EOF ;
    public final void entryRuleRectangle() throws RecognitionException {
        try {
            // InternalCinEditor.g:479:1: ( ruleRectangle EOF )
            // InternalCinEditor.g:480:1: ruleRectangle EOF
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
    // InternalCinEditor.g:487:1: ruleRectangle : ( ( rule__Rectangle__Group__0 ) ) ;
    public final void ruleRectangle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:491:2: ( ( ( rule__Rectangle__Group__0 ) ) )
            // InternalCinEditor.g:492:2: ( ( rule__Rectangle__Group__0 ) )
            {
            // InternalCinEditor.g:492:2: ( ( rule__Rectangle__Group__0 ) )
            // InternalCinEditor.g:493:3: ( rule__Rectangle__Group__0 )
            {
             before(grammarAccess.getRectangleAccess().getGroup()); 
            // InternalCinEditor.g:494:3: ( rule__Rectangle__Group__0 )
            // InternalCinEditor.g:494:4: rule__Rectangle__Group__0
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
    // InternalCinEditor.g:503:1: entryRuleFadeIn : ruleFadeIn EOF ;
    public final void entryRuleFadeIn() throws RecognitionException {
        try {
            // InternalCinEditor.g:504:1: ( ruleFadeIn EOF )
            // InternalCinEditor.g:505:1: ruleFadeIn EOF
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
    // InternalCinEditor.g:512:1: ruleFadeIn : ( ( rule__FadeIn__Group__0 ) ) ;
    public final void ruleFadeIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:516:2: ( ( ( rule__FadeIn__Group__0 ) ) )
            // InternalCinEditor.g:517:2: ( ( rule__FadeIn__Group__0 ) )
            {
            // InternalCinEditor.g:517:2: ( ( rule__FadeIn__Group__0 ) )
            // InternalCinEditor.g:518:3: ( rule__FadeIn__Group__0 )
            {
             before(grammarAccess.getFadeInAccess().getGroup()); 
            // InternalCinEditor.g:519:3: ( rule__FadeIn__Group__0 )
            // InternalCinEditor.g:519:4: rule__FadeIn__Group__0
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
    // InternalCinEditor.g:528:1: entryRuleFadeOut : ruleFadeOut EOF ;
    public final void entryRuleFadeOut() throws RecognitionException {
        try {
            // InternalCinEditor.g:529:1: ( ruleFadeOut EOF )
            // InternalCinEditor.g:530:1: ruleFadeOut EOF
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
    // InternalCinEditor.g:537:1: ruleFadeOut : ( ( rule__FadeOut__Group__0 ) ) ;
    public final void ruleFadeOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:541:2: ( ( ( rule__FadeOut__Group__0 ) ) )
            // InternalCinEditor.g:542:2: ( ( rule__FadeOut__Group__0 ) )
            {
            // InternalCinEditor.g:542:2: ( ( rule__FadeOut__Group__0 ) )
            // InternalCinEditor.g:543:3: ( rule__FadeOut__Group__0 )
            {
             before(grammarAccess.getFadeOutAccess().getGroup()); 
            // InternalCinEditor.g:544:3: ( rule__FadeOut__Group__0 )
            // InternalCinEditor.g:544:4: rule__FadeOut__Group__0
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
    // InternalCinEditor.g:553:1: entryRuleTranslate : ruleTranslate EOF ;
    public final void entryRuleTranslate() throws RecognitionException {
        try {
            // InternalCinEditor.g:554:1: ( ruleTranslate EOF )
            // InternalCinEditor.g:555:1: ruleTranslate EOF
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
    // InternalCinEditor.g:562:1: ruleTranslate : ( ( rule__Translate__Group__0 ) ) ;
    public final void ruleTranslate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:566:2: ( ( ( rule__Translate__Group__0 ) ) )
            // InternalCinEditor.g:567:2: ( ( rule__Translate__Group__0 ) )
            {
            // InternalCinEditor.g:567:2: ( ( rule__Translate__Group__0 ) )
            // InternalCinEditor.g:568:3: ( rule__Translate__Group__0 )
            {
             before(grammarAccess.getTranslateAccess().getGroup()); 
            // InternalCinEditor.g:569:3: ( rule__Translate__Group__0 )
            // InternalCinEditor.g:569:4: rule__Translate__Group__0
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
    // InternalCinEditor.g:577:1: rule__Element__Alternatives : ( ( ruleGraphicalElement ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleAudioElement ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:581:1: ( ( ruleGraphicalElement ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleAudioElement ) )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalCinEditor.g:582:2: ( ruleGraphicalElement )
                    {
                    // InternalCinEditor.g:582:2: ( ruleGraphicalElement )
                    // InternalCinEditor.g:583:3: ruleGraphicalElement
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
                    // InternalCinEditor.g:588:2: ( ruleFadeIn )
                    {
                    // InternalCinEditor.g:588:2: ( ruleFadeIn )
                    // InternalCinEditor.g:589:3: ruleFadeIn
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
                    // InternalCinEditor.g:594:2: ( ruleFadeOut )
                    {
                    // InternalCinEditor.g:594:2: ( ruleFadeOut )
                    // InternalCinEditor.g:595:3: ruleFadeOut
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
                    // InternalCinEditor.g:600:2: ( ruleTranslate )
                    {
                    // InternalCinEditor.g:600:2: ( ruleTranslate )
                    // InternalCinEditor.g:601:3: ruleTranslate
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
                    // InternalCinEditor.g:606:2: ( ruleAudioElement )
                    {
                    // InternalCinEditor.g:606:2: ( ruleAudioElement )
                    // InternalCinEditor.g:607:3: ruleAudioElement
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
    // InternalCinEditor.g:616:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:620:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalCinEditor.g:621:2: ( RULE_STRING )
                    {
                    // InternalCinEditor.g:621:2: ( RULE_STRING )
                    // InternalCinEditor.g:622:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:627:2: ( RULE_ID )
                    {
                    // InternalCinEditor.g:627:2: ( RULE_ID )
                    // InternalCinEditor.g:628:3: RULE_ID
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
    // InternalCinEditor.g:637:1: rule__ItemPosition__Alternatives : ( ( ruleItemPositionInt ) | ( ruleItemPositionString ) );
    public final void rule__ItemPosition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:641:1: ( ( ruleItemPositionInt ) | ( ruleItemPositionString ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==27) ) {
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
                    // InternalCinEditor.g:642:2: ( ruleItemPositionInt )
                    {
                    // InternalCinEditor.g:642:2: ( ruleItemPositionInt )
                    // InternalCinEditor.g:643:3: ruleItemPositionInt
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
                    // InternalCinEditor.g:648:2: ( ruleItemPositionString )
                    {
                    // InternalCinEditor.g:648:2: ( ruleItemPositionString )
                    // InternalCinEditor.g:649:3: ruleItemPositionString
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
    // InternalCinEditor.g:658:1: rule__ItemPositionString__PositionAlternatives_0 : ( ( 'center' ) | ( 'left' ) | ( 'right' ) | ( 'bottom' ) | ( 'top' ) );
    public final void rule__ItemPositionString__PositionAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:662:1: ( ( 'center' ) | ( 'left' ) | ( 'right' ) | ( 'bottom' ) | ( 'top' ) )
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
                    // InternalCinEditor.g:663:2: ( 'center' )
                    {
                    // InternalCinEditor.g:663:2: ( 'center' )
                    // InternalCinEditor.g:664:3: 'center'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionCenterKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionCenterKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:669:2: ( 'left' )
                    {
                    // InternalCinEditor.g:669:2: ( 'left' )
                    // InternalCinEditor.g:670:3: 'left'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionLeftKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionLeftKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCinEditor.g:675:2: ( 'right' )
                    {
                    // InternalCinEditor.g:675:2: ( 'right' )
                    // InternalCinEditor.g:676:3: 'right'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionRightKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionRightKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCinEditor.g:681:2: ( 'bottom' )
                    {
                    // InternalCinEditor.g:681:2: ( 'bottom' )
                    // InternalCinEditor.g:682:3: 'bottom'
                    {
                     before(grammarAccess.getItemPositionStringAccess().getPositionBottomKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getItemPositionStringAccess().getPositionBottomKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCinEditor.g:687:2: ( 'top' )
                    {
                    // InternalCinEditor.g:687:2: ( 'top' )
                    // InternalCinEditor.g:688:3: 'top'
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
    // InternalCinEditor.g:697:1: rule__GraphicalElement__Alternatives : ( ( ruleText ) | ( ruleVideo ) | ( rulePicture ) | ( ruleRectangle ) );
    public final void rule__GraphicalElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:701:1: ( ( ruleText ) | ( ruleVideo ) | ( rulePicture ) | ( ruleRectangle ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt5=1;
                }
                break;
            case 39:
                {
                alt5=2;
                }
                break;
            case 38:
                {
                alt5=3;
                }
                break;
            case 41:
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
                    // InternalCinEditor.g:702:2: ( ruleText )
                    {
                    // InternalCinEditor.g:702:2: ( ruleText )
                    // InternalCinEditor.g:703:3: ruleText
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
                    // InternalCinEditor.g:708:2: ( ruleVideo )
                    {
                    // InternalCinEditor.g:708:2: ( ruleVideo )
                    // InternalCinEditor.g:709:3: ruleVideo
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
                    // InternalCinEditor.g:714:2: ( rulePicture )
                    {
                    // InternalCinEditor.g:714:2: ( rulePicture )
                    // InternalCinEditor.g:715:3: rulePicture
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
                    // InternalCinEditor.g:720:2: ( ruleRectangle )
                    {
                    // InternalCinEditor.g:720:2: ( ruleRectangle )
                    // InternalCinEditor.g:721:3: ruleRectangle
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
    // InternalCinEditor.g:730:1: rule__EFloat__Alternatives_2_0 : ( ( '.' ) | ( ',' ) );
    public final void rule__EFloat__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:734:1: ( ( '.' ) | ( ',' ) )
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
                    // InternalCinEditor.g:735:2: ( '.' )
                    {
                    // InternalCinEditor.g:735:2: ( '.' )
                    // InternalCinEditor.g:736:3: '.'
                    {
                     before(grammarAccess.getEFloatAccess().getFullStopKeyword_2_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getFullStopKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCinEditor.g:741:2: ( ',' )
                    {
                    // InternalCinEditor.g:741:2: ( ',' )
                    // InternalCinEditor.g:742:3: ','
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


    // $ANTLR start "rule__Movie__Group__0"
    // InternalCinEditor.g:751:1: rule__Movie__Group__0 : rule__Movie__Group__0__Impl rule__Movie__Group__1 ;
    public final void rule__Movie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:755:1: ( rule__Movie__Group__0__Impl rule__Movie__Group__1 )
            // InternalCinEditor.g:756:2: rule__Movie__Group__0__Impl rule__Movie__Group__1
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
    // InternalCinEditor.g:763:1: rule__Movie__Group__0__Impl : ( 'Movie' ) ;
    public final void rule__Movie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:767:1: ( ( 'Movie' ) )
            // InternalCinEditor.g:768:1: ( 'Movie' )
            {
            // InternalCinEditor.g:768:1: ( 'Movie' )
            // InternalCinEditor.g:769:2: 'Movie'
            {
             before(grammarAccess.getMovieAccess().getMovieKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalCinEditor.g:778:1: rule__Movie__Group__1 : rule__Movie__Group__1__Impl rule__Movie__Group__2 ;
    public final void rule__Movie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:782:1: ( rule__Movie__Group__1__Impl rule__Movie__Group__2 )
            // InternalCinEditor.g:783:2: rule__Movie__Group__1__Impl rule__Movie__Group__2
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
    // InternalCinEditor.g:790:1: rule__Movie__Group__1__Impl : ( ( rule__Movie__NameAssignment_1 ) ) ;
    public final void rule__Movie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:794:1: ( ( ( rule__Movie__NameAssignment_1 ) ) )
            // InternalCinEditor.g:795:1: ( ( rule__Movie__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:795:1: ( ( rule__Movie__NameAssignment_1 ) )
            // InternalCinEditor.g:796:2: ( rule__Movie__NameAssignment_1 )
            {
             before(grammarAccess.getMovieAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:797:2: ( rule__Movie__NameAssignment_1 )
            // InternalCinEditor.g:797:3: rule__Movie__NameAssignment_1
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
    // InternalCinEditor.g:805:1: rule__Movie__Group__2 : rule__Movie__Group__2__Impl rule__Movie__Group__3 ;
    public final void rule__Movie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:809:1: ( rule__Movie__Group__2__Impl rule__Movie__Group__3 )
            // InternalCinEditor.g:810:2: rule__Movie__Group__2__Impl rule__Movie__Group__3
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
    // InternalCinEditor.g:817:1: rule__Movie__Group__2__Impl : ( ( rule__Movie__DimensionAssignment_2 ) ) ;
    public final void rule__Movie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:821:1: ( ( ( rule__Movie__DimensionAssignment_2 ) ) )
            // InternalCinEditor.g:822:1: ( ( rule__Movie__DimensionAssignment_2 ) )
            {
            // InternalCinEditor.g:822:1: ( ( rule__Movie__DimensionAssignment_2 ) )
            // InternalCinEditor.g:823:2: ( rule__Movie__DimensionAssignment_2 )
            {
             before(grammarAccess.getMovieAccess().getDimensionAssignment_2()); 
            // InternalCinEditor.g:824:2: ( rule__Movie__DimensionAssignment_2 )
            // InternalCinEditor.g:824:3: rule__Movie__DimensionAssignment_2
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
    // InternalCinEditor.g:832:1: rule__Movie__Group__3 : rule__Movie__Group__3__Impl rule__Movie__Group__4 ;
    public final void rule__Movie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:836:1: ( rule__Movie__Group__3__Impl rule__Movie__Group__4 )
            // InternalCinEditor.g:837:2: rule__Movie__Group__3__Impl rule__Movie__Group__4
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
    // InternalCinEditor.g:844:1: rule__Movie__Group__3__Impl : ( ( rule__Movie__Group_3__0 )? ) ;
    public final void rule__Movie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:848:1: ( ( ( rule__Movie__Group_3__0 )? ) )
            // InternalCinEditor.g:849:1: ( ( rule__Movie__Group_3__0 )? )
            {
            // InternalCinEditor.g:849:1: ( ( rule__Movie__Group_3__0 )? )
            // InternalCinEditor.g:850:2: ( rule__Movie__Group_3__0 )?
            {
             before(grammarAccess.getMovieAccess().getGroup_3()); 
            // InternalCinEditor.g:851:2: ( rule__Movie__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCinEditor.g:851:3: rule__Movie__Group_3__0
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
    // InternalCinEditor.g:859:1: rule__Movie__Group__4 : rule__Movie__Group__4__Impl ;
    public final void rule__Movie__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:863:1: ( rule__Movie__Group__4__Impl )
            // InternalCinEditor.g:864:2: rule__Movie__Group__4__Impl
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
    // InternalCinEditor.g:870:1: rule__Movie__Group__4__Impl : ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) ) ;
    public final void rule__Movie__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:874:1: ( ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) ) )
            // InternalCinEditor.g:875:1: ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) )
            {
            // InternalCinEditor.g:875:1: ( ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* ) )
            // InternalCinEditor.g:876:2: ( ( rule__Movie__LayersAssignment_4 ) ) ( ( rule__Movie__LayersAssignment_4 )* )
            {
            // InternalCinEditor.g:876:2: ( ( rule__Movie__LayersAssignment_4 ) )
            // InternalCinEditor.g:877:3: ( rule__Movie__LayersAssignment_4 )
            {
             before(grammarAccess.getMovieAccess().getLayersAssignment_4()); 
            // InternalCinEditor.g:878:3: ( rule__Movie__LayersAssignment_4 )
            // InternalCinEditor.g:878:4: rule__Movie__LayersAssignment_4
            {
            pushFollow(FOLLOW_6);
            rule__Movie__LayersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getLayersAssignment_4()); 

            }

            // InternalCinEditor.g:881:2: ( ( rule__Movie__LayersAssignment_4 )* )
            // InternalCinEditor.g:882:3: ( rule__Movie__LayersAssignment_4 )*
            {
             before(grammarAccess.getMovieAccess().getLayersAssignment_4()); 
            // InternalCinEditor.g:883:3: ( rule__Movie__LayersAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCinEditor.g:883:4: rule__Movie__LayersAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Movie__LayersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalCinEditor.g:893:1: rule__Movie__Group_3__0 : rule__Movie__Group_3__0__Impl rule__Movie__Group_3__1 ;
    public final void rule__Movie__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:897:1: ( rule__Movie__Group_3__0__Impl rule__Movie__Group_3__1 )
            // InternalCinEditor.g:898:2: rule__Movie__Group_3__0__Impl rule__Movie__Group_3__1
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
    // InternalCinEditor.g:905:1: rule__Movie__Group_3__0__Impl : ( 'fps' ) ;
    public final void rule__Movie__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:909:1: ( ( 'fps' ) )
            // InternalCinEditor.g:910:1: ( 'fps' )
            {
            // InternalCinEditor.g:910:1: ( 'fps' )
            // InternalCinEditor.g:911:2: 'fps'
            {
             before(grammarAccess.getMovieAccess().getFpsKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCinEditor.g:920:1: rule__Movie__Group_3__1 : rule__Movie__Group_3__1__Impl ;
    public final void rule__Movie__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:924:1: ( rule__Movie__Group_3__1__Impl )
            // InternalCinEditor.g:925:2: rule__Movie__Group_3__1__Impl
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
    // InternalCinEditor.g:931:1: rule__Movie__Group_3__1__Impl : ( ( rule__Movie__FpsAssignment_3_1 ) ) ;
    public final void rule__Movie__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:935:1: ( ( ( rule__Movie__FpsAssignment_3_1 ) ) )
            // InternalCinEditor.g:936:1: ( ( rule__Movie__FpsAssignment_3_1 ) )
            {
            // InternalCinEditor.g:936:1: ( ( rule__Movie__FpsAssignment_3_1 ) )
            // InternalCinEditor.g:937:2: ( rule__Movie__FpsAssignment_3_1 )
            {
             before(grammarAccess.getMovieAccess().getFpsAssignment_3_1()); 
            // InternalCinEditor.g:938:2: ( rule__Movie__FpsAssignment_3_1 )
            // InternalCinEditor.g:938:3: rule__Movie__FpsAssignment_3_1
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
    // InternalCinEditor.g:947:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:951:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalCinEditor.g:952:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
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
    // InternalCinEditor.g:959:1: rule__Layer__Group__0__Impl : ( () ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:963:1: ( ( () ) )
            // InternalCinEditor.g:964:1: ( () )
            {
            // InternalCinEditor.g:964:1: ( () )
            // InternalCinEditor.g:965:2: ()
            {
             before(grammarAccess.getLayerAccess().getLayerAction_0()); 
            // InternalCinEditor.g:966:2: ()
            // InternalCinEditor.g:966:3: 
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
    // InternalCinEditor.g:974:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:978:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalCinEditor.g:979:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
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
    // InternalCinEditor.g:986:1: rule__Layer__Group__1__Impl : ( 'Layer' ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:990:1: ( ( 'Layer' ) )
            // InternalCinEditor.g:991:1: ( 'Layer' )
            {
            // InternalCinEditor.g:991:1: ( 'Layer' )
            // InternalCinEditor.g:992:2: 'Layer'
            {
             before(grammarAccess.getLayerAccess().getLayerKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCinEditor.g:1001:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1005:1: ( rule__Layer__Group__2__Impl )
            // InternalCinEditor.g:1006:2: rule__Layer__Group__2__Impl
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
    // InternalCinEditor.g:1012:1: rule__Layer__Group__2__Impl : ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1016:1: ( ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) ) )
            // InternalCinEditor.g:1017:1: ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) )
            {
            // InternalCinEditor.g:1017:1: ( ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* ) )
            // InternalCinEditor.g:1018:2: ( ( rule__Layer__ElementsAssignment_2 ) ) ( ( rule__Layer__ElementsAssignment_2 )* )
            {
            // InternalCinEditor.g:1018:2: ( ( rule__Layer__ElementsAssignment_2 ) )
            // InternalCinEditor.g:1019:3: ( rule__Layer__ElementsAssignment_2 )
            {
             before(grammarAccess.getLayerAccess().getElementsAssignment_2()); 
            // InternalCinEditor.g:1020:3: ( rule__Layer__ElementsAssignment_2 )
            // InternalCinEditor.g:1020:4: rule__Layer__ElementsAssignment_2
            {
            pushFollow(FOLLOW_9);
            rule__Layer__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getElementsAssignment_2()); 

            }

            // InternalCinEditor.g:1023:2: ( ( rule__Layer__ElementsAssignment_2 )* )
            // InternalCinEditor.g:1024:3: ( rule__Layer__ElementsAssignment_2 )*
            {
             before(grammarAccess.getLayerAccess().getElementsAssignment_2()); 
            // InternalCinEditor.g:1025:3: ( rule__Layer__ElementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28||LA9_0==36||(LA9_0>=38 && LA9_0<=39)||(LA9_0>=41 && LA9_0<=42)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCinEditor.g:1025:4: rule__Layer__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Layer__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalCinEditor.g:1035:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1039:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalCinEditor.g:1040:2: rule__Position__Group__0__Impl rule__Position__Group__1
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
    // InternalCinEditor.g:1047:1: rule__Position__Group__0__Impl : ( 'position' ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1051:1: ( ( 'position' ) )
            // InternalCinEditor.g:1052:1: ( 'position' )
            {
            // InternalCinEditor.g:1052:1: ( 'position' )
            // InternalCinEditor.g:1053:2: 'position'
            {
             before(grammarAccess.getPositionAccess().getPositionKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalCinEditor.g:1062:1: rule__Position__Group__1 : rule__Position__Group__1__Impl ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1066:1: ( rule__Position__Group__1__Impl )
            // InternalCinEditor.g:1067:2: rule__Position__Group__1__Impl
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
    // InternalCinEditor.g:1073:1: rule__Position__Group__1__Impl : ( ( rule__Position__Group_1__0 ) ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1077:1: ( ( ( rule__Position__Group_1__0 ) ) )
            // InternalCinEditor.g:1078:1: ( ( rule__Position__Group_1__0 ) )
            {
            // InternalCinEditor.g:1078:1: ( ( rule__Position__Group_1__0 ) )
            // InternalCinEditor.g:1079:2: ( rule__Position__Group_1__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup_1()); 
            // InternalCinEditor.g:1080:2: ( rule__Position__Group_1__0 )
            // InternalCinEditor.g:1080:3: rule__Position__Group_1__0
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
    // InternalCinEditor.g:1089:1: rule__Position__Group_1__0 : rule__Position__Group_1__0__Impl rule__Position__Group_1__1 ;
    public final void rule__Position__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1093:1: ( rule__Position__Group_1__0__Impl rule__Position__Group_1__1 )
            // InternalCinEditor.g:1094:2: rule__Position__Group_1__0__Impl rule__Position__Group_1__1
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
    // InternalCinEditor.g:1101:1: rule__Position__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Position__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1105:1: ( ( '(' ) )
            // InternalCinEditor.g:1106:1: ( '(' )
            {
            // InternalCinEditor.g:1106:1: ( '(' )
            // InternalCinEditor.g:1107:2: '('
            {
             before(grammarAccess.getPositionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCinEditor.g:1116:1: rule__Position__Group_1__1 : rule__Position__Group_1__1__Impl rule__Position__Group_1__2 ;
    public final void rule__Position__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1120:1: ( rule__Position__Group_1__1__Impl rule__Position__Group_1__2 )
            // InternalCinEditor.g:1121:2: rule__Position__Group_1__1__Impl rule__Position__Group_1__2
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
    // InternalCinEditor.g:1128:1: rule__Position__Group_1__1__Impl : ( ( rule__Position__XAssignment_1_1 ) ) ;
    public final void rule__Position__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1132:1: ( ( ( rule__Position__XAssignment_1_1 ) ) )
            // InternalCinEditor.g:1133:1: ( ( rule__Position__XAssignment_1_1 ) )
            {
            // InternalCinEditor.g:1133:1: ( ( rule__Position__XAssignment_1_1 ) )
            // InternalCinEditor.g:1134:2: ( rule__Position__XAssignment_1_1 )
            {
             before(grammarAccess.getPositionAccess().getXAssignment_1_1()); 
            // InternalCinEditor.g:1135:2: ( rule__Position__XAssignment_1_1 )
            // InternalCinEditor.g:1135:3: rule__Position__XAssignment_1_1
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
    // InternalCinEditor.g:1143:1: rule__Position__Group_1__2 : rule__Position__Group_1__2__Impl rule__Position__Group_1__3 ;
    public final void rule__Position__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1147:1: ( rule__Position__Group_1__2__Impl rule__Position__Group_1__3 )
            // InternalCinEditor.g:1148:2: rule__Position__Group_1__2__Impl rule__Position__Group_1__3
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
    // InternalCinEditor.g:1155:1: rule__Position__Group_1__2__Impl : ( ',' ) ;
    public final void rule__Position__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1159:1: ( ( ',' ) )
            // InternalCinEditor.g:1160:1: ( ',' )
            {
            // InternalCinEditor.g:1160:1: ( ',' )
            // InternalCinEditor.g:1161:2: ','
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
    // InternalCinEditor.g:1170:1: rule__Position__Group_1__3 : rule__Position__Group_1__3__Impl rule__Position__Group_1__4 ;
    public final void rule__Position__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1174:1: ( rule__Position__Group_1__3__Impl rule__Position__Group_1__4 )
            // InternalCinEditor.g:1175:2: rule__Position__Group_1__3__Impl rule__Position__Group_1__4
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
    // InternalCinEditor.g:1182:1: rule__Position__Group_1__3__Impl : ( ( rule__Position__YAssignment_1_3 ) ) ;
    public final void rule__Position__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1186:1: ( ( ( rule__Position__YAssignment_1_3 ) ) )
            // InternalCinEditor.g:1187:1: ( ( rule__Position__YAssignment_1_3 ) )
            {
            // InternalCinEditor.g:1187:1: ( ( rule__Position__YAssignment_1_3 ) )
            // InternalCinEditor.g:1188:2: ( rule__Position__YAssignment_1_3 )
            {
             before(grammarAccess.getPositionAccess().getYAssignment_1_3()); 
            // InternalCinEditor.g:1189:2: ( rule__Position__YAssignment_1_3 )
            // InternalCinEditor.g:1189:3: rule__Position__YAssignment_1_3
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
    // InternalCinEditor.g:1197:1: rule__Position__Group_1__4 : rule__Position__Group_1__4__Impl ;
    public final void rule__Position__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1201:1: ( rule__Position__Group_1__4__Impl )
            // InternalCinEditor.g:1202:2: rule__Position__Group_1__4__Impl
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
    // InternalCinEditor.g:1208:1: rule__Position__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Position__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1212:1: ( ( ')' ) )
            // InternalCinEditor.g:1213:1: ( ')' )
            {
            // InternalCinEditor.g:1213:1: ( ')' )
            // InternalCinEditor.g:1214:2: ')'
            {
             before(grammarAccess.getPositionAccess().getRightParenthesisKeyword_1_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCinEditor.g:1224:1: rule__Dimension__Group__0 : rule__Dimension__Group__0__Impl rule__Dimension__Group__1 ;
    public final void rule__Dimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1228:1: ( rule__Dimension__Group__0__Impl rule__Dimension__Group__1 )
            // InternalCinEditor.g:1229:2: rule__Dimension__Group__0__Impl rule__Dimension__Group__1
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
    // InternalCinEditor.g:1236:1: rule__Dimension__Group__0__Impl : ( 'dimension' ) ;
    public final void rule__Dimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1240:1: ( ( 'dimension' ) )
            // InternalCinEditor.g:1241:1: ( 'dimension' )
            {
            // InternalCinEditor.g:1241:1: ( 'dimension' )
            // InternalCinEditor.g:1242:2: 'dimension'
            {
             before(grammarAccess.getDimensionAccess().getDimensionKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCinEditor.g:1251:1: rule__Dimension__Group__1 : rule__Dimension__Group__1__Impl rule__Dimension__Group__2 ;
    public final void rule__Dimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1255:1: ( rule__Dimension__Group__1__Impl rule__Dimension__Group__2 )
            // InternalCinEditor.g:1256:2: rule__Dimension__Group__1__Impl rule__Dimension__Group__2
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
    // InternalCinEditor.g:1263:1: rule__Dimension__Group__1__Impl : ( ( rule__Dimension__WidthAssignment_1 ) ) ;
    public final void rule__Dimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1267:1: ( ( ( rule__Dimension__WidthAssignment_1 ) ) )
            // InternalCinEditor.g:1268:1: ( ( rule__Dimension__WidthAssignment_1 ) )
            {
            // InternalCinEditor.g:1268:1: ( ( rule__Dimension__WidthAssignment_1 ) )
            // InternalCinEditor.g:1269:2: ( rule__Dimension__WidthAssignment_1 )
            {
             before(grammarAccess.getDimensionAccess().getWidthAssignment_1()); 
            // InternalCinEditor.g:1270:2: ( rule__Dimension__WidthAssignment_1 )
            // InternalCinEditor.g:1270:3: rule__Dimension__WidthAssignment_1
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
    // InternalCinEditor.g:1278:1: rule__Dimension__Group__2 : rule__Dimension__Group__2__Impl rule__Dimension__Group__3 ;
    public final void rule__Dimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1282:1: ( rule__Dimension__Group__2__Impl rule__Dimension__Group__3 )
            // InternalCinEditor.g:1283:2: rule__Dimension__Group__2__Impl rule__Dimension__Group__3
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
    // InternalCinEditor.g:1290:1: rule__Dimension__Group__2__Impl : ( 'x' ) ;
    public final void rule__Dimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1294:1: ( ( 'x' ) )
            // InternalCinEditor.g:1295:1: ( 'x' )
            {
            // InternalCinEditor.g:1295:1: ( 'x' )
            // InternalCinEditor.g:1296:2: 'x'
            {
             before(grammarAccess.getDimensionAccess().getXKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCinEditor.g:1305:1: rule__Dimension__Group__3 : rule__Dimension__Group__3__Impl ;
    public final void rule__Dimension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1309:1: ( rule__Dimension__Group__3__Impl )
            // InternalCinEditor.g:1310:2: rule__Dimension__Group__3__Impl
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
    // InternalCinEditor.g:1316:1: rule__Dimension__Group__3__Impl : ( ( rule__Dimension__HeightAssignment_3 ) ) ;
    public final void rule__Dimension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1320:1: ( ( ( rule__Dimension__HeightAssignment_3 ) ) )
            // InternalCinEditor.g:1321:1: ( ( rule__Dimension__HeightAssignment_3 ) )
            {
            // InternalCinEditor.g:1321:1: ( ( rule__Dimension__HeightAssignment_3 ) )
            // InternalCinEditor.g:1322:2: ( rule__Dimension__HeightAssignment_3 )
            {
             before(grammarAccess.getDimensionAccess().getHeightAssignment_3()); 
            // InternalCinEditor.g:1323:2: ( rule__Dimension__HeightAssignment_3 )
            // InternalCinEditor.g:1323:3: rule__Dimension__HeightAssignment_3
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
    // InternalCinEditor.g:1332:1: rule__HexadecimalColor__Group__0 : rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1 ;
    public final void rule__HexadecimalColor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1336:1: ( rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1 )
            // InternalCinEditor.g:1337:2: rule__HexadecimalColor__Group__0__Impl rule__HexadecimalColor__Group__1
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
    // InternalCinEditor.g:1344:1: rule__HexadecimalColor__Group__0__Impl : ( 'color' ) ;
    public final void rule__HexadecimalColor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1348:1: ( ( 'color' ) )
            // InternalCinEditor.g:1349:1: ( 'color' )
            {
            // InternalCinEditor.g:1349:1: ( 'color' )
            // InternalCinEditor.g:1350:2: 'color'
            {
             before(grammarAccess.getHexadecimalColorAccess().getColorKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCinEditor.g:1359:1: rule__HexadecimalColor__Group__1 : rule__HexadecimalColor__Group__1__Impl ;
    public final void rule__HexadecimalColor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1363:1: ( rule__HexadecimalColor__Group__1__Impl )
            // InternalCinEditor.g:1364:2: rule__HexadecimalColor__Group__1__Impl
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
    // InternalCinEditor.g:1370:1: rule__HexadecimalColor__Group__1__Impl : ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) ) ;
    public final void rule__HexadecimalColor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1374:1: ( ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) ) )
            // InternalCinEditor.g:1375:1: ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) )
            {
            // InternalCinEditor.g:1375:1: ( ( rule__HexadecimalColor__HexadecimalValueAssignment_1 ) )
            // InternalCinEditor.g:1376:2: ( rule__HexadecimalColor__HexadecimalValueAssignment_1 )
            {
             before(grammarAccess.getHexadecimalColorAccess().getHexadecimalValueAssignment_1()); 
            // InternalCinEditor.g:1377:2: ( rule__HexadecimalColor__HexadecimalValueAssignment_1 )
            // InternalCinEditor.g:1377:3: rule__HexadecimalColor__HexadecimalValueAssignment_1
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
    // InternalCinEditor.g:1386:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1390:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalCinEditor.g:1391:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalCinEditor.g:1398:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1402:1: ( ( ( '-' )? ) )
            // InternalCinEditor.g:1403:1: ( ( '-' )? )
            {
            // InternalCinEditor.g:1403:1: ( ( '-' )? )
            // InternalCinEditor.g:1404:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalCinEditor.g:1405:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCinEditor.g:1405:3: '-'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalCinEditor.g:1413:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1417:1: ( rule__EInt__Group__1__Impl )
            // InternalCinEditor.g:1418:2: rule__EInt__Group__1__Impl
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
    // InternalCinEditor.g:1424:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1428:1: ( ( RULE_INT ) )
            // InternalCinEditor.g:1429:1: ( RULE_INT )
            {
            // InternalCinEditor.g:1429:1: ( RULE_INT )
            // InternalCinEditor.g:1430:2: RULE_INT
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
    // InternalCinEditor.g:1440:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1444:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalCinEditor.g:1445:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
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
    // InternalCinEditor.g:1452:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1456:1: ( ( ( '-' )? ) )
            // InternalCinEditor.g:1457:1: ( ( '-' )? )
            {
            // InternalCinEditor.g:1457:1: ( ( '-' )? )
            // InternalCinEditor.g:1458:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalCinEditor.g:1459:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCinEditor.g:1459:3: '-'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalCinEditor.g:1467:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1471:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalCinEditor.g:1472:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
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
    // InternalCinEditor.g:1479:1: rule__EFloat__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1483:1: ( ( RULE_INT ) )
            // InternalCinEditor.g:1484:1: ( RULE_INT )
            {
            // InternalCinEditor.g:1484:1: ( RULE_INT )
            // InternalCinEditor.g:1485:2: RULE_INT
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
    // InternalCinEditor.g:1494:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1498:1: ( rule__EFloat__Group__2__Impl )
            // InternalCinEditor.g:1499:2: rule__EFloat__Group__2__Impl
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
    // InternalCinEditor.g:1505:1: rule__EFloat__Group__2__Impl : ( ( rule__EFloat__Group_2__0 )? ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1509:1: ( ( ( rule__EFloat__Group_2__0 )? ) )
            // InternalCinEditor.g:1510:1: ( ( rule__EFloat__Group_2__0 )? )
            {
            // InternalCinEditor.g:1510:1: ( ( rule__EFloat__Group_2__0 )? )
            // InternalCinEditor.g:1511:2: ( rule__EFloat__Group_2__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_2()); 
            // InternalCinEditor.g:1512:2: ( rule__EFloat__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=16 && LA12_0<=17)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCinEditor.g:1512:3: rule__EFloat__Group_2__0
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
    // InternalCinEditor.g:1521:1: rule__EFloat__Group_2__0 : rule__EFloat__Group_2__0__Impl rule__EFloat__Group_2__1 ;
    public final void rule__EFloat__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1525:1: ( rule__EFloat__Group_2__0__Impl rule__EFloat__Group_2__1 )
            // InternalCinEditor.g:1526:2: rule__EFloat__Group_2__0__Impl rule__EFloat__Group_2__1
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
    // InternalCinEditor.g:1533:1: rule__EFloat__Group_2__0__Impl : ( ( rule__EFloat__Alternatives_2_0 ) ) ;
    public final void rule__EFloat__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1537:1: ( ( ( rule__EFloat__Alternatives_2_0 ) ) )
            // InternalCinEditor.g:1538:1: ( ( rule__EFloat__Alternatives_2_0 ) )
            {
            // InternalCinEditor.g:1538:1: ( ( rule__EFloat__Alternatives_2_0 ) )
            // InternalCinEditor.g:1539:2: ( rule__EFloat__Alternatives_2_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_2_0()); 
            // InternalCinEditor.g:1540:2: ( rule__EFloat__Alternatives_2_0 )
            // InternalCinEditor.g:1540:3: rule__EFloat__Alternatives_2_0
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
    // InternalCinEditor.g:1548:1: rule__EFloat__Group_2__1 : rule__EFloat__Group_2__1__Impl ;
    public final void rule__EFloat__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1552:1: ( rule__EFloat__Group_2__1__Impl )
            // InternalCinEditor.g:1553:2: rule__EFloat__Group_2__1__Impl
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
    // InternalCinEditor.g:1559:1: rule__EFloat__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1563:1: ( ( RULE_INT ) )
            // InternalCinEditor.g:1564:1: ( RULE_INT )
            {
            // InternalCinEditor.g:1564:1: ( RULE_INT )
            // InternalCinEditor.g:1565:2: RULE_INT
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
    // InternalCinEditor.g:1575:1: rule__AudioElement__Group__0 : rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1 ;
    public final void rule__AudioElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1579:1: ( rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1 )
            // InternalCinEditor.g:1580:2: rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1
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
    // InternalCinEditor.g:1587:1: rule__AudioElement__Group__0__Impl : ( 'Audio' ) ;
    public final void rule__AudioElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1591:1: ( ( 'Audio' ) )
            // InternalCinEditor.g:1592:1: ( 'Audio' )
            {
            // InternalCinEditor.g:1592:1: ( 'Audio' )
            // InternalCinEditor.g:1593:2: 'Audio'
            {
             before(grammarAccess.getAudioElementAccess().getAudioKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCinEditor.g:1602:1: rule__AudioElement__Group__1 : rule__AudioElement__Group__1__Impl rule__AudioElement__Group__2 ;
    public final void rule__AudioElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1606:1: ( rule__AudioElement__Group__1__Impl rule__AudioElement__Group__2 )
            // InternalCinEditor.g:1607:2: rule__AudioElement__Group__1__Impl rule__AudioElement__Group__2
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
    // InternalCinEditor.g:1614:1: rule__AudioElement__Group__1__Impl : ( ( rule__AudioElement__NameAssignment_1 ) ) ;
    public final void rule__AudioElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1618:1: ( ( ( rule__AudioElement__NameAssignment_1 ) ) )
            // InternalCinEditor.g:1619:1: ( ( rule__AudioElement__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:1619:1: ( ( rule__AudioElement__NameAssignment_1 ) )
            // InternalCinEditor.g:1620:2: ( rule__AudioElement__NameAssignment_1 )
            {
             before(grammarAccess.getAudioElementAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:1621:2: ( rule__AudioElement__NameAssignment_1 )
            // InternalCinEditor.g:1621:3: rule__AudioElement__NameAssignment_1
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
    // InternalCinEditor.g:1629:1: rule__AudioElement__Group__2 : rule__AudioElement__Group__2__Impl rule__AudioElement__Group__3 ;
    public final void rule__AudioElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1633:1: ( rule__AudioElement__Group__2__Impl rule__AudioElement__Group__3 )
            // InternalCinEditor.g:1634:2: rule__AudioElement__Group__2__Impl rule__AudioElement__Group__3
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
    // InternalCinEditor.g:1641:1: rule__AudioElement__Group__2__Impl : ( '=' ) ;
    public final void rule__AudioElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1645:1: ( ( '=' ) )
            // InternalCinEditor.g:1646:1: ( '=' )
            {
            // InternalCinEditor.g:1646:1: ( '=' )
            // InternalCinEditor.g:1647:2: '='
            {
             before(grammarAccess.getAudioElementAccess().getEqualsSignKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCinEditor.g:1656:1: rule__AudioElement__Group__3 : rule__AudioElement__Group__3__Impl rule__AudioElement__Group__4 ;
    public final void rule__AudioElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1660:1: ( rule__AudioElement__Group__3__Impl rule__AudioElement__Group__4 )
            // InternalCinEditor.g:1661:2: rule__AudioElement__Group__3__Impl rule__AudioElement__Group__4
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
    // InternalCinEditor.g:1668:1: rule__AudioElement__Group__3__Impl : ( ( rule__AudioElement__UrlAssignment_3 ) ) ;
    public final void rule__AudioElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1672:1: ( ( ( rule__AudioElement__UrlAssignment_3 ) ) )
            // InternalCinEditor.g:1673:1: ( ( rule__AudioElement__UrlAssignment_3 ) )
            {
            // InternalCinEditor.g:1673:1: ( ( rule__AudioElement__UrlAssignment_3 ) )
            // InternalCinEditor.g:1674:2: ( rule__AudioElement__UrlAssignment_3 )
            {
             before(grammarAccess.getAudioElementAccess().getUrlAssignment_3()); 
            // InternalCinEditor.g:1675:2: ( rule__AudioElement__UrlAssignment_3 )
            // InternalCinEditor.g:1675:3: rule__AudioElement__UrlAssignment_3
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
    // InternalCinEditor.g:1683:1: rule__AudioElement__Group__4 : rule__AudioElement__Group__4__Impl rule__AudioElement__Group__5 ;
    public final void rule__AudioElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1687:1: ( rule__AudioElement__Group__4__Impl rule__AudioElement__Group__5 )
            // InternalCinEditor.g:1688:2: rule__AudioElement__Group__4__Impl rule__AudioElement__Group__5
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
    // InternalCinEditor.g:1695:1: rule__AudioElement__Group__4__Impl : ( ( rule__AudioElement__Group_4__0 )? ) ;
    public final void rule__AudioElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1699:1: ( ( ( rule__AudioElement__Group_4__0 )? ) )
            // InternalCinEditor.g:1700:1: ( ( rule__AudioElement__Group_4__0 )? )
            {
            // InternalCinEditor.g:1700:1: ( ( rule__AudioElement__Group_4__0 )? )
            // InternalCinEditor.g:1701:2: ( rule__AudioElement__Group_4__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_4()); 
            // InternalCinEditor.g:1702:2: ( rule__AudioElement__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCinEditor.g:1702:3: rule__AudioElement__Group_4__0
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
    // InternalCinEditor.g:1710:1: rule__AudioElement__Group__5 : rule__AudioElement__Group__5__Impl rule__AudioElement__Group__6 ;
    public final void rule__AudioElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1714:1: ( rule__AudioElement__Group__5__Impl rule__AudioElement__Group__6 )
            // InternalCinEditor.g:1715:2: rule__AudioElement__Group__5__Impl rule__AudioElement__Group__6
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
    // InternalCinEditor.g:1722:1: rule__AudioElement__Group__5__Impl : ( ( rule__AudioElement__Group_5__0 )? ) ;
    public final void rule__AudioElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1726:1: ( ( ( rule__AudioElement__Group_5__0 )? ) )
            // InternalCinEditor.g:1727:1: ( ( rule__AudioElement__Group_5__0 )? )
            {
            // InternalCinEditor.g:1727:1: ( ( rule__AudioElement__Group_5__0 )? )
            // InternalCinEditor.g:1728:2: ( rule__AudioElement__Group_5__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_5()); 
            // InternalCinEditor.g:1729:2: ( rule__AudioElement__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCinEditor.g:1729:3: rule__AudioElement__Group_5__0
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
    // InternalCinEditor.g:1737:1: rule__AudioElement__Group__6 : rule__AudioElement__Group__6__Impl rule__AudioElement__Group__7 ;
    public final void rule__AudioElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1741:1: ( rule__AudioElement__Group__6__Impl rule__AudioElement__Group__7 )
            // InternalCinEditor.g:1742:2: rule__AudioElement__Group__6__Impl rule__AudioElement__Group__7
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
    // InternalCinEditor.g:1749:1: rule__AudioElement__Group__6__Impl : ( ( rule__AudioElement__Group_6__0 )? ) ;
    public final void rule__AudioElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1753:1: ( ( ( rule__AudioElement__Group_6__0 )? ) )
            // InternalCinEditor.g:1754:1: ( ( rule__AudioElement__Group_6__0 )? )
            {
            // InternalCinEditor.g:1754:1: ( ( rule__AudioElement__Group_6__0 )? )
            // InternalCinEditor.g:1755:2: ( rule__AudioElement__Group_6__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_6()); 
            // InternalCinEditor.g:1756:2: ( rule__AudioElement__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCinEditor.g:1756:3: rule__AudioElement__Group_6__0
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
    // InternalCinEditor.g:1764:1: rule__AudioElement__Group__7 : rule__AudioElement__Group__7__Impl rule__AudioElement__Group__8 ;
    public final void rule__AudioElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1768:1: ( rule__AudioElement__Group__7__Impl rule__AudioElement__Group__8 )
            // InternalCinEditor.g:1769:2: rule__AudioElement__Group__7__Impl rule__AudioElement__Group__8
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
    // InternalCinEditor.g:1776:1: rule__AudioElement__Group__7__Impl : ( ( rule__AudioElement__Group_7__0 )? ) ;
    public final void rule__AudioElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1780:1: ( ( ( rule__AudioElement__Group_7__0 )? ) )
            // InternalCinEditor.g:1781:1: ( ( rule__AudioElement__Group_7__0 )? )
            {
            // InternalCinEditor.g:1781:1: ( ( rule__AudioElement__Group_7__0 )? )
            // InternalCinEditor.g:1782:2: ( rule__AudioElement__Group_7__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_7()); 
            // InternalCinEditor.g:1783:2: ( rule__AudioElement__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCinEditor.g:1783:3: rule__AudioElement__Group_7__0
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
    // InternalCinEditor.g:1791:1: rule__AudioElement__Group__8 : rule__AudioElement__Group__8__Impl rule__AudioElement__Group__9 ;
    public final void rule__AudioElement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1795:1: ( rule__AudioElement__Group__8__Impl rule__AudioElement__Group__9 )
            // InternalCinEditor.g:1796:2: rule__AudioElement__Group__8__Impl rule__AudioElement__Group__9
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
    // InternalCinEditor.g:1803:1: rule__AudioElement__Group__8__Impl : ( ( rule__AudioElement__Group_8__0 )? ) ;
    public final void rule__AudioElement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1807:1: ( ( ( rule__AudioElement__Group_8__0 )? ) )
            // InternalCinEditor.g:1808:1: ( ( rule__AudioElement__Group_8__0 )? )
            {
            // InternalCinEditor.g:1808:1: ( ( rule__AudioElement__Group_8__0 )? )
            // InternalCinEditor.g:1809:2: ( rule__AudioElement__Group_8__0 )?
            {
             before(grammarAccess.getAudioElementAccess().getGroup_8()); 
            // InternalCinEditor.g:1810:2: ( rule__AudioElement__Group_8__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCinEditor.g:1810:3: rule__AudioElement__Group_8__0
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
    // InternalCinEditor.g:1818:1: rule__AudioElement__Group__9 : rule__AudioElement__Group__9__Impl rule__AudioElement__Group__10 ;
    public final void rule__AudioElement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1822:1: ( rule__AudioElement__Group__9__Impl rule__AudioElement__Group__10 )
            // InternalCinEditor.g:1823:2: rule__AudioElement__Group__9__Impl rule__AudioElement__Group__10
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
    // InternalCinEditor.g:1830:1: rule__AudioElement__Group__9__Impl : ( 'on' ) ;
    public final void rule__AudioElement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1834:1: ( ( 'on' ) )
            // InternalCinEditor.g:1835:1: ( 'on' )
            {
            // InternalCinEditor.g:1835:1: ( 'on' )
            // InternalCinEditor.g:1836:2: 'on'
            {
             before(grammarAccess.getAudioElementAccess().getOnKeyword_9()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getOnKeyword_9()); 

            }


            }

        }
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
    // InternalCinEditor.g:1845:1: rule__AudioElement__Group__10 : rule__AudioElement__Group__10__Impl ;
    public final void rule__AudioElement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1849:1: ( rule__AudioElement__Group__10__Impl )
            // InternalCinEditor.g:1850:2: rule__AudioElement__Group__10__Impl
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
    // InternalCinEditor.g:1856:1: rule__AudioElement__Group__10__Impl : ( ( rule__AudioElement__ElementAssignment_10 ) ) ;
    public final void rule__AudioElement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1860:1: ( ( ( rule__AudioElement__ElementAssignment_10 ) ) )
            // InternalCinEditor.g:1861:1: ( ( rule__AudioElement__ElementAssignment_10 ) )
            {
            // InternalCinEditor.g:1861:1: ( ( rule__AudioElement__ElementAssignment_10 ) )
            // InternalCinEditor.g:1862:2: ( rule__AudioElement__ElementAssignment_10 )
            {
             before(grammarAccess.getAudioElementAccess().getElementAssignment_10()); 
            // InternalCinEditor.g:1863:2: ( rule__AudioElement__ElementAssignment_10 )
            // InternalCinEditor.g:1863:3: rule__AudioElement__ElementAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__ElementAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getElementAssignment_10()); 

            }


            }

        }
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
    // InternalCinEditor.g:1872:1: rule__AudioElement__Group_4__0 : rule__AudioElement__Group_4__0__Impl rule__AudioElement__Group_4__1 ;
    public final void rule__AudioElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1876:1: ( rule__AudioElement__Group_4__0__Impl rule__AudioElement__Group_4__1 )
            // InternalCinEditor.g:1877:2: rule__AudioElement__Group_4__0__Impl rule__AudioElement__Group_4__1
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
    // InternalCinEditor.g:1884:1: rule__AudioElement__Group_4__0__Impl : ( 'volume' ) ;
    public final void rule__AudioElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1888:1: ( ( 'volume' ) )
            // InternalCinEditor.g:1889:1: ( 'volume' )
            {
            // InternalCinEditor.g:1889:1: ( 'volume' )
            // InternalCinEditor.g:1890:2: 'volume'
            {
             before(grammarAccess.getAudioElementAccess().getVolumeKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCinEditor.g:1899:1: rule__AudioElement__Group_4__1 : rule__AudioElement__Group_4__1__Impl ;
    public final void rule__AudioElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1903:1: ( rule__AudioElement__Group_4__1__Impl )
            // InternalCinEditor.g:1904:2: rule__AudioElement__Group_4__1__Impl
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
    // InternalCinEditor.g:1910:1: rule__AudioElement__Group_4__1__Impl : ( ( rule__AudioElement__VolumeAssignment_4_1 ) ) ;
    public final void rule__AudioElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1914:1: ( ( ( rule__AudioElement__VolumeAssignment_4_1 ) ) )
            // InternalCinEditor.g:1915:1: ( ( rule__AudioElement__VolumeAssignment_4_1 ) )
            {
            // InternalCinEditor.g:1915:1: ( ( rule__AudioElement__VolumeAssignment_4_1 ) )
            // InternalCinEditor.g:1916:2: ( rule__AudioElement__VolumeAssignment_4_1 )
            {
             before(grammarAccess.getAudioElementAccess().getVolumeAssignment_4_1()); 
            // InternalCinEditor.g:1917:2: ( rule__AudioElement__VolumeAssignment_4_1 )
            // InternalCinEditor.g:1917:3: rule__AudioElement__VolumeAssignment_4_1
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
    // InternalCinEditor.g:1926:1: rule__AudioElement__Group_5__0 : rule__AudioElement__Group_5__0__Impl rule__AudioElement__Group_5__1 ;
    public final void rule__AudioElement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1930:1: ( rule__AudioElement__Group_5__0__Impl rule__AudioElement__Group_5__1 )
            // InternalCinEditor.g:1931:2: rule__AudioElement__Group_5__0__Impl rule__AudioElement__Group_5__1
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
    // InternalCinEditor.g:1938:1: rule__AudioElement__Group_5__0__Impl : ( 'fadeIn' ) ;
    public final void rule__AudioElement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1942:1: ( ( 'fadeIn' ) )
            // InternalCinEditor.g:1943:1: ( 'fadeIn' )
            {
            // InternalCinEditor.g:1943:1: ( 'fadeIn' )
            // InternalCinEditor.g:1944:2: 'fadeIn'
            {
             before(grammarAccess.getAudioElementAccess().getFadeInKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCinEditor.g:1953:1: rule__AudioElement__Group_5__1 : rule__AudioElement__Group_5__1__Impl ;
    public final void rule__AudioElement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1957:1: ( rule__AudioElement__Group_5__1__Impl )
            // InternalCinEditor.g:1958:2: rule__AudioElement__Group_5__1__Impl
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
    // InternalCinEditor.g:1964:1: rule__AudioElement__Group_5__1__Impl : ( ( rule__AudioElement__FadeInAssignment_5_1 ) ) ;
    public final void rule__AudioElement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1968:1: ( ( ( rule__AudioElement__FadeInAssignment_5_1 ) ) )
            // InternalCinEditor.g:1969:1: ( ( rule__AudioElement__FadeInAssignment_5_1 ) )
            {
            // InternalCinEditor.g:1969:1: ( ( rule__AudioElement__FadeInAssignment_5_1 ) )
            // InternalCinEditor.g:1970:2: ( rule__AudioElement__FadeInAssignment_5_1 )
            {
             before(grammarAccess.getAudioElementAccess().getFadeInAssignment_5_1()); 
            // InternalCinEditor.g:1971:2: ( rule__AudioElement__FadeInAssignment_5_1 )
            // InternalCinEditor.g:1971:3: rule__AudioElement__FadeInAssignment_5_1
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
    // InternalCinEditor.g:1980:1: rule__AudioElement__Group_6__0 : rule__AudioElement__Group_6__0__Impl rule__AudioElement__Group_6__1 ;
    public final void rule__AudioElement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1984:1: ( rule__AudioElement__Group_6__0__Impl rule__AudioElement__Group_6__1 )
            // InternalCinEditor.g:1985:2: rule__AudioElement__Group_6__0__Impl rule__AudioElement__Group_6__1
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
    // InternalCinEditor.g:1992:1: rule__AudioElement__Group_6__0__Impl : ( 'fadeOut' ) ;
    public final void rule__AudioElement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:1996:1: ( ( 'fadeOut' ) )
            // InternalCinEditor.g:1997:1: ( 'fadeOut' )
            {
            // InternalCinEditor.g:1997:1: ( 'fadeOut' )
            // InternalCinEditor.g:1998:2: 'fadeOut'
            {
             before(grammarAccess.getAudioElementAccess().getFadeOutKeyword_6_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCinEditor.g:2007:1: rule__AudioElement__Group_6__1 : rule__AudioElement__Group_6__1__Impl ;
    public final void rule__AudioElement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2011:1: ( rule__AudioElement__Group_6__1__Impl )
            // InternalCinEditor.g:2012:2: rule__AudioElement__Group_6__1__Impl
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
    // InternalCinEditor.g:2018:1: rule__AudioElement__Group_6__1__Impl : ( ( rule__AudioElement__FadeOutAssignment_6_1 ) ) ;
    public final void rule__AudioElement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2022:1: ( ( ( rule__AudioElement__FadeOutAssignment_6_1 ) ) )
            // InternalCinEditor.g:2023:1: ( ( rule__AudioElement__FadeOutAssignment_6_1 ) )
            {
            // InternalCinEditor.g:2023:1: ( ( rule__AudioElement__FadeOutAssignment_6_1 ) )
            // InternalCinEditor.g:2024:2: ( rule__AudioElement__FadeOutAssignment_6_1 )
            {
             before(grammarAccess.getAudioElementAccess().getFadeOutAssignment_6_1()); 
            // InternalCinEditor.g:2025:2: ( rule__AudioElement__FadeOutAssignment_6_1 )
            // InternalCinEditor.g:2025:3: rule__AudioElement__FadeOutAssignment_6_1
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
    // InternalCinEditor.g:2034:1: rule__AudioElement__Group_7__0 : rule__AudioElement__Group_7__0__Impl rule__AudioElement__Group_7__1 ;
    public final void rule__AudioElement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2038:1: ( rule__AudioElement__Group_7__0__Impl rule__AudioElement__Group_7__1 )
            // InternalCinEditor.g:2039:2: rule__AudioElement__Group_7__0__Impl rule__AudioElement__Group_7__1
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
    // InternalCinEditor.g:2046:1: rule__AudioElement__Group_7__0__Impl : ( 'at' ) ;
    public final void rule__AudioElement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2050:1: ( ( 'at' ) )
            // InternalCinEditor.g:2051:1: ( 'at' )
            {
            // InternalCinEditor.g:2051:1: ( 'at' )
            // InternalCinEditor.g:2052:2: 'at'
            {
             before(grammarAccess.getAudioElementAccess().getAtKeyword_7_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getAtKeyword_7_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:2061:1: rule__AudioElement__Group_7__1 : rule__AudioElement__Group_7__1__Impl ;
    public final void rule__AudioElement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2065:1: ( rule__AudioElement__Group_7__1__Impl )
            // InternalCinEditor.g:2066:2: rule__AudioElement__Group_7__1__Impl
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
    // InternalCinEditor.g:2072:1: rule__AudioElement__Group_7__1__Impl : ( ( rule__AudioElement__BeginTimeAssignment_7_1 ) ) ;
    public final void rule__AudioElement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2076:1: ( ( ( rule__AudioElement__BeginTimeAssignment_7_1 ) ) )
            // InternalCinEditor.g:2077:1: ( ( rule__AudioElement__BeginTimeAssignment_7_1 ) )
            {
            // InternalCinEditor.g:2077:1: ( ( rule__AudioElement__BeginTimeAssignment_7_1 ) )
            // InternalCinEditor.g:2078:2: ( rule__AudioElement__BeginTimeAssignment_7_1 )
            {
             before(grammarAccess.getAudioElementAccess().getBeginTimeAssignment_7_1()); 
            // InternalCinEditor.g:2079:2: ( rule__AudioElement__BeginTimeAssignment_7_1 )
            // InternalCinEditor.g:2079:3: rule__AudioElement__BeginTimeAssignment_7_1
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
    // InternalCinEditor.g:2088:1: rule__AudioElement__Group_8__0 : rule__AudioElement__Group_8__0__Impl rule__AudioElement__Group_8__1 ;
    public final void rule__AudioElement__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2092:1: ( rule__AudioElement__Group_8__0__Impl rule__AudioElement__Group_8__1 )
            // InternalCinEditor.g:2093:2: rule__AudioElement__Group_8__0__Impl rule__AudioElement__Group_8__1
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
    // InternalCinEditor.g:2100:1: rule__AudioElement__Group_8__0__Impl : ( 'during' ) ;
    public final void rule__AudioElement__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2104:1: ( ( 'during' ) )
            // InternalCinEditor.g:2105:1: ( 'during' )
            {
            // InternalCinEditor.g:2105:1: ( 'during' )
            // InternalCinEditor.g:2106:2: 'during'
            {
             before(grammarAccess.getAudioElementAccess().getDuringKeyword_8_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getDuringKeyword_8_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:2115:1: rule__AudioElement__Group_8__1 : rule__AudioElement__Group_8__1__Impl ;
    public final void rule__AudioElement__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2119:1: ( rule__AudioElement__Group_8__1__Impl )
            // InternalCinEditor.g:2120:2: rule__AudioElement__Group_8__1__Impl
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
    // InternalCinEditor.g:2126:1: rule__AudioElement__Group_8__1__Impl : ( ( rule__AudioElement__DurationAssignment_8_1 ) ) ;
    public final void rule__AudioElement__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2130:1: ( ( ( rule__AudioElement__DurationAssignment_8_1 ) ) )
            // InternalCinEditor.g:2131:1: ( ( rule__AudioElement__DurationAssignment_8_1 ) )
            {
            // InternalCinEditor.g:2131:1: ( ( rule__AudioElement__DurationAssignment_8_1 ) )
            // InternalCinEditor.g:2132:2: ( rule__AudioElement__DurationAssignment_8_1 )
            {
             before(grammarAccess.getAudioElementAccess().getDurationAssignment_8_1()); 
            // InternalCinEditor.g:2133:2: ( rule__AudioElement__DurationAssignment_8_1 )
            // InternalCinEditor.g:2133:3: rule__AudioElement__DurationAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__DurationAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getDurationAssignment_8_1()); 

            }


            }

        }
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
    // InternalCinEditor.g:2142:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2146:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalCinEditor.g:2147:2: rule__Text__Group__0__Impl rule__Text__Group__1
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
    // InternalCinEditor.g:2154:1: rule__Text__Group__0__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2158:1: ( ( 'Text' ) )
            // InternalCinEditor.g:2159:1: ( 'Text' )
            {
            // InternalCinEditor.g:2159:1: ( 'Text' )
            // InternalCinEditor.g:2160:2: 'Text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCinEditor.g:2169:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2173:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalCinEditor.g:2174:2: rule__Text__Group__1__Impl rule__Text__Group__2
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
    // InternalCinEditor.g:2181:1: rule__Text__Group__1__Impl : ( ( rule__Text__NameAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2185:1: ( ( ( rule__Text__NameAssignment_1 ) ) )
            // InternalCinEditor.g:2186:1: ( ( rule__Text__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:2186:1: ( ( rule__Text__NameAssignment_1 ) )
            // InternalCinEditor.g:2187:2: ( rule__Text__NameAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:2188:2: ( rule__Text__NameAssignment_1 )
            // InternalCinEditor.g:2188:3: rule__Text__NameAssignment_1
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
    // InternalCinEditor.g:2196:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2200:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalCinEditor.g:2201:2: rule__Text__Group__2__Impl rule__Text__Group__3
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
    // InternalCinEditor.g:2208:1: rule__Text__Group__2__Impl : ( '=' ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2212:1: ( ( '=' ) )
            // InternalCinEditor.g:2213:1: ( '=' )
            {
            // InternalCinEditor.g:2213:1: ( '=' )
            // InternalCinEditor.g:2214:2: '='
            {
             before(grammarAccess.getTextAccess().getEqualsSignKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCinEditor.g:2223:1: rule__Text__Group__3 : rule__Text__Group__3__Impl rule__Text__Group__4 ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2227:1: ( rule__Text__Group__3__Impl rule__Text__Group__4 )
            // InternalCinEditor.g:2228:2: rule__Text__Group__3__Impl rule__Text__Group__4
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
    // InternalCinEditor.g:2235:1: rule__Text__Group__3__Impl : ( ( rule__Text__TextAssignment_3 ) ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2239:1: ( ( ( rule__Text__TextAssignment_3 ) ) )
            // InternalCinEditor.g:2240:1: ( ( rule__Text__TextAssignment_3 ) )
            {
            // InternalCinEditor.g:2240:1: ( ( rule__Text__TextAssignment_3 ) )
            // InternalCinEditor.g:2241:2: ( rule__Text__TextAssignment_3 )
            {
             before(grammarAccess.getTextAccess().getTextAssignment_3()); 
            // InternalCinEditor.g:2242:2: ( rule__Text__TextAssignment_3 )
            // InternalCinEditor.g:2242:3: rule__Text__TextAssignment_3
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
    // InternalCinEditor.g:2250:1: rule__Text__Group__4 : rule__Text__Group__4__Impl rule__Text__Group__5 ;
    public final void rule__Text__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2254:1: ( rule__Text__Group__4__Impl rule__Text__Group__5 )
            // InternalCinEditor.g:2255:2: rule__Text__Group__4__Impl rule__Text__Group__5
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
    // InternalCinEditor.g:2262:1: rule__Text__Group__4__Impl : ( ( rule__Text__Group_4__0 )? ) ;
    public final void rule__Text__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2266:1: ( ( ( rule__Text__Group_4__0 )? ) )
            // InternalCinEditor.g:2267:1: ( ( rule__Text__Group_4__0 )? )
            {
            // InternalCinEditor.g:2267:1: ( ( rule__Text__Group_4__0 )? )
            // InternalCinEditor.g:2268:2: ( rule__Text__Group_4__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_4()); 
            // InternalCinEditor.g:2269:2: ( rule__Text__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCinEditor.g:2269:3: rule__Text__Group_4__0
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
    // InternalCinEditor.g:2277:1: rule__Text__Group__5 : rule__Text__Group__5__Impl rule__Text__Group__6 ;
    public final void rule__Text__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2281:1: ( rule__Text__Group__5__Impl rule__Text__Group__6 )
            // InternalCinEditor.g:2282:2: rule__Text__Group__5__Impl rule__Text__Group__6
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
    // InternalCinEditor.g:2289:1: rule__Text__Group__5__Impl : ( ( rule__Text__PositionAssignment_5 )? ) ;
    public final void rule__Text__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2293:1: ( ( ( rule__Text__PositionAssignment_5 )? ) )
            // InternalCinEditor.g:2294:1: ( ( rule__Text__PositionAssignment_5 )? )
            {
            // InternalCinEditor.g:2294:1: ( ( rule__Text__PositionAssignment_5 )? )
            // InternalCinEditor.g:2295:2: ( rule__Text__PositionAssignment_5 )?
            {
             before(grammarAccess.getTextAccess().getPositionAssignment_5()); 
            // InternalCinEditor.g:2296:2: ( rule__Text__PositionAssignment_5 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCinEditor.g:2296:3: rule__Text__PositionAssignment_5
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
    // InternalCinEditor.g:2304:1: rule__Text__Group__6 : rule__Text__Group__6__Impl rule__Text__Group__7 ;
    public final void rule__Text__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2308:1: ( rule__Text__Group__6__Impl rule__Text__Group__7 )
            // InternalCinEditor.g:2309:2: rule__Text__Group__6__Impl rule__Text__Group__7
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
    // InternalCinEditor.g:2316:1: rule__Text__Group__6__Impl : ( ( rule__Text__Group_6__0 )? ) ;
    public final void rule__Text__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2320:1: ( ( ( rule__Text__Group_6__0 )? ) )
            // InternalCinEditor.g:2321:1: ( ( rule__Text__Group_6__0 )? )
            {
            // InternalCinEditor.g:2321:1: ( ( rule__Text__Group_6__0 )? )
            // InternalCinEditor.g:2322:2: ( rule__Text__Group_6__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_6()); 
            // InternalCinEditor.g:2323:2: ( rule__Text__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCinEditor.g:2323:3: rule__Text__Group_6__0
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
    // InternalCinEditor.g:2331:1: rule__Text__Group__7 : rule__Text__Group__7__Impl rule__Text__Group__8 ;
    public final void rule__Text__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2335:1: ( rule__Text__Group__7__Impl rule__Text__Group__8 )
            // InternalCinEditor.g:2336:2: rule__Text__Group__7__Impl rule__Text__Group__8
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
    // InternalCinEditor.g:2343:1: rule__Text__Group__7__Impl : ( ( rule__Text__Group_7__0 )? ) ;
    public final void rule__Text__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2347:1: ( ( ( rule__Text__Group_7__0 )? ) )
            // InternalCinEditor.g:2348:1: ( ( rule__Text__Group_7__0 )? )
            {
            // InternalCinEditor.g:2348:1: ( ( rule__Text__Group_7__0 )? )
            // InternalCinEditor.g:2349:2: ( rule__Text__Group_7__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_7()); 
            // InternalCinEditor.g:2350:2: ( rule__Text__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCinEditor.g:2350:3: rule__Text__Group_7__0
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
    // InternalCinEditor.g:2358:1: rule__Text__Group__8 : rule__Text__Group__8__Impl ;
    public final void rule__Text__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2362:1: ( rule__Text__Group__8__Impl )
            // InternalCinEditor.g:2363:2: rule__Text__Group__8__Impl
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
    // InternalCinEditor.g:2369:1: rule__Text__Group__8__Impl : ( ( rule__Text__ColorAssignment_8 ) ) ;
    public final void rule__Text__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2373:1: ( ( ( rule__Text__ColorAssignment_8 ) ) )
            // InternalCinEditor.g:2374:1: ( ( rule__Text__ColorAssignment_8 ) )
            {
            // InternalCinEditor.g:2374:1: ( ( rule__Text__ColorAssignment_8 ) )
            // InternalCinEditor.g:2375:2: ( rule__Text__ColorAssignment_8 )
            {
             before(grammarAccess.getTextAccess().getColorAssignment_8()); 
            // InternalCinEditor.g:2376:2: ( rule__Text__ColorAssignment_8 )
            // InternalCinEditor.g:2376:3: rule__Text__ColorAssignment_8
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
    // InternalCinEditor.g:2385:1: rule__Text__Group_4__0 : rule__Text__Group_4__0__Impl rule__Text__Group_4__1 ;
    public final void rule__Text__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2389:1: ( rule__Text__Group_4__0__Impl rule__Text__Group_4__1 )
            // InternalCinEditor.g:2390:2: rule__Text__Group_4__0__Impl rule__Text__Group_4__1
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
    // InternalCinEditor.g:2397:1: rule__Text__Group_4__0__Impl : ( 'fontSize' ) ;
    public final void rule__Text__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2401:1: ( ( 'fontSize' ) )
            // InternalCinEditor.g:2402:1: ( 'fontSize' )
            {
            // InternalCinEditor.g:2402:1: ( 'fontSize' )
            // InternalCinEditor.g:2403:2: 'fontSize'
            {
             before(grammarAccess.getTextAccess().getFontSizeKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCinEditor.g:2412:1: rule__Text__Group_4__1 : rule__Text__Group_4__1__Impl ;
    public final void rule__Text__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2416:1: ( rule__Text__Group_4__1__Impl )
            // InternalCinEditor.g:2417:2: rule__Text__Group_4__1__Impl
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
    // InternalCinEditor.g:2423:1: rule__Text__Group_4__1__Impl : ( ( rule__Text__FontSizeAssignment_4_1 ) ) ;
    public final void rule__Text__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2427:1: ( ( ( rule__Text__FontSizeAssignment_4_1 ) ) )
            // InternalCinEditor.g:2428:1: ( ( rule__Text__FontSizeAssignment_4_1 ) )
            {
            // InternalCinEditor.g:2428:1: ( ( rule__Text__FontSizeAssignment_4_1 ) )
            // InternalCinEditor.g:2429:2: ( rule__Text__FontSizeAssignment_4_1 )
            {
             before(grammarAccess.getTextAccess().getFontSizeAssignment_4_1()); 
            // InternalCinEditor.g:2430:2: ( rule__Text__FontSizeAssignment_4_1 )
            // InternalCinEditor.g:2430:3: rule__Text__FontSizeAssignment_4_1
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
    // InternalCinEditor.g:2439:1: rule__Text__Group_6__0 : rule__Text__Group_6__0__Impl rule__Text__Group_6__1 ;
    public final void rule__Text__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2443:1: ( rule__Text__Group_6__0__Impl rule__Text__Group_6__1 )
            // InternalCinEditor.g:2444:2: rule__Text__Group_6__0__Impl rule__Text__Group_6__1
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
    // InternalCinEditor.g:2451:1: rule__Text__Group_6__0__Impl : ( 'at' ) ;
    public final void rule__Text__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2455:1: ( ( 'at' ) )
            // InternalCinEditor.g:2456:1: ( 'at' )
            {
            // InternalCinEditor.g:2456:1: ( 'at' )
            // InternalCinEditor.g:2457:2: 'at'
            {
             before(grammarAccess.getTextAccess().getAtKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getAtKeyword_6_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:2466:1: rule__Text__Group_6__1 : rule__Text__Group_6__1__Impl ;
    public final void rule__Text__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2470:1: ( rule__Text__Group_6__1__Impl )
            // InternalCinEditor.g:2471:2: rule__Text__Group_6__1__Impl
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
    // InternalCinEditor.g:2477:1: rule__Text__Group_6__1__Impl : ( ( rule__Text__BeginTimeAssignment_6_1 ) ) ;
    public final void rule__Text__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2481:1: ( ( ( rule__Text__BeginTimeAssignment_6_1 ) ) )
            // InternalCinEditor.g:2482:1: ( ( rule__Text__BeginTimeAssignment_6_1 ) )
            {
            // InternalCinEditor.g:2482:1: ( ( rule__Text__BeginTimeAssignment_6_1 ) )
            // InternalCinEditor.g:2483:2: ( rule__Text__BeginTimeAssignment_6_1 )
            {
             before(grammarAccess.getTextAccess().getBeginTimeAssignment_6_1()); 
            // InternalCinEditor.g:2484:2: ( rule__Text__BeginTimeAssignment_6_1 )
            // InternalCinEditor.g:2484:3: rule__Text__BeginTimeAssignment_6_1
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
    // InternalCinEditor.g:2493:1: rule__Text__Group_7__0 : rule__Text__Group_7__0__Impl rule__Text__Group_7__1 ;
    public final void rule__Text__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2497:1: ( rule__Text__Group_7__0__Impl rule__Text__Group_7__1 )
            // InternalCinEditor.g:2498:2: rule__Text__Group_7__0__Impl rule__Text__Group_7__1
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
    // InternalCinEditor.g:2505:1: rule__Text__Group_7__0__Impl : ( 'during' ) ;
    public final void rule__Text__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2509:1: ( ( 'during' ) )
            // InternalCinEditor.g:2510:1: ( 'during' )
            {
            // InternalCinEditor.g:2510:1: ( 'during' )
            // InternalCinEditor.g:2511:2: 'during'
            {
             before(grammarAccess.getTextAccess().getDuringKeyword_7_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCinEditor.g:2520:1: rule__Text__Group_7__1 : rule__Text__Group_7__1__Impl ;
    public final void rule__Text__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2524:1: ( rule__Text__Group_7__1__Impl )
            // InternalCinEditor.g:2525:2: rule__Text__Group_7__1__Impl
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
    // InternalCinEditor.g:2531:1: rule__Text__Group_7__1__Impl : ( ( rule__Text__DurationAssignment_7_1 ) ) ;
    public final void rule__Text__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2535:1: ( ( ( rule__Text__DurationAssignment_7_1 ) ) )
            // InternalCinEditor.g:2536:1: ( ( rule__Text__DurationAssignment_7_1 ) )
            {
            // InternalCinEditor.g:2536:1: ( ( rule__Text__DurationAssignment_7_1 ) )
            // InternalCinEditor.g:2537:2: ( rule__Text__DurationAssignment_7_1 )
            {
             before(grammarAccess.getTextAccess().getDurationAssignment_7_1()); 
            // InternalCinEditor.g:2538:2: ( rule__Text__DurationAssignment_7_1 )
            // InternalCinEditor.g:2538:3: rule__Text__DurationAssignment_7_1
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
    // InternalCinEditor.g:2547:1: rule__Picture__Group__0 : rule__Picture__Group__0__Impl rule__Picture__Group__1 ;
    public final void rule__Picture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2551:1: ( rule__Picture__Group__0__Impl rule__Picture__Group__1 )
            // InternalCinEditor.g:2552:2: rule__Picture__Group__0__Impl rule__Picture__Group__1
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
    // InternalCinEditor.g:2559:1: rule__Picture__Group__0__Impl : ( 'Picture' ) ;
    public final void rule__Picture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2563:1: ( ( 'Picture' ) )
            // InternalCinEditor.g:2564:1: ( 'Picture' )
            {
            // InternalCinEditor.g:2564:1: ( 'Picture' )
            // InternalCinEditor.g:2565:2: 'Picture'
            {
             before(grammarAccess.getPictureAccess().getPictureKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCinEditor.g:2574:1: rule__Picture__Group__1 : rule__Picture__Group__1__Impl rule__Picture__Group__2 ;
    public final void rule__Picture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2578:1: ( rule__Picture__Group__1__Impl rule__Picture__Group__2 )
            // InternalCinEditor.g:2579:2: rule__Picture__Group__1__Impl rule__Picture__Group__2
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
    // InternalCinEditor.g:2586:1: rule__Picture__Group__1__Impl : ( ( rule__Picture__NameAssignment_1 ) ) ;
    public final void rule__Picture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2590:1: ( ( ( rule__Picture__NameAssignment_1 ) ) )
            // InternalCinEditor.g:2591:1: ( ( rule__Picture__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:2591:1: ( ( rule__Picture__NameAssignment_1 ) )
            // InternalCinEditor.g:2592:2: ( rule__Picture__NameAssignment_1 )
            {
             before(grammarAccess.getPictureAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:2593:2: ( rule__Picture__NameAssignment_1 )
            // InternalCinEditor.g:2593:3: rule__Picture__NameAssignment_1
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
    // InternalCinEditor.g:2601:1: rule__Picture__Group__2 : rule__Picture__Group__2__Impl rule__Picture__Group__3 ;
    public final void rule__Picture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2605:1: ( rule__Picture__Group__2__Impl rule__Picture__Group__3 )
            // InternalCinEditor.g:2606:2: rule__Picture__Group__2__Impl rule__Picture__Group__3
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
    // InternalCinEditor.g:2613:1: rule__Picture__Group__2__Impl : ( '=' ) ;
    public final void rule__Picture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2617:1: ( ( '=' ) )
            // InternalCinEditor.g:2618:1: ( '=' )
            {
            // InternalCinEditor.g:2618:1: ( '=' )
            // InternalCinEditor.g:2619:2: '='
            {
             before(grammarAccess.getPictureAccess().getEqualsSignKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCinEditor.g:2628:1: rule__Picture__Group__3 : rule__Picture__Group__3__Impl rule__Picture__Group__4 ;
    public final void rule__Picture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2632:1: ( rule__Picture__Group__3__Impl rule__Picture__Group__4 )
            // InternalCinEditor.g:2633:2: rule__Picture__Group__3__Impl rule__Picture__Group__4
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
    // InternalCinEditor.g:2640:1: rule__Picture__Group__3__Impl : ( ( rule__Picture__UrlAssignment_3 ) ) ;
    public final void rule__Picture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2644:1: ( ( ( rule__Picture__UrlAssignment_3 ) ) )
            // InternalCinEditor.g:2645:1: ( ( rule__Picture__UrlAssignment_3 ) )
            {
            // InternalCinEditor.g:2645:1: ( ( rule__Picture__UrlAssignment_3 ) )
            // InternalCinEditor.g:2646:2: ( rule__Picture__UrlAssignment_3 )
            {
             before(grammarAccess.getPictureAccess().getUrlAssignment_3()); 
            // InternalCinEditor.g:2647:2: ( rule__Picture__UrlAssignment_3 )
            // InternalCinEditor.g:2647:3: rule__Picture__UrlAssignment_3
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
    // InternalCinEditor.g:2655:1: rule__Picture__Group__4 : rule__Picture__Group__4__Impl rule__Picture__Group__5 ;
    public final void rule__Picture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2659:1: ( rule__Picture__Group__4__Impl rule__Picture__Group__5 )
            // InternalCinEditor.g:2660:2: rule__Picture__Group__4__Impl rule__Picture__Group__5
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
    // InternalCinEditor.g:2667:1: rule__Picture__Group__4__Impl : ( ( rule__Picture__PositionAssignment_4 )? ) ;
    public final void rule__Picture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2671:1: ( ( ( rule__Picture__PositionAssignment_4 )? ) )
            // InternalCinEditor.g:2672:1: ( ( rule__Picture__PositionAssignment_4 )? )
            {
            // InternalCinEditor.g:2672:1: ( ( rule__Picture__PositionAssignment_4 )? )
            // InternalCinEditor.g:2673:2: ( rule__Picture__PositionAssignment_4 )?
            {
             before(grammarAccess.getPictureAccess().getPositionAssignment_4()); 
            // InternalCinEditor.g:2674:2: ( rule__Picture__PositionAssignment_4 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCinEditor.g:2674:3: rule__Picture__PositionAssignment_4
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
    // InternalCinEditor.g:2682:1: rule__Picture__Group__5 : rule__Picture__Group__5__Impl rule__Picture__Group__6 ;
    public final void rule__Picture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2686:1: ( rule__Picture__Group__5__Impl rule__Picture__Group__6 )
            // InternalCinEditor.g:2687:2: rule__Picture__Group__5__Impl rule__Picture__Group__6
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
    // InternalCinEditor.g:2694:1: rule__Picture__Group__5__Impl : ( ( rule__Picture__DimensionAssignment_5 )? ) ;
    public final void rule__Picture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2698:1: ( ( ( rule__Picture__DimensionAssignment_5 )? ) )
            // InternalCinEditor.g:2699:1: ( ( rule__Picture__DimensionAssignment_5 )? )
            {
            // InternalCinEditor.g:2699:1: ( ( rule__Picture__DimensionAssignment_5 )? )
            // InternalCinEditor.g:2700:2: ( rule__Picture__DimensionAssignment_5 )?
            {
             before(grammarAccess.getPictureAccess().getDimensionAssignment_5()); 
            // InternalCinEditor.g:2701:2: ( rule__Picture__DimensionAssignment_5 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCinEditor.g:2701:3: rule__Picture__DimensionAssignment_5
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
    // InternalCinEditor.g:2709:1: rule__Picture__Group__6 : rule__Picture__Group__6__Impl rule__Picture__Group__7 ;
    public final void rule__Picture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2713:1: ( rule__Picture__Group__6__Impl rule__Picture__Group__7 )
            // InternalCinEditor.g:2714:2: rule__Picture__Group__6__Impl rule__Picture__Group__7
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
    // InternalCinEditor.g:2721:1: rule__Picture__Group__6__Impl : ( ( rule__Picture__Group_6__0 )? ) ;
    public final void rule__Picture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2725:1: ( ( ( rule__Picture__Group_6__0 )? ) )
            // InternalCinEditor.g:2726:1: ( ( rule__Picture__Group_6__0 )? )
            {
            // InternalCinEditor.g:2726:1: ( ( rule__Picture__Group_6__0 )? )
            // InternalCinEditor.g:2727:2: ( rule__Picture__Group_6__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_6()); 
            // InternalCinEditor.g:2728:2: ( rule__Picture__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCinEditor.g:2728:3: rule__Picture__Group_6__0
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
    // InternalCinEditor.g:2736:1: rule__Picture__Group__7 : rule__Picture__Group__7__Impl ;
    public final void rule__Picture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2740:1: ( rule__Picture__Group__7__Impl )
            // InternalCinEditor.g:2741:2: rule__Picture__Group__7__Impl
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
    // InternalCinEditor.g:2747:1: rule__Picture__Group__7__Impl : ( ( rule__Picture__Group_7__0 )? ) ;
    public final void rule__Picture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2751:1: ( ( ( rule__Picture__Group_7__0 )? ) )
            // InternalCinEditor.g:2752:1: ( ( rule__Picture__Group_7__0 )? )
            {
            // InternalCinEditor.g:2752:1: ( ( rule__Picture__Group_7__0 )? )
            // InternalCinEditor.g:2753:2: ( rule__Picture__Group_7__0 )?
            {
             before(grammarAccess.getPictureAccess().getGroup_7()); 
            // InternalCinEditor.g:2754:2: ( rule__Picture__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCinEditor.g:2754:3: rule__Picture__Group_7__0
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
    // InternalCinEditor.g:2763:1: rule__Picture__Group_6__0 : rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1 ;
    public final void rule__Picture__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2767:1: ( rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1 )
            // InternalCinEditor.g:2768:2: rule__Picture__Group_6__0__Impl rule__Picture__Group_6__1
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
    // InternalCinEditor.g:2775:1: rule__Picture__Group_6__0__Impl : ( 'at' ) ;
    public final void rule__Picture__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2779:1: ( ( 'at' ) )
            // InternalCinEditor.g:2780:1: ( 'at' )
            {
            // InternalCinEditor.g:2780:1: ( 'at' )
            // InternalCinEditor.g:2781:2: 'at'
            {
             before(grammarAccess.getPictureAccess().getAtKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPictureAccess().getAtKeyword_6_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:2790:1: rule__Picture__Group_6__1 : rule__Picture__Group_6__1__Impl ;
    public final void rule__Picture__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2794:1: ( rule__Picture__Group_6__1__Impl )
            // InternalCinEditor.g:2795:2: rule__Picture__Group_6__1__Impl
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
    // InternalCinEditor.g:2801:1: rule__Picture__Group_6__1__Impl : ( ( rule__Picture__BeginTimeAssignment_6_1 ) ) ;
    public final void rule__Picture__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2805:1: ( ( ( rule__Picture__BeginTimeAssignment_6_1 ) ) )
            // InternalCinEditor.g:2806:1: ( ( rule__Picture__BeginTimeAssignment_6_1 ) )
            {
            // InternalCinEditor.g:2806:1: ( ( rule__Picture__BeginTimeAssignment_6_1 ) )
            // InternalCinEditor.g:2807:2: ( rule__Picture__BeginTimeAssignment_6_1 )
            {
             before(grammarAccess.getPictureAccess().getBeginTimeAssignment_6_1()); 
            // InternalCinEditor.g:2808:2: ( rule__Picture__BeginTimeAssignment_6_1 )
            // InternalCinEditor.g:2808:3: rule__Picture__BeginTimeAssignment_6_1
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
    // InternalCinEditor.g:2817:1: rule__Picture__Group_7__0 : rule__Picture__Group_7__0__Impl rule__Picture__Group_7__1 ;
    public final void rule__Picture__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2821:1: ( rule__Picture__Group_7__0__Impl rule__Picture__Group_7__1 )
            // InternalCinEditor.g:2822:2: rule__Picture__Group_7__0__Impl rule__Picture__Group_7__1
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
    // InternalCinEditor.g:2829:1: rule__Picture__Group_7__0__Impl : ( 'during' ) ;
    public final void rule__Picture__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2833:1: ( ( 'during' ) )
            // InternalCinEditor.g:2834:1: ( 'during' )
            {
            // InternalCinEditor.g:2834:1: ( 'during' )
            // InternalCinEditor.g:2835:2: 'during'
            {
             before(grammarAccess.getPictureAccess().getDuringKeyword_7_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCinEditor.g:2844:1: rule__Picture__Group_7__1 : rule__Picture__Group_7__1__Impl ;
    public final void rule__Picture__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2848:1: ( rule__Picture__Group_7__1__Impl )
            // InternalCinEditor.g:2849:2: rule__Picture__Group_7__1__Impl
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
    // InternalCinEditor.g:2855:1: rule__Picture__Group_7__1__Impl : ( ( rule__Picture__DurationAssignment_7_1 ) ) ;
    public final void rule__Picture__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2859:1: ( ( ( rule__Picture__DurationAssignment_7_1 ) ) )
            // InternalCinEditor.g:2860:1: ( ( rule__Picture__DurationAssignment_7_1 ) )
            {
            // InternalCinEditor.g:2860:1: ( ( rule__Picture__DurationAssignment_7_1 ) )
            // InternalCinEditor.g:2861:2: ( rule__Picture__DurationAssignment_7_1 )
            {
             before(grammarAccess.getPictureAccess().getDurationAssignment_7_1()); 
            // InternalCinEditor.g:2862:2: ( rule__Picture__DurationAssignment_7_1 )
            // InternalCinEditor.g:2862:3: rule__Picture__DurationAssignment_7_1
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
    // InternalCinEditor.g:2871:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2875:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalCinEditor.g:2876:2: rule__Video__Group__0__Impl rule__Video__Group__1
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
    // InternalCinEditor.g:2883:1: rule__Video__Group__0__Impl : ( 'Video' ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2887:1: ( ( 'Video' ) )
            // InternalCinEditor.g:2888:1: ( 'Video' )
            {
            // InternalCinEditor.g:2888:1: ( 'Video' )
            // InternalCinEditor.g:2889:2: 'Video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalCinEditor.g:2898:1: rule__Video__Group__1 : rule__Video__Group__1__Impl rule__Video__Group__2 ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2902:1: ( rule__Video__Group__1__Impl rule__Video__Group__2 )
            // InternalCinEditor.g:2903:2: rule__Video__Group__1__Impl rule__Video__Group__2
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
    // InternalCinEditor.g:2910:1: rule__Video__Group__1__Impl : ( ( rule__Video__NameAssignment_1 ) ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2914:1: ( ( ( rule__Video__NameAssignment_1 ) ) )
            // InternalCinEditor.g:2915:1: ( ( rule__Video__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:2915:1: ( ( rule__Video__NameAssignment_1 ) )
            // InternalCinEditor.g:2916:2: ( rule__Video__NameAssignment_1 )
            {
             before(grammarAccess.getVideoAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:2917:2: ( rule__Video__NameAssignment_1 )
            // InternalCinEditor.g:2917:3: rule__Video__NameAssignment_1
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
    // InternalCinEditor.g:2925:1: rule__Video__Group__2 : rule__Video__Group__2__Impl rule__Video__Group__3 ;
    public final void rule__Video__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2929:1: ( rule__Video__Group__2__Impl rule__Video__Group__3 )
            // InternalCinEditor.g:2930:2: rule__Video__Group__2__Impl rule__Video__Group__3
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
    // InternalCinEditor.g:2937:1: rule__Video__Group__2__Impl : ( '=' ) ;
    public final void rule__Video__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2941:1: ( ( '=' ) )
            // InternalCinEditor.g:2942:1: ( '=' )
            {
            // InternalCinEditor.g:2942:1: ( '=' )
            // InternalCinEditor.g:2943:2: '='
            {
             before(grammarAccess.getVideoAccess().getEqualsSignKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCinEditor.g:2952:1: rule__Video__Group__3 : rule__Video__Group__3__Impl rule__Video__Group__4 ;
    public final void rule__Video__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2956:1: ( rule__Video__Group__3__Impl rule__Video__Group__4 )
            // InternalCinEditor.g:2957:2: rule__Video__Group__3__Impl rule__Video__Group__4
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
    // InternalCinEditor.g:2964:1: rule__Video__Group__3__Impl : ( ( rule__Video__UrlAssignment_3 ) ) ;
    public final void rule__Video__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2968:1: ( ( ( rule__Video__UrlAssignment_3 ) ) )
            // InternalCinEditor.g:2969:1: ( ( rule__Video__UrlAssignment_3 ) )
            {
            // InternalCinEditor.g:2969:1: ( ( rule__Video__UrlAssignment_3 ) )
            // InternalCinEditor.g:2970:2: ( rule__Video__UrlAssignment_3 )
            {
             before(grammarAccess.getVideoAccess().getUrlAssignment_3()); 
            // InternalCinEditor.g:2971:2: ( rule__Video__UrlAssignment_3 )
            // InternalCinEditor.g:2971:3: rule__Video__UrlAssignment_3
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
    // InternalCinEditor.g:2979:1: rule__Video__Group__4 : rule__Video__Group__4__Impl rule__Video__Group__5 ;
    public final void rule__Video__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2983:1: ( rule__Video__Group__4__Impl rule__Video__Group__5 )
            // InternalCinEditor.g:2984:2: rule__Video__Group__4__Impl rule__Video__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalCinEditor.g:2991:1: rule__Video__Group__4__Impl : ( 'from' ) ;
    public final void rule__Video__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:2995:1: ( ( 'from' ) )
            // InternalCinEditor.g:2996:1: ( 'from' )
            {
            // InternalCinEditor.g:2996:1: ( 'from' )
            // InternalCinEditor.g:2997:2: 'from'
            {
             before(grammarAccess.getVideoAccess().getFromKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getFromKeyword_4()); 

            }


            }

        }
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
    // InternalCinEditor.g:3006:1: rule__Video__Group__5 : rule__Video__Group__5__Impl rule__Video__Group__6 ;
    public final void rule__Video__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3010:1: ( rule__Video__Group__5__Impl rule__Video__Group__6 )
            // InternalCinEditor.g:3011:2: rule__Video__Group__5__Impl rule__Video__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:3018:1: rule__Video__Group__5__Impl : ( ( rule__Video__BeginCropTimeAssignment_5 ) ) ;
    public final void rule__Video__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3022:1: ( ( ( rule__Video__BeginCropTimeAssignment_5 ) ) )
            // InternalCinEditor.g:3023:1: ( ( rule__Video__BeginCropTimeAssignment_5 ) )
            {
            // InternalCinEditor.g:3023:1: ( ( rule__Video__BeginCropTimeAssignment_5 ) )
            // InternalCinEditor.g:3024:2: ( rule__Video__BeginCropTimeAssignment_5 )
            {
             before(grammarAccess.getVideoAccess().getBeginCropTimeAssignment_5()); 
            // InternalCinEditor.g:3025:2: ( rule__Video__BeginCropTimeAssignment_5 )
            // InternalCinEditor.g:3025:3: rule__Video__BeginCropTimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Video__BeginCropTimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getBeginCropTimeAssignment_5()); 

            }


            }

        }
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
    // InternalCinEditor.g:3033:1: rule__Video__Group__6 : rule__Video__Group__6__Impl rule__Video__Group__7 ;
    public final void rule__Video__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3037:1: ( rule__Video__Group__6__Impl rule__Video__Group__7 )
            // InternalCinEditor.g:3038:2: rule__Video__Group__6__Impl rule__Video__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:3045:1: rule__Video__Group__6__Impl : ( ( rule__Video__PositionAssignment_6 )? ) ;
    public final void rule__Video__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3049:1: ( ( ( rule__Video__PositionAssignment_6 )? ) )
            // InternalCinEditor.g:3050:1: ( ( rule__Video__PositionAssignment_6 )? )
            {
            // InternalCinEditor.g:3050:1: ( ( rule__Video__PositionAssignment_6 )? )
            // InternalCinEditor.g:3051:2: ( rule__Video__PositionAssignment_6 )?
            {
             before(grammarAccess.getVideoAccess().getPositionAssignment_6()); 
            // InternalCinEditor.g:3052:2: ( rule__Video__PositionAssignment_6 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==21) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCinEditor.g:3052:3: rule__Video__PositionAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__PositionAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getPositionAssignment_6()); 

            }


            }

        }
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
    // InternalCinEditor.g:3060:1: rule__Video__Group__7 : rule__Video__Group__7__Impl rule__Video__Group__8 ;
    public final void rule__Video__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3064:1: ( rule__Video__Group__7__Impl rule__Video__Group__8 )
            // InternalCinEditor.g:3065:2: rule__Video__Group__7__Impl rule__Video__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:3072:1: rule__Video__Group__7__Impl : ( ( rule__Video__DimensionAssignment_7 )? ) ;
    public final void rule__Video__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3076:1: ( ( ( rule__Video__DimensionAssignment_7 )? ) )
            // InternalCinEditor.g:3077:1: ( ( rule__Video__DimensionAssignment_7 )? )
            {
            // InternalCinEditor.g:3077:1: ( ( rule__Video__DimensionAssignment_7 )? )
            // InternalCinEditor.g:3078:2: ( rule__Video__DimensionAssignment_7 )?
            {
             before(grammarAccess.getVideoAccess().getDimensionAssignment_7()); 
            // InternalCinEditor.g:3079:2: ( rule__Video__DimensionAssignment_7 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCinEditor.g:3079:3: rule__Video__DimensionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__DimensionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getDimensionAssignment_7()); 

            }


            }

        }
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
    // InternalCinEditor.g:3087:1: rule__Video__Group__8 : rule__Video__Group__8__Impl rule__Video__Group__9 ;
    public final void rule__Video__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3091:1: ( rule__Video__Group__8__Impl rule__Video__Group__9 )
            // InternalCinEditor.g:3092:2: rule__Video__Group__8__Impl rule__Video__Group__9
            {
            pushFollow(FOLLOW_21);
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
    // InternalCinEditor.g:3099:1: rule__Video__Group__8__Impl : ( ( rule__Video__Group_8__0 )? ) ;
    public final void rule__Video__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3103:1: ( ( ( rule__Video__Group_8__0 )? ) )
            // InternalCinEditor.g:3104:1: ( ( rule__Video__Group_8__0 )? )
            {
            // InternalCinEditor.g:3104:1: ( ( rule__Video__Group_8__0 )? )
            // InternalCinEditor.g:3105:2: ( rule__Video__Group_8__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_8()); 
            // InternalCinEditor.g:3106:2: ( rule__Video__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCinEditor.g:3106:3: rule__Video__Group_8__0
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
    // InternalCinEditor.g:3114:1: rule__Video__Group__9 : rule__Video__Group__9__Impl ;
    public final void rule__Video__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3118:1: ( rule__Video__Group__9__Impl )
            // InternalCinEditor.g:3119:2: rule__Video__Group__9__Impl
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
    // InternalCinEditor.g:3125:1: rule__Video__Group__9__Impl : ( ( rule__Video__Group_9__0 )? ) ;
    public final void rule__Video__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3129:1: ( ( ( rule__Video__Group_9__0 )? ) )
            // InternalCinEditor.g:3130:1: ( ( rule__Video__Group_9__0 )? )
            {
            // InternalCinEditor.g:3130:1: ( ( rule__Video__Group_9__0 )? )
            // InternalCinEditor.g:3131:2: ( rule__Video__Group_9__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_9()); 
            // InternalCinEditor.g:3132:2: ( rule__Video__Group_9__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCinEditor.g:3132:3: rule__Video__Group_9__0
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


    // $ANTLR start "rule__Video__Group_8__0"
    // InternalCinEditor.g:3141:1: rule__Video__Group_8__0 : rule__Video__Group_8__0__Impl rule__Video__Group_8__1 ;
    public final void rule__Video__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3145:1: ( rule__Video__Group_8__0__Impl rule__Video__Group_8__1 )
            // InternalCinEditor.g:3146:2: rule__Video__Group_8__0__Impl rule__Video__Group_8__1
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
    // InternalCinEditor.g:3153:1: rule__Video__Group_8__0__Impl : ( 'at' ) ;
    public final void rule__Video__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3157:1: ( ( 'at' ) )
            // InternalCinEditor.g:3158:1: ( 'at' )
            {
            // InternalCinEditor.g:3158:1: ( 'at' )
            // InternalCinEditor.g:3159:2: 'at'
            {
             before(grammarAccess.getVideoAccess().getAtKeyword_8_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getAtKeyword_8_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:3168:1: rule__Video__Group_8__1 : rule__Video__Group_8__1__Impl ;
    public final void rule__Video__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3172:1: ( rule__Video__Group_8__1__Impl )
            // InternalCinEditor.g:3173:2: rule__Video__Group_8__1__Impl
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
    // InternalCinEditor.g:3179:1: rule__Video__Group_8__1__Impl : ( ( rule__Video__BeginTimeAssignment_8_1 ) ) ;
    public final void rule__Video__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3183:1: ( ( ( rule__Video__BeginTimeAssignment_8_1 ) ) )
            // InternalCinEditor.g:3184:1: ( ( rule__Video__BeginTimeAssignment_8_1 ) )
            {
            // InternalCinEditor.g:3184:1: ( ( rule__Video__BeginTimeAssignment_8_1 ) )
            // InternalCinEditor.g:3185:2: ( rule__Video__BeginTimeAssignment_8_1 )
            {
             before(grammarAccess.getVideoAccess().getBeginTimeAssignment_8_1()); 
            // InternalCinEditor.g:3186:2: ( rule__Video__BeginTimeAssignment_8_1 )
            // InternalCinEditor.g:3186:3: rule__Video__BeginTimeAssignment_8_1
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
    // InternalCinEditor.g:3195:1: rule__Video__Group_9__0 : rule__Video__Group_9__0__Impl rule__Video__Group_9__1 ;
    public final void rule__Video__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3199:1: ( rule__Video__Group_9__0__Impl rule__Video__Group_9__1 )
            // InternalCinEditor.g:3200:2: rule__Video__Group_9__0__Impl rule__Video__Group_9__1
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
    // InternalCinEditor.g:3207:1: rule__Video__Group_9__0__Impl : ( 'during' ) ;
    public final void rule__Video__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3211:1: ( ( 'during' ) )
            // InternalCinEditor.g:3212:1: ( 'during' )
            {
            // InternalCinEditor.g:3212:1: ( 'during' )
            // InternalCinEditor.g:3213:2: 'during'
            {
             before(grammarAccess.getVideoAccess().getDuringKeyword_9_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCinEditor.g:3222:1: rule__Video__Group_9__1 : rule__Video__Group_9__1__Impl ;
    public final void rule__Video__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3226:1: ( rule__Video__Group_9__1__Impl )
            // InternalCinEditor.g:3227:2: rule__Video__Group_9__1__Impl
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
    // InternalCinEditor.g:3233:1: rule__Video__Group_9__1__Impl : ( ( rule__Video__DurationAssignment_9_1 ) ) ;
    public final void rule__Video__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3237:1: ( ( ( rule__Video__DurationAssignment_9_1 ) ) )
            // InternalCinEditor.g:3238:1: ( ( rule__Video__DurationAssignment_9_1 ) )
            {
            // InternalCinEditor.g:3238:1: ( ( rule__Video__DurationAssignment_9_1 ) )
            // InternalCinEditor.g:3239:2: ( rule__Video__DurationAssignment_9_1 )
            {
             before(grammarAccess.getVideoAccess().getDurationAssignment_9_1()); 
            // InternalCinEditor.g:3240:2: ( rule__Video__DurationAssignment_9_1 )
            // InternalCinEditor.g:3240:3: rule__Video__DurationAssignment_9_1
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
    // InternalCinEditor.g:3249:1: rule__Rectangle__Group__0 : rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 ;
    public final void rule__Rectangle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3253:1: ( rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 )
            // InternalCinEditor.g:3254:2: rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1
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
    // InternalCinEditor.g:3261:1: rule__Rectangle__Group__0__Impl : ( 'Rectangle' ) ;
    public final void rule__Rectangle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3265:1: ( ( 'Rectangle' ) )
            // InternalCinEditor.g:3266:1: ( 'Rectangle' )
            {
            // InternalCinEditor.g:3266:1: ( 'Rectangle' )
            // InternalCinEditor.g:3267:2: 'Rectangle'
            {
             before(grammarAccess.getRectangleAccess().getRectangleKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCinEditor.g:3276:1: rule__Rectangle__Group__1 : rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 ;
    public final void rule__Rectangle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3280:1: ( rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 )
            // InternalCinEditor.g:3281:2: rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2
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
    // InternalCinEditor.g:3288:1: rule__Rectangle__Group__1__Impl : ( ( rule__Rectangle__NameAssignment_1 ) ) ;
    public final void rule__Rectangle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3292:1: ( ( ( rule__Rectangle__NameAssignment_1 ) ) )
            // InternalCinEditor.g:3293:1: ( ( rule__Rectangle__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:3293:1: ( ( rule__Rectangle__NameAssignment_1 ) )
            // InternalCinEditor.g:3294:2: ( rule__Rectangle__NameAssignment_1 )
            {
             before(grammarAccess.getRectangleAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:3295:2: ( rule__Rectangle__NameAssignment_1 )
            // InternalCinEditor.g:3295:3: rule__Rectangle__NameAssignment_1
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
    // InternalCinEditor.g:3303:1: rule__Rectangle__Group__2 : rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 ;
    public final void rule__Rectangle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3307:1: ( rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3 )
            // InternalCinEditor.g:3308:2: rule__Rectangle__Group__2__Impl rule__Rectangle__Group__3
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
    // InternalCinEditor.g:3315:1: rule__Rectangle__Group__2__Impl : ( '=' ) ;
    public final void rule__Rectangle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3319:1: ( ( '=' ) )
            // InternalCinEditor.g:3320:1: ( '=' )
            {
            // InternalCinEditor.g:3320:1: ( '=' )
            // InternalCinEditor.g:3321:2: '='
            {
             before(grammarAccess.getRectangleAccess().getEqualsSignKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCinEditor.g:3330:1: rule__Rectangle__Group__3 : rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 ;
    public final void rule__Rectangle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3334:1: ( rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4 )
            // InternalCinEditor.g:3335:2: rule__Rectangle__Group__3__Impl rule__Rectangle__Group__4
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
    // InternalCinEditor.g:3342:1: rule__Rectangle__Group__3__Impl : ( ( rule__Rectangle__ColorAssignment_3 ) ) ;
    public final void rule__Rectangle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3346:1: ( ( ( rule__Rectangle__ColorAssignment_3 ) ) )
            // InternalCinEditor.g:3347:1: ( ( rule__Rectangle__ColorAssignment_3 ) )
            {
            // InternalCinEditor.g:3347:1: ( ( rule__Rectangle__ColorAssignment_3 ) )
            // InternalCinEditor.g:3348:2: ( rule__Rectangle__ColorAssignment_3 )
            {
             before(grammarAccess.getRectangleAccess().getColorAssignment_3()); 
            // InternalCinEditor.g:3349:2: ( rule__Rectangle__ColorAssignment_3 )
            // InternalCinEditor.g:3349:3: rule__Rectangle__ColorAssignment_3
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
    // InternalCinEditor.g:3357:1: rule__Rectangle__Group__4 : rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 ;
    public final void rule__Rectangle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3361:1: ( rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5 )
            // InternalCinEditor.g:3362:2: rule__Rectangle__Group__4__Impl rule__Rectangle__Group__5
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
    // InternalCinEditor.g:3369:1: rule__Rectangle__Group__4__Impl : ( ( rule__Rectangle__PositionAssignment_4 )? ) ;
    public final void rule__Rectangle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3373:1: ( ( ( rule__Rectangle__PositionAssignment_4 )? ) )
            // InternalCinEditor.g:3374:1: ( ( rule__Rectangle__PositionAssignment_4 )? )
            {
            // InternalCinEditor.g:3374:1: ( ( rule__Rectangle__PositionAssignment_4 )? )
            // InternalCinEditor.g:3375:2: ( rule__Rectangle__PositionAssignment_4 )?
            {
             before(grammarAccess.getRectangleAccess().getPositionAssignment_4()); 
            // InternalCinEditor.g:3376:2: ( rule__Rectangle__PositionAssignment_4 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCinEditor.g:3376:3: rule__Rectangle__PositionAssignment_4
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
    // InternalCinEditor.g:3384:1: rule__Rectangle__Group__5 : rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 ;
    public final void rule__Rectangle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3388:1: ( rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6 )
            // InternalCinEditor.g:3389:2: rule__Rectangle__Group__5__Impl rule__Rectangle__Group__6
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
    // InternalCinEditor.g:3396:1: rule__Rectangle__Group__5__Impl : ( ( rule__Rectangle__DimensionAssignment_5 )? ) ;
    public final void rule__Rectangle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3400:1: ( ( ( rule__Rectangle__DimensionAssignment_5 )? ) )
            // InternalCinEditor.g:3401:1: ( ( rule__Rectangle__DimensionAssignment_5 )? )
            {
            // InternalCinEditor.g:3401:1: ( ( rule__Rectangle__DimensionAssignment_5 )? )
            // InternalCinEditor.g:3402:2: ( rule__Rectangle__DimensionAssignment_5 )?
            {
             before(grammarAccess.getRectangleAccess().getDimensionAssignment_5()); 
            // InternalCinEditor.g:3403:2: ( rule__Rectangle__DimensionAssignment_5 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCinEditor.g:3403:3: rule__Rectangle__DimensionAssignment_5
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
    // InternalCinEditor.g:3411:1: rule__Rectangle__Group__6 : rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 ;
    public final void rule__Rectangle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3415:1: ( rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7 )
            // InternalCinEditor.g:3416:2: rule__Rectangle__Group__6__Impl rule__Rectangle__Group__7
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
    // InternalCinEditor.g:3423:1: rule__Rectangle__Group__6__Impl : ( ( rule__Rectangle__Group_6__0 )? ) ;
    public final void rule__Rectangle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3427:1: ( ( ( rule__Rectangle__Group_6__0 )? ) )
            // InternalCinEditor.g:3428:1: ( ( rule__Rectangle__Group_6__0 )? )
            {
            // InternalCinEditor.g:3428:1: ( ( rule__Rectangle__Group_6__0 )? )
            // InternalCinEditor.g:3429:2: ( rule__Rectangle__Group_6__0 )?
            {
             before(grammarAccess.getRectangleAccess().getGroup_6()); 
            // InternalCinEditor.g:3430:2: ( rule__Rectangle__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCinEditor.g:3430:3: rule__Rectangle__Group_6__0
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
    // InternalCinEditor.g:3438:1: rule__Rectangle__Group__7 : rule__Rectangle__Group__7__Impl ;
    public final void rule__Rectangle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3442:1: ( rule__Rectangle__Group__7__Impl )
            // InternalCinEditor.g:3443:2: rule__Rectangle__Group__7__Impl
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
    // InternalCinEditor.g:3449:1: rule__Rectangle__Group__7__Impl : ( ( rule__Rectangle__Group_7__0 )? ) ;
    public final void rule__Rectangle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3453:1: ( ( ( rule__Rectangle__Group_7__0 )? ) )
            // InternalCinEditor.g:3454:1: ( ( rule__Rectangle__Group_7__0 )? )
            {
            // InternalCinEditor.g:3454:1: ( ( rule__Rectangle__Group_7__0 )? )
            // InternalCinEditor.g:3455:2: ( rule__Rectangle__Group_7__0 )?
            {
             before(grammarAccess.getRectangleAccess().getGroup_7()); 
            // InternalCinEditor.g:3456:2: ( rule__Rectangle__Group_7__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCinEditor.g:3456:3: rule__Rectangle__Group_7__0
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
    // InternalCinEditor.g:3465:1: rule__Rectangle__Group_6__0 : rule__Rectangle__Group_6__0__Impl rule__Rectangle__Group_6__1 ;
    public final void rule__Rectangle__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3469:1: ( rule__Rectangle__Group_6__0__Impl rule__Rectangle__Group_6__1 )
            // InternalCinEditor.g:3470:2: rule__Rectangle__Group_6__0__Impl rule__Rectangle__Group_6__1
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
    // InternalCinEditor.g:3477:1: rule__Rectangle__Group_6__0__Impl : ( 'at' ) ;
    public final void rule__Rectangle__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3481:1: ( ( 'at' ) )
            // InternalCinEditor.g:3482:1: ( 'at' )
            {
            // InternalCinEditor.g:3482:1: ( 'at' )
            // InternalCinEditor.g:3483:2: 'at'
            {
             before(grammarAccess.getRectangleAccess().getAtKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRectangleAccess().getAtKeyword_6_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:3492:1: rule__Rectangle__Group_6__1 : rule__Rectangle__Group_6__1__Impl ;
    public final void rule__Rectangle__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3496:1: ( rule__Rectangle__Group_6__1__Impl )
            // InternalCinEditor.g:3497:2: rule__Rectangle__Group_6__1__Impl
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
    // InternalCinEditor.g:3503:1: rule__Rectangle__Group_6__1__Impl : ( ( rule__Rectangle__BeginTimeAssignment_6_1 ) ) ;
    public final void rule__Rectangle__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3507:1: ( ( ( rule__Rectangle__BeginTimeAssignment_6_1 ) ) )
            // InternalCinEditor.g:3508:1: ( ( rule__Rectangle__BeginTimeAssignment_6_1 ) )
            {
            // InternalCinEditor.g:3508:1: ( ( rule__Rectangle__BeginTimeAssignment_6_1 ) )
            // InternalCinEditor.g:3509:2: ( rule__Rectangle__BeginTimeAssignment_6_1 )
            {
             before(grammarAccess.getRectangleAccess().getBeginTimeAssignment_6_1()); 
            // InternalCinEditor.g:3510:2: ( rule__Rectangle__BeginTimeAssignment_6_1 )
            // InternalCinEditor.g:3510:3: rule__Rectangle__BeginTimeAssignment_6_1
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
    // InternalCinEditor.g:3519:1: rule__Rectangle__Group_7__0 : rule__Rectangle__Group_7__0__Impl rule__Rectangle__Group_7__1 ;
    public final void rule__Rectangle__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3523:1: ( rule__Rectangle__Group_7__0__Impl rule__Rectangle__Group_7__1 )
            // InternalCinEditor.g:3524:2: rule__Rectangle__Group_7__0__Impl rule__Rectangle__Group_7__1
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
    // InternalCinEditor.g:3531:1: rule__Rectangle__Group_7__0__Impl : ( 'during' ) ;
    public final void rule__Rectangle__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3535:1: ( ( 'during' ) )
            // InternalCinEditor.g:3536:1: ( 'during' )
            {
            // InternalCinEditor.g:3536:1: ( 'during' )
            // InternalCinEditor.g:3537:2: 'during'
            {
             before(grammarAccess.getRectangleAccess().getDuringKeyword_7_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCinEditor.g:3546:1: rule__Rectangle__Group_7__1 : rule__Rectangle__Group_7__1__Impl ;
    public final void rule__Rectangle__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3550:1: ( rule__Rectangle__Group_7__1__Impl )
            // InternalCinEditor.g:3551:2: rule__Rectangle__Group_7__1__Impl
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
    // InternalCinEditor.g:3557:1: rule__Rectangle__Group_7__1__Impl : ( ( rule__Rectangle__DurationAssignment_7_1 ) ) ;
    public final void rule__Rectangle__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3561:1: ( ( ( rule__Rectangle__DurationAssignment_7_1 ) ) )
            // InternalCinEditor.g:3562:1: ( ( rule__Rectangle__DurationAssignment_7_1 ) )
            {
            // InternalCinEditor.g:3562:1: ( ( rule__Rectangle__DurationAssignment_7_1 ) )
            // InternalCinEditor.g:3563:2: ( rule__Rectangle__DurationAssignment_7_1 )
            {
             before(grammarAccess.getRectangleAccess().getDurationAssignment_7_1()); 
            // InternalCinEditor.g:3564:2: ( rule__Rectangle__DurationAssignment_7_1 )
            // InternalCinEditor.g:3564:3: rule__Rectangle__DurationAssignment_7_1
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
    // InternalCinEditor.g:3573:1: rule__FadeIn__Group__0 : rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 ;
    public final void rule__FadeIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3577:1: ( rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 )
            // InternalCinEditor.g:3578:2: rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1
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
    // InternalCinEditor.g:3585:1: rule__FadeIn__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__FadeIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3589:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:3590:1: ( 'Effect' )
            {
            // InternalCinEditor.g:3590:1: ( 'Effect' )
            // InternalCinEditor.g:3591:2: 'Effect'
            {
             before(grammarAccess.getFadeInAccess().getEffectKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCinEditor.g:3600:1: rule__FadeIn__Group__1 : rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 ;
    public final void rule__FadeIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3604:1: ( rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 )
            // InternalCinEditor.g:3605:2: rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2
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
    // InternalCinEditor.g:3612:1: rule__FadeIn__Group__1__Impl : ( ( rule__FadeIn__NameAssignment_1 ) ) ;
    public final void rule__FadeIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3616:1: ( ( ( rule__FadeIn__NameAssignment_1 ) ) )
            // InternalCinEditor.g:3617:1: ( ( rule__FadeIn__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:3617:1: ( ( rule__FadeIn__NameAssignment_1 ) )
            // InternalCinEditor.g:3618:2: ( rule__FadeIn__NameAssignment_1 )
            {
             before(grammarAccess.getFadeInAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:3619:2: ( rule__FadeIn__NameAssignment_1 )
            // InternalCinEditor.g:3619:3: rule__FadeIn__NameAssignment_1
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
    // InternalCinEditor.g:3627:1: rule__FadeIn__Group__2 : rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 ;
    public final void rule__FadeIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3631:1: ( rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 )
            // InternalCinEditor.g:3632:2: rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalCinEditor.g:3639:1: rule__FadeIn__Group__2__Impl : ( '=' ) ;
    public final void rule__FadeIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3643:1: ( ( '=' ) )
            // InternalCinEditor.g:3644:1: ( '=' )
            {
            // InternalCinEditor.g:3644:1: ( '=' )
            // InternalCinEditor.g:3645:2: '='
            {
             before(grammarAccess.getFadeInAccess().getEqualsSignKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCinEditor.g:3654:1: rule__FadeIn__Group__3 : rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 ;
    public final void rule__FadeIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3658:1: ( rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 )
            // InternalCinEditor.g:3659:2: rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalCinEditor.g:3666:1: rule__FadeIn__Group__3__Impl : ( 'FadeIn' ) ;
    public final void rule__FadeIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3670:1: ( ( 'FadeIn' ) )
            // InternalCinEditor.g:3671:1: ( 'FadeIn' )
            {
            // InternalCinEditor.g:3671:1: ( 'FadeIn' )
            // InternalCinEditor.g:3672:2: 'FadeIn'
            {
             before(grammarAccess.getFadeInAccess().getFadeInKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCinEditor.g:3681:1: rule__FadeIn__Group__4 : rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5 ;
    public final void rule__FadeIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3685:1: ( rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5 )
            // InternalCinEditor.g:3686:2: rule__FadeIn__Group__4__Impl rule__FadeIn__Group__5
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
    // InternalCinEditor.g:3693:1: rule__FadeIn__Group__4__Impl : ( 'during' ) ;
    public final void rule__FadeIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3697:1: ( ( 'during' ) )
            // InternalCinEditor.g:3698:1: ( 'during' )
            {
            // InternalCinEditor.g:3698:1: ( 'during' )
            // InternalCinEditor.g:3699:2: 'during'
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
    // InternalCinEditor.g:3708:1: rule__FadeIn__Group__5 : rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6 ;
    public final void rule__FadeIn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3712:1: ( rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6 )
            // InternalCinEditor.g:3713:2: rule__FadeIn__Group__5__Impl rule__FadeIn__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3720:1: rule__FadeIn__Group__5__Impl : ( ( rule__FadeIn__DurationAssignment_5 ) ) ;
    public final void rule__FadeIn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3724:1: ( ( ( rule__FadeIn__DurationAssignment_5 ) ) )
            // InternalCinEditor.g:3725:1: ( ( rule__FadeIn__DurationAssignment_5 ) )
            {
            // InternalCinEditor.g:3725:1: ( ( rule__FadeIn__DurationAssignment_5 ) )
            // InternalCinEditor.g:3726:2: ( rule__FadeIn__DurationAssignment_5 )
            {
             before(grammarAccess.getFadeInAccess().getDurationAssignment_5()); 
            // InternalCinEditor.g:3727:2: ( rule__FadeIn__DurationAssignment_5 )
            // InternalCinEditor.g:3727:3: rule__FadeIn__DurationAssignment_5
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
    // InternalCinEditor.g:3735:1: rule__FadeIn__Group__6 : rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7 ;
    public final void rule__FadeIn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3739:1: ( rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7 )
            // InternalCinEditor.g:3740:2: rule__FadeIn__Group__6__Impl rule__FadeIn__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:3747:1: rule__FadeIn__Group__6__Impl : ( 'on' ) ;
    public final void rule__FadeIn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3751:1: ( ( 'on' ) )
            // InternalCinEditor.g:3752:1: ( 'on' )
            {
            // InternalCinEditor.g:3752:1: ( 'on' )
            // InternalCinEditor.g:3753:2: 'on'
            {
             before(grammarAccess.getFadeInAccess().getOnKeyword_6()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCinEditor.g:3762:1: rule__FadeIn__Group__7 : rule__FadeIn__Group__7__Impl ;
    public final void rule__FadeIn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3766:1: ( rule__FadeIn__Group__7__Impl )
            // InternalCinEditor.g:3767:2: rule__FadeIn__Group__7__Impl
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
    // InternalCinEditor.g:3773:1: rule__FadeIn__Group__7__Impl : ( ( rule__FadeIn__ElementAssignment_7 ) ) ;
    public final void rule__FadeIn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3777:1: ( ( ( rule__FadeIn__ElementAssignment_7 ) ) )
            // InternalCinEditor.g:3778:1: ( ( rule__FadeIn__ElementAssignment_7 ) )
            {
            // InternalCinEditor.g:3778:1: ( ( rule__FadeIn__ElementAssignment_7 ) )
            // InternalCinEditor.g:3779:2: ( rule__FadeIn__ElementAssignment_7 )
            {
             before(grammarAccess.getFadeInAccess().getElementAssignment_7()); 
            // InternalCinEditor.g:3780:2: ( rule__FadeIn__ElementAssignment_7 )
            // InternalCinEditor.g:3780:3: rule__FadeIn__ElementAssignment_7
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
    // InternalCinEditor.g:3789:1: rule__FadeOut__Group__0 : rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 ;
    public final void rule__FadeOut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3793:1: ( rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 )
            // InternalCinEditor.g:3794:2: rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1
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
    // InternalCinEditor.g:3801:1: rule__FadeOut__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__FadeOut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3805:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:3806:1: ( 'Effect' )
            {
            // InternalCinEditor.g:3806:1: ( 'Effect' )
            // InternalCinEditor.g:3807:2: 'Effect'
            {
             before(grammarAccess.getFadeOutAccess().getEffectKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCinEditor.g:3816:1: rule__FadeOut__Group__1 : rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 ;
    public final void rule__FadeOut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3820:1: ( rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 )
            // InternalCinEditor.g:3821:2: rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2
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
    // InternalCinEditor.g:3828:1: rule__FadeOut__Group__1__Impl : ( ( rule__FadeOut__NameAssignment_1 ) ) ;
    public final void rule__FadeOut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3832:1: ( ( ( rule__FadeOut__NameAssignment_1 ) ) )
            // InternalCinEditor.g:3833:1: ( ( rule__FadeOut__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:3833:1: ( ( rule__FadeOut__NameAssignment_1 ) )
            // InternalCinEditor.g:3834:2: ( rule__FadeOut__NameAssignment_1 )
            {
             before(grammarAccess.getFadeOutAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:3835:2: ( rule__FadeOut__NameAssignment_1 )
            // InternalCinEditor.g:3835:3: rule__FadeOut__NameAssignment_1
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
    // InternalCinEditor.g:3843:1: rule__FadeOut__Group__2 : rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 ;
    public final void rule__FadeOut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3847:1: ( rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 )
            // InternalCinEditor.g:3848:2: rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalCinEditor.g:3855:1: rule__FadeOut__Group__2__Impl : ( '=' ) ;
    public final void rule__FadeOut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3859:1: ( ( '=' ) )
            // InternalCinEditor.g:3860:1: ( '=' )
            {
            // InternalCinEditor.g:3860:1: ( '=' )
            // InternalCinEditor.g:3861:2: '='
            {
             before(grammarAccess.getFadeOutAccess().getEqualsSignKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCinEditor.g:3870:1: rule__FadeOut__Group__3 : rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 ;
    public final void rule__FadeOut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3874:1: ( rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 )
            // InternalCinEditor.g:3875:2: rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalCinEditor.g:3882:1: rule__FadeOut__Group__3__Impl : ( 'FadeOut' ) ;
    public final void rule__FadeOut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3886:1: ( ( 'FadeOut' ) )
            // InternalCinEditor.g:3887:1: ( 'FadeOut' )
            {
            // InternalCinEditor.g:3887:1: ( 'FadeOut' )
            // InternalCinEditor.g:3888:2: 'FadeOut'
            {
             before(grammarAccess.getFadeOutAccess().getFadeOutKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCinEditor.g:3897:1: rule__FadeOut__Group__4 : rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5 ;
    public final void rule__FadeOut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3901:1: ( rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5 )
            // InternalCinEditor.g:3902:2: rule__FadeOut__Group__4__Impl rule__FadeOut__Group__5
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
    // InternalCinEditor.g:3909:1: rule__FadeOut__Group__4__Impl : ( 'during' ) ;
    public final void rule__FadeOut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3913:1: ( ( 'during' ) )
            // InternalCinEditor.g:3914:1: ( 'during' )
            {
            // InternalCinEditor.g:3914:1: ( 'during' )
            // InternalCinEditor.g:3915:2: 'during'
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
    // InternalCinEditor.g:3924:1: rule__FadeOut__Group__5 : rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6 ;
    public final void rule__FadeOut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3928:1: ( rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6 )
            // InternalCinEditor.g:3929:2: rule__FadeOut__Group__5__Impl rule__FadeOut__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalCinEditor.g:3936:1: rule__FadeOut__Group__5__Impl : ( ( rule__FadeOut__DurationAssignment_5 ) ) ;
    public final void rule__FadeOut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3940:1: ( ( ( rule__FadeOut__DurationAssignment_5 ) ) )
            // InternalCinEditor.g:3941:1: ( ( rule__FadeOut__DurationAssignment_5 ) )
            {
            // InternalCinEditor.g:3941:1: ( ( rule__FadeOut__DurationAssignment_5 ) )
            // InternalCinEditor.g:3942:2: ( rule__FadeOut__DurationAssignment_5 )
            {
             before(grammarAccess.getFadeOutAccess().getDurationAssignment_5()); 
            // InternalCinEditor.g:3943:2: ( rule__FadeOut__DurationAssignment_5 )
            // InternalCinEditor.g:3943:3: rule__FadeOut__DurationAssignment_5
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
    // InternalCinEditor.g:3951:1: rule__FadeOut__Group__6 : rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7 ;
    public final void rule__FadeOut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3955:1: ( rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7 )
            // InternalCinEditor.g:3956:2: rule__FadeOut__Group__6__Impl rule__FadeOut__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:3963:1: rule__FadeOut__Group__6__Impl : ( 'on' ) ;
    public final void rule__FadeOut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3967:1: ( ( 'on' ) )
            // InternalCinEditor.g:3968:1: ( 'on' )
            {
            // InternalCinEditor.g:3968:1: ( 'on' )
            // InternalCinEditor.g:3969:2: 'on'
            {
             before(grammarAccess.getFadeOutAccess().getOnKeyword_6()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCinEditor.g:3978:1: rule__FadeOut__Group__7 : rule__FadeOut__Group__7__Impl ;
    public final void rule__FadeOut__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3982:1: ( rule__FadeOut__Group__7__Impl )
            // InternalCinEditor.g:3983:2: rule__FadeOut__Group__7__Impl
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
    // InternalCinEditor.g:3989:1: rule__FadeOut__Group__7__Impl : ( ( rule__FadeOut__ElementAssignment_7 ) ) ;
    public final void rule__FadeOut__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:3993:1: ( ( ( rule__FadeOut__ElementAssignment_7 ) ) )
            // InternalCinEditor.g:3994:1: ( ( rule__FadeOut__ElementAssignment_7 ) )
            {
            // InternalCinEditor.g:3994:1: ( ( rule__FadeOut__ElementAssignment_7 ) )
            // InternalCinEditor.g:3995:2: ( rule__FadeOut__ElementAssignment_7 )
            {
             before(grammarAccess.getFadeOutAccess().getElementAssignment_7()); 
            // InternalCinEditor.g:3996:2: ( rule__FadeOut__ElementAssignment_7 )
            // InternalCinEditor.g:3996:3: rule__FadeOut__ElementAssignment_7
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
    // InternalCinEditor.g:4005:1: rule__Translate__Group__0 : rule__Translate__Group__0__Impl rule__Translate__Group__1 ;
    public final void rule__Translate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4009:1: ( rule__Translate__Group__0__Impl rule__Translate__Group__1 )
            // InternalCinEditor.g:4010:2: rule__Translate__Group__0__Impl rule__Translate__Group__1
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
    // InternalCinEditor.g:4017:1: rule__Translate__Group__0__Impl : ( 'Effect' ) ;
    public final void rule__Translate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4021:1: ( ( 'Effect' ) )
            // InternalCinEditor.g:4022:1: ( 'Effect' )
            {
            // InternalCinEditor.g:4022:1: ( 'Effect' )
            // InternalCinEditor.g:4023:2: 'Effect'
            {
             before(grammarAccess.getTranslateAccess().getEffectKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCinEditor.g:4032:1: rule__Translate__Group__1 : rule__Translate__Group__1__Impl rule__Translate__Group__2 ;
    public final void rule__Translate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4036:1: ( rule__Translate__Group__1__Impl rule__Translate__Group__2 )
            // InternalCinEditor.g:4037:2: rule__Translate__Group__1__Impl rule__Translate__Group__2
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
    // InternalCinEditor.g:4044:1: rule__Translate__Group__1__Impl : ( ( rule__Translate__NameAssignment_1 ) ) ;
    public final void rule__Translate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4048:1: ( ( ( rule__Translate__NameAssignment_1 ) ) )
            // InternalCinEditor.g:4049:1: ( ( rule__Translate__NameAssignment_1 ) )
            {
            // InternalCinEditor.g:4049:1: ( ( rule__Translate__NameAssignment_1 ) )
            // InternalCinEditor.g:4050:2: ( rule__Translate__NameAssignment_1 )
            {
             before(grammarAccess.getTranslateAccess().getNameAssignment_1()); 
            // InternalCinEditor.g:4051:2: ( rule__Translate__NameAssignment_1 )
            // InternalCinEditor.g:4051:3: rule__Translate__NameAssignment_1
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
    // InternalCinEditor.g:4059:1: rule__Translate__Group__2 : rule__Translate__Group__2__Impl rule__Translate__Group__3 ;
    public final void rule__Translate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4063:1: ( rule__Translate__Group__2__Impl rule__Translate__Group__3 )
            // InternalCinEditor.g:4064:2: rule__Translate__Group__2__Impl rule__Translate__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalCinEditor.g:4071:1: rule__Translate__Group__2__Impl : ( '=' ) ;
    public final void rule__Translate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4075:1: ( ( '=' ) )
            // InternalCinEditor.g:4076:1: ( '=' )
            {
            // InternalCinEditor.g:4076:1: ( '=' )
            // InternalCinEditor.g:4077:2: '='
            {
             before(grammarAccess.getTranslateAccess().getEqualsSignKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCinEditor.g:4086:1: rule__Translate__Group__3 : rule__Translate__Group__3__Impl rule__Translate__Group__4 ;
    public final void rule__Translate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4090:1: ( rule__Translate__Group__3__Impl rule__Translate__Group__4 )
            // InternalCinEditor.g:4091:2: rule__Translate__Group__3__Impl rule__Translate__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalCinEditor.g:4098:1: rule__Translate__Group__3__Impl : ( 'Translate' ) ;
    public final void rule__Translate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4102:1: ( ( 'Translate' ) )
            // InternalCinEditor.g:4103:1: ( 'Translate' )
            {
            // InternalCinEditor.g:4103:1: ( 'Translate' )
            // InternalCinEditor.g:4104:2: 'Translate'
            {
             before(grammarAccess.getTranslateAccess().getTranslateKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCinEditor.g:4113:1: rule__Translate__Group__4 : rule__Translate__Group__4__Impl rule__Translate__Group__5 ;
    public final void rule__Translate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4117:1: ( rule__Translate__Group__4__Impl rule__Translate__Group__5 )
            // InternalCinEditor.g:4118:2: rule__Translate__Group__4__Impl rule__Translate__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalCinEditor.g:4125:1: rule__Translate__Group__4__Impl : ( ( rule__Translate__PositionToTranslateAssignment_4 ) ) ;
    public final void rule__Translate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4129:1: ( ( ( rule__Translate__PositionToTranslateAssignment_4 ) ) )
            // InternalCinEditor.g:4130:1: ( ( rule__Translate__PositionToTranslateAssignment_4 ) )
            {
            // InternalCinEditor.g:4130:1: ( ( rule__Translate__PositionToTranslateAssignment_4 ) )
            // InternalCinEditor.g:4131:2: ( rule__Translate__PositionToTranslateAssignment_4 )
            {
             before(grammarAccess.getTranslateAccess().getPositionToTranslateAssignment_4()); 
            // InternalCinEditor.g:4132:2: ( rule__Translate__PositionToTranslateAssignment_4 )
            // InternalCinEditor.g:4132:3: rule__Translate__PositionToTranslateAssignment_4
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
    // InternalCinEditor.g:4140:1: rule__Translate__Group__5 : rule__Translate__Group__5__Impl rule__Translate__Group__6 ;
    public final void rule__Translate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4144:1: ( rule__Translate__Group__5__Impl rule__Translate__Group__6 )
            // InternalCinEditor.g:4145:2: rule__Translate__Group__5__Impl rule__Translate__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalCinEditor.g:4152:1: rule__Translate__Group__5__Impl : ( ( rule__Translate__Group_5__0 )? ) ;
    public final void rule__Translate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4156:1: ( ( ( rule__Translate__Group_5__0 )? ) )
            // InternalCinEditor.g:4157:1: ( ( rule__Translate__Group_5__0 )? )
            {
            // InternalCinEditor.g:4157:1: ( ( rule__Translate__Group_5__0 )? )
            // InternalCinEditor.g:4158:2: ( rule__Translate__Group_5__0 )?
            {
             before(grammarAccess.getTranslateAccess().getGroup_5()); 
            // InternalCinEditor.g:4159:2: ( rule__Translate__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCinEditor.g:4159:3: rule__Translate__Group_5__0
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
    // InternalCinEditor.g:4167:1: rule__Translate__Group__6 : rule__Translate__Group__6__Impl rule__Translate__Group__7 ;
    public final void rule__Translate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4171:1: ( rule__Translate__Group__6__Impl rule__Translate__Group__7 )
            // InternalCinEditor.g:4172:2: rule__Translate__Group__6__Impl rule__Translate__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalCinEditor.g:4179:1: rule__Translate__Group__6__Impl : ( ( rule__Translate__Group_6__0 )? ) ;
    public final void rule__Translate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4183:1: ( ( ( rule__Translate__Group_6__0 )? ) )
            // InternalCinEditor.g:4184:1: ( ( rule__Translate__Group_6__0 )? )
            {
            // InternalCinEditor.g:4184:1: ( ( rule__Translate__Group_6__0 )? )
            // InternalCinEditor.g:4185:2: ( rule__Translate__Group_6__0 )?
            {
             before(grammarAccess.getTranslateAccess().getGroup_6()); 
            // InternalCinEditor.g:4186:2: ( rule__Translate__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCinEditor.g:4186:3: rule__Translate__Group_6__0
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
    // InternalCinEditor.g:4194:1: rule__Translate__Group__7 : rule__Translate__Group__7__Impl rule__Translate__Group__8 ;
    public final void rule__Translate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4198:1: ( rule__Translate__Group__7__Impl rule__Translate__Group__8 )
            // InternalCinEditor.g:4199:2: rule__Translate__Group__7__Impl rule__Translate__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalCinEditor.g:4206:1: rule__Translate__Group__7__Impl : ( 'on' ) ;
    public final void rule__Translate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4210:1: ( ( 'on' ) )
            // InternalCinEditor.g:4211:1: ( 'on' )
            {
            // InternalCinEditor.g:4211:1: ( 'on' )
            // InternalCinEditor.g:4212:2: 'on'
            {
             before(grammarAccess.getTranslateAccess().getOnKeyword_7()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCinEditor.g:4221:1: rule__Translate__Group__8 : rule__Translate__Group__8__Impl ;
    public final void rule__Translate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4225:1: ( rule__Translate__Group__8__Impl )
            // InternalCinEditor.g:4226:2: rule__Translate__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Translate__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalCinEditor.g:4232:1: rule__Translate__Group__8__Impl : ( ( rule__Translate__ElementAssignment_8 ) ) ;
    public final void rule__Translate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4236:1: ( ( ( rule__Translate__ElementAssignment_8 ) ) )
            // InternalCinEditor.g:4237:1: ( ( rule__Translate__ElementAssignment_8 ) )
            {
            // InternalCinEditor.g:4237:1: ( ( rule__Translate__ElementAssignment_8 ) )
            // InternalCinEditor.g:4238:2: ( rule__Translate__ElementAssignment_8 )
            {
             before(grammarAccess.getTranslateAccess().getElementAssignment_8()); 
            // InternalCinEditor.g:4239:2: ( rule__Translate__ElementAssignment_8 )
            // InternalCinEditor.g:4239:3: rule__Translate__ElementAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Translate__ElementAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTranslateAccess().getElementAssignment_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Translate__Group_5__0"
    // InternalCinEditor.g:4248:1: rule__Translate__Group_5__0 : rule__Translate__Group_5__0__Impl rule__Translate__Group_5__1 ;
    public final void rule__Translate__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4252:1: ( rule__Translate__Group_5__0__Impl rule__Translate__Group_5__1 )
            // InternalCinEditor.g:4253:2: rule__Translate__Group_5__0__Impl rule__Translate__Group_5__1
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
    // InternalCinEditor.g:4260:1: rule__Translate__Group_5__0__Impl : ( 'at' ) ;
    public final void rule__Translate__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4264:1: ( ( 'at' ) )
            // InternalCinEditor.g:4265:1: ( 'at' )
            {
            // InternalCinEditor.g:4265:1: ( 'at' )
            // InternalCinEditor.g:4266:2: 'at'
            {
             before(grammarAccess.getTranslateAccess().getAtKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getAtKeyword_5_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:4275:1: rule__Translate__Group_5__1 : rule__Translate__Group_5__1__Impl ;
    public final void rule__Translate__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4279:1: ( rule__Translate__Group_5__1__Impl )
            // InternalCinEditor.g:4280:2: rule__Translate__Group_5__1__Impl
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
    // InternalCinEditor.g:4286:1: rule__Translate__Group_5__1__Impl : ( ( rule__Translate__BeginTimeAssignment_5_1 ) ) ;
    public final void rule__Translate__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4290:1: ( ( ( rule__Translate__BeginTimeAssignment_5_1 ) ) )
            // InternalCinEditor.g:4291:1: ( ( rule__Translate__BeginTimeAssignment_5_1 ) )
            {
            // InternalCinEditor.g:4291:1: ( ( rule__Translate__BeginTimeAssignment_5_1 ) )
            // InternalCinEditor.g:4292:2: ( rule__Translate__BeginTimeAssignment_5_1 )
            {
             before(grammarAccess.getTranslateAccess().getBeginTimeAssignment_5_1()); 
            // InternalCinEditor.g:4293:2: ( rule__Translate__BeginTimeAssignment_5_1 )
            // InternalCinEditor.g:4293:3: rule__Translate__BeginTimeAssignment_5_1
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
    // InternalCinEditor.g:4302:1: rule__Translate__Group_6__0 : rule__Translate__Group_6__0__Impl rule__Translate__Group_6__1 ;
    public final void rule__Translate__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4306:1: ( rule__Translate__Group_6__0__Impl rule__Translate__Group_6__1 )
            // InternalCinEditor.g:4307:2: rule__Translate__Group_6__0__Impl rule__Translate__Group_6__1
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
    // InternalCinEditor.g:4314:1: rule__Translate__Group_6__0__Impl : ( 'during' ) ;
    public final void rule__Translate__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4318:1: ( ( 'during' ) )
            // InternalCinEditor.g:4319:1: ( 'during' )
            {
            // InternalCinEditor.g:4319:1: ( 'during' )
            // InternalCinEditor.g:4320:2: 'during'
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
    // InternalCinEditor.g:4329:1: rule__Translate__Group_6__1 : rule__Translate__Group_6__1__Impl ;
    public final void rule__Translate__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4333:1: ( rule__Translate__Group_6__1__Impl )
            // InternalCinEditor.g:4334:2: rule__Translate__Group_6__1__Impl
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
    // InternalCinEditor.g:4340:1: rule__Translate__Group_6__1__Impl : ( ( rule__Translate__DurationAssignment_6_1 ) ) ;
    public final void rule__Translate__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4344:1: ( ( ( rule__Translate__DurationAssignment_6_1 ) ) )
            // InternalCinEditor.g:4345:1: ( ( rule__Translate__DurationAssignment_6_1 ) )
            {
            // InternalCinEditor.g:4345:1: ( ( rule__Translate__DurationAssignment_6_1 ) )
            // InternalCinEditor.g:4346:2: ( rule__Translate__DurationAssignment_6_1 )
            {
             before(grammarAccess.getTranslateAccess().getDurationAssignment_6_1()); 
            // InternalCinEditor.g:4347:2: ( rule__Translate__DurationAssignment_6_1 )
            // InternalCinEditor.g:4347:3: rule__Translate__DurationAssignment_6_1
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


    // $ANTLR start "rule__Movie__NameAssignment_1"
    // InternalCinEditor.g:4356:1: rule__Movie__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Movie__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4360:1: ( ( ruleEString ) )
            // InternalCinEditor.g:4361:2: ( ruleEString )
            {
            // InternalCinEditor.g:4361:2: ( ruleEString )
            // InternalCinEditor.g:4362:3: ruleEString
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
    // InternalCinEditor.g:4371:1: rule__Movie__DimensionAssignment_2 : ( ruleDimension ) ;
    public final void rule__Movie__DimensionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4375:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:4376:2: ( ruleDimension )
            {
            // InternalCinEditor.g:4376:2: ( ruleDimension )
            // InternalCinEditor.g:4377:3: ruleDimension
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
    // InternalCinEditor.g:4386:1: rule__Movie__FpsAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Movie__FpsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4390:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4391:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4391:2: ( ruleEInt )
            // InternalCinEditor.g:4392:3: ruleEInt
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
    // InternalCinEditor.g:4401:1: rule__Movie__LayersAssignment_4 : ( ruleLayer ) ;
    public final void rule__Movie__LayersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4405:1: ( ( ruleLayer ) )
            // InternalCinEditor.g:4406:2: ( ruleLayer )
            {
            // InternalCinEditor.g:4406:2: ( ruleLayer )
            // InternalCinEditor.g:4407:3: ruleLayer
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
    // InternalCinEditor.g:4416:1: rule__Layer__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Layer__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4420:1: ( ( ruleElement ) )
            // InternalCinEditor.g:4421:2: ( ruleElement )
            {
            // InternalCinEditor.g:4421:2: ( ruleElement )
            // InternalCinEditor.g:4422:3: ruleElement
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
    // InternalCinEditor.g:4431:1: rule__Position__XAssignment_1_1 : ( ruleItemPosition ) ;
    public final void rule__Position__XAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4435:1: ( ( ruleItemPosition ) )
            // InternalCinEditor.g:4436:2: ( ruleItemPosition )
            {
            // InternalCinEditor.g:4436:2: ( ruleItemPosition )
            // InternalCinEditor.g:4437:3: ruleItemPosition
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
    // InternalCinEditor.g:4446:1: rule__Position__YAssignment_1_3 : ( ruleItemPosition ) ;
    public final void rule__Position__YAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4450:1: ( ( ruleItemPosition ) )
            // InternalCinEditor.g:4451:2: ( ruleItemPosition )
            {
            // InternalCinEditor.g:4451:2: ( ruleItemPosition )
            // InternalCinEditor.g:4452:3: ruleItemPosition
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
    // InternalCinEditor.g:4461:1: rule__ItemPositionInt__PositionAssignment : ( ruleEInt ) ;
    public final void rule__ItemPositionInt__PositionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4465:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4466:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4466:2: ( ruleEInt )
            // InternalCinEditor.g:4467:3: ruleEInt
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
    // InternalCinEditor.g:4476:1: rule__ItemPositionString__PositionAssignment : ( ( rule__ItemPositionString__PositionAlternatives_0 ) ) ;
    public final void rule__ItemPositionString__PositionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4480:1: ( ( ( rule__ItemPositionString__PositionAlternatives_0 ) ) )
            // InternalCinEditor.g:4481:2: ( ( rule__ItemPositionString__PositionAlternatives_0 ) )
            {
            // InternalCinEditor.g:4481:2: ( ( rule__ItemPositionString__PositionAlternatives_0 ) )
            // InternalCinEditor.g:4482:3: ( rule__ItemPositionString__PositionAlternatives_0 )
            {
             before(grammarAccess.getItemPositionStringAccess().getPositionAlternatives_0()); 
            // InternalCinEditor.g:4483:3: ( rule__ItemPositionString__PositionAlternatives_0 )
            // InternalCinEditor.g:4483:4: rule__ItemPositionString__PositionAlternatives_0
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
    // InternalCinEditor.g:4491:1: rule__Dimension__WidthAssignment_1 : ( ruleEInt ) ;
    public final void rule__Dimension__WidthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4495:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4496:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4496:2: ( ruleEInt )
            // InternalCinEditor.g:4497:3: ruleEInt
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
    // InternalCinEditor.g:4506:1: rule__Dimension__HeightAssignment_3 : ( ruleEInt ) ;
    public final void rule__Dimension__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4510:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4511:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4511:2: ( ruleEInt )
            // InternalCinEditor.g:4512:3: ruleEInt
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
    // InternalCinEditor.g:4521:1: rule__HexadecimalColor__HexadecimalValueAssignment_1 : ( ruleEString ) ;
    public final void rule__HexadecimalColor__HexadecimalValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4525:1: ( ( ruleEString ) )
            // InternalCinEditor.g:4526:2: ( ruleEString )
            {
            // InternalCinEditor.g:4526:2: ( ruleEString )
            // InternalCinEditor.g:4527:3: ruleEString
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
    // InternalCinEditor.g:4536:1: rule__AudioElement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AudioElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4540:1: ( ( ruleEString ) )
            // InternalCinEditor.g:4541:2: ( ruleEString )
            {
            // InternalCinEditor.g:4541:2: ( ruleEString )
            // InternalCinEditor.g:4542:3: ruleEString
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
    // InternalCinEditor.g:4551:1: rule__AudioElement__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__AudioElement__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4555:1: ( ( ruleEString ) )
            // InternalCinEditor.g:4556:2: ( ruleEString )
            {
            // InternalCinEditor.g:4556:2: ( ruleEString )
            // InternalCinEditor.g:4557:3: ruleEString
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
    // InternalCinEditor.g:4566:1: rule__AudioElement__VolumeAssignment_4_1 : ( ruleEFloat ) ;
    public final void rule__AudioElement__VolumeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4570:1: ( ( ruleEFloat ) )
            // InternalCinEditor.g:4571:2: ( ruleEFloat )
            {
            // InternalCinEditor.g:4571:2: ( ruleEFloat )
            // InternalCinEditor.g:4572:3: ruleEFloat
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
    // InternalCinEditor.g:4581:1: rule__AudioElement__FadeInAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__FadeInAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4585:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4586:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4586:2: ( ruleEInt )
            // InternalCinEditor.g:4587:3: ruleEInt
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
    // InternalCinEditor.g:4596:1: rule__AudioElement__FadeOutAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__FadeOutAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4600:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4601:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4601:2: ( ruleEInt )
            // InternalCinEditor.g:4602:3: ruleEInt
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
    // InternalCinEditor.g:4611:1: rule__AudioElement__BeginTimeAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__BeginTimeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4615:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4616:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4616:2: ( ruleEInt )
            // InternalCinEditor.g:4617:3: ruleEInt
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


    // $ANTLR start "rule__AudioElement__DurationAssignment_8_1"
    // InternalCinEditor.g:4626:1: rule__AudioElement__DurationAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__AudioElement__DurationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4630:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4631:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4631:2: ( ruleEInt )
            // InternalCinEditor.g:4632:3: ruleEInt
            {
             before(grammarAccess.getAudioElementAccess().getDurationEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAudioElementAccess().getDurationEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__DurationAssignment_8_1"


    // $ANTLR start "rule__AudioElement__ElementAssignment_10"
    // InternalCinEditor.g:4641:1: rule__AudioElement__ElementAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__AudioElement__ElementAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4645:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:4646:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:4646:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:4647:3: ( RULE_ID )
            {
             before(grammarAccess.getAudioElementAccess().getElementGraphicalElementCrossReference_10_0()); 
            // InternalCinEditor.g:4648:3: ( RULE_ID )
            // InternalCinEditor.g:4649:4: RULE_ID
            {
             before(grammarAccess.getAudioElementAccess().getElementGraphicalElementIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getElementGraphicalElementIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getAudioElementAccess().getElementGraphicalElementCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__ElementAssignment_10"


    // $ANTLR start "rule__Text__NameAssignment_1"
    // InternalCinEditor.g:4660:1: rule__Text__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Text__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4664:1: ( ( ruleEString ) )
            // InternalCinEditor.g:4665:2: ( ruleEString )
            {
            // InternalCinEditor.g:4665:2: ( ruleEString )
            // InternalCinEditor.g:4666:3: ruleEString
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
    // InternalCinEditor.g:4675:1: rule__Text__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__Text__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4679:1: ( ( ruleEString ) )
            // InternalCinEditor.g:4680:2: ( ruleEString )
            {
            // InternalCinEditor.g:4680:2: ( ruleEString )
            // InternalCinEditor.g:4681:3: ruleEString
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
    // InternalCinEditor.g:4690:1: rule__Text__FontSizeAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Text__FontSizeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4694:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4695:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4695:2: ( ruleEInt )
            // InternalCinEditor.g:4696:3: ruleEInt
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
    // InternalCinEditor.g:4705:1: rule__Text__PositionAssignment_5 : ( rulePosition ) ;
    public final void rule__Text__PositionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4709:1: ( ( rulePosition ) )
            // InternalCinEditor.g:4710:2: ( rulePosition )
            {
            // InternalCinEditor.g:4710:2: ( rulePosition )
            // InternalCinEditor.g:4711:3: rulePosition
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
    // InternalCinEditor.g:4720:1: rule__Text__BeginTimeAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Text__BeginTimeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4724:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4725:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4725:2: ( ruleEInt )
            // InternalCinEditor.g:4726:3: ruleEInt
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
    // InternalCinEditor.g:4735:1: rule__Text__DurationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Text__DurationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4739:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4740:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4740:2: ( ruleEInt )
            // InternalCinEditor.g:4741:3: ruleEInt
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
    // InternalCinEditor.g:4750:1: rule__Text__ColorAssignment_8 : ( ruleHexadecimalColor ) ;
    public final void rule__Text__ColorAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4754:1: ( ( ruleHexadecimalColor ) )
            // InternalCinEditor.g:4755:2: ( ruleHexadecimalColor )
            {
            // InternalCinEditor.g:4755:2: ( ruleHexadecimalColor )
            // InternalCinEditor.g:4756:3: ruleHexadecimalColor
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
    // InternalCinEditor.g:4765:1: rule__Picture__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Picture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4769:1: ( ( ruleEString ) )
            // InternalCinEditor.g:4770:2: ( ruleEString )
            {
            // InternalCinEditor.g:4770:2: ( ruleEString )
            // InternalCinEditor.g:4771:3: ruleEString
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
    // InternalCinEditor.g:4780:1: rule__Picture__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Picture__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4784:1: ( ( ruleEString ) )
            // InternalCinEditor.g:4785:2: ( ruleEString )
            {
            // InternalCinEditor.g:4785:2: ( ruleEString )
            // InternalCinEditor.g:4786:3: ruleEString
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
    // InternalCinEditor.g:4795:1: rule__Picture__PositionAssignment_4 : ( rulePosition ) ;
    public final void rule__Picture__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4799:1: ( ( rulePosition ) )
            // InternalCinEditor.g:4800:2: ( rulePosition )
            {
            // InternalCinEditor.g:4800:2: ( rulePosition )
            // InternalCinEditor.g:4801:3: rulePosition
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
    // InternalCinEditor.g:4810:1: rule__Picture__DimensionAssignment_5 : ( ruleDimension ) ;
    public final void rule__Picture__DimensionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4814:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:4815:2: ( ruleDimension )
            {
            // InternalCinEditor.g:4815:2: ( ruleDimension )
            // InternalCinEditor.g:4816:3: ruleDimension
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
    // InternalCinEditor.g:4825:1: rule__Picture__BeginTimeAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Picture__BeginTimeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4829:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4830:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4830:2: ( ruleEInt )
            // InternalCinEditor.g:4831:3: ruleEInt
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
    // InternalCinEditor.g:4840:1: rule__Picture__DurationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Picture__DurationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4844:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4845:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4845:2: ( ruleEInt )
            // InternalCinEditor.g:4846:3: ruleEInt
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
    // InternalCinEditor.g:4855:1: rule__Video__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Video__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4859:1: ( ( ruleEString ) )
            // InternalCinEditor.g:4860:2: ( ruleEString )
            {
            // InternalCinEditor.g:4860:2: ( ruleEString )
            // InternalCinEditor.g:4861:3: ruleEString
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
    // InternalCinEditor.g:4870:1: rule__Video__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Video__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4874:1: ( ( ruleEString ) )
            // InternalCinEditor.g:4875:2: ( ruleEString )
            {
            // InternalCinEditor.g:4875:2: ( ruleEString )
            // InternalCinEditor.g:4876:3: ruleEString
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


    // $ANTLR start "rule__Video__BeginCropTimeAssignment_5"
    // InternalCinEditor.g:4885:1: rule__Video__BeginCropTimeAssignment_5 : ( ruleEInt ) ;
    public final void rule__Video__BeginCropTimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4889:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4890:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4890:2: ( ruleEInt )
            // InternalCinEditor.g:4891:3: ruleEInt
            {
             before(grammarAccess.getVideoAccess().getBeginCropTimeEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getBeginCropTimeEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__BeginCropTimeAssignment_5"


    // $ANTLR start "rule__Video__PositionAssignment_6"
    // InternalCinEditor.g:4900:1: rule__Video__PositionAssignment_6 : ( rulePosition ) ;
    public final void rule__Video__PositionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4904:1: ( ( rulePosition ) )
            // InternalCinEditor.g:4905:2: ( rulePosition )
            {
            // InternalCinEditor.g:4905:2: ( rulePosition )
            // InternalCinEditor.g:4906:3: rulePosition
            {
             before(grammarAccess.getVideoAccess().getPositionPositionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getPositionPositionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__PositionAssignment_6"


    // $ANTLR start "rule__Video__DimensionAssignment_7"
    // InternalCinEditor.g:4915:1: rule__Video__DimensionAssignment_7 : ( ruleDimension ) ;
    public final void rule__Video__DimensionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4919:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:4920:2: ( ruleDimension )
            {
            // InternalCinEditor.g:4920:2: ( ruleDimension )
            // InternalCinEditor.g:4921:3: ruleDimension
            {
             before(grammarAccess.getVideoAccess().getDimensionDimensionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getDimensionDimensionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__DimensionAssignment_7"


    // $ANTLR start "rule__Video__BeginTimeAssignment_8_1"
    // InternalCinEditor.g:4930:1: rule__Video__BeginTimeAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__Video__BeginTimeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4934:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4935:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4935:2: ( ruleEInt )
            // InternalCinEditor.g:4936:3: ruleEInt
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


    // $ANTLR start "rule__Video__DurationAssignment_9_1"
    // InternalCinEditor.g:4945:1: rule__Video__DurationAssignment_9_1 : ( ruleEInt ) ;
    public final void rule__Video__DurationAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4949:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:4950:2: ( ruleEInt )
            {
            // InternalCinEditor.g:4950:2: ( ruleEInt )
            // InternalCinEditor.g:4951:3: ruleEInt
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
    // InternalCinEditor.g:4960:1: rule__Rectangle__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Rectangle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4964:1: ( ( ruleEString ) )
            // InternalCinEditor.g:4965:2: ( ruleEString )
            {
            // InternalCinEditor.g:4965:2: ( ruleEString )
            // InternalCinEditor.g:4966:3: ruleEString
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
    // InternalCinEditor.g:4975:1: rule__Rectangle__ColorAssignment_3 : ( ruleHexadecimalColor ) ;
    public final void rule__Rectangle__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4979:1: ( ( ruleHexadecimalColor ) )
            // InternalCinEditor.g:4980:2: ( ruleHexadecimalColor )
            {
            // InternalCinEditor.g:4980:2: ( ruleHexadecimalColor )
            // InternalCinEditor.g:4981:3: ruleHexadecimalColor
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
    // InternalCinEditor.g:4990:1: rule__Rectangle__PositionAssignment_4 : ( rulePosition ) ;
    public final void rule__Rectangle__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:4994:1: ( ( rulePosition ) )
            // InternalCinEditor.g:4995:2: ( rulePosition )
            {
            // InternalCinEditor.g:4995:2: ( rulePosition )
            // InternalCinEditor.g:4996:3: rulePosition
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
    // InternalCinEditor.g:5005:1: rule__Rectangle__DimensionAssignment_5 : ( ruleDimension ) ;
    public final void rule__Rectangle__DimensionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5009:1: ( ( ruleDimension ) )
            // InternalCinEditor.g:5010:2: ( ruleDimension )
            {
            // InternalCinEditor.g:5010:2: ( ruleDimension )
            // InternalCinEditor.g:5011:3: ruleDimension
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
    // InternalCinEditor.g:5020:1: rule__Rectangle__BeginTimeAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Rectangle__BeginTimeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5024:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5025:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5025:2: ( ruleEInt )
            // InternalCinEditor.g:5026:3: ruleEInt
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
    // InternalCinEditor.g:5035:1: rule__Rectangle__DurationAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__Rectangle__DurationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5039:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5040:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5040:2: ( ruleEInt )
            // InternalCinEditor.g:5041:3: ruleEInt
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
    // InternalCinEditor.g:5050:1: rule__FadeIn__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FadeIn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5054:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5055:2: ( ruleEString )
            {
            // InternalCinEditor.g:5055:2: ( ruleEString )
            // InternalCinEditor.g:5056:3: ruleEString
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
    // InternalCinEditor.g:5065:1: rule__FadeIn__DurationAssignment_5 : ( ruleEInt ) ;
    public final void rule__FadeIn__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5069:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5070:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5070:2: ( ruleEInt )
            // InternalCinEditor.g:5071:3: ruleEInt
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
    // InternalCinEditor.g:5080:1: rule__FadeIn__ElementAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__FadeIn__ElementAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5084:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:5085:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:5085:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:5086:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeInAccess().getElementGraphicalElementCrossReference_7_0()); 
            // InternalCinEditor.g:5087:3: ( RULE_ID )
            // InternalCinEditor.g:5088:4: RULE_ID
            {
             before(grammarAccess.getFadeInAccess().getElementGraphicalElementIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getElementGraphicalElementIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getFadeInAccess().getElementGraphicalElementCrossReference_7_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:5099:1: rule__FadeOut__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FadeOut__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5103:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5104:2: ( ruleEString )
            {
            // InternalCinEditor.g:5104:2: ( ruleEString )
            // InternalCinEditor.g:5105:3: ruleEString
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
    // InternalCinEditor.g:5114:1: rule__FadeOut__DurationAssignment_5 : ( ruleEInt ) ;
    public final void rule__FadeOut__DurationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5118:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5119:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5119:2: ( ruleEInt )
            // InternalCinEditor.g:5120:3: ruleEInt
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
    // InternalCinEditor.g:5129:1: rule__FadeOut__ElementAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__FadeOut__ElementAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5133:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:5134:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:5134:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:5135:3: ( RULE_ID )
            {
             before(grammarAccess.getFadeOutAccess().getElementGraphicalElementCrossReference_7_0()); 
            // InternalCinEditor.g:5136:3: ( RULE_ID )
            // InternalCinEditor.g:5137:4: RULE_ID
            {
             before(grammarAccess.getFadeOutAccess().getElementGraphicalElementIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getElementGraphicalElementIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getFadeOutAccess().getElementGraphicalElementCrossReference_7_0()); 

            }


            }

        }
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
    // InternalCinEditor.g:5148:1: rule__Translate__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Translate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5152:1: ( ( ruleEString ) )
            // InternalCinEditor.g:5153:2: ( ruleEString )
            {
            // InternalCinEditor.g:5153:2: ( ruleEString )
            // InternalCinEditor.g:5154:3: ruleEString
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
    // InternalCinEditor.g:5163:1: rule__Translate__PositionToTranslateAssignment_4 : ( rulePosition ) ;
    public final void rule__Translate__PositionToTranslateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5167:1: ( ( rulePosition ) )
            // InternalCinEditor.g:5168:2: ( rulePosition )
            {
            // InternalCinEditor.g:5168:2: ( rulePosition )
            // InternalCinEditor.g:5169:3: rulePosition
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
    // InternalCinEditor.g:5178:1: rule__Translate__BeginTimeAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Translate__BeginTimeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5182:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5183:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5183:2: ( ruleEInt )
            // InternalCinEditor.g:5184:3: ruleEInt
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
    // InternalCinEditor.g:5193:1: rule__Translate__DurationAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Translate__DurationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5197:1: ( ( ruleEInt ) )
            // InternalCinEditor.g:5198:2: ( ruleEInt )
            {
            // InternalCinEditor.g:5198:2: ( ruleEInt )
            // InternalCinEditor.g:5199:3: ruleEInt
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


    // $ANTLR start "rule__Translate__ElementAssignment_8"
    // InternalCinEditor.g:5208:1: rule__Translate__ElementAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Translate__ElementAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCinEditor.g:5212:1: ( ( ( RULE_ID ) ) )
            // InternalCinEditor.g:5213:2: ( ( RULE_ID ) )
            {
            // InternalCinEditor.g:5213:2: ( ( RULE_ID ) )
            // InternalCinEditor.g:5214:3: ( RULE_ID )
            {
             before(grammarAccess.getTranslateAccess().getElementGraphicalElementCrossReference_8_0()); 
            // InternalCinEditor.g:5215:3: ( RULE_ID )
            // InternalCinEditor.g:5216:4: RULE_ID
            {
             before(grammarAccess.getTranslateAccess().getElementGraphicalElementIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTranslateAccess().getElementGraphicalElementIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getTranslateAccess().getElementGraphicalElementCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Translate__ElementAssignment_8"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\34\1\uffff\1\4\1\uffff\2\35\1\53\3\uffff";
    static final String dfa_3s = "\1\52\1\uffff\1\5\1\uffff\2\35\1\55\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\5\3\uffff\1\4\1\3\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\7\uffff\1\1\1\uffff\2\1\1\uffff\1\1\1\2",
            "",
            "\1\4\1\5",
            "",
            "\1\6",
            "\1\6",
            "\1\11\1\10\1\7",
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
            return "577:1: rule__Element__Alternatives : ( ( ruleGraphicalElement ) | ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleTranslate ) | ( ruleAudioElement ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000006D010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000006D010000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000800F840L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000FC0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002C04200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000C01200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000C40000000L});

}