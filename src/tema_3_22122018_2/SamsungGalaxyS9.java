package tema_3_22122018_2;

public class SamsungGalaxyS9 extends Samsung {
	
	public SamsungGalaxyS9() {
		
	}
	
	public SamsungGalaxyS9(String imei) {
		this.setBatteryLife(400);
		this.setColor("Black");
		this.setMaterial("Metal/Glass");
		this.setImei(imei);		
	}

	
}


