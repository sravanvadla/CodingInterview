package LinkedList;

import CtCILibrary.SingleLinkedList;

public class DeleteMiddleNode {
	
	
	private static void deleteMiddle(SingleLinkedList middleNode) {
		
		SingleLinkedList current = middleNode;
		while(current.next.next != null) {
			current.data = current.next.data;
			current = current.next;
		}
		current.data = current.next.data;
		current.next = null;
	}
	
	public static void main(String[] args) {

		SingleLinkedList first = new SingleLinkedList(0);
		SingleLinkedList head = first;
		SingleLinkedList second = head;
		for (int i = 1; i < 6; i++) {
			second = new SingleLinkedList(i );
			first.setNext(second);
			second.setNext(null);
			first = second;
		}
		head.printForward(head);
	    deleteMiddle(head.next.next);
		System.out. println(" after deleting middle element  " );
		head.printForward(head);

	}

}
