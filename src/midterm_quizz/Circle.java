package midterm_quizz;
/**
 * 
 * @author ionut.spalatelu
 * Sa-ti indentezi codul te rog, vezi scurtatura de Eclipse pentru Mac, la Format --> When editing Java
 */
public class Circle implements Shape {

	private int raza;

	public Circle(int r) {
		this.raza = r;
	}
	
	public double area() {
		double a = 0;
		a = this.getRaza() * this.getRaza() * 3.14;
		return a;
	}

	public double perim() {
		double p = 0;
		p = 2 * this.getRaza() * 3.14;
		return p;
	}

	public int getRaza() {
		return raza;
	}

	public void setRaza(int raza) {
		this.raza = raza;
	}

}
