package ibm_project.stringpool;

	


public class Application
{
	public static void main( String[] args ) {
		
		// 1. Boxing (Manual Wrapping) - Converting primitive to Wrapper object
        int primitiveValue = 10; 
        Integer boxedValue = Integer.valueOf(primitiveValue); 
        System.out.println("Boxing:");
        System.out.println("Primitive value: " + primitiveValue);
        System.out.println("Boxed value (Integer object): " + boxedValue);

       
        Integer wrapperValue = new Integer(20);
        int unboxedValue = wrapperValue.intValue(); 
        System.out.println("\nUnboxing:");
        System.out.println("Wrapper value (Integer object): " + wrapperValue);
        System.out.println("Unboxed value (primitive int): " + unboxedValue);

        // 3. Autoboxing - Automatic conversion of primitive to Wrapper object
        int autoPrimitive = 30; 
        Integer autoBoxedValue = autoPrimitive; 
        System.out.println("\nAutoboxing:");
        System.out.println("Primitive value: " + autoPrimitive);
        System.out.println("Auto-boxed value (Integer object): " + autoBoxedValue);

        // 4. Auto-unboxing - Automatic conversion of Wrapper object to primitive
        Integer autoWrapperValue = 40;
        int autoUnboxedValue = autoWrapperValue; 
        System.out.println("\nAuto-unboxing:");
        System.out.println("Wrapper value (Integer object): " + autoWrapperValue);
        System.out.println("Auto-unboxed value (primitive int): " + autoUnboxedValue);

        // 5. Using Autoboxing/Auto-unboxing in operations
        Integer num1 = 50; 
        Integer num2 = 60; 
        int sum = num1 + num2; 
        System.out.println("\nUsing Autoboxing and Auto-unboxing in operations:");
        System.out.println("num1 (Integer object): " + num1);
        System.out.println("num2 (Integer object): " + num2);
        System.out.println("Sum (primitive int): " + sum);

	
	
		
	}

	
}