package tema_3_22122018_2;

public class API {

	public static void main(String[] args) {
		
//		Phone phone= new Samsung();
		
		 Phone phone = new SamsungGalaxy6("123456789012");
		 phone.createMemory();
		 System.out.println("Battery life: " +phone.getBatteryLife());
		 System.out.println(" *** ");
		 phone.addContact(1, "+40711.123.123", "Ion", "Popescu");
		 phone.listContacts();
		 System.out.println(" *** ");
		 phone.addContact(2, "+1-555-45-34-23", "John", "Doe");
		 phone.listContacts();
		 System.out.println(" *** ");
		 phone.sendSMS("+40711.123.123", "SMS Demo 1");
		 phone.sendSMS("+40711.123.123", "SMS Demo 1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		 phone.listSMS("+40711.123.123");
		 System.out.println(" *** ");
		 phone.sendSMS("+1-555-45-34-23", "SMS Demo to +1-555-45-34-23");
		 phone.listSMS("+1-555-45-34-23");
		 System.out.println(" *** ");
		 System.out.println("Battery life: " +phone.getBatteryLife());
		 System.out.println(" *** ");
		 phone.call("+1-555-45-34-23");
		 phone.call("+40711.123.123");
		 phone.call("+40700.456.234");
		 System.out.println("Battery life: " +phone.getBatteryLife());
		 System.out.println(" *** ");
		 phone.callList();
	}

}
