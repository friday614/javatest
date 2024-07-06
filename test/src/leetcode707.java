/**
 * @author 周诚信
 * @date 2024/7/6
 */
public class leetcode707 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(5);
        myLinkedList.addAtIndex(1,2);
        System.out.println(myLinkedList.get(1));    //
        myLinkedList.addAtHead(6);
        myLinkedList.addAtTail(2);
        System.out.println(myLinkedList.get(3));
        myLinkedList.addAtTail(1);
        System.out.println(myLinkedList.get(5));
        myLinkedList.addAtHead(2);
        System.out.println(myLinkedList.get(2));
        myLinkedList.addAtHead(6);

    }
}
class Node{
    int val;
    Node next;
    Node(){}
    Node(int val){
        this.val=val;

    }
}
class MyLinkedList {
    Node head;
    int size;
    public MyLinkedList() {
        size=0;
        head=new Node(0);

    }

    public int get(int index) {
        if(index<0||index>=size){
            return -1;
        }else {
            Node temp=head;
            for(int i=0;i<=index;i++){
                temp=temp.next;
            }
            return  temp.val;
        }

    }

    public void addAtHead(int val) {
        Node p=new Node(val);
        p.next=head.next;
        head.next=p;
        size++;

    }

    public void addAtTail(int val) {
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node p=new Node(val);
        temp.next=p;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        if (index<0){
            index=0;
        }
        if (index==size){
            addAtTail(val);
            //size++;
        }else {
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            Node p=new Node(val);
            p.next=temp.next;
            temp.next=p;
            size++;
        }

    }

    public void deleteAtIndex(int index) {
        if(index<0||index>=size){
            return;
        }else {
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }


    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
