/**
 * Single Linked List implementation
 */
public class SingleLinkedList 
{
	private SLLNode headNode;
	
	/*
	 * Constructor
	 */
	public SingleLinkedList()
	{
		headNode = null;
	}
	
	/*
	 * Print the Linked List
	 */
	public void printLinkedList()
	{
		SLLNode currNode = headNode;
		while(currNode!=null)
		{
			System.out.println(currNode.getData());
			currNode = currNode.getNext();
		}
	}
	
	/* 
	 * Length of a Linked List
	 */
	public int listLength()
	{
		int length = 0;
		SLLNode currNode = headNode;
		while(currNode!=null)
		{
			length++;
			currNode = currNode.getNext();
		}
		
		return length;
	}
	
	/*
	 * Insert an Element at the beginning of Linked List.
	 */
	public SLLNode insertBegin(int data)
	{
		if(headNode == null)
		{
			headNode = new SLLNode(data);
			headNode.setNext(null);
		}
		else
		{
			SLLNode tempNode = new SLLNode(data);
			tempNode.setNext(headNode);
			headNode=tempNode;
		}
		
		return headNode;
	}
	
	/*
	 * Insert an element at the end
	 */
	public SLLNode insertEnd(int data)
	{	
		if(headNode==null)
		{
			headNode = new SLLNode(data);
			headNode.setNext(null);
		}
		else
		{
			SLLNode tempNode = new SLLNode(data);
			tempNode.setNext(null);

			SLLNode currNode = headNode;

			while(currNode.getNext()!=null)
			{
				currNode = currNode.getNext();
			}
			
			currNode.setNext(tempNode);
		}
		return headNode;
	}
	
	/*
	 * Delete an Element from the Beginning.
	 * 
	 */
	public SLLNode deleteBegin()
	{
		int length = listLength(); 
		if(length == 0)
		{
			System.out.println("Linked List is empty. Nothing to delete.");
		}
		else if(length == 1)
		{
			headNode = null;
		}
		else
		{
			headNode = headNode.getNext();
		}
		
		return headNode;
	}
	
	/*
	 * Delete an element at the End
	 */
	public SLLNode deleteEnd()
	{
		int length = listLength();
		
		if(length == 0)
		{
			System.out.println("List is Empty. Nothing to delete.");
		}
		else if(length == 1)
		{
			headNode = null;
		}
		else
		{
			SLLNode currNode = headNode;
			SLLNode previousNode = headNode;
			
			while(currNode.getNext()!=null)
			{
				previousNode = currNode;
				currNode = currNode.getNext();
			}
			
			previousNode.setNext(null);
			currNode=null;
		}
		return headNode;
	}
	
	/*
	 * Rotate the Linked List
	 */
	public SLLNode rotateLinkedList()
	{
		SLLNode currNode = headNode.getNext();
		SLLNode nextNode = currNode.getNext();
		headNode.setNext(null);
		
		while(nextNode.getNext() != null)
		{	
			currNode.setNext(headNode);
			headNode = currNode;
			
			currNode = nextNode;
			nextNode = nextNode.getNext();
		}
		
		nextNode.setNext(currNode);
		currNode.setNext(headNode);
		headNode = nextNode;
		
		return headNode;
	}
	
	/*
	 *  Delete N nodes after first M nodes. 
	 */
	public SLLNode deleteNAfterM(int M, int N)
	{
		int l = listLength();
		
		if(l < M+N)
		{
			System.out.println("Specified operation cannot be completed. Wrong set of inputs.");
		}
		else
		{
			int count = 0;
			SLLNode currNode = headNode;
			
			while(count != M-1 )
			{
				currNode = currNode.getNext();
				count = count + 1;
			}
			
			SLLNode nextNode = currNode.getNext();
			count = 0;
					
			while(count != N)
			{
				currNode.setNext(nextNode.getNext());
				nextNode = null;
				nextNode = currNode.getNext();
				
				count = count + 1;
			}
		}
		
		return headNode;
	}
	
	public SLLNode deleteAlternateNode()
	{
		
		int l = listLength();
		
		if(l == 0 && l == 1)
		{
			System.out.println("This operation cannot be performed. Not enough nodes.");
		}		
		else
		{			
			SLLNode currNode = headNode;
			
			while(currNode.getNext() != null)
			{
				//System.out.println("1. current Node is: " + currNode.getData());
				currNode = deleteNextNode(currNode);
			}			
		}
		
		return headNode;
	}
	
	public SLLNode deleteNextNode(SLLNode currNode)
	{
		SLLNode nextNode = currNode.getNext();
		
		if(nextNode.getNext() == null)
		{
			//System.out.println("Last element going to be deleted");
			deleteEnd();
		}
		else
		{
			currNode.setNext(nextNode.getNext());
			//System.out.println("The node going to be deleted is: " + nextNode.getData());
			nextNode = null;
			currNode = currNode.getNext();	
		}			

		//System.out.println("2. current Node is: " + currNode.getData());
		return currNode;
	}
	
}
