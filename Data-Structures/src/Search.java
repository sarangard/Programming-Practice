/**
 * Search Algorithms
 * 
 * Unordered Linear Search
 * Ordered Linear Search
 * Binary Search
 * 
 * @author Sarang
 */
public class Search 
{
	public int[] array;
	
	/*
	 * Constructor
	 */
	public Search(int[] arr)
	{
		array = arr;
	}
	
	/*
	 * Linear Search with UnOrdered Lists. 
	 */
	public int UnorderedSearch(int data)
	{
		for(int i=0; i<array.length; i++)
		{
			if(array[i] == data)
				return i;
		}
		
		return -1;
	}
	
	/*
	 * Linear Search with Ordered Lists.
	 * Elements are sorted in Increasing Order.
	 */
	public int OrderedSearch(int data)
	{
		for(int i=0; i<array.length; i++)
		{
			if(array[i] == data)
				return i;
			else if(array[i] > data)
				return -1;
		}
		
		return -1;
	}
	
	/*
	 * Binary Search using Iteration.
	 */
	public int BinarySearchIterative(int data)
	{
		int low = 0, high = array.length-1, mid;
		
		while(low <= high)
		{
			mid = low + (high - low)/2;
			
			if(array[mid] == data)
				return mid;
			else if(array[mid] < data)
				low = mid + 1;
			else
				high = mid - 1;
		}
		
		return -1;
	}
	
	/*
	 * Binary Search using Recursion.
	 * 
	 */
	public int BinarySearchRecursive(int low, int high, int data)
	{
		int mid = low + (high-low)/2;
		
		if(array[mid] == data)
			return mid;
		else if(array[mid] < data)
			return BinarySearchRecursive(mid+1, high, data);
		else
			return BinarySearchRecursive(low, mid-1, data);
	}
	
}
