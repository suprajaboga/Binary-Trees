package mirroroftree;
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

public class mirroroftree
{
	Node root;
	void print()
	{
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node node=q.poll();
			System.out.print(node.data+" ");
			Node temp=node.left;
			node.left=node.right;
			node.right=temp;
			if(node.left!=null)
				q.add(node.left);
			if(node.right!=null)
				q.add(node.right);
		}
	}
	public static void main(String[] args) 
	{
		 mirroroftree tree = new mirroroftree();
	     tree.root = new Node(4);
	     tree.root.left = new Node(2);
	     tree.root.right = new Node(7);
	     tree.root.left.left = new Node(1);
	     tree.root.left.right = new Node(3);
	     tree.root.right.left = new Node(6);
	     tree.root.right.right = new Node(9);
	     System.out.println("Mirror of binary tree is ");
	     tree.print();
	}
}