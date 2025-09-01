# Last updated: 9/1/2025, 10:46:08 PM
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        discontinuity = -1

        # Find the point from the right to left, where the current 
        # element is lesser than it's next element - aka discontinuation point
        for i in range(len(nums) -2 , -1, -1):
            if nums[i] < nums[i+1]:
                discontinuity = i
                break

        # If not discontinuation point was found, then that means the
        # array itself is in it's largest lexicographically permutated state.
        # In this case, we will return the array the array in it's lexicographically
        # smallest permutated state - aka the reversed original list
        if discontinuity == -1:
            return nums.sort()

        # Find the element from right to left which is greater than the
        # element at the discontinuation point
        for i in range(len(nums) -1, -1, -1):
            if nums[i] > nums[discontinuity]:
                nums[i], nums[discontinuity] = nums[discontinuity], nums[i]
                break

        # print(nums)
        # Reverse the subarray formed from the discontinuation point to array's end
        i, j = discontinuity +1, len(nums) -1
        while (i <= j):
            nums[i], nums[j] = nums[j], nums[i]
            i += 1
            j -= 1

        return nums

        