package com.yash.inheritance_polymorphism;

public class Labrador extends Dog {

	protected String name;
	protected String color;
	public double weight1 = 30.5;
	
	@Override
	int avgBreedWeight() {
		// TODO Auto-generated method stub
		return 0;
	}


	public Labrador(String name, String color) {
		super();
		this.name = name;
		this.color = color;
		System.out.println(name+" "+color);
	}
	
	

	
	
}
