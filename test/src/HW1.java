import java.util.*;

/**
 * @author 周诚信
 * @date 2024/3/27
 */
public class HW1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n==1){
            System.out.format("%s",Integer.toString(in.nextInt()));
        }
        ArrayList<String> mission=new ArrayList<>();
        in.nextLine();
        for(int i=0;i<n;i++){
            mission.add(in.nextLine());
        }
        Collections.sort(mission, new Comparator<String>() {
            @Override
            public int compare(String t1, String t2) {
                int index1=t1.lastIndexOf(" ");

                int index2=t2.lastIndexOf(" ");
                String s1=t1.substring(2,index1);
                String s2=t2.substring(2,index2);

                int target1=Integer.parseInt(s1);
                int target2=Integer.parseInt(s2);
                return target2-target1;

            }
        });
        Collections.sort(mission, new Comparator<String>() {
            @Override
            public int compare(String t1, String t2) {
                int index1=t1.lastIndexOf(" ");
                int index2=t2.lastIndexOf(" ");
                String s1=t1.substring(2,index1);
                String s2=t2.substring(2,index2);
                int temp1=Integer.parseInt(s1);
                int temp2=Integer.parseInt(s2);
                if(temp1==temp2) {
                    long target1 = Long.parseLong(t1.substring(index1 + 1));
                    long target2 = Long.parseLong(t2.substring(index2 + 1));
                    if(target1==target2){
                        String x1=t1.substring(0,t1.indexOf(" "));
                        String x2=t2.substring(0,t2.indexOf(" "));
                        int tempx1=Integer.parseInt(s1);
                        int tempx2=Integer.parseInt(s2);

                        return tempx1-tempx2;
                    }
                    else {
                        return (int) (target1 - target2);
                    }
                }
                else {
                    return 0;
                }

            }
        });
        for(int i=0;i<n-1;i++){
            System.out.format("%s ",mission.get(i).substring(0,1));
        }
        System.out.format("%s",mission.get(n-1).substring(0,1));

    }
}
