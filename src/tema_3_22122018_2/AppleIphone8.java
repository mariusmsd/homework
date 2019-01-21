package tema_3_22122018_2;

public class AppleIphone8 extends Apple {
	
	public AppleIphone8() {
		
	}
	
	public AppleIphone8(String imei) {
		this.setBatteryLife(400);
		this.setColor("Rose Gold");
		this.setMaterial("Metal");
		this.setImei(imei);		
	}

}
