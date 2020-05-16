package LinkedList;

import org.apache.poi.util.SystemOutLogger;

import CtCILibrary.SingleLinkedList;

public class ReturnKthToLastIterative {

	private static int  getNthFromLast(SingleLinkedList head, int n) {

		SingleLinkedList slow = head;
		SingleLinkedList fast = head;
		for(int i=0; i < n; i++ )
			fast = fast.next;
		while(fast != null) {
			
			slow = slow.next;
			fast = fast.next;
		}
		
		System.out.println( " data at nth from end is " + slow.data);
		return slow.data;
	}

	
	public static void main(String[] args) {

		SingleLinkedList first = new SingleLinkedList(0);
		SingleLinkedList head = first;
		SingleLinkedList second = head;
		for (int i = 1; i < 4; i++) {
			second = new SingleLinkedList(i % 2);
			first.setNext(second);
			second.setNext(null);
			first = second;
		}
		head.printForward(head);
		int x = getNthFromLast(head, 3);

//		System.out.println(" nth element is  " + x);
	}

}
