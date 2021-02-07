/**
 */
package CinEditorML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VIdeo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.Video#getUrl <em>Url</em>}</li>
 *   <li>{@link CinEditorML.Video#getBeginCropTime <em>Begin Crop Time</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getVideo()
 * @model
 * @generated
 */
public interface Video extends Element {

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see CinEditorML.CinEditorMLPackage#getVideo_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link CinEditorML.Video#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Begin Crop Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin Crop Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Crop Time</em>' attribute.
	 * @see #setBeginCropTime(int)
	 * @see CinEditorML.CinEditorMLPackage#getVideo_BeginCropTime()
	 * @model default="0"
	 * @generated
	 */
	int getBeginCropTime();

	/**
	 * Sets the value of the '{@link CinEditorML.Video#getBeginCropTime <em>Begin Crop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Crop Time</em>' attribute.
	 * @see #getBeginCropTime()
	 * @generated
	 */
	void setBeginCropTime(int value);
} // VIdeo
