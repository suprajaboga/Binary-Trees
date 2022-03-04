package levelordertraversalreverse;
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

//same as level order traversal but instead of printing the node, push it to stack and right subtree is visited before left subtree
public class levelordertraversalreverse 
{
	Node root;
	void print(Node node)
	{
		Stack<Node> s=new Stack<>();
		Queue<Node> q=new LinkedList<Node>();
		q.add(node);
		while(!q.isEmpty())
		{
			node=q.poll();
			s.push(node);
			if(node.right!=null)
				q.add(node.right);
			if(node.left!=null)
				q.add(node.left);
		}
		while(!s.isEmpty())
		{
			node=s.peek();
			System.out.print(node.data+" ");
			s.pop();
		}
	}
	public static void main(String[] args) 
	{
		levelordertraversalreverse tree = new levelordertraversalreverse();
	     tree.root = new Node(1);
	     tree.root.left = new Node(2);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     tree.root.right.left = new Node(6);
	     tree.root.right.right = new Node(7);
	     System.out.println("Reverse Level order traversal of binary tree is ");
	     tree.print(tree.root);
	}
}
