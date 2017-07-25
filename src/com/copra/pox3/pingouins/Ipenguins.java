package com.copra.pox3.pingouins;

import java.util.ArrayList;
import java.util.List;

public class Ipenguins {
	
	static List<Penguin> penguins = new ArrayList<>();
	
	
	public List <Penguin> getAllPenguins(){
		
		
		Penguin commandant = new Penguin("Commandant", 30);
		Penguin kowalski = new Penguin("Kowalski", 55);
		Penguin rico = new Penguin("Rico", 10);
		Penguin soldat = new Penguin("Private", 2);
		penguins.add(commandant);
		penguins.add(kowalski);
		penguins.add(rico);
		penguins.add(soldat);
		
		return penguins;
	}
	
}

	

