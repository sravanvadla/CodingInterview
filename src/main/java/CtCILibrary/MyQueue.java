package CtCILibrary;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyQueue<T> {
	
	private static class QueueNode<T> {
		public T data;
		public QueueNode<T> next = null;
		
		public QueueNode(T info) {
			this.data = info;
		}
		
	}
	
	private QueueNode<T> front = null;
	private QueueNode<T> rear = null;
	
	public void add(T item) {
		QueueNode<T> newNode = new QueueNode(item);
		if(front == null) {
			front = newNode;
			rear = newNode;
		}
		else  {
			rear.next = newNode;
			rear = newNode;
		}
		
		
	}
	
	public void remove() {
		if(front == null)
			throw new EmptyStackException();
		else {
			front = front.next;
		}
	}
	
	public T peek() {
		if(front == null)
			throw new NoSuchElementException();
		else  {
			return front.data;
		}
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public void printQueue() {
		QueueNode<T> temp = front;
		while(temp != null) {
			System.out.print( temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}
