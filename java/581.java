class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        if (n<2) 
        	return 0;
        int left=0;
        int right=0;
        int min=0;
        int max=0;
        for (int i=1;i<n;i++) {
        	if (nums[i]>=nums[max]) {
        		if (left==right) {
        			left += 1;
        			right += 1;
        			min += 1;
        		}
        		max = i;
        	} else {
        		if (nums[i]>=nums[min]) {
        			right = i;
        		} else {
        			right = i;
        			while(left>0&&nums[i]<nums[left-1]) {
        				left -= 1;
        				if (left==0)
        					break;
        			}
        			min = i;
        		}
        	}
        }
        if (right==left)
            return 0;
        else
            return (right-left+1);
    }
}
