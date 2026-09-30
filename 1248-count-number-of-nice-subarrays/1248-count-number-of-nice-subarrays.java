class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        return find(nums, k) - find(nums, k - 1);

    }

    public int find(int nums[], int goal) {

        if (goal < 0) {
            return 0;
        }

        int start = 0;
        int total = 0;
        int count = 0;

        for (int end = 0; end < nums.length; end++) {

            if (nums[end] % 2 != 0) {
                count++;
            }

            while (count > goal) {

                if (nums[start] % 2 != 0) {
                    count--;
                }

                start++;
            }

            total = total + (end - start + 1);
        }

        return total;
    }
}
    
