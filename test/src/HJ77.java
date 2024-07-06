import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/23
 */
public class HJ77 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] T=new int[n];
        for(int i=0;i<n;i++){
            T[i]=in.nextInt();
        }
        int[] leftlen=new int[n];
        int[] rightlen=new int[n];
        Arrays.fill(leftlen,1);
        Arrays.fill(rightlen,1);
        //left递归
        for(int i=0;i<n;i++){
            for (int j=0;j<i;j++) {
                if(T[i]>T[j]) {
                    leftlen[i] = Math.max(leftlen[i], leftlen[j] + 1);
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for (int j=n-1;j>i;j--) {
                if(T[i]>T[j]) {
                    rightlen[i] = Math.max(rightlen[i], rightlen[j] + 1);
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,rightlen[i]+leftlen[i]-1);
        }
        System.out.println(n-max);

    }
}
