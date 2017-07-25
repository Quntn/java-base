package com.sopra.pox3.base.inheritance;

public class CellularApplication {

	public static void main(String[] args) {

		MultipleCellular mCellular = new MultipleCellular(22);
		System.out.println(mCellular.getCells());
		Eucaria eucaria = mCellular;
		System.out.println(eucaria.getCell());
		
		Polychaeta popo = new Polychaeta();

	}

}
