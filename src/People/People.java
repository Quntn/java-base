package People;

public class People {

	String name;
	int age;
	final static int maxAge=123;

	public People(String name, int age) { // alt-shift-S, O crée un constructeur
		super();
		this.name = name;
		this.age = age;
	}

	int birthday() {

		if (age < 120) {

			int increment = 1;

			return this.age + increment;
		}
		return -1;
	}
	
	public String getName(){
		return name;
	}

}
