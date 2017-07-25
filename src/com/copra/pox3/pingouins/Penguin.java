package com.copra.pox3.pingouins;

public class Penguin extends Bird implements CanSlide, Comparable<Penguin> {

	String name;
	Integer speed = 24;

	public Penguin(String name, Integer speed) {
		this(name);
		this.speed = speed;

	}

	public Penguin(String name) {
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Empty name for Penguin");
		}
		this.name = name;
	}

	public void slide() {
		System.out.println("Banzaïïï, " + name + " slide at :" + speed + " km/h");
	}

	@Override
	public int compareTo(Penguin other) {
		return this.name.compareTo(other.name);
	}

	@Override
	public String toString() {
		return name + ", speed=" + speed;
	}

}
