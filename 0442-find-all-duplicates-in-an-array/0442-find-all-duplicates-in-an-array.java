class Solution {
    public List <Integer> findDuplicates(int[] nums) {
    int i=0;
    while(i<nums.length){
        int valueindex=nums[i]-1;
        if(nums[i]!=nums[valueindex]){
            int temp=nums[i];
            nums[i]=nums[valueindex];
            nums[valueindex]=temp;
        }
        else{
            i++;
        }
    }  
    ArrayList<Integer>list=new ArrayList<>();
    for(i=0;i<nums.length;i++){
        if(nums[i]!=i+1){
            list.add(nums[i]);
        }
    }
    return list;
    }
}