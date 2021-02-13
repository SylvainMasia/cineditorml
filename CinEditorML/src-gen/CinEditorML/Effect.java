/**
 */
package CinEditorML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.Effect#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getEffect()
 * @model abstract="true"
 * @generated
 */
public interface Effect extends Element {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link CinEditorML.GraphicalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see CinEditorML.CinEditorMLPackage#getEffect_Elements()
	 * @model required="true"
	 * @generated
	 */
	EList<GraphicalElement> getElements();

} // Effect
