# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class PriorityQueue(list):
    def __init__(self):
        self.pq = []
        self.keys = []
    def qsize(self):
        return len(self.pq)
    def get(self):
        self.swich(0, self.qsize()-1)
        self.sink()
        return self.pq.pop(), self.keys.pop() 
    def put(self, key, item):
        self.pq.append(item)
        self.keys.append(key)
        self.swim(self.qsize()-1)
    def swim(self, i):
        if i>0:
            while (self.keys[int(i/2)] > self.keys[i]) and (i > 0):
                self.swich(i, int(i/2))
                i = int(i/2)
    def sink(self):
        i = 0
        while (i*2<self.qsize()-1):
            j = i * 2
            if (j+1<self.qsize()-1) and (self.keys[i*2] > self.keys[i*2+1]):
                j += 1
            if self.keys[i] <= self.keys[j]:
                break
            self.swich(i, j)
            i = j
    def swich(self, i, j):
        ptemp = self.pq[i]
        self.pq[i] = self.pq[j]
        self.pq[j] = ptemp
        ktemp = self.keys[i]
        self.keys[i] = self.keys[j]
        self.keys[j] = ktemp

class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """
        pq = PriorityQueue()
        result = end = ListNode(0)
        for li in lists:
            if li != None:
                pq.put(li.val, li)
                li = li.next
        while pq.qsize() > 0:
            now = pq.get()[0]
            end.next = now
            end = end.next
            if now.next != None:
                pq.put(now.next.val, now.next)
        return result.next
s