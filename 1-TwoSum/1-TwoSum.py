# Last updated: 8/24/2025, 11:28:47 PM
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        residuals = {}
        
        for i, ele in enumerate(nums):
            res = target - ele
            # print(res, residuals)
            if res in residuals:
                return [residuals[res], i]
            else:
                residuals[ele] = i

        # return False