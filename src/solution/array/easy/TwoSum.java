package solution.array.easy;
import java.util.HashMap;
// Notes : Maintain a map to hold remain number need to reach target
// like target is 18, First item 7 then you need 11 to reach target so store 11 as key and index of current value

public class TwoSum {

    public static void main(String[] args) {
        TwoSum object = new TwoSum();
        object.twoSum(new int[]{2,7,11,15}, 9);
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put((target - nums[0]), 0);
        for (int i = 1; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                int[] a = new int[2];
                a[0] = map.get(nums[i]);
                a[1] = i;
                return a;

            } else {
                map.put((target - nums[i]), i);
            }

        }

        return null;

    }
}
