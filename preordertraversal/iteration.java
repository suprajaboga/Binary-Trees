package preordertraversal;
import java.util.*;
 
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 
public class iteration
{
	Node root;
	void preorderIterative(Node node)
	{
	    if (node == null)
	    	return;
	    Stack<Node> st = new Stack<Node>();
		st.push(node);
		while(!st.isEmpty())
		{
			node=st.pop();
			System.out.print(node.data + " ");
			if(node.right!=null)
				st.push(node.right);
			if(node.left!=null)
				st.push(node.left);
		}
	} 
	public static void main(String args[])
	{
	    iteration tree = new iteration();
	     
	    tree.root = new Node(10);
	    tree.root.left = new Node(20);
	    tree.root.right = new Node(30);
	    tree.root.left.left = new Node(40);
	    tree.root.left.left.left = new Node(70);
	    tree.root.left.right = new Node(50);
	    tree.root.right.left = new Node(60);
	    tree.root.left.left.right = new Node(80);
	     
	    tree.preorderIterative(tree.root);
	}
}

//TC = SC = O(n) - n is total no.of nodes in a tree