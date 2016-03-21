/**
 * You are given N counters, initially set to 0, and you have two possible operations 
 * on them: 
 *       increase(X) - counter X is increased by 1,
 *       max counter - all counters are set to the maximum value of any counter.
 * A non-empty zero-indexed array A of M integers is given. This array represents 
 * consecutive operations:
 *       if A[K] = X, such that 1 <= X <= N, then operation K is increase(X),
 *       if A[K] = N + 1 then operation K is max counter.
 * 
 * Given an integer N and a non-empty zero-indexed array A consisting of M integers, 
 * returns a sequence of integers representing the values of the counters.
 * 
 * Assume that:
 *         N and M are integers within the range [1..100,000];
 *         each element of array A is an integer within the range [1..N + 1].
 * 
 * @author Sarang
 */
public class MaxCounters 
{
	private int[] counters;
	private int[] inputArray;
	
	/*
	 * 
	 */
	public MaxCounters(int N, int[] A)
	{
		this.inputArray = A;
		this.counters = new int[N];
		
		for(int i=0; i<this.counters.length; i++)
		{
			this.counters[i] = 0;
		}
		
		updateCounters();
	}

	/*
	 * 
	 */
	public int[] getCounters()
	{
		return counters;
	}
	
	/*
	 * 
	 */
	private void updateCounters()
	{
		for(int i=0; i<inputArray.length; i++)
		{
			if(inputArray[i] < counters.length)
			{
				counters[inputArray[i]-1] = counters[inputArray[i]-1] + 1;
			}
			else
			{
				int max = findMaxInCounters();
				for(int j =0; j< counters.length; j++)
				{	
					counters[j] = max;
				}
			}
		}
	}
	
	private int findMaxInCounters()
	{
		int max = 0;
		for(int i=0; i<counters.length; i++)
		{
			if(counters[i] > max)
			{
				max = counters[i];
			}
		}
		return max;
	}
}
