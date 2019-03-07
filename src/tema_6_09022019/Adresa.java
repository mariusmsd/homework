package tema_6_09022019;

public class Adresa {

	private String strada_nr;
	private int nr;
	private String oras;
	private String tara;
	
	public Adresa(String strada_nr, int nr, String oras, String tara) {
		super();
		this.strada_nr = strada_nr;
		this.nr = nr;
		this.oras = oras;
		this.tara = tara;
	}

	public String getStrada_nr() {
		return strada_nr;
	}

	public void setStrada_nr(String strada_nr) {
		this.strada_nr = strada_nr;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getOras() {
		return oras;
	}

	public void setOras(String oras) {
		this.oras = oras;
	}

	public String getTara() {
		return tara;
	}

	public void setTara(String tara) {
		this.tara = tara;
	}
	
	@Override
	public String toString() {
		return this.strada_nr + "," + nr + "," + oras+","+tara;
	}

}
