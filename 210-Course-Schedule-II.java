class Solution {
    public int[] findOrder(int num, int[][] a) {
        // ArrayList<Integer> list=new ArrayList<>()
        int k=0;
         ArrayList<Integer>[] graph=new ArrayList[num];
         int []res=new int[num];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<a.length;i++){
            int u=a[i][0];
            int v=a[i][1];
            graph[v].add(u);
        }

        boolean []visit=new boolean[graph.length];
        int []indegree=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                int v=graph[i].get(j);
                indegree[v]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int c=0;
        while(q.size()>0){
            //remove
            int rem=q.poll();
            res[k++]=rem;
            //work
            c++;
            visit[rem]=true;
            //add
            for(int next:graph[rem]){
                if(visit[next]==false){
                    indegree[next]--;
                    if(indegree[next]==0)
                    q.add(next);

                }
            }

        }
        if(c==num) return res;
        return new int[0];
        
        
    }
}