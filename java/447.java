class Solution {
    public int numberOfBoomerangs(int[][] points) {
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	int sums = 0;
        for (int i=0;i<points.length;i++) {
        	for (int j=0;j<points.length;j++) {
        		if (j==i) continue;
        		int newKey = cal(points[i], points[j]);
        		int newCount = map.getOrDefault(newKey, 0) + 1;
        		map.put(newKey, newCount);
        	}
        	for (int value:map.values()) {
        	    sums+=value*(value-1);
            }
            map.clear();
        }
        return sums;
    }
    private int cal(int[] p1, int[] p2) {
        int a = p1[0]-p2[0];
        int b = p1[1]-p2[1];
    	return a*a+b*b;
    }
}