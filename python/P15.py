# O(N*N)
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        def twoSum(target, numlist):
            result = False
            di = dict()
            num1, num2 = list(), list()
            for i in range(len(numlist)):
                if numlist[i] not in di:
                    di[target - numlist[i]] = 1
                else:
                    num1.append(numlist[i])
                    num2.append(target - numlist[i])
                    result = True
            return result, num1, num2
        solu = set()
        dpl = dict()
        connums = [(0 - nums[i]) for i in range(len(nums))]
        for i in range(len(nums)-2):
            if nums[i] not in dpl:
                copy = nums[i+1:]
                result, num1, num2 = twoSum(connums[i], copy)
                if result:
                    for j in range(len(num1)):
                        if (num1[j] not in dpl) and (num2[j] not in dpl):
                            solu.add((nums[i], num1[j], num2[j]))
                dpl[nums[i]] = 1
        return list(solu)