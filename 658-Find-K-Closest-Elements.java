class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int high=arr.length-1;
        List<Integer> li=new ArrayList<>();
        int low=0;

        while(high-low>=k){
            if(Math.abs(arr[low]-x)>Math.abs(arr[high]-x)){
                low++;
            }
            else{
                high--;
            }
        }
        for(int i=low;i<=high;i++){
            li.add(arr[i]);
        }
        return li;
    }
}