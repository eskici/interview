package interview.datastrutures.linkedlist;

public class LinkedList {

	private Node head;
	
	public void addNode(int data) {
		
		if(head == null) {
			head = new Node(data, null);
			return;
		}
		
		Node lastNode = head;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
		}
		
		Node newNode = new Node(data, null);
		lastNode.next = newNode;
	}
	
	public void addNodeAtFront(int data) {
		Node newNode = new Node(data);
		
		if (head != null) {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void addNodeAtEnd(int data) {
		Node lastNode = head;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}
		
		Node newNode = new Node(data, null);
		lastNode.next = newNode;
	}
	
	public void afterNode(Node prevNode, int data) {
		/* 1. Check if the given Node is null */
		if (prevNode == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		Node newNode = new Node(data);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	
	public void deleteNode(int data) {
		if (head == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		
		if(head.data == data) {
			head = null;
			return;
		}
		
		Node prevNode = head;
		while (prevNode.next != null && prevNode.next.data != data) {
			prevNode = prevNode.next;
		}
		
		Node deleteNode = prevNode.next;
		prevNode.next = deleteNode.next;
	}
	
	public void printList() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " - > ");
			temp = temp.next;	
		}
	}
}
