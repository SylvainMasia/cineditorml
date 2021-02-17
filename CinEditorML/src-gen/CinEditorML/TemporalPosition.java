/**
 */
package CinEditorML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.TemporalPosition#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link CinEditorML.TemporalPosition#getElementToStartAfter <em>Element To Start After</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getTemporalPosition()
 * @model
 * @generated
 */
public interface TemporalPosition extends EObject {
	/**
	 * Returns the value of the '<em><b>Begin Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Time</em>' attribute.
	 * @see #setBeginTime(int)
	 * @see CinEditorML.CinEditorMLPackage#getTemporalPosition_BeginTime()
	 * @model default="0"
	 * @generated
	 */
	int getBeginTime();

	/**
	 * Sets the value of the '{@link CinEditorML.TemporalPosition#getBeginTime <em>Begin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Time</em>' attribute.
	 * @see #getBeginTime()
	 * @generated
	 */
	void setBeginTime(int value);

	/**
	 * Returns the value of the '<em><b>Element To Start After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element To Start After</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element To Start After</em>' reference.
	 * @see #setElementToStartAfter(Element)
	 * @see CinEditorML.CinEditorMLPackage#getTemporalPosition_ElementToStartAfter()
	 * @model
	 * @generated
	 */
	Element getElementToStartAfter();

	/**
	 * Sets the value of the '{@link CinEditorML.TemporalPosition#getElementToStartAfter <em>Element To Start After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element To Start After</em>' reference.
	 * @see #getElementToStartAfter()
	 * @generated
	 */
	void setElementToStartAfter(Element value);

} // TemporalPosition
