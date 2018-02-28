package com.gmopa.fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Germain Mopa
 *
 */
public class FibonacciMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Some fibonacci practice
		final long max_num = 8;
		List<Long> fibSeries = new ArrayList<>();
		fibSeries = getFibonacciSeries(max_num);
		
		System.out.println("Fibonacci series up to " + max_num + " is: " + fibSeries.toString());
		System.out.println("Loop to find the fibonacci number at " + max_num + " is: " + getFibonacciLoop(max_num));
		System.out.println("Recursion to find the fibonacci number at " + max_num + " is: " + getFibonacciRecursion(max_num));
	}
	
	/** Get the fibonacci serie at max_num using a loop
    *
    * @param long max_num
    * @return long fibonacci serie at max_num
    */
	private static long getFibonacciLoop(long max_num) {
		
		if(1==max_num || 2==max_num)
		{
			return 1;
		}
		long fibNum1 = 1;
		long fibNum2 = 1;
		long result = 1;
		for(int i=3; i<=max_num; i++)
		{
			result = fibNum1 + fibNum2;
			fibNum1 = fibNum2;
			fibNum2 = result;
		}
		return result;
	}
	/** Get the fibonacci serie at max_num using recursion
    *
    * @param long max_num
    * @return long fibonacci serie at max_num
    */
	private static long getFibonacciRecursion(long max_num)
	{
		if(1==max_num || 2==max_num)
		{
			return 1;
		}
		return getFibonacciRecursion(max_num-2) + getFibonacciRecursion(max_num-1);
	}

	/** Get the fibonacci serie at max_num using a loop
    *
    * @param long max_num
    * @return long fibonacci serie at max_num
    */
	private static List<Long> getFibonacciSeries(long max_num)
	{
		long sum = 0;
		List<Long> fibSeries = new ArrayList<>();
		
		if(max_num == 1 || max_num == 2)
		{
			fibSeries.add(1L);
			fibSeries.add(1L);
			return fibSeries;
		}
		fibSeries.add(1L);
		fibSeries.add(1L);
		long fibNum = 0;

		for(int i = 2; i < max_num; i++)
		{
			fibNum = (fibSeries.get(i-2) + fibSeries.get(i-1));
			fibSeries.add(fibNum);
		}
		return fibSeries;
	}
}

