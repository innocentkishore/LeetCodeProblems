class Solution {
    public int[] asteroidCollision(int[] a) {
        ArrayList<Integer> list=new ArrayList<>();
        Deque<Integer> s=new ArrayDeque<>();
        for(int i:a){
            if(i>0 )s.push(i);
            else{
           while(!s.isEmpty() && s.peek()>0&& s.peek()<Math.abs(i)){
            s.pop();
           }
            if(!s.isEmpty() && (s.peek()==Math.abs(i))) s.pop();
            else if(s.isEmpty()|| s.peek()<0) s.push(i);
        }  
            }
           
        
    int []res=new int [s.size()];
    int i=s.size()-1;
       while(!s.isEmpty()){
        res[i--]=s.pop();
       }
        
            return res;
    }
}