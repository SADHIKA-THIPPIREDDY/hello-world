package com.example.demo;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Main{
	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beanexamp.xml");

	      Patient p = (Patient) context.getBean("patient");
	      p.getPatientid();
	      p.getPatientName();
	      p.getPatientHeight();
	      p.getPatientWeight();
	      p.calculate();
	     
	   }
	}
