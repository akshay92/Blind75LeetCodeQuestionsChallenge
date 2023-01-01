package solution.array.medium;
/*
https://leetcode.com/problems/container-with-most-water/description/
1.Two pointer low high
2.Find max basis of diff between low and high multiply min height value
3.Update low when height low less height high otherwise high
 */

public class ContainerWithMostWater {

    public static void main(String[] args) {
        ContainerWithMostWater ob = new ContainerWithMostWater();

        System.out.println("49 "+ob.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println("1 "+ob.maxArea(new int[]{1,1}));
    }

    /*

    Example 1:
    Input: height = [1,8,6,2,5,4,8,3,7]
    Output: 49
    Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

    Example 2:
    Input: height = [1,1]
    Output: 1

     */

    public int maxArea(int[] height) {
        int len = height.length;
        int l = 0;
        int r = len -1;
        int area = 0;

        while (l < r)
        {
            area = Math.max(area,
                    Math.min(height[l], height[r]) * (r - l));

            if (height[l] < height[r])
                l += 1;

            else
                r -= 1;
        }
        return area;
    }

}
