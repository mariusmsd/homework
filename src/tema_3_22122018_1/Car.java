package tema_3_22122018_1;

public abstract class Car implements Vehicle {
	

	private float fuelTankSize;
	private String fuelType;
	private int gearsNo;
	private float consumptionPer100Km;
	private float availableFuel;
	private int tireSize;
	private String chassisNumber;
	private float AverageFuelConsumption; //cu litera mica
	

	@Override
	public void start() {
		System.out.println("Let's go");
		this.AverageFuelConsumption=0;
	}

	@Override
	public void stop() {
		System.out.println("We're done");
	}

	@Override
	public void drive() {
	}
	
	public void drive(float x) {
		this.availableFuel=this.availableFuel-(x*this.consumptionPer100Km/100);
		this.AverageFuelConsumption=this.AverageFuelConsumption+(x*this.consumptionPer100Km/100);	
	}
	
	public void shiftGear(int x) {
		System.out.println("Ati selectat treapta " +x +" de viteza.");
		
	}

	public void setFuelTankSize(float fuelTankSize) {
		this.fuelTankSize = fuelTankSize;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setGearsNo(int gearsNo) {
		this.gearsNo = gearsNo;
	}

	public void setConsumptionPer100Km(float consumptionPer100Km) {
		this.consumptionPer100Km = consumptionPer100Km;
	}

	public void setAvailableFuel(float availableFuel) {
		this.availableFuel = availableFuel;
	}



	public void setTireSize(int tireSize) {
		this.tireSize = tireSize;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public float getFuelTankSize() {
		return fuelTankSize;
	}

	public String getFuelType() {
		return fuelType;
	}

	public int getGearsNo() {
		return gearsNo;
	}

	public float getConsumptionPer100Km() {
		return consumptionPer100Km;
	}

	public float getAvailableFuel() {
		return availableFuel;
	}

	public int getTireSize() {
		return tireSize;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public float getAverageFuelConsumption() {
		return AverageFuelConsumption;
	}

	

	




	
	
	
}
