import java.util.*;

/**
 * @author 周诚信
 * @date 2024/3/26
 */
public class HJ41 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] m=new int[n];
        int[] x=new int[n];
        for (int i=0;i<n;i++){
            m[i]=in.nextInt();
        }
        for (int i=0;i<n;i++){
            x[i]=in.nextInt();
        }
        List<Integer> num=new ArrayList<>();
        for (int i=0;i<n;i++){
            for (int j=0;j<x[i];j++){
                num.add(m[i]);
            }
        }
        Set<Integer> weight=new HashSet<>();
        weight.add(0);
        for (int i=0;i<num.size();i++){
            int[] temp=new int[weight.size()];
            int j=0;
            for (Integer kind:weight){
                temp[j]=kind+num.get(i);
                j++;

            }
            for (int k=0;k<temp.length;k++){
                weight.add(temp[k]);
            }
        }
        System.out.println(weight.size());


    }

}
