package tema_4_12012019;

import java.util.Scanner;

public class VideoStore {
	
	private Video[] movies=new Video[10];
	
	public void createArray() {
		for(int i=0;i<=9;i++) {
			this.movies[i]=new Video();
		}
		
	}
	public void addVideo(String t) {
		for (int i=0;i<=9;i++) {
			if (movies[i].getTitle()==null) {
				movies[i].setTitle(t);
				break;
			}
		}	
	}
	
	public void checkOut(String t) {
		for (int i=0;i<=9;i++) {
			if (movies[i].getTitle()==t) { 
				if(movies[i].isChecked()==false) {
					movies[i].rentVideo();
				}

		}
	}
	}
	
	public void returnVideo(String t) {
		for (int i=0;i<=9;i++) {
			if (movies[i].getTitle()==t) { 
				if(movies[i].isChecked()==true) {
					movies[i].returnVideo();
				}

			}
		}
	}
	
	public void receiveRating(String t, double r) {
		for (int i=0;i<=9;i++) {
			if (movies[i].getTitle()==t) { 
				movies[i].setrating(r);
			}
			
		}
	}
	public void listInventory() {
		for (int i=0;i<=9;i++) {
			if (movies[i].getTitle()!=null) {
			System.out.print(" - Filmul " +movies[i].getTitle());
			if (movies[i].isChecked()==false) {
				System.out.print(" este disponibil pentru inchiriere");
			}
			else {
				System.out.print(" nu este disponibil pentru inchiriere");
			}
			System.out.println(" si are rating " +movies[i].getRating());
		}
		}
	}

}
