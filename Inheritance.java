//Class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
//method of parent class by object of parent class
//method of child class by object of child class
//method of parent class by object of child class



class A{
	
	void displayA() {
		System.out.println("This is Parent class");
	}
}
	
class B extends A{
	void displayB() {
			System.out.println("This is Child class");
	}
}
	
public class Inheritance {
	public static void main(String[] args) {
		
		//calling method of parent class by object of parent class
		A ob1 = new A();
		ob1.displayA();
		
		//calling method of child class by object of child class
		B ob2 = new B();
		ob2.displayB();
		
		
		
		//calling method of parent class by object of child class
		ob2.displayA();
		
		
		
		
	}
}




Output;


This is Parent class
This is Child class
This is Parent class

