class Solution {
    public int islandPerimeter(int[][] grid) {
        int oneCount = 0;
        int conbineCount = 0;
        int x = grid.length;
        int y = grid[0].length;
        for (int i=0;i<x;i++) {
        	for (int j=0;j<y;j++) {
        		if (grid[i][j]==1) {
        			oneCount++;
        			if (i+1<x&&grid[i+1][j]==1)
        				conbineCount++;
        			if (j+1<y&&grid[i][j+1]==1)
        				conbineCount++;
        		}
        	}
        }
        return oneCount*4-conbineCount*2;
    }
}