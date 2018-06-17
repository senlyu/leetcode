class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i=0;i<nums1.length;i++) {
            int newCount = map.getOrDefault(nums1[i], 0) + 1;
            map.put(nums1[i], newCount);
        }
        for (int i=0;i<nums2.length;i++) {
            if (map.containsKey(nums2[i])) {
                result.add(nums2[i]);
                int newCount = map.get(nums2[i]) - 1;
                if (newCount<=0) 
                    map.remove(nums2[i]);
                else
                    map.put(nums2[i], newCount);
            }
        }
        int[] results = new int[result.size()];
        for (int i=0;i<results.length;i++) {
            results[i] = result.get(i).intValue();
        }
        return results;
    }
}