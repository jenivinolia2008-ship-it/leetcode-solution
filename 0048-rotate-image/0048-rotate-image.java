class Solution {
    public void rotate(int[][] matrix) {

        int size = matrix.length;

        // Transpose
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                int temp = matrix[i][j];

                matrix[i][j] = matrix[j][i];

                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < size; i++) {

            int j = 0;
            int k = size - 1;

            while (j < k) {

                int temp = matrix[i][j];

                matrix[i][j] = matrix[i][k];

                matrix[i][k] = temp;

                j++;
                k--;
            }
        }
    }
}