class Solution {
    public int missingNumber(int[] nums) {
    int i=0;
    while(i<nums.length){
        int valueindex=nums[i];
        if(nums[i]<nums.length&&nums[i]!=nums[valueindex]){
            int temp=nums[i];
            nums[i]=nums[valueindex];
            nums[valueindex]=temp;
        }
        else{
            i++;
        }
    }  
    for(i=0;i<nums.length;i++){
        if(nums[i]!=i){
            return i;
        }
    } 
    return i; 
    }
}