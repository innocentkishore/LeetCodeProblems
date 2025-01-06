class Solution {
    public int[] minOperations(String boxes) {
        char []ch=boxes.toCharArray();
        int []res=new int[ch.length];
        int k=0;
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length;j++){
                if(ch[j]=='1'){
                    k+=Math.abs((i+1)-(j+1));
                }



            }
            res[i]=k;
            k=0;
        }
        return res;
    }
}