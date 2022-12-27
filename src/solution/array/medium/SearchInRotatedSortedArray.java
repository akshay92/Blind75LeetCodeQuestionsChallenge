package solution.array.medium;
/*
https://leetcode.com/problems/search-in-rotated-sorted-array/description/
Just remember binary search
Find the rotation index(Implement opposite condition like mid-value  > high-value that point we are looking      )
Run normal binary search mid, low, high
  Update mid with use of add rotation index in size of array range
 */
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        SearchInRotatedSortedArray ob = new SearchInRotatedSortedArray();
        System.out.println("4 "+ob.search(new int[]{4,5,6,7,0,1,2}, 0));
        System.out.println("-1 "+ob.search(new int[]{4,5,6,7,0,1,2}, 3));
        System.out.println("-1 "+ob.search(new int[]{1}, 0));
    }

    /*

    Example 1:
    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4

    Example 2:
    Input: nums = [4,5,6,7,0,1,2], target = 3
    Output: -1

    Example 3:
    Input: nums = [1], target = 0
    Output: -1

     */

    public int search(int[] nums, int target) {

        int low =0, high = nums.length-1;

        while (low < high){
            int mid = (low+high)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
              high=mid;
            }
        }

        int rotIndex = low;
        low=0;
        high=nums.length-1;

        while (low<=high){
            int mid =  (low+high)/2;
            int realMid = (mid+rotIndex)%nums.length;

            if(nums[realMid] == target){
                return realMid;
            }
            else if(nums[realMid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return -1;
    }
}
