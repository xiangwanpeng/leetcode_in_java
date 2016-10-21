package easy;

import java.util.LinkedList;

/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
*/
class MyStack<T> {
	LinkedList<T> list = new LinkedList<T>();

	public void push(T t) {
		list.addFirst(t);
	}

	public T peek() {
		if (!list.isEmpty())
			return list.getFirst();
		return null;
	}

	public T pop() {
		if (!list.isEmpty())
			return list.removeFirst();
		return null;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}
}

public class MinStack {

	/** initialize your data structure here. */
	private LinkedList<Integer> list = new LinkedList<Integer>();

	private MyStack<Integer> minStack;

	public MinStack() {
		this.minStack = new MyStack<Integer>();
	}

	public void push(int x) {
		if (minStack.peek()==null||x <= minStack.peek())
			minStack.push(x);
		list.addFirst(x);
	}

	public void pop() {
		if (minStack.peek()!=null&&top() == minStack.peek())
			minStack.pop();
		list.removeFirst();
	}

	public int top() {
		return list.getFirst();
	}

	public int getMin() {
		return minStack.peek();
	}

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
