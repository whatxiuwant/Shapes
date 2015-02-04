package spkg;

public abstract class Quadrilateral extends Shape{
	protected double side1, side2, side3, side4;		//outside the project doesn't have access, children do;
	
	public Quadrilateral(String name, int num, double side1, double side2, double side3, double side4) {
		super(name, num);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
	}

	public double getSide1() {return side1;}
	public double getSide2() {return side2;}
	public double getSide3() {return side3;}
	public double getSide4() {return side4;}

	public double perimeter() {return side1 + side2 + side3 + side4;}
}