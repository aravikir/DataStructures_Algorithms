package Algorithms1;

public class LinkedStackOfStrings {

	private String[] s;
	private int N = 0;
	
	public LinkedStackOfStrings() {
		// creates array s of size 1
		s = new String[1];
	}
	
	//check if stack is empty
	public boolean isEmpty() {
		return N==0;
	}
	
	//stack item and resize stack if needed
	public void push(String item) {
		if (N == s.length) {
			resize(2*s.length);
		}
		s[N++] = item;
	}
	
	//resizing stack size
	public void resize(int capacity) {
		String[] copy = new String[capacity];
		for (int i=0; i<N; i++) {
			copy[i] = s[i];
		}
		s = copy;
	}
	
	//removing last item from stack
	public String pop() {
		String item = s[--N];
		s[N] = null;
		if (N>0 && N==s.length/4) {
			resize(s.length/2);
		}
		return item;
	}
	
	// Main code for trials
	public static void main(String[] args) {
		LinkedStackOfStrings ll = new LinkedStackOfStrings();
		// Creating Stack
		ll.push("Hello");
		ll.push("World");
		ll.push("This");
		ll.push("is");
		ll.push("a");
		ll.push("test");
		// Testing methods
		System.out.println(ll.isEmpty());
		System.out.println(ll.pop());
		System.out.println(ll.pop());
		System.out.println(ll.pop());
		System.out.println(ll.pop());
		System.out.println(ll.pop());
		System.out.println(ll.pop());
	}

}
