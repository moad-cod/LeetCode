
# Time Complexity = O(n²)

class Solution(object):
    def twoSum(self, nums, target):
        k = len(nums)
        
        for i in range(k):
            for j in range(i + 1, k):
                if nums[i] + nums[j] == target:
                    return [i, j]


# Time complexity = O(n)
