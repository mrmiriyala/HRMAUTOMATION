package com.test;

import org.testng.annotations.Test;

public class FruitTest {

	
	@Test(priority=3)
	public void apple()
	{
		System.out.println("Apple");
	}
	
	@Test(priority=2)
	public void orange() 
	{
		System.out.println("Orange");
	
	}
	
	@Test(priority=1)
	public void grape()
	{
		System.out.println("Grape");
	}
	
	@Test(priority=4)
	public void banana()
	{
		System.out.println("Banana");
	}
}
