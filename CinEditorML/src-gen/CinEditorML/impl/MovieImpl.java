/**
 */
package CinEditorML.impl;

import CinEditorML.CinEditorMLPackage;
import CinEditorML.Dimension;
import CinEditorML.Layer;
import CinEditorML.Movie;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Movie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CinEditorML.impl.MovieImpl#getLayers <em>Layers</em>}</li>
 *   <li>{@link CinEditorML.impl.MovieImpl#getName <em>Name</em>}</li>
 *   <li>{@link CinEditorML.impl.MovieImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link CinEditorML.impl.MovieImpl#getFps <em>Fps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MovieImpl extends MinimalEObjectImpl.Container implements Movie {
	/**
	 * The cached value of the '{@link #getLayers() <em>Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Layer> layers;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Dimension dimension;

	/**
	 * The default value of the '{@link #getFps() <em>Fps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFps()
	 * @generated
	 * @ordered
	 */
	protected static final int FPS_EDEFAULT = 30;

	/**
	 * The cached value of the '{@link #getFps() <em>Fps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFps()
	 * @generated
	 * @ordered
	 */
	protected int fps = FPS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CinEditorMLPackage.Literals.MOVIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layer> getLayers() {
		if (layers == null) {
			layers = new EObjectContainmentEList<Layer>(Layer.class, this, CinEditorMLPackage.MOVIE__LAYERS);
		}
		return layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.MOVIE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimension(Dimension newDimension, NotificationChain msgs) {
		Dimension oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CinEditorMLPackage.MOVIE__DIMENSION, oldDimension, newDimension);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(Dimension newDimension) {
		if (newDimension != dimension) {
			NotificationChain msgs = null;
			if (dimension != null)
				msgs = ((InternalEObject) dimension).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.MOVIE__DIMENSION, null, msgs);
			if (newDimension != null)
				msgs = ((InternalEObject) newDimension).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CinEditorMLPackage.MOVIE__DIMENSION, null, msgs);
			msgs = basicSetDimension(newDimension, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.MOVIE__DIMENSION, newDimension,
					newDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFps() {
		return fps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFps(int newFps) {
		int oldFps = fps;
		fps = newFps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CinEditorMLPackage.MOVIE__FPS, oldFps, fps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CinEditorMLPackage.MOVIE__LAYERS:
			return ((InternalEList<?>) getLayers()).basicRemove(otherEnd, msgs);
		case CinEditorMLPackage.MOVIE__DIMENSION:
			return basicSetDimension(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CinEditorMLPackage.MOVIE__LAYERS:
			return getLayers();
		case CinEditorMLPackage.MOVIE__NAME:
			return getName();
		case CinEditorMLPackage.MOVIE__DIMENSION:
			return getDimension();
		case CinEditorMLPackage.MOVIE__FPS:
			return getFps();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CinEditorMLPackage.MOVIE__LAYERS:
			getLayers().clear();
			getLayers().addAll((Collection<? extends Layer>) newValue);
			return;
		case CinEditorMLPackage.MOVIE__NAME:
			setName((String) newValue);
			return;
		case CinEditorMLPackage.MOVIE__DIMENSION:
			setDimension((Dimension) newValue);
			return;
		case CinEditorMLPackage.MOVIE__FPS:
			setFps((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CinEditorMLPackage.MOVIE__LAYERS:
			getLayers().clear();
			return;
		case CinEditorMLPackage.MOVIE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CinEditorMLPackage.MOVIE__DIMENSION:
			setDimension((Dimension) null);
			return;
		case CinEditorMLPackage.MOVIE__FPS:
			setFps(FPS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CinEditorMLPackage.MOVIE__LAYERS:
			return layers != null && !layers.isEmpty();
		case CinEditorMLPackage.MOVIE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CinEditorMLPackage.MOVIE__DIMENSION:
			return dimension != null;
		case CinEditorMLPackage.MOVIE__FPS:
			return fps != FPS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", fps: ");
		result.append(fps);
		result.append(')');
		return result.toString();
	}

} //MovieImpl
