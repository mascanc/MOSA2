/**
 * generated by Xtext 2.17.1
 */
package com.spirit.xtext.architecture.tgfi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tgfi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.spirit.xtext.architecture.tgfi.Tgfi#getImportEl <em>Import El</em>}</li>
 *   <li>{@link com.spirit.xtext.architecture.tgfi.Tgfi#getMain <em>Main</em>}</li>
 * </ul>
 *
 * @see com.spirit.xtext.architecture.tgfi.TgfiPackage#getTgfi()
 * @model
 * @generated
 */
public interface Tgfi extends EObject
{
  /**
   * Returns the value of the '<em><b>Import El</b></em>' containment reference list.
   * The list contents are of type {@link com.spirit.xtext.architecture.tgfi.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import El</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import El</em>' containment reference list.
   * @see com.spirit.xtext.architecture.tgfi.TgfiPackage#getTgfi_ImportEl()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImportEl();

  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(MainTgf)
   * @see com.spirit.xtext.architecture.tgfi.TgfiPackage#getTgfi_Main()
   * @model containment="true"
   * @generated
   */
  MainTgf getMain();

  /**
   * Sets the value of the '{@link com.spirit.xtext.architecture.tgfi.Tgfi#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(MainTgf value);

} // Tgfi
