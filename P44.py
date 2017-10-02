class Solution(object):
    def isMatch(self, s, p):
        """
        :type s: str
        :type p: str
        :rtype: bool
        """
        slen = len(s)
        plen = len(p)
        if p == '' and s == '':
            return True
        if p == '' and s != '':
            return False
        if s == '':
            if set(list(p)) == set('*'):
                return True
            else:
                return False
        
        DP = [[False for _ in range(plen+1)] for __ in range(slen+1)]
        for i in range(slen+1):
            DP[i][0] = False
        for j in range(plen+1):
            DP[0][j] = set(list(p[0:j])) == set('*')
        DP[0][0] = True
        for i in range(1,slen+1):
            for j in range(1,plen+1):
                print(DP)
                if s[i-1] == p[j-1] or p[j-1] == '?':
                    DP[i][j] = DP[i-1][j-1]
                if p[j-1] == '*':
                    DP[i][j] = DP[i-1][j-1] or DP[i][j-1] or DP[i-1][j]
        
        return DP[slen][plen]





ss = Solution()
print(ss.isMatch('ccccc','*?****'))        