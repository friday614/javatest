import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/25
 */
public class HJ33 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String IP=in.nextLine();
        //String xIP= in.nextLine();
        String[] partofip=IP.split("\\.");
        StringBuilder twoip=new StringBuilder();
        for (String s : partofip) {
            long part = Long.parseLong(s);
            StringBuilder temp = new StringBuilder(Long.toString(part, 2));
            while (temp.length() < 8) {
                temp.insert(0, '0');
            }
            twoip.append(temp);
        }
        Long ten= Long.parseLong(String.valueOf(twoip),2);
        System.out.println(ten);
        long xIP= in.nextLong();
        String two=Long.toString(xIP,2);
        StringBuilder xtwo=new StringBuilder(two);
        while (xtwo.length()<32){
            xtwo.insert(0,'0');
        }
        long[] partof=new long[4];
        for(int i=0;i<4;i++){
            String temp=xtwo.substring(i*8,i*8+8);
            long t=Long.parseLong(temp,2);
            partof[i]=t;
        }
        System.out.format("%d.%d.%d.%d",partof[0],partof[1],partof[2],partof[3]);

    }
}
