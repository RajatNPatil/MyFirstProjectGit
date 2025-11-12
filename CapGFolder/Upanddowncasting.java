//Upcasting and downcasting
package OOPSCONCEPTS;
class Parent25
{
	void show()
	{
		System.out.println("show method of parent class");
	}
	void display()
	{
		System.out.println("display method of parent class");
	}
}
class Child25 extends Parent25
{
	void show()
	{
		System.out.println("show method of child class");
	}
	void print()
	{
		System.out.println("print method of child class");
	}
}
public class Upanddowncasting {

	public static void main(String[] args) 
	{
			/*Parent25 p=new Parent25();
			p.show();
			p.display(); */
		
			 /* Child25 c=new Child25();
			  c.show();
			  c.print(); */
		
			/*Parent25 p=new Child25();
			
			p.show();
			p.display();
			p.show(); */
		
			//Child25 c=(Child25)new Parent25();
			
			Parent25 p=new Child25();
			Child25 c=(Child25)p;
			
			p.show();
			p.display();
			c.show();
			c.print();
			
		
			
	}

}
