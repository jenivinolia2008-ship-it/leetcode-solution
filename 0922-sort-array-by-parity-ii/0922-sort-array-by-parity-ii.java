class Solution {
    public int[] sortArrayByParityII(int[] nums) {
int oddindex=1;
int evenindex=0;
while(oddindex<nums.length && evenindex<nums.length){
    while(evenindex<nums.length && nums[evenindex]%2==0){
        evenindex+=2;
    }
    while(oddindex<nums.length && nums[oddindex]%2==1){
        oddindex+=2;
    }
    if(oddindex<nums.length && evenindex<nums.length){
        int temp=nums[evenindex];
        nums[evenindex]=nums[oddindex];
        nums[oddindex]=temp;
    }
} 
return nums;       
    }
}