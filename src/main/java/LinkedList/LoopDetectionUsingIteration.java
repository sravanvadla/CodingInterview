package LinkedList;

import java.util.HashMap;

import CtCILibrary.SingleLinkedList;

public class LoopDetectionUsingIteration {
	

	private static int getNodeAtBeginningOfLoop(SingleLinkedList head) {
		
		SingleLinkedList runner1 = head;
		SingleLinkedList runner2 = head;
		while(true) {
			runner1 = runner1.next;
			runner2 = runner2.next.next;
			if(runner1.data == runner2.data) {
				while(true) {
					if(hash.containsKey(runner1.data))
						return runner1.data;
					else {
						hash.put(runner1.data, 1);
					}
					runner1 = runner1.next;	
				}
			}
		}
		
	}

	
	private static boolean isLoopExists(SingleLinkedList head) {

		SingleLinkedList runner1 = head;
		SingleLinkedList runner2 = head;
		while(true) {
			runner1 = runner1.next;
			runner2 = runner2.next.next;
			if(runner1.data == runner2.data)
				return true;
			else if (runner1 == null || runner2 ==null)
				return false;
		}
		
	}

	
	
	public static void main(String[] args) {
		SingleLinkedList first = new SingleLinkedList(0);
		SingleLinkedList third = null;

		SingleLinkedList head = first;
		SingleLinkedList second = head;
		for (int i = 1; i < 6; i++) {
			second = new SingleLinkedList(i);
			if(i == 3)
				third = second;
			first.setNext(second);
			second.setNext(null);
			first = second;
		}
		first.next = third;
//		head.printForward(head);
		boolean loopExists = isLoopExists(head);
		if(loopExists) {
			int res = getNodeAtBeginningOfLoop(head);
			System.out. println(" beginning integer of loop is  " +  res );
		}
			
//		head.printForward(head);
		
	
	}







}
