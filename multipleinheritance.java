package Practical_06;

//First interface
interface Shape {
	void draw();
}

//Second interface
interface Color {
	void fill();
}
	
//Class implementing both interfaces
class Circle implements Shape, Color {
	public void draw() {
		System.out.println("Drawing a circle.");
	}	
	public void fill() {
		 System.out.println("Filling the circle with red color.");
	}
}

//Main Class
public class multipleinheritance {
	public static void main(String[] args) {
	     Circle c = new Circle();
	     c.draw();
	     c.fill();
	}
}

