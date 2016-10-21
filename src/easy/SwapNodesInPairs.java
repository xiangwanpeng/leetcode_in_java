package easy;

import utils.ListNode;

/*
 Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */
public class SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode p = head, h = p, q = head.next;
		p.next = q.next;
		q.next = p;
		head = q;
		if (p.next != null) {
			p = p.next;
			q = p.next;
		} else
			return head;
		while (q != null) {
			p.next = q.next;
			q.next = p;
			h.next = q;
			h = p;
			p = p.next;
			if (p != null)
				q = p.next;
			else
				return head;
		}
		return head;
	}
}
