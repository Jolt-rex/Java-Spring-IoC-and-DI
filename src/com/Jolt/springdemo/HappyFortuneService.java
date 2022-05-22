package com.Jolt.springdemo;

import java.util.ArrayList;

public class HappyFortuneService implements FortuneService {

	private ArrayList<String> fortunes = new ArrayList<String>();	
	
	public HappyFortuneService() {
		fortunes.add("You will find a Kevin");
		fortunes.add("Hannah will hunt you down");
		fortunes.add("You will feed Jolt");
	}
	
	@Override
	public String getFortune() {
		return fortunes.get((int)(Math.random() * fortunes.size()));
	}

}
