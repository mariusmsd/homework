package tema_3_22122018_2;



public class SamsungGalaxy6 extends Samsung {
	
	public SamsungGalaxy6() {
		
	}
	
	public SamsungGalaxy6(String imei) {
		this.setBatteryLife(300);
		this.setColor("Black");
		this.setMaterial("Plastic");
		this.setImei(imei);		
	}

	
}
