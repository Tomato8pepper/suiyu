package com.gem.day71;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {


	public static void main(String[] args) {
		//Map(K,V) map=new HashMap<K,V>();
		//���3�����ݣ�Lily,Lucy,Tomas
		//Collection-->List,/Set
		
		Map<Integer,String> map =new HashMap<Integer,String>();
		map.put(101, "Lily");
		map.put(102, "Lucy");
		map.put(103, "Tomas");
		map.put(102, "Bill Gates"); //key��Ψһ��
		
		System.out.println(map.size());  //3
		System.out.println(map.get(102));
		System.out.println(map.get(103));
		Set<Integer> set=map.keySet();  //�õ�����key�ļ���
		for (Integer k : set) {
			System.out.println(k+"\t"+map.get(k));
		}
		System.out.println("***********************");
		// map iterator
		Iterator<Integer> ite=set.iterator();
		while (ite.hasNext()) {
			Integer k = (Integer) ite.next();
			System.out.println(k+"\t"+map.get(k));
		}
		
	}
}
