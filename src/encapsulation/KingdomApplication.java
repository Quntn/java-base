package encapsulation;


import People.People;

public class KingdomApplication {
	
	public static void main(String[] args) {
		
		King arthur = new King("Arthur");
		
		arthur.name="Gentil Arthur";
		
		System.out.println(arthur.name);
		
		People peon = new People("Peon",20);
		arthur.command(peon);
		

		
	}

}
