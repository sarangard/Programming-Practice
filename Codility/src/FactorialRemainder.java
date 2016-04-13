import java.math.BigInteger;

/**
 * 
 * @author Sarang
 */
public class FactorialRemainder 
{
	private int input;
	private int factorialRemainder;
	
	public FactorialRemainder(int n)
	{
		this.input = n;
		
		solution();
	}

	public int getFactorialRemainder()
	{
		return this.factorialRemainder;
	}
	
	/*
	 * Finds the factorial remainder.
	 */
	private void solution()
	{
		this.factorialRemainder = 1;
		BigInteger fact = new BigInteger("1");
		
		if(input > 100000 || input < 0)
		{
			System.out.println("Invalid Input.");
		}
		else
		{
			//Check and update factorialRemainder for all numbers from 1..n
			for(int X=2; X<=input; X++)
			{
				BigInteger divisor = new BigInteger(X + "");
				fact = fact.multiply(new BigInteger(X-1 + ""));
				System.out.println("Factorial of " + (X-1) + " is " + fact);
				BigInteger remainder = fact.mod(divisor);
				
				// check if factorial(X-1) gives remainder (X-1) when divided by X
				if( remainder.equals(new BigInteger(X-1+"")))
				{
					factorialRemainder = factorialRemainder + 1;
				}
			}
		}
	}
	
	/*
	 * To calculate factorial of a given number using recursion.
	 */
	private BigInteger factorial(int number) 
	{
		BigInteger fact = new BigInteger("1");
		for (int i = number; i > 1; i--)
		{
			fact = fact.multiply(new BigInteger(i + ""));			  
		}
		return fact;
	}
}
