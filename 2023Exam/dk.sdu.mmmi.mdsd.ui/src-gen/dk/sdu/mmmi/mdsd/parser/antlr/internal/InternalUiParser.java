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
import dk.sdu.mmmi.mdsd.services.UiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUiParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'form'", "'{'", "'}'", "'column'", "'row'", "'label'", "':'", "'input'", "'button'", "'button*'", "'string'", "'#string'", "'number'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='"
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

        public InternalUiParser(TokenStream input, UiGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UI23";
       	}

       	@Override
       	protected UiGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUI23"
    // InternalUi.g:64:1: entryRuleUI23 returns [EObject current=null] : iv_ruleUI23= ruleUI23 EOF ;
    public final EObject entryRuleUI23() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUI23 = null;


        try {
            // InternalUi.g:64:45: (iv_ruleUI23= ruleUI23 EOF )
            // InternalUi.g:65:2: iv_ruleUI23= ruleUI23 EOF
            {
             newCompositeNode(grammarAccess.getUI23Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUI23=ruleUI23();

            state._fsp--;

             current =iv_ruleUI23; 
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
    // $ANTLR end "entryRuleUI23"


    // $ANTLR start "ruleUI23"
    // InternalUi.g:71:1: ruleUI23 returns [EObject current=null] : (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_form_2_0= ruleForm ) ) ) ;
    public final EObject ruleUI23() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_form_2_0 = null;



        	enterRule();

        try {
            // InternalUi.g:77:2: ( (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_form_2_0= ruleForm ) ) ) )
            // InternalUi.g:78:2: (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_form_2_0= ruleForm ) ) )
            {
            // InternalUi.g:78:2: (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_form_2_0= ruleForm ) ) )
            // InternalUi.g:79:3: otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_form_2_0= ruleForm ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUI23Access().getTitleKeyword_0());
            		
            // InternalUi.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUi.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUi.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalUi.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUI23Access().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUI23Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUi.g:101:3: ( (lv_form_2_0= ruleForm ) )
            // InternalUi.g:102:4: (lv_form_2_0= ruleForm )
            {
            // InternalUi.g:102:4: (lv_form_2_0= ruleForm )
            // InternalUi.g:103:5: lv_form_2_0= ruleForm
            {

            					newCompositeNode(grammarAccess.getUI23Access().getFormFormParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_form_2_0=ruleForm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUI23Rule());
            					}
            					set(
            						current,
            						"form",
            						lv_form_2_0,
            						"dk.sdu.mmmi.mdsd.Ui.Form");
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
    // $ANTLR end "ruleUI23"


    // $ANTLR start "entryRuleForm"
    // InternalUi.g:124:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalUi.g:124:45: (iv_ruleForm= ruleForm EOF )
            // InternalUi.g:125:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalUi.g:131:1: ruleForm returns [EObject current=null] : (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layout_3_0= ruleLayout ) ) otherlv_4= '}' ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_layout_3_0 = null;



        	enterRule();

        try {
            // InternalUi.g:137:2: ( (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layout_3_0= ruleLayout ) ) otherlv_4= '}' ) )
            // InternalUi.g:138:2: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layout_3_0= ruleLayout ) ) otherlv_4= '}' )
            {
            // InternalUi.g:138:2: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layout_3_0= ruleLayout ) ) otherlv_4= '}' )
            // InternalUi.g:139:3: otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_layout_3_0= ruleLayout ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFormAccess().getFormKeyword_0());
            		
            // InternalUi.g:143:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUi.g:144:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUi.g:144:4: (lv_name_1_0= RULE_ID )
            // InternalUi.g:145:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUi.g:165:3: ( (lv_layout_3_0= ruleLayout ) )
            // InternalUi.g:166:4: (lv_layout_3_0= ruleLayout )
            {
            // InternalUi.g:166:4: (lv_layout_3_0= ruleLayout )
            // InternalUi.g:167:5: lv_layout_3_0= ruleLayout
            {

            					newCompositeNode(grammarAccess.getFormAccess().getLayoutLayoutParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_layout_3_0=ruleLayout();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormRule());
            					}
            					set(
            						current,
            						"layout",
            						lv_layout_3_0,
            						"dk.sdu.mmmi.mdsd.Ui.Layout");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFormAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleLayout"
    // InternalUi.g:192:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalUi.g:192:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalUi.g:193:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalUi.g:199:1: ruleLayout returns [EObject current=null] : (this_Column_0= ruleColumn | this_Row_1= ruleRow ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        EObject this_Column_0 = null;

        EObject this_Row_1 = null;



        	enterRule();

        try {
            // InternalUi.g:205:2: ( (this_Column_0= ruleColumn | this_Row_1= ruleRow ) )
            // InternalUi.g:206:2: (this_Column_0= ruleColumn | this_Row_1= ruleRow )
            {
            // InternalUi.g:206:2: (this_Column_0= ruleColumn | this_Row_1= ruleRow )
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
                    // InternalUi.g:207:3: this_Column_0= ruleColumn
                    {

                    			newCompositeNode(grammarAccess.getLayoutAccess().getColumnParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Column_0=ruleColumn();

                    state._fsp--;


                    			current = this_Column_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUi.g:216:3: this_Row_1= ruleRow
                    {

                    			newCompositeNode(grammarAccess.getLayoutAccess().getRowParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Row_1=ruleRow();

                    state._fsp--;


                    			current = this_Row_1;
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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleColumn"
    // InternalUi.g:228:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalUi.g:228:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalUi.g:229:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalUi.g:235:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'column' otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalUi.g:241:2: ( (otherlv_0= 'column' otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}' ) )
            // InternalUi.g:242:2: (otherlv_0= 'column' otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}' )
            {
            // InternalUi.g:242:2: (otherlv_0= 'column' otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}' )
            // InternalUi.g:243:3: otherlv_0= 'column' otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalUi.g:251:3: ( (lv_elements_2_0= ruleElement ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=17)||(LA2_0>=19 && LA2_0<=21)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUi.g:252:4: (lv_elements_2_0= ruleElement )
            	    {
            	    // InternalUi.g:252:4: (lv_elements_2_0= ruleElement )
            	    // InternalUi.g:253:5: lv_elements_2_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getColumnAccess().getElementsElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_elements_2_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getColumnRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"dk.sdu.mmmi.mdsd.Ui.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleRow"
    // InternalUi.g:278:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalUi.g:278:44: (iv_ruleRow= ruleRow EOF )
            // InternalUi.g:279:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
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
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalUi.g:285:1: ruleRow returns [EObject current=null] : (otherlv_0= 'row' otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}' ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalUi.g:291:2: ( (otherlv_0= 'row' otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}' ) )
            // InternalUi.g:292:2: (otherlv_0= 'row' otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}' )
            {
            // InternalUi.g:292:2: (otherlv_0= 'row' otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}' )
            // InternalUi.g:293:3: otherlv_0= 'row' otherlv_1= '{' ( (lv_elements_2_0= ruleElement ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRowAccess().getRowKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalUi.g:301:3: ( (lv_elements_2_0= ruleElement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=17)||(LA3_0>=19 && LA3_0<=21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUi.g:302:4: (lv_elements_2_0= ruleElement )
            	    {
            	    // InternalUi.g:302:4: (lv_elements_2_0= ruleElement )
            	    // InternalUi.g:303:5: lv_elements_2_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getRowAccess().getElementsElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_elements_2_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"dk.sdu.mmmi.mdsd.Ui.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRowAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleElement"
    // InternalUi.g:328:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalUi.g:328:48: (iv_ruleElement= ruleElement EOF )
            // InternalUi.g:329:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalUi.g:335:1: ruleElement returns [EObject current=null] : (this_Label_0= ruleLabel | this_Input_1= ruleInput | this_Button_2= ruleButton | this_Layout_3= ruleLayout ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Label_0 = null;

        EObject this_Input_1 = null;

        EObject this_Button_2 = null;

        EObject this_Layout_3 = null;



        	enterRule();

        try {
            // InternalUi.g:341:2: ( (this_Label_0= ruleLabel | this_Input_1= ruleInput | this_Button_2= ruleButton | this_Layout_3= ruleLayout ) )
            // InternalUi.g:342:2: (this_Label_0= ruleLabel | this_Input_1= ruleInput | this_Button_2= ruleButton | this_Layout_3= ruleLayout )
            {
            // InternalUi.g:342:2: (this_Label_0= ruleLabel | this_Input_1= ruleInput | this_Button_2= ruleButton | this_Layout_3= ruleLayout )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
            case 21:
                {
                alt4=3;
                }
                break;
            case 15:
            case 16:
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
                    // InternalUi.g:343:3: this_Label_0= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getLabelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_0=ruleLabel();

                    state._fsp--;


                    			current = this_Label_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUi.g:352:3: this_Input_1= ruleInput
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getInputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Input_1=ruleInput();

                    state._fsp--;


                    			current = this_Input_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUi.g:361:3: this_Button_2= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getButtonParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_2=ruleButton();

                    state._fsp--;


                    			current = this_Button_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUi.g:370:3: this_Layout_3= ruleLayout
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getLayoutParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Layout_3=ruleLayout();

                    state._fsp--;


                    			current = this_Layout_3;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleLabel"
    // InternalUi.g:382:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalUi.g:382:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalUi.g:383:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalUi.g:389:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalUi.g:395:2: ( (otherlv_0= 'label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalUi.g:396:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalUi.g:396:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalUi.g:397:3: otherlv_0= 'label' otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getColonKeyword_1());
            		
            // InternalUi.g:405:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalUi.g:406:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalUi.g:406:4: (lv_value_2_0= RULE_STRING )
            // InternalUi.g:407:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleInput"
    // InternalUi.g:427:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalUi.g:427:46: (iv_ruleInput= ruleInput EOF )
            // InternalUi.g:428:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalUi.g:434:1: ruleInput returns [EObject current=null] : (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalUi.g:440:2: ( (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalUi.g:441:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalUi.g:441:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) ) )
            // InternalUi.g:442:3: otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		
            // InternalUi.g:446:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUi.g:447:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUi.g:447:4: (lv_name_1_0= RULE_ID )
            // InternalUi.g:448:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getColonKeyword_2());
            		
            // InternalUi.g:468:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalUi.g:469:4: (lv_exp_3_0= ruleExp )
            {
            // InternalUi.g:469:4: (lv_exp_3_0= ruleExp )
            // InternalUi.g:470:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getInputAccess().getExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"dk.sdu.mmmi.mdsd.Ui.Exp");
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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleButton"
    // InternalUi.g:491:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalUi.g:491:47: (iv_ruleButton= ruleButton EOF )
            // InternalUi.g:492:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalUi.g:498:1: ruleButton returns [EObject current=null] : ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'button*' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_value_8_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token lv_value_8_0=null;


        	enterRule();

        try {
            // InternalUi.g:504:2: ( ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'button*' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_value_8_0= RULE_STRING ) ) ) ) )
            // InternalUi.g:505:2: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'button*' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_value_8_0= RULE_STRING ) ) ) )
            {
            // InternalUi.g:505:2: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) ) | ( () otherlv_5= 'button*' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_value_8_0= RULE_STRING ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUi.g:506:3: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalUi.g:506:3: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalUi.g:507:4: otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0_0());
                    			
                    // InternalUi.g:511:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalUi.g:512:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUi.g:512:5: (lv_name_1_0= RULE_ID )
                    // InternalUi.g:513:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getButtonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getColonKeyword_0_2());
                    			
                    // InternalUi.g:533:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalUi.g:534:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalUi.g:534:5: (lv_value_3_0= RULE_STRING )
                    // InternalUi.g:535:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getButtonAccess().getValueSTRINGTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getButtonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUi.g:553:3: ( () otherlv_5= 'button*' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_value_8_0= RULE_STRING ) ) )
                    {
                    // InternalUi.g:553:3: ( () otherlv_5= 'button*' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_value_8_0= RULE_STRING ) ) )
                    // InternalUi.g:554:4: () otherlv_5= 'button*' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= ':' ( (lv_value_8_0= RULE_STRING ) )
                    {
                    // InternalUi.g:554:4: ()
                    // InternalUi.g:555:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getButtonAccess().getStarButtonAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getButtonAccess().getButtonKeyword_1_1());
                    			
                    // InternalUi.g:565:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalUi.g:566:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalUi.g:566:5: (lv_name_6_0= RULE_ID )
                    // InternalUi.g:567:6: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_name_6_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getButtonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getButtonAccess().getColonKeyword_1_3());
                    			
                    // InternalUi.g:587:4: ( (lv_value_8_0= RULE_STRING ) )
                    // InternalUi.g:588:5: (lv_value_8_0= RULE_STRING )
                    {
                    // InternalUi.g:588:5: (lv_value_8_0= RULE_STRING )
                    // InternalUi.g:589:6: lv_value_8_0= RULE_STRING
                    {
                    lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_8_0, grammarAccess.getButtonAccess().getValueSTRINGTerminalRuleCall_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getButtonRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleType"
    // InternalUi.g:610:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUi.g:610:45: (iv_ruleType= ruleType EOF )
            // InternalUi.g:611:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalUi.g:617:1: ruleType returns [EObject current=null] : ( ( () ( (lv_value_1_0= 'string' ) ) ) | ( () ( (lv_value_3_0= '#string' ) ) ) | ( () ( (lv_value_5_0= 'number' ) ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalUi.g:623:2: ( ( ( () ( (lv_value_1_0= 'string' ) ) ) | ( () ( (lv_value_3_0= '#string' ) ) ) | ( () ( (lv_value_5_0= 'number' ) ) ) ) )
            // InternalUi.g:624:2: ( ( () ( (lv_value_1_0= 'string' ) ) ) | ( () ( (lv_value_3_0= '#string' ) ) ) | ( () ( (lv_value_5_0= 'number' ) ) ) )
            {
            // InternalUi.g:624:2: ( ( () ( (lv_value_1_0= 'string' ) ) ) | ( () ( (lv_value_3_0= '#string' ) ) ) | ( () ( (lv_value_5_0= 'number' ) ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalUi.g:625:3: ( () ( (lv_value_1_0= 'string' ) ) )
                    {
                    // InternalUi.g:625:3: ( () ( (lv_value_1_0= 'string' ) ) )
                    // InternalUi.g:626:4: () ( (lv_value_1_0= 'string' ) )
                    {
                    // InternalUi.g:626:4: ()
                    // InternalUi.g:627:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getStringTypeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUi.g:633:4: ( (lv_value_1_0= 'string' ) )
                    // InternalUi.g:634:5: (lv_value_1_0= 'string' )
                    {
                    // InternalUi.g:634:5: (lv_value_1_0= 'string' )
                    // InternalUi.g:635:6: lv_value_1_0= 'string'
                    {
                    lv_value_1_0=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getTypeAccess().getValueStringKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_0, "string");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUi.g:649:3: ( () ( (lv_value_3_0= '#string' ) ) )
                    {
                    // InternalUi.g:649:3: ( () ( (lv_value_3_0= '#string' ) ) )
                    // InternalUi.g:650:4: () ( (lv_value_3_0= '#string' ) )
                    {
                    // InternalUi.g:650:4: ()
                    // InternalUi.g:651:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getHashStringTypeAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUi.g:657:4: ( (lv_value_3_0= '#string' ) )
                    // InternalUi.g:658:5: (lv_value_3_0= '#string' )
                    {
                    // InternalUi.g:658:5: (lv_value_3_0= '#string' )
                    // InternalUi.g:659:6: lv_value_3_0= '#string'
                    {
                    lv_value_3_0=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getTypeAccess().getValueStringKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_3_0, "#string");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUi.g:673:3: ( () ( (lv_value_5_0= 'number' ) ) )
                    {
                    // InternalUi.g:673:3: ( () ( (lv_value_5_0= 'number' ) ) )
                    // InternalUi.g:674:4: () ( (lv_value_5_0= 'number' ) )
                    {
                    // InternalUi.g:674:4: ()
                    // InternalUi.g:675:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getNumberTypeAction_2_0(),
                    						current);
                    				

                    }

                    // InternalUi.g:681:4: ( (lv_value_5_0= 'number' ) )
                    // InternalUi.g:682:5: (lv_value_5_0= 'number' )
                    {
                    // InternalUi.g:682:5: (lv_value_5_0= 'number' )
                    // InternalUi.g:683:6: lv_value_5_0= 'number'
                    {
                    lv_value_5_0=(Token)match(input,24,FOLLOW_2); 

                    						newLeafNode(lv_value_5_0, grammarAccess.getTypeAccess().getValueNumberKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_5_0, "number");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExp"
    // InternalUi.g:700:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalUi.g:700:44: (iv_ruleExp= ruleExp EOF )
            // InternalUi.g:701:2: iv_ruleExp= ruleExp EOF
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
    // InternalUi.g:707:1: ruleExp returns [EObject current=null] : this_BooleanExp_0= ruleBooleanExp ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExp_0 = null;



        	enterRule();

        try {
            // InternalUi.g:713:2: (this_BooleanExp_0= ruleBooleanExp )
            // InternalUi.g:714:2: this_BooleanExp_0= ruleBooleanExp
            {

            		newCompositeNode(grammarAccess.getExpAccess().getBooleanExpParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_BooleanExp_0=ruleBooleanExp();

            state._fsp--;


            		current = this_BooleanExp_0;
            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRuleBooleanExp"
    // InternalUi.g:725:1: entryRuleBooleanExp returns [EObject current=null] : iv_ruleBooleanExp= ruleBooleanExp EOF ;
    public final EObject entryRuleBooleanExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExp = null;


        try {
            // InternalUi.g:725:51: (iv_ruleBooleanExp= ruleBooleanExp EOF )
            // InternalUi.g:726:2: iv_ruleBooleanExp= ruleBooleanExp EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExp=ruleBooleanExp();

            state._fsp--;

             current =iv_ruleBooleanExp; 
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
    // $ANTLR end "entryRuleBooleanExp"


    // $ANTLR start "ruleBooleanExp"
    // InternalUi.g:732:1: ruleBooleanExp returns [EObject current=null] : (this_EqualityExp_0= ruleEqualityExp ( ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExp ) ) ) | ( () otherlv_5= '||' ( (lv_right_6_0= ruleEqualityExp ) ) ) )* ) ;
    public final EObject ruleBooleanExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_EqualityExp_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalUi.g:738:2: ( (this_EqualityExp_0= ruleEqualityExp ( ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExp ) ) ) | ( () otherlv_5= '||' ( (lv_right_6_0= ruleEqualityExp ) ) ) )* ) )
            // InternalUi.g:739:2: (this_EqualityExp_0= ruleEqualityExp ( ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExp ) ) ) | ( () otherlv_5= '||' ( (lv_right_6_0= ruleEqualityExp ) ) ) )* )
            {
            // InternalUi.g:739:2: (this_EqualityExp_0= ruleEqualityExp ( ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExp ) ) ) | ( () otherlv_5= '||' ( (lv_right_6_0= ruleEqualityExp ) ) ) )* )
            // InternalUi.g:740:3: this_EqualityExp_0= ruleEqualityExp ( ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExp ) ) ) | ( () otherlv_5= '||' ( (lv_right_6_0= ruleEqualityExp ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getBooleanExpAccess().getEqualityExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_EqualityExp_0=ruleEqualityExp();

            state._fsp--;


            			current = this_EqualityExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUi.g:748:3: ( ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExp ) ) ) | ( () otherlv_5= '||' ( (lv_right_6_0= ruleEqualityExp ) ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }
                else if ( (LA7_0==26) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUi.g:749:4: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExp ) ) )
            	    {
            	    // InternalUi.g:749:4: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExp ) ) )
            	    // InternalUi.g:750:5: () otherlv_2= '&&' ( (lv_right_3_0= ruleEqualityExp ) )
            	    {
            	    // InternalUi.g:750:5: ()
            	    // InternalUi.g:751:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getBooleanExpAccess().getAndLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_12); 

            	    					newLeafNode(otherlv_2, grammarAccess.getBooleanExpAccess().getAmpersandAmpersandKeyword_1_0_1());
            	    				
            	    // InternalUi.g:761:5: ( (lv_right_3_0= ruleEqualityExp ) )
            	    // InternalUi.g:762:6: (lv_right_3_0= ruleEqualityExp )
            	    {
            	    // InternalUi.g:762:6: (lv_right_3_0= ruleEqualityExp )
            	    // InternalUi.g:763:7: lv_right_3_0= ruleEqualityExp
            	    {

            	    							newCompositeNode(grammarAccess.getBooleanExpAccess().getRightEqualityExpParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=ruleEqualityExp();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBooleanExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"dk.sdu.mmmi.mdsd.Ui.EqualityExp");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUi.g:782:4: ( () otherlv_5= '||' ( (lv_right_6_0= ruleEqualityExp ) ) )
            	    {
            	    // InternalUi.g:782:4: ( () otherlv_5= '||' ( (lv_right_6_0= ruleEqualityExp ) ) )
            	    // InternalUi.g:783:5: () otherlv_5= '||' ( (lv_right_6_0= ruleEqualityExp ) )
            	    {
            	    // InternalUi.g:783:5: ()
            	    // InternalUi.g:784:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getBooleanExpAccess().getOrLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,26,FOLLOW_12); 

            	    					newLeafNode(otherlv_5, grammarAccess.getBooleanExpAccess().getVerticalLineVerticalLineKeyword_1_1_1());
            	    				
            	    // InternalUi.g:794:5: ( (lv_right_6_0= ruleEqualityExp ) )
            	    // InternalUi.g:795:6: (lv_right_6_0= ruleEqualityExp )
            	    {
            	    // InternalUi.g:795:6: (lv_right_6_0= ruleEqualityExp )
            	    // InternalUi.g:796:7: lv_right_6_0= ruleEqualityExp
            	    {

            	    							newCompositeNode(grammarAccess.getBooleanExpAccess().getRightEqualityExpParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_13);
            	    lv_right_6_0=ruleEqualityExp();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBooleanExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"dk.sdu.mmmi.mdsd.Ui.EqualityExp");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleBooleanExp"


    // $ANTLR start "entryRuleEqualityExp"
    // InternalUi.g:819:1: entryRuleEqualityExp returns [EObject current=null] : iv_ruleEqualityExp= ruleEqualityExp EOF ;
    public final EObject entryRuleEqualityExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExp = null;


        try {
            // InternalUi.g:819:52: (iv_ruleEqualityExp= ruleEqualityExp EOF )
            // InternalUi.g:820:2: iv_ruleEqualityExp= ruleEqualityExp EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExp=ruleEqualityExp();

            state._fsp--;

             current =iv_ruleEqualityExp; 
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
    // $ANTLR end "entryRuleEqualityExp"


    // $ANTLR start "ruleEqualityExp"
    // InternalUi.g:826:1: ruleEqualityExp returns [EObject current=null] : (this_LessGreaterExp_0= ruleLessGreaterExp ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleLessGreaterExp ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleLessGreaterExp ) ) ) )* ) ;
    public final EObject ruleEqualityExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_LessGreaterExp_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalUi.g:832:2: ( (this_LessGreaterExp_0= ruleLessGreaterExp ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleLessGreaterExp ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleLessGreaterExp ) ) ) )* ) )
            // InternalUi.g:833:2: (this_LessGreaterExp_0= ruleLessGreaterExp ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleLessGreaterExp ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleLessGreaterExp ) ) ) )* )
            {
            // InternalUi.g:833:2: (this_LessGreaterExp_0= ruleLessGreaterExp ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleLessGreaterExp ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleLessGreaterExp ) ) ) )* )
            // InternalUi.g:834:3: this_LessGreaterExp_0= ruleLessGreaterExp ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleLessGreaterExp ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleLessGreaterExp ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpAccess().getLessGreaterExpParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_LessGreaterExp_0=ruleLessGreaterExp();

            state._fsp--;


            			current = this_LessGreaterExp_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUi.g:842:3: ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleLessGreaterExp ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleLessGreaterExp ) ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }
                else if ( (LA8_0==28) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUi.g:843:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleLessGreaterExp ) ) )
            	    {
            	    // InternalUi.g:843:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleLessGreaterExp ) ) )
            	    // InternalUi.g:844:5: () otherlv_2= '==' ( (lv_right_3_0= ruleLessGreaterExp ) )
            	    {
            	    // InternalUi.g:844:5: ()
            	    // InternalUi.g:845:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityExpAccess().getEqualsLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_12); 

            	    					newLeafNode(otherlv_2, grammarAccess.getEqualityExpAccess().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalUi.g:855:5: ( (lv_right_3_0= ruleLessGreaterExp ) )
            	    // InternalUi.g:856:6: (lv_right_3_0= ruleLessGreaterExp )
            	    {
            	    // InternalUi.g:856:6: (lv_right_3_0= ruleLessGreaterExp )
            	    // InternalUi.g:857:7: lv_right_3_0= ruleLessGreaterExp
            	    {

            	    							newCompositeNode(grammarAccess.getEqualityExpAccess().getRightLessGreaterExpParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruleLessGreaterExp();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEqualityExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"dk.sdu.mmmi.mdsd.Ui.LessGreaterExp");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUi.g:876:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleLessGreaterExp ) ) )
            	    {
            	    // InternalUi.g:876:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleLessGreaterExp ) ) )
            	    // InternalUi.g:877:5: () otherlv_5= '!=' ( (lv_right_6_0= ruleLessGreaterExp ) )
            	    {
            	    // InternalUi.g:877:5: ()
            	    // InternalUi.g:878:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getEqualityExpAccess().getNotEqualLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,28,FOLLOW_12); 

            	    					newLeafNode(otherlv_5, grammarAccess.getEqualityExpAccess().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalUi.g:888:5: ( (lv_right_6_0= ruleLessGreaterExp ) )
            	    // InternalUi.g:889:6: (lv_right_6_0= ruleLessGreaterExp )
            	    {
            	    // InternalUi.g:889:6: (lv_right_6_0= ruleLessGreaterExp )
            	    // InternalUi.g:890:7: lv_right_6_0= ruleLessGreaterExp
            	    {

            	    							newCompositeNode(grammarAccess.getEqualityExpAccess().getRightLessGreaterExpParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_right_6_0=ruleLessGreaterExp();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEqualityExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"dk.sdu.mmmi.mdsd.Ui.LessGreaterExp");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleEqualityExp"


    // $ANTLR start "entryRuleLessGreaterExp"
    // InternalUi.g:913:1: entryRuleLessGreaterExp returns [EObject current=null] : iv_ruleLessGreaterExp= ruleLessGreaterExp EOF ;
    public final EObject entryRuleLessGreaterExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessGreaterExp = null;


        try {
            // InternalUi.g:913:55: (iv_ruleLessGreaterExp= ruleLessGreaterExp EOF )
            // InternalUi.g:914:2: iv_ruleLessGreaterExp= ruleLessGreaterExp EOF
            {
             newCompositeNode(grammarAccess.getLessGreaterExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLessGreaterExp=ruleLessGreaterExp();

            state._fsp--;

             current =iv_ruleLessGreaterExp; 
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
    // $ANTLR end "entryRuleLessGreaterExp"


    // $ANTLR start "ruleLessGreaterExp"
    // InternalUi.g:920:1: ruleLessGreaterExp returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( () otherlv_2= '<' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '<=' ( (lv_right_6_0= rulePrimary ) ) ) | ( () otherlv_8= '>' ( (lv_right_9_0= rulePrimary ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= rulePrimary ) ) ) )* ) ;
    public final EObject ruleLessGreaterExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;



        	enterRule();

        try {
            // InternalUi.g:926:2: ( (this_Primary_0= rulePrimary ( ( () otherlv_2= '<' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '<=' ( (lv_right_6_0= rulePrimary ) ) ) | ( () otherlv_8= '>' ( (lv_right_9_0= rulePrimary ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= rulePrimary ) ) ) )* ) )
            // InternalUi.g:927:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= '<' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '<=' ( (lv_right_6_0= rulePrimary ) ) ) | ( () otherlv_8= '>' ( (lv_right_9_0= rulePrimary ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= rulePrimary ) ) ) )* )
            {
            // InternalUi.g:927:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= '<' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '<=' ( (lv_right_6_0= rulePrimary ) ) ) | ( () otherlv_8= '>' ( (lv_right_9_0= rulePrimary ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= rulePrimary ) ) ) )* )
            // InternalUi.g:928:3: this_Primary_0= rulePrimary ( ( () otherlv_2= '<' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '<=' ( (lv_right_6_0= rulePrimary ) ) ) | ( () otherlv_8= '>' ( (lv_right_9_0= rulePrimary ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= rulePrimary ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getLessGreaterExpAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalUi.g:936:3: ( ( () otherlv_2= '<' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '<=' ( (lv_right_6_0= rulePrimary ) ) ) | ( () otherlv_8= '>' ( (lv_right_9_0= rulePrimary ) ) ) | ( () otherlv_11= '>=' ( (lv_right_12_0= rulePrimary ) ) ) )*
            loop9:
            do {
                int alt9=5;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    alt9=1;
                    }
                    break;
                case 30:
                    {
                    alt9=2;
                    }
                    break;
                case 31:
                    {
                    alt9=3;
                    }
                    break;
                case 32:
                    {
                    alt9=4;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalUi.g:937:4: ( () otherlv_2= '<' ( (lv_right_3_0= rulePrimary ) ) )
            	    {
            	    // InternalUi.g:937:4: ( () otherlv_2= '<' ( (lv_right_3_0= rulePrimary ) ) )
            	    // InternalUi.g:938:5: () otherlv_2= '<' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalUi.g:938:5: ()
            	    // InternalUi.g:939:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getLessGreaterExpAccess().getLessLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_12); 

            	    					newLeafNode(otherlv_2, grammarAccess.getLessGreaterExpAccess().getLessThanSignKeyword_1_0_1());
            	    				
            	    // InternalUi.g:949:5: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalUi.g:950:6: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalUi.g:950:6: (lv_right_3_0= rulePrimary )
            	    // InternalUi.g:951:7: lv_right_3_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getLessGreaterExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"dk.sdu.mmmi.mdsd.Ui.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUi.g:970:4: ( () otherlv_5= '<=' ( (lv_right_6_0= rulePrimary ) ) )
            	    {
            	    // InternalUi.g:970:4: ( () otherlv_5= '<=' ( (lv_right_6_0= rulePrimary ) ) )
            	    // InternalUi.g:971:5: () otherlv_5= '<=' ( (lv_right_6_0= rulePrimary ) )
            	    {
            	    // InternalUi.g:971:5: ()
            	    // InternalUi.g:972:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getLessGreaterExpAccess().getLessOrEqualLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,30,FOLLOW_12); 

            	    					newLeafNode(otherlv_5, grammarAccess.getLessGreaterExpAccess().getLessThanSignEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalUi.g:982:5: ( (lv_right_6_0= rulePrimary ) )
            	    // InternalUi.g:983:6: (lv_right_6_0= rulePrimary )
            	    {
            	    // InternalUi.g:983:6: (lv_right_6_0= rulePrimary )
            	    // InternalUi.g:984:7: lv_right_6_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
            	    lv_right_6_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getLessGreaterExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"dk.sdu.mmmi.mdsd.Ui.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUi.g:1003:4: ( () otherlv_8= '>' ( (lv_right_9_0= rulePrimary ) ) )
            	    {
            	    // InternalUi.g:1003:4: ( () otherlv_8= '>' ( (lv_right_9_0= rulePrimary ) ) )
            	    // InternalUi.g:1004:5: () otherlv_8= '>' ( (lv_right_9_0= rulePrimary ) )
            	    {
            	    // InternalUi.g:1004:5: ()
            	    // InternalUi.g:1005:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getLessGreaterExpAccess().getGreaterLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,31,FOLLOW_12); 

            	    					newLeafNode(otherlv_8, grammarAccess.getLessGreaterExpAccess().getGreaterThanSignKeyword_1_2_1());
            	    				
            	    // InternalUi.g:1015:5: ( (lv_right_9_0= rulePrimary ) )
            	    // InternalUi.g:1016:6: (lv_right_9_0= rulePrimary )
            	    {
            	    // InternalUi.g:1016:6: (lv_right_9_0= rulePrimary )
            	    // InternalUi.g:1017:7: lv_right_9_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
            	    lv_right_9_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getLessGreaterExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_9_0,
            	    								"dk.sdu.mmmi.mdsd.Ui.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalUi.g:1036:4: ( () otherlv_11= '>=' ( (lv_right_12_0= rulePrimary ) ) )
            	    {
            	    // InternalUi.g:1036:4: ( () otherlv_11= '>=' ( (lv_right_12_0= rulePrimary ) ) )
            	    // InternalUi.g:1037:5: () otherlv_11= '>=' ( (lv_right_12_0= rulePrimary ) )
            	    {
            	    // InternalUi.g:1037:5: ()
            	    // InternalUi.g:1038:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getLessGreaterExpAccess().getGreaterOrEqualLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,32,FOLLOW_12); 

            	    					newLeafNode(otherlv_11, grammarAccess.getLessGreaterExpAccess().getGreaterThanSignEqualsSignKeyword_1_3_1());
            	    				
            	    // InternalUi.g:1048:5: ( (lv_right_12_0= rulePrimary ) )
            	    // InternalUi.g:1049:6: (lv_right_12_0= rulePrimary )
            	    {
            	    // InternalUi.g:1049:6: (lv_right_12_0= rulePrimary )
            	    // InternalUi.g:1050:7: lv_right_12_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
            	    lv_right_12_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getLessGreaterExpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_12_0,
            	    								"dk.sdu.mmmi.mdsd.Ui.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleLessGreaterExp"


    // $ANTLR start "entryRulePrimary"
    // InternalUi.g:1073:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalUi.g:1073:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalUi.g:1074:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalUi.g:1080:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_type_2_0= ruleType ) ) | this_InputUse_3= ruleInputUse ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject lv_type_2_0 = null;

        EObject this_InputUse_3 = null;



        	enterRule();

        try {
            // InternalUi.g:1086:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_type_2_0= ruleType ) ) | this_InputUse_3= ruleInputUse ) )
            // InternalUi.g:1087:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_type_2_0= ruleType ) ) | this_InputUse_3= ruleInputUse )
            {
            // InternalUi.g:1087:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( (lv_type_2_0= ruleType ) ) | this_InputUse_3= ruleInputUse )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case 22:
            case 23:
            case 24:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalUi.g:1088:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalUi.g:1088:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalUi.g:1089:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalUi.g:1089:4: ()
                    // InternalUi.g:1090:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUi.g:1096:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalUi.g:1097:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalUi.g:1097:5: (lv_value_1_0= RULE_INT )
                    // InternalUi.g:1098:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUi.g:1116:3: ( (lv_type_2_0= ruleType ) )
                    {
                    // InternalUi.g:1116:3: ( (lv_type_2_0= ruleType ) )
                    // InternalUi.g:1117:4: (lv_type_2_0= ruleType )
                    {
                    // InternalUi.g:1117:4: (lv_type_2_0= ruleType )
                    // InternalUi.g:1118:5: lv_type_2_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getPrimaryAccess().getTypeTypeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_2_0,
                    						"dk.sdu.mmmi.mdsd.Ui.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUi.g:1136:3: this_InputUse_3= ruleInputUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getInputUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputUse_3=ruleInputUse();

                    state._fsp--;


                    			current = this_InputUse_3;
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


    // $ANTLR start "entryRuleInputUse"
    // InternalUi.g:1148:1: entryRuleInputUse returns [EObject current=null] : iv_ruleInputUse= ruleInputUse EOF ;
    public final EObject entryRuleInputUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputUse = null;


        try {
            // InternalUi.g:1148:49: (iv_ruleInputUse= ruleInputUse EOF )
            // InternalUi.g:1149:2: iv_ruleInputUse= ruleInputUse EOF
            {
             newCompositeNode(grammarAccess.getInputUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputUse=ruleInputUse();

            state._fsp--;

             current =iv_ruleInputUse; 
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
    // $ANTLR end "entryRuleInputUse"


    // $ANTLR start "ruleInputUse"
    // InternalUi.g:1155:1: ruleInputUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleInputUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUi.g:1161:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalUi.g:1162:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalUi.g:1162:2: ( (otherlv_0= RULE_ID ) )
            // InternalUi.g:1163:3: (otherlv_0= RULE_ID )
            {
            // InternalUi.g:1163:3: (otherlv_0= RULE_ID )
            // InternalUi.g:1164:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInputUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getInputUseAccess().getRefInputCrossReference_0());
            			

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
    // $ANTLR end "ruleInputUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003B8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003BC000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001C00050L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001E0000002L});

}