package com.task2;
class Test
{
	final int a=10;
	void info()
	{
		System.out.println(a);
	}
	final void ShowInfo()
	{
		System.out.println("This is final method");
	}
}
class Test8 extends Test
{
	
}
public class FinalDemo 
{
	public static void main(String args[])
	{
		Test8 t=new Test8();
		t.ShowInfo();
		t.info();
	}
}
