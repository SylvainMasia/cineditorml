/**
 */
package CinEditorML.impl;

import CinEditorML.CinEditorMLPackage;
import CinEditorML.HexadecimalColor;
import CinEditorML.MARGIN_NAME;
import CinEditorML.Margin;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Margin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.impl.MarginImpl#getType <em>Type</em>}</li>
 *   <li>{@link CinEditorML.impl.MarginImpl#getSize <em>Size</em>}</li>
 *   <li>{@link CinEditorML.impl.MarginImpl#getMarginColor <em>Margin Color</em>}</li>
 *   <li>{@link CinEditorML.impl.MarginImpl#getMarginColorOpacity <em>Margin Color Opacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarginImpl extends MinimalEObjectImpl.Container implements Margin {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MARGIN_NAME TYPE_EDEFAULT = MARGIN_NAME.LEFT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MARGIN_NAME type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMarginColor() <em>Margin Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginColor()
	 * @generated
	 * @ordered
	 */
	protected HexadecimalColor marginColor;

	/**
	 * The default value of the '{@link #getMarginColorOpacity() <em>Margin Color Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginColorOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final float MARGIN_COLOR_OPACITY_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getMarginColorOpacity() <em>Margin Color Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginColorOpacity()
	 * @generated
	 * @ordered
	 */
	protected float marginColorOpacity = MARGIN_COLOR_OPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CinEditorMLPackage.Literals.MARGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MARGIN_NAME getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MARGIN_NAME newType) {
		MARGIN_NAME oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.MARGIN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.MARGIN__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HexadecimalColor getMarginColor() {
		return marginColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarginColor(HexadecimalColor newMarginColor, NotificationChain msgs) {
		HexadecimalColor oldMarginColor = marginColor;
		marginColor = newMarginColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CinEditorMLPackage.MARGIN__MARGIN_COLOR, oldMarginColor, newMarginColor);
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
	public void setMarginColor(HexadecimalColor newMarginColor) {
		if (newMarginColor != marginColor) {
			NotificationChain msgs = null;
			if (marginColor != null)
				msgs = ((InternalEObject) marginColor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.MARGIN__MARGIN_COLOR, null, msgs);
			if (newMarginColor != null)
				msgs = ((InternalEObject) newMarginColor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.MARGIN__MARGIN_COLOR, null, msgs);
			msgs = basicSetMarginColor(newMarginColor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.MARGIN__MARGIN_COLOR,
					newMarginColor, newMarginColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMarginColorOpacity() {
		return marginColorOpacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginColorOpacity(float newMarginColorOpacity) {
		float oldMarginColorOpacity = marginColorOpacity;
		marginColorOpacity = newMarginColorOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.MARGIN__MARGIN_COLOR_OPACITY,
					oldMarginColorOpacity, marginColorOpacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CinEditorMLPackage.MARGIN__MARGIN_COLOR:
			return basicSetMarginColor(null, msgs);
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
		case CinEditorMLPackage.MARGIN__TYPE:
			return getType();
		case CinEditorMLPackage.MARGIN__SIZE:
			return getSize();
		case CinEditorMLPackage.MARGIN__MARGIN_COLOR:
			return getMarginColor();
		case CinEditorMLPackage.MARGIN__MARGIN_COLOR_OPACITY:
			return getMarginColorOpacity();
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
		case CinEditorMLPackage.MARGIN__TYPE:
			setType((MARGIN_NAME) newValue);
			return;
		case CinEditorMLPackage.MARGIN__SIZE:
			setSize((Integer) newValue);
			return;
		case CinEditorMLPackage.MARGIN__MARGIN_COLOR:
			setMarginColor((HexadecimalColor) newValue);
			return;
		case CinEditorMLPackage.MARGIN__MARGIN_COLOR_OPACITY:
			setMarginColorOpacity((Float) newValue);
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
		case CinEditorMLPackage.MARGIN__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case CinEditorMLPackage.MARGIN__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case CinEditorMLPackage.MARGIN__MARGIN_COLOR:
			setMarginColor((HexadecimalColor) null);
			return;
		case CinEditorMLPackage.MARGIN__MARGIN_COLOR_OPACITY:
			setMarginColorOpacity(MARGIN_COLOR_OPACITY_EDEFAULT);
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
		case CinEditorMLPackage.MARGIN__TYPE:
			return type != TYPE_EDEFAULT;
		case CinEditorMLPackage.MARGIN__SIZE:
			return size != SIZE_EDEFAULT;
		case CinEditorMLPackage.MARGIN__MARGIN_COLOR:
			return marginColor != null;
		case CinEditorMLPackage.MARGIN__MARGIN_COLOR_OPACITY:
			return marginColorOpacity != MARGIN_COLOR_OPACITY_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", size: ");
		result.append(size);
		result.append(", marginColorOpacity: ");
		result.append(marginColorOpacity);
		result.append(')');
		return result.toString();
	}

} //MarginImpl
