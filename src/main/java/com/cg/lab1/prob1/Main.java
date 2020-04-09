package com.cg.lab1.prob1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args)
  {
	  ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
	  Employe objA= (Employe) context.getBean("Employee12");
	  System.out.println("Employee details");
	  System.out.println("-------------------");
	  objA.getEmployee_Id();
	  objA.getEmployee_Name();
	  objA.getEmployee_Salary();
	  objA.getEmployee_BU();
	  objA.getEmployee_Age();
	  
  }

}