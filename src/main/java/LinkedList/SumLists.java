package LinkedList;

import CtCILibrary.SingleLinkedList;

public class SumLists {


	private static void sumLists(SingleLinkedList head, int i) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {

		SingleLinkedList first = new SingleLinkedList(0);
		SingleLinkedList first1 = new SingleLinkedList();
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
	    sumLists(head, 5);
		System.out. println(" after deleting middle element  " );
		head.printForward(head);
		
	}


}
