package tema_3_22122018_1;

public class VWPassat extends VW {

	public VWPassat() {
		// TODO Auto-generated constructor stub
	}
	
	public VWPassat(float availableFuel,String chassisNumber) {
		this.setFuelTankSize(65);
		this.setFuelType("Diesel");
		this.setGearsNo(6);
		this.setConsumptionPer100Km(5.5f);
		this.setAvailableFuel(availableFuel);
		this.setTireSize(16);
		this.setChassisNumber(chassisNumber);
	}

}
