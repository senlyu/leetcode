class Solution {
    public int missingNumber(int[] nums) {
        int sums = 0;
        for (int num:nums) {
        	sums += num;
        }
        int n = nums.length;
        return (n*(n+1)/2-sums);
    }
}