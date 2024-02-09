package com.task1;
import java.util.*;

public class IfDemo 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		{
			if(a>=18)
			{
				System.out.println("The person is elgible to vote");
			}
			else
			{
				System.out.println("not elgibile to vote");
			}
		}
		
	}
}
