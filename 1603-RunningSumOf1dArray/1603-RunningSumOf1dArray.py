# Last updated: 8/24/2025, 11:28:34 PM
class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        sum = nums[:1]
        for num in nums[1:]:
            sum.append(sum[-1] + num)
        return sum
