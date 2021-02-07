/**
 */
package CinEditorML.impl;

import CinEditorML.CinEditorMLPackage;
import CinEditorML.Translate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Translate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.impl.TranslateImpl#getPixelsToTranslateHorizontally <em>Pixels To Translate Horizontally</em>}</li>
 *   <li>{@link CinEditorML.impl.TranslateImpl#getPixelsToTranslateVertically <em>Pixels To Translate Vertically</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TranslateImpl extends EffectImpl implements Translate {
	/**
	 * The default value of the '{@link #getPixelsToTranslateHorizontally() <em>Pixels To Translate Horizontally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixelsToTranslateHorizontally()
	 * @generated
	 * @ordered
	 */
	protected static final int PIXELS_TO_TRANSLATE_HORIZONTALLY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPixelsToTranslateHorizontally() <em>Pixels To Translate Horizontally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixelsToTranslateHorizontally()
	 * @generated
	 * @ordered
	 */
	protected int pixelsToTranslateHorizontally = PIXELS_TO_TRANSLATE_HORIZONTALLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPixelsToTranslateVertically() <em>Pixels To Translate Vertically</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixelsToTranslateVertically()
	 * @generated
	 * @ordered
	 */
	protected static final int PIXELS_TO_TRANSLATE_VERTICALLY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPixelsToTranslateVertically() <em>Pixels To Translate Vertically</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixelsToTranslateVertically()
	 * @generated
	 * @ordered
	 */
	protected int pixelsToTranslateVertically = PIXELS_TO_TRANSLATE_VERTICALLY_EDEFAULT;

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
	public int getPixelsToTranslateHorizontally() {
		return pixelsToTranslateHorizontally;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPixelsToTranslateHorizontally(int newPixelsToTranslateHorizontally) {
		int oldPixelsToTranslateHorizontally = pixelsToTranslateHorizontally;
		pixelsToTranslateHorizontally = newPixelsToTranslateHorizontally;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CinEditorMLPackage.TRANSLATE__PIXELS_TO_TRANSLATE_HORIZONTALLY, oldPixelsToTranslateHorizontally,
					pixelsToTranslateHorizontally));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPixelsToTranslateVertically() {
		return pixelsToTranslateVertically;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPixelsToTranslateVertically(int newPixelsToTranslateVertically) {
		int oldPixelsToTranslateVertically = pixelsToTranslateVertically;
		pixelsToTranslateVertically = newPixelsToTranslateVertically;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CinEditorMLPackage.TRANSLATE__PIXELS_TO_TRANSLATE_VERTICALLY, oldPixelsToTranslateVertically,
					pixelsToTranslateVertically));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CinEditorMLPackage.TRANSLATE__PIXELS_TO_TRANSLATE_HORIZONTALLY:
			return getPixelsToTranslateHorizontally();
		case CinEditorMLPackage.TRANSLATE__PIXELS_TO_TRANSLATE_VERTICALLY:
			return getPixelsToTranslateVertically();
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
		case CinEditorMLPackage.TRANSLATE__PIXELS_TO_TRANSLATE_HORIZONTALLY:
			setPixelsToTranslateHorizontally((Integer) newValue);
			return;
		case CinEditorMLPackage.TRANSLATE__PIXELS_TO_TRANSLATE_VERTICALLY:
			setPixelsToTranslateVertically((Integer) newValue);
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
		case CinEditorMLPackage.TRANSLATE__PIXELS_TO_TRANSLATE_HORIZONTALLY:
			setPixelsToTranslateHorizontally(PIXELS_TO_TRANSLATE_HORIZONTALLY_EDEFAULT);
			return;
		case CinEditorMLPackage.TRANSLATE__PIXELS_TO_TRANSLATE_VERTICALLY:
			setPixelsToTranslateVertically(PIXELS_TO_TRANSLATE_VERTICALLY_EDEFAULT);
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
		case CinEditorMLPackage.TRANSLATE__PIXELS_TO_TRANSLATE_HORIZONTALLY:
			return pixelsToTranslateHorizontally != PIXELS_TO_TRANSLATE_HORIZONTALLY_EDEFAULT;
		case CinEditorMLPackage.TRANSLATE__PIXELS_TO_TRANSLATE_VERTICALLY:
			return pixelsToTranslateVertically != PIXELS_TO_TRANSLATE_VERTICALLY_EDEFAULT;
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
		result.append(" (pixelsToTranslateHorizontally: ");
		result.append(pixelsToTranslateHorizontally);
		result.append(", pixelsToTranslateVertically: ");
		result.append(pixelsToTranslateVertically);
		result.append(')');
		return result.toString();
	}

} //TranslateImpl
