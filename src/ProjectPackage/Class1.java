package ProjectPackage;

public class Class1 {

	public static void main(String[] args) {
		String original= "1221";
		String reverse= "";
		
		int len= original.length();
		
		for(int i=len-1; i>=0; i--)
		{
			
			reverse= reverse+original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("Given string "+reverse+" is palindrome");
		}
		else
		{
			System.out.println("Given string "+reverse+" is not palindrome");
		}
		
		
		

	}

	}


