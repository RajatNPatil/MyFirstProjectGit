package OOPSCONCEPTS;
final class Final1
{
	void display()
	{
		System.out.println("display method of final1 class");
	}
	final void show()
	{
		System.out.println("show method of final1 class");
	}
}
class Final2 extends Final1
{
	void display() //can't override the parent class method implementation
	{
		System.out.println("display method of final2 class");
	}
}
public class Finalmethoddemo {

	public static void main(String[] args) 
	{
		Final2 f2=new Final2();
		f2.display();
		f2.show();
	}

}
