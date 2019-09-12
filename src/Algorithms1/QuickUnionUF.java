package Algorithms1;

public class QuickUnionUF {

	private int[] id;	// Root of the tree
	private int[] size;	// Size of tree
	private int count;	// Number of nodes total
	
	public QuickUnionUF(int N) {
		// Makes nodes from number 1 to N
		count = N;
		size = new int[N];
		id = new int[N];
		for(int i=0; i<N; i++) {
			id[i] = i;
			size[i] = 1;
		}
	}
	
	public int count() {
		// Returns number of nodes in tree
		return count;
	}
	
	private void validate(int p) {
		//validates if index is within bounds of the tree
		int n = id.length;
		if (p<0 || p>=n) {
			throw new IllegalArgumentException("Index " + p + " is not between 0 and " + (n-1));
		}
	}
	
	private int root(int i) {
		validate(i);
		// Finds the root of a given node i
		// Change the i until i and id of i are the same
		// Point the node to their grandfather, making the tree shorter/flatter
		while(i != id[i]) {
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}
	
	public boolean connected(int p, int q) {
		// Checks if two nodes are connected by checking if they have the same root
		return root(p) == root(q);
	}
	
	public void union(int p, int q) {
		// Connect the two nodes
		int i = root(p);
		int j = root(q);
		//id[i] = j;	//inefficient method
		//efficient method
		// Checks for the size of the trees and connects the 
		// smaller tree below the bigger tree
		if (size[i] < size[j]) {
			id[i] = j;
			size[j] += size[i];
		}
		else {
			id[j] = i;
			size[i] += size[j];
		}
		count--;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickUnionUF test = new QuickUnionUF(10);
		test.union(1, 9);
		test.union(3, 9);
		test.union(5, 6);
		Boolean check = test.connected(1, 9);
		System.out.println(check);
		check = test.connected(1,3);
		System.out.println(check);

	}

}
