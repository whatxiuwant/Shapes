package spkg;

public class Circle extends Shape {
	private double radius;
	
	public Circle(String name, int num, double radius) {
		super(name, num);											//must be first command;
		this.radius = radius;
	}
	
	public double getRadius() {return radius;}
	
	public double perimeter() {return 2 * Math.PI * radius;}		//must implement all abstract methods;
	public double area() {return Math.PI * radius * radius;}
}