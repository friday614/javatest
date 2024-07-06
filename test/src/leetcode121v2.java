import java.util.ArrayList;
import java.util.List;

/**
 * @author 周诚信
 * @date 2024/6/29
 */
public class leetcode121v2 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int[] minprice=new int[prices.length];
        minprice[0]=prices[0];
        for(int i=1;i< prices.length;i++){
            if(prices[i]<minprice[i-1]){
                minprice[i]=prices[i];
            }
            else {
                minprice[i]=minprice[i-1];
            }
        }
        int max=0;
        for(int i=0;i< prices.length;i++){
            max=Math.max(max,prices[i]-minprice[i]);
        }
        System.out.println(max);
    }
}
