package com.techreturners.exercises004;

import com.techreturners.exercises002.Bird;

public class Penguin extends Bird {

	public Penguin(String name, String color) {
		super(name, color);
	}

	@Override
	public void speak() {
		System.out.println("Yo! I'm " + name + " and I'm a " + color + " penguin.");
	}

	@Override
	public void fly() {
		System.out.println("Whoops, I can't fly. Waddle waddle.");
	}

	public void display() {
		System.out.println("This is Penguin display");
	}

	/**
	 * Here shows how to call parent method
	 */
	public void parentChildDislpay() {
		display();
		super.display();
	}
	
}
