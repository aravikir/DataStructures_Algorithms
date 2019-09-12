package Algorithms1;
// Determine the largest integer in a BST that is lesser than or equal to N

public class LargestLessN {
	
	private static class Node{
		//Creates object of type Node
		int key;
		Node left, right;
	}

	private static Node newNode(int item) {
		//To create BST node
		Node temp = new Node();
		temp.key = item;
		temp.left = null;
		temp.right = null;
		return temp;
	}
	
	public static Node insert(Node node, int key) {
		
		//if node is empty return new node
		if (node==null) {
			return newNode(key);
		}
		
		//inequalities to determine where to put key
		if (key<node.key) {
			node.left = insert(node.left, key);
		}
		else if (key>node.key) {
			node.right = insert(node.right, key);
		}
		return node;
	}
	
	public static int findMaxForN(Node root, int N) {
		
		//base cases
		if (root==null) {
			return -1;
		}
		
		if (root.key==N) {
			return N;
		}
		
		//if root is not on pointer try next subtree
		else if (root.key<N) {
			int k=findMaxForN(root.right,N);
			if (k==-1) {
				return root.key;
			}
			else {
				return k;
			}
		}
		else if (root.key>N) {
			return findMaxForN(root.left,N);
		}
		else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		int N=21;
		Node root=null;
		root = insert(root,25);
		insert(root, 2);
		insert(root, 1);
		insert(root, 3);
		insert(root, 12);
		insert(root, 9);
		insert(root, 21);
		insert(root, 19);
		insert(root, 25);
		
		System.out.println(findMaxForN(root,N));
	}
}
