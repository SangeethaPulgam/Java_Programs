package com.task2;

public class ProtectedAccessModifier
{
	protected int i=10;
	protected void info()
	{
		System.out.println("print a value "+i);
		
	}
	public static void main(String args[])
	{
		ProtectedAccessModifier m=new ProtectedAccessModifier();
		m.info();
	}
}
