package com.wipro.objects;

public class Box {
double l,b,h;
Box(double l,double b,double h)
{
	this.l=l;
	this.b=b;
	this.h=h;
}
void display()
{
	System.out.println(l*b*h);
}
public static void main(String[] args)
{
	Box o=new Box(2.3,3.4,5.6);
	o.display();
}
}
