package easy;

import utils.ListNode;

/*
 Remove all elements from a linked list of integers that have value val.

 Example
 Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		ListNode L = new ListNode(0), p, q;
		L.next = head;
		p = L;
		q = L.next;
		while (q != null) {
			if (q.val == val) {
				p.next = q.next;
				q = q.next;
			} else {
				p = p.next;
				q = q.next;
			}
		}
		return L.next;
	}
}
