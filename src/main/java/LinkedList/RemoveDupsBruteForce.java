package LinkedList;

import CtCILibrary.LinkedListNode;
import CtCILibrary.SingleLinkedList;

public class RemoveDupsBruteForce {

	private static void removeDuplicates(SingleLinkedList head) {
		SingleLinkedList temp = head;
		while (temp != null) {
			int data = temp.data;
			SingleLinkedList current = temp;
			while (current.next != null) {
				if (current.next.data == data) {
					current.next = current.next.next;
				}
				else {
					current = current.next;
				}
			}
			temp = temp.next;
		}
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

		removeDuplicates(head);
		System.out.println( " after modification ");
		head.printForward(head);

	}

}
