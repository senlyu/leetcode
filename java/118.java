class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows <= 0) {
        	return triangle;
        }
        for (int i=1;i<=numRows;i++) {
            List<Integer> newRow = new ArrayList<Integer>();
            for (int j=0;j<i;j++) {
            	if (j==0 || j==i-1) {
            		newRow.add(1);
            	} else {
            		newRow.add(triangle.get(i-2).get(j-1)+triangle.get(i-2).get(j));
            	}
            }
            triangle.add(newRow);
        }
        return triangle;
    }
}