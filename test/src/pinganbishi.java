import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/13
 */
public class pinganbishi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        StringBuilder M=new StringBuilder(in.next());
        for(int step=0;step<=30;step++) {
            if(M.equals(M.reverse())){
                System.out.println(step);
                break;
            }

            for (int i = 0; i < M.length(); i++) {
                int num=Integer.parseInt(String.valueOf(M),N);
                String reverse=M.reverse().toString();
                int renum=Integer.parseInt(reverse,N);
                int sum=num+renum;
                String reM=Integer.toString(sum,N);
                M.replace(0,M.length()-1,reM);
            }
        }



    }
}
