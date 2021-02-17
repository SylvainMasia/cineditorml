/**
 */
package CinEditorML.impl;

import CinEditorML.CinEditorMLPackage;
import CinEditorML.Element;
import CinEditorML.TemporalPosition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.impl.ElementImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link CinEditorML.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link CinEditorML.impl.ElementImpl#getTemporalPosition <em>Temporal Position</em>}</li>
 *   <li>{@link CinEditorML.impl.ElementImpl#getEndingTime <em>Ending Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemporalPosition() <em>Temporal Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalPosition()
	 * @generated
	 * @ordered
	 */
	protected TemporalPosition temporalPosition;

	/**
	 * The default value of the '{@link #getEndingTime() <em>Ending Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingTime()
	 * @generated
	 * @ordered
	 */
	protected static final int ENDING_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndingTime() <em>Ending Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingTime()
	 * @generated
	 * @ordered
	 */
	protected int endingTime = ENDING_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CinEditorMLPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.ELEMENT__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalPosition getTemporalPosition() {
		return temporalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalPosition(TemporalPosition newTemporalPosition, NotificationChain msgs) {
		TemporalPosition oldTemporalPosition = temporalPosition;
		temporalPosition = newTemporalPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CinEditorMLPackage.ELEMENT__TEMPORAL_POSITION, oldTemporalPosition, newTemporalPosition);
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
	public void setTemporalPosition(TemporalPosition newTemporalPosition) {
		if (newTemporalPosition != temporalPosition) {
			NotificationChain msgs = null;
			if (temporalPosition != null)
				msgs = ((InternalEObject) temporalPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.ELEMENT__TEMPORAL_POSITION, null, msgs);
			if (newTemporalPosition != null)
				msgs = ((InternalEObject) newTemporalPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.ELEMENT__TEMPORAL_POSITION, null, msgs);
			msgs = basicSetTemporalPosition(newTemporalPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.ELEMENT__TEMPORAL_POSITION,
					newTemporalPosition, newTemporalPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndingTime() {
		return endingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndingTime(int newEndingTime) {
		int oldEndingTime = endingTime;
		endingTime = newEndingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.ELEMENT__ENDING_TIME,
					oldEndingTime, endingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CinEditorMLPackage.ELEMENT__TEMPORAL_POSITION:
			return basicSetTemporalPosition(null, msgs);
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
		case CinEditorMLPackage.ELEMENT__DURATION:
			return getDuration();
		case CinEditorMLPackage.ELEMENT__NAME:
			return getName();
		case CinEditorMLPackage.ELEMENT__TEMPORAL_POSITION:
			return getTemporalPosition();
		case CinEditorMLPackage.ELEMENT__ENDING_TIME:
			return getEndingTime();
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
		case CinEditorMLPackage.ELEMENT__DURATION:
			setDuration((Integer) newValue);
			return;
		case CinEditorMLPackage.ELEMENT__NAME:
			setName((String) newValue);
			return;
		case CinEditorMLPackage.ELEMENT__TEMPORAL_POSITION:
			setTemporalPosition((TemporalPosition) newValue);
			return;
		case CinEditorMLPackage.ELEMENT__ENDING_TIME:
			setEndingTime((Integer) newValue);
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
		case CinEditorMLPackage.ELEMENT__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case CinEditorMLPackage.ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CinEditorMLPackage.ELEMENT__TEMPORAL_POSITION:
			setTemporalPosition((TemporalPosition) null);
			return;
		case CinEditorMLPackage.ELEMENT__ENDING_TIME:
			setEndingTime(ENDING_TIME_EDEFAULT);
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
		case CinEditorMLPackage.ELEMENT__DURATION:
			return duration != DURATION_EDEFAULT;
		case CinEditorMLPackage.ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CinEditorMLPackage.ELEMENT__TEMPORAL_POSITION:
			return temporalPosition != null;
		case CinEditorMLPackage.ELEMENT__ENDING_TIME:
			return endingTime != ENDING_TIME_EDEFAULT;
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", name: ");
		result.append(name);
		result.append(", endingTime: ");
		result.append(endingTime);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
