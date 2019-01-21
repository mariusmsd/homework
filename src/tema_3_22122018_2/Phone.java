package tema_3_22122018_2;

import java.util.ArrayList;

public abstract class Phone {
	
	private int batteryLife;
	private String color;
	private String material;
	private String imei;
	ArrayList<Contacts> myContactList;
	ArrayList<Messages> myMessagesList;
	ArrayList<String> myCallList;
	
	
	
	
	
	public void createMemory() {
		myContactList=new ArrayList<Contacts>();
		myMessagesList=new ArrayList<Messages>();
		myCallList=new ArrayList<String>();
	}

	public void addContact(int o, String pN,String fN, String lN) {
		Contacts c=new Contacts(o,pN,fN,lN);
		myContactList.add(c);
	
	}
	public void listContacts() {
		int listSize=myContactList.size();
		System.out.println("Afisare lista contacte:");
		for(int i=0;i<listSize;i++){
			Contacts x = myContactList.get(i);
			System.out.println(x.getOrder() +" * " +x.getPhoneNumber() +" * " +x.getFirstName() +" * " +x.getLastName());
		}
		
	}
	public void sendSMS(String pN,String smsC) {
		Messages m=new Messages(pN, smsC);
		myMessagesList.add(m);
		this.setBatteryLife(getBatteryLife()-1);
		
	}
	public void listSMS(String pN) {
		System.out.println("Afisare lista SMS-uri pentru numarul " +pN);
		int listSize=myMessagesList.size();
		for(int i=0;i<listSize;i++){
			Messages m=myMessagesList.get(i);
			
			if(m.getPhoneNumber().equals(pN)) {
				System.out.println(m.getSmsContent());
			}
		}
		
	}
	public void call(String pN) {
		myCallList.add(pN);
		System.out.println("Apel catre " +pN + " initiat");
		this.setBatteryLife(getBatteryLife()-2);
		
	}
	public void callList() {
		System.out.println("Afisare lista apeluri ");
		int listSize=myCallList.size();
		for(int i=0;i<listSize;i++){
			System.out.println(myCallList.get(i));
		}
		
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
