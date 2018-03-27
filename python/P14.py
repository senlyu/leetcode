# use others solution
# learned the zip and enumerate
class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:
            return ""
        for i, le in enumerate(zip(*strs)):
            if len(set(le)) > 1:
                return strs[0][:i]
        else:
            return min(strs)