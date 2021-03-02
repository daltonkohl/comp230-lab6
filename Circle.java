import java.util.Scanner;
import java.lang.Math.*;

public class Circle extends Shape{
	
	private double radius = 0;

	public Circle(){
		super("Circle");
	}
	public Circle(double radius){
		super("Circle");
		this.radius = radius;
	}

	//methods
	
	public double computeArea(){
		return Math.pow(radius , 2) * Math.PI;
	}
	public double computePerimeter(){
		return 2 * radius * Math.PI;
	}
	public void readShapeData(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		radius = in.nextDouble();
	}
	public String toString(){
		return super.toString() + ": radius is " + radius;
	}
	public double getRadius(){
		return radius;
	}
}

