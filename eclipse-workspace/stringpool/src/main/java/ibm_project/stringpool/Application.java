
package ibm_project.stringpool;

class Data {
   
    static public int value;
    
    
    public static Data value2;

    // Non-static method
    public int setValue(int newValue) {
        value = newValue; 
        return value;
    }
}

public class Application {
    int count = 100; 

    public static void main(String[] args) {
      
        Data.value = 42; 
        System.out.println("Static value (accessed via class): " + Data.value);

       
        Data.value2 = new Data();
        System.out.println("Static reference (value2) points to an object: " + Data.value2);

 
        Data.value2.setValue(99);
        System.out.println("Static value after modification: " + Data.value);

        
        Data anotherData = new Data(); 
        anotherData.setValue(123);
        System.out.println("Static value after modification via another instance: " + Data.value);

     
        System.out.println("Accessing static value via class name again: " + Data.value);
    }
}
