/**
 */
package CinEditorML.util;

import CinEditorML.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CinEditorML.CinEditorMLPackage
 * @generated
 */
public class CinEditorMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CinEditorMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CinEditorMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CinEditorMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CinEditorMLSwitch<Adapter> modelSwitch = new CinEditorMLSwitch<Adapter>() {
		@Override
		public Adapter caseMovie(Movie object) {
			return createMovieAdapter();
		}

		@Override
		public Adapter caseLayer(Layer object) {
			return createLayerAdapter();
		}

		@Override
		public Adapter caseText(Text object) {
			return createTextAdapter();
		}

		@Override
		public Adapter casePicture(Picture object) {
			return createPictureAdapter();
		}

		@Override
		public Adapter caseVideo(Video object) {
			return createVideoAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseEffect(Effect object) {
			return createEffectAdapter();
		}

		@Override
		public Adapter caseFadeIn(FadeIn object) {
			return createFadeInAdapter();
		}

		@Override
		public Adapter caseFadeOut(FadeOut object) {
			return createFadeOutAdapter();
		}

		@Override
		public Adapter caseTranslate(Translate object) {
			return createTranslateAdapter();
		}

		@Override
		public Adapter caseShape(Shape object) {
			return createShapeAdapter();
		}

		@Override
		public Adapter casePosition(Position object) {
			return createPositionAdapter();
		}

		@Override
		public Adapter caseRectangle(Rectangle object) {
			return createRectangleAdapter();
		}

		@Override
		public Adapter caseDimension(Dimension object) {
			return createDimensionAdapter();
		}

		@Override
		public Adapter caseHexadecimalColor(HexadecimalColor object) {
			return createHexadecimalColorAdapter();
		}

		@Override
		public Adapter caseGraphicalElement(GraphicalElement object) {
			return createGraphicalElementAdapter();
		}

		@Override
		public Adapter caseItemPositionInt(ItemPositionInt object) {
			return createItemPositionIntAdapter();
		}

		@Override
		public Adapter caseItemPosition(ItemPosition object) {
			return createItemPositionAdapter();
		}

		@Override
		public Adapter caseItemPositionString(ItemPositionString object) {
			return createItemPositionStringAdapter();
		}

		@Override
		public Adapter caseAudioElement(AudioElement object) {
			return createAudioElementAdapter();
		}

		@Override
		public Adapter caseMargin(Margin object) {
			return createMarginAdapter();
		}

		@Override
		public Adapter caseTemporalPosition(TemporalPosition object) {
			return createTemporalPositionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.Movie <em>Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.Movie
	 * @generated
	 */
	public Adapter createMovieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.Picture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.Picture
	 * @generated
	 */
	public Adapter createPictureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.Video
	 * @generated
	 */
	public Adapter createVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.Effect
	 * @generated
	 */
	public Adapter createEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.FadeIn <em>Fade In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.FadeIn
	 * @generated
	 */
	public Adapter createFadeInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.FadeOut <em>Fade Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.FadeOut
	 * @generated
	 */
	public Adapter createFadeOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.Translate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.Translate
	 * @generated
	 */
	public Adapter createTranslateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.Shape
	 * @generated
	 */
	public Adapter createShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.Rectangle
	 * @generated
	 */
	public Adapter createRectangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.HexadecimalColor <em>Hexadecimal Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.HexadecimalColor
	 * @generated
	 */
	public Adapter createHexadecimalColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.GraphicalElement <em>Graphical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.GraphicalElement
	 * @generated
	 */
	public Adapter createGraphicalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.ItemPositionInt <em>Item Position Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.ItemPositionInt
	 * @generated
	 */
	public Adapter createItemPositionIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.ItemPosition <em>Item Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.ItemPosition
	 * @generated
	 */
	public Adapter createItemPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.ItemPositionString <em>Item Position String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.ItemPositionString
	 * @generated
	 */
	public Adapter createItemPositionStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.AudioElement <em>Audio Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.AudioElement
	 * @generated
	 */
	public Adapter createAudioElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.Margin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.Margin
	 * @generated
	 */
	public Adapter createMarginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CinEditorML.TemporalPosition <em>Temporal Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CinEditorML.TemporalPosition
	 * @generated
	 */
	public Adapter createTemporalPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CinEditorMLAdapterFactory
