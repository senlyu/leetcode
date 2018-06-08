class Solution {
    public String reverseWords(String s) {
    	if (s.length()<2)
    		return s;
        char[] sArray = s.toCharArray();
        int j=-1;
        for (int i=1;i<sArray.length;i++) {
        	if (sArray[i]==' ') {
        		for (int ii=j+1;ii<=(i-j-2)/2+j+1;ii++) {
        			char place = sArray[ii];
        			sArray[ii] = sArray[i-ii+j];
        			sArray[i-ii+j] = place;
        			//System.out.print(ii);
        		}
        		j = i;
        	}
        }
        int i = sArray.length;
        for (int ii=j+1;ii<=(i-j-2)/2+j+1;ii++) {
        	char place = sArray[ii];
        	sArray[ii] = sArray[i-ii+j];
        	sArray[i-ii+j] = place;
        	//System.out.print(ii);
        }
        return String.valueOf(sArray);
    }
}