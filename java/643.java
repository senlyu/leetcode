class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxs = Double.NEGATIVE_INFINITY;
        for (int i=0;i<nums.length-k+1;i++) {
        	long sums = 0;
        	for (int j=0;j<k;j++) {
        		sums += nums[j+i];
        	}
        	maxs = Math.max(maxs, sums);
        }
        double res = maxs*1.0/k;
        return res;
    }
}