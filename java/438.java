class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    	List<Integer> list = new ArrayList<>();
        for (int i=0;i<s.length()-p.length()+1;i++) {
        	if (isAna(s.substring(i,i+p.length()), p))
        		list.add(i);
        }
        return list;
    }
    private boolean isAna(String s, String p) {
    	char[] pA = p.toCharArray();
    	char[] sA = s.toCharArray();
        Arrays.sort(pA);
        Arrays.sort(sA);
    	for (int i=0;i<pA.length;i++) {
    		if (pA[i]!=sA[i])
    			return false;
    	}
    	return true;
    }
}