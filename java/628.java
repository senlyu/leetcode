class Solution {
    public int maximumProduct(int[] nums) {
        PriorityQueue<Integer> pqmax = new PriorityQueue<Integer>(4, new Comparator<Integer>() {
        	@override
        	public int compare(Integer a, Integer b) {
        		return b - a;
        	}
        });
        PriorityQueue<Integer> pqmin = new PriorityQueue<Integer>();
        for (int i=0;i<nums.length;i++) {
        	pqmax.add(nums[i]);
        	pqmin.add(nums[i]);
        	if (pqmax.size()>2)
        		pqmax.poll();
        	if (pqmin.size()>3)
        		pqmin.poll();
        }
        int[] a = new int[3];
        int i=0;
        while (pqmin.size()>0) {
            a[i] = pqmin.poll();
            i++;
        }
        if (a[2]>0) 
        	return (a[2]*Math.max(a[0]*a[1],pqmax.poll()*pqmax.poll()));
        else 
        	return a[2]*a[1]*a[0];

    }
}