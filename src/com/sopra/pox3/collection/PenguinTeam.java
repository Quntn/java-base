package com.sopra.pox3.collection;

import java.util.Iterator;
import java.util.List;

import com.copra.pox3.pingouins.Penguin;

public class PenguinTeam {

	int count = 0;

	List<Penguin> penguins = new CircularList<>();
	Iterator<Penguin>iterator;

	public PenguinTeam(Penguin[] allPenguins) {

		for (int i = 0; i < allPenguins.length; i++) {
			penguins.add(allPenguins[i]);
		}

		iterator = this.penguins.iterator();
	}

	public List<Penguin> getPenguins() {
		return penguins;
	}

	
	public Penguin next() {

		return this.iterator.next();

	}

}
