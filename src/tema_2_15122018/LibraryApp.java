package tema_2_15122018;
import java.util.Scanner;

public class LibraryApp {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		
		Novel book1= new Novel(330,"Game Of Thrones","Fantasy") ;
		Album alb1 = new Album (20,"Best photos from Romania","Fine");
		
		Novel book2= new Novel(230,"Dune","SF") ;
		Album alb2= new Album (20,"Best photos from France","SuperFine");
				
		book1.afisare();
		book1.afisareNovel();
		
		book2.afisare();
		book2.afisareNovel();
		
		alb1.afisare();
		alb1.afisareAlbum();
		
		alb2.afisare();
		alb2.afisareAlbum();
	}


	

}
