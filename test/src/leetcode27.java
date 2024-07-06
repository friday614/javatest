import java.util.Arrays;

/**
 * @author 周诚信
 * @date 2024/7/3
 */
public class leetcode27 {
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        int val=3;
        int len = nums.length;
        if (len == 0) {
            return ;
        }
        int i = 0;
        for (i = 0; i < len; ++i) {
            //发现符合条件的情况
            if (nums[i] == val) {
                //前移一位
                for (int j = i; j < len-1; ++j) {
                    nums[j] = nums[j+1];
                }
                i--;
                len--;
            }
        }
        System.out.println(i);
    }
}
