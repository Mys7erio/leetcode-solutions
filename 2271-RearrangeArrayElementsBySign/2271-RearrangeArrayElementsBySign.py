# Last updated: 8/29/2025, 11:02:09 PM
class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        pos, neg =  0, 1
        result = [None] * len(nums)

        for i in range(0, len(nums)):
            # print(pos, neg, i, result)
            if nums[i] > 0:
                result[pos] = nums[i]
                pos += 2
            else:
                result[neg] = nums[i]
                neg += 2
                
        return result