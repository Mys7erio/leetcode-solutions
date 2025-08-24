// Last updated: 8/24/2025, 11:28:35 PM


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentMax = 0;
        int maxLen = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1) {
                currentMax++;
            } else {
                maxLen = Math.max(currentMax, maxLen);
                currentMax = 0;
            }
        }

        maxLen = Math.max(maxLen, currentMax);
        return maxLen;
    }
}