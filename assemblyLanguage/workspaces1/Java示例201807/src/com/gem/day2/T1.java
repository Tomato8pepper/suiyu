package com.gem.day2;

public class T1 {

	public static void main(String[] args) {
		//�������������ͣ���ʹ�á�
		int abc=10;//abc identifier
		
		//������
		//byte short int long
		//���ڴ��и�ռ:1,2,4,8���ֽ�;

		byte i=-128; //-128-127  		2^8=256
		short j=-128; //-32768-32767  	2^16=65536
				
		int sum=1+2;	//2^32			9
		//long  2^64			1.8446744073709552E19
		System.out.println(sum);
		
		System.out.println(Math.pow(2, 3));

		System.out.println(012);//�˽���(��0��ͷ)
		System.out.println(0XA);//ʮ������(��0X��ͷ),
		System.out.println(0B1010);//�����ƣ���0B)

		System.out.println(8-5);
		System.out.println(2.0-1.5==0.5);
		System.out.println(2.0-1.1==0.9);
		System.out.println(1/3.0);
		//float:ʮ���ƾ�ȷ��С�������7-8  =��8*8=64������64
		//double:ʮ���ƾ�ȷ��С�������15-16
		float a1=1.1f;
		double a2=1.1;
		double a3=1/3.0;

		System.out.println(2.0-1.1);  //������Ҫ����0.8999999999999999==>0.90 �����������
		System.out.println(2.0-1.5);

		System.out.println(2.0f-1.1f); //float
			//����2
			
			char c='��';
			boolean flag=true;

			byte i3=(byte) -131;
			System.out.println(i3);//125
			byte i4=(byte)131;
			System.out.println(i4);//-125
	}
}
