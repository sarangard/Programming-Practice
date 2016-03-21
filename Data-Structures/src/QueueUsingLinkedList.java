/**
 * Queue using a Linked List.
 * Enter the array size required while calling the constructor.
 * 
 * Operations are EnQueue, DeQueue, isEmpty, QueueSize, Front.
 * 
 * @author Sarang Ardhapurkar
 */
public class QueueUsingLinkedList 
{
	private int size;
	private SLLNode front, rear;
	
	/*
	 * Default Constructor
	 */
	public QueueUsingLinkedList()
	{
		size = 0;
		front = rear = null;
	}
	
	/*
	 * 
	 */
	public void EnQueue(int data)
	{
		SLLNode node = new SLLNode(data);
		
		if(isEmpty())
			front = node;
		else
			rear.setNext(node);
		
		rear = node;
		size = size + 1;		
	}
	
	/*
	 * 
	 */
	public int DeQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty - Underflow");
			return -1;
		}
		else
		{
			int data = front.getData();
			front = front.getNext();
			size = size - 1;
			
			if(isEmpty())
				rear = null;
			
			return data;
		}
	}
	
	/*
	 * 
	 */
	public int first()
	{
		if(isEmpty())
			System.out.println("Queue is Empty - Underflow");
		
		return front.getData();
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
	public int QueueSize()
	{
		return size;
	}
}
