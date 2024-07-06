import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/10
 */
public class kedaxunfei2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long[] first=new long[n];
        long[] second=new long[n];
        for(int i=0;i<n;i++){
            first[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            second[i]=in.nextInt();
        }
        long sum=0;
        for(int i=0;i<n;i++){
            long min=Math.min(Math.abs(first[i]-second[i]),
                    Math.abs(first[i]+second[i]));
            sum=sum+min;
        }
        System.out.println(sum);
    }
}
