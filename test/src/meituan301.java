import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/23
 */
public class meituan301 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s=in.next();
        StringBuilder str=new StringBuilder(s);
        int i=0;
        while (i<=str.length()-2){
            if (str.charAt(i) == str.charAt(i + 1)) {
                    str.delete(i, i + 1);
            }
            else {
                i++;
            }

        }
        System.out.println(n-str.length());




    }

}
