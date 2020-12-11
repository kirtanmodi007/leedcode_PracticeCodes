package job_coding;

//Just like linkedlist nodes, we have treee node.
//Here, each tree node has its data, reference to the right child and left child

public class TreeNode 
{
	public int val;
	public TreeNode left;
	public TreeNode right;
	
	TreeNode()
	{
		
	}
	
	TreeNode(int val)
	{
		this.val = val;
	}
	
	TreeNode(int val, TreeNode left, TreeNode right)
	{
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public void insert(int val)
	{
		//tu ahi insert method ma aawyo that means ke tari pase atleast root node to 6ej
		
		//This simply means if we have repeated data we cannot do it.
		//aa value aapde root node jode check kariye 1st step ma.
		//aa function ni andar tu tyare j aawe ke jyare 1 root node create thai gayelo hoy.
		if(this.val == val)
		{
			return;
		}
		
		//this simply means ke mare current je node par 6u aena pa6i na noe par value add karwi pade.
		else if(val < this.val)
		{
			//But ahi pahela check karwu pade ke left node exist kare 6e ke nahi.
			if(left==null)
			{
				//this means ke koi left child exist j nathi karto
				left = new TreeNode(val);
			}
			else
			{
				//This means ke left child exists kare 6e
				left.insert(val);
			}
		}
		
		else
		{
			//But ahi pahela check karwu pade ke left node exist kare 6e ke nahi.
			if(right==null)
			{
				//this means ke koi left child exist j nathi karto
				right = new TreeNode(val);
			}
			else
			{
				//This means ke left child exists kare 6e
				right.insert(val);
			}
		}
	}
}