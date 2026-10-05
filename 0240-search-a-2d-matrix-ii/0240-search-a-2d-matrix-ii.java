class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rowlen = matrix.length;
        int colen = matrix[0].length;

        int i = 0;
        int j = colen - 1;

        while (i < rowlen && j >= 0) {

            if (matrix[i][j] == target) {
                return true;
            }
            else if (target < matrix[i][j]) {
                j--;
            }
            else {
                i++;
            }
        }

        return false;
    }
}