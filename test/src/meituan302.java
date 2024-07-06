import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/23
 */
public class meituan302 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] num=new int[n];
        for (int i=0;i<n;i++){
            num[i]=in.nextInt();
        }

        String str=in.next();
        StringBuilder change=new StringBuilder();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='R'){
                change.append(num[i]);
            }
        }
        //System.out.println(change.toString());
        String xx= change.toString();;
        String[] target=xx.split("");

        String[] t=new String[target.length];
        for(int i=0;i< target.length;i++){
            t[i]=target[i];
        }
        Arrays.sort(t);
        String[] rised=new String[target.length];
        System.arraycopy(t, 0, rised, 0, target.length);
        int sum=0;
        for(int i=0;i<target.length;i++){
            if(target[i].equals(rised[i])){
                continue;
            }
            else {
                int index=0;
                for(int j=i;j<target.length;j++){
                    if(target[j].equals(rised[i])){
                        index=j;
                    }
                }
                String temp=target[i];
                target[i]=target[index];
                target[index]=temp;
                sum++;
            }
        }

        System.out.println(sum);

    }
}
