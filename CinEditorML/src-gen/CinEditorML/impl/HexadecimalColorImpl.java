/**
 */
package CinEditorML.impl;

import CinEditorML.CinEditorMLPackage;
import CinEditorML.HexadecimalColor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hexadecimal Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.impl.HexadecimalColorImpl#getHexadecimalValue <em>Hexadecimal Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HexadecimalColorImpl extends MinimalEObjectImpl.Container implements HexadecimalColor {
	/**
	 * The default value of the '{@link #getHexadecimalValue() <em>Hexadecimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHexadecimalValue()
	 * @generated
	 * @ordered
	 */
	protected static final String HEXADECIMAL_VALUE_EDEFAULT = "#000";

	/**
	 * The cached value of the '{@link #getHexadecimalValue() <em>Hexadecimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHexadecimalValue()
	 * @generated
	 * @ordered
	 */
	protected String hexadecimalValue = HEXADECIMAL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HexadecimalColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CinEditorMLPackage.Literals.HEXADECIMAL_COLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHexadecimalValue() {
		return hexadecimalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHexadecimalValue(String newHexadecimalValue) {
		String oldHexadecimalValue = hexadecimalValue;
		hexadecimalValue = newHexadecimalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CinEditorMLPackage.HEXADECIMAL_COLOR__HEXADECIMAL_VALUE, oldHexadecimalValue, hexadecimalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CinEditorMLPackage.HEXADECIMAL_COLOR__HEXADECIMAL_VALUE:
			return getHexadecimalValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CinEditorMLPackage.HEXADECIMAL_COLOR__HEXADECIMAL_VALUE:
			setHexadecimalValue((String) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case CinEditorMLPackage.HEXADECIMAL_COLOR__HEXADECIMAL_VALUE:
			setHexadecimalValue(HEXADECIMAL_VALUE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CinEditorMLPackage.HEXADECIMAL_COLOR__HEXADECIMAL_VALUE:
			return HEXADECIMAL_VALUE_EDEFAULT == null ? hexadecimalValue != null
					: !HEXADECIMAL_VALUE_EDEFAULT.equals(hexadecimalValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (hexadecimalValue: ");
		result.append(hexadecimalValue);
		result.append(')');
		return result.toString();
	}

} //HexadecimalColorImpl
