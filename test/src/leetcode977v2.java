import java.util.Arrays;

/**
 * @author 周诚信
 * @date 2024/7/4
 */
public class leetcode977v2 {
    public static void main(String[] args) {
        int[] nums={-7,-3,2,3,11};
        int left=0,right=nums.length-1;
        int[] x=new int[nums.length];
        for (int j= nums.length-1;j>=0;j--){
            int l=nums[left]*nums[left];
            int r=nums[right]*nums[right];
            if(l>=r){
                x[j]=l;
                left++;
            }else {
                x[j]=r;
                right--;
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
