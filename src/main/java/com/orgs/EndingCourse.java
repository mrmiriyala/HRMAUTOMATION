package com.orgs;

import java.util.ArrayList;
import java.util.List;

public class EndingCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li=new ArrayList<String>();
		li.add("rama");
		li.add("krishna");
		li.add("Ravi");
		li.add("gopi");
		li.add("hari");
		System.out.println(li);
		li.add("Ravi");
		li.add("rama");
		System.out.println(li);
		System.out.println(li.get(4));
		
		/*Iterator<String> it=li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		for (int i=0;i<=li.size();i++)
		{
			System.out.println(li.get(i)+ " ");
		}
		
		
				
		
	}

}
