import java.util.*;



/**
 * @author 周诚信
 * @date 2024/3/26
 */
public class HJ52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int j = 0; j <= str2.length(); j++) {
            dp[0][j] = j;
        }
        for (int i = 0; i <= str1.length(); i++) {
            dp[i][0] = i;
        }

        for(int i=1;i<=str1.length();i++){
            for (int j=1;j<=str2.length();j++){
                int temp1=0,temp2=0,temp3=0;
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    temp1=dp[i-1][j-1];
                    dp[i][j]=temp1;
                }
                if(str1.charAt(i-1)!=str2.charAt(j-1)){
                    temp1=dp[i-1][j-1]+1;
                    temp2=dp[i-1][j]+1;
                    temp3=dp[i][j-1]+1;
                    dp[i][j]=Math.min(temp1, Math.min(temp2,temp3));
                }

            }
        }
        System.out.println(dp[str1.length()][str2.length()]);


    }
}
