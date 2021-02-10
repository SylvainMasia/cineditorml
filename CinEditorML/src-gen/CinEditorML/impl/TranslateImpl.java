/**
 */
package CinEditorML.impl;

import CinEditorML.CinEditorMLPackage;
import CinEditorML.Position;
import CinEditorML.Translate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Translate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.impl.TranslateImpl#getPositionToTranslate <em>Position To Translate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TranslateImpl extends EffectImpl implements Translate {
	/**
	 * The cached value of the '{@link #getPositionToTranslate() <em>Position To Translate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionToTranslate()
	 * @generated
	 * @ordered
	 */
	protected Position positionToTranslate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TranslateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CinEditorMLPackage.Literals.TRANSLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPositionToTranslate() {
		return positionToTranslate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionToTranslate(Position newPositionToTranslate, NotificationChain msgs) {
		Position oldPositionToTranslate = positionToTranslate;
		positionToTranslate = newPositionToTranslate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CinEditorMLPackage.TRANSLATE__POSITION_TO_TRANSLATE, oldPositionToTranslate,
					newPositionToTranslate);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionToTranslate(Position newPositionToTranslate) {
		if (newPositionToTranslate != positionToTranslate) {
			NotificationChain msgs = null;
			if (positionToTranslate != null)
				msgs = ((InternalEObject) positionToTranslate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.TRANSLATE__POSITION_TO_TRANSLATE, null, msgs);
			if (newPositionToTranslate != null)
				msgs = ((InternalEObject) newPositionToTranslate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.TRANSLATE__POSITION_TO_TRANSLATE, null, msgs);
			msgs = basicSetPositionToTranslate(newPositionToTranslate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.TRANSLATE__POSITION_TO_TRANSLATE,
					newPositionToTranslate, newPositionToTranslate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CinEditorMLPackage.TRANSLATE__POSITION_TO_TRANSLATE:
			return basicSetPositionToTranslate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CinEditorMLPackage.TRANSLATE__POSITION_TO_TRANSLATE:
			return getPositionToTranslate();
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
		case CinEditorMLPackage.TRANSLATE__POSITION_TO_TRANSLATE:
			setPositionToTranslate((Position) newValue);
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
		case CinEditorMLPackage.TRANSLATE__POSITION_TO_TRANSLATE:
			setPositionToTranslate((Position) null);
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
		case CinEditorMLPackage.TRANSLATE__POSITION_TO_TRANSLATE:
			return positionToTranslate != null;
		}
		return super.eIsSet(featureID);
	}

} //TranslateImpl
