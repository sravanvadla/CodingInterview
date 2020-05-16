package LinkedList;

import CtCILibrary.SingleLinkedList;

public class ReturnKthToLastRecursive {

	static int countIndex = 0;

	private static void getNthFromLast(SingleLinkedList head, int index) {
		
		if(head == null)
			return ;
		
		getNthFromLast(head.next, index);
		countIndex = countIndex+1;
		if(index == countIndex) {
			System.out.println( "data is " + head.data);
		}
		
	}

	public static void main(String[] args) {

		SingleLinkedList first = new SingleLinkedList(1);
		SingleLinkedList head = first;
		SingleLinkedList second = head;
		for (int i = 2; i < 5; i++) {
			second = new SingleLinkedList(i );
			first.setNext(second);
			second.setNext(null);
			first = second;
		}
		head.printForward(head);
		getNthFromLast(head, 2);

//		System.out.println(" nth element is  " + x);
	}

}
