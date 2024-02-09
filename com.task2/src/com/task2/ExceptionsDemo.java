package com.task2;

public class ExceptionsDemo 
{
	public static void main(String args[])
	{
		int a=10,b=0,c;
		String s=null;
		try
		{
			c=a/b;
			System.out.println(s.length());
			
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();//we can also write ae.printStackTrace();
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}
		
		finally
		{
			System.out.println("after exception handled");
		}
		
	}
}
