'''
wrong!
think in this way.
1. we should start from the wide to high. because the wide is known.
2. when we change one side, we dont know what the other side is, so
we cannot elimite the possibility that if we change to a higher side
will it be more?
3. we should move the lower one, since that's the possible solution.

so, the reason i did it wrong is that i dont have a idea of the solution
and i dont know how to cut the leaves. 
'''

def maxArea(height):
    
    def cal(p1, p2):
        return abs(p1 - p2) * min(height[p1], height[p2])

    exchange = True
    p1 = 0
    p2 = len(height) - 1
    while (p1 - p2 != 1) and exchange:
        exchange = False
        for i in range(p1, p2):
            if cal(i, p2) > cal(p1, p2):
                exchange = True
                p1 = i
        for j in reversed(range(p1, p2)):
            if cal(p1, j) > cal(p1, p2):
                exchange = True
                p2 = j
    return p1, p2

