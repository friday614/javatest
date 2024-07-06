import java.util.Scanner;

/**
 * @author 周诚信
 * @date 2024/3/30
 */
public class JD2 {
    static class Node{
        int value1;
        int value2;
        int depth;
        Node left;
        Node right;
        Node(int value1,int value2,int depth){
            this.value1=value1;
            this.value2=value2;
            this.depth=depth;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int[] times=new int[1];
        times[0]=0;
        Node root=new Node(x,y,1);
        boolean flag=BFS(root);
        if(flag) {
            System.out.println(times[0]);
        }
        else {
            System.out.println("-1");
        }
    }
    public static boolean BFS(Node root){
        if(root.value1==root.value2){
            return true;
        }
        else {
            root.left=new Node(root.value2,root.value1,root.depth+1);
            //root.right=new Node(root.value1+root.value2,);


        }
        return false;

    }
}
