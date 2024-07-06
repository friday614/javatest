
/**
 * @author 周诚信
 * @date 2024/7/6
 */
public class leetcode206 {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode left = null,right=null;

        right=head;
        while (right!=null){
            ListNode temp=right.next;
            right.next=left;
            left=right;
            right=temp;
        }
        return left;


    }
}
