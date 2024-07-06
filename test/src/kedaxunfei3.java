import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/10
 */
public class kedaxunfei3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        long[] forbidPoint=new long[n];
        for(int i=0;i<n;i++){
            forbidPoint[i]=in.nextInt();
        }
        long s= in.nextInt();
        int num=1;
        Arrays.sort(forbidPoint);
        long sum=s-1;
        if(s<=2){
            sum=0;
        }
        else {
            if (forbidPoint[0] < s) {
                if(forbidPoint[0] == (s / 2)  && s % 2 == 0){
                    sum = sum - 1;
                }
                else{
                    sum=sum-2;
                }
            }
            for (int i = 1; i < n; i++) {
                if (forbidPoint[i] <= s && forbidPoint[i] != forbidPoint[i - 1]) {
                    if (forbidPoint[i] == (s / 2)  && s % 2 == 0) {
                        sum = sum - 1;
                    } else {
                        sum = sum - 2;
                    }

                }
            }
        }
        System.out.println(sum);

    }


}

