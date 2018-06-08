
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode now = head;
        ListNode help = head;
        now = head.next;
        head.next = head;
        while (now.next!=null) {
        	if (now.next==now) {
        		return true;
        	} else {
        		help = now;
        		now = now.next;
        		help.next = head;
        	}
        }
        return false;
    }
}