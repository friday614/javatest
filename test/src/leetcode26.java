import java.util.Arrays;

/**
 * @author 周诚信
 * @date 2024/7/3
 */
public class leetcode26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int left = 1, right = 1;
        while (right < nums.length){
            if(nums[right]!=nums[right-1]){
                nums[left]=nums[right];
                left++;
                right++;
            }else {
                right++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
