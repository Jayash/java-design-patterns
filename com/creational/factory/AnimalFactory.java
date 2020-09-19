package com.creational.factory;

public class AnimalFactory {
	
	public static Animal getAnimal(String type) {
		
		switch(type) {
		
			case "cat" : return new Cat();
						
			case "dog" : return new Dog();
			
			default : throw new IllegalArgumentException("animalType not supported");
		}
		
	}
}
