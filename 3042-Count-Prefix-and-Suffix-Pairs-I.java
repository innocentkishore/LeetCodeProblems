class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].length()<=words[j].length()){
                    String str1=words[j].substring(0,words[i].length());
                    String str2=words[j].substring(words[j].length()-words[i].length(),words[j].length());    
                    System.out.println("Str1"+str1);
                     System.out.println("Str2"+str2);

                        if(str1.equals(words[i])&&str2.equals(words[i])){
                            c++;
                        }
                    
                }

            }
        }
        return c;
    }
}