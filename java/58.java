class Solution {
    public int lengthOfLastWord(String s) {
        String[] str1 = s.split(" ");
        if (str1.length==0)
        	return 0;
        return str1[str1.length-1].length();
    }
}