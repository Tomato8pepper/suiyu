package com.gem.day3;

public class T5¾ØÕó {

	public static void main(String[] args) {
		int[][] arr1={{1,2,3},{4,5,6}};
		int[][] arr2={{1,4},{2,5},{3,6}};
		int[][] arr3=new int[2][2];
		for (int i = 0; i < arr1.length; i++) {			//2
			for (int j = 0; j < arr2.length; j++) {		//3
				for (int k = 0; k < arr3.length; k++)  //2
					//1+4  +9?
							//arr1[0][0]* arr2[0][0]   //1
							//arr1[0][1]* arr2[1][0]   //	4
							//arr1[0][2]* arr2[2][0] 	 // 9
					arr3[i][k] = arr3[i][k] +arr1[i][j] * arr2[j][k];
			}
		}
		
		System.out.println("¾ØÕóÏà³Ëºó¾ØÕóÎª:");
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++)
				System.out.print(arr3[i][j] + "      ");
			System.out.print("\n");
		}
		
		//14	32
		//32	77
	}

}
