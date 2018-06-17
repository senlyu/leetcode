class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i=0;i<s.length();i++) {
        	int newCount = map.getOrDefault(s.charAt(i), 0) + 1;
        	map.put(s.charAt(i), newCount);
        }
        boolean odd = true;
        int sums = 0;
        for (int val:map.values()) {
        	if (odd&&(val%2==1)) {
        		sums+=val;
                odd=false;
        	} else {
        		if (!odd&&(val%2==1))
        		    sums+=val-1;      	
        	}
        	if (val%2==0)
        		sums+=val;
        }
        return sums;
    }
}