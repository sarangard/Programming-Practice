public class BinaryTreeNode 
{
	private BinaryTreeNode left;
	private int data;
	private BinaryTreeNode right;
	
	/*
	 * Constructor
	 */
	public BinaryTreeNode(int data)
	{
		this.data = data;
	}
	
	/*
	 * Data
	 */
	public void setData(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return data;
	}
	
	/*
	 * Left Node
	 */
	public void setLeftNode(int data)
	{
		this.left = new BinaryTreeNode(data);
	}
	
	public BinaryTreeNode getLeftNode()
	{
		return left;
	}
	
	/*
	 * Right
	 */
	public void setRightNode(int data)
	{
		this.right = new BinaryTreeNode(data);
	}
	
	public BinaryTreeNode getRightNode()
	{
		return right;
	}
	
}
