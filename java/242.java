class Solution {
    public boolean isAnagram(String s, String t) {
    	if (s.length()!=t.length())
    		return false;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i=0;i<s.length();i++) {
        	int newCount = map.getOrDefault(s.charAt(i), 0) + 1;
        	map.put(s.charAt(i), newCount);
        }
        for (int i=0;i<t.length();i++) {
        	int newCount = map.getOrDefault(t.charAt(i), 0) - 1;
        	if (newCount<0)
        		return false;
        	map.put(t.charAt(i), newCount);
        }
        return true;
    }
}