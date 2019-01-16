package tema_2_15122018;
import java.util.Scanner;

public class LibraryApp2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		String opt;
		Novel[] novels=new Novel[3];
		int ni=0;
		Album[] albums=new Album[3];
		int ai=0;
		
		int j=1;

		while (j<=2) {
			
		switch (readOption()) {
			case "a":{
				if (ai<=albums.length){
					albums[ai]=newAlbum();
					ai++;
				}
				break;
				
			}
			case "n":{
				if (ni<=novels.length){
					novels[ni]=newNovel();
					ni++;
				}
				break;
					
			}
			case "d":{
				for (int i=0;i<ai;i++) {
					albums[i].afisare();
					albums[i].afisareAlbum();
				}
			break;
			}
			case "f":{
				for (int i=0;i<ni;i++) {
					novels[i].afisare();
					novels[i].afisareNovel();
				}
			break;
			
			}
			case "q":{
				for (int i=0;i<ai;i++) {
					System.out.println("cartea " +i +" are titlul " +albums[i].getTitluCarte());
					System.out.println(readTitlu());
//					if (albums[i].getTitluCarte()==readTitlu()) {
//						System.out.println("match titlu");
//						deleteAlbum().afisare();
//					}
//					else {
//						System.out.println("not match titlu");
//					}
						
				}
			break;
			
			
			
			}
			
			default: System.out.println("Operatie nedefinita");	
			}
			j++;
		}
			
		}
		
		

	
	public static String readOption() {
		String opt;
		System.out.println("Aveti urmatoarele optiuni: ");
		System.out.println("a - adaugare album");
		System.out.println("n - adaugare roman");
		System.out.println("d - afisare lista albume");
		System.out.println("f - afisare lista romane");
		System.out.println("q - stergere album");
		System.out.println("w - stergere roman");
		opt = sc.next();
		
		return opt;
	}
	
	
	
	public static Novel newNovel() {
		
		int nrp; 
		String titluc; 
		String tp;
		
		
		System.out.println("Introduceti numarul de pagini: ");
		nrp = sc.nextInt();
		
		System.out.println("Introduceti titlul romanului: ");
		titluc = sc.next();
		
		System.out.println("Introduceti tipul romanului: ");
		tp = sc.next();
		
		Novel n= new Novel(nrp,titluc,tp);
		
		return n;
	}
	
	public static Album newAlbum() {
		
		int nrp; 
		String titluc; 
		String pq;
		
		
		System.out.println("Introduceti numarul de pagini: ");
		nrp = sc.nextInt();
		
		System.out.println("Introduceti titlul albumului: ");
		titluc = sc.next();
		
		System.out.println("Introduceti calitatea hartiei: ");
		pq = sc.next();
		
		Album a= new Album(nrp,titluc,pq);
		
		return a;
	}
	public static Album deleteAlbum() {

		
		Album a= new Album(0,null,null);
		return a;
		
	}
	public static Novel deleteNovel() {
		int nrp=0; 
		String titluc=null; 
		String tp=null;
		
		Novel n= new Novel(nrp,titluc,tp);
		return n;
		
	}
	
	public static String readTitlu() {
		String titlu;
		
		System.out.println("Introduceti titlul cartii pe care doriti sa o stergeti: ");
		titlu = sc.next();
		
		return titlu;
	}
	

}
