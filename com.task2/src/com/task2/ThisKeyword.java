package com.task2;
class Student
{
	int stdId;
	String stdName;
	int Salary;
	Student(int stdId, String stdName, int Salary)
	{
		this.stdId=stdId;
		this.stdName=stdName;
		this.Salary=Salary;
	}

public void resultinfo()
{
	System.out.println(stdId+" "+stdName+" "+Salary);
}
}
public class ThisKeyword
{
	public static void main(String args[])
	{
		Student s=new Student(101,"sangeetha",50000);
		s.resultinfo();
		
	}
}
