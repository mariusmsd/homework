package tema_3_22122018_1;

public class API {
	public static void main (String args[]) {
		
		
		//Car car = new Car();
		//Car car = new VW(27, "oiqe0934hkkadsn");
		Car car = new VWGolf(27, "oiqe0934hkkadsn");
		
		car.start();

		car.shiftGear(1);

		car.drive(0.01f);// drives 0.01 KMs

		car.shiftGear(2);

		car.drive(0.02f);

		car.shiftGear(3);

		car.drive(0.5f);

		car.shiftGear(4);

		car.drive(0.5f);

		car.shiftGear(4);

		car.drive(0.5f);

		car.shiftGear(5);

		car.drive(10f);

		car.shiftGear(4);

		car.drive(0.5f);

		car.shiftGear(3);

		car.drive(0.1f);

		car.stop();

		float availableFuel = car.getAvailableFuel();
		System.out.println("Dupa aceasta sesiune de condus mai aveti disponibili " +availableFuel +" litri de carburant");

		float fuelConsumedPer100Km = car.getAverageFuelConsumption();
		System.out.println("si ati avut un consum mediu de " +fuelConsumedPer100Km/100 +" l/100km");
		
		
		Vehicle vehicle = new VWGolf(30, "1987ddkshik289"); //available fuel and chassis number

		vehicle.start();

		vehicle.drive(1f);

		vehicle.stop();

		Car car1 = (Car) vehicle;

		float availableFuel1 = car1.getAvailableFuel();
		System.out.println("Dupa aceasta sesiune de condus mai aveti disponibili " +availableFuel1 +" litri de carburant");

		float fuelConsumedPer100Km1 = car1.getAverageFuelConsumption();
		System.out.println("si ati avut un consum mediu de " +fuelConsumedPer100Km1/100 +" l/100km");
	}

}
