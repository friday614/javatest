import java.util.LinkedHashSet;

/**
 * @author 周诚信
 * @date 2024/6/29
 */
public class leetcode219 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,2,3};
        int k=2;
        if(k==0){
            System.out.println("false");
            return;
        }
        LinkedHashSet<Integer> set=new LinkedHashSet<>(k);
        for(int i=0;i<k&&i<nums.length;i++){
            if(set.contains(nums[i])){
                System.out.println("true");
                return ;
            }
            set.add(nums[i]);
        }
        int start=k;
        while (start<nums.length){
            if(set.contains(nums[start])){
                System.out.println("true");
                return ;
            }
            set.removeFirst();
            set.add(nums[start]);
            start++;
        }
        System.out.println("false");
        return ;
    }
}
