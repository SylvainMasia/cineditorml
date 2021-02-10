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
 *   <li>{@link CinEditorML.Translate#getPositionToTranslate <em>Position To Translate</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getTranslate()
 * @model
 * @generated
 */
public interface Translate extends Effect {
	/**
	 * Returns the value of the '<em><b>Position To Translate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position To Translate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position To Translate</em>' containment reference.
	 * @see #setPositionToTranslate(Position)
	 * @see CinEditorML.CinEditorMLPackage#getTranslate_PositionToTranslate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Position getPositionToTranslate();

	/**
	 * Sets the value of the '{@link CinEditorML.Translate#getPositionToTranslate <em>Position To Translate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position To Translate</em>' containment reference.
	 * @see #getPositionToTranslate()
	 * @generated
	 */
	void setPositionToTranslate(Position value);

} // Translate
