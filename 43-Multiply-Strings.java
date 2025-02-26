class Solution {
    public String multiply(String num1, String num2) {
        int l1=num1.length();
        int l2=num2.length();

        int []arr=new int[l1+l2];
        for(int i=l1-1;i>=0;i--){
            for(int j=l2-1;j>=0;j--){
                int p1=i+j,p2=i+j+1;
                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum=mul+arr[p2];
                arr[p1]+=sum/10;
                arr[p2]=(sum)%10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i:arr) {
            if(!(sb.length()==0 &&i==0)) sb.append(i);
        }
        return sb.length()==0?\0\:sb.toString();
    }
}