import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/24
 */
public class HJ27 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        String[] words=new String[m];
        for(int i=0;i<m;i++){
            words[i]=in.next();
        }
        String x=in.next();
        int k= in.nextInt();
        ArrayList<String> browords=new ArrayList<>();
        for(int i=0;i<m;i++){
            if(isBroWord(words[i],x )){

                   browords.add(words[i]);

            }
        }
        Collections.sort(browords);
        System.out.println(browords.size());
        if(k<=browords.size()) {
            System.out.println(browords.get(k - 1));
        }



    }
    public static boolean isBroWord(String a,String b ){
        if(a.length()!=b.length()||a.equals(b)){
            return false;
        }
        else {
            char[] a1=a.toCharArray();
            char[] b1=b.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(b1);
            return Arrays.toString(a1).equals(Arrays.toString(b1));

        }
    }
}
