package com.qa.tutorial;

public class Runner {

	public static void main(String[] args) { // static means it is not part of a single instance
		Interaction potatoes = new Interaction();			// this calls an instance of Runner

		System.out.println(potatoes.greeting()+" "+potatoes.insult());
	}

	
}


