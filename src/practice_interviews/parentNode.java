package practice_interviews;

import java.util.ArrayList;
import java.util.List;

public class parentNode {
	private static int parent;
	private static int count = 0;
	static class Node{
		int data;
		Node left, right;
		Node(int item){
			data = item;
			left=right=null;
		}
	}
	
	static class BinaryTree{
		Node root;
		
		boolean printParents(Node node, int target) {
			//check for empty node
			if(node==null) {return false;}
			//check if node is the target
			if(node.data==target) {return true;}
			//check if target present in left or right node
			if(printParents(node.left, target) || printParents(node.right,target)) {
				System.out.println(node.data + " ");
				return true;
			}
			return false;
		}
		
		List<Integer> getParent(Node node, int target){
			List<Integer> list = new ArrayList<Integer>();
			list.add(node.data);
			count++;
			//int oldParent = parent;
			parent = list.get(--count);
			
			if(node.data!=target) {
				getParent(node.left, target);
			}
			return list;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(7);
		
		//tree.printParents(tree.root, 7);
		
		System.out.println(tree.getParent(tree.root, 7));

	}

}
