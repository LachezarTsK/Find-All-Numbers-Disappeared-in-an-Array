
import java.util.List;
import java.util.ArrayList;

public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        int sizeNums = nums.length;
        for (int i = 0; i < sizeNums; i++) {
            int indexForCurrentNumber = Math.abs(nums[i]) - 1;
            if (nums[indexForCurrentNumber] > 0) {
                nums[indexForCurrentNumber] = -nums[indexForCurrentNumber];
            }
        }

        List<Integer> disappearedNumbers = new ArrayList<>();
        for (int i = 0; i < sizeNums; i++) {
            if (nums[i] > 0) {
                disappearedNumbers.add(i + 1);
            }
        }
        return disappearedNumbers;
    }
}
