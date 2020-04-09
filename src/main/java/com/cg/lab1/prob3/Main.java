package com.cg.lab1.prob3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	 public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
	      Employee e=(Employee)context.getBean("Emp");
	      ApplicationContext context1 = new ClassPathXmlApplicationContext("Beans3.xml");
	      SBu s=(SBu)context1.getBean("sbu1");	   
	      System.out.println("SBU details");
          System.out.println("--------------------");
          s.getsbuCode();
          s.getsbuHead();
          s.getsbuName();
          System.out.println("Employee details:--------------");
          e.getEmployeelist();
          e.getEmployeelist1();
	      
	   }

}
