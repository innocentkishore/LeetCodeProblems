class Solution {
    public boolean dfs(int[][]graph ,int src,int[] state){
      
        if(state[src]>0) return state[src]==2;
        state[src]=1;

        for(int next:graph[src]){
            if(state[next]==1 || !dfs(graph,next,state)){
                return false;
            }
        }
        state[src]=2;
        return true;
    }
    public List<Integer> eventualSafeNodes(int[][] e) {
        int n=e.length;
        ArrayList<Integer> list=new ArrayList<>();
    
        int []visit=new int[n];
       
           for(int i=0;i<n;i++){
            if(dfs(e,i,visit))
            list.add(i);
           }
          
        return list;
    }
}