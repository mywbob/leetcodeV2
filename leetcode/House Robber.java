class Solution {
    /*
    * max(f(n-1), f(n-2) + nums[n])
    */
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int fn_1 = Math.max(nums[0], nums[1]);
        int fn_2 = nums[0];
        int max = 0;
        for (int i=2; i<nums.length; i++) {
            max = Math.max(fn_1, fn_2 + nums[i]);
            fn_2 = fn_1;
            fn_1 = max;
        }
        return max;
    }
}