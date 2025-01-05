class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int []map=new int[s.length()+1];
        char[] ch=s.toCharArray();
        for(int i=0;i<shifts.length;i++){
            int start=shifts[i][0];
            int end=shifts[i][1];
            int direction=shifts[i][2];
            
            if(direction==0){
                map[start]-=1;
                map[end+1]+=1;
            }
            else{
                map[start]+=1;
                map[end+1]-=1;
            }
        }
        for(int i=1;i<map.length;i++){
            map[i]+=map[i-1];
            System.out.print(map[i]);
        }

        for(int i=0;i<ch.length;i++){
           int n=((ch[i]-'a'+map[i])%26);
           if(n<0) n+=26;
           ch[i]=(char)(n+'a');
        }
        return new String(ch);
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           