class Solution {
    public int[] productExceptSelf(int[] nums) {
   int prefix []=new int[nums.length];
   int left=1;
   prefix[0]=left;
   prefix[0]=left;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            prefix[i]=prefix[i]*right;
            right*=nums[i];
        }
        return prefix;
    }
}