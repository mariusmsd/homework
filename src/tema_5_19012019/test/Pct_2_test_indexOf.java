package tema_5_19012019.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tema_5_19012019.pct2.CharIndex;

public class Pct_2_test_indexOf {
	
	private CharIndex ci;
	
	@Before
	public void setUp() {
		ci=new CharIndex();
	}
	
	@Test
	public void testCharIndex1() {
		int result;
		ci.setStr("madam");
		ci.setChr('a');
		
		result=ci.checkIndex(ci);
		assertEquals(1,result);
	}
	
	@Test
	public void testCharIndex2() {
		int result;
		ci.setStr("madam");
		ci.setChr('d');
		
		result=ci.checkIndex(ci);
		assertEquals(2,result);
	}
	
	@Test
	public void testCharIndex3() {
		int result;
		ci.setStr("madam");
		ci.setChr('m');
		
		result=ci.checkIndex(ci);
		assertEquals(0,result);
	}

}
