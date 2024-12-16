class Solution {
    public List<Integer> list=new ArrayList<>();
    public List<List<Integer>> res=new ArrayList<>();
    public void  backtrack(int sum,int  start,int target,int []candidates ){
        if(sum==target){
            res.add(new ArrayList<>(list));
        }
       if(sum>target)
       return;
       for(int i=start;i<candidates.length;i++){
        list.add(candidates[i]);
        backtrack(sum+candidates[i],i,target,candidates);
        list.remove(list.size()-1);
       }

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(  0,0,target,candidates  );
        return res;
    }
}