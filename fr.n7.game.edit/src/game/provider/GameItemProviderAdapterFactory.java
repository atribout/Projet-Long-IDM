/**
 */
package game.provider;

import game.util.GameAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

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
public class GameItemProviderAdapterFactory extends GameAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public GameItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.Jeu} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JeuItemProvider jeuItemProvider;

	/**
	 * This creates an adapter for a {@link game.Jeu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJeuAdapter() {
		if (jeuItemProvider == null) {
			jeuItemProvider = new JeuItemProvider(this);
		}

		return jeuItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.Connaissance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnaissanceItemProvider connaissanceItemProvider;

	/**
	 * This creates an adapter for a {@link game.Connaissance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnaissanceAdapter() {
		if (connaissanceItemProvider == null) {
			connaissanceItemProvider = new ConnaissanceItemProvider(this);
		}

		return connaissanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.Objet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjetItemProvider objetItemProvider;

	/**
	 * This creates an adapter for a {@link game.Objet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjetAdapter() {
		if (objetItemProvider == null) {
			objetItemProvider = new ObjetItemProvider(this);
		}

		return objetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.ObjetTenu} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjetTenuItemProvider objetTenuItemProvider;

	/**
	 * This creates an adapter for a {@link game.ObjetTenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjetTenuAdapter() {
		if (objetTenuItemProvider == null) {
			objetTenuItemProvider = new ObjetTenuItemProvider(this);
		}

		return objetTenuItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.Condition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionItemProvider conditionItemProvider;

	/**
	 * This creates an adapter for a {@link game.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionAdapter() {
		if (conditionItemProvider == null) {
			conditionItemProvider = new ConditionItemProvider(this);
		}

		return conditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.PNJ} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PNJItemProvider pnjItemProvider;

	/**
	 * This creates an adapter for a {@link game.PNJ}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPNJAdapter() {
		if (pnjItemProvider == null) {
			pnjItemProvider = new PNJItemProvider(this);
		}

		return pnjItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.Lieu} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LieuItemProvider lieuItemProvider;

	/**
	 * This creates an adapter for a {@link game.Lieu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLieuAdapter() {
		if (lieuItemProvider == null) {
			lieuItemProvider = new LieuItemProvider(this);
		}

		return lieuItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.Dialogue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogueItemProvider dialogueItemProvider;

	/**
	 * This creates an adapter for a {@link game.Dialogue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDialogueAdapter() {
		if (dialogueItemProvider == null) {
			dialogueItemProvider = new DialogueItemProvider(this);
		}

		return dialogueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.Choix} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoixItemProvider choixItemProvider;

	/**
	 * This creates an adapter for a {@link game.Choix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoixAdapter() {
		if (choixItemProvider == null) {
			choixItemProvider = new ChoixItemProvider(this);
		}

		return choixItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link game.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.Chemin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheminItemProvider cheminItemProvider;

	/**
	 * This creates an adapter for a {@link game.Chemin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCheminAdapter() {
		if (cheminItemProvider == null) {
			cheminItemProvider = new CheminItemProvider(this);
		}

		return cheminItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.Conditionnel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionnelItemProvider conditionnelItemProvider;

	/**
	 * This creates an adapter for a {@link game.Conditionnel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionnelAdapter() {
		if (conditionnelItemProvider == null) {
			conditionnelItemProvider = new ConditionnelItemProvider(this);
		}

		return conditionnelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.Joueur} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoueurItemProvider joueurItemProvider;

	/**
	 * This creates an adapter for a {@link game.Joueur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJoueurAdapter() {
		if (joueurItemProvider == null) {
			joueurItemProvider = new JoueurItemProvider(this);
		}

		return joueurItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link game.JeuElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JeuElementItemProvider jeuElementItemProvider;

	/**
	 * This creates an adapter for a {@link game.JeuElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJeuElementAdapter() {
		if (jeuElementItemProvider == null) {
			jeuElementItemProvider = new JeuElementItemProvider(this);
		}

		return jeuElementItemProvider;
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
		if (jeuItemProvider != null) jeuItemProvider.dispose();
		if (connaissanceItemProvider != null) connaissanceItemProvider.dispose();
		if (objetItemProvider != null) objetItemProvider.dispose();
		if (objetTenuItemProvider != null) objetTenuItemProvider.dispose();
		if (conditionItemProvider != null) conditionItemProvider.dispose();
		if (pnjItemProvider != null) pnjItemProvider.dispose();
		if (lieuItemProvider != null) lieuItemProvider.dispose();
		if (dialogueItemProvider != null) dialogueItemProvider.dispose();
		if (choixItemProvider != null) choixItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (cheminItemProvider != null) cheminItemProvider.dispose();
		if (conditionnelItemProvider != null) conditionnelItemProvider.dispose();
		if (joueurItemProvider != null) joueurItemProvider.dispose();
		if (jeuElementItemProvider != null) jeuElementItemProvider.dispose();
	}

}
