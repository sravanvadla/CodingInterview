package CtCILibrary;

import java.util.EmptyStackException;

import org.apache.poi.util.SystemOutLogger;

public class MyStack<T> {
	
	private static class StackNode<T> {
		
		public T data;
		public StackNode<T> next = null;	
		
		public StackNode(T data) {
			this.data = data;
		}
		
	}
	
	public T threshold;

	private StackNode<T> top;
	
	

	public T top() {
		if(top == null)
			throw new EmptyStackException();
		T item = top.data;
		return item;
			
	}
	
	public T pop() {
		if(top == null) 
			throw new EmptyStackException();
		T item = top.data;
		top = top.next;
		return item;
		
	}
	
	public void push(T item) {
		StackNode<T> newNode =  new StackNode(item);
		newNode.next = top;
		top = newNode;
	}
	
	public T peek(StackNode<T> top) {
		if(top == null) throw new EmptyStackException();
		return top.data;
	}
	
	public boolean isEmpty() {
		return top== null; 
	}
	
	public void printStack() {
		StackNode<T> temp = top;
		while(temp != null) {
			System.out.print( temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}
