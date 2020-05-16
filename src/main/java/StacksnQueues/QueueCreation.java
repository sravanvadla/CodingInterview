package StacksnQueues;

import java.util.Queue;

import CtCILibrary.MyQueue;

public class QueueCreation {
	
	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue();
		
		for(int i =1 ; i<6; i++) {
			queue.add(i);
		}
		
		queue.printQueue();
			
		queue.remove();
		
		queue.printQueue();
	}

}
