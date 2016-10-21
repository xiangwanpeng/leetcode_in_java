package easy;

import utils.ListNode;

/*
 Write a program to find the node at which the intersection of two singly linked lists begins.


 For example, the following two linked lists:

 A:          a1 ¡ú a2
 ¨K
 c1 ¡ú c2 ¡ú c3
 ¨J            
 B:     b1 ¡ú b2 ¡ú b3
 begin to intersect at node c1.


 Notes:

 If the two linked lists have no intersection at all, return null.
 The linked lists must retain their original structure after the function returns.
 You may assume there are no cycles anywhere in the entire linked structure.
 Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lengthA = 0, lengthB = 0;
		ListNode a = headA, b = headB;
		while (a != null) {
			lengthA++;
			a = a.next;
		}
		while (b != null) {
			lengthB++;
			b = b.next;
		}
		a = lengthA <= lengthB ? headA : headB;
		b = lengthA <= lengthB ? headB : headA;
		int dif = Math.abs(lengthA - lengthB);
		while (dif-- > 0)
			b = b.next;
		while (a != null && b != null && a != b) {
			a = a.next;
			b = b.next;
		}
		return a;
	}
}
