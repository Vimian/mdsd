package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

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
import dk.sdu.mmmi.mdsd.services.UiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUiParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'form'", "'{'", "'}'", "'column'", "'row'", "'label'", "':'", "'input'", "'button'", "'button*'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'string'", "'#string'", "'number'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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


        public InternalUiParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUiParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUiParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUi.g"; }


    	private UiGrammarAccess grammarAccess;

    	public void setGrammarAccess(UiGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleUI23"
    // InternalUi.g:53:1: entryRuleUI23 : ruleUI23 EOF ;
    public final void entryRuleUI23() throws RecognitionException {
        try {
            // InternalUi.g:54:1: ( ruleUI23 EOF )
            // InternalUi.g:55:1: ruleUI23 EOF
            {
             before(grammarAccess.getUI23Rule()); 
            pushFollow(FOLLOW_1);
            ruleUI23();

            state._fsp--;

             after(grammarAccess.getUI23Rule()); 
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
    // $ANTLR end "entryRuleUI23"


    // $ANTLR start "ruleUI23"
    // InternalUi.g:62:1: ruleUI23 : ( ( rule__UI23__Group__0 ) ) ;
    public final void ruleUI23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:66:2: ( ( ( rule__UI23__Group__0 ) ) )
            // InternalUi.g:67:2: ( ( rule__UI23__Group__0 ) )
            {
            // InternalUi.g:67:2: ( ( rule__UI23__Group__0 ) )
            // InternalUi.g:68:3: ( rule__UI23__Group__0 )
            {
             before(grammarAccess.getUI23Access().getGroup()); 
            // InternalUi.g:69:3: ( rule__UI23__Group__0 )
            // InternalUi.g:69:4: rule__UI23__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UI23__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUI23Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUI23"


    // $ANTLR start "entryRuleForm"
    // InternalUi.g:78:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalUi.g:79:1: ( ruleForm EOF )
            // InternalUi.g:80:1: ruleForm EOF
            {
             before(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getFormRule()); 
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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalUi.g:87:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:91:2: ( ( ( rule__Form__Group__0 ) ) )
            // InternalUi.g:92:2: ( ( rule__Form__Group__0 ) )
            {
            // InternalUi.g:92:2: ( ( rule__Form__Group__0 ) )
            // InternalUi.g:93:3: ( rule__Form__Group__0 )
            {
             before(grammarAccess.getFormAccess().getGroup()); 
            // InternalUi.g:94:3: ( rule__Form__Group__0 )
            // InternalUi.g:94:4: rule__Form__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleLayout"
    // InternalUi.g:103:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // InternalUi.g:104:1: ( ruleLayout EOF )
            // InternalUi.g:105:1: ruleLayout EOF
            {
             before(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getLayoutRule()); 
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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalUi.g:112:1: ruleLayout : ( ( rule__Layout__Alternatives ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:116:2: ( ( ( rule__Layout__Alternatives ) ) )
            // InternalUi.g:117:2: ( ( rule__Layout__Alternatives ) )
            {
            // InternalUi.g:117:2: ( ( rule__Layout__Alternatives ) )
            // InternalUi.g:118:3: ( rule__Layout__Alternatives )
            {
             before(grammarAccess.getLayoutAccess().getAlternatives()); 
            // InternalUi.g:119:3: ( rule__Layout__Alternatives )
            // InternalUi.g:119:4: rule__Layout__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Layout__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleColumn"
    // InternalUi.g:128:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalUi.g:129:1: ( ruleColumn EOF )
            // InternalUi.g:130:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalUi.g:137:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:141:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalUi.g:142:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalUi.g:142:2: ( ( rule__Column__Group__0 ) )
            // InternalUi.g:143:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalUi.g:144:3: ( rule__Column__Group__0 )
            // InternalUi.g:144:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleRow"
    // InternalUi.g:153:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalUi.g:154:1: ( ruleRow EOF )
            // InternalUi.g:155:1: ruleRow EOF
            {
             before(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getRowRule()); 
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
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalUi.g:162:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:166:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalUi.g:167:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalUi.g:167:2: ( ( rule__Row__Group__0 ) )
            // InternalUi.g:168:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalUi.g:169:3: ( rule__Row__Group__0 )
            // InternalUi.g:169:4: rule__Row__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleElement"
    // InternalUi.g:178:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalUi.g:179:1: ( ruleElement EOF )
            // InternalUi.g:180:1: ruleElement EOF
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
    // InternalUi.g:187:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:191:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalUi.g:192:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalUi.g:192:2: ( ( rule__Element__Alternatives ) )
            // InternalUi.g:193:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalUi.g:194:3: ( rule__Element__Alternatives )
            // InternalUi.g:194:4: rule__Element__Alternatives
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


    // $ANTLR start "entryRuleLabel"
    // InternalUi.g:203:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalUi.g:204:1: ( ruleLabel EOF )
            // InternalUi.g:205:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalUi.g:212:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:216:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalUi.g:217:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalUi.g:217:2: ( ( rule__Label__Group__0 ) )
            // InternalUi.g:218:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalUi.g:219:3: ( rule__Label__Group__0 )
            // InternalUi.g:219:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleInput"
    // InternalUi.g:228:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalUi.g:229:1: ( ruleInput EOF )
            // InternalUi.g:230:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalUi.g:237:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:241:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalUi.g:242:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalUi.g:242:2: ( ( rule__Input__Group__0 ) )
            // InternalUi.g:243:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalUi.g:244:3: ( rule__Input__Group__0 )
            // InternalUi.g:244:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleButton"
    // InternalUi.g:253:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalUi.g:254:1: ( ruleButton EOF )
            // InternalUi.g:255:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalUi.g:262:1: ruleButton : ( ( rule__Button__Alternatives ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:266:2: ( ( ( rule__Button__Alternatives ) ) )
            // InternalUi.g:267:2: ( ( rule__Button__Alternatives ) )
            {
            // InternalUi.g:267:2: ( ( rule__Button__Alternatives ) )
            // InternalUi.g:268:3: ( rule__Button__Alternatives )
            {
             before(grammarAccess.getButtonAccess().getAlternatives()); 
            // InternalUi.g:269:3: ( rule__Button__Alternatives )
            // InternalUi.g:269:4: rule__Button__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Button__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleType"
    // InternalUi.g:278:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUi.g:279:1: ( ruleType EOF )
            // InternalUi.g:280:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalUi.g:287:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:291:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalUi.g:292:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalUi.g:292:2: ( ( rule__Type__Alternatives ) )
            // InternalUi.g:293:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalUi.g:294:3: ( rule__Type__Alternatives )
            // InternalUi.g:294:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExp"
    // InternalUi.g:303:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalUi.g:304:1: ( ruleExp EOF )
            // InternalUi.g:305:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalUi.g:312:1: ruleExp : ( ruleBooleanExp ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:316:2: ( ( ruleBooleanExp ) )
            // InternalUi.g:317:2: ( ruleBooleanExp )
            {
            // InternalUi.g:317:2: ( ruleBooleanExp )
            // InternalUi.g:318:3: ruleBooleanExp
            {
             before(grammarAccess.getExpAccess().getBooleanExpParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleBooleanExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getBooleanExpParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleBooleanExp"
    // InternalUi.g:328:1: entryRuleBooleanExp : ruleBooleanExp EOF ;
    public final void entryRuleBooleanExp() throws RecognitionException {
        try {
            // InternalUi.g:329:1: ( ruleBooleanExp EOF )
            // InternalUi.g:330:1: ruleBooleanExp EOF
            {
             before(grammarAccess.getBooleanExpRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanExp();

            state._fsp--;

             after(grammarAccess.getBooleanExpRule()); 
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
    // $ANTLR end "entryRuleBooleanExp"


    // $ANTLR start "ruleBooleanExp"
    // InternalUi.g:337:1: ruleBooleanExp : ( ( rule__BooleanExp__Group__0 ) ) ;
    public final void ruleBooleanExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:341:2: ( ( ( rule__BooleanExp__Group__0 ) ) )
            // InternalUi.g:342:2: ( ( rule__BooleanExp__Group__0 ) )
            {
            // InternalUi.g:342:2: ( ( rule__BooleanExp__Group__0 ) )
            // InternalUi.g:343:3: ( rule__BooleanExp__Group__0 )
            {
             before(grammarAccess.getBooleanExpAccess().getGroup()); 
            // InternalUi.g:344:3: ( rule__BooleanExp__Group__0 )
            // InternalUi.g:344:4: rule__BooleanExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExp"


    // $ANTLR start "entryRuleEqualityExp"
    // InternalUi.g:353:1: entryRuleEqualityExp : ruleEqualityExp EOF ;
    public final void entryRuleEqualityExp() throws RecognitionException {
        try {
            // InternalUi.g:354:1: ( ruleEqualityExp EOF )
            // InternalUi.g:355:1: ruleEqualityExp EOF
            {
             before(grammarAccess.getEqualityExpRule()); 
            pushFollow(FOLLOW_1);
            ruleEqualityExp();

            state._fsp--;

             after(grammarAccess.getEqualityExpRule()); 
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
    // $ANTLR end "entryRuleEqualityExp"


    // $ANTLR start "ruleEqualityExp"
    // InternalUi.g:362:1: ruleEqualityExp : ( ( rule__EqualityExp__Group__0 ) ) ;
    public final void ruleEqualityExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:366:2: ( ( ( rule__EqualityExp__Group__0 ) ) )
            // InternalUi.g:367:2: ( ( rule__EqualityExp__Group__0 ) )
            {
            // InternalUi.g:367:2: ( ( rule__EqualityExp__Group__0 ) )
            // InternalUi.g:368:3: ( rule__EqualityExp__Group__0 )
            {
             before(grammarAccess.getEqualityExpAccess().getGroup()); 
            // InternalUi.g:369:3: ( rule__EqualityExp__Group__0 )
            // InternalUi.g:369:4: rule__EqualityExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualityExp"


    // $ANTLR start "entryRuleLessGreaterExp"
    // InternalUi.g:378:1: entryRuleLessGreaterExp : ruleLessGreaterExp EOF ;
    public final void entryRuleLessGreaterExp() throws RecognitionException {
        try {
            // InternalUi.g:379:1: ( ruleLessGreaterExp EOF )
            // InternalUi.g:380:1: ruleLessGreaterExp EOF
            {
             before(grammarAccess.getLessGreaterExpRule()); 
            pushFollow(FOLLOW_1);
            ruleLessGreaterExp();

            state._fsp--;

             after(grammarAccess.getLessGreaterExpRule()); 
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
    // $ANTLR end "entryRuleLessGreaterExp"


    // $ANTLR start "ruleLessGreaterExp"
    // InternalUi.g:387:1: ruleLessGreaterExp : ( ( rule__LessGreaterExp__Group__0 ) ) ;
    public final void ruleLessGreaterExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:391:2: ( ( ( rule__LessGreaterExp__Group__0 ) ) )
            // InternalUi.g:392:2: ( ( rule__LessGreaterExp__Group__0 ) )
            {
            // InternalUi.g:392:2: ( ( rule__LessGreaterExp__Group__0 ) )
            // InternalUi.g:393:3: ( rule__LessGreaterExp__Group__0 )
            {
             before(grammarAccess.getLessGreaterExpAccess().getGroup()); 
            // InternalUi.g:394:3: ( rule__LessGreaterExp__Group__0 )
            // InternalUi.g:394:4: rule__LessGreaterExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLessGreaterExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLessGreaterExp"


    // $ANTLR start "entryRulePrimary"
    // InternalUi.g:403:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalUi.g:404:1: ( rulePrimary EOF )
            // InternalUi.g:405:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalUi.g:412:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:416:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalUi.g:417:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalUi.g:417:2: ( ( rule__Primary__Alternatives ) )
            // InternalUi.g:418:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalUi.g:419:3: ( rule__Primary__Alternatives )
            // InternalUi.g:419:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleInputUse"
    // InternalUi.g:428:1: entryRuleInputUse : ruleInputUse EOF ;
    public final void entryRuleInputUse() throws RecognitionException {
        try {
            // InternalUi.g:429:1: ( ruleInputUse EOF )
            // InternalUi.g:430:1: ruleInputUse EOF
            {
             before(grammarAccess.getInputUseRule()); 
            pushFollow(FOLLOW_1);
            ruleInputUse();

            state._fsp--;

             after(grammarAccess.getInputUseRule()); 
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
    // $ANTLR end "entryRuleInputUse"


    // $ANTLR start "ruleInputUse"
    // InternalUi.g:437:1: ruleInputUse : ( ( rule__InputUse__RefAssignment ) ) ;
    public final void ruleInputUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:441:2: ( ( ( rule__InputUse__RefAssignment ) ) )
            // InternalUi.g:442:2: ( ( rule__InputUse__RefAssignment ) )
            {
            // InternalUi.g:442:2: ( ( rule__InputUse__RefAssignment ) )
            // InternalUi.g:443:3: ( rule__InputUse__RefAssignment )
            {
             before(grammarAccess.getInputUseAccess().getRefAssignment()); 
            // InternalUi.g:444:3: ( rule__InputUse__RefAssignment )
            // InternalUi.g:444:4: rule__InputUse__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__InputUse__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInputUseAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputUse"


    // $ANTLR start "rule__Layout__Alternatives"
    // InternalUi.g:452:1: rule__Layout__Alternatives : ( ( ruleColumn ) | ( ruleRow ) );
    public final void rule__Layout__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:456:1: ( ( ruleColumn ) | ( ruleRow ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalUi.g:457:2: ( ruleColumn )
                    {
                    // InternalUi.g:457:2: ( ruleColumn )
                    // InternalUi.g:458:3: ruleColumn
                    {
                     before(grammarAccess.getLayoutAccess().getColumnParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColumn();

                    state._fsp--;

                     after(grammarAccess.getLayoutAccess().getColumnParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi.g:463:2: ( ruleRow )
                    {
                    // InternalUi.g:463:2: ( ruleRow )
                    // InternalUi.g:464:3: ruleRow
                    {
                     before(grammarAccess.getLayoutAccess().getRowParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRow();

                    state._fsp--;

                     after(grammarAccess.getLayoutAccess().getRowParserRuleCall_1()); 

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
    // $ANTLR end "rule__Layout__Alternatives"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalUi.g:473:1: rule__Element__Alternatives : ( ( ruleLabel ) | ( ruleInput ) | ( ruleButton ) | ( ruleLayout ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:477:1: ( ( ruleLabel ) | ( ruleInput ) | ( ruleButton ) | ( ruleLayout ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
            case 21:
                {
                alt2=3;
                }
                break;
            case 15:
            case 16:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalUi.g:478:2: ( ruleLabel )
                    {
                    // InternalUi.g:478:2: ( ruleLabel )
                    // InternalUi.g:479:3: ruleLabel
                    {
                     before(grammarAccess.getElementAccess().getLabelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getLabelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi.g:484:2: ( ruleInput )
                    {
                    // InternalUi.g:484:2: ( ruleInput )
                    // InternalUi.g:485:3: ruleInput
                    {
                     before(grammarAccess.getElementAccess().getInputParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInput();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getInputParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUi.g:490:2: ( ruleButton )
                    {
                    // InternalUi.g:490:2: ( ruleButton )
                    // InternalUi.g:491:3: ruleButton
                    {
                     before(grammarAccess.getElementAccess().getButtonParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getButtonParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUi.g:496:2: ( ruleLayout )
                    {
                    // InternalUi.g:496:2: ( ruleLayout )
                    // InternalUi.g:497:3: ruleLayout
                    {
                     before(grammarAccess.getElementAccess().getLayoutParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLayout();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getLayoutParserRuleCall_3()); 

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


    // $ANTLR start "rule__Button__Alternatives"
    // InternalUi.g:506:1: rule__Button__Alternatives : ( ( ( rule__Button__Group_0__0 ) ) | ( ( rule__Button__Group_1__0 ) ) );
    public final void rule__Button__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:510:1: ( ( ( rule__Button__Group_0__0 ) ) | ( ( rule__Button__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUi.g:511:2: ( ( rule__Button__Group_0__0 ) )
                    {
                    // InternalUi.g:511:2: ( ( rule__Button__Group_0__0 ) )
                    // InternalUi.g:512:3: ( rule__Button__Group_0__0 )
                    {
                     before(grammarAccess.getButtonAccess().getGroup_0()); 
                    // InternalUi.g:513:3: ( rule__Button__Group_0__0 )
                    // InternalUi.g:513:4: rule__Button__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Button__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getButtonAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi.g:517:2: ( ( rule__Button__Group_1__0 ) )
                    {
                    // InternalUi.g:517:2: ( ( rule__Button__Group_1__0 ) )
                    // InternalUi.g:518:3: ( rule__Button__Group_1__0 )
                    {
                     before(grammarAccess.getButtonAccess().getGroup_1()); 
                    // InternalUi.g:519:3: ( rule__Button__Group_1__0 )
                    // InternalUi.g:519:4: rule__Button__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Button__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getButtonAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Button__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalUi.g:527:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:531:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt4=1;
                }
                break;
            case 31:
                {
                alt4=2;
                }
                break;
            case 32:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalUi.g:532:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalUi.g:532:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalUi.g:533:3: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalUi.g:534:3: ( rule__Type__Group_0__0 )
                    // InternalUi.g:534:4: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi.g:538:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalUi.g:538:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalUi.g:539:3: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // InternalUi.g:540:3: ( rule__Type__Group_1__0 )
                    // InternalUi.g:540:4: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUi.g:544:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalUi.g:544:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalUi.g:545:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalUi.g:546:3: ( rule__Type__Group_2__0 )
                    // InternalUi.g:546:4: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__BooleanExp__Alternatives_1"
    // InternalUi.g:554:1: rule__BooleanExp__Alternatives_1 : ( ( ( rule__BooleanExp__Group_1_0__0 ) ) | ( ( rule__BooleanExp__Group_1_1__0 ) ) );
    public final void rule__BooleanExp__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:558:1: ( ( ( rule__BooleanExp__Group_1_0__0 ) ) | ( ( rule__BooleanExp__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUi.g:559:2: ( ( rule__BooleanExp__Group_1_0__0 ) )
                    {
                    // InternalUi.g:559:2: ( ( rule__BooleanExp__Group_1_0__0 ) )
                    // InternalUi.g:560:3: ( rule__BooleanExp__Group_1_0__0 )
                    {
                     before(grammarAccess.getBooleanExpAccess().getGroup_1_0()); 
                    // InternalUi.g:561:3: ( rule__BooleanExp__Group_1_0__0 )
                    // InternalUi.g:561:4: rule__BooleanExp__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanExp__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanExpAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi.g:565:2: ( ( rule__BooleanExp__Group_1_1__0 ) )
                    {
                    // InternalUi.g:565:2: ( ( rule__BooleanExp__Group_1_1__0 ) )
                    // InternalUi.g:566:3: ( rule__BooleanExp__Group_1_1__0 )
                    {
                     before(grammarAccess.getBooleanExpAccess().getGroup_1_1()); 
                    // InternalUi.g:567:3: ( rule__BooleanExp__Group_1_1__0 )
                    // InternalUi.g:567:4: rule__BooleanExp__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanExp__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanExpAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__BooleanExp__Alternatives_1"


    // $ANTLR start "rule__EqualityExp__Alternatives_1"
    // InternalUi.g:575:1: rule__EqualityExp__Alternatives_1 : ( ( ( rule__EqualityExp__Group_1_0__0 ) ) | ( ( rule__EqualityExp__Group_1_1__0 ) ) );
    public final void rule__EqualityExp__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:579:1: ( ( ( rule__EqualityExp__Group_1_0__0 ) ) | ( ( rule__EqualityExp__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUi.g:580:2: ( ( rule__EqualityExp__Group_1_0__0 ) )
                    {
                    // InternalUi.g:580:2: ( ( rule__EqualityExp__Group_1_0__0 ) )
                    // InternalUi.g:581:3: ( rule__EqualityExp__Group_1_0__0 )
                    {
                     before(grammarAccess.getEqualityExpAccess().getGroup_1_0()); 
                    // InternalUi.g:582:3: ( rule__EqualityExp__Group_1_0__0 )
                    // InternalUi.g:582:4: rule__EqualityExp__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EqualityExp__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEqualityExpAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi.g:586:2: ( ( rule__EqualityExp__Group_1_1__0 ) )
                    {
                    // InternalUi.g:586:2: ( ( rule__EqualityExp__Group_1_1__0 ) )
                    // InternalUi.g:587:3: ( rule__EqualityExp__Group_1_1__0 )
                    {
                     before(grammarAccess.getEqualityExpAccess().getGroup_1_1()); 
                    // InternalUi.g:588:3: ( rule__EqualityExp__Group_1_1__0 )
                    // InternalUi.g:588:4: rule__EqualityExp__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EqualityExp__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEqualityExpAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__EqualityExp__Alternatives_1"


    // $ANTLR start "rule__LessGreaterExp__Alternatives_1"
    // InternalUi.g:596:1: rule__LessGreaterExp__Alternatives_1 : ( ( ( rule__LessGreaterExp__Group_1_0__0 ) ) | ( ( rule__LessGreaterExp__Group_1_1__0 ) ) | ( ( rule__LessGreaterExp__Group_1_2__0 ) ) | ( ( rule__LessGreaterExp__Group_1_3__0 ) ) );
    public final void rule__LessGreaterExp__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:600:1: ( ( ( rule__LessGreaterExp__Group_1_0__0 ) ) | ( ( rule__LessGreaterExp__Group_1_1__0 ) ) | ( ( rule__LessGreaterExp__Group_1_2__0 ) ) | ( ( rule__LessGreaterExp__Group_1_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 29:
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
                    // InternalUi.g:601:2: ( ( rule__LessGreaterExp__Group_1_0__0 ) )
                    {
                    // InternalUi.g:601:2: ( ( rule__LessGreaterExp__Group_1_0__0 ) )
                    // InternalUi.g:602:3: ( rule__LessGreaterExp__Group_1_0__0 )
                    {
                     before(grammarAccess.getLessGreaterExpAccess().getGroup_1_0()); 
                    // InternalUi.g:603:3: ( rule__LessGreaterExp__Group_1_0__0 )
                    // InternalUi.g:603:4: rule__LessGreaterExp__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LessGreaterExp__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLessGreaterExpAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi.g:607:2: ( ( rule__LessGreaterExp__Group_1_1__0 ) )
                    {
                    // InternalUi.g:607:2: ( ( rule__LessGreaterExp__Group_1_1__0 ) )
                    // InternalUi.g:608:3: ( rule__LessGreaterExp__Group_1_1__0 )
                    {
                     before(grammarAccess.getLessGreaterExpAccess().getGroup_1_1()); 
                    // InternalUi.g:609:3: ( rule__LessGreaterExp__Group_1_1__0 )
                    // InternalUi.g:609:4: rule__LessGreaterExp__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LessGreaterExp__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLessGreaterExpAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUi.g:613:2: ( ( rule__LessGreaterExp__Group_1_2__0 ) )
                    {
                    // InternalUi.g:613:2: ( ( rule__LessGreaterExp__Group_1_2__0 ) )
                    // InternalUi.g:614:3: ( rule__LessGreaterExp__Group_1_2__0 )
                    {
                     before(grammarAccess.getLessGreaterExpAccess().getGroup_1_2()); 
                    // InternalUi.g:615:3: ( rule__LessGreaterExp__Group_1_2__0 )
                    // InternalUi.g:615:4: rule__LessGreaterExp__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LessGreaterExp__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLessGreaterExpAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUi.g:619:2: ( ( rule__LessGreaterExp__Group_1_3__0 ) )
                    {
                    // InternalUi.g:619:2: ( ( rule__LessGreaterExp__Group_1_3__0 ) )
                    // InternalUi.g:620:3: ( rule__LessGreaterExp__Group_1_3__0 )
                    {
                     before(grammarAccess.getLessGreaterExpAccess().getGroup_1_3()); 
                    // InternalUi.g:621:3: ( rule__LessGreaterExp__Group_1_3__0 )
                    // InternalUi.g:621:4: rule__LessGreaterExp__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LessGreaterExp__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLessGreaterExpAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__LessGreaterExp__Alternatives_1"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalUi.g:629:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__TypeAssignment_1 ) ) | ( ruleInputUse ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:633:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__TypeAssignment_1 ) ) | ( ruleInputUse ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case 30:
            case 31:
            case 32:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalUi.g:634:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalUi.g:634:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalUi.g:635:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalUi.g:636:3: ( rule__Primary__Group_0__0 )
                    // InternalUi.g:636:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUi.g:640:2: ( ( rule__Primary__TypeAssignment_1 ) )
                    {
                    // InternalUi.g:640:2: ( ( rule__Primary__TypeAssignment_1 ) )
                    // InternalUi.g:641:3: ( rule__Primary__TypeAssignment_1 )
                    {
                     before(grammarAccess.getPrimaryAccess().getTypeAssignment_1()); 
                    // InternalUi.g:642:3: ( rule__Primary__TypeAssignment_1 )
                    // InternalUi.g:642:4: rule__Primary__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__TypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUi.g:646:2: ( ruleInputUse )
                    {
                    // InternalUi.g:646:2: ( ruleInputUse )
                    // InternalUi.g:647:3: ruleInputUse
                    {
                     before(grammarAccess.getPrimaryAccess().getInputUseParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInputUse();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getInputUseParserRuleCall_2()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__UI23__Group__0"
    // InternalUi.g:656:1: rule__UI23__Group__0 : rule__UI23__Group__0__Impl rule__UI23__Group__1 ;
    public final void rule__UI23__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:660:1: ( rule__UI23__Group__0__Impl rule__UI23__Group__1 )
            // InternalUi.g:661:2: rule__UI23__Group__0__Impl rule__UI23__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UI23__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UI23__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI23__Group__0"


    // $ANTLR start "rule__UI23__Group__0__Impl"
    // InternalUi.g:668:1: rule__UI23__Group__0__Impl : ( 'title' ) ;
    public final void rule__UI23__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:672:1: ( ( 'title' ) )
            // InternalUi.g:673:1: ( 'title' )
            {
            // InternalUi.g:673:1: ( 'title' )
            // InternalUi.g:674:2: 'title'
            {
             before(grammarAccess.getUI23Access().getTitleKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUI23Access().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI23__Group__0__Impl"


    // $ANTLR start "rule__UI23__Group__1"
    // InternalUi.g:683:1: rule__UI23__Group__1 : rule__UI23__Group__1__Impl rule__UI23__Group__2 ;
    public final void rule__UI23__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:687:1: ( rule__UI23__Group__1__Impl rule__UI23__Group__2 )
            // InternalUi.g:688:2: rule__UI23__Group__1__Impl rule__UI23__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UI23__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UI23__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI23__Group__1"


    // $ANTLR start "rule__UI23__Group__1__Impl"
    // InternalUi.g:695:1: rule__UI23__Group__1__Impl : ( ( rule__UI23__NameAssignment_1 ) ) ;
    public final void rule__UI23__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:699:1: ( ( ( rule__UI23__NameAssignment_1 ) ) )
            // InternalUi.g:700:1: ( ( rule__UI23__NameAssignment_1 ) )
            {
            // InternalUi.g:700:1: ( ( rule__UI23__NameAssignment_1 ) )
            // InternalUi.g:701:2: ( rule__UI23__NameAssignment_1 )
            {
             before(grammarAccess.getUI23Access().getNameAssignment_1()); 
            // InternalUi.g:702:2: ( rule__UI23__NameAssignment_1 )
            // InternalUi.g:702:3: rule__UI23__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UI23__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUI23Access().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI23__Group__1__Impl"


    // $ANTLR start "rule__UI23__Group__2"
    // InternalUi.g:710:1: rule__UI23__Group__2 : rule__UI23__Group__2__Impl ;
    public final void rule__UI23__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:714:1: ( rule__UI23__Group__2__Impl )
            // InternalUi.g:715:2: rule__UI23__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UI23__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI23__Group__2"


    // $ANTLR start "rule__UI23__Group__2__Impl"
    // InternalUi.g:721:1: rule__UI23__Group__2__Impl : ( ( rule__UI23__FormAssignment_2 ) ) ;
    public final void rule__UI23__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:725:1: ( ( ( rule__UI23__FormAssignment_2 ) ) )
            // InternalUi.g:726:1: ( ( rule__UI23__FormAssignment_2 ) )
            {
            // InternalUi.g:726:1: ( ( rule__UI23__FormAssignment_2 ) )
            // InternalUi.g:727:2: ( rule__UI23__FormAssignment_2 )
            {
             before(grammarAccess.getUI23Access().getFormAssignment_2()); 
            // InternalUi.g:728:2: ( rule__UI23__FormAssignment_2 )
            // InternalUi.g:728:3: rule__UI23__FormAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UI23__FormAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUI23Access().getFormAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI23__Group__2__Impl"


    // $ANTLR start "rule__Form__Group__0"
    // InternalUi.g:737:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:741:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalUi.g:742:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Form__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0"


    // $ANTLR start "rule__Form__Group__0__Impl"
    // InternalUi.g:749:1: rule__Form__Group__0__Impl : ( 'form' ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:753:1: ( ( 'form' ) )
            // InternalUi.g:754:1: ( 'form' )
            {
            // InternalUi.g:754:1: ( 'form' )
            // InternalUi.g:755:2: 'form'
            {
             before(grammarAccess.getFormAccess().getFormKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getFormKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0__Impl"


    // $ANTLR start "rule__Form__Group__1"
    // InternalUi.g:764:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:768:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalUi.g:769:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Form__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1"


    // $ANTLR start "rule__Form__Group__1__Impl"
    // InternalUi.g:776:1: rule__Form__Group__1__Impl : ( ( rule__Form__NameAssignment_1 ) ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:780:1: ( ( ( rule__Form__NameAssignment_1 ) ) )
            // InternalUi.g:781:1: ( ( rule__Form__NameAssignment_1 ) )
            {
            // InternalUi.g:781:1: ( ( rule__Form__NameAssignment_1 ) )
            // InternalUi.g:782:2: ( rule__Form__NameAssignment_1 )
            {
             before(grammarAccess.getFormAccess().getNameAssignment_1()); 
            // InternalUi.g:783:2: ( rule__Form__NameAssignment_1 )
            // InternalUi.g:783:3: rule__Form__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Form__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__2"
    // InternalUi.g:791:1: rule__Form__Group__2 : rule__Form__Group__2__Impl rule__Form__Group__3 ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:795:1: ( rule__Form__Group__2__Impl rule__Form__Group__3 )
            // InternalUi.g:796:2: rule__Form__Group__2__Impl rule__Form__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Form__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2"


    // $ANTLR start "rule__Form__Group__2__Impl"
    // InternalUi.g:803:1: rule__Form__Group__2__Impl : ( '{' ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:807:1: ( ( '{' ) )
            // InternalUi.g:808:1: ( '{' )
            {
            // InternalUi.g:808:1: ( '{' )
            // InternalUi.g:809:2: '{'
            {
             before(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2__Impl"


    // $ANTLR start "rule__Form__Group__3"
    // InternalUi.g:818:1: rule__Form__Group__3 : rule__Form__Group__3__Impl rule__Form__Group__4 ;
    public final void rule__Form__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:822:1: ( rule__Form__Group__3__Impl rule__Form__Group__4 )
            // InternalUi.g:823:2: rule__Form__Group__3__Impl rule__Form__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Form__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__3"


    // $ANTLR start "rule__Form__Group__3__Impl"
    // InternalUi.g:830:1: rule__Form__Group__3__Impl : ( ( rule__Form__LayoutAssignment_3 ) ) ;
    public final void rule__Form__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:834:1: ( ( ( rule__Form__LayoutAssignment_3 ) ) )
            // InternalUi.g:835:1: ( ( rule__Form__LayoutAssignment_3 ) )
            {
            // InternalUi.g:835:1: ( ( rule__Form__LayoutAssignment_3 ) )
            // InternalUi.g:836:2: ( rule__Form__LayoutAssignment_3 )
            {
             before(grammarAccess.getFormAccess().getLayoutAssignment_3()); 
            // InternalUi.g:837:2: ( rule__Form__LayoutAssignment_3 )
            // InternalUi.g:837:3: rule__Form__LayoutAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Form__LayoutAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getLayoutAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__3__Impl"


    // $ANTLR start "rule__Form__Group__4"
    // InternalUi.g:845:1: rule__Form__Group__4 : rule__Form__Group__4__Impl ;
    public final void rule__Form__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:849:1: ( rule__Form__Group__4__Impl )
            // InternalUi.g:850:2: rule__Form__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__4"


    // $ANTLR start "rule__Form__Group__4__Impl"
    // InternalUi.g:856:1: rule__Form__Group__4__Impl : ( '}' ) ;
    public final void rule__Form__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:860:1: ( ( '}' ) )
            // InternalUi.g:861:1: ( '}' )
            {
            // InternalUi.g:861:1: ( '}' )
            // InternalUi.g:862:2: '}'
            {
             before(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalUi.g:872:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:876:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalUi.g:877:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalUi.g:884:1: rule__Column__Group__0__Impl : ( 'column' ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:888:1: ( ( 'column' ) )
            // InternalUi.g:889:1: ( 'column' )
            {
            // InternalUi.g:889:1: ( 'column' )
            // InternalUi.g:890:2: 'column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalUi.g:899:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:903:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalUi.g:904:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalUi.g:911:1: rule__Column__Group__1__Impl : ( '{' ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:915:1: ( ( '{' ) )
            // InternalUi.g:916:1: ( '{' )
            {
            // InternalUi.g:916:1: ( '{' )
            // InternalUi.g:917:2: '{'
            {
             before(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalUi.g:926:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:930:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalUi.g:931:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalUi.g:938:1: rule__Column__Group__2__Impl : ( ( ( rule__Column__ElementsAssignment_2 ) ) ( ( rule__Column__ElementsAssignment_2 )* ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:942:1: ( ( ( ( rule__Column__ElementsAssignment_2 ) ) ( ( rule__Column__ElementsAssignment_2 )* ) ) )
            // InternalUi.g:943:1: ( ( ( rule__Column__ElementsAssignment_2 ) ) ( ( rule__Column__ElementsAssignment_2 )* ) )
            {
            // InternalUi.g:943:1: ( ( ( rule__Column__ElementsAssignment_2 ) ) ( ( rule__Column__ElementsAssignment_2 )* ) )
            // InternalUi.g:944:2: ( ( rule__Column__ElementsAssignment_2 ) ) ( ( rule__Column__ElementsAssignment_2 )* )
            {
            // InternalUi.g:944:2: ( ( rule__Column__ElementsAssignment_2 ) )
            // InternalUi.g:945:3: ( rule__Column__ElementsAssignment_2 )
            {
             before(grammarAccess.getColumnAccess().getElementsAssignment_2()); 
            // InternalUi.g:946:3: ( rule__Column__ElementsAssignment_2 )
            // InternalUi.g:946:4: rule__Column__ElementsAssignment_2
            {
            pushFollow(FOLLOW_9);
            rule__Column__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getElementsAssignment_2()); 

            }

            // InternalUi.g:949:2: ( ( rule__Column__ElementsAssignment_2 )* )
            // InternalUi.g:950:3: ( rule__Column__ElementsAssignment_2 )*
            {
             before(grammarAccess.getColumnAccess().getElementsAssignment_2()); 
            // InternalUi.g:951:3: ( rule__Column__ElementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=15 && LA9_0<=17)||(LA9_0>=19 && LA9_0<=21)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUi.g:951:4: rule__Column__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Column__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getColumnAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // InternalUi.g:960:1: rule__Column__Group__3 : rule__Column__Group__3__Impl ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:964:1: ( rule__Column__Group__3__Impl )
            // InternalUi.g:965:2: rule__Column__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalUi.g:971:1: rule__Column__Group__3__Impl : ( '}' ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:975:1: ( ( '}' ) )
            // InternalUi.g:976:1: ( '}' )
            {
            // InternalUi.g:976:1: ( '}' )
            // InternalUi.g:977:2: '}'
            {
             before(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // InternalUi.g:987:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:991:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalUi.g:992:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Row__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0"


    // $ANTLR start "rule__Row__Group__0__Impl"
    // InternalUi.g:999:1: rule__Row__Group__0__Impl : ( 'row' ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1003:1: ( ( 'row' ) )
            // InternalUi.g:1004:1: ( 'row' )
            {
            // InternalUi.g:1004:1: ( 'row' )
            // InternalUi.g:1005:2: 'row'
            {
             before(grammarAccess.getRowAccess().getRowKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0__Impl"


    // $ANTLR start "rule__Row__Group__1"
    // InternalUi.g:1014:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1018:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalUi.g:1019:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Row__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1"


    // $ANTLR start "rule__Row__Group__1__Impl"
    // InternalUi.g:1026:1: rule__Row__Group__1__Impl : ( '{' ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1030:1: ( ( '{' ) )
            // InternalUi.g:1031:1: ( '{' )
            {
            // InternalUi.g:1031:1: ( '{' )
            // InternalUi.g:1032:2: '{'
            {
             before(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1__Impl"


    // $ANTLR start "rule__Row__Group__2"
    // InternalUi.g:1041:1: rule__Row__Group__2 : rule__Row__Group__2__Impl rule__Row__Group__3 ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1045:1: ( rule__Row__Group__2__Impl rule__Row__Group__3 )
            // InternalUi.g:1046:2: rule__Row__Group__2__Impl rule__Row__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Row__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2"


    // $ANTLR start "rule__Row__Group__2__Impl"
    // InternalUi.g:1053:1: rule__Row__Group__2__Impl : ( ( ( rule__Row__ElementsAssignment_2 ) ) ( ( rule__Row__ElementsAssignment_2 )* ) ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1057:1: ( ( ( ( rule__Row__ElementsAssignment_2 ) ) ( ( rule__Row__ElementsAssignment_2 )* ) ) )
            // InternalUi.g:1058:1: ( ( ( rule__Row__ElementsAssignment_2 ) ) ( ( rule__Row__ElementsAssignment_2 )* ) )
            {
            // InternalUi.g:1058:1: ( ( ( rule__Row__ElementsAssignment_2 ) ) ( ( rule__Row__ElementsAssignment_2 )* ) )
            // InternalUi.g:1059:2: ( ( rule__Row__ElementsAssignment_2 ) ) ( ( rule__Row__ElementsAssignment_2 )* )
            {
            // InternalUi.g:1059:2: ( ( rule__Row__ElementsAssignment_2 ) )
            // InternalUi.g:1060:3: ( rule__Row__ElementsAssignment_2 )
            {
             before(grammarAccess.getRowAccess().getElementsAssignment_2()); 
            // InternalUi.g:1061:3: ( rule__Row__ElementsAssignment_2 )
            // InternalUi.g:1061:4: rule__Row__ElementsAssignment_2
            {
            pushFollow(FOLLOW_9);
            rule__Row__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getElementsAssignment_2()); 

            }

            // InternalUi.g:1064:2: ( ( rule__Row__ElementsAssignment_2 )* )
            // InternalUi.g:1065:3: ( rule__Row__ElementsAssignment_2 )*
            {
             before(grammarAccess.getRowAccess().getElementsAssignment_2()); 
            // InternalUi.g:1066:3: ( rule__Row__ElementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=15 && LA10_0<=17)||(LA10_0>=19 && LA10_0<=21)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUi.g:1066:4: rule__Row__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Row__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRowAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__Row__Group__2__Impl"


    // $ANTLR start "rule__Row__Group__3"
    // InternalUi.g:1075:1: rule__Row__Group__3 : rule__Row__Group__3__Impl ;
    public final void rule__Row__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1079:1: ( rule__Row__Group__3__Impl )
            // InternalUi.g:1080:2: rule__Row__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3"


    // $ANTLR start "rule__Row__Group__3__Impl"
    // InternalUi.g:1086:1: rule__Row__Group__3__Impl : ( '}' ) ;
    public final void rule__Row__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1090:1: ( ( '}' ) )
            // InternalUi.g:1091:1: ( '}' )
            {
            // InternalUi.g:1091:1: ( '}' )
            // InternalUi.g:1092:2: '}'
            {
             before(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalUi.g:1102:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1106:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalUi.g:1107:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalUi.g:1114:1: rule__Label__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1118:1: ( ( 'label' ) )
            // InternalUi.g:1119:1: ( 'label' )
            {
            // InternalUi.g:1119:1: ( 'label' )
            // InternalUi.g:1120:2: 'label'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalUi.g:1129:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1133:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalUi.g:1134:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Label__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalUi.g:1141:1: rule__Label__Group__1__Impl : ( ':' ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1145:1: ( ( ':' ) )
            // InternalUi.g:1146:1: ( ':' )
            {
            // InternalUi.g:1146:1: ( ':' )
            // InternalUi.g:1147:2: ':'
            {
             before(grammarAccess.getLabelAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__2"
    // InternalUi.g:1156:1: rule__Label__Group__2 : rule__Label__Group__2__Impl ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1160:1: ( rule__Label__Group__2__Impl )
            // InternalUi.g:1161:2: rule__Label__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2"


    // $ANTLR start "rule__Label__Group__2__Impl"
    // InternalUi.g:1167:1: rule__Label__Group__2__Impl : ( ( rule__Label__ValueAssignment_2 ) ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1171:1: ( ( ( rule__Label__ValueAssignment_2 ) ) )
            // InternalUi.g:1172:1: ( ( rule__Label__ValueAssignment_2 ) )
            {
            // InternalUi.g:1172:1: ( ( rule__Label__ValueAssignment_2 ) )
            // InternalUi.g:1173:2: ( rule__Label__ValueAssignment_2 )
            {
             before(grammarAccess.getLabelAccess().getValueAssignment_2()); 
            // InternalUi.g:1174:2: ( rule__Label__ValueAssignment_2 )
            // InternalUi.g:1174:3: rule__Label__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Label__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalUi.g:1183:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1187:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalUi.g:1188:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalUi.g:1195:1: rule__Input__Group__0__Impl : ( 'input' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1199:1: ( ( 'input' ) )
            // InternalUi.g:1200:1: ( 'input' )
            {
            // InternalUi.g:1200:1: ( 'input' )
            // InternalUi.g:1201:2: 'input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalUi.g:1210:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1214:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalUi.g:1215:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalUi.g:1222:1: rule__Input__Group__1__Impl : ( ( rule__Input__NameAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1226:1: ( ( ( rule__Input__NameAssignment_1 ) ) )
            // InternalUi.g:1227:1: ( ( rule__Input__NameAssignment_1 ) )
            {
            // InternalUi.g:1227:1: ( ( rule__Input__NameAssignment_1 ) )
            // InternalUi.g:1228:2: ( rule__Input__NameAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_1()); 
            // InternalUi.g:1229:2: ( rule__Input__NameAssignment_1 )
            // InternalUi.g:1229:3: rule__Input__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalUi.g:1237:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1241:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalUi.g:1242:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalUi.g:1249:1: rule__Input__Group__2__Impl : ( ':' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1253:1: ( ( ':' ) )
            // InternalUi.g:1254:1: ( ':' )
            {
            // InternalUi.g:1254:1: ( ':' )
            // InternalUi.g:1255:2: ':'
            {
             before(grammarAccess.getInputAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // InternalUi.g:1264:1: rule__Input__Group__3 : rule__Input__Group__3__Impl ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1268:1: ( rule__Input__Group__3__Impl )
            // InternalUi.g:1269:2: rule__Input__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // InternalUi.g:1275:1: rule__Input__Group__3__Impl : ( ( rule__Input__ExpAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1279:1: ( ( ( rule__Input__ExpAssignment_3 ) ) )
            // InternalUi.g:1280:1: ( ( rule__Input__ExpAssignment_3 ) )
            {
            // InternalUi.g:1280:1: ( ( rule__Input__ExpAssignment_3 ) )
            // InternalUi.g:1281:2: ( rule__Input__ExpAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getExpAssignment_3()); 
            // InternalUi.g:1282:2: ( rule__Input__ExpAssignment_3 )
            // InternalUi.g:1282:3: rule__Input__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Input__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getExpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Button__Group_0__0"
    // InternalUi.g:1291:1: rule__Button__Group_0__0 : rule__Button__Group_0__0__Impl rule__Button__Group_0__1 ;
    public final void rule__Button__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1295:1: ( rule__Button__Group_0__0__Impl rule__Button__Group_0__1 )
            // InternalUi.g:1296:2: rule__Button__Group_0__0__Impl rule__Button__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Button__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_0__0"


    // $ANTLR start "rule__Button__Group_0__0__Impl"
    // InternalUi.g:1303:1: rule__Button__Group_0__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1307:1: ( ( 'button' ) )
            // InternalUi.g:1308:1: ( 'button' )
            {
            // InternalUi.g:1308:1: ( 'button' )
            // InternalUi.g:1309:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_0__0__Impl"


    // $ANTLR start "rule__Button__Group_0__1"
    // InternalUi.g:1318:1: rule__Button__Group_0__1 : rule__Button__Group_0__1__Impl rule__Button__Group_0__2 ;
    public final void rule__Button__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1322:1: ( rule__Button__Group_0__1__Impl rule__Button__Group_0__2 )
            // InternalUi.g:1323:2: rule__Button__Group_0__1__Impl rule__Button__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Button__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_0__1"


    // $ANTLR start "rule__Button__Group_0__1__Impl"
    // InternalUi.g:1330:1: rule__Button__Group_0__1__Impl : ( ( rule__Button__NameAssignment_0_1 ) ) ;
    public final void rule__Button__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1334:1: ( ( ( rule__Button__NameAssignment_0_1 ) ) )
            // InternalUi.g:1335:1: ( ( rule__Button__NameAssignment_0_1 ) )
            {
            // InternalUi.g:1335:1: ( ( rule__Button__NameAssignment_0_1 ) )
            // InternalUi.g:1336:2: ( rule__Button__NameAssignment_0_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_0_1()); 
            // InternalUi.g:1337:2: ( rule__Button__NameAssignment_0_1 )
            // InternalUi.g:1337:3: rule__Button__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Button__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_0__1__Impl"


    // $ANTLR start "rule__Button__Group_0__2"
    // InternalUi.g:1345:1: rule__Button__Group_0__2 : rule__Button__Group_0__2__Impl rule__Button__Group_0__3 ;
    public final void rule__Button__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1349:1: ( rule__Button__Group_0__2__Impl rule__Button__Group_0__3 )
            // InternalUi.g:1350:2: rule__Button__Group_0__2__Impl rule__Button__Group_0__3
            {
            pushFollow(FOLLOW_11);
            rule__Button__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_0__2"


    // $ANTLR start "rule__Button__Group_0__2__Impl"
    // InternalUi.g:1357:1: rule__Button__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Button__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1361:1: ( ( ':' ) )
            // InternalUi.g:1362:1: ( ':' )
            {
            // InternalUi.g:1362:1: ( ':' )
            // InternalUi.g:1363:2: ':'
            {
             before(grammarAccess.getButtonAccess().getColonKeyword_0_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getColonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_0__2__Impl"


    // $ANTLR start "rule__Button__Group_0__3"
    // InternalUi.g:1372:1: rule__Button__Group_0__3 : rule__Button__Group_0__3__Impl ;
    public final void rule__Button__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1376:1: ( rule__Button__Group_0__3__Impl )
            // InternalUi.g:1377:2: rule__Button__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_0__3"


    // $ANTLR start "rule__Button__Group_0__3__Impl"
    // InternalUi.g:1383:1: rule__Button__Group_0__3__Impl : ( ( rule__Button__ValueAssignment_0_3 ) ) ;
    public final void rule__Button__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1387:1: ( ( ( rule__Button__ValueAssignment_0_3 ) ) )
            // InternalUi.g:1388:1: ( ( rule__Button__ValueAssignment_0_3 ) )
            {
            // InternalUi.g:1388:1: ( ( rule__Button__ValueAssignment_0_3 ) )
            // InternalUi.g:1389:2: ( rule__Button__ValueAssignment_0_3 )
            {
             before(grammarAccess.getButtonAccess().getValueAssignment_0_3()); 
            // InternalUi.g:1390:2: ( rule__Button__ValueAssignment_0_3 )
            // InternalUi.g:1390:3: rule__Button__ValueAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Button__ValueAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getValueAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_0__3__Impl"


    // $ANTLR start "rule__Button__Group_1__0"
    // InternalUi.g:1399:1: rule__Button__Group_1__0 : rule__Button__Group_1__0__Impl rule__Button__Group_1__1 ;
    public final void rule__Button__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1403:1: ( rule__Button__Group_1__0__Impl rule__Button__Group_1__1 )
            // InternalUi.g:1404:2: rule__Button__Group_1__0__Impl rule__Button__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Button__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_1__0"


    // $ANTLR start "rule__Button__Group_1__0__Impl"
    // InternalUi.g:1411:1: rule__Button__Group_1__0__Impl : ( () ) ;
    public final void rule__Button__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1415:1: ( ( () ) )
            // InternalUi.g:1416:1: ( () )
            {
            // InternalUi.g:1416:1: ( () )
            // InternalUi.g:1417:2: ()
            {
             before(grammarAccess.getButtonAccess().getStarButtonAction_1_0()); 
            // InternalUi.g:1418:2: ()
            // InternalUi.g:1418:3: 
            {
            }

             after(grammarAccess.getButtonAccess().getStarButtonAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_1__0__Impl"


    // $ANTLR start "rule__Button__Group_1__1"
    // InternalUi.g:1426:1: rule__Button__Group_1__1 : rule__Button__Group_1__1__Impl rule__Button__Group_1__2 ;
    public final void rule__Button__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1430:1: ( rule__Button__Group_1__1__Impl rule__Button__Group_1__2 )
            // InternalUi.g:1431:2: rule__Button__Group_1__1__Impl rule__Button__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Button__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_1__1"


    // $ANTLR start "rule__Button__Group_1__1__Impl"
    // InternalUi.g:1438:1: rule__Button__Group_1__1__Impl : ( 'button*' ) ;
    public final void rule__Button__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1442:1: ( ( 'button*' ) )
            // InternalUi.g:1443:1: ( 'button*' )
            {
            // InternalUi.g:1443:1: ( 'button*' )
            // InternalUi.g:1444:2: 'button*'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_1__1__Impl"


    // $ANTLR start "rule__Button__Group_1__2"
    // InternalUi.g:1453:1: rule__Button__Group_1__2 : rule__Button__Group_1__2__Impl rule__Button__Group_1__3 ;
    public final void rule__Button__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1457:1: ( rule__Button__Group_1__2__Impl rule__Button__Group_1__3 )
            // InternalUi.g:1458:2: rule__Button__Group_1__2__Impl rule__Button__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__Button__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_1__2"


    // $ANTLR start "rule__Button__Group_1__2__Impl"
    // InternalUi.g:1465:1: rule__Button__Group_1__2__Impl : ( ( rule__Button__NameAssignment_1_2 ) ) ;
    public final void rule__Button__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1469:1: ( ( ( rule__Button__NameAssignment_1_2 ) ) )
            // InternalUi.g:1470:1: ( ( rule__Button__NameAssignment_1_2 ) )
            {
            // InternalUi.g:1470:1: ( ( rule__Button__NameAssignment_1_2 ) )
            // InternalUi.g:1471:2: ( rule__Button__NameAssignment_1_2 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1_2()); 
            // InternalUi.g:1472:2: ( rule__Button__NameAssignment_1_2 )
            // InternalUi.g:1472:3: rule__Button__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Button__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_1__2__Impl"


    // $ANTLR start "rule__Button__Group_1__3"
    // InternalUi.g:1480:1: rule__Button__Group_1__3 : rule__Button__Group_1__3__Impl rule__Button__Group_1__4 ;
    public final void rule__Button__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1484:1: ( rule__Button__Group_1__3__Impl rule__Button__Group_1__4 )
            // InternalUi.g:1485:2: rule__Button__Group_1__3__Impl rule__Button__Group_1__4
            {
            pushFollow(FOLLOW_11);
            rule__Button__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_1__3"


    // $ANTLR start "rule__Button__Group_1__3__Impl"
    // InternalUi.g:1492:1: rule__Button__Group_1__3__Impl : ( ':' ) ;
    public final void rule__Button__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1496:1: ( ( ':' ) )
            // InternalUi.g:1497:1: ( ':' )
            {
            // InternalUi.g:1497:1: ( ':' )
            // InternalUi.g:1498:2: ':'
            {
             before(grammarAccess.getButtonAccess().getColonKeyword_1_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getColonKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_1__3__Impl"


    // $ANTLR start "rule__Button__Group_1__4"
    // InternalUi.g:1507:1: rule__Button__Group_1__4 : rule__Button__Group_1__4__Impl ;
    public final void rule__Button__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1511:1: ( rule__Button__Group_1__4__Impl )
            // InternalUi.g:1512:2: rule__Button__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_1__4"


    // $ANTLR start "rule__Button__Group_1__4__Impl"
    // InternalUi.g:1518:1: rule__Button__Group_1__4__Impl : ( ( rule__Button__ValueAssignment_1_4 ) ) ;
    public final void rule__Button__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1522:1: ( ( ( rule__Button__ValueAssignment_1_4 ) ) )
            // InternalUi.g:1523:1: ( ( rule__Button__ValueAssignment_1_4 ) )
            {
            // InternalUi.g:1523:1: ( ( rule__Button__ValueAssignment_1_4 ) )
            // InternalUi.g:1524:2: ( rule__Button__ValueAssignment_1_4 )
            {
             before(grammarAccess.getButtonAccess().getValueAssignment_1_4()); 
            // InternalUi.g:1525:2: ( rule__Button__ValueAssignment_1_4 )
            // InternalUi.g:1525:3: rule__Button__ValueAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Button__ValueAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getValueAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group_1__4__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // InternalUi.g:1534:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1538:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalUi.g:1539:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // InternalUi.g:1546:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1550:1: ( ( () ) )
            // InternalUi.g:1551:1: ( () )
            {
            // InternalUi.g:1551:1: ( () )
            // InternalUi.g:1552:2: ()
            {
             before(grammarAccess.getTypeAccess().getStringTypeAction_0_0()); 
            // InternalUi.g:1553:2: ()
            // InternalUi.g:1553:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getStringTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // InternalUi.g:1561:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1565:1: ( rule__Type__Group_0__1__Impl )
            // InternalUi.g:1566:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // InternalUi.g:1572:1: rule__Type__Group_0__1__Impl : ( ( rule__Type__ValueAssignment_0_1 ) ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1576:1: ( ( ( rule__Type__ValueAssignment_0_1 ) ) )
            // InternalUi.g:1577:1: ( ( rule__Type__ValueAssignment_0_1 ) )
            {
            // InternalUi.g:1577:1: ( ( rule__Type__ValueAssignment_0_1 ) )
            // InternalUi.g:1578:2: ( rule__Type__ValueAssignment_0_1 )
            {
             before(grammarAccess.getTypeAccess().getValueAssignment_0_1()); 
            // InternalUi.g:1579:2: ( rule__Type__ValueAssignment_0_1 )
            // InternalUi.g:1579:3: rule__Type__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalUi.g:1588:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1592:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalUi.g:1593:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalUi.g:1600:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1604:1: ( ( () ) )
            // InternalUi.g:1605:1: ( () )
            {
            // InternalUi.g:1605:1: ( () )
            // InternalUi.g:1606:2: ()
            {
             before(grammarAccess.getTypeAccess().getHashStringTypeAction_1_0()); 
            // InternalUi.g:1607:2: ()
            // InternalUi.g:1607:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getHashStringTypeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalUi.g:1615:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1619:1: ( rule__Type__Group_1__1__Impl )
            // InternalUi.g:1620:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalUi.g:1626:1: rule__Type__Group_1__1__Impl : ( ( rule__Type__ValueAssignment_1_1 ) ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1630:1: ( ( ( rule__Type__ValueAssignment_1_1 ) ) )
            // InternalUi.g:1631:1: ( ( rule__Type__ValueAssignment_1_1 ) )
            {
            // InternalUi.g:1631:1: ( ( rule__Type__ValueAssignment_1_1 ) )
            // InternalUi.g:1632:2: ( rule__Type__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTypeAccess().getValueAssignment_1_1()); 
            // InternalUi.g:1633:2: ( rule__Type__ValueAssignment_1_1 )
            // InternalUi.g:1633:3: rule__Type__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalUi.g:1642:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1646:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalUi.g:1647:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalUi.g:1654:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1658:1: ( ( () ) )
            // InternalUi.g:1659:1: ( () )
            {
            // InternalUi.g:1659:1: ( () )
            // InternalUi.g:1660:2: ()
            {
             before(grammarAccess.getTypeAccess().getNumberTypeAction_2_0()); 
            // InternalUi.g:1661:2: ()
            // InternalUi.g:1661:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getNumberTypeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalUi.g:1669:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1673:1: ( rule__Type__Group_2__1__Impl )
            // InternalUi.g:1674:2: rule__Type__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalUi.g:1680:1: rule__Type__Group_2__1__Impl : ( ( rule__Type__ValueAssignment_2_1 ) ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1684:1: ( ( ( rule__Type__ValueAssignment_2_1 ) ) )
            // InternalUi.g:1685:1: ( ( rule__Type__ValueAssignment_2_1 ) )
            {
            // InternalUi.g:1685:1: ( ( rule__Type__ValueAssignment_2_1 ) )
            // InternalUi.g:1686:2: ( rule__Type__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTypeAccess().getValueAssignment_2_1()); 
            // InternalUi.g:1687:2: ( rule__Type__ValueAssignment_2_1 )
            // InternalUi.g:1687:3: rule__Type__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__BooleanExp__Group__0"
    // InternalUi.g:1696:1: rule__BooleanExp__Group__0 : rule__BooleanExp__Group__0__Impl rule__BooleanExp__Group__1 ;
    public final void rule__BooleanExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1700:1: ( rule__BooleanExp__Group__0__Impl rule__BooleanExp__Group__1 )
            // InternalUi.g:1701:2: rule__BooleanExp__Group__0__Impl rule__BooleanExp__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__BooleanExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group__0"


    // $ANTLR start "rule__BooleanExp__Group__0__Impl"
    // InternalUi.g:1708:1: rule__BooleanExp__Group__0__Impl : ( ruleEqualityExp ) ;
    public final void rule__BooleanExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1712:1: ( ( ruleEqualityExp ) )
            // InternalUi.g:1713:1: ( ruleEqualityExp )
            {
            // InternalUi.g:1713:1: ( ruleEqualityExp )
            // InternalUi.g:1714:2: ruleEqualityExp
            {
             before(grammarAccess.getBooleanExpAccess().getEqualityExpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityExp();

            state._fsp--;

             after(grammarAccess.getBooleanExpAccess().getEqualityExpParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group__0__Impl"


    // $ANTLR start "rule__BooleanExp__Group__1"
    // InternalUi.g:1723:1: rule__BooleanExp__Group__1 : rule__BooleanExp__Group__1__Impl ;
    public final void rule__BooleanExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1727:1: ( rule__BooleanExp__Group__1__Impl )
            // InternalUi.g:1728:2: rule__BooleanExp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group__1"


    // $ANTLR start "rule__BooleanExp__Group__1__Impl"
    // InternalUi.g:1734:1: rule__BooleanExp__Group__1__Impl : ( ( rule__BooleanExp__Alternatives_1 )* ) ;
    public final void rule__BooleanExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1738:1: ( ( ( rule__BooleanExp__Alternatives_1 )* ) )
            // InternalUi.g:1739:1: ( ( rule__BooleanExp__Alternatives_1 )* )
            {
            // InternalUi.g:1739:1: ( ( rule__BooleanExp__Alternatives_1 )* )
            // InternalUi.g:1740:2: ( rule__BooleanExp__Alternatives_1 )*
            {
             before(grammarAccess.getBooleanExpAccess().getAlternatives_1()); 
            // InternalUi.g:1741:2: ( rule__BooleanExp__Alternatives_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=22 && LA11_0<=23)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUi.g:1741:3: rule__BooleanExp__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__BooleanExp__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBooleanExpAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group__1__Impl"


    // $ANTLR start "rule__BooleanExp__Group_1_0__0"
    // InternalUi.g:1750:1: rule__BooleanExp__Group_1_0__0 : rule__BooleanExp__Group_1_0__0__Impl rule__BooleanExp__Group_1_0__1 ;
    public final void rule__BooleanExp__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1754:1: ( rule__BooleanExp__Group_1_0__0__Impl rule__BooleanExp__Group_1_0__1 )
            // InternalUi.g:1755:2: rule__BooleanExp__Group_1_0__0__Impl rule__BooleanExp__Group_1_0__1
            {
            pushFollow(FOLLOW_19);
            rule__BooleanExp__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanExp__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1_0__0"


    // $ANTLR start "rule__BooleanExp__Group_1_0__0__Impl"
    // InternalUi.g:1762:1: rule__BooleanExp__Group_1_0__0__Impl : ( () ) ;
    public final void rule__BooleanExp__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1766:1: ( ( () ) )
            // InternalUi.g:1767:1: ( () )
            {
            // InternalUi.g:1767:1: ( () )
            // InternalUi.g:1768:2: ()
            {
             before(grammarAccess.getBooleanExpAccess().getAndLeftAction_1_0_0()); 
            // InternalUi.g:1769:2: ()
            // InternalUi.g:1769:3: 
            {
            }

             after(grammarAccess.getBooleanExpAccess().getAndLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1_0__0__Impl"


    // $ANTLR start "rule__BooleanExp__Group_1_0__1"
    // InternalUi.g:1777:1: rule__BooleanExp__Group_1_0__1 : rule__BooleanExp__Group_1_0__1__Impl rule__BooleanExp__Group_1_0__2 ;
    public final void rule__BooleanExp__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1781:1: ( rule__BooleanExp__Group_1_0__1__Impl rule__BooleanExp__Group_1_0__2 )
            // InternalUi.g:1782:2: rule__BooleanExp__Group_1_0__1__Impl rule__BooleanExp__Group_1_0__2
            {
            pushFollow(FOLLOW_12);
            rule__BooleanExp__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanExp__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1_0__1"


    // $ANTLR start "rule__BooleanExp__Group_1_0__1__Impl"
    // InternalUi.g:1789:1: rule__BooleanExp__Group_1_0__1__Impl : ( '&&' ) ;
    public final void rule__BooleanExp__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1793:1: ( ( '&&' ) )
            // InternalUi.g:1794:1: ( '&&' )
            {
            // InternalUi.g:1794:1: ( '&&' )
            // InternalUi.g:1795:2: '&&'
            {
             before(grammarAccess.getBooleanExpAccess().getAmpersandAmpersandKeyword_1_0_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBooleanExpAccess().getAmpersandAmpersandKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1_0__1__Impl"


    // $ANTLR start "rule__BooleanExp__Group_1_0__2"
    // InternalUi.g:1804:1: rule__BooleanExp__Group_1_0__2 : rule__BooleanExp__Group_1_0__2__Impl ;
    public final void rule__BooleanExp__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1808:1: ( rule__BooleanExp__Group_1_0__2__Impl )
            // InternalUi.g:1809:2: rule__BooleanExp__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExp__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1_0__2"


    // $ANTLR start "rule__BooleanExp__Group_1_0__2__Impl"
    // InternalUi.g:1815:1: rule__BooleanExp__Group_1_0__2__Impl : ( ( rule__BooleanExp__RightAssignment_1_0_2 ) ) ;
    public final void rule__BooleanExp__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1819:1: ( ( ( rule__BooleanExp__RightAssignment_1_0_2 ) ) )
            // InternalUi.g:1820:1: ( ( rule__BooleanExp__RightAssignment_1_0_2 ) )
            {
            // InternalUi.g:1820:1: ( ( rule__BooleanExp__RightAssignment_1_0_2 ) )
            // InternalUi.g:1821:2: ( rule__BooleanExp__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getBooleanExpAccess().getRightAssignment_1_0_2()); 
            // InternalUi.g:1822:2: ( rule__BooleanExp__RightAssignment_1_0_2 )
            // InternalUi.g:1822:3: rule__BooleanExp__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExp__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1_0__2__Impl"


    // $ANTLR start "rule__BooleanExp__Group_1_1__0"
    // InternalUi.g:1831:1: rule__BooleanExp__Group_1_1__0 : rule__BooleanExp__Group_1_1__0__Impl rule__BooleanExp__Group_1_1__1 ;
    public final void rule__BooleanExp__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1835:1: ( rule__BooleanExp__Group_1_1__0__Impl rule__BooleanExp__Group_1_1__1 )
            // InternalUi.g:1836:2: rule__BooleanExp__Group_1_1__0__Impl rule__BooleanExp__Group_1_1__1
            {
            pushFollow(FOLLOW_17);
            rule__BooleanExp__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanExp__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1_1__0"


    // $ANTLR start "rule__BooleanExp__Group_1_1__0__Impl"
    // InternalUi.g:1843:1: rule__BooleanExp__Group_1_1__0__Impl : ( () ) ;
    public final void rule__BooleanExp__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1847:1: ( ( () ) )
            // InternalUi.g:1848:1: ( () )
            {
            // InternalUi.g:1848:1: ( () )
            // InternalUi.g:1849:2: ()
            {
             before(grammarAccess.getBooleanExpAccess().getOrLeftAction_1_1_0()); 
            // InternalUi.g:1850:2: ()
            // InternalUi.g:1850:3: 
            {
            }

             after(grammarAccess.getBooleanExpAccess().getOrLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1_1__0__Impl"


    // $ANTLR start "rule__BooleanExp__Group_1_1__1"
    // InternalUi.g:1858:1: rule__BooleanExp__Group_1_1__1 : rule__BooleanExp__Group_1_1__1__Impl rule__BooleanExp__Group_1_1__2 ;
    public final void rule__BooleanExp__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1862:1: ( rule__BooleanExp__Group_1_1__1__Impl rule__BooleanExp__Group_1_1__2 )
            // InternalUi.g:1863:2: rule__BooleanExp__Group_1_1__1__Impl rule__BooleanExp__Group_1_1__2
            {
            pushFollow(FOLLOW_12);
            rule__BooleanExp__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanExp__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1_1__1"


    // $ANTLR start "rule__BooleanExp__Group_1_1__1__Impl"
    // InternalUi.g:1870:1: rule__BooleanExp__Group_1_1__1__Impl : ( '||' ) ;
    public final void rule__BooleanExp__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1874:1: ( ( '||' ) )
            // InternalUi.g:1875:1: ( '||' )
            {
            // InternalUi.g:1875:1: ( '||' )
            // InternalUi.g:1876:2: '||'
            {
             before(grammarAccess.getBooleanExpAccess().getVerticalLineVerticalLineKeyword_1_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBooleanExpAccess().getVerticalLineVerticalLineKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1_1__1__Impl"


    // $ANTLR start "rule__BooleanExp__Group_1_1__2"
    // InternalUi.g:1885:1: rule__BooleanExp__Group_1_1__2 : rule__BooleanExp__Group_1_1__2__Impl ;
    public final void rule__BooleanExp__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1889:1: ( rule__BooleanExp__Group_1_1__2__Impl )
            // InternalUi.g:1890:2: rule__BooleanExp__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExp__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1_1__2"


    // $ANTLR start "rule__BooleanExp__Group_1_1__2__Impl"
    // InternalUi.g:1896:1: rule__BooleanExp__Group_1_1__2__Impl : ( ( rule__BooleanExp__RightAssignment_1_1_2 ) ) ;
    public final void rule__BooleanExp__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1900:1: ( ( ( rule__BooleanExp__RightAssignment_1_1_2 ) ) )
            // InternalUi.g:1901:1: ( ( rule__BooleanExp__RightAssignment_1_1_2 ) )
            {
            // InternalUi.g:1901:1: ( ( rule__BooleanExp__RightAssignment_1_1_2 ) )
            // InternalUi.g:1902:2: ( rule__BooleanExp__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getBooleanExpAccess().getRightAssignment_1_1_2()); 
            // InternalUi.g:1903:2: ( rule__BooleanExp__RightAssignment_1_1_2 )
            // InternalUi.g:1903:3: rule__BooleanExp__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExp__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Group_1_1__2__Impl"


    // $ANTLR start "rule__EqualityExp__Group__0"
    // InternalUi.g:1912:1: rule__EqualityExp__Group__0 : rule__EqualityExp__Group__0__Impl rule__EqualityExp__Group__1 ;
    public final void rule__EqualityExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1916:1: ( rule__EqualityExp__Group__0__Impl rule__EqualityExp__Group__1 )
            // InternalUi.g:1917:2: rule__EqualityExp__Group__0__Impl rule__EqualityExp__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EqualityExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group__0"


    // $ANTLR start "rule__EqualityExp__Group__0__Impl"
    // InternalUi.g:1924:1: rule__EqualityExp__Group__0__Impl : ( ruleLessGreaterExp ) ;
    public final void rule__EqualityExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1928:1: ( ( ruleLessGreaterExp ) )
            // InternalUi.g:1929:1: ( ruleLessGreaterExp )
            {
            // InternalUi.g:1929:1: ( ruleLessGreaterExp )
            // InternalUi.g:1930:2: ruleLessGreaterExp
            {
             before(grammarAccess.getEqualityExpAccess().getLessGreaterExpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLessGreaterExp();

            state._fsp--;

             after(grammarAccess.getEqualityExpAccess().getLessGreaterExpParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group__0__Impl"


    // $ANTLR start "rule__EqualityExp__Group__1"
    // InternalUi.g:1939:1: rule__EqualityExp__Group__1 : rule__EqualityExp__Group__1__Impl ;
    public final void rule__EqualityExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1943:1: ( rule__EqualityExp__Group__1__Impl )
            // InternalUi.g:1944:2: rule__EqualityExp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group__1"


    // $ANTLR start "rule__EqualityExp__Group__1__Impl"
    // InternalUi.g:1950:1: rule__EqualityExp__Group__1__Impl : ( ( rule__EqualityExp__Alternatives_1 )* ) ;
    public final void rule__EqualityExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1954:1: ( ( ( rule__EqualityExp__Alternatives_1 )* ) )
            // InternalUi.g:1955:1: ( ( rule__EqualityExp__Alternatives_1 )* )
            {
            // InternalUi.g:1955:1: ( ( rule__EqualityExp__Alternatives_1 )* )
            // InternalUi.g:1956:2: ( rule__EqualityExp__Alternatives_1 )*
            {
             before(grammarAccess.getEqualityExpAccess().getAlternatives_1()); 
            // InternalUi.g:1957:2: ( rule__EqualityExp__Alternatives_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=24 && LA12_0<=25)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUi.g:1957:3: rule__EqualityExp__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__EqualityExp__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEqualityExpAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group__1__Impl"


    // $ANTLR start "rule__EqualityExp__Group_1_0__0"
    // InternalUi.g:1966:1: rule__EqualityExp__Group_1_0__0 : rule__EqualityExp__Group_1_0__0__Impl rule__EqualityExp__Group_1_0__1 ;
    public final void rule__EqualityExp__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1970:1: ( rule__EqualityExp__Group_1_0__0__Impl rule__EqualityExp__Group_1_0__1 )
            // InternalUi.g:1971:2: rule__EqualityExp__Group_1_0__0__Impl rule__EqualityExp__Group_1_0__1
            {
            pushFollow(FOLLOW_22);
            rule__EqualityExp__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExp__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group_1_0__0"


    // $ANTLR start "rule__EqualityExp__Group_1_0__0__Impl"
    // InternalUi.g:1978:1: rule__EqualityExp__Group_1_0__0__Impl : ( () ) ;
    public final void rule__EqualityExp__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1982:1: ( ( () ) )
            // InternalUi.g:1983:1: ( () )
            {
            // InternalUi.g:1983:1: ( () )
            // InternalUi.g:1984:2: ()
            {
             before(grammarAccess.getEqualityExpAccess().getEqualsLeftAction_1_0_0()); 
            // InternalUi.g:1985:2: ()
            // InternalUi.g:1985:3: 
            {
            }

             after(grammarAccess.getEqualityExpAccess().getEqualsLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group_1_0__0__Impl"


    // $ANTLR start "rule__EqualityExp__Group_1_0__1"
    // InternalUi.g:1993:1: rule__EqualityExp__Group_1_0__1 : rule__EqualityExp__Group_1_0__1__Impl rule__EqualityExp__Group_1_0__2 ;
    public final void rule__EqualityExp__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:1997:1: ( rule__EqualityExp__Group_1_0__1__Impl rule__EqualityExp__Group_1_0__2 )
            // InternalUi.g:1998:2: rule__EqualityExp__Group_1_0__1__Impl rule__EqualityExp__Group_1_0__2
            {
            pushFollow(FOLLOW_12);
            rule__EqualityExp__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExp__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group_1_0__1"


    // $ANTLR start "rule__EqualityExp__Group_1_0__1__Impl"
    // InternalUi.g:2005:1: rule__EqualityExp__Group_1_0__1__Impl : ( '==' ) ;
    public final void rule__EqualityExp__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2009:1: ( ( '==' ) )
            // InternalUi.g:2010:1: ( '==' )
            {
            // InternalUi.g:2010:1: ( '==' )
            // InternalUi.g:2011:2: '=='
            {
             before(grammarAccess.getEqualityExpAccess().getEqualsSignEqualsSignKeyword_1_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEqualityExpAccess().getEqualsSignEqualsSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group_1_0__1__Impl"


    // $ANTLR start "rule__EqualityExp__Group_1_0__2"
    // InternalUi.g:2020:1: rule__EqualityExp__Group_1_0__2 : rule__EqualityExp__Group_1_0__2__Impl ;
    public final void rule__EqualityExp__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2024:1: ( rule__EqualityExp__Group_1_0__2__Impl )
            // InternalUi.g:2025:2: rule__EqualityExp__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExp__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group_1_0__2"


    // $ANTLR start "rule__EqualityExp__Group_1_0__2__Impl"
    // InternalUi.g:2031:1: rule__EqualityExp__Group_1_0__2__Impl : ( ( rule__EqualityExp__RightAssignment_1_0_2 ) ) ;
    public final void rule__EqualityExp__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2035:1: ( ( ( rule__EqualityExp__RightAssignment_1_0_2 ) ) )
            // InternalUi.g:2036:1: ( ( rule__EqualityExp__RightAssignment_1_0_2 ) )
            {
            // InternalUi.g:2036:1: ( ( rule__EqualityExp__RightAssignment_1_0_2 ) )
            // InternalUi.g:2037:2: ( rule__EqualityExp__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getEqualityExpAccess().getRightAssignment_1_0_2()); 
            // InternalUi.g:2038:2: ( rule__EqualityExp__RightAssignment_1_0_2 )
            // InternalUi.g:2038:3: rule__EqualityExp__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExp__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group_1_0__2__Impl"


    // $ANTLR start "rule__EqualityExp__Group_1_1__0"
    // InternalUi.g:2047:1: rule__EqualityExp__Group_1_1__0 : rule__EqualityExp__Group_1_1__0__Impl rule__EqualityExp__Group_1_1__1 ;
    public final void rule__EqualityExp__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2051:1: ( rule__EqualityExp__Group_1_1__0__Impl rule__EqualityExp__Group_1_1__1 )
            // InternalUi.g:2052:2: rule__EqualityExp__Group_1_1__0__Impl rule__EqualityExp__Group_1_1__1
            {
            pushFollow(FOLLOW_20);
            rule__EqualityExp__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExp__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group_1_1__0"


    // $ANTLR start "rule__EqualityExp__Group_1_1__0__Impl"
    // InternalUi.g:2059:1: rule__EqualityExp__Group_1_1__0__Impl : ( () ) ;
    public final void rule__EqualityExp__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2063:1: ( ( () ) )
            // InternalUi.g:2064:1: ( () )
            {
            // InternalUi.g:2064:1: ( () )
            // InternalUi.g:2065:2: ()
            {
             before(grammarAccess.getEqualityExpAccess().getNotEqualLeftAction_1_1_0()); 
            // InternalUi.g:2066:2: ()
            // InternalUi.g:2066:3: 
            {
            }

             after(grammarAccess.getEqualityExpAccess().getNotEqualLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group_1_1__0__Impl"


    // $ANTLR start "rule__EqualityExp__Group_1_1__1"
    // InternalUi.g:2074:1: rule__EqualityExp__Group_1_1__1 : rule__EqualityExp__Group_1_1__1__Impl rule__EqualityExp__Group_1_1__2 ;
    public final void rule__EqualityExp__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2078:1: ( rule__EqualityExp__Group_1_1__1__Impl rule__EqualityExp__Group_1_1__2 )
            // InternalUi.g:2079:2: rule__EqualityExp__Group_1_1__1__Impl rule__EqualityExp__Group_1_1__2
            {
            pushFollow(FOLLOW_12);
            rule__EqualityExp__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualityExp__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group_1_1__1"


    // $ANTLR start "rule__EqualityExp__Group_1_1__1__Impl"
    // InternalUi.g:2086:1: rule__EqualityExp__Group_1_1__1__Impl : ( '!=' ) ;
    public final void rule__EqualityExp__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2090:1: ( ( '!=' ) )
            // InternalUi.g:2091:1: ( '!=' )
            {
            // InternalUi.g:2091:1: ( '!=' )
            // InternalUi.g:2092:2: '!='
            {
             before(grammarAccess.getEqualityExpAccess().getExclamationMarkEqualsSignKeyword_1_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEqualityExpAccess().getExclamationMarkEqualsSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group_1_1__1__Impl"


    // $ANTLR start "rule__EqualityExp__Group_1_1__2"
    // InternalUi.g:2101:1: rule__EqualityExp__Group_1_1__2 : rule__EqualityExp__Group_1_1__2__Impl ;
    public final void rule__EqualityExp__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2105:1: ( rule__EqualityExp__Group_1_1__2__Impl )
            // InternalUi.g:2106:2: rule__EqualityExp__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExp__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group_1_1__2"


    // $ANTLR start "rule__EqualityExp__Group_1_1__2__Impl"
    // InternalUi.g:2112:1: rule__EqualityExp__Group_1_1__2__Impl : ( ( rule__EqualityExp__RightAssignment_1_1_2 ) ) ;
    public final void rule__EqualityExp__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2116:1: ( ( ( rule__EqualityExp__RightAssignment_1_1_2 ) ) )
            // InternalUi.g:2117:1: ( ( rule__EqualityExp__RightAssignment_1_1_2 ) )
            {
            // InternalUi.g:2117:1: ( ( rule__EqualityExp__RightAssignment_1_1_2 ) )
            // InternalUi.g:2118:2: ( rule__EqualityExp__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getEqualityExpAccess().getRightAssignment_1_1_2()); 
            // InternalUi.g:2119:2: ( rule__EqualityExp__RightAssignment_1_1_2 )
            // InternalUi.g:2119:3: rule__EqualityExp__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EqualityExp__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__Group_1_1__2__Impl"


    // $ANTLR start "rule__LessGreaterExp__Group__0"
    // InternalUi.g:2128:1: rule__LessGreaterExp__Group__0 : rule__LessGreaterExp__Group__0__Impl rule__LessGreaterExp__Group__1 ;
    public final void rule__LessGreaterExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2132:1: ( rule__LessGreaterExp__Group__0__Impl rule__LessGreaterExp__Group__1 )
            // InternalUi.g:2133:2: rule__LessGreaterExp__Group__0__Impl rule__LessGreaterExp__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__LessGreaterExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group__0"


    // $ANTLR start "rule__LessGreaterExp__Group__0__Impl"
    // InternalUi.g:2140:1: rule__LessGreaterExp__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__LessGreaterExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2144:1: ( ( rulePrimary ) )
            // InternalUi.g:2145:1: ( rulePrimary )
            {
            // InternalUi.g:2145:1: ( rulePrimary )
            // InternalUi.g:2146:2: rulePrimary
            {
             before(grammarAccess.getLessGreaterExpAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getLessGreaterExpAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group__0__Impl"


    // $ANTLR start "rule__LessGreaterExp__Group__1"
    // InternalUi.g:2155:1: rule__LessGreaterExp__Group__1 : rule__LessGreaterExp__Group__1__Impl ;
    public final void rule__LessGreaterExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2159:1: ( rule__LessGreaterExp__Group__1__Impl )
            // InternalUi.g:2160:2: rule__LessGreaterExp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group__1"


    // $ANTLR start "rule__LessGreaterExp__Group__1__Impl"
    // InternalUi.g:2166:1: rule__LessGreaterExp__Group__1__Impl : ( ( rule__LessGreaterExp__Alternatives_1 )* ) ;
    public final void rule__LessGreaterExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2170:1: ( ( ( rule__LessGreaterExp__Alternatives_1 )* ) )
            // InternalUi.g:2171:1: ( ( rule__LessGreaterExp__Alternatives_1 )* )
            {
            // InternalUi.g:2171:1: ( ( rule__LessGreaterExp__Alternatives_1 )* )
            // InternalUi.g:2172:2: ( rule__LessGreaterExp__Alternatives_1 )*
            {
             before(grammarAccess.getLessGreaterExpAccess().getAlternatives_1()); 
            // InternalUi.g:2173:2: ( rule__LessGreaterExp__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=26 && LA13_0<=29)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUi.g:2173:3: rule__LessGreaterExp__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__LessGreaterExp__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getLessGreaterExpAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group__1__Impl"


    // $ANTLR start "rule__LessGreaterExp__Group_1_0__0"
    // InternalUi.g:2182:1: rule__LessGreaterExp__Group_1_0__0 : rule__LessGreaterExp__Group_1_0__0__Impl rule__LessGreaterExp__Group_1_0__1 ;
    public final void rule__LessGreaterExp__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2186:1: ( rule__LessGreaterExp__Group_1_0__0__Impl rule__LessGreaterExp__Group_1_0__1 )
            // InternalUi.g:2187:2: rule__LessGreaterExp__Group_1_0__0__Impl rule__LessGreaterExp__Group_1_0__1
            {
            pushFollow(FOLLOW_25);
            rule__LessGreaterExp__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_0__0"


    // $ANTLR start "rule__LessGreaterExp__Group_1_0__0__Impl"
    // InternalUi.g:2194:1: rule__LessGreaterExp__Group_1_0__0__Impl : ( () ) ;
    public final void rule__LessGreaterExp__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2198:1: ( ( () ) )
            // InternalUi.g:2199:1: ( () )
            {
            // InternalUi.g:2199:1: ( () )
            // InternalUi.g:2200:2: ()
            {
             before(grammarAccess.getLessGreaterExpAccess().getLessLeftAction_1_0_0()); 
            // InternalUi.g:2201:2: ()
            // InternalUi.g:2201:3: 
            {
            }

             after(grammarAccess.getLessGreaterExpAccess().getLessLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_0__0__Impl"


    // $ANTLR start "rule__LessGreaterExp__Group_1_0__1"
    // InternalUi.g:2209:1: rule__LessGreaterExp__Group_1_0__1 : rule__LessGreaterExp__Group_1_0__1__Impl rule__LessGreaterExp__Group_1_0__2 ;
    public final void rule__LessGreaterExp__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2213:1: ( rule__LessGreaterExp__Group_1_0__1__Impl rule__LessGreaterExp__Group_1_0__2 )
            // InternalUi.g:2214:2: rule__LessGreaterExp__Group_1_0__1__Impl rule__LessGreaterExp__Group_1_0__2
            {
            pushFollow(FOLLOW_12);
            rule__LessGreaterExp__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_0__1"


    // $ANTLR start "rule__LessGreaterExp__Group_1_0__1__Impl"
    // InternalUi.g:2221:1: rule__LessGreaterExp__Group_1_0__1__Impl : ( '<' ) ;
    public final void rule__LessGreaterExp__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2225:1: ( ( '<' ) )
            // InternalUi.g:2226:1: ( '<' )
            {
            // InternalUi.g:2226:1: ( '<' )
            // InternalUi.g:2227:2: '<'
            {
             before(grammarAccess.getLessGreaterExpAccess().getLessThanSignKeyword_1_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLessGreaterExpAccess().getLessThanSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_0__1__Impl"


    // $ANTLR start "rule__LessGreaterExp__Group_1_0__2"
    // InternalUi.g:2236:1: rule__LessGreaterExp__Group_1_0__2 : rule__LessGreaterExp__Group_1_0__2__Impl ;
    public final void rule__LessGreaterExp__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2240:1: ( rule__LessGreaterExp__Group_1_0__2__Impl )
            // InternalUi.g:2241:2: rule__LessGreaterExp__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_0__2"


    // $ANTLR start "rule__LessGreaterExp__Group_1_0__2__Impl"
    // InternalUi.g:2247:1: rule__LessGreaterExp__Group_1_0__2__Impl : ( ( rule__LessGreaterExp__RightAssignment_1_0_2 ) ) ;
    public final void rule__LessGreaterExp__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2251:1: ( ( ( rule__LessGreaterExp__RightAssignment_1_0_2 ) ) )
            // InternalUi.g:2252:1: ( ( rule__LessGreaterExp__RightAssignment_1_0_2 ) )
            {
            // InternalUi.g:2252:1: ( ( rule__LessGreaterExp__RightAssignment_1_0_2 ) )
            // InternalUi.g:2253:2: ( rule__LessGreaterExp__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getLessGreaterExpAccess().getRightAssignment_1_0_2()); 
            // InternalUi.g:2254:2: ( rule__LessGreaterExp__RightAssignment_1_0_2 )
            // InternalUi.g:2254:3: rule__LessGreaterExp__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getLessGreaterExpAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_0__2__Impl"


    // $ANTLR start "rule__LessGreaterExp__Group_1_1__0"
    // InternalUi.g:2263:1: rule__LessGreaterExp__Group_1_1__0 : rule__LessGreaterExp__Group_1_1__0__Impl rule__LessGreaterExp__Group_1_1__1 ;
    public final void rule__LessGreaterExp__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2267:1: ( rule__LessGreaterExp__Group_1_1__0__Impl rule__LessGreaterExp__Group_1_1__1 )
            // InternalUi.g:2268:2: rule__LessGreaterExp__Group_1_1__0__Impl rule__LessGreaterExp__Group_1_1__1
            {
            pushFollow(FOLLOW_26);
            rule__LessGreaterExp__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_1__0"


    // $ANTLR start "rule__LessGreaterExp__Group_1_1__0__Impl"
    // InternalUi.g:2275:1: rule__LessGreaterExp__Group_1_1__0__Impl : ( () ) ;
    public final void rule__LessGreaterExp__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2279:1: ( ( () ) )
            // InternalUi.g:2280:1: ( () )
            {
            // InternalUi.g:2280:1: ( () )
            // InternalUi.g:2281:2: ()
            {
             before(grammarAccess.getLessGreaterExpAccess().getLessOrEqualLeftAction_1_1_0()); 
            // InternalUi.g:2282:2: ()
            // InternalUi.g:2282:3: 
            {
            }

             after(grammarAccess.getLessGreaterExpAccess().getLessOrEqualLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_1__0__Impl"


    // $ANTLR start "rule__LessGreaterExp__Group_1_1__1"
    // InternalUi.g:2290:1: rule__LessGreaterExp__Group_1_1__1 : rule__LessGreaterExp__Group_1_1__1__Impl rule__LessGreaterExp__Group_1_1__2 ;
    public final void rule__LessGreaterExp__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2294:1: ( rule__LessGreaterExp__Group_1_1__1__Impl rule__LessGreaterExp__Group_1_1__2 )
            // InternalUi.g:2295:2: rule__LessGreaterExp__Group_1_1__1__Impl rule__LessGreaterExp__Group_1_1__2
            {
            pushFollow(FOLLOW_12);
            rule__LessGreaterExp__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_1__1"


    // $ANTLR start "rule__LessGreaterExp__Group_1_1__1__Impl"
    // InternalUi.g:2302:1: rule__LessGreaterExp__Group_1_1__1__Impl : ( '<=' ) ;
    public final void rule__LessGreaterExp__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2306:1: ( ( '<=' ) )
            // InternalUi.g:2307:1: ( '<=' )
            {
            // InternalUi.g:2307:1: ( '<=' )
            // InternalUi.g:2308:2: '<='
            {
             before(grammarAccess.getLessGreaterExpAccess().getLessThanSignEqualsSignKeyword_1_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLessGreaterExpAccess().getLessThanSignEqualsSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_1__1__Impl"


    // $ANTLR start "rule__LessGreaterExp__Group_1_1__2"
    // InternalUi.g:2317:1: rule__LessGreaterExp__Group_1_1__2 : rule__LessGreaterExp__Group_1_1__2__Impl ;
    public final void rule__LessGreaterExp__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2321:1: ( rule__LessGreaterExp__Group_1_1__2__Impl )
            // InternalUi.g:2322:2: rule__LessGreaterExp__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_1__2"


    // $ANTLR start "rule__LessGreaterExp__Group_1_1__2__Impl"
    // InternalUi.g:2328:1: rule__LessGreaterExp__Group_1_1__2__Impl : ( ( rule__LessGreaterExp__RightAssignment_1_1_2 ) ) ;
    public final void rule__LessGreaterExp__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2332:1: ( ( ( rule__LessGreaterExp__RightAssignment_1_1_2 ) ) )
            // InternalUi.g:2333:1: ( ( rule__LessGreaterExp__RightAssignment_1_1_2 ) )
            {
            // InternalUi.g:2333:1: ( ( rule__LessGreaterExp__RightAssignment_1_1_2 ) )
            // InternalUi.g:2334:2: ( rule__LessGreaterExp__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getLessGreaterExpAccess().getRightAssignment_1_1_2()); 
            // InternalUi.g:2335:2: ( rule__LessGreaterExp__RightAssignment_1_1_2 )
            // InternalUi.g:2335:3: rule__LessGreaterExp__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLessGreaterExpAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_1__2__Impl"


    // $ANTLR start "rule__LessGreaterExp__Group_1_2__0"
    // InternalUi.g:2344:1: rule__LessGreaterExp__Group_1_2__0 : rule__LessGreaterExp__Group_1_2__0__Impl rule__LessGreaterExp__Group_1_2__1 ;
    public final void rule__LessGreaterExp__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2348:1: ( rule__LessGreaterExp__Group_1_2__0__Impl rule__LessGreaterExp__Group_1_2__1 )
            // InternalUi.g:2349:2: rule__LessGreaterExp__Group_1_2__0__Impl rule__LessGreaterExp__Group_1_2__1
            {
            pushFollow(FOLLOW_27);
            rule__LessGreaterExp__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_2__0"


    // $ANTLR start "rule__LessGreaterExp__Group_1_2__0__Impl"
    // InternalUi.g:2356:1: rule__LessGreaterExp__Group_1_2__0__Impl : ( () ) ;
    public final void rule__LessGreaterExp__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2360:1: ( ( () ) )
            // InternalUi.g:2361:1: ( () )
            {
            // InternalUi.g:2361:1: ( () )
            // InternalUi.g:2362:2: ()
            {
             before(grammarAccess.getLessGreaterExpAccess().getGreaterLeftAction_1_2_0()); 
            // InternalUi.g:2363:2: ()
            // InternalUi.g:2363:3: 
            {
            }

             after(grammarAccess.getLessGreaterExpAccess().getGreaterLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_2__0__Impl"


    // $ANTLR start "rule__LessGreaterExp__Group_1_2__1"
    // InternalUi.g:2371:1: rule__LessGreaterExp__Group_1_2__1 : rule__LessGreaterExp__Group_1_2__1__Impl rule__LessGreaterExp__Group_1_2__2 ;
    public final void rule__LessGreaterExp__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2375:1: ( rule__LessGreaterExp__Group_1_2__1__Impl rule__LessGreaterExp__Group_1_2__2 )
            // InternalUi.g:2376:2: rule__LessGreaterExp__Group_1_2__1__Impl rule__LessGreaterExp__Group_1_2__2
            {
            pushFollow(FOLLOW_12);
            rule__LessGreaterExp__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_2__1"


    // $ANTLR start "rule__LessGreaterExp__Group_1_2__1__Impl"
    // InternalUi.g:2383:1: rule__LessGreaterExp__Group_1_2__1__Impl : ( '>' ) ;
    public final void rule__LessGreaterExp__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2387:1: ( ( '>' ) )
            // InternalUi.g:2388:1: ( '>' )
            {
            // InternalUi.g:2388:1: ( '>' )
            // InternalUi.g:2389:2: '>'
            {
             before(grammarAccess.getLessGreaterExpAccess().getGreaterThanSignKeyword_1_2_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLessGreaterExpAccess().getGreaterThanSignKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_2__1__Impl"


    // $ANTLR start "rule__LessGreaterExp__Group_1_2__2"
    // InternalUi.g:2398:1: rule__LessGreaterExp__Group_1_2__2 : rule__LessGreaterExp__Group_1_2__2__Impl ;
    public final void rule__LessGreaterExp__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2402:1: ( rule__LessGreaterExp__Group_1_2__2__Impl )
            // InternalUi.g:2403:2: rule__LessGreaterExp__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_2__2"


    // $ANTLR start "rule__LessGreaterExp__Group_1_2__2__Impl"
    // InternalUi.g:2409:1: rule__LessGreaterExp__Group_1_2__2__Impl : ( ( rule__LessGreaterExp__RightAssignment_1_2_2 ) ) ;
    public final void rule__LessGreaterExp__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2413:1: ( ( ( rule__LessGreaterExp__RightAssignment_1_2_2 ) ) )
            // InternalUi.g:2414:1: ( ( rule__LessGreaterExp__RightAssignment_1_2_2 ) )
            {
            // InternalUi.g:2414:1: ( ( rule__LessGreaterExp__RightAssignment_1_2_2 ) )
            // InternalUi.g:2415:2: ( rule__LessGreaterExp__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getLessGreaterExpAccess().getRightAssignment_1_2_2()); 
            // InternalUi.g:2416:2: ( rule__LessGreaterExp__RightAssignment_1_2_2 )
            // InternalUi.g:2416:3: rule__LessGreaterExp__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getLessGreaterExpAccess().getRightAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_2__2__Impl"


    // $ANTLR start "rule__LessGreaterExp__Group_1_3__0"
    // InternalUi.g:2425:1: rule__LessGreaterExp__Group_1_3__0 : rule__LessGreaterExp__Group_1_3__0__Impl rule__LessGreaterExp__Group_1_3__1 ;
    public final void rule__LessGreaterExp__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2429:1: ( rule__LessGreaterExp__Group_1_3__0__Impl rule__LessGreaterExp__Group_1_3__1 )
            // InternalUi.g:2430:2: rule__LessGreaterExp__Group_1_3__0__Impl rule__LessGreaterExp__Group_1_3__1
            {
            pushFollow(FOLLOW_23);
            rule__LessGreaterExp__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_3__0"


    // $ANTLR start "rule__LessGreaterExp__Group_1_3__0__Impl"
    // InternalUi.g:2437:1: rule__LessGreaterExp__Group_1_3__0__Impl : ( () ) ;
    public final void rule__LessGreaterExp__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2441:1: ( ( () ) )
            // InternalUi.g:2442:1: ( () )
            {
            // InternalUi.g:2442:1: ( () )
            // InternalUi.g:2443:2: ()
            {
             before(grammarAccess.getLessGreaterExpAccess().getGreaterOrEqualLeftAction_1_3_0()); 
            // InternalUi.g:2444:2: ()
            // InternalUi.g:2444:3: 
            {
            }

             after(grammarAccess.getLessGreaterExpAccess().getGreaterOrEqualLeftAction_1_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_3__0__Impl"


    // $ANTLR start "rule__LessGreaterExp__Group_1_3__1"
    // InternalUi.g:2452:1: rule__LessGreaterExp__Group_1_3__1 : rule__LessGreaterExp__Group_1_3__1__Impl rule__LessGreaterExp__Group_1_3__2 ;
    public final void rule__LessGreaterExp__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2456:1: ( rule__LessGreaterExp__Group_1_3__1__Impl rule__LessGreaterExp__Group_1_3__2 )
            // InternalUi.g:2457:2: rule__LessGreaterExp__Group_1_3__1__Impl rule__LessGreaterExp__Group_1_3__2
            {
            pushFollow(FOLLOW_12);
            rule__LessGreaterExp__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_3__1"


    // $ANTLR start "rule__LessGreaterExp__Group_1_3__1__Impl"
    // InternalUi.g:2464:1: rule__LessGreaterExp__Group_1_3__1__Impl : ( '>=' ) ;
    public final void rule__LessGreaterExp__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2468:1: ( ( '>=' ) )
            // InternalUi.g:2469:1: ( '>=' )
            {
            // InternalUi.g:2469:1: ( '>=' )
            // InternalUi.g:2470:2: '>='
            {
             before(grammarAccess.getLessGreaterExpAccess().getGreaterThanSignEqualsSignKeyword_1_3_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLessGreaterExpAccess().getGreaterThanSignEqualsSignKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_3__1__Impl"


    // $ANTLR start "rule__LessGreaterExp__Group_1_3__2"
    // InternalUi.g:2479:1: rule__LessGreaterExp__Group_1_3__2 : rule__LessGreaterExp__Group_1_3__2__Impl ;
    public final void rule__LessGreaterExp__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2483:1: ( rule__LessGreaterExp__Group_1_3__2__Impl )
            // InternalUi.g:2484:2: rule__LessGreaterExp__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__Group_1_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_3__2"


    // $ANTLR start "rule__LessGreaterExp__Group_1_3__2__Impl"
    // InternalUi.g:2490:1: rule__LessGreaterExp__Group_1_3__2__Impl : ( ( rule__LessGreaterExp__RightAssignment_1_3_2 ) ) ;
    public final void rule__LessGreaterExp__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2494:1: ( ( ( rule__LessGreaterExp__RightAssignment_1_3_2 ) ) )
            // InternalUi.g:2495:1: ( ( rule__LessGreaterExp__RightAssignment_1_3_2 ) )
            {
            // InternalUi.g:2495:1: ( ( rule__LessGreaterExp__RightAssignment_1_3_2 ) )
            // InternalUi.g:2496:2: ( rule__LessGreaterExp__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getLessGreaterExpAccess().getRightAssignment_1_3_2()); 
            // InternalUi.g:2497:2: ( rule__LessGreaterExp__RightAssignment_1_3_2 )
            // InternalUi.g:2497:3: rule__LessGreaterExp__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__LessGreaterExp__RightAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getLessGreaterExpAccess().getRightAssignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__Group_1_3__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalUi.g:2506:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2510:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalUi.g:2511:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalUi.g:2518:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2522:1: ( ( () ) )
            // InternalUi.g:2523:1: ( () )
            {
            // InternalUi.g:2523:1: ( () )
            // InternalUi.g:2524:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNumberAction_0_0()); 
            // InternalUi.g:2525:2: ()
            // InternalUi.g:2525:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNumberAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalUi.g:2533:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2537:1: ( rule__Primary__Group_0__1__Impl )
            // InternalUi.g:2538:2: rule__Primary__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalUi.g:2544:1: rule__Primary__Group_0__1__Impl : ( ( rule__Primary__ValueAssignment_0_1 ) ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2548:1: ( ( ( rule__Primary__ValueAssignment_0_1 ) ) )
            // InternalUi.g:2549:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            {
            // InternalUi.g:2549:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            // InternalUi.g:2550:2: ( rule__Primary__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 
            // InternalUi.g:2551:2: ( rule__Primary__ValueAssignment_0_1 )
            // InternalUi.g:2551:3: rule__Primary__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__UI23__NameAssignment_1"
    // InternalUi.g:2560:1: rule__UI23__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UI23__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2564:1: ( ( RULE_ID ) )
            // InternalUi.g:2565:2: ( RULE_ID )
            {
            // InternalUi.g:2565:2: ( RULE_ID )
            // InternalUi.g:2566:3: RULE_ID
            {
             before(grammarAccess.getUI23Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUI23Access().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI23__NameAssignment_1"


    // $ANTLR start "rule__UI23__FormAssignment_2"
    // InternalUi.g:2575:1: rule__UI23__FormAssignment_2 : ( ruleForm ) ;
    public final void rule__UI23__FormAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2579:1: ( ( ruleForm ) )
            // InternalUi.g:2580:2: ( ruleForm )
            {
            // InternalUi.g:2580:2: ( ruleForm )
            // InternalUi.g:2581:3: ruleForm
            {
             before(grammarAccess.getUI23Access().getFormFormParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getUI23Access().getFormFormParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UI23__FormAssignment_2"


    // $ANTLR start "rule__Form__NameAssignment_1"
    // InternalUi.g:2590:1: rule__Form__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Form__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2594:1: ( ( RULE_ID ) )
            // InternalUi.g:2595:2: ( RULE_ID )
            {
            // InternalUi.g:2595:2: ( RULE_ID )
            // InternalUi.g:2596:3: RULE_ID
            {
             before(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__NameAssignment_1"


    // $ANTLR start "rule__Form__LayoutAssignment_3"
    // InternalUi.g:2605:1: rule__Form__LayoutAssignment_3 : ( ruleLayout ) ;
    public final void rule__Form__LayoutAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2609:1: ( ( ruleLayout ) )
            // InternalUi.g:2610:2: ( ruleLayout )
            {
            // InternalUi.g:2610:2: ( ruleLayout )
            // InternalUi.g:2611:3: ruleLayout
            {
             before(grammarAccess.getFormAccess().getLayoutLayoutParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getFormAccess().getLayoutLayoutParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__LayoutAssignment_3"


    // $ANTLR start "rule__Column__ElementsAssignment_2"
    // InternalUi.g:2620:1: rule__Column__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Column__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2624:1: ( ( ruleElement ) )
            // InternalUi.g:2625:2: ( ruleElement )
            {
            // InternalUi.g:2625:2: ( ruleElement )
            // InternalUi.g:2626:3: ruleElement
            {
             before(grammarAccess.getColumnAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getElementsElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__ElementsAssignment_2"


    // $ANTLR start "rule__Row__ElementsAssignment_2"
    // InternalUi.g:2635:1: rule__Row__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Row__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2639:1: ( ( ruleElement ) )
            // InternalUi.g:2640:2: ( ruleElement )
            {
            // InternalUi.g:2640:2: ( ruleElement )
            // InternalUi.g:2641:3: ruleElement
            {
             before(grammarAccess.getRowAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getRowAccess().getElementsElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__ElementsAssignment_2"


    // $ANTLR start "rule__Label__ValueAssignment_2"
    // InternalUi.g:2650:1: rule__Label__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Label__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2654:1: ( ( RULE_STRING ) )
            // InternalUi.g:2655:2: ( RULE_STRING )
            {
            // InternalUi.g:2655:2: ( RULE_STRING )
            // InternalUi.g:2656:3: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__ValueAssignment_2"


    // $ANTLR start "rule__Input__NameAssignment_1"
    // InternalUi.g:2665:1: rule__Input__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Input__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2669:1: ( ( RULE_ID ) )
            // InternalUi.g:2670:2: ( RULE_ID )
            {
            // InternalUi.g:2670:2: ( RULE_ID )
            // InternalUi.g:2671:3: RULE_ID
            {
             before(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__NameAssignment_1"


    // $ANTLR start "rule__Input__ExpAssignment_3"
    // InternalUi.g:2680:1: rule__Input__ExpAssignment_3 : ( ruleExp ) ;
    public final void rule__Input__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2684:1: ( ( ruleExp ) )
            // InternalUi.g:2685:2: ( ruleExp )
            {
            // InternalUi.g:2685:2: ( ruleExp )
            // InternalUi.g:2686:3: ruleExp
            {
             before(grammarAccess.getInputAccess().getExpExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getInputAccess().getExpExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ExpAssignment_3"


    // $ANTLR start "rule__Button__NameAssignment_0_1"
    // InternalUi.g:2695:1: rule__Button__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2699:1: ( ( RULE_ID ) )
            // InternalUi.g:2700:2: ( RULE_ID )
            {
            // InternalUi.g:2700:2: ( RULE_ID )
            // InternalUi.g:2701:3: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__NameAssignment_0_1"


    // $ANTLR start "rule__Button__ValueAssignment_0_3"
    // InternalUi.g:2710:1: rule__Button__ValueAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__Button__ValueAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2714:1: ( ( RULE_STRING ) )
            // InternalUi.g:2715:2: ( RULE_STRING )
            {
            // InternalUi.g:2715:2: ( RULE_STRING )
            // InternalUi.g:2716:3: RULE_STRING
            {
             before(grammarAccess.getButtonAccess().getValueSTRINGTerminalRuleCall_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getValueSTRINGTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__ValueAssignment_0_3"


    // $ANTLR start "rule__Button__NameAssignment_1_2"
    // InternalUi.g:2725:1: rule__Button__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2729:1: ( ( RULE_ID ) )
            // InternalUi.g:2730:2: ( RULE_ID )
            {
            // InternalUi.g:2730:2: ( RULE_ID )
            // InternalUi.g:2731:3: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__NameAssignment_1_2"


    // $ANTLR start "rule__Button__ValueAssignment_1_4"
    // InternalUi.g:2740:1: rule__Button__ValueAssignment_1_4 : ( RULE_STRING ) ;
    public final void rule__Button__ValueAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2744:1: ( ( RULE_STRING ) )
            // InternalUi.g:2745:2: ( RULE_STRING )
            {
            // InternalUi.g:2745:2: ( RULE_STRING )
            // InternalUi.g:2746:3: RULE_STRING
            {
             before(grammarAccess.getButtonAccess().getValueSTRINGTerminalRuleCall_1_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getValueSTRINGTerminalRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__ValueAssignment_1_4"


    // $ANTLR start "rule__Type__ValueAssignment_0_1"
    // InternalUi.g:2755:1: rule__Type__ValueAssignment_0_1 : ( ( 'string' ) ) ;
    public final void rule__Type__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2759:1: ( ( ( 'string' ) ) )
            // InternalUi.g:2760:2: ( ( 'string' ) )
            {
            // InternalUi.g:2760:2: ( ( 'string' ) )
            // InternalUi.g:2761:3: ( 'string' )
            {
             before(grammarAccess.getTypeAccess().getValueStringKeyword_0_1_0()); 
            // InternalUi.g:2762:3: ( 'string' )
            // InternalUi.g:2763:4: 'string'
            {
             before(grammarAccess.getTypeAccess().getValueStringKeyword_0_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getValueStringKeyword_0_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getValueStringKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ValueAssignment_0_1"


    // $ANTLR start "rule__Type__ValueAssignment_1_1"
    // InternalUi.g:2774:1: rule__Type__ValueAssignment_1_1 : ( ( '#string' ) ) ;
    public final void rule__Type__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2778:1: ( ( ( '#string' ) ) )
            // InternalUi.g:2779:2: ( ( '#string' ) )
            {
            // InternalUi.g:2779:2: ( ( '#string' ) )
            // InternalUi.g:2780:3: ( '#string' )
            {
             before(grammarAccess.getTypeAccess().getValueStringKeyword_1_1_0()); 
            // InternalUi.g:2781:3: ( '#string' )
            // InternalUi.g:2782:4: '#string'
            {
             before(grammarAccess.getTypeAccess().getValueStringKeyword_1_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getValueStringKeyword_1_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getValueStringKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ValueAssignment_1_1"


    // $ANTLR start "rule__Type__ValueAssignment_2_1"
    // InternalUi.g:2793:1: rule__Type__ValueAssignment_2_1 : ( ( 'number' ) ) ;
    public final void rule__Type__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2797:1: ( ( ( 'number' ) ) )
            // InternalUi.g:2798:2: ( ( 'number' ) )
            {
            // InternalUi.g:2798:2: ( ( 'number' ) )
            // InternalUi.g:2799:3: ( 'number' )
            {
             before(grammarAccess.getTypeAccess().getValueNumberKeyword_2_1_0()); 
            // InternalUi.g:2800:3: ( 'number' )
            // InternalUi.g:2801:4: 'number'
            {
             before(grammarAccess.getTypeAccess().getValueNumberKeyword_2_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getValueNumberKeyword_2_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getValueNumberKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ValueAssignment_2_1"


    // $ANTLR start "rule__BooleanExp__RightAssignment_1_0_2"
    // InternalUi.g:2812:1: rule__BooleanExp__RightAssignment_1_0_2 : ( ruleEqualityExp ) ;
    public final void rule__BooleanExp__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2816:1: ( ( ruleEqualityExp ) )
            // InternalUi.g:2817:2: ( ruleEqualityExp )
            {
            // InternalUi.g:2817:2: ( ruleEqualityExp )
            // InternalUi.g:2818:3: ruleEqualityExp
            {
             before(grammarAccess.getBooleanExpAccess().getRightEqualityExpParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityExp();

            state._fsp--;

             after(grammarAccess.getBooleanExpAccess().getRightEqualityExpParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__RightAssignment_1_0_2"


    // $ANTLR start "rule__BooleanExp__RightAssignment_1_1_2"
    // InternalUi.g:2827:1: rule__BooleanExp__RightAssignment_1_1_2 : ( ruleEqualityExp ) ;
    public final void rule__BooleanExp__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2831:1: ( ( ruleEqualityExp ) )
            // InternalUi.g:2832:2: ( ruleEqualityExp )
            {
            // InternalUi.g:2832:2: ( ruleEqualityExp )
            // InternalUi.g:2833:3: ruleEqualityExp
            {
             before(grammarAccess.getBooleanExpAccess().getRightEqualityExpParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEqualityExp();

            state._fsp--;

             after(grammarAccess.getBooleanExpAccess().getRightEqualityExpParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__RightAssignment_1_1_2"


    // $ANTLR start "rule__EqualityExp__RightAssignment_1_0_2"
    // InternalUi.g:2842:1: rule__EqualityExp__RightAssignment_1_0_2 : ( ruleLessGreaterExp ) ;
    public final void rule__EqualityExp__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2846:1: ( ( ruleLessGreaterExp ) )
            // InternalUi.g:2847:2: ( ruleLessGreaterExp )
            {
            // InternalUi.g:2847:2: ( ruleLessGreaterExp )
            // InternalUi.g:2848:3: ruleLessGreaterExp
            {
             before(grammarAccess.getEqualityExpAccess().getRightLessGreaterExpParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLessGreaterExp();

            state._fsp--;

             after(grammarAccess.getEqualityExpAccess().getRightLessGreaterExpParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__RightAssignment_1_0_2"


    // $ANTLR start "rule__EqualityExp__RightAssignment_1_1_2"
    // InternalUi.g:2857:1: rule__EqualityExp__RightAssignment_1_1_2 : ( ruleLessGreaterExp ) ;
    public final void rule__EqualityExp__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2861:1: ( ( ruleLessGreaterExp ) )
            // InternalUi.g:2862:2: ( ruleLessGreaterExp )
            {
            // InternalUi.g:2862:2: ( ruleLessGreaterExp )
            // InternalUi.g:2863:3: ruleLessGreaterExp
            {
             before(grammarAccess.getEqualityExpAccess().getRightLessGreaterExpParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLessGreaterExp();

            state._fsp--;

             after(grammarAccess.getEqualityExpAccess().getRightLessGreaterExpParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExp__RightAssignment_1_1_2"


    // $ANTLR start "rule__LessGreaterExp__RightAssignment_1_0_2"
    // InternalUi.g:2872:1: rule__LessGreaterExp__RightAssignment_1_0_2 : ( rulePrimary ) ;
    public final void rule__LessGreaterExp__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2876:1: ( ( rulePrimary ) )
            // InternalUi.g:2877:2: ( rulePrimary )
            {
            // InternalUi.g:2877:2: ( rulePrimary )
            // InternalUi.g:2878:3: rulePrimary
            {
             before(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__RightAssignment_1_0_2"


    // $ANTLR start "rule__LessGreaterExp__RightAssignment_1_1_2"
    // InternalUi.g:2887:1: rule__LessGreaterExp__RightAssignment_1_1_2 : ( rulePrimary ) ;
    public final void rule__LessGreaterExp__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2891:1: ( ( rulePrimary ) )
            // InternalUi.g:2892:2: ( rulePrimary )
            {
            // InternalUi.g:2892:2: ( rulePrimary )
            // InternalUi.g:2893:3: rulePrimary
            {
             before(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__RightAssignment_1_1_2"


    // $ANTLR start "rule__LessGreaterExp__RightAssignment_1_2_2"
    // InternalUi.g:2902:1: rule__LessGreaterExp__RightAssignment_1_2_2 : ( rulePrimary ) ;
    public final void rule__LessGreaterExp__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2906:1: ( ( rulePrimary ) )
            // InternalUi.g:2907:2: ( rulePrimary )
            {
            // InternalUi.g:2907:2: ( rulePrimary )
            // InternalUi.g:2908:3: rulePrimary
            {
             before(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__RightAssignment_1_2_2"


    // $ANTLR start "rule__LessGreaterExp__RightAssignment_1_3_2"
    // InternalUi.g:2917:1: rule__LessGreaterExp__RightAssignment_1_3_2 : ( rulePrimary ) ;
    public final void rule__LessGreaterExp__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2921:1: ( ( rulePrimary ) )
            // InternalUi.g:2922:2: ( rulePrimary )
            {
            // InternalUi.g:2922:2: ( rulePrimary )
            // InternalUi.g:2923:3: rulePrimary
            {
             before(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_3_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LessGreaterExp__RightAssignment_1_3_2"


    // $ANTLR start "rule__Primary__ValueAssignment_0_1"
    // InternalUi.g:2932:1: rule__Primary__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Primary__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2936:1: ( ( RULE_INT ) )
            // InternalUi.g:2937:2: ( RULE_INT )
            {
            // InternalUi.g:2937:2: ( RULE_INT )
            // InternalUi.g:2938:3: RULE_INT
            {
             before(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ValueAssignment_0_1"


    // $ANTLR start "rule__Primary__TypeAssignment_1"
    // InternalUi.g:2947:1: rule__Primary__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Primary__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2951:1: ( ( ruleType ) )
            // InternalUi.g:2952:2: ( ruleType )
            {
            // InternalUi.g:2952:2: ( ruleType )
            // InternalUi.g:2953:3: ruleType
            {
             before(grammarAccess.getPrimaryAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__TypeAssignment_1"


    // $ANTLR start "rule__InputUse__RefAssignment"
    // InternalUi.g:2962:1: rule__InputUse__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__InputUse__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUi.g:2966:1: ( ( ( RULE_ID ) ) )
            // InternalUi.g:2967:2: ( ( RULE_ID ) )
            {
            // InternalUi.g:2967:2: ( ( RULE_ID ) )
            // InternalUi.g:2968:3: ( RULE_ID )
            {
             before(grammarAccess.getInputUseAccess().getRefInputCrossReference_0()); 
            // InternalUi.g:2969:3: ( RULE_ID )
            // InternalUi.g:2970:4: RULE_ID
            {
             before(grammarAccess.getInputUseAccess().getRefInputIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputUseAccess().getRefInputIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getInputUseAccess().getRefInputCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputUse__RefAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003B8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003B8002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000001C0000050L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});

}