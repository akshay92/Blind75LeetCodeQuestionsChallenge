package solution.array.easy;

import java.util.Arrays;

/*
https://leetcode.com/problems/contains-duplicate/
1. Sort
2. Run loop and check first second pointer value
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        ContainsDuplicate object = new ContainsDuplicate();
        object.containsDuplicate(new int[]{1, 2, 3, 1});
    }

    /*
    Example 1:
   Input: nums = [1,2,3,1]
   Output: true
   Example 2:

   Input: nums = [1,2,3,4]
   Output: false
   Example 3:

   Input: nums = [1,1,1,3,3,4,3,2,4,2]
   Output: true
     */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int ind = 1; ind < nums.length; ind++) {
            if (nums[ind] == nums[ind - 1]) {
                return true;
            }
        }
        return false;
    }

}
