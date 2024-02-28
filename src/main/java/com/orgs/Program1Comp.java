package com.orgs;

public class Program1Comp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.out.println("Hello team");
System.out.println("Good Evening");
Thread.sleep(100);
System.out.println("Java Course");
System.out.println("API Course");

try 
{
int a=34;
int b=0;
int c=a/b;
System.out.println(c);
}
catch(Exception e)
{
	System.out.println(e.getMessage());
	System.out.println(e.toString());
}
	}

}
