/**
 */
package CinEditorML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hexadecimal Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.HexadecimalColor#getHexadecimalValue <em>Hexadecimal Value</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getHexadecimalColor()
 * @model
 * @generated
 */
public interface HexadecimalColor extends EObject {
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
	 * @see CinEditorML.CinEditorMLPackage#getHexadecimalColor_HexadecimalValue()
	 * @model default="#000" required="true"
	 * @generated
	 */
	String getHexadecimalValue();

	/**
	 * Sets the value of the '{@link CinEditorML.HexadecimalColor#getHexadecimalValue <em>Hexadecimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hexadecimal Value</em>' attribute.
	 * @see #getHexadecimalValue()
	 * @generated
	 */
	void setHexadecimalValue(String value);

} // HexadecimalColor
