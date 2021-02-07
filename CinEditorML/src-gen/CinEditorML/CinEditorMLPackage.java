/**
 */
package CinEditorML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CinEditorML.CinEditorMLFactory
 * @model kind="package"
 * @generated
 */
public interface CinEditorMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CinEditorML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/CinEditorML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CinEditorML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CinEditorMLPackage eINSTANCE = CinEditorML.impl.CinEditorMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link CinEditorML.impl.MovieImpl <em>Movie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.MovieImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getMovie()
	 * @generated
	 */
	int MOVIE = 0;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__LAYERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__POSITION = 2;

	/**
	 * The number of structural features of the '<em>Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.LayerImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.ElementImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__BEGIN_TIME = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__POSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.TextImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DURATION = ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__BEGIN_TIME = ELEMENT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__POSITION = ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.PictureImpl <em>Picture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.PictureImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getPicture()
	 * @generated
	 */
	int PICTURE = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__DURATION = ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__BEGIN_TIME = ELEMENT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__POSITION = ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE__URL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Picture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICTURE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.VideoImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DURATION = ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__BEGIN_TIME = ELEMENT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__POSITION = ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__URL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Begin Crop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__BEGIN_CROP_TIME = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.EffectImpl <em>Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.EffectImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getEffect()
	 * @generated
	 */
	int EFFECT = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__DURATION = ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__BEGIN_TIME = ELEMENT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__POSITION = ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__ELEMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.FadeInImpl <em>Fade In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.FadeInImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getFadeIn()
	 * @generated
	 */
	int FADE_IN = 7;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__DURATION = EFFECT__DURATION;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__BEGIN_TIME = EFFECT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__POSITION = EFFECT__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__NAME = EFFECT__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN__ELEMENT = EFFECT__ELEMENT;

	/**
	 * The number of structural features of the '<em>Fade In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fade In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_IN_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.FadeOutImpl <em>Fade Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.FadeOutImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getFadeOut()
	 * @generated
	 */
	int FADE_OUT = 8;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__DURATION = EFFECT__DURATION;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__BEGIN_TIME = EFFECT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__POSITION = EFFECT__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__NAME = EFFECT__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT__ELEMENT = EFFECT__ELEMENT;

	/**
	 * The number of structural features of the '<em>Fade Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fade Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_OUT_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.TranslateImpl <em>Translate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.TranslateImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getTranslate()
	 * @generated
	 */
	int TRANSLATE = 9;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__DURATION = EFFECT__DURATION;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__BEGIN_TIME = EFFECT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__POSITION = EFFECT__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__NAME = EFFECT__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__ELEMENT = EFFECT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Pixels To Translate Horizontally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__PIXELS_TO_TRANSLATE_HORIZONTALLY = EFFECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pixels To Translate Vertically</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE__PIXELS_TO_TRANSLATE_VERTICALLY = EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Translate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Translate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_OPERATION_COUNT = EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.ShapeImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 10;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__DURATION = ELEMENT__DURATION;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__BEGIN_TIME = ELEMENT__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__POSITION = ELEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Hexadecimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__HEXADECIMAL_VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.PositionImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CinEditorML.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CinEditorML.impl.RectangleImpl
	 * @see CinEditorML.impl.CinEditorMLPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 12;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__DURATION = SHAPE__DURATION;

	/**
	 * The feature id for the '<em><b>Begin Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__BEGIN_TIME = SHAPE__BEGIN_TIME;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__POSITION = SHAPE__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Hexadecimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__HEXADECIMAL_VALUE = SHAPE__HEXADECIMAL_VALUE;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link CinEditorML.Movie <em>Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movie</em>'.
	 * @see CinEditorML.Movie
	 * @generated
	 */
	EClass getMovie();

	/**
	 * Returns the meta object for the containment reference list '{@link CinEditorML.Movie#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see CinEditorML.Movie#getLayers()
	 * @see #getMovie()
	 * @generated
	 */
	EReference getMovie_Layers();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Movie#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CinEditorML.Movie#getName()
	 * @see #getMovie()
	 * @generated
	 */
	EAttribute getMovie_Name();

	/**
	 * Returns the meta object for the containment reference '{@link CinEditorML.Movie#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see CinEditorML.Movie#getPosition()
	 * @see #getMovie()
	 * @generated
	 */
	EReference getMovie_Position();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see CinEditorML.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link CinEditorML.Layer#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see CinEditorML.Layer#getElements()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_Elements();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see CinEditorML.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see CinEditorML.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Picture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picture</em>'.
	 * @see CinEditorML.Picture
	 * @generated
	 */
	EClass getPicture();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Picture#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see CinEditorML.Picture#getUrl()
	 * @see #getPicture()
	 * @generated
	 */
	EAttribute getPicture_Url();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see CinEditorML.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Video#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see CinEditorML.Video#getUrl()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Url();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Video#getBeginCropTime <em>Begin Crop Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Crop Time</em>'.
	 * @see CinEditorML.Video#getBeginCropTime()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_BeginCropTime();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see CinEditorML.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Element#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see CinEditorML.Element#getDuration()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Duration();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Element#getBeginTime <em>Begin Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Time</em>'.
	 * @see CinEditorML.Element#getBeginTime()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_BeginTime();

	/**
	 * Returns the meta object for the containment reference '{@link CinEditorML.Element#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see CinEditorML.Element#getPosition()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Position();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CinEditorML.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect</em>'.
	 * @see CinEditorML.Effect
	 * @generated
	 */
	EClass getEffect();

	/**
	 * Returns the meta object for the reference '{@link CinEditorML.Effect#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see CinEditorML.Effect#getElement()
	 * @see #getEffect()
	 * @generated
	 */
	EReference getEffect_Element();

	/**
	 * Returns the meta object for class '{@link CinEditorML.FadeIn <em>Fade In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fade In</em>'.
	 * @see CinEditorML.FadeIn
	 * @generated
	 */
	EClass getFadeIn();

	/**
	 * Returns the meta object for class '{@link CinEditorML.FadeOut <em>Fade Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fade Out</em>'.
	 * @see CinEditorML.FadeOut
	 * @generated
	 */
	EClass getFadeOut();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Translate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translate</em>'.
	 * @see CinEditorML.Translate
	 * @generated
	 */
	EClass getTranslate();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Translate#getPixelsToTranslateHorizontally <em>Pixels To Translate Horizontally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pixels To Translate Horizontally</em>'.
	 * @see CinEditorML.Translate#getPixelsToTranslateHorizontally()
	 * @see #getTranslate()
	 * @generated
	 */
	EAttribute getTranslate_PixelsToTranslateHorizontally();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Translate#getPixelsToTranslateVertically <em>Pixels To Translate Vertically</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pixels To Translate Vertically</em>'.
	 * @see CinEditorML.Translate#getPixelsToTranslateVertically()
	 * @see #getTranslate()
	 * @generated
	 */
	EAttribute getTranslate_PixelsToTranslateVertically();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see CinEditorML.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Shape#getHexadecimalValue <em>Hexadecimal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hexadecimal Value</em>'.
	 * @see CinEditorML.Shape#getHexadecimalValue()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_HexadecimalValue();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see CinEditorML.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CinEditorML.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see CinEditorML.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Position#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see CinEditorML.Position#getWidth()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Width();

	/**
	 * Returns the meta object for the attribute '{@link CinEditorML.Position#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see CinEditorML.Position#getHeight()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Height();

	/**
	 * Returns the meta object for class '{@link CinEditorML.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see CinEditorML.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CinEditorMLFactory getCinEditorMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CinEditorML.impl.MovieImpl <em>Movie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.MovieImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getMovie()
		 * @generated
		 */
		EClass MOVIE = eINSTANCE.getMovie();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE__LAYERS = eINSTANCE.getMovie_Layers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIE__NAME = eINSTANCE.getMovie_Name();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE__POSITION = eINSTANCE.getMovie_Position();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.LayerImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__ELEMENTS = eINSTANCE.getLayer_Elements();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.TextImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.PictureImpl <em>Picture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.PictureImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getPicture()
		 * @generated
		 */
		EClass PICTURE = eINSTANCE.getPicture();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICTURE__URL = eINSTANCE.getPicture_Url();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.VideoImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__URL = eINSTANCE.getVideo_Url();

		/**
		 * The meta object literal for the '<em><b>Begin Crop Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__BEGIN_CROP_TIME = eINSTANCE.getVideo_BeginCropTime();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.ElementImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DURATION = eINSTANCE.getElement_Duration();

		/**
		 * The meta object literal for the '<em><b>Begin Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__BEGIN_TIME = eINSTANCE.getElement_BeginTime();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__POSITION = eINSTANCE.getElement_Position();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.EffectImpl <em>Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.EffectImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getEffect()
		 * @generated
		 */
		EClass EFFECT = eINSTANCE.getEffect();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT__ELEMENT = eINSTANCE.getEffect_Element();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.FadeInImpl <em>Fade In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.FadeInImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getFadeIn()
		 * @generated
		 */
		EClass FADE_IN = eINSTANCE.getFadeIn();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.FadeOutImpl <em>Fade Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.FadeOutImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getFadeOut()
		 * @generated
		 */
		EClass FADE_OUT = eINSTANCE.getFadeOut();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.TranslateImpl <em>Translate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.TranslateImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getTranslate()
		 * @generated
		 */
		EClass TRANSLATE = eINSTANCE.getTranslate();

		/**
		 * The meta object literal for the '<em><b>Pixels To Translate Horizontally</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATE__PIXELS_TO_TRANSLATE_HORIZONTALLY = eINSTANCE.getTranslate_PixelsToTranslateHorizontally();

		/**
		 * The meta object literal for the '<em><b>Pixels To Translate Vertically</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATE__PIXELS_TO_TRANSLATE_VERTICALLY = eINSTANCE.getTranslate_PixelsToTranslateVertically();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.ShapeImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Hexadecimal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__HEXADECIMAL_VALUE = eINSTANCE.getShape_HexadecimalValue();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.PositionImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__WIDTH = eINSTANCE.getPosition_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__HEIGHT = eINSTANCE.getPosition_Height();

		/**
		 * The meta object literal for the '{@link CinEditorML.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CinEditorML.impl.RectangleImpl
		 * @see CinEditorML.impl.CinEditorMLPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

	}

} //CinEditorMLPackage
