package solution.array.medium;
/*
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
first pointer value should be greater than second pointer than we can get the minimum
otherwise first value is minimum
 */
public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {

    }

    /*
    Example 1:
    Input: nums = [3,4,5,1,2]
    Output: 1
    Explanation: The original array was [1,2,3,4,5] rotated 3 times.

   Example 2:
   Input: nums = [4,5,6,7,0,1,2]
   Output: 0
   Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

   Example 3:
   Input: nums = [11,13,15,17]
   Output: 11
   Explanation: The original array was [11,13,15,17] and it was rotated 4 times.

     */

    public int findMin(int[] nums) {

        for(int i=0;i<nums.length-1;i++){

            if(nums[i]>nums[i+1]){
                return nums[i+1];
            }
        }

        return nums[0];
    }
}
