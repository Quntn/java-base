package com.sopra.pox3.collection.primes;

import java.util.Iterator;

public class IntegerIterable implements Iterable<Integer> {

	@Override
	public Iterator<Integer> iterator() {

		return new intIterator();
	}

}

class intIterator implements Iterator<Integer> {

	int position = 1;

	@Override
	public boolean hasNext() {

		return position <= 100;
	}

	@Override
	public Integer next() {
		int result = position;
		position++;
		return result;
	}
}