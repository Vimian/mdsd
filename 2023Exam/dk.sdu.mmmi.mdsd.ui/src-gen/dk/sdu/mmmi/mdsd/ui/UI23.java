/**
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.ui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI23</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.ui.UI23#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.ui.UI23#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.ui.UiPackage#getUI23()
 * @model
 * @generated
 */
public interface UI23 extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mmmi.mdsd.ui.UiPackage#getUI23_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.ui.UI23#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Form</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Form</em>' containment reference.
   * @see #setForm(Form)
   * @see dk.sdu.mmmi.mdsd.ui.UiPackage#getUI23_Form()
   * @model containment="true"
   * @generated
   */
  Form getForm();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.ui.UI23#getForm <em>Form</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Form</em>' containment reference.
   * @see #getForm()
   * @generated
   */
  void setForm(Form value);

} // UI23
