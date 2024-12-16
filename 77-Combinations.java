class Solution {
    public List<List<Integer>> li=new ArrayList<>();
    public List<Integer> list=new ArrayList<>();
    public void backtrack(int level,int i,int n,int k){
        if(list.size()==k){
            li.add(new ArrayList<>(list));
            return ;
        }
        for(int j=i;i<=n;i++){
            list.add(i);
            backtrack(level+1,i+1,n,k);
            list.remove(list.size()-1);
        }


    }
    public List<List<Integer>> combine(int n, int k) {
        backtrack(0,1,n,k);
        return li;
        
    }
}