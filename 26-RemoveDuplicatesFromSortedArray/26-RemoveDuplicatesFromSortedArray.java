// Last updated: 8/24/2025, 11:28:45 PM
import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0, ele = 0;
        for (ele = 0; ele < nums.length; ele++) {
            if (nums[index] == nums[ele]) {
                continue;
            } else {
                index++;
                nums[index] = nums[ele];
            }
        }

        return index + 1;
    }
}