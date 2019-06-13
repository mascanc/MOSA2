/**
 * generated by Xtext 2.17.1
 */
package com.spirit.ihe.iHE.impl;

import com.spirit.ihe.iHE.IHE;
import com.spirit.ihe.iHE.IHEPackage;
import com.spirit.ihe.iHE.Import;
import com.spirit.ihe.iHE.MainTgf;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IHE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.spirit.ihe.iHE.impl.IHEImpl#getImportEl <em>Import El</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.IHEImpl#getMain <em>Main</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IHEImpl extends MinimalEObjectImpl.Container implements IHE
{
  /**
   * The cached value of the '{@link #getImportEl() <em>Import El</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportEl()
   * @generated
   * @ordered
   */
  protected EList<Import> importEl;

  /**
   * The cached value of the '{@link #getMain() <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMain()
   * @generated
   * @ordered
   */
  protected MainTgf main;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IHEImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IHEPackage.Literals.IHE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Import> getImportEl()
  {
    if (importEl == null)
    {
      importEl = new EObjectContainmentEList<Import>(Import.class, this, IHEPackage.IHE__IMPORT_EL);
    }
    return importEl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MainTgf getMain()
  {
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMain(MainTgf newMain, NotificationChain msgs)
  {
    MainTgf oldMain = main;
    main = newMain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IHEPackage.IHE__MAIN, oldMain, newMain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMain(MainTgf newMain)
  {
    if (newMain != main)
    {
      NotificationChain msgs = null;
      if (main != null)
        msgs = ((InternalEObject)main).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IHEPackage.IHE__MAIN, null, msgs);
      if (newMain != null)
        msgs = ((InternalEObject)newMain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IHEPackage.IHE__MAIN, null, msgs);
      msgs = basicSetMain(newMain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.IHE__MAIN, newMain, newMain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IHEPackage.IHE__IMPORT_EL:
        return ((InternalEList<?>)getImportEl()).basicRemove(otherEnd, msgs);
      case IHEPackage.IHE__MAIN:
        return basicSetMain(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IHEPackage.IHE__IMPORT_EL:
        return getImportEl();
      case IHEPackage.IHE__MAIN:
        return getMain();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IHEPackage.IHE__IMPORT_EL:
        getImportEl().clear();
        getImportEl().addAll((Collection<? extends Import>)newValue);
        return;
      case IHEPackage.IHE__MAIN:
        setMain((MainTgf)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IHEPackage.IHE__IMPORT_EL:
        getImportEl().clear();
        return;
      case IHEPackage.IHE__MAIN:
        setMain((MainTgf)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IHEPackage.IHE__IMPORT_EL:
        return importEl != null && !importEl.isEmpty();
      case IHEPackage.IHE__MAIN:
        return main != null;
    }
    return super.eIsSet(featureID);
  }

} //IHEImpl
