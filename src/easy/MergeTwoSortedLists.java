package easy;

import utils.ListNode;

/*
 Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val > l2.val) {
			ListNode temp = l1;
			l1 = l2;
			l2 = temp;
		}
		ListNode l3 = l1, head = l3, p = l1.next, q = l2;
		while (p != null && q != null) {
			if (p.val <= q.val) {
				head.next = p;
				head = head.next;
				p = p.next;
			} else {
				head.next = q;
				head = head.next;
				q = q.next;
			}
		}
		if (p == null) {
			head.next = q;
		} else {
			head.next = p;
		}
		return l3;
		/*
		 * if(l1==null) return l2; if(l2==null) return l1; if(l1.val>l2.val){
		 * ListNode temp = l1; l1 = l2; l2 = temp; } ListNode prep = l1,p =
		 * prep.next, preq = l2,q = preq.next; while(q!=null&&p!=null){
		 * if(preq.val<=p.val){ preq.next = p; prep.next = preq; prep =
		 * prep.next; preq = q; q = q.next; }else{
		 * while(p!=null&&p.val<preq.val){ prep = p; p = p.next; } } }
		 * if(p==null){ prep.next = preq; }else{ while(p!=null&&p.val<preq.val){
		 * prep = p; p = p.next; }preq.next = prep.next; prep.next = preq;
		 * }return l1;
		 */
	}
}
