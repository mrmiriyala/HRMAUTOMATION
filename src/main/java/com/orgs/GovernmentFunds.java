package com.orgs;

public class GovernmentFunds extends Government
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GovernmentFunds gov=new GovernmentFunds();
		gov.freeFood();
		gov.bloodBank();
		gov.freeTwoWheelers();
		
		
	}
public void EducationFunds()
{
	System.out.println("Education funds depends on the financial Year");
}
public void medicalFund()
{
 System.out.println("Medical");
}

public void bloodBank() 
{
	System.out.println("Education is less amount");
	
}

public void freeFood() 
{
	
	System.out.println(" Less Food");
}

public void freeTwoWheelers() 
{
	System.out.println("Less two Wheeler");
	
}

}
