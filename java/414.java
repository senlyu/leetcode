class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> s = new HashSet<>();
        for (int i:nums) {
        	if (!s.contains(i)) {
        		s.add(i);
        		pq.offer(i);
        		if (pq.size()>3)
        			pq.poll();
        	}
        } 
        if (pq.size() < 3) {
        	while (pq.size()>1) {
        		pq.poll();
        	}
        }
        return pq.peak();
    }
}