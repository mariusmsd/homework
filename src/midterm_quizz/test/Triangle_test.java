package midterm_quizz.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import midterm_quizz.Triangle;

public class Triangle_test {

	private Triangle t;
	
	@Before
	public void setUp() {
		t=new Triangle(2,3,3);
	}
	
	@Test
	public void areaTest() {
		assertEquals(2.8,t.area(),0.1);
	}
	
	@Test
	public void perimTest() {
		assertEquals(8,t.perim(),0);
	}

}
