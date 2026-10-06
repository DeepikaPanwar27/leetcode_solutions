class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            int rowMin = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                rowMin = Math.min(rowMin, matrix[i][j]);
                }
                for (int j = 0; j < m; j++) {

                if (matrix[i][j] == rowMin) {
                     int colMax = Integer.MIN_VALUE;
                    for (int k = 0; k < n; k++) {
                        colMax = Math.max(colMax, matrix[k][j]);
                    }
                    if (matrix[i][j] == colMax) {
                        ans.add(matrix[i][j]);
                    }
                }
            }
        }

        return ans;
    }
}