package com.code.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml"); 
		
		//Retrieve bean from spring container
		Dancer dancer = context.getBean("myDancer", Dancer.class);		
		
		Dancer secondDancer = context.getBean("myDancer", Dancer.class);	
	
		//Check if they are the same bean
		boolean result = (dancer == secondDancer);
		
		System.out.println("\nPointing to the same object: "+ result);
		
		System.out.println("\nMemory location for dancer: "+ dancer);
		
		System.out.println("\\nMemory location for second dancer: "+ secondDancer +"\n");
		
		//Close context
		context.close();
	}

}
