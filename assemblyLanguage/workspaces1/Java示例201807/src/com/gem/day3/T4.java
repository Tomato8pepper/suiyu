package com.gem.day3;

public class T4 {

	public static void main(String[] args) {
		int[][] arr=new  int[2][3];
		arr[0][0]=11;
		arr[0][1]=12;
		arr[0][2]=13;
		arr[1][0]=14;
		arr[1][1]=15;
		arr[1][2]=16;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		

		//=================================
		
		int[][] arr2={{1,2,3},{4,5,6}};
		
		//=================================
		
		int[][] arr3=new  int[2][3];
		int[] arr31={1,2,3};
		int[] arr32={4,5,6};
		arr3[0]=arr31;
		arr3[1]=arr32;
		
		
		

	}

}
