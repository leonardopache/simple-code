package generic.diagram;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public abstract class GenericCRUD<T extends Entity> extends GenericRepository<T> implements CRUDInterface<T>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public GenericCRUD(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @return 
	 * @generated
	 * @ordered
	 */
	
	public void delete(int id) {
		getRepository().getRepositoryAdapter().delete(id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public T save(T entity) {
		return getRepository().getRepositoryAdapter().save(entity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public T get(int id) {
		return getRepository().getRepositoryAdapter().get(id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public List<T> findAll() {
		return getRepository().getRepositoryAdapter().findAll();
	}

}

