import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/22
 */
public class packageprogram {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int[][] goods=new int[2][M];

        for(int i=0;i<2;i++){
            for(int j=0;j<M;j++){
                goods[i][j]=in.nextInt();
            }
        }
        //System.out.println(Arrays.deepToString(goods));
        int[][] f=new int[M][N+1];
        for(int j=0;j<=N;j++){
            if(goods[0][0]<=j){
                f[0][j]=goods[1][0];
            }
            else {
                f[0][j]=0;
            }
        }
        //System.out.println(Arrays.deepToString(f));
        for(int i=0;i<M;i++){
            f[i][0]=0;
        }
        //System.out.println(Arrays.deepToString(f));
        for(int i=1;i<M;i++){
            for(int j=1;j<N+1;j++) {
                if(j>=goods[0][i]) {
                    f[i][j] = Math.max(f[i - 1][j], f[i - 1][j - goods[0][i]] + goods[1][i]);
                }
                else {
                    f[i][j]=f[i-1][j];
                }
            }
        }
        System.out.println(f[M-1][N]);
    }

}
