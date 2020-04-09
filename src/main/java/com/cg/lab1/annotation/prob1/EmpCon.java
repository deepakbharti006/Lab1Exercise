package com.cg.lab1.annotation.prob1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class EmpCon {
	@Bean(name = "employee")
	public Emp empXyz() {
		Emp emp = new Emp(12345,"Harriet", 40000.0,"PES-BU",30);
		return emp;
	}
}
