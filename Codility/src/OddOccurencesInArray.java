import java.util.HashMap;
import java.util.Map;

/**
 * A non-empty zero-indexed array A consisting of N integers is given. 
 * The array contains an odd number of elements, and each element of the array 
 * can be paired with another element that has the same value, except for one 
 * element that is left unpaired.
 * 
 * For example, given array A such that:
 * A[0] = 9  A[1] = 3  A[2] = 9  A[3] = 3  A[4] = 9  A[5] = 7  A[6] = 9
 * The function should return 7
 * 
 * Assume that:
 *         N is an odd integer within the range [1..1,000,000];
 *         each element of array A is an integer within the range [1..1,000,000,000];
 *         all but one of the values in A occur an even number of times.
 * 
 * @author Sarang
 */
public class OddOccurencesInArray 
{
	private int[] array;
	private int oddOccurence;
	
	/*
	 * Constructor
	 */
	public OddOccurencesInArray(int[] a)
	{
		this.array = a;
		findOddOccurenceInArray3();
	}
	
	/*
	 * Getter for oddOccurence
	 */
	public int getOddOccurenceInArray()
	{
		return oddOccurence;
	}
	
	/*
	 * finds the element that occurs odd number of times in the array.
	 * Uses Brute force. 
	 * 
	 * Time Complexity - O(N^2)
	 */
	private void findOddOccurenceInArray1()
	{
		for(int i = 0; i < array.length-1; i++)
		{
			for(int j = i+1; j < array.length; j++)
			{
				if(array[i]==array[j])
				{
					array[i] = array[j] = -1;
				}
			}
		}
		
		for(int i=0; i< array.length; i++)
		{
			if(array[i] != -1)
			{
				oddOccurence = array[i];
			}
		}
	}
	
	/*
	 * finds the element that occurs odd number of times in the array.
	 * Uses HashMap
	 * 
	 * Time Complexity - O(N)
	 */
	private void findOddOccurenceInArray2()
	{
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		
		//Inserting array into hashmap. 
		//If an element occurs odd number of times, its value will be true. Else false.
		for(int i : array)
		{
			if(map.containsKey(i))
			{
				map.put(i, !map.get(i));
			}
			else
			{
				map.put(i, true);
			}
		}
		
		//Iterate through a HashMap using for loop
		for(Map.Entry<Integer, Boolean> entry : map.entrySet())
		{
			if(entry.getValue() == true)
			{
				oddOccurence = entry.getKey();
			}
		}
	}
	
	/*
	 * finds the element that occurs odd number of times in the array.
	 * Uses Bitwise XOR
	 * 
	 * Time Complexity - O(N)
	 */
	private void findOddOccurenceInArray3()
	{
		for(int i : array)
		{
			oddOccurence = oddOccurence ^ i;
		}
	}

}
