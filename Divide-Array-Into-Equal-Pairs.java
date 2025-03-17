class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
       for(Integer i:map.keySet()){
        if(map.get(i)%2==1) return false;
       }
        return true;
    }
}