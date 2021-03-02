import java.util.Scanner;

public class ComputeAreaAndPerimeter{

	public static void main(String[] args){
		Shape myShape;
		double perimeter;
		double area;
		myShape = getShape();
		myShape.readShapeData();
		perimeter = myShape.computePerimeter();
		area = myShape.computeArea();
		displayResult(myShape, area, perimeter);
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


