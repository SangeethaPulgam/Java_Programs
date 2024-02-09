package com.task2;

public class StringsDemo 
{
	public static void main(String args[])
	{
		String name="sangeetha";
		String name1=new String("sangeetha");
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name.equals(name1));
		System.out.println(name==name1);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(6));
		System.out.println(name.length());
	}
}
