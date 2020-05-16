package StacksnQueues;

import CtCILibrary.MyStack;

public class StackFindMin {

	public static void main(String[] args) {
		
		int topOfMInStack = -1;
		
		MyStackData<Integer> stack = new MyStackData();
		StackMin2 minStack = new StackMin2();
		int[] arr = {5, 6, 3, 1};
		for(int x : arr) {
			stack.push(x);
		}
//		for(int i=0 ;i < 6; i++) {
//			stack.push(i+1);
//		}
		stack.printStack();
		System.out.println( " min is " + stack.min());
		stack.printStack();
		stack.pop();
		System.out.println( " min is " + stack.min());
		stack.printStack();
		
		
	
	}
}
