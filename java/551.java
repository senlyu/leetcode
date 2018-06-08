class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        for (int i=0;i<s.length();i++) {
        	if (s.charAt(i)=='A') {
        		countA++;
        		countL = 0;
        		if (countA>=2)
        			return false;
        	} else {
        		if (s.charAt(i)=='L') {
        			countL++;
        			if (countL>=3) {
        				return false;
        			}
        		} else {
        			countL = 0;
        		}
        	}
        }
        return true;
    }
}


return !s.matches(".*LLL.*|.*A.*A.*");