class Solution {
    public int eraseOverlapIntervals(int[][] a) {
        int []start=new int [a.length];
        int []end=new int[a.length];
                Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0])); 

        for(int i=0;i<a.length;i++){
            start[i]=a[i][0];
        }
         for(int i=0;i<a.length;i++){
            end[i]=a[i][1];
        }
        int c=0;
         for(int i=1;i<a.length;i++){
            if(end[i-1]>start[i]){
                c++;
                end[i]=Math.min(end[i],end[i-1]);
                // System.out.println(end[i-1]);
                //  System.out.println(start[i]);
            }
            
            
        }
        // System.out.println(Arrays.toString(end));
        return c;
    }
}