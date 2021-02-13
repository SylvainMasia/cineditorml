/**
 */
package CinEditorML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Margin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.Margin#getType <em>Type</em>}</li>
 *   <li>{@link CinEditorML.Margin#getSize <em>Size</em>}</li>
 *   <li>{@link CinEditorML.Margin#getMarginColor <em>Margin Color</em>}</li>
 *   <li>{@link CinEditorML.Margin#getMarginColorOpacity <em>Margin Color Opacity</em>}</li>
 * </ul>
 *
 * @see CinEditorML.CinEditorMLPackage#getMargin()
 * @model
 * @generated
 */
public interface Margin extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CinEditorML.MARGIN_NAME}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CinEditorML.MARGIN_NAME
	 * @see #setType(MARGIN_NAME)
	 * @see CinEditorML.CinEditorMLPackage#getMargin_Type()
	 * @model required="true"
	 * @generated
	 */
	MARGIN_NAME getType();

	/**
	 * Sets the value of the '{@link CinEditorML.Margin#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CinEditorML.MARGIN_NAME
	 * @see #getType()
	 * @generated
	 */
	void setType(MARGIN_NAME value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see CinEditorML.CinEditorMLPackage#getMargin_Size()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link CinEditorML.Margin#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Margin Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Color</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Color</em>' containment reference.
	 * @see #setMarginColor(HexadecimalColor)
	 * @see CinEditorML.CinEditorMLPackage#getMargin_MarginColor()
	 * @model containment="true"
	 * @generated
	 */
	HexadecimalColor getMarginColor();

	/**
	 * Sets the value of the '{@link CinEditorML.Margin#getMarginColor <em>Margin Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Color</em>' containment reference.
	 * @see #getMarginColor()
	 * @generated
	 */
	void setMarginColor(HexadecimalColor value);

	/**
	 * Returns the value of the '<em><b>Margin Color Opacity</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Color Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Color Opacity</em>' attribute.
	 * @see #setMarginColorOpacity(float)
	 * @see CinEditorML.CinEditorMLPackage#getMargin_MarginColorOpacity()
	 * @model default="1.0"
	 * @generated
	 */
	float getMarginColorOpacity();

	/**
	 * Sets the value of the '{@link CinEditorML.Margin#getMarginColorOpacity <em>Margin Color Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Color Opacity</em>' attribute.
	 * @see #getMarginColorOpacity()
	 * @generated
	 */
	void setMarginColorOpacity(float value);

} // Margin
