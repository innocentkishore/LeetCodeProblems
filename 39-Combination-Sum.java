class Solution {
    
    public void  backtrack(int start,int target,int []candidates, List<Integer> list, List<List<Integer>> res ){
       
      if (start == candidates.length || target < 0) {
    return;
}

if (target == 0) {
    res.add(new ArrayList<>(list));
    return;
}

       
        if(candidates[start]<=target){
            //  System.out.println(\kk \+candidates[start]);
            list.add(candidates[start]);
      backtrack(start,target-candidates[start],candidates,list,res);
        list.remove(list.size()-1);
        }
        backtrack(start+1,target,candidates,list,res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<Integer> list=new ArrayList<>();
    List<List<Integer>> res=new ArrayList<>();
        backtrack(  0,target,candidates,list,res );
        System.out.println(list);
        return res;
    }
}