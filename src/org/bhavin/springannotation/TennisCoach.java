package org.bhavin.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//set default constructor
	public TennisCoach() {
		System.out.println(">>Inside default constructor");
	}
	
	//create setter method
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println(">>Inside setFortuneService method"); this.fortuneService
	 * = fortuneService; }
	 */
	// create constructor
	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * this.fortuneService = theFortuneService; }
	 */
	
	@Override
	public String getDailyWorkout() {
		return "Practice ralley for 20 min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
