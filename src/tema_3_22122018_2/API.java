package tema_3_22122018_2;

public class API {

	public static void main(String[] args) {
		
//		Phone phone= new Samsung();
		
		 Phone phone = new SamsungGalaxy6();
		 phone.createMemory();
		 phone.addContact(1, "+4 0711 123 123", "Ion", "Popescu");

	}

}
