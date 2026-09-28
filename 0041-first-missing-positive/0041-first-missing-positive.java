class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
    while(i<nums.length){
        int valueindex=nums[i]-1;
        if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[valueindex]){
            int temp=nums[i];
            nums[i]=nums[valueindex];
            nums[valueindex]=temp;
        }
        else{
            i++;
        }
    }  
    for(i=0;i<nums.length;i++){
        if(nums[i]!=i+1){
            return i+1;
        }
    }
    return i+1;
    }
}
    
