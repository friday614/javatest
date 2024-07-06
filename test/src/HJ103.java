import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/23
 */
public class HJ103 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] hight=new int[n];
        for(int i=0;i<n;i++){
            hight[i]=in.nextInt();
        }
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int maxlen=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++) {
                if(hight[j]<hight[i]) {
                    dp[i] = Math.max(dp[i],dp[j]+1 );
                }

            }
            maxlen=Math.max(maxlen,dp[i]);
        }
        System.out.println(maxlen);
    }
}
