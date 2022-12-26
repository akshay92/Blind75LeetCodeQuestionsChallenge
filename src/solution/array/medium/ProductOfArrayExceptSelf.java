package solution.array.medium;
/*
https://leetcode.com/problems/product-of-array-except-self/
1. Get complete array product
2. Run loop each item divide the complete product
 */
public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        ProductOfArrayExceptSelf ob = new ProductOfArrayExceptSelf();
    }

    public int[] productExceptSelf(int[] nums) {
        int product = 1;

        for(int i=0;i<nums.length;i++){
            product = product*nums[i];
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = product/nums[i];
        }

        return nums;
    }
}