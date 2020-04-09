package com.cg.lab1.prob1;

public class Employeedetails implements Employe{
	private int Employee_Id;
	private String Employee_Name;
	private double Employee_Salary;
	private int Employee_Age;
	private String Employee_BU;
	
	public void getEmployee_Id() {
		System.out.println("Employee Id : "+Employee_Id);
	}
	public void setEmployee_Id(int Employee_Id) {
		this.Employee_Id=Employee_Id;
	}
	public void getEmployee_Name() {
		System.out.println("Employee Name : " +Employee_Name);
	}
	public void setEmployee_Name(String Employee_Name) {
		this.Employee_Name=Employee_Name;
	}
	public void getEmployee_Salary() {
		// TODO Auto-generated method stub
		System.out.println("Employee Salary : "+Employee_Salary);
		
	}
	public void setEmployee_Salary(double Employee_Salary) {
		// TODO Auto-generated method stub
		this.Employee_Salary=Employee_Salary;
		
	}
	public void getEmployee_BU() {
		// TODO Auto-generated method stub
		System.out.println("Employee BU : "+Employee_BU);
		
	}
	public void setEmployee_BU(String Employee_BU) {
		// TODO Auto-generated method stub
		this.Employee_BU=Employee_BU;
		
	}
	public void getEmployee_Age() {
		// TODO Auto-generated method stub
		System.out.println("Employee Age : "+Employee_Age);
		
	}
	public void setEmployee_Age(int Employee_Age) {
		// TODO Auto-generated method stub
		this.Employee_Age=Employee_Age;
	}
}
