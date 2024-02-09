package com.task2;
interface Parent3
{
	void m1();
}
class Parent2
{
	public void displayInfo()
	{
		System.out.println("this is an interface program");
	}
}
class Child2 extends Parent2 implements Parent3
{
	public void m1()
	{
		System.out.println("this is implementation in child class");
	}
}

public class MultipleInheritance1 
{
	public static void main(String args[])
	{
		Child2 c1=new Child2();
		c1.displayInfo();
		c1.m1();
	}
}
