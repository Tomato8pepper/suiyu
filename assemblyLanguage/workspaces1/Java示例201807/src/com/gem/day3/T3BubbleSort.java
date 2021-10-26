package com.gem.day3;

public class T3BubbleSort {

	public static void main(String[] args) {
		
		//冒泡排序 :相邻2数比较，小的往前，大的往后
		//1.冒泡排序:
		//解析：1.比较相邻的两个元素，如果前一个比后一个大，则交换位置。
		//2.第一轮的时候最后一个元素应该是最大的一个。
		//3.按照步骤一的方法进行相邻两个元素的比较，这个时候由于最后一个元素已经是最大的了，所以最后一个元素不用比较。
		
		int[] arr={3,1,5,7,2,4,9,6};

		System.out.print("排序前>>>");
		for (int item : arr) {
			System.out.print(item + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length-1; i++) {  	 	//第几轮循环
			for (int j = 0; j < arr.length-1-i; j++) {		  	//每轮里面要比较几次
				if(arr[j]>arr[j+1]){
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
			System.out.print("第"+(i+1)+"轮排序：");
			for (int item : arr) {
				System.out.print(item + "\t");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.print("排序后>>>");
		for (int item : arr) {
			System.out.print(item + "\t");
		}
	}

}
