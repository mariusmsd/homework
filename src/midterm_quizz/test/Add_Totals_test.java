package midterm_quizz.test;

import static org.junit.Assert.*;

import org.junit.*;
import midterm_quizz.*;

public class Add_Totals_test {

	private DrawingTool list = new DrawingTool();

	@Before
	public void setUp() {

		Shape c = new Circle(3);
		list.add(c);
		Shape s = new Square(3);
		list.add(s);
	}

	@Test
	public void TotalAreaTest() {
		assertEquals(37.26, list.totalArea(), 0.02);
	}

	@Test
	public void TotalPerimTest() {
		assertEquals(30.84, list.totalPerim(), 0.02);
	}

	@Test //bravo, testul asta nu l-am mai vazut facut decat de o singura persoana pana acum
	public void Add_test() {
		Shape c = new Circle(3);
		assertEquals(false, list.add(c));
	}

}
