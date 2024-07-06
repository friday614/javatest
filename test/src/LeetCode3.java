import java.util.ArrayList;
import java.util.List;

/**
 * @author 周诚信
 * @date 2024/3/26
 */
public class LeetCode3 {
    public static void main(String[] args) {
        String str="aab";
        char[] arr=str.toCharArray();
        List<Character> ch=new ArrayList<>();
        //for(int i=0;i<str.length();i++){
        //    ch.add(str.charAt(i));
        //}
        int fast=0;
        int slow=0;
        int maxlen=0;
        while (fast<=str.length()-1&&slow<=str.length()-1){
            if(!ch.contains(arr[fast])){
                ch.add(arr[fast]);
                fast++;
            }
            else {
                int index= ch.indexOf(arr[fast]);
                for(int i=0;i<index+1;i++){
                    ch.removeFirst();
                }
                ch.add(arr[fast]);
                fast++;
            }
            maxlen=Math.max(maxlen, ch.size());

        }
        System.out.println(maxlen);
    }
}
