import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/22
 */
public class HJ15 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str=Integer.toString(n,2);
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
