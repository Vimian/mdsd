/**
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.ui.And#getLeft <em>Left</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.ui.And#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.ui.UiPackage#getAnd()
 * @model
 * @generated
 */
public interface And extends Exp
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Exp)
   * @see dk.sdu.mmmi.mdsd.ui.UiPackage#getAnd_Left()
   * @model containment="true"
   * @generated
   */
  Exp getLeft();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.ui.And#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Exp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Exp)
   * @see dk.sdu.mmmi.mdsd.ui.UiPackage#getAnd_Right()
   * @model containment="true"
   * @generated
   */
  Exp getRight();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.ui.And#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Exp value);

} // And
