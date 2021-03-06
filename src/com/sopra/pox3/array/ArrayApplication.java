package com.sopra.pox3.array;

import java.util.Arrays;

public class ArrayApplication {

	public static void main(String[] args) {
	
		
		int [] ints = new int [3];
		ints[0] = 21;
		System.out.println(Arrays.toString(ints));
		
		int[]faster={3,45,15};
		System.out.println(Arrays.toString(faster));
		
		int[][] strangeMatrix= {
				{2,3,4},
				{34,2,45},
				{3,4,5,6,7,18}
		};
		System.out.println(Arrays.toString(strangeMatrix));
		strangeMatrix[1]=new int[]{3,5,4,3,4,12,34,56};
		
		for (int i=0;i<faster.length;i++){
			System.out.println(faster[i]);
		}
		
		for (int content : faster){
			System.out.println(content);
		}
		
		
	}

}
