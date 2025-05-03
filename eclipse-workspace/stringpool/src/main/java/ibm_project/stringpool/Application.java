

package ibm_project.stringpool;

public class Application {
    // Static variables
    static int counter;
    static String message;

    // Static initializer block
    static {
        System.out.println("Static initializer block is executed.");
        counter = 100; 
        message = "Welcome to IBM Project String Pool!";
    }

    // Static method
    public static void displayStaticValues() {
        System.out.println("Counter: " + counter);
        System.out.println("Message: " + message);
    }

    // Constructor
    public Application() {
        System.out.println("Constructor is executed.");
    }

    public static void main(String[] args) {
        System.out.println("Main method is executed.");

        // Access static variables and methods
        Application.displayStaticValues();

        // Create an instance of Application
        Application app = new Application();

        // Modify static variable
        counter += 10;
        System.out.println("Counter after modification: " + counter);
    }
}

