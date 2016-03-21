/**
 * Given three integers A, B and K, returns the number of integers within the 
 * range [A..B] that are divisible by K.
 * 
 * Assume that:
 *         A and B are integers within the range [0..2,000,000,000];
 *         K is an integer within the range [1..2,000,000,000];
 *         A <= B.
 * 
 * @author Sarang
 */
public class CountDiv 
{
	private int start;
	private int end;
	private int div;
	private int countDiv = 0;
	
	public CountDiv(int A, int B, int K)
	{
		this.start = A;
		this.end = B;
		this.div = K;
		
		findCountDiv();
	}
	
	public int getCountDiv()
	{
		return countDiv;
	}
	
	private void findCountDiv()
	{
		for(int i=start; i<=end; i++)
		{
			if((i%div) == 0)
			{
				countDiv = countDiv + 1;
			}
		}
	}
	
	private void findCountDiv2()
	{
		int b = end/div;
	    int a = (start > 0 ? (start - 1)/div: 0);
	    
	    if(start == 0)
	    {
	        b++;
	    }
	    
	    countDiv = b - a;
	}
}
