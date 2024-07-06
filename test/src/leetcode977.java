import java.util.*;

/**
 * @author 周诚信
 * @date 2024/7/4
 */
public class leetcode977 {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        List<Integer> list=new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            int m=nums[i]*nums[i];

            list.add(m);
        }
        Collections.sort(list);
        int[] x=new int[list.size()];
        for (int i=0;i< list.size();i++){
            x[i]=list.get(i);
        }
        System.out.println(Arrays.toString(x));
    }
}
