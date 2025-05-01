package ibm_project.stringpool;

public class Application
{
	public static void main( String[] args )
	{
		
		
		
		 StringBuilder sb = new StringBuilder("Welcome to IBM");
	        System.out.println(sb); // prints "Welcome to IBM"

	        // modify the StringBuilder
	        sb.append("!");
	        System.out.println(sb); // prints "Welcome to IBM!"

	        // assign the StringBuilder to a new variable
	        StringBuilder sb2 = sb;
	        System.out.println(sb2); // prints "Welcome to IBM!"

	        // modify the StringBuilder through the new variable
	        sb2.append(" We are excited to have you!");
	        System.out.println(sb); // prints "Welcome to IBM! We are excited to have you!"
	        System.out.println(sb2); // prints "Welcome to IBM! We are excited to have you!"
		    
		

	}
}