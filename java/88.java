class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        while (p2 < n) {
        	if (p1 == (m+p2)) {
        		for (int i=0;i<(n-p2);i++) {
        			nums1[i+p1] = nums2[p2+i];
        		}
        		break;
        	}
        	if (nums2[p2]<nums1[p1]) {
        		for (int i=m+n-1;i>p1;i--) {
        			nums1[i] = nums1[i-1];
        		}
                nums1[p1] = nums2[p2];
        		p2 += 1;
        		p1 += 1;

        	} else {
                p1 += 1;
        	}
        }
    }
}