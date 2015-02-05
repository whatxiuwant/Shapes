package spkg;
import java.util.*;

public class Triangle extends Shape {
	private double side1, side2, side3;
	
	public Triangle(String name, int num, double side1, double side2, double side3) {
		super(name, num);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {return side1;}
	public double getSide2() {return side2;}
	public double getSide3() {return side3;}
	
	public double perimeter() {return side1 + side2 + side3;}
	public double area() {return Math.sqrt(semiperimeter() * (semiperimeter() - side1) * (semiperimeter() - side2) * (semiperimeter() - side3));}

	public boolean isRight() {
		double[] sides = {side1, side2, side3};
		Arrays.sort(sides);
		
		return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
	}
	
	public boolean isIsosceles() {return (side1 == side2 || side1 == side3 || side2 == side3) && !isEquilateral();}
	public boolean isEquilateral() {return side1 == side2 && side2 == side3;}
	public boolean isRightIsosceles() {return isRight() && isIsosceles();}
}