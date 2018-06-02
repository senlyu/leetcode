class Solution {
    public int firstUniqChar(String s) {
    	if (s.length()==0)
    		return -1;
        Map<Character, Integer> m = new HashMap();
        for (int i=0;i<s.length();i++) {
        	if (!m.containsKey(s.charAt(i)))
        	    m.put(s.charAt(i), i);
        	else
        		m.put(s.charAt(i), -1);
        }
        int min = s.length();
        for (int v:m.values()) {
        	if (v>=0)
        		min = Math.min(min, v);
        }
        if (min==s.length())
        	return -1;
        else
        	return min;
    }
}