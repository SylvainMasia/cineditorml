/**
 */
package CinEditorML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.Element#getDuration <em>Duration</em>}</li>
 *   <li>{@link CinEditorML.Element#getName <em>Name</em>}</li>
 *   <li>{@link CinEditorML.Element#getTemporalPosition <em>Temporal Position</em>}</li>
 *   <li>{@link CinEditorML.Element#getEndingTime <em>Ending Time</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see CinEditorML.CinEditorMLPackage#getElement_Duration()
	 * @model default="-1"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link CinEditorML.Element#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CinEditorML.CinEditorMLPackage#getElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CinEditorML.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Temporal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Position</em>' containment reference.
	 * @see #setTemporalPosition(TemporalPosition)
	 * @see CinEditorML.CinEditorMLPackage#getElement_TemporalPosition()
	 * @model containment="true"
	 * @generated
	 */
	TemporalPosition getTemporalPosition();

	/**
	 * Sets the value of the '{@link CinEditorML.Element#getTemporalPosition <em>Temporal Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Position</em>' containment reference.
	 * @see #getTemporalPosition()
	 * @generated
	 */
	void setTemporalPosition(TemporalPosition value);

	/**
	 * Returns the value of the '<em><b>Ending Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ending Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending Time</em>' attribute.
	 * @see #setEndingTime(int)
	 * @see CinEditorML.CinEditorMLPackage#getElement_EndingTime()
	 * @model default="0"
	 * @generated
	 */
	int getEndingTime();

	/**
	 * Sets the value of the '{@link CinEditorML.Element#getEndingTime <em>Ending Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending Time</em>' attribute.
	 * @see #getEndingTime()
	 * @generated
	 */
	void setEndingTime(int value);

} // Element
