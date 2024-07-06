import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/17
 */
public class HJ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        List<Integer> jieguo=new ArrayList<>();
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                if(check(i)){
                    jieguo.add(i);
                    num=num/i;
                    i=1;
                }
            }
        }
        if(num!=1){
            jieguo.add(num);

        }
        jieguo.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer-t1;
            }
        });
        for(int i=0;i< jieguo.size();i++){
            System.out.format("%d ",jieguo.get(i));
        }



    }
    static boolean check(int n){
        if(n==2){return true;}
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
