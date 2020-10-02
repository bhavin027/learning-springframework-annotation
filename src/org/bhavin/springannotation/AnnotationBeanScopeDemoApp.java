package org.bhavin.springannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicatonContext.xml");
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//check if objects same
		
		boolean result = (theCoach==alphaCoach);
		
		System.out.println("\nPointing the same object: "+result);
		System.out.println("\nMemory Location of theCoach: "+ theCoach);
		System.out.println("\nMemory Location of alphaCoach: "+ alphaCoach);
		
		//close context
		context.close();
	}

}
