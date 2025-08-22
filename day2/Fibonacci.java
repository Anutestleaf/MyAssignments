package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {

		
		  int n = 8; //range for fibonacci

	        // Initialize the first two Fibonacci numbers
	        int first = 0;
	        int second = 1;

	        System.out.println("Fibonacci Series up to " + n + " terms:");

	        // Print the first two terms
	        if (n >= 1)
	        {
	            System.out.print(first);
	        }
	        if (n >= 2)
	        {
	            System.out.print(", " + second);
	        }

	        // Generate and print next terms
	        for (int i = 2; i < n; i++) {
	            int next = first + second;
	            System.out.print(", " + next);
	            first = second;
	            second = next;
        }
	}

}
