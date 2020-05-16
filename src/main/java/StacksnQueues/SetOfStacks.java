package StacksnQueues;

import java.util.ArrayList;
import java.util.List;

import CtCILibrary.MyStack;

public class SetOfStacks {
	
	public static ArrayList<MyStack> stacks =  new ArrayList<MyStack>();
	
	public int currentThreshold=5;
	
	public int noOfStacks;
	
	private static int currentStack() {
		int n = stacks.size();
		return n-1;
	}
	
	public static void main(String[] args) {
		
		for(int i=1 ;i <= 12; i++) {
			int currentStack = currentStack();
			if(currentStack < 0 || (int) stacks.get(currentStack).threshold == 5 ) {
				MyStack<Integer> xx = new MyStack<>();
				stacks.add(xx);
				xx.push(i);
				
			} else {
				stacks.get(currentStack).push(i);
			}
		}
	}
	
	

}
