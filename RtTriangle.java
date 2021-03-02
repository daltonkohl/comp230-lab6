import java.util.Scanner;

public class RtTriangle extends Shape{

	private double base;
	private double height;

	public RtTriangle(){
		super("RtTriangle");
	}

	public RtTriangle(double base, double height){
		super("RtTriangle");
		this.base = base;
		this.height = height;
	}

	//methods
	
	public double computeArea(){
		return base * height / 2;
	}

	public double computePerimeter(){
		return base + height + Math.sqrt( base * base + height * height);
	}

	public void readShapeData(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the base of the triangle");
		base = in.nextDouble();
		System.out.println("Enter the height of the triangle");
		height = in.nextDouble();
	}
	
	public String toString(){
		return super.toString() + ": base is " + base + ", height is " + height;
	}
	
	public double getBase(){
		return base;
	}
	public double getHeight(){
		return height;
	}
}

