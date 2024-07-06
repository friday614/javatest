import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/22
 */
public class HJ14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String[] word=new String[n];
        for(int i=0;i<n;i++){
            word[i]=in.next();
        }
        Arrays.sort(word);
        for(int i=0;i<n;i++){
            System.out.println(word[i]);
        }
    }
}
