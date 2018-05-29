class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        int numRows = rowIndex + 1;
        if (numRows <= 0) {
            return triangle.get(triangle.size()-1);
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
        return triangle.get(triangle.size()-1);    
    }
}