/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode now = head;
        

        while (now!=null&&now.val==val)
        	now = now.next;
        if (now==null) return now;
        head = now;


        while (now.next!=null) {
        	while (now.next!=null&&now.next.val==val)
        		now.next = now.next.next;
        	now = now.next;
        	if (now==null)
        		break;
        }


        return head;
    }
}





class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode now = head;
        

        while (now!=null&&now.val==val)
        	now = now.next;
        if (now==null) return now;
        head = now;

        while (now.next!=null) {
        	if (now.next.val==val) {
        		now.next = now.next.next;
        	} else {
        		now = now.next;
        	}
        }
        return head;
    }
}

