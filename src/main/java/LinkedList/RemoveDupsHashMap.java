package LinkedList;

import org.apache.commons.collections4.map.HashedMap;
import CtCILibrary.SingleLinkedList;

public class RemoveDupsHashMap {

	private static void removeDuplicates(SingleLinkedList head) {
		HashedMap<Integer, Integer> hashMap = new HashedMap<>();
		SingleLinkedList current = head;
		SingleLinkedList temp = null;
		while (current != null) {
			if (hashMap.get(current.data) == null) {
				hashMap.put(current.data, 1);
				temp = current;
			} else if (hashMap.get(current.data) > 0 && current.next != null) {
				temp.next = current.next;
			} else {
				temp.next = null;
			}
			current = current.next;

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
		System.out.println(" after modification ");
		head.printForward(head);

	}

}
