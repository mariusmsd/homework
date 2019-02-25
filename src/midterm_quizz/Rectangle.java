package midterm_quizz;

public class Rectangle implements Shape {
	private int lung;
	private int lat;

	public Rectangle(int l1, int l2) {
		this.lung = l1;
		this.lat = l2;
	}

	public double area() {
		double a = 0;
		a = this.getLung() * this.getLat();
		return a;
	}

	public double perim() {
		double p = 0;
		p = this.getLat() * 2 + this.getLung() * 2;
		return p;
	}

	public int getLung() {
		return lung;
	}

	public void setLung(int lung) {
		this.lung = lung;
	}

	public int getLat() {
		return lat;
	}

	public void setLat(int lat) {
		this.lat = lat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lat;
		result = prime * result + lung;
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
		if (!(obj instanceof Rectangle)) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		if (lat != other.lat) {
			return false;
		}
		if (lung != other.lung) {
			return false;
		}
		return true;
	}

}
