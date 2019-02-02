package midterm_quizz.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import midterm_quizz.DrawingTool;
import midterm_quizz.*;
//import midterm_quizz.Circle;


public class Add_Totals_test {
	
	private DrawingTool list=new DrawingTool();
	
	@Before
	public void setUp() {
		
		Shape c=new Circle(3);
		list.add(c);
		Shape s=new Square(3);
		list.add(s);
	}
	
	@Test
	public void TotalAreaTest() {
		assertEquals(37.26,list.totalArea(),0.02);
	}
	
	@Test
	public void TotalPerimTest() {
		assertEquals(30.84,list.totalPerim(),0.02);
	}
	
	@Test
	public void Add_test() {
		Shape c=new Circle(3);
		assertEquals(false,list.add(c));
	}

}
