class Solution {
    public int findDuplicate(int[] nums) {
int start=0;
int end=nums.length-1; 
while(start<end){
    int count=0;
    int mid=(start+end)/2;
    for(int i=0;i<nums.length;i++){
        if(nums[i]<=mid){
            count++;
        }
    }
    if(count>mid){
        end=mid;
    }
    else{
        start=mid+1;
    }
} 
return start;
    }
}