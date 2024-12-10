class Solution {
    public int cal(int n){
        int digit=0;
        int num=0;
        while(n!=0){
         digit=n%10;
         num=num+digit*digit;
        n=n/10;
        }

        return num;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> map=new HashSet<>();
         
        while(true){
            n=cal(n);
            if(n==1){
                return true;
            }
            if(map.contains(n)){
                return false;
            }
            map.add(n);
        }

        
    }
}