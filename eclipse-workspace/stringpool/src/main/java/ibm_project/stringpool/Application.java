package ibm_project.stringpool;
class IllegalAgeException extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "your age is not 18";
	}
	}
	
class ElectionVoting{
	public void register(int age)throws IllegalAgeException{
		if(age<18) {
			throw new IllegalAgeException();
		}
	}
}

public class Application
{
	public static void main( String[] args )
	{
		ElectionVoting electionVoting = new ElectionVoting();
		
		try {
			electionVoting.register(17);
			
		}
		catch(IllegalAgeException ex) {
			ex.printStackTrace();
			
		}
		System.out.println("end");
	
		    
		

	}
}