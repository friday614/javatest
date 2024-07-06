import java.util.ArrayList;
import java.util.List;

/**
 * @author 周诚信
 * @date 2024/6/29
 */
public class leetcode118 {
    public static void main(String[] args) {
        int numRows=5;
        ArrayList<List<Integer>> lists=new ArrayList<>(numRows);
        for(int i=0,j=0;i<numRows;i++,j++){
            List<Integer> line=new ArrayList<>();
            if(j==0||j==1){
                if(j==0) {
                    line.add(1);
                }
                if(j==1){
                    line.add(1);
                    line.add(1);
                }
            }
            else {
                List<Integer> lastLine=lists.get(j-1);
                line.add(1);
                for (int k = 0; k < j-1; k++) {
                    line.add(lastLine.get(k)+ lastLine.get(k+1));
                }
                line.add(1);
            }
            lists.add(line);
        }

        System.out.println(lists.toString());

    }
}
