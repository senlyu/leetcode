class Solution {
    public int[][] imageSmoother(int[][] M) {
        int sx = M.length;
        int sy = M[0].length;
        int[][] res = new int[sx][sy];
        int[] a = {-1,0,1};
        for (int i=0;i<sx;i++) {
        	for (int j=0;j<sy;j++) {
        		float sums = 0;
        		int t = 0;
        		for (int px:a) {
        			for (int py:a) {
        				if (inSize((i+px),(j+py),sx,sy)) {
        					sums += M[i+px][j+py];
        					t++;
        				}
        			}
        		}
        		res[i][j] = (int) Math.floor(sums/t);
        	}
        }
        return res;
    }

    public boolean inSize(int i, int j,int sx, int sy) {
    	if (i>=0&&i<sx&&j>=0&&j<sy)
    	    return true;
    	else
    		return false;
    }
}