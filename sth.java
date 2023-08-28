// Java Program to Illustrate
// that an instance of Abstract
// Class can not be created

// Class 1
// Abstract class
abstract class Base {
	abstract void fun();
}

// Class 2
class Derived extends Base {
	void fun()
	{
		System.out.println("Derived fun() called");
	}
}

// Class 3
// Main class
public class sth {

	// Main driver method
	public static void main(String args[])
	{

		// Uncommenting the following line will cause
		// compiler error as the line tries to create an
		// instance of abstract class. Base b = new Base();

		// We can have references of Base type.
		Derived b = new Derived();
		b.fun();
	}
}
