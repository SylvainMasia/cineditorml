/**
 */
package CinEditorML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Position Int</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.ItemPositionInt#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getItemPositionInt()
 * @model
 * @generated
 */
public interface ItemPositionInt extends ItemPosition {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see CinEditorML.CinEditorMLPackage#getItemPositionInt_Position()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link CinEditorML.ItemPositionInt#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

} // ItemPositionInt
