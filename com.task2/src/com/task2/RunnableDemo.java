package com.task2;
import java.lang.*;

public class RunnableDemo implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("i value is = "+i);
		}
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String args[])
	{
		RunnableDemo r=new RunnableDemo();
		Thread t1=new Thread(r);
		t1.start();
		//if we create one more thread we get illegal thread exception
		for(int j=0;j<=10;j++)
		{
			System.out.println("j value is ="+j);
		}
		System.out.println(Thread.currentThread().getPriority());
			
	}
}


