package easy;

import java.util.LinkedList;

/*
Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
Notes:
You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
*/
public class ImplementQueueUsingStacks {
	class MyQueue {
		private LinkedList<Integer> stack1 = new LinkedList<Integer>(),
				stack2 = new LinkedList<Integer>();

		// Push element x to the back of queue.
		public void push(int x) {
			stack1.addFirst(x);
		}

		// Removes the element from in front of queue.
		public void pop() {
			if (stack2.isEmpty()) {
				for (int i : stack1)
					stack2.addFirst(i);
				stack1.clear();
			}
			stack2.removeFirst();
		}

		// Get the front element.
		public int peek() {
			if (stack2.isEmpty()) {
				for (int i : stack1)
					stack2.addFirst(i);
				stack1.clear();
			}
			return stack2.getFirst();
		}

		// Return whether the queue is empty.
		public boolean empty() {
			return stack1.isEmpty() && stack2.isEmpty();
		}
	}
}
