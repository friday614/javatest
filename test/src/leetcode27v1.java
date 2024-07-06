import java.util.Arrays;

/**
 * @author 周诚信
 * @date 2024/7/3
 */
public class leetcode27v1 {
    public static void main(String[] args) {


        int[] nums = {1, 2, 2, 3, 4};
        int val = 2;
        int left = 0, right = 0;
        while (right < nums.length){
            if(nums[right]!=val){
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
