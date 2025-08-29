# Last updated: 8/29/2025, 11:02:10 PM
class Solution:
    def check(self, nums: List[int]) -> bool:
        break_encountered = 0
        n = len(nums)
        
        for i in range(0, n):
            diff = nums[(i+1) % n] - nums[i]
            if diff < 0:
                break_encountered += 1

            # print(nums[(i+1) % n], nums[i], diff < 0, break_encountered)

        # print(break_encountered)
        return break_encountered <= 1