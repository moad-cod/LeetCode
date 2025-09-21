
# Time Complexity = O(n²)

# class Solution(object):
#     def twoSum(self, nums, target):
#         k = len(nums)
        
#         for i in range(k):
#             for j in range(i + 1, k):
#                 if nums[i] + nums[j] == target:
#                     return [i, j]


# Time complexity = O(n)

class Solution(object):
    def twoSum(self, nums, target):
        seen = {}
        
        for i, num in enumerate(nums):
            complement = target - num
            if complement in seen:
                return [seen[complement], i]
            seen[num] = i

        return []

print(Solution().twoSum([2,7,11,15], 9))