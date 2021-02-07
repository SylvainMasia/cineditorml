/**
 */
package CinEditorML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Titre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.Titre#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getTitre()
 * @model
 * @generated
 */
public interface Titre extends Element {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"Sample text"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see CinEditorML.CinEditorMLPackage#getTitre_Text()
	 * @model default="Sample text" required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link CinEditorML.Titre#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Titre
