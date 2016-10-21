package easy;

import java.util.LinkedList;

/*
 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {
	class Stack<T> {
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

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char ch : s.toCharArray()) {
			switch (ch) {
			case '{':
				stack.push(ch);
				break;
			case '(':
				stack.push(ch);
				break;
			case '[':
				stack.push(ch);
				break;
			case '}':
				if (stack.peek() != null && stack.peek() == '{') {
					stack.pop();
					break;
				} else
					return false;
			case ')':
				if (stack.peek() != null && stack.peek() == '(') {
					stack.pop();
					break;
				} else
					return false;
			case ']':
				if (stack.peek() != null && stack.peek() == '[') {
					stack.pop();
					break;
				} else
					return false;
			default:
				break;
			}

		}
		if (!stack.isEmpty())
			return false;
		return true;
	}
}
