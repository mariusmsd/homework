
package midterm_quizz.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import midterm_quizz.Circle;

public class Circle_test {
	private Circle c;
	
	@Before
	public void setUp() {
		c=new Circle(3);
	}
	
	@Test
	public void areaTest() {
		assertEquals(28.26,c.area(),0);
	}
	
	@Test
	public void perimTest() {
		assertEquals(18.84,c.perim(),0);
	}


}
