/* Decomposition and Psuedo code
 * print the sequence of numbers accordin to fib pattern start at 0 and 1 
 * add the values then of prev. and current while the sum is < 10000
 * use a temp variable to hold the sum and swap the value of first and second value 
 * along with the temp  
 */


import acm.program.*;
//import acm.graphics.*;

public class Fibonacci extends ConsoleProgram {
// constant sytax so it can not be changed
private static final int  MAX_TERM_VALUE = 10000;

	public void run() {
//		add(new GLabel( calculate(); , 100, 75)) ;	
//		println(calculate);
		calculateFibSequence();
	}
	
	private void calculateFibSequence() {
		int fibNum1 = 0;
		int fibNum2 = 1;
//		int nextFibNum = fibNum1 + fibNum2;
//		println(fibNum1);
//		println(fibNum2);
		while(fibNum1 < MAX_TERM_VALUE) {
//at first printing nextFibNum seemed correct but after the temp swap and after testing variable correct Print is 1
//			println(nextFibNum);
			println(fibNum1);
//			println(fibNum2);
/*Swap two variables with a temp variable in order to move to next value
  Example from https://www.w3schools.in/java-program/swapping-two-numbers-using-a-temporary-variable/
  not exactly what I needed as I needed the temp to first be the sum of the two values 
  int temp = x;
  x = y;
  y = temp;
*/
			int nextFibNum = fibNum1 + fibNum2;
			fibNum1 = fibNum2;
			fibNum2 = nextFibNum;
		}
		
	}
}
