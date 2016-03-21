/**
 * 
 * @author Sai Manjula
 */
public class Solution 
{
	/*
	 * Finds the factorial remainder.
	 */
	static int solution(int n)
	{
		int factorialRemainder = 0;
		
		if(n > 100000 || n < 0)
		{
			return factorialRemainder;
		}
		else
		{
			//Check and update factorialRemainder for all numbers from 1..n
			for(int X=1; X<=n; X++)
			{
				double remainder = (double)(factorial(X-1)%X);
				System.out.println("remainder for " + (X-1) + " is " + remainder);
				// check if factorial(X-1) gives remainder (X-1) when divided by X
				if( (factorial(X-1)%X) == (X-1))
				{
					factorialRemainder = factorialRemainder + 1;
				}
			}
		}
		
		return factorialRemainder;
	}
	
	/*
	 * To calculate factorial of a given number using recursion.
	 */
	static long factorial(int number) 
	{
		long fact = 1;
		for (int i = number; i > 1; i--)
		{
			fact = fact * i;			  
		}
		return fact;
	}
	
	public static void main(String args[])
	{
		System.out.println("Factorial Reaminder is " + solution(17));
	}
}
