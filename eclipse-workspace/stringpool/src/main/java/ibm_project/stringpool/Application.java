package ibm_project.stringpool;

public class Application
{
	public static void main( String[] args )
	{
		
		
		// Declare and initialize a 2D array of integers
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the 2D array using an enhanced for loop
        for (int[] row : numbers) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();}

		    
		

	}
}