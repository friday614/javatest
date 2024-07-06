/**
 * @author 周诚信
 * @date 2024/6/30
 */
public class leetcode35 {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=0;
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        while (left<=right){
            if(nums[mid]==target){
                System.out.println(mid);
                //return;
            }
            if(nums[mid]<target){
                left=mid+1;
            }
            if(nums[mid]>target){
                right=mid-1;
            }
            mid=(right+left)/2;
        }

        if(nums[mid]<target){
            System.out.println(mid+1);
        }
        if(nums[mid]>target){
            System.out.println(mid);
        }
        return;

    }
}
