import java.util.Arrays;

/**
 * @author 周诚信
 * @date 2024/7/3
 */
public class leetcode283 {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        int left=0,right=0;
        int len=nums.length;
        while (right< nums.length){
            if(nums[right]==0){
                right++;
                len--;
            }else {
                nums[left]=nums[right];
                left++;
                right++;
            }
        }
        for(int i=len;i<nums.length;i++){
            nums[i]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
