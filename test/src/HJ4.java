import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/17
 */
public class HJ4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        int length=str.length();
        StringBuilder s=new StringBuilder(str);
        if(s.length()%8!=0){//不是8的倍数
            for(int i=0;i<8-length%8;i++){
                s.append('0');
            }
        }
        for(int i=0;i<s.length();i=i+8){
            String out= s.substring(i,i+8);
            System.out.println(out);
        }
    }
}
