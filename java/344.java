class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        if (n<2)
        	return s;
        for (int i=0;i<n;i++) {
        	sb.insert(0, s.charAt(i));
        }
        return sb.toString();
    }
}