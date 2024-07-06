/**
 * @author 周诚信
 * @date 2024/7/4
 */
public class leetcode209 {
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int target=7;
        int left=0,right=0;
        int sum=0;
        int minlength=999999999;
        for (;right< nums.length;right++){
            sum=sum+nums[right];
            while (sum>=target){
                minlength=Math.min(minlength,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        System.out.println(minlength);
    }
}
