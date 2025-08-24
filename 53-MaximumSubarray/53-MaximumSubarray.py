# Last updated: 8/24/2025, 11:28:44 PM
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currentMax = nums[0]
        maxSum = nums[0]

        for i in range(1, len(nums)):
            if currentMax < 0:
                currentMax = 0

            currentMax += nums[i]
            maxSum = max(maxSum, currentMax)

        return maxSum
            
            