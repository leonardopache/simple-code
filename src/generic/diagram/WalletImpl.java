package generic.diagram;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class WalletImpl extends GenericCRUD<MyClazz>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public WalletImpl(){
		List<MyClazz> allClasses = super.findAll();
	}
	
	
	public MyClazz insertEntry(MyClazz entry){
		//TODO TESTE
		return super.save(entry);
	}
}

