class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()
        result = nums[0] + nums[1] + nums[2] - target
        for i in range(len(nums)-2):
            start = i + 1
            end = len(nums) - 1
            
            while start < end:
                sums = nums[i] + nums[start] + nums[end]
                if abs(target - sums) < abs(target - result):
                    result = sums
                if (sums - target) > 0:
                    end -= 1
                else:
                    start += 1
        return result
