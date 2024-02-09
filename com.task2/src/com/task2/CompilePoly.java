package com.task2;


public class CompilePoly 
{
	public void calculate()
	{
		System.out.println("this method  is without any paramneter");
	}
	public void calculate(int n)
	{
		System.out.println("area of square "+(n*n));
	}
	public void calculate(int a, int b)
	{
		System.out.println("area of rectangle is "+(a*b));
	}
	public static void main(String args[])
	{
		CompilePoly c=new CompilePoly();
		c.calculate();
		c.calculate(4);
		c.calculate(7,5);
	}
}
