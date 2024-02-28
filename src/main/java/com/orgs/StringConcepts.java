package com.orgs;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1 = "rama";
String name2 = "krishna";
String name3 = "RAVI";
String name4 = "Papa"; // P-0,a=1,p=2,a=3
String name5 = "Love";
String name6 = "Ishq";
String name7 = "radha";
String name8 = "";
String name9 = "Helo I am from United Kingdom";
System.out.println(name1.length());
System.out.println("Printing in Upper case :" +name1.toUpperCase());
System.out.println("Printing Lower case :" +name3.toLowerCase());
System.out.println(name1.equals(name5));
System.out.println(name2.equalsIgnoreCase(name4));
System.out.println(name4.charAt(2));
System.out.println(name6.concat(name2));
System.out.println(name7.hashCode());
System.out.println(name7.isEmpty());
System.out.println(name8.isEmpty());
System.out.println(name4.endsWith("ka"));
System.out.println(name7.endsWith("ha"));
System.out.println(name2.startsWith("ka"));
System.out.println(name1.replaceAll("ma", "ju"));// rama - raju
System.out.println(name5.replace("v", "l"));
System.out.println(name9.toCharArray());





	}

}
