package easy;

import utils.ListNode;

/*
 Given a singly linked list, determine if it is a palindrome.

 Follow up:
 Could you do it in O(n) time and O(1) space?
 */
public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
			return true;
		int length = 1;
		ListNode p = head, q = null, r = new ListNode(0);
		while (p.next != null) {
			length++;
			p = p.next;
		}
		p = head;
		for (int i = 0; i < length / 2; i++) {
			p = p.next;
		}
		if (length % 2 == 1)
			p = p.next;
		r.next = null;
		while (p != null) {
			q = p.next;
			p.next = r.next;
			r.next = p;
			p = q;
		}
		p = head;
		q = r.next;
		while (q != null) {
			if (p.val != q.val)
				return false;
			p = p.next;
			q = q.next;
		}
		return true;
	}
}
