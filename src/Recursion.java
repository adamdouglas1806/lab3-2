public class Recursion {

	// Part 1: complete
	public static int sum(int n){
		
		int Tsum = 0;
		//Initialising the sum of the total positive numbers.
		
		if (n==0) {
			return 0;
		}
		//This is a if statement which will make sure that when n=0 the recursion will stop and return a value of 0 instead.
		
		Tsum = n + sum(n-1);
		//Tsum will take the value of n and add it to the value before. It does this by calling the method again which will continue to add the integer before to the sum.
		
		return Tsum;
		//Will return the total sum of all positive integers of n.
	}

	// Part 1 complete
	public static int multiply(int m, int n){
		
		int total = 0;
		//Initialising the total variable;
		
		if (n==0) {
			return 0;
		}
		//This if statement checks if n=0, if so then it will return 0 to prevent infinite recursion.
		
		if (m>0 && n>0) {
			//Checks if both inputs are positive.
			total = m + multiply(m, n-1);
			//Sets total variable to the sum of m+m n number of times.
		}else if (m>0 && n<0){
			//Checks if n is a negative number.
			total = -m + multiply(m, n+1);
			//Sets total variable to the sum of m+m n number of times whilst dealing with negative n.
		}else if (m<0 && n>0) {
			//Checks if m is a negative number.
			total = m + multiply(m, n-1);
			//Sets total variable to the sum of m+m n number of times whilst dealing with negative m.
		}else {
			//Any other condition (the only other condition should be two negative inputs (negative m and negative n).
			total = -m + multiply(m, n+1);
			//Sets total variable to the sum of m+m n number of times whilst dealing with two negative inputs.
		}
		
		return total;
		//Will return a single integer which is the other two inputs multiplied.
	}
	
	// Part 1: complete
	public static int Fibonacci(int n){
		
		int total = 0;
		//Initialising the total variable;
		
		if (n==0) {
			return 0;
		}else if (n==1) {
			return 1;
		}
		//The if statement will check if the n value is 0 or 1. If it is then it will return a 0 or 1. This is prevent infinite recursion.
		
		total = Fibonacci(n-1) + Fibonacci(n-2);
		/*
		 * The line of code is calling the Fibonacci method twice with the value before n and the value two before n. They will add together to give the current
		 * integer in the fibonacci sequence.
		 */
		
		return total;
		//Will return the current integer in the fibonacci sequence.
	}


}