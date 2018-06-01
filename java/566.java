class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int sx = nums.length;
        int sy = nums[0].length;
        if (sx*sy!=r*c) 
        	return nums;
        int p1x = 0;
        int p1y = 0;
        int p2x = 0;
        int p2y = 0;
        int[][] nnums = new int[r][c];
        while (p1x<sx){
            nnums[p2x][p2y] = nums[p1x][p1y];
            p1y+=1;
            p2y+=1;
            if (p1y==sy) {
            	p1y = 0;
            	p1x +=1;
            }
            if (p2y==c) {
            	p2y = 0;
            	p2x +=1;
            }
        }
        return nnums;
    }
}