package com.orgs;

public class Selective_Statments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int a=10;
	int b=4;
	int c=2;
	{
	if ((a>b)&&(a>c))
	{
		System.out.println("A is Big");
	}
	else if ((b>a)&&(b>c))
	{
		System.out.println("B is Big");
		
	}
	else 
	{
		System.out.println("C is big");
	}
	}
}
}