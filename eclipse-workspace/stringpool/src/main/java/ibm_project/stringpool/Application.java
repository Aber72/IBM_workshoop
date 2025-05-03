
package ibm_project.stringpool;

public class Application {
  
    static int staticCounter;

    
    int instanceCounter;

   
    static {
        System.out.println("Static block executed.");
        staticCounter = 100; 
    }

    {
        System.out.println("Instance initializer block executed.");
        instanceCounter = 10; 
    }

   
    public Application() {
        System.out.println("Constructor executed.");
        instanceCounter += 5;
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
        
       
        System.out.println("Static Counter: " + staticCounter);

       
        System.out.println("\nCreating first object:");
        Application app1 = new Application();
        System.out.println("Instance Counter (app1): " + app1.instanceCounter);

      
        System.out.println("\nCreating second object:");
        Application app2 = new Application();
        System.out.println("Instance Counter (app2): " + app2.instanceCounter);

        
        staticCounter += 50;
        System.out.println("\nModified Static Counter: " + staticCounter);
    }
}
