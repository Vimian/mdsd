package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'number'", "'a'", "'has'", "'have'", "'system'", "'entity'", "'require'", "'=>'", "'attribute'", "'as'", "'relation'", "'is'", "'many'"
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
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEntityRoot"
    // InternalMyDsl.g:53:1: entryRuleEntityRoot : ruleEntityRoot EOF ;
    public final void entryRuleEntityRoot() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleEntityRoot EOF )
            // InternalMyDsl.g:55:1: ruleEntityRoot EOF
            {
             before(grammarAccess.getEntityRootRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityRoot();

            state._fsp--;

             after(grammarAccess.getEntityRootRule()); 
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
    // $ANTLR end "entryRuleEntityRoot"


    // $ANTLR start "ruleEntityRoot"
    // InternalMyDsl.g:62:1: ruleEntityRoot : ( ( rule__EntityRoot__Group__0 ) ) ;
    public final void ruleEntityRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__EntityRoot__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__EntityRoot__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__EntityRoot__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__EntityRoot__Group__0 )
            {
             before(grammarAccess.getEntityRootAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__EntityRoot__Group__0 )
            // InternalMyDsl.g:69:4: rule__EntityRoot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityRoot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityRootAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityRoot"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEntity EOF )
            // InternalMyDsl.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Entity__Group__0 )
            // InternalMyDsl.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRequire"
    // InternalMyDsl.g:103:1: entryRuleRequire : ruleRequire EOF ;
    public final void entryRuleRequire() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleRequire EOF )
            // InternalMyDsl.g:105:1: ruleRequire EOF
            {
             before(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            ruleRequire();

            state._fsp--;

             after(grammarAccess.getRequireRule()); 
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
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalMyDsl.g:112:1: ruleRequire : ( ( rule__Require__Group__0 ) ) ;
    public final void ruleRequire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Require__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Require__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Require__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Require__Group__0 )
            {
             before(grammarAccess.getRequireAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Require__Group__0 )
            // InternalMyDsl.g:119:4: rule__Require__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Require__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAttribute EOF )
            // InternalMyDsl.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Attribute__Group__0 )
            // InternalMyDsl.g:144:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleType EOF )
            // InternalMyDsl.g:155:1: ruleType EOF
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
    // InternalMyDsl.g:162:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:169:4: rule__Type__Alternatives
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


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:178:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleRelation EOF )
            // InternalMyDsl.g:180:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:187:1: ruleRelation : ( ( rule__Relation__Alternatives ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Relation__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Relation__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Relation__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__Relation__Alternatives )
            {
             before(grammarAccess.getRelationAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__Relation__Alternatives )
            // InternalMyDsl.g:194:4: rule__Relation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "rule__EntityRoot__Alternatives_2"
    // InternalMyDsl.g:202:1: rule__EntityRoot__Alternatives_2 : ( ( ( rule__EntityRoot__EntitiesAssignment_2_0 ) ) | ( ( rule__EntityRoot__RelationsAssignment_2_1 ) ) );
    public final void rule__EntityRoot__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:206:1: ( ( ( rule__EntityRoot__EntitiesAssignment_2_0 ) ) | ( ( rule__EntityRoot__RelationsAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:207:2: ( ( rule__EntityRoot__EntitiesAssignment_2_0 ) )
                    {
                    // InternalMyDsl.g:207:2: ( ( rule__EntityRoot__EntitiesAssignment_2_0 ) )
                    // InternalMyDsl.g:208:3: ( rule__EntityRoot__EntitiesAssignment_2_0 )
                    {
                     before(grammarAccess.getEntityRootAccess().getEntitiesAssignment_2_0()); 
                    // InternalMyDsl.g:209:3: ( rule__EntityRoot__EntitiesAssignment_2_0 )
                    // InternalMyDsl.g:209:4: rule__EntityRoot__EntitiesAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntityRoot__EntitiesAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityRootAccess().getEntitiesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:213:2: ( ( rule__EntityRoot__RelationsAssignment_2_1 ) )
                    {
                    // InternalMyDsl.g:213:2: ( ( rule__EntityRoot__RelationsAssignment_2_1 ) )
                    // InternalMyDsl.g:214:3: ( rule__EntityRoot__RelationsAssignment_2_1 )
                    {
                     before(grammarAccess.getEntityRootAccess().getRelationsAssignment_2_1()); 
                    // InternalMyDsl.g:215:3: ( rule__EntityRoot__RelationsAssignment_2_1 )
                    // InternalMyDsl.g:215:4: rule__EntityRoot__RelationsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntityRoot__RelationsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityRootAccess().getRelationsAssignment_2_1()); 

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
    // $ANTLR end "rule__EntityRoot__Alternatives_2"


    // $ANTLR start "rule__Entity__Alternatives_2"
    // InternalMyDsl.g:223:1: rule__Entity__Alternatives_2 : ( ( ( rule__Entity__AttributesAssignment_2_0 ) ) | ( ( rule__Entity__RequiresAssignment_2_1 ) ) );
    public final void rule__Entity__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:227:1: ( ( ( rule__Entity__AttributesAssignment_2_0 ) ) | ( ( rule__Entity__RequiresAssignment_2_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:228:2: ( ( rule__Entity__AttributesAssignment_2_0 ) )
                    {
                    // InternalMyDsl.g:228:2: ( ( rule__Entity__AttributesAssignment_2_0 ) )
                    // InternalMyDsl.g:229:3: ( rule__Entity__AttributesAssignment_2_0 )
                    {
                     before(grammarAccess.getEntityAccess().getAttributesAssignment_2_0()); 
                    // InternalMyDsl.g:230:3: ( rule__Entity__AttributesAssignment_2_0 )
                    // InternalMyDsl.g:230:4: rule__Entity__AttributesAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__AttributesAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getAttributesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:234:2: ( ( rule__Entity__RequiresAssignment_2_1 ) )
                    {
                    // InternalMyDsl.g:234:2: ( ( rule__Entity__RequiresAssignment_2_1 ) )
                    // InternalMyDsl.g:235:3: ( rule__Entity__RequiresAssignment_2_1 )
                    {
                     before(grammarAccess.getEntityAccess().getRequiresAssignment_2_1()); 
                    // InternalMyDsl.g:236:3: ( rule__Entity__RequiresAssignment_2_1 )
                    // InternalMyDsl.g:236:4: rule__Entity__RequiresAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__RequiresAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getRequiresAssignment_2_1()); 

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
    // $ANTLR end "rule__Entity__Alternatives_2"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:244:1: rule__Type__Alternatives : ( ( 'string' ) | ( 'number' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:248:1: ( ( 'string' ) | ( 'number' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:249:2: ( 'string' )
                    {
                    // InternalMyDsl.g:249:2: ( 'string' )
                    // InternalMyDsl.g:250:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:255:2: ( 'number' )
                    {
                    // InternalMyDsl.g:255:2: ( 'number' )
                    // InternalMyDsl.g:256:3: 'number'
                    {
                     before(grammarAccess.getTypeAccess().getNumberKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getNumberKeyword_1()); 

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


    // $ANTLR start "rule__Relation__Alternatives"
    // InternalMyDsl.g:265:1: rule__Relation__Alternatives : ( ( ( rule__Relation__Group_0__0 ) ) | ( ( rule__Relation__Group_1__0 ) ) );
    public final void rule__Relation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:269:1: ( ( ( rule__Relation__Group_0__0 ) ) | ( ( rule__Relation__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==13||LA4_1==24) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_ID) ) {
                    int LA4_3 = input.LA(3);

                    if ( ((LA4_3>=14 && LA4_3<=15)) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==23) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:270:2: ( ( rule__Relation__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:270:2: ( ( rule__Relation__Group_0__0 ) )
                    // InternalMyDsl.g:271:3: ( rule__Relation__Group_0__0 )
                    {
                     before(grammarAccess.getRelationAccess().getGroup_0()); 
                    // InternalMyDsl.g:272:3: ( rule__Relation__Group_0__0 )
                    // InternalMyDsl.g:272:4: rule__Relation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:276:2: ( ( rule__Relation__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:276:2: ( ( rule__Relation__Group_1__0 ) )
                    // InternalMyDsl.g:277:3: ( rule__Relation__Group_1__0 )
                    {
                     before(grammarAccess.getRelationAccess().getGroup_1()); 
                    // InternalMyDsl.g:278:3: ( rule__Relation__Group_1__0 )
                    // InternalMyDsl.g:278:4: rule__Relation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Relation__Alternatives"


    // $ANTLR start "rule__Relation__Alternatives_1_2"
    // InternalMyDsl.g:286:1: rule__Relation__Alternatives_1_2 : ( ( 'a' ) | ( ( rule__Relation__ManyFromAssignment_1_2_1 ) ) );
    public final void rule__Relation__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:290:1: ( ( 'a' ) | ( ( rule__Relation__ManyFromAssignment_1_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:291:2: ( 'a' )
                    {
                    // InternalMyDsl.g:291:2: ( 'a' )
                    // InternalMyDsl.g:292:3: 'a'
                    {
                     before(grammarAccess.getRelationAccess().getAKeyword_1_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getAKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:297:2: ( ( rule__Relation__ManyFromAssignment_1_2_1 ) )
                    {
                    // InternalMyDsl.g:297:2: ( ( rule__Relation__ManyFromAssignment_1_2_1 ) )
                    // InternalMyDsl.g:298:3: ( rule__Relation__ManyFromAssignment_1_2_1 )
                    {
                     before(grammarAccess.getRelationAccess().getManyFromAssignment_1_2_1()); 
                    // InternalMyDsl.g:299:3: ( rule__Relation__ManyFromAssignment_1_2_1 )
                    // InternalMyDsl.g:299:4: rule__Relation__ManyFromAssignment_1_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__ManyFromAssignment_1_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationAccess().getManyFromAssignment_1_2_1()); 

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
    // $ANTLR end "rule__Relation__Alternatives_1_2"


    // $ANTLR start "rule__Relation__Alternatives_1_4"
    // InternalMyDsl.g:307:1: rule__Relation__Alternatives_1_4 : ( ( 'has' ) | ( 'have' ) );
    public final void rule__Relation__Alternatives_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:311:1: ( ( 'has' ) | ( 'have' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:312:2: ( 'has' )
                    {
                    // InternalMyDsl.g:312:2: ( 'has' )
                    // InternalMyDsl.g:313:3: 'has'
                    {
                     before(grammarAccess.getRelationAccess().getHasKeyword_1_4_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getHasKeyword_1_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:318:2: ( 'have' )
                    {
                    // InternalMyDsl.g:318:2: ( 'have' )
                    // InternalMyDsl.g:319:3: 'have'
                    {
                     before(grammarAccess.getRelationAccess().getHaveKeyword_1_4_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getHaveKeyword_1_4_1()); 

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
    // $ANTLR end "rule__Relation__Alternatives_1_4"


    // $ANTLR start "rule__Relation__Alternatives_1_5"
    // InternalMyDsl.g:328:1: rule__Relation__Alternatives_1_5 : ( ( 'a' ) | ( ( rule__Relation__ManyToAssignment_1_5_1 ) ) );
    public final void rule__Relation__Alternatives_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:332:1: ( ( 'a' ) | ( ( rule__Relation__ManyToAssignment_1_5_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:333:2: ( 'a' )
                    {
                    // InternalMyDsl.g:333:2: ( 'a' )
                    // InternalMyDsl.g:334:3: 'a'
                    {
                     before(grammarAccess.getRelationAccess().getAKeyword_1_5_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getAKeyword_1_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:339:2: ( ( rule__Relation__ManyToAssignment_1_5_1 ) )
                    {
                    // InternalMyDsl.g:339:2: ( ( rule__Relation__ManyToAssignment_1_5_1 ) )
                    // InternalMyDsl.g:340:3: ( rule__Relation__ManyToAssignment_1_5_1 )
                    {
                     before(grammarAccess.getRelationAccess().getManyToAssignment_1_5_1()); 
                    // InternalMyDsl.g:341:3: ( rule__Relation__ManyToAssignment_1_5_1 )
                    // InternalMyDsl.g:341:4: rule__Relation__ManyToAssignment_1_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__ManyToAssignment_1_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationAccess().getManyToAssignment_1_5_1()); 

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
    // $ANTLR end "rule__Relation__Alternatives_1_5"


    // $ANTLR start "rule__EntityRoot__Group__0"
    // InternalMyDsl.g:349:1: rule__EntityRoot__Group__0 : rule__EntityRoot__Group__0__Impl rule__EntityRoot__Group__1 ;
    public final void rule__EntityRoot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:353:1: ( rule__EntityRoot__Group__0__Impl rule__EntityRoot__Group__1 )
            // InternalMyDsl.g:354:2: rule__EntityRoot__Group__0__Impl rule__EntityRoot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EntityRoot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityRoot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRoot__Group__0"


    // $ANTLR start "rule__EntityRoot__Group__0__Impl"
    // InternalMyDsl.g:361:1: rule__EntityRoot__Group__0__Impl : ( 'system' ) ;
    public final void rule__EntityRoot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:365:1: ( ( 'system' ) )
            // InternalMyDsl.g:366:1: ( 'system' )
            {
            // InternalMyDsl.g:366:1: ( 'system' )
            // InternalMyDsl.g:367:2: 'system'
            {
             before(grammarAccess.getEntityRootAccess().getSystemKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityRootAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRoot__Group__0__Impl"


    // $ANTLR start "rule__EntityRoot__Group__1"
    // InternalMyDsl.g:376:1: rule__EntityRoot__Group__1 : rule__EntityRoot__Group__1__Impl rule__EntityRoot__Group__2 ;
    public final void rule__EntityRoot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:380:1: ( rule__EntityRoot__Group__1__Impl rule__EntityRoot__Group__2 )
            // InternalMyDsl.g:381:2: rule__EntityRoot__Group__1__Impl rule__EntityRoot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EntityRoot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityRoot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRoot__Group__1"


    // $ANTLR start "rule__EntityRoot__Group__1__Impl"
    // InternalMyDsl.g:388:1: rule__EntityRoot__Group__1__Impl : ( ( rule__EntityRoot__NameAssignment_1 ) ) ;
    public final void rule__EntityRoot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:392:1: ( ( ( rule__EntityRoot__NameAssignment_1 ) ) )
            // InternalMyDsl.g:393:1: ( ( rule__EntityRoot__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:393:1: ( ( rule__EntityRoot__NameAssignment_1 ) )
            // InternalMyDsl.g:394:2: ( rule__EntityRoot__NameAssignment_1 )
            {
             before(grammarAccess.getEntityRootAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:395:2: ( rule__EntityRoot__NameAssignment_1 )
            // InternalMyDsl.g:395:3: rule__EntityRoot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityRoot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityRootAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRoot__Group__1__Impl"


    // $ANTLR start "rule__EntityRoot__Group__2"
    // InternalMyDsl.g:403:1: rule__EntityRoot__Group__2 : rule__EntityRoot__Group__2__Impl ;
    public final void rule__EntityRoot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( rule__EntityRoot__Group__2__Impl )
            // InternalMyDsl.g:408:2: rule__EntityRoot__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityRoot__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRoot__Group__2"


    // $ANTLR start "rule__EntityRoot__Group__2__Impl"
    // InternalMyDsl.g:414:1: rule__EntityRoot__Group__2__Impl : ( ( rule__EntityRoot__Alternatives_2 )* ) ;
    public final void rule__EntityRoot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:418:1: ( ( ( rule__EntityRoot__Alternatives_2 )* ) )
            // InternalMyDsl.g:419:1: ( ( rule__EntityRoot__Alternatives_2 )* )
            {
            // InternalMyDsl.g:419:1: ( ( rule__EntityRoot__Alternatives_2 )* )
            // InternalMyDsl.g:420:2: ( rule__EntityRoot__Alternatives_2 )*
            {
             before(grammarAccess.getEntityRootAccess().getAlternatives_2()); 
            // InternalMyDsl.g:421:2: ( rule__EntityRoot__Alternatives_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17||LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:421:3: rule__EntityRoot__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__EntityRoot__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityRootAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRoot__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalMyDsl.g:430:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:435:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalMyDsl.g:442:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:446:1: ( ( 'entity' ) )
            // InternalMyDsl.g:447:1: ( 'entity' )
            {
            // InternalMyDsl.g:447:1: ( 'entity' )
            // InternalMyDsl.g:448:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalMyDsl.g:457:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyDsl.g:462:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalMyDsl.g:469:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:474:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:474:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMyDsl.g:475:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:476:2: ( rule__Entity__NameAssignment_1 )
            // InternalMyDsl.g:476:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalMyDsl.g:484:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:488:1: ( rule__Entity__Group__2__Impl )
            // InternalMyDsl.g:489:2: rule__Entity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalMyDsl.g:495:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Alternatives_2 )* ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:499:1: ( ( ( rule__Entity__Alternatives_2 )* ) )
            // InternalMyDsl.g:500:1: ( ( rule__Entity__Alternatives_2 )* )
            {
            // InternalMyDsl.g:500:1: ( ( rule__Entity__Alternatives_2 )* )
            // InternalMyDsl.g:501:2: ( rule__Entity__Alternatives_2 )*
            {
             before(grammarAccess.getEntityAccess().getAlternatives_2()); 
            // InternalMyDsl.g:502:2: ( rule__Entity__Alternatives_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18||LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:502:3: rule__Entity__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entity__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Require__Group__0"
    // InternalMyDsl.g:511:1: rule__Require__Group__0 : rule__Require__Group__0__Impl rule__Require__Group__1 ;
    public final void rule__Require__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( rule__Require__Group__0__Impl rule__Require__Group__1 )
            // InternalMyDsl.g:516:2: rule__Require__Group__0__Impl rule__Require__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Require__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Require__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__0"


    // $ANTLR start "rule__Require__Group__0__Impl"
    // InternalMyDsl.g:523:1: rule__Require__Group__0__Impl : ( 'require' ) ;
    public final void rule__Require__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:527:1: ( ( 'require' ) )
            // InternalMyDsl.g:528:1: ( 'require' )
            {
            // InternalMyDsl.g:528:1: ( 'require' )
            // InternalMyDsl.g:529:2: 'require'
            {
             before(grammarAccess.getRequireAccess().getRequireKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRequireAccess().getRequireKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__0__Impl"


    // $ANTLR start "rule__Require__Group__1"
    // InternalMyDsl.g:538:1: rule__Require__Group__1 : rule__Require__Group__1__Impl rule__Require__Group__2 ;
    public final void rule__Require__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:542:1: ( rule__Require__Group__1__Impl rule__Require__Group__2 )
            // InternalMyDsl.g:543:2: rule__Require__Group__1__Impl rule__Require__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Require__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Require__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__1"


    // $ANTLR start "rule__Require__Group__1__Impl"
    // InternalMyDsl.g:550:1: rule__Require__Group__1__Impl : ( ( rule__Require__LeftAssignment_1 ) ) ;
    public final void rule__Require__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:554:1: ( ( ( rule__Require__LeftAssignment_1 ) ) )
            // InternalMyDsl.g:555:1: ( ( rule__Require__LeftAssignment_1 ) )
            {
            // InternalMyDsl.g:555:1: ( ( rule__Require__LeftAssignment_1 ) )
            // InternalMyDsl.g:556:2: ( rule__Require__LeftAssignment_1 )
            {
             before(grammarAccess.getRequireAccess().getLeftAssignment_1()); 
            // InternalMyDsl.g:557:2: ( rule__Require__LeftAssignment_1 )
            // InternalMyDsl.g:557:3: rule__Require__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Require__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequireAccess().getLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__1__Impl"


    // $ANTLR start "rule__Require__Group__2"
    // InternalMyDsl.g:565:1: rule__Require__Group__2 : rule__Require__Group__2__Impl rule__Require__Group__3 ;
    public final void rule__Require__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( rule__Require__Group__2__Impl rule__Require__Group__3 )
            // InternalMyDsl.g:570:2: rule__Require__Group__2__Impl rule__Require__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Require__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Require__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__2"


    // $ANTLR start "rule__Require__Group__2__Impl"
    // InternalMyDsl.g:577:1: rule__Require__Group__2__Impl : ( '=>' ) ;
    public final void rule__Require__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:581:1: ( ( '=>' ) )
            // InternalMyDsl.g:582:1: ( '=>' )
            {
            // InternalMyDsl.g:582:1: ( '=>' )
            // InternalMyDsl.g:583:2: '=>'
            {
             before(grammarAccess.getRequireAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRequireAccess().getEqualsSignGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__2__Impl"


    // $ANTLR start "rule__Require__Group__3"
    // InternalMyDsl.g:592:1: rule__Require__Group__3 : rule__Require__Group__3__Impl ;
    public final void rule__Require__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( rule__Require__Group__3__Impl )
            // InternalMyDsl.g:597:2: rule__Require__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Require__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__3"


    // $ANTLR start "rule__Require__Group__3__Impl"
    // InternalMyDsl.g:603:1: rule__Require__Group__3__Impl : ( ( rule__Require__RightAssignment_3 ) ) ;
    public final void rule__Require__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( ( ( rule__Require__RightAssignment_3 ) ) )
            // InternalMyDsl.g:608:1: ( ( rule__Require__RightAssignment_3 ) )
            {
            // InternalMyDsl.g:608:1: ( ( rule__Require__RightAssignment_3 ) )
            // InternalMyDsl.g:609:2: ( rule__Require__RightAssignment_3 )
            {
             before(grammarAccess.getRequireAccess().getRightAssignment_3()); 
            // InternalMyDsl.g:610:2: ( rule__Require__RightAssignment_3 )
            // InternalMyDsl.g:610:3: rule__Require__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Require__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRequireAccess().getRightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDsl.g:619:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:624:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDsl.g:631:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:635:1: ( ( 'attribute' ) )
            // InternalMyDsl.g:636:1: ( 'attribute' )
            {
            // InternalMyDsl.g:636:1: ( 'attribute' )
            // InternalMyDsl.g:637:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDsl.g:646:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:651:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDsl.g:658:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:662:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyDsl.g:663:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:663:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyDsl.g:664:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:665:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyDsl.g:665:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyDsl.g:673:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalMyDsl.g:678:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyDsl.g:685:1: rule__Attribute__Group__2__Impl : ( 'as' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:689:1: ( ( 'as' ) )
            // InternalMyDsl.g:690:1: ( 'as' )
            {
            // InternalMyDsl.g:690:1: ( 'as' )
            // InternalMyDsl.g:691:2: 'as'
            {
             before(grammarAccess.getAttributeAccess().getAsKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalMyDsl.g:700:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:704:1: ( rule__Attribute__Group__3__Impl )
            // InternalMyDsl.g:705:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalMyDsl.g:711:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:715:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalMyDsl.g:716:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalMyDsl.g:716:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalMyDsl.g:717:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalMyDsl.g:718:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalMyDsl.g:718:3: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group_0__0"
    // InternalMyDsl.g:727:1: rule__Relation__Group_0__0 : rule__Relation__Group_0__0__Impl rule__Relation__Group_0__1 ;
    public final void rule__Relation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( rule__Relation__Group_0__0__Impl rule__Relation__Group_0__1 )
            // InternalMyDsl.g:732:2: rule__Relation__Group_0__0__Impl rule__Relation__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Relation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_0__0"


    // $ANTLR start "rule__Relation__Group_0__0__Impl"
    // InternalMyDsl.g:739:1: rule__Relation__Group_0__0__Impl : ( () ) ;
    public final void rule__Relation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:743:1: ( ( () ) )
            // InternalMyDsl.g:744:1: ( () )
            {
            // InternalMyDsl.g:744:1: ( () )
            // InternalMyDsl.g:745:2: ()
            {
             before(grammarAccess.getRelationAccess().getInheritanceAction_0_0()); 
            // InternalMyDsl.g:746:2: ()
            // InternalMyDsl.g:746:3: 
            {
            }

             after(grammarAccess.getRelationAccess().getInheritanceAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_0__0__Impl"


    // $ANTLR start "rule__Relation__Group_0__1"
    // InternalMyDsl.g:754:1: rule__Relation__Group_0__1 : rule__Relation__Group_0__1__Impl rule__Relation__Group_0__2 ;
    public final void rule__Relation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:758:1: ( rule__Relation__Group_0__1__Impl rule__Relation__Group_0__2 )
            // InternalMyDsl.g:759:2: rule__Relation__Group_0__1__Impl rule__Relation__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_0__1"


    // $ANTLR start "rule__Relation__Group_0__1__Impl"
    // InternalMyDsl.g:766:1: rule__Relation__Group_0__1__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:770:1: ( ( 'relation' ) )
            // InternalMyDsl.g:771:1: ( 'relation' )
            {
            // InternalMyDsl.g:771:1: ( 'relation' )
            // InternalMyDsl.g:772:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_0__1__Impl"


    // $ANTLR start "rule__Relation__Group_0__2"
    // InternalMyDsl.g:781:1: rule__Relation__Group_0__2 : rule__Relation__Group_0__2__Impl rule__Relation__Group_0__3 ;
    public final void rule__Relation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:785:1: ( rule__Relation__Group_0__2__Impl rule__Relation__Group_0__3 )
            // InternalMyDsl.g:786:2: rule__Relation__Group_0__2__Impl rule__Relation__Group_0__3
            {
            pushFollow(FOLLOW_13);
            rule__Relation__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_0__2"


    // $ANTLR start "rule__Relation__Group_0__2__Impl"
    // InternalMyDsl.g:793:1: rule__Relation__Group_0__2__Impl : ( ( rule__Relation__BaseEntityAssignment_0_2 ) ) ;
    public final void rule__Relation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:797:1: ( ( ( rule__Relation__BaseEntityAssignment_0_2 ) ) )
            // InternalMyDsl.g:798:1: ( ( rule__Relation__BaseEntityAssignment_0_2 ) )
            {
            // InternalMyDsl.g:798:1: ( ( rule__Relation__BaseEntityAssignment_0_2 ) )
            // InternalMyDsl.g:799:2: ( rule__Relation__BaseEntityAssignment_0_2 )
            {
             before(grammarAccess.getRelationAccess().getBaseEntityAssignment_0_2()); 
            // InternalMyDsl.g:800:2: ( rule__Relation__BaseEntityAssignment_0_2 )
            // InternalMyDsl.g:800:3: rule__Relation__BaseEntityAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Relation__BaseEntityAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getBaseEntityAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_0__2__Impl"


    // $ANTLR start "rule__Relation__Group_0__3"
    // InternalMyDsl.g:808:1: rule__Relation__Group_0__3 : rule__Relation__Group_0__3__Impl rule__Relation__Group_0__4 ;
    public final void rule__Relation__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( rule__Relation__Group_0__3__Impl rule__Relation__Group_0__4 )
            // InternalMyDsl.g:813:2: rule__Relation__Group_0__3__Impl rule__Relation__Group_0__4
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_0__3"


    // $ANTLR start "rule__Relation__Group_0__3__Impl"
    // InternalMyDsl.g:820:1: rule__Relation__Group_0__3__Impl : ( 'is' ) ;
    public final void rule__Relation__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:824:1: ( ( 'is' ) )
            // InternalMyDsl.g:825:1: ( 'is' )
            {
            // InternalMyDsl.g:825:1: ( 'is' )
            // InternalMyDsl.g:826:2: 'is'
            {
             before(grammarAccess.getRelationAccess().getIsKeyword_0_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getIsKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_0__3__Impl"


    // $ANTLR start "rule__Relation__Group_0__4"
    // InternalMyDsl.g:835:1: rule__Relation__Group_0__4 : rule__Relation__Group_0__4__Impl ;
    public final void rule__Relation__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( rule__Relation__Group_0__4__Impl )
            // InternalMyDsl.g:840:2: rule__Relation__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_0__4"


    // $ANTLR start "rule__Relation__Group_0__4__Impl"
    // InternalMyDsl.g:846:1: rule__Relation__Group_0__4__Impl : ( ( rule__Relation__SuperEntityAssignment_0_4 ) ) ;
    public final void rule__Relation__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:850:1: ( ( ( rule__Relation__SuperEntityAssignment_0_4 ) ) )
            // InternalMyDsl.g:851:1: ( ( rule__Relation__SuperEntityAssignment_0_4 ) )
            {
            // InternalMyDsl.g:851:1: ( ( rule__Relation__SuperEntityAssignment_0_4 ) )
            // InternalMyDsl.g:852:2: ( rule__Relation__SuperEntityAssignment_0_4 )
            {
             before(grammarAccess.getRelationAccess().getSuperEntityAssignment_0_4()); 
            // InternalMyDsl.g:853:2: ( rule__Relation__SuperEntityAssignment_0_4 )
            // InternalMyDsl.g:853:3: rule__Relation__SuperEntityAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Relation__SuperEntityAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getSuperEntityAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_0__4__Impl"


    // $ANTLR start "rule__Relation__Group_1__0"
    // InternalMyDsl.g:862:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // InternalMyDsl.g:867:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Relation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__0"


    // $ANTLR start "rule__Relation__Group_1__0__Impl"
    // InternalMyDsl.g:874:1: rule__Relation__Group_1__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:878:1: ( ( () ) )
            // InternalMyDsl.g:879:1: ( () )
            {
            // InternalMyDsl.g:879:1: ( () )
            // InternalMyDsl.g:880:2: ()
            {
             before(grammarAccess.getRelationAccess().getAssociationAction_1_0()); 
            // InternalMyDsl.g:881:2: ()
            // InternalMyDsl.g:881:3: 
            {
            }

             after(grammarAccess.getRelationAccess().getAssociationAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__0__Impl"


    // $ANTLR start "rule__Relation__Group_1__1"
    // InternalMyDsl.g:889:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 )
            // InternalMyDsl.g:894:2: rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Relation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__1"


    // $ANTLR start "rule__Relation__Group_1__1__Impl"
    // InternalMyDsl.g:901:1: rule__Relation__Group_1__1__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:905:1: ( ( 'relation' ) )
            // InternalMyDsl.g:906:1: ( 'relation' )
            {
            // InternalMyDsl.g:906:1: ( 'relation' )
            // InternalMyDsl.g:907:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__1__Impl"


    // $ANTLR start "rule__Relation__Group_1__2"
    // InternalMyDsl.g:916:1: rule__Relation__Group_1__2 : rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 ;
    public final void rule__Relation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 )
            // InternalMyDsl.g:921:2: rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3
            {
            pushFollow(FOLLOW_14);
            rule__Relation__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__2"


    // $ANTLR start "rule__Relation__Group_1__2__Impl"
    // InternalMyDsl.g:928:1: rule__Relation__Group_1__2__Impl : ( ( rule__Relation__Alternatives_1_2 )? ) ;
    public final void rule__Relation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:932:1: ( ( ( rule__Relation__Alternatives_1_2 )? ) )
            // InternalMyDsl.g:933:1: ( ( rule__Relation__Alternatives_1_2 )? )
            {
            // InternalMyDsl.g:933:1: ( ( rule__Relation__Alternatives_1_2 )? )
            // InternalMyDsl.g:934:2: ( rule__Relation__Alternatives_1_2 )?
            {
             before(grammarAccess.getRelationAccess().getAlternatives_1_2()); 
            // InternalMyDsl.g:935:2: ( rule__Relation__Alternatives_1_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13||LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:935:3: rule__Relation__Alternatives_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Alternatives_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getAlternatives_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__2__Impl"


    // $ANTLR start "rule__Relation__Group_1__3"
    // InternalMyDsl.g:943:1: rule__Relation__Group_1__3 : rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 ;
    public final void rule__Relation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 )
            // InternalMyDsl.g:948:2: rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4
            {
            pushFollow(FOLLOW_15);
            rule__Relation__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__3"


    // $ANTLR start "rule__Relation__Group_1__3__Impl"
    // InternalMyDsl.g:955:1: rule__Relation__Group_1__3__Impl : ( ( rule__Relation__FromAssignment_1_3 ) ) ;
    public final void rule__Relation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:959:1: ( ( ( rule__Relation__FromAssignment_1_3 ) ) )
            // InternalMyDsl.g:960:1: ( ( rule__Relation__FromAssignment_1_3 ) )
            {
            // InternalMyDsl.g:960:1: ( ( rule__Relation__FromAssignment_1_3 ) )
            // InternalMyDsl.g:961:2: ( rule__Relation__FromAssignment_1_3 )
            {
             before(grammarAccess.getRelationAccess().getFromAssignment_1_3()); 
            // InternalMyDsl.g:962:2: ( rule__Relation__FromAssignment_1_3 )
            // InternalMyDsl.g:962:3: rule__Relation__FromAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Relation__FromAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getFromAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__3__Impl"


    // $ANTLR start "rule__Relation__Group_1__4"
    // InternalMyDsl.g:970:1: rule__Relation__Group_1__4 : rule__Relation__Group_1__4__Impl rule__Relation__Group_1__5 ;
    public final void rule__Relation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( rule__Relation__Group_1__4__Impl rule__Relation__Group_1__5 )
            // InternalMyDsl.g:975:2: rule__Relation__Group_1__4__Impl rule__Relation__Group_1__5
            {
            pushFollow(FOLLOW_14);
            rule__Relation__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__4"


    // $ANTLR start "rule__Relation__Group_1__4__Impl"
    // InternalMyDsl.g:982:1: rule__Relation__Group_1__4__Impl : ( ( rule__Relation__Alternatives_1_4 ) ) ;
    public final void rule__Relation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:986:1: ( ( ( rule__Relation__Alternatives_1_4 ) ) )
            // InternalMyDsl.g:987:1: ( ( rule__Relation__Alternatives_1_4 ) )
            {
            // InternalMyDsl.g:987:1: ( ( rule__Relation__Alternatives_1_4 ) )
            // InternalMyDsl.g:988:2: ( rule__Relation__Alternatives_1_4 )
            {
             before(grammarAccess.getRelationAccess().getAlternatives_1_4()); 
            // InternalMyDsl.g:989:2: ( rule__Relation__Alternatives_1_4 )
            // InternalMyDsl.g:989:3: rule__Relation__Alternatives_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Alternatives_1_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getAlternatives_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__4__Impl"


    // $ANTLR start "rule__Relation__Group_1__5"
    // InternalMyDsl.g:997:1: rule__Relation__Group_1__5 : rule__Relation__Group_1__5__Impl rule__Relation__Group_1__6 ;
    public final void rule__Relation__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1001:1: ( rule__Relation__Group_1__5__Impl rule__Relation__Group_1__6 )
            // InternalMyDsl.g:1002:2: rule__Relation__Group_1__5__Impl rule__Relation__Group_1__6
            {
            pushFollow(FOLLOW_14);
            rule__Relation__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__5"


    // $ANTLR start "rule__Relation__Group_1__5__Impl"
    // InternalMyDsl.g:1009:1: rule__Relation__Group_1__5__Impl : ( ( rule__Relation__Alternatives_1_5 )? ) ;
    public final void rule__Relation__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1013:1: ( ( ( rule__Relation__Alternatives_1_5 )? ) )
            // InternalMyDsl.g:1014:1: ( ( rule__Relation__Alternatives_1_5 )? )
            {
            // InternalMyDsl.g:1014:1: ( ( rule__Relation__Alternatives_1_5 )? )
            // InternalMyDsl.g:1015:2: ( rule__Relation__Alternatives_1_5 )?
            {
             before(grammarAccess.getRelationAccess().getAlternatives_1_5()); 
            // InternalMyDsl.g:1016:2: ( rule__Relation__Alternatives_1_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13||LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1016:3: rule__Relation__Alternatives_1_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Alternatives_1_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getAlternatives_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__5__Impl"


    // $ANTLR start "rule__Relation__Group_1__6"
    // InternalMyDsl.g:1024:1: rule__Relation__Group_1__6 : rule__Relation__Group_1__6__Impl ;
    public final void rule__Relation__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( rule__Relation__Group_1__6__Impl )
            // InternalMyDsl.g:1029:2: rule__Relation__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__6"


    // $ANTLR start "rule__Relation__Group_1__6__Impl"
    // InternalMyDsl.g:1035:1: rule__Relation__Group_1__6__Impl : ( ( rule__Relation__ToAssignment_1_6 ) ) ;
    public final void rule__Relation__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1039:1: ( ( ( rule__Relation__ToAssignment_1_6 ) ) )
            // InternalMyDsl.g:1040:1: ( ( rule__Relation__ToAssignment_1_6 ) )
            {
            // InternalMyDsl.g:1040:1: ( ( rule__Relation__ToAssignment_1_6 ) )
            // InternalMyDsl.g:1041:2: ( rule__Relation__ToAssignment_1_6 )
            {
             before(grammarAccess.getRelationAccess().getToAssignment_1_6()); 
            // InternalMyDsl.g:1042:2: ( rule__Relation__ToAssignment_1_6 )
            // InternalMyDsl.g:1042:3: rule__Relation__ToAssignment_1_6
            {
            pushFollow(FOLLOW_2);
            rule__Relation__ToAssignment_1_6();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getToAssignment_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__6__Impl"


    // $ANTLR start "rule__EntityRoot__NameAssignment_1"
    // InternalMyDsl.g:1051:1: rule__EntityRoot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EntityRoot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1056:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1056:2: ( RULE_ID )
            // InternalMyDsl.g:1057:3: RULE_ID
            {
             before(grammarAccess.getEntityRootAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityRootAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRoot__NameAssignment_1"


    // $ANTLR start "rule__EntityRoot__EntitiesAssignment_2_0"
    // InternalMyDsl.g:1066:1: rule__EntityRoot__EntitiesAssignment_2_0 : ( ruleEntity ) ;
    public final void rule__EntityRoot__EntitiesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:1071:2: ( ruleEntity )
            {
            // InternalMyDsl.g:1071:2: ( ruleEntity )
            // InternalMyDsl.g:1072:3: ruleEntity
            {
             before(grammarAccess.getEntityRootAccess().getEntitiesEntityParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRootAccess().getEntitiesEntityParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRoot__EntitiesAssignment_2_0"


    // $ANTLR start "rule__EntityRoot__RelationsAssignment_2_1"
    // InternalMyDsl.g:1081:1: rule__EntityRoot__RelationsAssignment_2_1 : ( ruleRelation ) ;
    public final void rule__EntityRoot__RelationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1085:1: ( ( ruleRelation ) )
            // InternalMyDsl.g:1086:2: ( ruleRelation )
            {
            // InternalMyDsl.g:1086:2: ( ruleRelation )
            // InternalMyDsl.g:1087:3: ruleRelation
            {
             before(grammarAccess.getEntityRootAccess().getRelationsRelationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getEntityRootAccess().getRelationsRelationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityRoot__RelationsAssignment_2_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalMyDsl.g:1096:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1100:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1101:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1101:2: ( RULE_ID )
            // InternalMyDsl.g:1102:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_2_0"
    // InternalMyDsl.g:1111:1: rule__Entity__AttributesAssignment_2_0 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:1116:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:1116:2: ( ruleAttribute )
            // InternalMyDsl.g:1117:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_2_0"


    // $ANTLR start "rule__Entity__RequiresAssignment_2_1"
    // InternalMyDsl.g:1126:1: rule__Entity__RequiresAssignment_2_1 : ( ruleRequire ) ;
    public final void rule__Entity__RequiresAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:1: ( ( ruleRequire ) )
            // InternalMyDsl.g:1131:2: ( ruleRequire )
            {
            // InternalMyDsl.g:1131:2: ( ruleRequire )
            // InternalMyDsl.g:1132:3: ruleRequire
            {
             before(grammarAccess.getEntityAccess().getRequiresRequireParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequire();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getRequiresRequireParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__RequiresAssignment_2_1"


    // $ANTLR start "rule__Require__LeftAssignment_1"
    // InternalMyDsl.g:1141:1: rule__Require__LeftAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Require__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1146:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1146:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1147:3: ( RULE_ID )
            {
             before(grammarAccess.getRequireAccess().getLeftAttributeCrossReference_1_0()); 
            // InternalMyDsl.g:1148:3: ( RULE_ID )
            // InternalMyDsl.g:1149:4: RULE_ID
            {
             before(grammarAccess.getRequireAccess().getLeftAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequireAccess().getLeftAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRequireAccess().getLeftAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__LeftAssignment_1"


    // $ANTLR start "rule__Require__RightAssignment_3"
    // InternalMyDsl.g:1160:1: rule__Require__RightAssignment_3 : ( RULE_INT ) ;
    public final void rule__Require__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1164:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1165:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1165:2: ( RULE_INT )
            // InternalMyDsl.g:1166:3: RULE_INT
            {
             before(grammarAccess.getRequireAccess().getRightINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRequireAccess().getRightINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Require__RightAssignment_3"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDsl.g:1175:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1179:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1180:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1180:2: ( RULE_ID )
            // InternalMyDsl.g:1181:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalMyDsl.g:1190:1: rule__Attribute__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1194:1: ( ( ruleType ) )
            // InternalMyDsl.g:1195:2: ( ruleType )
            {
            // InternalMyDsl.g:1195:2: ( ruleType )
            // InternalMyDsl.g:1196:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__Relation__BaseEntityAssignment_0_2"
    // InternalMyDsl.g:1205:1: rule__Relation__BaseEntityAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__BaseEntityAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1209:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1210:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1210:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1211:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getBaseEntityEntityCrossReference_0_2_0()); 
            // InternalMyDsl.g:1212:3: ( RULE_ID )
            // InternalMyDsl.g:1213:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getBaseEntityEntityIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getBaseEntityEntityIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getBaseEntityEntityCrossReference_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__BaseEntityAssignment_0_2"


    // $ANTLR start "rule__Relation__SuperEntityAssignment_0_4"
    // InternalMyDsl.g:1224:1: rule__Relation__SuperEntityAssignment_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__SuperEntityAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1228:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1229:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1229:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1230:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getSuperEntityEntityCrossReference_0_4_0()); 
            // InternalMyDsl.g:1231:3: ( RULE_ID )
            // InternalMyDsl.g:1232:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getSuperEntityEntityIDTerminalRuleCall_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getSuperEntityEntityIDTerminalRuleCall_0_4_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getSuperEntityEntityCrossReference_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__SuperEntityAssignment_0_4"


    // $ANTLR start "rule__Relation__ManyFromAssignment_1_2_1"
    // InternalMyDsl.g:1243:1: rule__Relation__ManyFromAssignment_1_2_1 : ( ( 'many' ) ) ;
    public final void rule__Relation__ManyFromAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( ( ( 'many' ) ) )
            // InternalMyDsl.g:1248:2: ( ( 'many' ) )
            {
            // InternalMyDsl.g:1248:2: ( ( 'many' ) )
            // InternalMyDsl.g:1249:3: ( 'many' )
            {
             before(grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0()); 
            // InternalMyDsl.g:1250:3: ( 'many' )
            // InternalMyDsl.g:1251:4: 'many'
            {
             before(grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0()); 

            }

             after(grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__ManyFromAssignment_1_2_1"


    // $ANTLR start "rule__Relation__FromAssignment_1_3"
    // InternalMyDsl.g:1262:1: rule__Relation__FromAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__FromAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1267:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1267:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1268:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getFromEntityCrossReference_1_3_0()); 
            // InternalMyDsl.g:1269:3: ( RULE_ID )
            // InternalMyDsl.g:1270:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getFromEntityCrossReference_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__FromAssignment_1_3"


    // $ANTLR start "rule__Relation__ManyToAssignment_1_5_1"
    // InternalMyDsl.g:1281:1: rule__Relation__ManyToAssignment_1_5_1 : ( ( 'many' ) ) ;
    public final void rule__Relation__ManyToAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1285:1: ( ( ( 'many' ) ) )
            // InternalMyDsl.g:1286:2: ( ( 'many' ) )
            {
            // InternalMyDsl.g:1286:2: ( ( 'many' ) )
            // InternalMyDsl.g:1287:3: ( 'many' )
            {
             before(grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0()); 
            // InternalMyDsl.g:1288:3: ( 'many' )
            // InternalMyDsl.g:1289:4: 'many'
            {
             before(grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0()); 

            }

             after(grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__ManyToAssignment_1_5_1"


    // $ANTLR start "rule__Relation__ToAssignment_1_6"
    // InternalMyDsl.g:1300:1: rule__Relation__ToAssignment_1_6 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ToAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1304:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1305:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1305:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1306:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getToEntityCrossReference_1_6_0()); 
            // InternalMyDsl.g:1307:3: ( RULE_ID )
            // InternalMyDsl.g:1308:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_1_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_1_6_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getToEntityCrossReference_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__ToAssignment_1_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001002010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000000C000L});

}