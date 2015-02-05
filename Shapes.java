package spkg;
import java.util.*;

public class Shapes {
	private ArrayList<Shape> shapes;
	
	public Shapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}
	
	public ArrayList<Shape> getShapes() {return shapes;}
	
	public void sortByArea() {									//goes desc order
		for (int i = 0; i < shapes.size() - 1; i++) {
			int min = i;
			for (int j = i + 1; j < shapes.size(); j++) {
				if (shapes.get(min).compareTo(shapes.get(j)) < 0)
					min = j;
			swap(i, min);
		}}
	}
	
	public void swap(int a, int b) {
		Shape temp = shapes.get(a);
		shapes.set(a, shapes.get(b));
		shapes.set(b, temp);
	}
	
	//sort shapes by area
	public String toString() {
		String str = "";
		for (Shape s : shapes)
			str += s.toString() + "\n";
		
		return str;
	}
}