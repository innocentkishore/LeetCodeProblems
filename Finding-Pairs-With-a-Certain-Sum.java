class FindSumPairs {
    int []nums1,nums2;
     HashMap<Integer,Integer> map=new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        for(int i:nums2){
            map.put(i,map.getOrDefault(i,0)+1);

        }
       
        
    }
    
    public void add(int index, int val) {
        if(map.get(nums2[index])==1) map.remove(nums2[index]);
        else map.put(nums2[index],map.get(nums2[index])-1);
        nums2[index]+=val;
        map.put(nums2[index],map.getOrDefault(nums2[index],0)+1);

        
    }
    
    public int count(int tot) {
        int a=0;
        for(int i:nums1) 
        {
            if(map.containsKey(tot-i)) a+=map.get(tot-i);
        }
        return a;
        
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */