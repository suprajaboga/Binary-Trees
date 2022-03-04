package inordertraversal;

import java.util.Stack;

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
		Stack<Node> st = new Stack<Node>();
		while(true)
		{
			if(node!=null)
			{
				st.push(node);
				node=node.left;
			}
			else
			{
				if(st.isEmpty())
					break;
				node=st.pop();
				System.out.print(node.data + " ");
				node=node.right;
			}
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