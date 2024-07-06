import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/25
 */
public class HJ93 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> num = new ArrayList<>();
        List<Integer> three = new ArrayList<>();
        List<Integer> five = new ArrayList<>();
        int sum5=0;
        int sum3=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            int temp=in.nextInt();
            if(temp%5==0){
                five.add(temp);
                sum5+=temp;
                continue;
            }
            if (temp%3==0){
                three.add(temp);
                sum3+=temp;
                continue;
            }
            num.add(temp);
            sum+=temp;

        }
        if((sum-(sum3-sum5))%2!=0){
            System.out.println("false");
            return;
        }
        int target=(sum-(sum3-sum5))/2;
        boolean flag=dfs(0,target,num);
        if(flag){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        return;


    }
    public static boolean dfs(int i,int target,List<Integer> num){
        if(i==num.size()){
            return target==0;
        }
        return dfs(i+1,target,num)||dfs(i+1,target-num.get(i),num);

    }

}
