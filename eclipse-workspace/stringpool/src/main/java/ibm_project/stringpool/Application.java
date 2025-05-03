
package ibm_project.stringpool;

public class Application {
  
    
   
    

    public static void main(String[] args) {
    	
    	 try {
             
             ClassLoader customClassLoader = ClassLoader.getSystemClassLoader();

             
             Class<?> loadedClass = customClassLoader.loadClass("ibm_project.stringpool.Application");
             
            
             System.out.println("Class loaded explicitly using custom ClassLoader: " + loadedClass.getName());
         } catch (ClassNotFoundException e) {
             System.out.println("Class not found: " + e.getMessage());
         }

        
       
    }
}
