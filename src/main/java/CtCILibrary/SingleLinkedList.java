package CtCILibrary;

public class SingleLinkedList {

	public SingleLinkedList next = null;
	public int data;

	public SingleLinkedList(int info) {
		data = info;

	}

	public void setNext(SingleLinkedList post) {
		this.next = post;
	}


	public void printForward(SingleLinkedList head) {
		SingleLinkedList temp = head;
		while(temp.next != null) {
			System.out.println( temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
