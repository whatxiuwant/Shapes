package spkg;

public class Rectangle extends Quadrilateral {
	public Rectangle(String name, int num, double length, double width) {
		super(name, num, Math.max(length, width), Math.min(length, width), Math.max(length, width), Math.min(length, width));
	}
	
	public double area() {return side1 * side2;}
}