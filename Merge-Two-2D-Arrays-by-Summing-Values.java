class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n1=nums1.length;
        int n2=nums2.length;
        for(int i=0;i<nums1.length;i++){
            // if(!map.containsKey(nums1[i][0])) 
           map.put(nums1[i][0],nums1[i][1]);

        //   int add= map.get(nums1[i][0])+nums[i][0];
        //   map.put(nums1[i][0],a);
          
          
        }
         for(int i=0;i<nums2.length;i++){
            // System.out.println(map.containsKey(nums2[i][0]));
            //  System.out.println(nums2[i][0]);
            if(!map.containsKey(nums2[i][0])) 
            {
              
           map.put(nums2[i][0],nums2[i][1]);
            }
         
           else{
           int add= map.get(nums2[i][0])+nums2[i][1];
           
           map.put(nums2[i][0],add);
           }
          
          
        }
        //  System.out.println(map);
         Map<Integer, Integer> tmap = new TreeMap<>(map);
        int [][]res=new int[map.size()][2];
        int k=0;
       for(int i:tmap.keySet()){
        res[k][0]=i;
        res[k][1]=tmap.get(i);
        k++;
       }
       return res;
    }
}