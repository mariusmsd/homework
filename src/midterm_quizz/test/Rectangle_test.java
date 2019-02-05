package midterm_quizz.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import midterm_quizz.Rectangle;
/*
 * Nu era nevoie sa faci un test pentru fiecare tip de shape in parte
 * In fine, daca ai facut nu-i nimic gresit
 */
public class Rectangle_test {
	
	private Rectangle r;
	
	@Before
	public void setUp() {
		r=new Rectangle(2,3);
	}
	
	@Test
	public void areaTest() {
		assertEquals(6,r.area(),0);
	}
	
	@Test
	public void perimTest() {
		assertEquals(10,r.perim(),0);
	}
	

}
