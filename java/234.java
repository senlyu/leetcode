/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
    	if (head==null||head.next==null)
    		return true;
        ListNode slow = head;
        ListNode fast = head.next;
        boolean flag = false;
        int count=1;
        while (fast.next!=null) {
        	count++;
        	slow = slow.next;
        	fast = fast.next;
        	if (fast.next==null) {
        		flag = true;
                break;
        	}
        	fast = fast.next;
        
        }
        if (flag) {
        	ListNode sf = slow.next;
        	ListNode sh = reverseList(head, count-1);
        	return compare(sh, sf, count-1);
        	//s-h == s-f
        } else {
        	ListNode sf = slow.next;
        	ListNode sh = reverseList(head, count);
        	//System.out.print(sh.val);
        	return compare(sh, sf, count);
        	//s-h == (s+1)-f
        }
    }
    private boolean compare(ListNode headA, ListNode headB, int count) {

    	while (count>0) {
    		if (headA.val==headB.val) {
    			//System.out.print(headA.val);
    			headA = headA.next;
    			headB = headB.next;
    			count--;
    			
    		} else {
    			return false;
    		}
    	}
    	return true;
    }
    private ListNode reverseList(ListNode node, int count) {
    	if (node==null||node.next==null||count==1)
    		return node;
    	ListNode nextNode = node.next;
    	ListNode newNode = reverseList(nextNode, count-1);
    	nextNode.next = node;
    	node.next = null;
    	return newNode;
    }
}