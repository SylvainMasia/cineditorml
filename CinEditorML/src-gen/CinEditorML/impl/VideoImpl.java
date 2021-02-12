/**
 */
package CinEditorML.impl;

import CinEditorML.CinEditorMLPackage;
import CinEditorML.Video;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VIdeo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.impl.VideoImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link CinEditorML.impl.VideoImpl#getBeginCropTime <em>Begin Crop Time</em>}</li>
 *   <li>{@link CinEditorML.impl.VideoImpl#isEnableAudio <em>Enable Audio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoImpl extends GraphicalElementImpl implements Video {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeginCropTime() <em>Begin Crop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginCropTime()
	 * @generated
	 * @ordered
	 */
	protected static final int BEGIN_CROP_TIME_EDEFAULT = -1;
	/**
	 * The cached value of the '{@link #getBeginCropTime() <em>Begin Crop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginCropTime()
	 * @generated
	 * @ordered
	 */
	protected int beginCropTime = BEGIN_CROP_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableAudio() <em>Enable Audio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAudio()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_AUDIO_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isEnableAudio() <em>Enable Audio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAudio()
	 * @generated
	 * @ordered
	 */
	protected boolean enableAudio = ENABLE_AUDIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CinEditorMLPackage.Literals.VIDEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.VIDEO__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBeginCropTime() {
		return beginCropTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginCropTime(int newBeginCropTime) {
		int oldBeginCropTime = beginCropTime;
		beginCropTime = newBeginCropTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.VIDEO__BEGIN_CROP_TIME,
					oldBeginCropTime, beginCropTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableAudio() {
		return enableAudio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableAudio(boolean newEnableAudio) {
		boolean oldEnableAudio = enableAudio;
		enableAudio = newEnableAudio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.VIDEO__ENABLE_AUDIO,
					oldEnableAudio, enableAudio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CinEditorMLPackage.VIDEO__URL:
			return getUrl();
		case CinEditorMLPackage.VIDEO__BEGIN_CROP_TIME:
			return getBeginCropTime();
		case CinEditorMLPackage.VIDEO__ENABLE_AUDIO:
			return isEnableAudio();
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
		case CinEditorMLPackage.VIDEO__URL:
			setUrl((String) newValue);
			return;
		case CinEditorMLPackage.VIDEO__BEGIN_CROP_TIME:
			setBeginCropTime((Integer) newValue);
			return;
		case CinEditorMLPackage.VIDEO__ENABLE_AUDIO:
			setEnableAudio((Boolean) newValue);
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
		case CinEditorMLPackage.VIDEO__URL:
			setUrl(URL_EDEFAULT);
			return;
		case CinEditorMLPackage.VIDEO__BEGIN_CROP_TIME:
			setBeginCropTime(BEGIN_CROP_TIME_EDEFAULT);
			return;
		case CinEditorMLPackage.VIDEO__ENABLE_AUDIO:
			setEnableAudio(ENABLE_AUDIO_EDEFAULT);
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
		case CinEditorMLPackage.VIDEO__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case CinEditorMLPackage.VIDEO__BEGIN_CROP_TIME:
			return beginCropTime != BEGIN_CROP_TIME_EDEFAULT;
		case CinEditorMLPackage.VIDEO__ENABLE_AUDIO:
			return enableAudio != ENABLE_AUDIO_EDEFAULT;
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
		result.append(" (url: ");
		result.append(url);
		result.append(", beginCropTime: ");
		result.append(beginCropTime);
		result.append(", enableAudio: ");
		result.append(enableAudio);
		result.append(')');
		return result.toString();
	}

} //VIdeoImpl
