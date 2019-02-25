package midterm_quizz;

import java.util.ArrayList;

import midterm_quizz.Shape;

public class DrawingTool {

	private ArrayList<Shape> list = new ArrayList<Shape>();

	public boolean add(Shape x) {
		boolean result = true;

		if (list.contains(x)) {
			System.out.println("Obiect duplicat, nu poate fi adaugat in lista.");
			result = false;
		} else {
			list.add(x);
		}

		return result;
	}

	public double totalArea() {
		double s = 0;

		for (Shape shape : list) {
			s = s + shape.area();
		}
		return s;
	}

	public double totalPerim() {
		double p = 0;

		for (Shape shape : list) {
			p = p + shape.perim();
		}
		return p;
	}

}
