import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/12
 */
public class xiaomi2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        List<Integer> s=new ArrayList<>();
        for(int i=0;i<n;i++){
            s.add(in.nextInt());
        }
        s.toString();
        int length=s.size();
        while(length>0){
            int maxlength=1;
            int begin=0;
            for(int i=1;i<n;i++){
                int templength=1;
                if(s.get(i)==s.get(i-1)){
                    templength++;
                }
                if(s.get(i)!=s.get(i-1)){
                   // if(templength>)
                    maxlength=Math.max(maxlength,templength);

                    templength=1;
                }

            }

        }
    }
}
