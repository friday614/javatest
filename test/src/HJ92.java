import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/23
 */
public class HJ92 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        while (in.hasNextLine()){
            int max=0;
            String str=in.nextLine();
            int index1=0;
            while (index1<str.length()-1){
                if(str.charAt(index1)>='0'&&str.charAt(index1)<='9'){
                    int index2=endofnum(str,index1);
                    max=Math.max(max,index2-index1);
                    index1=index2;
                }
                else {
                    index1++;
                }

            }
            index1=0;
            while (index1<str.length()-1){
                if(str.charAt(index1)>='0'&&str.charAt(index1)<='9'){
                    int index2=endofnum(str,index1);
                    int len=index2-index1;
                    if(len==max){
                            System.out.format("%s",str.substring(index1,index2));

                    }
                    index1=index2;
                }
                else {
                    index1++;
                }

            }
            System.out.println(","+max);


        }
    }
    public static int endofnum(String str,int begin){
        while(true){
            if(str.charAt(begin)>='0'&&str.charAt(begin)<='9'){
                begin++;
            }
            if(begin<str.length()) {
                if ((str.charAt(begin) < '0' || str.charAt(begin) > '9')) {
                    return begin;
                }
            }
            if(begin==str.length()){
                return begin;
            }

        }
    }
}
