package org.bhavin.springannotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"The journey is reward",
			"Beware of wolf",
			"Warm-up daily for keeping fit"
	};

	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick random element from array and return
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
