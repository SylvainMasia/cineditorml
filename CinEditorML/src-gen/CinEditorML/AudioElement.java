/**
 */
package CinEditorML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.AudioElement#getUrl <em>Url</em>}</li>
 *   <li>{@link CinEditorML.AudioElement#getElement <em>Element</em>}</li>
 *   <li>{@link CinEditorML.AudioElement#getFadeIn <em>Fade In</em>}</li>
 *   <li>{@link CinEditorML.AudioElement#getFadeOut <em>Fade Out</em>}</li>
 *   <li>{@link CinEditorML.AudioElement#getVolume <em>Volume</em>}</li>
 *   <li>{@link CinEditorML.AudioElement#getBeginCropTime <em>Begin Crop Time</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getAudioElement()
 * @model
 * @generated
 */
public interface AudioElement extends Element {
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
	 * @see CinEditorML.CinEditorMLPackage#getAudioElement_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link CinEditorML.AudioElement#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(GraphicalElement)
	 * @see CinEditorML.CinEditorMLPackage#getAudioElement_Element()
	 * @model required="true"
	 * @generated
	 */
	GraphicalElement getElement();

	/**
	 * Sets the value of the '{@link CinEditorML.AudioElement#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(GraphicalElement value);

	/**
	 * Returns the value of the '<em><b>Fade In</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fade In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fade In</em>' attribute.
	 * @see #setFadeIn(int)
	 * @see CinEditorML.CinEditorMLPackage#getAudioElement_FadeIn()
	 * @model default="0"
	 * @generated
	 */
	int getFadeIn();

	/**
	 * Sets the value of the '{@link CinEditorML.AudioElement#getFadeIn <em>Fade In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fade In</em>' attribute.
	 * @see #getFadeIn()
	 * @generated
	 */
	void setFadeIn(int value);

	/**
	 * Returns the value of the '<em><b>Fade Out</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fade Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fade Out</em>' attribute.
	 * @see #setFadeOut(int)
	 * @see CinEditorML.CinEditorMLPackage#getAudioElement_FadeOut()
	 * @model default="0"
	 * @generated
	 */
	int getFadeOut();

	/**
	 * Sets the value of the '{@link CinEditorML.AudioElement#getFadeOut <em>Fade Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fade Out</em>' attribute.
	 * @see #getFadeOut()
	 * @generated
	 */
	void setFadeOut(int value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(float)
	 * @see CinEditorML.CinEditorMLPackage#getAudioElement_Volume()
	 * @model default="1"
	 * @generated
	 */
	float getVolume();

	/**
	 * Sets the value of the '{@link CinEditorML.AudioElement#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(float value);

	/**
	 * Returns the value of the '<em><b>Begin Crop Time</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin Crop Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Crop Time</em>' attribute.
	 * @see #setBeginCropTime(int)
	 * @see CinEditorML.CinEditorMLPackage#getAudioElement_BeginCropTime()
	 * @model default="-1"
	 * @generated
	 */
	int getBeginCropTime();

	/**
	 * Sets the value of the '{@link CinEditorML.AudioElement#getBeginCropTime <em>Begin Crop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Crop Time</em>' attribute.
	 * @see #getBeginCropTime()
	 * @generated
	 */
	void setBeginCropTime(int value);

} // AudioElement
