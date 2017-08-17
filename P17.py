class Solution:
    # @return a list of strings, [s1, s2]
    def letterCombinations(self, digits):
        if '' == digits: return []
        kvmaps = {
            '2': 'abc',
            '3': 'def',
            '4': 'ghi',
            '5': 'jkl',
            '6': 'mno',
            '7': 'pqrs',
            '8': 'tuv',
            '9': 'wxyz'
        }
        result = ['']
        for i in range(len(digits)):
            newresult = list()
            for j in range(len(kvmaps[digits[i]])):
                for ele in result:
                    newele = ele + kvmaps[digits[i]][j]
                    newresult.append(newele)
            result = newresult
        
        return result