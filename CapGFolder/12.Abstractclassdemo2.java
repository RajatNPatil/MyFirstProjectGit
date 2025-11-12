package OOPSCONCEPTS;
abstract class Shape1
{
	float dim1,dim2;
	Shape1(float dim1,float dim2)
	{
		this.dim1=dim1;
		this.dim2=dim2;
	}
	abstract float area();
}
class Rectangle1 extends Shape1
{
	Rectangle1(float length,float breadth)
	{
		super(length,breadth);
	}
	float area()
	{
		return dim1*dim2;
	}
}
class Triangle1 extends Shape1
{
	Triangle1(float base,float height)
	{
		super(base,height);
	}
	float area()
	{
		return 0.5f*dim1*dim2;
	}
}
public class Abstractclassdemo2 {

	public static void main(String[] args)
	{
			Shape1 s=new Rectangle1(2.3f,3.4f);
			float rarea=s.area();
			
			Shape1 s1=new Triangle1(3.4f,4.5f);
			float tarea=s1.area();
			
			System.out.println("area of rectangle="+rarea);
			System.out.println("area of triangle="+tarea);
	}

}
