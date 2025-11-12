package OOPSCONCEPTS;
interface Account
{
	void deposit(float amount);
	void withdraw(float amount);
	
	float calculateInterest();
	
	float getBalance();
}
class SavingsAccount implements Account
{
	float balance;
	float interestrate;
	
	SavingsAccount(float balance,float interestrate)
	{
		this.balance=balance;
		this.interestrate=interestrate;
	}
	
	public void deposit(float amount)
	{
		balance=balance+amount;
	}
	public void withdraw(float amount)
	{
		balance=balance-amount;
	}
	
	public float getBalance()
	{
		return balance;
	}
	
	public float calculateInterest()
	{
		balance=balance+(balance*interestrate)/100;
		return balance;
	}
	
	
}
class CurrentAccount implements Account
{
	float balance;
	float overdraftlimit;
	
	CurrentAccount(float balance,float overdraftlimit)
	{
		this.balance=balance;
		this.overdraftlimit=overdraftlimit;
	}
	
	public void deposit(float amount)
	{
		balance=balance+amount;
	}
	public void withdraw(float amount)
	{
		if((balance+overdraftlimit)>amount)
			balance=balance-amount;
		else
			System.out.println("Insufficient funds");
	}
	public float getBalance()
	{
		return balance;
	}
	
	public float calculateInterest()
	{
		float interestamount;
		interestamount=(overdraftlimit*7.25f)/100;
		return interestamount;
	}
	
}
public class Bankingappwithinterface 
{

	public static void main(String[] args) 
	{
			SavingsAccount sa=new SavingsAccount(100000,8.25f);
			float finalamount=sa.calculateInterest();
			System.out.println(finalamount);
			sa.deposit(20000);
			System.out.println(sa.balance);
			sa.withdraw(5000);
			System.out.println(sa.balance);
			
			
	}

}
