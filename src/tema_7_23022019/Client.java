package tema_7_23022019;

import java.util.*;

public class Client {
	
	private String nume;
	private String prenume;
	private String id_client;
	private String cnp;
	private List<Cont> listaConturi=new ArrayList<Cont>();
	
	
	
	public Client(String nume, String prenume, String id, String cnp, List<Cont> listaConturi) {
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
	
	public List<Cont> getListaConturi(){
		return listaConturi;
		
	}
	public void  afisareListaConturi() {
		 listaConturi.iterator().next().getContIBAN();
		 listaConturi.iterator().next().getPin();
		 listaConturi.iterator().next().getBalanta();
	}
	public void setListaConturi(List<Cont> listaConturi) {
		this.listaConturi = listaConturi;
	}
	
	public boolean checkID(String id)  {
		boolean check=false;
		if (this.id_client==id) {
			check=true;
		}
		return check;
	}

}
