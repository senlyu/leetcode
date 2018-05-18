class Solution(object):
    def findSubstring(self, s, words):
        """
        :type s: str
        :type words: List[str]
        :rtype: List[int]
        """
        a = dict()
        
        for i in range(len(words)):
            if words[i] not in a:
                a[words[i]] = 1
            else:
                a[words[i]] += 1
        k = len(words[0])
        n = len(s)
        result = []
        for i in range(k):
            l = r = i
            b = a.copy()
            print('n', 'k',n,k)
            while r < n:
                print('s',r)
                if s[r:r+k] not in b:
                    l = r = r + k
                    b = a.copy()
                    print(1, l, r)
                else:
                    if b[s[r:r+k]] > 0:
                        b[s[r:r+k]] -= 1
                        r = r + k
                        print(2, l, r)
                    else:
                        if b[s[r:r+k]] == 0:
                            temp = s[r:r+k]
                            print('sixunhuan', l, r, k)
                            print(s[r:r+k])
                            while s[l:l+k] != temp:
                                if s[l:l+k] in b:
                                    b[s[l:l+k]] += 1
                                l = l + k
                            l = l + k
                            r = r + k
                            print(3, l, r)
                    for ele in b:
                        if b[ele] != 0:
                            print(4, ele, l, r)
                            break
                    else:
                        print(5, i, l, r)
                        result.append(l)
                        l = l + k
                        r = l
                        b = a.copy()
        return result
                    
si = Solution()
print(si.findSubstring("barfoofoobarthefoobarman",["bar","foo",'the']))
