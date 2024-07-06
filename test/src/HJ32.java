import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/25
 */
public class HJ32 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int length=str.length();
        int[][] dp=new int[length][length];
        for(int i=0;i<length;i++){
            for (int j=0;j<length;j++){
                dp[i][j]=-1;
            }
        }
        for(int i=0;i<length;i++){
            dp[i][i]=1;
            if(i+1<length&&str.charAt(i)==str.charAt(i+1)){
                dp[i][i+1]=dp[i+1][i]=1;
            }if(i-1>=0&&str.charAt(i)==str.charAt(i-1)){
                dp[i][i-1]=dp[i-1][i]=1;
            }

        }
        for(int j=0;j<length;j++){
            for (int i=0;i<j;i++){
                if(dp[i+1][j-1]==1){
                    if(str.charAt(j)==str.charAt(i)){
                        dp[i][j]=dp[j][i]=1;

                    }
                    else {
                        dp[i][j]=dp[j][i]=0;
                    }
                }
                else {
                    dp[i][j]=dp[j][i]=0;
                }


            }
        }
        int max=0;
        for(int i=0;i<length;i++){
            for (int j=0;j<length;j++){
                if(dp[i][j]==1){
                    max=Math.max(max,Math.abs(i-j));
                }

            }
        }
        System.out.println(max+1);


    }
}
