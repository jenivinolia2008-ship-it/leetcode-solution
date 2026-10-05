class Solution {
    public void setZeroes(int[][] matrix) {

        int rowsize = matrix.length;
        int colsize = matrix[0].length;

        boolean row[] = new boolean[rowsize];
        boolean col[] = new boolean[colsize];

        // Find all zeroes
        for (int i = 0; i < rowsize; i++) {
            for (int j = 0; j < colsize; j++) {

                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Set rows and columns to zero
        for (int i = 0; i < rowsize; i++) {
            for (int j = 0; j < colsize; j++) {

                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}