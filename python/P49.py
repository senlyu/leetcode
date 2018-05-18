class Solution(object):
    '''
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        def compare(a,b):
            #print(a,b)
            if b == {}:
                if a == {}:
                    return True
                else:
                    return False
            for ele in b:
                if ele not in a:
                    return False
                else:
                    if a[ele] < b[ele]:
                        return False
                    else:
                        a[ele] -= b[ele]
                        if a[ele] == 0:
                            del a[ele]
            #print(hta)
            if a == {}:
                return True
            else:
                return False
        n = len(strs)
        if n < 2:
            return [strs]
        results = [i for i in range(n)]
        htstrs = list()
        for i in range(n):
            htstrsele = dict()
            for j in range(len(strs[i])):
                if strs[i][j] in htstrsele:
                    htstrsele[strs[i][j]] += 1
                else:
                    htstrsele[strs[i][j]] = 1
            htstrs.append(htstrsele)

        #print(htstrs)
        for i in range(n):
            for j in range(i+1,n):
                #print(i, j, compare(strs[i], strs[j]))
                if results[j] == j:
                    a = htstrs[i].copy()
                    b = htstrs[j].copy()
                    if compare(a, b):
                        results[j] = results[i]
        #print(results)
        i = 0
        output = list()
        while i < n:
            outputele = list()
            for j in range(n):
                if results[j] == i:
                    outputele.append(strs[j])
            #print(outputele)
            if outputele != []:
                output.append(outputele)
            i += 1
        return output
    '''
    def groupAnagrams(self, strs):
        dic = {}
        for item in sorted(strs):
            sortedItem = ''.join(sorted(item))
            #print(sortedItem)
            #print(dic.get(sortedItem, []))
            dic[sortedItem] = dic.get(sortedItem, []) + [item]
            print(dic)
        return dic.values()
s = Solution()
print(s.groupAnagrams(["tea","","eat","","tea",""]))
#print(s.groupAnagrams([]))
#print(s.groupAnagrams(["tea","and","ace","ad","eat","dans"]))