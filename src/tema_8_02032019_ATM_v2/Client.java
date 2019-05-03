package tema_8_02032019_ATM_v2;

import java.util.*;
//import lombok.Data;
//@Data
public class Client {
	
	private String nume;
	private String prenume;
	private String id_client;
	private String cnp;
	private Cont listaConturi=new Cont();
	
	
	
	public Client(String prenume, String nume, String id, String cnp, Cont listaConturi) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.id_client = id;
		this.cnp=cnp;
		this.listaConturi = listaConturi;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public String getId() {
		return id_client;
	}
	public void setId(String id) {
		this.id_client = id;
	}
	
	public String getCnp() {
		return cnp;
	}
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}
	
	public Cont getListaConturi(){
		return listaConturi;
		
	}
	public void  afisareListaConturi() {
		 listaConturi.getContIBAN();
		 listaConturi.getPin();
		 listaConturi.getBalanta();
	}
	public void setListaConturi(Cont listaConturi) {
		this.listaConturi = listaConturi;
	}
	
	public boolean checkID(String id)  {
		boolean check=false;
		if (this.id_client==id) {
			check=true;
		}
		return check;
	}
	
	@Override
	public String toString() {
		return this.nume + ","+prenume + "," + id_client+","+cnp+","+listaConturi.toString();

	}

}
