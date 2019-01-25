package tema_5_19012019.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tema_5_19012019.pct3.StringPalindrom;

public class Pct_3_test_palindrom {
	
	private StringPalindrom str;
	
	@Before
	public void setUp() {
		 str=new StringPalindrom();
	}
	
	@Test
	public void testPalindrom() {
		String s="madam";
		String result=str.checkPalindrom(s);
		assertEquals("Yes",result);	
	}
	
	@Test
	public void testPalindrom2() {
		String s="palindrom";
		String result=str.checkPalindrom(s);
		assertEquals("No",result);	
	}
	
	@Test
	public void testPalindrom3() {
		String s="123456654321";
		String result=str.checkPalindrom(s);
		assertEquals("Yes",result);	
	}

}
