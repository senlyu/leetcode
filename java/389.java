class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i=0;i<t.length();i++) {
            int newCount = map.getOrDefault(t.charAt(i), 0) + 1;
            map.put(t.charAt(i), newCount);
        }
        for (int i=0;i<s.length();i++) {
            if (map.containsKey(s.charAt(i))) {
                int newCount = map.get(s.charAt(i)) - 1;
                if (newCount<=0) 
                    map.remove(s.charAt(i));
                else
                    map.put(s.charAt(i), newCount);
            }
        }
        char result=' ';
        for (char key:map.keySet()) {
            result = key;
        }        
        return result;
    }
}