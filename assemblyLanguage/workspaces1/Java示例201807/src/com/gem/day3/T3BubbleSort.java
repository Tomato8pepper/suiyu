package com.gem.day3;

public class T3BubbleSort {

	public static void main(String[] args) {
		
		//ð������ :����2���Ƚϣ�С����ǰ���������
		//1.ð������:
		//������1.�Ƚ����ڵ�����Ԫ�أ����ǰһ���Ⱥ�һ�����򽻻�λ�á�
		//2.��һ�ֵ�ʱ�����һ��Ԫ��Ӧ��������һ����
		//3.���ղ���һ�ķ���������������Ԫ�صıȽϣ����ʱ���������һ��Ԫ���Ѿ��������ˣ��������һ��Ԫ�ز��ñȽϡ�
		
		int[] arr={3,1,5,7,2,4,9,6};

		System.out.print("����ǰ>>>");
		for (int item : arr) {
			System.out.print(item + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length-1; i++) {  	 	//�ڼ���ѭ��
			for (int j = 0; j < arr.length-1-i; j++) {		  	//ÿ������Ҫ�Ƚϼ���
				if(arr[j]>arr[j+1]){
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
			System.out.print("��"+(i+1)+"������");
			for (int item : arr) {
				System.out.print(item + "\t");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.print("�����>>>");
		for (int item : arr) {
			System.out.print(item + "\t");
		}
	}

}
