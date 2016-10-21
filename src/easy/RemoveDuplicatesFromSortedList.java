package easy;

import utils.ListNode;

/*
 Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return head;
		ListNode p = head, q = p.next;
		p.next = null;
		while (q != null) {
			if (q.val != p.val) {
				p.next = q;
				p = q;
				q = q.next;
				p.next = null;
			} else
				q = q.next;
		}
		return head;
	}
}
