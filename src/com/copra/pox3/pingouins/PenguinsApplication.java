package com.copra.pox3.pingouins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PenguinsApplication {

	public static void main(String[] args) {

		Penguin p1 = new Penguin("Commandant", 30);
		Penguin p2 = new Penguin("Kowalski", 55);
		Penguin p3 = new Penguin("Rico", 10);
		Penguin p4 = new Penguin("Private");

		System.out.println(p1);

		Penguin p6 = new Penguin("Dodo");
		System.out.println(p6);

		Emperor napoleon = new Emperor("Napoleon");
		System.out.println(napoleon);
		napoleon.slide();
		napoleon.slide(p1);
		
		Emperor charlemagne = new Emperor ("Charlemagne");
		charlemagne.slide(napoleon);
		
		
		System.out.println("\n=== là, ça part en sucette ===\n");

		Penguin p = napoleon;
		p=p1;
		p=napoleon;
		p.slide();
		
		p=charlemagne;
		napoleon.slide(p);
	}

}
 