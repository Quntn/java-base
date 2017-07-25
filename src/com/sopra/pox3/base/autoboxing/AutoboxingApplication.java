package com.sopra.pox3.base.autoboxing;

import java.util.Arrays;
import java.util.List;

public class AutoboxingApplication {

	public static void main(String[] args) {

		new AutoboxingApplication().init();
		new AutoboxingApplication().compare();
		new AutoboxingApplication().isATrap();
		List<Boolean>list=new AutoboxingApplication().getTruth();
		System.out.println(list);
		System.out.println(list.get(0).compareTo(false));
		
		
	}

	private void init() {

		int x = 2;
		Integer y = 2;
		Integer z = new Integer(2);

		System.out.println(x == y);

		System.out.println(x == z);

		z = x; // là on utilise l'autoboxing, le compileur bosse pour nous

		z = new Integer(x); // no autoboxing, à la dure

	}

	void compare() {

		Integer a = new Integer(12);
		Integer b = new Integer(12);

		System.out.println(a == b);
		System.out.println("Equals ?" + a.equals(b));
	}

	void isATrap() {

		Integer a = 13;
		Integer b = 13;

		System.out.println(a == b);
		System.out.println(a.compareTo(b));

		Integer x = 127;
		Integer y = 127;
		System.out.println(x == y);

	}

		
	List<Boolean> getTruth() {
		return Arrays.asList(true, false, false, true, false, true);
	}

}
 