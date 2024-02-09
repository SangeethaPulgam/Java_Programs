package com.task2;

public class MultiThreading extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)//running state
		{
			System.out.println("i value is = "+i);
		}
		for(int k=0;k<=10;k++)
		{
			System.out.println("k value is = "+k);
		}
	}
	public static void main(String args[]) 
	{
		MultiThreading d=new MultiThreading();//new born state 
		d.start();//runnable state (the thread class is ready to execute)
		for(int j=0;j<=10;j++)
		{
			System.out.println("j value is "+j);//Thread.sleep(7000) used to block the statement. 
		}//dead state or terminated state..
	}
}
