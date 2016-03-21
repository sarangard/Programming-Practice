public class SLLNode 
{
	private int data;
	private SLLNode next;
	
	/*
	 * Constructor
	 */
	public SLLNode(int data)
	{
		this.data = data;
		this.next = null;
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
	public SLLNode getNext()
	{
		return next;
	}

	public void setNext(SLLNode n)
	{
		this.next = n;
	}
	
}
