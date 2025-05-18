class UnionFind:
    def __init__(self, size):
        self.pa = [x for x in range(size)]
        self.rank = [0] * size
        
    def find(self, x):
        p = self.pa[x]
        if p != self.pa[p]:
            self.pa[x] = self.find(p)
            return self.pa[x]
        return p
        
    def unite(self, x, y):
        x_p = self.find(x)
        y_p = self.find(y)
        if x_p == y_p:
            return
        if self.rank[x_p] > self.rank[y_p]:
            self.pa[y_p] = x_p
        elif self.rank[x_p] < self.rank[y_p]:
            self.pa[x_p] = y_p
        else:
            self.pa[y_p] = x_p
            self.rank[x_p] += 1
        

n = 5  # Let there be 5 persons with ids 0, 1, 2, 3, and 4
dus = UnionFind(n)

dus.unite(0, 2)  # 0 is a friend of 2
dus.unite(4, 2)  # 4 is a friend of 2
dus.unite(3, 1)  # 3 is a friend of 1

# Check if 4 is a friend of 0
if dus.find(4) == dus.find(0):
    print('Yes')
else:
    print('No')

# Check if 1 is a friend of 0
if dus.find(1) == dus.find(0):
    print('Yes')
else:
    print('No')
