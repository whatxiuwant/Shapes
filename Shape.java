package spkg;

public abstract class Shape {
	private String name;
	private int idNum;
	
	public Shape(String name, int num) {
		this.name = name;
		idNum = num;
	}
	
	public String getName() {return name;}
	public int getIdNum() {return idNum;}
	
	public abstract double perimeter();
	public abstract double area();
	
	public double semiperimeter() {return perimeter() / 2;}
	
	public String toString() {
		return "Name: " + name + ", Perimeter: " + perimeter() + ", Area: " + area();
	}
}