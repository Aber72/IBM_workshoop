package ibm_project.stringpool;

	


public class Application
{
	public static void main( String[] args ) {
	
	
		
        int intValue = 42;
        double doubleValue = intValue;
        System.out.println("Widening Casting:");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);

        
        double originalDouble = 42.99;
        int narrowedInt = (int) originalDouble; 
        System.out.println("\nNarrowing Casting:");
        System.out.println("Original double value: " + originalDouble);
        System.out.println("Narrowed int value: " + narrowedInt);

       
        System.out.println("\n=== Reference Typecasting ===");

      
        Animal animal = new Dog(); 
        animal.makeSound();

      
        if (animal instanceof Dog) { 
            Dog dog = (Dog) animal; 
            dog.bark(); 
        }

       
        System.out.println("\nInvalid Downcasting Example:");
        Animal genericAnimal = new Animal();
        if (genericAnimal instanceof Dog) {
            Dog wrongDog = (Dog) genericAnimal; 
            wrongDog.bark();
        } else {
            System.out.println("Downcasting failed: genericAnimal is not a Dog.");
        }
    }
}


class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog says: Woof!");
    }

    public void bark() {
        System.out.println("The dog barks!");
    }

	
}