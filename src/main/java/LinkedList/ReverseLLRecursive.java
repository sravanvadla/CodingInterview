package LinkedList;

import CtCILibrary.SingleLinkedList;

public class ReverseLLRecursive {
	
	public static SingleLinkedList last;
	
	private static SingleLinkedList reverseLinkedList(SingleLinkedList head ) {

		if(head == null)
			return head;
		if(head.next == null) {
			last = head;
			return head;
		}
		else  {
			SingleLinkedList xx = reverseLinkedList(head.next);
			head.next = null;
			System.out.println(xx.data);
			xx.next = head;	
			return head;
		}
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
		SingleLinkedList x = reverseLinkedList(head);
		head.printForward(last);

	
	
	}


}

