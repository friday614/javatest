import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author 周诚信
 * @date 2024/6/29
 */
public class leetcode121 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        List<Integer> maxprofit=new ArrayList<>();
        for(int i=0;i< prices.length;i++){
            int max=0;
            for(int j=i+1;j<prices.length;j++){
                max=Math.max(max,prices[j]-prices[i]);
            }
            maxprofit.add(max);
        }
        System.out.println(Collections.max(maxprofit));

    }
}
