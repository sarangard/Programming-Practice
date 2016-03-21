/**
 * Queue using a Circular Array.
 * Enter the array size required while calling the constructor.
 * 
 * Operations are EnQueue, DeQueue, isEmpty, QueueSize, Front.
 * 
 * @author Sarang Ardhapurkar
 */
public class QueueUsingArray 
{
	private int[] queue;
	private int size, front, rear;
	
	private int CAPACITY = 16;
	
	/*
	 * Default Constructor
	 */
	public QueueUsingArray()
	{
		queue = new int[CAPACITY];
		size = 0; front = 0; rear = 0;
	}

	/*
	 * Constructor
	 */
	public QueueUsingArray(int capacity)
	{
		CAPACITY = capacity;
		queue = new int[CAPACITY];
		size = 0; front = 0; rear = 0;
	}
	
	/*
	 * Inserts an Element at the end of Queue
	 */
	public void EnQueue(int data)
	{
		if(size == CAPACITY)
		{
			System.out.println("Queue is Full - Overflow");
		}
		else
		{
			size = size + 1;				// Increment Queue Size
			queue[size] = data;				// Insert Element
			rear = (rear + 1)%CAPACITY;		// Increment Rear
		}
	}
	
	/*
	 * Removes and returns an Element from the front of the Queue. 
	 */
	public int DeQueue()
	{
		if(size == 0)
		{
			System.out.println("Queue is Empty - Underflow");
			
			return -1;
		}
		else
		{
			size = size - 1;						// Decrement Queue Size
			int data = queue[front%CAPACITY];		// Extract Element
			queue[front] = Integer.MIN_VALUE;		// Clear Element
			front = (front + 1)%CAPACITY;			// Increment Front
			
			return data;
		}
	}
	
	/*
	 * 
	 */
	public boolean isEmpty()
	{
		if(size == 0)
			return true;
		else
			return false;
	}
	
	/*
	 * 
	 */
	public boolean isFull()
	{
		if(size == CAPACITY)
			return true;
		else
			return false;
	}
	
	/*
	 * 
	 */
	public int QueueSize()
	{
		return size;
	}
}
