package OOPSCONCEPTS;

class Demo20 
{

	public static void main(String[] args) 
	{
		System.out.println("parameter is of String array");
	}
	public static void main(String args)
	{
		System.out.println("parameter is String");
	}
	public static void main(int[] a)
	{
		System.out.println("paramter is an int array");
	}
	public static void main(int a,int b)
	{
		System.out.println("two parameters of type integer");
	}
	
}
class Mainoverloading
{
	public static void main(String args[])
	{
		Demo20 mo=new Demo20();
		mo.main(new String[]{"sachin","rahul","dhoni"});
		mo.main(new int[] {10,20,30,40,50});
		mo.main("raju");
		mo.main(10,20);
		
		
		
	}
}
