package solution.array.medium;
/*
https://leetcode.com/problems/maximum-subarray/
1. Take two var maxSoFar(For current max) and max
2. Run loop add each item in maxSoFar then swap maxSoFar to max if maxSoFar more than max
3. Update maxSoFar if less than zero
 */

public class MaximumSubarray {

    public static void main(String[] args) {
        MaximumSubarray ob = new MaximumSubarray();
        System.out.println(ob.maxSubArray(new int[]{5,4,-1,7,8}));
    }

    /*
      Example 1:
      Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
      Output: 6
      Explanation: [4,-1,2,1] has the largest sum = 6.

      Example 2:
      Input: nums = [1]
      Output: 1

      Example 3:
      Input: nums = [5,4,-1,7,8]
      Output: 23
     */

    public int maxSubArray(int[] nums) {

        int maxSoFar =0;
        int max = Integer.MIN_VALUE;
        int i=0;
        while (i<nums.length){
             maxSoFar = maxSoFar+nums[i];

             if(maxSoFar>max){
                 max=maxSoFar;
             }

             if(maxSoFar < 0){
                 maxSoFar=0;
             }
             i++;

        }

        return max;
    }

}
