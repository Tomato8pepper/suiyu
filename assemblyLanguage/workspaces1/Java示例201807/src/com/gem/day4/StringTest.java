package com.gem.day4;

public class StringTest {

	public static void main(String[] args) {
		String name="lily";//*****
		
		String name2=new String("lily");//*
		String name3="lily";
		String name4=new String("lily");
		System.out.println(name==name2);
		System.out.println(name==name3);
		System.out.println(name2==name4); 
		//==  �Ƚ��ǵ�ַ
		System.out.println("***************");
		// �Ƚ�����equals()
		System.out.println(name.equals(name2));
		System.out.println(name.equals(name3));
		System.out.println(name2.equals(name4));
		
		String name5="Lily";
		System.out.println(name5.toLowerCase());
		System.out.println(name5.toUpperCase());//LILY
		System.out.println(name5.equals("lily"));
		System.out.println(name5.equalsIgnoreCase("lily"));

		System.out.println(name5+" 55");
		System.out.println(name5.concat(" 666"));

		System.out.println(name5.indexOf("l"));  //2
		System.out.println("hello world".lastIndexOf("l"));  //9
		System.out.println("hello world".substring(4));  //o world
		System.out.println("hello world".substring(4,6));  //o 
		
		//ƴ��XXX
		System.out.println(name5+" 55"+" 66"+" 77");//

		//StringBuffer��String��ǿ��
		StringBuffer sb = new StringBuffer("aaa");
		sb.append("bbb");
		sb.append("ccc");
		sb.append("ddd");
		System.out.println(sb.toString());
		
		//Object���������ࡢ���顢ö����ĸ���
	}

}
