package tema_3_22122018_2;

import java.util.ArrayList;

public abstract class Phone {
	
	private int batteryLife;
	private String color;
	private String material;
	private String imei;
	ArrayList<Contacts> myContactList;
	ArrayList<Messages> myMessagesList;
	
	
	
	
	
	public void createMemory() {
		myContactList=new ArrayList<Contacts>();
		myMessagesList=new ArrayList<Messages>();
	}

	public void addContact(int o, String pN,String fN, String lN) {
		Contacts c=new Contacts(o,pN,fN,lN);
//		System.out.println(c.getFirstName());
		myContactList.add(c);
		
		
		
		
	}
	public void listContacts() {
		
	}
	public void sendSMS() {
		
	}
	public void listSMS() {
		
	}
	public void call() {
		
	}
	public void callList() {
		
	}
	
	
	public int getBatteryLife() {
		return batteryLife;
	}
	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	
}
