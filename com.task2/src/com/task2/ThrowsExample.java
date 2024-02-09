package com.task2;
import java.util.*;
class LoginCredentials extends Throwable
{
	LoginCredentials()
	{
		System.out.println("please check your username and password");
	}
}

public class ThrowsExample 
{
	public static void main(String args[]) throws LoginCredentials
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		String username=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		
		
		if(username.equals("admin")&& password.equals("admin"))
		{
			System.out.println("login is success");
		}
		else
		{
			throw new LoginCredentials();
		}
	}
}
