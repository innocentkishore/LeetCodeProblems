class Solution {
    public void backtrack(int idx,int[] candidates,List<Integer> list, List<List<Integer>> res,int target){
       if(target==0){
        res.add(new ArrayList<>(list));
        return;
       }
       for(int i=idx;i<candidates.length;i++){
        if(i>idx && candidates[i]==candidates[i-1]) continue;
        if(candidates[i]>target) break;
        list.add(candidates[i]);
        backtrack(i+1,candidates,list,res,target-candidates[i]);
        list.remove(list.size()-1);
       }
       
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
       backtrack(0,candidates,list,res,target);
        return res;
    }
}