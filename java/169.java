class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int rem = 0;
        for (int num:nums) {
        	if (count == 0) 
        		rem = num;
        	if (num != rem)
        		count--;
        	else
        		count++;
        }
        return rem;
    }
}