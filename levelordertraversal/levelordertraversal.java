package levelordertraversal;
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
public class levelordertraversal 
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
			if(node.left!=null)
				q.add(node.left);
			if(node.right!=null)
				q.add(node.right);
		}
	}
	public static void main(String[] args) 
	{
	     levelordertraversal tree = new levelordertraversal();
	     tree.root = new Node(1);
	     tree.root.left = new Node(2);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     System.out.println("Level order traversal of binary tree is ");
	     tree.print();
	}
}
