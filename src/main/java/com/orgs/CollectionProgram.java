package com.orgs;

import java.util.HashMap;
import java.util.Map;

public class CollectionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("Firstname", "Ram");
		hm.put("Surname", "Krishna");
		hm.put("Address", "London");
		hm.put("mobile", "07867565118");
		hm.put("Age", "47");
		hm.put("married", "Yes");
		hm.put("Email", "xyg@gmail.com");
		hm.put("Gender", "Male");
		// System.out.println(hm);
		for(Map.Entry<String, String> e:hm.entrySet())
		{
			System.out.println(e.getKey()+ "----------"+ e.getValue());
		}
			
		
	}

}
