/**
 * A zero-indexed array A consisting of N different integers is given. 
 * The array contains integers in the range [1..(N + 1)], which means that 
 * exactly one element is missing.
 * Your goal is to find that missing element.
 * 
 * Assume that:
 *         N is an integer within the range [0..100,000];
 *         the elements of A are all distinct;
 *         each element of array A is an integer within the range [1..(N + 1)].
 * 
 * @author Sarang
 */
public class MissingElement 
{
	private int[] array;
	private int missingElement;
	private int arraySize;
	
	/*
	 * 
	 */
	public MissingElement(int[] input)
	{
		this.array = input;
		this.arraySize = array.length + 1;	
		
		findMissingElement();
	}
	
	/*
	 * 
	 */
	public int getMissingElement()
	{
		return this.missingElement;
	}
	
	/*
	 * 
	 */
	private void findMissingElement()
	{
		int sumTotal = ((arraySize * (arraySize + 1))/2);
		int arraySum = 0;
		
		for(int i : this.array)
		{
			arraySum = arraySum + i;
		}
		
		this.missingElement = sumTotal - arraySum;
	}
}
