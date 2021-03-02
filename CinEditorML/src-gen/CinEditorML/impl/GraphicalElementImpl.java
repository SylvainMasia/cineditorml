/**
 */
package CinEditorML.impl;

import CinEditorML.CinEditorMLPackage;
import CinEditorML.Dimension;
import CinEditorML.GraphicalElement;
import CinEditorML.Margin;
import CinEditorML.Position;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphical Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.impl.GraphicalElementImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link CinEditorML.impl.GraphicalElementImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CinEditorML.impl.GraphicalElementImpl#getMargins <em>Margins</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GraphicalElementImpl extends ElementImpl implements GraphicalElement {
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
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Dimension dimension;

	/**
	 * The cached value of the '{@link #getMargins() <em>Margins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargins()
	 * @generated
	 * @ordered
	 */
	protected EList<Margin> margins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CinEditorMLPackage.Literals.GRAPHICAL_ELEMENT;
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
					CinEditorMLPackage.GRAPHICAL_ELEMENT__POSITION, oldPosition, newPosition);
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
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.GRAPHICAL_ELEMENT__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject) newPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.GRAPHICAL_ELEMENT__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.GRAPHICAL_ELEMENT__POSITION,
					newPosition, newPosition));
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
					CinEditorMLPackage.GRAPHICAL_ELEMENT__DIMENSION, oldDimension, newDimension);
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
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.GRAPHICAL_ELEMENT__DIMENSION, null, msgs);
			if (newDimension != null)
				msgs = ((InternalEObject) newDimension).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.GRAPHICAL_ELEMENT__DIMENSION, null, msgs);
			msgs = basicSetDimension(newDimension, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.GRAPHICAL_ELEMENT__DIMENSION,
					newDimension, newDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Margin> getMargins() {
		if (margins == null) {
			margins = new EObjectContainmentEList<Margin>(Margin.class, this,
					CinEditorMLPackage.GRAPHICAL_ELEMENT__MARGINS);
		}
		return margins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__POSITION:
			return basicSetPosition(null, msgs);
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__DIMENSION:
			return basicSetDimension(null, msgs);
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__MARGINS:
			return ((InternalEList<?>) getMargins()).basicRemove(otherEnd, msgs);
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
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__POSITION:
			return getPosition();
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__DIMENSION:
			return getDimension();
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__MARGINS:
			return getMargins();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__POSITION:
			setPosition((Position) newValue);
			return;
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__DIMENSION:
			setDimension((Dimension) newValue);
			return;
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__MARGINS:
			getMargins().clear();
			getMargins().addAll((Collection<? extends Margin>) newValue);
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
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__POSITION:
			setPosition((Position) null);
			return;
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__DIMENSION:
			setDimension((Dimension) null);
			return;
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__MARGINS:
			getMargins().clear();
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
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__POSITION:
			return position != null;
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__DIMENSION:
			return dimension != null;
		case CinEditorMLPackage.GRAPHICAL_ELEMENT__MARGINS:
			return margins != null && !margins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphicalElementImpl
