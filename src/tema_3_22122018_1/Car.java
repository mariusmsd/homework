package tema_3_22122018_1;

public abstract class Car implements Vehicle {
	

	private float fuelTankSize;
	private String fuelType;
	private int gearsNo;
	private float consumptionPer100Km;
	private float availableFuel;
	private int tireSize;
	private String chassisNumber;
	
	public Car(int enginestatus, float kmnumber, float fuelTankSize, String fuelType, int gearsNo, 
			float consumptionPer100Km, float availableFuel, int tireSize, String chassisNumber) {
		
		this.fuelTankSize = fuelTankSize;
		this.fuelType = fuelType;
		this.gearsNo = gearsNo;
		this.consumptionPer100Km = consumptionPer100Km;
		this.availableFuel = availableFuel;
		this.tireSize = tireSize;
		this.chassisNumber = chassisNumber;
	}




	
	
	
}
