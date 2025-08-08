package com.tns.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MathsExam {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		
		//setter injection
		Student th=con.getBean("Guru",Student.class);
		Student rv=con.getBean("Prasad",Student.class);
		
		th.showInfo();
		rv.showInfo();
		
		//Constructor injection
		Student1 sk=con.getBean("livya",Student1.class);
		Student1 hm=con.getBean("retz",Student1.class);
		
		sk.showInfo();
		hm.showInfo();
		
	}
}
