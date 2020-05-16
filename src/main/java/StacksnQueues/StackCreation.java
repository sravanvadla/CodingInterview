package StacksnQueues;

import CtCILibrary.MyStack;

public class StackCreation {
	
	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack();
		for(int i=0 ;i < 6; i++) {
			stack.push(i+1);
		}
		
		stack.printStack();
		
		stack.pop();
		
		stack.printStack();
		
		
	}
}