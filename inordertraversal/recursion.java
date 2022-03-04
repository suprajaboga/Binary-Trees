package inordertraversal;

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

public class recursion 
{
	Node root;
	public static void print(Node node)
	{
		if(node == null)
			return;
		print(node.left);
		System.out.print(node.data + " ");
		print(node.right);
	}
	public static void main(String[] args) 
	{
		 recursion tree = new recursion();
	     tree.root = new Node(1);
	     tree.root.left = new Node(2);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     System.out.println("Preorder traversal ");
	     print(tree.root);
	}
}