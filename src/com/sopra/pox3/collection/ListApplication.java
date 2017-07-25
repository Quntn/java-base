package com.sopra.pox3.collection;

import java.util.List;

import com.copra.pox3.pingouins.Penguin;

public class ListApplication {

	public static void main(String[] args) {

		new ListApplication().init();

	}

	void init() {

		Penguin rico = new Penguin("Rico");
		Penguin skipper = new Penguin("Skipper");
		Penguin privat = new Penguin("Private");
		Penguin kowalsky = new Penguin("Kowalsky");
		Penguin tux = new Penguin("Tux", 98);

		Penguin[] allPenguins = { rico, skipper, privat, kowalsky, tux };

		PenguinTeam team = new PenguinTeam(allPenguins);
		//System.out.println(team.penguins);

		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());

		System.out.println("===============================================");

		List<Penguin> penguins = team.getPenguins();
		//System.out.println(penguins);

	}

}
