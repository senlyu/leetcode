class Solution {
    public boolean isPalindrome(String s) {
        int head = 0;
        int end = s.length()-1;
        char chead, cend;
        while (head<end) {
            chead = s.charAt(head);
            cend = s.charAt(end);
        	if (!Character.isLetterOrDigit(chead)) {
        		head++;
        	} else {
        		if (!Character.isLetterOrDigit(cend)) {
        			end--;
        		} else {
        			if (Character.toLowerCase(chead)!=Character.toLowerCase(cend)) {
        				return false;
        			}
        			head++;
        			end--;
        		}
        	}
        }
        return true;
    }
}