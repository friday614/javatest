import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/10
 */
public class kedaxunfei1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String target=in.next();
        int red=0;
        int yellow=0;
        int blue=0;
        if(target.contains("red")){
            red=1;
        }
        if(target.contains("yellow")){
            yellow=1;
        }
        if(target.contains("blue")){
            blue=1;
        }
        System.out.println(red+" "+yellow+" "+blue);



    }
}
