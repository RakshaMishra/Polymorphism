package com.kodnest.polymorphism;

 class Shape {
	void draw()
	{
		System.out.println("Drawing shape");
	}

}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing rectangle");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing circle");
	}
}
class Demoshape
{
	public static void main(String[] args) {
		Shape shape=new Shape();
		shape.draw();
		//Rectangle rec=new Rectangle();
	//	rec.draw();
		//Circle c=new Circle();
		//c.draw();
		shape=new Rectangle();
		shape=new Circle();
		shape.draw();
		
		shape.draw();
		
	}
}