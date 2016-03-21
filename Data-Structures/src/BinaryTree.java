public class BinaryTree 
{
	BinaryTreeNode root;
	
	/*
	 * Constructor
	 */
	public BinaryTree()
	{
		root = null;
	}
	
	/*
	 * Pre-Order Traversal
	 */
	public void preOrderTraversal(BinaryTreeNode root)
	{
		if(root != null)
		{
			System.out.println(root.getData());
			preOrderTraversal(root.getLeftNode());
			preOrderTraversal(root.getRightNode());
		}
	}
	
	/*
	 * In-Order Traversal
	 */
	public void inOrderTraversal(BinaryTreeNode root)
	{
		if(root != null)
		{
			inOrderTraversal(root.getLeftNode());
			System.out.println(root.getData());
			inOrderTraversal(root.getRightNode());
		}
	}

	/*
	 * Post-Order Traversal
	 */
	public void postOrderTraversal(BinaryTreeNode root)
	{
		if(root != null)
		{
			postOrderTraversal(root.getLeftNode());
			postOrderTraversal(root.getRightNode());
			System.out.println(root.getData());

		}
	}

	
}
