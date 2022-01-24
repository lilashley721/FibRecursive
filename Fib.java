
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
public static void main(String[] args) {
	 int n = 10;
	 FibRecursive(n);
	 
	 System.out.println("The 10th term of Fibonacci sequence is " +FibRecursive(n));
}

}

