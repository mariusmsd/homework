package tema_4_12012019;

public class VideoStoreLauncher {

	public static void main(String[] args) {

		VideoStore vs=new VideoStore();
		vs.createArray();
		vs.addVideo("The Matrix");
		vs.addVideo("Godfather II");
		vs.addVideo("Star Wars Episode IV: A New Hope");
		vs.listInventory();
		System.out.println("***");
		vs.receiveRating("The Matrix", 4);
		vs.receiveRating("The Matrix", 2.5);
		vs.receiveRating("The Matrix", 1);
		vs.receiveRating("Godfather II", 4.5);
		vs.receiveRating("Godfather II", 5);
		vs.receiveRating("Godfather II", 2);
		vs.receiveRating("Godfather II", 4);
		vs.receiveRating("Star Wars Episode IV: A New Hope", 3);
		vs.receiveRating("Star Wars Episode IV: A New Hope", 3.5);
		vs.receiveRating("Star Wars Episode IV: A New Hope", 1.5);
		vs.listInventory();
		System.out.println("***");
		vs.checkOut("The Matrix");
		vs.checkOut("Godfather II");
		vs.listInventory();
		System.out.println("");
		vs.returnVideo("The Matrix");
		vs.listInventory();

	}
}


