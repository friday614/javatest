import java.util.Arrays;

/**
 * @author 周诚信
 * @date 2024/7/2
 */
public class leetcode34 {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int[] Index={-1,-1};
        int left=0;
        int right=nums.length-1;

        while (left<=right){
            int mid=(left+right)/2;
            if(target<nums[mid]){
                right=mid-1;
            }else {
                left=mid+1;
                if(target==nums[mid]){
                    Index[1]=mid;
                }
            }

        }
        left=0;
        right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(target>nums[mid]){
                left=mid+1;
            }else {
                right=mid-1;
                if(target==nums[mid]) {
                    Index[0] = mid;
                }
            }

        }
        System.out.println(Arrays.toString(Index));

    }
}
