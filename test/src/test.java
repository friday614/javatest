import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/2/28
 */
public class test

{
    public class qingqiu{
        int id;
        int starttime;
        int endtime;
    }
    public static void main(String[] args) {
        qingqiu[] q=new qingqiu[100000000];
        Arrays.sort(q,(t1, t2) -> {
            return t1.starttime-t2.starttime;
        });
        int start=q[0].starttime;
        int end=q[0].endtime;
        int sum=0;
        int maxsum=0;
        List<Integer> startTimes=new ArrayList<>();
        for(int i=0;i<q.length;i++){
            if(q[i].starttime<=q[0].endtime&&q[i].starttime>=q[0].starttime){
                sum++;
                startTimes.add(q[i].starttime);
            }
        }
        maxsum=sum;
        for(int i=1;i<q.length;i++){
            int temp=end;
            start=q[i].starttime;
            end=q[i].endtime;
            for(Integer times:startTimes){
                if(times<start||times>end){
                    sum--;
                    startTimes.remove(times);
                }
            }
            for(int j=temp+1;q[j].starttime<=end;j++){
                if(q[j].starttime<=end){
                    sum++;
                    startTimes.add(q[j].starttime);
                }
            }
            maxsum=Math.max(sum,maxsum);


        }

      

    }
}

