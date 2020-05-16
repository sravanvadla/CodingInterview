package LinkedList;

import CtCILibrary.SingleLinkedList;

public class PartitionUsingPivot {
	

	private static void partition(SingleLinkedList head, int n) {

		SingleLinkedList high = head;
		SingleLinkedList low = head;
		while(high != null) {
			if(high.next.data > n) {
				
			}
				
		}
		
	}

	public static void main(String[] args) {

		SingleLinkedList first = new SingleLinkedList(0);
		SingleLinkedList head = first;
		SingleLinkedList second = head;
		for (int i = 1; i < 6; i++) {
			if(i %2 == 0)
				second = new SingleLinkedList(i*3 );
			else 
				second = new SingleLinkedList(i );
			first.setNext(second);
			second.setNext(null);
			first = second;
		}
		head.printForward(head);
	    partition(head, 5);
		System.out. println(" after deleting middle element  " );
		head.printForward(head);
		
	}

}
