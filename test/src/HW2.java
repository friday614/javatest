import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/27
 */
public class HW2 {
    public static int max;
    public static int min;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
        }
        TreeNode root=BST(num);
        int[] ye=new int[1];
        ye[0]=0;
        int geshu=in.nextInt();
        min=in.nextInt();
        max=in.nextInt();
        yezisum(root,ye);
        System.out.println(ye[0]);




    }
    public static void yezisum(TreeNode root,int[] ye){
        if(root!=null){
            if(root.left==null&&root.right==null)
                    if(root.data>=min&&root.data<=max){
                        ye[0]=ye[0]+root.data;

            }
            if (root.left != null) {
                yezisum(root.left,ye);

            }
            if (root.right != null) {
                yezisum(root.right,ye);

            }

        }
    }
    public  static TreeNode BST(int[] num){
        if(num.length==0){
            return null;
        }
        return f(num);
    }
    public static TreeNode f(int[] num){
        if(num.length==0){
            return null;
        }
        int mid=num.length/2;
        TreeNode root=new TreeNode(0);
        root.data=num[mid];
        root.left=f(Arrays.copyOfRange(num,0,mid));
        root.right=f(Arrays.copyOfRange(num,mid+1,num.length));
        return root;
    }
    public static class TreeNode{
        int bf=0;
        int data;
        TreeNode left,right,p;
        int count;
        TreeNode(int data){
            this.data=data;
        }





    }

}



