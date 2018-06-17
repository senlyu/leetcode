class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        String[] s = str.split(" ");
        if (s.length!=pattern.length())
        	return false;
        for (int i=0;i<pattern.length();i++) {
        	if (!map.containsKey(pattern.charAt(i)))
        		if (!map.containsValue(s[i]))
        			map.put(pattern.charAt(i), s[i]);
        		else
        			return false;
        	else
        		if (map.get(pattern.charAt(i)).equals(s[i]))
        			continue;
        		else
        			return false;
        }
        return true;
    }
}