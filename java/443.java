class Solution {
    public int compress(char[] chars) {
    	if (chars.length<2)
    		return chars.length;
        int i = 0;
        int p = 0;
        while (i<chars.length) {
        	int count = 1;
        	chars[p++] = chars[i];
        	while (i+1<chars.length&&chars[i]==chars[i+1]) {
        		i++;
        		count++;
        		if ((i+1)>=chars.length)
        			break;
        	}
        	i++;
        	if (count>1) {
        		for (char c:Integer.toString(count).toCharArray()) {
        			chars[p++] = c;
        		}
        	}
        }
        return p;
    }
}