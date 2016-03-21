import java.util.HashMap;
import java.util.Map.Entry;

/**
 * A non-empty zero-indexed array A consisting of N integers is given.
 * A permutation is a sequence containing each element from 1 to N once, and only once.
 * The goal is to check whether array A is a permutation.
 * 
 * Assume that:
 *         N is an integer within the range [1..100,000];
 *         each element of array A is an integer within the range [1..1,000,000,000].
 * 
 * @author Sarang
 */
public class PermCheck 
{
	private int[] array;
	private Boolean retVal = true;
	private int N;
	
	/*
	 * 
	 */
	public PermCheck(int[] inputArray)
	{
		this.array = inputArray;
		this.N = inputArray.length;
		
		checkPermInArray();
	}
	
	/*
	 * 
	 */
	public Boolean getPermCheck()
	{
		return retVal;
	}
	
	/*
	 * 
	 */
	private void checkPermInArray()
	{
		HashMap<Integer,Boolean> map = new HashMap<Integer, Boolean>();
		for(int i=1; i<=N; i++)
		{
			map.put(i, false);
		}
		
		for(int i=0; i<array.length; i++)
		{
			if(map.containsKey(array[i]))
			{
				if(map.get(array[i]) == false)
				{
					map.put(array[i],true);
				}
				else if(map.get(array[i]) == true)
				{
					map.put(array[i],false);
				}
			}
		}
		
		for(Entry<Integer,Boolean> entry : map.entrySet())
		{
			if(entry.getValue() == false)
			{
				retVal = false;
				return;
			}
		}
	}

}
