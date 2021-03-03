/*
 Authors:
 Bo Kulbacki 
 Dalton Kohl 

 This program is the driver class a program that computes the area and permiter of rectangles, circles and right triangles.
 All of these shapes have their own class that extends the Shape class. These classes can be found under the names Shape.java Circle.java Rectangle.java and RtTriange.java

 Last modified: 3-3-21
  */

import java.util.Scanner;

public class ComputeAreaAndPerimeter{

	public static void main(String[] args){
	boolean running = true;
	Scanner kb = new Scanner(System.in);
	while(running)
	{
		Shape myShape;
		double perimeter;
		double area;
		myShape = getShape();
		myShape.readShapeData();
		perimeter = myShape.computePerimeter();
		area = myShape.computeArea();
		displayResult(myShape, area, perimeter);
		
		System.out.print("Would you like to run the program again?(y for yes or n for no)");
		String yOrN = kb.next();

		if (yOrN.equalsIgnoreCase("y"))
		{
			running = true;
		}
		else
			{
				running=false;
			}
	}
	}

	public static Shape getShape(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter c for circle");
		System.out.println("Enter r for rectangle");
		System.out.println("Enter t for right triangle");
		String shape = in.next();
		if(shape.equalsIgnoreCase("c")){
			return new Circle();
		}
		else if(shape.equalsIgnoreCase("r")){
			return new Rectangle();
		}
		else if(shape.equalsIgnoreCase("t")){
			return new RtTriangle();
		}
		else{
			return null;
		}
	}
	
	private static void displayResult(Shape myShape, double area, double perimeter){
		System.out.println(myShape);
		System.out.printf("the area is %.2f%nThe perimeter is %.2f%n", area, perimeter);
	}
}


