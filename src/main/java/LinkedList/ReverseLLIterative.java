package LinkedList;

import CtCILibrary.SingleLinkedList;

public class ReverseLLIterative {
	

	private static SingleLinkedList reverseLinkedList(SingleLinkedList head) {
		SingleLinkedList first = head;
		SingleLinkedList second = head.next; 
		SingleLinkedList temp;
		while(second != null) {
			if(first == head)
				first.next = null;
			temp = second.next;
			second.next = first;
			first = second;
			second = temp;
		}
		head = first;
		System.out.println(" result " + head);
		return head;
	}

	public static void main(String[] args) {

		SingleLinkedList first = new SingleLinkedList(1);
		SingleLinkedList head = first;
		SingleLinkedList second = head;
		for (int i = 2; i <= 6; i++) {
			second = new SingleLinkedList(i );
			first.setNext(second);
			second.setNext(null);
			first = second;
		}
		head.printForward(head);
//		reverseLinkedList(head);
		System.out. println(" after reversing the linked list  " );
		head.printForward(reverseLinkedList(head));

	
	}



}
