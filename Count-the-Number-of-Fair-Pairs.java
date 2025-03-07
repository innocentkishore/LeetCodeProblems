class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int j = nums.length - 1;
        int n = nums.length;
        int i = 0;
        Arrays.sort(nums);
        long c1 = 0, c2 = 0;
        long m = n - 1;
        long pair = m * (m + 1) / 2;
        while (i < j) {
            if (nums[i] + nums[j] < lower) {
                c1 += (j - i);
                i++;
            } else {
                j--;
            }
        }
        i = 0;
        j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] > upper) {
                c2 += (j - i);
                j--;
            } else {
                i++;
            }
        }
        return pair - c1 - c2;
    }
}