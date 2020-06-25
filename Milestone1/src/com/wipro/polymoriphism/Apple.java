package com.wipro.polymoriphism;

public class Apple extends Fruit{
	Apple(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println(name+" "+taste);
	}
}