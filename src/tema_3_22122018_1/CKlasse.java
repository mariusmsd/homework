package tema_3_22122018_1;

public class CKlasse extends Mercedes {

	public CKlasse() {
		// TODO Auto-generated constructor stub
	}
	
	public CKlasse(float availableFuel,String chassisNumber) {
		this.setFuelTankSize(60);
		this.setFuelType("Diesel");
		this.setGearsNo(6);
		this.setConsumptionPer100Km(6.0f);
		this.setAvailableFuel(availableFuel);
		this.setTireSize(16);
		this.setChassisNumber(chassisNumber);
	}

}
