package com.sopra.pox3.garbage;

public class Bag {
	
	int weight;
	String memoryFill = "ffndskjfndsknfksdfksdnfksdfksdjnfksdjfnskdfksdfksdfkjsdnfkjdsnfkjsdnfksdkfsdkfksdjfkjsdfksdfksdfbksdkcksdc sdbdsfbksdncsdcksdbcsd c,sd c,nsd c,sd c,sdb,sdbf,nsd c,sd csd c";

	public Bag(int weight) {
		this.weight = weight;
	}
	
	
	@Override
	public String toString() {
		return "Bag "+this.weight;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Killing "+this.toString());
	}
}
