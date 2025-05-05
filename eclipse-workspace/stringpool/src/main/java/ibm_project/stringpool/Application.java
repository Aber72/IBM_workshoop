
package ibm_project.stringpool;

class Employee {
    private String name;
    private int id;

    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

   
    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }

        
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

       
        Employee otherEmployee = (Employee) obj;
        return this.name.equals(otherEmployee.name) && this.id == otherEmployee.id;
    }
}


public class Application {


    public static void main(String[] args) {
    	 
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Alice", 101);
        Employee emp3 = new Employee("Bob", 102);

        
        System.out.println("emp1 equals emp2: " + emp1.equals(emp2)); 
        System.out.println("emp1 equals emp3: " + emp1.equals(emp3)); 
    	
    	
        
    	 

        
       
    }
}
