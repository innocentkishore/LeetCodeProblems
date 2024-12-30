class Solution {
    public int maxProduct(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int res = arr[0];
        int arrSize = arr.length;
        for(int i=1;i<arrSize;i++){
            int currentPosition = arr[i];
            if(currentPosition < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(currentPosition, arr[i]*max);
            min = Math.min(currentPosition, arr[i]*min);
            res = Math.max(res, max);
        }
        return res;
        
    }
}