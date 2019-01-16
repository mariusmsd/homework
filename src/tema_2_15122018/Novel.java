package tema_2_15122018;

public class Novel extends Book{
	
	String type;
	
	public Novel(int nrp, String titluc, String tp) {
		super(nrp, titluc);
		// TODO Auto-generated constructor stub
		this.type=tp;
	}

	public void afisareNovel() {
		System.out.println("Tipul cartii este " + type);
	}
	
	
		
	

}