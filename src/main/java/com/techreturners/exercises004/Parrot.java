package com.techreturners.exercises004;

import com.techreturners.exercises002.Bird;

public class Parrot extends Bird {

	public Parrot(String name, String color) {
		super(name, color);
	}

	@Override
	public void speak() {
		System.out.println("Yo! I'm " + name + " and I'm a " + color + " penguin");
	}

	@Override
	public void fly() {
		System.out.println("Hi there! I can fly. Squawk Squawk");

	}

}
