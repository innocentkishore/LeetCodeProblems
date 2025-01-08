class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        int tot=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            tot+=gas[i]-cost[i];
            sum+=gas[i]-cost[i];
            if(sum<0){
                sum=0;
                start=i+1;
            }
        }
        return (tot<0) ? -1:start;
        
    }
}