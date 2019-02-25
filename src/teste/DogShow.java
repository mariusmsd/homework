package teste;

class Dog {
	public void Bark() {
		System.out.print("woof ");
	}
}

class Hound extends Dog {

	public void Sniff() {
		System.out.print("sniff ");
	}

	public void Bark() {
		System.out.print("howl ");
	}

}

public class DogShow {

	public static void main(String[] args) {
		new DogShow().go();

	}

	void go() {
		new Hound().Bark();
		((Dog) new Hound()).Bark();
//		((Dog) new Hound()).Sniff();

	}

}
