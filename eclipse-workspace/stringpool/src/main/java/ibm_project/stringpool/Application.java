
package ibm_project.stringpool;

interface Printer{
	
	public void print(String name);
	
}
class Process{
	public void execute(String name , Printer printer) {
		printer.print(name);
	}
}


public class Application {
	
	public static void main(String[] args) {
		Process process = new Process();
		process.execute("HP printer Printing", System.out::println);
		process.execute("canon", (name)->System.out.println(name+"printer printing..."));
		
	}
	

   
    
}
