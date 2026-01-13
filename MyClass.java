package Practical_02;

public class MyClass{
    
    MyClass(){
        System.out.println("Constructor:Object is created.");
    }

        protected void finalize(){
        System.out.println("Destructor:Object is destroyed.");
    }

    public static void main(String[] args){
        MyClass obj = new MyClass();

        obj = null;

        System.gc();

        System.out.println("End of main method.");
    }
}
