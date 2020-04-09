package com.cg.lab1.annotation.prob2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.cg.lab1.annotation.prob1.Emp;


public class EmplCon {
	@Bean(name = "employee")
	public Empl empXyz() {
		Empl empl = new Empl(12345,"Harriet", 40000.0,"PES-BU",30, addXyz());
		return empl;
	}
	
	@Bean
	public Sbu addXyz() {
		Sbu add = new Sbu();
		add.setsbuId("PES-BU");
		add.setsbuName("Kiran Rao");
		add.setsbuHead("Product Engineering Services");
		return add;
}
}