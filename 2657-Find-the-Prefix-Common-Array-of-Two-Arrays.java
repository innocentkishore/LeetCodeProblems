class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int []c=new int[A.length];
        if(A.length==1){
         if(  A[0]==B[0]) {
            c[0]=1;
            }
            return c;
       
        }
        // c[0]=0;
        int count=0;
        int k=0;
       
        //   map.put(A[0],map.getOrDefault(A[0],0)+1);
        //          map.put(B[0],map.getOrDefault(B[0],0)+1);
        for(int i=0;i<A.length;i++){
           
            
                map.put(A[i],map.getOrDefault(A[i],0)+1);
                

             if(map.get(A[i])>1 ){
                count++;
                // System.out.println("A"+count);
            }
             map.put(B[i],map.getOrDefault(B[i],0)+1);
            if(map.get(B[i])>1){
                count++;
                // System.out.println("B"+count);
            }
            c[k++]=count;
        }
        // System.out.print(map);
        return c;
    }
}