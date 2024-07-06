/**
 * @author 周诚信
 * @date 2024/3/4
 */
public class leetcode45 {


    public static void main(String[] args) {

        int[] nums = {2,3,0,1,4};
        int n = nums.length;
        int start =0;
        int edge =0;
        int step=0;
        int temp=0;
        boolean flag=false;
       while(true){
           for(int i=0;i<=edge;i++){
               temp=Math.max(temp,i+nums[i]);
               if(temp>=n-1){
                   flag=true;
                   break;
               }
           }
           edge=temp;
           step++;
           if(flag==true){break;}
       }
        System.out.println(step);


    }
}
