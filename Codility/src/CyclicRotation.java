/**
 * A zero-indexed array A consisting of N integers is given. 
 * Rotation of the array means that each element is shifted right by one index, 
 * and the last element of the array is also moved to the first place.
 * 
 * For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
 * 
 * Assume that:
 *         N and K are integers within the range [0..100];
 *         each element of array A is an integer within the range [-1,000..1,000].
 * 
 * @author Sarang
 */
public class CyclicRotation 
{
	private int[] array;
	private int[] arrayRotated;	
	private int k;
	
	/*
	 * Constructor
	 */
	public CyclicRotation(int[] A, int k)
	{
		if(A.length > 100)
		{
			System.out.println("Array Size exceed limit of 100. Please try again.");
		}
		else if(k > 100)
		{
			System.out.println("K value exceeds the limit of 100. Please try again.");
		}
		else
		{
			this.array = A;
			this.k = k;
			arrayRotated = new int[array.length];
			
			rotateArray();			
		}
	}
	
	/*
	 * getter for arrayRotated.
	 */
	public int[] getRotatedArray()
	{
		return arrayRotated;
	}
	
	/*
	 * rotates given array k times
	 */
	private void rotateArray()
	{
		for(int i=0; i<array.length; i++)
		{
			if((i+k) >= array.length)
			{
				arrayRotated[((i+k)-array.length)] = array[i];
			}
			else
			{
				arrayRotated[i+k] = array[i];
			}
		}
	}
	
}
