package datastructure.doublylinkedlist.insertion1;


public class LinkedList {
	Node head;
	
	public void append(int data) {
		Node new_node = new Node(data);
	
		Node last = head;
		new_node.next = null;
		if(head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		while(last.next != null) {
			last = last.next;
			
		}
		
		last.next = new_node;
		new_node.prev = last;
	}
	
	
	public void push(int data) {
		Node new_node = new Node(data);
		
		new_node.next = head;
		new_node.prev = null;
		head = new_node;
	}
	
	public void insertAfter(Node prev_node, int data) {
		Node new_node = new Node(data);
		
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		new_node.prev = prev_node;
		
		if(new_node.next != null) {
			new_node.next.prev = new_node;
		}							
	}
	
	
	public void insertBefore(Node n, int data) {
		Node new_node = new Node(data);
		
		if(n.prev == null) {
			push(data);
			return;
		}
		n.prev.next = new_node;
		new_node.prev = n.prev;
		new_node.next = n;
		n.prev = new_node;
		
		
		
	}
	
	
	
	public void printList() {
		if(head == null) {
			System.out.println("No Node Available");
		}
		Node current = head;
		while(current != null) {
			System.out.print(current + " ");
			current = current.next;
		}
		System.out.println();
		
	}
	
	
	
}
