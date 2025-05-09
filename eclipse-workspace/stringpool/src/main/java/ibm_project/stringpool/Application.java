
package ibm_project.stringpool;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");

        // Print the list
        System.out.println("String List: " + stringList);

        // Create a list of integers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        // Print the list
        System.out.println("Integer List: " + integerList);

        // Create a list of objects
        List<Object> objectList = new ArrayList<>();
        objectList.add("Apple");
        objectList.add(1);
        objectList.add(true);

        // Print the list
        System.out.println("Object List: " + objectList);
    }
}
