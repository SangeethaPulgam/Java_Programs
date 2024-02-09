package com.task2;
interface Parent5
{
	void m2();
}
interface Parent6
{
	void m3();
}
class Child6 implements Parent5, Parent6
{
	public void m2()
	{
		System.out.println("this is parent class implementation");
	}
	public void m3()
	{
		System.out.println("this is parent class2 implementation");
	}
}

public class MultipleInterface 
{
	public static void main(String args[])
	{
		Child6 c=new Child6();
		c.m2();
		c.m3();
	}
}
