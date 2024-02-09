package com.task2;
class Test1
{
	void m1()
	{
		System.out.println("this is method overriding");
	}
}
class Test2 extends Test1
{
	void m1()
	{
		System.out.println("this is second method ");
	}
}

public class RuntimePoly 
{
	public static void main (String args[])
	{
		Test1 t=new Test2();
		t.m1();
	}
}
