package tema_6_09022019;

import java.util.TreeMap;
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
		

	
public static void main(String[] args) {
	Map<Person,Hobby> map = new TreeMap<Person, Hobby>();
	
}
}
