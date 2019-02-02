package midterm_quizz;

public class Square implements Shape {
	private int latura;

	public Square(int l) {
		this.latura=l;
	}

	public double area() {
	double a=0;
	a=this.getLatura()*this.getLatura();
	return a;
	}
	
	public double perim() {
	double p=0;
	p=this.getLatura()*4;
	return p;
	}

	public int getLatura() {
		return latura;
	}

	public void setLatura(int latura) {
		this.latura = latura;
	}
}
