package ibm_project.stringpool;

public class Application
{
	public static void main( String[] args )
	{
		
		
		
		 String s = "Welcome to IBM";
	        System.out.println(s); // prints "Welcome to IBM"

	        // try to modify the String
	        s = s + "!";
	        System.out.println(s); // prints "Welcome to IBM!"

	        // assign the String to a new variable
	        String s2 = s;
	        System.out.println(s2); // prints "Welcome to IBM!"

	        // try to modify the String through the new variable
	        s2 = s2 + " We are excited to have you!";
	        System.out.println(s); // still prints "Welcome to IBM!"
	        System.out.println(s2); // prints "Welcome to IBM! We are excited to have you!"
		    
		

	}
}