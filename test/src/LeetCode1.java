import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 周诚信
 * @date 2024/3/26
 */
public class LeetCode1 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            temp.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(num.contains(target-temp.get(i))){
                int[] index=new int[2];
                index[0]=num.indexOf(target-temp.get(i));
                index[1]=i;
                System.out.println(Arrays.toString(index));
                return;


            }
            else {
                num.add(temp.get(i));
            }
        }




    }
}
