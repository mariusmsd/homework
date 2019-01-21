package tema_3_22122018_2;

public class Contacts {
	
	private int order;
	private String phoneNumber;
	private String firstName;
	private String lastName;
	
	public Contacts() {	
	}
	
	public Contacts(int o, String pN,String fN, String lN) {
		this.order=o;
		this.phoneNumber=pN;
		this.firstName=fN;
		this.lastName=lN;	
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
