class Solution {
    public void find(List<Integer> list,List<List<Integer>> res,int[] arr,int idx,int size){

            res.add(new ArrayList<>(list));
          
        
      for(int i=idx;i<arr.length;i++){
        if(idx!=i &&arr[i]==arr[i-1]) continue;
        list.add(arr[i]);
        find(list,res,arr,i+1,size);
        list.remove(list.size()-1);
      }


    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        find(list,res,nums,0,nums.length);
        return res;
    }
}