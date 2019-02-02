package midterm_quizz.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import midterm_quizz.Rectangle;

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
