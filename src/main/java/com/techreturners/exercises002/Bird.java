package com.techreturners.exercises002;

import com.techreturners.exercises005.Dance;

public abstract class Bird implements Dance {

	protected String name;
	protected String color;

	public Bird(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public abstract void speak();

	public void fly() {
		System.out.println("Hi there! I can fly.");
	}

	public void spin() {
		System.out.println(name + " spin!");
	}

	public void doTheCaterpillar() {
		System.out.println(name + " do the wriggly woo!");
	}

	public void jump() {
		System.out.println(name + " jump in the air!");
	}

	public void display() {
		System.out.println("This is bird display");
	}

}
