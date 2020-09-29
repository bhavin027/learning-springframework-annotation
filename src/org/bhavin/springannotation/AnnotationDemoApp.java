package org.bhavin.springannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicatonContext.xml");
		//get the bean from spring container
		Coach theCoach = context.getBean("thatTennisCoach", Coach.class);
		//call a method
		System.out.println(theCoach.getDailyWorkout());
		//close context
		context.close();
	}

}