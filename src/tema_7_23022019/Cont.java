package tema_7_23022019;

public class Cont  {
	
	private String contIBAN;
	private int pin;
	private int balanta;
	
	public Cont(String contIBAN, int pin, int balanta) {
		super();
		this.contIBAN = contIBAN;
		this.pin = pin;
		this.balanta = balanta;
	}

	public String getContIBAN() {
		return contIBAN;
	}

	public void setContIBAN(String contIBAN) {
		this.contIBAN = contIBAN;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getBalanta() {
		return balanta;
	}

	public void setBalanta(int balanta) {
		this.balanta = balanta;
	}

	public int depunere(int sumaDepusa) {
		this.balanta=this.balanta+sumaDepusa;
		return balanta;
	}
	public int retragere(int sumaRetrasa) {
		this.balanta=this.balanta-sumaRetrasa;
		return balanta;
	}
	public void changePin(int pin) {
		this.pin = pin;
	}
	
	public boolean checkPIN(int pin) {
		boolean check=false;
		if (this.pin==pin) {
			check=true;
		}
		return check;
	}
}
