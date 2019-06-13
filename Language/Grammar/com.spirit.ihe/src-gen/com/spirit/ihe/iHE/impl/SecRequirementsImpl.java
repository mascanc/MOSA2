/**
 * generated by Xtext 2.17.1
 */
package com.spirit.ihe.iHE.impl;

import com.spirit.ihe.iHE.IHEPackage;
import com.spirit.ihe.iHE.SecRequirements;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sec Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.spirit.ihe.iHE.impl.SecRequirementsImpl#getSecReID <em>Sec Re ID</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.SecRequirementsImpl#getSecreForm <em>Secre Form</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.SecRequirementsImpl#getSecreSensitivity <em>Secre Sensitivity</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.SecRequirementsImpl#getSecreLocation <em>Secre Location</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.SecRequirementsImpl#getSecreState <em>Secre State</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.SecRequirementsImpl#getSecreGoal <em>Secre Goal</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.SecRequirementsImpl#getSecreDesc <em>Secre Desc</em>}</li>
 *   <li>{@link com.spirit.ihe.iHE.impl.SecRequirementsImpl#getSecreCategory <em>Secre Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecRequirementsImpl extends MinimalEObjectImpl.Container implements SecRequirements
{
  /**
   * The default value of the '{@link #getSecReID() <em>Sec Re ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecReID()
   * @generated
   * @ordered
   */
  protected static final String SEC_RE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecReID() <em>Sec Re ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecReID()
   * @generated
   * @ordered
   */
  protected String secReID = SEC_RE_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getSecreForm() <em>Secre Form</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecreForm()
   * @generated
   * @ordered
   */
  protected static final String SECRE_FORM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecreForm() <em>Secre Form</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecreForm()
   * @generated
   * @ordered
   */
  protected String secreForm = SECRE_FORM_EDEFAULT;

  /**
   * The default value of the '{@link #getSecreSensitivity() <em>Secre Sensitivity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecreSensitivity()
   * @generated
   * @ordered
   */
  protected static final String SECRE_SENSITIVITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecreSensitivity() <em>Secre Sensitivity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecreSensitivity()
   * @generated
   * @ordered
   */
  protected String secreSensitivity = SECRE_SENSITIVITY_EDEFAULT;

  /**
   * The default value of the '{@link #getSecreLocation() <em>Secre Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecreLocation()
   * @generated
   * @ordered
   */
  protected static final String SECRE_LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecreLocation() <em>Secre Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecreLocation()
   * @generated
   * @ordered
   */
  protected String secreLocation = SECRE_LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #getSecreState() <em>Secre State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecreState()
   * @generated
   * @ordered
   */
  protected static final String SECRE_STATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecreState() <em>Secre State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecreState()
   * @generated
   * @ordered
   */
  protected String secreState = SECRE_STATE_EDEFAULT;

  /**
   * The default value of the '{@link #getSecreGoal() <em>Secre Goal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecreGoal()
   * @generated
   * @ordered
   */
  protected static final String SECRE_GOAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecreGoal() <em>Secre Goal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecreGoal()
   * @generated
   * @ordered
   */
  protected String secreGoal = SECRE_GOAL_EDEFAULT;

  /**
   * The default value of the '{@link #getSecreDesc() <em>Secre Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecreDesc()
   * @generated
   * @ordered
   */
  protected static final String SECRE_DESC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecreDesc() <em>Secre Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecreDesc()
   * @generated
   * @ordered
   */
  protected String secreDesc = SECRE_DESC_EDEFAULT;

  /**
   * The default value of the '{@link #getSecreCategory() <em>Secre Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecreCategory()
   * @generated
   * @ordered
   */
  protected static final String SECRE_CATEGORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecreCategory() <em>Secre Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecreCategory()
   * @generated
   * @ordered
   */
  protected String secreCategory = SECRE_CATEGORY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SecRequirementsImpl()
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
    return IHEPackage.Literals.SEC_REQUIREMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSecReID()
  {
    return secReID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecReID(String newSecReID)
  {
    String oldSecReID = secReID;
    secReID = newSecReID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.SEC_REQUIREMENTS__SEC_RE_ID, oldSecReID, secReID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSecreForm()
  {
    return secreForm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecreForm(String newSecreForm)
  {
    String oldSecreForm = secreForm;
    secreForm = newSecreForm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.SEC_REQUIREMENTS__SECRE_FORM, oldSecreForm, secreForm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSecreSensitivity()
  {
    return secreSensitivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecreSensitivity(String newSecreSensitivity)
  {
    String oldSecreSensitivity = secreSensitivity;
    secreSensitivity = newSecreSensitivity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.SEC_REQUIREMENTS__SECRE_SENSITIVITY, oldSecreSensitivity, secreSensitivity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSecreLocation()
  {
    return secreLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecreLocation(String newSecreLocation)
  {
    String oldSecreLocation = secreLocation;
    secreLocation = newSecreLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.SEC_REQUIREMENTS__SECRE_LOCATION, oldSecreLocation, secreLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSecreState()
  {
    return secreState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecreState(String newSecreState)
  {
    String oldSecreState = secreState;
    secreState = newSecreState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.SEC_REQUIREMENTS__SECRE_STATE, oldSecreState, secreState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSecreGoal()
  {
    return secreGoal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecreGoal(String newSecreGoal)
  {
    String oldSecreGoal = secreGoal;
    secreGoal = newSecreGoal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.SEC_REQUIREMENTS__SECRE_GOAL, oldSecreGoal, secreGoal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSecreDesc()
  {
    return secreDesc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecreDesc(String newSecreDesc)
  {
    String oldSecreDesc = secreDesc;
    secreDesc = newSecreDesc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.SEC_REQUIREMENTS__SECRE_DESC, oldSecreDesc, secreDesc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSecreCategory()
  {
    return secreCategory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecreCategory(String newSecreCategory)
  {
    String oldSecreCategory = secreCategory;
    secreCategory = newSecreCategory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IHEPackage.SEC_REQUIREMENTS__SECRE_CATEGORY, oldSecreCategory, secreCategory));
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
      case IHEPackage.SEC_REQUIREMENTS__SEC_RE_ID:
        return getSecReID();
      case IHEPackage.SEC_REQUIREMENTS__SECRE_FORM:
        return getSecreForm();
      case IHEPackage.SEC_REQUIREMENTS__SECRE_SENSITIVITY:
        return getSecreSensitivity();
      case IHEPackage.SEC_REQUIREMENTS__SECRE_LOCATION:
        return getSecreLocation();
      case IHEPackage.SEC_REQUIREMENTS__SECRE_STATE:
        return getSecreState();
      case IHEPackage.SEC_REQUIREMENTS__SECRE_GOAL:
        return getSecreGoal();
      case IHEPackage.SEC_REQUIREMENTS__SECRE_DESC:
        return getSecreDesc();
      case IHEPackage.SEC_REQUIREMENTS__SECRE_CATEGORY:
        return getSecreCategory();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IHEPackage.SEC_REQUIREMENTS__SEC_RE_ID:
        setSecReID((String)newValue);
        return;
      case IHEPackage.SEC_REQUIREMENTS__SECRE_FORM:
        setSecreForm((String)newValue);
        return;
      case IHEPackage.SEC_REQUIREMENTS__SECRE_SENSITIVITY:
        setSecreSensitivity((String)newValue);
        return;
      case IHEPackage.SEC_REQUIREMENTS__SECRE_LOCATION:
        setSecreLocation((String)newValue);
        return;
      case IHEPackage.SEC_REQUIREMENTS__SECRE_STATE:
        setSecreState((String)newValue);
        return;
      case IHEPackage.SEC_REQUIREMENTS__SECRE_GOAL:
        setSecreGoal((String)newValue);
        return;
      case IHEPackage.SEC_REQUIREMENTS__SECRE_DESC:
        setSecreDesc((String)newValue);
        return;
      case IHEPackage.SEC_REQUIREMENTS__SECRE_CATEGORY:
        setSecreCategory((String)newValue);
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
      case IHEPackage.SEC_REQUIREMENTS__SEC_RE_ID:
        setSecReID(SEC_RE_ID_EDEFAULT);
        return;
      case IHEPackage.SEC_REQUIREMENTS__SECRE_FORM:
        setSecreForm(SECRE_FORM_EDEFAULT);
        return;
      case IHEPackage.SEC_REQUIREMENTS__SECRE_SENSITIVITY:
        setSecreSensitivity(SECRE_SENSITIVITY_EDEFAULT);
        return;
      case IHEPackage.SEC_REQUIREMENTS__SECRE_LOCATION:
        setSecreLocation(SECRE_LOCATION_EDEFAULT);
        return;
      case IHEPackage.SEC_REQUIREMENTS__SECRE_STATE:
        setSecreState(SECRE_STATE_EDEFAULT);
        return;
      case IHEPackage.SEC_REQUIREMENTS__SECRE_GOAL:
        setSecreGoal(SECRE_GOAL_EDEFAULT);
        return;
      case IHEPackage.SEC_REQUIREMENTS__SECRE_DESC:
        setSecreDesc(SECRE_DESC_EDEFAULT);
        return;
      case IHEPackage.SEC_REQUIREMENTS__SECRE_CATEGORY:
        setSecreCategory(SECRE_CATEGORY_EDEFAULT);
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
      case IHEPackage.SEC_REQUIREMENTS__SEC_RE_ID:
        return SEC_RE_ID_EDEFAULT == null ? secReID != null : !SEC_RE_ID_EDEFAULT.equals(secReID);
      case IHEPackage.SEC_REQUIREMENTS__SECRE_FORM:
        return SECRE_FORM_EDEFAULT == null ? secreForm != null : !SECRE_FORM_EDEFAULT.equals(secreForm);
      case IHEPackage.SEC_REQUIREMENTS__SECRE_SENSITIVITY:
        return SECRE_SENSITIVITY_EDEFAULT == null ? secreSensitivity != null : !SECRE_SENSITIVITY_EDEFAULT.equals(secreSensitivity);
      case IHEPackage.SEC_REQUIREMENTS__SECRE_LOCATION:
        return SECRE_LOCATION_EDEFAULT == null ? secreLocation != null : !SECRE_LOCATION_EDEFAULT.equals(secreLocation);
      case IHEPackage.SEC_REQUIREMENTS__SECRE_STATE:
        return SECRE_STATE_EDEFAULT == null ? secreState != null : !SECRE_STATE_EDEFAULT.equals(secreState);
      case IHEPackage.SEC_REQUIREMENTS__SECRE_GOAL:
        return SECRE_GOAL_EDEFAULT == null ? secreGoal != null : !SECRE_GOAL_EDEFAULT.equals(secreGoal);
      case IHEPackage.SEC_REQUIREMENTS__SECRE_DESC:
        return SECRE_DESC_EDEFAULT == null ? secreDesc != null : !SECRE_DESC_EDEFAULT.equals(secreDesc);
      case IHEPackage.SEC_REQUIREMENTS__SECRE_CATEGORY:
        return SECRE_CATEGORY_EDEFAULT == null ? secreCategory != null : !SECRE_CATEGORY_EDEFAULT.equals(secreCategory);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (SecReID: ");
    result.append(secReID);
    result.append(", secreForm: ");
    result.append(secreForm);
    result.append(", secreSensitivity: ");
    result.append(secreSensitivity);
    result.append(", secreLocation: ");
    result.append(secreLocation);
    result.append(", secreState: ");
    result.append(secreState);
    result.append(", secreGoal: ");
    result.append(secreGoal);
    result.append(", secreDesc: ");
    result.append(secreDesc);
    result.append(", secreCategory: ");
    result.append(secreCategory);
    result.append(')');
    return result.toString();
  }

} //SecRequirementsImpl
