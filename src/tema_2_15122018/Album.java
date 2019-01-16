package tema_2_15122018;

public class Album extends Book{
	
	String paperq;
	
	public Album(int nrp, String titluc, String pq) {
		super(nrp, titluc);
		// TODO Auto-generated constructor stub
		this.paperq=pq;
	}

	public void afisareAlbum() {
		System.out.println("Calitatea hartiei este " + paperq);
	}

}
