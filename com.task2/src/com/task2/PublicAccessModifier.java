package com.task2;

public class PublicAccessModifier // public modifier it can accessed outside of the class, package,outside the package.
{
	public int a=10;
	public void displayInfo()
	{
		System.out.println("a value is  "+a);
	}
	public static void main(String args[])
	{
		PublicAccessModifier d1=new PublicAccessModifier();
		d1.displayInfo();
	}
}
