package com.company;

import com.exercise.Cuboid;
import com.exercise.Rectangle;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog yorkie = new Dog("Yorkie", 10, 40, 6, 5, 6, 9, "long silk");
		yorkie.eat();
		System.out.println("-o-o-o-o-o-o-o-o-o-o-o-o-o");
		yorkie.run();
		
		System.out.println("-o-o-o-o-o-o-o-o-o-o-o-o-o");
		
		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println("rectangle.width= " + rectangle.getWidth());
		System.out.println("rectangle.length= " + rectangle.getLength());
		System.out.println("rectangle.area= " + rectangle.getArea());
		
		Cuboid cuboid = new Cuboid(5, 10, 5);
		
		System.out.println("cuboid.width= " + cuboid.getWidth());
		System.out.println("cuboid.length= " + cuboid.getLength());
		System.out.println("cuboid.area= " + cuboid.getArea());
		System.out.println("cuboid.height= " + cuboid.getHeight());
		System.out.println("cuboid.volume= " + cuboid.getVolume());
		
	}

}
