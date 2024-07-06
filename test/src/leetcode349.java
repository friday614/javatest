import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 周诚信
 * @date 2024/3/4
 */
public class leetcode349 {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] num=new int[999999];
        int[] end=new int[nums1.length+ nums2.length];
        for(int i=0;i<nums1.length;i++){
            num[nums1[i]]=1;
        }
        int index=0;
        for(int i=0;i<nums2.length;i++){
            if(num[nums2[i]]==1){
                num[nums2[i]]=num[nums2[i]]+1;
                end[index]=nums2[i];
                index++;
            }
        }
        int[] over= Arrays.copyOfRange(end,0,index);
        System.out.println(Arrays.toString(over));
    }
}
