class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
         int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;
        for (int top = 0; top < rows; top++) {
            int[] colSum = new int[cols];

            for (int bottom = top; bottom < rows; bottom++) {

                for (int col = 0; col < cols; col++) {
                    colSum[col] = colSum[col] + matrix[bottom][col];
                }

                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);

                int prefix = 0;

                for (int col = 0; col < cols; col++) {

                    prefix = prefix + colSum[col];

                    int required = prefix - target;

                    if (map.containsKey(required)) {
                        count = count + map.get(required);
                    }

                    map.put(prefix, map.getOrDefault(prefix, 0) + 1);
                }
            }
        }

        return count;
    }

    }