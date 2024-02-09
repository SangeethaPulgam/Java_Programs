package com.task2;

public class PrivateAccessModifier 
{
	private int a=10;
	private void displayInfo()
	{
		System.out.println("a value is "+a);
	}
	public static void main(String args[])
	{
		PrivateAccessModifier m=new PrivateAccessModifier();
		m.displayInfo();
	}
}
