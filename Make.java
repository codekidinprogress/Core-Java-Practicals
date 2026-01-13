package Practical_03;

//Abstract class
abstract class Animal{
  //Abstract method
  abstract void makeSound();
}

//Subclass
class Dog extends Animal{
  //Implement abstract method
  void makeSound(){
      System.out.println("Dog says: Woof!");
  }
}

//Main class
abstract class Make{
  public static void main(String[] args){
      Dog d = new Dog();
      d.makeSound();
  }
}

