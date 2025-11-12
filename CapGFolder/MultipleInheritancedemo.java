package OOPSCONCEPTS;
interface Father
{
	public static final float asset_value=4000000;
	void message();
}
interface Mother
{
	public static final float asset_value=2000000;
	void message();
}
class Child1 implements Father,Mother
{
	
	void asset_compute()
	{
		System.out.println("total assets of a child="+(Father.asset_value+Mother.asset_value));
	}
	public void message()
	{
		System.out.println("Father asset value="+Father.asset_value);
		System.out.println("Mother asset value="+Mother.asset_value);
	}
}
public class MultipleInheritancedemo {

	public static void main(String[] args) 
	{
			Child1 c=new Child1();
			c.asset_compute();
			c.message();
			
			Father f=new Child1();
			
			System.out.println("asset value of father="+f.asset_value);
			
			Mother m=new Child1();
			
			System.out.println("asset value of mother="+f.asset_value);
	}

}
