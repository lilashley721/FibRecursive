
/**
 * @author ashleyworkstation
 * This is a recursive static method that returns the nth term in a 
 * Fibonacci sequence 
 * THis method uses if and an else if condition. 
 * If  n is equal to 0 then the method will return 0. 
 * Then  Else if n is eqaul to 1 then the method will return 1.
 * @param n A number in the fibonacci sequence 
 * @return The nth term in the FIbonacci sequence


 */
public class Fib{

public static int FibRecursive(int n) {
	if(n == 0) {
		
		return 0;
	}
	else if(n == 1) {
		return 1;
	}
	
	return(FibRecursive(n - 1) + FibRecursive(n - 2));
	
}

/**
 *   @author ashleyworkstation
 * In this main method Fib Recursive method was called in
 * in order to print to print the nth term. In this case 
 * 10 is passed as the nth term.
 * WHen the user runs this application it should display 
 * "The 10th term of Fibonacci sequence is 55"
 */
public static void main(String[] args) {
	 int n = 10;
	 FibRecursive(n);
	 
	 System.out.println("The 10th term of Fibonacci sequence is " +FibRecursive(n));
}

}

