package easy;

import utils.ListNode;

/*
 Given a linked list, determine if it has a cycle in it.

 Follow up:
 Can you solve it without using extra space?
 */
public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;
		ListNode quick = head.next.next, slow = head.next;
		while (quick != null) {
			if (quick == slow)
				return true;
			if (quick.next == null)
				return false;
			else {
				slow = slow.next;
				quick = quick.next.next;
			}
		}
		return false;
	}
}
