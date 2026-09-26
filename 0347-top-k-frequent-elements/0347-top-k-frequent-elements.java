class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       } 
       ArrayList<Integer>list=new ArrayList<>();
       for(int key:map.keySet()){
        list.add(key);
       }
       Collections.sort(list,(a,b)->map.get(b)-map.get(a));
       int[] arr=new int[k];
       for(int i=0;i<k;i++){
        arr[i]=list.get(i);
       }
       return arr;
    }
}