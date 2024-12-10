class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
      Map <Integer,Integer> map=new TreeMap<>();
        for(int[] trip:trips){
            int start=trip[1];
            int end=trip[2];
            map.put(start,map.getOrDefault(start,0)+trip[0]);
             map.put(end,map.getOrDefault(end,0)-trip[0]);
        }

        int sum=0;
        for(int i:map.values()){
            sum+=i;
            if(sum>capacity){
                return false;
            }
        }
        return true;
    }
}