package tema_6_09022019;

import java.util.ArrayList;
import java.util.List;
import tema_6_09022019.Adresa;

public class Hobby {


		private String nume;
		private int frecventa;
		private List<Adresa> adrese=new ArrayList<Adresa>();
		
		public Hobby(String nume, int frecventa, List<Adresa> adrese) {
		super();
		this.nume = nume;
		this.frecventa = frecventa;
		this.adrese = adrese;
		}
		
		public String getNume() {
			return nume;
		}
		public void setNume(String nume) {
			this.nume = nume;
		}
		public int getFrecventa() {
			return frecventa;
		}
		public void setFrecventa(int frecventa) {
			this.frecventa = frecventa;
		}
		public void  getAdrese() {
			adrese.iterator().next().getStrada_nr();
			adrese.iterator().next().getOras();
			adrese.iterator().next().getTara();
		}
		public void setAdrese(Adresa adr) {
			this.adrese.add(adr);
		}
		
		@Override
		public String toString() {
			return this.nume+","+frecventa+"\n"+adrese.toString()+"\n";
		}
		
	

}
