/**
 */
package CinEditorML.impl;

import CinEditorML.CinEditorMLPackage;
import CinEditorML.Element;
import CinEditorML.TemporalPosition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.impl.TemporalPositionImpl#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link CinEditorML.impl.TemporalPositionImpl#getElementToStartAfter <em>Element To Start After</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalPositionImpl extends MinimalEObjectImpl.Container implements TemporalPosition {
	/**
	 * The default value of the '{@link #getBeginTime() <em>Begin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginTime()
	 * @generated
	 * @ordered
	 */
	protected static final int BEGIN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBeginTime() <em>Begin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginTime()
	 * @generated
	 * @ordered
	 */
	protected int beginTime = BEGIN_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementToStartAfter() <em>Element To Start After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementToStartAfter()
	 * @generated
	 * @ordered
	 */
	protected Element elementToStartAfter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CinEditorMLPackage.Literals.TEMPORAL_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBeginTime() {
		return beginTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginTime(int newBeginTime) {
		int oldBeginTime = beginTime;
		beginTime = newBeginTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.TEMPORAL_POSITION__BEGIN_TIME,
					oldBeginTime, beginTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElementToStartAfter() {
		if (elementToStartAfter != null && elementToStartAfter.eIsProxy()) {
			InternalEObject oldElementToStartAfter = (InternalEObject) elementToStartAfter;
			elementToStartAfter = (Element) eResolveProxy(oldElementToStartAfter);
			if (elementToStartAfter != oldElementToStartAfter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CinEditorMLPackage.TEMPORAL_POSITION__ELEMENT_TO_START_AFTER, oldElementToStartAfter,
							elementToStartAfter));
			}
		}
		return elementToStartAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetElementToStartAfter() {
		return elementToStartAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementToStartAfter(Element newElementToStartAfter) {
		Element oldElementToStartAfter = elementToStartAfter;
		elementToStartAfter = newElementToStartAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CinEditorMLPackage.TEMPORAL_POSITION__ELEMENT_TO_START_AFTER, oldElementToStartAfter,
					elementToStartAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CinEditorMLPackage.TEMPORAL_POSITION__BEGIN_TIME:
			return getBeginTime();
		case CinEditorMLPackage.TEMPORAL_POSITION__ELEMENT_TO_START_AFTER:
			if (resolve)
				return getElementToStartAfter();
			return basicGetElementToStartAfter();
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
		case CinEditorMLPackage.TEMPORAL_POSITION__BEGIN_TIME:
			setBeginTime((Integer) newValue);
			return;
		case CinEditorMLPackage.TEMPORAL_POSITION__ELEMENT_TO_START_AFTER:
			setElementToStartAfter((Element) newValue);
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
		case CinEditorMLPackage.TEMPORAL_POSITION__BEGIN_TIME:
			setBeginTime(BEGIN_TIME_EDEFAULT);
			return;
		case CinEditorMLPackage.TEMPORAL_POSITION__ELEMENT_TO_START_AFTER:
			setElementToStartAfter((Element) null);
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
		case CinEditorMLPackage.TEMPORAL_POSITION__BEGIN_TIME:
			return beginTime != BEGIN_TIME_EDEFAULT;
		case CinEditorMLPackage.TEMPORAL_POSITION__ELEMENT_TO_START_AFTER:
			return elementToStartAfter != null;
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
		result.append(" (beginTime: ");
		result.append(beginTime);
		result.append(')');
		return result.toString();
	}

} //TemporalPositionImpl
