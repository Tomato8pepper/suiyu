package com.gem.day71;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set1 {
	public static void main(String[] args) {
		//集合
		Set<Integer> list2=new  HashSet<Integer>();
		list2.add(111);
		list2.add(222);
		list2.add(333);
		list2.add(222);
		System.out.println(list2.size());  //3
		for (Integer item : list2) {
			System.out.println(item);
		}
		
		Set<String> list3=new  HashSet<String>();
		list3.add("a111");
		list3.add("222");
		list3.add("b333中");
		list3.add("中666");
		list3.add("c777");
		list3.add("222");
		list3.add("444");
		list3.add("555");
		System.out.println(list3.size());
		for (String item : list3) {
			System.out.println(item);
		}
		
	}
}
