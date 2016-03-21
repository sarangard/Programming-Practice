public class DLLNode 
{
	private DLLNode previous;
	private int data;
	private DLLNode next;
	
	/*
	 * Constructor
	 */
	public DLLNode(int data)
	{
		this.data = data;
		this.next = null;
		this.previous = null;
	}
	
	/*
	 * Data
	 */
	public int getData()
	{
		return data;
	}

	public void setData(int x)
	{
		this.data = x;
	}
	
	/*
	 * Next Node
	 */
	public DLLNode getNext()
	{
		return next;
	}

	public void setNext(DLLNode n)
	{
		this.next = n;
	}
	
	/*
	 * Previous Node
	 */
	public DLLNode getPrevious()
	{
		return previous;
	}

	public void setPrevious(DLLNode n)
	{
		this.previous = n;
	}
	
}
