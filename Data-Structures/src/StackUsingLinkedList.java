/**
 * Stacks using Linked List
 * Operations are PUSH, POP, isEmpty, stackSize.
 * 
 * @author Sarang
 */
public class StackUsingLinkedList 
{
	private int length;
	private SLLNode top;
	
	/*
	 * Constructor
	 */
	public StackUsingLinkedList()
	{
		length = 0;
		top = null;
	}
	
	/*
	 * Stack PUSH Operation
	 */
	public void push(int element)
	{
		SLLNode temp = new SLLNode(element);
		temp.setNext(top);
		top = temp;
		length = length + 1;
	}
	
	/*
	 * Stack POP Operation
	 * Returns -1 if Stack is Empty
	 */
	public int pop()
	{	
		int element;
		
		if(isEmpty())
		{
			System.out.println("Stack is EMPTY.");
			element = -1;
		}
		else
		{
			element = top.getData();
			top = top.getNext();
			length = length - 1;
		}
		
		return element;
	}
	
	/*
	 * Returns TRUE if Stack is Empty
	 */
	public boolean isEmpty()
	{
		if(top==null)
			return true;
		else
			return false;
	}
	
	/*
	 * Returns Size of Stack
	 */
	public int stackSize()
	{
		return length;
	}
	
	/*
	 * Returns a reference to the data at the TOS
	 */
	public int peek()
	{
		if(isEmpty())
			System.out.println("Stack is EMPTY.");
		return top.getData();	
	}

}
