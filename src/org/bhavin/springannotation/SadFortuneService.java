package org.bhavin.springannotation;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Punishment, extra 30 Km";
	}

}
