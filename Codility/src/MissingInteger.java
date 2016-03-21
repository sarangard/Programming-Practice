import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Given a non-empty zero-indexed array A of N integers, returns the minimal positive 
 * integer (greater than 0) that does not occur in A.
 * 
 * Assume that:
 *         N is an integer within the range [1..100,000];
 *         each element of array A is an integer within the range [-2,147,483,648..2,147,483,647].
 * 
 * @author Sarang
 */
public class MissingInteger 
{
	private int[] array;
	private int missingElement = -1;
	
	/*
	 * 
	 */
	public MissingInteger(int[] input)
	{
		this.array = input;
		
		findMissingInteger();
	}
	
	/*
	 * 
	 */
	public int getMissingInteger()
	{
		return missingElement;
	}
	
	/*
	 * 
	 */
	private void findMissingInteger()
	{		
		//Creating map with 1..N
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for(int i=1; i<array.length; i++)
		{
			map.put(i, false);
		}
		
		//Updating map
		for(int i=0;i<array.length; i++)
		{
			if(map.containsKey(array[i]))
			{
				map.put(array[i], true);
			}			
		}
		
		//Checking map for first false
		for(int i=1; i<array.length; i++)
		{
			if(map.get(i) == false)
			{
				missingElement = i;
				return;
			}
		}
	}//
}
