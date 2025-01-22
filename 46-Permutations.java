class Solution {
     public static void find(int idx,int[]arr,List<Integer> list,List<List<Integer>> res){
        if(idx==arr.length){
           for(int i:arr) list.add(i);
           res.add(new ArrayList<>(list));
           list.clear();
           return;
        }
      
        for(int i=idx;i<arr.length;i++){
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
            find(idx+1,arr,list,res);
             temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;

        }
     }
    public List<List<Integer>> permute(int[] nums) {

          List<List<Integer>> res=new ArrayList<>();
          List<Integer> list=new ArrayList<>();
       find(0,nums,list,res);
        return res;
    }
}