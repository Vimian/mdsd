/*
 * generated by Xtext 2.33.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleEntityRoot
entryRuleEntityRoot
:
{ before(grammarAccess.getEntityRootRule()); }
	 ruleEntityRoot
{ after(grammarAccess.getEntityRootRule()); } 
	 EOF 
;

// Rule EntityRoot
ruleEntityRoot 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityRootAccess().getGroup()); }
		(rule__EntityRoot__Group__0)
		{ after(grammarAccess.getEntityRootAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getGroup()); }
		(rule__Entity__Group__0)
		{ after(grammarAccess.getEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRequire
entryRuleRequire
:
{ before(grammarAccess.getRequireRule()); }
	 ruleRequire
{ after(grammarAccess.getRequireRule()); } 
	 EOF 
;

// Rule Require
ruleRequire 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRequireAccess().getGroup()); }
		(rule__Require__Group__0)
		{ after(grammarAccess.getRequireAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getGroup()); }
		(rule__Attribute__Group__0)
		{ after(grammarAccess.getAttributeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRelation
entryRuleRelation
:
{ before(grammarAccess.getRelationRule()); }
	 ruleRelation
{ after(grammarAccess.getRelationRule()); } 
	 EOF 
;

// Rule Relation
ruleRelation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRelationAccess().getAlternatives()); }
		(rule__Relation__Alternatives)
		{ after(grammarAccess.getRelationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRoot__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityRootAccess().getEntitiesAssignment_2_0()); }
		(rule__EntityRoot__EntitiesAssignment_2_0)
		{ after(grammarAccess.getEntityRootAccess().getEntitiesAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getEntityRootAccess().getRelationsAssignment_2_1()); }
		(rule__EntityRoot__RelationsAssignment_2_1)
		{ after(grammarAccess.getEntityRootAccess().getRelationsAssignment_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getAttributesAssignment_2_0()); }
		(rule__Entity__AttributesAssignment_2_0)
		{ after(grammarAccess.getEntityAccess().getAttributesAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getEntityAccess().getRequiresAssignment_2_1()); }
		(rule__Entity__RequiresAssignment_2_1)
		{ after(grammarAccess.getEntityAccess().getRequiresAssignment_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getStringKeyword_0()); }
		'string'
		{ after(grammarAccess.getTypeAccess().getStringKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getNumberKeyword_1()); }
		'number'
		{ after(grammarAccess.getTypeAccess().getNumberKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getGroup_0()); }
		(rule__Relation__Group_0__0)
		{ after(grammarAccess.getRelationAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getGroup_1()); }
		(rule__Relation__Group_1__0)
		{ after(grammarAccess.getRelationAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Alternatives_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getAKeyword_1_2_0()); }
		'a'
		{ after(grammarAccess.getRelationAccess().getAKeyword_1_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getManyFromAssignment_1_2_1()); }
		(rule__Relation__ManyFromAssignment_1_2_1)
		{ after(grammarAccess.getRelationAccess().getManyFromAssignment_1_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Alternatives_1_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getHasKeyword_1_4_0()); }
		'has'
		{ after(grammarAccess.getRelationAccess().getHasKeyword_1_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getHaveKeyword_1_4_1()); }
		'have'
		{ after(grammarAccess.getRelationAccess().getHaveKeyword_1_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Alternatives_1_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getAKeyword_1_5_0()); }
		'a'
		{ after(grammarAccess.getRelationAccess().getAKeyword_1_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getRelationAccess().getManyToAssignment_1_5_1()); }
		(rule__Relation__ManyToAssignment_1_5_1)
		{ after(grammarAccess.getRelationAccess().getManyToAssignment_1_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRoot__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityRoot__Group__0__Impl
	rule__EntityRoot__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRoot__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityRootAccess().getSystemKeyword_0()); }
	'system'
	{ after(grammarAccess.getEntityRootAccess().getSystemKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRoot__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityRoot__Group__1__Impl
	rule__EntityRoot__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRoot__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityRootAccess().getNameAssignment_1()); }
	(rule__EntityRoot__NameAssignment_1)
	{ after(grammarAccess.getEntityRootAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRoot__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityRoot__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRoot__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityRootAccess().getAlternatives_2()); }
	(rule__EntityRoot__Alternatives_2)*
	{ after(grammarAccess.getEntityRootAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
	'entity'
	{ after(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
	(rule__Entity__NameAssignment_1)
	{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getAlternatives_2()); }
	(rule__Entity__Alternatives_2)*
	{ after(grammarAccess.getEntityAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Require__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Require__Group__0__Impl
	rule__Require__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Require__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequireAccess().getRequireKeyword_0()); }
	'require'
	{ after(grammarAccess.getRequireAccess().getRequireKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Require__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Require__Group__1__Impl
	rule__Require__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Require__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequireAccess().getLeftAssignment_1()); }
	(rule__Require__LeftAssignment_1)
	{ after(grammarAccess.getRequireAccess().getLeftAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Require__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Require__Group__2__Impl
	rule__Require__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Require__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequireAccess().getEqualsSignGreaterThanSignKeyword_2()); }
	'=>'
	{ after(grammarAccess.getRequireAccess().getEqualsSignGreaterThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Require__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Require__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Require__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequireAccess().getRightAssignment_3()); }
	(rule__Require__RightAssignment_3)
	{ after(grammarAccess.getRequireAccess().getRightAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); }
	'attribute'
	{ after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
	(rule__Attribute__NameAssignment_1)
	{ after(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__2__Impl
	rule__Attribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getAsKeyword_2()); }
	'as'
	{ after(grammarAccess.getAttributeAccess().getAsKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); }
	(rule__Attribute__TypeAssignment_3)
	{ after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Relation__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_0__0__Impl
	rule__Relation__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getInheritanceAction_0_0()); }
	()
	{ after(grammarAccess.getRelationAccess().getInheritanceAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_0__1__Impl
	rule__Relation__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getRelationKeyword_0_1()); }
	'relation'
	{ after(grammarAccess.getRelationAccess().getRelationKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_0__2__Impl
	rule__Relation__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getBaseEntityAssignment_0_2()); }
	(rule__Relation__BaseEntityAssignment_0_2)
	{ after(grammarAccess.getRelationAccess().getBaseEntityAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_0__3__Impl
	rule__Relation__Group_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getIsKeyword_0_3()); }
	'is'
	{ after(grammarAccess.getRelationAccess().getIsKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_0__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getSuperEntityAssignment_0_4()); }
	(rule__Relation__SuperEntityAssignment_0_4)
	{ after(grammarAccess.getRelationAccess().getSuperEntityAssignment_0_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Relation__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_1__0__Impl
	rule__Relation__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getAssociationAction_1_0()); }
	()
	{ after(grammarAccess.getRelationAccess().getAssociationAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_1__1__Impl
	rule__Relation__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getRelationKeyword_1_1()); }
	'relation'
	{ after(grammarAccess.getRelationAccess().getRelationKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_1__2__Impl
	rule__Relation__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getAlternatives_1_2()); }
	(rule__Relation__Alternatives_1_2)?
	{ after(grammarAccess.getRelationAccess().getAlternatives_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_1__3__Impl
	rule__Relation__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getFromAssignment_1_3()); }
	(rule__Relation__FromAssignment_1_3)
	{ after(grammarAccess.getRelationAccess().getFromAssignment_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_1__4__Impl
	rule__Relation__Group_1__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getAlternatives_1_4()); }
	(rule__Relation__Alternatives_1_4)
	{ after(grammarAccess.getRelationAccess().getAlternatives_1_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_1__5__Impl
	rule__Relation__Group_1__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getAlternatives_1_5()); }
	(rule__Relation__Alternatives_1_5)?
	{ after(grammarAccess.getRelationAccess().getAlternatives_1_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group_1__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group_1__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getToAssignment_1_6()); }
	(rule__Relation__ToAssignment_1_6)
	{ after(grammarAccess.getRelationAccess().getToAssignment_1_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EntityRoot__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityRootAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityRootAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRoot__EntitiesAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityRootAccess().getEntitiesEntityParserRuleCall_2_0_0()); }
		ruleEntity
		{ after(grammarAccess.getEntityRootAccess().getEntitiesEntityParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityRoot__RelationsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityRootAccess().getRelationsRelationParserRuleCall_2_1_0()); }
		ruleRelation
		{ after(grammarAccess.getEntityRootAccess().getRelationsRelationParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__AttributesAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_0_0()); }
		ruleAttribute
		{ after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__RequiresAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getRequiresRequireParserRuleCall_2_1_0()); }
		ruleRequire
		{ after(grammarAccess.getEntityAccess().getRequiresRequireParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Require__LeftAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequireAccess().getLeftAttributeCrossReference_1_0()); }
		(
			{ before(grammarAccess.getRequireAccess().getLeftAttributeIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRequireAccess().getLeftAttributeIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getRequireAccess().getLeftAttributeCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Require__RightAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequireAccess().getRightINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getRequireAccess().getRightINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0()); }
		ruleType
		{ after(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__BaseEntityAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getBaseEntityEntityCrossReference_0_2_0()); }
		(
			{ before(grammarAccess.getRelationAccess().getBaseEntityEntityIDTerminalRuleCall_0_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRelationAccess().getBaseEntityEntityIDTerminalRuleCall_0_2_0_1()); }
		)
		{ after(grammarAccess.getRelationAccess().getBaseEntityEntityCrossReference_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__SuperEntityAssignment_0_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getSuperEntityEntityCrossReference_0_4_0()); }
		(
			{ before(grammarAccess.getRelationAccess().getSuperEntityEntityIDTerminalRuleCall_0_4_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRelationAccess().getSuperEntityEntityIDTerminalRuleCall_0_4_0_1()); }
		)
		{ after(grammarAccess.getRelationAccess().getSuperEntityEntityCrossReference_0_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__ManyFromAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0()); }
		(
			{ before(grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0()); }
			'many'
			{ after(grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0()); }
		)
		{ after(grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__FromAssignment_1_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getFromEntityCrossReference_1_3_0()); }
		(
			{ before(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_1_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_1_3_0_1()); }
		)
		{ after(grammarAccess.getRelationAccess().getFromEntityCrossReference_1_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__ManyToAssignment_1_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0()); }
		(
			{ before(grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0()); }
			'many'
			{ after(grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0()); }
		)
		{ after(grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__ToAssignment_1_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getToEntityCrossReference_1_6_0()); }
		(
			{ before(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_1_6_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_1_6_0_1()); }
		)
		{ after(grammarAccess.getRelationAccess().getToEntityCrossReference_1_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
