class Solution {
    /*
    *1)
    *BF:just loop over the array and count
    *time: O(n)
    *space:O(n)
    */
    /*
    *2)
    *sort array and pick mid element
    *time: O(nlogn)
    *space:O(1)
    */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[(int)nums.length/2];
    }
    /*
    *3)
    *divide and conquer:
    *major of array must be = major of first half(ML) or major of second half(MR)
    *if ML == MR then result is found
    *else count number of occurrences of ML and MR on each half, return the value with larger cnt
    *time:O(nlogn) -> T(n) = 2T(n/2) + 2n -> by master theorem -> O(nlogn)
    *spcae:O(logn) -> call stack
    */
}