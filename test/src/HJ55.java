import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/26
 */
public class HJ55 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int num=0;
       for(int i=1;i<=n;i++){
           String s=Integer.toString(i);
           if(i%7==0){
               num++;
               continue;
           }
           else if(s.contains("7")){
               num++;
               continue;
           }
       }
       System.out.println(num);
    }
}
