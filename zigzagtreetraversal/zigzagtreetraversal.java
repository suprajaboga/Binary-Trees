package zigzagtreetraversal;
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

public class zigzagtreetraversal
{
	Node root;
	void print()
	{
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		boolean leftToRight = true;
		ArrayList<Integer> list = new ArrayList<Integer>();
	    while(!q.isEmpty())
		{
			int size = q.size();
			int arr[] = new int[size];
			for(int i=1;i<=size;i++)
			{
				Node node = q.poll();
				int index = (leftToRight) ? (i-1) : (size-i);
				arr[index] = node.data;
				if(node.left != null)
					q.add(node.left);
				if(node.right != null)
					q.add(node.right);
			}
			leftToRight = !leftToRight;
			for(int i=0;i<size;i++)
				list.add(arr[i]); 
		}
		System.out.println("Zigzag traversal of binary tree is " + list);
	}
	public static void main(String[] args)
	{
		 boolean lefttoRight = true;
		 zigzagtreetraversal tree = new zigzagtreetraversal();
	     tree.root = new Node(1);
	     tree.root.left = new Node(2);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     tree.root.right.left = new Node(6);
	     tree.root.right.right = new Node(7);
	     tree.root.right.right.left = new Node(8);
	     tree.root.right.right.right = new Node(9);
	     tree.print();
	}

}
