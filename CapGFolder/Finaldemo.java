/*
 * final keyword:
 * 
 * It is a keyword which can be applied to 
 * variable, method and class.
 * 
 * 1.local variable
 * 2.instance variable
 * 3.static variable
 * 
 * method: 
 * 
 * final keyword to a method does not allow to perform overriding
 * operation.
 * 
 * class:
 * 
 * a final keyword to a class will restrict the IS A relationship.
 * you can't implement inheritance concept.
 * 
 * 
 * 
 * 
 */

package OOPSCONCEPTS;

public class Finaldemo 
{
	final int x=24;
	final static int y=50;
	
	public static void main(String[] args)
	{
		Finaldemo fd=new Finaldemo();
		final int a=10;
		
		System.out.println(a);
		
		System.out.println(fd.x);
		
		//fd.x=30;
		
		System.out.println(y);
		
		//y=60;
		
		
		//a=34;
		
		System.out.println(a);
		
	}

}
