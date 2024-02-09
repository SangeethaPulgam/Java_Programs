package com.task2;
class Parent
{
	public void displayInfo()
	{
		System.out.println("this is parent class");
	}
}
class Child extends Parent
{
	public void info()
	{
		System.out.println("this is child class");
	}
}
	

public class SingleInheritance 
{
	public static void main(String args[])
	{
		Child c1=new Child();	
		c1.displayInfo();
		c1.info();
		
	}
}
