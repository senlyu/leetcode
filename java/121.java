class Solution {
    public int maxProfit(int[] prices) {
    	if (prices.length<=0) {
    		return 0;
    	}  
    	int[] diff = new int[prices.length-1];
        for (int i=0;i<diff.length;i++) {
        	diff[i] = prices[i+1] - prices[i];
        }
        int maxProfit = 0;
        int posProfit = 0;
        for (int i=0;i<diff.length;i++) {
        	if (posProfit >= 0) {
	            posProfit += diff[i];
            } else {
                posProfit = diff[i];
            }
            if (posProfit > maxProfit) {
	            maxProfit = posProfit;
	        }
        }
        return maxProfit;
    }
}