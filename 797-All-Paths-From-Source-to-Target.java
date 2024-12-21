class Solution {
    public void dfs(ArrayList<Integer>[] g,int src,boolean [] visit,List<Integer> temp,List<List<Integer>> res,int des){
        if(src==des){
            temp.add(des);
            res.add(new ArrayList<>(temp));
            return;
        }

        visit[src]=true;
        temp.add(src);
        for(int next:g[src]){
            if(visit[next]==false){

            dfs(g,next,visit,temp,res,des);
            temp.remove(temp.size()-1);
            }

        }
        visit[src]=false;

    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<Integer>[] g=new ArrayList[graph.length];
        for(int i=0;i<g.length;i++){
            g[i]=new ArrayList<>();
        }
        for(int i=0;i<graph.length;i++){
           for(int j=0;j<graph[i].length;j++){
            int next=graph[i][j];
            g[i].add(next);
           }
        }
boolean []visit=new boolean[graph.length];
List<Integer> temp=new ArrayList<>();
List<List<Integer>> res=new ArrayList<>();

dfs(g,0,visit,temp,res,graph.length-1);       
        return res;
    }
}