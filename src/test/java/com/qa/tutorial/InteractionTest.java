package com.qa.tutorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InteractionTest {
	
	@Test
	public void greetingTest() {
		Interaction interaction = new Interaction();
		assertEquals("wasuh duh", interaction.greeting());
	}
	
	@Test
	public void insultTest() {
		Interaction interaction = new Interaction();
		assertEquals("is trash", interaction.insult());
	}
	
	
}
