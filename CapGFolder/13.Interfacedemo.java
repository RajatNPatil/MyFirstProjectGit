/*
 * Interface:
 * 
 * 1. It is one which contains only abstract methods.
 * 2. We can achieve 100% of abstraction by means of interface.
 * 
 * Syntax: interface interface_name
 * 			{
 * 				variables;
 * 				abstract methods;
 * 			}
 * 3. Variables inside the interface are by default public static final.
 * 4. methods inside the interface are by default public and abstract.
 * 5. All the variables inside the interface are need to be
 * initialized.
 * 6. Variables declared as static can be accessed outside the interface
 * by means of Interface name.
 * 7. You cannot instantiate an interface.
 * 8. Methods of the interface are implemented in an implementation 
 * class by means of a keyword called implements.
 * 
 * Syntax: interface interface_name
 * 			{
 * 				abstract abstract_methods;
 * 			}
 * 			class implementing_class implements interface_name
 * 			{
 * 			}
 * Implementation class must implement all the abstract methods of
 * interface.
 * 
 * If the class is not implementing atleast one of the abstract method
 * of an interface then that must be declared as abstract class.
 * 
 * Interface reference variable can refer to the object of implementing 
 * class.
 * 
 * An interface can be implemented by multiple implementation classes.
 * An interface can extend any number of interfaces.
 * A class can extend only one class.
 * A class extends one class but it can implements multiple interfaces
 * at a time.
 * 
 * 	  Syntax: class extends another_class implements interface1,interface2
 * 
 * In java multiple inheritance is not supported. But it can be
 * implemented by means of interface.
 * 
 */
package OOPSCONCEPTS;
interface Animal
{
	void makeSound(); //abstract method
}
class Cat implements Animal
{
	public void makeSound()
	{
		System.out.println("MEOW MEOW");
	}
}
class Dog implements Animal
{
	public void makeSound()
	{
		System.out.println("BOW BOW");
	}
}
class Birds implements Animal
{
	public void makeSound()
	{
		System.out.println("Chispering");
	}
}
public class Interfacedemo {

	public static void main(String[] args) 
	{
			Animal a=new Cat();
			a.makeSound();
			
			Animal a1=new Dog();
			a1.makeSound();
			
			Animal a2=new Birds();
			a2.makeSound();
	}

}
