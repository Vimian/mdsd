package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'entity'", "'require'", "'=>'", "'attribute'", "'as'", "'string'", "'number'", "'relation'", "'is'", "'a'", "'many'", "'has'", "'have'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EntityRoot";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEntityRoot"
    // InternalMyDsl.g:64:1: entryRuleEntityRoot returns [EObject current=null] : iv_ruleEntityRoot= ruleEntityRoot EOF ;
    public final EObject entryRuleEntityRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityRoot = null;


        try {
            // InternalMyDsl.g:64:51: (iv_ruleEntityRoot= ruleEntityRoot EOF )
            // InternalMyDsl.g:65:2: iv_ruleEntityRoot= ruleEntityRoot EOF
            {
             newCompositeNode(grammarAccess.getEntityRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityRoot=ruleEntityRoot();

            state._fsp--;

             current =iv_ruleEntityRoot; 
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
    // $ANTLR end "entryRuleEntityRoot"


    // $ANTLR start "ruleEntityRoot"
    // InternalMyDsl.g:71:1: ruleEntityRoot returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_relations_3_0= ruleRelation ) ) )* ) ;
    public final EObject ruleEntityRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_entities_2_0 = null;

        EObject lv_relations_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_relations_3_0= ruleRelation ) ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_relations_3_0= ruleRelation ) ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_relations_3_0= ruleRelation ) ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_relations_3_0= ruleRelation ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityRootAccess().getSystemKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityRootAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRootRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:101:3: ( ( (lv_entities_2_0= ruleEntity ) ) | ( (lv_relations_3_0= ruleRelation ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }
                else if ( (LA1_0==19) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:102:4: ( (lv_entities_2_0= ruleEntity ) )
            	    {
            	    // InternalMyDsl.g:102:4: ( (lv_entities_2_0= ruleEntity ) )
            	    // InternalMyDsl.g:103:5: (lv_entities_2_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:103:5: (lv_entities_2_0= ruleEntity )
            	    // InternalMyDsl.g:104:6: lv_entities_2_0= ruleEntity
            	    {

            	    						newCompositeNode(grammarAccess.getEntityRootAccess().getEntitiesEntityParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_entities_2_0=ruleEntity();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntityRootRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entities",
            	    							lv_entities_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.Entity");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:122:4: ( (lv_relations_3_0= ruleRelation ) )
            	    {
            	    // InternalMyDsl.g:122:4: ( (lv_relations_3_0= ruleRelation ) )
            	    // InternalMyDsl.g:123:5: (lv_relations_3_0= ruleRelation )
            	    {
            	    // InternalMyDsl.g:123:5: (lv_relations_3_0= ruleRelation )
            	    // InternalMyDsl.g:124:6: lv_relations_3_0= ruleRelation
            	    {

            	    						newCompositeNode(grammarAccess.getEntityRootAccess().getRelationsRelationParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_relations_3_0=ruleRelation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntityRootRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relations",
            	    							lv_relations_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Relation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleEntityRoot"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:146:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:146:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:147:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:153:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_attributes_2_0= ruleAttribute ) ) | ( (lv_requires_3_0= ruleRequire ) ) )* ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_attributes_2_0 = null;

        EObject lv_requires_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:159:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_attributes_2_0= ruleAttribute ) ) | ( (lv_requires_3_0= ruleRequire ) ) )* ) )
            // InternalMyDsl.g:160:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_attributes_2_0= ruleAttribute ) ) | ( (lv_requires_3_0= ruleRequire ) ) )* )
            {
            // InternalMyDsl.g:160:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_attributes_2_0= ruleAttribute ) ) | ( (lv_requires_3_0= ruleRequire ) ) )* )
            // InternalMyDsl.g:161:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_attributes_2_0= ruleAttribute ) ) | ( (lv_requires_3_0= ruleRequire ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:165:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:166:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:166:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:167:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:183:3: ( ( (lv_attributes_2_0= ruleAttribute ) ) | ( (lv_requires_3_0= ruleRequire ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }
                else if ( (LA2_0==13) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:184:4: ( (lv_attributes_2_0= ruleAttribute ) )
            	    {
            	    // InternalMyDsl.g:184:4: ( (lv_attributes_2_0= ruleAttribute ) )
            	    // InternalMyDsl.g:185:5: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:185:5: (lv_attributes_2_0= ruleAttribute )
            	    // InternalMyDsl.g:186:6: lv_attributes_2_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:204:4: ( (lv_requires_3_0= ruleRequire ) )
            	    {
            	    // InternalMyDsl.g:204:4: ( (lv_requires_3_0= ruleRequire ) )
            	    // InternalMyDsl.g:205:5: (lv_requires_3_0= ruleRequire )
            	    {
            	    // InternalMyDsl.g:205:5: (lv_requires_3_0= ruleRequire )
            	    // InternalMyDsl.g:206:6: lv_requires_3_0= ruleRequire
            	    {

            	    						newCompositeNode(grammarAccess.getEntityAccess().getRequiresRequireParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_requires_3_0=ruleRequire();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntityRule());
            	    						}
            	    						add(
            	    							current,
            	    							"requires",
            	    							lv_requires_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Require");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRequire"
    // InternalMyDsl.g:228:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalMyDsl.g:228:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalMyDsl.g:229:2: iv_ruleRequire= ruleRequire EOF
            {
             newCompositeNode(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequire=ruleRequire();

            state._fsp--;

             current =iv_ruleRequire; 
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
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalMyDsl.g:235:1: ruleRequire returns [EObject current=null] : (otherlv_0= 'require' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=>' ( (lv_right_3_0= RULE_INT ) ) ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_right_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:241:2: ( (otherlv_0= 'require' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=>' ( (lv_right_3_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:242:2: (otherlv_0= 'require' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=>' ( (lv_right_3_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:242:2: (otherlv_0= 'require' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=>' ( (lv_right_3_0= RULE_INT ) ) )
            // InternalMyDsl.g:243:3: otherlv_0= 'require' ( (otherlv_1= RULE_ID ) ) otherlv_2= '=>' ( (lv_right_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0());
            		
            // InternalMyDsl.g:247:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:248:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:248:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:249:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequireRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_1, grammarAccess.getRequireAccess().getLeftAttributeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRequireAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalMyDsl.g:264:3: ( (lv_right_3_0= RULE_INT ) )
            // InternalMyDsl.g:265:4: (lv_right_3_0= RULE_INT )
            {
            // InternalMyDsl.g:265:4: (lv_right_3_0= RULE_INT )
            // InternalMyDsl.g:266:5: lv_right_3_0= RULE_INT
            {
            lv_right_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_right_3_0, grammarAccess.getRequireAccess().getRightINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"right",
            						lv_right_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:286:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:286:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:287:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:293:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:299:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalMyDsl.g:300:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalMyDsl.g:300:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )
            // InternalMyDsl.g:301:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalMyDsl.g:305:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:306:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:306:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:307:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getAsKeyword_2());
            		
            // InternalMyDsl.g:327:3: ( (lv_type_3_0= ruleType ) )
            // InternalMyDsl.g:328:4: (lv_type_3_0= ruleType )
            {
            // InternalMyDsl.g:328:4: (lv_type_3_0= ruleType )
            // InternalMyDsl.g:329:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:350:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:350:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:351:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
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
    // InternalMyDsl.g:357:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'number' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:363:2: ( (kw= 'string' | kw= 'number' ) )
            // InternalMyDsl.g:364:2: (kw= 'string' | kw= 'number' )
            {
            // InternalMyDsl.g:364:2: (kw= 'string' | kw= 'number' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:365:3: kw= 'string'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:371:3: kw= 'number'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getNumberKeyword_1());
                    		

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


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:380:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:380:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:381:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:387:1: ruleRelation returns [EObject current=null] : ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_manyFrom_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_manyTo_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalMyDsl.g:393:2: ( ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) ) )
            // InternalMyDsl.g:394:2: ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) )
            {
            // InternalMyDsl.g:394:2: ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( ((LA7_2>=23 && LA7_2<=24)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==20) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA7_1>=21 && LA7_1<=22)) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:395:3: ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:395:3: ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) )
                    // InternalMyDsl.g:396:4: () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMyDsl.g:396:4: ()
                    // InternalMyDsl.g:397:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationAccess().getInheritanceAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getRelationKeyword_0_1());
                    			
                    // InternalMyDsl.g:407:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:408:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:408:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:409:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getBaseEntityEntityCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getIsKeyword_0_3());
                    			
                    // InternalMyDsl.g:424:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:425:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:425:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:426:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getSuperEntityEntityCrossReference_0_4_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:439:3: ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:439:3: ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) )
                    // InternalMyDsl.g:440:4: () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) )
                    {
                    // InternalMyDsl.g:440:4: ()
                    // InternalMyDsl.g:441:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationAccess().getAssociationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getRelationKeyword_1_1());
                    			
                    // InternalMyDsl.g:451:4: (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )?
                    int alt4=3;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==21) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==22) ) {
                        alt4=2;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMyDsl.g:452:5: otherlv_7= 'a'
                            {
                            otherlv_7=(Token)match(input,21,FOLLOW_3); 

                            					newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getAKeyword_1_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:457:5: ( (lv_manyFrom_8_0= 'many' ) )
                            {
                            // InternalMyDsl.g:457:5: ( (lv_manyFrom_8_0= 'many' ) )
                            // InternalMyDsl.g:458:6: (lv_manyFrom_8_0= 'many' )
                            {
                            // InternalMyDsl.g:458:6: (lv_manyFrom_8_0= 'many' )
                            // InternalMyDsl.g:459:7: lv_manyFrom_8_0= 'many'
                            {
                            lv_manyFrom_8_0=(Token)match(input,22,FOLLOW_3); 

                            							newLeafNode(lv_manyFrom_8_0, grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationRule());
                            							}
                            							setWithLastConsumed(current, "manyFrom", lv_manyFrom_8_0 != null, "many");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:472:4: ( (otherlv_9= RULE_ID ) )
                    // InternalMyDsl.g:473:5: (otherlv_9= RULE_ID )
                    {
                    // InternalMyDsl.g:473:5: (otherlv_9= RULE_ID )
                    // InternalMyDsl.g:474:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getFromEntityCrossReference_1_3_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:485:4: (otherlv_10= 'has' | otherlv_11= 'have' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==23) ) {
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
                            // InternalMyDsl.g:486:5: otherlv_10= 'has'
                            {
                            otherlv_10=(Token)match(input,23,FOLLOW_11); 

                            					newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getHasKeyword_1_4_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:491:5: otherlv_11= 'have'
                            {
                            otherlv_11=(Token)match(input,24,FOLLOW_11); 

                            					newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getHaveKeyword_1_4_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:496:4: (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )?
                    int alt6=3;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==21) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==22) ) {
                        alt6=2;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyDsl.g:497:5: otherlv_12= 'a'
                            {
                            otherlv_12=(Token)match(input,21,FOLLOW_3); 

                            					newLeafNode(otherlv_12, grammarAccess.getRelationAccess().getAKeyword_1_5_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:502:5: ( (lv_manyTo_13_0= 'many' ) )
                            {
                            // InternalMyDsl.g:502:5: ( (lv_manyTo_13_0= 'many' ) )
                            // InternalMyDsl.g:503:6: (lv_manyTo_13_0= 'many' )
                            {
                            // InternalMyDsl.g:503:6: (lv_manyTo_13_0= 'many' )
                            // InternalMyDsl.g:504:7: lv_manyTo_13_0= 'many'
                            {
                            lv_manyTo_13_0=(Token)match(input,22,FOLLOW_3); 

                            							newLeafNode(lv_manyTo_13_0, grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationRule());
                            							}
                            							setWithLastConsumed(current, "manyTo", lv_manyTo_13_0 != null, "many");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:517:4: ( (otherlv_14= RULE_ID ) )
                    // InternalMyDsl.g:518:5: (otherlv_14= RULE_ID )
                    {
                    // InternalMyDsl.g:518:5: (otherlv_14= RULE_ID )
                    // InternalMyDsl.g:519:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_14, grammarAccess.getRelationAccess().getToEntityCrossReference_1_6_0());
                    					

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
    // $ANTLR end "ruleRelation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001800000L});

}