package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
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

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:71:1: ruleMathExp returns [EObject current=null] : ( (lv_variables_0_0= ruleVariable ) )* ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_0_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( ( (lv_variables_0_0= ruleVariable ) )* )
            // InternalMath.g:78:2: ( (lv_variables_0_0= ruleVariable ) )*
            {
            // InternalMath.g:78:2: ( (lv_variables_0_0= ruleVariable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:79:3: (lv_variables_0_0= ruleVariable )
            	    {
            	    // InternalMath.g:79:3: (lv_variables_0_0= ruleVariable )
            	    // InternalMath.g:80:4: lv_variables_0_0= ruleVariable
            	    {

            	    				newCompositeNode(grammarAccess.getMathExpAccess().getVariablesVariableParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_variables_0_0=ruleVariable();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    				}
            	    				add(
            	    					current,
            	    					"variables",
            	    					lv_variables_0_0,
            	    					"dk.sdu.mmmi.mdsd.Math.Variable");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleVariable"
    // InternalMath.g:100:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMath.g:100:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMath.g:101:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMath.g:107:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:113:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalMath.g:114:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalMath.g:114:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            // InternalMath.g:115:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalMath.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:141:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalMath.g:142:4: (lv_exp_3_0= ruleExp )
            {
            // InternalMath.g:142:4: (lv_exp_3_0= ruleExp )
            // InternalMath.g:143:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:164:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:164:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:165:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:171:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Factor_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMath.g:177:2: ( (this_Factor_0= ruleFactor ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) ) )* ) )
            // InternalMath.g:178:2: (this_Factor_0= ruleFactor ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) ) )* )
            {
            // InternalMath.g:178:2: (this_Factor_0= ruleFactor ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) ) )* )
            // InternalMath.g:179:3: this_Factor_0= ruleFactor ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:187:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }
                else if ( (LA2_0==14) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:188:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) )
            	    {
            	    // InternalMath.g:188:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) )
            	    // InternalMath.g:189:5: () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) )
            	    {
            	    // InternalMath.g:189:5: ()
            	    // InternalMath.g:190:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalMath.g:200:5: ( (lv_right_3_0= ruleFactor ) )
            	    // InternalMath.g:201:6: (lv_right_3_0= ruleFactor )
            	    {
            	    // InternalMath.g:201:6: (lv_right_3_0= ruleFactor )
            	    // InternalMath.g:202:7: lv_right_3_0= ruleFactor
            	    {

            	    							newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=ruleFactor();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"dk.sdu.mmmi.mdsd.Math.Factor");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMath.g:221:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) )
            	    {
            	    // InternalMath.g:221:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) )
            	    // InternalMath.g:222:5: () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) )
            	    {
            	    // InternalMath.g:222:5: ()
            	    // InternalMath.g:223:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpAccess().getMinusLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,14,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalMath.g:233:5: ( (lv_right_6_0= ruleFactor ) )
            	    // InternalMath.g:234:6: (lv_right_6_0= ruleFactor )
            	    {
            	    // InternalMath.g:234:6: (lv_right_6_0= ruleFactor )
            	    // InternalMath.g:235:7: lv_right_6_0= ruleFactor
            	    {

            	    							newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_right_6_0=ruleFactor();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"dk.sdu.mmmi.mdsd.Math.Factor");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:258:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMath.g:258:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMath.g:259:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:265:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMath.g:271:2: ( (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* ) )
            // InternalMath.g:272:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* )
            {
            // InternalMath.g:272:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* )
            // InternalMath.g:273:3: this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:281:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }
                else if ( (LA3_0==16) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMath.g:282:4: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )
            	    {
            	    // InternalMath.g:282:4: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )
            	    // InternalMath.g:283:5: () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:283:5: ()
            	    // InternalMath.g:284:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getFactorAccess().getMultiLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalMath.g:294:5: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMath.g:295:6: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMath.g:295:6: (lv_right_3_0= rulePrimary )
            	    // InternalMath.g:296:7: lv_right_3_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFactorRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"dk.sdu.mmmi.mdsd.Math.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMath.g:315:4: ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) )
            	    {
            	    // InternalMath.g:315:4: ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) )
            	    // InternalMath.g:316:5: () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:316:5: ()
            	    // InternalMath.g:317:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getFactorAccess().getDiviLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getFactorAccess().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalMath.g:327:5: ( (lv_right_6_0= rulePrimary ) )
            	    // InternalMath.g:328:6: (lv_right_6_0= rulePrimary )
            	    {
            	    // InternalMath.g:328:6: (lv_right_6_0= rulePrimary )
            	    // InternalMath.g:329:7: lv_right_6_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_right_6_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFactorRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"dk.sdu.mmmi.mdsd.Math.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:352:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:352:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:353:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:359:1: rulePrimary returns [EObject current=null] : (this_MathNumber_0= ruleMathNumber | this_Parenthesis_1= ruleParenthesis | this_LetVariable_2= ruleLetVariable | this_VariableUse_3= ruleVariableUse ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_MathNumber_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_LetVariable_2 = null;

        EObject this_VariableUse_3 = null;



        	enterRule();

        try {
            // InternalMath.g:365:2: ( (this_MathNumber_0= ruleMathNumber | this_Parenthesis_1= ruleParenthesis | this_LetVariable_2= ruleLetVariable | this_VariableUse_3= ruleVariableUse ) )
            // InternalMath.g:366:2: (this_MathNumber_0= ruleMathNumber | this_Parenthesis_1= ruleParenthesis | this_LetVariable_2= ruleLetVariable | this_VariableUse_3= ruleVariableUse )
            {
            // InternalMath.g:366:2: (this_MathNumber_0= ruleMathNumber | this_Parenthesis_1= ruleParenthesis | this_LetVariable_2= ruleLetVariable | this_VariableUse_3= ruleVariableUse )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
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
                    // InternalMath.g:367:3: this_MathNumber_0= ruleMathNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getMathNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MathNumber_0=ruleMathNumber();

                    state._fsp--;


                    			current = this_MathNumber_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:376:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:385:3: this_LetVariable_2= ruleLetVariable
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetVariable_2=ruleLetVariable();

                    state._fsp--;


                    			current = this_LetVariable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:394:3: this_VariableUse_3= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_3=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_3;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:406:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:406:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:407:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:413:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:419:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalMath.g:420:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalMath.g:420:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalMath.g:421:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMath.g:425:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalMath.g:426:4: (lv_exp_1_0= ruleExp )
            {
            // InternalMath.g:426:4: (lv_exp_1_0= ruleExp )
            // InternalMath.g:427:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_exp_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleMathNumber"
    // InternalMath.g:452:1: entryRuleMathNumber returns [EObject current=null] : iv_ruleMathNumber= ruleMathNumber EOF ;
    public final EObject entryRuleMathNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathNumber = null;


        try {
            // InternalMath.g:452:51: (iv_ruleMathNumber= ruleMathNumber EOF )
            // InternalMath.g:453:2: iv_ruleMathNumber= ruleMathNumber EOF
            {
             newCompositeNode(grammarAccess.getMathNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathNumber=ruleMathNumber();

            state._fsp--;

             current =iv_ruleMathNumber; 
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
    // $ANTLR end "entryRuleMathNumber"


    // $ANTLR start "ruleMathNumber"
    // InternalMath.g:459:1: ruleMathNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleMathNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMath.g:465:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMath.g:466:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMath.g:466:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMath.g:467:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMath.g:467:3: (lv_value_0_0= RULE_INT )
            // InternalMath.g:468:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getMathNumberAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMathNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleMathNumber"


    // $ANTLR start "entryRuleLetVariable"
    // InternalMath.g:487:1: entryRuleLetVariable returns [EObject current=null] : iv_ruleLetVariable= ruleLetVariable EOF ;
    public final EObject entryRuleLetVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariable = null;


        try {
            // InternalMath.g:487:52: (iv_ruleLetVariable= ruleLetVariable EOF )
            // InternalMath.g:488:2: iv_ruleLetVariable= ruleLetVariable EOF
            {
             newCompositeNode(grammarAccess.getLetVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetVariable=ruleLetVariable();

            state._fsp--;

             current =iv_ruleLetVariable; 
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
    // $ANTLR end "entryRuleLetVariable"


    // $ANTLR start "ruleLetVariable"
    // InternalMath.g:494:1: ruleLetVariable returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_exp_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLetVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_3_0 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:500:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_exp_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalMath.g:501:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_exp_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalMath.g:501:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_exp_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalMath.g:502:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_exp_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLetVariableAccess().getLetKeyword_0());
            		
            // InternalMath.g:506:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:507:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:507:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:508:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLetVariableAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:528:3: ( (lv_value_3_0= ruleExp ) )
            // InternalMath.g:529:4: (lv_value_3_0= ruleExp )
            {
            // InternalMath.g:529:4: (lv_value_3_0= ruleExp )
            // InternalMath.g:530:5: lv_value_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetVariableAccess().getValueExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetVariableRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLetVariableAccess().getInKeyword_4());
            		
            // InternalMath.g:551:3: ( (lv_exp_5_0= ruleExp ) )
            // InternalMath.g:552:4: (lv_exp_5_0= ruleExp )
            {
            // InternalMath.g:552:4: (lv_exp_5_0= ruleExp )
            // InternalMath.g:553:5: lv_exp_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetVariableAccess().getExpExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_exp_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetVariableRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_5_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetVariableAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleLetVariable"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:578:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:578:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:579:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:585:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMath.g:591:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMath.g:592:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMath.g:592:2: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:593:3: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:593:3: (otherlv_0= RULE_ID )
            // InternalMath.g:594:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefVariableTypeCrossReference_0());
            			

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
    // $ANTLR end "ruleVariableUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A0030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});

}