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
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'let'", "'in'", "'end'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }


    	private MathGrammarAccess grammarAccess;

    	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:53:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalMath.g:54:1: ( ruleMathExp EOF )
            // InternalMath.g:55:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:62:1: ruleMathExp : ( ( rule__MathExp__VarExpAssignment )* ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:66:2: ( ( ( rule__MathExp__VarExpAssignment )* ) )
            // InternalMath.g:67:2: ( ( rule__MathExp__VarExpAssignment )* )
            {
            // InternalMath.g:67:2: ( ( rule__MathExp__VarExpAssignment )* )
            // InternalMath.g:68:3: ( rule__MathExp__VarExpAssignment )*
            {
             before(grammarAccess.getMathExpAccess().getVarExpAssignment()); 
            // InternalMath.g:69:3: ( rule__MathExp__VarExpAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:69:4: rule__MathExp__VarExpAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MathExp__VarExpAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMathExpAccess().getVarExpAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleVariableExp"
    // InternalMath.g:78:1: entryRuleVariableExp : ruleVariableExp EOF ;
    public final void entryRuleVariableExp() throws RecognitionException {
        try {
            // InternalMath.g:79:1: ( ruleVariableExp EOF )
            // InternalMath.g:80:1: ruleVariableExp EOF
            {
             before(grammarAccess.getVariableExpRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableExp();

            state._fsp--;

             after(grammarAccess.getVariableExpRule()); 
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
    // $ANTLR end "entryRuleVariableExp"


    // $ANTLR start "ruleVariableExp"
    // InternalMath.g:87:1: ruleVariableExp : ( ( rule__VariableExp__Group__0 ) ) ;
    public final void ruleVariableExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:91:2: ( ( ( rule__VariableExp__Group__0 ) ) )
            // InternalMath.g:92:2: ( ( rule__VariableExp__Group__0 ) )
            {
            // InternalMath.g:92:2: ( ( rule__VariableExp__Group__0 ) )
            // InternalMath.g:93:3: ( rule__VariableExp__Group__0 )
            {
             before(grammarAccess.getVariableExpAccess().getGroup()); 
            // InternalMath.g:94:3: ( rule__VariableExp__Group__0 )
            // InternalMath.g:94:4: rule__VariableExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableExp"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:103:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalMath.g:104:1: ( ruleExp EOF )
            // InternalMath.g:105:1: ruleExp EOF
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
    // InternalMath.g:112:1: ruleExp : ( rulePlusMinus ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:116:2: ( ( rulePlusMinus ) )
            // InternalMath.g:117:2: ( rulePlusMinus )
            {
            // InternalMath.g:117:2: ( rulePlusMinus )
            // InternalMath.g:118:3: rulePlusMinus
            {
             before(grammarAccess.getExpAccess().getPlusMinusParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getExpAccess().getPlusMinusParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePlusMinus"
    // InternalMath.g:128:1: entryRulePlusMinus : rulePlusMinus EOF ;
    public final void entryRulePlusMinus() throws RecognitionException {
        try {
            // InternalMath.g:129:1: ( rulePlusMinus EOF )
            // InternalMath.g:130:1: rulePlusMinus EOF
            {
             before(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getPlusMinusRule()); 
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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalMath.g:137:1: rulePlusMinus : ( ( rule__PlusMinus__Group__0 ) ) ;
    public final void rulePlusMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:141:2: ( ( ( rule__PlusMinus__Group__0 ) ) )
            // InternalMath.g:142:2: ( ( rule__PlusMinus__Group__0 ) )
            {
            // InternalMath.g:142:2: ( ( rule__PlusMinus__Group__0 ) )
            // InternalMath.g:143:3: ( rule__PlusMinus__Group__0 )
            {
             before(grammarAccess.getPlusMinusAccess().getGroup()); 
            // InternalMath.g:144:3: ( rule__PlusMinus__Group__0 )
            // InternalMath.g:144:4: rule__PlusMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleTerm"
    // InternalMath.g:153:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalMath.g:154:1: ( ruleTerm EOF )
            // InternalMath.g:155:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMath.g:162:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:166:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalMath.g:167:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalMath.g:167:2: ( ( rule__Term__Group__0 ) )
            // InternalMath.g:168:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalMath.g:169:3: ( rule__Term__Group__0 )
            // InternalMath.g:169:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:178:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMath.g:179:1: ( rulePrimary EOF )
            // InternalMath.g:180:1: rulePrimary EOF
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
    // InternalMath.g:187:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:191:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMath.g:192:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMath.g:192:2: ( ( rule__Primary__Alternatives ) )
            // InternalMath.g:193:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMath.g:194:3: ( rule__Primary__Alternatives )
            // InternalMath.g:194:4: rule__Primary__Alternatives
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


    // $ANTLR start "entryRuleLetBinding"
    // InternalMath.g:203:1: entryRuleLetBinding : ruleLetBinding EOF ;
    public final void entryRuleLetBinding() throws RecognitionException {
        try {
            // InternalMath.g:204:1: ( ruleLetBinding EOF )
            // InternalMath.g:205:1: ruleLetBinding EOF
            {
             before(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleLetBinding();

            state._fsp--;

             after(grammarAccess.getLetBindingRule()); 
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
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalMath.g:212:1: ruleLetBinding : ( ( rule__LetBinding__Group__0 ) ) ;
    public final void ruleLetBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:216:2: ( ( ( rule__LetBinding__Group__0 ) ) )
            // InternalMath.g:217:2: ( ( rule__LetBinding__Group__0 ) )
            {
            // InternalMath.g:217:2: ( ( rule__LetBinding__Group__0 ) )
            // InternalMath.g:218:3: ( rule__LetBinding__Group__0 )
            {
             before(grammarAccess.getLetBindingAccess().getGroup()); 
            // InternalMath.g:219:3: ( rule__LetBinding__Group__0 )
            // InternalMath.g:219:4: rule__LetBinding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:228:1: entryRuleVariableUse : ruleVariableUse EOF ;
    public final void entryRuleVariableUse() throws RecognitionException {
        try {
            // InternalMath.g:229:1: ( ruleVariableUse EOF )
            // InternalMath.g:230:1: ruleVariableUse EOF
            {
             before(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableUse();

            state._fsp--;

             after(grammarAccess.getVariableUseRule()); 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:237:1: ruleVariableUse : ( ( rule__VariableUse__RefAssignment ) ) ;
    public final void ruleVariableUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:241:2: ( ( ( rule__VariableUse__RefAssignment ) ) )
            // InternalMath.g:242:2: ( ( rule__VariableUse__RefAssignment ) )
            {
            // InternalMath.g:242:2: ( ( rule__VariableUse__RefAssignment ) )
            // InternalMath.g:243:3: ( rule__VariableUse__RefAssignment )
            {
             before(grammarAccess.getVariableUseAccess().getRefAssignment()); 
            // InternalMath.g:244:3: ( rule__VariableUse__RefAssignment )
            // InternalMath.g:244:4: rule__VariableUse__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "rule__PlusMinus__Alternatives_1"
    // InternalMath.g:252:1: rule__PlusMinus__Alternatives_1 : ( ( ( rule__PlusMinus__Group_1_0__0 ) ) | ( ( rule__PlusMinus__Group_1_1__0 ) ) );
    public final void rule__PlusMinus__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:256:1: ( ( ( rule__PlusMinus__Group_1_0__0 ) ) | ( ( rule__PlusMinus__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMath.g:257:2: ( ( rule__PlusMinus__Group_1_0__0 ) )
                    {
                    // InternalMath.g:257:2: ( ( rule__PlusMinus__Group_1_0__0 ) )
                    // InternalMath.g:258:3: ( rule__PlusMinus__Group_1_0__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_0()); 
                    // InternalMath.g:259:3: ( rule__PlusMinus__Group_1_0__0 )
                    // InternalMath.g:259:4: rule__PlusMinus__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinus__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:263:2: ( ( rule__PlusMinus__Group_1_1__0 ) )
                    {
                    // InternalMath.g:263:2: ( ( rule__PlusMinus__Group_1_1__0 ) )
                    // InternalMath.g:264:3: ( rule__PlusMinus__Group_1_1__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_1()); 
                    // InternalMath.g:265:3: ( rule__PlusMinus__Group_1_1__0 )
                    // InternalMath.g:265:4: rule__PlusMinus__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinus__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__PlusMinus__Alternatives_1"


    // $ANTLR start "rule__Term__Alternatives_1"
    // InternalMath.g:273:1: rule__Term__Alternatives_1 : ( ( ( rule__Term__Group_1_0__0 ) ) | ( ( rule__Term__Group_1_1__0 ) ) );
    public final void rule__Term__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:277:1: ( ( ( rule__Term__Group_1_0__0 ) ) | ( ( rule__Term__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:278:2: ( ( rule__Term__Group_1_0__0 ) )
                    {
                    // InternalMath.g:278:2: ( ( rule__Term__Group_1_0__0 ) )
                    // InternalMath.g:279:3: ( rule__Term__Group_1_0__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_0()); 
                    // InternalMath.g:280:3: ( rule__Term__Group_1_0__0 )
                    // InternalMath.g:280:4: rule__Term__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:284:2: ( ( rule__Term__Group_1_1__0 ) )
                    {
                    // InternalMath.g:284:2: ( ( rule__Term__Group_1_1__0 ) )
                    // InternalMath.g:285:3: ( rule__Term__Group_1_1__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_1()); 
                    // InternalMath.g:286:3: ( rule__Term__Group_1_1__0 )
                    // InternalMath.g:286:4: rule__Term__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Term__Alternatives_1"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMath.g:294:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleVariableUse ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleLetBinding ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:298:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleVariableUse ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleLetBinding ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMath.g:299:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMath.g:299:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMath.g:300:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMath.g:301:3: ( rule__Primary__Group_0__0 )
                    // InternalMath.g:301:4: rule__Primary__Group_0__0
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
                    // InternalMath.g:305:2: ( ruleVariableUse )
                    {
                    // InternalMath.g:305:2: ( ruleVariableUse )
                    // InternalMath.g:306:3: ruleVariableUse
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableUse();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:311:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalMath.g:311:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalMath.g:312:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalMath.g:313:3: ( rule__Primary__Group_2__0 )
                    // InternalMath.g:313:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMath.g:317:2: ( ruleLetBinding )
                    {
                    // InternalMath.g:317:2: ( ruleLetBinding )
                    // InternalMath.g:318:3: ruleLetBinding
                    {
                     before(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLetBinding();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_3()); 

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


    // $ANTLR start "rule__VariableExp__Group__0"
    // InternalMath.g:327:1: rule__VariableExp__Group__0 : rule__VariableExp__Group__0__Impl rule__VariableExp__Group__1 ;
    public final void rule__VariableExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:331:1: ( rule__VariableExp__Group__0__Impl rule__VariableExp__Group__1 )
            // InternalMath.g:332:2: rule__VariableExp__Group__0__Impl rule__VariableExp__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VariableExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExp__Group__0"


    // $ANTLR start "rule__VariableExp__Group__0__Impl"
    // InternalMath.g:339:1: rule__VariableExp__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:343:1: ( ( 'var' ) )
            // InternalMath.g:344:1: ( 'var' )
            {
            // InternalMath.g:344:1: ( 'var' )
            // InternalMath.g:345:2: 'var'
            {
             before(grammarAccess.getVariableExpAccess().getVarKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getVariableExpAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExp__Group__0__Impl"


    // $ANTLR start "rule__VariableExp__Group__1"
    // InternalMath.g:354:1: rule__VariableExp__Group__1 : rule__VariableExp__Group__1__Impl rule__VariableExp__Group__2 ;
    public final void rule__VariableExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:358:1: ( rule__VariableExp__Group__1__Impl rule__VariableExp__Group__2 )
            // InternalMath.g:359:2: rule__VariableExp__Group__1__Impl rule__VariableExp__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__VariableExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExp__Group__1"


    // $ANTLR start "rule__VariableExp__Group__1__Impl"
    // InternalMath.g:366:1: rule__VariableExp__Group__1__Impl : ( ( rule__VariableExp__NameAssignment_1 ) ) ;
    public final void rule__VariableExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:370:1: ( ( ( rule__VariableExp__NameAssignment_1 ) ) )
            // InternalMath.g:371:1: ( ( rule__VariableExp__NameAssignment_1 ) )
            {
            // InternalMath.g:371:1: ( ( rule__VariableExp__NameAssignment_1 ) )
            // InternalMath.g:372:2: ( rule__VariableExp__NameAssignment_1 )
            {
             before(grammarAccess.getVariableExpAccess().getNameAssignment_1()); 
            // InternalMath.g:373:2: ( rule__VariableExp__NameAssignment_1 )
            // InternalMath.g:373:3: rule__VariableExp__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableExp__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableExpAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExp__Group__1__Impl"


    // $ANTLR start "rule__VariableExp__Group__2"
    // InternalMath.g:381:1: rule__VariableExp__Group__2 : rule__VariableExp__Group__2__Impl rule__VariableExp__Group__3 ;
    public final void rule__VariableExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:385:1: ( rule__VariableExp__Group__2__Impl rule__VariableExp__Group__3 )
            // InternalMath.g:386:2: rule__VariableExp__Group__2__Impl rule__VariableExp__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__VariableExp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableExp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExp__Group__2"


    // $ANTLR start "rule__VariableExp__Group__2__Impl"
    // InternalMath.g:393:1: rule__VariableExp__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:397:1: ( ( '=' ) )
            // InternalMath.g:398:1: ( '=' )
            {
            // InternalMath.g:398:1: ( '=' )
            // InternalMath.g:399:2: '='
            {
             before(grammarAccess.getVariableExpAccess().getEqualsSignKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVariableExpAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExp__Group__2__Impl"


    // $ANTLR start "rule__VariableExp__Group__3"
    // InternalMath.g:408:1: rule__VariableExp__Group__3 : rule__VariableExp__Group__3__Impl ;
    public final void rule__VariableExp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:412:1: ( rule__VariableExp__Group__3__Impl )
            // InternalMath.g:413:2: rule__VariableExp__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableExp__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExp__Group__3"


    // $ANTLR start "rule__VariableExp__Group__3__Impl"
    // InternalMath.g:419:1: rule__VariableExp__Group__3__Impl : ( ( rule__VariableExp__ExpAssignment_3 ) ) ;
    public final void rule__VariableExp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:423:1: ( ( ( rule__VariableExp__ExpAssignment_3 ) ) )
            // InternalMath.g:424:1: ( ( rule__VariableExp__ExpAssignment_3 ) )
            {
            // InternalMath.g:424:1: ( ( rule__VariableExp__ExpAssignment_3 ) )
            // InternalMath.g:425:2: ( rule__VariableExp__ExpAssignment_3 )
            {
             before(grammarAccess.getVariableExpAccess().getExpAssignment_3()); 
            // InternalMath.g:426:2: ( rule__VariableExp__ExpAssignment_3 )
            // InternalMath.g:426:3: rule__VariableExp__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableExp__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableExpAccess().getExpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExp__Group__3__Impl"


    // $ANTLR start "rule__PlusMinus__Group__0"
    // InternalMath.g:435:1: rule__PlusMinus__Group__0 : rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 ;
    public final void rule__PlusMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:439:1: ( rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 )
            // InternalMath.g:440:2: rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PlusMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group__0"


    // $ANTLR start "rule__PlusMinus__Group__0__Impl"
    // InternalMath.g:447:1: rule__PlusMinus__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__PlusMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:451:1: ( ( ruleTerm ) )
            // InternalMath.g:452:1: ( ruleTerm )
            {
            // InternalMath.g:452:1: ( ruleTerm )
            // InternalMath.g:453:2: ruleTerm
            {
             before(grammarAccess.getPlusMinusAccess().getTermParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getTermParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group__1"
    // InternalMath.g:462:1: rule__PlusMinus__Group__1 : rule__PlusMinus__Group__1__Impl ;
    public final void rule__PlusMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:466:1: ( rule__PlusMinus__Group__1__Impl )
            // InternalMath.g:467:2: rule__PlusMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group__1"


    // $ANTLR start "rule__PlusMinus__Group__1__Impl"
    // InternalMath.g:473:1: rule__PlusMinus__Group__1__Impl : ( ( rule__PlusMinus__Alternatives_1 )* ) ;
    public final void rule__PlusMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:477:1: ( ( ( rule__PlusMinus__Alternatives_1 )* ) )
            // InternalMath.g:478:1: ( ( rule__PlusMinus__Alternatives_1 )* )
            {
            // InternalMath.g:478:1: ( ( rule__PlusMinus__Alternatives_1 )* )
            // InternalMath.g:479:2: ( rule__PlusMinus__Alternatives_1 )*
            {
             before(grammarAccess.getPlusMinusAccess().getAlternatives_1()); 
            // InternalMath.g:480:2: ( rule__PlusMinus__Alternatives_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMath.g:480:3: rule__PlusMinus__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__PlusMinus__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPlusMinusAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0__0"
    // InternalMath.g:489:1: rule__PlusMinus__Group_1_0__0 : rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1 ;
    public final void rule__PlusMinus__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:493:1: ( rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1 )
            // InternalMath.g:494:2: rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1
            {
            pushFollow(FOLLOW_9);
            rule__PlusMinus__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__0"


    // $ANTLR start "rule__PlusMinus__Group_1_0__0__Impl"
    // InternalMath.g:501:1: rule__PlusMinus__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:505:1: ( ( () ) )
            // InternalMath.g:506:1: ( () )
            {
            // InternalMath.g:506:1: ( () )
            // InternalMath.g:507:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0()); 
            // InternalMath.g:508:2: ()
            // InternalMath.g:508:3: 
            {
            }

             after(grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0__1"
    // InternalMath.g:516:1: rule__PlusMinus__Group_1_0__1 : rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2 ;
    public final void rule__PlusMinus__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:520:1: ( rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2 )
            // InternalMath.g:521:2: rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__PlusMinus__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__1"


    // $ANTLR start "rule__PlusMinus__Group_1_0__1__Impl"
    // InternalMath.g:528:1: rule__PlusMinus__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__PlusMinus__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:532:1: ( ( '+' ) )
            // InternalMath.g:533:1: ( '+' )
            {
            // InternalMath.g:533:1: ( '+' )
            // InternalMath.g:534:2: '+'
            {
             before(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0__2"
    // InternalMath.g:543:1: rule__PlusMinus__Group_1_0__2 : rule__PlusMinus__Group_1_0__2__Impl ;
    public final void rule__PlusMinus__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:547:1: ( rule__PlusMinus__Group_1_0__2__Impl )
            // InternalMath.g:548:2: rule__PlusMinus__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__2"


    // $ANTLR start "rule__PlusMinus__Group_1_0__2__Impl"
    // InternalMath.g:554:1: rule__PlusMinus__Group_1_0__2__Impl : ( ( rule__PlusMinus__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusMinus__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:558:1: ( ( ( rule__PlusMinus__RightAssignment_1_0_2 ) ) )
            // InternalMath.g:559:1: ( ( rule__PlusMinus__RightAssignment_1_0_2 ) )
            {
            // InternalMath.g:559:1: ( ( rule__PlusMinus__RightAssignment_1_0_2 ) )
            // InternalMath.g:560:2: ( rule__PlusMinus__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getPlusMinusAccess().getRightAssignment_1_0_2()); 
            // InternalMath.g:561:2: ( rule__PlusMinus__RightAssignment_1_0_2 )
            // InternalMath.g:561:3: rule__PlusMinus__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__2__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_1__0"
    // InternalMath.g:570:1: rule__PlusMinus__Group_1_1__0 : rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1 ;
    public final void rule__PlusMinus__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:574:1: ( rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1 )
            // InternalMath.g:575:2: rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1
            {
            pushFollow(FOLLOW_7);
            rule__PlusMinus__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_1__0"


    // $ANTLR start "rule__PlusMinus__Group_1_1__0__Impl"
    // InternalMath.g:582:1: rule__PlusMinus__Group_1_1__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:586:1: ( ( () ) )
            // InternalMath.g:587:1: ( () )
            {
            // InternalMath.g:587:1: ( () )
            // InternalMath.g:588:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_1_0()); 
            // InternalMath.g:589:2: ()
            // InternalMath.g:589:3: 
            {
            }

             after(grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_1__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_1__1"
    // InternalMath.g:597:1: rule__PlusMinus__Group_1_1__1 : rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2 ;
    public final void rule__PlusMinus__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:601:1: ( rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2 )
            // InternalMath.g:602:2: rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2
            {
            pushFollow(FOLLOW_6);
            rule__PlusMinus__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_1__1"


    // $ANTLR start "rule__PlusMinus__Group_1_1__1__Impl"
    // InternalMath.g:609:1: rule__PlusMinus__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__PlusMinus__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:613:1: ( ( '-' ) )
            // InternalMath.g:614:1: ( '-' )
            {
            // InternalMath.g:614:1: ( '-' )
            // InternalMath.g:615:2: '-'
            {
             before(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_1__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_1__2"
    // InternalMath.g:624:1: rule__PlusMinus__Group_1_1__2 : rule__PlusMinus__Group_1_1__2__Impl ;
    public final void rule__PlusMinus__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:628:1: ( rule__PlusMinus__Group_1_1__2__Impl )
            // InternalMath.g:629:2: rule__PlusMinus__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_1__2"


    // $ANTLR start "rule__PlusMinus__Group_1_1__2__Impl"
    // InternalMath.g:635:1: rule__PlusMinus__Group_1_1__2__Impl : ( ( rule__PlusMinus__RightAssignment_1_1_2 ) ) ;
    public final void rule__PlusMinus__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:639:1: ( ( ( rule__PlusMinus__RightAssignment_1_1_2 ) ) )
            // InternalMath.g:640:1: ( ( rule__PlusMinus__RightAssignment_1_1_2 ) )
            {
            // InternalMath.g:640:1: ( ( rule__PlusMinus__RightAssignment_1_1_2 ) )
            // InternalMath.g:641:2: ( rule__PlusMinus__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getPlusMinusAccess().getRightAssignment_1_1_2()); 
            // InternalMath.g:642:2: ( rule__PlusMinus__RightAssignment_1_1_2 )
            // InternalMath.g:642:3: rule__PlusMinus__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_1__2__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalMath.g:651:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:655:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalMath.g:656:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalMath.g:663:1: rule__Term__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:667:1: ( ( rulePrimary ) )
            // InternalMath.g:668:1: ( rulePrimary )
            {
            // InternalMath.g:668:1: ( rulePrimary )
            // InternalMath.g:669:2: rulePrimary
            {
             before(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalMath.g:678:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:682:1: ( rule__Term__Group__1__Impl )
            // InternalMath.g:683:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalMath.g:689:1: rule__Term__Group__1__Impl : ( ( rule__Term__Alternatives_1 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:693:1: ( ( ( rule__Term__Alternatives_1 )* ) )
            // InternalMath.g:694:1: ( ( rule__Term__Alternatives_1 )* )
            {
            // InternalMath.g:694:1: ( ( rule__Term__Alternatives_1 )* )
            // InternalMath.g:695:2: ( rule__Term__Alternatives_1 )*
            {
             before(grammarAccess.getTermAccess().getAlternatives_1()); 
            // InternalMath.g:696:2: ( rule__Term__Alternatives_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=15 && LA6_0<=16)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:696:3: rule__Term__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Term__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0__0"
    // InternalMath.g:705:1: rule__Term__Group_1_0__0 : rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1 ;
    public final void rule__Term__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:709:1: ( rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1 )
            // InternalMath.g:710:2: rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Term__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__0"


    // $ANTLR start "rule__Term__Group_1_0__0__Impl"
    // InternalMath.g:717:1: rule__Term__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:721:1: ( ( () ) )
            // InternalMath.g:722:1: ( () )
            {
            // InternalMath.g:722:1: ( () )
            // InternalMath.g:723:2: ()
            {
             before(grammarAccess.getTermAccess().getMultLeftAction_1_0_0()); 
            // InternalMath.g:724:2: ()
            // InternalMath.g:724:3: 
            {
            }

             after(grammarAccess.getTermAccess().getMultLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__0__Impl"


    // $ANTLR start "rule__Term__Group_1_0__1"
    // InternalMath.g:732:1: rule__Term__Group_1_0__1 : rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2 ;
    public final void rule__Term__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:736:1: ( rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2 )
            // InternalMath.g:737:2: rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Term__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__1"


    // $ANTLR start "rule__Term__Group_1_0__1__Impl"
    // InternalMath.g:744:1: rule__Term__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__Term__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:748:1: ( ( '*' ) )
            // InternalMath.g:749:1: ( '*' )
            {
            // InternalMath.g:749:1: ( '*' )
            // InternalMath.g:750:2: '*'
            {
             before(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0__2"
    // InternalMath.g:759:1: rule__Term__Group_1_0__2 : rule__Term__Group_1_0__2__Impl ;
    public final void rule__Term__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:763:1: ( rule__Term__Group_1_0__2__Impl )
            // InternalMath.g:764:2: rule__Term__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__2"


    // $ANTLR start "rule__Term__Group_1_0__2__Impl"
    // InternalMath.g:770:1: rule__Term__Group_1_0__2__Impl : ( ( rule__Term__RightAssignment_1_0_2 ) ) ;
    public final void rule__Term__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:774:1: ( ( ( rule__Term__RightAssignment_1_0_2 ) ) )
            // InternalMath.g:775:1: ( ( rule__Term__RightAssignment_1_0_2 ) )
            {
            // InternalMath.g:775:1: ( ( rule__Term__RightAssignment_1_0_2 ) )
            // InternalMath.g:776:2: ( rule__Term__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_0_2()); 
            // InternalMath.g:777:2: ( rule__Term__RightAssignment_1_0_2 )
            // InternalMath.g:777:3: rule__Term__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Term__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__2__Impl"


    // $ANTLR start "rule__Term__Group_1_1__0"
    // InternalMath.g:786:1: rule__Term__Group_1_1__0 : rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1 ;
    public final void rule__Term__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:790:1: ( rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1 )
            // InternalMath.g:791:2: rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Term__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_1__0"


    // $ANTLR start "rule__Term__Group_1_1__0__Impl"
    // InternalMath.g:798:1: rule__Term__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:802:1: ( ( () ) )
            // InternalMath.g:803:1: ( () )
            {
            // InternalMath.g:803:1: ( () )
            // InternalMath.g:804:2: ()
            {
             before(grammarAccess.getTermAccess().getDivLeftAction_1_1_0()); 
            // InternalMath.g:805:2: ()
            // InternalMath.g:805:3: 
            {
            }

             after(grammarAccess.getTermAccess().getDivLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1_1__1"
    // InternalMath.g:813:1: rule__Term__Group_1_1__1 : rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2 ;
    public final void rule__Term__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:817:1: ( rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2 )
            // InternalMath.g:818:2: rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Term__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_1__1"


    // $ANTLR start "rule__Term__Group_1_1__1__Impl"
    // InternalMath.g:825:1: rule__Term__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__Term__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:829:1: ( ( '/' ) )
            // InternalMath.g:830:1: ( '/' )
            {
            // InternalMath.g:830:1: ( '/' )
            // InternalMath.g:831:2: '/'
            {
             before(grammarAccess.getTermAccess().getSolidusKeyword_1_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getSolidusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_1__1__Impl"


    // $ANTLR start "rule__Term__Group_1_1__2"
    // InternalMath.g:840:1: rule__Term__Group_1_1__2 : rule__Term__Group_1_1__2__Impl ;
    public final void rule__Term__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:844:1: ( rule__Term__Group_1_1__2__Impl )
            // InternalMath.g:845:2: rule__Term__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_1__2"


    // $ANTLR start "rule__Term__Group_1_1__2__Impl"
    // InternalMath.g:851:1: rule__Term__Group_1_1__2__Impl : ( ( rule__Term__RightAssignment_1_1_2 ) ) ;
    public final void rule__Term__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:855:1: ( ( ( rule__Term__RightAssignment_1_1_2 ) ) )
            // InternalMath.g:856:1: ( ( rule__Term__RightAssignment_1_1_2 ) )
            {
            // InternalMath.g:856:1: ( ( rule__Term__RightAssignment_1_1_2 ) )
            // InternalMath.g:857:2: ( rule__Term__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_1_2()); 
            // InternalMath.g:858:2: ( rule__Term__RightAssignment_1_1_2 )
            // InternalMath.g:858:3: rule__Term__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Term__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMath.g:867:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:871:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMath.g:872:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMath.g:879:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:883:1: ( ( () ) )
            // InternalMath.g:884:1: ( () )
            {
            // InternalMath.g:884:1: ( () )
            // InternalMath.g:885:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNumberAction_0_0()); 
            // InternalMath.g:886:2: ()
            // InternalMath.g:886:3: 
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
    // InternalMath.g:894:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:898:1: ( rule__Primary__Group_0__1__Impl )
            // InternalMath.g:899:2: rule__Primary__Group_0__1__Impl
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
    // InternalMath.g:905:1: rule__Primary__Group_0__1__Impl : ( ( rule__Primary__ValueAssignment_0_1 ) ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:909:1: ( ( ( rule__Primary__ValueAssignment_0_1 ) ) )
            // InternalMath.g:910:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            {
            // InternalMath.g:910:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            // InternalMath.g:911:2: ( rule__Primary__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 
            // InternalMath.g:912:2: ( rule__Primary__ValueAssignment_0_1 )
            // InternalMath.g:912:3: rule__Primary__ValueAssignment_0_1
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


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalMath.g:921:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:925:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalMath.g:926:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalMath.g:933:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:937:1: ( ( '(' ) )
            // InternalMath.g:938:1: ( '(' )
            {
            // InternalMath.g:938:1: ( '(' )
            // InternalMath.g:939:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalMath.g:948:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:952:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalMath.g:953:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalMath.g:960:1: rule__Primary__Group_2__1__Impl : ( ruleExp ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:964:1: ( ( ruleExp ) )
            // InternalMath.g:965:1: ( ruleExp )
            {
            // InternalMath.g:965:1: ( ruleExp )
            // InternalMath.g:966:2: ruleExp
            {
             before(grammarAccess.getPrimaryAccess().getExpParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalMath.g:975:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:979:1: ( rule__Primary__Group_2__2__Impl )
            // InternalMath.g:980:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalMath.g:986:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:990:1: ( ( ')' ) )
            // InternalMath.g:991:1: ( ')' )
            {
            // InternalMath.g:991:1: ( ')' )
            // InternalMath.g:992:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__LetBinding__Group__0"
    // InternalMath.g:1002:1: rule__LetBinding__Group__0 : rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 ;
    public final void rule__LetBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1006:1: ( rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 )
            // InternalMath.g:1007:2: rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LetBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__0"


    // $ANTLR start "rule__LetBinding__Group__0__Impl"
    // InternalMath.g:1014:1: rule__LetBinding__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1018:1: ( ( 'let' ) )
            // InternalMath.g:1019:1: ( 'let' )
            {
            // InternalMath.g:1019:1: ( 'let' )
            // InternalMath.g:1020:2: 'let'
            {
             before(grammarAccess.getLetBindingAccess().getLetKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getLetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__0__Impl"


    // $ANTLR start "rule__LetBinding__Group__1"
    // InternalMath.g:1029:1: rule__LetBinding__Group__1 : rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 ;
    public final void rule__LetBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1033:1: ( rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 )
            // InternalMath.g:1034:2: rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LetBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__1"


    // $ANTLR start "rule__LetBinding__Group__1__Impl"
    // InternalMath.g:1041:1: rule__LetBinding__Group__1__Impl : ( ( rule__LetBinding__NameAssignment_1 ) ) ;
    public final void rule__LetBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1045:1: ( ( ( rule__LetBinding__NameAssignment_1 ) ) )
            // InternalMath.g:1046:1: ( ( rule__LetBinding__NameAssignment_1 ) )
            {
            // InternalMath.g:1046:1: ( ( rule__LetBinding__NameAssignment_1 ) )
            // InternalMath.g:1047:2: ( rule__LetBinding__NameAssignment_1 )
            {
             before(grammarAccess.getLetBindingAccess().getNameAssignment_1()); 
            // InternalMath.g:1048:2: ( rule__LetBinding__NameAssignment_1 )
            // InternalMath.g:1048:3: rule__LetBinding__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__1__Impl"


    // $ANTLR start "rule__LetBinding__Group__2"
    // InternalMath.g:1056:1: rule__LetBinding__Group__2 : rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 ;
    public final void rule__LetBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1060:1: ( rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 )
            // InternalMath.g:1061:2: rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LetBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__2"


    // $ANTLR start "rule__LetBinding__Group__2__Impl"
    // InternalMath.g:1068:1: rule__LetBinding__Group__2__Impl : ( '=' ) ;
    public final void rule__LetBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1072:1: ( ( '=' ) )
            // InternalMath.g:1073:1: ( '=' )
            {
            // InternalMath.g:1073:1: ( '=' )
            // InternalMath.g:1074:2: '='
            {
             before(grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__2__Impl"


    // $ANTLR start "rule__LetBinding__Group__3"
    // InternalMath.g:1083:1: rule__LetBinding__Group__3 : rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 ;
    public final void rule__LetBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1087:1: ( rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 )
            // InternalMath.g:1088:2: rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__LetBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__3"


    // $ANTLR start "rule__LetBinding__Group__3__Impl"
    // InternalMath.g:1095:1: rule__LetBinding__Group__3__Impl : ( ( rule__LetBinding__BindingAssignment_3 ) ) ;
    public final void rule__LetBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1099:1: ( ( ( rule__LetBinding__BindingAssignment_3 ) ) )
            // InternalMath.g:1100:1: ( ( rule__LetBinding__BindingAssignment_3 ) )
            {
            // InternalMath.g:1100:1: ( ( rule__LetBinding__BindingAssignment_3 ) )
            // InternalMath.g:1101:2: ( rule__LetBinding__BindingAssignment_3 )
            {
             before(grammarAccess.getLetBindingAccess().getBindingAssignment_3()); 
            // InternalMath.g:1102:2: ( rule__LetBinding__BindingAssignment_3 )
            // InternalMath.g:1102:3: rule__LetBinding__BindingAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__BindingAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getBindingAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__3__Impl"


    // $ANTLR start "rule__LetBinding__Group__4"
    // InternalMath.g:1110:1: rule__LetBinding__Group__4 : rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 ;
    public final void rule__LetBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1114:1: ( rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 )
            // InternalMath.g:1115:2: rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__LetBinding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__4"


    // $ANTLR start "rule__LetBinding__Group__4__Impl"
    // InternalMath.g:1122:1: rule__LetBinding__Group__4__Impl : ( 'in' ) ;
    public final void rule__LetBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1126:1: ( ( 'in' ) )
            // InternalMath.g:1127:1: ( 'in' )
            {
            // InternalMath.g:1127:1: ( 'in' )
            // InternalMath.g:1128:2: 'in'
            {
             before(grammarAccess.getLetBindingAccess().getInKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getInKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__4__Impl"


    // $ANTLR start "rule__LetBinding__Group__5"
    // InternalMath.g:1137:1: rule__LetBinding__Group__5 : rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 ;
    public final void rule__LetBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1141:1: ( rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 )
            // InternalMath.g:1142:2: rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__LetBinding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__5"


    // $ANTLR start "rule__LetBinding__Group__5__Impl"
    // InternalMath.g:1149:1: rule__LetBinding__Group__5__Impl : ( ( rule__LetBinding__BodyAssignment_5 ) ) ;
    public final void rule__LetBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1153:1: ( ( ( rule__LetBinding__BodyAssignment_5 ) ) )
            // InternalMath.g:1154:1: ( ( rule__LetBinding__BodyAssignment_5 ) )
            {
            // InternalMath.g:1154:1: ( ( rule__LetBinding__BodyAssignment_5 ) )
            // InternalMath.g:1155:2: ( rule__LetBinding__BodyAssignment_5 )
            {
             before(grammarAccess.getLetBindingAccess().getBodyAssignment_5()); 
            // InternalMath.g:1156:2: ( rule__LetBinding__BodyAssignment_5 )
            // InternalMath.g:1156:3: rule__LetBinding__BodyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__BodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getBodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__5__Impl"


    // $ANTLR start "rule__LetBinding__Group__6"
    // InternalMath.g:1164:1: rule__LetBinding__Group__6 : rule__LetBinding__Group__6__Impl ;
    public final void rule__LetBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1168:1: ( rule__LetBinding__Group__6__Impl )
            // InternalMath.g:1169:2: rule__LetBinding__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__6"


    // $ANTLR start "rule__LetBinding__Group__6__Impl"
    // InternalMath.g:1175:1: rule__LetBinding__Group__6__Impl : ( 'end' ) ;
    public final void rule__LetBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1179:1: ( ( 'end' ) )
            // InternalMath.g:1180:1: ( 'end' )
            {
            // InternalMath.g:1180:1: ( 'end' )
            // InternalMath.g:1181:2: 'end'
            {
             before(grammarAccess.getLetBindingAccess().getEndKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getEndKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__6__Impl"


    // $ANTLR start "rule__MathExp__VarExpAssignment"
    // InternalMath.g:1191:1: rule__MathExp__VarExpAssignment : ( ruleVariableExp ) ;
    public final void rule__MathExp__VarExpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1195:1: ( ( ruleVariableExp ) )
            // InternalMath.g:1196:2: ( ruleVariableExp )
            {
            // InternalMath.g:1196:2: ( ruleVariableExp )
            // InternalMath.g:1197:3: ruleVariableExp
            {
             before(grammarAccess.getMathExpAccess().getVarExpVariableExpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableExp();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getVarExpVariableExpParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__VarExpAssignment"


    // $ANTLR start "rule__VariableExp__NameAssignment_1"
    // InternalMath.g:1206:1: rule__VariableExp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableExp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1210:1: ( ( RULE_ID ) )
            // InternalMath.g:1211:2: ( RULE_ID )
            {
            // InternalMath.g:1211:2: ( RULE_ID )
            // InternalMath.g:1212:3: RULE_ID
            {
             before(grammarAccess.getVariableExpAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableExpAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExp__NameAssignment_1"


    // $ANTLR start "rule__VariableExp__ExpAssignment_3"
    // InternalMath.g:1221:1: rule__VariableExp__ExpAssignment_3 : ( ruleExp ) ;
    public final void rule__VariableExp__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1225:1: ( ( ruleExp ) )
            // InternalMath.g:1226:2: ( ruleExp )
            {
            // InternalMath.g:1226:2: ( ruleExp )
            // InternalMath.g:1227:3: ruleExp
            {
             before(grammarAccess.getVariableExpAccess().getExpExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getVariableExpAccess().getExpExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableExp__ExpAssignment_3"


    // $ANTLR start "rule__PlusMinus__RightAssignment_1_0_2"
    // InternalMath.g:1236:1: rule__PlusMinus__RightAssignment_1_0_2 : ( ruleTerm ) ;
    public final void rule__PlusMinus__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1240:1: ( ( ruleTerm ) )
            // InternalMath.g:1241:2: ( ruleTerm )
            {
            // InternalMath.g:1241:2: ( ruleTerm )
            // InternalMath.g:1242:3: ruleTerm
            {
             before(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__RightAssignment_1_0_2"


    // $ANTLR start "rule__PlusMinus__RightAssignment_1_1_2"
    // InternalMath.g:1251:1: rule__PlusMinus__RightAssignment_1_1_2 : ( ruleTerm ) ;
    public final void rule__PlusMinus__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1255:1: ( ( ruleTerm ) )
            // InternalMath.g:1256:2: ( ruleTerm )
            {
            // InternalMath.g:1256:2: ( ruleTerm )
            // InternalMath.g:1257:3: ruleTerm
            {
             before(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__RightAssignment_1_1_2"


    // $ANTLR start "rule__Term__RightAssignment_1_0_2"
    // InternalMath.g:1266:1: rule__Term__RightAssignment_1_0_2 : ( rulePrimary ) ;
    public final void rule__Term__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1270:1: ( ( rulePrimary ) )
            // InternalMath.g:1271:2: ( rulePrimary )
            {
            // InternalMath.g:1271:2: ( rulePrimary )
            // InternalMath.g:1272:3: rulePrimary
            {
             before(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__RightAssignment_1_0_2"


    // $ANTLR start "rule__Term__RightAssignment_1_1_2"
    // InternalMath.g:1281:1: rule__Term__RightAssignment_1_1_2 : ( rulePrimary ) ;
    public final void rule__Term__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1285:1: ( ( rulePrimary ) )
            // InternalMath.g:1286:2: ( rulePrimary )
            {
            // InternalMath.g:1286:2: ( rulePrimary )
            // InternalMath.g:1287:3: rulePrimary
            {
             before(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__RightAssignment_1_1_2"


    // $ANTLR start "rule__Primary__ValueAssignment_0_1"
    // InternalMath.g:1296:1: rule__Primary__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Primary__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1300:1: ( ( RULE_INT ) )
            // InternalMath.g:1301:2: ( RULE_INT )
            {
            // InternalMath.g:1301:2: ( RULE_INT )
            // InternalMath.g:1302:3: RULE_INT
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


    // $ANTLR start "rule__LetBinding__NameAssignment_1"
    // InternalMath.g:1311:1: rule__LetBinding__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LetBinding__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1315:1: ( ( RULE_ID ) )
            // InternalMath.g:1316:2: ( RULE_ID )
            {
            // InternalMath.g:1316:2: ( RULE_ID )
            // InternalMath.g:1317:3: RULE_ID
            {
             before(grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__NameAssignment_1"


    // $ANTLR start "rule__LetBinding__BindingAssignment_3"
    // InternalMath.g:1326:1: rule__LetBinding__BindingAssignment_3 : ( ruleExp ) ;
    public final void rule__LetBinding__BindingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1330:1: ( ( ruleExp ) )
            // InternalMath.g:1331:2: ( ruleExp )
            {
            // InternalMath.g:1331:2: ( ruleExp )
            // InternalMath.g:1332:3: ruleExp
            {
             before(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__BindingAssignment_3"


    // $ANTLR start "rule__LetBinding__BodyAssignment_5"
    // InternalMath.g:1341:1: rule__LetBinding__BodyAssignment_5 : ( ruleExp ) ;
    public final void rule__LetBinding__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1345:1: ( ( ruleExp ) )
            // InternalMath.g:1346:2: ( ruleExp )
            {
            // InternalMath.g:1346:2: ( ruleExp )
            // InternalMath.g:1347:3: ruleExp
            {
             before(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__BodyAssignment_5"


    // $ANTLR start "rule__VariableUse__RefAssignment"
    // InternalMath.g:1356:1: rule__VariableUse__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableUse__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1360:1: ( ( ( RULE_ID ) ) )
            // InternalMath.g:1361:2: ( ( RULE_ID ) )
            {
            // InternalMath.g:1361:2: ( ( RULE_ID ) )
            // InternalMath.g:1362:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableUseAccess().getRefVariableBindingCrossReference_0()); 
            // InternalMath.g:1363:3: ( RULE_ID )
            // InternalMath.g:1364:4: RULE_ID
            {
             before(grammarAccess.getVariableUseAccess().getRefVariableBindingIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableUseAccess().getRefVariableBindingIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVariableUseAccess().getRefVariableBindingCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__RefAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A0030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});

}