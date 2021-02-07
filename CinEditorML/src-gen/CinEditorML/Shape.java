/**
 */
package CinEditorML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.Shape#getHexadecimalValue <em>Hexadecimal Value</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends Element {
	/**
	 * Returns the value of the '<em><b>Hexadecimal Value</b></em>' attribute.
	 * The default value is <code>"#000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hexadecimal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hexadecimal Value</em>' attribute.
	 * @see #setHexadecimalValue(String)
	 * @see CinEditorML.CinEditorMLPackage#getShape_HexadecimalValue()
	 * @model default="#000" required="true"
	 * @generated
	 */
	String getHexadecimalValue();

	/**
	 * Sets the value of the '{@link CinEditorML.Shape#getHexadecimalValue <em>Hexadecimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hexadecimal Value</em>' attribute.
	 * @see #getHexadecimalValue()
	 * @generated
	 */
	void setHexadecimalValue(String value);

} // Shape
