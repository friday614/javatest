import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/30
 */
public class JD1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=1;
        int sum=0;
        for(int k=2;k<=n;k++){
           while (n%k==0){
               n=n/k;
               if(n!=1){
                   sum=sum+k;

               }
               else {
                   sum=sum+k;
                   System.out.println(sum);
                   return;

               }
           }
        }
    }
}
