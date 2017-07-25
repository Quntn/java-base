package com.sopra.pox3.base;

public class PrimitiveApplication {
	
	  public static void main(String[] args) {
		  
		  byte x = 10;
		  int y = 265165165;
		  long z = 100_000_000_000L; //Pour la machine, il faut mettre le L pour définir le Long, sinon ça compte pour un int
		  
		  char c = 'x';
		  boolean vrai = false;
		  
		  boolean test = !(3>2 & (c != 'x') || (2<3));
		  System.out.println(test);
		  
		  y = 8;
		  int move = y>>1;    //bouge en binaire   8, c'est 1000 en binaire, ici le <<1 déplace le binaire en 100, qui est égale à 4
		  System.out.println(move);
		  
		  
	  }

}
