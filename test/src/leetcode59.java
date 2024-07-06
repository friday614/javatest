import java.util.Arrays;

/**
 * @author 周诚信
 * @date 2024/7/5
 */
public class leetcode59 {
    public static void main(String[] args) {
        int n=3;
        int[][] nums=new int[n][n];
        int x=1;
        for(int i=0;i<(n+1)/2;i++){
            //行
            for(int h1=i;h1<n-i-1;h1++){
                nums[i][h1]=x;
                x++;
            }
            for(int l1=i;l1<n-i-1;l1++){
                nums[l1][n-i-1]=x;
                x++;
            }
            for(int h2=n-i-1;h2>i;h2--){
                nums[n-i-1][h2]=x;
                x++;
            }
            for(int l2=n-i-1;l2>i;l2--){
                nums[l2][i]=x;
                x++;
            }
        }
        if(n!=(n/2)*2){//奇数
            nums[n/2][n/2]=n*n;
        }
        System.out.println(Arrays.deepToString(nums));


    }
}
