/*
 * Abstract class:
 * 
 * concrete method: It is a method which has both method declaration
 * and method definition(method having implementation).
 * 
 * concrete class: A class which contains concrete methods is called
 * a concrete class.
 * 
 * You can create a object for this concrete class.
 * with this object,we can access all the members of that class.
 * 
 * abstract method: A method which has method declaration but without
 * method definition is called abstract method.
 * 
 * syntax: abstract returntype methodname(parameter list);
 * 
 * abstract class: A class which contains some abstract methods
 * is called abstract class.
 * 
 * syntax: abstract class classname
 *			 {
 * 			 }
 * 1. An abstract class is a combination of both abstract methods
 * and concrete method.
 * 
 * 2. An abstract class can have zero or more abstract methods.
 * 
 * 3. A class which contains no abstract methods making the class
 * as abstract is optional.
 * 
 * 4. If a class contains atleast one abstract method then the class
 * must be  declared as abstract class(mandatory).
 * 
 * 5. Abstract class can't be instantiated. we can't access the members 
 * of the class class.
 * 6. In order to access the members of abstract class, we need to
 * inherit the abstract class by overriding the members of that 
 * class.
 * abstract class abstractclassname
 * {
 * }
 * class subclass extends abstractclassname
 * {
 * }
 * 
 * ->why we don't instantiate the abstract class?
 * It is unsafe operations to invoke an abstract method with the
 * object of an abstract class.
 * 
 * -> why do we need to have abstract to a method?
 * -> why do we need to have a class as abstract though it doesnot
 * contain any abstract method?
 * 
 * Restricting HAS A relationship and enforcing the IS A Relationship
 * 
 * Subclasses of Super class called Object class
 * 
 * -> Whether the class is an abstract or concrete it can have
 * a constructor.
 * 
 * -> can we directly execute the constructor in an abstract class?
 * 
 * no, This constructor can be executed indirectly by creating an
 * object of child class/subclass.
 * 
 * -> An abstract class reference variable can refer to an object 
 * of any child class.
 * 
 * -> a class containing both abstract and final keyword?
 * no
 * -> a class containing both abstract and static keyword?
 * no
 * -> a class containing abstract,final and static?
 * no
 * -> an abstract class con contain final method.
 * But a final class cannot contain abstract method.
 * 
 */


package OOPSCONCEPTS;
abstract class Operations
{
	void message() //concrete method
	{
		System.out.println("happy coding");
	}
	abstract void compute(int x,int y); //abstract method
}
class Programmer1 extends Operations
{
	void compute(int x,int y)
	{
		System.out.println("addition of x and y="+(x+y));
	}
}
class Programmer2 extends Operations
{
	void compute(int x,int y)
	{
		System.out.println("product of x and y="+(x*y));
	}
}
class Programmer3 extends Operations
{
	void compute(int x,int y)
	{
		System.out.println("max of x and y="+(int)Math.max(x, y));
	}
}
public class Abstractclassdemo {
	

	public static void main(String[] args)
	{
		Programmer1 p1=new Programmer1();
		p1.compute(10,20);
		
		Programmer2 p2=new Programmer2();
		p2.compute(10,20);
		
		Programmer3 p3=new Programmer3();
		p3.compute(10,20);
		
	}

}
