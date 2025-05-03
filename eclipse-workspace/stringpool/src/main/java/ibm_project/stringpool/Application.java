
package ibm_project.stringpool;

public class Application {
	
	 static int outerStaticValue = 100;
	 
	 class InnerClass {
	        
	        public void display() {
	            System.out.println("Outer Static Value: " + outerStaticValue);
	        }
	    }
	 
	 static class StaticInnerClass {
	        
	        static int innerStaticValue = 200;

	        
	        public static void displayStatic() {
	            System.out.println("Static Inner Static Value: " + innerStaticValue);
	        }

	       
	        public void display() {
	            System.out.println("Accessing Static Inner Class Static Value: " + innerStaticValue);
	        }
	    }
	 



  
    
   
    

    public static void main(String[] args) {
    	
    	
        Application outer = new Application();
        Application.InnerClass inner = outer.new InnerClass();
        inner.display();

        System.out.println("\nDemonstrating Static Inner Class:");
       
        Application.StaticInnerClass.displayStatic();

       
        Application.StaticInnerClass staticInnerInstance = new Application.StaticInnerClass();
        staticInnerInstance.display();

    	 

        
       
    }
}
