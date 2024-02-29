/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Association;
import org.xtext.example.mydsl.myDsl.Attribute;
import org.xtext.example.mydsl.myDsl.Entity;
import org.xtext.example.mydsl.myDsl.EntityRoot;
import org.xtext.example.mydsl.myDsl.Inheritance;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Relation;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ASSOCIATION:
				sequence_Association(context, (Association) semanticObject); 
				return; 
			case MyDslPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case MyDslPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case MyDslPackage.ENTITY_ROOT:
				sequence_EntityRoot(context, (EntityRoot) semanticObject); 
				return; 
			case MyDslPackage.INHERITANCE:
				sequence_Inheritance(context, (Inheritance) semanticObject); 
				return; 
			case MyDslPackage.RELATION:
				sequence_Relation(context, (Relation) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Association returns Association
	 *
	 * Constraint:
	 *     (from=ID to=ID)
	 * </pre>
	 */
	protected void sequence_Association(ISerializationContext context, Association semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ASSOCIATION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ASSOCIATION__FROM));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ASSOCIATION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ASSOCIATION__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssociationAccess().getFromIDTerminalRuleCall_2_0(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getAssociationAccess().getToIDTerminalRuleCall_5_0(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID type=Type)
	 * </pre>
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ATTRIBUTE__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ATTRIBUTE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EntityRoot returns EntityRoot
	 *
	 * Constraint:
	 *     (name=ID (entities+=Entity | relations+=Relation)*)
	 * </pre>
	 */
	protected void sequence_EntityRoot(ISerializationContext context, EntityRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID attributes+=Attribute*)
	 * </pre>
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Inheritance returns Inheritance
	 *
	 * Constraint:
	 *     (from=ID to=ID)
	 * </pre>
	 */
	protected void sequence_Inheritance(ISerializationContext context, Inheritance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.INHERITANCE__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.INHERITANCE__FROM));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.INHERITANCE__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.INHERITANCE__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInheritanceAccess().getFromIDTerminalRuleCall_1_0(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getInheritanceAccess().getToIDTerminalRuleCall_3_0(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Relation returns Relation
	 *
	 * Constraint:
	 *     (relations+=Inheritance | relations+=Association)*
	 * </pre>
	 */
	protected void sequence_Relation(ISerializationContext context, Relation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}