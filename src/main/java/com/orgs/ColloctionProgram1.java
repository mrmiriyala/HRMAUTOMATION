package com.orgs;

import java.util.HashMap;
import java.util.Map;

public class ColloctionProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "One");
		hm.put(2, "Krishna");
		hm.put(3, "London");
		hm.put(4, "07867565118");
		hm.put(5, "47");
		hm.put(6, "Total");
		hm.put(7, "Address");
		hm.put(8, "Male");
		// System.out.println(hm);
		for(Map.Entry<Integer, String> e:hm.entrySet())
		{
			System.out.println(e.getKey()+ "----------"+ e.getValue());
		}
			}
	}


