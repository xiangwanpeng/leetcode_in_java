package easy;

import java.util.LinkedList;

/*
 Implement the following operations of a stack using queues.

 push(x) -- Push element x onto stack.
 pop() -- Removes the element on top of the stack.
 top() -- Get the top element.
 empty() -- Return whether the stack is empty.
 Notes:
 You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
 Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
 You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 Update (2015-06-11):
 The class name of the Java function had been updated to MyStack instead of Stack.
 */
public class ImplementStackUsingQueues {
	class MyStack {
		private LinkedList<Integer> queue1 = new LinkedList<Integer>(),
				queue2 = new LinkedList<Integer>();

		// Push element x onto stack.
		public void push(int x) {
			queue1.addFirst(x);
		}

		// Removes the element on top of the stack.
		public void pop() {
			while (queue1.size() != 1)
				queue2.addFirst(queue1.removeLast());
			queue1.removeLast();
			while (!queue2.isEmpty())
				queue1.addFirst(queue2.removeLast());
		}

		// Get the top element.
		public int top() {
			while (queue1.size() != 1)
				queue2.addFirst(queue1.removeLast());
			int top = queue1.getLast();
			queue2.addFirst(queue1.removeLast());
			while (!queue2.isEmpty())
				queue1.addFirst(queue2.removeLast());
			return top;
		}

		// Return whether the stack is empty.
		public boolean empty() {
			return queue1.isEmpty();
		}
	}
}
