package com.task2;
class Parent1
{
	public void DisplayInfo()
	{
		System.out.println("This is parent class");
	}
}
class Child1 extends Parent1
{
	public void Info()
	{
		System.out.println("This is child class");
	}
}
class Childchild extends Child1
{
	public void getInfo()
	{
		System.out.println("this is chid chid class");
	}
}

public class MultilevelInheritance 
{
	public static void main(String args[])
	{
		Childchild c1=new Childchild();
		c1.Info();
		c1.DisplayInfo();
		c1.getInfo();
		Child1 c=new Child1();
		c.DisplayInfo();
		c.Info();
		
				
	}
}
