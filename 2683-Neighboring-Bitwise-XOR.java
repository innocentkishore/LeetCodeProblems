class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n=derived.length;
        int []orginal=new int[derived.length];
        int []res=new int[derived.length];
        int c1=0;
  
           for(int i=0;i<n;i++){
        //    System.out.println("res"+res[i]);
       c1^=derived[i];
        }

        if(c1!=0) return false;
        return true;
    }
}