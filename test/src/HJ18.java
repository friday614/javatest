import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/22
 */
public class HJ18 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] num=new int[7];
        Arrays.fill(num,0);
        while (in.hasNextLine()){
            String str=in.nextLine();
            String[] word=new String[2];
            word=str.split("~");
            String IP=word[0];
            String yanma=word[1];
            kindof(IP,yanma,num);

        }
        System.out.format("%d %d %d %d %d %d %d",num[0],num[1],num[2],num[3],num[4],num[5],num[6]);
    }
    public static boolean isIP(String IP){
        String[] num=IP.split("\\.");
        if(num.length==4) {
            int[] part=new int[4];
            for (int i = 0; i < 4; i++) {
                part[i] = Integer.parseInt(num[i]);
            }
            if(part[0]>=0&&part[0]<=255
                    &&part[1]>=0&&part[1]<=255
                    &&part[2]>=0&&part[2]<=255
                    &&part[3]>=0&&part[3]<=255){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    public static boolean isyanma(String yanma){
        String[] num=yanma.split("\\.");
        if(num.length==4) {
            StringBuilder str=new StringBuilder();
            for(int i=0;i<4;i++){
                int n=Integer.parseInt(num[i]);
                StringBuilder tworadix= new StringBuilder(Integer.toString(n, 2));
                if(tworadix.length()<8){
                    while (tworadix.length()<8){
                        tworadix.insert(0, "0");
                    }
                }
                str.append(tworadix);
            }
            int index=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='1'){
                    continue;
                }
                if(str.charAt(i)!='1'){
                    index=i;
                    break;
                }
            }
            for(int i=index;i<str.length();i++){
                if(str.charAt(i)!='0'){
                    return false;
                }
            }
            return true;

        }

        return false;
    }
    public static boolean kindof(String IP,String yanma,int[] n){
        if(isIP(IP)&&isyanma(yanma)){
            String[] num=IP.split("\\.");
            int[] part=new int[4];
            for (int i=0;i<4;i++){
                part[i]=Integer.parseInt(num[i]);
            }
            if(part[0]>=1&&part[0]<=126
                    &&part[1]>=0&&part[1]<=255
                    &&part[2]>=0&&part[2]<=255
                    &&part[3]>=0&&part[3]<=255){
                n[0]+=1;
            }
            if(part[0]>=128&&part[0]<=191
                    &&part[1]>=0&&part[1]<=255
                    &&part[2]>=0&&part[2]<=255
                    &&part[3]>=0&&part[3]<=255){
                n[1]+=1;
            }
            if(part[0]>=192&&part[0]<=223
                    &&part[1]>=0&&part[1]<=255
                    &&part[2]>=0&&part[2]<=255
                    &&part[3]>=0&&part[3]<=255){
                n[2]+=1;
            }
            if(part[0]>=224&&part[0]<=239
                    &&part[1]>=0&&part[1]<=255
                    &&part[2]>=0&&part[2]<=255
                    &&part[3]>=0&&part[3]<=255){
                n[3]+=1;
            }
            if(part[0]>=240&&part[0]<=255
                    &&part[1]>=0&&part[1]<=255
                    &&part[2]>=0&&part[2]<=255
                    &&part[3]>=0&&part[3]<=255){
                n[4]+=1;
            } if(part[0] == 10
                    && part[1] >= 0 && part[1] <= 255
                    && part[2] >= 0 && part[2] <= 255
                    && part[3] >= 0 && part[3] <= 255){
                n[6]+=1;
            }
            if(part[0]==172
                    &&part[1]>=16&&part[1]<=31
                    &&part[2]>=0&&part[2]<=255
                    &&part[3]>=0&&part[3]<=255) {
                n[6] += 1;
            }
            if(part[0] == 192
                    && part[1] == 168
                    && part[2] >= 0 && part[2] <= 255
                    && part[3] >= 0 && part[3] <= 255) {
                n[6] += 1;
            }
            return true;
        }
        else {

            n[5]+=1;
            return true;
        }
    }
}
