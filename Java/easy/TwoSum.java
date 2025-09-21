package easy;

import java.util.HashMap;
import java.util.Map;

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int k = nums.length;

//         for (int i = 0; i < k; i++) {
//             for (int j = i + 1; j < k; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[] { i, j };
//                 }
//             }
//         }

//         return new int[] {};
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();

//         int[] nums = { 2, 7, 11, 15 };
//         int target = 9;
//         int[] result = sol.twoSum(nums, target);
//         System.out.println(result[0] + " " + result[1]);
//     }
// }

//  Time complexity = O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}