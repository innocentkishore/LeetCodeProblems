class Solution {
    public int[] finalPrices(int[] prices) {
        int i=0;
        int j=1;
        int k=0;
        int []res=new int[prices.length];
        while(i<prices.length){
             if(j>=prices.length){
                res[k++]=prices[i];
                i++;
                j=i+1;
            }
          else if( prices[j]<=prices[i] ){
                res[k++]=prices[i]-prices[j];
                i++;
                j=i+1;
            }
            
            else{
                j++;
            }

        }
        // if(prices.length>=2){
        // res[res.length-1]=prices[prices.length-1];
        // res[res.length-2]=prices[prices.length-2];
        // }
        return res;
    }
}