package com.wipro.polymoriphism;

public class Polymorphism2 {
	public static void main(String [] args)
	{
		shape c=new Circle();
		shape t=new Triangle();
		shape s=new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
	}
}
