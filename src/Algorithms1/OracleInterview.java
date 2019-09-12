package Algorithms1;

public class OracleInterview {
	
	static class Node{
		//defining key and left&right nodes
		int key;
		Node left;
		Node right;
		
		//creating a node
		Node(int item){
			key = item;
			left = right = null;
		}
	}
	static class BinaryTree{
		Node root;
		
		boolean checkSymmetric(Node node) {
			return isSymmetric(root, root);
		}
		
		boolean isSymmetric(Node n1, Node n2) {
			//check if both trees are empty
			if(n1==null && n2 == null) {
				return true;
			}
			
			//check if not null and for key
			if(n1 != null && n2 != null) {
				if (n1.key == n2.key) {
					return(isSymmetric(n1.left, n2.right) && isSymmetric(n1.right, n2.left));
				}
			}
			return false;
		}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(4);
		tree.root.right.left = new Node(4);
		tree.root.right.right = new Node(3);
		System.out.println(tree.checkSymmetric(tree.root));

	}

}
}
