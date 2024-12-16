package thirdsemjavalab1;
import java.util.Scanner;
abstract class Shape{
	public abstract float calculatePerimeter();
	public abstract float calculateArea();
}
class Circle extends Shape{
	private int radius;
	public Circle (int radius) {
		this.radius=radius;
	}
			public float calculatePerimeter() {
				return (float)(2*Math.PI*radius);
			}
			public float calculateArea()
			{
				return (float)(Math.PI*radius*radius);
			}}
		class Triangle extends Shape {
			private int a;
			private int b;
			private int c;
			public Triangle(int a, int b, int c) {
				this.a=a;
				this.b=b;
				this.c=c;
			}
			
			public float calculatePerimeter() {
				return (float)(a+b+c);
			}
			public float calculateArea() {
				float s=((float)a+b+c)/2.0f;
				float area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
				return area;
			}
		}
public class ShapeDemo {
public static void main(String[] args) {
	int option=0;
	int radius;
	int a;
	int b;
	int c;
	float perimeter;
	float area;
	Scanner scanner=new Scanner(System.in);
	System.out.println("1.circle");
	System.out.println("2.triangle");
	System.out.println("enter your option");
	option = scanner.nextInt();
	Shape shape;
	switch(option)  
	{
	case 1:
		System.out.println("enter radius:");
		radius=scanner.nextInt();
		shape=new Circle(radius);
		perimeter=shape.calculatePerimeter();
		area=shape.calculateArea();
		System.out.println("perimeter:"+perimeter);
		System.out.println("Area:"+area);
		break;
		
	case 2:
		System.out.println("enter 3 sides of triangle:");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
	shape = new Triangle(a,b,c);
	perimeter=shape.calculatePerimeter();
	area=shape.calculateArea();
	System.out.println("perimeter:"+perimeter);
	System.out.println("Area:"+area);
	break;
	}
}
}


