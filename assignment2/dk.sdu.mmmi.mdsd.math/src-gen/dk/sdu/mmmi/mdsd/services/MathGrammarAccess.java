/*
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MathGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class MathExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MathExp");
		private final Assignment cVariablesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cVariablesVariableParserRuleCall_0 = (RuleCall)cVariablesAssignment.eContents().get(0);
		
		//MathExp:
		//    variables += Variable*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//variables += Variable*
		public Assignment getVariablesAssignment() { return cVariablesAssignment; }
		
		//Variable
		public RuleCall getVariablesVariableParserRuleCall_0() { return cVariablesVariableParserRuleCall_0; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpExpParserRuleCall_3_0 = (RuleCall)cExpAssignment_3.eContents().get(0);
		
		//Variable:
		//    'var' name=ID '=' exp=Exp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'var' name=ID '=' exp=Exp
		public Group getGroup() { return cGroup; }
		
		//'var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//exp=Exp
		public Assignment getExpAssignment_3() { return cExpAssignment_3; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_3_0() { return cExpExpParserRuleCall_3_0; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFactorParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cPlusLeftAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRightFactorParserRuleCall_1_0_2_0 = (RuleCall)cRightAssignment_1_0_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cMinusLeftAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cRightFactorParserRuleCall_1_1_2_0 = (RuleCall)cRightAssignment_1_1_2.eContents().get(0);
		
		//Exp:
		//    Factor ((
		//        {Plus.left=current} '+' right=Factor |
		//        {Minus.left=current} '-' right=Factor
		//    ))*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Factor ((
		//    {Plus.left=current} '+' right=Factor |
		//    {Minus.left=current} '-' right=Factor
		//))*
		public Group getGroup() { return cGroup; }
		
		//Factor
		public RuleCall getFactorParserRuleCall_0() { return cFactorParserRuleCall_0; }
		
		//((
		//       {Plus.left=current} '+' right=Factor |
		//       {Minus.left=current} '-' right=Factor
		//   ))*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//{Plus.left=current} '+' right=Factor
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{Plus.left=current}
		public Action getPlusLeftAction_1_0_0() { return cPlusLeftAction_1_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_1() { return cPlusSignKeyword_1_0_1; }
		
		//right=Factor
		public Assignment getRightAssignment_1_0_2() { return cRightAssignment_1_0_2; }
		
		//Factor
		public RuleCall getRightFactorParserRuleCall_1_0_2_0() { return cRightFactorParserRuleCall_1_0_2_0; }
		
		//{Minus.left=current} '-' right=Factor
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{Minus.left=current}
		public Action getMinusLeftAction_1_1_0() { return cMinusLeftAction_1_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_1_1() { return cHyphenMinusKeyword_1_1_1; }
		
		//right=Factor
		public Assignment getRightAssignment_1_1_2() { return cRightAssignment_1_1_2; }
		
		//Factor
		public RuleCall getRightFactorParserRuleCall_1_1_2_0() { return cRightFactorParserRuleCall_1_1_2_0; }
	}
	public class FactorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Factor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cMultiLeftAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRightPrimaryParserRuleCall_1_0_2_0 = (RuleCall)cRightAssignment_1_0_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cDiviLeftAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cRightPrimaryParserRuleCall_1_1_2_0 = (RuleCall)cRightAssignment_1_1_2.eContents().get(0);
		
		//Factor returns Exp:
		//    Primary ((
		//        {Multi.left=current} '*' right=Primary |
		//        {Divi.left=current} '/' right=Primary
		//    ))*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary ((
		//    {Multi.left=current} '*' right=Primary |
		//    {Divi.left=current} '/' right=Primary
		//))*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//((
		//       {Multi.left=current} '*' right=Primary |
		//       {Divi.left=current} '/' right=Primary
		//   ))*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//{Multi.left=current} '*' right=Primary
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{Multi.left=current}
		public Action getMultiLeftAction_1_0_0() { return cMultiLeftAction_1_0_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_0_1() { return cAsteriskKeyword_1_0_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_0_2() { return cRightAssignment_1_0_2; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_0_2_0() { return cRightPrimaryParserRuleCall_1_0_2_0; }
		
		//{Divi.left=current} '/' right=Primary
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{Divi.left=current}
		public Action getDiviLeftAction_1_1_0() { return cDiviLeftAction_1_1_0; }
		
		//'/'
		public Keyword getSolidusKeyword_1_1_1() { return cSolidusKeyword_1_1_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_1_2() { return cRightAssignment_1_1_2; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_1_2_0() { return cRightPrimaryParserRuleCall_1_1_2_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMathNumberParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParenthesisParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cLetVariableParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cVariableUseParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Primary:
		//    MathNumber | Parenthesis | LetVariable | VariableUse
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//MathNumber | Parenthesis | LetVariable | VariableUse
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MathNumber
		public RuleCall getMathNumberParserRuleCall_0() { return cMathNumberParserRuleCall_0; }
		
		//Parenthesis
		public RuleCall getParenthesisParserRuleCall_1() { return cParenthesisParserRuleCall_1; }
		
		//LetVariable
		public RuleCall getLetVariableParserRuleCall_2() { return cLetVariableParserRuleCall_2; }
		
		//VariableUse
		public RuleCall getVariableUseParserRuleCall_3() { return cVariableUseParserRuleCall_3; }
	}
	public class ParenthesisElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Parenthesis");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpExpParserRuleCall_1_0 = (RuleCall)cExpAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Parenthesis:
		//    '(' exp=Exp ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' exp=Exp ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//exp=Exp
		public Assignment getExpAssignment_1() { return cExpAssignment_1; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_1_0() { return cExpExpParserRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class MathNumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MathNumber");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//MathNumber:
		//    value=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value=INT
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}
	public class LetVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.LetVariable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueExpParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		private final Keyword cInKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cExpAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cExpExpParserRuleCall_5_0 = (RuleCall)cExpAssignment_5.eContents().get(0);
		private final Keyword cEndKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//LetVariable:
		//    'let' name=ID '=' value=Exp 'in' exp=Exp 'end'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'let' name=ID '=' value=Exp 'in' exp=Exp 'end'
		public Group getGroup() { return cGroup; }
		
		//'let'
		public Keyword getLetKeyword_0() { return cLetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//value=Exp
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//Exp
		public RuleCall getValueExpParserRuleCall_3_0() { return cValueExpParserRuleCall_3_0; }
		
		//'in'
		public Keyword getInKeyword_4() { return cInKeyword_4; }
		
		//exp=Exp
		public Assignment getExpAssignment_5() { return cExpAssignment_5; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_5_0() { return cExpExpParserRuleCall_5_0; }
		
		//'end'
		public Keyword getEndKeyword_6() { return cEndKeyword_6; }
	}
	public class VariableTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.VariableType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVariableParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLetVariableParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//VariableType:
		//    Variable | LetVariable
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Variable | LetVariable
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Variable
		public RuleCall getVariableParserRuleCall_0() { return cVariableParserRuleCall_0; }
		
		//LetVariable
		public RuleCall getLetVariableParserRuleCall_1() { return cLetVariableParserRuleCall_1; }
	}
	public class VariableUseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.VariableUse");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefVariableTypeCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefVariableTypeIDTerminalRuleCall_0_1 = (RuleCall)cRefVariableTypeCrossReference_0.eContents().get(1);
		
		//VariableUse:
		//    ref = [VariableType]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ref = [VariableType]
		public Assignment getRefAssignment() { return cRefAssignment; }
		
		//[VariableType]
		public CrossReference getRefVariableTypeCrossReference_0() { return cRefVariableTypeCrossReference_0; }
		
		//ID
		public RuleCall getRefVariableTypeIDTerminalRuleCall_0_1() { return cRefVariableTypeIDTerminalRuleCall_0_1; }
	}
	
	
	private final MathExpElements pMathExp;
	private final VariableElements pVariable;
	private final ExpElements pExp;
	private final FactorElements pFactor;
	private final PrimaryElements pPrimary;
	private final ParenthesisElements pParenthesis;
	private final MathNumberElements pMathNumber;
	private final LetVariableElements pLetVariable;
	private final VariableTypeElements pVariableType;
	private final VariableUseElements pVariableUse;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MathGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMathExp = new MathExpElements();
		this.pVariable = new VariableElements();
		this.pExp = new ExpElements();
		this.pFactor = new FactorElements();
		this.pPrimary = new PrimaryElements();
		this.pParenthesis = new ParenthesisElements();
		this.pMathNumber = new MathNumberElements();
		this.pLetVariable = new LetVariableElements();
		this.pVariableType = new VariableTypeElements();
		this.pVariableUse = new VariableUseElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.sdu.mmmi.mdsd.Math".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MathExp:
	//    variables += Variable*
	//;
	public MathExpElements getMathExpAccess() {
		return pMathExp;
	}
	
	public ParserRule getMathExpRule() {
		return getMathExpAccess().getRule();
	}
	
	//Variable:
	//    'var' name=ID '=' exp=Exp
	//;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//Exp:
	//    Factor ((
	//        {Plus.left=current} '+' right=Factor |
	//        {Minus.left=current} '-' right=Factor
	//    ))*
	//;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	//Factor returns Exp:
	//    Primary ((
	//        {Multi.left=current} '*' right=Primary |
	//        {Divi.left=current} '/' right=Primary
	//    ))*
	//;
	public FactorElements getFactorAccess() {
		return pFactor;
	}
	
	public ParserRule getFactorRule() {
		return getFactorAccess().getRule();
	}
	
	//Primary:
	//    MathNumber | Parenthesis | LetVariable | VariableUse
	//;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//Parenthesis:
	//    '(' exp=Exp ')'
	//;
	public ParenthesisElements getParenthesisAccess() {
		return pParenthesis;
	}
	
	public ParserRule getParenthesisRule() {
		return getParenthesisAccess().getRule();
	}
	
	//MathNumber:
	//    value=INT
	//;
	public MathNumberElements getMathNumberAccess() {
		return pMathNumber;
	}
	
	public ParserRule getMathNumberRule() {
		return getMathNumberAccess().getRule();
	}
	
	//LetVariable:
	//    'let' name=ID '=' value=Exp 'in' exp=Exp 'end'
	//;
	public LetVariableElements getLetVariableAccess() {
		return pLetVariable;
	}
	
	public ParserRule getLetVariableRule() {
		return getLetVariableAccess().getRule();
	}
	
	//VariableType:
	//    Variable | LetVariable
	//;
	public VariableTypeElements getVariableTypeAccess() {
		return pVariableType;
	}
	
	public ParserRule getVariableTypeRule() {
		return getVariableTypeAccess().getRule();
	}
	
	//VariableUse:
	//    ref = [VariableType]
	//;
	public VariableUseElements getVariableUseAccess() {
		return pVariableUse;
	}
	
	public ParserRule getVariableUseRule() {
		return getVariableUseAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}