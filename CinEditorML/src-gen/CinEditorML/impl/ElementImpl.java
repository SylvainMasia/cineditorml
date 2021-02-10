/**
 */
package CinEditorML.impl;

import CinEditorML.CinEditorMLPackage;
import CinEditorML.Dimension;
import CinEditorML.Element;
import CinEditorML.Position;

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
 *   <li>{@link CinEditorML.impl.ElementImpl#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link CinEditorML.impl.ElementImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link CinEditorML.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link CinEditorML.impl.ElementImpl#getDimension <em>Dimension</em>}</li>
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
	protected static final int DURATION_EDEFAULT = 10;

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
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

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
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Dimension dimension;

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
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.ELEMENT__BEGIN_TIME, oldBeginTime,
					beginTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CinEditorMLPackage.ELEMENT__POSITION, oldPosition, newPosition);
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
	public void setPosition(Position newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject) position).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.ELEMENT__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject) newPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.ELEMENT__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.ELEMENT__POSITION, newPosition,
					newPosition));
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
	public Dimension getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimension(Dimension newDimension, NotificationChain msgs) {
		Dimension oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CinEditorMLPackage.ELEMENT__DIMENSION, oldDimension, newDimension);
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
	public void setDimension(Dimension newDimension) {
		if (newDimension != dimension) {
			NotificationChain msgs = null;
			if (dimension != null)
				msgs = ((InternalEObject) dimension).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.ELEMENT__DIMENSION, null, msgs);
			if (newDimension != null)
				msgs = ((InternalEObject) newDimension).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.ELEMENT__DIMENSION, null, msgs);
			msgs = basicSetDimension(newDimension, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.ELEMENT__DIMENSION, newDimension,
					newDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CinEditorMLPackage.ELEMENT__POSITION:
			return basicSetPosition(null, msgs);
		case CinEditorMLPackage.ELEMENT__DIMENSION:
			return basicSetDimension(null, msgs);
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
		case CinEditorMLPackage.ELEMENT__BEGIN_TIME:
			return getBeginTime();
		case CinEditorMLPackage.ELEMENT__POSITION:
			return getPosition();
		case CinEditorMLPackage.ELEMENT__NAME:
			return getName();
		case CinEditorMLPackage.ELEMENT__DIMENSION:
			return getDimension();
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
		case CinEditorMLPackage.ELEMENT__BEGIN_TIME:
			setBeginTime((Integer) newValue);
			return;
		case CinEditorMLPackage.ELEMENT__POSITION:
			setPosition((Position) newValue);
			return;
		case CinEditorMLPackage.ELEMENT__NAME:
			setName((String) newValue);
			return;
		case CinEditorMLPackage.ELEMENT__DIMENSION:
			setDimension((Dimension) newValue);
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
		case CinEditorMLPackage.ELEMENT__BEGIN_TIME:
			setBeginTime(BEGIN_TIME_EDEFAULT);
			return;
		case CinEditorMLPackage.ELEMENT__POSITION:
			setPosition((Position) null);
			return;
		case CinEditorMLPackage.ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CinEditorMLPackage.ELEMENT__DIMENSION:
			setDimension((Dimension) null);
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
		case CinEditorMLPackage.ELEMENT__BEGIN_TIME:
			return beginTime != BEGIN_TIME_EDEFAULT;
		case CinEditorMLPackage.ELEMENT__POSITION:
			return position != null;
		case CinEditorMLPackage.ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CinEditorMLPackage.ELEMENT__DIMENSION:
			return dimension != null;
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
		result.append(", beginTime: ");
		result.append(beginTime);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
