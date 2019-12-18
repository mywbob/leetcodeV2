class Solution {
    public void moveZeroes(int[] nums) {
        int runner = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]!=0) {
                nums[runner] = nums[i];
                if (runner != i) {
                    nums[i]=0;
                }
                runner++;
            } 
        }
    }
}