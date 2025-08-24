# Last updated: 8/24/2025, 11:28:32 PM
class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        for index, num in enumerate(nums):
            if sum(nums[:index]) == sum(nums[index + 1:]):
                return index
        return -1