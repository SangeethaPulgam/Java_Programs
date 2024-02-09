package com.task2;
class Test7
{
	public int count=20;
}
class Test9 extends Test7
{
	void info()
	{
		System.out.println(super.count);
	}
}

public class SuperKey 
{
	public static void main(String args[])
	{
		Test9 t=new Test9();
		t.info();
		
	}
}
