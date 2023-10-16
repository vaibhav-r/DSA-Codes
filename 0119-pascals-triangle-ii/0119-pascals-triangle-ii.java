class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<Integer> row = new ArrayList<>();
        long prev = 1;
        
        row.add(1);
        for (int k = 1; k <= rowIndex; k++) {
            long curr = (prev * (rowIndex - k + 1)) / k;
            row.add((int)curr);
            prev = curr;
        }
        
        return row;
    }
}