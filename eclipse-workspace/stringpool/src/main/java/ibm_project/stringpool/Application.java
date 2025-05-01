package ibm_project.stringpool;

public class Application
{
	public static void main( String[] args )
	{
		
		
		        // Create two string objects with the same value
		        String s1 = "Welcome-IBM";
		        String s2 = "Welcome-IBM";

		        // Check if s1 and s2 are the same object
		        System.out.println("s1 == s2: " + (s1 == s2));

		        // Create a new string object with the same value
		        String s3 = new String("Welcome-IBM");

		        // Check if s1 and s3 are the same object
		        System.out.println("s1 == s3: " + (s1 == s3));

		        // Create two string objects with different values
		        String s4 = "Welcome";
		        String s5 = "IBM";

		        // Check if s4 and s5 are the same object
		        System.out.println("s4 == s5: " + (s4 == s5));

		        // Create a new string object with the same value as s4
		        String s6 = "Welcome";

		        // Check if s4 and s6 are the same object
		        System.out.println("s4 == s6: " + (s4 == s6));
		    
		

	}
}