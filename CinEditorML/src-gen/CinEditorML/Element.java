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
 *   <li>{@link CinEditorML.Element#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link CinEditorML.Element#getPosition <em>Position</em>}</li>
 *   <li>{@link CinEditorML.Element#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see CinEditorML.CinEditorMLPackage#getElement_Duration()
	 * @model default="10"
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
	 * @see CinEditorML.CinEditorMLPackage#getElement_BeginTime()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getBeginTime();

	/**
	 * Sets the value of the '{@link CinEditorML.Element#getBeginTime <em>Begin Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Time</em>' attribute.
	 * @see #getBeginTime()
	 * @generated
	 */
	void setBeginTime(int value);

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
	 * @see CinEditorML.CinEditorMLPackage#getElement_Position()
	 * @model containment="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link CinEditorML.Element#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

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

} // Element
