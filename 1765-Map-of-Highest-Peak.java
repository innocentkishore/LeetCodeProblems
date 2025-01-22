class Solution {
    class pair{
        int first;
        int second;
        public pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public boolean valid(int newx,int newy,int row,int col){
        return newx>=0 && newx<row && newy>=0 && newy<col;
    }
    public int[][] highestPeak(int[][] isWater) {
        Queue<pair> q=new LinkedList<>();
         
        int row=isWater.length;
        int col=isWater[0].length;
        int [][]res=new int[row][col];
        boolean [][]visit=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(isWater[i][j]==1){
                   
                q.offer(new pair(i,j));
                visit[i][j]=true;
                }
            }
        }
        int level=0;
       
        
        int []dir={-1,0,1,0,-1};
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                pair curr=q.remove();
                // q.poll();
                int x=curr.first;
                int y=curr.second;
                
                for(int d=0;d<dir.length-1;d++){
                    int newx=x+dir[d];
                    int newy=y+dir[d+1];
                    if(valid(newx,newy,row,col) && !visit[newx][newy] ){
                        q.offer(new pair(newx,newy));
                        res[newx][newy]=level+1;
                        visit[newx][newy]=true;
                        
                    }
                }
            }
            level++;
            
        }
        return res;
    }
} 