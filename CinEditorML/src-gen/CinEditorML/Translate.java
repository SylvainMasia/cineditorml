/**
 */
package CinEditorML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.Translate#getPixelsToTranslateHorizontally <em>Pixels To Translate Horizontally</em>}</li>
 *   <li>{@link CinEditorML.Translate#getPixelsToTranslateVertically <em>Pixels To Translate Vertically</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getTranslate()
 * @model
 * @generated
 */
public interface Translate extends Effect {
	/**
	 * Returns the value of the '<em><b>Pixels To Translate Horizontally</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pixels To Translate Horizontally</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pixels To Translate Horizontally</em>' attribute.
	 * @see #setPixelsToTranslateHorizontally(int)
	 * @see CinEditorML.CinEditorMLPackage#getTranslate_PixelsToTranslateHorizontally()
	 * @model default="0"
	 * @generated
	 */
	int getPixelsToTranslateHorizontally();

	/**
	 * Sets the value of the '{@link CinEditorML.Translate#getPixelsToTranslateHorizontally <em>Pixels To Translate Horizontally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pixels To Translate Horizontally</em>' attribute.
	 * @see #getPixelsToTranslateHorizontally()
	 * @generated
	 */
	void setPixelsToTranslateHorizontally(int value);

	/**
	 * Returns the value of the '<em><b>Pixels To Translate Vertically</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pixels To Translate Vertically</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pixels To Translate Vertically</em>' attribute.
	 * @see #setPixelsToTranslateVertically(int)
	 * @see CinEditorML.CinEditorMLPackage#getTranslate_PixelsToTranslateVertically()
	 * @model default="0"
	 * @generated
	 */
	int getPixelsToTranslateVertically();

	/**
	 * Sets the value of the '{@link CinEditorML.Translate#getPixelsToTranslateVertically <em>Pixels To Translate Vertically</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pixels To Translate Vertically</em>' attribute.
	 * @see #getPixelsToTranslateVertically()
	 * @generated
	 */
	void setPixelsToTranslateVertically(int value);

} // Translate
