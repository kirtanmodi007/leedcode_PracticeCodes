package job_coding;

//This class will contain all the functionalities related to the Binary Search Tree
public class Tree 
{
	//SO to traverse in the tree all we need is the root tree.
	//It is same as the HEAD NODE IN LINKEDLIST
	public TreeNode root;
	
	public void insertBST(int value)
	{
		
		//This simply means ke taru TreeNode empty 6e.
		if(root == null)
		{
			root = new TreeNode(value);
		}
		
		//Now if taru tree node empty nathi to tare value either left subtree
		//or either right subtree ma insert karawi pade.
		//Aapde ahiya INSERT method ni implementation nathi lakhta, we are writing insertion
		//implementation in our TreeNode class, so that we can adjust the value
		//to its left and right childs.
		else
		{
			root.insert(value);
		}
	}
	
	public void inOrder()
	{
		
	}
	
}
