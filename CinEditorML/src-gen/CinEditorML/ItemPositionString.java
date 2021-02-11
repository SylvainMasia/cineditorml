/**
 */
package CinEditorML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Position String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.ItemPositionString#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getItemPositionString()
 * @model
 * @generated
 */
public interface ItemPositionString extends ItemPosition {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"center"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see CinEditorML.CinEditorMLPackage#getItemPositionString_Position()
	 * @model default="center" required="true"
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link CinEditorML.ItemPositionString#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

} // ItemPositionString
