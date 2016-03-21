/**
 * Double Linked List implementation
 */
public class DoubleLinkedList 
{
	private DLLNode headNode;
	
	/*
	 * Constructor
	 */
	public DoubleLinkedList()
	{
		headNode = null;
	}
	
	/*
	 * Print the Linked List
	 */
	public void printLinkedList()
	{
		DLLNode currNode = headNode;
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
		DLLNode currNode = headNode;
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
	public DLLNode insertBegin(int data)
	{
		if(headNode == null)
		{
			headNode = new DLLNode(data);
			headNode.setNext(null);
			headNode.setPrevious(null);
		}
		else
		{
			DLLNode tempNode = new DLLNode(data);
			tempNode.setNext(headNode);
			headNode.setPrevious(tempNode);
			headNode=tempNode;
		}
		
		return headNode;
	}
	
	/*
	 * Insert an element at the end
	 */
	public DLLNode insertEnd(int data)
	{	
		if(headNode==null)
		{
			headNode = new DLLNode(data);
			headNode.setNext(null);
			headNode.setPrevious(null);
		}
		else
		{
			DLLNode tempNode = new DLLNode(data);
			tempNode.setNext(null);

			DLLNode currNode = headNode;

			while(currNode.getNext()!=null)
			{
				currNode = currNode.getNext();
			}
			
			currNode.setNext(tempNode);
			tempNode.setPrevious(null);
		}
		return headNode;
	}
	
	/*
	 * Delete an Element from the Beginning.
	 * 
	 */
	public DLLNode deleteBegin()
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
			headNode.setPrevious(null);
		}
		
		return headNode;
	}
	
	/*
	 * Delete an element at the End
	 */
	public DLLNode deleteEnd()
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
			DLLNode currNode = headNode;
			DLLNode previousNode = headNode;
			
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
}
