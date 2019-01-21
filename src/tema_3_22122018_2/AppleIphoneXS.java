package tema_3_22122018_2;

public class AppleIphoneXS extends Apple {
	
	public AppleIphoneXS() {
		
	}
	
	public AppleIphoneXS(String imei) {
		this.setBatteryLife(450);
		this.setColor("Silver");
		this.setMaterial("Metal/Glass");
		this.setImei(imei);		
	}

}
