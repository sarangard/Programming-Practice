import java.util.HashMap;
import java.util.Map.Entry;

/**
 * A small frog wants to get to the other side of a river. 
 * The frog is currently located at position 0, and wants to get to position X. 
 * Leaves fall from a tree onto the surface of the river.
 * 
 * You are given a non-empty zero-indexed array A consisting of N integers representing 
 * the falling leaves. A[K] represents the position where one leaf falls at time K, 
 * measured in seconds.
 * 
 * The goal is to find the earliest time when the frog can jump to the other side of the 
 * river. The frog can cross only when leaves appear at every position across the river 
 * from 1 to X. You may assume that the speed of the current in the river is negligibly 
 * small, i.e. the leaves do not change their positions once they fall in the river.
 * 
 * Assume that:
 *         N and X are integers within the range [1..100,000];
 *         each element of array A is an integer within the range [1..X].
 * 
 * @author Sarang
 */
public class FrogRiverOne 
{
	private int stepsToDestination;
	private int stepsRequired;
	private int[] array;
	
	/*
	 * Constructor
	 */
	public FrogRiverOne(int X, int[] inputArray)
	{		
		this.stepsToDestination = X;
		this.array = inputArray;
		
		findStepsRequired();
	}
	
	/*
	 * 
	 */
	public int getStepsRequired()
	{
		return stepsRequired;
	}
	
	/*
	 * 
	 */
	private void findStepsRequired()
	{
		if(this.array.length < this.stepsToDestination)
		{
			System.out.println("Input sequence is smaller than steps to destination. Solution not possible for given Input.");
			stepsRequired = -1;
			return;
		}
		else
		{
			HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
			for(int i=1; i<=stepsToDestination; i++)
			{
				map.put(i, false);
			}
			
			for(int i=0; i< array.length; i++)
			{
				if(map.get(array[i]) == false)
				{
					map.put(array[i], true);
				}
				
				if(checkMap(map))
				{
					stepsRequired = i;
					return;
				}
			}
		}
		
		stepsRequired = -1;
		return;
	}
	
	/*
	 * 
	 */
	private Boolean checkMap(HashMap<Integer, Boolean> hashMap)
	{
		boolean retVal = false;
		
		for(Entry<Integer, Boolean> entry : hashMap.entrySet())
		{
			if(entry.getValue() == false)
			{
				return false;
			}
			else
			{
				retVal = true;
			}
		}
		
		return retVal;
	}

}
