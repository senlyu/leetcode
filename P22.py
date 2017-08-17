class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """

        def step(i,j,s):
            if j == n:
                while len(s) != 2*n:
                    s = s + ')'
                    print(s)
                    strs.append(s)
                    return 0                
            if i > 0:
                s = s + ')'
                print(s)
                step(i-1,j,s)
                s = s[:-1]
            s = s + '('
            print(s)
            step(i+1,j+1,s)
            return 0
        strs = []
        s = ''
        step(0,0,s)
        return strs
s = Solution()
print(s.generateParenthesis(3))
