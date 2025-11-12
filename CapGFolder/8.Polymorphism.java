/* 
 * Polymorphism:
 * An entity exhibiting many forms/behaviors is called polymorphism.
 * 
 * Advantage: Flexibility.
 * -> user has a provision to choose one particular method to perform
 * multiple operations which respect to his requirement.
 * 
 * Types of Polymorphism:
 * 1.Compile Time Polymorphism(Method Overloading)
 * 2.Run time polymorphism(Method overriding)
 * 
 * Compile Time Polymorphism:
 * 
 * Definition: The polymorphic nature of an entity which is decided
 * by a compiler during the compile time is called compile time
 * polymorphism.
 * 
 * This compile time polymorphism is achieved by method overloading.
 * 
 * Method overloading:
 * 
 * It is process of having multiple methods with different signature
 * and with same method name is called method overloading.
 * 
 * Method Signature:
 * 4 parts:
 * 1. Method name
 * 2. Number of parameters.
 * 3. type of parameters
 * 4. order of parameters.
 * 
 * Method signature is not confined with return type and parameter name
 * 
 * No two methods in a class can have same method signature.
 * 
 * When method is called, the compiler is going link or binding the method
 * invocation with method definition w.r.t matching of method signature.
 * 
 * Static binding.
 * 
 * In method invocation, binding is happening before the execution of the
 * program. This is treated as early binding.
 * 
 * 
 * 
 * 
 */

package OOPSCONCEPTS;

public class Polymorphism 
{
	public void add(int a)
	{
		System.out.println("value of a="+a);
	}
	public void add(int a,int b)
	{
		System.out.println("Sum of a and b="+(a+b));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("sum of a,b and c="+(a+b+c));
	}
	
	public static void main(String args[])
	{
		Polymorphism p=new Polymorphism();
		p.add(10);
		p.add(10,20);
		p.add(10,20,30);
		
		
	}
}
