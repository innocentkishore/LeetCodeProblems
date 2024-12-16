class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair<Integer,Integer>> map=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(int i=0;i<score.length;i++){
            map.add(new Pair(i,score[i]));
        }
        int place=1;
        String []res=new String[score.length];
        while(!map.isEmpty()){
            Pair<Integer,Integer> top=map.poll();

            int idx=top.getKey();
            if(place==1){
                res[idx]=\Gold Medal\;

            }
            else if(place==3){
                res[idx]=\Bronze Medal\;
            }
            else if(place==2){
                res[idx]=\Silver Medal\;
            }
            else{
                res[idx]=String.valueOf(place);
            }
            place++;
        
        }
        return res;
    }
}