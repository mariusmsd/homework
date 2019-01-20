package tema_3_22122018_1;

public class VWGolf extends VW {


	public VWGolf() {
	}
	
	public VWGolf(float availableFuel,String chassisNumber) {
		this.setFuelTankSize(50);
		this.setFuelType("Petrol");
		this.setGearsNo(6);
		this.setConsumptionPer100Km(6.5f);
		this.setAvailableFuel(availableFuel);
		this.setTireSize(15);
		this.setChassisNumber(chassisNumber);
	}
	
	public VWGolf(float availableFuel,int tireSize,String chassisNumber) {
		this.setFuelTankSize(50);
		this.setFuelType("Petrol");
		this.setGearsNo(6);
		this.setConsumptionPer100Km(6.5f);
		this.setAvailableFuel(availableFuel);
		this.setTireSize(tireSize);
		this.setChassisNumber(chassisNumber);
	}



	
}
