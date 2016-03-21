/**
 * Stack using an Array.
 * Enter the array size required while calling the constructor.
 * 
 * Operations are PUSH, POP, isEmpty, isStackFull, stackSize.
 * 
 * @author Sarang Ardhapurkar
 */
public class StackUsingArray 
{
	int ArraySize;
	int[] StackArray;
	int tos = -1;
	
	/*
	 * Constructor
	 */
	public StackUsingArray(int arraySize)
	{
		StackArray = new int[arraySize];
		ArraySize = arraySize;
	}
	
	/*
	 * Stack Push Operation
	 */
	public void push(int element)
	{
		tos = tos + 1;
		if(isStackFull())
		{
			tos = tos - 1;
			System.out.println("Stack is Full. Cannot inserrt new element.");
		}
		else
		{
			StackArray[tos] = element;	
		}
	}
	
	/*
	 * Stack POP Operation
	 * Returns -1 if stack is Empty.
	 */
	public int pop()
	{
		int element = -1;
		
		if(isEmpty())
		{
			System.out.println("Stack is Empty. Cannot pop element.");
		}
		else
		{
			element = StackArray[tos];
		}		
		tos = tos - 1;
		return element;
	}
	
	/*
	 * Returns false if Stack is empty. 
	 */
	public boolean isEmpty()
	{
		if(tos>0)
			return true;
		else
			return false;
	}
	
	/*
	 * Returns true if Stack is Full.
	 */
	public boolean isStackFull()
	{
		if(tos == ArraySize)
			return true;		
		else
			return false;
	}
	
	/*
	 * Returns current size of Stack.  
	 */
	public int stackSize()
	{
		return tos;
	}
	
	/*
	 * Returns a reference to the data at the TOS
	 */
	public int peek()
	{
		if(isEmpty())
			System.out.println("Stack is Empty.");
		return StackArray[tos];	
	}
	
}
