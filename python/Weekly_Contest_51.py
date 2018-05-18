class Solution(object):
    def calPoints(self, ops):
        """
        :type ops: List[str]
        :rtype: int
        """

        
        
        valid = list()

        sums = 0


        length = len(ops)
        for i in range(length):
            if ops[i] == 'C':
                now = (-1) * valid.pop()
            elif ops[i] == 'D':
                now = valid[-1] * 2
                valid.append(now)
            elif ops[i] == '+':
                now = valid[-1] + valid[-2]
                valid.append(now)
            else:
                now = int(ops[i])
                valid.append(int(ops[i]))
            print('now', now, 'sums', sums)
            sums = sums + now
        return sums
si = Solution()
answer = si.calPoints(["5","2","C","D","+"])
print(answer)