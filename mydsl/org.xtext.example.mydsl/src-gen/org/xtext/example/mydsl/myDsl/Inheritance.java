/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Inheritance#getBaseEntity <em>Base Entity</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Inheritance#getSuperEntity <em>Super Entity</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInheritance()
 * @model
 * @generated
 */
public interface Inheritance extends Relation
{
  /**
   * Returns the value of the '<em><b>Base Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Entity</em>' reference.
   * @see #setBaseEntity(Entity)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInheritance_BaseEntity()
   * @model
   * @generated
   */
  Entity getBaseEntity();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Inheritance#getBaseEntity <em>Base Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Entity</em>' reference.
   * @see #getBaseEntity()
   * @generated
   */
  void setBaseEntity(Entity value);

  /**
   * Returns the value of the '<em><b>Super Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Entity</em>' reference.
   * @see #setSuperEntity(Entity)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getInheritance_SuperEntity()
   * @model
   * @generated
   */
  Entity getSuperEntity();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Inheritance#getSuperEntity <em>Super Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Entity</em>' reference.
   * @see #getSuperEntity()
   * @generated
   */
  void setSuperEntity(Entity value);

} // Inheritance
