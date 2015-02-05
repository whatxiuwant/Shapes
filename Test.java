package spkg;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		Shape circle = new Circle("C1", 5, 5);
		System.out.println(circle);
		Shape rectangle = new Rectangle("R1", 6, 4, 2);
		System.out.println(rectangle);
		Shape triangle = new Triangle("T1", 4, 4, 5, 3);
		System.out.println(triangle);
		
		boolean isRight = ((Triangle) triangle).isRight();		//downcasting
		System.out.println(isRight);
		
		ArrayList<Shape> shapesArray = new ArrayList<Shape>();
		shapesArray.add(circle);
		shapesArray.add(rectangle);
		shapesArray.add(triangle);
		Shapes shapes = new Shapes(shapesArray);
		shapes.sortByArea();
		System.out.println(shapes);
	}
}