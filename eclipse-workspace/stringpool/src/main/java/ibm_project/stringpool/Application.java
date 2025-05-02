package ibm_project.stringpool;

public class Application
{
	public static void main( String[] args )
	{
		
		System.out.println("start");
		
		
		
		try {
			String st = args[0];
			String st1 = args[1];
			try {
				System.out.println(Integer.parseInt(st)/Integer.parseInt(st1));
			}
			
			catch(NumberFormatException ex) {
				System.out.println("nested catch");
				
			}
			finally {
				System.out.println("its finally block");
			}
			System.out.println("end of inner try");
			
		}
		catch(ArrayIndexOutOfBoundsException  |NumberFormatException ex){
			System.out.println("make sure u r providing correct numbers");
			
		}
		catch(ArithmeticException ex) {
			System.out.println("number cannot divide by zero");
		}
		
		catch(Exception ex){
			System.out.println("unknown error");
			ex.printStackTrace();
			
		}
	

		    
		

	}
}