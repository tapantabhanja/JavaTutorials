package com.company;

public class Animal {
	
	private String name;
	private int brain;
	private int body;
	private int weight;
	private int size;
	
	public Animal(String name, int brain, int body, int weight, int size) {
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.weight = weight;
		this.size = size;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBrain() {
		return this.body;
	} 
	
	public int getBody() {
		return this.body;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void setName(String animalName) {
		this.name = animalName;
	}
	
	public void setBrain(int count) {
		this.brain = count;
	}
	
	public void setBody(int count) {
		this.body = count;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setSize(int value) {
		this.size = value;
	}
	
	public void eat() {
		System.out.println("Animal Eat!");
	}
	
	public void move(int speed) {
		System.out.println("Animal.move() is called");
		System.out.println("Animal moving at " + speed);
	}

}
