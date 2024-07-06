import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/10
 */
public class shunfeng2 {
    public static void main(String[] args) {
        float spend=0;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k= in.nextInt();
        float[][] goods=new float[n][2];
        for(int i=0;i<n;i++){
            goods[i][0]= in.nextFloat();
            goods[i][1]=in.nextFloat();

        }
        float[] cost=new float[n];
        for(int i=0;i<n;i++){
            cost[i]=goods[i][0];
        }
        Arrays.sort(cost);
        int A=0;//A商品的数量
        for(int i=0;i<n;i++){
            if(goods[i][1]==1){A++;}
        }
        if(A>=k){
            for(int i=0;i<k-1;i++){
                cost[n-i-1]=cost[n-i-1]/2;
            }
            cost[0]=cost[0]/2;
        }
        if(A<k){
            for(int i=0;i<A;i++){
                cost[n-i-1]=cost[n-i-1]/2;
            }
        }
        for(int i=0;i<n;i++){
            spend=spend+cost[i];
        }
        System.out.printf("%.2f",spend);

    }
}
