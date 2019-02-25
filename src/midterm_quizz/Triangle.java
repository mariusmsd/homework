package midterm_quizz;

public class Triangle implements Shape {
	private int l1, l2, l3;

	public Triangle(int l1, int l2, int l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	public double area() {
		double a = 0;
		double p = this.perim() / 2;

		a = Math.sqrt((double) p * (p - this.getL1()) * (p - this.getL2()) * (p - this.getL3()));
		return a;
	}

	public double perim() {
		double p = 0;
		p = this.getL1() + this.getL2() + this.getL3();
		return p;
	}

	public int getL1() {
		return l1;
	}

	public void setL1(int l1) {
		this.l1 = l1;
	}

	public int getL2() {
		return l2;
	}

	public void setL2(int l2) {
		this.l2 = l2;
	}

	public int getL3() {
		return l3;
	}

	public void setL3(int l3) {
		this.l3 = l3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + l1;
		result = prime * result + l2;
		result = prime * result + l3;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Triangle)) {
			return false;
		}
		Triangle other = (Triangle) obj;
		if (l1 != other.l1) {
			return false;
		}
		if (l2 != other.l2) {
			return false;
		}
		if (l3 != other.l3) {
			return false;
		}
		return true;
	}

	

}
