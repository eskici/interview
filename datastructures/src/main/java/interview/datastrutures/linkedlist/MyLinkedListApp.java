package interview.datastrutures.linkedlist;

public class MyLinkedListApp {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		
		list.addNodeAtFront(0);
		
		list.addNodeAtEnd(5);
		
		list.deleteNode(3);
		
		list.printList();
	}
}
