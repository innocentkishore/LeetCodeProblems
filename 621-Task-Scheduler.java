class Solution {
    public int leastInterval(char[] tasks, int n) {
        int []f=new int [26];
        for(int i=0;i<tasks.length;i++){
            f[tasks[i]-'A']++;
        } 
        int time=0;
        PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:f){
            if(i!=0){
                pq.add(i);
            }
        }

        while(pq.size()>0){
            List <Integer> temp=new ArrayList<>();
            for(int i=0;i<n+1;i++){
                if(!pq.isEmpty()){
                    temp.add(pq.poll()-1);
                }
            }
            for(int s:temp){
                if(s!=0)
                pq.add(s);
            }
time+=pq.isEmpty()?temp.size():n+1;
         
        }

      return time;  
    }
}