package StacksnQueues;

import java.util.EmptyStackException;

import org.apache.poi.util.SystemOutLogger;

import CtCILibrary.MyStack;

public class MyStackData<T> extends MyStack<T>{
	
	private static class StackNode<T> {
		
		public T data;
		public StackNode<T> next = null;	
		
		public StackNode(T data) {
			this.data = data;
		}
		
	}

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
		if( (int)top.data >= stackMin2.top.data) {
			stackMin2.pop();
		}
		top = top.next;
		return item;
		
	}
	
	StackMin2 stackMin2 = new StackMin2();
	
	public void push(T item) {
		StackNode<T> newNode =  new StackNode(item);
		newNode.next = top;
		top = newNode;
		if(stackMin2.top == null) 
			stackMin2.push((int) item);
		else if((int)item < stackMin2.top.data) {
			stackMin2.push((int)item);
		}
	}
	
	public int min() {

		return stackMin2.peek();
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
