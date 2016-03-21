/**
 * Circular Linked List implementation
 */
public class CircularLinkedList 
{
	private DLLNode headNode;
	private DLLNode tailNode;
	
	/*
	 * Constructor
	 */
	public CircularLinkedList()
	{
		headNode = null;
		tailNode = null;
	}
	
	/*
	 * Print the Linked List
	 */
	public void printLinkedList()
	{
		DLLNode currNode = headNode;
		do
		{
			System.out.println(currNode.getData());
			currNode = currNode.getNext();
		}while(currNode!=headNode);
	}
	
	/* 
	 * Length of a Linked List
	 */
	public int listLength()
	{
		int length = 0;
		DLLNode currNode = headNode;
		do
		{
			length++;
			currNode = currNode.getNext();
		}while(currNode!=headNode);
		
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
			tailNode = headNode;
		}
		else
		{
			DLLNode tempNode = new DLLNode(data);
			tempNode.setPrevious(tailNode);
			tailNode.setNext(tempNode);
			headNode.setPrevious(tempNode);
			tempNode.setNext(headNode);
			headNode = tempNode;
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
			tailNode = headNode;
		}
		else
		{
			DLLNode tempNode = new DLLNode(data);
			tailNode.setNext(tempNode);
			tempNode.setNext(headNode);
			headNode.setPrevious(tempNode);
			tempNode.setPrevious(tailNode);
			
			tailNode = tempNode;			
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
			tailNode = null;
		}
		else
		{
			headNode = headNode.getNext();
			headNode.setPrevious(tailNode);
			tailNode.setNext(headNode);
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
			tailNode = tailNode.getPrevious();
			tailNode.setNext(headNode);
			headNode.setPrevious(tailNode);
		}
		return headNode;
	}
}
