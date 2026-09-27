class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }

        int maxlen=0;
        for(int n:s){
            if(s.contains(n-1)==false){
                int start=n;
                int cur=1;
                while(s.contains(start+1)){
                    cur++;
                    start++;
                }
                maxlen=Math.max(maxlen,cur);
            }
        }
        return maxlen;
    }
}