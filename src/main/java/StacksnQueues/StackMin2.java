package StacksnQueues;

import java.util.EmptyStackException;

public class StackMin2 {
	
	public class StackNode {
		int data;
		StackNode next;
		
		public StackNode(int info) {
			this.data = info;
			this.next = null;
		}
		
	}
	
	public StackNode top = null;
	
	public void push(int data ) {
			StackNode newNode = new StackNode(data);
			newNode.next = top;
			top = newNode; 
	}
	
	public int peek() {
		if(top == null)
			throw new EmptyStackException();
		else 
			return top.data;
	}
	
	public void pop() {
		if(top == null)
			throw new EmptyStackException();
		else 
			top = top.next;
	}
	
}
