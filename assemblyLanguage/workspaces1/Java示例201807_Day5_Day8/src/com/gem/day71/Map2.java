package com.gem.day71;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map2 {

	public static void main(String[] args) {
		Employee e1 = new Employee("101", "Lily", "Female");
		Employee e2 = new Employee("102", "Lucy", "Female");
		Employee e3 = (new Employee("103", "Tomas", "Male"));
		
		Map<String,Employee> map=new HashMap<String,Employee>();
		map.put(e1.getEmpId(), e1);
		map.put(e2.getEmpId(), e2);
		map.put(e3.getEmpId(), e3);
		System.out.println(map.size());
		
		Set<String> set=map.keySet();
		Iterator<String> iterator=set.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			Employee emp=map.get(key);
			System.out.println(emp.getEmpId()+"\t"+
							emp.getEmpName()+"\t"+
							emp.getGender());
		}
	}

}
