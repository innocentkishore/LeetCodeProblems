class Solution {
    class Pair{
        int key;
        int value;
        public Pair(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    public String frequencySort(String s) {
        char []ch=s.toCharArray();
        String ns=\\;
        int []freq=new int[122+1];
        for(int i=0;i<ch.length;i++){
            freq[(int)ch[i]]++;
        }
        //  for(int i=0;i<freq.length;i++){
        //     if(freq[i]!=0)
        // //    System.out.println((char)i+\ \+freq[i]);
        // }
      
        PriorityQueue<Pair> q=new PriorityQueue<>((p1,p2)->Integer.compare(p2.value,p1.value));
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                q.add(new Pair(i,freq[i]));
            }
        }
        while(q.size()!=0){
             Pair v=q.poll();
             int k=v.value;
            //  System.out.println(\freq \+k);
             while(k>0){
                // System.out.println((char)v.key);
                ns+=String.valueOf((char)v.key);
                k--;
             }
        }
       
        // System.out.print((char)v.key);
        return ns;
    }
}