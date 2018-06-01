class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i=0;i<nums.length;i++) {
        	int p = Math.abs(nums[i]) - 1;
            if (nums[p]>0) {
            	nums[p] = -nums[p];
            }
        }
        List<Integer> a = new ArrayList<Integer>();
        for (int i=0;i<nums.length;i++) {
        	if (nums[i]>0) {
        		a.add(i+1);
        	}
        }
        return a;
    }
}