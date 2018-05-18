class Solution(object):
    def longestValidParentheses(self, s):
        """
        :type s: str
        :rtype: int
        """
        stack = []
        i = 0
        n = len(s)
        while i < len(s):
            if s[i] == '(':
                stack.append(i)
                i += 1
            else:
                if stack == []:
                    stack.append(i)
                    i += 1
                else:
                    if s[stack[len(stack)-1]] != '(':
                        stack.append(i)
                    else:
                        stack.pop()
                    i += 1
        print(stack)
        if stack == []:
            return n
        else:
            maxs = 0
            compare = -1
            for j in range(len(stack)):
                maxs = max(maxs, stack[j] - compare - 1)
                compare = stack[j]
            return max(maxs, n-stack[len(stack)-1]-1)
si = Solution()

print(si.longestValidParentheses(")()())()()("))

