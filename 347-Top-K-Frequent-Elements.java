class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i:nums){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
        int []ans=new int[k];
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->hash.get(a)-hash.get(b));
        for(int n:hash.keySet()){
             pq.add(n);
            if(pq.size()>k)
           {
            pq.poll();
           }
        }
        int i=k-1;
        while(pq.size()!=0){
            ans[i]=pq.poll();
            i--;
        }
        
return ans;

        
    }
}