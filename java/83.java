/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode now = head;
        while (now!=null) {
        	if (now.next==null) {
        		break;
        	}
        	while (now.next!=null&&now.val==now.next.val) {
        		now.next=now.next.next;
        	}
        	now = now.next;
        }
        return head;
    }
}