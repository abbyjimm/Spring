package com.code.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring contain
		Dancer dancer = context.getBean("myDancer", Dancer.class);		
		
		//call methods on the bean
		System.out.println(dancer.getTrainingSchedule());
		
		//Call method of Costume
		System.out.println(dancer.getCostumeDance());
		
		//close the context
		context.close();

	}

}
