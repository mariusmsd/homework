package tema_3_22122018_1;

public class SKlasse extends Mercedes {

	public SKlasse() {
		// TODO Auto-generated constructor stub
	}
	
	public SKlasse(float availableFuel,String chassisNumber) {
		this.setFuelTankSize(80);
		this.setFuelType("Diesel");
		this.setGearsNo(8);
		this.setConsumptionPer100Km(7.0f);
		this.setAvailableFuel(availableFuel);
		this.setTireSize(17);
		this.setChassisNumber(chassisNumber);
	}
}
