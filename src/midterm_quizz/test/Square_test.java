package midterm_quizz.test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import midterm_quizz.Square;

/*
 * Nu era nevoie sa faci un test pentru fiecare tip de shape in parte
 * In fine, daca ai facut nu-i nimic gresit
 */
public class Square_test {
	
	private Square s;

	@Before
	public void setUp() {
		s=new Square(2);
	}
	
	@Test
	public void areaTest() {
		assertEquals(4,s.area(),0);
	}
	
	@Test
	public void perimTest() {
		assertEquals(8,s.perim(),0);
	}
}
