/**
 * A non-empty zero-indexed array A consisting of N integers is given. 
 * Array A represents numbers on a tape. 
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: 
 * A[0], A[1], ..., A[P - 1] and A[P], A[P + 1], ..., A[N - 1].
 * The difference between the two parts is the value of: 
 * |(A[0] + A[1] + ... + A[P - 1]) - (A[P] + A[P + 1] + ... + A[N - 1])|
 * 
 * Find the minimal difference that can be achieved.
 * 
 * Assume that:
 *         N is an integer within the range [2..100,000];
 *         each element of array A is an integer within the range [-1,000..1,000].
 * 
 * @author Sarang
 */
public class TapeEquilibrium 
{
	private int[] tape;
	private int minimalDifference;
	private int index;
	
	/*
	 * 
	 */
	public TapeEquilibrium(int[] input)
	{
		this.tape = input;
		findEquilibrium();
	}
	
	/*
	 * 
	 */
	public int getMinimalDifference()
	{
		return this.minimalDifference;
	}
	
	/*
	 * 
	 */
	public int getMinimalIndex()
	{
		return this.index;
	}
	
	/*
	 * 
	 */
	private void findEquilibrium()
	{
		int tapeSum = 0;
		int leftSum = 0;
		
		for(int i : this.tape)
		{
			tapeSum = tapeSum + i;
		}		
		this.minimalDifference = tapeSum;
		this.index = -1;
		
		for(int i=0; i<tape.length; i++)
		{
			if( Math.abs(leftSum-tapeSum) < this.minimalDifference )
			{
				minimalDifference = Math.abs(leftSum-tapeSum);
				index = i;
			}
			
			leftSum = leftSum + tape[i];
			tapeSum = tapeSum - tape[i];
		}
	}
}
