package com.techreturners.exercises003;

import com.techreturners.exercises002.Bird;

public class Pigeon extends Bird {

	// all classes can access me
	public String publicName = "public";

	public Pigeon(String name, String color) {
		super(name, color);
	}

	public void eatPizza() {
		System.out.println("Delicious pizza!");
	}

	public void sleep() {
		System.out.println("I'm a sleeping pigeon");
	}

	@Override
	public void speak() {
		System.out.println("Yo! I'm " + name + " and I'm a " + color + " pigeon.");
	}

	public void aboutMyself(String mySound) {
		System.out.println("I am a " + name + " and my sound is " + mySound + " !");
	}

	// Method overloading "aboutMyself" method
	public void aboutMyself(String mySound, int legs) {
		System.out.println("I am a " + name + " and my sound is " + mySound + "! and I have " + legs);
	}

}
