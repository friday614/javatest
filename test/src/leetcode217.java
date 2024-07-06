import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author 周诚信
 * @date 2024/6/29
 */
public class leetcode217 {
    public static boolean main(String[] args) {
        int[] nums = new int[10];
        HashSet<Integer> list=new HashSet<>();
        for (int num : nums) {
            if (list.contains(num)) {
                return false;
            }
        }
        return true;
    }
}
