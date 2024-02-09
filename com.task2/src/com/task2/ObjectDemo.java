package com.task2;

public class ObjectDemo 
{
	 private int empId;
	  private String empName;
	 private int empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public static void main(String args[])
	{
		ObjectDemo e1=new ObjectDemo();
		e1.setEmpId(100);
		e1.setEmpName("Sangeetha");
		e1.setEmpSalary(50000);
		System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getEmpSalary());
	}
}
