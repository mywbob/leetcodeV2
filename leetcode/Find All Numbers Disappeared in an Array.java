class Solution {
    /* 
    * swap number to right index while scan the array first time, note that swap when none of source and target are  correct
    * scan the array one more time to find disapperaed element.
    * time: o(n)
    * space: o(1)
    */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                Integer temp = nums[nums[i] - 1];
                nums[nums[i] - 1] =  nums[i];
                nums[i] = temp;
                i = i - 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 != i) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
}