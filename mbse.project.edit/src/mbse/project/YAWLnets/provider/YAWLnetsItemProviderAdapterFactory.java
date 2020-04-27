/**
 */
package mbse.project.YAWLnets.provider;

import java.util.ArrayList;
import java.util.Collection;

import mbse.project.YAWLnets.util.YAWLnetsAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class YAWLnetsItemProviderAdapterFactory extends YAWLnetsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YAWLnetsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link mbse.project.YAWLnets.YAWLnet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YAWLnetItemProvider yawLnetItemProvider;

	/**
	 * This creates an adapter for a {@link mbse.project.YAWLnets.YAWLnet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createYAWLnetAdapter() {
		if (yawLnetItemProvider == null) {
			yawLnetItemProvider = new YAWLnetItemProvider(this);
		}

		return yawLnetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mbse.project.YAWLnets.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link mbse.project.YAWLnets.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mbse.project.YAWLnets.Place} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceItemProvider placeItemProvider;

	/**
	 * This creates an adapter for a {@link mbse.project.YAWLnets.Place}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlaceAdapter() {
		if (placeItemProvider == null) {
			placeItemProvider = new PlaceItemProvider(this);
		}

		return placeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mbse.project.YAWLnets.Arc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcItemProvider arcItemProvider;

	/**
	 * This creates an adapter for a {@link mbse.project.YAWLnets.Arc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArcAdapter() {
		if (arcItemProvider == null) {
			arcItemProvider = new ArcItemProvider(this);
		}

		return arcItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mbse.project.YAWLnets.ArcType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcTypeItemProvider arcTypeItemProvider;

	/**
	 * This creates an adapter for a {@link mbse.project.YAWLnets.ArcType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArcTypeAdapter() {
		if (arcTypeItemProvider == null) {
			arcTypeItemProvider = new ArcTypeItemProvider(this);
		}

		return arcTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mbse.project.YAWLnets.PlaceMarking} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceMarkingItemProvider placeMarkingItemProvider;

	/**
	 * This creates an adapter for a {@link mbse.project.YAWLnets.PlaceMarking}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlaceMarkingAdapter() {
		if (placeMarkingItemProvider == null) {
			placeMarkingItemProvider = new PlaceMarkingItemProvider(this);
		}

		return placeMarkingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mbse.project.YAWLnets.SplitType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitTypeItemProvider splitTypeItemProvider;

	/**
	 * This creates an adapter for a {@link mbse.project.YAWLnets.SplitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSplitTypeAdapter() {
		if (splitTypeItemProvider == null) {
			splitTypeItemProvider = new SplitTypeItemProvider(this);
		}

		return splitTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mbse.project.YAWLnets.JoinType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinTypeItemProvider joinTypeItemProvider;

	/**
	 * This creates an adapter for a {@link mbse.project.YAWLnets.JoinType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJoinTypeAdapter() {
		if (joinTypeItemProvider == null) {
			joinTypeItemProvider = new JoinTypeItemProvider(this);
		}

		return joinTypeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (yawLnetItemProvider != null) yawLnetItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (placeItemProvider != null) placeItemProvider.dispose();
		if (arcItemProvider != null) arcItemProvider.dispose();
		if (arcTypeItemProvider != null) arcTypeItemProvider.dispose();
		if (placeMarkingItemProvider != null) placeMarkingItemProvider.dispose();
		if (splitTypeItemProvider != null) splitTypeItemProvider.dispose();
		if (joinTypeItemProvider != null) joinTypeItemProvider.dispose();
	}

}
