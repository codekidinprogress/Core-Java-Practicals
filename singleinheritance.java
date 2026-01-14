package Practical_04;

//Parent class
class Vehicle {
	void start() {
		System.out.println("Vehicle is starting...");
	}
}

//Child class
class Car extends Vehicle {
	void drive() {
		System.out.println("Car is driving smoothly.");
	}
}

public class singleinheritance {

	public static void main(String[] args) {
		
		Car myCar = new Car();//Object of child class 	      
		myCar.start();//Inherited from vehicle  		        
		myCar.drive();//From car  
	}

}


