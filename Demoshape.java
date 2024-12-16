 package thirdsemjavalab;


class circle implements Shape {
	 public void draw() {
		 System.out.println("circle.draw()...");
	 }
	 public void erase()
	 {
		 System.out.println("circle.erase()...");
	 }
 }
 class triangle implements Shape {
	 public void draw()
	 {
		 System.out.println("triangle.draw()...");
	 }
	 public void erase()
	 {
		 System.out.println("triangle.erase()...");
	 }
 }
	 class square implements Shape {
		 public void draw()
		 {
			 System.out.println("square.draw()...");
		 }
		 public void erase()
		 {
			 System.out.println("square.erase()...");
		 }
		 }
	 interface Shape {
		 public void draw();
		 public void erase();
	 }
	 public class Demoshape {
		 public static void main(String[] args) {
			 Shape shape;
			 shape = new circle();
			 shape.draw();
			 shape.erase();
			 
			 shape = new triangle();
			 shape.draw();
			 shape.erase();
			 
			 shape = new square();
			 shape.draw();
			 shape.erase();
		 }
	 }
			 
		