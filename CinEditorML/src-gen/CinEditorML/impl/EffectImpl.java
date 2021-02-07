/**
 */
package CinEditorML.impl;

import CinEditorML.CinEditorMLPackage;
import CinEditorML.Effect;
import CinEditorML.Element;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.impl.EffectImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EffectImpl extends ElementImpl implements Effect {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CinEditorMLPackage.Literals.EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject) element;
			element = (Element) eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CinEditorMLPackage.EFFECT__ELEMENT,
							oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		Element oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.EFFECT__ELEMENT, oldElement,
					element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CinEditorMLPackage.EFFECT__ELEMENT:
			if (resolve)
				return getElement();
			return basicGetElement();
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
		case CinEditorMLPackage.EFFECT__ELEMENT:
			setElement((Element) newValue);
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
		case CinEditorMLPackage.EFFECT__ELEMENT:
			setElement((Element) null);
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
		case CinEditorMLPackage.EFFECT__ELEMENT:
			return element != null;
		}
		return super.eIsSet(featureID);
	}

} //EffectImpl
