/**
 * @author 周诚信
 * @date 2024/7/3
 */
public class leetcode844v2 {
    public static void main(String[] args) {
        String s="y#fo##f";
        String t="y#f#o##f";
        StringBuilder s1=new StringBuilder();
        StringBuilder t1=new StringBuilder();
        int points=0,pointt=0;
        while (points<s.length()) {
            if(s.charAt(points)=='#'){
                if(!s1.isEmpty()){
                    s1.deleteCharAt(s1.length()-1);
                }
                points++;
            }else {
                s1.append(s.charAt(points));
                points++;
            }
        }
        while (pointt<t.length()) {
            if(t.charAt(pointt)=='#'){
                if(!t1.isEmpty()){
                    t1.deleteCharAt(t1.length()-1);
                }
                pointt++;
            }else {
                t1.append(t.charAt(pointt));
                pointt++;
            }
        }
        System.out.println(s1.compareTo(t1) == 0);
    }
}
