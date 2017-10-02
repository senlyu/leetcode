'''
class Solution(object):
    def minWindow(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        def moveStart(start):
            while s[start] not in ht:
                start += 1
                if start == len(s):
                    return ''
            return start
        def moveEnd(start, end):

            newht = ht.copy()
            if newht[s[start]] == 1:
                del newht[s[start]]
            else:
                newht[s[start]] -= 1
            if not newht:
                return start + 1
            while newht:
                if end == len(s):
                    return ''
                if s[end] in newht:
                    if newht[s[end]] == 1:
                        del newht[s[end]]
                    else:
                        newht[s[end]] -= 1
                end += 1
            return end

        if s == '' or t == '' or len(t) > len(s):
            return ''
        ht = dict()
        for i in range(len(t)):
            if t[i] not in ht:
                ht[t[i]] = 1
            else:
                ht[t[i]] += 1
        start = 0
        start = moveStart(start)
        if start == '':
            return ''
        end = start + 1
        end = moveEnd(start, end)
        if end == '':
            return ''
        minlen = end - start
        now = start + 1
        
        while now < len(s):
            newstart = moveStart(now)
            if newstart == '':
                break
            newend = moveEnd(newstart, newstart + 1)
            if newend == '':
                break
            if newend - newstart < minlen:
                start = newstart
                end = newend
                minlen = newend - newstart
            now = newstart + 1
        print(start, end)
        return s[start : end]

s = Solution()
print(s.minWindow("ADOBECODEBANC","a"))
'''
import collections
def minWindow(s, t):
    need, missing = collections.Counter(t), len(t)
    i = I = J = 0
    for j, c in enumerate(s, 1):
        missing -= need[c] > 0
        need[c] -= 1
        print('------------------')
        if not missing:
            while i < j and need[s[i]] < 0:
                need[s[i]] += 1
                i += 1
            if not J or j - i <= J - I:
                I, J = i, j
    return s[I:J]


print(minWindow("ADDBCADBC","ABC"))














