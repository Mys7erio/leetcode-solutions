// Last updated: 8/24/2025, 11:28:31 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        // int longest = 0;
        int noSubArrs = 0;
        int size = nums.length;


        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    // longest = Math.max(longest, end - start);
                    noSubArrs += 1;
                }
            }
        }

        return noSubArrs;
    }
}