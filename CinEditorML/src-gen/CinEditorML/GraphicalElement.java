/**
 */
package CinEditorML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphical Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.GraphicalElement#getPosition <em>Position</em>}</li>
 *   <li>{@link CinEditorML.GraphicalElement#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CinEditorML.GraphicalElement#getMargins <em>Margins</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getGraphicalElement()
 * @model abstract="true"
 * @generated
 */
public interface GraphicalElement extends Element {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see CinEditorML.CinEditorMLPackage#getGraphicalElement_Position()
	 * @model containment="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link CinEditorML.GraphicalElement#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference.
	 * @see #setDimension(Dimension)
	 * @see CinEditorML.CinEditorMLPackage#getGraphicalElement_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link CinEditorML.GraphicalElement#getDimension <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' containment reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

	/**
	 * Returns the value of the '<em><b>Margins</b></em>' containment reference list.
	 * The list contents are of type {@link CinEditorML.Margin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margins</em>' containment reference list.
	 * @see CinEditorML.CinEditorMLPackage#getGraphicalElement_Margins()
	 * @model containment="true" upper="4"
	 * @generated
	 */
	EList<Margin> getMargins();

} // GraphicalElement
