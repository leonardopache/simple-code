package generic.diagram;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class DiagramTest {

	
	@Test
	public void testTheDiagram(){
		WalletImpl wallet = new WalletImpl();
		assertNotNull(wallet);
	}
	
	@Test
	public void testCRUDActions(){
		WalletImpl wallet = new WalletImpl();
		MyClazz my = new MyClazz();
		//save
		assertNotNull(wallet.save(my).getId());
		
		//get
		//assertNotNull(wallet.get(0l));
		
	}
}
