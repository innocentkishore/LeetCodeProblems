class Solution {
    public boolean isAnagram(String s, String t) {
     int arr1[]=new int[26];
     int arr2[]=new int[26];
     int n=s.length(),m=t.length();
     if(n!=m)return false;
     for(int i=0;i<n;i++){
        arr1[s.charAt(i)-97]++;
        arr2[t.charAt(i)-97]++;
     }
       if(!Arrays.equals(arr1,arr2))return false;

        return true;
    }
}