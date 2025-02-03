class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
    int n=nums2.length;
    for(int i=n-1;i>=0;i--){
        if(s.isEmpty()) {
            map.put(nums2[i],-1);
            s.push(nums2[i]);
        }
        else if(nums2[i]<s.peek()){
            map.put(nums2[i],s.peek());
            s.push(nums2[i]);
        }
        else if(nums2[i]>s.peek()){
            while(!s.isEmpty()&&s.peek()<nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],s.peek());
            }
            s.push(nums2[i]);

        }

    }

    for(int i=0;i<nums1.length;i++){
        nums1[i]=map.get(nums1[i]);
    } 
        return nums1;
       
    }
}