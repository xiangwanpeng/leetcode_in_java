package easy;

import utils.ListNode;

/*
 Reverse a singly linked list.
 Hint:
 A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReverseLinkedList {
	// recursively
	public ListNode reverse(ListNode p, ListNode q) {
		ListNode r = q.next;
		q.next = p;
		if (r == null)
			return q;
		else {
			return reverse(q, r);
		}
	}

	public ListNode reverseList(ListNode head) {

		// recursively
		if (head == null || head.next == null)
			return head;
		ListNode temp = head.next;
		head.next = null;
		return reverse(head, temp);

		/*
		 * iteratively if(head==null) return head; ListNode p =
		 * head.next,q=null; head.next = null; while(p!=null){ q=p.next;
		 * p.next=head; head=p; p=q; } return head;
		 */
	}
}
