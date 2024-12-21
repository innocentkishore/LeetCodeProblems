class Solution {
    public boolean check(ArrayList<Integer>[] graph,int source,int destination,boolean[] visit){
        if(source==destination){
            return true;
        }
        visit[source]=true;
        for(int next:graph[source]){

            if(visit[next]==false){
            boolean ans = check(graph,next,destination,visit);
            if(ans) return true;
        }
        }

        return false;

    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // int a =edges.length-1;
        ArrayList<Integer>[] graph=new ArrayList[n];

        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];

            graph[u].add(v);
            graph[v].add(u);
        }
        boolean []visit=new boolean[n];
      return  check( graph,source,destination,visit);
        
    }
}