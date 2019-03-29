package tema_7_23022019_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.*;




import tema_7_23022019.*;

public class ATM_test {
	private Map<String,Client> listaCl_test=new HashMap<>();
	
	@Before
	public void setUp() {
		
		
		
		List<Cont> p1cont =new ArrayList<Cont>();
		p1cont.add(new Cont("RO11 INGB 0000 0000 0000 1111",1111,0));
		Client client1=new Client("Ion","Popescu","IP111","1230190123456",p1cont);
		listaCl_test.put(client1.getId(),client1);
		
	}
	
	@Test
	public void test_afisare_IBAN() {
		assertEquals("RO11 INGB 0000 0000 0000 1111", listaCl_test.get(0).getListaConturi().get(0).getContIBAN() );
			
	}
	@Test
	public void test_depunere() {
		
		assertEquals(100, listaCl_test.get(0).getListaConturi().get(0).depunere(100) );
			
	}
	
	@Test
	public void test_retragere() {
		
		assertEquals(60, listaCl_test.get(0).getListaConturi().get(0).retragere(40) );
			
	}

}
