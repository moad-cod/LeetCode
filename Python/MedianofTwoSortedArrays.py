class Solution(object):
    def findMedianSortedArrays(nums1, nums2):
        if len(nums1) > len(nums2):
            nums1, nums2 = nums2, nums1
            
        m, n = len(nums1), len(nums2)
        low, high = 0, m
        
        i = (low + high ) // 2 
        j = (m + n + 1) // 2 - i 
        
        while low <= high:
            i = (low + high) // 2
            j = (m + n + 1) // 2 - i
            
            max_left_nums1 = float('-inf' if i == 0 else nums1[i-1])
            min_right_nums1 = float('inf' if i == m else nums1[i])
            
            max_left_nums2 = float('-inf' if j == 0 else nums2[j-1])
            min_right_nums2 = float('inf' if j == n else nums2[j])
            
            if max_left_nums1 <= min_right_nums2 and max_left_nums2 <= min_right_nums1:
                if (m + n) % 2 == 0:
                    return (max(max_left_nums1, max_left_nums2) + min(min_right_nums1, min_right_nums2)) / 2
                else:
                    return max(max_left_nums1, max_left_nums2)
            elif max_left_nums1 > min_right_nums2:
                high = i - 1
            else:
                low = i + 1
                

print(Solution.findMedianSortedArrays([1,3], [2]))        # Output: 2.0
print(Solution.findMedianSortedArrays([1,2], [3,4]))      # Output: 2.5
print(Solution.findMedianSortedArrays([1,3,5], [2,4,6]))  # Output: 3.5    
        