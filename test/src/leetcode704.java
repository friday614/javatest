/**
 * @author 周诚信
 * @date 2024/6/30
 */
public class leetcode704 {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=2;
        int right=nums.length-1;
        int left=0;

        int midIndex=(right+left)/2;
        while (left<=right){
            if (nums[midIndex]==target){
                System.out.println(midIndex);
                return;
            }
            if(nums[midIndex]>target){
                right=midIndex-1;
            }
            if (nums[midIndex]<target){
                left=midIndex+1;
            }
            midIndex=(right+left)/2;
        }
        System.out.println("-1");
    }
}
