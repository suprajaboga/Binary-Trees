package heightofbinarytree;
import java.util.*;

class Node
{
	int data;
	Node left,right;
	public Node(int item)
	{
		data=item;
		left=right=null;
	}
}
public class heightofbinarytree 
{
	Node root;
	public static int print(Node node)
	{
		if(node == null)
			return -1;
		int ldepth = print(node.left);
		int rdepth = print(node.right);
		
		if(ldepth > rdepth)
			return ldepth + 1;
		else
			return rdepth + 1;
	}
	public static void main(String[] args) 
	{
	     heightofbinarytree tree = new heightofbinarytree();
	     tree.root = new Node(1);
	     tree.root.left = new Node(2);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     System.out.println("Height of binary tree is " + print(tree.root));
	}
}

// TC = SC = O(n)
