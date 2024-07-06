import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/26
 */
public class HJ57 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StringBuilder str1= new StringBuilder(in.nextLine());
        StringBuilder str2= new StringBuilder(in.nextLine());
        int len1=str1.length();
        int len2=str2.length();
        if(len1>len2){
           for(int i=0;i<len1-len2;i++){
               str2.insert(0,"0");
           }
        }
        if(len1<len2){
            for(int i=0;i<len2-len1;i++){
                str1.insert(0,"0");
            }

        }
        int len=str1.length();
        StringBuilder str=new StringBuilder();
        int jingwei=0;
        for(int i=0;i<len;i++){
            int num1=Integer.parseInt(String.valueOf(str1.charAt(len-1-i)));
            int num2=Integer.parseInt(String.valueOf(str2.charAt(len-1-i)));
            String c=Integer.toString((num1+num2+jingwei)%10);
            str.insert(0,c);
            jingwei=(num1+num2+jingwei)/10;

        }
        if(jingwei!=0) {
            str.insert(0, jingwei);
        }
        System.out.println(str);
    }

}
