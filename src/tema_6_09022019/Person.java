package tema_6_09022019;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import tema_6_09022019.Hobby;


public class Person {
	
		private String name;
		private String cnp;
		private int age;

		public Person(String name, String cnp, int age) {
			super();
			this.name = name;
			this.cnp = cnp;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCnp() {
			return cnp;
		}

		public void setCnp(String cnp) {
			this.cnp = cnp;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public String toString() {
			return this.name + ","+cnp + "," + age;

		}
		

	
public static void main(String[] args) {
	Map<Person,List<Hobby>> map = new HashMap<>();
	
	List<Hobby> hobb1=new ArrayList<>();
	List<Adresa> add1=new ArrayList<>();
	add1.add(new Adresa("Sos Bucuresti Ploiesti",45,"Bucuresti","Romania"));
	add1.add(new Adresa("Str Toamnei",23,"Ploiesti","Romania"));
	hobb1.add(new Hobby("Swimming",5,add1));
	hobb1.add(new Hobby("Water Polo",2,add1));
	Person pers1= new Person("Bogdan","123456789",23);
	map.put(pers1, hobb1);
//	System.out.println(pers1.toString());
//	System.out.println(map.get(pers1).toString());
	
	List<Hobby> hobb2=new ArrayList<>();
	List<Adresa> add2=new ArrayList<>();
	add2.add(new Adresa("Sos Pipera",15,"Bucuresti","Romania"));
	add2.add(new Adresa("Str Paris",2,"Ploiesti","Romania"));
	hobb2.add(new Hobby("Tenis",5,add1));
	hobb2.add(new Hobby("Cycling",2,add2));
	Person pers2= new Person("Mihai","123456789",28);
	map.put(pers2, hobb2);
//	System.out.println(pers2.toString());
//	System.out.println(map.get(pers2).toString());
	
	map.forEach((Person pers,List<Hobby> hob) -> System.out.println(pers+" --> \n"+hob));

	
	
}
}
