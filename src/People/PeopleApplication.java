package People;

import java.util.Arrays;

import encapsulation.Queen;

public class PeopleApplication {

	public static void main(String[] args) {
		People john = new People("John",12);
		People jack = new People("jack", 14);
		
		System.out.println(People.maxAge);
		// People.maxAge++;
		System.out.println(People.maxAge);
		
		final People ada = new People("Ada", 30);
		ada.name="Lovelace";
		System.out.println(ada.name);

		
		
		Queen liza = new Queen("Elizabeth");
		System.out.println(liza.getName());
		
		Emperor napoleon = new Emperor("Napoleon");
		napoleon.commandAll(Arrays.asList(john, jack));
		
	}

}
