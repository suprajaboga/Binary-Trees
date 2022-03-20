package diagonaltraversalofbinarytree;
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

public class diagonaltraversalofbinarytree
{
	Node root;
	void print(Node node)
	{
		Queue<Node> q = new LinkedList<Node>();
	    while(node != null)
		{
	    	System.out.print(node.data + " ");
	    	if(node.left != null)
				q.add(node.left);
			if(node.right != null)
				node = node.right;
			else
			{
				if(!q.isEmpty())
					node = q.poll();
				else
					node = null;
			}
		}
	}
	public static void main(String[] args)
	{
		 diagonaltraversalofbinarytree tree = new diagonaltraversalofbinarytree();
	     tree.root = new Node(1);
	     tree.root.left = new Node(2);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     tree.root.right.left = new Node(6);
	     tree.root.right.right = new Node(7);
	     tree.root.right.right.left = new Node(8);
	     tree.root.right.right.right = new Node(9);
	     System.out.print("Diagonal traversal of binary tree is ");
	     tree.print(tree.root);
	}

}
