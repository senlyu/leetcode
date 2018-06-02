class Solution {
    public int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.length()==0) 
        	return 0;
        else
        	return trimmed.split("\\s+").length;
        /* '+' means 'at least one occurrence of the regex before it'.
           In this case it means at least one space character. */
    }
}