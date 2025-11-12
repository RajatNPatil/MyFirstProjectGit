/*
 * Runtime Polymorphism:
 * 
 * The Polymorphic nature of an entity which is decided by a JVM during 
 * runtime is called runtime polymorphism.
 * 
 * Runtime polymorphism is achieved by the concept of method overriding.
 * 
 * Method Overriding:
 * 
 * It is a process of two methods having the same signature and same
 * return type belonging to two different classes associated with
 * an IS A Relationship.
 * 
 * Usage of method overriding:
 * 
 * If the child class does not want to implement the parent class method implementation,
 * the class class method will override the parent class method
 * with its own implementation.
 * 
 * When a method is invoked, a link or bind is been established
 * between the method invocation and method definition w.r.t class
 * for which an object is created.
 * 
 * Since this is binding is taking place after the execution of 
 * the program and creation of an object, this is treated as
 * late binding.
 * 
 * It is also called as Dynamic binding.
 * 
 * Method overriding can be done even for an static methods.
 * 
 * It is treated as Method overhiding.
 * 
 * Method overriding or method overhiding : It happens between the t
 * two classes which are in a IS A Relationship.
 * 
 * 
 */
package OOPSCONCEPTS;
class Parentdemo
{
	void message()
	{
		System.out.println("Method of parent class");
	}
}
class Childdemo extends Parentdemo
{
	void message()
	{
		System.out.println("method of child class");
	}
}
public class Runtimepolymorphism 
{

	public static void main(String[] args) 
	{
		Parentdemo p=new Parentdemo();
		p.message();
		
		Childdemo c=new Childdemo();
		c.message();
		
		Parentdemo p1=new Childdemo();
		
		p1.message();
		
		// If the child class object is reference by an parent class
		// reference then it is called as upcasting.
		
		/*
		 * Advantage of upcasting:
		 * 
		 * You can access all the members of parent class as well
		 * as few members of child class.
		 * 
		 * Few Members:
		 * Child class method which is overriding the parent class
		 * method.
		 * 
		 * 
		 */
		
		         Childdemo c1=(Childdemo)new Parentdemo(); //downcasting
		         
		 /*
		  * Downcasting: It is a process of assigning the parent
		  * class object to the child class reference.
		  * 
		  *Advantage: Downcasting helps us to access all the
		  *members of parent class as well as child class.
		  *         
		  */

	}

}
