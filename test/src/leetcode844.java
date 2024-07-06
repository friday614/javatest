/**
 * @author 周诚信
 * @date 2024/7/3
 */
public class leetcode844 {
    public static void main(String[] args) {
        String s="ab#c";
        String t="ad#c";
        int points=s.length()-1;
        int skips=0;
        int skipt=0;
        int pointt=t.length()-1;
        while (points>=0||pointt>=0){
            while (points>=0) {
                if (s.charAt(points) == '#') {
                    skips++;
                    points--;
                }
                else if(skips>0){
                    points--;
                    skips--;
                }else {
                    break;
                }
            }
            while (pointt>=0){
                if (t.charAt(pointt) == '#') {
                    skipt++;
                    pointt--;
                }
                else if(skipt>0){
                    pointt--;
                    skipt--;
                }else {
                    break;
                }
            }
            if(points>=0&&pointt>=0) {
                if (s.charAt(points) != t.charAt(pointt)) {
                    System.out.println(false);
                    return;
                } else {
                    points--;
                    pointt--;
                }
            }else {
                if (points >= 0 || pointt >= 0) {
                    System.out.println(false);
                }
                    return;
            }
        }
        System.out.println(true);
        return;
    }
}
