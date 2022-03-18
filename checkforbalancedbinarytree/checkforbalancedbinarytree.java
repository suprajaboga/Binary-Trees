package checkforbalancedbinarytree;
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

public class checkforbalancedbinarytree 
{
	Node root;
	public static int print(Node node)
	{
		if(node == null)
			return 0;
		int ldepth = print(node.left);
		if(ldepth == -1)
			return -1;
		int rdepth = print(node.right);
		if(rdepth == -1)
			return -1;
		if(Math.abs(ldepth - rdepth) > 1)
			return -1;
		return 1 + Math.max(ldepth, rdepth);
	}
	public static void main(String[] args) 
	{
		 checkforbalancedbinarytree tree = new checkforbalancedbinarytree();
	     tree.root = new Node(1);
	     tree.root.left = new Node(2);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     tree.root.left.right.right = new Node(6);
	     if(print(tree.root) != -1)
	    	 System.out.println("Binary tree is height-balanced");
	     else
	    	 System.out.println("Binary tree is not height-balanced");
	}
}