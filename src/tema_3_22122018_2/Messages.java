package tema_3_22122018_2;

public class Messages {
	
	private String phoneNumber;
	private String smsContent;
	
	public Messages() {
	}
	
	public Messages(String pN,String smsC) {
		if(smsC.length()<=500) {
			this.phoneNumber=pN;
			this.smsContent=smsC;
			System.out.println("Mesaj transmis");
		}
		else {
			System.out.println("Nu se pot transmite mesaje mai lungi de 500 de caractere.");
			this.phoneNumber=pN;
			this.smsContent="Error: Mesajul nu a fost transmis (lunigme mai mare de 500 de caractere)";
		}
		
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getSmsContent() {
		return smsContent;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setSmsContent(String smsContent) {
		this.smsContent = smsContent;
	}

}
