import java.util.*;

/**
 * @author 周诚信
 * @date 2024/3/17
 */
public class HJ8 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        Map<Integer,Integer> table=new HashMap<>();
        for(int i=0;i<n;i++){
            int index=in.nextInt();
            int value=in.nextInt();
            if(!table.containsKey(index)){
                table.put(index,value);
            }
            else {
                table.replace(index, table.get(index)+value);
            }
        }
        Set<Integer> key=table.keySet();
        Object[] keys=key.toArray();
        Arrays.sort(keys);
        for (Object o : keys) {
            System.out.format("%d %d\n", o, table.get(o));
        }
    }
}
