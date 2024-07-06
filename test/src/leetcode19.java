/**
 * @author 周诚信
 * @date 2024/6/28
 */
public class leetcode19 {
     public static class ListNode {
         int val;
         ListNode next;
        ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fast=head;
            ListNode slow=head;
            for(int i=0;i<n;i++){
                fast=fast.next;
            }
            while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;
            return head;

        }

        }
    }
