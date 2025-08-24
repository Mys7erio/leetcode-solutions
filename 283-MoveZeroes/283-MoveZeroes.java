// Last updated: 8/24/2025, 11:28:36 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[fast] == 0) {
                fast++;
            } else {
                nums[slow] = nums[fast];
                fast++;
                slow++;
            }
        }

        for (int i=slow; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}