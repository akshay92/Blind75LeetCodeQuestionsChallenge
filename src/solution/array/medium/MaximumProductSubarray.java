package solution.array.medium;

/*
  https://leetcode.com/problems/maximum-product-subarray/description/
  1. Variable for left and right product sum
  2. Run loop to update left and right product sum
       find max

 */
public class MaximumProductSubarray {

    public static void main(String[] args) {
        MaximumProductSubarray obj = new MaximumProductSubarray();
        System.out.println(obj.maxProduct(new int[]{3,-1,4}));
        System.out.println(obj.maxProduct(new int[]{2,3,-2,4}));
        System.out.println(obj.maxProduct(new int[]{-2,0,-1}));
        System.out.println(obj.maxProduct(new int[]{2,-5,-2,-4,3}));

    }

    /*
    Example 1:
    Input: nums = [2,3,-2,4]
    Output: 6
    Explanation: [2,3] has the largest product 6.

    Example 2:
    Input: nums = [-2,0,-1]
    Output: 0
    Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

    Example 3:
    Input: nums = [3,-1,4]
    Output: 4

    Example 4:
    Input: nums = [2,-5,-2,-4,3]
    Output: 24
    */

    public int maxProduct(int[] nums) {

        int max = nums[0];
        int l =0, r=0;
        int n = nums.length;

        for(int i=0;i<nums.length;i++){

            l = (l==0 ? 1 : l)*nums[i];
            r = (r==0 ? 1 : r)*nums[n-1-i];

            max = Math.max(max,Math.max(l,r));
        }

        return max;
    }
}
