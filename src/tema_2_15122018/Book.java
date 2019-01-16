package tema_2_15122018;

public abstract class Book {

	private int nrPagini;
	private String titluCarte;
	
	public Book(int nrp, String titluc) {
		this.nrPagini=nrp;
		this.titluCarte=titluc;
	}
	
	public void afisare() {
		System.out.println("Cartea " +titluCarte +" are " + nrPagini + " pagini");
	}

	public int getNrPagini() {
		return nrPagini;
	}

	public void setNrPagini(int nrPagini) {
		this.nrPagini = nrPagini;
	}

	public String getTitluCarte() {
		return titluCarte;
	}

	public void setTitluCarte(String titluCarte) {
		this.titluCarte = titluCarte;
	}
}
