import java.util.List;

public class ReverseSinglyLinkedList {
    public ListNode reverse(ListNode head){
        ListNode prev = null;

        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return  prev;
    }

    // 1->2->3->4->5->NULL to
    // 5->4->3->2->1->NULL
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {val = x;}
}