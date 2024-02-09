package com.task1;
import java.util.*;

public class ComparisonDemo 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value ");
		int a=sc.nextInt();
		System.out.println("enter b value ");
		int b=sc.nextInt();
		System.out.println("enter c value ");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("greatest number is "+a);
		
		}
		if (b>a && b>c)
		{
			System.out.println("greatest number is "+b);
		}
		else
		{
			System.out.println("greatest number is "+c);
		}
		
	}
}
