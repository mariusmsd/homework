package tema_3_22122018_1;

public abstract class Vehicle {
	private int enginestatus;
	private float kmnumber;
	

	public Vehicle(int enginestatus,float kmnumber) {
		this.enginestatus=enginestatus;
		this.kmnumber=kmnumber;
	}
	public void start() {
		enginestatus=1;
		
	}
	public void stop() {
		enginestatus=0;
		
	}
	public void drive( float kmdriven) {
		kmnumber=kmnumber+kmdriven;
	}
	
	public int getEnginestatus() {
		return enginestatus;
	}
	public void setEnginestatus(int enginestatus) {
		this.enginestatus = enginestatus;
	}
	public float getKmnumber() {
		return kmnumber;
	}
	public void setKmnumber(float kmnumber) {
		this.kmnumber = kmnumber;
	}
}
