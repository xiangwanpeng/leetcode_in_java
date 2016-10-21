package easy;

import utils.ListNode;

/*
 Given a linked list, remove the nth node from the end of list and return its head.

 For example,

 Given linked list: 1->2->3->4->5, and n = 2.

 After removing the second node from the end, the linked list becomes 1->2->3->5.
 Note:
 Given n will always be valid.
 Try to do this in one pass.
 */
public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p = head, q = p;
		while (n-- > 0) {
			q = q.next;
		}
		if (q == null)
			return head.next;
		while (q.next != null) {
			p = p.next;
			q = q.next;
		}
		p.next = p.next.next;
		return head;
	}
}