/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
    	ListNode p = head;
    	ListNode now = null;
    	while (head!=null) {
    		p = head;
    		head = head.next;
    		p.next = now;
    		now = p;
    	}
    	return now;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
    	if (head==null||head.next==null) {
    		return head;
    	}
    	ListNode nextNode = head.next;
    	ListNode newHead = reverseList(nextNode);
    	nextNode.next = head;
    	head.next = null;
    	return newHead;
    }
}
