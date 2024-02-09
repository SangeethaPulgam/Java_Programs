package com.task2;
class InvalidVoterAgeValidation extends Throwable
{
	InvalidVoterAgeValidation()
	{
		System.out.println("please check your age. u are underage");
	}
}

public class ThrowExample 
{
	public static void main(String args[]) throws InvalidVoterAgeValidation
	{
		int age=17;
		if(age<=18)
		{
			throw new InvalidVoterAgeValidation();
		}
		else
		{
			System.out.println("eligible for voting");
		}
	}
}
