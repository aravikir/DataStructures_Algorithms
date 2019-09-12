package Algorithms1;

public class LinkedQueueOfStrings {

	private Node first, last;
	
	private class Node{
		String item;
		Node next;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void enqueue(String item) {
		// For Node implementation
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty()) {
			first = last;
		}
		else {
			oldlast.next = last;
		}
	}
	
	public String dequeue() {
		if(isEmpty()) {
			return "Nothing in Queue";
		}
		String item = first.item;
		first = first.next;
		if(isEmpty()) {
			last = null;
		}
		return item;
	}
	
	public static void main(String[] args) {
		LinkedQueueOfStrings ll = new LinkedQueueOfStrings();
		// Queuing up strings
		ll.enqueue("Hello");
		ll.enqueue("World!");
		ll.enqueue("This");
		ll.enqueue("is");
		ll.enqueue("a test");
		// Dequeuing strings
		System.out.print(ll.dequeue());
		System.out.println(" " + ll.dequeue());
		System.out.print(ll.dequeue());
		System.out.print(" " + ll.dequeue());
		System.out.println(" " + ll.dequeue());
		System.out.println(" " + ll.dequeue());
	}

}
