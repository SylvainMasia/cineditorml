/**
 */
package CinEditorML.impl;

import CinEditorML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CinEditorMLFactoryImpl extends EFactoryImpl implements CinEditorMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CinEditorMLFactory init() {
		try {
			CinEditorMLFactory theCinEditorMLFactory = (CinEditorMLFactory) EPackage.Registry.INSTANCE
					.getEFactory(CinEditorMLPackage.eNS_URI);
			if (theCinEditorMLFactory != null) {
				return theCinEditorMLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CinEditorMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CinEditorMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CinEditorMLPackage.MOVIE:
			return createMovie();
		case CinEditorMLPackage.LAYER:
			return createLayer();
		case CinEditorMLPackage.TEXT:
			return createText();
		case CinEditorMLPackage.PICTURE:
			return createPicture();
		case CinEditorMLPackage.VIDEO:
			return createVideo();
		case CinEditorMLPackage.FADE_IN:
			return createFadeIn();
		case CinEditorMLPackage.FADE_OUT:
			return createFadeOut();
		case CinEditorMLPackage.TRANSLATE:
			return createTranslate();
		case CinEditorMLPackage.POSITION:
			return createPosition();
		case CinEditorMLPackage.RECTANGLE:
			return createRectangle();
		case CinEditorMLPackage.DIMENSION:
			return createDimension();
		case CinEditorMLPackage.HEXADECIMAL_COLOR:
			return createHexadecimalColor();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Movie createMovie() {
		MovieImpl movie = new MovieImpl();
		return movie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Picture createPicture() {
		PictureImpl picture = new PictureImpl();
		return picture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadeIn createFadeIn() {
		FadeInImpl fadeIn = new FadeInImpl();
		return fadeIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadeOut createFadeOut() {
		FadeOutImpl fadeOut = new FadeOutImpl();
		return fadeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translate createTranslate() {
		TranslateImpl translate = new TranslateImpl();
		return translate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle createRectangle() {
		RectangleImpl rectangle = new RectangleImpl();
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDimension() {
		DimensionImpl dimension = new DimensionImpl();
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HexadecimalColor createHexadecimalColor() {
		HexadecimalColorImpl hexadecimalColor = new HexadecimalColorImpl();
		return hexadecimalColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CinEditorMLPackage getCinEditorMLPackage() {
		return (CinEditorMLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CinEditorMLPackage getPackage() {
		return CinEditorMLPackage.eINSTANCE;
	}

} //CinEditorMLFactoryImpl
